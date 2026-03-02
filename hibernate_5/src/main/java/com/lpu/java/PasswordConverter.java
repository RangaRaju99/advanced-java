package com.lpu.java;

import java.lang.reflect.Member;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;


@Converter
public class PasswordConverter implements AttributeConverter<String,String>{

	@Override
	public String convertToDatabaseColumn(String attribute) {
		if(attribute==null) return null;
		return "["+attribute+"]";
	}

	@Override
	public String convertToEntityAttribute(String dbData) {
		if(dbData==null) return null;
		return dbData.replace("[", "").replace("]", "");
	}

	

}
