package z;

/* loaded from: classes.dex */
public final class t implements h2.d {

    /* renamed from: b, reason: collision with root package name */
    public final eh.l<u1, pg.f0> f34634b;

    /* renamed from: c, reason: collision with root package name */
    public u1 f34635c;

    /* JADX WARN: Multi-variable type inference failed */
    public t(eh.l<? super u1, pg.f0> lVar) {
        this.f34634b = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && ((t) obj).f34634b == this.f34634b;
    }

    public final int hashCode() {
        return this.f34634b.hashCode();
    }

    @Override // h2.d
    public final void p(h2.h hVar) {
        u1 u1Var = (u1) hVar.y(y1.f34693a);
        if (kotlin.jvm.internal.r.a(u1Var, this.f34635c)) {
            return;
        }
        this.f34635c = u1Var;
        this.f34634b.invoke(u1Var);
    }
}
