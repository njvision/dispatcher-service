package com.mdbookshop.dispatcherservice;

public record OrderAcceptedMessage(
        Long orderId
) { }
