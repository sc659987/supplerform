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
public class Operation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private WorkingHours workingHours;

    private double pricePerSlot;

    private ServicesOffered offeredServices;

    private Address address;

    private List<String> localitiesCovered;


    public WorkingHours getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(WorkingHours workingHours) {
        this.workingHours = workingHours;
    }

    public double getPricePerSlot() {
        return pricePerSlot;
    }

    public void setPricePerSlot(double pricePerSlot) {
        this.pricePerSlot = pricePerSlot;
    }

    public ServicesOffered getOfferedServices() {
        return offeredServices;
    }

    public void setOfferedServices(ServicesOffered offeredServices) {
        this.offeredServices = offeredServices;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<String> getLocalitiesCovered() {
        return localitiesCovered;
    }

    public void setLocalitiesCovered(List<String> localitiesCovered) {
        this.localitiesCovered = localitiesCovered;
    }
}
