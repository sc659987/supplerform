package com.namyata.data.model;

import javax.persistence.*;
import java.util.List;


@Entity
public class Operation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(optional = false, cascade = CascadeType.ALL)
    private WorkingHour workingHour;

    private Double pricePerSlot;

    @Enumerated
    private ServicesOffered offeredServices;

    @OneToOne(optional = false, cascade = CascadeType.ALL)
    private Address address;

    @ElementCollection
    private List<String> localitiesCovered;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public WorkingHour getWorkingHour() {
        return workingHour;
    }

    public void setWorkingHour(WorkingHour workingHour) {
        this.workingHour = workingHour;
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
