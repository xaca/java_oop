package com.example.ansh.myapplication.got;

import java.util.ArrayList;

/**
 * Created by anshsachdeva on 24-10-2017.
 */

public class House {
    private String HouseName;
    private String SigilDescription;
    private ArrayList<String>FamousWords;
    private String Status;
    private String Religion;
    private String Region;
    private String Founded;
    private ArrayList<House>Alligence;
    private Character Founder;
    private Character CurrentLord;

    public House() {
    }

    public House(String houseName, String sigilDescription, ArrayList<String> famousWords,
                 String status, String religion, String region, String founded,
                 ArrayList<House> alligence, Character founder, Character currentLord) {
        HouseName = houseName;
        SigilDescription = sigilDescription;
        FamousWords = famousWords;
        Status= status;
        Religion = religion;
        Region = region;
        Founded = founded;
        Alligence = alligence;
        Founder = founder;
        CurrentLord = currentLord;
    }

    public String getHouseName() {
        return HouseName;
    }

    public void setHouseName(String houseName) {
        HouseName = houseName;
    }

    public String getSigilDescription() {
        return SigilDescription;
    }

    public void setSigilDescription(String sigilDescription) {
        SigilDescription = sigilDescription;
    }

    public ArrayList<String> getFamousWords() {
        return FamousWords;
    }

    public void setFamousWords(ArrayList<String> famousWords) {
        FamousWords = famousWords;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public ArrayList<House> getAlligence() {
        return Alligence;
    }

    public void setAlligence(ArrayList<House> alligence) {
        Alligence = alligence;
    }

    public String getReligion() {
        return Religion;
    }

    public void setReligion(String religion) {
        Religion = religion;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public String getFounded() {
        return Founded;
    }

    public void setFounded(String founded) {
        Founded = founded;
    }

    public Character getFounder() {
        return Founder;
    }

    public void setFounder(Character founder) {
        Founder = founder;
    }

    public Character getCurrentLord() {
        return CurrentLord;
    }

    public void setCurrentLord(Character currentLord) {
        CurrentLord = currentLord;
    }

    @Override
    public String toString() {
        return "====HOUSE==={" +
                "NAME=" + HouseName + '\n' +
                "- SIGILDESCRIPTION=" + SigilDescription + '\n' +
                "- FAMOUSWORDS=" + FamousWords +'\n' +
                "- STATUS=" + Status +'\n' +
                "- RELIGION=" + Religion + '\n' +
                "- REGION=" + Region + '\n' +
                "- ALLIGENCE=" + Alligence + '\n' +
                "- FOUNDED=" + Founded + '\n' +
                "- FOUNDER=" + Founder +'\n' +
                "- CURRENTLORD=" + CurrentLord +'\n' +
                "===HOUSE===}";
    }
}

