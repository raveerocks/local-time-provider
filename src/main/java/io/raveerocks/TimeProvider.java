package io.raveerocks;

import java.time.LocalDateTime;

public class TimeProvider {

    public static LocalDateTime getTime(){
        return LocalDateTime.now();
    }
}
