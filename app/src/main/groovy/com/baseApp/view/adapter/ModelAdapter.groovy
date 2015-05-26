package com.baseApp.view.adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup

interface ModelAdapter {

    View createViewForObject(ViewGroup parent)

    void onItemClicked(Context context)
}