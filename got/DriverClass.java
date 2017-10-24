package com.example.ansh.myapplication.got;

/**
 * Created by anshsachdeva2 on 24-10-2017.
 */
import java.util.*;
public class DriverClass {
    static House greyjoy;

    public static void main(String[] args) {

        greyjoy= createHouseGreyjoys();

        Character YaraGreyjoy=createCharacterYara();

        System.out.println(greyjoy);
        System.out.println(YaraGreyjoy);



    }

    private static Character createCharacterYara() {
        Character yara=new Character();
        yara.setName("Yara GreyJoy");
        yara.setReligion("Drowned gods of the Sea");
        yara.setFamousDialogues("I'm going to pick the fastest ship in our fleet." +
                " I'm going to choose the 50 best killers on the Iron Islands." +
                " I'm going to sail up the Narrow Sea all the way to the Weeping Water." +
                " I'm going to march on the Dreadfort. I'm going to find my little brother" +
                " and I'm going to bring him home.");
        yara.setHouse(greyjoy);
        yara.setFirstScene("The Night Lands");
        yara.setLastScene("The Dragon And The Wolf");
        yara.setLivingStatus("Alive");
        yara.setTotalEpisodes(14);

        Character theon=new Character();
        theon.setName("Theon GreyJoy");
        ArrayList<Character> all_siblings=new ArrayList<>();
        all_siblings.add(theon);

        yara.setSiblings(all_siblings);

        //...add more data

        return yara;

    }

    private static House createHouseGreyjoys() {
        House greyjoys=new House();

        greyjoys.setHouseName("Greyjoy");
        greyjoys.setSigilDescription("A golden krakken on black field");
        greyjoys.setReligion("Drowned Gods of Sea");
        greyjoys.setRegion("Iron Islands");
        greyjoys.setStatus("Alive");
        greyjoys.setFounded("Age Of Heroes");
        ArrayList<String>greyjoyWords=new ArrayList<String>();
        greyjoyWords.add("We Shall not Sow");
        greyjoyWords.add("What is dead may never die");
        greyjoys.setFamousWords(greyjoyWords);

        Character euron=new Character();
        euron.setName("Euron GreyJoy");
        greyjoys.setCurrentLord(euron);

        //add more data...
        return greyjoys;
    }

}
