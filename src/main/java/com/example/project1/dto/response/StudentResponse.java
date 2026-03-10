package com.example.project1.dto.response;

public class StudentResponse {
    public StudentResponse(int rollno, String name, int total, double percentage, String result) {
        this.rollno = rollno;
        this.name = name;
        this.total = total;
        this.percentage = percentage;
        this.result = result;
    }
    private int rollno;
    private String name;
    private int total;
    private double percentage;
    private String result;
    public int getRollno() {
        return rollno;
    }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getTotal() {
        return total;
    }
    public void setTotal(int total) {
        this.total = total;
    }
    public double getPercentage() {
        return percentage;
    }
    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
    public String getResult() {
        return result;
    }
    public void setResult(String result) {
        this.result = result;
    }

    
    
}
