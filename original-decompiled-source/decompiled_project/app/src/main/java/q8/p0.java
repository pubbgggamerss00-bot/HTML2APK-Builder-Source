package q8;

import android.os.SystemClock;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.d;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.yalantis.ucrop.view.CropImageView;
import f9.xc;
import i2.e0;
import i2.g;
import j1.d;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumEngine;
import s.y1;
import t0.ff;
import t0.nf;
import t0.of;
import t0.z9;
import x0.j;
import x0.r3;
import x0.s3;

/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public static final x0.m0 f22355a = new x0.m0(new j0());

    public static final class a implements PointerInputEventHandler {

        /* renamed from: a, reason: collision with root package name */
        public static final a f22356a = new a();

        @vg.e(c = "com.basitce.htmltoapk.ui.components.ContainerTransitionKt$ContainerTransitionOverlay$2$1$1", f = "ContainerTransition.kt", l = {249}, m = "invokeSuspend")
        /* renamed from: q8.p0$a$a, reason: collision with other inner class name */
        public static final class C0249a extends vg.h implements eh.p<c2.c, tg.e<? super pg.f0>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f22357a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f22358b;

            @Override // vg.a
            public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
                C0249a c0249a = new C0249a(2, eVar);
                c0249a.f22358b = obj;
                return c0249a;
            }

            @Override // eh.p
            public final Object invoke(c2.c cVar, tg.e<? super pg.f0> eVar) {
                ((C0249a) create(cVar, eVar)).invokeSuspend(pg.f0.f21461a);
                return ug.a.f29706a;
            }

            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            /* JADX WARN: Removed duplicated region for block: B:11:0x002d A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:15:0x003c A[LOOP:0: B:13:0x0036->B:15:0x003c, LOOP_END] */
            /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Iterable, java.lang.Object] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:12:0x002e). Please report as a decompilation issue!!! */
            @Override // vg.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    ug.a r0 = ug.a.f29706a
                    int r1 = r4.f22357a
                    r2 = 1
                    if (r1 == 0) goto L19
                    if (r1 != r2) goto L11
                    java.lang.Object r1 = r4.f22358b
                    c2.c r1 = (c2.c) r1
                    pg.q.b(r5)
                    goto L2e
                L11:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L19:
                    pg.q.b(r5)
                    java.lang.Object r5 = r4.f22358b
                    c2.c r5 = (c2.c) r5
                    r1 = r5
                L21:
                    r4.f22358b = r1
                    r4.f22357a = r2
                    c2.t r5 = c2.t.f4695b
                    java.lang.Object r5 = r1.C1(r5, r4)
                    if (r5 != r0) goto L2e
                    return r0
                L2e:
                    c2.r r5 = (c2.r) r5
                    java.lang.Object r5 = r5.f4687a
                    java.util.Iterator r5 = r5.iterator()
                L36:
                    boolean r3 = r5.hasNext()
                    if (r3 == 0) goto L21
                    java.lang.Object r3 = r5.next()
                    c2.b0 r3 = (c2.b0) r3
                    r3.a()
                    goto L36
                */
                throw new UnsupportedOperationException("Method not decompiled: q8.p0.a.C0249a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(c2.j0 j0Var, tg.e<? super pg.f0> eVar) {
            Object objU0 = j0Var.U0(new C0249a(2, null), eVar);
            return objU0 == ug.a.f29706a ? objU0 : pg.f0.f21461a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0281 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final r.h0 h0Var, final f1.b bVar, x0.j jVar, final int i10) {
        int i11;
        final f0 f0Var;
        float f10;
        float f11;
        int i12;
        s.y1<r.u0> y1Var;
        s.m2 m2VarD;
        float f12;
        final y1.d dVarC;
        final long j10;
        Object objG;
        final e0 e0Var;
        boolean zK;
        Object objG2;
        boolean zK2;
        Object objG3;
        final f0 f0Var2;
        int i13;
        g.a.C0128a c0128a;
        boolean zK3;
        Object objG4;
        int i14;
        boolean z10;
        kotlin.jvm.internal.r.e(h0Var, "<this>");
        x0.k kVarP = jVar.p(485484968);
        if ((i10 & 6) == 0) {
            i11 = i10 | (kVarP.l(h0Var) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= kVarP.l(bVar) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && kVarP.s()) {
            kVarP.v();
        } else {
            w0 w0Var = (w0) kVarP.f(f22355a);
            kVarP.L(1607988568);
            Object objF = kVarP.f(h5.k.f12264a);
            p5.s sVar = objF instanceof p5.s ? (p5.s) objF : null;
            String str = sVar != null ? sVar.f21273f : null;
            kVarP.B();
            kVarP.L(-241124966);
            Object objG5 = kVarP.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (objG5 == c0321a) {
                if (w0Var == null || str == null) {
                    z10 = false;
                    objG5 = Boolean.valueOf(z10);
                    kVarP.C(objG5);
                } else {
                    f0 f0Var3 = w0Var.f22435h;
                    if (f0Var3 == null) {
                        f0Var3 = null;
                        if (f0Var3 == null) {
                            z10 = true;
                        }
                        objG5 = Boolean.valueOf(z10);
                        kVarP.C(objG5);
                    } else {
                        w0Var.f22435h = null;
                        if (SystemClock.uptimeMillis() - w0Var.f22436i < 1000 && !kotlin.jvm.internal.r.a(f0Var3.f22197a, str)) {
                            w0Var.f22437j.put(str, f0Var3);
                        }
                        if (f0Var3 == null) {
                        }
                        objG5 = Boolean.valueOf(z10);
                        kVarP.C(objG5);
                    }
                }
            }
            boolean zBooleanValue = ((Boolean) objG5).booleanValue();
            kVarP.T(false);
            kVarP.L(-241121516);
            if (w0Var == null || str == null) {
                f0Var = null;
            } else {
                kVarP.L(-241120348);
                Object objG6 = kVarP.g();
                if (objG6 == c0321a) {
                    objG6 = (f0) w0Var.f22437j.get(str);
                    kVarP.C(objG6);
                }
                kVarP.T(false);
                f0Var = (f0) objG6;
            }
            kVarP.T(false);
            kVarP.L(-241118656);
            if (w0Var == null || str == null || f0Var == null) {
                bVar.invoke(kVarP, Integer.valueOf((i11 >> 3) & 14));
                kVarP.T(false);
                x0.h2 h2VarV = kVarP.V();
                if (h2VarV != null) {
                    h2VarV.f31703d = new eh.p() { // from class: q8.k0
                        @Override // eh.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iN = f3.i.n(i10 | 1);
                            p0.a(h0Var, bVar, (x0.j) obj, iN);
                            return pg.f0.f21461a;
                        }
                    };
                    return;
                }
                return;
            }
            kVarP.T(false);
            boolean zA = kotlin.jvm.internal.r.a((String) w0Var.f22438k.getValue(), str);
            s.y1<r.u0> y1VarA = h0Var.a();
            s.o2 o2Var = s.p2.f23868a;
            r.u0 u0Var = (r.u0) y1VarA.f24001a.V();
            kVarP.L(-457179201);
            int iOrdinal = u0Var.ordinal();
            float f13 = 1.0f;
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        throw new pg.l();
                    }
                    if (zA) {
                        f10 = 0.0f;
                    }
                }
                f10 = 1.0f;
            } else if (!zBooleanValue) {
                f10 = 1.0f;
            }
            kVarP.T(false);
            Float fValueOf = Float.valueOf(f10);
            r.u0 u0Var2 = (r.u0) y1VarA.f24004d.getValue();
            kVarP.L(-457179201);
            int iOrdinal2 = u0Var2.ordinal();
            if (iOrdinal2 != 0) {
                if (iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        throw new pg.l();
                    }
                    if (zA) {
                        f11 = 0.0f;
                    }
                }
                f11 = 1.0f;
            } else if (!zBooleanValue) {
                f11 = 1.0f;
            }
            kVarP.T(false);
            Float fValueOf2 = Float.valueOf(f11);
            y1.b<r.u0> animateFloat = y1VarA.f();
            kotlin.jvm.internal.r.e(animateFloat, "$this$animateFloat");
            kVarP.L(1065946385);
            r.u0 u0VarE = animateFloat.e();
            r.u0 u0Var3 = r.u0.f22956b;
            if (u0VarE == u0Var3) {
                i12 = i11;
                y1Var = y1VarA;
                m2VarD = s.m.d(400, 0, s.d0.f23703a, 2);
            } else {
                i12 = i11;
                y1Var = y1VarA;
                m2VarD = s.m.d(340, 0, s.d0.f23703a, 2);
            }
            kVarP.T(false);
            final y1.d dVarC2 = s.c2.c(y1Var, fValueOf, fValueOf2, m2VarD, o2Var, kVarP, 196608);
            s.y1<r.u0> y1VarA2 = h0Var.a();
            r.u0 u0Var4 = (r.u0) y1VarA2.f24001a.V();
            kVarP.L(1946952233);
            int iOrdinal3 = u0Var4.ordinal();
            if (iOrdinal3 != 0) {
                if (iOrdinal3 != 1) {
                    if (iOrdinal3 != 2) {
                        throw new pg.l();
                    }
                    if (zA) {
                        f12 = 1.0f;
                    }
                }
                f12 = 0.0f;
            } else if (!zBooleanValue) {
                f12 = 0.0f;
            }
            kVarP.T(false);
            Float fValueOf3 = Float.valueOf(f12);
            r.u0 u0Var5 = (r.u0) y1VarA2.f24004d.getValue();
            kVarP.L(1946952233);
            int iOrdinal4 = u0Var5.ordinal();
            if (iOrdinal4 == 0) {
                if (!zBooleanValue) {
                }
                kVarP.T(false);
                Float fValueOf4 = Float.valueOf(f13);
                y1.b<r.u0> animateFloat2 = y1VarA2.f();
                kotlin.jvm.internal.r.e(animateFloat2, "$this$animateFloat");
                kVarP.L(637839483);
                if (animateFloat2.e() == u0Var3) {
                }
                kVarP.T(false);
                dVarC = s.c2.c(y1VarA2, fValueOf3, fValueOf4, e0VarD, o2Var, kVarP, 196608);
                j10 = ((t0.e2) kVarP.f(t0.f2.f25858a)).f25768n;
                kVarP.L(-241072898);
                objG = kVarP.g();
                if (objG == c0321a) {
                }
                e0Var = (e0) objG;
                kVarP.T(false);
                FillElement fillElement = androidx.compose.foundation.layout.g.f976c;
                androidx.compose.ui.d dVarC3 = c(fillElement, e0Var);
                kVarP.L(-241067731);
                zK = kVarP.K(dVarC2) | kVarP.l(e0Var) | kVarP.K(f0Var);
                objG2 = kVarP.g();
                if (zK) {
                }
            } else if (iOrdinal4 == 1) {
                f13 = 0.0f;
                kVarP.T(false);
                Float fValueOf42 = Float.valueOf(f13);
                y1.b<r.u0> animateFloat22 = y1VarA2.f();
                kotlin.jvm.internal.r.e(animateFloat22, "$this$animateFloat");
                kVarP.L(637839483);
                s.e0 e0VarD = animateFloat22.e() == u0Var3 ? s.m.d(80, DilithiumEngine.DilithiumPolyT1PackedBytes, null, 4) : new s.j1(0);
                kVarP.T(false);
                dVarC = s.c2.c(y1VarA2, fValueOf3, fValueOf42, e0VarD, o2Var, kVarP, 196608);
                j10 = ((t0.e2) kVarP.f(t0.f2.f25858a)).f25768n;
                kVarP.L(-241072898);
                objG = kVarP.g();
                if (objG == c0321a) {
                    objG = new e0();
                    kVarP.C(objG);
                }
                e0Var = (e0) objG;
                kVarP.T(false);
                FillElement fillElement2 = androidx.compose.foundation.layout.g.f976c;
                androidx.compose.ui.d dVarC32 = c(fillElement2, e0Var);
                kVarP.L(-241067731);
                zK = kVarP.K(dVarC2) | kVarP.l(e0Var) | kVarP.K(f0Var);
                objG2 = kVarP.g();
                if (zK || objG2 == c0321a) {
                    objG2 = new eh.l() { // from class: q8.l0
                        /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
                        @Override // eh.l
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object invoke(Object obj) {
                            long jY;
                            q1.l1 graphicsLayer = (q1.l1) obj;
                            kotlin.jvm.internal.r.e(graphicsLayer, "$this$graphicsLayer");
                            float fFloatValue = ((Number) dVarC2.getValue()).floatValue();
                            if (fFloatValue >= 1.0f) {
                                graphicsLayer.C(false);
                                graphicsLayer.p1(q1.y1.f21750a);
                            } else {
                                g2.v vVar = e0Var.f22177a;
                                if (vVar == null) {
                                    jY = 0;
                                    f0 f0Var4 = f0Var;
                                    graphicsLayer.p1(new y1(p1.f.b(f0Var4.f22198b.j(jY ^ (-9223372034707292160L)), p1.f.a(0L, graphicsLayer.i()), fFloatValue), h3.b.b(f0Var4.f22200d, CropImageView.DEFAULT_ASPECT_RATIO, fFloatValue)));
                                    graphicsLayer.C(true);
                                } else {
                                    if (!vVar.m()) {
                                        vVar = null;
                                    }
                                    if (vVar != null) {
                                        jY = vVar.Y(0L);
                                    }
                                    f0 f0Var42 = f0Var;
                                    graphicsLayer.p1(new y1(p1.f.b(f0Var42.f22198b.j(jY ^ (-9223372034707292160L)), p1.f.a(0L, graphicsLayer.i()), fFloatValue), h3.b.b(f0Var42.f22200d, CropImageView.DEFAULT_ASPECT_RATIO, fFloatValue)));
                                    graphicsLayer.C(true);
                                }
                            }
                            return pg.f0.f21461a;
                        }
                    };
                    kVarP.C(objG2);
                }
                kVarP.T(false);
                androidx.compose.ui.d dVarA = androidx.compose.ui.graphics.a.a(dVarC32, (eh.l) objG2);
                kVarP.L(-241050299);
                zK2 = kVarP.K(dVarC) | kVarP.K(dVarC2) | kVarP.K(f0Var) | kVarP.j(j10);
                objG3 = kVarP.g();
                if (!zK2 || objG3 == c0321a) {
                    final f0 f0Var4 = f0Var;
                    objG3 = new eh.l() { // from class: q8.m0
                        @Override // eh.l
                        public final Object invoke(Object obj) {
                            s1.e drawBehind = (s1.e) obj;
                            kotlin.jvm.internal.r.e(drawBehind, "$this$drawBehind");
                            float fFloatValue = ((Number) dVarC.getValue()).floatValue();
                            if (fFloatValue <= CropImageView.DEFAULT_ASPECT_RATIO) {
                                return pg.f0.f21461a;
                            }
                            s1.e.X0(drawBehind, c2.n0.g(f0Var4.f22199c, j10, jh.j.l(((Number) dVarC2.getValue()).floatValue() / 0.5f, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f)), 0L, 0L, fFloatValue, null, 118);
                            return pg.f0.f21461a;
                        }
                    };
                    f0Var2 = f0Var4;
                    kVarP.C(objG3);
                } else {
                    f0Var2 = f0Var;
                }
                kVarP.T(false);
                androidx.compose.ui.d dVarA2 = androidx.compose.ui.draw.a.a(dVarA, (eh.l) objG3);
                j1.f fVar = d.a.f14602a;
                g2.l0 l0VarD = z.g.d(fVar, false);
                i13 = kVarP.P;
                x0.a2 a2VarP = kVarP.P();
                androidx.compose.ui.d dVarC4 = androidx.compose.ui.c.c(dVarA2, kVarP);
                i2.g.f13861o.getClass();
                e0.a aVar = g.a.f13863b;
                kVarP.r();
                if (kVarP.O) {
                    kVarP.z();
                } else {
                    kVarP.w(aVar);
                }
                g.a.b bVar2 = g.a.f13867f;
                ph.v1.j(bVar2, l0VarD, kVarP);
                g.a.d dVar = g.a.f13866e;
                ph.v1.j(dVar, a2VarP, kVarP);
                c0128a = g.a.f13868g;
                if (!kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i13))) {
                    org.bouncycastle.jcajce.provider.digest.e.a(i13, kVarP, i13, c0128a);
                }
                g.a.c cVar = g.a.f13865d;
                ph.v1.j(cVar, dVarC4, kVarP);
                kVarP.L(-226784374);
                zK3 = kVarP.K(dVarC2) | kVarP.l(e0Var) | kVarP.K(f0Var2);
                objG4 = kVarP.g();
                if (!zK3 || objG4 == c0321a) {
                    objG4 = new eh.l() { // from class: q8.n0
                        /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
                        /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
                        /* JADX WARN: Removed duplicated region for block: B:17:0x007f  */
                        @Override // eh.l
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object invoke(Object obj) {
                            long jY;
                            q1.l1 graphicsLayer = (q1.l1) obj;
                            kotlin.jvm.internal.r.e(graphicsLayer, "$this$graphicsLayer");
                            float fFloatValue = ((Number) dVarC2.getValue()).floatValue();
                            if (fFloatValue >= 1.0f) {
                                graphicsLayer.h(1.0f);
                                graphicsLayer.d(1.0f);
                                graphicsLayer.j(CropImageView.DEFAULT_ASPECT_RATIO);
                                graphicsLayer.c(CropImageView.DEFAULT_ASPECT_RATIO);
                                graphicsLayer.f(1.0f);
                            } else {
                                g2.v vVar = e0Var.f22177a;
                                if (vVar == null) {
                                    jY = 0;
                                    p1.e eVarB = p1.f.b(f0Var2.f22198b.j(jY ^ (-9223372034707292160L)), p1.f.a(0L, graphicsLayer.i()), fFloatValue);
                                    float f14 = eVarB.f21131a;
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (graphicsLayer.i() >> 32)) <= CropImageView.DEFAULT_ASPECT_RATIO ? (eVarB.f21133c - f14) / Float.intBitsToFloat((int) (graphicsLayer.i() >> 32)) : 1.0f;
                                    graphicsLayer.c1(b3.e.a(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO));
                                    graphicsLayer.h(fIntBitsToFloat);
                                    graphicsLayer.d(fIntBitsToFloat);
                                    graphicsLayer.j(f14);
                                    graphicsLayer.c(eVarB.f21132b);
                                    graphicsLayer.f(jh.j.l(fFloatValue / 0.3f, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f));
                                } else {
                                    if (!vVar.m()) {
                                        vVar = null;
                                    }
                                    if (vVar != null) {
                                        jY = vVar.Y(0L);
                                    }
                                    p1.e eVarB2 = p1.f.b(f0Var2.f22198b.j(jY ^ (-9223372034707292160L)), p1.f.a(0L, graphicsLayer.i()), fFloatValue);
                                    float f142 = eVarB2.f21131a;
                                    if (Float.intBitsToFloat((int) (graphicsLayer.i() >> 32)) <= CropImageView.DEFAULT_ASPECT_RATIO) {
                                    }
                                    graphicsLayer.c1(b3.e.a(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO));
                                    graphicsLayer.h(fIntBitsToFloat);
                                    graphicsLayer.d(fIntBitsToFloat);
                                    graphicsLayer.j(f142);
                                    graphicsLayer.c(eVarB2.f21132b);
                                    graphicsLayer.f(jh.j.l(fFloatValue / 0.3f, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f));
                                }
                            }
                            return pg.f0.f21461a;
                        }
                    };
                    kVarP.C(objG4);
                }
                kVarP.T(false);
                androidx.compose.ui.d dVarA3 = androidx.compose.ui.graphics.a.a(fillElement2, (eh.l) objG4);
                g2.l0 l0VarD2 = z.g.d(fVar, false);
                i14 = kVarP.P;
                x0.a2 a2VarP2 = kVarP.P();
                androidx.compose.ui.d dVarC5 = androidx.compose.ui.c.c(dVarA3, kVarP);
                kVarP.r();
                if (kVarP.O) {
                    kVarP.z();
                } else {
                    kVarP.w(aVar);
                }
                ph.v1.j(bVar2, l0VarD2, kVarP);
                ph.v1.j(dVar, a2VarP2, kVarP);
                if (!kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i14))) {
                    org.bouncycastle.jcajce.provider.digest.e.a(i14, kVarP, i14, c0128a);
                }
                ph.v1.j(cVar, dVarC5, kVarP);
                bVar.invoke(kVarP, Integer.valueOf((i12 >> 3) & 14));
                kVarP.T(true);
                kVarP.T(true);
            } else {
                if (iOrdinal4 != 2) {
                    throw new pg.l();
                }
                if (!zA) {
                }
                kVarP.T(false);
                Float fValueOf422 = Float.valueOf(f13);
                y1.b<r.u0> animateFloat222 = y1VarA2.f();
                kotlin.jvm.internal.r.e(animateFloat222, "$this$animateFloat");
                kVarP.L(637839483);
                if (animateFloat222.e() == u0Var3) {
                }
                kVarP.T(false);
                dVarC = s.c2.c(y1VarA2, fValueOf3, fValueOf422, e0VarD, o2Var, kVarP, 196608);
                j10 = ((t0.e2) kVarP.f(t0.f2.f25858a)).f25768n;
                kVarP.L(-241072898);
                objG = kVarP.g();
                if (objG == c0321a) {
                }
                e0Var = (e0) objG;
                kVarP.T(false);
                FillElement fillElement22 = androidx.compose.foundation.layout.g.f976c;
                androidx.compose.ui.d dVarC322 = c(fillElement22, e0Var);
                kVarP.L(-241067731);
                zK = kVarP.K(dVarC2) | kVarP.l(e0Var) | kVarP.K(f0Var);
                objG2 = kVarP.g();
                if (zK) {
                    objG2 = new eh.l() { // from class: q8.l0
                        /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
                        @Override // eh.l
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object invoke(Object obj) {
                            long jY;
                            q1.l1 graphicsLayer = (q1.l1) obj;
                            kotlin.jvm.internal.r.e(graphicsLayer, "$this$graphicsLayer");
                            float fFloatValue = ((Number) dVarC2.getValue()).floatValue();
                            if (fFloatValue >= 1.0f) {
                                graphicsLayer.C(false);
                                graphicsLayer.p1(q1.y1.f21750a);
                            } else {
                                g2.v vVar = e0Var.f22177a;
                                if (vVar == null) {
                                    jY = 0;
                                    f0 f0Var42 = f0Var;
                                    graphicsLayer.p1(new y1(p1.f.b(f0Var42.f22198b.j(jY ^ (-9223372034707292160L)), p1.f.a(0L, graphicsLayer.i()), fFloatValue), h3.b.b(f0Var42.f22200d, CropImageView.DEFAULT_ASPECT_RATIO, fFloatValue)));
                                    graphicsLayer.C(true);
                                } else {
                                    if (!vVar.m()) {
                                        vVar = null;
                                    }
                                    if (vVar != null) {
                                        jY = vVar.Y(0L);
                                    }
                                    f0 f0Var422 = f0Var;
                                    graphicsLayer.p1(new y1(p1.f.b(f0Var422.f22198b.j(jY ^ (-9223372034707292160L)), p1.f.a(0L, graphicsLayer.i()), fFloatValue), h3.b.b(f0Var422.f22200d, CropImageView.DEFAULT_ASPECT_RATIO, fFloatValue)));
                                    graphicsLayer.C(true);
                                }
                            }
                            return pg.f0.f21461a;
                        }
                    };
                    kVarP.C(objG2);
                    kVarP.T(false);
                    androidx.compose.ui.d dVarA4 = androidx.compose.ui.graphics.a.a(dVarC322, (eh.l) objG2);
                    kVarP.L(-241050299);
                    zK2 = kVarP.K(dVarC) | kVarP.K(dVarC2) | kVarP.K(f0Var) | kVarP.j(j10);
                    objG3 = kVarP.g();
                    if (zK2) {
                        final f0 f0Var42 = f0Var;
                        objG3 = new eh.l() { // from class: q8.m0
                            @Override // eh.l
                            public final Object invoke(Object obj) {
                                s1.e drawBehind = (s1.e) obj;
                                kotlin.jvm.internal.r.e(drawBehind, "$this$drawBehind");
                                float fFloatValue = ((Number) dVarC.getValue()).floatValue();
                                if (fFloatValue <= CropImageView.DEFAULT_ASPECT_RATIO) {
                                    return pg.f0.f21461a;
                                }
                                s1.e.X0(drawBehind, c2.n0.g(f0Var42.f22199c, j10, jh.j.l(((Number) dVarC2.getValue()).floatValue() / 0.5f, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f)), 0L, 0L, fFloatValue, null, 118);
                                return pg.f0.f21461a;
                            }
                        };
                        f0Var2 = f0Var42;
                        kVarP.C(objG3);
                        kVarP.T(false);
                        androidx.compose.ui.d dVarA22 = androidx.compose.ui.draw.a.a(dVarA4, (eh.l) objG3);
                        j1.f fVar2 = d.a.f14602a;
                        g2.l0 l0VarD3 = z.g.d(fVar2, false);
                        i13 = kVarP.P;
                        x0.a2 a2VarP3 = kVarP.P();
                        androidx.compose.ui.d dVarC42 = androidx.compose.ui.c.c(dVarA22, kVarP);
                        i2.g.f13861o.getClass();
                        e0.a aVar2 = g.a.f13863b;
                        kVarP.r();
                        if (kVarP.O) {
                        }
                        g.a.b bVar22 = g.a.f13867f;
                        ph.v1.j(bVar22, l0VarD3, kVarP);
                        g.a.d dVar2 = g.a.f13866e;
                        ph.v1.j(dVar2, a2VarP3, kVarP);
                        c0128a = g.a.f13868g;
                        if (!kVarP.O) {
                            org.bouncycastle.jcajce.provider.digest.e.a(i13, kVarP, i13, c0128a);
                            g.a.c cVar2 = g.a.f13865d;
                            ph.v1.j(cVar2, dVarC42, kVarP);
                            kVarP.L(-226784374);
                            zK3 = kVarP.K(dVarC2) | kVarP.l(e0Var) | kVarP.K(f0Var2);
                            objG4 = kVarP.g();
                            if (!zK3) {
                                objG4 = new eh.l() { // from class: q8.n0
                                    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
                                    /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
                                    /* JADX WARN: Removed duplicated region for block: B:17:0x007f  */
                                    @Override // eh.l
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                    */
                                    public final Object invoke(Object obj) {
                                        long jY;
                                        q1.l1 graphicsLayer = (q1.l1) obj;
                                        kotlin.jvm.internal.r.e(graphicsLayer, "$this$graphicsLayer");
                                        float fFloatValue = ((Number) dVarC2.getValue()).floatValue();
                                        if (fFloatValue >= 1.0f) {
                                            graphicsLayer.h(1.0f);
                                            graphicsLayer.d(1.0f);
                                            graphicsLayer.j(CropImageView.DEFAULT_ASPECT_RATIO);
                                            graphicsLayer.c(CropImageView.DEFAULT_ASPECT_RATIO);
                                            graphicsLayer.f(1.0f);
                                        } else {
                                            g2.v vVar = e0Var.f22177a;
                                            if (vVar == null) {
                                                jY = 0;
                                                p1.e eVarB2 = p1.f.b(f0Var2.f22198b.j(jY ^ (-9223372034707292160L)), p1.f.a(0L, graphicsLayer.i()), fFloatValue);
                                                float f142 = eVarB2.f21131a;
                                                float fIntBitsToFloat = Float.intBitsToFloat((int) (graphicsLayer.i() >> 32)) <= CropImageView.DEFAULT_ASPECT_RATIO ? (eVarB2.f21133c - f142) / Float.intBitsToFloat((int) (graphicsLayer.i() >> 32)) : 1.0f;
                                                graphicsLayer.c1(b3.e.a(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO));
                                                graphicsLayer.h(fIntBitsToFloat);
                                                graphicsLayer.d(fIntBitsToFloat);
                                                graphicsLayer.j(f142);
                                                graphicsLayer.c(eVarB2.f21132b);
                                                graphicsLayer.f(jh.j.l(fFloatValue / 0.3f, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f));
                                            } else {
                                                if (!vVar.m()) {
                                                    vVar = null;
                                                }
                                                if (vVar != null) {
                                                    jY = vVar.Y(0L);
                                                }
                                                p1.e eVarB22 = p1.f.b(f0Var2.f22198b.j(jY ^ (-9223372034707292160L)), p1.f.a(0L, graphicsLayer.i()), fFloatValue);
                                                float f1422 = eVarB22.f21131a;
                                                if (Float.intBitsToFloat((int) (graphicsLayer.i() >> 32)) <= CropImageView.DEFAULT_ASPECT_RATIO) {
                                                }
                                                graphicsLayer.c1(b3.e.a(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO));
                                                graphicsLayer.h(fIntBitsToFloat);
                                                graphicsLayer.d(fIntBitsToFloat);
                                                graphicsLayer.j(f1422);
                                                graphicsLayer.c(eVarB22.f21132b);
                                                graphicsLayer.f(jh.j.l(fFloatValue / 0.3f, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f));
                                            }
                                        }
                                        return pg.f0.f21461a;
                                    }
                                };
                                kVarP.C(objG4);
                                kVarP.T(false);
                                androidx.compose.ui.d dVarA32 = androidx.compose.ui.graphics.a.a(fillElement22, (eh.l) objG4);
                                g2.l0 l0VarD22 = z.g.d(fVar2, false);
                                i14 = kVarP.P;
                                x0.a2 a2VarP22 = kVarP.P();
                                androidx.compose.ui.d dVarC52 = androidx.compose.ui.c.c(dVarA32, kVarP);
                                kVarP.r();
                                if (kVarP.O) {
                                }
                                ph.v1.j(bVar22, l0VarD22, kVarP);
                                ph.v1.j(dVar2, a2VarP22, kVarP);
                                if (!kVarP.O) {
                                    org.bouncycastle.jcajce.provider.digest.e.a(i14, kVarP, i14, c0128a);
                                    ph.v1.j(cVar2, dVarC52, kVarP);
                                    bVar.invoke(kVarP, Integer.valueOf((i12 >> 3) & 14));
                                    kVarP.T(true);
                                    kVarP.T(true);
                                }
                            }
                        }
                    }
                }
            }
        }
        x0.h2 h2VarV2 = kVarP.V();
        if (h2VarV2 != null) {
            h2VarV2.f31703d = new eh.p() { // from class: q8.o0
                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(i10 | 1);
                    p0.a(h0Var, bVar, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(z.i iVar, final w0 state, x0.j jVar, int i10) {
        int i11;
        androidx.compose.ui.d dVarA;
        kotlin.jvm.internal.r.e(iVar, "<this>");
        kotlin.jvm.internal.r.e(state, "state");
        x0.k kVarP = jVar.p(-1309235028);
        if ((i10 & 6) == 0) {
            i11 = (kVarP.K(iVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= kVarP.K(state) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && kVarP.s()) {
            kVarP.v();
        } else {
            s3 s3Var = t0.f2.f25858a;
            final long j10 = ((t0.e2) kVarP.f(s3Var)).f25768n;
            kVarP.L(1631029375);
            int i12 = i11 & 112;
            boolean z10 = i12 == 32;
            Object objG = kVarP.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (z10 || objG == c0321a) {
                objG = bg.b.d(new eh.a() { // from class: q8.g0
                    @Override // eh.a
                    public final Object invoke() {
                        return Boolean.valueOf(state.f22433f.getFloatValue() > CropImageView.DEFAULT_ASPECT_RATIO);
                    }
                });
                kVarP.C(objG);
            }
            r3 r3Var = (r3) objG;
            kVarP.T(false);
            androidx.compose.ui.d dVarE = iVar.e();
            eh.l lVar = new eh.l() { // from class: q8.t0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // eh.l
                public final Object invoke(Object obj) {
                    s1.e drawBehind = (s1.e) obj;
                    kotlin.jvm.internal.r.e(drawBehind, "$this$drawBehind");
                    w0 w0Var = state;
                    float floatValue = w0Var.f22433f.getFloatValue();
                    p1.e eVar = (p1.e) w0Var.f22429b.getValue();
                    if (floatValue <= CropImageView.DEFAULT_ASPECT_RATIO || eVar == null) {
                        return pg.f0.f21461a;
                    }
                    float floatValue2 = w0Var.f22432e.getFloatValue();
                    p1.e eVarB = p1.f.b(eVar, p1.f.a(0L, drawBehind.i()), floatValue2);
                    long jG = c2.n0.g(((q1.b1) w0Var.f22430c.getValue()).f21656a, j10, jh.j.l((floatValue2 - 0.1f) / 0.6f, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f));
                    long jE = eVarB.e();
                    float f10 = eVarB.f21133c - eVarB.f21131a;
                    float f11 = eVarB.f21134d - eVarB.f21132b;
                    drawBehind.B1(jG, (240 & 2) != 0 ? 0L : jE, (Float.floatToRawIntBits(f11) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f10) << 32), (Float.floatToRawIntBits(r2) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(h3.b.b(w0Var.f22431d.getFloatValue(), CropImageView.DEFAULT_ASPECT_RATIO, floatValue2)) << 32), (240 & 16) != 0 ? s1.h.f24186a : null, (240 & 32) != 0 ? 1.0f : floatValue);
                    return pg.f0.f21461a;
                }
            };
            d.a aVar = d.a.f1143b;
            androidx.compose.ui.d dVarH = dVarE.h(androidx.compose.ui.draw.a.a(aVar, lVar));
            kVarP.L(1631038576);
            if (((Boolean) r3Var.getValue()).booleanValue()) {
                pg.f0 f0Var = pg.f0.f21461a;
                kVarP.L(1631039802);
                Object objG2 = kVarP.g();
                if (objG2 == c0321a) {
                    objG2 = a.f22356a;
                    kVarP.C(objG2);
                }
                kVarP.T(false);
                dVarA = c2.s0.a(aVar, f0Var, (PointerInputEventHandler) objG2);
            } else {
                dVarA = aVar;
            }
            kVarP.T(false);
            z.g.a(dVarH.h(dVarA), kVarP, 0);
            String str = (String) state.f22434g.getValue();
            if (str != null && ((Boolean) r3Var.getValue()).booleanValue()) {
                androidx.compose.ui.d dVarB = iVar.b(aVar, d.a.f14606e);
                kVarP.L(1631052390);
                boolean z11 = i12 == 32;
                Object objG3 = kVarP.g();
                if (z11 || objG3 == c0321a) {
                    objG3 = new h0(state, 0);
                    kVarP.C(objG3);
                }
                kVarP.T(false);
                androidx.compose.ui.d dVarA2 = androidx.compose.ui.graphics.a.a(dVarB, (eh.l) objG3);
                z.q qVarA = z.o.a(z.b.f34446c, d.a.f14615n, kVarP, 48);
                int i13 = kVarP.P;
                x0.a2 a2VarP = kVarP.P();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarA2, kVarP);
                i2.g.f13861o.getClass();
                e0.a aVar2 = g.a.f13863b;
                kVarP.r();
                if (kVarP.O) {
                    kVarP.w(aVar2);
                } else {
                    kVarP.z();
                }
                ph.v1.j(g.a.f13867f, qVarA, kVarP);
                ph.v1.j(g.a.f13866e, a2VarP, kVarP);
                g.a.C0128a c0128a = g.a.f13868g;
                if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i13))) {
                    org.bouncycastle.jcajce.provider.digest.e.a(i13, kVarP, i13, c0128a);
                }
                ph.v1.j(g.a.f13865d, dVarC, kVarP);
                z9.a(3, 0, 390, 26, 0L, 0L, androidx.compose.foundation.layout.g.n(aVar, 28), kVarP);
                p1.d.b(androidx.compose.foundation.layout.g.f(aVar, 12), kVarP);
                ff.b(str, null, ((t0.e2) kVarP.f(s3Var)).f25769o, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nf) kVarP.f(of.f26647a)).f26546i, kVarP, 0, 0, 65530);
                kVarP = kVarP;
                kVarP.T(true);
            }
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new i0(iVar, i10, 0, state);
        }
    }

    public static final androidx.compose.ui.d c(androidx.compose.ui.d dVar, e0 origin) {
        kotlin.jvm.internal.r.e(dVar, "<this>");
        kotlin.jvm.internal.r.e(origin, "origin");
        return androidx.compose.ui.layout.c.a(dVar, new xc(origin, 1));
    }

    public static final x0.m0 d() {
        return f22355a;
    }

    public static final d0 e(x0.j jVar) {
        jVar.L(-1554237641);
        float f10 = 20;
        w0 w0Var = (w0) jVar.f(f22355a);
        jVar.L(1607988568);
        Object objF = jVar.f(h5.k.f12264a);
        p5.s sVar = objF instanceof p5.s ? (p5.s) objF : null;
        String str = sVar != null ? sVar.f21273f : null;
        jVar.B();
        boolean zA = x1.a(jVar);
        float fN0 = ((f3.d) jVar.f(j2.j2.f14779h)).N0(f10);
        jVar.L(-43414679);
        boolean zK = jVar.K(w0Var) | jVar.K(str) | jVar.h(fN0) | jVar.c(zA);
        Object objG = jVar.g();
        if (zK || objG == j.a.f31715a) {
            objG = new d0(w0Var, str, fN0, zA);
            jVar.C(objG);
        }
        d0 d0Var = (d0) objG;
        jVar.B();
        jVar.B();
        return d0Var;
    }
}
