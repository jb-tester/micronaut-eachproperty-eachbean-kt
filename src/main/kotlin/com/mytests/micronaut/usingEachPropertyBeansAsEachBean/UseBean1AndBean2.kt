package com.mytests.micronaut.usingEachPropertyBeansAsEachBean

import jakarta.inject.Inject
import jakarta.inject.Named
import jakarta.inject.Singleton


@Singleton
class UseBean1AndBean2 {
    @Inject
    @Named("first")
    var bean1: Bean1? = null

    @Inject
    @Named("second")
    var bean2: Bean2? = null

    val result: String
        get() = bean1?.p1 + " " + bean1?.p2 + " " + bean2?.p1 + " " + bean2?.p2
}
