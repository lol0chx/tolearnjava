package com.week7.Finance.FixedAssets;

public class Jewelry extends FixedAsset{
    Double karat;

    public Jewelry(String name, Double marketValue, Double karat) {
        super(name, marketValue);
        this.karat = karat;
    }
    @Override
    public double getValue(){
        return karat*marketValue;
    }
}
