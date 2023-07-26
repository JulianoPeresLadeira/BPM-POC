package com.waes.process

data class BusinessProcessInstance(val instanceId: String, val processId: String, val attributes: List<BusinessProcessAttribute>)
