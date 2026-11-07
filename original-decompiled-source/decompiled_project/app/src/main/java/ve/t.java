package ve;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class t extends n0 {

    /* renamed from: f, reason: collision with root package name */
    public long[] f30945f;

    @Override // ve.n0
    public final void a(p0 p0Var, k0 k0Var) throws IOException {
        q qVarL = p0Var.l();
        if (qVarL == null) {
            throw new IOException("Could not get head table");
        }
        int iE = p0Var.E() + 1;
        this.f30945f = new long[iE];
        for (int i10 = 0; i10 < iE; i10++) {
            short s10 = qVarL.f30916t;
            if (s10 == 0) {
                this.f30945f[i10] = k0Var.i0() * 2;
            } else {
                if (s10 != 1) {
                    throw new IOException("Error:TTF.loca unknown offset format.");
                }
                this.f30945f[i10] = k0Var.g0();
            }
        }
        this.f30855d = true;
    }
}
