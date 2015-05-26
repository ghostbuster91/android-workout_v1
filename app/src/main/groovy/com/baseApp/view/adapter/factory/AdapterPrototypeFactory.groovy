package com.baseApp.view.adapter.factory

import com.baseApp.model.AbstractModel
import com.baseApp.model.Doctor
import com.baseApp.model.HealthCareFacility
import com.baseApp.view.adapter.ModelAdapter
import groovy.transform.CompileStatic

@CompileStatic
class AdapterPrototypeFactory {

    private final Map<Class<? extends AbstractModel>, BaseFactory> adapters = [:]

    AdapterPrototypeFactory() {
//        adapters = [(Doctor): new DoctorViewAdapterFactory(),
//                    (HealthCareFacility): new HealthCareFacilityAdapterFactory()]
        adapters.put(Doctor, new DoctorViewAdapterFactory())
        adapters.put(HealthCareFacility, new HealthCareFacilityAdapterFactory())
    }

    ModelAdapter getAdapterFor(AbstractModel model) {
        return adapters[model.class].createAdapter(model)
    }
}
