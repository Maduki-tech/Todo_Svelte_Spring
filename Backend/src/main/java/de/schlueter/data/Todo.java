package de.schlueter.data;

/**
 * Todo class
*/
public class Todo {
    private String name;
    private String description;

    public Todo() {
    }

    /**
     * Generates a new Todo with the given name and description
     *
     * @param name
     * @param description
     */
    public Todo(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
