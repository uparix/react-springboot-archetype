package com.uparix;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;


@RunWith(JUnitPlatform.class)
@SpringBootTest(classes = com.uparix.Application.class)
@ExtendWith(SpringExtension.class)
public class ApplicationTest {

  @Test
  public void contextLoads() {
  }

}