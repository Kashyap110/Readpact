package model;


import java.security.Timestamp;

public class Journal {
    private String title;
    private String thought;
    private String imageUrl;
    private String userId;
    private Timestamp timeAdded;
    private String userName;

    public Journal(){
        //must for firestore to work
    }
    public Journal(String title, String thought, String imageUrl, String userId, Timestamp timeAdded, String userName){
        this.title=title;
        this.thought=thought;
        this.imageUrl=imageUrl;
        this.userId=userId;
        this.timeAdded=timeAdded;
        this.userName=userName;
    }

    public String getTitle() {
        return title;
    }

    public String getThought() {
        return thought;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getUserId() {
        return userId;
    }

   public Timestamp getTimeAdded() {
       return timeAdded;
    }

    public String getUserName() {
        return userName;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setThought(String thought) {
        this.thought = thought;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setTimeAdded(Timestamp timeAdded) {
        this.timeAdded = timeAdded;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setTimeAdded(com.google.firebase.Timestamp timestamp) {
    }
}
