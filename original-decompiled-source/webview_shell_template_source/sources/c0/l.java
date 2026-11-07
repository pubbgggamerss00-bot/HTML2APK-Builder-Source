package c0;

import b0.d;
import b0.e;
import c0.p;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class l extends p {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f2100k = new int[2];

    public static void m(int[] iArr, int i6, int i7, int i8, int i9, float f6, int i10) {
        int i11 = i7 - i6;
        int i12 = i9 - i8;
        if (i10 != -1) {
            if (i10 == 0) {
                iArr[0] = (int) ((i12 * f6) + 0.5f);
                iArr[1] = i12;
                return;
            } else {
                if (i10 != 1) {
                    return;
                }
                iArr[0] = i11;
                iArr[1] = (int) ((i11 * f6) + 0.5f);
                return;
            }
        }
        int i13 = (int) ((i12 * f6) + 0.5f);
        int i14 = (int) ((i11 / f6) + 0.5f);
        if (i13 <= i11) {
            iArr[0] = i13;
            iArr[1] = i12;
        } else if (i14 <= i12) {
            iArr[0] = i11;
            iArr[1] = i14;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    @Override // c0.p, c0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(d dVar) {
        float f6;
        float f7;
        float f8;
        float f9;
        int i6;
        if (this.f2119j.ordinal() == 3) {
            b0.e eVar = this.f2112b;
            l(eVar.J, eVar.L, 0);
            return;
        }
        g gVar = this.f2115e;
        boolean z6 = gVar.f2088j;
        e.a aVar = e.a.f1934u;
        f fVar = this.h;
        f fVar2 = this.f2118i;
        if (z6 || this.f2114d != aVar) {
            f6 = 0.5f;
        } else {
            b0.e eVar2 = this.f2112b;
            int i7 = eVar2.f1925r;
            if (i7 == 2) {
                f6 = 0.5f;
                b0.e eVar3 = eVar2.V;
                if (eVar3 != null) {
                    if (eVar3.f1899d.f2115e.f2088j) {
                        gVar.d((int) ((r3.f2086g * eVar2.f1929w) + 0.5f));
                    }
                }
            } else if (i7 == 3) {
                int i8 = eVar2.s;
                if (i8 == 0 || i8 == 3) {
                    n nVar = eVar2.f1901e;
                    f fVar3 = nVar.h;
                    f fVar4 = nVar.f2118i;
                    boolean z7 = eVar2.J.f1883f != null;
                    boolean z8 = eVar2.K.f1883f != null;
                    boolean z9 = eVar2.L.f1883f != null;
                    boolean z10 = eVar2.M.f1883f != null;
                    f6 = 0.5f;
                    int i9 = eVar2.Z;
                    if (z7 && z8 && z9 && z10) {
                        float f10 = eVar2.Y;
                        boolean z11 = fVar3.f2088j;
                        ArrayList arrayList = fVar3.f2090l;
                        int[] iArr = f2100k;
                        if (z11 && fVar4.f2088j) {
                            if (fVar.f2082c && fVar2.f2082c) {
                                m(iArr, ((f) fVar.f2090l.get(0)).f2086g + fVar.f2085f, ((f) fVar2.f2090l.get(0)).f2086g - fVar2.f2085f, fVar3.f2086g + fVar3.f2085f, fVar4.f2086g - fVar4.f2085f, f10, i9);
                                gVar.d(iArr[0]);
                                this.f2112b.f1901e.f2115e.d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        if (fVar.f2088j && fVar2.f2088j) {
                            if (!fVar3.f2082c || !fVar4.f2082c) {
                                return;
                            }
                            m(iArr, fVar.f2086g + fVar.f2085f, fVar2.f2086g - fVar2.f2085f, ((f) arrayList.get(0)).f2086g + fVar3.f2085f, ((f) fVar4.f2090l.get(0)).f2086g - fVar4.f2085f, f10, i9);
                            gVar.d(iArr[0]);
                            this.f2112b.f1901e.f2115e.d(iArr[1]);
                        }
                        if (!fVar.f2082c || !fVar2.f2082c || !fVar3.f2082c || !fVar4.f2082c) {
                            return;
                        }
                        m(iArr, ((f) fVar.f2090l.get(0)).f2086g + fVar.f2085f, ((f) fVar2.f2090l.get(0)).f2086g - fVar2.f2085f, ((f) arrayList.get(0)).f2086g + fVar3.f2085f, ((f) fVar4.f2090l.get(0)).f2086g - fVar4.f2085f, f10, i9);
                        gVar.d(iArr[0]);
                        this.f2112b.f1901e.f2115e.d(iArr[1]);
                    } else if (z7 && z9) {
                        if (!fVar.f2082c || !fVar2.f2082c) {
                            return;
                        }
                        float f11 = eVar2.Y;
                        int i10 = ((f) fVar.f2090l.get(0)).f2086g + fVar.f2085f;
                        int i11 = ((f) fVar2.f2090l.get(0)).f2086g - fVar2.f2085f;
                        if (i9 == -1 || i9 == 0) {
                            int iG = g(i11 - i10, 0);
                            int i12 = (int) ((iG * f11) + 0.5f);
                            int iG2 = g(i12, 1);
                            if (i12 != iG2) {
                                iG = (int) ((iG2 / f11) + 0.5f);
                            }
                            gVar.d(iG);
                            this.f2112b.f1901e.f2115e.d(iG2);
                        } else if (i9 == 1) {
                            int iG3 = g(i11 - i10, 0);
                            int i13 = (int) ((iG3 / f11) + 0.5f);
                            int iG4 = g(i13, 1);
                            if (i13 != iG4) {
                                iG3 = (int) ((iG4 * f11) + 0.5f);
                            }
                            gVar.d(iG3);
                            this.f2112b.f1901e.f2115e.d(iG4);
                        }
                    } else if (z8 && z10) {
                        if (!fVar3.f2082c || !fVar4.f2082c) {
                            return;
                        }
                        float f12 = eVar2.Y;
                        int i14 = ((f) fVar3.f2090l.get(0)).f2086g + fVar3.f2085f;
                        int i15 = ((f) fVar4.f2090l.get(0)).f2086g - fVar4.f2085f;
                        if (i9 == -1) {
                            int iG5 = g(i15 - i14, 1);
                            int i16 = (int) ((iG5 / f12) + 0.5f);
                            int iG6 = g(i16, 0);
                            if (i16 != iG6) {
                                iG5 = (int) ((iG6 * f12) + 0.5f);
                            }
                            gVar.d(iG6);
                            this.f2112b.f1901e.f2115e.d(iG5);
                        } else if (i9 == 0) {
                            int iG7 = g(i15 - i14, 1);
                            int i17 = (int) ((iG7 * f12) + 0.5f);
                            int iG8 = g(i17, 0);
                            if (i17 != iG8) {
                                iG7 = (int) ((iG8 / f12) + 0.5f);
                            }
                            gVar.d(iG8);
                            this.f2112b.f1901e.f2115e.d(iG7);
                        } else if (i9 == 1) {
                        }
                    }
                } else {
                    int i18 = eVar2.Z;
                    if (i18 == -1) {
                        f7 = eVar2.f1901e.f2115e.f2086g;
                        f8 = eVar2.Y;
                    } else if (i18 == 0) {
                        f9 = eVar2.f1901e.f2115e.f2086g / eVar2.Y;
                        i6 = (int) (f9 + 0.5f);
                        gVar.d(i6);
                        f6 = 0.5f;
                    } else if (i18 != 1) {
                        i6 = 0;
                        gVar.d(i6);
                        f6 = 0.5f;
                    } else {
                        f7 = eVar2.f1901e.f2115e.f2086g;
                        f8 = eVar2.Y;
                    }
                    f9 = f7 * f8;
                    i6 = (int) (f9 + 0.5f);
                    gVar.d(i6);
                    f6 = 0.5f;
                }
            }
        }
        boolean z12 = fVar.f2082c;
        ArrayList arrayList2 = fVar.f2090l;
        if (z12) {
            boolean z13 = fVar2.f2082c;
            ArrayList arrayList3 = fVar2.f2090l;
            if (z13) {
                if (fVar.f2088j && fVar2.f2088j && gVar.f2088j) {
                    return;
                }
                if (!gVar.f2088j && this.f2114d == aVar) {
                    b0.e eVar4 = this.f2112b;
                    if (eVar4.f1925r == 0 && !eVar4.x()) {
                        f fVar5 = (f) arrayList2.get(0);
                        f fVar6 = (f) arrayList3.get(0);
                        int i19 = fVar5.f2086g + fVar.f2085f;
                        int i20 = fVar6.f2086g + fVar2.f2085f;
                        fVar.d(i19);
                        fVar2.d(i20);
                        gVar.d(i20 - i19);
                        return;
                    }
                }
                if (!gVar.f2088j && this.f2114d == aVar && this.f2111a == 1 && arrayList2.size() > 0 && arrayList3.size() > 0) {
                    int iMin = Math.min((((f) arrayList3.get(0)).f2086g + fVar2.f2085f) - (((f) arrayList2.get(0)).f2086g + fVar.f2085f), gVar.f2098m);
                    b0.e eVar5 = this.f2112b;
                    int i21 = eVar5.f1928v;
                    int iMax = Math.max(eVar5.f1927u, iMin);
                    if (i21 > 0) {
                        iMax = Math.min(i21, iMax);
                    }
                    gVar.d(iMax);
                }
                if (gVar.f2088j) {
                    f fVar7 = (f) arrayList2.get(0);
                    f fVar8 = (f) arrayList3.get(0);
                    int i22 = fVar7.f2086g;
                    int i23 = fVar.f2085f + i22;
                    int i24 = fVar8.f2086g;
                    int i25 = fVar2.f2085f + i24;
                    float f13 = this.f2112b.f1904f0;
                    if (fVar7 == fVar8) {
                        f13 = f6;
                    } else {
                        i22 = i23;
                        i24 = i25;
                    }
                    fVar.d((int) ((((i24 - i22) - gVar.f2086g) * f13) + i22 + f6));
                    fVar2.d(fVar.f2086g + gVar.f2086g);
                }
            }
        }
    }

    @Override // c0.p
    public final void d() {
        b0.e eVar;
        b0.e eVar2;
        e.a aVar;
        b0.e eVar3;
        b0.e eVar4;
        e.a aVar2;
        b0.e eVar5 = this.f2112b;
        boolean z6 = eVar5.f1893a;
        g gVar = this.f2115e;
        if (z6) {
            gVar.d(eVar5.q());
        }
        boolean z7 = gVar.f2088j;
        ArrayList arrayList = gVar.f2089k;
        ArrayList arrayList2 = gVar.f2090l;
        e.a aVar3 = e.a.f1935v;
        e.a aVar4 = e.a.f1934u;
        e.a aVar5 = e.a.s;
        f fVar = this.f2118i;
        f fVar2 = this.h;
        if (!z7) {
            b0.e eVar6 = this.f2112b;
            e.a aVar6 = eVar6.U[0];
            this.f2114d = aVar6;
            if (aVar6 != aVar4) {
                if (aVar6 == aVar3 && (eVar4 = eVar6.V) != null && ((aVar2 = eVar4.U[0]) == aVar5 || aVar2 == aVar3)) {
                    int iQ = (eVar4.q() - this.f2112b.J.e()) - this.f2112b.L.e();
                    p.b(fVar2, eVar4.f1899d.h, this.f2112b.J.e());
                    p.b(fVar, eVar4.f1899d.f2118i, -this.f2112b.L.e());
                    gVar.d(iQ);
                    return;
                }
                if (aVar6 == aVar5) {
                    gVar.d(eVar6.q());
                }
            }
        } else if (this.f2114d == aVar3 && (eVar2 = (eVar = this.f2112b).V) != null && ((aVar = eVar2.U[0]) == aVar5 || aVar == aVar3)) {
            p.b(fVar2, eVar2.f1899d.h, eVar.J.e());
            p.b(fVar, eVar2.f1899d.f2118i, -this.f2112b.L.e());
            return;
        }
        if (gVar.f2088j) {
            b0.e eVar7 = this.f2112b;
            if (eVar7.f1893a) {
                b0.d[] dVarArr = eVar7.R;
                b0.d dVar = dVarArr[0];
                b0.d dVar2 = dVar.f1883f;
                if (dVar2 != null && dVarArr[1].f1883f != null) {
                    if (eVar7.x()) {
                        fVar2.f2085f = this.f2112b.R[0].e();
                        fVar.f2085f = -this.f2112b.R[1].e();
                        return;
                    }
                    f fVarH = p.h(this.f2112b.R[0]);
                    if (fVarH != null) {
                        p.b(fVar2, fVarH, this.f2112b.R[0].e());
                    }
                    f fVarH2 = p.h(this.f2112b.R[1]);
                    if (fVarH2 != null) {
                        p.b(fVar, fVarH2, -this.f2112b.R[1].e());
                    }
                    fVar2.f2081b = true;
                    fVar.f2081b = true;
                    return;
                }
                if (dVar2 != null) {
                    f fVarH3 = p.h(dVar);
                    if (fVarH3 != null) {
                        p.b(fVar2, fVarH3, this.f2112b.R[0].e());
                        p.b(fVar, fVar2, gVar.f2086g);
                        return;
                    }
                    return;
                }
                b0.d dVar3 = dVarArr[1];
                if (dVar3.f1883f != null) {
                    f fVarH4 = p.h(dVar3);
                    if (fVarH4 != null) {
                        p.b(fVar, fVarH4, -this.f2112b.R[1].e());
                        p.b(fVar2, fVar, -gVar.f2086g);
                        return;
                    }
                    return;
                }
                if ((eVar7 instanceof b0.i) || eVar7.V == null || eVar7.i(d.a.f1890x).f1883f != null) {
                    return;
                }
                b0.e eVar8 = this.f2112b;
                p.b(fVar2, eVar8.V.f1899d.h, eVar8.r());
                p.b(fVar, fVar2, gVar.f2086g);
                return;
            }
        }
        if (this.f2114d == aVar4) {
            b0.e eVar9 = this.f2112b;
            int i6 = eVar9.f1925r;
            if (i6 == 2) {
                b0.e eVar10 = eVar9.V;
                if (eVar10 != null) {
                    g gVar2 = eVar10.f1901e.f2115e;
                    arrayList2.add(gVar2);
                    gVar2.f2089k.add(gVar);
                    gVar.f2081b = true;
                    arrayList.add(fVar2);
                    arrayList.add(fVar);
                }
            } else if (i6 == 3) {
                if (eVar9.s == 3) {
                    fVar2.f2080a = this;
                    fVar.f2080a = this;
                    n nVar = eVar9.f1901e;
                    nVar.h.f2080a = this;
                    nVar.f2118i.f2080a = this;
                    gVar.f2080a = this;
                    if (eVar9.y()) {
                        arrayList2.add(this.f2112b.f1901e.f2115e);
                        this.f2112b.f1901e.f2115e.f2089k.add(gVar);
                        n nVar2 = this.f2112b.f1901e;
                        nVar2.f2115e.f2080a = this;
                        arrayList2.add(nVar2.h);
                        arrayList2.add(this.f2112b.f1901e.f2118i);
                        this.f2112b.f1901e.h.f2089k.add(gVar);
                        this.f2112b.f1901e.f2118i.f2089k.add(gVar);
                    } else if (this.f2112b.x()) {
                        this.f2112b.f1901e.f2115e.f2090l.add(gVar);
                        arrayList.add(this.f2112b.f1901e.f2115e);
                    } else {
                        this.f2112b.f1901e.f2115e.f2090l.add(gVar);
                    }
                } else {
                    g gVar3 = eVar9.f1901e.f2115e;
                    arrayList2.add(gVar3);
                    gVar3.f2089k.add(gVar);
                    this.f2112b.f1901e.h.f2089k.add(gVar);
                    this.f2112b.f1901e.f2118i.f2089k.add(gVar);
                    gVar.f2081b = true;
                    arrayList.add(fVar2);
                    arrayList.add(fVar);
                    fVar2.f2090l.add(gVar);
                    fVar.f2090l.add(gVar);
                }
            }
        }
        b0.e eVar11 = this.f2112b;
        b0.d[] dVarArr2 = eVar11.R;
        b0.d dVar4 = dVarArr2[0];
        b0.d dVar5 = dVar4.f1883f;
        if (dVar5 != null && dVarArr2[1].f1883f != null) {
            if (eVar11.x()) {
                fVar2.f2085f = this.f2112b.R[0].e();
                fVar.f2085f = -this.f2112b.R[1].e();
                return;
            }
            f fVarH5 = p.h(this.f2112b.R[0]);
            f fVarH6 = p.h(this.f2112b.R[1]);
            if (fVarH5 != null) {
                fVarH5.b(this);
            }
            if (fVarH6 != null) {
                fVarH6.b(this);
            }
            this.f2119j = p.a.f2120t;
            return;
        }
        if (dVar5 != null) {
            f fVarH7 = p.h(dVar4);
            if (fVarH7 != null) {
                p.b(fVar2, fVarH7, this.f2112b.R[0].e());
                c(fVar, fVar2, 1, gVar);
                return;
            }
            return;
        }
        b0.d dVar6 = dVarArr2[1];
        if (dVar6.f1883f != null) {
            f fVarH8 = p.h(dVar6);
            if (fVarH8 != null) {
                p.b(fVar, fVarH8, -this.f2112b.R[1].e());
                c(fVar2, fVar, -1, gVar);
                return;
            }
            return;
        }
        if ((eVar11 instanceof b0.i) || (eVar3 = eVar11.V) == null) {
            return;
        }
        p.b(fVar2, eVar3.f1899d.h, eVar11.r());
        c(fVar, fVar2, 1, gVar);
    }

    @Override // c0.p
    public final void e() {
        f fVar = this.h;
        if (fVar.f2088j) {
            this.f2112b.f1894a0 = fVar.f2086g;
        }
    }

    @Override // c0.p
    public final void f() {
        this.f2113c = null;
        this.h.c();
        this.f2118i.c();
        this.f2115e.c();
        this.f2117g = false;
    }

    @Override // c0.p
    public final boolean k() {
        return this.f2114d != e.a.f1934u || this.f2112b.f1925r == 0;
    }

    public final void n() {
        this.f2117g = false;
        f fVar = this.h;
        fVar.c();
        fVar.f2088j = false;
        f fVar2 = this.f2118i;
        fVar2.c();
        fVar2.f2088j = false;
        this.f2115e.f2088j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f2112b.f1911j0;
    }
}
