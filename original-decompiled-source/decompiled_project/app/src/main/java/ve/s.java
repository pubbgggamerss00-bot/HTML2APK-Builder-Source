package ve;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class s extends n0 {

    /* renamed from: f, reason: collision with root package name */
    public int[] f30940f;

    /* renamed from: g, reason: collision with root package name */
    public short[] f30941g;

    /* renamed from: h, reason: collision with root package name */
    public short[] f30942h;

    /* renamed from: i, reason: collision with root package name */
    public int f30943i;

    @Override // ve.n0
    public final void a(p0 p0Var, k0 k0Var) throws IOException {
        int i10;
        r rVar = (r) p0Var.Z("hhea");
        if (rVar == null) {
            throw new IOException("Could not get hmtx table");
        }
        this.f30943i = rVar.f30935v;
        int iE = p0Var.E();
        int i11 = this.f30943i;
        this.f30940f = new int[i11];
        this.f30941g = new short[i11];
        int i12 = 0;
        int i13 = 0;
        while (true) {
            i10 = this.f30943i;
            if (i12 >= i10) {
                break;
            }
            this.f30940f[i12] = k0Var.i0();
            this.f30941g[i12] = k0Var.Z();
            i13 += 4;
            i12++;
        }
        int i14 = iE - i10;
        if (i14 >= 0) {
            iE = i14;
        }
        this.f30942h = new short[iE];
        if (i13 < this.f30854c) {
            for (int i15 = 0; i15 < iE; i15++) {
                if (i13 < this.f30854c) {
                    this.f30942h[i15] = k0Var.Z();
                    i13 += 2;
                }
            }
        }
        this.f30855d = true;
    }

    public final int b(int i10) {
        int[] iArr = this.f30940f;
        if (iArr.length == 0) {
            return 250;
        }
        return i10 < this.f30943i ? iArr[i10] : iArr[iArr.length - 1];
    }
}
