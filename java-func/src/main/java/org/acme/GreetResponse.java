package org.acme;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GreetResponse {

    @JsonProperty("JavaFunc")
    private String javaFunc;

    public String getJavaFunc() {
        return javaFunc;
    }

    public void setJavaFunc(String javaFunc) {
        this.javaFunc = javaFunc;
    }
}

