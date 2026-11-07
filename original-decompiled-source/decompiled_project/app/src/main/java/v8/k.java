package v8;

import a9.d2;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.d;
import c2.n0;
import c9.u1;
import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.domain.model.ProjectKind;
import com.yalantis.ucrop.view.CropImageView;
import f9.ma;
import f9.ra;
import f9.z0;
import g2.l0;
import i2.e0;
import i2.g;
import j1.d;
import j1.f;
import j2.c3;
import j2.j2;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.r;
import m9.p1;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.x509.DisplayText;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumEngine;
import p0.g4;
import p0.m4;
import p0.p7;
import p0.tb;
import p0.y;
import pg.f0;
import ph.i0;
import ph.v1;
import q1.b1;
import q1.i2;
import q1.l1;
import q1.y1;
import q8.o1;
import r.h0;
import r.w0;
import s.d0;
import s.m2;
import t.v;
import t.w;
import t0.e2;
import t0.f2;
import t0.ff;
import t0.md;
import t0.nf;
import t0.of;
import t0.s4;
import t0.t4;
import t0.x0;
import t0.z9;
import w1.d;
import w1.g;
import x0.a2;
import x0.h2;
import x0.j;
import x0.m0;
import x0.n1;
import x0.o0;
import x0.s3;
import x0.w2;
import x0.x1;
import z.b;
import z.k1;
import z.m1;
import z.s;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final m0 f30705a = new m0(new b8.p(1));

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.create.CreateHubOverlayKt$CreateHubOverlay$1$1", f = "CreateHubOverlay.kt", l = {148, 149, 151, 152, 154}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<i0, tg.e<? super f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f30706a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ q f30707b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ s.b<Float, s.o> f30708c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ s.b<Float, s.o> f30709d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f30710e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q qVar, s.b<Float, s.o> bVar, s.b<Float, s.o> bVar2, boolean z10, tg.e<? super a> eVar) {
            super(2, eVar);
            this.f30707b = qVar;
            this.f30708c = bVar;
            this.f30709d = bVar2;
            this.f30710e = z10;
        }

        @Override // vg.a
        public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
            return new a(this.f30707b, this.f30708c, this.f30709d, this.f30710e, eVar);
        }

        @Override // eh.p
        public final Object invoke(i0 i0Var, tg.e<? super f0> eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x007a, code lost:
        
            if (s.b.c(r14.f30709d, r1, r2, null, r14, 12) != r6) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00b4, code lost:
        
            if (r14.f30709d.f(r0, r14) != r6) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00d7, code lost:
        
            if (s.b.c(r14.f30709d, r1, r2, null, r14, 12) == r6) goto L43;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0066  */
        @Override // vg.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f30706a;
            boolean z10 = this.f30710e;
            if (i10 == 0) {
                pg.q.b(obj);
                q qVar = this.f30707b;
                if (((Boolean) qVar.f30739c.getValue()).booleanValue()) {
                    Float f10 = new Float(1.0f);
                    this.f30706a = 1;
                    if (this.f30708c.f(f10, this) != aVar) {
                        Float f11 = new Float(1.0f);
                        m2 m2VarD = s.m.d(!z10 ? 150 : 420, 0, d0.f23703a, 2);
                        this.f30706a = 2;
                    }
                } else if (((Boolean) qVar.f30740d.getValue()).booleanValue()) {
                    Float f12 = new Float(CropImageView.DEFAULT_ASPECT_RATIO);
                    m2 m2VarD2 = s.m.d(220, 0, null, 6);
                    this.f30706a = 3;
                    if (s.b.c(this.f30708c, f12, m2VarD2, null, this, 12) != aVar) {
                        Float f13 = new Float(CropImageView.DEFAULT_ASPECT_RATIO);
                        this.f30706a = 4;
                    }
                } else {
                    Float f14 = new Float(CropImageView.DEFAULT_ASPECT_RATIO);
                    m2 m2VarD3 = s.m.d(z10 ? 150 : 340, 0, d0.f23703a, 2);
                    this.f30706a = 5;
                }
                return aVar;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        pg.q.b(obj);
                        Float f132 = new Float(CropImageView.DEFAULT_ASPECT_RATIO);
                        this.f30706a = 4;
                    } else if (i10 == 4) {
                        pg.q.b(obj);
                        f0 f0Var = f0.f21461a;
                    } else if (i10 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                pg.q.b(obj);
            } else {
                pg.q.b(obj);
                Float f112 = new Float(1.0f);
                m2 m2VarD4 = s.m.d(!z10 ? 150 : 420, 0, d0.f23703a, 2);
                this.f30706a = 2;
            }
            return f0.f21461a;
        }
    }

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.create.CreateHubOverlayKt$CreateHubOverlay$2$1", f = "CreateHubOverlay.kt", l = {162}, m = "invokeSuspend")
    public static final class b extends vg.i implements eh.p<sh.f<b.c>, tg.e<f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f30711a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f30712b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ q f30713c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ i0 f30714d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ n1<Boolean> f30715e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ s.b<Float, s.o> f30716f;

        public static final class a<T> implements sh.g {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ s.b<Float, s.o> f30717a;

            public a(s.b<Float, s.o> bVar) {
                this.f30717a = bVar;
            }

            @Override // sh.g
            public final Object c(Object obj, tg.e eVar) {
                Object objF = this.f30717a.f(new Float(1.0f - (((b.c) obj).f3219c * 0.15f)), eVar);
                return objF == ug.a.f29706a ? objF : f0.f21461a;
            }
        }

        @vg.e(c = "com.basitce.htmltoapk.ui.screens.create.CreateHubOverlayKt$CreateHubOverlay$2$1$2", f = "CreateHubOverlay.kt", l = {167}, m = "invokeSuspend")
        /* renamed from: v8.k$b$b, reason: collision with other inner class name */
        public static final class C0311b extends vg.i implements eh.p<i0, tg.e<? super f0>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f30718a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s.b<Float, s.o> f30719b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0311b(s.b<Float, s.o> bVar, tg.e<? super C0311b> eVar) {
                super(2, eVar);
                this.f30719b = bVar;
            }

            @Override // vg.a
            public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
                return new C0311b(this.f30719b, eVar);
            }

            @Override // eh.p
            public final Object invoke(i0 i0Var, tg.e<? super f0> eVar) {
                return ((C0311b) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
            }

            @Override // vg.a
            public final Object invokeSuspend(Object obj) {
                ug.a aVar = ug.a.f29706a;
                int i10 = this.f30718a;
                if (i10 == 0) {
                    pg.q.b(obj);
                    Float f10 = new Float(1.0f);
                    m2 m2VarD = s.m.d(DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE, 0, null, 6);
                    this.f30718a = 1;
                    if (s.b.c(this.f30719b, f10, m2VarD, null, this, 12) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pg.q.b(obj);
                }
                return f0.f21461a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(q qVar, i0 i0Var, n1<Boolean> n1Var, s.b<Float, s.o> bVar, tg.e<? super b> eVar) {
            super(2, eVar);
            this.f30713c = qVar;
            this.f30714d = i0Var;
            this.f30715e = n1Var;
            this.f30716f = bVar;
        }

        @Override // vg.a
        public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
            b bVar = new b(this.f30713c, this.f30714d, this.f30715e, this.f30716f, eVar);
            bVar.f30712b = obj;
            return bVar;
        }

        @Override // eh.p
        public final Object invoke(sh.f<b.c> fVar, tg.e<f0> eVar) {
            return ((b) create(fVar, eVar)).invokeSuspend(f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f30711a;
            s.b<Float, s.o> bVar = this.f30716f;
            n1<Boolean> n1Var = this.f30715e;
            try {
                if (i10 == 0) {
                    pg.q.b(obj);
                    sh.f fVar = (sh.f) this.f30712b;
                    m0 m0Var = k.f30705a;
                    n1Var.setValue(Boolean.TRUE);
                    a aVar2 = new a(bVar);
                    this.f30711a = 1;
                    if (fVar.b(aVar2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pg.q.b(obj);
                }
                m0 m0Var2 = k.f30705a;
                Boolean bool = Boolean.FALSE;
                n1Var.setValue(bool);
                q qVar = this.f30713c;
                qVar.f30740d.setValue(bool);
                qVar.f30739c.setValue(bool);
                return f0.f21461a;
            } catch (CancellationException e10) {
                m0 m0Var3 = k.f30705a;
                n1Var.setValue(Boolean.FALSE);
                ph.h.c(this.f30714d, null, null, new C0311b(bVar, null), 3);
                throw e10;
            }
        }
    }

    public static final class c implements eh.q<h0, x0.j, Integer, f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f30720a;

        public c(String str) {
            this.f30720a = str;
        }

        @Override // eh.q
        public final f0 b(h0 h0Var, x0.j jVar, Integer num) {
            h0 AnimatedVisibility = h0Var;
            x0.j jVar2 = jVar;
            num.intValue();
            r.e(AnimatedVisibility, "$this$AnimatedVisibility");
            FillElement fillElement = androidx.compose.foundation.layout.g.f976c;
            s3 s3Var = f2.f25858a;
            androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(fillElement, b1.c(0.85f, ((e2) jVar2.f(s3Var)).f25768n), y1.f21750a);
            l0 l0VarD = z.g.d(d.a.f14606e, false);
            int iD = jVar2.D();
            a2 a2VarY = jVar2.y();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarB, jVar2);
            i2.g.f13861o.getClass();
            e0.a aVar = g.a.f13863b;
            if (jVar2.t() == null) {
                u1.d();
                throw null;
            }
            jVar2.r();
            if (jVar2.m()) {
                jVar2.w(aVar);
            } else {
                jVar2.z();
            }
            g.a.b bVar = g.a.f13867f;
            v1.j(bVar, l0VarD, jVar2);
            g.a.d dVar = g.a.f13866e;
            v1.j(dVar, a2VarY, jVar2);
            g.a.C0128a c0128a = g.a.f13868g;
            if (jVar2.m() || !r.a(jVar2.g(), Integer.valueOf(iD))) {
                l9.i.a(iD, jVar2, iD, c0128a);
            }
            g.a.c cVar = g.a.f13865d;
            v1.j(cVar, dVarC, jVar2);
            z.q qVarA = z.o.a(z.b.f34446c, d.a.f14615n, jVar2, 48);
            int iD2 = jVar2.D();
            a2 a2VarY2 = jVar2.y();
            d.a aVar2 = d.a.f1143b;
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(aVar2, jVar2);
            if (jVar2.t() == null) {
                u1.d();
                throw null;
            }
            jVar2.r();
            if (jVar2.m()) {
                jVar2.w(aVar);
            } else {
                jVar2.z();
            }
            v1.j(bVar, qVarA, jVar2);
            v1.j(dVar, a2VarY2, jVar2);
            if (jVar2.m() || !r.a(jVar2.g(), Integer.valueOf(iD2))) {
                l9.i.a(iD2, jVar2, iD2, c0128a);
            }
            v1.j(cVar, dVarC2, jVar2);
            z9.a(3, 0, 390, 26, 0L, 0L, androidx.compose.foundation.layout.g.n(aVar2, 32), jVar2);
            p1.d.b(androidx.compose.foundation.layout.g.f(aVar2, 14), jVar2);
            String str = this.f30720a;
            if (str == null) {
                str = "";
            }
            ff.b(str, null, ((e2) jVar2.f(s3Var)).f25769o, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar2.f(of.f26647a)).f26545h, jVar2, 0, 0, 65530);
            jVar2.H();
            jVar2.H();
            return f0.f21461a;
        }
    }

    public static final class d implements eh.p<x0.j, Integer, f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f30721a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ eh.p<x0.j, Integer, f0> f30722b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f30723c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ w1.d f30724d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f30725e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f30726f;

        /* JADX WARN: Multi-variable type inference failed */
        public d(long j10, eh.p<? super x0.j, ? super Integer, f0> pVar, boolean z10, w1.d dVar, String str, String str2) {
            this.f30721a = j10;
            this.f30722b = pVar;
            this.f30723c = z10;
            this.f30724d = dVar;
            this.f30725e = str;
            this.f30726f = str2;
        }

        @Override // eh.p
        public final f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                jVar2.L(1120409308);
                final long j10 = this.f30721a;
                boolean zJ = jVar2.j(j10);
                Object objG = jVar2.g();
                j.a.C0321a c0321a = j.a.f31715a;
                if (zJ || objG == c0321a) {
                    objG = new eh.l() { // from class: v8.l
                        @Override // eh.l
                        public final Object invoke(Object obj) {
                            s1.e drawBehind = (s1.e) obj;
                            r.e(drawBehind, "$this$drawBehind");
                            float fN0 = drawBehind.N0(4);
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (drawBehind.i() & BodyPartID.bodyIdMax));
                            s1.e.X0(drawBehind, j10, 0L, (Float.floatToRawIntBits(fN0) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & BodyPartID.bodyIdMax), CropImageView.DEFAULT_ASPECT_RATIO, null, 122);
                            return f0.f21461a;
                        }
                    };
                    jVar2.C(objG);
                }
                jVar2.B();
                d.a aVar = d.a.f1143b;
                androidx.compose.ui.d dVarA = androidx.compose.ui.draw.a.a(aVar, (eh.l) objG);
                b.k kVar = z.b.f34446c;
                f.a aVar2 = d.a.f14614m;
                z.q qVarA = z.o.a(kVar, aVar2, jVar2, 0);
                int iD = jVar2.D();
                a2 a2VarY = jVar2.y();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarA, jVar2);
                i2.g.f13861o.getClass();
                e0.a aVar3 = g.a.f13863b;
                if (jVar2.t() == null) {
                    u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar3);
                } else {
                    jVar2.z();
                }
                g.a.b bVar = g.a.f13867f;
                v1.j(bVar, qVarA, jVar2);
                g.a.d dVar = g.a.f13866e;
                v1.j(dVar, a2VarY, jVar2);
                g.a.C0128a c0128a = g.a.f13868g;
                if (jVar2.m() || !r.a(jVar2.g(), Integer.valueOf(iD))) {
                    l9.i.a(iD, jVar2, iD, c0128a);
                }
                g.a.c cVar = g.a.f13865d;
                v1.j(cVar, dVarC, jVar2);
                float f10 = 16;
                androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.f.h(aVar, f10);
                m1 m1VarA = k1.a(z.b.f34444a, d.a.f14612k, jVar2, 48);
                int iD2 = jVar2.D();
                a2 a2VarY2 = jVar2.y();
                androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarH, jVar2);
                if (jVar2.t() == null) {
                    u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar3);
                } else {
                    jVar2.z();
                }
                v1.j(bVar, m1VarA, jVar2);
                v1.j(dVar, a2VarY2, jVar2);
                if (jVar2.m() || !r.a(jVar2.g(), Integer.valueOf(iD2))) {
                    l9.i.a(iD2, jVar2, iD2, c0128a);
                }
                v1.j(cVar, dVarC2, jVar2);
                androidx.compose.ui.d dVarN = androidx.compose.foundation.layout.g.n(aVar, 48);
                long j11 = this.f30721a;
                androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(dVarN, b1.c(0.15f, j11), h0.f.a(14));
                l0 l0VarD = z.g.d(d.a.f14606e, false);
                int iD3 = jVar2.D();
                a2 a2VarY3 = jVar2.y();
                androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(dVarB, jVar2);
                if (jVar2.t() == null) {
                    u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar3);
                } else {
                    jVar2.z();
                }
                v1.j(bVar, l0VarD, jVar2);
                v1.j(dVar, a2VarY3, jVar2);
                if (jVar2.m() || !r.a(jVar2.g(), Integer.valueOf(iD3))) {
                    l9.i.a(iD3, jVar2, iD3, c0128a);
                }
                v1.j(cVar, dVarC3, jVar2);
                t4.b(this.f30724d, null, androidx.compose.foundation.layout.g.n(aVar, 26), j11, jVar2, 432, 0);
                jVar2.H();
                p1.d.b(androidx.compose.foundation.layout.g.r(aVar, f10), jVar2);
                if (1.0f <= 0.0d) {
                    a0.a.a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                z.q qVarA2 = z.o.a(kVar, aVar2, jVar2, 0);
                int iD4 = jVar2.D();
                a2 a2VarY4 = jVar2.y();
                androidx.compose.ui.d dVarC4 = androidx.compose.ui.c.c(layoutWeightElement, jVar2);
                if (jVar2.t() == null) {
                    u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar3);
                } else {
                    jVar2.z();
                }
                v1.j(bVar, qVarA2, jVar2);
                v1.j(dVar, a2VarY4, jVar2);
                if (jVar2.m() || !r.a(jVar2.g(), Integer.valueOf(iD4))) {
                    l9.i.a(iD4, jVar2, iD4, c0128a);
                }
                v1.j(cVar, dVarC4, jVar2);
                s3 s3Var = of.f26647a;
                t2.l0 l0Var = ((nf) jVar2.f(s3Var)).f26545h;
                x2.p pVar = x2.p.f32033f;
                s3 s3Var2 = f2.f25858a;
                ff.b(this.f30725e, null, ((e2) jVar2.f(s3Var2)).f25771q, 0L, pVar, null, 0L, null, 0L, 0, false, 0, 0, l0Var, jVar2, 196608, 0, 65498);
                p1.d.b(androidx.compose.foundation.layout.g.f(aVar, 2), jVar2);
                ff.b(this.f30726f, null, ((e2) jVar2.f(s3Var2)).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar2.f(s3Var)).f26549l, jVar2, 0, 0, 65530);
                x0.j jVar3 = jVar2;
                jVar3.H();
                w1.d dVarA2 = n0.e.a();
                long j12 = ((e2) jVar3.f(s3Var2)).f25773s;
                jVar3.L(981868360);
                final boolean z10 = this.f30723c;
                boolean zC = jVar3.c(z10);
                Object objG2 = jVar3.g();
                if (zC || objG2 == c0321a) {
                    objG2 = new eh.l() { // from class: v8.m
                        @Override // eh.l
                        public final Object invoke(Object obj) {
                            l1 graphicsLayer = (l1) obj;
                            r.e(graphicsLayer, "$this$graphicsLayer");
                            graphicsLayer.b(z10 ? 90.0f : CropImageView.DEFAULT_ASPECT_RATIO);
                            return f0.f21461a;
                        }
                    };
                    jVar3.C(objG2);
                }
                jVar3.B();
                t4.b(dVarA2, null, androidx.compose.ui.graphics.a.a(aVar, (eh.l) objG2), j12, jVar3, 48, 0);
                jVar3.H();
                jVar3.L(1919772855);
                eh.p<x0.j, Integer, f0> pVar2 = this.f30722b;
                if (pVar2 != null) {
                    androidx.compose.animation.d.b(s.f34624a, z10, null, w0.b(null, 15).b(w0.c(null, 3)), w0.g(null, 15).b(w0.d(null, 3)), null, f1.c.b(-449821600, new n(pVar2), jVar3), jVar3, 1600518, 18);
                    jVar3 = jVar3;
                }
                jVar3.B();
                jVar3.H();
            }
            return f0.f21461a;
        }
    }

    public static final class e implements eh.p<x0.j, Integer, f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q8.l1 f30727a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ eh.l<String, f0> f30728b;

        /* JADX WARN: Multi-variable type inference failed */
        public e(q8.l1 l1Var, eh.l<? super String, f0> lVar) {
            this.f30727a = l1Var;
            this.f30728b = lVar;
        }

        @Override // eh.p
        public final f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                float f10 = 16;
                androidx.compose.ui.d dVarL = androidx.compose.foundation.layout.f.l(androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f), f10, CropImageView.DEFAULT_ASPECT_RATIO, f10, f10, 2);
                m1 m1VarA = k1.a(z.b.h(8), d.a.f14611j, jVar2, 6);
                int iD = jVar2.D();
                a2 a2VarY = jVar2.y();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarL, jVar2);
                i2.g.f13861o.getClass();
                e0.a aVar = g.a.f13863b;
                if (jVar2.t() == null) {
                    u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar);
                } else {
                    jVar2.z();
                }
                v1.j(g.a.f13867f, m1VarA, jVar2);
                v1.j(g.a.f13866e, a2VarY, jVar2);
                g.a.C0128a c0128a = g.a.f13868g;
                if (jVar2.m() || !r.a(jVar2.g(), Integer.valueOf(iD))) {
                    l9.i.a(iD, jVar2, iD, c0128a);
                }
                v1.j(g.a.f13865d, dVarC, jVar2);
                w1.d dVarA = m4.a();
                String strC = f3.q.c(R.string.create_hub_html_open, jVar2);
                q8.l1 l1Var = this.f30727a;
                long j10 = l1Var.f22292a;
                if (1.0f <= 0.0d) {
                    a0.a.a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                jVar2.L(-1413167850);
                eh.l<String, f0> lVar = this.f30728b;
                boolean zK = jVar2.K(lVar);
                Object objG = jVar2.g();
                j.a.C0321a c0321a = j.a.f31715a;
                if (zK || objG == c0321a) {
                    objG = new o(lVar, 0);
                    jVar2.C(objG);
                }
                jVar2.B();
                k.e(dVarA, strC, j10, layoutWeightElement, (eh.a) objG, jVar2, 0);
                w1.d dVarB = p7.f20987a;
                if (dVarB == null) {
                    d.a aVar2 = new d.a("Filled.NoteAdd", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i10 = w1.m.f31210a;
                    i2 i2Var = new i2(b1.f21648b);
                    w1.e eVarA = p0.m.a(14.0f, 2.0f, 6.0f, 2.0f);
                    eVarA.c(-1.1f, CropImageView.DEFAULT_ASPECT_RATIO, -1.99f, 0.9f, -1.99f, 2.0f);
                    eVarA.f(4.0f, 20.0f);
                    eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.1f, 0.89f, 2.0f, 1.99f, 2.0f);
                    eVarA.f(18.0f, 22.0f);
                    eVarA.c(1.1f, CropImageView.DEFAULT_ASPECT_RATIO, 2.0f, -0.9f, 2.0f, -2.0f);
                    eVarA.f(20.0f, 8.0f);
                    eVarA.g(-6.0f, -6.0f);
                    eVarA.a();
                    p0.n.a(eVarA, 16.0f, 16.0f, -3.0f, 3.0f);
                    eVarA.e(-2.0f);
                    eVarA.l(-3.0f);
                    eVarA.f(8.0f, 16.0f);
                    eVarA.l(-2.0f);
                    eVarA.e(3.0f);
                    eVarA.l(-3.0f);
                    eVarA.e(2.0f);
                    eVarA.l(3.0f);
                    eVarA.e(3.0f);
                    eVarA.l(2.0f);
                    eVarA.a();
                    eVarA.h(13.0f, 9.0f);
                    eVarA.f(13.0f, 3.5f);
                    p0.f0.a(eVarA, 18.5f, 9.0f, 13.0f, 9.0f);
                    d.a.a(aVar2, eVarA.f31100a, 0, i2Var);
                    dVarB = aVar2.b();
                    p7.f20987a = dVarB;
                }
                String strC2 = f3.q.c(R.string.create_hub_html_blank, jVar2);
                long j11 = l1Var.f22292a;
                if (1.0f <= 0.0d) {
                    a0.a.a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                jVar2.L(-1413160777);
                boolean zK2 = jVar2.K(lVar);
                Object objG2 = jVar2.g();
                if (zK2 || objG2 == c0321a) {
                    objG2 = new b9.j(lVar, 1);
                    jVar2.C(objG2);
                }
                jVar2.B();
                k.e(dVarB, strC2, j11, layoutWeightElement2, (eh.a) objG2, jVar2, 0);
                jVar2.H();
            }
            return f0.f21461a;
        }
    }

    public static final class f implements eh.q<z.n1, x0.j, Integer, f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ w1.d f30729a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f30730b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f30731c;

        public f(w1.d dVar, long j10, String str) {
            this.f30729a = dVar;
            this.f30730b = j10;
            this.f30731c = str;
        }

        @Override // eh.q
        public final f0 b(z.n1 n1Var, x0.j jVar, Integer num) {
            z.n1 OutlinedButton = n1Var;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            r.e(OutlinedButton, "$this$OutlinedButton");
            if ((iIntValue & 17) == 16 && jVar2.s()) {
                jVar2.v();
            } else {
                d.a aVar = d.a.f1143b;
                t4.b(this.f30729a, null, androidx.compose.foundation.layout.g.n(aVar, 18), this.f30730b, jVar2, 432, 0);
                p1.d.b(androidx.compose.foundation.layout.g.r(aVar, 6), jVar2);
                ff.b(this.f30731c, null, ((e2) jVar2.f(f2.f25858a)).f25771q, 0L, null, null, 0L, null, 0L, 0, false, 1, 0, null, jVar2, 0, 3072, 122874);
            }
            return f0.f21461a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final z.i iVar, final q qVar, x0.j jVar, final int i10) {
        int i11;
        i0 i0Var;
        boolean z10;
        boolean z11;
        final q qVar2;
        Object obj;
        n1 n1Var;
        x1 x1Var;
        int i12;
        n1 n1Var2;
        x0.k kVar;
        final q state = qVar;
        r.e(iVar, "<this>");
        r.e(state, "state");
        x1 x1Var2 = state.f30742f;
        x1 x1Var3 = state.f30739c;
        x0.k kVarP = jVar.p(-2082756760);
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
            kVar = kVarP;
        } else {
            kVarP.L(-797555019);
            Object objG = kVarP.g();
            Object obj2 = j.a.f31715a;
            if (objG == obj2) {
                objG = s.d.a(CropImageView.DEFAULT_ASPECT_RATIO);
                kVarP.C(objG);
            }
            s.b bVar = (s.b) objG;
            Object objA = p0.h.a(kVarP, false, -797553611);
            if (objA == obj2) {
                objA = s.d.a(1.0f);
                kVarP.C(objA);
            }
            s.b bVar2 = (s.b) objA;
            kVarP.T(false);
            Object objG2 = kVarP.g();
            if (objG2 == obj2) {
                x0.l0 l0Var = o0.f31834a;
                Object w2Var = new w2(kVarP.x());
                kVarP.C(w2Var);
                objG2 = w2Var;
            }
            i0 i0Var2 = (i0) objG2;
            boolean zA = q8.x1.a(kVarP);
            kVarP.L(-797549028);
            Object objG3 = kVarP.g();
            if (objG3 == obj2) {
                objG3 = bg.b.h(Boolean.FALSE);
                kVarP.C(objG3);
            }
            n1 n1Var3 = (n1) objG3;
            kVarP.T(false);
            Boolean bool = (Boolean) x1Var3.getValue();
            bool.getClass();
            kVarP.L(-797546441);
            int i13 = i11 & 112;
            boolean zL = (i13 == 32) | kVarP.l(bVar2) | kVarP.l(bVar) | kVarP.c(zA);
            Object objG4 = kVarP.g();
            if (zL || objG4 == obj2) {
                i0Var = i0Var2;
                objG4 = new a(state, bVar2, bVar, zA, null);
                z10 = zA;
                kVarP.C(objG4);
            } else {
                z10 = zA;
                i0Var = i0Var2;
            }
            kVarP.T(false);
            o0.d((eh.p) objG4, bool, kVarP);
            boolean z12 = ((Boolean) x1Var3.getValue()).booleanValue() && ((String) x1Var2.getValue()) == null;
            kVarP.L(-797527644);
            i0 i0Var3 = i0Var;
            boolean zL2 = kVarP.l(bVar) | (i13 == 32) | kVarP.l(i0Var3);
            Object objG5 = kVarP.g();
            if (zL2 || objG5 == obj2) {
                z11 = z10;
                qVar2 = qVar;
                obj = bVar2;
                Object bVar3 = new b(qVar2, i0Var3, n1Var3, bVar, null);
                n1Var = n1Var3;
                bVar = bVar;
                kVarP.C(bVar3);
                objG5 = bVar3;
            } else {
                obj = bVar2;
                n1Var = n1Var3;
                z11 = z10;
                qVar2 = qVar;
            }
            kVarP.T(false);
            c.s.a(z12, (eh.p) objG5, kVarP, 0);
            final float fFloatValue = ((Number) bVar.d()).floatValue();
            if (fFloatValue == CropImageView.DEFAULT_ASPECT_RATIO && !((Boolean) x1Var3.getValue()).booleanValue()) {
                h2 h2VarV = kVarP.V();
                if (h2VarV != null) {
                    h2VarV.f31703d = new eh.p() { // from class: v8.b
                        @Override // eh.p
                        public final Object invoke(Object obj3, Object obj4) {
                            ((Integer) obj4).intValue();
                            int iN = f3.i.n(i10 | 1);
                            k.a(iVar, qVar2, (x0.j) obj3, iN);
                            return f0.f21461a;
                        }
                    };
                    return;
                }
                return;
            }
            final long j10 = ((e2) kVarP.f(f2.f25858a)).f25768n;
            final p1.e eVar = (p1.e) qVar2.f30737a.getValue();
            final float fN0 = ((f3.d) kVarP.f(j2.f14779h)).N0(16);
            androidx.compose.ui.d dVarE = iVar.e();
            kVarP.L(-797504298);
            boolean zL3 = kVarP.l(obj);
            Object objG6 = kVarP.g();
            if (zL3 || objG6 == obj2) {
                x1Var = x1Var2;
                i12 = 1;
                objG6 = new ma(obj, 1);
                kVarP.C(objG6);
            } else {
                x1Var = x1Var2;
                i12 = 1;
            }
            kVarP.T(false);
            androidx.compose.ui.d dVarA = androidx.compose.ui.graphics.a.a(dVarE, (eh.l) objG6);
            kVarP.L(-797499231);
            Object objG7 = kVarP.g();
            if (objG7 == obj2) {
                objG7 = new x.n();
                kVarP.C(objG7);
            }
            x.m mVar = (x.m) objG7;
            Object objA2 = p0.h.a(kVarP, false, -797497348);
            if (objA2 == obj2) {
                objA2 = new f9.k1(i12);
                kVarP.C(objA2);
            }
            kVarP.T(false);
            androidx.compose.ui.d dVarB = androidx.compose.foundation.b.b(dVarA, mVar, null, false, null, (eh.a) objA2, 28);
            l0 l0VarD = z.g.d(d.a.f14602a, false);
            int i14 = kVarP.P;
            a2 a2VarP = kVarP.P();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarB, kVarP);
            i2.g.f13861o.getClass();
            n1 n1Var4 = n1Var;
            e0.a aVar = g.a.f13863b;
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar);
            } else {
                kVarP.z();
            }
            v1.j(g.a.f13867f, l0VarD, kVarP);
            v1.j(g.a.f13866e, a2VarP, kVarP);
            g.a.C0128a c0128a = g.a.f13868g;
            if (kVarP.O || !r.a(kVarP.g(), Integer.valueOf(i14))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i14, kVarP, i14, c0128a);
            }
            v1.j(g.a.f13865d, dVarC, kVarP);
            androidx.compose.foundation.layout.b bVar4 = androidx.compose.foundation.layout.b.f961a;
            androidx.compose.ui.d dVarE2 = bVar4.e();
            kVarP.L(-1472394038);
            boolean zC = kVarP.c(z11) | kVarP.K(eVar) | kVarP.j(j10) | kVarP.h(fFloatValue) | (i13 == 32) | kVarP.h(fN0);
            Object objG8 = kVarP.g();
            if (zC || objG8 == obj2) {
                n1Var2 = n1Var4;
                final boolean z13 = z11;
                Object obj3 = new eh.l() { // from class: v8.g
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // eh.l
                    public final Object invoke(Object obj4) {
                        p1.e eVar2;
                        s1.e Canvas = (s1.e) obj4;
                        r.e(Canvas, "$this$Canvas");
                        p1.e eVarA = p1.f.a(0L, Canvas.i());
                        boolean z14 = z13;
                        long j11 = j10;
                        float f10 = fFloatValue;
                        if (z14 || (eVar2 = eVar) == null) {
                            s1.e.X0(Canvas, b1.c(f10, j11), 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, 126);
                        } else {
                            p1.e eVarB = p1.f.b(eVar2, eVarA, f10);
                            long jG = n0.g(((b1) qVar.f30738b.getValue()).f21656a, j11, jh.j.l((f10 - 0.15f) / 0.6f, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f));
                            long jE = eVarB.e();
                            long jFloatToRawIntBits = (Float.floatToRawIntBits(eVarB.f21133c - eVarB.f21131a) << 32) | (Float.floatToRawIntBits(eVarB.f21134d - eVarB.f21132b) & BodyPartID.bodyIdMax);
                            float fB = h3.b.b(fN0, CropImageView.DEFAULT_ASPECT_RATIO, f10);
                            Canvas.B1(jG, (240 & 2) != 0 ? 0L : jE, jFloatToRawIntBits, (Float.floatToRawIntBits(fB) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(fB) << 32), (240 & 16) != 0 ? s1.h.f24186a : null, (240 & 32) != 0 ? 1.0f : CropImageView.DEFAULT_ASPECT_RATIO);
                        }
                        return f0.f21461a;
                    }
                };
                state = qVar;
                kVarP.C(obj3);
                objG8 = obj3;
            } else {
                state = qVar;
                n1Var2 = n1Var4;
            }
            kVarP.T(false);
            w.a(dVarE2, (eh.l) objG8, kVarP, 0);
            kVarP.L(-1472367463);
            boolean z14 = i13 == 32;
            Object objG9 = kVarP.g();
            if (z14 || objG9 == obj2) {
                objG9 = new g7.d(1, state, n1Var2);
                kVarP.C(objG9);
            }
            eh.a aVar2 = (eh.a) objG9;
            kVarP.T(false);
            kVarP.L(-1472364614);
            boolean z15 = i13 == 32;
            Object objG10 = kVarP.g();
            if (z15 || objG10 == obj2) {
                objG10 = new ra(state, 1);
                kVarP.C(objG10);
            }
            kVarP.T(false);
            c(fFloatValue, aVar2, (eh.l) objG10, kVarP, 0);
            String str = (String) x1Var.getValue();
            androidx.compose.animation.d.c(str != null, bVar4.e(), w0.c(null, 3), w0.d(null, 3), null, f1.c.b(2109619274, new c(str), kVarP), kVarP, 200064, 16);
            kVar = kVarP;
            kVar.T(true);
        }
        h2 h2VarV2 = kVar.V();
        if (h2VarV2 != null) {
            h2VarV2.f31703d = new eh.p() { // from class: v8.h
                @Override // eh.p
                public final Object invoke(Object obj4, Object obj5) {
                    ((Integer) obj5).intValue();
                    int iN = f3.i.n(i10 | 1);
                    k.a(iVar, state, (x0.j) obj4, iN);
                    return f0.f21461a;
                }
            };
        }
    }

    public static final void b(final androidx.compose.ui.d dVar, final w1.d dVar2, final long j10, final String str, final String str2, final eh.a<f0> aVar, boolean z10, v vVar, eh.p<? super x0.j, ? super Integer, f0> pVar, x0.j jVar, final int i10, final int i11) {
        boolean z11;
        int i12;
        v vVar2;
        int i13;
        final boolean z12;
        x0.k kVar;
        final eh.p<? super x0.j, ? super Integer, f0> pVar2;
        final v vVar3;
        x0.k kVarP = jVar.p(1167284524);
        int i14 = i10 | (kVarP.K(dVar) ? 4 : 2) | (kVarP.K(dVar2) ? 32 : 16) | (kVarP.j(j10) ? 256 : 128) | (kVarP.K(str) ? 2048 : 1024) | (kVarP.K(str2) ? 16384 : 8192);
        if ((i10 & 196608) == 0) {
            i14 |= kVarP.l(aVar) ? 131072 : 65536;
        }
        int i15 = i11 & 64;
        if (i15 != 0) {
            i12 = i14 | 1572864;
            z11 = z10;
        } else {
            z11 = z10;
            i12 = i14 | (kVarP.c(z11) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted);
        }
        int i16 = i11 & 128;
        if (i16 != 0) {
            i13 = i12 | 12582912;
            vVar2 = vVar;
        } else {
            vVar2 = vVar;
            i13 = i12 | (kVarP.K(vVar2) ? 8388608 : 4194304);
        }
        int i17 = i11 & 256;
        if (i17 != 0) {
            i13 |= 100663296;
        } else if ((i10 & 100663296) == 0) {
            i13 |= kVarP.l(pVar) ? 67108864 : 33554432;
        }
        int i18 = i13;
        if ((i18 & 38347923) == 38347922 && kVarP.s()) {
            kVarP.v();
            pVar2 = pVar;
            kVar = kVarP;
            z12 = z11;
            vVar3 = vVar2;
        } else {
            if (i15 != 0) {
                z11 = false;
            }
            v vVar4 = i16 != 0 ? null : vVar2;
            eh.p<? super x0.j, ? super Integer, f0> pVar3 = i17 == 0 ? pVar : null;
            z12 = z11;
            kVar = kVarP;
            md.b(aVar, androidx.compose.foundation.layout.g.d(dVar, 1.0f), false, h0.f.a(20), ((e2) kVarP.f(f2.f25858a)).f25770p, 0L, 2, CropImageView.DEFAULT_ASPECT_RATIO, vVar4, null, f1.c.b(1596399351, new d(j10, pVar3, z12, dVar2, str, str2), kVarP), kVar, ((i18 >> 15) & 14) | 1572864 | ((i18 << 3) & 234881024), 676);
            pVar2 = pVar3;
            vVar3 = vVar4;
        }
        h2 h2VarV = kVar.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p() { // from class: v8.d
                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    k.b(dVar, dVar2, j10, str, str2, aVar, z12, vVar3, pVar2, (x0.j) obj, f3.i.n(i10 | 1), i11);
                    return f0.f21461a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0576  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0512  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(final float f10, eh.a<f0> aVar, eh.l<? super String, f0> lVar, x0.j jVar, final int i10) {
        j.a.C0321a c0321a;
        final eh.l<? super String, f0> lVar2;
        boolean z10;
        w1.d dVarB;
        androidx.compose.ui.d dVar;
        boolean z11;
        Object objG;
        boolean z12;
        Object objG2;
        int i11;
        boolean z13;
        Object objG3;
        Object objG4;
        n1 n1Var;
        x0.k kVar;
        final eh.a<f0> aVar2 = aVar;
        x0.k kVarP = jVar.p(-2007507595);
        int i12 = i10 | (kVarP.h(f10) ? 4 : 2) | (kVarP.l(aVar2) ? 32 : 16) | (kVarP.l(lVar) ? 256 : 128);
        if ((i12 & 147) == 146 && kVarP.s()) {
            kVarP.v();
            kVar = kVarP;
            lVar2 = lVar;
        } else {
            kVarP.L(-2074444759);
            Object objG5 = kVarP.g();
            j.a.C0321a c0321a2 = j.a.f31715a;
            if (objG5 == c0321a2) {
                objG5 = bg.b.h(Boolean.FALSE);
                kVarP.C(objG5);
            }
            n1 n1Var2 = (n1) objG5;
            kVarP.T(false);
            float f11 = 16;
            float f12 = 8;
            androidx.compose.ui.d dVarI = androidx.compose.foundation.layout.f.i(ph.m0.e(androidx.compose.ui.c.a(androidx.compose.foundation.layout.g.f976c, c3.f14686a, new z.e2(3)), ph.m0.c(kVarP), true), f11, f12);
            b.k kVar2 = z.b.f34446c;
            z.q qVarA = z.o.a(kVar2, d.a.f14615n, kVarP, 48);
            int i13 = kVarP.P;
            a2 a2VarP = kVarP.P();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarI, kVarP);
            i2.g.f13861o.getClass();
            e0.a aVar3 = g.a.f13863b;
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar3);
            } else {
                kVarP.z();
            }
            g.a.b bVar = g.a.f13867f;
            v1.j(bVar, qVarA, kVarP);
            g.a.d dVar2 = g.a.f13866e;
            v1.j(dVar2, a2VarP, kVarP);
            g.a.C0128a c0128a = g.a.f13868g;
            if (kVarP.O || !r.a(kVarP.g(), Integer.valueOf(i13))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i13, kVarP, i13, c0128a);
            }
            g.a.c cVar = g.a.f13865d;
            v1.j(cVar, dVarC, kVarP);
            d.a aVar4 = d.a.f1143b;
            androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(aVar4, 1.0f);
            kVarP.L(515668795);
            boolean z14 = (i12 & 14) == 4;
            Object objG6 = kVarP.g();
            if (z14 || objG6 == c0321a2) {
                objG6 = new eh.l() { // from class: v8.i
                    @Override // eh.l
                    public final Object invoke(Object obj) {
                        l1 graphicsLayer = (l1) obj;
                        r.e(graphicsLayer, "$this$graphicsLayer");
                        graphicsLayer.f(k.d(f10, 0));
                        return f0.f21461a;
                    }
                };
                kVarP.C(objG6);
            }
            kVarP.T(false);
            androidx.compose.ui.d dVarA = androidx.compose.ui.graphics.a.a(dVarD, (eh.l) objG6);
            m1 m1VarA = k1.a(z.b.f34444a, d.a.f14611j, kVarP, 0);
            int i14 = kVarP.P;
            a2 a2VarP2 = kVarP.P();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarA, kVarP);
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar3);
            } else {
                kVarP.z();
            }
            v1.j(bVar, m1VarA, kVarP);
            v1.j(dVar2, a2VarP2, kVarP);
            if (kVarP.O || !r.a(kVarP.g(), Integer.valueOf(i14))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i14, kVarP, i14, c0128a);
            }
            v1.j(cVar, dVarC2, kVarP);
            aVar2 = aVar;
            s4.c(aVar2, null, false, null, v8.a.f30668a, kVarP, ((i12 >> 3) & 14) | 196608, 30);
            kVarP.T(true);
            androidx.compose.ui.d dVarD2 = androidx.compose.foundation.layout.g.d(androidx.compose.foundation.layout.g.s(aVar4, CropImageView.DEFAULT_ASPECT_RATIO, 560, 1), 1.0f);
            b.i iVarH = z.b.h(12);
            f.a aVar5 = d.a.f14614m;
            z.q qVarA2 = z.o.a(iVarH, aVar5, kVarP, 6);
            int i15 = kVarP.P;
            a2 a2VarP3 = kVarP.P();
            androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(dVarD2, kVarP);
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar3);
            } else {
                kVarP.z();
            }
            v1.j(bVar, qVarA2, kVarP);
            v1.j(dVar2, a2VarP3, kVarP);
            if (kVarP.O || !r.a(kVarP.g(), Integer.valueOf(i15))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i15, kVarP, i15, c0128a);
            }
            v1.j(cVar, dVarC3, kVarP);
            float f13 = 4;
            androidx.compose.ui.d dVarG = g(androidx.compose.foundation.layout.f.j(aVar4, f13, CropImageView.DEFAULT_ASPECT_RATIO, 2), d(f10, 0));
            z.q qVarA3 = z.o.a(kVar2, aVar5, kVarP, 0);
            int i16 = kVarP.P;
            a2 a2VarP4 = kVarP.P();
            androidx.compose.ui.d dVarC4 = androidx.compose.ui.c.c(dVarG, kVarP);
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar3);
            } else {
                kVarP.z();
            }
            v1.j(bVar, qVarA3, kVarP);
            v1.j(dVar2, a2VarP4, kVarP);
            if (kVarP.O || !r.a(kVarP.g(), Integer.valueOf(i16))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i16, kVarP, i16, c0128a);
            }
            v1.j(cVar, dVarC4, kVarP);
            String strC = f3.q.c(R.string.create_hub_title, kVarP);
            s3 s3Var = of.f26647a;
            t2.l0 l0Var = ((nf) kVarP.f(s3Var)).f26543f;
            x2.p pVar = x2.p.f32033f;
            s3 s3Var2 = f2.f25858a;
            ff.b(strC, null, ((e2) kVarP.f(s3Var2)).f25769o, 0L, pVar, null, 0L, null, 0L, 0, false, 0, 0, l0Var, kVarP, 196608, 0, 65498);
            p1.d.b(androidx.compose.foundation.layout.g.f(aVar4, f13), kVarP);
            ff.b(f3.q.c(R.string.create_hub_subtitle, kVarP), null, ((e2) kVarP.f(s3Var2)).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nf) kVarP.f(s3Var)).f26548k, kVarP, 0, 0, 65530);
            p1.d.b(androidx.compose.foundation.layout.g.f(aVar4, f12), kVarP);
            kVarP.T(true);
            long j10 = o1.b(ProjectKind.APK).f22292a;
            androidx.compose.ui.d dVarG2 = g(aVar4, d(f10, 1));
            w1.d dVarB2 = g4.f20861a;
            if (dVarB2 == null) {
                d.a aVar6 = new d.a("Filled.FlashOn", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i17 = w1.m.f31210a;
                i2 i2Var = new i2(b1.f21648b);
                ArrayList arrayList = new ArrayList(32);
                arrayList.add(new g.f(7.0f, 2.0f));
                arrayList.add(new g.r(11.0f));
                arrayList.add(new g.l(3.0f));
                arrayList.add(new g.r(9.0f));
                arrayList.add(new g.m(7.0f, -12.0f));
                arrayList.add(new g.l(-4.0f));
                arrayList.add(new g.m(4.0f, -8.0f));
                arrayList.add(g.b.f31130c);
                d.a.a(aVar6, arrayList, 0, i2Var);
                dVarB2 = aVar6.b();
                g4.f20861a = dVarB2;
            }
            String strC2 = f3.q.c(R.string.home_build_mode_simple, kVarP);
            String strC3 = f3.q.c(R.string.create_hub_quick_desc, kVarP);
            kVarP.L(336637416);
            int i18 = i12 & 896;
            boolean z15 = i18 == 256;
            Object objG7 = kVarP.g();
            if (z15) {
                c0321a = c0321a2;
            } else {
                c0321a = c0321a2;
                if (objG7 != c0321a) {
                    lVar2 = lVar;
                    z10 = false;
                }
                kVarP.T(z10);
                b(dVarG2, dVarB2, j10, strC2, strC3, (eh.a) objG7, false, null, null, kVarP, 0, 448);
                androidx.compose.ui.d dVarG3 = g(aVar4, d(f10, 2));
                dVarB = tb.f21046a;
                if (dVarB == null) {
                    dVar = dVarG3;
                } else {
                    d.a aVar7 = new d.a("Filled.Tune", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i19 = w1.m.f31210a;
                    i2 i2Var2 = new i2(b1.f21648b);
                    w1.e eVar = new w1.e();
                    eVar.h(3.0f, 17.0f);
                    eVar.l(2.0f);
                    eVar.e(6.0f);
                    eVar.l(-2.0f);
                    ji.a.b(eVar, 3.0f, 17.0f, 3.0f, 5.0f);
                    eVar.l(2.0f);
                    eVar.e(10.0f);
                    eVar.f(13.0f, 5.0f);
                    dVar = dVarG3;
                    ji.a.b(eVar, 3.0f, 5.0f, 13.0f, 21.0f);
                    eVar.l(-2.0f);
                    eVar.e(8.0f);
                    eVar.l(-2.0f);
                    eVar.e(-8.0f);
                    eVar.l(-2.0f);
                    eVar.e(-2.0f);
                    eVar.l(6.0f);
                    eVar.e(2.0f);
                    eVar.a();
                    eVar.h(7.0f, 9.0f);
                    eVar.l(2.0f);
                    eVar.f(3.0f, 11.0f);
                    eVar.l(2.0f);
                    eVar.e(4.0f);
                    eVar.l(2.0f);
                    eVar.e(2.0f);
                    p0.f0.a(eVar, 9.0f, 9.0f, 7.0f, 9.0f);
                    eVar.h(21.0f, 13.0f);
                    eVar.l(-2.0f);
                    eVar.f(11.0f, 11.0f);
                    eVar.l(2.0f);
                    eVar.e(10.0f);
                    eVar.a();
                    eVar.h(15.0f, 9.0f);
                    eVar.e(2.0f);
                    eVar.f(17.0f, 7.0f);
                    eVar.e(4.0f);
                    eVar.f(21.0f, 5.0f);
                    eVar.e(-4.0f);
                    b6.a.c(eVar, 17.0f, 3.0f, -2.0f, 6.0f);
                    d.a.a(aVar7, eVar.f31100a, 0, i2Var2);
                    dVarB = aVar7.b();
                    tb.f21046a = dVarB;
                }
                String strC4 = f3.q.c(R.string.home_build_mode_advanced, kVarP);
                String strC5 = f3.q.c(R.string.create_hub_advanced_desc, kVarP);
                kVarP.L(336649867);
                z11 = i18 != 256;
                objG = kVarP.g();
                if (!z11 || objG == c0321a) {
                    objG = new m9.m1(lVar2, 1);
                    kVarP.C(objG);
                }
                kVarP.T(false);
                b(dVar, dVarB, j10, strC4, strC5, (eh.a) objG, false, null, null, kVarP, 0, 448);
                androidx.compose.ui.d dVarG4 = g(aVar4, d(f10, 3));
                w1.d dVarA2 = y.a();
                long j11 = k9.d.f16192n;
                String strC6 = f3.q.c(R.string.create_hub_ai, kVarP);
                String strC7 = f3.q.c(R.string.create_hub_ai_desc, kVarP);
                kVarP.L(336665253);
                z12 = i18 != 256;
                objG2 = kVarP.g();
                if (!z12 || objG2 == c0321a) {
                    i11 = 1;
                    objG2 = new m9.n1(lVar2, 1);
                    kVarP.C(objG2);
                } else {
                    i11 = 1;
                }
                kVarP.T(false);
                b(dVarG4, dVarA2, j11, strC6, strC7, (eh.a) objG2, false, d2.a(i11, b1.c(0.6f, j11)), null, kVarP, 0, DilithiumEngine.DilithiumPolyT1PackedBytes);
                q8.l1 l1VarB = o1.b(ProjectKind.PDF);
                androidx.compose.ui.d dVarG5 = g(aVar4, d(f10, 4));
                w1.d dVar3 = l1VarB.f22293b;
                long j12 = l1VarB.f22292a;
                String strC8 = f3.q.c(R.string.create_hub_pdf, kVarP);
                String strC9 = f3.q.c(R.string.create_hub_pdf_desc, kVarP);
                kVarP.L(336681094);
                z13 = i18 != 256;
                objG3 = kVarP.g();
                if (!z13 || objG3 == c0321a) {
                    objG3 = new z0(lVar2, 1);
                    kVarP.C(objG3);
                }
                kVarP.T(false);
                b(dVarG5, dVar3, j12, strC8, strC9, (eh.a) objG3, false, null, null, kVarP, 0, 448);
                q8.l1 l1VarB2 = o1.b(ProjectKind.HTML);
                androidx.compose.ui.d dVarG6 = g(aVar4, d(f10, 5));
                w1.d dVar4 = l1VarB2.f22293b;
                long j13 = l1VarB2.f22292a;
                String strC10 = f3.q.c(R.string.create_hub_html, kVarP);
                String strC11 = f3.q.c(R.string.create_hub_html_desc, kVarP);
                kVarP.L(336694853);
                objG4 = kVarP.g();
                if (objG4 != c0321a) {
                    n1Var = n1Var2;
                    objG4 = new p1(n1Var, 1);
                    kVarP.C(objG4);
                } else {
                    n1Var = n1Var2;
                }
                kVarP.T(false);
                b(dVarG6, dVar4, j13, strC10, strC11, (eh.a) objG4, ((Boolean) n1Var.getValue()).booleanValue(), null, f1.c.b(1881841949, new e(l1VarB2, lVar2), kVarP), kVarP, 100859904, 128);
                kVar = kVarP;
                p1.d.b(androidx.compose.foundation.layout.g.f(aVar4, f11), kVar);
                kVar.T(true);
                kVar.T(true);
            }
            lVar2 = lVar;
            z10 = false;
            objG7 = new j(lVar2, 0);
            kVarP.C(objG7);
            kVarP.T(z10);
            b(dVarG2, dVarB2, j10, strC2, strC3, (eh.a) objG7, false, null, null, kVarP, 0, 448);
            androidx.compose.ui.d dVarG32 = g(aVar4, d(f10, 2));
            dVarB = tb.f21046a;
            if (dVarB == null) {
            }
            String strC42 = f3.q.c(R.string.home_build_mode_advanced, kVarP);
            String strC52 = f3.q.c(R.string.create_hub_advanced_desc, kVarP);
            kVarP.L(336649867);
            if (i18 != 256) {
            }
            objG = kVarP.g();
            if (!z11) {
                objG = new m9.m1(lVar2, 1);
                kVarP.C(objG);
                kVarP.T(false);
                b(dVar, dVarB, j10, strC42, strC52, (eh.a) objG, false, null, null, kVarP, 0, 448);
                androidx.compose.ui.d dVarG42 = g(aVar4, d(f10, 3));
                w1.d dVarA22 = y.a();
                long j112 = k9.d.f16192n;
                String strC62 = f3.q.c(R.string.create_hub_ai, kVarP);
                String strC72 = f3.q.c(R.string.create_hub_ai_desc, kVarP);
                kVarP.L(336665253);
                if (i18 != 256) {
                }
                objG2 = kVarP.g();
                if (z12) {
                    i11 = 1;
                    objG2 = new m9.n1(lVar2, 1);
                    kVarP.C(objG2);
                    kVarP.T(false);
                    b(dVarG42, dVarA22, j112, strC62, strC72, (eh.a) objG2, false, d2.a(i11, b1.c(0.6f, j112)), null, kVarP, 0, DilithiumEngine.DilithiumPolyT1PackedBytes);
                    q8.l1 l1VarB3 = o1.b(ProjectKind.PDF);
                    androidx.compose.ui.d dVarG52 = g(aVar4, d(f10, 4));
                    w1.d dVar32 = l1VarB3.f22293b;
                    long j122 = l1VarB3.f22292a;
                    String strC82 = f3.q.c(R.string.create_hub_pdf, kVarP);
                    String strC92 = f3.q.c(R.string.create_hub_pdf_desc, kVarP);
                    kVarP.L(336681094);
                    if (i18 != 256) {
                    }
                    objG3 = kVarP.g();
                    if (!z13) {
                        objG3 = new z0(lVar2, 1);
                        kVarP.C(objG3);
                        kVarP.T(false);
                        b(dVarG52, dVar32, j122, strC82, strC92, (eh.a) objG3, false, null, null, kVarP, 0, 448);
                        q8.l1 l1VarB22 = o1.b(ProjectKind.HTML);
                        androidx.compose.ui.d dVarG62 = g(aVar4, d(f10, 5));
                        w1.d dVar42 = l1VarB22.f22293b;
                        long j132 = l1VarB22.f22292a;
                        String strC102 = f3.q.c(R.string.create_hub_html, kVarP);
                        String strC112 = f3.q.c(R.string.create_hub_html_desc, kVarP);
                        kVarP.L(336694853);
                        objG4 = kVarP.g();
                        if (objG4 != c0321a) {
                        }
                        kVarP.T(false);
                        b(dVarG62, dVar42, j132, strC102, strC112, (eh.a) objG4, ((Boolean) n1Var.getValue()).booleanValue(), null, f1.c.b(1881841949, new e(l1VarB22, lVar2), kVarP), kVarP, 100859904, 128);
                        kVar = kVarP;
                        p1.d.b(androidx.compose.foundation.layout.g.f(aVar4, f11), kVar);
                        kVar.T(true);
                        kVar.T(true);
                    }
                }
            }
        }
        h2 h2VarV = kVar.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(f10, aVar2, lVar2, i10) { // from class: v8.c

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ float f30673a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ eh.a f30674b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ eh.l f30675c;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    k.c(this.f30673a, this.f30674b, this.f30675c, (x0.j) obj, iN);
                    return f0.f21461a;
                }
            };
        }
    }

    public static final float d(float f10, int i10) {
        return jh.j.l(((f10 - 0.5f) - (i10 * 0.05f)) / 0.25f, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
    }

    public static final void e(final w1.d dVar, final String str, final long j10, final androidx.compose.ui.d dVar2, final eh.a<f0> aVar, x0.j jVar, final int i10) {
        x0.k kVarP = jVar.p(-986471598);
        int i11 = i10 | (kVarP.K(dVar) ? 4 : 2) | (kVarP.K(str) ? 32 : 16) | (kVarP.j(j10) ? 256 : 128) | (kVarP.K(dVar2) ? 2048 : 1024) | (kVarP.l(aVar) ? 16384 : 8192);
        if ((i11 & 9363) == 9362 && kVarP.s()) {
            kVarP.v();
        } else {
            x0.c(aVar, dVar2, false, h0.f.a(12), null, null, null, f1.c.b(380796192, new f(dVar, j10, str), kVarP), kVarP, ((i11 >> 12) & 14) | 805306368 | ((i11 >> 6) & 112), CropImageView.DEFAULT_IMAGE_TO_CROP_BOUNDS_ANIM_DURATION);
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(str, j10, dVar2, aVar, i10) { // from class: v8.f

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ String f30689b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ long f30690c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ androidx.compose.ui.d f30691d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ eh.a f30692e;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    k.e(this.f30688a, this.f30689b, this.f30690c, this.f30691d, this.f30692e, (x0.j) obj, iN);
                    return f0.f21461a;
                }
            };
        }
    }

    public static final m0 f() {
        return f30705a;
    }

    public static final androidx.compose.ui.d g(androidx.compose.ui.d dVar, final float f10) {
        return androidx.compose.ui.graphics.a.a(dVar, new eh.l() { // from class: v8.e
            @Override // eh.l
            public final Object invoke(Object obj) {
                l1 graphicsLayer = (l1) obj;
                r.e(graphicsLayer, "$this$graphicsLayer");
                float f11 = f10;
                graphicsLayer.f(f11);
                graphicsLayer.c(graphicsLayer.N0(24) * (1.0f - f11));
                return f0.f21461a;
            }
        });
    }
}
