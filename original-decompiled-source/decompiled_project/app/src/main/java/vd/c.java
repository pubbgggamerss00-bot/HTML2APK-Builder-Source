package vd;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f30749a;

    /* renamed from: b, reason: collision with root package name */
    public final Map<Class<?>, Object> f30750b;

    public c(String str, Map<Class<?>, Object> map) {
        this.f30749a = str;
        this.f30750b = map;
    }

    public static c a(String str) {
        return new c(str, Collections.EMPTY_MAP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f30749a.equals(cVar.f30749a) && this.f30750b.equals(cVar.f30750b);
    }

    public final int hashCode() {
        return this.f30750b.hashCode() + (this.f30749a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f30749a + ", properties=" + this.f30750b.values() + "}";
    }
}
