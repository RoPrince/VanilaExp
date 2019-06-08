package com.bootstrap.experiments.vanila.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AspectBuilder {

    private Logger logger = LoggerFactory.getLogger(AspectBuilder.class);


    //execution(* PACKAGE.*.*(..))

    @Before("com.bootstrap.experiments.vanila.Aspect.AspectConfigs.allLayers()")
    public void before(JoinPoint joinPoint){
        logger.info("Checking joinpoint '{}'",joinPoint);

    }
}

