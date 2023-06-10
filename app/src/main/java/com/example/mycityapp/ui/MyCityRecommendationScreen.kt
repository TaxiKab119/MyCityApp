package com.example.mycityapp.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose.MyCityAppTheme
import com.example.mycityapp.R
import com.example.mycityapp.data.DataSource
import com.example.mycityapp.data.MyCityUiState
import com.example.mycityapp.model.Recommendation

/* TODO */
@Composable
fun RecommendationListOnly(
    myCityUiState: MyCityUiState,
    onRecommendationCardPressed: (Recommendation) -> Unit,
    modifier: Modifier = Modifier
) {
}





@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RecommendationCard(
    recommendation: Recommendation,
    selected: Boolean,
    onCardClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier,
        colors = CardDefaults.cardColors(
            containerColor = if (selected)
                MaterialTheme.colorScheme.primaryContainer
            else
                MaterialTheme.colorScheme.secondaryContainer
        ),
        onClick = onCardClick
    ) {
        Column {
            Image(
                painter = painterResource(id = recommendation.imageResourceId),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(194.dp),
                contentScale = ContentScale.Crop
            )
            Text(
                text = stringResource(recommendation.titleResourceId),
                modifier = Modifier.padding(16.dp),
                style = MaterialTheme.typography.headlineSmall
            )
        }
    }
}



@Preview(showBackground = true)
@Composable
fun RecommendationCardPreview() {
    MyCityAppTheme {
        RecommendationCard(
            recommendation = DataSource.defaultRecommendation,
            selected = false,
            onCardClick = {}
        )
    }
}