package ru.kkuzmichev.simpleappforespresso.ui.gallery;

public class GalleryItem {
    private String title;
    private String description;
    private int number;

    public GalleryItem(String title, String description, int number) {
        this.title = title;
        this.description = description;
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getNumber() {
        return number;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
