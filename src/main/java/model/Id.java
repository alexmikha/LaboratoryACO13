package main.java.model;

import java.util.Date;

/**
 * Created by mikhailov on 17.07.16.
 */
public class Id {
//    todo good method
    public static long generateId() {
        return new Date().getTime();
    }
}
