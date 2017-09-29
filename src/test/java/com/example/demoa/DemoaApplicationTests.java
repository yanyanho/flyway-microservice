package com.example.demoa;

import org.flywaydb.core.Flyway;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoaApplicationTests {

	@Autowired
	Flyway flyway;

	@Before
	public void setUp() throws Exception {
				flyway.clean();
				flyway.migrate();
		}
		@Test
	public void print() {
		System.out.println("test");
		}

	}

