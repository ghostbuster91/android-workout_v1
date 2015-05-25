package com.baseApp.view.adapter.converter

import com.baseApp.model.AbstractModel
import com.baseApp.model.Doctor
import com.baseApp.model.HealthCareFacility
import com.baseApp.view.adapter.DoctorViewAdapter
import com.baseApp.view.adapter.HealthCareFacilityAdapter
import com.baseApp.view.adapter.ModelAdapter
import groovy.transform.CompileStatic

@CompileStatic
enum ModelToAdapterConverter {

    INSTANCE

    private Map<Class<? extends AbstractModel>,Class<? extends ModelAdapter>> adapters

    private ModelToAdapterConverter() {
        adapters = new HashMap<>()
        adapters.put(Doctor ,DoctorViewAdapter)
        adapters.put(HealthCareFacility ,HealthCareFacilityAdapter)
    }

    ModelAdapter getAdapterFor(AbstractModel model){
        return adapters[model.class].newInstance(model)

    }
}
