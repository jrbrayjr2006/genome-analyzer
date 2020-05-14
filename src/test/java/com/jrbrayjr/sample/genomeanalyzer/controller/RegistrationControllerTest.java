package com.jrbrayjr.sample.genomeanalyzer.controller;

import com.jrbrayjr.sample.genomeanalyzer.model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class RegistrationControllerTest {

    RegistrationController controller;
    MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        controller = new RegistrationController();
        mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
    }

    @Test
    @DisplayName("Given a registration is submitted, when data is received, then should return accepted")
    void shouldAcceptRegistration() throws Exception {
        // Given
        String endpoint = "/user";
        User user = new User();
        String strUser = "{}";

        // When
        mockMvc.perform(post(endpoint)
                .accept(MediaType.APPLICATION_JSON).contentType(MediaType.APPLICATION_JSON_VALUE)
                .content(strUser))
                .andExpect(status().isAccepted());
        // Then
    }
}
