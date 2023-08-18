package kr.hs.dgsw.recyclerview_study.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

import kr.hs.dgsw.recyclerview_study.databinding.ItemRvLostFoundBinding
import kr.hs.dgsw.recyclerview_study.model.LostFound

class LostFoundAdapter(private val lostFoundList: List<LostFound>) :
    RecyclerView.Adapter<LostFoundAdapter.LostFoundViewHolder>() {

    inner class LostFoundViewHolder(private val binding: ItemRvLostFoundBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(lostFound: LostFound) {
            binding.tvTitle.text = lostFound.title
            binding.tvName.text = lostFound.name
            binding.tvData.text = lostFound.data
            binding.tvContent.text = lostFound.content
            binding.tvLocation.text = lostFound.place
            Glide.with(binding.ivProfile)
                .load(lostFound.profileimg)
                .into(binding.ivProfile)
        }
    }


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): LostFoundAdapter.LostFoundViewHolder {
        val binding =
            ItemRvLostFoundBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return LostFoundViewHolder(binding)
    }

    override fun onBindViewHolder(holder: LostFoundAdapter.LostFoundViewHolder, position: Int) {
        val item = lostFoundList[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return lostFoundList.size
    }
}