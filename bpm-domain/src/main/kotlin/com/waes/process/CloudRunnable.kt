package com.waes.process

interface CloudRunnable {
    fun run(attributes: List<BusinessProcessAttribute>): List<BusinessProcessAttribute>
}