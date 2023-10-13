/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.persistence.Column;
/**
 *
 * @author hp
 */
public class PropertyListing {
    @Column(name = "City")
    private String city;
    @Column(name = "Location")
      
    private String location;
    @Column(name = "Price")
    private double price;
    
    @Column(name = "Bedrooms")
    private int bedrooms;
    
    @Column(name = "Bathrooms")
    private int bathrooms;
    
    @Column(name = "PropertyType")
    private String propertyType;
    
    @Column(name = "ExtraFacilities")
    
    private String extraFacilities;
    
    @Column(name = "TransportModes")

    private String transportModes;
    
   @Column(name = "Furniture")

    private String furniture;
   
   @Column(name = "ImagePath")

    private String imagePath;
   
   @Column(name = "PaymentMode")

    private String paymentMode;
   
    @Column(name = "ContactDetails")

    private String contactDetails;

    // Constructor (you can create a constructor with or without parameters)

    // Getter and Setter methods for each property

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public String getExtraFacilities() {
        return extraFacilities;
    }

    public void setExtraFacilities(String extraFacilities) {
        this.extraFacilities = extraFacilities;
    }

    public String getTransportModes() {
        return transportModes;
    }

    public void setTransportModes(String transportModes) {
        this.transportModes = transportModes;
    }

    public String getFurniture() {
        return furniture;
    }

    public void setFurniture(String furniture) {
        this.furniture = furniture;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public String getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(String contactDetails) {
        this.contactDetails = contactDetails;
    }


}
