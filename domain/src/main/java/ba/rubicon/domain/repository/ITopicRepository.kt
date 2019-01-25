package ba.rubicon.domain.repository

import ba.rubicon.domain.entity.Topic

interface ITopicRepository {
    fun loadTopics(): List<Topic>
}
