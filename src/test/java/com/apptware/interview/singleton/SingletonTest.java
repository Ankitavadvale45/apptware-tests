package com.apptware.interview.singleton;

import java.lang.reflect.Constructor;
import lombok.SneakyThrows;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * The code tests whether the {@link com.apptware.interview.singleton.Singleton} class strictly
 * enforces the singleton pattern. By using reflection to access the private constructor, it
 * attempts to create a second instance of the singleton. The assertion at the end verifies whether
 * both instances are indeed the same, based on their hash codes. If the assertion fails, it
 * indicates a failure in the Singleton pattern implementation.
 *
 * <p>The candidate is expected **NOT** to modify the test case but the corresponding class for
 * which the test case is written.
 */
class SingletonTest {

  @Test
  @SneakyThrows
  void testSingleton() {
    Singleton instance1 = Singleton.getInstance();
    Singleton instance2 = null;

    Constructor<?>[] constructors = Singleton.class.getDeclaredConstructors();
    for (Constructor<?> constructor : constructors) {
      constructor.setAccessible(true);
      instance2 = (Singleton) constructor.newInstance();
      break;
    }

    Assertions.assertThat(instance1.hashCode()).isEqualTo(instance2.hashCode());
  }
}

//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotEquals;
//
//import org.junit.jupiter.api.Test;
//
//public class SingletonTest {
//
//  @Test
//  public void testSingleton() {
//    Singleton instance1 = Singleton.getInstance();
//    Singleton instance2 = Singleton.getInstance();
//
//    // Verify that both instances are the same
//    assertEquals(instance1, instance2);
//
//    // Reflection test
//    try {
//      Class<?> clazz = Singleton.class;
//      java.lang.reflect.Constructor<?> constructor = clazz.getDeclaredConstructor();
//      constructor.setAccessible(true);
//      Singleton instance3 = (Singleton) constructor.newInstance();
//
//      // Ensure that reflection does not create a new instance
//      assertNotEquals(instance1, instance3);
//
//    } catch (Exception e) {
//      e.printStackTrace();
//    }
//  }
//}
//
