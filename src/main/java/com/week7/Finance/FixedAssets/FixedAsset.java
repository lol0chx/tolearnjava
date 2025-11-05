package com.week7.Finance.FixedAssets;

import com.week7.Finance.Valuable;

public class FixedAsset implements Valuable {
    String name;
    Double marketValue;
    public double getValue(){
        return marketValue;
    }

    public FixedAsset(String name, Double marketValue) {
        this.name = name;
        this.marketValue = marketValue;
    }
}
