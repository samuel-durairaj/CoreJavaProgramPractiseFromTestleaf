package com.lang;

import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface FWAnnotation {

	/* Annotations are meta-data, additional information given for methods
	 * Attributes of the annotation, but declared like methods
	 */
	int id();
	String desc();
}
