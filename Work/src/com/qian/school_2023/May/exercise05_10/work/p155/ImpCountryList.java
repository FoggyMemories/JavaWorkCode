package com.qian.school_2023.May.exercise05_10.work.p155;

public class ImpCountryList implements CountryList<String> {
    private String[] guo = new String[]{"中国", "日本", "新加坡"};

    @Override
    public String next(int k) {
        return guo[k];
    }
}
