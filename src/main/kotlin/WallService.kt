class WallService {
    private var posts = emptyArray<Post>()
    private var currentUniqId:Long=1


    fun add(post: Post): Post {
        posts += post.copy(id = currentUniqId)
        currentUniqId++
        return posts.last()
    }
    fun update(post2: Post): Boolean {
        for ((index,post) in posts.withIndex()) {
            if(post.id == post2.id) {
                posts[index] = post.copy(
                    text = post2.text,
                    fromId = post2.fromId,
                    date = post2.date
                )

                return true
            }
        }
        return false
    }

    fun showPostById(id: Long) {

        for ((index,post) in posts.withIndex()) {
            if(post.id == id) {
                println(posts[index])
            }
        }

    }

}