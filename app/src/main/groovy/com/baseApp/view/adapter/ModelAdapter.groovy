package com.baseApp.view.adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup

interface ModelAdapter {

    View createViewForObject(Context context, ViewGroup parent)
}