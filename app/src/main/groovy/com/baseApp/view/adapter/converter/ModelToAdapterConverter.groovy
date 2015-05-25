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

    INSTANCE //CR: Singleton is not best pattern in the world

    private Map<Class<? extends AbstractModel>, Class<? extends ModelAdapter>> adapters

    private ModelToAdapterConverter() {
        //CR: It is groovy. use Map declaration
        adapters = new HashMap<>()
        adapters.put(Doctor, DoctorViewAdapter)
        adapters.put(HealthCareFacility, HealthCareFacilityAdapter)
    }

    ModelAdapter getAdapterFor(AbstractModel model) {
        //CR: newInstance? ryly
        return adapters[model.class].newInstance(model)

    }
}
