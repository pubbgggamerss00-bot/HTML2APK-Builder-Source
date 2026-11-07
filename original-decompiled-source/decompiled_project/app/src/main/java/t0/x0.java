package t0;

import androidx.compose.ui.d;
import com.yalantis.ucrop.view.CropImageView;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import x.o;
import x0.j;

/* loaded from: classes.dex */
public final class x0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02e2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:220:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(eh.a aVar, androidx.compose.ui.d dVar, boolean z10, q1.f2 f2Var, l0 l0Var, p0 p0Var, t.v vVar, z.f1 f1Var, eh.q qVar, x0.j jVar, int i10, int i11) {
        int i12;
        androidx.compose.ui.d dVar2;
        int i13;
        boolean z11;
        q1.f2 f2VarA;
        l0 l0VarB;
        p0 p0Var2;
        int i14;
        t.v vVar2;
        int i15;
        int i16;
        int i17;
        p0 p0Var3;
        int i18;
        z.f1 f1Var2;
        boolean z12;
        q1.f2 f2Var2;
        l0 l0Var2;
        p0 p0Var4;
        t.v vVar3;
        Object objG;
        j.a.C0321a c0321a;
        long j10;
        x.m mVar;
        q1.f2 f2Var3;
        boolean z13;
        float f10;
        boolean zL;
        Object objG2;
        p0 p0Var5;
        s.n nVar;
        x0.k kVar;
        p0 p0Var6;
        z.f1 f1Var3;
        androidx.compose.ui.d dVar3;
        boolean z14;
        t.v vVar4;
        q1.f2 f2Var4;
        l0 l0Var3;
        x0.h2 h2VarV;
        eh.q qVar2 = qVar;
        x0.k kVarP = jVar.p(650121315);
        if ((i10 & 6) == 0) {
            i12 = (kVarP.l(aVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i19 = i11 & 2;
        if (i19 != 0) {
            i12 |= 48;
        } else {
            if ((i10 & 48) == 0) {
                dVar2 = dVar;
                i12 |= kVarP.K(dVar2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 == 0) {
                i12 |= 384;
            } else {
                if ((i10 & 384) == 0) {
                    z11 = z10;
                    i12 |= kVarP.c(z11) ? 256 : 128;
                }
                if ((i10 & 3072) == 0) {
                    if ((i11 & 8) == 0) {
                        f2VarA = f2Var;
                        int i20 = kVarP.K(f2VarA) ? 2048 : 1024;
                        i12 |= i20;
                    } else {
                        f2VarA = f2Var;
                    }
                    i12 |= i20;
                } else {
                    f2VarA = f2Var;
                }
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        l0VarB = l0Var;
                        int i21 = kVarP.K(l0VarB) ? 16384 : 8192;
                        i12 |= i21;
                    } else {
                        l0VarB = l0Var;
                    }
                    i12 |= i21;
                } else {
                    l0VarB = l0Var;
                }
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        p0Var2 = p0Var;
                        int i22 = kVarP.K(p0Var2) ? 131072 : 65536;
                        i12 |= i22;
                    } else {
                        p0Var2 = p0Var;
                    }
                    i12 |= i22;
                } else {
                    p0Var2 = p0Var;
                }
                i14 = i11 & 64;
                if (i14 != 0) {
                    i12 |= 1572864;
                    vVar2 = vVar;
                } else {
                    vVar2 = vVar;
                    if ((i10 & 1572864) == 0) {
                        i12 |= kVarP.K(vVar2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                    }
                }
                i15 = i11 & 128;
                if (i15 == 0) {
                    if ((i10 & 12582912) == 0) {
                        i16 = i12 | (kVarP.K(f1Var) ? 8388608 : 4194304);
                    }
                    if ((i11 & 256) == 0) {
                        i16 |= 100663296;
                    } else if ((i10 & 100663296) == 0) {
                        i16 |= kVarP.K(null) ? 67108864 : 33554432;
                    }
                    if ((i10 & 805306368) == 0) {
                        i16 |= kVarP.l(qVar2) ? PKIFailureInfo.duplicateCertReq : 268435456;
                    }
                    i17 = i16;
                    if ((i17 & 306783379) == 306783378 || !kVarP.s()) {
                        kVarP.r0();
                        boolean z15 = true;
                        if ((i10 & 1) != 0 || kVarP.a0()) {
                            if (i19 != 0) {
                                dVar2 = d.a.f1143b;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 8) != 0) {
                                z.g1 g1Var = m0.f26400a;
                                i17 &= -7169;
                                f2VarA = ab.a(v0.k.f30321b, kVarP);
                            }
                            if ((i11 & 16) != 0) {
                                z.g1 g1Var2 = m0.f26400a;
                                i17 &= -57345;
                                l0VarB = m0.b((e2) kVarP.f(f2.f25858a));
                            }
                            if ((i11 & 32) == 0) {
                                z.g1 g1Var3 = m0.f26400a;
                                p0Var3 = new p0(v0.k.f30320a, v0.k.f30328i, v0.k.f30325f, v0.k.f30326g, v0.k.f30323d);
                                i17 &= -458753;
                            } else {
                                p0Var3 = p0Var2;
                            }
                            if (i14 != 0) {
                                vVar2 = null;
                            }
                            i18 = i17;
                            f1Var2 = i15 == 0 ? m0.f26400a : f1Var;
                            z12 = z11;
                            f2Var2 = f2VarA;
                            l0Var2 = l0VarB;
                            p0Var4 = p0Var3;
                            vVar3 = vVar2;
                        } else {
                            kVarP.v();
                            if ((i11 & 8) != 0) {
                                i17 &= -7169;
                            }
                            if ((i11 & 16) != 0) {
                                i17 &= -57345;
                            }
                            if ((i11 & 32) != 0) {
                                i17 &= -458753;
                            }
                            f1Var2 = f1Var;
                            i18 = i17;
                            vVar3 = vVar2;
                            f2Var2 = f2VarA;
                            l0Var2 = l0VarB;
                            p0Var4 = p0Var2;
                            z12 = z11;
                        }
                        kVarP.U();
                        kVarP.L(-239156623);
                        objG = kVarP.g();
                        c0321a = j.a.f31715a;
                        if (objG == c0321a) {
                            objG = new x.n();
                            kVarP.C(objG);
                        }
                        x.m mVar2 = (x.m) objG;
                        kVarP.T(false);
                        long j11 = !z12 ? l0Var2.f26335a : l0Var2.f26337c;
                        boolean z16 = z12;
                        long j12 = !z12 ? l0Var2.f26336b : l0Var2.f26338d;
                        l0 l0Var4 = l0Var2;
                        kVarP.L(-239150048);
                        if (p0Var4 != null) {
                            z13 = z16;
                            p0Var5 = p0Var4;
                            mVar = mVar2;
                            j10 = j11;
                            f2Var3 = f2Var2;
                            nVar = null;
                        } else {
                            int i23 = ((i18 >> 6) & 14) | ((i18 >> 9) & 896);
                            j10 = j11;
                            Object objG3 = kVarP.g();
                            if (objG3 == c0321a) {
                                objG3 = new h1.u();
                                kVarP.C(objG3);
                            }
                            h1.u uVar = (h1.u) objG3;
                            boolean zK = kVarP.K(mVar2);
                            Object objG4 = kVarP.g();
                            if (zK || objG4 == c0321a) {
                                objG4 = new n0(mVar2, uVar, null);
                                kVarP.C(objG4);
                            }
                            x0.o0.d((eh.p) objG4, mVar2, kVarP);
                            x.k kVar2 = (x.k) qg.x.K(uVar);
                            float f11 = !z16 ? p0Var4.f26661e : kVar2 instanceof o.b ? p0Var4.f26658b : kVar2 instanceof x.i ? p0Var4.f26660d : kVar2 instanceof x.e ? p0Var4.f26659c : p0Var4.f26657a;
                            Object objG5 = kVarP.g();
                            if (objG5 == c0321a) {
                                mVar = mVar2;
                                f2Var3 = f2Var2;
                                objG5 = new s.b(new f3.h(f11), s.p2.f23870c, null, 12);
                                kVarP.C(objG5);
                            } else {
                                mVar = mVar2;
                                f2Var3 = f2Var2;
                            }
                            s.b bVar = (s.b) objG5;
                            f3.h hVar = new f3.h(f11);
                            boolean zL2 = kVarP.l(bVar) | kVarP.h(f11);
                            if (((i23 & 14) ^ 6) > 4) {
                                z13 = z16;
                                if (kVarP.c(z13)) {
                                    f10 = f11;
                                }
                                boolean z17 = z | zL2;
                                if ((((i23 & 896) ^ 384) > 256 || !kVarP.K(p0Var4)) && (i23 & 384) != 256) {
                                    z15 = false;
                                }
                                zL = z17 | z15 | kVarP.l(kVar2);
                                objG2 = kVarP.g();
                                if (zL || objG2 == c0321a) {
                                    p0 p0Var7 = p0Var4;
                                    objG2 = new o0(bVar, f10, z13, p0Var7, kVar2, null);
                                    p0Var5 = p0Var7;
                                    kVarP.C(objG2);
                                } else {
                                    p0Var5 = p0Var4;
                                }
                                x0.o0.d((eh.p) objG2, hVar, kVarP);
                                nVar = bVar.f23654c;
                            } else {
                                z13 = z16;
                            }
                            f10 = f11;
                            boolean z18 = (i23 & 6) == 4;
                            boolean z172 = z18 | zL2;
                            if (((i23 & 896) ^ 384) > 256) {
                                z15 = false;
                                zL = z172 | z15 | kVarP.l(kVar2);
                                objG2 = kVarP.g();
                                if (zL) {
                                    p0 p0Var72 = p0Var4;
                                    objG2 = new o0(bVar, f10, z13, p0Var72, kVar2, null);
                                    p0Var5 = p0Var72;
                                    kVarP.C(objG2);
                                    x0.o0.d((eh.p) objG2, hVar, kVarP);
                                    nVar = bVar.f23654c;
                                }
                            } else {
                                z15 = false;
                                zL = z172 | z15 | kVarP.l(kVar2);
                                objG2 = kVarP.g();
                                if (zL) {
                                }
                            }
                        }
                        kVarP.T(false);
                        qVar2 = qVar;
                        kVar = kVarP;
                        q1.f2 f2Var5 = f2Var3;
                        boolean z19 = z13;
                        md.b(aVar, q2.q.a(dVar2, false, q0.f26767a), z19, f2Var5, j10, j12, CropImageView.DEFAULT_ASPECT_RATIO, nVar == null ? ((f3.h) nVar.f23843b.getValue()).f8817a : 0, vVar3, mVar, f1.c.b(956488494, new s0(j12, f1Var2, qVar2), kVarP), kVar, (i18 & 8078) | ((i18 << 6) & 234881024), 64);
                        p0Var6 = p0Var5;
                        f1Var3 = f1Var2;
                        dVar3 = dVar2;
                        z14 = z19;
                        vVar4 = vVar3;
                        f2Var4 = f2Var5;
                        l0Var3 = l0Var4;
                    } else {
                        kVarP.v();
                        kVar = kVarP;
                        dVar3 = dVar2;
                        z14 = z11;
                        f2Var4 = f2VarA;
                        l0Var3 = l0VarB;
                        f1Var3 = f1Var;
                        vVar4 = vVar2;
                        p0Var6 = p0Var2;
                    }
                    h2VarV = kVar.V();
                    if (h2VarV == null) {
                        h2VarV.f31703d = new t0(aVar, dVar3, z14, f2Var4, l0Var3, p0Var6, vVar4, f1Var3, qVar2, i10, i11);
                        return;
                    }
                    return;
                }
                i12 |= 12582912;
                i16 = i12;
                if ((i11 & 256) == 0) {
                }
                if ((i10 & 805306368) == 0) {
                }
                i17 = i16;
                if ((i17 & 306783379) == 306783378) {
                    kVarP.r0();
                    boolean z152 = true;
                    if ((i10 & 1) != 0) {
                        if (i19 != 0) {
                        }
                        if (i13 != 0) {
                        }
                        if ((i11 & 8) != 0) {
                        }
                        if ((i11 & 16) != 0) {
                        }
                        if ((i11 & 32) == 0) {
                        }
                        if (i14 != 0) {
                        }
                        i18 = i17;
                        f1Var2 = i15 == 0 ? m0.f26400a : f1Var;
                        z12 = z11;
                        f2Var2 = f2VarA;
                        l0Var2 = l0VarB;
                        p0Var4 = p0Var3;
                        vVar3 = vVar2;
                        kVarP.U();
                        kVarP.L(-239156623);
                        objG = kVarP.g();
                        c0321a = j.a.f31715a;
                        if (objG == c0321a) {
                        }
                        x.m mVar22 = (x.m) objG;
                        kVarP.T(false);
                        if (!z12) {
                        }
                        boolean z162 = z12;
                        if (!z12) {
                        }
                        l0 l0Var42 = l0Var2;
                        kVarP.L(-239150048);
                        if (p0Var4 != null) {
                        }
                        kVarP.T(false);
                        qVar2 = qVar;
                        kVar = kVarP;
                        q1.f2 f2Var52 = f2Var3;
                        boolean z192 = z13;
                        md.b(aVar, q2.q.a(dVar2, false, q0.f26767a), z192, f2Var52, j10, j12, CropImageView.DEFAULT_ASPECT_RATIO, nVar == null ? ((f3.h) nVar.f23843b.getValue()).f8817a : 0, vVar3, mVar, f1.c.b(956488494, new s0(j12, f1Var2, qVar2), kVarP), kVar, (i18 & 8078) | ((i18 << 6) & 234881024), 64);
                        p0Var6 = p0Var5;
                        f1Var3 = f1Var2;
                        dVar3 = dVar2;
                        z14 = z192;
                        vVar4 = vVar3;
                        f2Var4 = f2Var52;
                        l0Var3 = l0Var42;
                    }
                }
                h2VarV = kVar.V();
                if (h2VarV == null) {
                }
            }
            z11 = z10;
            if ((i10 & 3072) == 0) {
            }
            if ((i10 & 24576) == 0) {
            }
            if ((196608 & i10) == 0) {
            }
            i14 = i11 & 64;
            if (i14 != 0) {
            }
            i15 = i11 & 128;
            if (i15 == 0) {
            }
            i16 = i12;
            if ((i11 & 256) == 0) {
            }
            if ((i10 & 805306368) == 0) {
            }
            i17 = i16;
            if ((i17 & 306783379) == 306783378) {
            }
            h2VarV = kVar.V();
            if (h2VarV == null) {
            }
        }
        dVar2 = dVar;
        i13 = i11 & 4;
        if (i13 == 0) {
        }
        z11 = z10;
        if ((i10 & 3072) == 0) {
        }
        if ((i10 & 24576) == 0) {
        }
        if ((196608 & i10) == 0) {
        }
        i14 = i11 & 64;
        if (i14 != 0) {
        }
        i15 = i11 & 128;
        if (i15 == 0) {
        }
        i16 = i12;
        if ((i11 & 256) == 0) {
        }
        if ((i10 & 805306368) == 0) {
        }
        i17 = i16;
        if ((i17 & 306783379) == 306783378) {
        }
        h2VarV = kVar.V();
        if (h2VarV == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0174  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(eh.a aVar, androidx.compose.ui.d dVar, boolean z10, q1.f2 f2Var, l0 l0Var, p0 p0Var, z.f1 f1Var, f1.b bVar, x0.j jVar, int i10, int i11) {
        int i12;
        androidx.compose.ui.d dVar2;
        int i13;
        boolean z11;
        q1.f2 f2VarA;
        int i14;
        z.f1 f1Var2;
        int i15;
        f1.b bVar2;
        androidx.compose.ui.d dVar3;
        l0 l0Var2;
        int i16;
        l0 l0Var3;
        p0 p0Var2;
        int i17;
        x0.k kVar;
        boolean z12;
        q1.f2 f2Var2;
        l0 l0Var4;
        p0 p0Var3;
        z.f1 f1Var3;
        x0.h2 h2VarV;
        x0.k kVarP = jVar.p(-1717924381);
        if ((i10 & 6) == 0) {
            i12 = (kVarP.l(aVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i18 = i11 & 2;
        if (i18 != 0) {
            i12 |= 48;
        } else {
            if ((i10 & 48) == 0) {
                dVar2 = dVar;
                i12 |= kVarP.K(dVar2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 == 0) {
                i12 |= 384;
            } else {
                if ((i10 & 384) == 0) {
                    z11 = z10;
                    i12 |= kVarP.c(z11) ? 256 : 128;
                }
                if ((i10 & 3072) == 0) {
                    if ((i11 & 8) == 0) {
                        f2VarA = f2Var;
                        int i19 = kVarP.K(f2VarA) ? 2048 : 1024;
                        i12 |= i19;
                    } else {
                        f2VarA = f2Var;
                    }
                    i12 |= i19;
                } else {
                    f2VarA = f2Var;
                }
                if ((i10 & 24576) == 0) {
                    i12 |= 8192;
                }
                if ((196608 & i10) == 0) {
                    i12 |= 65536;
                }
                int i20 = 1572864 | i12;
                i14 = i11 & 128;
                if (i14 == 0) {
                    if ((12582912 & i10) == 0) {
                        f1Var2 = f1Var;
                        i20 |= kVarP.K(f1Var2) ? 8388608 : 4194304;
                    }
                    i15 = i20 | 100663296;
                    if ((805306368 & i10) != 0) {
                        bVar2 = bVar;
                        i15 |= kVarP.l(bVar2) ? PKIFailureInfo.duplicateCertReq : 268435456;
                    } else {
                        bVar2 = bVar;
                    }
                    if ((306783379 & i15) == 306783378 || !kVarP.s()) {
                        kVarP.r0();
                        if ((i10 & 1) != 0 || kVarP.a0()) {
                            dVar3 = i18 == 0 ? d.a.f1143b : dVar2;
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 8) != 0) {
                                z.g1 g1Var = m0.f26400a;
                                i15 &= -7169;
                                f2VarA = ab.a(v0.n.f30397b, kVarP);
                            }
                            z.g1 g1Var2 = m0.f26400a;
                            e2 e2Var = (e2) kVarP.f(f2.f25858a);
                            l0Var2 = e2Var.L;
                            if (l0Var2 != null) {
                                float f10 = v0.n.f30396a;
                                i16 = -516097;
                                l0Var3 = new l0(f2.d(e2Var, v0.d.f30252r), f2.d(e2Var, v0.n.f30402g), q1.b1.c(0.12f, f2.d(e2Var, v0.n.f30398c)), q1.b1.c(0.38f, f2.d(e2Var, v0.n.f30399d)));
                                e2Var.L = l0Var3;
                            } else {
                                i16 = -516097;
                                l0Var3 = l0Var2;
                            }
                            p0Var2 = new p0(v0.n.f30396a, v0.n.f30403h, v0.n.f30400e, v0.n.f30401f, 0);
                            i17 = i15 & i16;
                            if (i14 != 0) {
                                f1Var2 = m0.f26400a;
                            }
                        } else {
                            kVarP.v();
                            if ((i11 & 8) != 0) {
                                i15 &= -7169;
                            }
                            androidx.compose.ui.d dVar4 = dVar2;
                            i17 = i15 & (-516097);
                            dVar3 = dVar4;
                            l0Var3 = l0Var;
                            p0Var2 = p0Var;
                        }
                        z.f1 f1Var4 = f1Var2;
                        boolean z13 = z11;
                        q1.f2 f2Var3 = f2VarA;
                        kVarP.U();
                        kVar = kVarP;
                        a(aVar, dVar3, z13, f2Var3, l0Var3, p0Var2, null, f1Var4, bVar2, kVar, i17 & 2147483646, 0);
                        z12 = z13;
                        f2Var2 = f2Var3;
                        l0Var4 = l0Var3;
                        p0Var3 = p0Var2;
                        f1Var3 = f1Var4;
                    } else {
                        kVarP.v();
                        kVar = kVarP;
                        f1Var3 = f1Var2;
                        dVar3 = dVar2;
                        z12 = z11;
                        f2Var2 = f2VarA;
                        l0Var4 = l0Var;
                        p0Var3 = p0Var;
                    }
                    h2VarV = kVar.V();
                    if (h2VarV == null) {
                        h2VarV.f31703d = new u0(aVar, dVar3, z12, f2Var2, l0Var4, p0Var3, f1Var3, bVar, i10, i11);
                        return;
                    }
                    return;
                }
                i20 = 14155776 | i12;
                f1Var2 = f1Var;
                i15 = i20 | 100663296;
                if ((805306368 & i10) != 0) {
                }
                if ((306783379 & i15) == 306783378) {
                    kVarP.r0();
                    if ((i10 & 1) != 0) {
                        if (i18 == 0) {
                        }
                        if (i13 != 0) {
                        }
                        if ((i11 & 8) != 0) {
                        }
                        z.g1 g1Var22 = m0.f26400a;
                        e2 e2Var2 = (e2) kVarP.f(f2.f25858a);
                        l0Var2 = e2Var2.L;
                        if (l0Var2 != null) {
                        }
                        p0Var2 = new p0(v0.n.f30396a, v0.n.f30403h, v0.n.f30400e, v0.n.f30401f, 0);
                        i17 = i15 & i16;
                        if (i14 != 0) {
                        }
                        z.f1 f1Var42 = f1Var2;
                        boolean z132 = z11;
                        q1.f2 f2Var32 = f2VarA;
                        kVarP.U();
                        kVar = kVarP;
                        a(aVar, dVar3, z132, f2Var32, l0Var3, p0Var2, null, f1Var42, bVar2, kVar, i17 & 2147483646, 0);
                        z12 = z132;
                        f2Var2 = f2Var32;
                        l0Var4 = l0Var3;
                        p0Var3 = p0Var2;
                        f1Var3 = f1Var42;
                    }
                }
                h2VarV = kVar.V();
                if (h2VarV == null) {
                }
            }
            z11 = z10;
            if ((i10 & 3072) == 0) {
            }
            if ((i10 & 24576) == 0) {
            }
            if ((196608 & i10) == 0) {
            }
            int i202 = 1572864 | i12;
            i14 = i11 & 128;
            if (i14 == 0) {
            }
            f1Var2 = f1Var;
            i15 = i202 | 100663296;
            if ((805306368 & i10) != 0) {
            }
            if ((306783379 & i15) == 306783378) {
            }
            h2VarV = kVar.V();
            if (h2VarV == null) {
            }
        }
        dVar2 = dVar;
        i13 = i11 & 4;
        if (i13 == 0) {
        }
        z11 = z10;
        if ((i10 & 3072) == 0) {
        }
        if ((i10 & 24576) == 0) {
        }
        if ((196608 & i10) == 0) {
        }
        int i2022 = 1572864 | i12;
        i14 = i11 & 128;
        if (i14 == 0) {
        }
        f1Var2 = f1Var;
        i15 = i2022 | 100663296;
        if ((805306368 & i10) != 0) {
        }
        if ((306783379 & i15) == 306783378) {
        }
        h2VarV = kVar.V();
        if (h2VarV == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(eh.a aVar, androidx.compose.ui.d dVar, boolean z10, q1.f2 f2Var, l0 l0Var, t.v vVar, z.f1 f1Var, eh.q qVar, x0.j jVar, int i10, int i11) {
        int i12;
        androidx.compose.ui.d dVar2;
        int i13;
        boolean z11;
        q1.f2 f2VarA;
        l0 l0VarC;
        t.v vVarA;
        int i14;
        z.f1 f1Var2;
        int i15;
        boolean z12;
        androidx.compose.ui.d dVar3;
        q1.f2 f2Var2;
        l0 l0Var2;
        t.v vVar2;
        z.f1 f1Var3;
        boolean z13;
        int i16;
        long jC;
        x0.k kVar;
        androidx.compose.ui.d dVar4;
        boolean z14;
        q1.f2 f2Var3;
        l0 l0Var3;
        t.v vVar3;
        z.f1 f1Var4;
        x0.h2 h2VarV;
        int i17;
        x0.k kVarP = jVar.p(-1694808287);
        if ((i10 & 6) == 0) {
            i12 = (kVarP.l(aVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i18 = i11 & 2;
        if (i18 != 0) {
            i12 |= 48;
        } else {
            if ((i10 & 48) == 0) {
                dVar2 = dVar;
                i12 |= kVarP.K(dVar2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 == 0) {
                i12 |= 384;
            } else {
                if ((i10 & 384) == 0) {
                    z11 = z10;
                    i12 |= kVarP.c(z11) ? 256 : 128;
                }
                if ((i10 & 3072) == 0) {
                    if ((i11 & 8) == 0) {
                        f2VarA = f2Var;
                        int i19 = kVarP.K(f2VarA) ? 2048 : 1024;
                        i12 |= i19;
                    } else {
                        f2VarA = f2Var;
                    }
                    i12 |= i19;
                } else {
                    f2VarA = f2Var;
                }
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        l0VarC = l0Var;
                        int i20 = kVarP.K(l0VarC) ? 16384 : 8192;
                        i12 |= i20;
                    } else {
                        l0VarC = l0Var;
                    }
                    i12 |= i20;
                } else {
                    l0VarC = l0Var;
                }
                int i21 = i12 | 196608;
                if ((1572864 & i10) == 0) {
                    if ((i11 & 64) == 0) {
                        vVarA = vVar;
                        if (kVarP.K(vVarA)) {
                            i17 = PKIFailureInfo.badCertTemplate;
                        }
                        i21 |= i17;
                    } else {
                        vVarA = vVar;
                    }
                    i17 = PKIFailureInfo.signerNotTrusted;
                    i21 |= i17;
                } else {
                    vVarA = vVar;
                }
                i14 = i11 & 128;
                if (i14 == 0) {
                    if ((12582912 & i10) == 0) {
                        f1Var2 = f1Var;
                        i21 |= kVarP.K(f1Var2) ? 8388608 : 4194304;
                    }
                    i15 = i21 | 100663296;
                    if ((805306368 & i10) == 0) {
                        i15 |= kVarP.l(qVar) ? PKIFailureInfo.duplicateCertReq : 268435456;
                    }
                    if ((306783379 & i15) == 306783378 || !kVarP.s()) {
                        kVarP.r0();
                        if ((i10 & 1) != 0 || kVarP.a0()) {
                            androidx.compose.ui.d dVar5 = i18 == 0 ? d.a.f1143b : dVar2;
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 8) != 0) {
                                z.g1 g1Var = m0.f26400a;
                                float f10 = v0.w.f30496a;
                                i15 &= -7169;
                                f2VarA = ab.a(v0.c0.f30231d, kVarP);
                            }
                            if ((i11 & 16) != 0) {
                                z.g1 g1Var2 = m0.f26400a;
                                i15 &= -57345;
                                l0VarC = m0.c((e2) kVarP.f(f2.f25858a));
                            }
                            if ((i11 & 64) == 0) {
                                z.g1 g1Var3 = m0.f26400a;
                                float f11 = v0.w.f30496a;
                                v0.d dVar6 = v0.d.f30246k;
                                if (z11) {
                                    i16 = -3670017;
                                    kVarP.L(-855870548);
                                    jC = f2.e(dVar6, kVarP);
                                    kVarP.T(false);
                                    z12 = z11;
                                } else {
                                    i16 = -3670017;
                                    kVarP.L(-855783004);
                                    z12 = z11;
                                    jC = q1.b1.c(0.12f, f2.e(dVar6, kVarP));
                                    kVarP.T(false);
                                }
                                i15 &= i16;
                                vVarA = a9.d2.a(f11, jC);
                            } else {
                                z12 = z11;
                            }
                            if (i14 != 0) {
                                f1Var2 = m0.f26400a;
                            }
                            dVar3 = dVar5;
                            f2Var2 = f2VarA;
                            l0Var2 = l0VarC;
                            vVar2 = vVarA;
                            f1Var3 = f1Var2;
                            z13 = z12;
                        } else {
                            kVarP.v();
                            if ((i11 & 8) != 0) {
                                i15 &= -7169;
                            }
                            if ((i11 & 16) != 0) {
                                i15 &= -57345;
                            }
                            if ((i11 & 64) != 0) {
                                i15 &= -3670017;
                            }
                            dVar3 = dVar2;
                            f2Var2 = f2VarA;
                            l0Var2 = l0VarC;
                            vVar2 = vVarA;
                            f1Var3 = f1Var2;
                            z13 = z11;
                        }
                        kVarP.U();
                        kVar = kVarP;
                        a(aVar, dVar3, z13, f2Var2, l0Var2, null, vVar2, f1Var3, qVar, kVar, i15 & 2147483646, 0);
                        dVar4 = dVar3;
                        z14 = z13;
                        f2Var3 = f2Var2;
                        l0Var3 = l0Var2;
                        vVar3 = vVar2;
                        f1Var4 = f1Var3;
                    } else {
                        kVarP.v();
                        kVar = kVarP;
                        dVar4 = dVar2;
                        z14 = z11;
                        f2Var3 = f2VarA;
                        l0Var3 = l0VarC;
                        vVar3 = vVarA;
                        f1Var4 = f1Var2;
                    }
                    h2VarV = kVar.V();
                    if (h2VarV == null) {
                        h2VarV.f31703d = new v0(aVar, dVar4, z14, f2Var3, l0Var3, vVar3, f1Var4, qVar, i10, i11);
                        return;
                    }
                    return;
                }
                i21 |= 12582912;
                f1Var2 = f1Var;
                i15 = i21 | 100663296;
                if ((805306368 & i10) == 0) {
                }
                if ((306783379 & i15) == 306783378) {
                    kVarP.r0();
                    if ((i10 & 1) != 0) {
                        if (i18 == 0) {
                        }
                        if (i13 != 0) {
                        }
                        if ((i11 & 8) != 0) {
                        }
                        if ((i11 & 16) != 0) {
                        }
                        if ((i11 & 64) == 0) {
                        }
                        if (i14 != 0) {
                        }
                        dVar3 = dVar5;
                        f2Var2 = f2VarA;
                        l0Var2 = l0VarC;
                        vVar2 = vVarA;
                        f1Var3 = f1Var2;
                        z13 = z12;
                        kVarP.U();
                        kVar = kVarP;
                        a(aVar, dVar3, z13, f2Var2, l0Var2, null, vVar2, f1Var3, qVar, kVar, i15 & 2147483646, 0);
                        dVar4 = dVar3;
                        z14 = z13;
                        f2Var3 = f2Var2;
                        l0Var3 = l0Var2;
                        vVar3 = vVar2;
                        f1Var4 = f1Var3;
                    }
                }
                h2VarV = kVar.V();
                if (h2VarV == null) {
                }
            }
            z11 = z10;
            if ((i10 & 3072) == 0) {
            }
            if ((i10 & 24576) == 0) {
            }
            int i212 = i12 | 196608;
            if ((1572864 & i10) == 0) {
            }
            i14 = i11 & 128;
            if (i14 == 0) {
            }
            f1Var2 = f1Var;
            i15 = i212 | 100663296;
            if ((805306368 & i10) == 0) {
            }
            if ((306783379 & i15) == 306783378) {
            }
            h2VarV = kVar.V();
            if (h2VarV == null) {
            }
        }
        dVar2 = dVar;
        i13 = i11 & 4;
        if (i13 == 0) {
        }
        z11 = z10;
        if ((i10 & 3072) == 0) {
        }
        if ((i10 & 24576) == 0) {
        }
        int i2122 = i12 | 196608;
        if ((1572864 & i10) == 0) {
        }
        i14 = i11 & 128;
        if (i14 == 0) {
        }
        f1Var2 = f1Var;
        i15 = i2122 | 100663296;
        if ((805306368 & i10) == 0) {
        }
        if ((306783379 & i15) == 306783378) {
        }
        h2VarV = kVar.V();
        if (h2VarV == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(eh.a aVar, androidx.compose.ui.d dVar, boolean z10, q1.f2 f2Var, l0 l0Var, z.f1 f1Var, eh.q qVar, x0.j jVar, int i10, int i11) {
        int i12;
        androidx.compose.ui.d dVar2;
        int i13;
        boolean z11;
        q1.f2 f2VarA;
        l0 l0VarD;
        int i14;
        z.f1 f1Var2;
        int i15;
        z.f1 f1Var3;
        boolean z12;
        q1.f2 f2Var2;
        l0 l0Var2;
        int i16;
        androidx.compose.ui.d dVar3;
        x0.k kVar;
        androidx.compose.ui.d dVar4;
        boolean z13;
        q1.f2 f2Var3;
        l0 l0Var3;
        z.f1 f1Var4;
        x0.h2 h2VarV;
        x0.k kVarP = jVar.p(-2106428362);
        if ((i10 & 6) == 0) {
            i12 = (kVarP.l(aVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i17 = i11 & 2;
        if (i17 != 0) {
            i12 |= 48;
        } else {
            if ((i10 & 48) == 0) {
                dVar2 = dVar;
                i12 |= kVarP.K(dVar2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 == 0) {
                i12 |= 384;
            } else {
                if ((i10 & 384) == 0) {
                    z11 = z10;
                    i12 |= kVarP.c(z11) ? 256 : 128;
                }
                if ((i10 & 3072) == 0) {
                    if ((i11 & 8) == 0) {
                        f2VarA = f2Var;
                        int i18 = kVarP.K(f2VarA) ? 2048 : 1024;
                        i12 |= i18;
                    } else {
                        f2VarA = f2Var;
                    }
                    i12 |= i18;
                } else {
                    f2VarA = f2Var;
                }
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        l0VarD = l0Var;
                        int i19 = kVarP.K(l0VarD) ? 16384 : 8192;
                        i12 |= i19;
                    } else {
                        l0VarD = l0Var;
                    }
                    i12 |= i19;
                } else {
                    l0VarD = l0Var;
                }
                int i20 = 1769472 | i12;
                i14 = i11 & 128;
                if (i14 == 0) {
                    if ((12582912 & i10) == 0) {
                        f1Var2 = f1Var;
                        i20 |= kVarP.K(f1Var2) ? 8388608 : 4194304;
                    }
                    i15 = i20 | 100663296;
                    if ((805306368 & i10) == 0) {
                        i15 |= kVarP.l(qVar) ? PKIFailureInfo.duplicateCertReq : 268435456;
                    }
                    if ((306783379 & i15) == 306783378 || !kVarP.s()) {
                        kVarP.r0();
                        if ((i10 & 1) != 0 || kVarP.a0()) {
                            androidx.compose.ui.d dVar5 = i17 == 0 ? d.a.f1143b : dVar2;
                            boolean z14 = i13 == 0 ? true : z11;
                            if ((i11 & 8) != 0) {
                                z.g1 g1Var = m0.f26400a;
                                i15 &= -7169;
                                f2VarA = ab.a(v0.c0.f30231d, kVarP);
                            }
                            if ((i11 & 16) != 0) {
                                z.g1 g1Var2 = m0.f26400a;
                                l0VarD = m0.d((e2) kVarP.f(f2.f25858a));
                                i15 &= -57345;
                            }
                            if (i14 != 0) {
                                f1Var2 = m0.f26401b;
                            }
                            f1Var3 = f1Var2;
                            z12 = z14;
                            f2Var2 = f2VarA;
                            l0Var2 = l0VarD;
                            i16 = i15;
                            dVar3 = dVar5;
                        } else {
                            kVarP.v();
                            if ((i11 & 8) != 0) {
                                i15 &= -7169;
                            }
                            if ((i11 & 16) != 0) {
                                i15 &= -57345;
                            }
                            f1Var3 = f1Var2;
                            z12 = z11;
                            f2Var2 = f2VarA;
                            l0Var2 = l0VarD;
                            i16 = i15;
                            dVar3 = dVar2;
                        }
                        kVarP.U();
                        kVar = kVarP;
                        a(aVar, dVar3, z12, f2Var2, l0Var2, null, null, f1Var3, qVar, kVar, i16 & 2147483646, 0);
                        dVar4 = dVar3;
                        z13 = z12;
                        f2Var3 = f2Var2;
                        l0Var3 = l0Var2;
                        f1Var4 = f1Var3;
                    } else {
                        kVarP.v();
                        kVar = kVarP;
                        dVar4 = dVar2;
                        z13 = z11;
                        f2Var3 = f2VarA;
                        l0Var3 = l0VarD;
                        f1Var4 = f1Var2;
                    }
                    h2VarV = kVar.V();
                    if (h2VarV == null) {
                        h2VarV.f31703d = new w0(aVar, dVar4, z13, f2Var3, l0Var3, f1Var4, qVar, i10, i11);
                        return;
                    }
                    return;
                }
                i20 = 14352384 | i12;
                f1Var2 = f1Var;
                i15 = i20 | 100663296;
                if ((805306368 & i10) == 0) {
                }
                if ((306783379 & i15) == 306783378) {
                    kVarP.r0();
                    if ((i10 & 1) != 0) {
                        if (i17 == 0) {
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 8) != 0) {
                        }
                        if ((i11 & 16) != 0) {
                        }
                        if (i14 != 0) {
                        }
                        f1Var3 = f1Var2;
                        z12 = z14;
                        f2Var2 = f2VarA;
                        l0Var2 = l0VarD;
                        i16 = i15;
                        dVar3 = dVar5;
                        kVarP.U();
                        kVar = kVarP;
                        a(aVar, dVar3, z12, f2Var2, l0Var2, null, null, f1Var3, qVar, kVar, i16 & 2147483646, 0);
                        dVar4 = dVar3;
                        z13 = z12;
                        f2Var3 = f2Var2;
                        l0Var3 = l0Var2;
                        f1Var4 = f1Var3;
                    }
                }
                h2VarV = kVar.V();
                if (h2VarV == null) {
                }
            }
            z11 = z10;
            if ((i10 & 3072) == 0) {
            }
            if ((i10 & 24576) == 0) {
            }
            int i202 = 1769472 | i12;
            i14 = i11 & 128;
            if (i14 == 0) {
            }
            f1Var2 = f1Var;
            i15 = i202 | 100663296;
            if ((805306368 & i10) == 0) {
            }
            if ((306783379 & i15) == 306783378) {
            }
            h2VarV = kVar.V();
            if (h2VarV == null) {
            }
        }
        dVar2 = dVar;
        i13 = i11 & 4;
        if (i13 == 0) {
        }
        z11 = z10;
        if ((i10 & 3072) == 0) {
        }
        if ((i10 & 24576) == 0) {
        }
        int i2022 = 1769472 | i12;
        i14 = i11 & 128;
        if (i14 == 0) {
        }
        f1Var2 = f1Var;
        i15 = i2022 | 100663296;
        if ((805306368 & i10) == 0) {
        }
        if ((306783379 & i15) == 306783378) {
        }
        h2VarV = kVar.V();
        if (h2VarV == null) {
        }
    }
}
