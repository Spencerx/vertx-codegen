package io.vertx.test.codegen.testapi;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.codegen.annotations.VertxGen;

import java.net.Socket;

/**
 * @author <a href="http://tfox.org">Tim Fox</a>
 */
@VertxGen
public interface MethodWithJavaDotObjectInHandlerAsyncResult {

  void foo(Handler<AsyncResult<Socket>> handler);
}
