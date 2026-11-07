package ve;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class r0 extends n0 {

    /* renamed from: f, reason: collision with root package name */
    public int[] f30936f;

    /* renamed from: g, reason: collision with root package name */
    public short[] f30937g;

    /* renamed from: h, reason: collision with root package name */
    public short[] f30938h;

    /* renamed from: i, reason: collision with root package name */
    public int f30939i;

    @Override // ve.n0
    public final void a(p0 p0Var, k0 k0Var) throws IOException {
        int i10;
        q0 q0Var = (q0) p0Var.Z("vhea");
        if (q0Var == null) {
            throw new IOException("Could not get vhea table");
        }
        this.f30939i = q0Var.f30918f;
        int iE = p0Var.E();
        int i11 = this.f30939i;
        this.f30936f = new int[i11];
        this.f30937g = new short[i11];
        int i12 = 0;
        int i13 = 0;
        while (true) {
            i10 = this.f30939i;
            if (i12 >= i10) {
                break;
            }
            this.f30936f[i12] = k0Var.i0();
            this.f30937g[i12] = k0Var.Z();
            i13 += 4;
            i12++;
        }
        if (i13 < this.f30854c) {
            int i14 = iE - i10;
            if (i14 >= 0) {
                iE = i14;
            }
            this.f30938h = new short[iE];
            for (int i15 = 0; i15 < iE; i15++) {
                if (i13 < this.f30854c) {
                    this.f30938h[i15] = k0Var.Z();
                    i13 += 2;
                }
            }
        }
        this.f30855d = true;
    }
}
