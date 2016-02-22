package com.myproject;

import ro.fortsoft.pf4j.DefaultPluginManager;
import ro.fortsoft.pf4j.PluginManager;

import java.util.List;

/**
 * @author Decebal Suiu
 */
public class Test {

    public static void main(String[] args) {
        PluginManager pluginManager = new DefaultPluginManager();
        pluginManager.loadPlugins();
        pluginManager.startPlugins();

        List<Animal> animals = pluginManager.getExtensions(Animal.class);
        System.out.println("animals.size() = " + animals.size());
        for (Animal animal : animals) {
            System.out.println("animal.getName() = " + animal.getName());
        }
    }

}
