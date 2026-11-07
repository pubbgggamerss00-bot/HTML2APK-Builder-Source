package z;

import z.g0;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final g0.a f34550a;

    /* renamed from: b, reason: collision with root package name */
    public g2.k0 f34551b;

    /* renamed from: c, reason: collision with root package name */
    public g2.g1 f34552c;

    /* renamed from: d, reason: collision with root package name */
    public g2.k0 f34553d;

    /* renamed from: e, reason: collision with root package name */
    public g2.g1 f34554e;

    /* renamed from: f, reason: collision with root package name */
    public p.g f34555f;

    /* renamed from: g, reason: collision with root package name */
    public p.g f34556g;

    public j0(g0.a aVar) {
        this.f34550a = aVar;
    }

    public final p.g a(int i10, int i11, boolean z10) {
        int iOrdinal = this.f34550a.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            return null;
        }
        if (iOrdinal == 2) {
            if (z10) {
                return this.f34555f;
            }
            return null;
        }
        if (iOrdinal != 3) {
            throw new pg.l();
        }
        if (z10) {
            return this.f34555f;
        }
        if (i10 + 1 < 0 || i11 < 0) {
            return null;
        }
        return this.f34556g;
    }

    public final void b(g2.p pVar, g2.p pVar2, long j10) {
        long jB = p1.a.b(j10, z0.f34696a);
        if (pVar != null) {
            int iH = f3.b.h(jB);
            int i10 = f0.f34505a;
            int iJ = pVar.J(iH);
            this.f34555f = new p.g(p.g.a(iJ, pVar.b0(iJ)));
            this.f34551b = pVar instanceof g2.k0 ? (g2.k0) pVar : null;
            this.f34552c = null;
        }
        if (pVar2 != null) {
            int iH2 = f3.b.h(jB);
            int i11 = f0.f34505a;
            int iJ2 = pVar2.J(iH2);
            this.f34556g = new p.g(p.g.a(iJ2, pVar2.b0(iJ2)));
            this.f34553d = pVar2 instanceof g2.k0 ? (g2.k0) pVar2 : null;
            this.f34554e = null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j0) && this.f34550a == ((j0) obj).f34550a;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + androidx.datastore.preferences.protobuf.a1.a(0, this.f34550a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "FlowLayoutOverflowState(type=" + this.f34550a + ", minLinesToShowCollapse=0, minCrossAxisSizeToShowCollapse=0)";
    }
}
