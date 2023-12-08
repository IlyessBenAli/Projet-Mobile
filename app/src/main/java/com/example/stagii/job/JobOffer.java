package com.example.stagii.job;

public class JobOffer {
    private int id;
    private String title;
    private String description;
    private String category;
    private double salary;
private  int   imageResourceId;

    public int getImageResourceId() {
        return imageResourceId;
    }

    public JobOffer(int id, String title, String description, String category, double salary, int imageResourceId) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.category = category;
        this.salary = salary;
        this.imageResourceId = imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }

    public JobOffer(int id, String title, String description, String category, double salary) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.category = category;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public JobOffer(int id, String title, String description, String category) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
