package b0;

import b0.e;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b {
    /* JADX WARN: Removed duplicated region for block: B:189:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x06ac  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x06b7  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x06ba  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x06c0  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x06c3  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x06d7  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x06db A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:435:0x06f7 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(f fVar, z.c cVar, ArrayList<e> arrayList, int i6) {
        int i7;
        c[] cVarArr;
        int i8;
        int i9;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        e eVar;
        float f6;
        int i10;
        e eVar2;
        z.c cVar2;
        e eVar3;
        z.e eVar4;
        d dVar;
        z.e eVar5;
        e eVar6;
        int i11;
        d dVar2;
        z.e eVar7;
        e eVar8;
        d[] dVarArr;
        e eVar9;
        int i12;
        z.e eVar10;
        int size;
        ArrayList<e> arrayList2;
        int i13;
        int i14;
        e eVar11;
        float f7;
        float f8;
        float f9;
        int i15;
        e eVar12;
        int i16;
        int i17;
        int i18;
        e eVar13;
        float f10;
        f fVar2 = fVar;
        z.c cVar3 = cVar;
        ArrayList<e> arrayList3 = arrayList;
        if (i6 == 0) {
            i7 = fVar2.A0;
            cVarArr = fVar2.D0;
            i8 = 0;
        } else {
            i7 = fVar2.B0;
            cVarArr = fVar2.C0;
            i8 = 2;
        }
        int i19 = i7;
        c[] cVarArr2 = cVarArr;
        int i20 = 0;
        while (i20 < i19) {
            c cVar4 = cVarArr2[i20];
            boolean z10 = cVar4.f1877q;
            e eVar14 = cVar4.f1862a;
            d[] dVarArr2 = eVar14.R;
            e.a aVar = e.a.f1934u;
            int i21 = 8;
            float f11 = 0.0f;
            if (z10) {
                i9 = i20;
            } else {
                int i22 = cVar4.f1872l;
                int i23 = i22 * 2;
                e eVar15 = eVar14;
                e eVar16 = eVar15;
                boolean z11 = false;
                while (!z11) {
                    cVar4.f1869i++;
                    e[] eVarArr = eVar15.f1921o0;
                    d[] dVarArr3 = eVar15.R;
                    eVarArr[i22] = null;
                    eVar15.f1919n0[i22] = null;
                    if (eVar15.f1909i0 != i21) {
                        eVar15.j(i22);
                        dVarArr3[i23].e();
                        int i24 = i23 + 1;
                        dVarArr3[i24].e();
                        dVarArr3[i23].e();
                        dVarArr3[i24].e();
                        if (cVar4.f1863b == null) {
                            cVar4.f1863b = eVar15;
                        }
                        cVar4.f1865d = eVar15;
                        e.a aVar2 = eVar15.U[i22];
                        if (aVar2 == aVar) {
                            int i25 = eVar15.f1926t[i22];
                            i17 = i20;
                            if (i25 == 0 || i25 == 3 || i25 == 2) {
                                cVar4.f1870j++;
                                float f12 = eVar15.f1917m0[i22];
                                if (f12 > 0.0f) {
                                    f10 = f12;
                                    cVar4.f1871k += f10;
                                } else {
                                    f10 = f12;
                                }
                                i18 = i22;
                                if (eVar15.f1909i0 != 8 && aVar2 == aVar && (i25 == 0 || i25 == 3)) {
                                    if (f10 < 0.0f) {
                                        cVar4.f1874n = true;
                                    } else {
                                        cVar4.f1875o = true;
                                    }
                                    if (cVar4.h == null) {
                                        cVar4.h = new ArrayList<>();
                                    }
                                    cVar4.h.add(eVar15);
                                }
                                if (cVar4.f1867f == null) {
                                    cVar4.f1867f = eVar15;
                                }
                                e eVar17 = cVar4.f1868g;
                                if (eVar17 != null) {
                                    eVar17.f1919n0[i18] = eVar15;
                                }
                                cVar4.f1868g = eVar15;
                            } else {
                                i18 = i22;
                            }
                            if (i18 == 0) {
                                if (eVar15.f1925r == 0 && eVar15.f1927u == 0) {
                                    int i26 = eVar15.f1928v;
                                }
                            } else if (eVar15.s == 0 && eVar15.f1930x == 0) {
                                int i27 = eVar15.f1931y;
                            }
                        } else {
                            i17 = i20;
                            i18 = i22;
                        }
                    }
                    e eVar18 = eVar16;
                    if (eVar18 != eVar15) {
                        eVar18.f1921o0[i18] = eVar15;
                    }
                    d dVar3 = dVarArr3[i23 + 1].f1883f;
                    if (dVar3 != null) {
                        eVar13 = dVar3.f1881d;
                        d dVar4 = eVar13.R[i23].f1883f;
                        if (dVar4 == null || dVar4.f1881d != eVar15) {
                            eVar13 = null;
                        }
                    }
                    if (eVar13 == null) {
                        eVar13 = eVar15;
                        z11 = true;
                    }
                    eVar16 = eVar15;
                    i22 = i18;
                    i21 = 8;
                    eVar15 = eVar13;
                    i20 = i17;
                }
                i9 = i20;
                int i28 = i22;
                e eVar19 = cVar4.f1863b;
                if (eVar19 != null) {
                    eVar19.R[i23].e();
                }
                e eVar20 = cVar4.f1865d;
                if (eVar20 != null) {
                    eVar20.R[i23 + 1].e();
                }
                cVar4.f1864c = eVar15;
                if (i28 == 0 && cVar4.f1873m) {
                    cVar4.f1866e = eVar15;
                } else {
                    cVar4.f1866e = eVar14;
                }
                cVar4.f1876p = cVar4.f1875o && cVar4.f1874n;
            }
            cVar4.f1877q = true;
            if (arrayList3 == null || arrayList3.contains(eVar14)) {
                e eVar21 = cVar4.f1864c;
                e eVar22 = cVar4.f1863b;
                e eVar23 = cVar4.f1865d;
                e eVar24 = cVar4.f1866e;
                float f13 = cVar4.f1871k;
                e.a[] aVarArr = fVar2.U;
                d[] dVarArr4 = dVarArr2;
                d[] dVarArr5 = fVar2.R;
                boolean z12 = aVarArr[i6] == e.a.f1933t;
                if (i6 == 0) {
                    int i29 = eVar24.f1913k0;
                    boolean z13 = i29 == 0;
                    z6 = z12;
                    z8 = i29 == 1;
                    z9 = i29 == 2;
                    eVar = eVar14;
                    f6 = f13;
                    z7 = z13;
                } else {
                    z6 = z12;
                    int i30 = eVar24.f1915l0;
                    z7 = i30 == 0;
                    z8 = i30 == 1;
                    z9 = i30 == 2;
                    eVar = eVar14;
                    f6 = f13;
                }
                boolean z14 = z8;
                boolean z15 = false;
                while (!z15) {
                    d[] dVarArr6 = eVar.R;
                    e.a[] aVarArr2 = eVar.U;
                    d dVar5 = dVarArr6[i8];
                    int i31 = z9 ? 1 : 4;
                    int iE = dVar5.e();
                    boolean z16 = z9;
                    boolean z17 = aVarArr2[i6] == aVar && eVar.f1926t[i6] == 0;
                    d dVar6 = dVar5.f1883f;
                    if (dVar6 != null && eVar != eVar14) {
                        iE = dVar6.e() + iE;
                    }
                    int i32 = iE;
                    if (z16 && eVar != eVar14 && eVar != eVar22) {
                        i31 = 8;
                    }
                    e eVar25 = eVar14;
                    d dVar7 = dVar5.f1883f;
                    if (dVar7 != null) {
                        if (eVar == eVar22) {
                            i15 = i19;
                            cVar3.f(dVar5.f1885i, dVar7.f1885i, i32, 6);
                        } else {
                            i15 = i19;
                            cVar3.f(dVar5.f1885i, dVar7.f1885i, i32, 8);
                        }
                        if (z17 && !z16) {
                            i31 = 5;
                        }
                        cVar3.e(dVar5.f1885i, dVar5.f1883f.f1885i, i32, (eVar == eVar22 && z16 && eVar.T[i6]) ? 5 : i31);
                    } else {
                        i15 = i19;
                    }
                    if (z6) {
                        if (eVar.f1909i0 == 8 || aVarArr2[i6] != aVar) {
                            i16 = 0;
                        } else {
                            i16 = 0;
                            cVar3.f(dVarArr6[i8 + 1].f1885i, dVarArr6[i8].f1885i, 0, 5);
                        }
                        cVar3.f(dVarArr6[i8].f1885i, dVarArr5[i8].f1885i, i16, 8);
                    }
                    d dVar8 = dVarArr6[i8 + 1].f1883f;
                    if (dVar8 != null) {
                        eVar12 = dVar8.f1881d;
                        d dVar9 = eVar12.R[i8].f1883f;
                        if (dVar9 == null || dVar9.f1881d != eVar) {
                            eVar12 = null;
                        }
                    }
                    if (eVar12 != null) {
                        eVar = eVar12;
                    } else {
                        z15 = true;
                    }
                    eVar14 = eVar25;
                    z9 = z16;
                    i19 = i15;
                }
                boolean z18 = z9;
                i10 = i19;
                if (eVar23 != null) {
                    int i33 = i8 + 1;
                    if (eVar21.R[i33].f1883f != null) {
                        d dVar10 = eVar23.R[i33];
                        if (eVar23.U[i6] == aVar && eVar23.f1926t[i6] == 0 && !z18) {
                            d dVar11 = dVar10.f1883f;
                            if (dVar11.f1881d == fVar2) {
                                cVar3.e(dVar10.f1885i, dVar11.f1885i, -dVar10.e(), 5);
                            }
                            cVar3.g(dVar10.f1885i, eVar21.R[i33].f1883f.f1885i, -dVar10.e(), 6);
                        } else {
                            if (z18) {
                                d dVar12 = dVar10.f1883f;
                                if (dVar12.f1881d == fVar2) {
                                    cVar3.e(dVar10.f1885i, dVar12.f1885i, -dVar10.e(), 4);
                                }
                            }
                            cVar3.g(dVar10.f1885i, eVar21.R[i33].f1883f.f1885i, -dVar10.e(), 6);
                        }
                    }
                    if (z6) {
                        int i34 = i8 + 1;
                        z.e eVar26 = dVarArr5[i34].f1885i;
                        d dVar13 = eVar21.R[i34];
                        cVar3.f(eVar26, dVar13.f1885i, dVar13.e(), 8);
                    }
                    ArrayList<e> arrayList4 = cVar4.h;
                    if (arrayList4 != null && (size = arrayList4.size()) > 1) {
                        float f14 = (!cVar4.f1874n || cVar4.f1876p) ? f6 : cVar4.f1870j;
                        e eVar27 = null;
                        float f15 = 0.0f;
                        int i35 = 0;
                        while (i35 < size) {
                            e eVar28 = arrayList4.get(i35);
                            float[] fArr = eVar28.f1917m0;
                            d[] dVarArr7 = eVar28.R;
                            float f16 = fArr[i6];
                            if (f16 >= f11) {
                                arrayList2 = arrayList4;
                                if (f16 != f11) {
                                    i13 = i35;
                                    cVar3.e(dVarArr7[i8 + 1].f1885i, dVarArr7[i8].f1885i, 0, 8);
                                    i14 = size;
                                    f7 = f14;
                                    f8 = f11;
                                } else {
                                    i13 = i35;
                                    if (eVar27 != null) {
                                        d[] dVarArr8 = eVar27.R;
                                        z.e eVar29 = dVarArr8[i8].f1885i;
                                        int i36 = i8 + 1;
                                        z.e eVar30 = dVarArr8[i36].f1885i;
                                        z.e eVar31 = dVarArr7[i8].f1885i;
                                        z.e eVar32 = dVarArr7[i36].f1885i;
                                        i14 = size;
                                        z.b bVarL = cVar3.l();
                                        eVar11 = eVar28;
                                        float f17 = f11;
                                        bVarL.f15388b = f17;
                                        f8 = f17;
                                        if (f14 == f17 || f15 == f16) {
                                            f7 = f14;
                                            f9 = f16;
                                            bVarL.f15390d.f(eVar29, 1.0f);
                                            bVarL.f15390d.f(eVar30, -1.0f);
                                            bVarL.f15390d.f(eVar32, 1.0f);
                                            bVarL.f15390d.f(eVar31, -1.0f);
                                        } else {
                                            if (f15 == f8) {
                                                bVarL.f15390d.f(eVar29, 1.0f);
                                                bVarL.f15390d.f(eVar30, -1.0f);
                                            } else if (f16 == f11) {
                                                bVarL.f15390d.f(eVar31, 1.0f);
                                                bVarL.f15390d.f(eVar32, -1.0f);
                                            } else {
                                                f7 = f14;
                                                float f18 = (f15 / f14) / (f16 / f14);
                                                f9 = f16;
                                                bVarL.f15390d.f(eVar29, 1.0f);
                                                bVarL.f15390d.f(eVar30, -1.0f);
                                                bVarL.f15390d.f(eVar32, f18);
                                                bVarL.f15390d.f(eVar31, -f18);
                                            }
                                            f7 = f14;
                                            f9 = f16;
                                        }
                                        cVar3.c(bVarL);
                                    } else {
                                        i14 = size;
                                        eVar11 = eVar28;
                                        f7 = f14;
                                        f8 = f11;
                                        f9 = f16;
                                    }
                                    f15 = f9;
                                    eVar27 = eVar11;
                                }
                            } else if (cVar4.f1876p) {
                                arrayList2 = arrayList4;
                                cVar3.e(dVarArr7[i8 + 1].f1885i, dVarArr7[i8].f1885i, 0, 4);
                                i13 = i35;
                                i14 = size;
                                f7 = f14;
                                f8 = f11;
                            } else {
                                f16 = 1.0f;
                                arrayList2 = arrayList4;
                                if (f16 != f11) {
                                }
                            }
                            i35 = i13 + 1;
                            arrayList4 = arrayList2;
                            size = i14;
                            f14 = f7;
                            f11 = f8;
                        }
                    }
                    if (eVar22 == null || !(eVar22 == eVar23 || z18)) {
                        eVar2 = eVar23;
                        if (!z7 || eVar22 == null) {
                            int i37 = 8;
                            if (z14 && eVar22 != null) {
                                int i38 = cVar4.f1870j;
                                boolean z19 = i38 > 0 && cVar4.f1869i == i38;
                                e eVar33 = eVar22;
                                e eVar34 = eVar33;
                                while (eVar34 != null) {
                                    d[] dVarArr9 = eVar34.R;
                                    e eVar35 = eVar34.f1921o0[i6];
                                    while (eVar35 != null && eVar35.f1909i0 == i37) {
                                        eVar35 = eVar35.f1921o0[i6];
                                    }
                                    if (eVar34 == eVar22 || eVar34 == eVar2 || eVar35 == null) {
                                        eVar3 = eVar33;
                                    } else {
                                        if (eVar35 == eVar2) {
                                            eVar35 = null;
                                        }
                                        d dVar14 = dVarArr9[i8];
                                        z.e eVar36 = dVar14.f1885i;
                                        int i39 = i8 + 1;
                                        z.e eVar37 = eVar33.R[i39].f1885i;
                                        int iE2 = dVar14.e();
                                        int iE3 = dVarArr9[i39].e();
                                        if (eVar35 != null) {
                                            dVar = eVar35.R[i8];
                                            eVar5 = dVar.f1885i;
                                            d dVar15 = dVar.f1883f;
                                            eVar4 = dVar15 != null ? dVar15.f1885i : null;
                                        } else {
                                            d dVar16 = eVar2.R[i8];
                                            z.e eVar38 = dVar16 != null ? dVar16.f1885i : null;
                                            eVar4 = dVarArr9[i39].f1885i;
                                            dVar = dVar16;
                                            eVar5 = eVar38;
                                        }
                                        if (dVar != null) {
                                            iE3 += dVar.e();
                                        }
                                        int iE4 = iE2 + eVar33.R[i39].e();
                                        e eVar39 = eVar35;
                                        z.e eVar40 = eVar5;
                                        int i40 = z19 ? 8 : 4;
                                        if (eVar36 == null || eVar37 == null || eVar40 == null || eVar4 == null) {
                                            eVar3 = eVar33;
                                            eVar6 = eVar39;
                                        } else {
                                            eVar6 = eVar39;
                                            z.e eVar41 = eVar4;
                                            eVar3 = eVar33;
                                            cVar.b(eVar36, eVar37, iE4, 0.5f, eVar40, eVar41, iE3, i40);
                                        }
                                        eVar35 = eVar6;
                                    }
                                    if (eVar34.f1909i0 != 8) {
                                        eVar3 = eVar34;
                                    }
                                    eVar34 = eVar35;
                                    eVar33 = eVar3;
                                    i37 = 8;
                                }
                                cVar2 = cVar;
                                d dVar17 = eVar22.R[i8];
                                d dVar18 = dVarArr4[i8].f1883f;
                                int i41 = i8 + 1;
                                d dVar19 = eVar2.R[i41];
                                d dVar20 = eVar21.R[i41].f1883f;
                                if (dVar18 != null) {
                                    if (eVar22 != eVar2) {
                                        cVar2.e(dVar17.f1885i, dVar18.f1885i, dVar17.e(), 5);
                                    } else if (dVar20 != null) {
                                        cVar2.b(dVar17.f1885i, dVar18.f1885i, dVar17.e(), 0.5f, dVar19.f1885i, dVar20.f1885i, dVar19.e(), 5);
                                    }
                                }
                                if (dVar20 != null && eVar22 != eVar2) {
                                    cVar2.e(dVar19.f1885i, dVar20.f1885i, -dVar19.e(), 5);
                                }
                            }
                            if ((z7 || z14) && eVar22 != null && eVar22 != eVar2) {
                                d[] dVarArr10 = eVar22.R;
                                d dVar21 = dVarArr10[i8];
                                if (eVar2 == null) {
                                    eVar2 = eVar22;
                                }
                                d[] dVarArr11 = eVar2.R;
                                int i42 = i8 + 1;
                                d dVar22 = dVarArr11[i42];
                                d dVar23 = dVar21.f1883f;
                                eVar10 = dVar23 != null ? dVar23.f1885i : null;
                                d dVar24 = dVar22.f1883f;
                                z.e eVar42 = dVar24 != null ? dVar24.f1885i : null;
                                if (eVar21 != eVar2) {
                                    d dVar25 = eVar21.R[i42].f1883f;
                                    eVar42 = dVar25 != null ? dVar25.f1885i : null;
                                }
                                if (eVar22 == eVar2) {
                                    dVar22 = dVarArr10[i42];
                                }
                                if (eVar10 != null && eVar42 != null) {
                                    cVar2.b(dVar21.f1885i, eVar10, dVar21.e(), 0.5f, eVar42, dVar22.f1885i, dVarArr11[i42].e(), 5);
                                }
                            }
                        } else {
                            int i43 = cVar4.f1870j;
                            boolean z20 = i43 > 0 && cVar4.f1869i == i43;
                            e eVar43 = eVar22;
                            e eVar44 = eVar43;
                            while (eVar43 != null) {
                                d[] dVarArr12 = eVar43.R;
                                e eVar45 = eVar43.f1921o0[i6];
                                while (true) {
                                    if (eVar45 == null) {
                                        i11 = 8;
                                        break;
                                    }
                                    i11 = 8;
                                    if (eVar45.f1909i0 != 8) {
                                        break;
                                    } else {
                                        eVar45 = eVar45.f1921o0[i6];
                                    }
                                }
                                if (eVar45 != null || eVar43 == eVar2) {
                                    d dVar26 = dVarArr12[i8];
                                    z.e eVar46 = dVar26.f1885i;
                                    d dVar27 = dVar26.f1883f;
                                    z.e eVar47 = dVar27 != null ? dVar27.f1885i : null;
                                    if (eVar44 != eVar43) {
                                        eVar47 = eVar44.R[i8 + 1].f1885i;
                                    } else if (eVar43 == eVar22) {
                                        d dVar28 = dVarArr4[i8].f1883f;
                                        eVar47 = dVar28 != null ? dVar28.f1885i : null;
                                    }
                                    int iE5 = dVar26.e();
                                    int i44 = i8 + 1;
                                    int iE6 = dVarArr12[i44].e();
                                    if (eVar45 != null) {
                                        dVar2 = eVar45.R[i8];
                                        eVar7 = dVar2.f1885i;
                                    } else {
                                        dVar2 = eVar21.R[i44].f1883f;
                                        eVar7 = dVar2 != null ? dVar2.f1885i : null;
                                    }
                                    z.e eVar48 = dVarArr12[i44].f1885i;
                                    if (dVar2 != null) {
                                        iE6 += dVar2.e();
                                    }
                                    int iE7 = eVar44.R[i44].e() + iE5;
                                    if (eVar46 == null || eVar47 == null || eVar7 == null || eVar48 == null) {
                                        eVar8 = eVar45;
                                        dVarArr = dVarArr4;
                                        eVar9 = eVar44;
                                        i12 = 8;
                                    } else {
                                        if (eVar43 == eVar22) {
                                            iE7 = eVar22.R[i8].e();
                                        }
                                        if (eVar43 == eVar2) {
                                            iE6 = eVar2.R[i44].e();
                                        }
                                        eVar8 = eVar45;
                                        dVarArr = dVarArr4;
                                        eVar9 = eVar44;
                                        i12 = 8;
                                        cVar.b(eVar46, eVar47, iE7, 0.5f, eVar7, eVar48, iE6, z20 ? 8 : 5);
                                    }
                                } else {
                                    eVar8 = eVar45;
                                    dVarArr = dVarArr4;
                                    eVar9 = eVar44;
                                    i12 = i11;
                                }
                                if (eVar43.f1909i0 != i12) {
                                    eVar9 = eVar43;
                                }
                                eVar43 = eVar8;
                                eVar44 = eVar9;
                                dVarArr4 = dVarArr;
                            }
                        }
                    } else {
                        d dVar29 = dVarArr4[i8];
                        int i45 = i8 + 1;
                        d dVar30 = eVar21.R[i45];
                        d dVar31 = dVar29.f1883f;
                        z.e eVar49 = dVar31 != null ? dVar31.f1885i : null;
                        d dVar32 = dVar30.f1883f;
                        z.e eVar50 = dVar32 != null ? dVar32.f1885i : null;
                        d dVar33 = eVar22.R[i8];
                        if (eVar23 != null) {
                            dVar30 = eVar23.R[i45];
                        }
                        if (eVar49 == null || eVar50 == null) {
                            eVar2 = eVar23;
                        } else {
                            float f19 = i6 == 0 ? eVar24.f1904f0 : eVar24.f1906g0;
                            int iE8 = dVar33.e();
                            int iE9 = dVar30.e();
                            z.e eVar51 = dVar33.f1885i;
                            z.e eVar52 = dVar30.f1885i;
                            z.e eVar53 = eVar49;
                            eVar2 = eVar23;
                            cVar3.b(eVar51, eVar53, iE8, f19, eVar50, eVar52, iE9, 7);
                        }
                    }
                    cVar2 = cVar;
                    if (z7) {
                        d[] dVarArr102 = eVar22.R;
                        d dVar212 = dVarArr102[i8];
                        if (eVar2 == null) {
                        }
                        d[] dVarArr112 = eVar2.R;
                        int i422 = i8 + 1;
                        d dVar222 = dVarArr112[i422];
                        d dVar232 = dVar212.f1883f;
                        if (dVar232 != null) {
                        }
                        d dVar242 = dVar222.f1883f;
                        if (dVar242 != null) {
                        }
                        if (eVar21 != eVar2) {
                        }
                        if (eVar22 == eVar2) {
                        }
                        if (eVar10 != null) {
                        }
                    } else {
                        d[] dVarArr1022 = eVar22.R;
                        d dVar2122 = dVarArr1022[i8];
                        if (eVar2 == null) {
                        }
                        d[] dVarArr1122 = eVar2.R;
                        int i4222 = i8 + 1;
                        d dVar2222 = dVarArr1122[i4222];
                        d dVar2322 = dVar2122.f1883f;
                        if (dVar2322 != null) {
                        }
                        d dVar2422 = dVar2222.f1883f;
                        if (dVar2422 != null) {
                        }
                        if (eVar21 != eVar2) {
                        }
                        if (eVar22 == eVar2) {
                        }
                        if (eVar10 != null) {
                        }
                    }
                }
            } else {
                i10 = i19;
            }
            i20 = i9 + 1;
            fVar2 = fVar;
            cVar3 = cVar;
            arrayList3 = arrayList;
            i19 = i10;
        }
    }
}
