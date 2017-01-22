package com.namyata.data.model;

/**
 * Created by sai on 21-01-2017.
 */
public enum WorkingDay {

    Monday("Monday"),
    Tuesday("Tuesday"),
    Wednesday("Wednesday"),
    Thursday("Thursday"),
    Friday("Friday"),
    Saturday("Saturday");

    private final String workingDays;

    private WorkingDay(final String workingDays) {
        this.workingDays = workingDays;
    }


}
