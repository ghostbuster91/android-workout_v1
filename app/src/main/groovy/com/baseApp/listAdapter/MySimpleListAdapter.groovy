package com.baseApp.listAdapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.baseApp.R
import com.baseApp.model.Doctor
import com.baseApp.model.HealthCareFacility
import groovy.transform.CompileDynamic
import groovy.transform.CompileStatic

@CompileStatic
class MySimpleListAdapter extends BaseAdapter{

    List<Object> data = new ArrayList<>()


    Context context

    MySimpleListAdapter(Context context) {
        this.context = context
    }

    @Override
    int getCount() {
        return data.size()
    }

    @Override
    Object getItem(int position) {
        return data.get(position)
    }

    @Override
    long getItemId(int position) {
        return 0
    }

    @Override
    View getView(int position, View convertView, ViewGroup parent) {

        Object object = data.get(position)
        if( object instanceof Doctor){
            return createViewForObject((Doctor)object,parent)
        }
        else{
            return null
        }
    }
    View createViewForObject(Doctor doctor,ViewGroup parent){
        LayoutInflater inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

        View doctor_row = inflater.inflate(R.layout.doctor_row, parent,false)
        TextView firstNameTv = doctor_row.findViewById(R.id.doctor_firstName) as TextView
        TextView lastNameTv = doctor_row.findViewById(R.id.doctor_lastName) as TextView
        firstNameTv.setText(doctor.firstName)
        lastNameTv.setText(doctor.lastName)

        return doctor_row
    }

    @Override
    boolean isEnabled(int position) {
        return data.get(position)
    }

    View createViewForObject(HealthCareFacility doctor,ViewGroup parent){
        LayoutInflater inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

        View facility_row = inflater.inflate(R.layout.healthcare_row, parent,false)

        return facility_row
    }



    void addAll(List<Object> data){
        this.data.addAll(data)
    }


}
