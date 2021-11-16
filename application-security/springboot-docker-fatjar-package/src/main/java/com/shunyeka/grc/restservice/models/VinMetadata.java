package com.shunyeka.grc.restservice.models;


public class VinMetadata {

    private String vin;

    private String vehicleType;

    public VinMetadata(String vin, String vehicleType) {
        this.vin = vin;
        this.vehicleType = vehicleType;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
}
