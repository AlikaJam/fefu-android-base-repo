package ru.fefu.activitytracker.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ru.fefu.activitytracker.R
import ru.fefu.activitytracker.lists.ActivityType
import ru.fefu.activitytracker.databinding.ItemActivityTypeBinding

class NewActivityAdapter(items: List<ActivityType>):
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private val list = items.toMutableList()

    private var itemClickListener: (Int) -> Unit = {}

    fun setItemClickListener(listener: (Int) -> Unit) {
        itemClickListener = listener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_activity_type, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder) {
            is ViewHolder -> holder.bind(list[position])
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }


    inner class ViewHolder(item: View): RecyclerView.ViewHolder(item) {
        private val binding = ItemActivityTypeBinding.bind(item)

        fun bind(model: ActivityType) = with(binding) {
            textActivityType.text = model.activity
        }

        init {
            item.setOnClickListener {
                val position = adapterPosition
                if (position != RecyclerView.NO_POSITION)
                    itemClickListener.invoke(position)
            }
        }
    }
} 
