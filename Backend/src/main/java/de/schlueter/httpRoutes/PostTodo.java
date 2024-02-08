package de.schlueter.httpRoutes;

import de.schlueter.data.Todo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * PostTodo
 */
@RestController
public class PostTodo {
    @PostMapping("/addTodo")
    public String addTodo(@RequestBody Todo todo) {
        return "{\"name\": \"" + todo.getName() + "\", \"description\": \"" + todo.getDescription()
            + "\"}";
    }
}
