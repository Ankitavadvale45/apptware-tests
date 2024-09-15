package com.apptware.interview.spring.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Qualifier("OnDemandB")
class OnDemandB extends BaseOnDemand {

  //OnDemandB(@Value("Hello Other World!!!") String someString) {
  OnDemandB(@Value("Hello Other World!!!") String someString) {
    super(someString);
  }

  @Override
  public SomeEnum getSomeEnum() {
    return SomeEnum.SOME_ENUM_B;
  }
}
