/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ewaste.business.network;

import com.db4o.collections.ActivatableArrayList;
import java.util.ArrayList;

/**
 *
 * @author tanma
 */
public class Region {
    String regionName;
    ArrayList<WaterPollutionSensor> waterPollutionSensors;
    ArrayList<AirPollutionSensor> airPollutionSensors;
 
    public Region(String region) {
        this.regionName = region;
        waterPollutionSensors = new ArrayList<>();
        airPollutionSensors = new ArrayList<>();
    }
    
    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public ArrayList<WaterPollutionSensor> getWaterPollutionSensors() {
        return waterPollutionSensors;
    }

    public void setWaterPollutionSensors(ArrayList<WaterPollutionSensor> waterPollutionSensors) {
        this.waterPollutionSensors = waterPollutionSensors;
    }

    public ArrayList<AirPollutionSensor> getAirPollutionSensors() {
        return airPollutionSensors;
    }

    public void setAirPollutionSensors(ArrayList<AirPollutionSensor> airPollutionSensors) {
        this.airPollutionSensors = airPollutionSensors;
    }
    
}
