package com.electriccloud.plugins.annotations

import com.electriccloud.plugins.annotations.*
import spock.lang.Specification

class TestAnnotation extends Specification{
    static String version = "1.0.0"

    @Sanity
    def SanityTests (){
        when:
        def var = 1
        then:
        println("This is Sanity")
        assert true
    }

    @Regression
    def RegressionTests (){
        when:
        def var = 1
        then:
        println("This is Regression")
        assert true
    }


    @E2E
    def E2ETests (){
        when:
        def var = 1
        then:
        println("This is E2E")
        assert true
    }

//    @NewFeature("1.0.0")
    @NewFeature(pluginVersion = "1.0.0")
    def NewFeatureTests (){
        when:
        def var = 1
        then:
        println("This is New Feature with Plugin Version or Regression")
        assert true
    }
}
