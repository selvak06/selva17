package dev.tpa;

import java.util.ArrayList;
import java.util.List;

public class Team<T>{
    private String teamName;
    List<T> teamMembers = new ArrayList<>();
    private int totalWins = 0;
    private int totalLosses = 0;
    private int totalTies = 0;

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public void addTeamMember(T t) {
        if(!teamMembers.contains( t)){
            teamMembers.add(t);
        }
    }
    public void listTeamMembers() {
        System.out.println(teamName + " Roster: ");
        System.out.println(teamMembers);
    }

    public int ranking(){
        return (totalLosses * 2) + totalTies + 1 ;
    }

    @Override
    public String toString() {
        return teamName + " (Ranked " + ranking() +")";
    }

    public String setScore(int ourScore, int theirScore) {
        String message = " lost to ";
        if (ourScore > theirScore) {
            totalWins++;
            message = " beat ";
        } else if (ourScore == theirScore) {
            totalTies ++;
            message = " tie ";
        } else {
            totalLosses++;
        }
        return message;
    }


}
