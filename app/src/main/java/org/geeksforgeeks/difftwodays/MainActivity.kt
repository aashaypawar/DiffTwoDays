package org.geeksforgeeks.difftwodays

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.text.SimpleDateFormat

class MainActivity : AppCompatActivity() {
    @SuppressLint("SimpleDateFormat", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mTextView = findViewById<TextView>(R.id.text_view_1)

        val mDate1 = "01/01/2022"
        val mDate2 = "01/08/2022"

        val mDateFormat = SimpleDateFormat("MM/dd/yyyy")

        val mDate11 = mDateFormat.parse(mDate1)
        val mDate22 = mDateFormat.parse(mDate2)

        val mDifference = kotlin.math.abs(mDate11.time - mDate22.time)
        val mDifferenceDates = mDifference / (24 * 60 * 60 * 1000)
        val mDayDifference = mDifferenceDates.toString()

        mTextView.text = "The difference between two dates is $mDayDifference days"
    }
}