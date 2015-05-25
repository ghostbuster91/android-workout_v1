package com.baseApp

import android.app.Activity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.ListView
import com.baseApp.listAdapter.MySimpleListAdapter
import com.baseApp.model.Doctor
import com.baseApp.model.HealthCareFacility
import groovy.transform.CompileStatic

@CompileStatic
final class MainActivity extends Activity {

    final static List<Object> list_data = createData()

    private static List<Object> createData() {
        [new Doctor(firstName: 'Kasper',lastName: 'Kondzielski',id: 123,avatarUrl: 'http://i2.pinger.pl/pgr214/99df58d50000ecb050f1ff76/slodki-kotek-5.jpeg')
        ,new Doctor(firstName: 'Kasper',lastName: 'Kondzielski',id: 123,avatarUrl: 'http://i2.pinger.pl/pgr214/99df58d50000ecb050f1ff76/slodki-kotek-5.jpeg')
        ,new Doctor(firstName: 'Kasper',lastName: 'Kondzielski',id: 123,avatarUrl: 'http://i2.pinger.pl/pgr214/99df58d50000ecb050f1ff76/slodki-kotek-5.jpeg')
        ,new Doctor(firstName: 'Kasper',lastName: 'Kondzielski',id: 123,avatarUrl: 'http://i2.pinger.pl/pgr214/99df58d50000ecb050f1ff76/slodki-kotek-5.jpeg')
        ,new HealthCareFacility(id: 123,name: 'nazwa placowki',address:'ul Konduktorska 18')
        ]
    }


    @Override
    void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        ListView view = findViewById(R.id.mainListView) as ListView
        def adapter = new MySimpleListAdapter(this)
        adapter.addAll(list_data)
        view.setAdapter(adapter)

    }

    @Override
    protected void onResume() {
        super.onResume()



    }
}

