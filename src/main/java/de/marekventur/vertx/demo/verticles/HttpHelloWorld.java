package de.marekventur.vertx.demo.verticles;

import org.vertx.java.core.Handler;
import org.vertx.java.core.http.HttpServerRequest;
import org.vertx.java.core.logging.Logger;
import org.vertx.java.deploy.Verticle;

public class HttpHelloWorld extends Verticle {

  @Override
  public void start() throws Exception {
    final Logger logger = container.getLogger();

    logger.info("Hello world. Test HTTP via http://localhost:8080");

    vertx.createHttpServer().requestHandler(new Handler<HttpServerRequest>() {
      public void handle(HttpServerRequest req) {
        logger.info("Got request: " + req.uri);
        for (String key : req.headers().keySet()) {
          logger.info(key + ":" + req.headers().get(key));
        }
        req.response.headers().put("Content-Type", "text/html; charset=UTF-8");
        req.response.end("<html><body><h1>Hello world</h1></body></html>");
      }
    }).listen(8080);

  }

}
