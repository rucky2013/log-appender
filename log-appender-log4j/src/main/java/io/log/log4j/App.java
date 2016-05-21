package io.log.log4j;

import org.apache.kafka.log4jappender.KafkaLog4jAppender;
import org.apache.log4j.spi.LoggingEvent;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
//        int i = 1_000;
        KafkaLog4jAppender a;
        LoggingEvent event;
//        event.getFQNOfLoggerClass()
        System.out.println( "Hello World!" );
    }
}
