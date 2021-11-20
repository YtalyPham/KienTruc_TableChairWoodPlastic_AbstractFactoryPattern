package com.example.abstractfactoryparttern;

import com.example.abstractfactoryparttern.chair.Chair;
import com.example.abstractfactoryparttern.factory.FurnitureAbstractFactory;
import com.example.abstractfactoryparttern.factory.FurnitureFactory;
import com.example.abstractfactoryparttern.table.Table;

public class ClientTest {
    public static void main(String[] args) {

        FurnitureAbstractFactory factory = FurnitureFactory.getFactory(MaterialType.FLASTIC);

        Chair chair = factory.createChair();
        chair.create(); // Create plastic chair

        Table table = factory.createTable();
        table.create(); // Create plastic table


        FurnitureAbstractFactory factorywood = FurnitureFactory.getFactory(MaterialType.WOOD);

        Chair chairwood = factorywood.createChair();
        chairwood.create(); // Create wood chair

        Table tablewood = factorywood.createTable();
        tablewood.create(); // Create wood table
    }
}
