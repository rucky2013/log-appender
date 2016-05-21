package io.log.logback;

import ch.qos.logback.classic.encoder.PatternLayoutEncoder;
import ch.qos.logback.classic.spi.ILoggingEvent;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        PatternLayoutEncoder encoder;
        ILoggingEvent event;
        System.out.println( "Hello World!" );
    }
}
