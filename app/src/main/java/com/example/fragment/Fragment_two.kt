package com.example.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fragment.databinding.FragmentTwoBinding


class Fragment_two : Fragment() {
    private lateinit var binding: FragmentTwoBinding
    private lateinit var myActivity:SendTextActivity

    interface SendTextActivity{
        fun updateTextActivityFromFrag2(newText:String)
    }

    companion object {
        fun newInstance() = Fragment_two()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //Log.i("alain", "Fragment_two onCreateView")

        binding = FragmentTwoBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        //Log.i("alain", "Fragment_two onViewCreated")

        super.onViewCreated(view, savedInstanceState)
        binding.envActivity.setOnClickListener {
            binding.envActivity.setOnClickListener {
                myActivity.updateTextActivityFromFrag2(binding.editText.text.toString())
            }
        }
    }

    override fun onAttach(context: Context) {
        //Log.i("alain", "Fragment_two onAttach")
        super.onAttach(context)

        this.myActivity=context as SendTextActivity

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        //Log.i("alain", "Fragment_two onCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        //Log.i("alain", "Fragment_two onViewStateRestored")
        super.onViewStateRestored(savedInstanceState)
    }

    override fun onStart() {
        //Log.i("alain", "Fragment_two onStart")
        super.onStart()
    }

    override fun onResume() {
        //Log.i("alain", "Fragment_two onResume")
        super.onResume()
    }

    override fun onPause() {
        //Log.i("alain", "Fragment_two onPause")
        super.onPause()
    }

    override fun onStop() {
        //Log.i("alain", "Fragment_two onStop")
        super.onStop()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        //Log.i("alain", "Fragment_two onSaveInstanceState")
        super.onSaveInstanceState(outState)
    }

    override fun onDestroyView() {
        //Log.i("alain", "Fragment_two onDestroyView")
        super.onDestroyView()
    }

    override fun onDestroy() {
        //Log.i("alain", "Fragment_two onDestroy")
        super.onDestroy()
    }

}