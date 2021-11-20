package com.example.abstractfactoryparttern.factory.impl;

import com.example.abstractfactoryparttern.chair.Chair;
import com.example.abstractfactoryparttern.chair.PlasticChair;
import com.example.abstractfactoryparttern.factory.FurnitureAbstractFactory;
import com.example.abstractfactoryparttern.table.PlasticTable;
import com.example.abstractfactoryparttern.table.Table;

public class FlasticFactory extends FurnitureAbstractFactory {

    @Override
    public Chair createChair() {
        return new PlasticChair();
    }

    @Override
    public Table createTable() {
        return new PlasticTable();
    }

}
