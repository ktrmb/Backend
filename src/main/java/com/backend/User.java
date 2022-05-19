package com.backend;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.Instant;
import java.util.Date;
import java.util.Objects;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String rfid_uid;
    private String name;
    private Date created;


    public User(int id, String rfid_uid, String name) {
        this.id = id;
        this.rfid_uid = rfid_uid;
        this.name = name;
    }

    public User(String rfid_uid, String name) {
        this.rfid_uid = rfid_uid;
        this.name = name;
    }

    public User(int id, String rfid_uid, String name, Date created) {
        this.id = id;
        this.rfid_uid = rfid_uid;
        this.name = name;
        this.created = created;
    }

    public User() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRfid_uid() {
        return rfid_uid;
    }

    public void setRfid_uid(String rfid_uid) {
        this.rfid_uid = rfid_uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
