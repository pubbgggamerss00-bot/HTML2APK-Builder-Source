package q;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class d {
    public static final void a(String message) {
        r.e(message, "message");
        throw new IllegalArgumentException(message);
    }

    public static final void b(String message) {
        r.e(message, "message");
        throw new IndexOutOfBoundsException(message);
    }

    public static final void c(String message) {
        r.e(message, "message");
        throw new NoSuchElementException(message);
    }
}
