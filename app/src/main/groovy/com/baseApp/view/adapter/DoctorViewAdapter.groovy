package com.baseApp.view.adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.baseApp.R
import com.baseApp.model.Doctor
import com.baseApp.utils.LayoutInflaterWrapper
import com.bumptech.glide.Glide
import groovy.transform.CompileStatic

@CompileStatic
class DoctorViewAdapter implements ModelAdapter{

    private final Doctor doctor

    DoctorViewAdapter(Doctor doctor) {
        this.doctor = doctor
    }

    View createViewForObject(ViewGroup parent) {
        View doctorRow = LayoutInflaterWrapper.inflate(R.layout.doctor_row, parent)

        TextView firstNameTv = doctorRow.findViewById(R.id.doctor_firstName) as TextView
        TextView lastNameTv = doctorRow.findViewById(R.id.doctor_lastName) as TextView
        ImageView avatar = doctorRow.findViewById(R.id.doctor_avatar) as ImageView

        firstNameTv.text = "${parent.context.getString(R.string.first_name)}: ${doctor.firstName}"
        lastNameTv.text = "${parent.context.getString(R.string.last_name)}: ${doctor.lastName}"

        Glide.with(parent.context).load(doctor.avatarUrl).into(avatar)

        return doctorRow
    }

    @Override
    void onItemClicked(Context context) {

    }
}
