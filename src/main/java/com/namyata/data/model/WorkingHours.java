package com.namyata.data.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

/**
 * Created by sai on 21-01-2017.
 */
@Entity
public class WorkingHours {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private long from;

    private long to;


    private List<WorkingDay> workingDays;


    public long getFrom() {
        return from;
    }

    public void setFrom(long from) {
        this.from = from;
    }

    public long getTo() {
        return to;
    }

    public void setTo(long to) {
        this.to = to;
    }

    public List<WorkingDay> getWorkingDays() {
        return workingDays;
    }

    public void setWorkingDays(List<WorkingDay> workingDays) {
        this.workingDays = workingDays;
    }
}
