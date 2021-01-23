package com.example.aggim.intro

import android.graphics.Typeface
import android.view.Gravity
import android.view.View
import com.example.aggim.R
import org.jetbrains.anko.*

/*
    Created by Seohyun Kim at 2021/01/20
 */

class IntroActivityUI : AnkoComponent<IntroActivity> {
    override fun createView(ui: AnkoContext<IntroActivity>): View {
        return ui.relativeLayout({
            gravity = Gravity.CENTER

            textView("AGGIM") {
                textSize = 24f
                textColorResource = R.color.colorPrimary
                typeface = Typeface.DEFAULT_BOLD
            }
        }
        )
    }
}