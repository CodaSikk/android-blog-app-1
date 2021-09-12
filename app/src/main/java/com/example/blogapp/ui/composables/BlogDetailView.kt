package com.example.blogapp.ui.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter
import com.example.blogapp.Blog

@Composable
fun BlogDetailView(blog: Blog) {
    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
    ) {
        Image(
            painter = rememberImagePainter(data = blog.imgUrl),
            contentDescription = "",
            modifier = Modifier
                .fillMaxSize()
                .sizeIn(maxHeight = 250.dp)
                .padding(all = 16.dp)
        )

        Text(
            text = blog.title,
            modifier = Modifier.padding(horizontal = 16.dp),
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = blog.description,
            fontSize = 14.sp,
            modifier = Modifier.padding(all = 16.dp),
            lineHeight = 22.sp
        )
    }
}

@Preview
@Composable
fun BlogDetailViewPreview() {
    BlogDetailView(blog = Blog(
        title = "Justo laoreet sit amet cursus",
        description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Egestas sed sed risus pretium quam. Pellentesque elit ullamcorper dignissim cras tincidunt lobortis feugiat vivamus. Fringilla ut morbi tincidunt augue interdum velit euismod. Sed egestas egestas fringilla phasellus faucibus scelerisque eleifend. Nec dui nunc mattis enim ut tellus. Aenean sed adipiscing diam donec adipiscing tristique risus nec feugiat. Eget duis at tellus at urna condimentum mattis. Ac turpis egestas maecenas pharetra convallis posuere morbi leo. Ullamcorper velit sed ullamcorper morbi tincidunt ornare. Augue lacus viverra vitae congue eu consequat ac felis. Imperdiet massa tincidunt nunc pulvinar sapien et ligula ullamcorper malesuada. Euismod in pellentesque massa placerat duis ultricies lacus sed. Tempus iaculis urna id volutpat lacus laoreet. Quis commodo odio aenean sed adipiscing diam.\n" +
                "\n" +
                "Dignissim enim sit amet venenatis. Eleifend quam adipiscing vitae proin. Ut lectus arcu bibendum at. Suspendisse sed nisi lacus sed viverra tellus in hac habitasse. Elit pellentesque habitant morbi tristique senectus et netus. Amet consectetur adipiscing elit ut aliquam purus sit. Scelerisque eleifend donec pretium vulputate sapien nec sagittis aliquam malesuada. Elementum curabitur vitae nunc sed. Sit amet commodo nulla facilisi. At quis risus sed vulputate odio ut enim blandit volutpat. Pharetra sit amet aliquam id diam maecenas ultricies mi. Tempor nec feugiat nisl pretium fusce. Vel pharetra vel turpis nunc. Feugiat scelerisque varius morbi enim nunc faucibus. Nisi porta lorem mollis aliquam ut. Vulputate sapien nec sagittis aliquam malesuada bibendum arcu. Sit amet purus gravida quis blandit turpis cursus. Maecenas accumsan lacus vel facilisis volutpat.\n" +
                "\n" +
                "Mattis vulputate enim nulla aliquet porttitor lacus luctus. Vel eros donec ac odio tempor. Nulla pellentesque dignissim enim sit amet venenatis. Pellentesque diam volutpat commodo sed egestas. Quam viverra orci sagittis eu volutpat. Ut tellus elementum sagittis vitae et leo. Quam quisque id diam vel quam. Aliquam malesuada bibendum arcu vitae elementum curabitur. Tellus rutrum tellus pellentesque eu tincidunt tortor aliquam nulla facilisi. Ipsum dolor sit amet consectetur adipiscing elit ut aliquam purus. Suscipit tellus mauris a diam maecenas sed. Bibendum at varius vel pharetra vel turpis nunc eget lorem. Urna neque viverra justo nec ultrices dui.",
        imgUrl = "https://picsum.photos/id/132/1280/720"
    ))
}