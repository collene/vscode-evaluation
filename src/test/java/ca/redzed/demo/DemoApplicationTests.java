package ca.redzed.demo;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	private static final Logger log = LogManager.getLogger(DemoApplicationTests.class);

	@Test
	public void contextLoads() {
		log.info("Context load test running");
	}

	@Test
	public void trueIsTrue() {
		log.debug("True is true");
		assertTrue(true);
	}

	@Test
	public void falseIsFalse() {
		log.error("False is false");
		assertFalse(false);
	}

	@Test
	public void adding() {
		int four = 2 + 2;
		log.debug("adding works too");
		assertThat(four, is(4));
	}
}
