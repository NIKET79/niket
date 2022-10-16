package com.Annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MobileNumberValidator implements ConstraintValidator<MobileNumber, String>{

	public boolean isValid(String value, ConstraintValidatorContext context) {
		String str=value.replaceAll("\\s","");
		if(str.length()!=10 || (!str.startsWith("9") && !str.startsWith("8") && !str.startsWith("7") && !str.startsWith("6"))) {
		return false;
		}
		return true ;
	}

	
	
}
