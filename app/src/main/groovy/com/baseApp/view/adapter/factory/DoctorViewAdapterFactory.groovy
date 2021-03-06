package com.baseApp.view.adapter.factory

import com.baseApp.model.Doctor
import com.baseApp.view.adapter.DoctorViewAdapter
import groovy.transform.CompileStatic

@CompileStatic
class DoctorViewAdapterFactory implements BaseFactory<Doctor, DoctorViewAdapter> {

    @Override
    DoctorViewAdapter createAdapter(Doctor model) {
        return new DoctorViewAdapter(model)
    }
}
