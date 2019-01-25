package ba.rubicon.discussionboard.signIn

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import ba.rubicon.discussionboard.R
import ba.rubicon.discussionboard.adminBoard.AdminBoardActivity
import ba.rubicon.discussionboard.userBoard.UserBoardActivity
import kotlinx.android.synthetic.main.sign_in.*

class SignInActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_in)

        buttonSignInUser.setOnClickListener {
            startActivity(Intent(this, UserBoardActivity::class.java))
        }

        buttonSignInAdmin.setOnClickListener {
            startActivity(Intent(this, AdminBoardActivity::class.java))
        }
    }
}
