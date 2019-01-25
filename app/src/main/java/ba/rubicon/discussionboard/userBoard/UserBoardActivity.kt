package ba.rubicon.discussionboard.userBoard

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import ba.rubicon.discussionboard.R
import ba.rubicon.discussionboard.adminBoard.AdminBoardAdapter
import ba.rubicon.domain.entity.Topic
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.admin_board.*
import kotlinx.android.synthetic.main.user_board.*
import javax.inject.Inject

class UserBoardActivity : DaggerAppCompatActivity(), UserBoardContract.View {

    @Inject
    lateinit var mPresenter: UserBoardContract.Presenter<UserBoardContract.View>

    @Inject
    lateinit var mAdapter: UserBoardAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.user_board)

        recyclerviewUserBoard.adapter = mAdapter
        recyclerviewUserBoard.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }

    override fun onStart() {
        super.onStart()
        mPresenter.onAttach(this)
    }

    override fun onStop() {
        super.onStop()
        mPresenter.onDetach()
    }

    override fun updateList(list: List<Topic>) {
        mAdapter.submitList(list)
    }
}
