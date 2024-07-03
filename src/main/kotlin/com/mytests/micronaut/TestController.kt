package com.mytests.micronaut

import com.mytests.micronaut.usingEachPropertyBeansAsEachBean.UseBean1AndBean2
import com.mytests.micronaut.usingEachPropertyBeansAsEachBean.UseCustomConfigProps
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get


@Controller
class TestController(
    private val useBean1AndBean2: UseBean1AndBean2,
    private val useCustomConfigProps: UseCustomConfigProps
) {
    @Get("/eachbean")
    fun eachbean(): String {
        return "eachbean test: " + useBean1AndBean2.result
    }

    @Get("/configprops")
    fun cprops(): String {
        return "configprops test: " + useCustomConfigProps.useProps()
    }


}
