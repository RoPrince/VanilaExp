package com.bootstrap.experiments.vanila.Aspect;

import org.aspectj.lang.annotation.Pointcut;

public class AspectConfigs {

    @Pointcut("execution(* com.bootstrap.experiments.vanila..*.*(..))")
    public void allLayers(){}

    @Pointcut("execution(* com.bootstrap.experiments.vanila.business.*.*(..))")
    public void businessLayers(){}

}
