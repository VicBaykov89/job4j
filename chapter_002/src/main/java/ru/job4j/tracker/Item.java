package ru.job4j.tracker;


/**
 * Created by vicba on 16.08.2018.
 */
public class Item {
    private String id;
    private String name;
    private String description;
    private long created;
    private String[] comments;

    public Item(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getId() {

        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getCreated() {
        return created;
    }

    public void setCreated(long created) {
        this.created = created;
    }

    public String[] getComments() {
        return comments;
    }

    public void setComments(String[] comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "ID заявки:   |" + this.id
                + '\n' + '\r'
                + "Имя заявки:  |" + this.name + '\n' + '\r'
                + "Описание:    |" + this.description;
    }
}
