package com.baseApp

import android.app.Activity
import android.os.Bundle
import android.widget.ListView
import com.baseApp.model.AbstractModel
import com.baseApp.view.adapter.HealthObjectsListAdapter
import com.baseApp.model.Doctor
import com.baseApp.model.HealthCareFacility
import com.baseApp.view.adapter.converter.ModelToAdapterConverter
import groovy.transform.CompileStatic

@CompileStatic
final class MainActivity extends Activity {

    final static List<AbstractModel> list_data = createData()

    private static List<AbstractModel> createData() {
        [new Doctor(firstName: 'Jan',lastName: 'Nowak',id: 123,avatarUrl: 'http://i2.pinger.pl/pgr214/99df58d50000ecb050f1ff76/slodki-kotek-5.jpeg'),
        new Doctor(firstName: 'Duszek',lastName: 'Casper',id: 124,avatarUrl: 'http://i2.pinger.pl/pgr214/99df58d50000ecb050f1ff76/slodki-kotek-5.jpeg'),
        new HealthCareFacility(id: 125,name: 'Placowka medyczna nr1',address:'ul Konduktorska 19')]
    }


    @Override
    void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        ListView view = findViewById(R.id.mainListView) as ListView
        HealthObjectsListAdapter adapter = new HealthObjectsListAdapter(this)
        view.setAdapter(adapter)

        ModelToAdapterConverter converter = ModelToAdapterConverter.INSTANCE

        adapter.addAll(list_data.collect{
            converter.getAdapterFor(it)
        })
    }

    @Override
    protected void onResume() {
        super.onResume()
    }


}

