package com.bragin.area.model.core;

import javax.persistence.Basic;
import javax.persistence.Entity;

/**
 * Created with IntelliJ IDEA.
 * User: Брагин
 * Date: 25.09.13
 * Time: 23:52
 * To change this template use File | Settings | File Templates.
 */

@Entity (name = "Flat")
public class Flat extends RealtyUnit {
    @Basic
    Integer stage;

    @Basic
    Integer roomsNumber;

    @Basic
    Boolean separatedRooms;

    @Basic
    FurnitureComplect furnitureComplect;

    @Basic
    HouseHoldAppliances houseHoldAppliances;

    public Integer getStage() {
        return stage;
    }

    public void setStage(Integer stage) {
        this.stage = stage;
    }

    public Integer getRoomsNumber() {
        return roomsNumber;
    }

    public void setRoomsNumber(Integer roomsNumber) {
        this.roomsNumber = roomsNumber;
    }

    public Boolean getSeparatedRooms() {
        return separatedRooms;
    }

    public void setSeparatedRooms(Boolean separatedRooms) {
        this.separatedRooms = separatedRooms;
    }

    public FurnitureComplect getFurnitureComplect() {
        return furnitureComplect;
    }

    public void setFurnitureComplect(FurnitureComplect furnitureComplect) {
        this.furnitureComplect = furnitureComplect;
    }

    public HouseHoldAppliances getHouseHoldAppliances() {
        return houseHoldAppliances;
    }

    public void setHouseHoldAppliances(HouseHoldAppliances houseHoldAppliances) {
        this.houseHoldAppliances = houseHoldAppliances;
    }
}
