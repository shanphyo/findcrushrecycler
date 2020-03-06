package com.mic.findcrush.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.mic.findcrush.Adapter.PostRecyclerCustomAdapter

import com.mic.findcrush.R
import com.mic.findcrush.modern.Post
import kotlinx.android.synthetic.main.fragment_listfragment.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [listfragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class listfragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
      var root=inflater.inflate(R.layout.fragment_listfragment, container, false)
        var arr=ArrayList<Post>()
        arr.add(Post(R.drawable.liuyifei,"Liu Yifei ","2h",R.drawable.place_one,"1K","100","40"))
        arr.add(Post(R.drawable.chirs,"Chirs","3h",R.drawable.placetwo,"3K","1K","405"))
        arr.add(Post(R.drawable.jackma,"Jack Ma","4h",R.drawable.place_three,"5K","500","50"))
        arr.add(Post(R.drawable.jackiechan,"Jackie Chan","6h",R.drawable.place_four,"234","10K","80"))
        arr.add(Post(R.drawable.therock,"The Rock","12h",R.drawable.fiveplace,"1K","1","400"))
        var postAdapter=PostRecyclerCustomAdapter(arr)
        root.rv.layoutManager= LinearLayoutManager(root.context)
        root.rv.adapter=postAdapter
        return root
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment listfragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            listfragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
