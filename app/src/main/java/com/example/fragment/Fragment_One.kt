package com.example.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fragment.databinding.FragmentOneBinding


class Fragment_One : Fragment() {
    private lateinit var binding: FragmentOneBinding
    private lateinit var myActivity: SendTextActivity

    interface SendTextActivity{
        fun updateTextActivityFromFrag1(newText:String)
    }

    companion object {
        fun newInstance() = Fragment_One()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        //Log.i("alain", "Fragment_One onCreateView")
        binding = FragmentOneBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        //Log.i("alain", "Fragment_One onViewCreated")
        super.onViewCreated(view, savedInstanceState)

        binding.envActivity.setOnClickListener {
            myActivity.updateTextActivityFromFrag1(binding.editText.text.toString())
        }
    }

    override fun onAttach(context: Context) {
        //Log.i("alain", "Fragment_One onAttach")
        super.onAttach(context)
        this.myActivity=context as SendTextActivity
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        //Log.i("alain", "Fragment_One onCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        //Log.i("alain", "Fragment_One onViewStateRestored")
        super.onViewStateRestored(savedInstanceState)
    }

    override fun onStart() {
        //Log.i("alain", "Fragment_One onStart")
        super.onStart()
    }

    override fun onResume() {
        //Log.i("alain", "Fragment_One onResume")
        super.onResume()
    }

    override fun onPause() {
        //Log.i("alain", "Fragment_One onPause")
        super.onPause()
    }

    override fun onStop() {
        //Log.i("alain", "Fragment_One onStop")
        super.onStop()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        //Log.i("alain", "Fragment_One onSaveInstanceState")
        super.onSaveInstanceState(outState)
    }

    override fun onDestroyView() {
        //Log.i("alain", "Fragment_One onDestroyView")
        super.onDestroyView()
    }

    override fun onDestroy() {
        //Log.i("alain", "Fragment_One onDestroy")
        super.onDestroy()
    }


}