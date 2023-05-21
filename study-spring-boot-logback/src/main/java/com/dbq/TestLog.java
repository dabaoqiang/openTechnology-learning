package com.dbq;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;

/**
 * Created by @author dabaoqiang on 2023/5/21.
 */
@Slf4j
public class TestLog {

//    static Logger logger = LoggerFactory.getLogger(TestLog.class);

    public static void main(String[] args) {
        LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
        StatusPrinter.print(lc);
        System.out.println("sb");
        log.debug("logback");
    }

}
