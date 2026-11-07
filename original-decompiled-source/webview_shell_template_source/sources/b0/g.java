package b0;

import androidx.constraintlayout.widget.ConstraintLayout;
import b0.e;
import c0.b;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class g extends k {

    /* renamed from: b1, reason: collision with root package name */
    public e[] f1946b1;
    public int E0 = -1;
    public int F0 = -1;
    public int G0 = -1;
    public int H0 = -1;
    public int I0 = -1;
    public int J0 = -1;
    public float K0 = 0.5f;
    public float L0 = 0.5f;
    public float M0 = 0.5f;
    public float N0 = 0.5f;
    public float O0 = 0.5f;
    public float P0 = 0.5f;
    public int Q0 = 0;
    public int R0 = 0;
    public int S0 = 2;
    public int T0 = 2;
    public int U0 = 0;
    public int V0 = -1;
    public int W0 = 0;
    public final ArrayList<a> X0 = new ArrayList<>();
    public e[] Y0 = null;
    public e[] Z0 = null;

    /* renamed from: a1, reason: collision with root package name */
    public int[] f1945a1 = null;

    /* renamed from: c1, reason: collision with root package name */
    public int f1947c1 = 0;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a {

        /* renamed from: a, reason: collision with root package name */
        public int f1948a;

        /* renamed from: d, reason: collision with root package name */
        public d f1951d;

        /* renamed from: e, reason: collision with root package name */
        public d f1952e;

        /* renamed from: f, reason: collision with root package name */
        public d f1953f;

        /* renamed from: g, reason: collision with root package name */
        public d f1954g;
        public int h;

        /* renamed from: i, reason: collision with root package name */
        public int f1955i;

        /* renamed from: j, reason: collision with root package name */
        public int f1956j;

        /* renamed from: k, reason: collision with root package name */
        public int f1957k;

        /* renamed from: q, reason: collision with root package name */
        public int f1963q;

        /* renamed from: b, reason: collision with root package name */
        public e f1949b = null;

        /* renamed from: c, reason: collision with root package name */
        public int f1950c = 0;

        /* renamed from: l, reason: collision with root package name */
        public int f1958l = 0;

        /* renamed from: m, reason: collision with root package name */
        public int f1959m = 0;

        /* renamed from: n, reason: collision with root package name */
        public int f1960n = 0;

        /* renamed from: o, reason: collision with root package name */
        public int f1961o = 0;

        /* renamed from: p, reason: collision with root package name */
        public int f1962p = 0;

        public a(int i6, d dVar, d dVar2, d dVar3, d dVar4, int i7) {
            this.f1948a = i6;
            this.f1951d = dVar;
            this.f1952e = dVar2;
            this.f1953f = dVar3;
            this.f1954g = dVar4;
            this.h = g.this.f1978x0;
            this.f1955i = g.this.f1974t0;
            this.f1956j = g.this.f1979y0;
            this.f1957k = g.this.f1975u0;
            this.f1963q = i7;
        }

        public final void a(e eVar) {
            int i6 = this.f1948a;
            e.a aVar = e.a.f1934u;
            g gVar = g.this;
            if (i6 == 0) {
                int iW = gVar.W(eVar, this.f1963q);
                if (eVar.U[0] == aVar) {
                    this.f1962p++;
                    iW = 0;
                }
                this.f1958l = iW + (eVar.f1909i0 != 8 ? gVar.Q0 : 0) + this.f1958l;
                int iV = gVar.V(eVar, this.f1963q);
                if (this.f1949b == null || this.f1950c < iV) {
                    this.f1949b = eVar;
                    this.f1950c = iV;
                    this.f1959m = iV;
                }
            } else {
                int iW2 = gVar.W(eVar, this.f1963q);
                int iV2 = gVar.V(eVar, this.f1963q);
                if (eVar.U[1] == aVar) {
                    this.f1962p++;
                    iV2 = 0;
                }
                this.f1959m = iV2 + (eVar.f1909i0 != 8 ? gVar.R0 : 0) + this.f1959m;
                if (this.f1949b == null || this.f1950c < iW2) {
                    this.f1949b = eVar;
                    this.f1950c = iW2;
                    this.f1958l = iW2;
                }
            }
            this.f1961o++;
        }

        public final void b(int i6, boolean z6, boolean z7) {
            g gVar;
            int i7;
            int i8;
            e eVar;
            boolean z8;
            int i9;
            int i10;
            char c7;
            float f6;
            float f7;
            float f8;
            int i11;
            float f9;
            float f10;
            int i12;
            int i13 = this.f1961o;
            int i14 = 0;
            while (true) {
                gVar = g.this;
                if (i14 >= i13 || (i12 = this.f1960n + i14) >= gVar.f1947c1) {
                    break;
                }
                e eVar2 = gVar.f1946b1[i12];
                if (eVar2 != null) {
                    eVar2.D();
                }
                i14++;
            }
            if (i13 == 0 || this.f1949b == null) {
                return;
            }
            boolean z9 = z7 && i6 == 0;
            int i15 = -1;
            int i16 = -1;
            for (int i17 = 0; i17 < i13; i17++) {
                int i18 = this.f1960n + (z6 ? (i13 - 1) - i17 : i17);
                if (i18 >= gVar.f1947c1) {
                    break;
                }
                e eVar3 = gVar.f1946b1[i18];
                if (eVar3 != null && eVar3.f1909i0 == 0) {
                    if (i15 == -1) {
                        i15 = i17;
                    }
                    i16 = i17;
                }
            }
            if (this.f1948a == 0) {
                e eVar4 = this.f1949b;
                eVar4.f1915l0 = gVar.F0;
                d dVar = eVar4.M;
                d dVar2 = eVar4.K;
                int i19 = this.f1955i;
                if (i6 > 0) {
                    i19 += gVar.R0;
                }
                dVar2.a(this.f1952e, i19);
                if (z7) {
                    dVar.a(this.f1954g, this.f1957k);
                }
                if (i6 > 0) {
                    this.f1952e.f1881d.M.a(dVar2, 0);
                }
                if (gVar.T0 != 3 || eVar4.E) {
                    eVar = eVar4;
                } else {
                    for (int i20 = 0; i20 < i13; i20++) {
                        int i21 = this.f1960n + (z6 ? (i13 - 1) - i20 : i20);
                        if (i21 >= gVar.f1947c1) {
                            break;
                        }
                        eVar = gVar.f1946b1[i21];
                        if (eVar.E) {
                            break;
                        }
                    }
                    eVar = eVar4;
                }
                int i22 = 0;
                e eVar5 = null;
                while (i22 < i13) {
                    int i23 = z6 ? (i13 - 1) - i22 : i22;
                    int i24 = this.f1960n + i23;
                    if (i24 >= gVar.f1947c1) {
                        return;
                    }
                    e eVar6 = gVar.f1946b1[i24];
                    if (eVar6 == null) {
                        i10 = i13;
                        z8 = z9;
                        i9 = i16;
                        c7 = 3;
                    } else {
                        d dVar3 = eVar6.M;
                        d dVar4 = eVar6.K;
                        d dVar5 = eVar6.J;
                        z8 = z9;
                        if (i22 == 0) {
                            i9 = i16;
                            eVar6.f(dVar5, this.f1951d, this.h);
                        } else {
                            i9 = i16;
                        }
                        if (i23 == 0) {
                            int i25 = gVar.E0;
                            if (z6) {
                                f6 = 1.0f;
                                f7 = 1.0f - gVar.K0;
                            } else {
                                f6 = 1.0f;
                                f7 = gVar.K0;
                            }
                            if (this.f1960n == 0) {
                                i11 = gVar.G0;
                                f8 = f7;
                                if (i11 != -1) {
                                    if (z6) {
                                        f10 = gVar.M0;
                                        f9 = f6 - f10;
                                        eVar6.f1913k0 = i11;
                                        eVar6.f1904f0 = f9;
                                    } else {
                                        f9 = gVar.M0;
                                        eVar6.f1913k0 = i11;
                                        eVar6.f1904f0 = f9;
                                    }
                                }
                            } else {
                                f8 = f7;
                            }
                            if (!z7 || (i11 = gVar.I0) == -1) {
                                i11 = i25;
                                f9 = f8;
                            } else if (z6) {
                                f10 = gVar.O0;
                                f9 = f6 - f10;
                            } else {
                                f9 = gVar.O0;
                            }
                            eVar6.f1913k0 = i11;
                            eVar6.f1904f0 = f9;
                        }
                        if (i22 == i13 - 1) {
                            i10 = i13;
                            eVar6.f(eVar6.L, this.f1953f, this.f1956j);
                        } else {
                            i10 = i13;
                        }
                        if (eVar5 != null) {
                            d dVar6 = eVar5.L;
                            dVar5.a(dVar6, gVar.Q0);
                            if (i22 == i15) {
                                int i26 = this.h;
                                if (dVar5.h()) {
                                    dVar5.h = i26;
                                }
                            }
                            dVar6.a(dVar5, 0);
                            if (i22 == i9 + 1) {
                                int i27 = this.f1956j;
                                if (dVar6.h()) {
                                    dVar6.h = i27;
                                }
                            }
                        }
                        if (eVar6 != eVar4) {
                            int i28 = gVar.T0;
                            c7 = 3;
                            if (i28 == 3 && eVar.E && eVar6 != eVar && eVar6.E) {
                                eVar6.N.a(eVar.N, 0);
                            } else if (i28 == 0) {
                                dVar4.a(dVar2, 0);
                            } else if (i28 == 1) {
                                dVar3.a(dVar, 0);
                            } else if (z8) {
                                dVar4.a(this.f1952e, this.f1955i);
                                dVar3.a(this.f1954g, this.f1957k);
                            } else {
                                dVar4.a(dVar2, 0);
                                dVar3.a(dVar, 0);
                            }
                        } else {
                            c7 = 3;
                        }
                        eVar5 = eVar6;
                    }
                    i22++;
                    z9 = z8;
                    i16 = i9;
                    i13 = i10;
                }
                return;
            }
            int i29 = i13;
            boolean z10 = z9;
            int i30 = i16;
            e eVar7 = this.f1949b;
            eVar7.f1913k0 = gVar.E0;
            d dVar7 = eVar7.J;
            d dVar8 = eVar7.L;
            int i31 = this.h;
            if (i6 > 0) {
                i31 += gVar.Q0;
            }
            if (z6) {
                dVar8.a(this.f1953f, i31);
                if (z7) {
                    dVar7.a(this.f1951d, this.f1956j);
                }
                if (i6 > 0) {
                    this.f1953f.f1881d.J.a(dVar8, 0);
                }
            } else {
                dVar7.a(this.f1951d, i31);
                if (z7) {
                    dVar8.a(this.f1953f, this.f1956j);
                }
                if (i6 > 0) {
                    this.f1951d.f1881d.L.a(dVar7, 0);
                }
            }
            int i32 = 0;
            e eVar8 = null;
            while (true) {
                int i33 = i29;
                if (i32 >= i33 || (i7 = this.f1960n + i32) >= gVar.f1947c1) {
                    return;
                }
                e eVar9 = gVar.f1946b1[i7];
                if (eVar9 == null) {
                    i29 = i33;
                } else {
                    d dVar9 = eVar9.K;
                    d dVar10 = eVar9.L;
                    d dVar11 = eVar9.J;
                    if (i32 == 0) {
                        eVar9.f(dVar9, this.f1952e, this.f1955i);
                        int i34 = gVar.F0;
                        float f11 = gVar.L0;
                        if (this.f1960n == 0) {
                            int i35 = gVar.H0;
                            i29 = i33;
                            i8 = -1;
                            if (i35 != -1) {
                                f11 = gVar.N0;
                            }
                            i34 = i35;
                            eVar9.f1915l0 = i34;
                            eVar9.f1906g0 = f11;
                        } else {
                            i29 = i33;
                            i8 = -1;
                        }
                        if (z7 && (i35 = gVar.J0) != i8) {
                            f11 = gVar.P0;
                            i34 = i35;
                        }
                        eVar9.f1915l0 = i34;
                        eVar9.f1906g0 = f11;
                    } else {
                        i29 = i33;
                    }
                    if (i32 == i29 - 1) {
                        eVar9.f(eVar9.M, this.f1954g, this.f1957k);
                    }
                    if (eVar8 != null) {
                        d dVar12 = eVar8.M;
                        dVar9.a(dVar12, gVar.R0);
                        if (i32 == i15) {
                            int i36 = this.f1955i;
                            if (dVar9.h()) {
                                dVar9.h = i36;
                            }
                        }
                        dVar12.a(dVar9, 0);
                        if (i32 == i30 + 1) {
                            int i37 = this.f1957k;
                            if (dVar12.h()) {
                                dVar12.h = i37;
                            }
                        }
                    }
                    if (eVar9 == eVar7) {
                        eVar8 = eVar9;
                    } else if (z6) {
                        int i38 = gVar.S0;
                        if (i38 == 0) {
                            dVar10.a(dVar8, 0);
                        } else if (i38 == 1) {
                            dVar11.a(dVar7, 0);
                        } else if (i38 == 2) {
                            dVar11.a(dVar7, 0);
                            dVar10.a(dVar8, 0);
                        }
                        eVar8 = eVar9;
                    } else {
                        int i39 = gVar.S0;
                        if (i39 == 0) {
                            dVar11.a(dVar7, 0);
                        } else if (i39 == 1) {
                            dVar10.a(dVar8, 0);
                        } else if (i39 == 2) {
                            if (z10) {
                                dVar11.a(this.f1951d, this.h);
                                dVar10.a(this.f1953f, this.f1956j);
                            } else {
                                dVar11.a(dVar7, 0);
                                dVar10.a(dVar8, 0);
                            }
                        }
                        eVar8 = eVar9;
                    }
                }
                i32++;
            }
        }

        public final int c() {
            return this.f1948a == 1 ? this.f1959m - g.this.R0 : this.f1959m;
        }

        public final int d() {
            return this.f1948a == 0 ? this.f1958l - g.this.Q0 : this.f1958l;
        }

        public final void e(int i6) {
            int i7 = this.f1962p;
            if (i7 == 0) {
                return;
            }
            int i8 = this.f1961o;
            int i9 = i6 / i7;
            for (int i10 = 0; i10 < i8; i10++) {
                int i11 = this.f1960n;
                int i12 = i11 + i10;
                g gVar = g.this;
                if (i12 >= gVar.f1947c1) {
                    break;
                }
                e eVar = gVar.f1946b1[i11 + i10];
                int i13 = this.f1948a;
                e.a aVar = e.a.s;
                e.a aVar2 = e.a.f1934u;
                if (i13 == 0) {
                    if (eVar != null) {
                        e.a[] aVarArr = eVar.U;
                        if (aVarArr[0] == aVar2 && eVar.f1925r == 0) {
                            gVar.U(eVar, aVar, i9, aVarArr[1], eVar.k());
                        }
                    }
                } else if (eVar != null) {
                    e.a[] aVarArr2 = eVar.U;
                    if (aVarArr2[1] == aVar2 && eVar.s == 0) {
                        int i14 = i9;
                        gVar.U(eVar, aVarArr2[0], eVar.q(), aVar, i14);
                        i9 = i14;
                    }
                }
            }
            this.f1958l = 0;
            this.f1959m = 0;
            this.f1949b = null;
            this.f1950c = 0;
            int i15 = this.f1961o;
            for (int i16 = 0; i16 < i15; i16++) {
                int i17 = this.f1960n + i16;
                g gVar2 = g.this;
                if (i17 >= gVar2.f1947c1) {
                    return;
                }
                e eVar2 = gVar2.f1946b1[i17];
                if (this.f1948a == 0) {
                    int iQ = eVar2.q();
                    int i18 = gVar2.Q0;
                    if (eVar2.f1909i0 == 8) {
                        i18 = 0;
                    }
                    this.f1958l = iQ + i18 + this.f1958l;
                    int iV = gVar2.V(eVar2, this.f1963q);
                    if (this.f1949b == null || this.f1950c < iV) {
                        this.f1949b = eVar2;
                        this.f1950c = iV;
                        this.f1959m = iV;
                    }
                } else {
                    int iW = gVar2.W(eVar2, this.f1963q);
                    int iV2 = gVar2.V(eVar2, this.f1963q);
                    int i19 = gVar2.R0;
                    if (eVar2.f1909i0 == 8) {
                        i19 = 0;
                    }
                    this.f1959m = iV2 + i19 + this.f1959m;
                    if (this.f1949b == null || this.f1950c < iW) {
                        this.f1949b = eVar2;
                        this.f1950c = iW;
                        this.f1958l = iW;
                    }
                }
            }
        }

        public final void f(int i6, d dVar, d dVar2, d dVar3, d dVar4, int i7, int i8, int i9, int i10, int i11) {
            this.f1948a = i6;
            this.f1951d = dVar;
            this.f1952e = dVar2;
            this.f1953f = dVar3;
            this.f1954g = dVar4;
            this.h = i7;
            this.f1955i = i8;
            this.f1956j = i9;
            this.f1957k = i10;
            this.f1963q = i11;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:404:0x06da  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x06dd  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x06f9  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x06fc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x011b  */
    @Override // b0.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T(int i6, int i7, int i8, int i9) {
        int i10;
        e[] eVarArr;
        int i11;
        int i12;
        int i13;
        int[] iArr;
        int i14;
        a aVar;
        char c7;
        int i15;
        int i16;
        int i17;
        int i18;
        int iCeil;
        int iCeil2;
        Object obj;
        e eVar;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23 = this.f1972s0;
        e.a aVar2 = e.a.f1934u;
        e.a aVar3 = e.a.f1933t;
        if (i23 > 0) {
            e eVar2 = this.V;
            b.InterfaceC0025b interfaceC0025b = eVar2 != null ? ((f) eVar2).f1940v0 : null;
            if (interfaceC0025b == null) {
                this.A0 = 0;
                this.B0 = 0;
                this.f1980z0 = false;
                return;
            }
            for (int i24 = 0; i24 < this.f1972s0; i24++) {
                e eVar3 = this.f1971r0[i24];
                if (eVar3 != null && !(eVar3 instanceof h)) {
                    e.a aVarJ = eVar3.j(0);
                    e.a aVarJ2 = eVar3.j(1);
                    if (aVarJ != aVar2 || eVar3.f1925r == 1 || aVarJ2 != aVar2 || eVar3.s == 1) {
                        if (aVarJ == aVar2) {
                            aVarJ = aVar3;
                        }
                        if (aVarJ2 == aVar2) {
                            aVarJ2 = aVar3;
                        }
                        b.a aVar4 = this.C0;
                        aVar4.f2062a = aVarJ;
                        aVar4.f2063b = aVarJ2;
                        aVar4.f2064c = eVar3.q();
                        aVar4.f2065d = eVar3.k();
                        ((ConstraintLayout.b) interfaceC0025b).b(eVar3, aVar4);
                        eVar3.O(aVar4.f2066e);
                        eVar3.L(aVar4.f2067f);
                        eVar3.I(aVar4.f2068g);
                    }
                }
            }
        }
        int i25 = this.f1978x0;
        int i26 = this.f1979y0;
        int i27 = this.f1974t0;
        int i28 = this.f1975u0;
        int[] iArr2 = new int[2];
        int i29 = (i7 - i25) - i26;
        int i30 = this.W0;
        if (i30 == 1) {
            i29 = (i9 - i27) - i28;
        }
        int i31 = i29;
        if (i30 == 0) {
            if (this.E0 == -1) {
                this.E0 = 0;
            }
            if (this.F0 == -1) {
                this.F0 = 0;
            }
        } else {
            if (this.E0 == -1) {
                this.E0 = 0;
            }
            if (this.F0 == -1) {
                this.F0 = 0;
            }
        }
        e[] eVarArr2 = this.f1971r0;
        int i32 = 0;
        int i33 = 0;
        int i34 = 0;
        while (true) {
            i10 = this.f1972s0;
            if (i32 >= i10) {
                break;
            }
            if (this.f1971r0[i32].f1909i0 == 8) {
                i33++;
            }
            i32++;
        }
        if (i33 > 0) {
            e[] eVarArr3 = new e[i10 - i33];
            int i35 = 0;
            i10 = 0;
            while (i35 < this.f1972s0) {
                e eVar4 = this.f1971r0[i35];
                int i36 = i25;
                e[] eVarArr4 = eVarArr3;
                if (eVar4.f1909i0 != 8) {
                    eVarArr4[i10] = eVar4;
                    i10++;
                }
                i35++;
                i25 = i36;
                eVarArr3 = eVarArr4;
            }
            eVarArr = eVarArr3;
        } else {
            eVarArr = eVarArr2;
        }
        int i37 = i25;
        this.f1946b1 = eVarArr;
        this.f1947c1 = i10;
        int i38 = this.U0;
        ArrayList<a> arrayList = this.X0;
        if (i38 != 0) {
            e.a[] aVarArr = this.U;
            d dVar = this.K;
            d dVar2 = this.J;
            d dVar3 = this.L;
            d dVar4 = this.M;
            if (i38 == 1) {
                i11 = i26;
                i12 = i27;
                i13 = i28;
                iArr = iArr2;
                i14 = i37;
                int i39 = this.W0;
                if (i10 != 0) {
                    arrayList.clear();
                    a aVar5 = new a(i39, this.J, this.K, this.L, this.M, i31);
                    arrayList.add(aVar5);
                    if (i39 == 0) {
                        i16 = 0;
                        int i40 = 0;
                        int i41 = 0;
                        while (i41 < i10) {
                            e eVar5 = eVarArr[i41];
                            int iW = W(eVar5, i31);
                            if (eVar5.U[0] == aVar2) {
                                i16++;
                            }
                            int i42 = i16;
                            boolean z6 = (i40 == i31 || (this.Q0 + i40) + iW > i31) && aVar5.f1949b != null;
                            if (!z6 && i41 > 0 && (i18 = this.V0) > 0 && i41 % i18 == 0) {
                                z6 = true;
                            }
                            if (z6) {
                                aVar5 = new a(i39, this.J, this.K, this.L, this.M, i31);
                                aVar5.f1960n = i41;
                                arrayList.add(aVar5);
                            } else {
                                if (i41 > 0) {
                                    i40 = this.Q0 + iW + i40;
                                }
                                aVar5.a(eVar5);
                                i41++;
                                i16 = i42;
                            }
                            i40 = iW;
                            aVar5.a(eVar5);
                            i41++;
                            i16 = i42;
                        }
                    } else {
                        i16 = 0;
                        int i43 = 0;
                        int i44 = 0;
                        while (i44 < i10) {
                            e eVar6 = eVarArr[i44];
                            int iV = V(eVar6, i31);
                            if (eVar6.U[1] == aVar2) {
                                i16++;
                            }
                            int i45 = i16;
                            boolean z7 = (i43 == i31 || (this.R0 + i43) + iV > i31) && aVar5.f1949b != null;
                            if (!z7 && i44 > 0 && (i17 = this.V0) > 0 && i44 % i17 == 0) {
                                z7 = true;
                            }
                            if (z7) {
                                aVar5 = new a(i39, this.J, this.K, this.L, this.M, i31);
                                aVar5.f1960n = i44;
                                arrayList.add(aVar5);
                            } else {
                                if (i44 > 0) {
                                    i43 = this.R0 + iV + i43;
                                }
                                aVar5.a(eVar6);
                                i44++;
                                i16 = i45;
                            }
                            i43 = iV;
                            aVar5.a(eVar6);
                            i44++;
                            i16 = i45;
                        }
                    }
                    int size = arrayList.size();
                    int i46 = this.f1978x0;
                    int i47 = this.f1974t0;
                    int i48 = this.f1979y0;
                    int i49 = this.f1975u0;
                    boolean z8 = aVarArr[0] == aVar3 || aVarArr[1] == aVar3;
                    if (i16 > 0 && z8) {
                        for (int i50 = 0; i50 < size; i50++) {
                            a aVar6 = arrayList.get(i50);
                            if (i39 == 0) {
                                aVar6.e(i31 - aVar6.d());
                            } else {
                                aVar6.e(i31 - aVar6.c());
                            }
                        }
                    }
                    int i51 = i46;
                    int i52 = i47;
                    int i53 = i48;
                    int i54 = i49;
                    d dVar5 = dVar;
                    int iMax = 0;
                    int i55 = 0;
                    d dVar6 = dVar3;
                    d dVar7 = dVar4;
                    for (int i56 = 0; i56 < size; i56++) {
                        a aVar7 = arrayList.get(i56);
                        if (i39 == 0) {
                            if (i56 < size - 1) {
                                dVar7 = arrayList.get(i56 + 1).f1949b.K;
                                i54 = 0;
                            } else {
                                i54 = this.f1975u0;
                                dVar7 = dVar4;
                            }
                            d dVar8 = aVar7.f1949b.M;
                            aVar7.f(i39, dVar2, dVar5, dVar6, dVar7, i51, i52, i53, i54, i31);
                            iMax = Math.max(iMax, aVar7.d());
                            int iC = aVar7.c() + i55;
                            if (i56 > 0) {
                                iC += this.R0;
                            }
                            i55 = iC;
                            dVar5 = dVar8;
                            i52 = 0;
                        } else {
                            if (i56 < size - 1) {
                                dVar6 = arrayList.get(i56 + 1).f1949b.J;
                                i53 = 0;
                            } else {
                                i53 = this.f1979y0;
                                dVar6 = dVar3;
                            }
                            d dVar9 = aVar7.f1949b.L;
                            aVar7.f(i39, dVar2, dVar5, dVar6, dVar7, i51, i52, i53, i54, i31);
                            int iD = aVar7.d() + iMax;
                            int iMax2 = Math.max(i55, aVar7.c());
                            if (i56 > 0) {
                                iD += this.Q0;
                            }
                            i55 = iMax2;
                            iMax = iD;
                            dVar2 = dVar9;
                            i51 = 0;
                        }
                    }
                    iArr[0] = iMax;
                    iArr[1] = i55;
                }
            } else if (i38 == 2) {
                i11 = i26;
                i12 = i27;
                i13 = i28;
                iArr = iArr2;
                i14 = i37;
                int i57 = this.W0;
                if (i57 == 0) {
                    int i58 = this.V0;
                    if (i58 <= 0) {
                        int i59 = 0;
                        iCeil2 = 0;
                        for (int i60 = 0; i60 < i10; i60++) {
                            if (i60 > 0) {
                                i59 += this.Q0;
                            }
                            e eVar7 = eVarArr[i60];
                            if (eVar7 != null) {
                                int iW2 = W(eVar7, i31) + i59;
                                if (iW2 > i31) {
                                    break;
                                }
                                iCeil2++;
                                i59 = iW2;
                            }
                        }
                    } else {
                        iCeil2 = i58;
                    }
                    iCeil = 0;
                } else {
                    iCeil = this.V0;
                    if (iCeil <= 0) {
                        int i61 = 0;
                        int i62 = 0;
                        for (int i63 = 0; i63 < i10; i63++) {
                            if (i63 > 0) {
                                i61 += this.R0;
                            }
                            e eVar8 = eVarArr[i63];
                            if (eVar8 != null) {
                                int iV2 = V(eVar8, i31) + i61;
                                if (iV2 > i31) {
                                    break;
                                }
                                i62++;
                                i61 = iV2;
                            }
                        }
                        iCeil = i62;
                    }
                    iCeil2 = 0;
                }
                if (this.f1945a1 == null) {
                    this.f1945a1 = new int[2];
                }
                boolean z9 = (iCeil == 0 && i57 == 1) || (iCeil2 == 0 && i57 == 0);
                while (!z9) {
                    if (i57 == 0) {
                        iCeil = (int) Math.ceil(i10 / iCeil2);
                    } else {
                        iCeil2 = (int) Math.ceil(i10 / iCeil);
                    }
                    e[] eVarArr5 = this.Z0;
                    if (eVarArr5 == null || eVarArr5.length < iCeil2) {
                        obj = null;
                        this.Z0 = new e[iCeil2];
                    } else {
                        obj = null;
                        Arrays.fill(eVarArr5, (Object) null);
                    }
                    e[] eVarArr6 = this.Y0;
                    if (eVarArr6 == null || eVarArr6.length < iCeil) {
                        this.Y0 = new e[iCeil];
                    } else {
                        Arrays.fill(eVarArr6, obj);
                    }
                    for (int i64 = 0; i64 < iCeil2; i64++) {
                        for (int i65 = 0; i65 < iCeil; i65++) {
                            int i66 = (i65 * iCeil2) + i64;
                            if (i57 == 1) {
                                i66 = (i64 * iCeil) + i65;
                            }
                            if (i66 < eVarArr.length && (eVar = eVarArr[i66]) != null) {
                                int iW3 = W(eVar, i31);
                                e eVar9 = this.Z0[i64];
                                if (eVar9 == null || eVar9.q() < iW3) {
                                    this.Z0[i64] = eVar;
                                }
                                int iV3 = V(eVar, i31);
                                e eVar10 = this.Y0[i65];
                                if (eVar10 == null || eVar10.k() < iV3) {
                                    this.Y0[i65] = eVar;
                                }
                            }
                        }
                    }
                    int iW4 = 0;
                    for (int i67 = 0; i67 < iCeil2; i67++) {
                        e eVar11 = this.Z0[i67];
                        if (eVar11 != null) {
                            if (i67 > 0) {
                                iW4 += this.Q0;
                            }
                            iW4 = W(eVar11, i31) + iW4;
                        }
                    }
                    int iV4 = 0;
                    for (int i68 = 0; i68 < iCeil; i68++) {
                        e eVar12 = this.Y0[i68];
                        if (eVar12 != null) {
                            if (i68 > 0) {
                                iV4 += this.R0;
                            }
                            iV4 = V(eVar12, i31) + iV4;
                        }
                    }
                    iArr[0] = iW4;
                    iArr[1] = iV4;
                    if (i57 == 0) {
                        if (iW4 <= i31 || iCeil2 <= 1) {
                            z9 = true;
                        } else {
                            iCeil2--;
                        }
                    } else if (iV4 <= i31 || iCeil <= 1) {
                        z9 = true;
                    } else {
                        iCeil--;
                    }
                }
                int[] iArr3 = this.f1945a1;
                iArr3[0] = iCeil2;
                iArr3[1] = iCeil;
                c7 = 1;
            } else if (i38 != 3) {
                i11 = i26;
                i12 = i27;
                i13 = i28;
                iArr = iArr2;
                i14 = i37;
            } else {
                int i69 = this.W0;
                if (i10 != 0) {
                    arrayList.clear();
                    iArr = iArr2;
                    i13 = i28;
                    i14 = i37;
                    i11 = i26;
                    i12 = i27;
                    a aVar8 = new a(i69, this.J, this.K, this.L, this.M, i31);
                    arrayList.add(aVar8);
                    if (i69 == 0) {
                        int i70 = 0;
                        int i71 = 0;
                        i19 = 0;
                        int i72 = 0;
                        while (i70 < i10) {
                            i71++;
                            e eVar13 = eVarArr[i70];
                            int iW5 = W(eVar13, i31);
                            int i73 = i69;
                            if (eVar13.U[0] == aVar2) {
                                i19++;
                            }
                            int i74 = i19;
                            boolean z10 = (i72 == i31 || (this.Q0 + i72) + iW5 > i31) && aVar8.f1949b != null;
                            if (!z10 && i70 > 0 && (i22 = this.V0) > 0 && i71 > i22) {
                                z10 = true;
                            }
                            if (z10) {
                                i21 = i70;
                                i69 = i73;
                                aVar8 = new a(i69, this.J, this.K, this.L, this.M, i31);
                                aVar8.f1960n = i21;
                                arrayList.add(aVar8);
                                i72 = iW5;
                                i71 = 1;
                            } else {
                                i21 = i70;
                                i69 = i73;
                                i72 = i21 > 0 ? this.Q0 + iW5 + i72 : iW5;
                            }
                            aVar8.a(eVar13);
                            i70 = i21 + 1;
                            i19 = i74;
                        }
                    } else {
                        int i75 = 0;
                        int i76 = 0;
                        int i77 = 0;
                        int i78 = 0;
                        while (i78 < i10) {
                            i75++;
                            e eVar14 = eVarArr[i78];
                            int iV5 = V(eVar14, i31);
                            if (eVar14.U[1] == aVar2) {
                                i76++;
                            }
                            int i79 = i76;
                            boolean z11 = (i77 == i31 || (this.R0 + i77) + iV5 > i31) && aVar8.f1949b != null;
                            if (!z11 && i78 > 0 && (i20 = this.V0) > 0 && i75 > i20) {
                                z11 = true;
                            }
                            if (z11) {
                                aVar8 = new a(i69, this.J, this.K, this.L, this.M, i31);
                                aVar8.f1960n = i78;
                                arrayList.add(aVar8);
                                i77 = iV5;
                                i75 = 1;
                            } else {
                                i77 = i78 > 0 ? this.R0 + iV5 + i77 : iV5;
                            }
                            aVar8.a(eVar14);
                            i78++;
                            i76 = i79;
                        }
                        i19 = i76;
                    }
                    int size2 = arrayList.size();
                    int i80 = this.f1978x0;
                    int i81 = this.f1974t0;
                    int i82 = this.f1979y0;
                    int i83 = this.f1975u0;
                    boolean z12 = aVarArr[0] == aVar3 || aVarArr[1] == aVar3;
                    if (i19 > 0 && z12) {
                        for (int i84 = 0; i84 < size2; i84++) {
                            a aVar9 = arrayList.get(i84);
                            if (i69 == 0) {
                                aVar9.e(i31 - aVar9.d());
                            } else {
                                aVar9.e(i31 - aVar9.c());
                            }
                        }
                    }
                    int i85 = i80;
                    int i86 = i81;
                    int i87 = i82;
                    int i88 = i83;
                    d dVar10 = dVar;
                    int iMax3 = 0;
                    int i89 = 0;
                    d dVar11 = dVar3;
                    d dVar12 = dVar4;
                    for (int i90 = 0; i90 < size2; i90++) {
                        a aVar10 = arrayList.get(i90);
                        if (i69 == 0) {
                            if (i90 < size2 - 1) {
                                dVar12 = arrayList.get(i90 + 1).f1949b.K;
                                i88 = 0;
                            } else {
                                i88 = this.f1975u0;
                                dVar12 = dVar4;
                            }
                            d dVar13 = aVar10.f1949b.M;
                            aVar10.f(i69, dVar2, dVar10, dVar11, dVar12, i85, i86, i87, i88, i31);
                            iMax3 = Math.max(iMax3, aVar10.d());
                            int iC2 = aVar10.c() + i89;
                            if (i90 > 0) {
                                iC2 += this.R0;
                            }
                            i89 = iC2;
                            dVar10 = dVar13;
                            i86 = 0;
                        } else {
                            if (i90 < size2 - 1) {
                                dVar11 = arrayList.get(i90 + 1).f1949b.J;
                                i87 = 0;
                            } else {
                                i87 = this.f1979y0;
                                dVar11 = dVar3;
                            }
                            d dVar14 = aVar10.f1949b.L;
                            aVar10.f(i69, dVar2, dVar10, dVar11, dVar12, i85, i86, i87, i88, i31);
                            int iD2 = aVar10.d() + iMax3;
                            int iMax4 = Math.max(i89, aVar10.c());
                            if (i90 > 0) {
                                iD2 += this.Q0;
                            }
                            i89 = iMax4;
                            iMax3 = iD2;
                            dVar2 = dVar14;
                            i85 = 0;
                        }
                    }
                    iArr[0] = iMax3;
                    iArr[1] = i89;
                }
            }
            c7 = 1;
        } else {
            i11 = i26;
            i12 = i27;
            i13 = i28;
            iArr = iArr2;
            i14 = i37;
            int i91 = this.W0;
            if (i10 == 0) {
                c7 = 1;
            } else {
                if (arrayList.size() == 0) {
                    aVar = new a(i91, this.J, this.K, this.L, this.M, i31);
                    arrayList.add(aVar);
                } else {
                    a aVar11 = arrayList.get(0);
                    aVar11.f1950c = 0;
                    aVar11.f1949b = null;
                    aVar11.f1958l = 0;
                    aVar11.f1959m = 0;
                    aVar11.f1960n = 0;
                    aVar11.f1961o = 0;
                    aVar11.f1962p = 0;
                    aVar11.f(i91, this.J, this.K, this.L, this.M, this.f1978x0, this.f1974t0, this.f1979y0, this.f1975u0, i31);
                    aVar = aVar11;
                }
                for (int i92 = 0; i92 < i10; i92++) {
                    aVar.a(eVarArr[i92]);
                }
                i34 = 0;
                iArr[0] = aVar.d();
                c7 = 1;
                iArr[1] = aVar.c();
            }
        }
        int iMin = iArr[i34] + i14 + i11;
        int iMin2 = iArr[c7] + i12 + i13;
        if (i6 == 1073741824) {
            iMin = i7;
        } else {
            if (i6 != Integer.MIN_VALUE) {
                i15 = i8;
                if (i6 != 0) {
                    iMin = i34;
                }
                if (i15 != 1073741824) {
                    iMin2 = i9;
                } else if (i15 == Integer.MIN_VALUE) {
                    iMin2 = Math.min(iMin2, i9);
                } else if (i15 != 0) {
                    iMin2 = i34;
                }
                this.A0 = iMin;
                this.B0 = iMin2;
                O(iMin);
                L(iMin2);
                this.f1980z0 = this.f1972s0 <= 0 ? c7 : i34;
            }
            iMin = Math.min(iMin, i7);
        }
        i15 = i8;
        if (i15 != 1073741824) {
        }
        this.A0 = iMin;
        this.B0 = iMin2;
        O(iMin);
        L(iMin2);
        this.f1980z0 = this.f1972s0 <= 0 ? c7 : i34;
    }

    public final int V(e eVar, int i6) {
        e eVar2;
        if (eVar == null) {
            return 0;
        }
        e.a[] aVarArr = eVar.U;
        if (aVarArr[1] == e.a.f1934u) {
            int i7 = eVar.s;
            if (i7 == 0) {
                return 0;
            }
            if (i7 == 2) {
                int i8 = (int) (eVar.f1932z * i6);
                if (i8 != eVar.k()) {
                    eVar.f1905g = true;
                    U(eVar, aVarArr[0], eVar.q(), e.a.s, i8);
                }
                return i8;
            }
            eVar2 = eVar;
            if (i7 == 1) {
                return eVar2.k();
            }
            if (i7 == 3) {
                return (int) ((eVar2.q() * eVar2.Y) + 0.5f);
            }
        } else {
            eVar2 = eVar;
        }
        return eVar2.k();
    }

    public final int W(e eVar, int i6) {
        e eVar2;
        if (eVar == null) {
            return 0;
        }
        e.a[] aVarArr = eVar.U;
        if (aVarArr[0] == e.a.f1934u) {
            int i7 = eVar.f1925r;
            if (i7 == 0) {
                return 0;
            }
            if (i7 == 2) {
                int i8 = (int) (eVar.f1929w * i6);
                if (i8 != eVar.q()) {
                    eVar.f1905g = true;
                    U(eVar, e.a.s, i8, aVarArr[1], eVar.k());
                }
                return i8;
            }
            eVar2 = eVar;
            if (i7 == 1) {
                return eVar2.q();
            }
            if (i7 == 3) {
                return (int) ((eVar2.k() * eVar2.Y) + 0.5f);
            }
        } else {
            eVar2 = eVar;
        }
        return eVar2.q();
    }

    @Override // b0.e
    public final void b(z.c cVar, boolean z6) {
        e eVar;
        float f6;
        int i6;
        super.b(cVar, z6);
        e eVar2 = this.V;
        boolean z7 = eVar2 != null && ((f) eVar2).f1941w0;
        int i7 = this.U0;
        ArrayList<a> arrayList = this.X0;
        if (i7 != 0) {
            if (i7 == 1) {
                int size = arrayList.size();
                int i8 = 0;
                while (i8 < size) {
                    arrayList.get(i8).b(i8, z7, i8 == size + (-1));
                    i8++;
                }
            } else if (i7 != 2) {
                if (i7 == 3) {
                    int size2 = arrayList.size();
                    int i9 = 0;
                    while (i9 < size2) {
                        arrayList.get(i9).b(i9, z7, i9 == size2 + (-1));
                        i9++;
                    }
                }
            } else if (this.f1945a1 != null && this.Z0 != null && this.Y0 != null) {
                for (int i10 = 0; i10 < this.f1947c1; i10++) {
                    this.f1946b1[i10].D();
                }
                int[] iArr = this.f1945a1;
                int i11 = iArr[0];
                int i12 = iArr[1];
                float f7 = this.K0;
                e eVar3 = null;
                int i13 = 0;
                while (i13 < i11) {
                    if (z7) {
                        i6 = (i11 - i13) - 1;
                        f6 = 1.0f - this.K0;
                    } else {
                        f6 = f7;
                        i6 = i13;
                    }
                    e eVar4 = this.Z0[i6];
                    if (eVar4 != null) {
                        d dVar = eVar4.J;
                        if (eVar4.f1909i0 != 8) {
                            if (i13 == 0) {
                                eVar4.f(dVar, this.J, this.f1978x0);
                                eVar4.f1913k0 = this.E0;
                                eVar4.f1904f0 = f6;
                            }
                            if (i13 == i11 - 1) {
                                eVar4.f(eVar4.L, this.L, this.f1979y0);
                            }
                            if (i13 > 0 && eVar3 != null) {
                                d dVar2 = eVar3.L;
                                eVar4.f(dVar, dVar2, this.Q0);
                                eVar3.f(dVar2, dVar, 0);
                            }
                            eVar3 = eVar4;
                        }
                    }
                    i13++;
                    f7 = f6;
                }
                for (int i14 = 0; i14 < i12; i14++) {
                    e eVar5 = this.Y0[i14];
                    if (eVar5 != null) {
                        d dVar3 = eVar5.K;
                        if (eVar5.f1909i0 != 8) {
                            if (i14 == 0) {
                                eVar5.f(dVar3, this.K, this.f1974t0);
                                eVar5.f1915l0 = this.F0;
                                eVar5.f1906g0 = this.L0;
                            }
                            if (i14 == i12 - 1) {
                                eVar5.f(eVar5.M, this.M, this.f1975u0);
                            }
                            if (i14 > 0 && eVar3 != null) {
                                d dVar4 = eVar3.M;
                                eVar5.f(dVar3, dVar4, this.R0);
                                eVar3.f(dVar4, dVar3, 0);
                            }
                            eVar3 = eVar5;
                        }
                    }
                }
                for (int i15 = 0; i15 < i11; i15++) {
                    for (int i16 = 0; i16 < i12; i16++) {
                        int i17 = (i16 * i11) + i15;
                        if (this.W0 == 1) {
                            i17 = (i15 * i12) + i16;
                        }
                        e[] eVarArr = this.f1946b1;
                        if (i17 < eVarArr.length && (eVar = eVarArr[i17]) != null && eVar.f1909i0 != 8) {
                            e eVar6 = this.Z0[i15];
                            e eVar7 = this.Y0[i16];
                            if (eVar != eVar6) {
                                eVar.f(eVar.J, eVar6.J, 0);
                                eVar.f(eVar.L, eVar6.L, 0);
                            }
                            if (eVar != eVar7) {
                                eVar.f(eVar.K, eVar7.K, 0);
                                eVar.f(eVar.M, eVar7.M, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            arrayList.get(0).b(0, z7, true);
        }
        this.f1980z0 = false;
    }
}
