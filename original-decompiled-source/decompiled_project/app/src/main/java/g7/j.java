package g7;

import java.util.LinkedHashMap;
import java.util.Map;
import qg.k0;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    public static final j f11509b = new j(b8.c.b(new a().f11511a));

    /* renamed from: a, reason: collision with root package name */
    public final Map<b<?>, Object> f11510a;

    public static final class b<T> {

        /* renamed from: a, reason: collision with root package name */
        public final T f11512a;

        public b(T t3) {
            this.f11512a = t3;
        }
    }

    public j(Map map) {
        this.f11510a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && kotlin.jvm.internal.r.a(this.f11510a, ((j) obj).f11510a);
    }

    public final int hashCode() {
        return this.f11510a.hashCode();
    }

    public final String toString() {
        return "Extras(data=" + this.f11510a + ')';
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final LinkedHashMap f11511a;

        public a() {
            this.f11511a = new LinkedHashMap();
        }

        public a(j jVar) {
            this.f11511a = k0.k(jVar.f11510a);
        }
    }
}
