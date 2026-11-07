package q2;

import pg.f;

/* loaded from: classes.dex */
public final class a<T extends pg.f<? extends Boolean>> {

    /* renamed from: a, reason: collision with root package name */
    public final String f21752a;

    /* renamed from: b, reason: collision with root package name */
    public final T f21753b;

    public a(String str, T t3) {
        this.f21752a = str;
        this.f21753b = t3;
    }

    public final String a() {
        return this.f21752a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return kotlin.jvm.internal.r.a(this.f21752a, aVar.f21752a) && kotlin.jvm.internal.r.a(this.f21753b, aVar.f21753b);
    }

    public final int hashCode() {
        String str = this.f21752a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        T t3 = this.f21753b;
        return iHashCode + (t3 != null ? t3.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.f21752a + ", action=" + this.f21753b + ')';
    }
}
