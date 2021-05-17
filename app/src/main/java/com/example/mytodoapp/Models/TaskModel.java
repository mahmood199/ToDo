package com.example.mytodoapp.Models;

import java.util.ArrayList;
import java.util.Date;

public class TaskModel {

    private String title;
    private String description;
    private Date startDate;
    private Date endDate;
    private ArrayList<String> subtasks;
    private int priority;
    private boolean isCompleted;
    private double timeLeft;
    private String status;
    private String background;

    public TaskModel(String title, String description, Date startDate, Date endDate, String background,
                     ArrayList<String> subtasks, int priority, boolean isCompleted, double timeLeft, String status) {
        this.title = title;
        this.background = background;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.subtasks = subtasks;
        this.priority = priority;
        this.isCompleted = isCompleted;
        this.timeLeft = timeLeft;
        this.status = status;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public double getTimeLeft() {
        return timeLeft;
    }

    public void setTimeLeft(double timeLeft) {
        this.timeLeft = timeLeft;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public ArrayList<String> getSubtasks() {
        return subtasks;
    }

    public void setSubtasks(ArrayList<String> subtasks) {
        this.subtasks = subtasks;
    }
}
