package _2_tagging_and_filtering.examples.tags;

import org.junit.jupiter.api.Tag;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD}) // here we specify what targets are applicable for annotation
@Retention(RetentionPolicy.RUNTIME) // here we specify how long annotations are to be retained
@Tag("slow") // here we compose default junit annotation with our custom.
public @interface Slow {
}
