package com.acme;

import io.quarkus.test.junit.QuarkusIntegrationTest;

@QuarkusIntegrationTest
public class HelloResponderIT extends HelloResponderTest {
  // run same test as HelloResponderTest
  // but using the native image bc of the QuarkusIntegrationTest annotation
}
