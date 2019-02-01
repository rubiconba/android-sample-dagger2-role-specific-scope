package ba.rubicon.domain.useCase

import ba.rubicon.domain.entity.Topic
import ba.rubicon.domain.repository.ITopicRepository

/**
 * The responsibility of this UseCase is to get the list of Topics provided
 * through the ITopicRepository.
 * @property mTopicRepository ITopicRepository
 * @constructor
 */
class LoadTopics (val mTopicRepository: ITopicRepository) {
    fun exec(): List<Topic> {
        return mTopicRepository.loadTopics()
    }
}
