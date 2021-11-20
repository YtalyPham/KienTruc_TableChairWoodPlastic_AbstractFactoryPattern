package com.example.abstractfactoryparttern.table;

public class WoodTable implements Table {
    @Override
    public void create() {
        System.out.println("Create wood table");
    }
}