package ba.rubicon.discussionboard.di

import ba.rubicon.discussionboard.DiscussionBoardApp
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        AppModule::class,
        ActivityBindingModule::class]
)
interface AppComponent : AndroidInjector<DiscussionBoardApp> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<DiscussionBoardApp>()
}
