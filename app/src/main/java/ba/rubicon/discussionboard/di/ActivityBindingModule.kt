package ba.rubicon.discussionboard.di

import ba.rubicon.common.scope.AdminScope
import ba.rubicon.common.scope.UserScope
import ba.rubicon.data.di.AdminModule
import ba.rubicon.data.di.UserModule
import ba.rubicon.discussionboard.adminBoard.AdminBoardActivity
import ba.rubicon.discussionboard.adminBoard.AdminBoardModule
import ba.rubicon.discussionboard.userBoard.UserBoardActivity
import ba.rubicon.discussionboard.userBoard.UserBoardModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface ActivityBindingModule {

    @UserScope
    @ContributesAndroidInjector(modules = [UserBoardModule::class, UserModule::class])
    fun bindUserBoard(): UserBoardActivity

    @AdminScope
    @ContributesAndroidInjector(modules = [AdminBoardModule::class, AdminModule::class])
    fun bindAdminBoard(): AdminBoardActivity
}
