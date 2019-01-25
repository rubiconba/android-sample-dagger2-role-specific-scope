package ba.rubicon.discussionboard.di

import android.content.Context
import ba.rubicon.common.qualifier.ApplicationContext
import ba.rubicon.discussionboard.DiscussionBoardApp
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
interface AppModule {

    @Singleton
    @Binds
    @ApplicationContext
    fun provideApplicationContext(application: DiscussionBoardApp): Context

}
