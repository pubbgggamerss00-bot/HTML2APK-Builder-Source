package i0;

/* loaded from: classes.dex */
public final class g2 {

    /* renamed from: c, reason: collision with root package name */
    public static final g2 f13294c = new g2(null, null, 63);

    /* renamed from: a, reason: collision with root package name */
    public final eh.l<f2, pg.f0> f13295a;

    /* renamed from: b, reason: collision with root package name */
    public final eh.l<f2, pg.f0> f13296b;

    public g2(eh.l lVar, eh.l lVar2, int i10) {
        lVar = (i10 & 1) != 0 ? null : lVar;
        lVar2 = (i10 & 2) != 0 ? null : lVar2;
        this.f13295a = lVar;
        this.f13296b = lVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2)) {
            return false;
        }
        g2 g2Var = (g2) obj;
        return this.f13295a == g2Var.f13295a && this.f13296b == g2Var.f13296b;
    }

    public final int hashCode() {
        eh.l<f2, pg.f0> lVar = this.f13295a;
        int iHashCode = (lVar != null ? lVar.hashCode() : 0) * 31;
        eh.l<f2, pg.f0> lVar2 = this.f13296b;
        return (iHashCode + (lVar2 != null ? lVar2.hashCode() : 0)) * 923521;
    }
}
