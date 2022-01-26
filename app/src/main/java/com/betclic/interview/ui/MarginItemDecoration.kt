package com.betclic.interview.ui

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class MarginItemDecoration(private val margin: Int) : RecyclerView.ItemDecoration() {

    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        outRect.left = margin;
        outRect.right = margin;
        outRect.bottom = margin;
        if (parent.getChildLayoutPosition(view) == 0) {
            outRect.top = margin;
        } else {
            outRect.top = 0;
        }
    }
}