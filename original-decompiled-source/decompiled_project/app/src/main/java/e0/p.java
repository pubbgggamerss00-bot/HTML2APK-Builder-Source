package e0;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class p implements d0.m {

    /* renamed from: a, reason: collision with root package name */
    public final b f8270a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8271b;

    public p(b bVar, int i10) {
        this.f8270a = bVar;
        this.f8271b = i10;
    }

    @Override // d0.m
    public final int a() {
        return Math.min(r0.m() - 1, ((n) qg.x.J(this.f8270a.l().f())).getIndex() + this.f8271b);
    }

    @Override // d0.m
    public final int b() {
        int i10;
        b bVar = this.f8270a;
        if (bVar.l().f().size() == 0) {
            return 0;
        }
        c0 c0VarL = bVar.l();
        int iB = (int) (c0VarL.getOrientation() == v.t0.f30083a ? c0VarL.b() & BodyPartID.bodyIdMax : c0VarL.b() >> 32);
        int iH = bVar.l().h() + bVar.l().g();
        if (iH != 0 && (i10 = iB / iH) >= 1) {
            return i10;
        }
        return 1;
    }

    @Override // d0.m
    public final boolean c() {
        return !this.f8270a.l().f().isEmpty();
    }

    @Override // d0.m
    public final int d() {
        return Math.max(0, this.f8270a.f8147e - this.f8271b);
    }

    @Override // d0.m
    public final int getItemCount() {
        return this.f8270a.m();
    }
}
