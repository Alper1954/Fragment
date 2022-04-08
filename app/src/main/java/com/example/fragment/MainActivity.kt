package com.example.fragment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.fragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),Fragment_One.SendTextActivity,Fragment_two.SendTextActivity {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        //Log.i("alain", "MainActivity onCreate")

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.frag2.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragmentContainerView, Fragment_two.newInstance())
                .addToBackStack(null)
                .commit()
        }

        binding.frag1.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragmentContainerView, Fragment_One.newInstance())
                .addToBackStack(null)
                .commit()
        }
    }



    override fun updateTextActivityFromFrag1(newText: String) {
        binding.textView2.text = newText
    }

    override fun updateTextActivityFromFrag2(newText: String) {
        binding.textView2.text = newText
    }


}