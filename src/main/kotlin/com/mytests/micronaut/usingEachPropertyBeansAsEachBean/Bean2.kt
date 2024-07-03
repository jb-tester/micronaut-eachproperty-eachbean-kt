package com.mytests.micronaut.usingEachPropertyBeansAsEachBean

import io.micronaut.context.annotation.EachBean


@EachBean(EachPropertyConfig::class)
class Bean2(propertyConfig: EachPropertyConfig) {
    var p1: String? = propertyConfig.prop1
    var p2: String? = propertyConfig.prop2
}
