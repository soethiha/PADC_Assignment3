package com.soethiha.padc_assignment3.data.models;

import com.soethiha.padc_assignment3.data.agents.RestaurantDataAgent;
import com.soethiha.padc_assignment3.data.agents.retrofit.RetrofitDataAgent;

public class BaseModel {

    protected RestaurantDataAgent dataAgent;

    public BaseModel() {
        dataAgent = RetrofitDataAgent.getObjInstance();
    }
}
