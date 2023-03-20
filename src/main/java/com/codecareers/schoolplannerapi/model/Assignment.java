package com.codecareers.schoolplannerapi.model;

/* A model class to represent an Assigmnet object */ 
public class Assignment {
    // Here are the Global variable fields we want our Assignment object to have
    // They are set to private so that only this model class can directly access the variables
    private int assignmentID;
    
    private String name;


    private String description;


    private String classCategory;


    private boolean isComplete;


    private String createDate;


    private String dueDate;

    /* 
    * Empty constructor - Used to allow the creation of an empty Assignment object
    */
    public Assignment() {

    }

    /**
     * A constructor that is used to create an Assignment object with the following information.
     * @param assignmentID
     * @param name
     * @param description
     * @param classCategory
     * @param isComplete
     * @param createDate
     * @param dueDate
     */
    public Assignment(int assignmentID, String name, String description, String classCategory, boolean isComplete, String createDate, String dueDate) {
        this.assignmentID = assignmentID;
        this.name = name;
        this.description = description;
        this.classCategory = classCategory;
        this.isComplete = isComplete;
        this.createDate = createDate;
        this.dueDate = dueDate;
    }

    // Below here are all the getters and setters for the data above

    public int getAssignmentID() {
        return this.assignmentID;
    }


    public void setAssignmentID(int assignmentID) {
        this.assignmentID = assignmentID;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getClassCategory() {
        return this.classCategory;
    }

    public void setClassCategory(String classCategory) {
        this.classCategory = classCategory;
    }

    public boolean getIsComplete() {
        return this.isComplete;
    }

    public void setIsComplete(boolean isComplete) {
        this.isComplete = isComplete;
    }

    public String getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate() {
        this.createDate = createDate;
    }

    public String getDueDate() {
        return this.dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }
}
