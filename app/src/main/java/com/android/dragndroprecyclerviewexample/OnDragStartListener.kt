package com.android.dragndroprecyclerviewexample

import androidx.recyclerview.widget.RecyclerView

interface OnDragStartListener {
    /**
     * Called when a view is requesting a start of a drag.
     *
     * @param viewHolder The holder of the view to drag.
     */
    fun onStartDrag(viewHolder: RecyclerView.ViewHolder)
}