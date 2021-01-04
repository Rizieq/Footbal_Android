package com.rizieq.footbal_android.ui.schedule

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.rizieq.footbal_android.R

import kotlinx.android.synthetic.main.fragment_schedule.view.*

class ScheduleFragment : Fragment() {



    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_schedule, container, false)

        root.text_notifications.setText("Schedule")
        return root
    }
}