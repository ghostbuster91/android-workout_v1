package com.baseApp.utils

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import groovy.transform.CompileStatic

@CompileStatic
class LayoutInflaterWrapper {

    static View inflate(Integer layoutId, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(parent.context)

        View doctorRow = inflater.inflate(layoutId, parent, false)
        return doctorRow
    }
}
