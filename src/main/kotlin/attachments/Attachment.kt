package attachments

data class PhotoAttachment(val photo: Photo, override val type: String = "photo") : Attachments

data class VideoAttachment(val video: Video, override val type: String = "video") : Attachments

data class AudioAttachment(val audio: Audio, override val type: String = "audio") : Attachments

data class LinkAttachment(val link: Link, override val type: String = "link") : Attachments

data class NoteAttachment(val note: Note, override val type: String = "note") : Attachments

data class NotAvailable(override val type: String = "Вложения Отсутствуют") : Attachments