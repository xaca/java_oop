package com.example.ansh.myapplication.got;

import java.util.ArrayList;

/**
 * Created by anshsachdeva on 24-10-2017.
 */

public class Character {
    private House House;
    private String Name;
    private String FamousDialogues;
    private ArrayList<Integer> Seasons;
    private String FirstScene;
    private String LastScene;
    private Integer TotalEpisodes;
    private ArrayList<String> Titles;
    private String Religion;
    private String LivingStatus;
    private String DeathReasonIfDied;
    private ArrayList<Character> Parents;
    private ArrayList<Character> Siblings;
    private ArrayList<Character> Sucessors;
    private String PortrayedBy;

    public Character() {
    }

    public Character(House house,String name,String famousDialogues, ArrayList<Integer> seasons, String firstScene, String lastScene
            , Integer totalEpisodes, ArrayList<String> titles,String religion, String livingStatus,
                     String deathReasonIfDied, ArrayList<Character> parents, 
                     ArrayList<Character> siblings, ArrayList<Character> sucessors, String portrayedBy) {
        House=house;
        Name = name;
        FamousDialogues=famousDialogues;
        Seasons = seasons;
        FirstScene = firstScene;
        LastScene = lastScene;
        TotalEpisodes = totalEpisodes;
        Titles = titles;
        Religion=religion;
        LivingStatus = livingStatus;
        DeathReasonIfDied = deathReasonIfDied;
        Parents = parents;
        Siblings = siblings;
        Sucessors = sucessors;
        PortrayedBy = portrayedBy;
    }

    public House getHouse() {
        return House;
    }

    public void setHouse(House house) {
        House = house;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getFamousDialogues() {
        return FamousDialogues;
    }

    public void setFamousDialogues(String famousDialogues) {
        FamousDialogues = famousDialogues;
    }

    public ArrayList<Integer> getSeasons() {
        return Seasons;
    }

    public void setSeasons(ArrayList<Integer> seasons) {
        Seasons = seasons;
    }

    public String getFirstScene() {
        return FirstScene;
    }

    public void setFirstScene(String firstScene) {
        FirstScene = firstScene;
    }

    public String getLastScene() {
        return LastScene;
    }

    public void setLastScene(String lastScene) {
        LastScene = lastScene;
    }

    public Integer getTotalEpisodes() {
        return TotalEpisodes;
    }

    public void setTotalEpisodes(Integer totalEpisodes) {
        TotalEpisodes = totalEpisodes;
    }

    public ArrayList<String> getTitles() {
        return Titles;
    }

    public void setTitles(ArrayList<String> titles) {
        Titles = titles;
    }

    public String getReligion() {
        return Religion;
    }

    public void setReligion(String religion) {
        Religion = religion;
    }

    public String getLivingStatus() {
        return LivingStatus;
    }

    public void setLivingStatus(String livingStatus) {
        LivingStatus = livingStatus;
    }

    public String getDeathReasonIfDied() {
        return DeathReasonIfDied;
    }

    public void setDeathReasonIfDied(String deathReasonIfDied) {
        DeathReasonIfDied = deathReasonIfDied;
    }

    public ArrayList<Character> getParents() {
        return Parents;
    }

    public void setParents(ArrayList<Character> parents) {
        Parents = parents;
    }

    public ArrayList<Character> getSiblings() {
        return Siblings;
    }

    public void setSiblings(ArrayList<Character> siblings) {
        Siblings = siblings;
    }

    public ArrayList<Character> getSucessors() {
        return Sucessors;
    }

    public void setSucessors(ArrayList<Character> sucessors) {
        Sucessors = sucessors;
    }

    public String getPortrayedBy() {
        return PortrayedBy;
    }

    public void setPortrayedBy(String portrayedBy) {
        PortrayedBy = portrayedBy;
    }

    @Override
    public String toString() {
        return "Character{" +
                "Name=" + Name + '\n' +
                "====================================\n"+
                "---- FamousDialogues=" + FamousDialogues + '\n' +
                "---- Seasons=" + Seasons +
                "---- FirstScene=" + FirstScene + '\n' +
                "---- LastScene=" + LastScene + '\n' +
                "---- TotalEpisodes=" + TotalEpisodes +
                "---- Titles=" + Titles +
                "---- LivingStatus=" + LivingStatus + '\n' +
                "---- DeathReasonIfDied=" + DeathReasonIfDied + '\n' +
                "---- Parents=" + Parents +
                "---- Siblings=" + Siblings +
                "---- Sucessors=" + Sucessors +
                "---- PortrayedBy=" + PortrayedBy + '\n' +
                '}';
    }
}

