package com.example.abstractfactoryparttern.factory.impl;

import com.example.abstractfactoryparttern.chair.Chair;
import com.example.abstractfactoryparttern.chair.WoodChair;
import com.example.abstractfactoryparttern.factory.FurnitureAbstractFactory;
import com.example.abstractfactoryparttern.table.Table;
import com.example.abstractfactoryparttern.table.WoodTable;

public class WoodFactory extends FurnitureAbstractFactory {

    @Override
    public Chair createChair() {
        return new WoodChair();
    }

    @Override
    public Table createTable() {
        return new WoodTable();
    }
}
