package ba.rubicon.discussionboard.adminBoard

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import ba.rubicon.discussionboard.R
import ba.rubicon.domain.entity.Topic
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.admin_board.*
import javax.inject.Inject

class AdminBoardActivity : DaggerAppCompatActivity(), AdminBoardContract.View {

    @Inject
    lateinit var mPresenter: AdminBoardContract.Presenter<AdminBoardContract.View>

    @Inject
    lateinit var mAdapter: AdminBoardAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.admin_board)

        recyclerviewAdminBoard.adapter = mAdapter
        recyclerviewAdminBoard.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
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
