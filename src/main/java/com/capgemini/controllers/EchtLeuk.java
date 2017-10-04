package com.capgemini.controllers;

public class EchtLeuk {

    int i;
    String voorNaam;
    String achterNaam;
    final int eindBaasInt;

    {
        i = 1;
        voorNaam = "Juan";
        achterNaam = "Percent";
    }

    public EchtLeuk(int eindBaasInt){
        this.eindBaasInt = eindBaasInt;
    }

    public String stringetjeBouwen(String stringA, String stringB) {

        StringBuilder sb = new StringBuilder();
        sb.append(stringA);
        sb.append(" ");
        sb.append(stringB);

        return sb.toString();

    }

    public void leukeSwitch(int dag){

        String dayString;
        switch (dag) {
            case 1:  dayString = "Maandag";
                break;
            case 2:  dayString = "Dinsdag";
                break;
            case 3:  dayString = "Woensdag";
                break;
            case 4:  dayString = "Donderdag";
                break;
            case 5:  dayString = "Vrijdag";
                break;
            case 6:  dayString = "Zaterdag";
                break;
            case 7:  dayString = "Zondag";
                break;
            default: dayString = "Geen dag doei!";
                break;
        }
        System.out.println(dayString);

    }

    public void leukForLoopje() {

        for(int i = 0; i < 10; i++) {

            System.out.println("Forloopje op nummertje: " + i);

        }

    }

    public void leukDoLoopje(){

        int infiniteLoopBreaker = 0;

        do {
            System.out.println("DO IT: " + infiniteLoopBreaker);
            ++infiniteLoopBreaker;
            infiniteLoopBreaker++;
        } while (infiniteLoopBreaker < 10);

    }

    public void leukWhileLoopje(){

        int infiniteLoopBreaker = 0;

        while (infiniteLoopBreaker < 10) {
            System.out.println("WHILE LOOP, DO IT: " + infiniteLoopBreaker);
            infiniteLoopBreaker++;
        }

    }

    public void probeerFinalTeVeranderen(){

        // KAN NIET
        // this.eindBaasInt = 3;

    }


}
