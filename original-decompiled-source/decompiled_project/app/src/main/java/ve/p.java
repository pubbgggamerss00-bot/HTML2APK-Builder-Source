package ve;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class p extends n0 {

    /* renamed from: f, reason: collision with root package name */
    public k[] f30891f;

    /* renamed from: g, reason: collision with root package name */
    public k0 f30892g;

    /* renamed from: h, reason: collision with root package name */
    public t f30893h;

    /* renamed from: i, reason: collision with root package name */
    public int f30894i;

    /* renamed from: j, reason: collision with root package name */
    public int f30895j;

    /* renamed from: k, reason: collision with root package name */
    public s f30896k;

    @Override // ve.n0
    public final void a(p0 p0Var, k0 k0Var) throws IOException {
        this.f30893h = (t) p0Var.Z("loca");
        int iE = p0Var.E();
        this.f30894i = iE;
        if (iE < 5000) {
            this.f30891f = new k[iE];
        }
        this.f30892g = k0Var;
        this.f30896k = this.f30856e.p();
        this.f30855d = true;
    }

    public final k b(int i10) throws IOException {
        k kVarC;
        int i11;
        k kVar;
        if (i10 < 0 || i10 >= this.f30894i) {
            return null;
        }
        k[] kVarArr = this.f30891f;
        if (kVarArr != null && (kVar = kVarArr[i10]) != null) {
            return kVar;
        }
        synchronized (this.f30892g) {
            try {
                long[] jArr = this.f30893h.f30945f;
                if (jArr[i10] == jArr[i10 + 1]) {
                    kVarC = new k();
                    kVarC.f30836c = new j();
                } else {
                    long jH = this.f30892g.h();
                    this.f30892g.seek(this.f30853b + jArr[i10]);
                    kVarC = c(i10);
                    this.f30892g.seek(jH);
                }
                k[] kVarArr2 = this.f30891f;
                if (kVarArr2 != null && kVarArr2[i10] == null && (i11 = this.f30895j) < 100) {
                    kVarArr2[i10] = kVarC;
                    this.f30895j = i11 + 1;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return kVarC;
    }

    public final k c(int i10) throws IOException {
        k kVar = new k();
        s sVar = this.f30896k;
        short s10 = 0;
        if (sVar != null) {
            short[] sArr = sVar.f30941g;
            if (sArr.length != 0) {
                int i11 = sVar.f30943i;
                s10 = i10 < i11 ? sArr[i10] : sVar.f30942h[i10 - i11];
            }
        }
        k0 k0Var = this.f30892g;
        kVar.f30835b = k0Var.Z();
        kVar.f30834a = k0Var.Z();
        k0Var.Z();
        k0Var.Z();
        k0Var.Z();
        short s11 = kVar.f30834a;
        short s12 = kVar.f30835b;
        if (s12 >= 0) {
            kVar.f30836c = new j(s12, k0Var, (short) (s10 - s11));
        } else {
            kVar.f30836c = new h(k0Var, this);
        }
        if (kVar.f30836c.c()) {
            kVar.f30836c.g();
        }
        return kVar;
    }
}
