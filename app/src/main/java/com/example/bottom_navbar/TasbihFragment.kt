package com.example.bottom_navbar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.*
import android.widget.*

import androidx.navigation.fragment.findNavController


class TasbihFragment : Fragment() {

    private var prog = 0
    private var count = 0
    private var root : View? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var rootView = inflater.inflate(R.layout.fragment_tasbih, container, false)
        root = rootView
        updateProgressBar()

        rootView.findViewById<TextView>(R.id.count).text = "Count: $count"

         rootView.findViewById<Button>(R.id.resetButton).setOnClickListener {
             resetValue()
         }

        rootView.findViewById<RelativeLayout>(R.id.fullFrame).setOnClickListener{

           if (prog < 100){
               prog += 1
               updateProgressBar()
           }else{
               count ++
               resetValue()
               updateCounter()
           }
        }
        return rootView
    }

    private fun updateProgressBar() {

        root?.findViewById<ProgressBar>(R.id.progress_bar)?.progress = prog
        root?.findViewById<TextView>(R.id.text_view_progress)?.text = "$prog"

    }

    private fun resetValue(){
        prog = 0
        root?.findViewById<ProgressBar>(R.id.progress_bar)?.progress = prog
        root?.findViewById<TextView>(R.id.text_view_progress)?.text = "$prog"
       }

    private fun updateCounter(){
        root?.findViewById<TextView>(R.id.count)?.text = "Count: $count"
        }

    }
