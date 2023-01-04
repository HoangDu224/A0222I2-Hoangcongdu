package com.example.demo.form;

public class BlogForm {
    private Integer id;
    private String title;
    private String content;
    private String categoryId;

    public BlogForm() {
    }

    public BlogForm(int id, String title, String content, String categoryId) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.categoryId = categoryId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }
}
