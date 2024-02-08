package de.schlueter.httpRoutes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * GetTodo
 */
@RestController
public class GetTodo {

    @GetMapping("/getTodo")
    public String getTodo() {
        return "getTodo";
    }
}
