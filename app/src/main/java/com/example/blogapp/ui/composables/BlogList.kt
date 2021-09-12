package com.example.blogapp.ui.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter
import com.example.blogapp.Blog

@Composable
fun BlogList(blogs: List<Blog>) {
    LazyColumn(
        modifier = Modifier.padding(
            horizontal = 16.dp,
            vertical = 12.dp
        )
    ) {
        items(items = blogs) { blog ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 12.dp)
                    .clickable { },
                shape = RoundedCornerShape(size = 8.dp),
                elevation = 8.dp
            ) {
                Column {
                    Image(
                        painter = rememberImagePainter(data = blog.imgUrl),
                        contentDescription = "",
                        modifier = Modifier
                            .fillMaxSize()
                            .sizeIn(maxHeight = 200.dp)
                    )

                    Text(
                        text = blog.title,
                        modifier = Modifier.padding(all = 16.dp),
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
    }
}