import attachments.*
import data.Coments
import data.Likes
import data.Post
import service.WallService

fun main() {
    val attachment: Attachments = AudioAttachments(Audio(1, 2,1234, 120))
    println(attachment.type)
    
    val post = Post(10, 12, 23, 45, 1741444833, "Проверка",
        coments = Coments(1, canClose = true),
        likes = Likes(10),
        attachments = arrayOf(NoteAttachments(Note(1, 2, 5)), attachment)
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