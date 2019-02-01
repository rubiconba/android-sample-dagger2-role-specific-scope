package ba.rubicon.data.di

import ba.rubicon.common.scope.AdminScope
import ba.rubicon.data.repository.AdminTopicRepository
import ba.rubicon.domain.repository.ITopicRepository
import ba.rubicon.domain.useCase.LoadTopics
import dagger.Module
import dagger.Provides

@Module
class AdminModule {

    /**
     * Provides Admin instance of ITopicRepository.
     * @return ITopicRepository
     */
    @AdminScope
    @Provides
    fun provideTopicRepository(): ITopicRepository {
        return AdminTopicRepository()
    }

    /**
     * Provides Admin instance of LoadTopics UseCase.
     * @param topicRepository ITopicRepository
     * @return LoadTopics
     */
    @AdminScope
    @Provides
    fun provideLoadTopicsUseCase(topicRepository: ITopicRepository): LoadTopics {
        return LoadTopics(topicRepository)
    }
}
