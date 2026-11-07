package t2;

import t2.b;

/* loaded from: classes.dex */
public final class e0 implements b.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f27798a;

    public /* synthetic */ e0(String str) {
        this.f27798a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e0) {
            return kotlin.jvm.internal.r.a(this.f27798a, ((e0) obj).f27798a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f27798a.hashCode();
    }

    public final String toString() {
        return "StringAnnotation(value=" + this.f27798a + ')';
    }
}
