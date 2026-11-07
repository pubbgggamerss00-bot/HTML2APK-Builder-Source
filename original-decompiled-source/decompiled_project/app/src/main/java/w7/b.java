package w7;

import ph.s1;

/* loaded from: classes.dex */
public final class b implements n {

    /* renamed from: a, reason: collision with root package name */
    public final s1 f31320a;

    public /* synthetic */ b(s1 s1Var) {
        this.f31320a = s1Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return kotlin.jvm.internal.r.a(this.f31320a, ((b) obj).f31320a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f31320a.hashCode();
    }

    public final String toString() {
        return "BaseRequestDelegate(job=" + this.f31320a + ')';
    }
}
