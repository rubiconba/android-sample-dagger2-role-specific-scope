package ba.rubicon.discussionboard.util

import android.support.v7.util.DiffUtil
import ba.rubicon.domain.entity.Topic

class TopicDiff : DiffUtil.ItemCallback<Topic>() {
    override fun areItemsTheSame(p0: Topic, p1: Topic): Boolean {
        return p0.mId == p1.mId
    }

    override fun areContentsTheSame(p0: Topic, p1: Topic): Boolean {
        return p0 == p1
    }
}
