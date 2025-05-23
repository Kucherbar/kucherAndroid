package com.example.kucherandroid;

public class Match {
    private int id;
    private String team1;
    private String team2;
    private int point1;
    private int point2;

    public Match(String team1, String team2, int point1, int point2) {
        this.team1 = team1;
        this.team2 = team2;
        this.point1 = point1;
        this.point2 = point2;
    }

    public Match(int id, String team1, String team2, int point1, int point2) {
        this(team1, team2, point1, point2);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTeam1() {
        return team1;
    }

    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    public String getTeam2() {
        return team2;
    }

    public void setTeam2(String team2) {
        this.team2 = team2;
    }

    public int getPoint1() {
        return point1;
    }

    public void setPoint1(int point1) {
        this.point1 = point1;
    }

    public int getPoint2() {
        return point2;
    }

    public void setPoint2(int point2) {
        this.point2 = point2;
    }
    public String toString() {
        return team1 + " " + team2 + " " + point1 + " " + point2;
    }
}
