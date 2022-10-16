package com.Annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;
@Documented

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = AddressValidator.class)
public @interface Address {
	Class<?>[] groups() default { };
	Class<? extends Payload>[] payload() default { };
	String message() default "Address should be less than 100 characters";
	
}
