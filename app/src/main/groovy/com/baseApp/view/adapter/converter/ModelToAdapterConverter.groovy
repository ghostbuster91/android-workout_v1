package com.baseApp.view.adapter.converter

import com.baseApp.model.AbstractModel
import com.baseApp.model.Doctor
import com.baseApp.model.HealthCareFacility
import com.baseApp.view.adapter.ModelAdapter
import com.baseApp.view.adapter.factory.BaseFactory
import com.baseApp.view.adapter.factory.DoctorViewAdapterFactory
import com.baseApp.view.adapter.factory.HealthCareFacilityAdapterFactory
import groovy.transform.CompileStatic

@CompileStatic
class ModelToAdapterConverter {

    private final Map<Class<? extends AbstractModel>, BaseFactory> adapters = [:]

    ModelToAdapterConverter() {
//        adapters = [(Doctor): new DoctorViewAdapterFactory(),
//                    (HealthCareFacility): new HealthCareFacilityAdapterFactory()]
        adapters
        adapters.put(Doctor, new DoctorViewAdapterFactory())
        adapters.put(HealthCareFacility, new HealthCareFacilityAdapterFactory())
    }

    ModelAdapter getAdapterFor(AbstractModel model) {
        return adapters[model.class].createAdapter(model)
    }
}
