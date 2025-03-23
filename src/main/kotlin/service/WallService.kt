package service

import data.Coments
import data.Likes
import data.Post

object WallService {
    private var id = 0
    private var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        posts += post.copy(id = ++id, likes = post.likes?.copy() ?: Likes(0),
            coments = post.coments?.copy() ?: Coments(0)
        )
        return posts.last()
    }

    fun update(post: Post): Boolean {
        for ((index, actualPost) in posts.withIndex()) {
            if (actualPost.id == post.id) {
                posts[index] = post.copy(likes = post.likes?.copy() ?: Likes(0),
                    coments = post.coments?.copy() ?: Coments(0))
                return true
            }
        }
        return false
    }

    fun printPosts() {
        for (post in posts){
            print(post)
            println()
        }

    }

    fun clear(){
        posts = emptyArray()
        id = 0
    }
}