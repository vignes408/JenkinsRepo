package com.vickee.SimpleMavenJenkin;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AdditionTest {

	@Test
	void testAdd() {
		assertEquals(10,Addition.add(5, 5));
	}

}
