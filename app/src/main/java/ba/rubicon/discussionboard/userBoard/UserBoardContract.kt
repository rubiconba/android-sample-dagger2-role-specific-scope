package ba.rubicon.discussionboard.userBoard

import ba.rubicon.domain.entity.Topic

interface UserBoardContract {

    interface View {
        fun updateList(list: List<Topic>)
    }

    interface Presenter<T : UserBoardContract.View> {
        fun onAttach(view: T)
        fun onDetach()
        fun loadTopics()
    }
}
