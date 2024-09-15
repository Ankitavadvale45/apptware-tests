package com.apptware.interview.comparison;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;
import java.util.Objects;

@Data
@AllArgsConstructor
class SomeClass {

    // This is a unique identifier
    private Integer id;
    private Date lastInvoked;

    public boolean equals(Object obj) {
        SomeClass someClass = (SomeClass) obj;

        return (Objects.equals(this.id, someClass.getId()));
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
