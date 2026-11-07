package q8;

import android.content.Context;
import android.view.View;
import androidx.compose.foundation.layout.FillElement;
import com.android.apksig.internal.apk.v4.V4Signature;
import com.yalantis.ucrop.view.CropImageView;
import f9.fd;
import i2.e0;
import i2.g;
import j1.d;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import t0.k9;
import x0.j;
import y2.q0;

/* loaded from: classes.dex */
public final class k1 {

    public static final class a implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ y2.c0 f22275a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f22276b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ eh.l<String, pg.f0> f22277c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ x.m f22278d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(y2.c0 c0Var, String str, eh.l<? super String, pg.f0> lVar, x.m mVar) {
            this.f22275a = c0Var;
            this.f22276b = str;
            this.f22277c = lVar;
            this.f22278d = mVar;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                jVar2.L(1807940793);
                String str = this.f22276b;
                boolean zK = jVar2.K(str);
                eh.l<String, pg.f0> lVar = this.f22277c;
                boolean zK2 = zK | jVar2.K(lVar);
                Object objG = jVar2.g();
                if (zK2 || objG == j.a.f31715a) {
                    objG = new c9.g1(1, str, lVar);
                    jVar2.C(objG);
                }
                jVar2.B();
                FillElement fillElement = androidx.compose.foundation.layout.g.f976c;
                k1.a(this.f22275a, (eh.l) objG, fillElement, false, false, this.f22278d, false, null, null, false, false, CropImageView.DEFAULT_ASPECT_RATIO, false, null, null, jVar2, 1769856, 0, 32664);
            }
            return pg.f0.f21461a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:264:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final y2.c0 value, final eh.l<? super y2.c0, pg.f0> onValueChange, final androidx.compose.ui.d dVar, boolean z10, boolean z11, x.m mVar, boolean z12, eh.a<pg.f0> aVar, eh.a<pg.f0> aVar2, boolean z13, boolean z14, float f10, boolean z15, eh.a<pg.f0> aVar3, eh.q<? super Integer, ? super Integer, ? super Integer, pg.f0> qVar, x0.j jVar, final int i10, final int i11, final int i12) {
        boolean z16;
        int i13;
        boolean z17;
        int i14;
        final x.m mVar2;
        int i15;
        boolean z18;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        eh.a<pg.f0> aVar4;
        boolean z19;
        boolean z20;
        float f11;
        boolean z21;
        eh.a<pg.f0> aVar5;
        final x0.n1 n1VarK;
        final t0.e2 e2Var;
        eh.a<pg.f0> aVar6;
        final boolean z22;
        final boolean z23;
        eh.a<pg.f0> aVar7;
        eh.q<? super Integer, ? super Integer, ? super Integer, pg.f0> qVar2;
        boolean zC;
        Object objG;
        j.a.C0321a c0321a;
        boolean z24;
        int[] iArr;
        final int[] iArr2;
        boolean zK;
        Object objG2;
        Object objA;
        boolean zK2;
        Object objG3;
        x0.k kVar;
        final eh.a<pg.f0> aVar8;
        final boolean z25;
        final boolean z26;
        final eh.a<pg.f0> aVar9;
        final float f12;
        final eh.a<pg.f0> aVar10;
        x.m mVar3;
        final boolean z27;
        final eh.q<? super Integer, ? super Integer, ? super Integer, pg.f0> qVar3;
        final boolean z28;
        x0.k kVar2;
        final eh.a<pg.f0> aVar11;
        final eh.a<pg.f0> aVar12;
        final eh.q<? super Integer, ? super Integer, ? super Integer, pg.f0> qVar4;
        final boolean z29;
        final boolean z30;
        final boolean z31;
        final eh.a<pg.f0> aVar13;
        final boolean z32;
        final boolean z33;
        final x.m mVar4;
        final boolean z34;
        x0.h2 h2VarV;
        kotlin.jvm.internal.r.e(value, "value");
        kotlin.jvm.internal.r.e(onValueChange, "onValueChange");
        x0.k kVarP = jVar.p(354474990);
        int i31 = (kVarP.K(value) ? 4 : 2) | i10;
        if ((i10 & 48) == 0) {
            i31 |= kVarP.l(onValueChange) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i31 |= kVarP.K(dVar) ? 256 : 128;
        }
        int i32 = i12 & 8;
        if (i32 != 0) {
            i13 = i31 | 3072;
            z16 = z10;
        } else {
            z16 = z10;
            i13 = i31 | (kVarP.c(z16) ? 2048 : 1024);
        }
        int i33 = i12 & 16;
        if (i33 == 0) {
            if ((i10 & 24576) == 0) {
                z17 = z11;
                i13 |= kVarP.c(z17) ? 16384 : 8192;
            }
            i14 = i12 & 32;
            if (i14 == 0) {
                i13 |= 196608;
                mVar2 = mVar;
            } else {
                mVar2 = mVar;
                if ((i10 & 196608) == 0) {
                    i13 |= kVarP.K(mVar2) ? 131072 : 65536;
                }
            }
            i15 = i12 & 64;
            if (i15 == 0) {
                i13 |= 1572864;
                z18 = z12;
            } else {
                z18 = z12;
                if ((i10 & 1572864) == 0) {
                    i13 |= kVarP.c(z18) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                }
            }
            i16 = i12 & 128;
            if (i16 == 0) {
                i13 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                i13 |= kVarP.l(aVar) ? 8388608 : 4194304;
            }
            i17 = i12 & 256;
            if (i17 == 0) {
                i13 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                i13 |= kVarP.l(aVar2) ? 67108864 : 33554432;
            }
            i18 = i12 & 512;
            if (i18 == 0) {
                i13 |= 805306368;
            } else if ((i10 & 805306368) == 0) {
                i13 |= kVarP.c(z13) ? PKIFailureInfo.duplicateCertReq : 268435456;
            }
            i19 = i12 & 1024;
            if (i19 == 0) {
                i21 = i11 | 6;
                i20 = i19;
            } else {
                i20 = i19;
                i21 = i11 | (kVarP.c(z14) ? 4 : 2);
            }
            i22 = i12 & 2048;
            if (i22 == 0) {
                i24 = i21 | 48;
                i23 = i22;
            } else {
                i23 = i22;
                i24 = i21 | (kVarP.h(f10) ? 32 : 16);
            }
            int i34 = i24;
            i25 = i12 & 4096;
            if (i25 == 0) {
                i26 = i34 | 384;
            } else {
                int i35 = i34;
                if ((i11 & 384) == 0) {
                    i35 |= kVarP.c(z15) ? 256 : 128;
                }
                i26 = i35;
            }
            i27 = i12 & 8192;
            if (i27 == 0) {
                i28 = i26 | 3072;
            } else {
                i28 = i26 | (kVarP.l(aVar3) ? 2048 : 1024);
            }
            i29 = i12 & 16384;
            if (i29 == 0) {
                i30 = i28 | 24576;
            } else {
                int i36 = i28;
                if ((i11 & 24576) == 0) {
                    i30 = i36 | (kVarP.l(qVar) ? 16384 : 8192);
                } else {
                    i30 = i36;
                }
            }
            if ((i13 & 306783379) != 306783378 && (i30 & 9363) == 9362 && kVarP.s()) {
                kVarP.v();
                aVar12 = aVar2;
                z34 = z13;
                f12 = f10;
                z29 = z15;
                qVar4 = qVar;
                kVar2 = kVarP;
                z31 = z18;
                z33 = z16;
                mVar4 = mVar2;
                z30 = z17;
                aVar11 = aVar;
                z32 = z14;
                aVar13 = aVar3;
            } else {
                if (i32 != 0) {
                    z16 = true;
                }
                if (i33 != 0) {
                    z17 = false;
                }
                if (i14 != 0) {
                    mVar2 = null;
                }
                if (i15 != 0) {
                    z18 = true;
                }
                eh.a<pg.f0> aVar14 = i16 == 0 ? null : aVar;
                aVar4 = i17 == 0 ? null : aVar2;
                z19 = i18 == 0 ? false : z13;
                z20 = i20 == 0 ? false : z14;
                f11 = i23 == 0 ? 13.0f : f10;
                z21 = i25 == 0 ? false : z15;
                aVar5 = i27 == 0 ? null : aVar3;
                eh.q<? super Integer, ? super Integer, ? super Integer, pg.f0> qVar5 = i29 == 0 ? null : qVar;
                int i37 = i13 >> 3;
                n1VarK = bg.b.k(onValueChange, kVarP);
                e2Var = (t0.e2) kVarP.f(t0.f2.f25858a);
                if (c2.n0.h(e2Var.f25770p) >= 0.5f) {
                    aVar6 = aVar14;
                    z22 = z16;
                    z23 = true;
                } else {
                    aVar6 = aVar14;
                    z22 = z16;
                    z23 = false;
                }
                aVar7 = aVar6;
                kVarP.L(1715780647);
                qVar2 = qVar5;
                zC = ((1879048192 & i13) != 536870912) | kVarP.c(z23);
                objG = kVarP.g();
                c0321a = j.a.f31715a;
                if (!zC || objG == c0321a) {
                    if (z19) {
                        z24 = z18;
                        objG = null;
                    } else {
                        int[] iArr3 = new int[8];
                        if (z23) {
                            iArr = iArr3;
                            z24 = z18;
                            iArr[1] = (int) 4293947768L;
                            iArr[2] = (int) 4294953835L;
                            iArr[3] = (int) 4291029133L;
                            iArr[4] = (int) 4286482332L;
                            iArr[5] = (int) 4291269354L;
                            iArr[6] = (int) 4294413420L;
                            iArr[7] = (int) 4287225343L;
                        } else {
                            iArr = iArr3;
                            z24 = z18;
                            iArr[1] = (int) 4280452666L;
                            iArr[2] = (int) 4285481665L;
                            iArr[3] = (int) 4278868917L;
                            iArr[4] = (int) 4285166461L;
                            iArr[5] = (int) 4292295241L;
                            int i38 = (int) 4290073098L;
                            iArr[6] = i38;
                            iArr[7] = i38;
                        }
                        objG = iArr;
                    }
                    kVarP.C(objG);
                } else {
                    z24 = z18;
                }
                iArr2 = (int[]) objG;
                kVarP.T(false);
                kVarP.L(1715786465);
                zK = kVarP.K(n1VarK) | ((i13 & 458752) != 131072);
                objG2 = kVarP.g();
                if (!zK || objG2 == c0321a) {
                    objG2 = new eh.l() { // from class: q8.g1
                        @Override // eh.l
                        public final Object invoke(Object obj) {
                            Context context = (Context) obj;
                            kotlin.jvm.internal.r.e(context, "context");
                            x xVar = new x(context);
                            xVar.setOnValue(new fd(n1VarK, 1));
                            final kotlin.jvm.internal.g0 g0Var = new kotlin.jvm.internal.g0();
                            final x.m mVar5 = mVar2;
                            xVar.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: q8.e1
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r4v4, types: [T, x.e, x.k] */
                                @Override // android.view.View.OnFocusChangeListener
                                public final void onFocusChange(View view, boolean z35) {
                                    kotlin.jvm.internal.g0 g0Var2 = g0Var;
                                    x.m mVar6 = mVar5;
                                    if (z35) {
                                        ?? eVar = new x.e();
                                        if (mVar6 != 0) {
                                            mVar6.a(eVar);
                                        }
                                        g0Var2.f16327a = eVar;
                                        return;
                                    }
                                    x.e eVar2 = (x.e) g0Var2.f16327a;
                                    if (eVar2 != null && mVar6 != 0) {
                                        mVar6.a(new x.f(eVar2));
                                    }
                                    g0Var2.f16327a = null;
                                }
                            });
                            return xVar;
                        }
                    };
                    kVarP.C(objG2);
                }
                eh.l lVar = (eh.l) objG2;
                objA = p0.h.a(kVarP, false, 1715805041);
                if (objA == c0321a) {
                    objA = new h1(0);
                    kVarP.C(objA);
                }
                eh.l lVar2 = (eh.l) objA;
                kVarP.T(false);
                kVarP.L(1715807203);
                zK2 = kVarP.K(e2Var) | ((29360128 & i13) != 8388608) | ((234881024 & i13) != 67108864) | ((i30 & V4Signature.MAX_SIGNING_INFOS_SIZE) != 2048) | ((i30 & 57344) != 16384) | ((i30 & 14) != 4) | ((i30 & 896) != 256) | kVarP.c(z23) | kVarP.l(iArr2) | ((i13 & V4Signature.MAX_SIGNING_INFOS_SIZE) != 2048) | ((i13 & 57344) != 16384) | ((i30 & 112) != 32) | ((i13 & 14) != 4) | ((3670016 & i13) != 1048576);
                objG3 = kVarP.g();
                if (!zK2 || objG3 == c0321a) {
                    kVar = kVarP;
                    aVar8 = aVar4;
                    z25 = z21;
                    z26 = z20;
                    aVar9 = aVar5;
                    f12 = f11;
                    aVar10 = aVar7;
                    mVar3 = mVar2;
                    z27 = z17;
                    qVar3 = qVar2;
                    z28 = z24;
                    eh.l lVar3 = new eh.l() { // from class: q8.i1
                        @Override // eh.l
                        public final Object invoke(Object obj) {
                            int iJ;
                            x editor = (x) obj;
                            kotlin.jvm.internal.r.e(editor, "editor");
                            t0.e2 e2Var2 = e2Var;
                            long j10 = e2Var2.f25771q;
                            editor.setTextColor(c2.n0.j(j10));
                            editor.setBackgroundColor(c2.n0.j(e2Var2.f25770p));
                            editor.setGutterColor(c2.n0.j(q1.b1.c(0.35f, e2Var2.f25772r)));
                            editor.setNumberColor(c2.n0.j(q1.b1.c(0.6f, e2Var2.f25773s)));
                            long j11 = e2Var2.f25751a;
                            editor.setSelectionColor(c2.n0.j(q1.b1.c(0.25f, j11)));
                            editor.setCaretColor(c2.n0.j(j11));
                            editor.setOnUndoRequest(aVar10);
                            editor.setOnRedoRequest(aVar8);
                            editor.setOnSaveRequest(aVar9);
                            editor.setOnCaretInfo(qVar3);
                            editor.setSmartTyping(z26);
                            boolean z35 = z25;
                            if (z35) {
                                iJ = c2.n0.j(q1.b1.c(z23 ? 0.06f : 0.045f, j10));
                            } else {
                                iJ = 0;
                            }
                            editor.setCurrentLineColor(iJ);
                            editor.setCurrentNumberColor(z35 ? c2.n0.j(j11) : 0);
                            editor.setSyntaxColors(iArr2);
                            boolean z36 = editor.f22480z;
                            boolean z37 = z22;
                            boolean z38 = z27;
                            float f13 = f12;
                            if (z36 != z37 || editor.A != z38 || editor.f22472q != f13) {
                                editor.f22480z = z37;
                                editor.A = z38;
                                if (editor.f22472q != f13) {
                                    editor.f22472q = f13;
                                    editor.f22476v.setTextSize(f13 * editor.getResources().getDisplayMetrics().scaledDensity);
                                    editor.f22465l0.clear();
                                }
                                editor.q();
                            }
                            editor.c(value, z28);
                            return pg.f0.f21461a;
                        }
                    };
                    kVar.C(lVar3);
                    objG3 = lVar3;
                } else {
                    qVar3 = qVar2;
                    kVar = kVarP;
                    aVar8 = aVar4;
                    z25 = z21;
                    z26 = z20;
                    aVar9 = aVar5;
                    f12 = f11;
                    aVar10 = aVar7;
                    mVar3 = mVar2;
                    z27 = z17;
                    z28 = z24;
                }
                kVar.T(false);
                x0.k kVar3 = kVar;
                androidx.compose.ui.viewinterop.a.a(lVar, dVar, lVar2, (eh.l) objG3, kVar3, (i37 & 112) | 3072, 4);
                kVar2 = kVar3;
                aVar11 = aVar10;
                aVar12 = aVar8;
                qVar4 = qVar3;
                z29 = z25;
                z30 = z27;
                z31 = z28;
                aVar13 = aVar9;
                z32 = z26;
                z33 = z22;
                mVar4 = mVar3;
                z34 = z19;
            }
            h2VarV = kVar2.V();
            if (h2VarV == null) {
                h2VarV.f31703d = new eh.p() { // from class: q8.j1
                    @Override // eh.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iN = f3.i.n(i10 | 1);
                        int iN2 = f3.i.n(i11);
                        k1.a(value, onValueChange, dVar, z33, z30, mVar4, z31, aVar11, aVar12, z34, z32, f12, z29, aVar13, qVar4, (x0.j) obj, iN, iN2, i12);
                        return pg.f0.f21461a;
                    }
                };
                return;
            }
            return;
        }
        i13 |= 24576;
        z17 = z11;
        i14 = i12 & 32;
        if (i14 == 0) {
        }
        i15 = i12 & 64;
        if (i15 == 0) {
        }
        i16 = i12 & 128;
        if (i16 == 0) {
        }
        i17 = i12 & 256;
        if (i17 == 0) {
        }
        i18 = i12 & 512;
        if (i18 == 0) {
        }
        i19 = i12 & 1024;
        if (i19 == 0) {
        }
        i22 = i12 & 2048;
        if (i22 == 0) {
        }
        int i342 = i24;
        i25 = i12 & 4096;
        if (i25 == 0) {
        }
        i27 = i12 & 8192;
        if (i27 == 0) {
        }
        i29 = i12 & 16384;
        if (i29 == 0) {
        }
        if ((i13 & 306783379) != 306783378) {
            if (i32 != 0) {
            }
            if (i33 != 0) {
            }
            if (i14 != 0) {
            }
            if (i15 != 0) {
            }
            if (i16 == 0) {
            }
            if (i17 == 0) {
            }
            if (i18 == 0) {
            }
            if (i20 == 0) {
            }
            if (i23 == 0) {
            }
            if (i25 == 0) {
            }
            if (i27 == 0) {
            }
            if (i29 == 0) {
            }
            int i372 = i13 >> 3;
            n1VarK = bg.b.k(onValueChange, kVarP);
            e2Var = (t0.e2) kVarP.f(t0.f2.f25858a);
            if (c2.n0.h(e2Var.f25770p) >= 0.5f) {
            }
            aVar7 = aVar6;
            kVarP.L(1715780647);
            qVar2 = qVar5;
            zC = ((1879048192 & i13) != 536870912) | kVarP.c(z23);
            objG = kVarP.g();
            c0321a = j.a.f31715a;
            if (zC) {
                if (z19) {
                }
                kVarP.C(objG);
                iArr2 = (int[]) objG;
                kVarP.T(false);
                kVarP.L(1715786465);
                zK = kVarP.K(n1VarK) | ((i13 & 458752) != 131072);
                objG2 = kVarP.g();
                if (!zK) {
                    objG2 = new eh.l() { // from class: q8.g1
                        @Override // eh.l
                        public final Object invoke(Object obj) {
                            Context context = (Context) obj;
                            kotlin.jvm.internal.r.e(context, "context");
                            x xVar = new x(context);
                            xVar.setOnValue(new fd(n1VarK, 1));
                            final kotlin.jvm.internal.g0 g0Var = new kotlin.jvm.internal.g0();
                            final x.m mVar5 = mVar2;
                            xVar.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: q8.e1
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r4v4, types: [T, x.e, x.k] */
                                @Override // android.view.View.OnFocusChangeListener
                                public final void onFocusChange(View view, boolean z35) {
                                    kotlin.jvm.internal.g0 g0Var2 = g0Var;
                                    x.m mVar6 = mVar5;
                                    if (z35) {
                                        ?? eVar = new x.e();
                                        if (mVar6 != 0) {
                                            mVar6.a(eVar);
                                        }
                                        g0Var2.f16327a = eVar;
                                        return;
                                    }
                                    x.e eVar2 = (x.e) g0Var2.f16327a;
                                    if (eVar2 != null && mVar6 != 0) {
                                        mVar6.a(new x.f(eVar2));
                                    }
                                    g0Var2.f16327a = null;
                                }
                            });
                            return xVar;
                        }
                    };
                    kVarP.C(objG2);
                    eh.l lVar4 = (eh.l) objG2;
                    objA = p0.h.a(kVarP, false, 1715805041);
                    if (objA == c0321a) {
                    }
                    eh.l lVar22 = (eh.l) objA;
                    kVarP.T(false);
                    kVarP.L(1715807203);
                    zK2 = kVarP.K(e2Var) | ((29360128 & i13) != 8388608) | ((234881024 & i13) != 67108864) | ((i30 & V4Signature.MAX_SIGNING_INFOS_SIZE) != 2048) | ((i30 & 57344) != 16384) | ((i30 & 14) != 4) | ((i30 & 896) != 256) | kVarP.c(z23) | kVarP.l(iArr2) | ((i13 & V4Signature.MAX_SIGNING_INFOS_SIZE) != 2048) | ((i13 & 57344) != 16384) | ((i30 & 112) != 32) | ((i13 & 14) != 4) | ((3670016 & i13) != 1048576);
                    objG3 = kVarP.g();
                    if (zK2) {
                        kVar = kVarP;
                        aVar8 = aVar4;
                        z25 = z21;
                        z26 = z20;
                        aVar9 = aVar5;
                        f12 = f11;
                        aVar10 = aVar7;
                        mVar3 = mVar2;
                        z27 = z17;
                        qVar3 = qVar2;
                        z28 = z24;
                        eh.l lVar32 = new eh.l() { // from class: q8.i1
                            @Override // eh.l
                            public final Object invoke(Object obj) {
                                int iJ;
                                x editor = (x) obj;
                                kotlin.jvm.internal.r.e(editor, "editor");
                                t0.e2 e2Var2 = e2Var;
                                long j10 = e2Var2.f25771q;
                                editor.setTextColor(c2.n0.j(j10));
                                editor.setBackgroundColor(c2.n0.j(e2Var2.f25770p));
                                editor.setGutterColor(c2.n0.j(q1.b1.c(0.35f, e2Var2.f25772r)));
                                editor.setNumberColor(c2.n0.j(q1.b1.c(0.6f, e2Var2.f25773s)));
                                long j11 = e2Var2.f25751a;
                                editor.setSelectionColor(c2.n0.j(q1.b1.c(0.25f, j11)));
                                editor.setCaretColor(c2.n0.j(j11));
                                editor.setOnUndoRequest(aVar10);
                                editor.setOnRedoRequest(aVar8);
                                editor.setOnSaveRequest(aVar9);
                                editor.setOnCaretInfo(qVar3);
                                editor.setSmartTyping(z26);
                                boolean z35 = z25;
                                if (z35) {
                                    iJ = c2.n0.j(q1.b1.c(z23 ? 0.06f : 0.045f, j10));
                                } else {
                                    iJ = 0;
                                }
                                editor.setCurrentLineColor(iJ);
                                editor.setCurrentNumberColor(z35 ? c2.n0.j(j11) : 0);
                                editor.setSyntaxColors(iArr2);
                                boolean z36 = editor.f22480z;
                                boolean z37 = z22;
                                boolean z38 = z27;
                                float f13 = f12;
                                if (z36 != z37 || editor.A != z38 || editor.f22472q != f13) {
                                    editor.f22480z = z37;
                                    editor.A = z38;
                                    if (editor.f22472q != f13) {
                                        editor.f22472q = f13;
                                        editor.f22476v.setTextSize(f13 * editor.getResources().getDisplayMetrics().scaledDensity);
                                        editor.f22465l0.clear();
                                    }
                                    editor.q();
                                }
                                editor.c(value, z28);
                                return pg.f0.f21461a;
                            }
                        };
                        kVar.C(lVar32);
                        objG3 = lVar32;
                        kVar.T(false);
                        x0.k kVar32 = kVar;
                        androidx.compose.ui.viewinterop.a.a(lVar4, dVar, lVar22, (eh.l) objG3, kVar32, (i372 & 112) | 3072, 4);
                        kVar2 = kVar32;
                        aVar11 = aVar10;
                        aVar12 = aVar8;
                        qVar4 = qVar3;
                        z29 = z25;
                        z30 = z27;
                        z31 = z28;
                        aVar13 = aVar9;
                        z32 = z26;
                        z33 = z22;
                        mVar4 = mVar3;
                        z34 = z19;
                    }
                }
            }
        }
        h2VarV = kVar2.V();
        if (h2VarV == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final String value, final eh.l<? super String, pg.f0> onValueChange, final androidx.compose.ui.d dVar, eh.p<? super x0.j, ? super Integer, pg.f0> pVar, eh.p<? super x0.j, ? super Integer, pg.f0> pVar2, eh.p<? super x0.j, ? super Integer, pg.f0> pVar3, x0.j jVar, final int i10, final int i11) {
        eh.p<? super x0.j, ? super Integer, pg.f0> pVar4;
        int i12;
        eh.p<? super x0.j, ? super Integer, pg.f0> pVar5;
        int i13;
        eh.p<? super x0.j, ? super Integer, pg.f0> pVar6;
        Object objG;
        j.a.C0321a c0321a;
        int i14;
        boolean z10;
        Object objG2;
        int i15;
        int i16;
        g.a.C0128a c0128a;
        x0.k kVar;
        final eh.p<? super x0.j, ? super Integer, pg.f0> pVar7;
        final eh.p<? super x0.j, ? super Integer, pg.f0> pVar8;
        x0.h2 h2VarV;
        kotlin.jvm.internal.r.e(value, "value");
        kotlin.jvm.internal.r.e(onValueChange, "onValueChange");
        x0.k kVarP = jVar.p(-1621094704);
        int i17 = (kVarP.K(value) ? 4 : 2) | i10 | (kVarP.l(onValueChange) ? 32 : 16);
        int i18 = i11 & 8;
        if (i18 != 0) {
            i17 |= 3072;
        } else {
            if ((i10 & 3072) == 0) {
                pVar4 = pVar;
                i17 |= kVarP.l(pVar4) ? 2048 : 1024;
            }
            i12 = i11 & 16;
            if (i12 == 0) {
                i17 |= 24576;
            } else {
                if ((i10 & 24576) == 0) {
                    pVar5 = pVar2;
                    i17 |= kVarP.l(pVar5) ? 16384 : 8192;
                }
                i13 = i11 & 32;
                if (i13 == 0) {
                    if ((196608 & i10) == 0) {
                        pVar6 = pVar3;
                        i17 |= kVarP.l(pVar6) ? 131072 : 65536;
                    }
                    if ((74899 & i17) == 74898 || !kVarP.s()) {
                        if (i18 != 0) {
                            pVar4 = null;
                        }
                        if (i12 != 0) {
                            pVar5 = null;
                        }
                        eh.p<? super x0.j, ? super Integer, pg.f0> pVar9 = i13 == 0 ? null : pVar6;
                        kVarP.L(-133768910);
                        objG = kVarP.g();
                        c0321a = j.a.f31715a;
                        if (objG == c0321a) {
                            objG = new x.n();
                            kVarP.C(objG);
                        }
                        x.m mVar = (x.m) objG;
                        kVarP.T(false);
                        kVarP.L(-133763948);
                        i14 = i17 & 14;
                        z10 = i14 != 4;
                        objG2 = kVarP.g();
                        if (!z10 || objG2 == c0321a) {
                            i15 = i14;
                            objG2 = new y2.c0(value, 0L, 6);
                            kVarP.C(objG2);
                        } else {
                            i15 = i14;
                        }
                        y2.c0 c0Var = (y2.c0) objG2;
                        kVarP.T(false);
                        int i19 = i17 >> 6;
                        g2.l0 l0VarD = z.g.d(d.a.f14602a, true);
                        i16 = kVarP.P;
                        x0.a2 a2VarP = kVarP.P();
                        androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVar, kVarP);
                        i2.g.f13861o.getClass();
                        e0.a aVar = g.a.f13863b;
                        kVarP.r();
                        int i20 = i17;
                        if (kVarP.O) {
                            kVarP.z();
                        } else {
                            kVarP.w(aVar);
                        }
                        ph.v1.j(g.a.f13867f, l0VarD, kVarP);
                        ph.v1.j(g.a.f13866e, a2VarP, kVarP);
                        c0128a = g.a.f13868g;
                        if (!kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i16))) {
                            org.bouncycastle.jcajce.provider.digest.e.a(i16, kVarP, i16, c0128a);
                        }
                        ph.v1.j(g.a.f13865d, dVarC, kVarP);
                        int i21 = i20 << 12;
                        eh.p<? super x0.j, ? super Integer, pg.f0> pVar10 = pVar4;
                        k9.f26240a.b(value, f1.c.b(-241922811, new a(c0Var, value, onValueChange, mVar), kVarP), true, false, q0.a.f33765a, mVar, false, pVar10, pVar5, null, null, null, null, pVar9, null, null, null, kVarP, i15 | 224688 | (29360128 & i21) | (i21 & 234881024), (i19 & V4Signature.MAX_SIGNING_INFOS_SIZE) | 12582912, 122432);
                        kVar = kVarP;
                        kVar.T(true);
                        pVar7 = pVar10;
                        pVar8 = pVar9;
                    } else {
                        kVarP.v();
                        kVar = kVarP;
                        pVar7 = pVar4;
                        pVar8 = pVar6;
                    }
                    final eh.p<? super x0.j, ? super Integer, pg.f0> pVar11 = pVar5;
                    h2VarV = kVar.V();
                    if (h2VarV == null) {
                        h2VarV.f31703d = new eh.p() { // from class: q8.f1
                            @Override // eh.p
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                k1.b(value, onValueChange, dVar, pVar7, pVar11, pVar8, (x0.j) obj, f3.i.n(i10 | 1), i11);
                                return pg.f0.f21461a;
                            }
                        };
                        return;
                    }
                    return;
                }
                i17 |= 196608;
                pVar6 = pVar3;
                if ((74899 & i17) == 74898) {
                    if (i18 != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (i13 == 0) {
                    }
                    kVarP.L(-133768910);
                    objG = kVarP.g();
                    c0321a = j.a.f31715a;
                    if (objG == c0321a) {
                    }
                    x.m mVar2 = (x.m) objG;
                    kVarP.T(false);
                    kVarP.L(-133763948);
                    i14 = i17 & 14;
                    if (i14 != 4) {
                    }
                    objG2 = kVarP.g();
                    if (z10) {
                        i15 = i14;
                        objG2 = new y2.c0(value, 0L, 6);
                        kVarP.C(objG2);
                        y2.c0 c0Var2 = (y2.c0) objG2;
                        kVarP.T(false);
                        int i192 = i17 >> 6;
                        g2.l0 l0VarD2 = z.g.d(d.a.f14602a, true);
                        i16 = kVarP.P;
                        x0.a2 a2VarP2 = kVarP.P();
                        androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVar, kVarP);
                        i2.g.f13861o.getClass();
                        e0.a aVar2 = g.a.f13863b;
                        kVarP.r();
                        int i202 = i17;
                        if (kVarP.O) {
                        }
                        ph.v1.j(g.a.f13867f, l0VarD2, kVarP);
                        ph.v1.j(g.a.f13866e, a2VarP2, kVarP);
                        c0128a = g.a.f13868g;
                        if (!kVarP.O) {
                            org.bouncycastle.jcajce.provider.digest.e.a(i16, kVarP, i16, c0128a);
                            ph.v1.j(g.a.f13865d, dVarC2, kVarP);
                            int i212 = i202 << 12;
                            eh.p<? super x0.j, ? super Integer, pg.f0> pVar102 = pVar4;
                            k9.f26240a.b(value, f1.c.b(-241922811, new a(c0Var2, value, onValueChange, mVar2), kVarP), true, false, q0.a.f33765a, mVar2, false, pVar102, pVar5, null, null, null, null, pVar9, null, null, null, kVarP, i15 | 224688 | (29360128 & i212) | (i212 & 234881024), (i192 & V4Signature.MAX_SIGNING_INFOS_SIZE) | 12582912, 122432);
                            kVar = kVarP;
                            kVar.T(true);
                            pVar7 = pVar102;
                            pVar8 = pVar9;
                        }
                    }
                }
                final eh.p pVar112 = pVar5;
                h2VarV = kVar.V();
                if (h2VarV == null) {
                }
            }
            pVar5 = pVar2;
            i13 = i11 & 32;
            if (i13 == 0) {
            }
            pVar6 = pVar3;
            if ((74899 & i17) == 74898) {
            }
            final eh.p pVar1122 = pVar5;
            h2VarV = kVar.V();
            if (h2VarV == null) {
            }
        }
        pVar4 = pVar;
        i12 = i11 & 16;
        if (i12 == 0) {
        }
        pVar5 = pVar2;
        i13 = i11 & 32;
        if (i13 == 0) {
        }
        pVar6 = pVar3;
        if ((74899 & i17) == 74898) {
        }
        final eh.p pVar11222 = pVar5;
        h2VarV = kVar.V();
        if (h2VarV == null) {
        }
    }
}
