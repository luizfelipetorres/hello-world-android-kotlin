package com.example.helloworld.api

import com.example.helloworld.models.Repo

data class SearchResult(
    val items: List<Repo>
)