fun main(){
    val original = Post(
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

    val WallService = WallService()
    println(WallService.add(original))




    val original4 = Post(
        id = 1,
        ownerId = 0,
        fromId = 11,
        createdBy = 1,
        date = "02.02.2020",
        text = "updated text of post with id=1",
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
        attachments = arrayOf(
            GraffitiAttachment(
                graffiti = Graffiti(
                    id = 12,
                    ownerId = 22,
                    photo130 = "dsfsdf",
                    photo504 = "vxcvcxv"
                )
            ),
            PhotoAttachment(
                photo = Photo(
                    id = 14,
                    albumId = 3,
                    ownerId = 22,
                    userId = 2,
                    text = "dsfdsfsdfsdf",
                    date = 134343,
                    sizes = arrayOf<Int>(123,234),
                    width = 120,
                    height = 160,
                )
            )
        )
    )


    if(WallService.update(original4))
        println("post id=1 successfuly updated")
    else
        println("no such id found")

    println(WallService.showPostById(1))

}