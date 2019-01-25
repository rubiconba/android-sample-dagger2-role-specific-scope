package ba.rubicon.data.repository

import ba.rubicon.data.util.loadAdminTopics
import ba.rubicon.domain.entity.Topic
import ba.rubicon.domain.repository.ITopicRepository

class AdminTopicRepository : ITopicRepository {
    override fun loadTopics(): List<Topic> {
        return loadAdminTopics()
    }
}
