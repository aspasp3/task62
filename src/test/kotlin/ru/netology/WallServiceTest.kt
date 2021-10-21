package ru.netology

import WallService
import Comments
import Copyright
import Likes
import Repost
import Views
import Donut

import Post
import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun updateExisting() {
        val service = WallService()
        val postTestObject = Post(
            id = 0,
            ownerId = 0,
            fromId = 11,
            createdBy = 1,
            date = "01.02.2020",
            text = "some text 1",
            replyOwnerId = 0,
            replyPostId = 0,
            friendsOnly = false,
            comments = Comments(
                count = 0,
                canPost = true,
                groupsCanPost = true,
                canClose = false,
                canOpen = true
            ),
            copyright = Copyright(
                id = 0,
                link = "",
                name = "",
                type = ""
            ),
            likes = Likes(
                count = 0,
                userLikes = true,
                canLike = true,
                canPublish = true
            ),
            repost = Repost(
                count = 0,
                userReposted = false
            ),
            views = Views(
                count = 0
            ),
            postType = "post",
            signerId = 0,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = false,
            isFavorite = false,
            donut = Donut(
                isDonut = false,
                paidDuration = 0,
                placeholder = 0,
                canPublishFreeCopy = true,
                editMode = "all"
            ),
            postponedId = 0,
            attachments = null
        )
        val postTestObject2 = Post(
            id = 0,
            ownerId = 0,
            fromId = 12,
            createdBy = 1,
            date = "02.02.2020",
            text = "some text 2",
            replyOwnerId = 0,
            replyPostId = 0,
            friendsOnly = false,
            comments = Comments(
                count = 0,
                canPost = true,
                groupsCanPost = true,
                canClose = false,
                canOpen = true
            ),
            copyright = Copyright(
                id = 0,
                link = "",
                name = "",
                type = ""
            ),
            likes = Likes(
                count = 0,
                userLikes = true,
                canLike = true,
                canPublish = true
            ),
            repost = Repost(
                count = 0,
                userReposted = false
            ),
            views = Views(
                count = 0
            ),
            postType = "post",
            signerId = 0,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = false,
            isFavorite = false,
            donut = Donut(
                isDonut = false,
                paidDuration = 0,
                placeholder = 0,
                canPublishFreeCopy = true,
                editMode = "all"
            ),
            postponedId = 0,
            attachments = null
        )
        service.add(postTestObject)
        service.add(postTestObject2)


        val update = Post (
            id = 1,
            ownerId = 0,
            fromId = 12,
            createdBy = 1,
            date = "12.02.2020",
            text = "some text updated",
            replyOwnerId = 0,
            replyPostId = 0,
            friendsOnly = false,
            comments = Comments(
                count = 0,
                canPost = true,
                groupsCanPost = true,
                canClose = false,
                canOpen = true
            ),
            copyright = Copyright(
                id = 0,
                link = "",
                name = "",
                type = ""
            ),
            likes = Likes(
                count = 0,
                userLikes = true,
                canLike = true,
                canPublish = true
            ),
            repost = Repost(
                count = 0,
                userReposted = false
            ),
            views = Views(
                count = 0
            ),
            postType = "post",
            signerId = 0,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = false,
            isFavorite = false,
            donut = Donut(
                isDonut = false,
                paidDuration = 0,
                placeholder = 0,
                canPublishFreeCopy = true,
                editMode = "all"
            ),
            postponedId = 0,
            attachments = null
        )
        val result = service.update(update)

        assertTrue(result)
    }

    @Test
    fun addNotZero() {
        val service = WallService()
        val postTestObject = Post(
            id = 0,
            ownerId = 0,
            fromId = 11,
            createdBy = 1,
            date = "04.02.2020",
            text = "some text 4",
            replyOwnerId = 0,
            replyPostId = 0,
            friendsOnly = false,
            comments = Comments(
                count = 0,
                canPost = true,
                groupsCanPost = true,
                canClose = false,
                canOpen = true
            ),
            copyright = Copyright(
                id = 0,
                link = "",
                name = "",
                type = ""
            ),
            likes = Likes(
                count = 0,
                userLikes = true,
                canLike = true,
                canPublish = true
            ),
            repost = Repost(
                count = 0,
                userReposted = false
            ),
            views = Views(
                count = 0
            ),
            postType = "post",
            signerId = 0,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = false,
            isFavorite = false,
            donut = Donut(
                isDonut = false,
                paidDuration = 0,
                placeholder = 0,
                canPublishFreeCopy = true,
                editMode = "all"
            ),
            postponedId = 0,
            attachments = null
        )
        val result = service.add(postTestObject)
        var booleanResult = true

        if(result.id == 0L)
            booleanResult = false

        assertTrue(booleanResult)
    }
}