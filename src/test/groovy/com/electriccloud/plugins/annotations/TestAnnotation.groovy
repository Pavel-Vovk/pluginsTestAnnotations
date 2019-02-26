package com.electriccloud.plugins.annotations

import com.electriccloud.plugins.annotations.*
import spock.lang.Specification

class TestAnnotation extends Specification{
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

    @NewFeature("1.0.0")
    def NewFeatureTests (){
        when:
        def var = 1
        then:
        println("This is New Feature with Plugin Version ")
        assert true
    }

    @NewFeature("1.0.0")
    @Regression
    def NewF_Reg (){
        when:
        def var = 1
        then:
        println("This is New Feature with Plugin Version or regression ")
        assert true
    }
}
