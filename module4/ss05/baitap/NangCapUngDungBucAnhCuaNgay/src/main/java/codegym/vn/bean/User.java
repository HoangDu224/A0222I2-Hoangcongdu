package codegym.vn.bean;

import javax.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String comment;
    private int love;

    public User() {
    }

    public User(int id, String name, String comment, int love) {
        this.id = id;
        this.name = name;
        this.comment = comment;
        this.love = love;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getLove() {
        return love;
    }

    public void setLove(int like) {
        this.love = like;
    }
}
