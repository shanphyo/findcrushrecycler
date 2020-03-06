package com.mic.findcrush.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mic.findcrush.R
import com.mic.findcrush.modern.Post
import kotlinx.android.synthetic.main.recycleitem.view.*

class PostRecyclerCustomAdapter(var postlist:ArrayList<Post>) :RecyclerView.Adapter<PostRecyclerCustomAdapter.postViewHolder>(){
    inner  class  postViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        fun postData(post: Post){
            itemView.iv_profile.setImageResource(post.profileimg)
            itemView.tv_username.text=post.username
            itemView.tv_hour.text=" "+post.hour
            itemView.iv_postupload.setImageResource(post.postimg)
            itemView.tv_likecount.text=post.likecount
            itemView.tv_feedbackcount.text=post.feedbackcount
            itemView.tv_sharedcount.text=post.sharedcount
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): postViewHolder {
        var view=LayoutInflater.from(parent.context).inflate(R.layout.recycleitem,parent,false)
        return postViewHolder(view)
    }

    override fun getItemCount(): Int {
        return  postlist.size
    }

    override fun onBindViewHolder(holder: postViewHolder, position: Int) {
        holder.postData(postlist[position])
    }

}