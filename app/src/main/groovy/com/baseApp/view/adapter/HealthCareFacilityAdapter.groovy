package com.baseApp.view.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.baseApp.R
import com.baseApp.model.HealthCareFacility
import groovy.transform.CompileStatic

@CompileStatic
class HealthCareFacilityAdapter implements ModelAdapter{

    private final HealthCareFacility facility

    HealthCareFacilityAdapter(HealthCareFacility facility) {
        this.facility = facility
    }

    View createViewForObject(Context context,ViewGroup parent){
        //CR: use LayoutInflater.from
        LayoutInflater inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

        View facilityRow = inflater.inflate(R.layout.healthcare_row, parent,false)

        TextView nameTv = facilityRow.findViewById(R.id.healthcare_name) as TextView
        TextView addressTv = facilityRow.findViewById(R.id.healthcare_address) as TextView

        nameTv.setText(facility.name)
        addressTv.setText(facility.address)

        return facilityRow
    }
}
