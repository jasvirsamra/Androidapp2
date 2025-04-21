package com.trioscg.newspaperapp

private fun getArticles(): List<Article> {
    return listOf(
        Article(
            "World News Today",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit...",
            "https://via.placeholder.com/150"
        ),
        Article(
            "Sports Headlines",
            "Team A defeated Team B in a thrilling match...",
            "https://via.placeholder.com/150"
        ),
        Article(
            "Technology Updates",
            "New AI features are revolutionizing the tech world...",
            "https://via.placeholder.com/150",
        )
        // Add more articles here
    )
}
