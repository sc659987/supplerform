package com.namyata.data.model;

import javafx.util.Pair;

import javax.persistence.*;
import java.util.List;

public class YogaTeacher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String firstName;

    private String lastName;

    private Pair<Double, Double> addressLocation;

    @OneToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;

    private String profilePicUrl;

    @OneToMany(cascade = CascadeType.ALL)
    private List<String> fbLinks;

    @OneToMany(cascade = CascadeType.ALL)
    private List<String> instagramLinks;

    @OneToMany(cascade = CascadeType.ALL)
    private List<String> photosLinks;

    @ElementCollection
    private List<YogaStyle> yogaStyles;

    @OneToMany
    private List<LearningSource> learningSources;

    private double yearsOfProfessionalExperience;

    @OneToMany(cascade = CascadeType.ALL)
    private List<String> knownLanguages;

    @OneToMany(cascade = CascadeType.ALL)
    private List<ServicesOffered> offeredServices;

    private String aboutMe;

    @OneToMany(cascade = CascadeType.ALL)
    private List<String> musicInterests;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Operation> operations;

    @OneToMany(cascade = CascadeType.ALL)
    private List<AccountInfo> accountInfos;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Pair<Double, Double> getAddressLocation() {
        return addressLocation;
    }

    public void setAddressLocation(Pair<Double, Double> addressLocation) {
        this.addressLocation = addressLocation;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getProfilePicUrl() {
        return profilePicUrl;
    }

    public void setProfilePicUrl(String profilePicUrl) {
        this.profilePicUrl = profilePicUrl;
    }

    public List<String> getFbLinks() {
        return fbLinks;
    }

    public void setFbLinks(List<String> fbLinks) {
        this.fbLinks = fbLinks;
    }

    public List<String> getInstagramLinks() {
        return instagramLinks;
    }

    public void setInstagramLinks(List<String> instagramLinks) {
        this.instagramLinks = instagramLinks;
    }

    public List<String> getPhotosLinks() {
        return photosLinks;
    }

    public void setPhotosLinks(List<String> photosLinks) {
        this.photosLinks = photosLinks;
    }

    public List<YogaStyle> getYogaStyles() {
        return yogaStyles;
    }

    public void setYogaStyles(List<YogaStyle> yogaStyles) {
        this.yogaStyles = yogaStyles;
    }

    public List<LearningSource> getLearningSources() {
        return learningSources;
    }

    public void setLearningSources(List<LearningSource> learningSources) {
        this.learningSources = learningSources;
    }

    public double getYearsOfProfessionalExperience() {
        return yearsOfProfessionalExperience;
    }

    public void setYearsOfProfessionalExperience(double yearsOfProfessionalExperience) {
        this.yearsOfProfessionalExperience = yearsOfProfessionalExperience;
    }

    public List<String> getKnownLanguages() {
        return knownLanguages;
    }

    public void setKnownLanguages(List<String> knownLanguages) {
        this.knownLanguages = knownLanguages;
    }

    public List<ServicesOffered> getOfferedServices() {
        return offeredServices;
    }

    public void setOfferedServices(List<ServicesOffered> offeredServices) {
        this.offeredServices = offeredServices;
    }

    public String getAboutMe() {
        return aboutMe;
    }

    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

    public List<String> getMusicInterests() {
        return musicInterests;
    }

    public void setMusicInterests(List<String> musicInterests) {
        this.musicInterests = musicInterests;
    }

    public List<Operation> getOperations() {
        return operations;
    }

    public void setOperations(List<Operation> operations) {
        this.operations = operations;
    }

    public List<AccountInfo> getAccountInfos() {
        return accountInfos;
    }

    public void setAccountInfos(List<AccountInfo> accountInfos) {
        this.accountInfos = accountInfos;
    }
}
