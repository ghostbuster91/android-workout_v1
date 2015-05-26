package com.baseApp

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import com.baseApp.model.AbstractModel
import com.baseApp.view.adapter.HealthObjectsListAdapter
import com.baseApp.view.adapter.ModelAdapter
import com.baseApp.view.adapter.factory.AdapterPrototypeFactory
import groovy.transform.CompileStatic

@CompileStatic
final class MainActivity extends Activity {

    final static List<AbstractModel> list_data = DataProvider.createData()

    @Override
    void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        ListView view = findViewById(R.id.mainListView) as ListView
        HealthObjectsListAdapter adapter = new HealthObjectsListAdapter(this)
        view.adapter = adapter
        view.onItemClickListener = this.&showDetailsActivity


        AdapterPrototypeFactory factory = new AdapterPrototypeFactory()

        adapter.addAll(list_data.collect{
            factory.getAdapterFor(it)
        })
    }

    @Override
    protected void onResume() {
        super.onResume()
    }

    void showDetailsActivity(AdapterView<?> adapter, View v, int position, Long dunno) {
        ModelAdapter item = adapter.getItemAtPosition(position) as ModelAdapter

        item.onItemClicked(this)
    }


}

