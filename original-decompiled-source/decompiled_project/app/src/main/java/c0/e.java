package c0;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class e implements d0.m {

    /* renamed from: a, reason: collision with root package name */
    public final w0 f4373a;

    public e(w0 w0Var) {
        this.f4373a = w0Var;
    }

    @Override // d0.m
    public final int a() {
        return ((o) qg.x.J(this.f4373a.i().i())).getIndex();
    }

    @Override // d0.m
    public final int b() {
        int i10;
        w0 w0Var = this.f4373a;
        if (w0Var.i().i().isEmpty()) {
            return 0;
        }
        f0 f0VarI = w0Var.i();
        int iB = (int) (f0VarI.getOrientation() == v.t0.f30083a ? f0VarI.b() & BodyPartID.bodyIdMax : f0VarI.b() >> 32);
        int iE = g0.e(w0Var.i());
        if (iE != 0 && (i10 = iB / iE) >= 1) {
            return i10;
        }
        return 1;
    }

    @Override // d0.m
    public final boolean c() {
        return !this.f4373a.i().i().isEmpty();
    }

    @Override // d0.m
    public final int d() {
        return this.f4373a.g();
    }

    @Override // d0.m
    public final int getItemCount() {
        return this.f4373a.i().f();
    }
}
