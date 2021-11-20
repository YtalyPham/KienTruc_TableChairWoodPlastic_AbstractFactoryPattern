package com.example.abstractfactoryparttern.factory;

import com.example.abstractfactoryparttern.chair.Chair;
import com.example.abstractfactoryparttern.table.Table;

public abstract class FurnitureAbstractFactory {
    public abstract Chair createChair();

    public abstract Table createTable();
}
