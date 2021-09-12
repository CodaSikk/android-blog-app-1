package com.example.blogapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import com.example.blogapp.ui.composables.BlogList
import com.example.blogapp.ui.theme.BlogAppTheme
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.BufferedReader
import java.io.InputStreamReader

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val blogs = getBlogs()

        setContent {
            BlogAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    BlogList(blogs = blogs)
                }
            }
        }
    }

    private fun getBlogs(): List<Blog> {
        val inputStream = assets.open("blogs.json")
        val reader = BufferedReader(InputStreamReader(inputStream))

        val jsonStringBuilder = StringBuilder()
        var line = reader.readLine()
        while (line != null) {
            jsonStringBuilder.append(line)
            line = reader.readLine()
        }

        reader.close()

        val type = object : TypeToken<List<Blog>>() {}.type

        return Gson().fromJson(jsonStringBuilder.toString(), type)
    }
}
