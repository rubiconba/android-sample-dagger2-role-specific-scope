package ba.rubicon.domain.useCase

import ba.rubicon.domain.entity.Topic
import ba.rubicon.domain.repository.ITopicRepository

class LoadTopics (val mTopicRepository: ITopicRepository) {
    fun exec(): List<Topic> {
        return mTopicRepository.loadTopics()
    }
}
