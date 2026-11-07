package q2;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f21764a;

    /* renamed from: b, reason: collision with root package name */
    public final eh.a<Boolean> f21765b;

    public e(String str, eh.a<Boolean> aVar) {
        this.f21764a = str;
        this.f21765b = aVar;
    }

    public final String a() {
        return this.f21764a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return kotlin.jvm.internal.r.a(this.f21764a, eVar.f21764a) && this.f21765b == eVar.f21765b;
    }

    public final int hashCode() {
        return this.f21765b.hashCode() + (this.f21764a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomAccessibilityAction(label=" + this.f21764a + ", action=" + this.f21765b + ')';
    }
}
