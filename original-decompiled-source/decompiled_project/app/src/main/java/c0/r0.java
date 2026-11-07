package c0;

import d0.h1;
import java.util.List;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class r0 implements h1, v.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v.b1 f4478a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0 f4479b;

    public r0(v.b1 b1Var, w0 w0Var) {
        this.f4479b = w0Var;
        this.f4478a = b1Var;
    }

    @Override // d0.h1
    public final int a() {
        o oVar = (o) qg.x.K(this.f4479b.i().i());
        if (oVar != null) {
            return oVar.getIndex();
        }
        return 0;
    }

    @Override // d0.h1
    public final void b(int i10, int i11) {
        this.f4479b.k(i10, i11);
    }

    @Override // d0.h1
    public final int c() {
        return this.f4479b.h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // d0.h1
    public final int d(int i10) {
        Integer numValueOf;
        o oVar;
        w0 w0Var = this.f4479b;
        f0 f0VarI = w0Var.i();
        if (!f0VarI.i().isEmpty()) {
            int iG = w0Var.g();
            if (i10 > a() || iG > i10) {
                int i11 = ((l0) w0Var.f4509e.getValue()).f4422j;
                return (((((i11 - 1) * (i10 < w0Var.g() ? -1 : 1)) + (i10 - w0Var.g())) / i11) * g0.e(f0VarI)) - w0Var.h();
            }
            List<o> listI = f0VarI.i();
            int size = listI.size();
            int i12 = 0;
            while (true) {
                numValueOf = null;
                if (i12 >= size) {
                    oVar = null;
                    break;
                }
                oVar = listI.get(i12);
                if (oVar.getIndex() == i10) {
                    break;
                }
                i12++;
            }
            o oVar2 = oVar;
            if (f0VarI.getOrientation() == v.t0.f30083a) {
                if (oVar2 != null) {
                    numValueOf = Integer.valueOf((int) (oVar2.l() & BodyPartID.bodyIdMax));
                }
            } else if (oVar2 != null) {
                numValueOf = Integer.valueOf((int) (oVar2.l() >> 32));
            }
            if (numValueOf != null) {
                return numValueOf.intValue();
            }
        }
        return 0;
    }

    @Override // v.b1
    public final float e(float f10) {
        return this.f4478a.e(f10);
    }

    @Override // d0.h1
    public final int f() {
        return this.f4479b.g();
    }

    @Override // d0.h1
    public final int getItemCount() {
        return this.f4479b.i().f();
    }
}
