package ba.rubicon.discussionboard.userBoard

import ba.rubicon.discussionboard.userBoard.UserBoardContract
import ba.rubicon.domain.useCase.LoadTopics

class UserBoardPresenter(
    var mView: UserBoardContract.View,
    val mLoadTopics: LoadTopics
) : UserBoardContract.Presenter<UserBoardContract.View> {

    override fun onAttach(view: UserBoardContract.View) {
        mView = view
        loadTopics()
    }

    override fun onDetach() {
        // You should probably release resources here like RxJava and Coroutines calls
    }

    override fun loadTopics() {
        mView.updateList(mLoadTopics.exec())
    }
}
