package kr.hs.dgsw.recyclerview_study

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kr.hs.dgsw.recyclerview_study.adapter.LostFoundAdapter
import kr.hs.dgsw.recyclerview_study.databinding.ActivityMainBinding
import kr.hs.dgsw.recyclerview_study.model.LostFound

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val lostFoundList = ArrayList<LostFound>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        addDummyItems()
        binding.rvLostFound.adapter = LostFoundAdapter(lostFoundList)
        binding.rvLostFound.layoutManager = LinearLayoutManager(this)
    }

    fun addDummyItems() {
        for (i: Int in 1 .. 100) {
            lostFoundList.add(
                LostFound(
                    "분실물 $i 번",
                    "한준혁",
                    "2023-07-31 16:46:30",
                    "맥북을 잃어버렸어요 ㅠㅠ\n 찾으시면 연락주세요",
                    "사회학습실 또는 수학학습실",
                    R.drawable.mac_book
                )
            )
        }
    }
}
