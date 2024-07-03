package com.mytests.micronaut.usingEachPropertyBeansAsEachBean

import io.micronaut.context.annotation.EachBean
import io.micronaut.context.annotation.Factory


@Factory
class EachBeanFactory {
    @EachBean(EachPropertyConfig::class)
    fun bean1(propertyConfig: EachPropertyConfig): Bean1 {
        val p1 = propertyConfig.prop1
        val p2 = propertyConfig.prop2
        return Bean1(p1, p2)
    }
}
