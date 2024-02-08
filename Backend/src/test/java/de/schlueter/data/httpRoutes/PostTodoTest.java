package de.schlueter.data.httpRoutes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

import de.schlueter.App;

/**
 * PostTodo_Test
 */
@RunWith(SpringRunner.class)
@SpringBootTest(
  webEnvironment = SpringBootTest.WebEnvironment.MOCK,
  classes = App.class)
@AutoConfigureMockMvc
public class PostTodoTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void testAddTodo() {
        try {
            mvc.perform(post("/addTodo")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"name\": \"Test\", \"description\": \"Test\"}"))
                .andExpect(status().isOk())
                .andExpect(content().string("{\"name\": \"Test\", \"description\": \"Test\"}"));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
