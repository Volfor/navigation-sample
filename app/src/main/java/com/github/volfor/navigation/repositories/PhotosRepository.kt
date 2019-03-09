package com.github.volfor.navigation.repositories

import com.github.volfor.navigation.models.Photo

class PhotosRepository {

    fun getPhotos(): List<Photo> {
        return listOf(
            Photo(
                "Thomas Lefebvre",
                "The Wigwam Resort, Litchfield Park, United States",
                "https://www.projectexcape.it/wp-content/uploads/2017/01/pexels-photo-248159-1.jpg"
            ),
            Photo(
                "Nitish Meena",
                "Hidden Lake Lookout trailhead, United States",
                "https://images.unsplash.com/photo-1444090542259-0af8fa96557e?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1350&q=80"
            ),
            Photo(
                "JOHN TOWNER",
                "Ancient Bristlecone Pine Forest, United States",
                "https://images.unsplash.com/photo-1477346611705-65d1883cee1e?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1950&q=80"
            ),
            Photo(
                "Paul Earle",
                "",
                "https://images.unsplash.com/photo-1437422061949-f6efbde0a471?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1350&q=80"
            ),
            Photo(
                "Denys Nevozhai",
                "Shanghai, China",
                "https://images.unsplash.com/photo-1465447142348-e9952c393450?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=968&q=80"
            ),
            Photo(
                "Stefan Kunze",
                "Mallorca, Llubí, Spain",
                "https://images.unsplash.com/photo-1437652633673-cc02b9c67a1b?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1350&q=80"
            ),
            Photo(
                "Alex Jodoin",
                "New York, United States",
                "https://images.unsplash.com/photo-1493087670264-2f7f5844b402?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1349&q=80"
            )
        )
    }
}