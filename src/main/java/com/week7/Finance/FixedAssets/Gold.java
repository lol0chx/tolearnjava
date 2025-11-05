package com.week7.Finance.FixedAssets;

public class Gold extends FixedAsset{
    double weight;

    public Gold(String name, Double marketValue, double weight) {
        super(name, marketValue);
        this.weight = weight;
    }
    @Override
    public double getValue(){
        return weight * marketValue;
    }
}
