package ba.rubicon.discussionboard.userBoard

import android.content.Context
import ba.rubicon.common.qualifier.ActivityContext
import ba.rubicon.common.scope.AdminScope
import ba.rubicon.common.scope.UserScope
import ba.rubicon.discussionboard.adminBoard.AdminBoardAdapter
import ba.rubicon.domain.useCase.LoadTopics
import dagger.Module
import dagger.Provides

@Module
class UserBoardModule {

    @UserScope
    @Provides
    fun provideView(activity: UserBoardActivity): UserBoardContract.View {
        return activity
    }

    @UserScope
    @Provides
    fun providePresenter(
        view: UserBoardContract.View,
        loadTopics: LoadTopics
    ): UserBoardContract.Presenter<UserBoardContract.View> {
        return UserBoardPresenter(view, loadTopics)
    }

    @UserScope
    @Provides
    @ActivityContext
    fun provideContext(userBoardActivity: UserBoardActivity): Context = userBoardActivity

    @UserScope
    @Provides
    fun provideAdapter(@ActivityContext context: Context): UserBoardAdapter {
        return UserBoardAdapter(context)
    }
}
