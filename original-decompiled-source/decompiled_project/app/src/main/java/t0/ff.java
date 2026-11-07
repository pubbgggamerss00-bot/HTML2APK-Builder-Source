package t0;

import androidx.compose.ui.d;
import java.util.Map;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class ff {

    /* renamed from: a, reason: collision with root package name */
    public static final x0.m0 f25892a = new x0.m0(a.f25893a);

    public static final class a extends kotlin.jvm.internal.s implements eh.a<t2.l0> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f25893a = new a(0);

        @Override // eh.a
        public final t2.l0 invoke() {
            return v0.q0.f30457a;
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t2.l0 f25894a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ eh.p<x0.j, Integer, pg.f0> f25895b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f25896c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(t2.l0 l0Var, eh.p<? super x0.j, ? super Integer, pg.f0> pVar, int i10) {
            super(2);
            this.f25894a = l0Var;
            this.f25895b = pVar;
            this.f25896c = i10;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            num.intValue();
            int iN = f3.i.n(this.f25896c | 1);
            ff.a(this.f25894a, this.f25895b, jVar, iN);
            return pg.f0.f21461a;
        }
    }

    public static final void a(t2.l0 l0Var, eh.p<? super x0.j, ? super Integer, pg.f0> pVar, x0.j jVar, int i10) {
        x0.k kVarP = jVar.p(-460300127);
        int i11 = (kVarP.K(l0Var) ? 4 : 2) | i10;
        if ((i10 & 48) == 0) {
            i11 |= kVarP.l(pVar) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && kVarP.s()) {
            kVarP.v();
        } else {
            x0.m0 m0Var = f25892a;
            x0.y.a(m0Var.a(((t2.l0) kVarP.f(m0Var)).d(l0Var)), pVar, kVarP, (i11 & 112) | 8);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new b(l0Var, pVar, i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:204:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(String str, androidx.compose.ui.d dVar, long j10, long j11, x2.p pVar, x2.f fVar, long j12, e3.h hVar, long j13, int i10, boolean z10, int i11, int i12, t2.l0 l0Var, x0.j jVar, int i13, int i14, int i15) {
        int i16;
        androidx.compose.ui.d dVar2;
        int i17;
        long j14;
        int i18;
        long j15;
        int i19;
        int i20;
        int i21;
        x2.f fVar2;
        int i22;
        int i23;
        int i24;
        e3.h hVar2;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        long j16;
        x2.p pVar2;
        long j17;
        e3.h hVar3;
        long j18;
        boolean z11;
        int i33;
        int i34;
        int i35;
        t2.l0 l0Var2;
        long jB;
        boolean z12;
        x0.k kVar;
        long j19;
        long j20;
        t2.l0 l0Var3;
        androidx.compose.ui.d dVar3;
        int i36;
        e3.h hVar4;
        int i37;
        long j21;
        x2.p pVar3;
        x2.f fVar3;
        boolean z13;
        long j22;
        int i38;
        x0.h2 h2VarV;
        x0.k kVarP = jVar.p(-2055108902);
        if ((i13 & 6) == 0) {
            i16 = (kVarP.K(str) ? 4 : 2) | i13;
        } else {
            i16 = i13;
        }
        int i39 = i15 & 2;
        if (i39 != 0) {
            i16 |= 48;
        } else {
            if ((i13 & 48) == 0) {
                dVar2 = dVar;
                i16 |= kVarP.K(dVar2) ? 32 : 16;
            }
            i17 = i15 & 4;
            if (i17 == 0) {
                i16 |= 384;
            } else {
                if ((i13 & 384) == 0) {
                    j14 = j10;
                    i16 |= kVarP.j(j14) ? 256 : 128;
                }
                i18 = i15 & 8;
                if (i18 != 0) {
                    i19 = i16 | 3072;
                    j15 = j11;
                } else {
                    int i40 = i16;
                    j15 = j11;
                    if ((i13 & 3072) == 0) {
                        i40 |= kVarP.j(j15) ? 2048 : 1024;
                    }
                    i19 = i40;
                }
                int i41 = i19 | 24576;
                i20 = i15 & 32;
                if (i20 != 0) {
                    i41 = 221184 | i19;
                } else {
                    if ((i13 & 196608) == 0) {
                        i41 |= kVarP.K(pVar) ? 131072 : 65536;
                    }
                    i21 = i15 & 64;
                    int i42 = PKIFailureInfo.signerNotTrusted;
                    if (i21 == 0) {
                        i41 |= 1572864;
                        fVar2 = fVar;
                    } else {
                        fVar2 = fVar;
                        if ((i13 & 1572864) == 0) {
                            i41 |= kVarP.K(fVar2) ? 1048576 : 524288;
                        }
                    }
                    i22 = i15 & 128;
                    if (i22 == 0) {
                        i41 |= 12582912;
                    } else if ((i13 & 12582912) == 0) {
                        i41 |= kVarP.j(j12) ? 8388608 : 4194304;
                    }
                    i23 = i41 | 100663296;
                    i24 = i15 & 512;
                    if (i24 == 0) {
                        i23 = i41 | 905969664;
                    } else {
                        if ((i13 & 805306368) == 0) {
                            hVar2 = hVar;
                            i23 |= kVarP.K(hVar2) ? PKIFailureInfo.duplicateCertReq : 268435456;
                        }
                        i25 = i15 & 1024;
                        if (i25 != 0) {
                            i26 = i14 | 6;
                        } else if ((i14 & 6) == 0) {
                            i26 = i14 | (kVarP.j(j13) ? 4 : 2);
                        } else {
                            i26 = i14;
                        }
                        i27 = i15 & 2048;
                        if (i27 != 0) {
                            i26 |= 48;
                            i28 = i27;
                        } else if ((i14 & 48) == 0) {
                            i28 = i27;
                            i26 |= kVarP.i(i10) ? 32 : 16;
                        } else {
                            i28 = i27;
                        }
                        int i43 = i26;
                        int i44 = i43 | 384;
                        i29 = i15 & 8192;
                        if (i29 != 0) {
                            i44 = i43 | 3456;
                        } else {
                            if ((i14 & 3072) == 0) {
                                i44 |= kVarP.i(i11) ? 2048 : 1024;
                            }
                            i30 = i15 & 16384;
                            if (i30 != 0) {
                                i31 = i30;
                                if ((i14 & 24576) == 0) {
                                    i44 |= kVarP.i(i12) ? 16384 : 8192;
                                }
                                int i45 = i44 | 196608;
                                if ((i15 & 65536) == 0 && kVarP.K(l0Var)) {
                                    i42 = 1048576;
                                }
                                i32 = i45 | i42;
                                if ((i23 & 306783379) == 306783378 && (599187 & i32) == 599186 && kVarP.s()) {
                                    kVarP.v();
                                    z13 = z10;
                                    i37 = i11;
                                    i36 = i12;
                                    l0Var3 = l0Var;
                                    kVar = kVarP;
                                    j21 = j15;
                                    fVar3 = fVar2;
                                    dVar3 = dVar2;
                                    j19 = j14;
                                    pVar3 = pVar;
                                    j20 = j13;
                                    i38 = i10;
                                    hVar4 = hVar2;
                                    j22 = j12;
                                } else {
                                    kVarP.r0();
                                    if ((i13 & 1) != 0 || kVarP.a0()) {
                                        if (i39 != 0) {
                                            dVar2 = d.a.f1143b;
                                        }
                                        j16 = i17 == 0 ? q1.b1.f21654h : j14;
                                        if (i18 != 0) {
                                            j15 = f3.t.f8833c;
                                        }
                                        pVar2 = i20 == 0 ? null : pVar;
                                        if (i21 != 0) {
                                            fVar2 = null;
                                        }
                                        j17 = i22 == 0 ? f3.t.f8833c : j12;
                                        hVar3 = i24 == 0 ? hVar2 : null;
                                        j18 = i25 == 0 ? f3.t.f8833c : j13;
                                        z11 = true;
                                        i33 = i28 == 0 ? 1 : i10;
                                        i34 = i29 == 0 ? Integer.MAX_VALUE : i11;
                                        i35 = i31 == 0 ? 1 : i12;
                                        if ((i15 & 65536) == 0) {
                                            l0Var2 = (t2.l0) kVarP.f(f25892a);
                                            i32 &= -3670017;
                                        } else {
                                            l0Var2 = l0Var;
                                        }
                                    } else {
                                        kVarP.v();
                                        if ((i15 & 65536) != 0) {
                                            i32 &= -3670017;
                                        }
                                        pVar2 = pVar;
                                        j18 = j13;
                                        i33 = i10;
                                        i34 = i11;
                                        i35 = i12;
                                        l0Var2 = l0Var;
                                        hVar3 = hVar2;
                                        j16 = j14;
                                        j17 = j12;
                                        z11 = z10;
                                    }
                                    kVarP.U();
                                    t2.l0 l0Var4 = l0Var2;
                                    kVarP.L(-1827892941);
                                    if (j16 == 16) {
                                        jB = j16;
                                        z12 = false;
                                    } else {
                                        kVarP.L(-1827892168);
                                        jB = l0Var4.b();
                                        if (jB == 16) {
                                            jB = ((q1.b1) kVarP.f(p2.f26666a)).f21656a;
                                        }
                                        z12 = false;
                                        kVarP.T(false);
                                    }
                                    kVarP.T(z12);
                                    e3.h hVar5 = hVar3;
                                    int i46 = i32 << 9;
                                    i0.i0.d(str, dVar2, t2.l0.e(l0Var4, jB, j15, pVar2, fVar2, j17, hVar3 == null ? hVar3.f8363a : PKIFailureInfo.systemUnavail, j18, 16609104), i33, z11, i34, i35, kVarP, (i23 & 126) | 3072 | (i46 & 57344) | 196608 | (i46 & 3670016) | (i46 & 29360128));
                                    kVar = kVarP;
                                    j19 = j16;
                                    j20 = j18;
                                    l0Var3 = l0Var4;
                                    dVar3 = dVar2;
                                    i36 = i35;
                                    hVar4 = hVar5;
                                    i37 = i34;
                                    j21 = j15;
                                    pVar3 = pVar2;
                                    fVar3 = fVar2;
                                    z13 = z11;
                                    j22 = j17;
                                    i38 = i33;
                                }
                                h2VarV = kVar.V();
                                if (h2VarV != null) {
                                    h2VarV.f31703d = new gf(str, dVar3, j19, j21, pVar3, fVar3, j22, hVar4, j20, i38, z13, i37, i36, l0Var3, i13, i14, i15);
                                    return;
                                }
                                return;
                            }
                            i44 |= 24576;
                            i31 = i30;
                            int i452 = i44 | 196608;
                            if ((i15 & 65536) == 0) {
                                i42 = 1048576;
                            }
                            i32 = i452 | i42;
                            if ((i23 & 306783379) == 306783378) {
                                kVarP.r0();
                                if ((i13 & 1) != 0) {
                                    if (i39 != 0) {
                                    }
                                    if (i17 == 0) {
                                    }
                                    if (i18 != 0) {
                                    }
                                    if (i20 == 0) {
                                    }
                                    if (i21 != 0) {
                                    }
                                    if (i22 == 0) {
                                    }
                                    if (i24 == 0) {
                                    }
                                    if (i25 == 0) {
                                    }
                                    z11 = true;
                                    if (i28 == 0) {
                                    }
                                    if (i29 == 0) {
                                    }
                                    if (i31 == 0) {
                                    }
                                    if ((i15 & 65536) == 0) {
                                    }
                                    kVarP.U();
                                    t2.l0 l0Var42 = l0Var2;
                                    kVarP.L(-1827892941);
                                    if (j16 == 16) {
                                    }
                                    kVarP.T(z12);
                                    e3.h hVar52 = hVar3;
                                    int i462 = i32 << 9;
                                    i0.i0.d(str, dVar2, t2.l0.e(l0Var42, jB, j15, pVar2, fVar2, j17, hVar3 == null ? hVar3.f8363a : PKIFailureInfo.systemUnavail, j18, 16609104), i33, z11, i34, i35, kVarP, (i23 & 126) | 3072 | (i462 & 57344) | 196608 | (i462 & 3670016) | (i462 & 29360128));
                                    kVar = kVarP;
                                    j19 = j16;
                                    j20 = j18;
                                    l0Var3 = l0Var42;
                                    dVar3 = dVar2;
                                    i36 = i35;
                                    hVar4 = hVar52;
                                    i37 = i34;
                                    j21 = j15;
                                    pVar3 = pVar2;
                                    fVar3 = fVar2;
                                    z13 = z11;
                                    j22 = j17;
                                    i38 = i33;
                                }
                            }
                            h2VarV = kVar.V();
                            if (h2VarV != null) {
                            }
                        }
                        i30 = i15 & 16384;
                        if (i30 != 0) {
                        }
                        int i4522 = i44 | 196608;
                        if ((i15 & 65536) == 0) {
                        }
                        i32 = i4522 | i42;
                        if ((i23 & 306783379) == 306783378) {
                        }
                        h2VarV = kVar.V();
                        if (h2VarV != null) {
                        }
                    }
                    hVar2 = hVar;
                    i25 = i15 & 1024;
                    if (i25 != 0) {
                    }
                    i27 = i15 & 2048;
                    if (i27 != 0) {
                    }
                    int i432 = i26;
                    int i442 = i432 | 384;
                    i29 = i15 & 8192;
                    if (i29 != 0) {
                    }
                    i30 = i15 & 16384;
                    if (i30 != 0) {
                    }
                    int i45222 = i442 | 196608;
                    if ((i15 & 65536) == 0) {
                    }
                    i32 = i45222 | i42;
                    if ((i23 & 306783379) == 306783378) {
                    }
                    h2VarV = kVar.V();
                    if (h2VarV != null) {
                    }
                }
                i21 = i15 & 64;
                int i422 = PKIFailureInfo.signerNotTrusted;
                if (i21 == 0) {
                }
                i22 = i15 & 128;
                if (i22 == 0) {
                }
                i23 = i41 | 100663296;
                i24 = i15 & 512;
                if (i24 == 0) {
                }
                hVar2 = hVar;
                i25 = i15 & 1024;
                if (i25 != 0) {
                }
                i27 = i15 & 2048;
                if (i27 != 0) {
                }
                int i4322 = i26;
                int i4422 = i4322 | 384;
                i29 = i15 & 8192;
                if (i29 != 0) {
                }
                i30 = i15 & 16384;
                if (i30 != 0) {
                }
                int i452222 = i4422 | 196608;
                if ((i15 & 65536) == 0) {
                }
                i32 = i452222 | i422;
                if ((i23 & 306783379) == 306783378) {
                }
                h2VarV = kVar.V();
                if (h2VarV != null) {
                }
            }
            j14 = j10;
            i18 = i15 & 8;
            if (i18 != 0) {
            }
            int i412 = i19 | 24576;
            i20 = i15 & 32;
            if (i20 != 0) {
            }
            i21 = i15 & 64;
            int i4222 = PKIFailureInfo.signerNotTrusted;
            if (i21 == 0) {
            }
            i22 = i15 & 128;
            if (i22 == 0) {
            }
            i23 = i412 | 100663296;
            i24 = i15 & 512;
            if (i24 == 0) {
            }
            hVar2 = hVar;
            i25 = i15 & 1024;
            if (i25 != 0) {
            }
            i27 = i15 & 2048;
            if (i27 != 0) {
            }
            int i43222 = i26;
            int i44222 = i43222 | 384;
            i29 = i15 & 8192;
            if (i29 != 0) {
            }
            i30 = i15 & 16384;
            if (i30 != 0) {
            }
            int i4522222 = i44222 | 196608;
            if ((i15 & 65536) == 0) {
            }
            i32 = i4522222 | i4222;
            if ((i23 & 306783379) == 306783378) {
            }
            h2VarV = kVar.V();
            if (h2VarV != null) {
            }
        }
        dVar2 = dVar;
        i17 = i15 & 4;
        if (i17 == 0) {
        }
        j14 = j10;
        i18 = i15 & 8;
        if (i18 != 0) {
        }
        int i4122 = i19 | 24576;
        i20 = i15 & 32;
        if (i20 != 0) {
        }
        i21 = i15 & 64;
        int i42222 = PKIFailureInfo.signerNotTrusted;
        if (i21 == 0) {
        }
        i22 = i15 & 128;
        if (i22 == 0) {
        }
        i23 = i4122 | 100663296;
        i24 = i15 & 512;
        if (i24 == 0) {
        }
        hVar2 = hVar;
        i25 = i15 & 1024;
        if (i25 != 0) {
        }
        i27 = i15 & 2048;
        if (i27 != 0) {
        }
        int i432222 = i26;
        int i442222 = i432222 | 384;
        i29 = i15 & 8192;
        if (i29 != 0) {
        }
        i30 = i15 & 16384;
        if (i30 != 0) {
        }
        int i45222222 = i442222 | 196608;
        if ((i15 & 65536) == 0) {
        }
        i32 = i45222222 | i42222;
        if ((i23 & 306783379) == 306783378) {
        }
        h2VarV = kVar.V();
        if (h2VarV != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(t2.b bVar, androidx.compose.ui.d dVar, long j10, long j11, x2.f fVar, long j12, long j13, int i10, boolean z10, int i11, int i12, Map map, eh.l lVar, t2.l0 l0Var, x0.j jVar, int i13, int i14, int i15) {
        androidx.compose.ui.d dVar2;
        int i16;
        long j14;
        int i17;
        x2.f fVar2;
        int i18;
        int i19;
        int i20;
        int i21;
        long j15;
        int i22;
        x2.f fVar3;
        long j16;
        int i23;
        int i24;
        int i25;
        Map map2;
        t2.l0 l0Var2;
        eh.l lVar2;
        boolean z11;
        int i26;
        long jB;
        boolean z12;
        boolean z13;
        x0.k kVar;
        t2.l0 l0Var3;
        int i27;
        boolean z14;
        int i28;
        x2.f fVar4;
        androidx.compose.ui.d dVar3;
        long j17;
        Map map3;
        long j18;
        int i29;
        eh.l lVar3;
        long j19;
        x0.h2 h2VarV;
        x0.k kVarP = jVar.p(2027001676);
        int i30 = (kVarP.K(bVar) ? 4 : 2) | i13;
        int i31 = i15 & 2;
        if (i31 != 0) {
            i16 = i30 | 48;
            dVar2 = dVar;
        } else {
            dVar2 = dVar;
            i16 = i30 | (kVarP.K(dVar2) ? 32 : 16);
        }
        if ((i13 & 384) == 0) {
            i16 |= kVarP.j(j10) ? 256 : 128;
        }
        int i32 = i15 & 8;
        if (i32 == 0) {
            if ((i13 & 3072) == 0) {
                j14 = j11;
                i16 |= kVarP.j(j14) ? 2048 : 1024;
            }
            int i33 = 221184 | i16;
            i17 = i15 & 64;
            if (i17 == 0) {
                i18 = i16 | 1794048;
                fVar2 = fVar;
            } else {
                fVar2 = fVar;
                i18 = i33 | (kVarP.K(fVar2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted);
            }
            i19 = i18 | 918552576;
            i20 = i15 & 1024;
            if (i20 == 0) {
                i22 = 6;
                i21 = i31;
                j15 = j13;
            } else if ((i14 & 6) == 0) {
                i21 = i31;
                j15 = j13;
                i22 = i14 | (kVarP.j(j15) ? 4 : 2);
            } else {
                i21 = i31;
                j15 = j13;
                i22 = i14;
            }
            int i34 = i22 | 1797552 | (((i15 & 131072) == 0 || !kVarP.K(l0Var)) ? 4194304 : 8388608);
            if ((i19 & 306783379) != 306783378 && (i34 & 4793491) == 4793490 && kVarP.s()) {
                kVarP.v();
                i27 = i11;
                i29 = i12;
                map3 = map;
                lVar3 = lVar;
                l0Var3 = l0Var;
                kVar = kVarP;
                fVar4 = fVar2;
                dVar3 = dVar2;
                j19 = j14;
                i28 = i10;
                z14 = z10;
                j18 = j15;
                j17 = j12;
            } else {
                kVarP.r0();
                if ((i13 & 1) != 0 || kVarP.a0()) {
                    if (i21 != 0) {
                        dVar2 = d.a.f1143b;
                    }
                    if (i32 != 0) {
                        j14 = f3.t.f8833c;
                    }
                    fVar3 = i17 == 0 ? null : fVar2;
                    j16 = f3.t.f8833c;
                    if (i20 != 0) {
                        j15 = j16;
                    }
                    hf hfVar = hf.f26038a;
                    i23 = i15 & 131072;
                    i24 = 1;
                    i25 = Integer.MAX_VALUE;
                    map2 = qg.a0.f22708a;
                    if (i23 == 0) {
                        lVar2 = hfVar;
                        l0Var2 = (t2.l0) kVarP.f(f25892a);
                    } else {
                        l0Var2 = l0Var;
                        lVar2 = hfVar;
                    }
                    z11 = true;
                    i26 = 1;
                } else {
                    kVarP.v();
                    j16 = j12;
                    i24 = i10;
                    z11 = z10;
                    i25 = i11;
                    map2 = map;
                    lVar2 = lVar;
                    l0Var2 = l0Var;
                    fVar3 = fVar2;
                    i26 = i12;
                }
                kVarP.U();
                x2.f fVar5 = fVar3;
                kVarP.L(-1827697581);
                if (j10 == 16) {
                    z12 = z11;
                    jB = j10;
                    z13 = false;
                } else {
                    kVarP.L(-1827696808);
                    jB = l0Var2.b();
                    if (jB != 16) {
                        z12 = z11;
                    } else {
                        z12 = z11;
                        jB = ((q1.b1) kVarP.f(p2.f26666a)).f21656a;
                    }
                    z13 = false;
                    kVarP.T(false);
                }
                kVarP.T(z13);
                long j20 = j15;
                t2.l0 l0Var4 = l0Var2;
                boolean z15 = z12;
                int i35 = i26;
                eh.l lVar4 = lVar2;
                i0.i0.c(bVar, dVar2, t2.l0.e(l0Var4, jB, j14, null, fVar5, j16, PKIFailureInfo.systemUnavail, j20, 16609104), lVar4, i24, z15, i25, i35, map2, kVarP, (i19 & 126) | 115043328);
                kVar = kVarP;
                l0Var3 = l0Var4;
                i27 = i25;
                long j21 = j14;
                z14 = z15;
                i28 = i24;
                fVar4 = fVar5;
                dVar3 = dVar2;
                j17 = j16;
                map3 = map2;
                j18 = j20;
                i29 = i35;
                lVar3 = lVar4;
                j19 = j21;
            }
            h2VarV = kVar.V();
            if (h2VarV == null) {
                h2VarV.f31703d = new jf(bVar, dVar3, j10, j19, fVar4, j17, j18, i28, z14, i27, i29, map3, lVar3, l0Var3, i13, i14, i15);
                return;
            }
            return;
        }
        i16 |= 3072;
        j14 = j11;
        int i332 = 221184 | i16;
        i17 = i15 & 64;
        if (i17 == 0) {
        }
        i19 = i18 | 918552576;
        i20 = i15 & 1024;
        if (i20 == 0) {
        }
        int i342 = i22 | 1797552 | (((i15 & 131072) == 0 || !kVarP.K(l0Var)) ? 4194304 : 8388608);
        if ((i19 & 306783379) != 306783378) {
            kVarP.r0();
            if ((i13 & 1) != 0) {
                if (i21 != 0) {
                }
                if (i32 != 0) {
                }
                if (i17 == 0) {
                }
                j16 = f3.t.f8833c;
                if (i20 != 0) {
                }
                hf hfVar2 = hf.f26038a;
                i23 = i15 & 131072;
                i24 = 1;
                i25 = Integer.MAX_VALUE;
                map2 = qg.a0.f22708a;
                if (i23 == 0) {
                }
                z11 = true;
                i26 = 1;
                kVarP.U();
                x2.f fVar52 = fVar3;
                kVarP.L(-1827697581);
                if (j10 == 16) {
                }
                kVarP.T(z13);
                long j202 = j15;
                t2.l0 l0Var42 = l0Var2;
                boolean z152 = z12;
                int i352 = i26;
                eh.l lVar42 = lVar2;
                i0.i0.c(bVar, dVar2, t2.l0.e(l0Var42, jB, j14, null, fVar52, j16, PKIFailureInfo.systemUnavail, j202, 16609104), lVar42, i24, z152, i25, i352, map2, kVarP, (i19 & 126) | 115043328);
                kVar = kVarP;
                l0Var3 = l0Var42;
                i27 = i25;
                long j212 = j14;
                z14 = z152;
                i28 = i24;
                fVar4 = fVar52;
                dVar3 = dVar2;
                j17 = j16;
                map3 = map2;
                j18 = j202;
                i29 = i352;
                lVar3 = lVar42;
                j19 = j212;
            }
        }
        h2VarV = kVar.V();
        if (h2VarV == null) {
        }
    }
}
