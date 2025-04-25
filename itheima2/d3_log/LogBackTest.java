package com.itheima2.d3_log;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogBackTest {
    public static final Logger LOGGER = LoggerFactory.getLogger("LogBackTest");
    public static void main(String[] args) {
        try {
            LOGGER.info("chu method starts");
            chu(10, 0);
            LOGGER.info("chu method ends");
        } catch (Exception e) {
            LOGGER.error("chu method fails");
        }
    }
    public static void chu(int i, int j) {
        LOGGER.debug("i value: " + i + " j value: " + j);
        int c = i / j;
        LOGGER.info("c value: " + c);
    }
}
