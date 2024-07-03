package com.mytests.micronaut.usingEachPropertyBeansAsEachBean

import io.micronaut.context.annotation.EachProperty
import io.micronaut.context.annotation.Parameter
import io.micronaut.serde.annotation.Serdeable


@Serdeable
@EachProperty(value = "my-tests.each-bean")
class EachPropertyConfig(@param:Parameter val name: String)
{
    var prop1: String? = null
    var prop2: String? = null
}
