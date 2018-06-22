package com.example.kimyounghoon.designpattern;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator {
    ArrayList<MenuItem> items;
    int position =0;

    public PancakeHouseMenuIterator(ArrayList items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.size() && items.get(position)!= null;
    }

    @Override
    public Object next() {
        MenuItem menuItem = items.get(position);
        position = position+1;
        return menuItem;
    }

}