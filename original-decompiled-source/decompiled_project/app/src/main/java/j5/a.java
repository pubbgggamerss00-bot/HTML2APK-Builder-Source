package j5;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f15158a = new LinkedHashMap();

    /* renamed from: j5.a$a, reason: collision with other inner class name */
    public static final class C0143a extends a {

        /* renamed from: b, reason: collision with root package name */
        public static final C0143a f15159b = new C0143a();

        @Override // j5.a
        public final <T> T a(b<T> bVar) {
            return null;
        }
    }

    public interface b<T> {
    }

    public abstract <T> T a(b<T> bVar);

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return r.a(this.f15158a, ((a) obj).f15158a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15158a.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.f15158a + ')';
    }
}
