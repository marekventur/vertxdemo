package de.marekventur.vertx.demo;

import org.vertx.java.core.json.JsonObject;
import org.vertx.java.deploy.Verticle;

public class MainVerticle extends Verticle {

  @Override
  public void start() throws Exception {
    JsonObject httpServerConfig = new JsonObject("{\"port\":8889,\"host\":\"localhost\"}");
    container.deployModule("vertx.web-server-v1.0", httpServerConfig);

    container.deployVerticle("de.marekventur.vertx.demo.verticles.HttpHelloWorld");
  }

}
