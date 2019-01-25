package ba.rubicon.discussionboard.adminBoard

import android.content.Context
import ba.rubicon.common.qualifier.ActivityContext
import ba.rubicon.common.scope.AdminScope
import ba.rubicon.domain.useCase.LoadTopics
import dagger.Module
import dagger.Provides

@Module
class AdminBoardModule {

    @AdminScope
    @Provides
    fun provideView(activity: AdminBoardActivity): AdminBoardContract.View {
        return activity
    }

    @AdminScope
    @Provides
    fun providePresenter(
        view: AdminBoardContract.View,
        loadTopics: LoadTopics
    ): AdminBoardContract.Presenter<AdminBoardContract.View> {
        return AdminBoardPresenter(view, loadTopics)
    }

    @AdminScope
    @Provides
    @ActivityContext
    fun provideContext(adminBoardActivityActivity: AdminBoardActivity): Context =
        adminBoardActivityActivity

    @AdminScope
    @Provides
    fun provideAdapter(@ActivityContext context: Context): AdminBoardAdapter {
        return AdminBoardAdapter(context)
    }
}
