package b0;

import d0.h1;
import java.util.List;
import v.b1;

/* loaded from: classes.dex */
public final class l0 implements h1, b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b1 f3378a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f3379b;

    public l0(b1 b1Var, m0 m0Var) {
        this.f3379b = m0Var;
        this.f3378a = b1Var;
    }

    @Override // d0.h1
    public final int a() {
        n nVar = (n) qg.x.K(this.f3379b.i().i());
        if (nVar != null) {
            return nVar.getIndex();
        }
        return 0;
    }

    @Override // d0.h1
    public final void b(int i10, int i11) {
        this.f3379b.j(i10, i11);
    }

    @Override // d0.h1
    public final int c() {
        return this.f3379b.h();
    }

    @Override // d0.h1
    public final int d(int i10) {
        n nVar;
        m0 m0Var = this.f3379b;
        z zVarI = m0Var.i();
        if (!zVarI.i().isEmpty()) {
            int iG = m0Var.g();
            if (i10 > a() || iG > i10) {
                return ((i10 - m0Var.g()) * a0.e(zVarI)) - m0Var.h();
            }
            List<n> listI = zVarI.i();
            int size = listI.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    nVar = null;
                    break;
                }
                nVar = listI.get(i11);
                if (nVar.getIndex() == i10) {
                    break;
                }
                i11++;
            }
            n nVar2 = nVar;
            if (nVar2 != null) {
                return nVar2.getOffset();
            }
        }
        return 0;
    }

    @Override // v.b1
    public final float e(float f10) {
        return this.f3378a.e(f10);
    }

    @Override // d0.h1
    public final int f() {
        return this.f3379b.g();
    }

    @Override // d0.h1
    public final int getItemCount() {
        return this.f3379b.i().f();
    }
}
