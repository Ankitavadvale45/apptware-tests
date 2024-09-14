package com.apptware.interview.spring.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Qualifier("OnDemandA")
class OnDemandA extends BaseOnDemand {

  //OnDemandA( @Value("Hello World!!!") String someString) {
  OnDemandA( @Value("Hello World!!!") String someString) {
    super(someString);
  }

  @Override
  public SomeEnum getSomeEnum() {
    return SomeEnum.SOME_ENUM_A;
  }
}
