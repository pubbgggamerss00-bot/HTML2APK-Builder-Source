package a9;

import android.content.Context;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.basitce.htmltoapk.R;
import com.google.protobuf.DescriptorProtos;
import com.yalantis.ucrop.view.CropImageView;
import d8.k;
import i2.e0;
import i2.g;
import j1.d;
import j5.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.x509.DisplayText;
import org.jf.dexlib2.dexbacked.raw.CdexHeaderItem;
import p0.e8;
import p0.l2;
import p0.n5;
import p0.nb;
import p0.t6;
import p0.t7;
import p0.u9;
import p0.v5;
import p0.x9;
import p0.y9;
import q1.i2;
import q1.u0;
import s.l0;
import t0.e2;
import t0.f2;
import t0.ff;
import t0.nf;
import t0.of;
import t0.ra;
import t0.t4;
import w1.d;
import x0.h2;
import x0.j;
import x0.r3;
import x0.s3;

/* loaded from: classes.dex */
public final class v0 {

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.premium.PremiumScreenKt$ExpandableFeatureRow$1$1", f = "PremiumScreen.kt", l = {1300}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f337a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f338b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x0.n1<Boolean> f339c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ x0.n1<Boolean> f340d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z10, x0.n1<Boolean> n1Var, x0.n1<Boolean> n1Var2, tg.e<? super a> eVar) {
            super(2, eVar);
            this.f338b = z10;
            this.f339c = n1Var;
            this.f340d = n1Var2;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new a(this.f338b, this.f339c, this.f340d, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f337a;
            x0.n1<Boolean> n1Var = this.f339c;
            if (i10 == 0) {
                pg.q.b(obj);
                if (this.f338b && !n1Var.getValue().booleanValue()) {
                    this.f337a = 1;
                    if (ph.t0.b(1000L, this) == aVar) {
                        return aVar;
                    }
                }
                return pg.f0.f21461a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
            if (!n1Var.getValue().booleanValue()) {
                Boolean bool = Boolean.TRUE;
                this.f340d.setValue(bool);
                n1Var.setValue(bool);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class b implements eh.q<z.r, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f341a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f342b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f343c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ w1.d f344d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ x0.n1<Boolean> f345e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ r3<Float> f346f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f347g;

        public b(long j10, boolean z10, String str, w1.d dVar, x0.n1<Boolean> n1Var, r3<Float> r3Var, String str2) {
            this.f341a = j10;
            this.f342b = z10;
            this.f343c = str;
            this.f344d = dVar;
            this.f345e = n1Var;
            this.f346f = r3Var;
            this.f347g = str2;
        }

        @Override // eh.q
        public final pg.f0 b(z.r rVar, x0.j jVar, Integer num) {
            z.r Card = rVar;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(Card, "$this$Card");
            if ((iIntValue & 17) == 16 && jVar2.s()) {
                jVar2.v();
            } else {
                d.a aVar = d.a.f1143b;
                float f10 = 14;
                androidx.compose.ui.d dVarI = androidx.compose.foundation.layout.f.i(androidx.compose.foundation.layout.g.d(aVar, 1.0f), f10, 12);
                z.q qVarA = z.o.a(z.b.f34446c, d.a.f14614m, jVar2, 0);
                int iD = jVar2.D();
                x0.a2 a2VarY = jVar2.y();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarI, jVar2);
                i2.g.f13861o.getClass();
                e0.a aVar2 = g.a.f13863b;
                if (jVar2.t() == null) {
                    c9.u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar2);
                } else {
                    jVar2.z();
                }
                g.a.b bVar = g.a.f13867f;
                ph.v1.j(bVar, qVarA, jVar2);
                g.a.d dVar = g.a.f13866e;
                ph.v1.j(dVar, a2VarY, jVar2);
                g.a.C0128a c0128a = g.a.f13868g;
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                    l9.i.a(iD, jVar2, iD, c0128a);
                }
                g.a.c cVar = g.a.f13865d;
                ph.v1.j(cVar, dVarC, jVar2);
                androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(aVar, 1.0f);
                z.m1 m1VarA = z.k1.a(z.b.h(f10), d.a.f14612k, jVar2, 54);
                int iD2 = jVar2.D();
                x0.a2 a2VarY2 = jVar2.y();
                androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarD, jVar2);
                if (jVar2.t() == null) {
                    c9.u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar2);
                } else {
                    jVar2.z();
                }
                ph.v1.j(bVar, m1VarA, jVar2);
                ph.v1.j(dVar, a2VarY2, jVar2);
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD2))) {
                    l9.i.a(iD2, jVar2, iD2, c0128a);
                }
                ph.v1.j(cVar, dVarC2, jVar2);
                float f11 = 13;
                androidx.compose.ui.d dVarD2 = e1.d.d(androidx.compose.foundation.layout.g.n(aVar, 44), h0.f.a(f11));
                boolean z10 = this.f342b;
                float f12 = z10 ? 0.16f : 0.12f;
                long j10 = this.f341a;
                androidx.compose.ui.d dVarA = t.o.a(androidx.compose.foundation.a.b(dVarD2, q1.b1.c(f12, j10), q1.y1.f21750a), 1, q1.b1.c(z10 ? 0.35f : 0.25f, j10), h0.f.a(f11));
                g2.l0 l0VarD = z.g.d(d.a.f14606e, false);
                int iD3 = jVar2.D();
                x0.a2 a2VarY3 = jVar2.y();
                androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(dVarA, jVar2);
                if (jVar2.t() == null) {
                    c9.u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar2);
                } else {
                    jVar2.z();
                }
                ph.v1.j(bVar, l0VarD, jVar2);
                ph.v1.j(dVar, a2VarY3, jVar2);
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD3))) {
                    l9.i.a(iD3, jVar2, iD3, c0128a);
                }
                ph.v1.j(cVar, dVarC3, jVar2);
                float f13 = 22;
                androidx.compose.ui.d dVarN = androidx.compose.foundation.layout.g.n(aVar, f13);
                w1.d dVar2 = this.f344d;
                String str = this.f343c;
                t4.b(dVar2, str, dVarN, j10, jVar2, 384, 0);
                jVar2.H();
                t2.l0 l0Var = ((nf) jVar2.f(of.f26647a)).f26548k;
                x2.p pVar = x2.p.f32032e;
                s3 s3Var = f2.f25858a;
                long j11 = ((e2) jVar2.f(s3Var)).f25769o;
                if (1.0f <= 0.0d) {
                    a0.a.a("invalid weight; must be greater than zero");
                }
                ff.b(str, new LayoutWeightElement(1.0f, true), j11, 0L, pVar, null, 0L, null, 0L, 0, false, 0, 0, l0Var, jVar2, 196608, 0, 65496);
                w1.d dVarA2 = v5.a();
                jVar2.L(-1342752750);
                x0.n1<Boolean> n1Var = this.f345e;
                long jC = n1Var.getValue().booleanValue() ? j10 : q1.b1.c(0.6f, ((e2) jVar2.f(s3Var)).f25773s);
                jVar2.B();
                t4.b(dVarA2, null, e3.k.b(androidx.compose.foundation.layout.g.n(aVar, f13), this.f346f.getValue().floatValue()), jC, jVar2, 48, 0);
                jVar2.H();
                androidx.compose.animation.d.b(z.s.f34624a, n1Var.getValue().booleanValue(), null, r.w0.b(s.m.d(280, 0, null, 6), 14).b(r.w0.c(s.m.d(280, 0, null, 6), 2)), r.w0.g(s.m.d(220, 0, null, 6), 14).b(r.w0.d(s.m.d(220, 0, null, 6), 2)), null, f1.c.b(-2084089168, new w0(z10, this.f347g), jVar2), jVar2, 1600518, 18);
                jVar2.H();
            }
            return pg.f0.f21461a;
        }
    }

    public static final void a(final androidx.compose.ui.d dVar, x0.j jVar, final int i10) {
        x0.k kVarP = jVar.p(-1449281930);
        if ((i10 & 3) == 2 && kVarP.s()) {
            kVarP.v();
        } else {
            kVarP.L(-1146223787);
            Object objG = kVarP.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (objG == c0321a) {
                objG = new h1.u();
                kVarP.C(objG);
            }
            final h1.u uVar = (h1.u) objG;
            Object objA = p0.h.a(kVarP, false, -1146221594);
            if (objA == c0321a) {
                objA = new x0.u1(CropImageView.DEFAULT_ASPECT_RATIO);
                kVarP.C(objA);
            }
            final x0.k1 k1Var = (x0.k1) objA;
            Object objA2 = p0.h.a(kVarP, false, -1146219834);
            if (objA2 == c0321a) {
                objA2 = new x0.u1(CropImageView.DEFAULT_ASPECT_RATIO);
                kVarP.C(objA2);
            }
            final x0.k1 k1Var2 = (x0.k1) objA2;
            kVarP.T(false);
            List listJ = qg.p.j(new q1.b1(c2.n0.c(4294956800L)), new q1.b1(c2.n0.c(4294929259L)), new q1.b1(c2.n0.c(4283354564L)), new q1.b1(c2.n0.c(4282759121L)), new q1.b1(c2.n0.c(4288073396L)), new q1.b1(c2.n0.c(4286755327L)), new q1.b1(c2.n0.c(4293467747L)), new q1.b1(c2.n0.c(4278248908L)));
            pg.f0 f0Var = pg.f0.f21461a;
            kVarP.L(-1146207925);
            Object objG2 = kVarP.g();
            if (objG2 == c0321a) {
                objG2 = new u0(uVar, k1Var, k1Var2, listJ, null);
                kVarP.C(objG2);
            }
            kVarP.T(false);
            x0.o0.d((eh.p) objG2, f0Var, kVarP);
            androidx.compose.ui.d dVarL = androidx.compose.foundation.layout.f.l(dVar.h(androidx.compose.foundation.layout.g.f976c), CropImageView.DEFAULT_ASPECT_RATIO, 0, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
            kVarP.L(-1146140568);
            Object objG3 = kVarP.g();
            if (objG3 == c0321a) {
                objG3 = new eh.l() { // from class: a9.b0
                    @Override // eh.l
                    public final Object invoke(Object obj) {
                        s1.e Canvas = (s1.e) obj;
                        kotlin.jvm.internal.r.e(Canvas, "$this$Canvas");
                        k1Var.e(Float.intBitsToFloat((int) (Canvas.i() >> 32)));
                        k1Var2.e(Float.intBitsToFloat((int) (Canvas.i() & BodyPartID.bodyIdMax)));
                        ListIterator listIterator = uVar.listIterator();
                        while (true) {
                            h1.c0 c0Var = (h1.c0) listIterator;
                            if (!c0Var.hasNext()) {
                                return pg.f0.f21461a;
                            }
                            d dVar2 = (d) c0Var.next();
                            float f10 = dVar2.f178c;
                            float f11 = dVar2.f177b;
                            float f12 = dVar2.f176a;
                            float f13 = f10 / 2.0f;
                            if (dVar2.f184i == 1) {
                                s1.e.f0(Canvas, dVar2.f179d, f13, (Float.floatToRawIntBits(f11) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f12) << 32), null, 0, CdexHeaderItem.DEBUG_INFO_OFFSETS_TABLE_OFFSET);
                            } else {
                                double radians = Math.toRadians(dVar2.f182g);
                                float fCos = ((float) Math.cos(radians)) * f13;
                                float fSin = ((float) Math.sin(radians)) * f13;
                                Float.floatToRawIntBits((f12 - fCos) + fSin);
                                Float.floatToRawIntBits((f11 - fSin) - fCos);
                                long j10 = dVar2.f179d;
                                long jFloatToRawIntBits = (Float.floatToRawIntBits(f12 - f13) << 32) | (Float.floatToRawIntBits(f11 - f13) & BodyPartID.bodyIdMax);
                                float f14 = dVar2.f178c;
                                s1.e.X0(Canvas, j10, jFloatToRawIntBits, (Float.floatToRawIntBits(f14) << 32) | (Float.floatToRawIntBits(f14) & BodyPartID.bodyIdMax), CropImageView.DEFAULT_ASPECT_RATIO, null, CdexHeaderItem.DEBUG_INFO_OFFSETS_TABLE_OFFSET);
                            }
                        }
                    }
                };
                kVarP.C(objG3);
            }
            kVarP.T(false);
            t.w.a(dVarL, (eh.l) objG3, kVarP, 48);
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(i10) { // from class: a9.c0
                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(7);
                    v0.a(this.f172a, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void b(final int i10, eh.a aVar, x0.j jVar) {
        int i11;
        final eh.a aVar2;
        x0.k kVarP = jVar.p(670813703);
        if ((i10 & 6) == 0) {
            i11 = (kVarP.l(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && kVarP.s()) {
            kVarP.v();
            aVar2 = aVar;
        } else {
            androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f);
            h0.e eVarA = h0.f.a(18);
            long j10 = k9.d.f16192n;
            aVar2 = aVar;
            t0.d1.b(aVar2, dVarD, false, eVarA, t0.z0.a(q1.b1.c(0.1f, j10), kVarP, 0), null, d2.a(1, q1.b1.c(0.5f, j10)), null, c.f157l, kVarP, (i11 & 14) | 100663344, 164);
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p() { // from class: a9.i0
                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    v0.b(f3.i.n(i10 | 1), aVar2, (x0.j) obj);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void c(final androidx.compose.ui.d dVar, x0.j jVar, final int i10) {
        long jC;
        long jC2;
        x0.k kVarP = jVar.p(-1415030846);
        if (((i10 | 6) & 3) == 2 && kVarP.s()) {
            kVarP.v();
        } else {
            boolean zA = ((k9.e) kVarP.f(k9.c.f16178b)).a();
            d.a aVar = d.a.f1143b;
            androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(aVar, 1.0f);
            h0.e eVarA = h0.f.a(22);
            if (zA) {
                kVarP.L(1358867962);
                jC = q1.b1.c(0.65f, ((e2) kVarP.f(f2.f25858a)).G);
                kVarP.T(false);
            } else {
                kVarP.L(1358971192);
                jC = q1.b1.c(0.95f, ((e2) kVarP.f(f2.f25858a)).J);
                kVarP.T(false);
            }
            t0.y0 y0VarA = t0.z0.a(jC, kVarP, 0);
            float f10 = 1;
            if (zA) {
                kVarP.L(1359154464);
                jC2 = q1.b1.c(0.35f, ((e2) kVarP.f(f2.f25858a)).B);
                kVarP.T(false);
            } else {
                kVarP.L(1359251680);
                jC2 = q1.b1.c(0.45f, ((e2) kVarP.f(f2.f25858a)).B);
                kVarP.T(false);
            }
            t0.d1.a(dVarD, eVarA, y0VarA, null, d2.a(f10, jC2), c.f158m, kVarP, 196608, 8);
            dVar = aVar;
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(i10) { // from class: a9.m0
                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    v0.c(this.f263a, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX WARN: Type inference failed for: r4v57 */
    public static final void d(final w1.d dVar, final String str, final String str2, final long j10, androidx.compose.ui.d dVar2, boolean z10, x0.j jVar, final int i10, final int i11) {
        boolean z11;
        int i12;
        final x0.n1 n1Var;
        long jC;
        ?? r42;
        d.a aVar;
        float f10;
        long jC2;
        androidx.compose.ui.d dVar3;
        x0.k kVar;
        final boolean z12;
        x0.k kVarP = jVar.p(-1856534803);
        int i13 = i10 | (kVarP.K(dVar) ? 4 : 2) | (kVarP.K(str) ? 32 : 16) | (kVarP.K(str2) ? 256 : 128) | (kVarP.j(j10) ? 2048 : 1024);
        int i14 = i13 | 24576;
        int i15 = i11 & 32;
        if (i15 != 0) {
            i12 = i13 | 221184;
            z11 = z10;
        } else {
            z11 = z10;
            i12 = i14 | (kVarP.c(z11) ? 131072 : 65536);
        }
        if ((74899 & i12) == 74898 && kVarP.s()) {
            kVarP.v();
            dVar3 = dVar2;
            z12 = z11;
            kVar = kVarP;
        } else {
            boolean z13 = i15 != 0 ? false : z11;
            boolean zA = ((k9.e) kVarP.f(k9.c.f16178b)).a();
            Object[] objArr = new Object[0];
            kVarP.L(2061589815);
            Object objG = kVarP.g();
            Object obj = j.a.f31715a;
            if (objG == obj) {
                objG = new d0();
                kVarP.C(objG);
            }
            kVarP.T(false);
            x0.n1 n1Var2 = (x0.n1) b0.a0.d(objArr, null, (eh.a) objG, kVarP, 3072, 6);
            Object[] objArr2 = new Object[0];
            kVarP.L(2061592215);
            Object objG2 = kVarP.g();
            if (objG2 == obj) {
                objG2 = new e0();
                kVarP.C(objG2);
            }
            kVarP.T(false);
            final x0.n1 n1Var3 = (x0.n1) b0.a0.d(objArr2, null, (eh.a) objG2, kVarP, 3072, 6);
            Boolean boolValueOf = Boolean.valueOf(z13);
            kVarP.L(2061594258);
            boolean zK = ((458752 & i12) == 131072) | kVarP.K(n1Var3) | kVarP.K(n1Var2);
            Object objG3 = kVarP.g();
            if (zK || objG3 == obj) {
                objG3 = new a(z13, n1Var3, n1Var2, null);
                kVarP.C(objG3);
            }
            kVarP.T(false);
            x0.o0.d((eh.p) objG3, boolValueOf, kVarP);
            r3 r3VarB = s.g.b(((Boolean) n1Var2.getValue()).booleanValue() ? 180.0f : CropImageView.DEFAULT_ASPECT_RATIO, s.m.d(250, 0, null, 6), "feature_expand_rotation", kVarP, 3120, 20);
            d.a aVar2 = d.a.f1143b;
            androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(aVar2, 1.0f);
            h0.e eVarA = h0.f.a(18);
            kVarP.L(2061617405);
            if (!zA) {
                n1Var = n1Var2;
                jC = ((Boolean) n1Var.getValue()).booleanValue() ? q1.b1.f21650d : q1.b1.c(0.88f, q1.b1.f21650d);
                r42 = 0;
            } else if (((Boolean) n1Var2.getValue()).booleanValue()) {
                kVarP.L(2061619889);
                e2 e2Var = (e2) kVarP.f(f2.f25858a);
                n1Var = n1Var2;
                jC = q1.b1.c(0.42f, e2Var.f25772r);
                r42 = 0;
                kVarP.T(false);
            } else {
                n1Var = n1Var2;
                r42 = 0;
                kVarP.L(2061622512);
                jC = q1.b1.c(0.2f, ((e2) kVarP.f(f2.f25858a)).f25772r);
                kVarP.T(false);
            }
            kVarP.T(r42);
            t0.y0 y0VarA = t0.z0.a(jC, kVarP, r42);
            if (((Boolean) n1Var.getValue()).booleanValue()) {
                aVar = aVar2;
                f10 = (float) 1.5d;
            } else {
                aVar = aVar2;
                f10 = 1;
            }
            kVarP.L(2061631296);
            if (((Boolean) n1Var.getValue()).booleanValue()) {
                jC2 = q1.b1.c(zA ? 0.65f : 0.55f, j10);
            } else {
                jC2 = zA ? q1.b1.c(0.25f, ((e2) kVarP.f(f2.f25858a)).B) : q1.b1.c(0.08f, q1.b1.f21648b);
            }
            long j11 = jC2;
            kVarP.T(false);
            t.v vVarA = d2.a(f10, j11);
            t0.c1 c1VarB = t0.z0.b((zA || !((Boolean) n1Var.getValue()).booleanValue()) ? 0 : 2, 62);
            kVarP.L(2061609238);
            boolean zK2 = kVarP.K(n1Var3) | kVarP.K(n1Var);
            Object objG4 = kVarP.g();
            if (zK2 || objG4 == obj) {
                objG4 = new eh.a() { // from class: a9.f0
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // eh.a
                    public final Object invoke() {
                        n1Var3.setValue(Boolean.TRUE);
                        n1Var.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                        return pg.f0.f21461a;
                    }
                };
                kVarP.C(objG4);
            }
            kVarP.T(false);
            dVar3 = aVar;
            t0.d1.b((eh.a) objG4, dVarD, false, eVarA, y0VarA, c1VarB, vVarA, null, f1.c.b(1811372514, new b(j10, zA, str, dVar, n1Var, r3VarB, str2), kVarP), kVarP, 100663296, 132);
            kVar = kVarP;
            z12 = z13;
        }
        h2 h2VarV = kVar.V();
        if (h2VarV != null) {
            final androidx.compose.ui.d dVar4 = dVar3;
            h2VarV.f31703d = new eh.p(str, str2, j10, dVar4, z12, i10, i11) { // from class: a9.g0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ String f208b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ String f209c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ long f210d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ androidx.compose.ui.d f211e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ boolean f212f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ int f213g;

                {
                    this.f213g = i11;
                }

                @Override // eh.p
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iN = f3.i.n(1);
                    v0.d(this.f207a, this.f208b, this.f209c, this.f210d, this.f211e, this.f212f, (x0.j) obj2, iN, this.f213g);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x054c  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v20, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v23 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(final p5.x xVar, final boolean z10, final float f10, final androidx.compose.ui.d dVar, final eh.a aVar, final eh.a aVar2, x0.j jVar, final int i10) {
        g.a.b bVar;
        g.a.C0128a c0128a;
        g.a.d dVar2;
        androidx.compose.foundation.layout.b bVar2;
        ?? r02;
        e0.a aVar3;
        g.a.c cVar;
        j1.f fVar;
        l0.a aVarA;
        x0.k kVar;
        v1.c cVar2;
        List listJ;
        Object obj;
        boolean z11;
        boolean zL;
        Object objG;
        ?? r13;
        boolean zL2;
        Object objG2;
        boolean z12;
        x0.k kVar2;
        x0.k kVarP = jVar.p(639362241);
        int i11 = i10 | (kVarP.l(xVar) ? 4 : 2) | (kVarP.c(z10) ? 32 : 16) | (kVarP.h(f10) ? 256 : 128) | (kVarP.l(aVar) ? 16384 : 8192) | (kVarP.l(aVar2) ? 131072 : 65536);
        if ((74899 & i11) == 74898 && kVarP.s()) {
            kVarP.v();
            kVar2 = kVarP;
        } else {
            boolean zA = ((k9.e) kVarP.f(k9.c.f16178b)).a();
            j1.f fVar2 = d.a.f14602a;
            g2.l0 l0VarD = z.g.d(fVar2, false);
            int i12 = kVarP.P;
            x0.a2 a2VarP = kVarP.P();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVar, kVarP);
            i2.g.f13861o.getClass();
            e0.a aVar4 = g.a.f13863b;
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar4);
            } else {
                kVarP.z();
            }
            g.a.b bVar3 = g.a.f13867f;
            ph.v1.j(bVar3, l0VarD, kVarP);
            g.a.d dVar3 = g.a.f13866e;
            ph.v1.j(dVar3, a2VarP, kVarP);
            g.a.C0128a c0128a2 = g.a.f13868g;
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i12))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i12, kVarP, i12, c0128a2);
            }
            g.a.c cVar3 = g.a.f13865d;
            ph.v1.j(cVar3, dVarC, kVarP);
            d.a aVar5 = d.a.f1143b;
            androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(aVar5, 1.0f);
            androidx.compose.foundation.layout.b bVar4 = androidx.compose.foundation.layout.b.f961a;
            j1.f fVar3 = d.a.f14606e;
            androidx.compose.ui.d dVarL = androidx.compose.foundation.layout.f.l(d0.h.f(androidx.compose.foundation.layout.f.l(ph.m0.e(bVar4.b(dVarD, fVar3), ph.m0.c(kVarP), true), CropImageView.DEFAULT_ASPECT_RATIO, f10, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13)), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, z10 ? 56 : 16, 7);
            z.q qVarA = z.o.a(z.b.f34446c, d.a.f14615n, kVarP, 48);
            int i13 = kVarP.P;
            x0.a2 a2VarP2 = kVarP.P();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarL, kVarP);
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar4);
            } else {
                kVarP.z();
            }
            ph.v1.j(bVar3, qVarA, kVarP);
            ph.v1.j(dVar3, a2VarP2, kVarP);
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i13))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i13, kVarP, i13, c0128a2);
            }
            ph.v1.j(cVar3, dVarC2, kVarP);
            kVarP.L(1142192319);
            if (q8.x1.a(kVarP)) {
                bVar2 = bVar4;
                bVar = bVar3;
                aVar3 = aVar4;
                cVar = cVar3;
                fVar = fVar2;
                dVar2 = dVar3;
                aVarA = null;
                r02 = 0;
                c0128a = c0128a2;
                kVar = kVarP;
            } else {
                x0.k kVar3 = kVarP;
                bVar = bVar3;
                c0128a = c0128a2;
                dVar2 = dVar3;
                bVar2 = bVar4;
                r02 = 0;
                aVar3 = aVar4;
                cVar = cVar3;
                fVar = fVar2;
                aVarA = s.p0.a(s.p0.c("pulse", kVarP, 0), 1.0f, 1.06f, s.m.a(s.m.d(1200, 0, null, 6), s.y0.f23999b, 4), "pulse", kVar3, 29112, 0);
                kVar = kVar3;
            }
            kVar.T(r02);
            androidx.compose.ui.d dVarN = androidx.compose.foundation.layout.g.n(aVar5, 136);
            kVar.L(1142208316);
            boolean zK = kVar.K(aVarA);
            Object objG3 = kVar.g();
            Object obj2 = j.a.f31715a;
            if (zK || objG3 == obj2) {
                objG3 = new n0(aVarA, r02);
                kVar.C(objG3);
            }
            kVar.T(r02);
            androidx.compose.ui.d dVarA = androidx.compose.ui.graphics.a.a(dVarN, (eh.l) objG3);
            g2.l0 l0VarD2 = z.g.d(fVar3, r02);
            int i14 = kVar.P;
            x0.a2 a2VarP3 = kVar.P();
            androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(dVarA, kVar);
            kVar.r();
            if (kVar.O) {
                kVar.w(aVar3);
            } else {
                kVar.z();
            }
            ph.v1.j(bVar, l0VarD2, kVar);
            ph.v1.j(dVar2, a2VarP3, kVar);
            if (kVar.O || !kotlin.jvm.internal.r.a(kVar.g(), Integer.valueOf(i14))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i14, kVar, i14, c0128a);
            }
            ph.v1.j(cVar, dVarC3, kVar);
            v1.c cVarA = o2.c.a(R.drawable.ic_premium_logo, kVar);
            String strC = f3.q.c(R.string.pro_badge_content_description, kVar);
            float f11 = 28;
            androidx.compose.ui.d dVarD2 = e1.d.d(androidx.compose.foundation.layout.g.n(aVar5, 118), h0.f.a(f11));
            float f12 = 2;
            if (zA) {
                cVar2 = cVarA;
                listJ = qg.p.j(new q1.b1(c2.n0.c(4294956800L)), new q1.b1(c2.n0.c(4294942720L)));
            } else {
                cVar2 = cVarA;
                listJ = qg.p.j(new q1.b1(c2.n0.c(4292441862L)), new q1.b1(c2.n0.c(4290007817L)));
            }
            g.a.C0128a c0128a3 = c0128a;
            x0.k kVar4 = kVar;
            g.a.c cVar4 = cVar;
            t.t0.a(cVar2, strC, t.o.b(dVarD2, f12, u0.a.b(listJ), h0.f.a(f11)), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, kVar4, 0, CdexHeaderItem.DEBUG_INFO_OFFSETS_TABLE_OFFSET);
            androidx.compose.foundation.layout.b bVar5 = bVar2;
            float f13 = 8;
            float f14 = (float) 1.5d;
            androidx.compose.ui.d dVarI = androidx.compose.foundation.layout.f.i(t.o.a(androidx.compose.foundation.a.a(e1.d.d(androidx.compose.foundation.layout.e.b(bVar5.b(aVar5, d.a.f14610i), f12, f12), h0.f.a(f13)), u0.a.a(qg.p.j(new q1.b1(c2.n0.c(4294956800L)), new q1.b1(c2.n0.c(4294942720L))))), f14, zA ? c2.n0.c(4280163108L) : q1.b1.f21650d, h0.f.a(f13)), f13, 3);
            g2.l0 l0VarD3 = z.g.d(fVar, false);
            int i15 = kVar4.P;
            x0.a2 a2VarP4 = kVar4.P();
            androidx.compose.ui.d dVarC4 = androidx.compose.ui.c.c(dVarI, kVar4);
            kVar4.r();
            if (kVar4.O) {
                kVar4.w(aVar3);
            } else {
                kVar4.z();
            }
            ph.v1.j(bVar, l0VarD3, kVar4);
            ph.v1.j(dVar2, a2VarP4, kVar4);
            if (kVar4.O || !kotlin.jvm.internal.r.a(kVar4.g(), Integer.valueOf(i15))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i15, kVar4, i15, c0128a3);
            }
            ph.v1.j(cVar4, dVarC4, kVar4);
            long jC = c2.n0.c(4279900698L);
            x2.p pVar = x2.p.f32035h;
            s3 s3Var = of.f26647a;
            ff.b("PRO", null, jC, 0L, pVar, null, f3.u.b(0.5d), null, 0L, 0, false, 0, 0, ((nf) kVar4.f(s3Var)).f26552o, kVar4, 12779910, 0, 65370);
            kVar4.T(true);
            kVar4.T(true);
            p1.d.b(androidx.compose.foundation.layout.g.f(aVar5, f11), kVar4);
            String strC2 = f3.q.c(R.string.premium_thanks_title, kVar4);
            t2.l0 l0Var = ((nf) kVar4.f(s3Var)).f26542e;
            x2.p pVar2 = x2.p.f32033f;
            ff.b(strC2, null, zA ? c2.n0.c(4294956800L) : c2.n0.c(4290007817L), 0L, pVar2, null, 0L, null, 0L, 0, false, 0, 0, l0Var, kVar4, 196608, 0, 65498);
            p1.d.b(androidx.compose.foundation.layout.g.f(aVar5, 10), kVar4);
            ff.b(f3.q.c(R.string.premium_welcome_pro_world, kVar4), null, ((e2) kVar4.f(f2.f25858a)).f25769o, 0L, pVar2, null, 0L, new e3.h(3), 0L, 0, false, 0, 0, ((nf) kVar4.f(s3Var)).f26543f, kVar4, 196608, 0, 64986);
            p1.d.b(androidx.compose.foundation.layout.g.f(aVar5, 36), kVar4);
            kVar4.L(1142304529);
            boolean zL3 = kVar4.l(xVar);
            Object objG4 = kVar4.g();
            if (zL3) {
                obj = obj2;
            } else {
                obj = obj2;
                if (objG4 != obj) {
                    z11 = false;
                }
                eh.a aVar6 = (eh.a) objG4;
                kVar4.T(z11);
                androidx.compose.ui.d dVarF = androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.g.d(aVar5, 1.0f), 58);
                float f15 = 18;
                h0.e eVarA = h0.f.a(f15);
                z.g1 g1Var = t0.m0.f26400a;
                t0.x0.a(aVar6, dVarF, false, eVarA, t0.m0.a(c2.n0.c(4294956800L), 0L, 0L, kVar4, 14), null, null, null, c.f148c, kVar4, 805306416, 484);
                float f16 = 14;
                p1.d.b(androidx.compose.foundation.layout.g.f(aVar5, f16), kVar4);
                kVar4.L(1142330679);
                zL = kVar4.l(xVar);
                objG = kVar4.g();
                if (!zL || objG == obj) {
                    r13 = 0;
                    objG = new p0(xVar, 0);
                    kVar4.C(objG);
                } else {
                    r13 = 0;
                }
                kVar4.T(r13);
                b(r13, (eh.a) objG, kVar4);
                p1.d.b(androidx.compose.foundation.layout.g.f(aVar5, f16), kVar4);
                androidx.compose.ui.d dVarF2 = androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.g.d(aVar5, 1.0f), 56);
                h0.e eVarA2 = h0.f.a(f15);
                t.v vVarA = d2.a(f14, !zA ? c2.n0.c(4294956800L) : c2.n0.c(4292441862L));
                t0.l0 l0VarE = t0.m0.e(!zA ? c2.n0.c(4294956800L) : c2.n0.c(4292441862L), kVar4);
                kVar4.L(1142336061);
                zL2 = kVar4.l(xVar);
                objG2 = kVar4.g();
                if (!zL2 || objG2 == obj) {
                    z12 = false;
                    objG2 = new q0(xVar, 0);
                    kVar4.C(objG2);
                } else {
                    z12 = false;
                }
                kVar4.T(z12);
                t0.x0.c((eh.a) objG2, dVarF2, false, eVarA2, l0VarE, vVarA, null, c.f149d, kVar4, 805306416, 420);
                kVar2 = kVar4;
                kVar2.L(1142370267);
                kVar2.T(z12);
                kVar2.T(true);
                kVar2.L(2108774275);
                if (z10) {
                    t0.x0.d(aVar, androidx.compose.foundation.layout.f.l(bVar5.b(aVar5, d.a.f14609h), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f13, 7), false, null, t0.m0.f(0L, q1.b1.c(0.65f, q1.b1.f21649c), kVar2, 13), null, c.f150e, kVar2, ((i11 >> 12) & 14) | 805306368, 492);
                    kVar2 = kVar2;
                }
                kVar2.T(false);
                kVar2.T(true);
            }
            z11 = false;
            objG4 = new o0(xVar, 0);
            kVar4.C(objG4);
            eh.a aVar62 = (eh.a) objG4;
            kVar4.T(z11);
            androidx.compose.ui.d dVarF3 = androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.g.d(aVar5, 1.0f), 58);
            float f152 = 18;
            h0.e eVarA3 = h0.f.a(f152);
            z.g1 g1Var2 = t0.m0.f26400a;
            t0.x0.a(aVar62, dVarF3, false, eVarA3, t0.m0.a(c2.n0.c(4294956800L), 0L, 0L, kVar4, 14), null, null, null, c.f148c, kVar4, 805306416, 484);
            float f162 = 14;
            p1.d.b(androidx.compose.foundation.layout.g.f(aVar5, f162), kVar4);
            kVar4.L(1142330679);
            zL = kVar4.l(xVar);
            objG = kVar4.g();
            if (zL) {
                r13 = 0;
                objG = new p0(xVar, 0);
                kVar4.C(objG);
                kVar4.T(r13);
                b(r13, (eh.a) objG, kVar4);
                p1.d.b(androidx.compose.foundation.layout.g.f(aVar5, f162), kVar4);
                androidx.compose.ui.d dVarF22 = androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.g.d(aVar5, 1.0f), 56);
                h0.e eVarA22 = h0.f.a(f152);
                t.v vVarA2 = d2.a(f14, !zA ? c2.n0.c(4294956800L) : c2.n0.c(4292441862L));
                t0.l0 l0VarE2 = t0.m0.e(!zA ? c2.n0.c(4294956800L) : c2.n0.c(4292441862L), kVar4);
                kVar4.L(1142336061);
                zL2 = kVar4.l(xVar);
                objG2 = kVar4.g();
                if (zL2) {
                    z12 = false;
                    objG2 = new q0(xVar, 0);
                    kVar4.C(objG2);
                    kVar4.T(z12);
                    t0.x0.c((eh.a) objG2, dVarF22, false, eVarA22, l0VarE2, vVarA2, null, c.f149d, kVar4, 805306416, 420);
                    kVar2 = kVar4;
                    kVar2.L(1142370267);
                    kVar2.T(z12);
                    kVar2.T(true);
                    kVar2.L(2108774275);
                    if (z10) {
                    }
                    kVar2.T(false);
                    kVar2.T(true);
                }
            }
        }
        h2 h2VarV = kVar2.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(z10, f10, dVar, aVar, aVar2, i10) { // from class: a9.r0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ boolean f298b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ float f299c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ androidx.compose.ui.d f300d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ eh.a f301e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ eh.a f302f;

                @Override // eh.p
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iN = f3.i.n(3073);
                    v0.e(this.f297a, this.f298b, this.f299c, this.f300d, this.f301e, this.f302f, (x0.j) obj3, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void f(final g8.x xVar, final eh.a aVar, final String str, final String str2, final i8.a aVar2, final boolean z10, final boolean z11, final eh.a aVar3, final eh.a aVar4, final eh.a aVar5, final eh.a aVar6, final eh.p pVar, x0.j jVar, final int i10) {
        long j10;
        long j11;
        z.s sVar;
        x0.k kVarP = jVar.p(-1821591174);
        int i11 = i10 | (kVarP.l(xVar) ? 4 : 2) | (kVarP.l(aVar) ? 32 : 16) | (kVarP.K(str) ? 256 : 128) | (kVarP.K(str2) ? 2048 : 1024) | (kVarP.K(aVar2) ? 16384 : 8192) | (kVarP.c(z10) ? 131072 : 65536) | (kVarP.c(z11) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted) | (kVarP.l(aVar3) ? 8388608 : 4194304) | (kVarP.l(aVar4) ? 67108864 : 33554432) | (kVarP.l(aVar5) ? PKIFailureInfo.duplicateCertReq : 268435456);
        int i12 = (kVarP.l(aVar6) ? 4 : 2) | (kVarP.l(pVar) ? 32 : 16);
        if ((306783379 & i11) == 306783378 && (i12 & 19) == 18 && kVarP.s()) {
            kVarP.v();
        } else {
            d.a aVar7 = d.a.f1143b;
            androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(aVar7, 1.0f);
            z.q qVarA = z.o.a(z.b.f34446c, d.a.f14615n, kVarP, 48);
            int i13 = kVarP.P;
            x0.a2 a2VarP = kVarP.P();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarD, kVarP);
            i2.g.f13861o.getClass();
            e0.a aVar8 = g.a.f13863b;
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar8);
            } else {
                kVarP.z();
            }
            g.a.b bVar = g.a.f13867f;
            ph.v1.j(bVar, qVarA, kVarP);
            g.a.d dVar = g.a.f13866e;
            ph.v1.j(dVar, a2VarP, kVarP);
            g.a.C0128a c0128a = g.a.f13868g;
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i13))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i13, kVarP, i13, c0128a);
            }
            g.a.c cVar = g.a.f13865d;
            ph.v1.j(cVar, dVarC, kVarP);
            float f10 = 16;
            p1.d.b(androidx.compose.foundation.layout.g.f(aVar7, f10), kVarP);
            boolean zA = ((k9.e) kVarP.f(k9.c.f16178b)).a();
            r.v1 v1VarB = r.w0.c(s.m.d(700, 0, null, 6), 2).b(r.w0.e(s.m.d(700, 0, null, 6), 0.7f, 0L, 4));
            f1.b bVarB = f1.c.b(-1839034040, new x0(zA), kVarP);
            int i14 = (i11 >> 15) & 112;
            int i15 = 1572870 | i14;
            z.s sVar2 = z.s.f34624a;
            androidx.compose.animation.d.b(sVar2, z11, null, v1VarB, null, null, bVarB, kVarP, i15, 26);
            p1.d.b(androidx.compose.foundation.layout.g.f(aVar7, 20), kVarP);
            int i16 = 1575942 | i14;
            boolean z12 = zA;
            androidx.compose.animation.d.b(sVar2, z11, null, r.w0.c(s.m.d(900, 0, null, 6), 2), null, null, f1.c.b(1009105215, new y0(zA), kVarP), kVarP, i16, 26);
            p1.d.b(androidx.compose.foundation.layout.g.f(aVar7, 8), kVarP);
            androidx.compose.animation.d.b(sVar2, z11, null, r.w0.c(s.m.d(900, 0, null, 6), 2), null, null, c.f151f, kVarP, i16, 26);
            p1.d.b(androidx.compose.foundation.layout.g.f(aVar7, 28), kVarP);
            y yVar = new y(p0.y.a(), R.string.premium_feature_ai_desc, R.string.premium_feature_ai_detail, qg.p.j(Integer.valueOf(xVar.f11650d), Integer.valueOf(xVar.f11651e)), c2.n0.c(4294956367L), c2.n0.c(4290007817L));
            w1.d dVarA = p0.x0.a();
            long jC = c2.n0.c(4286755327L);
            long jC2 = c2.n0.c(4279858898L);
            qg.z zVar = qg.z.f22752a;
            List listJ = qg.p.j(yVar, new y(dVarA, R.string.premium_feature_aab_desc, R.string.premium_feature_aab_detail, zVar, jC, jC2), new y(l2.a(), R.string.premium_feature_unlimited_desc, R.string.premium_feature_unlimited_detail, zVar, c2.n0.c(4291794138L), c2.n0.c(4287505578L)), new y(n5.a(), R.string.premium_feature_watermark_desc, R.string.premium_feature_watermark_detail, zVar, c2.n0.c(4294948685L), c2.n0.c(4293284096L)), new y(t6.a(), R.string.premium_feature_keystore_desc, R.string.premium_feature_keystore_detail, zVar, c2.n0.c(4286695300L), c2.n0.c(4281236786L)));
            w1.d dVarB = n0.i.f18297a;
            if (dVarB != null) {
                j10 = 4286755327L;
            } else {
                d.a aVar9 = new d.a("AutoMirrored.Filled.ViewList", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
                int i17 = w1.m.f31210a;
                j10 = 4286755327L;
                i2 i2Var = new i2(q1.b1.f21648b);
                w1.e eVar = new w1.e();
                eVar.h(3.0f, 14.0f);
                eVar.e(4.0f);
                eVar.l(-4.0f);
                eVar.d(3.0f);
                eVar.k(14.0f);
                eVar.a();
                eVar.h(3.0f, 19.0f);
                eVar.e(4.0f);
                eVar.l(-4.0f);
                eVar.d(3.0f);
                eVar.k(19.0f);
                eVar.a();
                eVar.h(3.0f, 9.0f);
                eVar.e(4.0f);
                eVar.k(5.0f);
                eVar.d(3.0f);
                eVar.k(9.0f);
                eVar.a();
                eVar.h(8.0f, 14.0f);
                eVar.e(13.0f);
                eVar.l(-4.0f);
                eVar.d(8.0f);
                eVar.k(14.0f);
                eVar.a();
                p0.n.a(eVar, 8.0f, 19.0f, 13.0f, -4.0f);
                eVar.d(8.0f);
                eVar.k(19.0f);
                eVar.a();
                eVar.h(8.0f, 5.0f);
                eVar.l(4.0f);
                eVar.e(13.0f);
                eVar.k(5.0f);
                eVar.d(8.0f);
                eVar.a();
                d.a.a(aVar9, eVar.f31100a, 0, i2Var);
                dVarB = aVar9.b();
                n0.i.f18297a = dVarB;
            }
            y yVar2 = new y(dVarB, R.string.premium_feature_templates_desc, R.string.premium_feature_templates_detail, zVar, c2.n0.c(4278248908L), c2.n0.c(4278225275L));
            y yVar3 = new y(p0.w1.a(), R.string.premium_feature_unlimited_html_desc, R.string.premium_feature_unlimited_html_detail, zVar, c2.n0.c(j10), c2.n0.c(4279592384L));
            y yVar4 = new y(e8.a(), R.string.premium_feature_unlimited_pdf_desc, R.string.premium_feature_unlimited_pdf_detail, zVar, c2.n0.c(4294937216L), c2.n0.c(4291176488L));
            y yVar5 = new y(y9.a(), R.string.premium_feature_batch_desc, R.string.premium_feature_batch_detail, zVar, c2.n0.c(4284790262L), c2.n0.c(4278356177L));
            y yVar6 = new y(x9.a(), R.string.premium_feature_webview_desc, R.string.premium_feature_webview_detail, zVar, c2.n0.c(4293227379L), c2.n0.c(4292030255L));
            w1.d dVarB2 = p0.m0.f20939a;
            if (dVarB2 != null) {
                j11 = 4291176488L;
                sVar = sVar2;
            } else {
                d.a aVar10 = new d.a("Filled.Block", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i18 = w1.m.f31210a;
                j11 = 4291176488L;
                sVar = sVar2;
                i2 i2Var2 = new i2(q1.b1.f21648b);
                w1.e eVarA = o0.d.a(12.0f, 2.0f);
                eVarA.b(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
                eVarA.j(4.48f, 10.0f, 10.0f, 10.0f);
                eVarA.j(10.0f, -4.48f, 10.0f, -10.0f);
                eVarA.i(17.52f, 2.0f, 12.0f, 2.0f);
                eVarA.a();
                eVarA.h(4.0f, 12.0f);
                eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, -4.42f, 3.58f, -8.0f, 8.0f, -8.0f);
                eVarA.c(1.85f, CropImageView.DEFAULT_ASPECT_RATIO, 3.55f, 0.63f, 4.9f, 1.69f);
                eVarA.f(5.69f, 16.9f);
                eVarA.b(4.63f, 15.55f, 4.0f, 13.85f, 4.0f, 12.0f);
                eVarA.a();
                eVarA.h(12.0f, 20.0f);
                eVarA.c(-1.85f, CropImageView.DEFAULT_ASPECT_RATIO, -3.55f, -0.63f, -4.9f, -1.69f);
                eVarA.f(18.31f, 7.1f);
                eVarA.b(19.37f, 8.45f, 20.0f, 10.15f, 20.0f, 12.0f);
                eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 4.42f, -3.58f, 8.0f, -8.0f, 8.0f);
                eVarA.a();
                d.a.a(aVar10, eVarA.f31100a, 0, i2Var2);
                dVarB2 = aVar10.b();
                p0.m0.f20939a = dVarB2;
            }
            y yVar7 = new y(dVarB2, R.string.premium_extra_ads_title, R.string.premium_extra_ads_detail, zVar, c2.n0.c(4294937216L), c2.n0.c(j11));
            y yVar8 = new y(t7.a(), R.string.premium_extra_splash_title, R.string.premium_extra_splash_detail, zVar, c2.n0.c(4293558524L), c2.n0.c(4288423856L));
            w1.d dVarB3 = u9.f21057a;
            if (dVarB3 == null) {
                d.a aVar11 = new d.a("Filled.Sensors", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i19 = w1.m.f31210a;
                i2 i2Var3 = new i2(q1.b1.f21648b);
                w1.e eVarA2 = o0.d.a(7.76f, 16.24f);
                eVarA2.b(6.67f, 15.16f, 6.0f, 13.66f, 6.0f, 12.0f);
                eVarA2.j(0.67f, -3.16f, 1.76f, -4.24f);
                eVarA2.g(1.42f, 1.42f);
                eVarA2.b(8.45f, 9.9f, 8.0f, 10.9f, 8.0f, 12.0f);
                eVarA2.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.1f, 0.45f, 2.1f, 1.17f, 2.83f);
                ji.a.b(eVarA2, 7.76f, 16.24f, 16.24f, 16.24f);
                eVarA2.b(17.33f, 15.16f, 18.0f, 13.66f, 18.0f, 12.0f);
                eVarA2.j(-0.67f, -3.16f, -1.76f, -4.24f);
                eVarA2.g(-1.42f, 1.42f);
                eVarA2.b(15.55f, 9.9f, 16.0f, 10.9f, 16.0f, 12.0f);
                eVarA2.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.1f, -0.45f, 2.1f, -1.17f, 2.83f);
                ji.a.b(eVarA2, 16.24f, 16.24f, 12.0f, 10.0f);
                eVarA2.c(-1.1f, CropImageView.DEFAULT_ASPECT_RATIO, -2.0f, 0.9f, -2.0f, 2.0f);
                eVarA2.j(0.9f, 2.0f, 2.0f, 2.0f);
                eVarA2.j(2.0f, -0.9f, 2.0f, -2.0f);
                eVarA2.i(13.1f, 10.0f, 12.0f, 10.0f);
                eVarA2.a();
                eVarA2.h(20.0f, 12.0f);
                eVarA2.c(CropImageView.DEFAULT_ASPECT_RATIO, 2.21f, -0.9f, 4.21f, -2.35f, 5.65f);
                eVarA2.g(1.42f, 1.42f);
                eVarA2.b(20.88f, 17.26f, 22.0f, 14.76f, 22.0f, 12.0f);
                eVarA2.j(-1.12f, -5.26f, -2.93f, -7.07f);
                eVarA2.g(-1.42f, 1.42f);
                eVarA2.b(19.1f, 7.79f, 20.0f, 9.79f, 20.0f, 12.0f);
                l9.i.b(eVarA2, 6.35f, 6.35f, 4.93f, 4.93f);
                eVarA2.b(3.12f, 6.74f, 2.0f, 9.24f, 2.0f, 12.0f);
                eVarA2.j(1.12f, 5.26f, 2.93f, 7.07f);
                eVarA2.g(1.42f, -1.42f);
                eVarA2.b(4.9f, 16.21f, 4.0f, 14.21f, 4.0f, 12.0f);
                eVarA2.i(4.9f, 7.79f, 6.35f, 6.35f);
                eVarA2.a();
                d.a.a(aVar11, eVarA2.f31100a, 0, i2Var3);
                dVarB3 = aVar11.b();
                u9.f21057a = dVarB3;
            }
            y yVar9 = new y(dVarB3, R.string.premium_extra_hardware_title, R.string.premium_extra_hardware_detail, zVar, c2.n0.c(4289200107L), c2.n0.c(4278225275L));
            w1.d dVarB4 = nb.f20963a;
            if (dVarB4 == null) {
                d.a aVar12 = new d.a("Filled.TouchApp", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i20 = w1.m.f31210a;
                i2 i2Var4 = new i2(q1.b1.f21648b);
                w1.e eVar2 = new w1.e();
                eVar2.h(9.0f, 11.24f);
                eVar2.k(7.5f);
                eVar2.b(9.0f, 6.12f, 10.12f, 5.0f, 11.5f, 5.0f);
                eVar2.i(14.0f, 6.12f, 14.0f, 7.5f);
                eVar2.l(3.74f);
                eVar2.c(1.21f, -0.81f, 2.0f, -2.18f, 2.0f, -3.74f);
                eVar2.b(16.0f, 5.01f, 13.99f, 3.0f, 11.5f, 3.0f);
                eVar2.i(7.0f, 5.01f, 7.0f, 7.5f);
                eVar2.b(7.0f, 9.06f, 7.79f, 10.43f, 9.0f, 11.24f);
                l9.y.a(eVar2, 18.84f, 15.87f, -4.54f, -2.26f);
                eVar2.c(-0.17f, -0.07f, -0.35f, -0.11f, -0.54f, -0.11f);
                eVar2.d(13.0f);
                eVar2.l(-6.0f);
                eVar2.b(13.0f, 6.67f, 12.33f, 6.0f, 11.5f, 6.0f);
                eVar2.i(10.0f, 6.67f, 10.0f, 7.5f);
                eVar2.l(10.74f);
                eVar2.c(-3.6f, -0.76f, -3.54f, -0.75f, -3.67f, -0.75f);
                eVar2.c(-0.31f, CropImageView.DEFAULT_ASPECT_RATIO, -0.59f, 0.13f, -0.79f, 0.33f);
                eVar2.g(-0.79f, 0.8f);
                eVar2.g(4.94f, 4.94f);
                eVar2.b(9.96f, 23.83f, 10.34f, 24.0f, 10.75f, 24.0f);
                eVar2.e(6.79f);
                eVar2.c(0.75f, CropImageView.DEFAULT_ASPECT_RATIO, 1.33f, -0.55f, 1.44f, -1.28f);
                eVar2.g(0.75f, -5.27f);
                eVar2.c(0.01f, -0.07f, 0.02f, -0.14f, 0.02f, -0.2f);
                eVar2.b(19.75f, 16.63f, 19.37f, 16.09f, 18.84f, 15.87f);
                eVar2.a();
                d.a.a(aVar12, eVar2.f31100a, 0, i2Var4);
                dVarB4 = aVar12.b();
                nb.f20963a = dVarB4;
            }
            List listJ2 = qg.p.j(yVar2, yVar3, yVar4, yVar5, yVar6, yVar7, yVar8, yVar9, new y(dVarB4, R.string.premium_extra_gestures_title, R.string.premium_extra_gestures_detail, zVar, c2.n0.c(4294955392L), c2.n0.c(4293880832L)));
            Object[] objArr = new Object[0];
            kVarP.L(605961862);
            Object objG = kVarP.g();
            if (objG == j.a.f31715a) {
                objG = new s0();
                kVarP.C(objG);
            }
            kVarP.T(false);
            x0.n1 n1Var = (x0.n1) b0.a0.d(objArr, null, (eh.a) objG, kVarP, 3072, 6);
            androidx.compose.ui.d dVarD2 = androidx.compose.foundation.layout.g.d(aVar7, 1.0f);
            z.q qVarA2 = z.o.a(z.b.h(10), d.a.f14614m, kVarP, 6);
            int i21 = kVarP.P;
            x0.a2 a2VarP2 = kVarP.P();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarD2, kVarP);
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar8);
            } else {
                kVarP.z();
            }
            ph.v1.j(bVar, qVarA2, kVarP);
            ph.v1.j(dVar, a2VarP2, kVarP);
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i21))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i21, kVarP, i21, c0128a);
            }
            ph.v1.j(cVar, dVarC2, kVarP);
            kVarP.L(-1624178773);
            int i22 = 0;
            for (Object obj : listJ) {
                int i23 = i22 + 1;
                if (i22 < 0) {
                    qg.p.o();
                    throw null;
                }
                r.v1 v1VarC = r.w0.c(s.m.d(CropImageView.DEFAULT_IMAGE_TO_CROP_BOUNDS_ANIM_DURATION, (i22 * 60) + DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE, null, 4), 2);
                boolean z13 = z12;
                androidx.compose.animation.d.b(sVar, z11, null, v1VarC, null, null, f1.c.b(42591938, new z0((y) obj, z13), kVarP), kVarP, i15, 26);
                i22 = i23;
                z12 = z13;
            }
            z.s sVar3 = sVar;
            boolean z14 = z12;
            kVarP.T(false);
            androidx.compose.animation.d.b(sVar3, z11, null, r.w0.c(s.m.d(CropImageView.DEFAULT_IMAGE_TO_CROP_BOUNDS_ANIM_DURATION, CropImageView.DEFAULT_IMAGE_TO_CROP_BOUNDS_ANIM_DURATION, null, 4), 2), null, null, f1.c.b(992780094, new c1(n1Var, z14), kVarP), kVarP, i16, 26);
            androidx.compose.animation.d.b(sVar3, g(n1Var), null, r.w0.b(s.m.d(380, 0, null, 6), 14).b(r.w0.c(s.m.d(380, 0, null, 6), 2)), r.w0.g(s.m.d(280, 0, null, 6), 14).b(r.w0.d(s.m.d(280, 0, null, 6), 2)), null, f1.c.b(-837056075, new d1(listJ2, z14), kVarP), kVarP, 1600518, 18);
            kVarP.T(true);
            p1.d.b(androidx.compose.foundation.layout.g.f(aVar7, 24), kVarP);
            androidx.compose.animation.d.b(sVar3, z11, null, r.w0.c(s.m.d(700, 800, null, 4), 2), null, null, f1.c.b(-1829542847, new e1(str, aVar2, z10, z14, aVar3, str2, aVar4), kVarP), kVarP, i16, 26);
            float f11 = 12;
            p1.d.b(androidx.compose.foundation.layout.g.f(aVar7, f11), kVarP);
            b((i11 >> 3) & 14, aVar, kVarP);
            float f12 = 4;
            p1.d.b(androidx.compose.foundation.layout.g.f(aVar7, f12), kVarP);
            t0.x0.d(aVar6, androidx.compose.foundation.layout.f.l(aVar7, CropImageView.DEFAULT_ASPECT_RATIO, f12, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), false, null, null, null, c.f152g, kVarP, (i12 & 14) | 805306416, 508);
            p1.d.b(androidx.compose.foundation.layout.g.f(aVar7, f11), kVarP);
            androidx.compose.animation.d.b(sVar3, z11, null, r.w0.c(s.m.d(700, 900, null, 4), 2), null, null, f1.c.b(1046100418, new f1(aVar2, z10, str, str2, aVar5), kVarP), kVarP, i16, 26);
            p1.d.b(androidx.compose.foundation.layout.g.f(aVar7, f10), kVarP);
            androidx.compose.animation.d.b(sVar3, z11, null, r.w0.c(s.m.d(700, DescriptorProtos.Edition.EDITION_2023_VALUE, null, 4), 2), null, null, c.f156k, kVarP, i16, 26);
            kVarP.L(606327425);
            kVarP.T(false);
            kVarP.T(true);
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(aVar, str, str2, aVar2, z10, z11, aVar3, aVar4, aVar5, aVar6, pVar, i10) { // from class: a9.a0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ eh.a f116b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ String f117c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ String f118d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ i8.a f119e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ boolean f120f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ boolean f121g;

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ eh.a f122h;

                /* renamed from: j, reason: collision with root package name */
                public final /* synthetic */ eh.a f123j;

                /* renamed from: k, reason: collision with root package name */
                public final /* synthetic */ eh.a f124k;

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ eh.a f125l;

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ eh.p f126m;

                @Override // eh.p
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    v0.f(this.f115a, this.f116b, this.f117c, this.f118d, this.f119e, this.f120f, this.f121g, this.f122h, this.f123j, this.f124k, this.f125l, this.f126m, (x0.j) obj2, f3.i.n(9));
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final boolean g(x0.n1<Boolean> n1Var) {
        return n1Var.getValue().booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void h(final p5.x navController, b2 b2Var, x0.j jVar, final int i10) {
        b2 b2Var2;
        String str;
        final b2 b2Var3;
        ArrayList arrayList;
        k.d dVar;
        k.c cVar;
        ArrayList arrayList2;
        k.b bVar;
        String str2;
        k.a aVarA;
        kotlin.jvm.internal.r.e(navController, "navController");
        x0.k kVarP = jVar.p(1883395054);
        if ((((kVarP.l(navController) ? 4 : 2) | i10 | 16) & 19) == 18 && kVarP.s()) {
            kVarP.v();
            b2Var3 = b2Var;
        } else {
            kVarP.r0();
            if ((i10 & 1) == 0 || kVarP.a0()) {
                kVarP.e(1890788296);
                androidx.lifecycle.b1 b1VarA = k5.b.a(kVarP);
                if (b1VarA == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ig.b bVarA = f5.a.a(b1VarA, kVarP);
                kVarP.e(1729797275);
                androidx.lifecycle.w0 w0VarB = k5.c.b(b2.class, b1VarA, bVarA, b1VarA instanceof androidx.lifecycle.i ? ((androidx.lifecycle.i) b1VarA).getDefaultViewModelCreationExtras() : a.C0143a.f15159b, kVarP);
                kVarP.T(false);
                kVarP.T(false);
                b2Var2 = (b2) w0VarB;
            } else {
                kVarP.v();
                b2Var2 = b2Var;
            }
            kVarP.U();
            Context context = (Context) kVarP.f(AndroidCompositionLocals_androidKt.f1281b);
            x0.n1 n1VarB = bg.b.b(b2Var2.f141e, kVarP);
            x0.n1 n1VarB2 = bg.b.b(b2Var2.f142f, kVarP);
            x0.n1 n1VarB3 = bg.b.b(b2Var2.f143g, kVarP);
            x0.n1 n1VarB4 = bg.b.b(b2Var2.f144h, kVarP);
            x0.n1 n1VarB5 = bg.b.b(b2Var2.f145i, kVarP);
            Object[] objArr = new Object[0];
            kVarP.L(-1406656010);
            Object objG = kVarP.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (objG == c0321a) {
                objG = new k0(0);
                kVarP.C(objG);
            }
            kVarP.T(false);
            x0.n1 n1Var = (x0.n1) b0.a0.d(objArr, null, (eh.a) objG, kVarP, 3072, 6);
            d8.k kVar = (d8.k) ((Map) n1VarB4.getValue()).get("premium_upgrade");
            d8.k kVar2 = (d8.k) ((Map) n1VarB4.getValue()).get("pro_subscription_monthly");
            if (kVar == null || (aVarA = kVar.a()) == null || (str = aVarA.f7511a) == null) {
                str = "";
            }
            String str3 = (kVar2 == null || (arrayList = kVar2.f7509h) == null || (dVar = (k.d) qg.x.D(arrayList)) == null || (cVar = dVar.f7519b) == null || (arrayList2 = cVar.f7517a) == null || (bVar = (k.b) qg.x.K(arrayList2)) == null || (str2 = bVar.f7516a) == null) ? "" : str2;
            pg.f0 f0Var = pg.f0.f21461a;
            kVarP.L(-1406644902);
            boolean zK = kVarP.K(n1Var);
            Object objG2 = kVarP.g();
            b2 b2Var4 = b2Var2;
            if (zK || objG2 == c0321a) {
                objG2 = new g1(n1Var, null);
                kVarP.C(objG2);
            }
            kVarP.T(false);
            x0.o0.d((eh.p) objG2, f0Var, kVarP);
            boolean z10 = mh.x.A(str) || mh.x.A(str3);
            kVarP.L(-1406634146);
            Object objG3 = kVarP.g();
            if (objG3 == c0321a) {
                objG3 = bg.b.h(Boolean.TRUE);
                kVarP.C(objG3);
            }
            x0.n1 n1Var2 = (x0.n1) objG3;
            kVarP.T(false);
            i8.a aVar = (i8.a) n1VarB.getValue();
            Boolean boolValueOf = Boolean.valueOf(z10);
            kVarP.L(-1406631219);
            boolean zK2 = kVarP.K(n1VarB) | kVarP.c(z10);
            Object objG4 = kVarP.g();
            if (zK2 || objG4 == c0321a) {
                objG4 = new h1(z10, n1Var2, n1VarB, null);
                kVarP.C(objG4);
            }
            kVarP.T(false);
            x0.o0.e(aVar, boolValueOf, (eh.p) objG4, kVarP);
            f1.b bVarB = f1.c.b(620024490, new k1(navController), kVarP);
            long j10 = q1.b1.f21653g;
            z.z zVar = new z.z();
            b2Var3 = b2Var4;
            f1.b bVarB2 = f1.c.b(-1865608321, new v1(navController, context, b2Var3, n1VarB2, n1VarB3, str, str3, n1VarB5, n1VarB, n1Var2, n1Var), kVarP);
            kVarP = kVarP;
            ra.a(null, bVarB, null, null, null, 0, j10, 0L, zVar, bVarB2, kVarP, 806879280, 189);
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(b2Var3, i10) { // from class: a9.l0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ b2 f257b;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    v0.h(this.f256a, this.f257b, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void i(final String str, final String str2, final String str3, final boolean z10, String str4, final String str5, final long j10, final String str6, boolean z11, final boolean z12, final eh.a aVar, x0.j jVar, final int i10, final int i11, final int i12) {
        String str7;
        int i13;
        final boolean z13;
        boolean z14;
        int i14;
        final String str8;
        h2 h2VarV;
        x0.k kVarP = jVar.p(-1936185837);
        int i15 = i10 | (kVarP.K(str) ? 4 : 2) | (kVarP.K(str2) ? 32 : 16) | (kVarP.K(str3) ? 256 : 128) | (kVarP.c(z10) ? 2048 : 1024);
        int i16 = i12 & 16;
        if (i16 != 0) {
            i13 = i15 | 24576;
            str7 = str4;
        } else {
            str7 = str4;
            i13 = i15 | (kVarP.K(str7) ? 16384 : 8192);
        }
        int i17 = i13 | 1769472 | (kVarP.K(str5) ? 8388608 : 4194304) | (kVarP.j(j10) ? 67108864 : 33554432) | (kVarP.K(str6) ? PKIFailureInfo.duplicateCertReq : 268435456);
        int i18 = i12 & 1024;
        if (i18 != 0) {
            i14 = 6;
            z13 = z11;
        } else {
            z13 = z11;
            if ((i11 & 6) != 0) {
                z14 = z12;
                i14 = i11;
                int i19 = i14 | (!kVarP.c(z14) ? 32 : 16) | (!kVarP.l(aVar) ? 256 : 128);
                if ((i17 & 306783379) != 306783378 && (i19 & 147) == 146 && kVarP.s()) {
                    kVarP.v();
                    str8 = str7;
                } else {
                    String str9 = i16 == 0 ? null : str7;
                    boolean z15 = i18 == 0 ? false : z13;
                    boolean zA = ((k9.e) kVarP.f(k9.c.f16178b)).a();
                    androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f);
                    h0.e eVarA = h0.f.a(24);
                    kVarP.L(-1434466389);
                    long jC = !zA ? q1.b1.c(0.85f, ((e2) kVarP.f(f2.f25858a)).f25770p) : q1.b1.c(0.95f, q1.b1.f21650d);
                    kVarP.T(false);
                    t0.y0 y0VarA = t0.z0.a(jC, kVarP, 0);
                    float f10 = 1;
                    kVarP.L(-1434458735);
                    long jC2 = !zA ? q1.b1.c(0.4f, ((e2) kVarP.f(f2.f25858a)).B) : q1.b1.c(0.08f, q1.b1.f21648b);
                    kVarP.T(false);
                    t0.d1.a(dVarD, eVarA, y0VarA, t0.z0.b(zA ? 0 : 2, 62), d2.a(f10, jC2), f1.c.b(1074698373, new y1(z15, aVar, z14, zA, j10, str, str2, str5, str3, str9, z10, str6), kVarP), kVarP, 196614, 0);
                    z13 = z15;
                    str8 = str9;
                }
                h2VarV = kVarP.V();
                if (h2VarV == null) {
                    h2VarV.f31703d = new eh.p(str, str2, str3, z10, str8, str5, j10, str6, z13, z12, aVar, i10, i11, i12) { // from class: a9.h0

                        /* renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ String f219a;

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ String f220b;

                        /* renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ String f221c;

                        /* renamed from: d, reason: collision with root package name */
                        public final /* synthetic */ boolean f222d;

                        /* renamed from: e, reason: collision with root package name */
                        public final /* synthetic */ String f223e;

                        /* renamed from: f, reason: collision with root package name */
                        public final /* synthetic */ String f224f;

                        /* renamed from: g, reason: collision with root package name */
                        public final /* synthetic */ long f225g;

                        /* renamed from: h, reason: collision with root package name */
                        public final /* synthetic */ String f226h;

                        /* renamed from: j, reason: collision with root package name */
                        public final /* synthetic */ boolean f227j;

                        /* renamed from: k, reason: collision with root package name */
                        public final /* synthetic */ boolean f228k;

                        /* renamed from: l, reason: collision with root package name */
                        public final /* synthetic */ eh.a f229l;

                        /* renamed from: m, reason: collision with root package name */
                        public final /* synthetic */ int f230m;

                        /* renamed from: n, reason: collision with root package name */
                        public final /* synthetic */ int f231n;

                        {
                            this.f230m = i11;
                            this.f231n = i12;
                        }

                        @Override // eh.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iN = f3.i.n(1);
                            int iN2 = f3.i.n(this.f230m);
                            v0.i(this.f219a, this.f220b, this.f221c, this.f222d, this.f223e, this.f224f, this.f225g, this.f226h, this.f227j, this.f228k, this.f229l, (x0.j) obj, iN, iN2, this.f231n);
                            return pg.f0.f21461a;
                        }
                    };
                    return;
                }
                return;
            }
            i14 = i11 | (kVarP.c(z13) ? 4 : 2);
        }
        z14 = z12;
        int i192 = i14 | (!kVarP.c(z14) ? 32 : 16) | (!kVarP.l(aVar) ? 256 : 128);
        if ((i17 & 306783379) != 306783378) {
            if (i16 == 0) {
            }
            if (i18 == 0) {
            }
            boolean zA2 = ((k9.e) kVarP.f(k9.c.f16178b)).a();
            androidx.compose.ui.d dVarD2 = androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f);
            h0.e eVarA2 = h0.f.a(24);
            kVarP.L(-1434466389);
            if (!zA2) {
            }
            kVarP.T(false);
            t0.y0 y0VarA2 = t0.z0.a(jC, kVarP, 0);
            float f102 = 1;
            kVarP.L(-1434458735);
            if (!zA2) {
            }
            kVarP.T(false);
            t0.d1.a(dVarD2, eVarA2, y0VarA2, t0.z0.b(zA2 ? 0 : 2, 62), d2.a(f102, jC2), f1.c.b(1074698373, new y1(z15, aVar, z14, zA2, j10, str, str2, str5, str3, str9, z10, str6), kVarP), kVarP, 196614, 0);
            z13 = z15;
            str8 = str9;
        }
        h2VarV = kVarP.V();
        if (h2VarV == null) {
        }
    }

    public static final String j(y yVar, x0.j jVar) {
        String strD;
        jVar.L(-2142372171);
        List<Object> list = yVar.f369d;
        int i10 = yVar.f368c;
        if (list.isEmpty()) {
            strD = com.google.crypto.tink.shaded.protobuf.t0.b(jVar, -259985571, i10, jVar);
        } else {
            jVar.L(-259984423);
            Object[] array = yVar.f369d.toArray(new Object[0]);
            strD = f3.q.d(i10, Arrays.copyOf(array, array.length), jVar);
            jVar.B();
        }
        jVar.B();
        return strD;
    }
}
