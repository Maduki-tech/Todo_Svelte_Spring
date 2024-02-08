package de.schlueter.data;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


/**
 * Todo_Test
 */
public class TodoTest {
    @Test
    public void testTodo() {
        Todo todo = new Todo();
        todo.setName("Test");
        todo.setDescription("Test");
        assertEquals("Test", todo.getName());
        assertEquals("Test", todo.getDescription());
    }

    @Test
    public void testTodoConstructor() {
        Todo todo = new Todo();
        assertEquals(null, todo.getName());
        assertEquals(null, todo.getDescription());
    }

    @Test
    public void testTodoConstructorWithParams() {
        Todo todo = new Todo("Test", "Test");
        assertEquals("Test", todo.getName());
        assertEquals("Test", todo.getDescription());
    }
}
