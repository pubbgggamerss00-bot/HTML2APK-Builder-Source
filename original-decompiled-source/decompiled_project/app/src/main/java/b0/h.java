package b0;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class h implements d0.m {

    /* renamed from: a, reason: collision with root package name */
    public final m0 f3362a;

    public h(m0 m0Var) {
        this.f3362a = m0Var;
    }

    @Override // d0.m
    public final int a() {
        return Math.min(getItemCount() - 1, ((n) qg.x.J(this.f3362a.i().i())).getIndex());
    }

    @Override // d0.m
    public final int b() {
        int i10;
        m0 m0Var = this.f3362a;
        if (m0Var.i().i().isEmpty()) {
            return 0;
        }
        z zVarI = m0Var.i();
        int iB = (int) (zVarI.getOrientation() == v.t0.f30083a ? zVarI.b() & BodyPartID.bodyIdMax : zVarI.b() >> 32);
        int iE = a0.e(m0Var.i());
        if (iE != 0 && (i10 = iB / iE) >= 1) {
            return i10;
        }
        return 1;
    }

    @Override // d0.m
    public final boolean c() {
        return !this.f3362a.i().i().isEmpty();
    }

    @Override // d0.m
    public final int d() {
        return Math.max(0, this.f3362a.g());
    }

    @Override // d0.m
    public final int getItemCount() {
        return this.f3362a.i().f();
    }
}
