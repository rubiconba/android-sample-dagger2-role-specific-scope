package ba.rubicon.discussionboard.adminBoard

import ba.rubicon.domain.useCase.LoadTopics

class AdminBoardPresenter(
    var mView: AdminBoardContract.View,
    val mLoadTopics: LoadTopics
) : AdminBoardContract.Presenter<AdminBoardContract.View> {

    override fun onAttach(view: AdminBoardContract.View) {
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
