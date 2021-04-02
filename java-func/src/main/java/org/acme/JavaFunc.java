package org.acme;

import io.quarkus.funqy.Funq;

public class JavaFunc {

    @Funq
    public GreetResponse greet() {
        GreetResponse greetResponse = new GreetResponse();
        greetResponse.setJavaFunc("Invoked Java Function");
        return greetResponse;
    }
}
