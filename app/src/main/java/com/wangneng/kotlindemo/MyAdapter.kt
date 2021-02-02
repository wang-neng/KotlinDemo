package com.wangneng.kotlindemo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

/**
 *
 * 我的适配器
 * @author wangneng
 * @date 2020/12/10
 */
public class MyAdapter : RecyclerView.Adapter<MyAdapter.MyHolder>() {

    private var list : List<String> = ArrayList<String>()
    private var mListener : OnItemClickListener ?= null

    fun setOnItemClickListener(listener : OnItemClickListener){
        this.mListener = listener;
    }

    fun add(list : List<String>){
        this.list = list;
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        val view = LayoutInflater.from(parent!!.context).inflate(R.layout.item_holder_view,parent,false)
        val holder = MyHolder(view);
        return holder;
    }

    override fun getItemCount(): Int {
        return list!!.size;
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        holder!!.textView.setText(list!!.get(position))
    }

    class MyHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var textView: TextView
        private var clickListener: OnItemClickListener? = null

        init {
            textView = itemView.findViewById(R.id.tv)

        }

    }

    public interface OnItemClickListener {
        fun onItemClick(view: View, position: Int);
    }


}