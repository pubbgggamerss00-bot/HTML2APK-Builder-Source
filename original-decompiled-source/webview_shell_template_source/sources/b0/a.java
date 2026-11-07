package b0;

import androidx.activity.m;
import b0.d;
import b0.e;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a extends i {

    /* renamed from: t0, reason: collision with root package name */
    public int f1858t0 = 0;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f1859u0 = true;

    /* renamed from: v0, reason: collision with root package name */
    public int f1860v0 = 0;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f1861w0 = false;

    @Override // b0.e
    public final boolean A() {
        return this.f1861w0;
    }

    @Override // b0.e
    public final boolean B() {
        return this.f1861w0;
    }

    public final boolean T() {
        int i6;
        int i7;
        int i8;
        boolean z6 = true;
        int i9 = 0;
        while (true) {
            i6 = this.f1972s0;
            if (i9 >= i6) {
                break;
            }
            e eVar = this.f1971r0[i9];
            if ((this.f1859u0 || eVar.c()) && ((((i7 = this.f1858t0) == 0 || i7 == 1) && !eVar.A()) || (((i8 = this.f1858t0) == 2 || i8 == 3) && !eVar.B()))) {
                z6 = false;
            }
            i9++;
        }
        if (!z6 || i6 <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z7 = false;
        for (int i10 = 0; i10 < this.f1972s0; i10++) {
            e eVar2 = this.f1971r0[i10];
            if (this.f1859u0 || eVar2.c()) {
                d.a aVar = d.a.f1888v;
                d.a aVar2 = d.a.f1886t;
                d.a aVar3 = d.a.f1887u;
                d.a aVar4 = d.a.s;
                if (!z7) {
                    int i11 = this.f1858t0;
                    if (i11 == 0) {
                        iMax = eVar2.i(aVar4).d();
                    } else if (i11 == 1) {
                        iMax = eVar2.i(aVar3).d();
                    } else if (i11 == 2) {
                        iMax = eVar2.i(aVar2).d();
                    } else if (i11 == 3) {
                        iMax = eVar2.i(aVar).d();
                    }
                    z7 = true;
                }
                int i12 = this.f1858t0;
                if (i12 == 0) {
                    iMax = Math.min(iMax, eVar2.i(aVar4).d());
                } else if (i12 == 1) {
                    iMax = Math.max(iMax, eVar2.i(aVar3).d());
                } else if (i12 == 2) {
                    iMax = Math.min(iMax, eVar2.i(aVar2).d());
                } else if (i12 == 3) {
                    iMax = Math.max(iMax, eVar2.i(aVar).d());
                }
            }
        }
        int i13 = iMax + this.f1860v0;
        int i14 = this.f1858t0;
        if (i14 == 0 || i14 == 1) {
            J(i13, i13);
        } else {
            K(i13, i13);
        }
        this.f1861w0 = true;
        return true;
    }

    public final int U() {
        int i6 = this.f1858t0;
        if (i6 == 0 || i6 == 1) {
            return 0;
        }
        return (i6 == 2 || i6 == 3) ? 1 : -1;
    }

    @Override // b0.e
    public final void b(z.c cVar, boolean z6) {
        boolean z7;
        int i6;
        d[] dVarArr = this.R;
        d dVar = this.J;
        dVarArr[0] = dVar;
        int i7 = 2;
        d dVar2 = this.K;
        dVarArr[2] = dVar2;
        d dVar3 = this.L;
        dVarArr[1] = dVar3;
        d dVar4 = this.M;
        dVarArr[3] = dVar4;
        for (d dVar5 : dVarArr) {
            dVar5.f1885i = cVar.k(dVar5);
        }
        int i8 = this.f1858t0;
        if (i8 < 0 || i8 >= 4) {
            return;
        }
        d dVar6 = dVarArr[i8];
        if (!this.f1861w0) {
            T();
        }
        if (this.f1861w0) {
            this.f1861w0 = false;
            int i9 = this.f1858t0;
            if (i9 == 0 || i9 == 1) {
                cVar.d(dVar.f1885i, this.f1894a0);
                cVar.d(dVar3.f1885i, this.f1894a0);
                return;
            } else {
                if (i9 == 2 || i9 == 3) {
                    cVar.d(dVar2.f1885i, this.f1896b0);
                    cVar.d(dVar4.f1885i, this.f1896b0);
                    return;
                }
                return;
            }
        }
        for (int i10 = 0; i10 < this.f1972s0; i10++) {
            e eVar = this.f1971r0[i10];
            if (this.f1859u0 || eVar.c()) {
                int i11 = this.f1858t0;
                e.a aVar = e.a.f1934u;
                if (((i11 == 0 || i11 == 1) && eVar.U[0] == aVar && eVar.J.f1883f != null && eVar.L.f1883f != null) || ((i11 == 2 || i11 == 3) && eVar.U[1] == aVar && eVar.K.f1883f != null && eVar.M.f1883f != null)) {
                    z7 = true;
                    break;
                }
            }
        }
        z7 = false;
        boolean z8 = dVar.g() || dVar3.g();
        boolean z9 = dVar2.g() || dVar4.g();
        int i12 = !(!z7 && (((i6 = this.f1858t0) == 0 && z8) || ((i6 == 2 && z9) || ((i6 == 1 && z8) || (i6 == 3 && z9))))) ? 4 : 5;
        int i13 = 0;
        while (i13 < this.f1972s0) {
            e eVar2 = this.f1971r0[i13];
            if (this.f1859u0 || eVar2.c()) {
                z.e eVarK = cVar.k(eVar2.R[this.f1858t0]);
                d[] dVarArr2 = eVar2.R;
                int i14 = this.f1858t0;
                d dVar7 = dVarArr2[i14];
                dVar7.f1885i = eVarK;
                d dVar8 = dVar7.f1883f;
                int i15 = (dVar8 == null || dVar8.f1881d != this) ? 0 : dVar7.f1884g;
                if (i14 == 0 || i14 == i7) {
                    z.e eVar3 = dVar6.f1885i;
                    int i16 = this.f1860v0 - i15;
                    z.b bVarL = cVar.l();
                    z.e eVarM = cVar.m();
                    eVarM.f15415v = 0;
                    bVarL.d(eVar3, eVarK, eVarM, i16);
                    cVar.c(bVarL);
                } else {
                    z.e eVar4 = dVar6.f1885i;
                    int i17 = this.f1860v0 + i15;
                    z.b bVarL2 = cVar.l();
                    z.e eVarM2 = cVar.m();
                    eVarM2.f15415v = 0;
                    bVarL2.c(eVar4, eVarK, eVarM2, i17);
                    cVar.c(bVarL2);
                }
                cVar.e(dVar6.f1885i, eVarK, this.f1860v0 + i15, i12);
            }
            i13++;
            i7 = 2;
        }
        int i18 = this.f1858t0;
        if (i18 == 0) {
            cVar.e(dVar3.f1885i, dVar.f1885i, 0, 8);
            cVar.e(dVar.f1885i, this.V.L.f1885i, 0, 4);
            cVar.e(dVar.f1885i, this.V.J.f1885i, 0, 0);
            return;
        }
        if (i18 == 1) {
            cVar.e(dVar.f1885i, dVar3.f1885i, 0, 8);
            cVar.e(dVar.f1885i, this.V.J.f1885i, 0, 4);
            cVar.e(dVar.f1885i, this.V.L.f1885i, 0, 0);
        } else if (i18 == 2) {
            cVar.e(dVar4.f1885i, dVar2.f1885i, 0, 8);
            cVar.e(dVar2.f1885i, this.V.M.f1885i, 0, 4);
            cVar.e(dVar2.f1885i, this.V.K.f1885i, 0, 0);
        } else if (i18 == 3) {
            cVar.e(dVar2.f1885i, dVar4.f1885i, 0, 8);
            cVar.e(dVar2.f1885i, this.V.K.f1885i, 0, 4);
            cVar.e(dVar2.f1885i, this.V.M.f1885i, 0, 0);
        }
    }

    @Override // b0.e
    public final boolean c() {
        return true;
    }

    @Override // b0.e
    public final String toString() {
        String strE = m.e(new StringBuilder("[Barrier] "), this.f1911j0, " {");
        for (int i6 = 0; i6 < this.f1972s0; i6++) {
            e eVar = this.f1971r0[i6];
            if (i6 > 0) {
                strE = androidx.camera.core.c.b(strE, ", ");
            }
            strE = strE + eVar.f1911j0;
        }
        return androidx.camera.core.c.b(strE, "}");
    }
}
