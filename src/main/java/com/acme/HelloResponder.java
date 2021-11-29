package com.acme;

import io.quarkus.funqy.Funq;
import org.jboss.logging.Logger;

public class HelloResponder {
    private static final Logger log = Logger.getLogger(HelloResponder.class);

    /**
     * Expects event of type "hello".  Creates event of type "hello.output".
     *
     * @param input The input
     * @return
     */
    @Funq
    public String hello(String input) {
        log.info("*** defaultChain ***");
        return input + "::" + "defaultChain";
    }
}
