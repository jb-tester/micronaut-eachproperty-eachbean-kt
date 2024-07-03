package com.mytests.micronaut.usingEachPropertyBeansAsEachBean

import jakarta.inject.Singleton

@Singleton
class UseCustomConfigProps(private val myConfigProps: MyConfigProps) {
    fun useProps(): String {
        val rez = myConfigProps.str1 + " " + myConfigProps.str2 + " " + (myConfigProps.strList?.get(0) ?:"not provided" );
        return "useProps: $rez"
    }
}
