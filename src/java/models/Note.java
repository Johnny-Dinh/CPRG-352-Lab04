package models;
import java.io.*;

/**
 *
 * @author 792268
 */
public class Note implements Serializable {

    // Variables
    private String title;
    private String contents;
    
    // Default Constructor
    public Note() {
        this.title = "";
        this.contents = "";
    }
    
    // Constructor
    public Note(String title, String contents) {
        this.title = title;
        this.contents = contents;
    }
    
    // Getters
    public String getTitle() {
        return title;
    }
    
    public String getContents() {
        return contents;
    }
    
    // Setters
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setContents(String contents) {
        this.contents = contents;
    }
}