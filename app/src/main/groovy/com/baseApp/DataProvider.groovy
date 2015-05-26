package com.baseApp

import com.baseApp.model.AbstractModel
import com.baseApp.model.Doctor
import com.baseApp.model.HealthCareFacility
import groovy.transform.CompileStatic

@CompileStatic
class DataProvider {

    static List<AbstractModel> createData() {
        [new Doctor(firstName: 'Jan', lastName: 'Nowak', id: 123, avatarUrl: 'http://i2.pinger.pl/pgr214/99df58d50000ecb050f1ff76/slodki-kotek-5.jpeg'),
         new Doctor(firstName: 'Duszek', lastName: 'Casper', id: 124, avatarUrl: 'http://i2.pinger.pl/pgr214/99df58d50000ecb050f1ff76/slodki-kotek-5.jpeg'),
         new HealthCareFacility(id: 125, name: 'Placowka medyczna nr1', address: 'ul Konduktorska 19', lat: '52.2007003', lng: '21.0294396')]
    }
}
