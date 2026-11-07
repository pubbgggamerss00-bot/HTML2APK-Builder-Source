package i2;

import androidx.compose.ui.d;
import i2.e1;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public final e0 f13789a;

    /* renamed from: b, reason: collision with root package name */
    public final w f13790b;

    /* renamed from: c, reason: collision with root package name */
    public g1 f13791c;

    /* renamed from: d, reason: collision with root package name */
    public final l2 f13792d;

    /* renamed from: e, reason: collision with root package name */
    public d.c f13793e;

    /* renamed from: f, reason: collision with root package name */
    public z0.b<d.b> f13794f;

    /* renamed from: g, reason: collision with root package name */
    public z0.b<d.b> f13795g;

    /* renamed from: h, reason: collision with root package name */
    public a f13796h;

    public final class a {

        /* renamed from: a, reason: collision with root package name */
        public d.c f13797a;

        /* renamed from: b, reason: collision with root package name */
        public int f13798b;

        /* renamed from: c, reason: collision with root package name */
        public z0.b<d.b> f13799c;

        /* renamed from: d, reason: collision with root package name */
        public z0.b<d.b> f13800d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f13801e;

        public a(d.c cVar, int i10, z0.b<d.b> bVar, z0.b<d.b> bVar2, boolean z10) {
            this.f13797a = cVar;
            this.f13798b = i10;
            this.f13799c = bVar;
            this.f13800d = bVar2;
            this.f13801e = z10;
        }

        public final boolean a(int i10, int i11) {
            z0.b<d.b> bVar = this.f13799c;
            int i12 = this.f13798b;
            d.b bVar2 = bVar.f34700a[i10 + i12];
            d.b bVar3 = this.f13800d.f34700a[i12 + i11];
            e1.a aVar = e1.f13846a;
            return kotlin.jvm.internal.r.a(bVar2, bVar3) || bVar2.getClass() == bVar3.getClass();
        }
    }

    public d1(e0 e0Var) {
        this.f13789a = e0Var;
        w wVar = new w(e0Var);
        this.f13790b = wVar;
        this.f13791c = wVar;
        l2 l2Var = wVar.V;
        this.f13792d = l2Var;
        this.f13793e = l2Var;
    }

    public static final void a(d1 d1Var, d.c cVar, g1 g1Var) {
        for (d.c cVar2 = cVar.f1148e; cVar2 != null; cVar2 = cVar2.f1148e) {
            if (cVar2 == e1.f13846a) {
                e0 e0VarG = d1Var.f13789a.G();
                g1Var.f13878s = e0VarG != null ? e0VarG.I.f13790b : null;
                d1Var.f13791c = g1Var;
                return;
            } else {
                if ((cVar2.f1146c & 2) != 0) {
                    return;
                }
                cVar2.S1(g1Var);
            }
        }
    }

    public static d.c b(d.b bVar, d.c cVar) {
        d.c cVarA;
        if (bVar instanceof a1) {
            cVarA = ((a1) bVar).a();
            cVarA.f1146c = j1.f(cVarA);
        } else {
            c cVar2 = new c();
            cVar2.f1146c = j1.d(bVar);
            cVar2.f13773q = bVar;
            cVar2.f13774r = true;
            cVar2.f13776t = new HashSet<>();
            cVarA = cVar2;
        }
        if (cVarA.f1157p) {
            f2.a.b("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        cVarA.f1152j = true;
        d.c cVar3 = cVar.f1149f;
        if (cVar3 != null) {
            cVar3.f1148e = cVarA;
            cVarA.f1149f = cVar3;
        }
        cVar.f1149f = cVarA;
        cVarA.f1148e = cVar;
        return cVarA;
    }

    public static d.c c(d.c cVar) {
        boolean z10 = cVar.f1157p;
        if (z10) {
            p.f0<Object> f0Var = j1.f13931a;
            if (!z10) {
                f2.a.b("autoInvalidateRemovedNode called on unattached node");
            }
            j1.a(cVar, -1, 2);
            cVar.Q1();
            cVar.K1();
        }
        d.c cVar2 = cVar.f1149f;
        d.c cVar3 = cVar.f1148e;
        if (cVar2 != null) {
            cVar2.f1148e = cVar3;
            cVar.f1149f = null;
        }
        if (cVar3 != null) {
            cVar3.f1149f = cVar2;
            cVar.f1148e = null;
        }
        kotlin.jvm.internal.r.b(cVar3);
        return cVar3;
    }

    public static void i(d.b bVar, d.b bVar2, d.c cVar) {
        if ((bVar instanceof a1) && (bVar2 instanceof a1)) {
            e1.a aVar = e1.f13846a;
            kotlin.jvm.internal.r.c(cVar, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
            ((a1) bVar2).b(cVar);
            if (cVar.f1157p) {
                j1.c(cVar);
                return;
            } else {
                cVar.f1153k = true;
                return;
            }
        }
        if (!(cVar instanceof c)) {
            f2.a.b("Unknown Modifier.Node type");
            return;
        }
        c cVar2 = (c) cVar;
        if (cVar2.f1157p) {
            cVar2.U1();
        }
        cVar2.f13773q = bVar2;
        cVar2.f1146c = j1.d(bVar2);
        if (cVar2.f1157p) {
            cVar2.T1(false);
        }
        if (cVar.f1157p) {
            j1.c(cVar);
        } else {
            cVar.f1153k = true;
        }
    }

    public final boolean d(int i10) {
        return (i10 & this.f13793e.f1147d) != 0;
    }

    public final void e() {
        w wVar;
        g1 g1Var = this.f13791c;
        while (true) {
            wVar = this.f13790b;
            if (g1Var == wVar) {
                break;
            }
            g1Var.H1();
            g1Var = g1Var.f13877r;
            kotlin.jvm.internal.r.b(g1Var);
        }
        wVar.H1();
        for (d.c cVar = this.f13793e; cVar != null; cVar = cVar.f1149f) {
            cVar.P1();
            if (cVar.f1152j) {
                p.f0<Object> f0Var = j1.f13931a;
                if (!cVar.f1157p) {
                    f2.a.b("autoInvalidateInsertedNode called on unattached node");
                }
                j1.a(cVar, -1, 1);
            }
            if (cVar.f1153k) {
                j1.c(cVar);
            }
            cVar.f1152j = false;
            cVar.f1153k = false;
        }
    }

    public final void f() {
        for (d.c cVar = this.f13792d; cVar != null; cVar = cVar.f1148e) {
            if (cVar.f1157p) {
                cVar.Q1();
            }
        }
        g1 g1Var = this.f13791c;
        g1 g1Var2 = this.f13790b;
        while (g1Var2 != g1Var) {
            u1 u1Var = g1Var2.M;
            if (u1Var != null) {
                u1Var.destroy();
            }
            g1Var2.M = null;
            g1Var2 = g1Var2.f13878s;
            kotlin.jvm.internal.r.b(g1Var2);
        }
        u1 u1Var2 = g1Var.M;
        if (u1Var2 != null) {
            u1Var2.destroy();
        }
        g1Var.M = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x0262, code lost:
    
        r13 = r28 + 2;
        r11 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0268, code lost:
    
        r3 = r3 + 1;
        r12 = r20;
        r11 = r21;
        r13 = r26;
        r14 = r29;
        r35 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0148, code lost:
    
        r26 = r13;
        r29 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014e, code lost:
    
        if ((r19 & 1) != 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0150, code lost:
    
        r11 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0152, code lost:
    
        r11 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0154, code lost:
    
        r13 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0155, code lost:
    
        if (r13 > r3) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0157, code lost:
    
        if (r13 == r12) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0159, code lost:
    
        if (r13 == r3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x015b, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0169, code lost:
    
        if (r20[(r13 + 1) + r17] >= r20[(r13 - 1) + r17]) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x016c, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x016e, code lost:
    
        r11 = r20[(r13 - 1) + r17];
        r14 = r11 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0177, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0179, code lost:
    
        r11 = r20[(r13 + 1) + r17];
        r14 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0180, code lost:
    
        r22 = r10 - ((r6 - r14) - r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0186, code lost:
    
        if (r3 == 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0188, code lost:
    
        r25 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x018b, code lost:
    
        r25 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x018d, code lost:
    
        if (r14 != r11) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x018f, code lost:
    
        r27 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0192, code lost:
    
        r27 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0194, code lost:
    
        r25 = r22 + (r25 & r27);
        r22 = r11;
        r11 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x019e, code lost:
    
        if (r14 <= r7) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01a0, code lost:
    
        if (r11 <= r15) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a2, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01ae, code lost:
    
        if (r0.a(r14 - 1, r27 - 1) == false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b0, code lost:
    
        r14 = r14 - 1;
        r11 = r27 - 1;
        r13 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01b7, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01bb, code lost:
    
        r20[r17 + r28] = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01bf, code lost:
    
        if (r24 == 0) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01c1, code lost:
    
        r11 = r19 - r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01c3, code lost:
    
        if (r11 < r12) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01c5, code lost:
    
        if (r11 > r3) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01cb, code lost:
    
        if (r16[r17 + r11] < r14) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01cd, code lost:
    
        r26[r33] = r14;
        r11 = 1;
        r26[1] = r27;
        r26[r32] = r22;
        r26[3] = r25;
        r26[4] = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0109 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(int i10, z0.b<d.b> bVar, z0.b<d.b> bVar2, d.c cVar, boolean z10) {
        int i11;
        z0.b<d.b> bVar3;
        z0.b<d.b> bVar4;
        int i12;
        int[] iArr;
        int[] iArr2;
        char c10;
        char c11;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        a aVar = this.f13796h;
        if (aVar == null) {
            i11 = i10;
            bVar3 = bVar;
            bVar4 = bVar2;
            aVar = new a(cVar, i11, bVar3, bVar4, z10);
            this.f13796h = aVar;
        } else {
            i11 = i10;
            bVar3 = bVar;
            bVar4 = bVar2;
            aVar.f13797a = cVar;
            aVar.f13798b = i11;
            aVar.f13799c = bVar3;
            aVar.f13800d = bVar4;
            aVar.f13801e = z10;
        }
        d1 d1Var = d1.this;
        int i18 = bVar3.f34702c - i11;
        int i19 = bVar4.f34702c - i11;
        char c12 = 2;
        int i20 = ((i18 + i19) + 1) / 2;
        x xVar = new x(i20 * 3);
        x xVar2 = new x(i20 * 4);
        int i21 = 0;
        xVar2.b(0, i18, 0, i19);
        int i22 = (i20 * 2) + 1;
        int[] iArr3 = new int[i22];
        int[] iArr4 = new int[i22];
        int[] iArr5 = new int[5];
        while (true) {
            int i23 = xVar2.f14046b;
            if (i23 == 0) {
                break;
            }
            char c13 = c12;
            int[] iArr6 = xVar2.f14045a;
            int i24 = i21;
            int i25 = i23 - 1;
            xVar2.f14046b = i25;
            int i26 = iArr6[i25];
            int i27 = i23 - 2;
            xVar2.f14046b = i27;
            int i28 = iArr6[i27];
            int i29 = i23 - 3;
            xVar2.f14046b = i29;
            int i30 = iArr6[i29];
            int i31 = i23 - 4;
            xVar2.f14046b = i31;
            int i32 = iArr6[i31];
            int i33 = i30 - i32;
            int i34 = i22;
            int i35 = i26 - i28;
            int[] iArr7 = iArr3;
            if (i33 < 1 || i35 < 1) {
                iArr = iArr4;
                iArr2 = iArr5;
            } else {
                int i36 = 1;
                int i37 = ((i33 + i35) + 1) / 2;
                int i38 = i34 / 2;
                int i39 = i38 + 1;
                iArr7[i39] = i32;
                iArr4[i39] = i30;
                int i40 = i24;
                while (i40 < i37) {
                    int i41 = i33 - i35;
                    int i42 = i37;
                    iArr = iArr4;
                    int i43 = -i40;
                    int i44 = (Math.abs(i41) & 1) == i36 ? 1 : i24;
                    int i45 = i43;
                    while (true) {
                        if (i45 > i40) {
                            break;
                        }
                        if (i45 != i43) {
                            if (i45 != i40) {
                                i13 = i45;
                                iArr2 = iArr5;
                                if (iArr7[i45 + 1 + i38] > iArr7[(i13 - 1) + i38]) {
                                }
                                int i46 = ((i15 - i32) + i28) - i13;
                                int i47 = i46 - ((i40 != 0 ? 1 : i24) & (i15 == i14 ? 1 : i24));
                                int i48 = i14;
                                i16 = i46;
                                while (i15 < i30 && i16 < i26 && aVar.a(i15, i16)) {
                                    i15++;
                                    i16++;
                                }
                                iArr7[i38 + i13] = i15;
                                if (i44 != 0) {
                                    int i49 = i16;
                                    int i50 = i41 - i13;
                                    i17 = i33;
                                    if (i50 >= i43 + 1 && i50 <= i40 - 1 && iArr[i38 + i50] <= i15) {
                                        iArr2[i24] = i48;
                                        iArr2[1] = i47;
                                        iArr2[c13] = i15;
                                        iArr2[3] = i49;
                                        iArr2[4] = i24;
                                        c10 = 1;
                                        break;
                                    }
                                } else {
                                    i17 = i33;
                                }
                                i45 = i13 + 2;
                                iArr5 = iArr2;
                                i33 = i17;
                            } else {
                                i13 = i45;
                                iArr2 = iArr5;
                            }
                            i14 = iArr7[(i13 - 1) + i38];
                            i15 = i14 + 1;
                            int i462 = ((i15 - i32) + i28) - i13;
                            int i472 = i462 - ((i40 != 0 ? 1 : i24) & (i15 == i14 ? 1 : i24));
                            int i482 = i14;
                            i16 = i462;
                            while (i15 < i30) {
                                i15++;
                                i16++;
                            }
                            iArr7[i38 + i13] = i15;
                            if (i44 != 0) {
                            }
                            i45 = i13 + 2;
                            iArr5 = iArr2;
                            i33 = i17;
                        } else {
                            i13 = i45;
                            iArr2 = iArr5;
                        }
                        i14 = iArr7[i13 + 1 + i38];
                        i15 = i14;
                        int i4622 = ((i15 - i32) + i28) - i13;
                        int i4722 = i4622 - ((i40 != 0 ? 1 : i24) & (i15 == i14 ? 1 : i24));
                        int i4822 = i14;
                        i16 = i4622;
                        while (i15 < i30) {
                        }
                        iArr7[i38 + i13] = i15;
                        if (i44 != 0) {
                        }
                        i45 = i13 + 2;
                        iArr5 = iArr2;
                        i33 = i17;
                    }
                    if (Math.min(iArr2[c13] - iArr2[i24], iArr2[3] - iArr2[c10]) > 0) {
                        int i51 = iArr2[i24];
                        int i52 = iArr2[c10];
                        int i53 = iArr2[3] - i52;
                        int iMin = iArr2[c13] - i51;
                        if (i53 != iMin) {
                            iMin = Math.min(iMin, i53);
                            int i54 = iArr2[4];
                            int i55 = i54 != 0 ? 1 : i24;
                            int i56 = iArr2[3];
                            c11 = 1;
                            int i57 = iArr2[1];
                            int i58 = i56 - i57;
                            int i59 = iArr2[c13];
                            int i60 = iArr2[i24];
                            int i61 = i51 + (((i58 > i59 - i60 ? 1 : i24) | i55) ^ 1);
                            i52 += (((i56 - i57 > i59 - i60 ? 1 : i24) ^ 1) | (i54 != 0 ? 1 : i24)) ^ 1;
                            i51 = i61;
                        } else {
                            c11 = 1;
                        }
                        xVar.a(i51, i52, iMin);
                    } else {
                        c11 = c10;
                    }
                    xVar2.b(i32, iArr2[i24], i28, iArr2[c11]);
                    xVar2.b(iArr2[c13], i30, iArr2[3], i26);
                }
                iArr = iArr4;
                iArr2 = iArr5;
            }
            c12 = c13;
            i21 = i24;
            i22 = i34;
            iArr3 = iArr7;
            iArr4 = iArr;
            iArr5 = iArr2;
        }
        int i62 = i21;
        int i63 = xVar.f14046b;
        if (i63 % 3 != 0) {
            f2.a.b("Array size not a multiple of 3");
        }
        if (i63 > 3) {
            i12 = i62;
            xVar.c(i12, i63 - 3);
        } else {
            i12 = i62;
        }
        xVar.a(i18, i19, i12);
        int i64 = i12;
        int i65 = i64;
        int i66 = i65;
        while (i64 < xVar.f14046b) {
            int[] iArr8 = xVar.f14045a;
            int i67 = iArr8[i64];
            int i68 = iArr8[i64 + 2];
            int i69 = i67 - i68;
            int i70 = iArr8[i64 + 1] - i68;
            i64 += 3;
            while (i65 < i69) {
                d.c cVar2 = aVar.f13797a.f1149f;
                kotlin.jvm.internal.r.b(cVar2);
                if ((cVar2.f1146c & 2) != 0) {
                    g1 g1Var = cVar2.f1151h;
                    kotlin.jvm.internal.r.b(g1Var);
                    g1 g1Var2 = g1Var.f13878s;
                    g1 g1Var3 = g1Var.f13877r;
                    kotlin.jvm.internal.r.b(g1Var3);
                    if (g1Var2 != null) {
                        g1Var2.f13877r = g1Var3;
                    }
                    g1Var3.f13878s = g1Var2;
                    a(d1Var, aVar.f13797a, g1Var3);
                }
                aVar.f13797a = c(cVar2);
                i65++;
            }
            while (i66 < i70) {
                d.c cVarB = b(aVar.f13800d.f34700a[aVar.f13798b + i66], aVar.f13797a);
                aVar.f13797a = cVarB;
                if (aVar.f13801e) {
                    d.c cVar3 = cVarB.f1149f;
                    kotlin.jvm.internal.r.b(cVar3);
                    g1 g1Var4 = cVar3.f1151h;
                    kotlin.jvm.internal.r.b(g1Var4);
                    b0 b0VarC = k.c(aVar.f13797a);
                    if (b0VarC != null) {
                        c0 c0Var = new c0(d1Var.f13789a, b0VarC);
                        aVar.f13797a.S1(c0Var);
                        a(d1Var, aVar.f13797a, c0Var);
                        c0Var.f13878s = g1Var4.f13878s;
                        c0Var.f13877r = g1Var4;
                        g1Var4.f13878s = c0Var;
                    } else {
                        aVar.f13797a.S1(g1Var4);
                    }
                    aVar.f13797a.J1();
                    aVar.f13797a.P1();
                    d.c cVar4 = aVar.f13797a;
                    p.f0<Object> f0Var = j1.f13931a;
                    if (!cVar4.f1157p) {
                        f2.a.b("autoInvalidateInsertedNode called on unattached node");
                    }
                    j1.a(cVar4, -1, 1);
                } else {
                    cVarB.f1152j = true;
                }
                i66++;
            }
            while (true) {
                int i71 = i68 - 1;
                if (i68 > 0) {
                    d.c cVar5 = aVar.f13797a.f1149f;
                    kotlin.jvm.internal.r.b(cVar5);
                    aVar.f13797a = cVar5;
                    z0.b<d.b> bVar5 = aVar.f13799c;
                    int i72 = aVar.f13798b;
                    d.b bVar6 = bVar5.f34700a[i72 + i65];
                    d.b bVar7 = aVar.f13800d.f34700a[i72 + i66];
                    if (!kotlin.jvm.internal.r.a(bVar6, bVar7)) {
                        i(bVar6, bVar7, aVar.f13797a);
                    }
                    i65++;
                    i66++;
                    i68 = i71;
                }
            }
        }
        int i73 = i12;
        for (d.c cVar6 = this.f13792d.f1148e; cVar6 != null && cVar6 != e1.f13846a; cVar6 = cVar6.f1148e) {
            i73 |= cVar6.f1146c;
            cVar6.f1147d = i73;
        }
    }

    public final void h() {
        e0 e0Var;
        c0 c0Var;
        d.c cVar = this.f13792d.f1148e;
        g1 g1Var = this.f13790b;
        d.c cVar2 = cVar;
        while (true) {
            e0Var = this.f13789a;
            if (cVar2 == null) {
                break;
            }
            b0 b0VarC = k.c(cVar2);
            if (b0VarC != null) {
                g1 g1Var2 = cVar2.f1151h;
                if (g1Var2 != null) {
                    c0 c0Var2 = (c0) g1Var2;
                    b0 b0Var = c0Var2.V;
                    c0Var2.X1(b0VarC);
                    c0Var = c0Var2;
                    if (b0Var != cVar2) {
                        u1 u1Var = c0Var2.M;
                        c0Var = c0Var2;
                        if (u1Var != null) {
                            u1Var.invalidate();
                            c0Var = c0Var2;
                        }
                    }
                } else {
                    c0 c0Var3 = new c0(e0Var, b0VarC);
                    cVar2.S1(c0Var3);
                    c0Var = c0Var3;
                }
                g1Var.f13878s = c0Var;
                c0Var.f13877r = g1Var;
                g1Var = c0Var;
            } else {
                cVar2.S1(g1Var);
            }
            cVar2 = cVar2.f1148e;
        }
        e0 e0VarG = e0Var.G();
        g1Var.f13878s = e0VarG != null ? e0VarG.I.f13790b : null;
        this.f13791c = g1Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        d.c cVar = this.f13793e;
        l2 l2Var = this.f13792d;
        if (cVar == l2Var) {
            sb.append("]");
        } else {
            while (true) {
                if (cVar == null || cVar == l2Var) {
                    break;
                }
                sb.append(String.valueOf(cVar));
                if (cVar.f1149f == l2Var) {
                    sb.append("]");
                    break;
                }
                sb.append(",");
                cVar = cVar.f1149f;
            }
        }
        String string = sb.toString();
        kotlin.jvm.internal.r.d(string, "toString(...)");
        return string;
    }
}
