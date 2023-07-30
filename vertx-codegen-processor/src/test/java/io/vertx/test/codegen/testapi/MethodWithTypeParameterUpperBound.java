package io.vertx.test.codegen.testapi;

import io.vertx.codegen.annotations.VertxGen;

import java.util.List;

/**
 * @author <a href="http://tfox.org">Tim Fox</a>
 */
@VertxGen
public interface MethodWithTypeParameterUpperBound {

  <T extends String> T foo();
}
