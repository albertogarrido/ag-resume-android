package net.albertogarrido.resume.domain.entities;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class Human {

    public static Human create(String name) {
        return new AutoValue_Human(name);
    }

    public abstract String name();

}
