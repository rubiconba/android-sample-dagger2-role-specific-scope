package ba.rubicon.domain.entity

data class Topic(
    val mId: Long,
    val mTitle: String,
    val mCategory: String,
    val mImageUrl: String,
    val mTopicMetadata: TopicMetadata?
)
