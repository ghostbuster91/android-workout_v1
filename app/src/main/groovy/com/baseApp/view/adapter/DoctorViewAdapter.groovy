package com.baseApp.view.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.baseApp.R
import com.baseApp.model.Doctor
import com.bumptech.glide.Glide
import groovy.transform.CompileStatic

@CompileStatic
class DoctorViewAdapter implements ModelAdapter{

    private final Doctor doctor

    DoctorViewAdapter(Doctor doctor) {
        this.doctor = doctor
    }

    View createViewForObject(Context context, ViewGroup parent) {
        LayoutInflater inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

        View doctorRow = inflater.inflate(R.layout.doctor_row, parent, false)

        TextView firstNameTv = doctorRow.findViewById(R.id.doctor_firstName) as TextView
        TextView lastNameTv = doctorRow.findViewById(R.id.doctor_lastName) as TextView
        ImageView avatar = doctorRow.findViewById(R.id.doctor_avatar) as ImageView


        firstNameTv.setText(doctor.firstName)
        lastNameTv.setText(doctor.lastName)

        Glide.with(context).load(doctor.avatarUrl)
                .centerCrop().fitCenter().into(avatar)

        return doctorRow
    }

}
