package r;

/* loaded from: classes.dex */
public final class l2 {

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.jvm.internal.s f22881a;

    /* renamed from: b, reason: collision with root package name */
    public final s.e0<f3.m> f22882b;

    /* JADX WARN: Multi-variable type inference failed */
    public l2(eh.l<? super f3.p, f3.m> lVar, s.e0<f3.m> e0Var) {
        this.f22881a = (kotlin.jvm.internal.s) lVar;
        this.f22882b = e0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2)) {
            return false;
        }
        l2 l2Var = (l2) obj;
        return this.f22881a.equals(l2Var.f22881a) && this.f22882b.equals(l2Var.f22882b);
    }

    public final int hashCode() {
        return this.f22882b.hashCode() + (this.f22881a.hashCode() * 31);
    }

    public final String toString() {
        return "Slide(slideOffset=" + this.f22881a + ", animationSpec=" + this.f22882b + ')';
    }
}
