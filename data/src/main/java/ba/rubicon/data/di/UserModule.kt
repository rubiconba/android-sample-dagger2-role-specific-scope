package ba.rubicon.data.di

import ba.rubicon.common.scope.UserScope
import ba.rubicon.data.repository.UserTopicRepository
import ba.rubicon.domain.repository.ITopicRepository
import ba.rubicon.domain.useCase.LoadTopics
import dagger.Module
import dagger.Provides

@Module
class UserModule {

    /**
     * Provides User instance of ITopicRepository.
     * @return ITopicRepository
     */
    @UserScope
    @Provides
    fun provideTopicRepository(): ITopicRepository {
        return UserTopicRepository()
    }

    /**
     * Provides User instance of LoadTopics UseCase.
     * @param topicRepository ITopicRepository
     * @return LoadTopics
     */
    @UserScope
    @Provides
    fun provideLoadTopicsUseCase(topicRepository: ITopicRepository): LoadTopics {
        return LoadTopics(topicRepository)
    }
}
