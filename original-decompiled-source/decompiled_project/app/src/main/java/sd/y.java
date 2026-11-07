package sd;

import java.lang.annotation.Annotation;

/* loaded from: classes2.dex */
public final class y<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Class<? extends Annotation> f24887a;

    /* renamed from: b, reason: collision with root package name */
    public final Class<T> f24888b;

    public @interface a {
    }

    public y(Class<? extends Annotation> cls, Class<T> cls2) {
        this.f24887a = cls;
        this.f24888b = cls2;
    }

    public static <T> y<T> a(Class<T> cls) {
        return new y<>(a.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y.class != obj.getClass()) {
            return false;
        }
        y yVar = (y) obj;
        if (this.f24888b.equals(yVar.f24888b)) {
            return this.f24887a.equals(yVar.f24887a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f24887a.hashCode() + (this.f24888b.hashCode() * 31);
    }

    public final String toString() {
        Class<T> cls = this.f24888b;
        Class<? extends Annotation> cls2 = this.f24887a;
        if (cls2 == a.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
