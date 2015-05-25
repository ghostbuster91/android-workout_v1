package com.baseApp.view.adapter.factory

import com.baseApp.model.HealthCareFacility
import com.baseApp.view.adapter.HealthCareFacilityAdapter
import groovy.transform.CompileStatic

@CompileStatic
class HealthCareFacilityAdapterFactory implements BaseFactory<HealthCareFacilityAdapter, HealthCareFacility> {

    HealthCareFacilityAdapter createAdapter(HealthCareFacility model) {
        return new HealthCareFacilityAdapter(model)
    }
}
