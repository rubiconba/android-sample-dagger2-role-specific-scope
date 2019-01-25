package ba.rubicon.discussionboard

import ba.rubicon.discussionboard.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.support.DaggerAppCompatActivity
import dagger.android.support.DaggerApplication

class DiscussionBoardApp : DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder().create(this)
    }
}
