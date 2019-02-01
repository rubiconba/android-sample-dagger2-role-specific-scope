package ba.rubicon.data.repository

import ba.rubicon.data.util.loadUserTopics
import ba.rubicon.domain.entity.Topic
import ba.rubicon.domain.repository.ITopicRepository

/**
 * Admin instance of ITopicRepository
 */
class UserTopicRepository : ITopicRepository {
    override fun loadTopics(): List<Topic> {
        return loadUserTopics()
    }
}
