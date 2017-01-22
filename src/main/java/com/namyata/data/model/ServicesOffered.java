package com.namyata.data.model;

/**
 * Created by sai on 21-01-2017.
 */
public enum ServicesOffered {

    YOGA_AT_HOME("Yoga at home"),
    CORPORATE_SESSIONS("Corporate sessions"),
    STUDIO_CLASSES("Studio classes"),
    SCHOOL_CLASSES("School classes"),
    HOSPITAL_CLASSES("Hospital classes"),
    GYM_CLASSES("Gym classes");

    private final String type;

    private ServicesOffered(final String type) {
        this.type = type;
    }


}
