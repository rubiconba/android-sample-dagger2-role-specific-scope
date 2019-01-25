package ba.rubicon.discussionboard.adminBoard

import ba.rubicon.domain.entity.Topic

interface AdminBoardContract {

    interface View {
        fun updateList(list: List<Topic>)
    }

    interface Presenter<T : AdminBoardContract.View> {
        fun onAttach(view: T)
        fun onDetach()
        fun loadTopics()
    }
}
