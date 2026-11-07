package c0;

import b0.e;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c extends p {

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList<p> f2071k;

    /* renamed from: l, reason: collision with root package name */
    public int f2072l;

    public c(b0.e eVar, int i6) {
        b0.e eVar2;
        super(eVar);
        ArrayList<p> arrayList = new ArrayList<>();
        this.f2071k = arrayList;
        this.f2116f = i6;
        b0.e eVar3 = this.f2112b;
        b0.e eVarM = eVar3.m(i6);
        while (true) {
            eVar2 = eVar3;
            eVar3 = eVarM;
            if (eVar3 == null) {
                break;
            } else {
                eVarM = eVar3.m(this.f2116f);
            }
        }
        this.f2112b = eVar2;
        int i7 = this.f2116f;
        arrayList.add(i7 == 0 ? eVar2.f1899d : i7 == 1 ? eVar2.f1901e : null);
        b0.e eVarL = eVar2.l(this.f2116f);
        while (eVarL != null) {
            int i8 = this.f2116f;
            arrayList.add(i8 == 0 ? eVarL.f1899d : i8 == 1 ? eVarL.f1901e : null);
            eVarL = eVarL.l(this.f2116f);
        }
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            p pVar = arrayList.get(i9);
            i9++;
            p pVar2 = pVar;
            int i10 = this.f2116f;
            if (i10 == 0) {
                pVar2.f2112b.f1895b = this;
            } else if (i10 == 1) {
                pVar2.f2112b.f1897c = this;
            }
        }
        if (this.f2116f == 0 && ((b0.f) this.f2112b.V).f1941w0 && arrayList.size() > 1) {
            this.f2112b = arrayList.get(arrayList.size() - 1).f2112b;
        }
        this.f2072l = this.f2116f == 0 ? this.f2112b.f1913k0 : this.f2112b.f1915l0;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e2  */
    @Override // c0.p, c0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(d dVar) {
        int i6;
        int i7;
        e.a aVar;
        boolean z6;
        float f6;
        int i8;
        int i9;
        int i10;
        int i11;
        float f7;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z7;
        int i20;
        int i21;
        f fVar = this.h;
        if (fVar.f2088j) {
            f fVar2 = this.f2118i;
            if (fVar2.f2088j) {
                b0.e eVar = this.f2112b.V;
                boolean z8 = eVar instanceof b0.f ? ((b0.f) eVar).f1941w0 : false;
                int i22 = fVar2.f2086g - fVar.f2086g;
                ArrayList<p> arrayList = this.f2071k;
                int size = arrayList.size();
                int i23 = 0;
                while (true) {
                    i6 = -1;
                    i7 = 8;
                    if (i23 >= size) {
                        i23 = -1;
                        break;
                    } else if (arrayList.get(i23).f2112b.f1909i0 != 8) {
                        break;
                    } else {
                        i23++;
                    }
                }
                int i24 = size - 1;
                int i25 = i24;
                while (true) {
                    if (i25 < 0) {
                        break;
                    }
                    if (arrayList.get(i25).f2112b.f1909i0 != 8) {
                        i6 = i25;
                        break;
                    }
                    i25--;
                }
                int i26 = 0;
                while (true) {
                    aVar = e.a.f1934u;
                    if (i26 >= 2) {
                        z6 = z8;
                        f6 = 0.0f;
                        i8 = 0;
                        i9 = 0;
                        i10 = 0;
                        break;
                    }
                    f6 = 0.0f;
                    int i27 = 0;
                    i10 = 0;
                    i18 = 0;
                    i19 = 0;
                    while (i27 < size) {
                        p pVar = arrayList.get(i27);
                        boolean z9 = z8;
                        b0.e eVar2 = pVar.f2112b;
                        int i28 = i26;
                        if (eVar2.f1909i0 != i7) {
                            i19++;
                            if (i27 > 0 && i27 >= i23) {
                                i10 += pVar.h.f2085f;
                            }
                            g gVar = pVar.f2115e;
                            int i29 = gVar.f2086g;
                            boolean z10 = pVar.f2114d != aVar;
                            if (z10) {
                                int i30 = this.f2116f;
                                z7 = z10;
                                if (i30 == 0 && !eVar2.f1899d.f2115e.f2088j) {
                                    return;
                                }
                                if (i30 == 1 && !eVar2.f1901e.f2115e.f2088j) {
                                    return;
                                } else {
                                    i20 = i10;
                                }
                            } else {
                                z7 = z10;
                                i20 = i10;
                                if (pVar.f2111a == 1 && i28 == 0) {
                                    i21 = gVar.f2098m;
                                    i18++;
                                } else if (gVar.f2088j) {
                                    i21 = i29;
                                }
                                z7 = true;
                                if (z7) {
                                    i18++;
                                    float f8 = eVar2.f1917m0[this.f2116f];
                                    if (f8 >= 0.0f) {
                                        f6 += f8;
                                    }
                                    i10 = i20;
                                } else {
                                    i10 = i20 + i21;
                                }
                                if (i27 >= i24 && i27 < i6) {
                                    i10 += -pVar.f2118i.f2085f;
                                }
                            }
                            i21 = i29;
                            if (z7) {
                            }
                            if (i27 >= i24) {
                            }
                        }
                        i27++;
                        z8 = z9;
                        i26 = i28;
                        i7 = 8;
                    }
                    z6 = z8;
                    int i31 = i26;
                    if (i10 < i22 || i18 == 0) {
                        break;
                    }
                    i26 = i31 + 1;
                    z8 = z6;
                    i7 = 8;
                }
                i8 = i18;
                i9 = i19;
                int i32 = fVar.f2086g;
                if (z6) {
                    i32 = fVar2.f2086g;
                }
                float f9 = 0.5f;
                if (i10 > i22) {
                    i32 = z6 ? i32 + ((int) (((i10 - i22) / 2.0f) + 0.5f)) : i32 - ((int) (((i10 - i22) / 2.0f) + 0.5f));
                }
                if (i8 > 0) {
                    float f10 = i22 - i10;
                    int i33 = (int) ((f10 / i8) + 0.5f);
                    int i34 = 0;
                    int i35 = 0;
                    while (i34 < size) {
                        float f11 = f9;
                        p pVar2 = arrayList.get(i34);
                        int i36 = i32;
                        b0.e eVar3 = pVar2.f2112b;
                        int i37 = i8;
                        g gVar2 = pVar2.f2115e;
                        float f12 = f10;
                        int i38 = i33;
                        if (eVar3.f1909i0 == 8 || pVar2.f2114d != aVar || gVar2.f2088j) {
                            i17 = i34;
                        } else {
                            int i39 = f6 > 0.0f ? (int) (((eVar3.f1917m0[this.f2116f] * f12) / f6) + f11) : i38;
                            if (this.f2116f == 0) {
                                i15 = eVar3.f1928v;
                                i16 = eVar3.f1927u;
                            } else {
                                i15 = eVar3.f1931y;
                                i16 = eVar3.f1930x;
                            }
                            i17 = i34;
                            int iMax = Math.max(i16, pVar2.f2111a == 1 ? Math.min(i39, gVar2.f2098m) : i39);
                            if (i15 > 0) {
                                iMax = Math.min(i15, iMax);
                            }
                            if (iMax != i39) {
                                i35++;
                                i39 = iMax;
                            }
                            gVar2.d(i39);
                        }
                        i34 = i17 + 1;
                        i32 = i36;
                        f9 = f11;
                        i8 = i37;
                        f10 = f12;
                        i33 = i38;
                    }
                    i11 = i32;
                    f7 = f9;
                    int i40 = i8;
                    if (i35 > 0) {
                        i8 = i40 - i35;
                        i10 = 0;
                        for (int i41 = 0; i41 < size; i41++) {
                            p pVar3 = arrayList.get(i41);
                            if (pVar3.f2112b.f1909i0 != 8) {
                                if (i41 > 0 && i41 >= i23) {
                                    i10 += pVar3.h.f2085f;
                                }
                                i10 += pVar3.f2115e.f2086g;
                                if (i41 < i24 && i41 < i6) {
                                    i10 += -pVar3.f2118i.f2085f;
                                }
                            }
                        }
                    } else {
                        i8 = i40;
                    }
                    i13 = 2;
                    if (this.f2072l == 2 && i35 == 0) {
                        i12 = 0;
                        this.f2072l = 0;
                    } else {
                        i12 = 0;
                    }
                } else {
                    i11 = i32;
                    f7 = 0.5f;
                    i12 = 0;
                    i13 = 2;
                }
                if (i10 > i22) {
                    this.f2072l = i13;
                }
                if (i9 > 0 && i8 == 0 && i23 == i6) {
                    this.f2072l = i13;
                }
                int i42 = this.f2072l;
                if (i42 == 1) {
                    int i43 = i9 > 1 ? (i22 - i10) / (i9 - 1) : i9 == 1 ? (i22 - i10) / 2 : i12;
                    if (i8 > 0) {
                        i43 = i12;
                    }
                    int i44 = i11;
                    for (int i45 = i12; i45 < size; i45++) {
                        p pVar4 = arrayList.get(z6 ? size - (i45 + 1) : i45);
                        b0.e eVar4 = pVar4.f2112b;
                        f fVar3 = pVar4.f2118i;
                        f fVar4 = pVar4.h;
                        if (eVar4.f1909i0 == 8) {
                            fVar4.d(i44);
                            fVar3.d(i44);
                        } else {
                            if (i45 > 0) {
                                i44 = z6 ? i44 - i43 : i44 + i43;
                            }
                            if (i45 > 0 && i45 >= i23) {
                                i44 = z6 ? i44 - fVar4.f2085f : i44 + fVar4.f2085f;
                            }
                            if (z6) {
                                fVar3.d(i44);
                            } else {
                                fVar4.d(i44);
                            }
                            g gVar3 = pVar4.f2115e;
                            int i46 = gVar3.f2086g;
                            if (pVar4.f2114d == aVar) {
                                i14 = i44;
                                if (pVar4.f2111a == 1) {
                                    i46 = gVar3.f2098m;
                                }
                            } else {
                                i14 = i44;
                            }
                            i44 = z6 ? i14 - i46 : i14 + i46;
                            if (z6) {
                                fVar4.d(i44);
                            } else {
                                fVar3.d(i44);
                            }
                            pVar4.f2117g = true;
                            if (i45 < i24 && i45 < i6) {
                                i44 = z6 ? i44 - (-fVar3.f2085f) : i44 + (-fVar3.f2085f);
                            }
                        }
                    }
                    return;
                }
                if (i42 == 0) {
                    int i47 = (i22 - i10) / (i9 + 1);
                    if (i8 > 0) {
                        i47 = i12;
                    }
                    int i48 = i11;
                    for (int i49 = i12; i49 < size; i49++) {
                        p pVar5 = arrayList.get(z6 ? size - (i49 + 1) : i49);
                        b0.e eVar5 = pVar5.f2112b;
                        f fVar5 = pVar5.f2118i;
                        f fVar6 = pVar5.h;
                        if (eVar5.f1909i0 == 8) {
                            fVar6.d(i48);
                            fVar5.d(i48);
                        } else {
                            int i50 = z6 ? i48 - i47 : i48 + i47;
                            if (i49 > 0 && i49 >= i23) {
                                i50 = z6 ? i50 - fVar6.f2085f : i50 + fVar6.f2085f;
                            }
                            if (z6) {
                                fVar5.d(i50);
                            } else {
                                fVar6.d(i50);
                            }
                            g gVar4 = pVar5.f2115e;
                            int iMin = gVar4.f2086g;
                            if (pVar5.f2114d == aVar && pVar5.f2111a == 1) {
                                iMin = Math.min(iMin, gVar4.f2098m);
                            }
                            i48 = z6 ? i50 - iMin : i50 + iMin;
                            if (z6) {
                                fVar6.d(i48);
                            } else {
                                fVar5.d(i48);
                            }
                            if (i49 < i24 && i49 < i6) {
                                i48 = z6 ? i48 - (-fVar5.f2085f) : i48 + (-fVar5.f2085f);
                            }
                        }
                    }
                    return;
                }
                if (i42 == 2) {
                    float f13 = this.f2116f == 0 ? this.f2112b.f1904f0 : this.f2112b.f1906g0;
                    if (z6) {
                        f13 = 1.0f - f13;
                    }
                    int i51 = (int) (((i22 - i10) * f13) + f7);
                    if (i51 < 0 || i8 > 0) {
                        i51 = i12;
                    }
                    int i52 = z6 ? i11 - i51 : i11 + i51;
                    for (int i53 = i12; i53 < size; i53++) {
                        p pVar6 = arrayList.get(z6 ? size - (i53 + 1) : i53);
                        b0.e eVar6 = pVar6.f2112b;
                        f fVar7 = pVar6.f2118i;
                        f fVar8 = pVar6.h;
                        if (eVar6.f1909i0 == 8) {
                            fVar8.d(i52);
                            fVar7.d(i52);
                        } else {
                            if (i53 > 0 && i53 >= i23) {
                                i52 = z6 ? i52 - fVar8.f2085f : i52 + fVar8.f2085f;
                            }
                            if (z6) {
                                fVar7.d(i52);
                            } else {
                                fVar8.d(i52);
                            }
                            g gVar5 = pVar6.f2115e;
                            int i54 = gVar5.f2086g;
                            if (pVar6.f2114d == aVar && pVar6.f2111a == 1) {
                                i54 = gVar5.f2098m;
                            }
                            i52 = z6 ? i52 - i54 : i52 + i54;
                            if (z6) {
                                fVar8.d(i52);
                            } else {
                                fVar7.d(i52);
                            }
                            if (i53 < i24 && i53 < i6) {
                                i52 = z6 ? i52 - (-fVar7.f2085f) : i52 + (-fVar7.f2085f);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // c0.p
    public final void d() {
        ArrayList<p> arrayList = this.f2071k;
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            p pVar = arrayList.get(i6);
            i6++;
            pVar.d();
        }
        int size2 = arrayList.size();
        if (size2 < 1) {
            return;
        }
        b0.e eVar = arrayList.get(0).f2112b;
        b0.e eVar2 = arrayList.get(size2 - 1).f2112b;
        int i7 = this.f2116f;
        f fVar = this.f2118i;
        f fVar2 = this.h;
        if (i7 == 0) {
            b0.d dVar = eVar.J;
            b0.d dVar2 = eVar2.L;
            f fVarI = p.i(dVar, 0);
            int iE = dVar.e();
            b0.e eVarM = m();
            if (eVarM != null) {
                iE = eVarM.J.e();
            }
            if (fVarI != null) {
                p.b(fVar2, fVarI, iE);
            }
            f fVarI2 = p.i(dVar2, 0);
            int iE2 = dVar2.e();
            b0.e eVarN = n();
            if (eVarN != null) {
                iE2 = eVarN.L.e();
            }
            if (fVarI2 != null) {
                p.b(fVar, fVarI2, -iE2);
            }
        } else {
            b0.d dVar3 = eVar.K;
            b0.d dVar4 = eVar2.M;
            f fVarI3 = p.i(dVar3, 1);
            int iE3 = dVar3.e();
            b0.e eVarM2 = m();
            if (eVarM2 != null) {
                iE3 = eVarM2.K.e();
            }
            if (fVarI3 != null) {
                p.b(fVar2, fVarI3, iE3);
            }
            f fVarI4 = p.i(dVar4, 1);
            int iE4 = dVar4.e();
            b0.e eVarN2 = n();
            if (eVarN2 != null) {
                iE4 = eVarN2.M.e();
            }
            if (fVarI4 != null) {
                p.b(fVar, fVarI4, -iE4);
            }
        }
        fVar2.f2080a = this;
        fVar.f2080a = this;
    }

    @Override // c0.p
    public final void e() {
        int i6 = 0;
        while (true) {
            ArrayList<p> arrayList = this.f2071k;
            if (i6 >= arrayList.size()) {
                return;
            }
            arrayList.get(i6).e();
            i6++;
        }
    }

    @Override // c0.p
    public final void f() {
        this.f2113c = null;
        ArrayList<p> arrayList = this.f2071k;
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            p pVar = arrayList.get(i6);
            i6++;
            pVar.f();
        }
    }

    @Override // c0.p
    public final long j() {
        ArrayList<p> arrayList = this.f2071k;
        int size = arrayList.size();
        long j6 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            j6 = r5.f2118i.f2085f + arrayList.get(i6).j() + j6 + r5.h.f2085f;
        }
        return j6;
    }

    @Override // c0.p
    public final boolean k() {
        ArrayList<p> arrayList = this.f2071k;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            if (!arrayList.get(i6).k()) {
                return false;
            }
        }
        return true;
    }

    public final b0.e m() {
        int i6 = 0;
        while (true) {
            ArrayList<p> arrayList = this.f2071k;
            if (i6 >= arrayList.size()) {
                return null;
            }
            b0.e eVar = arrayList.get(i6).f2112b;
            if (eVar.f1909i0 != 8) {
                return eVar;
            }
            i6++;
        }
    }

    public final b0.e n() {
        ArrayList<p> arrayList = this.f2071k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            b0.e eVar = arrayList.get(size).f2112b;
            if (eVar.f1909i0 != 8) {
                return eVar;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f2116f == 0 ? "horizontal : " : "vertical : ");
        ArrayList<p> arrayList = this.f2071k;
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            p pVar = arrayList.get(i6);
            i6++;
            sb.append("<");
            sb.append(pVar);
            sb.append("> ");
        }
        return sb.toString();
    }
}
