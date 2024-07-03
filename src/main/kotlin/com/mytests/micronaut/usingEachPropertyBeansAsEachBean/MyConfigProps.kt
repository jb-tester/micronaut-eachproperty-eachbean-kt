package com.mytests.micronaut.usingEachPropertyBeansAsEachBean;

import io.micronaut.context.annotation.ConfigurationProperties;

@ConfigurationProperties("custom.config-props")
class MyConfigProps  {
    var str1: String? = null
    var str2: String? = null
    var strList: List<String>? = null
}