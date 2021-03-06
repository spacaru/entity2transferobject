package com.norberth.core.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Novanc Norberth
 * @version 1.0.0
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MapAttribute {

    /**
     * Source field (mandatory)
     *
     * @return
     */
    String value();

}
