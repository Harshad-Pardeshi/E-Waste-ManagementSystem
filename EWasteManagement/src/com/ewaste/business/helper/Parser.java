package com.ewaste.business.helper;

import java.util.Properties;

public class Parser {
	Properties props=new Properties();

	public Properties parseRow(String line) {
		String header="productName,productManufacturer,producDescription,productFeatures,sellingPrice,category,dateOfManufacturer,quantity";

		String[] headerArr = header.split(",");
		String[] lineArr= line.split(",");
		
		for(int i=0;i< headerArr.length ;i++){
			props.put(headerArr[i],lineArr[i]);
		}

		return props;
	}



}
