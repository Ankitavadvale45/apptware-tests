package com.apptware.interview.spring.beans;

public enum SomeEnum {
    SOME_ENUM_A(OnDemandA.class),
    SOME_ENUM_B(OnDemandB.class);

    public Class<? extends BaseOnDemand> getOnDemandClass() {
        return onDemandClass;
    }

    private final Class<? extends BaseOnDemand> onDemandClass;

    SomeEnum(Class<? extends BaseOnDemand> onDemandClass) {
        this.onDemandClass = onDemandClass;
    }
}
