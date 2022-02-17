package com.example.hello.Users;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class UserGatewayIntegrationTest {
    @Autowired
    private UserGateway userGateway;

    @Test
    void getUseryId() {
        //Act
      UserResponse result=  userGateway.getUseryId(1);

      //Assert
        assertEquals(1,result.getId());
        assertEquals("Leanne Graham",result.getName());
    }
}