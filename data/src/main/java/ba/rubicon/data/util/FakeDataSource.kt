package ba.rubicon.data.util

import ba.rubicon.domain.entity.Topic
import ba.rubicon.domain.entity.TopicMetadata

const val RUBICON_IMAGE = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTIUCqXlXMaBKzt_JspF9_Qmgqg7z4iK-jfSFuy2bObuZFN60Cg"
fun loadUserTopics(): List<Topic> {
    val list = mutableListOf<Topic>()
    list.add(Topic(1, "Topic #1", "TV Shows", RUBICON_IMAGE, null))
    list.add(Topic(3, "Topic #3", "Politics", RUBICON_IMAGE, null))
    list.add(Topic(4, "Topic #4", "Music", RUBICON_IMAGE, null))
    list.add(Topic(5, "Topic #5", "Sci-tech", RUBICON_IMAGE, null))
    list.add(Topic(6, "Topic #6", "Games", RUBICON_IMAGE, null))
    return list
}

fun loadAdminTopics(): List<Topic> {
    val list = mutableListOf<Topic>()
    list.add(Topic(1, "Topic #1", "TV Shows", RUBICON_IMAGE, null))
    list.add(Topic(2, "Topic #2", "Movies", RUBICON_IMAGE, TopicMetadata(true, "This topic is hidden by Rubicon")))
    list.add(Topic(3, "Topic #3", "Politics", RUBICON_IMAGE, null))
    list.add(Topic(4, "Topic #4", "Music", RUBICON_IMAGE, null))
    list.add(Topic(5, "Topic #5", "Sci-tech", RUBICON_IMAGE, null))
    list.add(Topic(6, "Topic #6", "Games", RUBICON_IMAGE, null))
    return list
}

