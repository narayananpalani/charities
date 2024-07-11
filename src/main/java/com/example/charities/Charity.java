package com.example.charities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Charity {
    private @Id
    @GeneratedValue Long id;
    private String charityName;
    private String regNumber;
    private int sortCode;
    private int accNumber;

    public Charity() {
    }


    public Charity(String charityName, String regNumber, int sortCode, int accNumber) {
        this.charityName = charityName;
        this.regNumber = regNumber;
        this.sortCode = sortCode;
        this.accNumber = accNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCharityName() {
        return charityName;
    }

    public void setCharityName(String name) {
        this.charityName = charityName;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String phone) {
        this.regNumber = regNumber;
    }

    public int getSortCode() { return sortCode; }

    public void setSortCode(int sortCode) { this.sortCode = sortCode; }

    public int getAccNumber() { return accNumber; }

    public void setAccNumber(int accNumber) { this.accNumber = accNumber; }
}
