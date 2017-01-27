package com.namyata.data.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class YogaTeacher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    //--basic information----
    private String firstName;

    private String lastName;

    @OneToOne(optional = false, cascade = CascadeType.ALL)
    private AddressLatLong addressLocation;

    @OneToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;

    private String profilePicUrl;

    private String aboutMe;

    @ElementCollection
    private List<String> knownLanguages;

    @ElementCollection
    private List<String> musicInterests;

    private Double yearsOfProfessionalExperience;

    //----Yoga style-----
    @ElementCollection
    private List<YogaStyle> yogaStyles;


    //--------Operation----
    @OneToMany(cascade = CascadeType.ALL)
    private List<Operation> operations;


    // --- LearningSource----
    @OneToMany
    private List<LearningSource> learningSources;


    //------- not required now
    @ElementCollection
    private List<ServicesOffered> offeredServices;


    //----- AccountInfo----
    @OneToMany(cascade = CascadeType.ALL)
    private List<AccountInfo> accountInfos;

    //--------- fb image link
    @ElementCollection
    private List<String> fbLinks;

    //--- instagram image link
    @ElementCollection
    private List<String> instagramLinks;

    //--- upload image
    @ElementCollection
    private List<String> photosLinks;


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

    public AddressLatLong getAddressLocation() {
        return addressLocation;
    }

    public void setAddressLocation(AddressLatLong addressLocation) {
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
