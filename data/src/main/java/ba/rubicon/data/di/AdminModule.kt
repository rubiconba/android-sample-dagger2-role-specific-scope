package ba.rubicon.data.di

import ba.rubicon.common.scope.AdminScope
import ba.rubicon.data.repository.AdminTopicRepository
import ba.rubicon.domain.repository.ITopicRepository
import ba.rubicon.domain.useCase.LoadTopics
import dagger.Module
import dagger.Provides

@Module
class AdminModule {

    @AdminScope
    @Provides
    fun provideTopicRepository(): ITopicRepository {
        return AdminTopicRepository()
    }

    @AdminScope
    @Provides
    fun provideLoadTopicsUseCase(topicRepository: ITopicRepository): LoadTopics {
        return LoadTopics(topicRepository)
    }
}
