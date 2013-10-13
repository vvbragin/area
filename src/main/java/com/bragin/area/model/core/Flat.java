package com.bragin.area.model.core;

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
    Integer stage;
    Integer roomsNumber;
    Double price;
    Boolean separatedRooms;
    FurnitureComplect furnitureComplect;
    HouseHoldAppliances houseHoldAppliances;

}
