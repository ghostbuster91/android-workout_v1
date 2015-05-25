package com.baseApp.view.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.baseApp.R
import com.baseApp.model.AbstractModel
import com.baseApp.model.Doctor
import com.baseApp.model.HealthCareFacility
import groovy.transform.CompileStatic

@CompileStatic
class HealthObjectsListAdapter extends BaseAdapter{

    private List<ModelAdapter> data = new ArrayList<>()
    private Context context

    HealthObjectsListAdapter(Context context) {
        this.context = context
    }

    @Override
    int getCount() {
        return data.size()
    }

    @Override
    Object getItem(int position) {
        return data.get(position)
    }

    @Override
    long getItemId(int position) {
        return 0
    }

    @Override
    View getView(int position, View convertView, ViewGroup parent) {
        return data.get(position).createViewForObject(context,parent)
    }

    @Override
    boolean isEnabled(int position) {
        return data.get(position)
    }


    void addAll(List<ModelAdapter> data){
        this.data.addAll(data)
        this.notifyDataSetChanged()
    }

    void add(ModelAdapter model){
        this.data.add(model)
        this.notifyDataSetChanged()
    }


}
