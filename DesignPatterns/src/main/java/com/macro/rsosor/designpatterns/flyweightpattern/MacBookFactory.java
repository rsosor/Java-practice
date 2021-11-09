package com.macro.rsosor.designpatterns.flyweightpattern;

import com.macro.rsosor.designpatterns.flyweightpattern.sub.MacBook;

import java.util.HashMap;

public class MacBookFactory {

    private HashMap<CustomSetting, MacBook> cache = new HashMap<>();

    public MacBook getCustomMacBook(CustomSetting key) {
        if (cache.containsKey(key)) {
            return cache.get(key);
        }

        MacBook macBook = new MacBook(key);

        cache.put(key, macBook);

        return macBook;
    }

    public MacBook getMacBook(MacBook.Spec spec) {
        if (cache.containsKey(spec.getCustomSetting())) {
            return cache.get(spec.getCustomSetting());
        }

        MacBook macBook = new MacBook(spec);

        cache.put(spec.getCustomSetting(), macBook);

        return macBook;
    }
}
