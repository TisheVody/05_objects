class Posts {
}

fun main() {

}

data class Post(
    val id: Int,
    val ownerId: Int,
//    val fromId: Int,
//    val createdBy: Int,
    val date: Int,
    val text: String,
//    val replyOwnerId: Int,
//    val replyPostId: Int,
//    val friendsOnly: Boolean,
//    val comments: Object,
//    val copyright: Object,
//    val likes: Object,
//    val reposts: Object,
//    val views: Object,
//    val postType: String,
//    val signerId: Int,
//    val canPin: Boolean,
//    val canDelete: Boolean,
//    val canEdit: Boolean,
//    val isPinned: Int,
//    val markedAsAds: Boolean,
//    val isFavorite: Boolean,
//    val donut: Object,
//    val postponedId: Int,
)

object WallService {
    private var posts = emptyArray<Post>()
    private var property = 0

    fun add(post: Post): Post {
        property += 1
        posts += post.copy(id = property)
        return posts.last()
    }

    fun update(post: Post): Boolean {
        for (elm in posts) {
            if (elm.id == post.id) {
                elm.copy(text = post.text)
                return true
            }
        }
        return false
    }
}

