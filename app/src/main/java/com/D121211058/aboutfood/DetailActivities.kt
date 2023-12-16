package com.D121211058.aboutfood

import com.D121211058.aboutfood.data.models.Article
import com.D121211058.aboutfood.ui.theme.D121211058AboutFoodTheme
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest


class DetailActivities : ComponentActivity() {

    private var selectedArticle: Article? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        selectedArticle = intent.getParcelableExtra("category")
        setContent {
            D121211058AboutFoodTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    FoodDetailScreen()
                }
            }
        }
    }

    @Composable
    fun FoodDetailScreen() {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
                .verticalScroll(rememberScrollState())
        ) {
            // Character Image
            AsyncImage(
                model = ImageRequest.Builder(context = LocalContext.current)
                    .data(selectedArticle?.strCategoryThumb)
                    .crossfade(true)
                    .build(),
                contentDescription = selectedArticle?.strCategory,
                modifier = Modifier
                    .width(400.dp)
                    .height(400.dp)
                    .clip(MaterialTheme.shapes.medium),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.height(16.dp))
            Text(text = selectedArticle?.strCategory ?: "Unknown", style = MaterialTheme.typography.displayMedium)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = selectedArticle?.strCategoryDescription ?: "Unknown", style = MaterialTheme.typography.displaySmall)

        }
    }
}