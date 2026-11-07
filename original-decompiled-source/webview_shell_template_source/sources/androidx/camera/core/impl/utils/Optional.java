package androidx.camera.core.impl.utils;

import java.io.Serializable;
import t0.d;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class Optional<T> implements Serializable {
    private static final long serialVersionUID = 0;

    public static <T> Optional<T> absent() {
        return Absent.withType();
    }

    public static <T> Optional<T> fromNullable(T t6) {
        return t6 == null ? absent() : new Present(t6);
    }

    public static <T> Optional<T> of(T t6) {
        t6.getClass();
        return new Present(t6);
    }

    public abstract boolean equals(Object obj);

    public abstract T get();

    public abstract int hashCode();

    public abstract boolean isPresent();

    public abstract Optional<T> or(Optional<? extends T> optional);

    public abstract T or(T t6);

    public abstract T or(d<? extends T> dVar);

    public abstract T orNull();

    public abstract String toString();
}
