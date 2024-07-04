package com.mytests.micronaut.usingEachPropertyBeansAsEachBean

import jakarta.inject.Inject
import jakarta.inject.Named
import jakarta.inject.Singleton


@Singleton
class UseBean1AndBean2 {
    @Inject
    @Named("third")
    private lateinit var bean12: Bean1

    @Inject
    @Named("forth")
    private lateinit var bean22: Bean2

    @Inject
    @Named("first")
    var bean11: Bean1? = null

    @Inject
    @Named("second")
    var bean21: Bean2? = null

    val result: String
        get() = bean11?.p1 + " " + bean11?.p2 + " " + bean21?.p1 + " " + bean21?.p2 + " " + bean22.p1 + " " + bean22.p2 + " " + bean12.p1 + " " + bean12.p2



}
