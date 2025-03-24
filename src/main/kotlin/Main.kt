import attachments.Video
import attachments.VideoAttachment
import data.Coments
import data.Likes
import data.Post
import service.WallService

fun main() {
    val post = Post(10, 12, 23, 45, 1741444833, "Проверка",
        coments = Coments(1, canClose = true),
        likes = Likes(10),
        attachments = VideoAttachment(Video(1, 2, 123, 124,120))
    )
    val changePost = post.copy(canPin = true, canEdit = true, canDelete = true)
    val changePost2 = post.copy(id = 2, text = "проверка 2")
    val service = WallService
    println(service.add(post))
    println(service.add(changePost))
    println(service.update(changePost2))
    service.add(Post(4,14,11,23,1741444823, "Nullable прговерка",
        coments = null,
        likes = null))


    service.printPosts()

}