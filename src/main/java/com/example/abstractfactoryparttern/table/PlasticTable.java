package com.example.abstractfactoryparttern.table;

public class PlasticTable implements Table {
    @Override
    public void create() {
        System.out.println("Create plastic table");
    }
}