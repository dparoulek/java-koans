package com.upgradingdave.koans.jpaspringhibernate;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class House {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    Integer id;
    @OneToOne(cascade={CascadeType.PERSIST})
    Address address;
    @OneToMany(cascade={CascadeType.ALL}, fetch=FetchType.EAGER)
    List<Room> rooms;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

}
