package ba.rubicon.discussionboard.adminBoard

import android.content.Context
import android.support.v4.content.ContextCompat
import android.support.v7.recyclerview.extensions.ListAdapter
import android.support.v7.util.DiffUtil
import android.support.v7.widget.CardView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import ba.rubicon.discussionboard.R
import ba.rubicon.discussionboard.util.TopicDiff
import ba.rubicon.domain.entity.Topic
import com.bumptech.glide.Glide

class AdminBoardAdapter(
    val mContext: Context,
    diffCallback: DiffUtil.ItemCallback<Topic> = TopicDiff()
) :
    ListAdapter<Topic, AdminBoardAdapter.VH>(diffCallback) {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): VH {
        return VH(LayoutInflater.from(mContext).inflate(R.layout.boards_item_row, p0, false))
    }

    override fun onBindViewHolder(p0: VH, p1: Int) {
        p0.bind(getItem(p1))
    }

    inner class VH(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val category = itemView.findViewById<TextView>(R.id.textviewBoardsItemRowCategory)
        val title = itemView.findViewById<TextView>(R.id.textviewBoardsItemRowTitle)
        val errorMessage = itemView.findViewById<TextView>(R.id.textviewBoardsItemRowErrorMessage)
        val errorIcon = itemView.findViewById<ImageView>(R.id.imageviewBoardsItemRowWarning)
        val image = itemView.findViewById<ImageView>(R.id.imageviewBoardsItemImage)
        val root = itemView.findViewById<CardView>(R.id.cardviewBoardsItemRow)

        fun bind(topic: Topic) {
            category.text = topic.mCategory
            title.text = topic.mTitle
            Glide.with(mContext).load(topic.mImageUrl).into(image)
            if (topic.mTopicMetadata == null) {
                errorMessage.visibility = View.GONE
                errorIcon.visibility = View.GONE
                root.setCardBackgroundColor(
                    ContextCompat.getColor(
                        mContext,
                        R.color.cardview_light_background
                    )
                )
            } else {
                errorMessage.visibility = View.VISIBLE
                errorIcon.visibility = View.VISIBLE
                errorMessage.text = topic.mTopicMetadata?.mErrorMessage
                root.setCardBackgroundColor(ContextCompat.getColor(mContext, R.color.colorAmber))
            }
        }
    }
}

