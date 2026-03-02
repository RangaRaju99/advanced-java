package com.lpu.java;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter
public class BooleanConverter implements AttributeConverter<Boolean,String>{

	@Override
	public String convertToDatabaseColumn(Boolean attribute) {
		if(attribute==null) return null;
		return (attribute==true)?"Y":"N";
	}

	@Override
	public Boolean convertToEntityAttribute(String dbData) {
		if(dbData==null) return null;
		return dbData.equals("Y");
	}
	
	 

}
