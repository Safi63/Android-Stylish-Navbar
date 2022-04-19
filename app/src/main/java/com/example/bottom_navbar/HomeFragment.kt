package com.example.bottom_navbar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.FragmentTransaction
import androidx.navigation.fragment.findNavController
import com.google.android.material.bottomnavigation.BottomNavigationView


class HomeFragment : Fragment() {

//    private var frag : FragmentTransaction =
//    val fragTasbhi = TasbihFragment().onPrimaryNavigationFragmentChanged()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var rootView = inflater.inflate(R.layout.fragment_home, container, false)

        var email = rootView.findViewById<EditText>(R.id.editTextEmail).text
        var password = rootView.findViewById<EditText>(R.id.editTextPassword).text



            rootView.findViewById<Button>(R.id.loginButton).setOnClickListener {

            if (email.isNullOrBlank()||password.isNullOrBlank()){
                Toast.makeText(context,"Please fill required fields",Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(context,"${email} is logged in!",Toast.LENGTH_LONG).show()
            }
        }
        return rootView
    }

//    private fun loadTasbih(fragment: Fragment) {
//
//        supportFragmentManager.beginTransaction().commit()
//    }

}