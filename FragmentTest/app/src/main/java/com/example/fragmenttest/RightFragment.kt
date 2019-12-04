package com.example.fragmenttest

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class RightFragment(): Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("111","onCreatedView")
        return inflater.inflate(R.layout.right_fragment, container, false)
    }

    override fun onAttach(context: Context?) {
        Log.d("111","onAttach")
        super.onAttach(context)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Log.d("111","onActivityCreated")
        super.onActivityCreated(savedInstanceState)
    }

    override fun onDestroyView() {
        Log.d("111","onDestroyView")
        super.onDestroyView()
    }

    override fun onDetach() {
        Log.d("111","onDetach")
        super.onDetach()
    }
}