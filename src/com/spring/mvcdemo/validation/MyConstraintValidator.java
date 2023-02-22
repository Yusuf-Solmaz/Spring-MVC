package com.spring.mvcdemo.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class MyConstraintValidator implements ConstraintValidator<MyValidation, String>{

	private String[] myPrefix;
	
	@Override
	public void initialize(MyValidation myValidation) {
		myPrefix = myValidation.value();
	}

	@Override
    public boolean isValid(String input, ConstraintValidatorContext theConstraintValidatorContext) {
        boolean result = false;
        
        if (input != null) {
            
            for (String tempPrefix : myPrefix) {
                result = input.startsWith(tempPrefix);
         
                if (result) {
                    break;
                }
            }
        }
        else {
            result = true;
        }
        
        return result;
  }

}
