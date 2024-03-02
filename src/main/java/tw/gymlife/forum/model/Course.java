package tw.gymlife.forum.model;

import lombok.Data;

@Data
public class Course {
    private String id;
    private String name;
    private boolean privateGroupLesson;
    private String category;
    private String type;
    private int price;

    // Constructor
    public Course(String id, String name, boolean privateGroupLesson, String category, String type, int price) {
        this.id = id;
        this.name = name;
        this.privateGroupLesson = privateGroupLesson;
        this.category = category;
        this.type = type;
        this.price = price;
    }

    public boolean isPrivate() {
        // Assuming 'privateGroupLesson' being false implies the course is a private individual lesson
        // You might need to adjust the logic based on your specific requirements or additional class fields
        return !this.privateGroupLesson;
    }

}