package annotations;

import org.junit.jupiter.api.Tag;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

    @Tag("regresion")
    @Retention(value = RetentionPolicy.RUNTIME)
    public @interface Regression {
    }
