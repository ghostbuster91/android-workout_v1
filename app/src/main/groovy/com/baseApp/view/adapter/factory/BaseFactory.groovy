package com.baseApp.view.adapter.factory

interface BaseFactory<T, V> {

    T createAdapter(V model)
}