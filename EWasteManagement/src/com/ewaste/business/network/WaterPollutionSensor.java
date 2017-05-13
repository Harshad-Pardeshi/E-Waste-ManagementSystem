/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ewaste.business.network;

import com.ewaste.business.helper.Constant;
import java.security.SecureRandom;

/**
 *
 * @author Harshad 0509
 */

public class WaterPollutionSensor {
    public int getPollutionLevel(){
        SecureRandom rnd = new SecureRandom();
	return rnd.nextInt(Constant.MAX_AIR_POLLUTION - Constant.MIN_AIR_POLLUTION) + Constant.MIN_AIR_POLLUTION;
    }    
}
