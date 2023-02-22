package com.spring.mvcdemo.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD, ElementType.METHOD })
@Constraint(validatedBy = MyConstraintValidator.class)
public @interface MyValidation {

	public String[] value() default {"Nvidia","AMD"};
	
	public String message() default "Must start with Nvidia or AMD";
	
	public Class <?>[] groups() default {};
	
	public Class <? extends Payload>[] payload() default {};
}
