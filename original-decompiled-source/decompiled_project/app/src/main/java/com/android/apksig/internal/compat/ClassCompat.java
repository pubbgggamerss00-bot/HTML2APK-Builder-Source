package com.android.apksig.internal.compat;

import java.lang.annotation.Annotation;
import java.util.Objects;

/* loaded from: classes.dex */
public class ClassCompat {
    public static <A extends Annotation> A getDeclaredAnnotation(Class<?> cls, Class<A> cls2) {
        Objects.requireNonNull(cls2);
        Objects.requireNonNull(cls);
        for (Annotation annotation : cls.getDeclaredAnnotations()) {
            if (cls2.equals(annotation.annotationType())) {
                return cls2.cast(annotation);
            }
        }
        return null;
    }
}
