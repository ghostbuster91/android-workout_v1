package com.baseApp.view.adapter.factory

interface BaseFactory<T, V> {

    V createAdapter(T model)
}