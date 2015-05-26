package com.baseApp.view.adapter

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.baseApp.R
import com.baseApp.model.HealthCareFacility
import com.baseApp.utils.LayoutInflaterWrapper
import groovy.transform.CompileStatic

@CompileStatic
class HealthCareFacilityAdapter implements ModelAdapter{

    private final HealthCareFacility facility

    HealthCareFacilityAdapter(HealthCareFacility facility) {
        this.facility = facility
    }

    View createViewForObject(ViewGroup parent) {
        View facilityRow = LayoutInflaterWrapper.inflate(R.layout.healthcare_row, parent)

        TextView nameTv = facilityRow.findViewById(R.id.healthcare_name) as TextView
        TextView addressTv = facilityRow.findViewById(R.id.healthcare_address) as TextView

        nameTv.text = facility.name
        addressTv.text = facility.address

        return facilityRow
    }

    @Override
    void onItemClicked(Context context) {
        String uri = "geo:0,0?q=${facility.lat},${facility.lng}(TO+TU)"
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri))

        context.startActivity(intent)
    }
}
