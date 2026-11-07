package x8;

import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.data.local.entity.FolderEntity;
import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import com.basitce.htmltoapk.domain.model.ProjectKind;
import com.basitce.htmltoapk.ui.screens.preview.PdfPreviewActivity;
import com.yalantis.ucrop.view.CropImageView;
import f9.ec;
import f9.pa;
import g2.j;
import g7.f;
import g7.j;
import g7.p;
import i2.e0;
import i2.g;
import j1.d;
import j5.a;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import m7.b;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.x509.DisplayText;
import q1.b1;
import s.l0;
import s8.e2;
import t0.ff;
import t0.md;
import t0.nf;
import t0.of;
import t0.ra;
import t0.uc;
import w7.f;
import x0.j;
import x8.j6;

/* loaded from: classes.dex */
public final class g5 {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f32665a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f32666b = c2.n0.c(4289930782L);

    /* renamed from: c, reason: collision with root package name */
    public static final long f32667c = c2.n0.c(4294951936L);

    /* renamed from: d, reason: collision with root package name */
    public static final long f32668d = c2.n0.c(4279964160L);

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.home.HomeScreenKt$HomeScreen$closeFolder$1", f = "HomeScreen.kt", l = {289, 291}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f32669a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ HashMap<Long, p1.e> f32670b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f32671c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ s.b<Float, s.o> f32672d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f32673e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ x0.n1<p1.c> f32674f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ x0.n1<p1.e> f32675g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ x0.n1<Long> f32676h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(HashMap<Long, p1.e> map, long j10, s.b<Float, s.o> bVar, boolean z10, x0.n1<p1.c> n1Var, x0.n1<p1.e> n1Var2, x0.n1<Long> n1Var3, tg.e<? super a> eVar) {
            super(2, eVar);
            this.f32670b = map;
            this.f32671c = j10;
            this.f32672d = bVar;
            this.f32673e = z10;
            this.f32674f = n1Var;
            this.f32675g = n1Var2;
            this.f32676h = n1Var3;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new a(this.f32670b, this.f32671c, this.f32672d, this.f32673e, this.f32674f, this.f32675g, this.f32676h, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x008f, code lost:
        
            if (r13 == r0) goto L28;
         */
        @Override // vg.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            p1.e eVarJ;
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f32669a;
            x0.n1<Long> n1Var = this.f32676h;
            try {
                if (i10 == 0) {
                    pg.q.b(obj);
                    f5 f5Var = new f5();
                    this.f32669a = 1;
                    if (x0.f1.a(getContext()).f0(f5Var, this) == aVar) {
                    }
                    return aVar;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pg.q.b(obj);
                    boolean z10 = g5.f32665a;
                    n1Var.setValue(null);
                    return pg.f0.f21461a;
                }
                pg.q.b(obj);
                x0.n1<p1.e> n1Var2 = this.f32675g;
                p1.e eVar = this.f32670b.get(new Long(this.f32671c));
                if (eVar != null) {
                    x0.n1<p1.c> n1Var3 = this.f32674f;
                    boolean z11 = g5.f32665a;
                    eVarJ = eVar.j(n1Var3.getValue().f21129a ^ (-9223372034707292160L));
                } else {
                    eVarJ = null;
                }
                boolean z12 = g5.f32665a;
                n1Var2.setValue(eVarJ);
                s.b<Float, s.o> bVar = this.f32672d;
                Float f10 = new Float(CropImageView.DEFAULT_ASPECT_RATIO);
                s.m2 m2VarD = s.m.d(this.f32673e ? 150 : 360, 0, s.d0.f23703a, 2);
                this.f32669a = 2;
                obj = s.b.c(bVar, f10, m2VarD, null, this, 12);
            } catch (Throwable th2) {
                boolean z13 = g5.f32665a;
                n1Var.setValue(null);
                throw th2;
            }
        }
    }

    public static final class b implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f32677a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f32678b;

        public b(Context context, eh.a aVar) {
            this.f32677a = aVar;
            this.f32678b = context;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(androidx.compose.foundation.layout.g.f976c, q1.b1.c(0.55f, q1.b1.f21648b), q1.y1.f21750a);
                jVar2.L(680343821);
                Object objG = jVar2.g();
                j.a.C0321a c0321a = j.a.f31715a;
                if (objG == c0321a) {
                    objG = new x.n();
                    jVar2.C(objG);
                }
                jVar2.B();
                androidx.compose.ui.d dVarB2 = androidx.compose.foundation.b.b(dVarB, (x.m) objG, null, false, null, this.f32677a, 28);
                g2.l0 l0VarD = z.g.d(d.a.f14603b, false);
                int iD = jVar2.D();
                x0.a2 a2VarY = jVar2.y();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarB2, jVar2);
                i2.g.f13861o.getClass();
                e0.a aVar = g.a.f13863b;
                if (jVar2.t() == null) {
                    c9.u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar);
                } else {
                    jVar2.z();
                }
                ph.v1.j(g.a.f13867f, l0VarD, jVar2);
                ph.v1.j(g.a.f13866e, a2VarY, jVar2);
                g.a.C0128a c0128a = g.a.f13868g;
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                    l9.i.a(iD, jVar2, iD, c0128a);
                }
                ph.v1.j(g.a.f13865d, dVarC, jVar2);
                jVar2.L(-1292288121);
                Object objG2 = jVar2.g();
                if (objG2 == c0321a) {
                    objG2 = bg.b.h(Boolean.FALSE);
                    jVar2.C(objG2);
                }
                x0.n1 n1Var = (x0.n1) objG2;
                jVar2.B();
                pg.f0 f0Var = pg.f0.f21461a;
                jVar2.L(-1292285933);
                Object objG3 = jVar2.g();
                if (objG3 == c0321a) {
                    objG3 = new b6(n1Var, null);
                    jVar2.C(objG3);
                }
                jVar2.B();
                x0.o0.d((eh.p) objG3, f0Var, jVar2);
                float f10 = 16;
                androidx.compose.animation.d.c(((Boolean) n1Var.getValue()).booleanValue(), androidx.compose.foundation.layout.f.k(d0.h.g(d.a.f1143b), f10, 44, f10, 24), r.w0.e(s.m.c(0.5f, 200.0f, null, 4), CropImageView.DEFAULT_ASPECT_RATIO, b3.e.a(0.85f, 0.05f), 2).b(r.w0.c(s.m.d(DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE, 0, null, 6), 2)), new r.x1(new r.p2((r.y1) null, (r.l2) null, (r.j0) null, new r.f2(CropImageView.DEFAULT_ASPECT_RATIO, b3.e.a(0.85f, 0.05f), s.m.c(CropImageView.DEFAULT_ASPECT_RATIO, 400.0f, null, 5)), (LinkedHashMap) null, 55)).b(r.w0.d(s.m.d(150, 0, null, 6), 2)), null, f1.c.b(-2113179715, new e6(this.f32678b, this.f32677a), jVar2), jVar2, 196608, 16);
                jVar2.H();
            }
            return pg.f0.f21461a;
        }
    }

    public static final void A(final androidx.compose.ui.d dVar, final boolean z10, final ProjectEntity projectEntity, final boolean z11, final eh.a aVar, final eh.a aVar2, final eh.a aVar3, final eh.a aVar4, final eh.a aVar5, final eh.a aVar6, final eh.a aVar7, final eh.a aVar8, final eh.a aVar9, final eh.a aVar10, final eh.a aVar11, final boolean z12, final eh.a aVar12, x0.j jVar, final int i10) {
        Object[] objArr;
        x0.k kVarP = jVar.p(-1227076681);
        int i11 = i10 | (kVarP.K(dVar) ? 4 : 2) | (kVarP.c(z10) ? 32 : 16) | (kVarP.K(projectEntity) ? 256 : 128) | (kVarP.c(z11) ? 2048 : 1024) | (kVarP.l(aVar) ? 16384 : 8192) | (kVarP.l(aVar2) ? 131072 : 65536) | (kVarP.l(aVar3) ? 1048576 : 524288) | (kVarP.l(aVar4) ? 8388608 : 4194304) | (kVarP.l(aVar5) ? 67108864 : 33554432) | (kVarP.l(aVar6) ? PKIFailureInfo.duplicateCertReq : 268435456);
        int i12 = (kVarP.l(aVar7) ? (char) 4 : (char) 2) | (kVarP.l(aVar8) ? ' ' : (char) 16) | (kVarP.l(aVar9) ? (char) 256 : (char) 128) | (kVarP.l(aVar10) ? 2048 : 1024) | (kVarP.l(aVar11) ? (char) 16384 : (char) 8192) | (kVarP.c(z12) ? (char) 0 : (char) 0) | (kVarP.l(aVar12) ? (char) 0 : (char) 0);
        if ((i11 & 306783379) == 306783378 && (i12 & 599187) == 599186 && kVarP.s()) {
            kVarP.v();
        } else {
            String strNormalize = ProjectKind.INSTANCE.normalize(projectEntity.getKind());
            boolean zA = kotlin.jvm.internal.r.a(strNormalize, ProjectKind.APK);
            q8.l1 l1VarB = q8.o1.b(strNormalize);
            Object[] objArr2 = new Object[0];
            kVarP.L(-1698181630);
            Object objG = kVarP.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (objG == c0321a) {
                objArr = objArr2;
                objG = new g6.a(2);
                kVarP.C(objG);
            } else {
                objArr = objArr2;
            }
            kVarP.T(false);
            x0.n1 n1Var = (x0.n1) b0.a0.d(objArr, null, (eh.a) objG, kVarP, 3072, 6);
            kVarP.L(-1698180087);
            Object objG2 = kVarP.g();
            if (objG2 == c0321a) {
                objG2 = new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault());
                kVarP.C(objG2);
            }
            SimpleDateFormat simpleDateFormat = (SimpleDateFormat) objG2;
            Object objA = p0.h.a(kVarP, false, -1698177532);
            if (objA == c0321a) {
                objA = s.d.a(CropImageView.DEFAULT_ASPECT_RATIO);
                kVarP.C(objA);
            }
            final s.b bVar = (s.b) objA;
            Object objA2 = p0.h.a(kVarP, false, -1698175985);
            if (objA2 == c0321a) {
                objA2 = h0.f.a(20);
                kVarP.C(objA2);
            }
            final h0.e eVar = (h0.e) objA2;
            kVarP.T(false);
            Boolean boolValueOf = Boolean.valueOf(z10);
            kVarP.L(-1698173610);
            boolean zL = ((i11 & 112) == 32) | kVarP.l(bVar);
            Object objG3 = kVarP.g();
            if (zL || objG3 == c0321a) {
                objG3 = new k5(bVar, null, z10);
                kVarP.C(objG3);
            }
            kVarP.T(false);
            x0.o0.d((eh.p) objG3, boolValueOf, kVarP);
            androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(dVar, 1.0f);
            kVarP.L(-1698164909);
            boolean zL2 = kVarP.l(bVar);
            Object objG4 = kVarP.g();
            if (zL2 || objG4 == c0321a) {
                objG4 = new eh.l() { // from class: x8.a1
                    @Override // eh.l
                    public final Object invoke(Object obj) {
                        q1.l1 graphicsLayer = (q1.l1) obj;
                        kotlin.jvm.internal.r.e(graphicsLayer, "$this$graphicsLayer");
                        float fFloatValue = ((Number) bVar.d()).floatValue();
                        float f10 = (0.025f * fFloatValue) + 1.0f;
                        graphicsLayer.h(f10);
                        graphicsLayer.d(f10);
                        graphicsLayer.c((-graphicsLayer.N0(3)) * fFloatValue);
                        float fN0 = graphicsLayer.N0(8);
                        if (fFloatValue < CropImageView.DEFAULT_ASPECT_RATIO) {
                            fFloatValue = 0.0f;
                        }
                        graphicsLayer.n(fN0 * fFloatValue);
                        graphicsLayer.p1(eVar);
                        return pg.f0.f21461a;
                    }
                };
                kVarP.C(objG4);
            }
            kVarP.T(false);
            androidx.compose.ui.d dVarC = androidx.compose.foundation.b.c(e1.d.d(androidx.compose.ui.graphics.a.a(dVarD, (eh.l) objG4), eVar), false, null, null, aVar, 7);
            x0.s3 s3Var = t0.f2.f25858a;
            t0.d1.a(dVarC, eVar, t0.z0.a(q1.b1.c(0.85f, ((t0.e2) kVarP.f(s3Var)).f25770p), kVarP, 0), t0.z0.b(0, 62), a9.d2.a((float) 0.75d, q1.b1.c(0.06f, ((t0.e2) kVarP.f(s3Var)).f25771q)), f1.c.b(1072114181, new u5(l1VarB, projectEntity, simpleDateFormat, zA, z12, aVar7, n1Var, aVar12, aVar2, aVar10, aVar9, aVar11, z11, aVar5, aVar8, aVar6, aVar3, aVar4), kVarP), kVarP, 196656, 0);
            kVarP = kVarP;
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(z10, projectEntity, z11, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, z12, aVar12, i10) { // from class: x8.g1

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ boolean f32632b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ ProjectEntity f32633c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ boolean f32634d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ eh.a f32635e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ eh.a f32636f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ eh.a f32637g;

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ eh.a f32638h;

                /* renamed from: j, reason: collision with root package name */
                public final /* synthetic */ eh.a f32639j;

                /* renamed from: k, reason: collision with root package name */
                public final /* synthetic */ eh.a f32640k;

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ eh.a f32641l;

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ eh.a f32642m;

                /* renamed from: n, reason: collision with root package name */
                public final /* synthetic */ eh.a f32643n;

                /* renamed from: p, reason: collision with root package name */
                public final /* synthetic */ eh.a f32644p;

                /* renamed from: q, reason: collision with root package name */
                public final /* synthetic */ eh.a f32645q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ boolean f32646r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ eh.a f32647s;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    g5.A(this.f32631a, this.f32632b, this.f32633c, this.f32634d, this.f32635e, this.f32636f, this.f32637g, this.f32638h, this.f32639j, this.f32640k, this.f32641l, this.f32642m, this.f32643n, this.f32644p, this.f32645q, this.f32646r, this.f32647s, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void B(eh.a aVar, androidx.compose.ui.d dVar, x0.j jVar, int i10) {
        androidx.compose.ui.d dVar2;
        x0.k kVar;
        x0.k kVarP = jVar.p(897142144);
        if ((((kVarP.l(aVar) ? 4 : 2) | i10 | 48) & 19) == 18 && kVarP.s()) {
            kVarP.v();
            dVar2 = dVar;
            kVar = kVarP;
        } else {
            float f10 = 4;
            d.a aVar2 = d.a.f1143b;
            androidx.compose.ui.d dVarN = androidx.compose.foundation.layout.g.n(androidx.compose.foundation.layout.f.l(aVar2, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f10, CropImageView.DEFAULT_ASPECT_RATIO, 11), 36);
            g2.l0 l0VarD = z.g.d(d.a.f14606e, false);
            int i11 = kVarP.P;
            x0.a2 a2VarP = kVarP.P();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarN, kVarP);
            i2.g.f13861o.getClass();
            e0.a aVar3 = g.a.f13863b;
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar3);
            } else {
                kVarP.z();
            }
            ph.v1.j(g.a.f13867f, l0VarD, kVarP);
            ph.v1.j(g.a.f13866e, a2VarP, kVarP);
            g.a.C0128a c0128a = g.a.f13868g;
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i11))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i11, kVarP, i11, c0128a);
            }
            ph.v1.j(g.a.f13865d, dVarC, kVarP);
            dVar2 = aVar2;
            md.a(androidx.compose.foundation.b.c(androidx.compose.foundation.layout.g.n(aVar2, 32), false, null, null, aVar, 7), h0.f.a(10), f32666b, 0L, CropImageView.DEFAULT_ASPECT_RATIO, f10, a9.d2.a((float) 1.5d, f32667c), c.C, kVarP, 14352768, 24);
            kVar = kVarP;
            kVar.T(true);
        }
        x0.h2 h2VarV = kVar.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new v1(aVar, i10, 0, dVar2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void C(final eh.a aVar, final boolean z10, final eh.a aVar2, androidx.compose.ui.d dVar, x0.j jVar, final int i10) {
        final androidx.compose.ui.d dVar2;
        x0.k kVarP = jVar.p(-75919635);
        int i11 = i10 | (kVarP.l(aVar) ? 4 : 2) | (kVarP.c(z10) ? 32 : 16) | (kVarP.l(aVar2) ? 256 : 128) | 3072;
        if ((i11 & 1171) == 1170 && kVarP.s()) {
            kVarP.v();
            dVar2 = dVar;
        } else {
            Context context = (Context) kVarP.f(AndroidCompositionLocals_androidKt.f1281b);
            Boolean boolValueOf = Boolean.valueOf(z10);
            kVarP.L(396534193);
            boolean zL = ((i11 & 896) == 256) | ((i11 & 112) == 32) | kVarP.l(context);
            Object objG = kVarP.g();
            if (zL || objG == j.a.f31715a) {
                objG = new y5(z10, aVar2, context, null);
                kVarP.C(objG);
            }
            kVarP.T(false);
            x0.o0.d((eh.p) objG, boolValueOf, kVarP);
            kVarP.L(396558605);
            l0.a aVarA = q8.x1.a(kVarP) ? null : s.p0.a(s.p0.c("sideloadPulse", kVarP, 0), 0.35f, 1.0f, s.m.a(s.m.d(620, 0, s.d0.f23706d, 2), s.y0.f23999b, 4), "pulse", kVarP, 29112, 0);
            kVarP.T(false);
            float fFloatValue = aVarA != null ? ((Number) aVarA.f23810d.getValue()).floatValue() : 1.0f;
            float fFloatValue2 = aVarA != null ? ((((Number) aVarA.f23810d.getValue()).floatValue() - 0.35f) * 0.16f) + 1.0f : 1.0f;
            d.a aVar3 = d.a.f1143b;
            androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(aVar3, 1.0f);
            z.q qVarA = z.o.a(z.b.f34446c, d.a.f14614m, kVarP, 0);
            int i12 = kVarP.P;
            x0.a2 a2VarP = kVarP.P();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarD, kVarP);
            i2.g.f13861o.getClass();
            e0.a aVar4 = g.a.f13863b;
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar4);
            } else {
                kVarP.z();
            }
            ph.v1.j(g.a.f13867f, qVarA, kVarP);
            ph.v1.j(g.a.f13866e, a2VarP, kVarP);
            g.a.C0128a c0128a = g.a.f13868g;
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i12))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i12, kVarP, i12, c0128a);
            }
            ph.v1.j(g.a.f13865d, dVarC, kVarP);
            float f10 = 7;
            c(androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.g.d(aVar3, 1.0f), f10), kVarP, 6);
            md.a(androidx.compose.foundation.b.c(androidx.compose.foundation.layout.g.d(aVar3, 1.0f), false, null, null, aVar, 7), h0.f.a(0), f32666b, 0L, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, a9.d2.a(2, q1.b1.c(fFloatValue, f32667c)), f1.c.b(-1748196676, new a6(fFloatValue2), kVarP), kVarP, 12583296, 56);
            c(androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.g.d(aVar3, 1.0f), f10), kVarP, 6);
            kVarP.T(true);
            dVar2 = aVar3;
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(z10, aVar2, dVar2, i10) { // from class: x8.u1

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ boolean f33227b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ eh.a f33228c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ androidx.compose.ui.d f33229d;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    g5.C(this.f33226a, this.f33227b, this.f33228c, this.f33229d, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void D(final int i10, eh.a aVar, x0.j jVar) {
        final eh.a aVar2;
        x0.k kVarP = jVar.p(959264584);
        int i11 = (kVarP.l(aVar) ? 4 : 2) | i10;
        if ((i11 & 3) == 2 && kVarP.s()) {
            kVarP.v();
            aVar2 = aVar;
        } else {
            aVar2 = aVar;
            j3.j.a(aVar2, new j3.d0(3), f1.c.b(439640799, new b((Context) kVarP.f(AndroidCompositionLocals_androidKt.f1281b), aVar), kVarP), kVarP, (i11 & 14) | 432, 0);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(i10, aVar2) { // from class: x8.p1

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ eh.a f33070a;

                {
                    this.f33070a = aVar2;
                }

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    g5.D(f3.i.n(1), this.f33070a, (x0.j) obj);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final boolean E(x0.r3 r3Var) {
        return ((Boolean) r3Var.getValue()).booleanValue();
    }

    public static final void F(x0.n1 n1Var, boolean z10) {
        n1Var.setValue(Boolean.valueOf(z10));
    }

    public static final void a(int i10, x0.j jVar) {
        x0.k kVarP = jVar.p(-555585034);
        if (i10 == 0 && kVarP.s()) {
            kVarP.v();
        } else {
            kVarP.L(624087619);
            final l0.a aVarA = q8.x1.a(kVarP) ? null : s.p0.a(s.p0.c("bouncingArrowTransition", kVarP, 0), CropImageView.DEFAULT_ASPECT_RATIO, -6.0f, s.m.a(s.m.d(600, 0, s.d0.f23703a, 2), s.y0.f23999b, 4), "arrowOffsetY", kVarP, 28728, 0);
            kVarP.T(false);
            d.a aVar = d.a.f1143b;
            androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(aVar, 1.0f);
            kVarP.L(624105138);
            boolean zK = kVarP.K(aVarA);
            Object objG = kVarP.g();
            if (zK || objG == j.a.f31715a) {
                objG = new eh.l() { // from class: x8.r1
                    @Override // eh.l
                    public final Object invoke(Object obj) {
                        q1.l1 graphicsLayer = (q1.l1) obj;
                        kotlin.jvm.internal.r.e(graphicsLayer, "$this$graphicsLayer");
                        x0.r3 r3Var = aVarA;
                        graphicsLayer.c(graphicsLayer.N0(r3Var != null ? ((Number) r3Var.getValue()).floatValue() : CropImageView.DEFAULT_ASPECT_RATIO));
                        return pg.f0.f21461a;
                    }
                };
                kVarP.C(objG);
            }
            kVarP.T(false);
            androidx.compose.ui.d dVarA = androidx.compose.ui.graphics.a.a(dVarD, (eh.l) objG);
            z.q qVarA = z.o.a(z.b.f34446c, d.a.f14615n, kVarP, 48);
            int i11 = kVarP.P;
            x0.a2 a2VarP = kVarP.P();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarA, kVarP);
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
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i11))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i11, kVarP, i11, c0128a);
            }
            ph.v1.j(g.a.f13865d, dVarC, kVarP);
            t0.t4.b(p0.w5.a(), null, androidx.compose.foundation.layout.g.n(aVar, 28), ((t0.e2) kVarP.f(t0.f2.f25858a)).f25751a, kVarP, 432, 0);
            kVarP.T(true);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new s1();
        }
    }

    public static final void b(int i10, x0.j jVar) {
        j.a aVar;
        x0.k kVarP = jVar.p(782449263);
        if (i10 == 0 && kVarP.s()) {
            kVarP.v();
        } else {
            Context context = (Context) kVarP.f(AndroidCompositionLocals_androidKt.f1281b);
            int i11 = ((k9.e) kVarP.f(k9.c.f16178b)).a() ? R.raw.empty_state_white : R.raw.empty_state_black;
            kVarP.L(-1531292215);
            boolean zK = kVarP.K(context);
            Object objG = kVarP.g();
            Object obj = j.a.f31715a;
            if (zK || objG == obj) {
                p.a aVar2 = new p.a(context);
                f.a aVar3 = new f.a();
                aVar3.f11498e.add(new g7.e(new b.a()));
                aVar2.f11518c = aVar3.c();
                objG = aVar2.a();
                kVarP.C(objG);
            }
            g7.p pVar = (g7.p) objG;
            kVarP.T(false);
            kVarP.L(-1531281377);
            boolean zI = kVarP.i(i11) | kVarP.K(context);
            Object objG2 = kVarP.g();
            if (zI || objG2 == obj) {
                f.a aVar4 = new f.a(context);
                aVar4.f31350c = Integer.valueOf(i11);
                Object obj2 = aVar4.f31362o;
                if (obj2 instanceof j.a) {
                    aVar = (j.a) obj2;
                } else {
                    if (!(obj2 instanceof g7.j)) {
                        throw new AssertionError();
                    }
                    j.a aVar5 = new j.a((g7.j) obj2);
                    aVar4.f31362o = aVar5;
                    aVar = aVar5;
                }
                aVar.f11511a.put(m7.g.f17702a, -1);
                objG2 = aVar4.a();
                kVarP.C(objG2);
            }
            w7.f fVar = (w7.f) objG2;
            kVarP.T(false);
            FillElement fillElement = androidx.compose.foundation.layout.g.f976c;
            z.q qVarA = z.o.a(z.b.f34448e, d.a.f14615n, kVarP, 54);
            int i12 = kVarP.P;
            x0.a2 a2VarP = kVarP.P();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(fillElement, kVarP);
            i2.g.f13861o.getClass();
            e0.a aVar6 = g.a.f13863b;
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar6);
            } else {
                kVarP.z();
            }
            ph.v1.j(g.a.f13867f, qVarA, kVarP);
            ph.v1.j(g.a.f13866e, a2VarP, kVarP);
            g.a.C0128a c0128a = g.a.f13868g;
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i12))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i12, kVarP, i12, c0128a);
            }
            ph.v1.j(g.a.f13865d, dVarC, kVarP);
            kVarP.L(-1966954396);
            d.a aVar7 = d.a.f1143b;
            h7.b.b(fVar, null, pVar, androidx.compose.foundation.layout.a.a(androidx.compose.foundation.layout.g.d(aVar7, 0.68f), 1.3333334f, false), j.a.f11398b, kVarP, 12586032, 0, 3952);
            kVarP.T(false);
            p1.d.b(androidx.compose.foundation.layout.g.f(aVar7, 16), kVarP);
            ff.b(f3.q.c(R.string.projects_empty, kVarP), null, ((t0.e2) kVarP.f(t0.f2.f25858a)).f25773s, 0L, null, null, 0L, new e3.h(3), 0L, 0, false, 0, 0, ((nf) kVarP.f(of.f26647a)).f26547j, kVarP, 0, 0, 65018);
            kVarP = kVarP;
            kVarP.T(true);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new t1();
        }
    }

    public static final void c(androidx.compose.ui.d dVar, x0.j jVar, int i10) {
        x0.k kVarP = jVar.p(-1508940804);
        if ((i10 & 3) == 2 && kVarP.s()) {
            kVarP.v();
        } else {
            kVarP.L(2137976992);
            Object objG = kVarP.g();
            if (objG == j.a.f31715a) {
                objG = new s8.s1(1);
                kVarP.C(objG);
            }
            kVarP.T(false);
            t.w.a(dVar, (eh.l) objG, kVarP, 54);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new c9.m(dVar, i10, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(final p5.x navController, j6 j6Var, final float f10, x0.j jVar, final int i10) {
        final j6 j6Var2;
        Object next;
        Object obj;
        Object obj2;
        c0.w0 w0Var;
        ph.i0 i0Var;
        final x0.n1 n1Var;
        final x0.n1 n1Var2;
        HashMap map;
        x0.n1 n1Var3;
        s.b bVar;
        boolean z10;
        tg.e eVar;
        x0.n1 n1Var4;
        final List<ProjectEntity> list;
        x0.n1 n1Var5;
        x0.n1 n1Var6;
        x0.n1 n1Var7;
        boolean z11;
        Object next2;
        Object next3;
        v8.q qVar;
        s.b bVar2;
        Object obj3;
        int i11;
        final p5.x xVar;
        Object obj4;
        Context context;
        int i12;
        int i13;
        final x0.n1 n1Var8;
        x0.k kVar;
        final FolderEntity folderEntity;
        Object next4;
        x0.k kVar2;
        j6 j6Var3;
        Object obj5;
        Context context2;
        x0.k kVar3;
        Object obj6;
        j6 j6Var4;
        x0.k kVar4;
        Object obj7;
        int i14;
        Context context3;
        Object obj8;
        x0.k kVar5;
        Object obj9;
        int i15;
        j6 j6Var5;
        Object obj10;
        x0.k kVar6;
        final j6 j6Var6;
        int i16;
        x0.k kVar7;
        kotlin.jvm.internal.r.e(navController, "navController");
        x0.k kVarP = jVar.p(901169614);
        if (((i10 | (kVarP.l(navController) ? 4 : 2) | 16 | (kVarP.h(f10) ? 256 : 128)) & 147) == 146 && kVarP.s()) {
            kVarP.v();
            j6Var6 = j6Var;
            kVar7 = kVarP;
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
                androidx.lifecycle.w0 w0VarB = k5.c.b(j6.class, b1VarA, bVarA, b1VarA instanceof androidx.lifecycle.i ? ((androidx.lifecycle.i) b1VarA).getDefaultViewModelCreationExtras() : a.C0143a.f15159b, kVarP);
                kVarP.G();
                kVarP.G();
                j6Var2 = (j6) w0VarB;
            } else {
                kVarP.v();
                j6Var2 = j6Var;
            }
            kVarP.U();
            x0.n1 n1VarB = bg.b.b(j6Var2.z(), kVarP);
            List<ProjectEntity> listA = ((m0) n1VarB.getValue()).a();
            x0.n1 n1VarB2 = bg.b.b(j6Var2.s(), kVarP);
            Object[] objArr = new Object[0];
            kVarP.L(1872796650);
            Object objG = kVarP.g();
            Object obj11 = j.a.f31715a;
            if (objG == obj11) {
                objG = new eh.a() { // from class: x8.m1
                    @Override // eh.a
                    public final Object invoke() {
                        return bg.b.h(null);
                    }
                };
                kVarP.C(objG);
            }
            kVarP.B();
            final x0.n1 n1Var9 = (x0.n1) b0.a0.d(objArr, null, (eh.a) objG, kVarP, 3072, 6);
            Object[] objArr2 = new Object[0];
            kVarP.L(1872798924);
            Object objG2 = kVarP.g();
            if (objG2 == obj11) {
                objG2 = new f9.y0(1);
                kVarP.C(objG2);
            }
            kVarP.B();
            x0.n1 n1Var10 = (x0.n1) b0.a0.d(objArr2, null, (eh.a) objG2, kVarP, 3072, 6);
            x0.n1 n1VarB3 = bg.b.b(j6Var2.A(), kVarP);
            Boolean boolValueOf = Boolean.valueOf(f(n1VarB3));
            kVarP.L(1872806390);
            boolean zK = kVarP.K(n1VarB3) | kVarP.K(n1Var10);
            Object objG3 = kVarP.g();
            if (zK || objG3 == obj11) {
                objG3 = new a2(n1VarB3, n1Var10, null);
                kVarP.C(objG3);
            }
            kVarP.B();
            x0.o0.d((eh.p) objG3, boolValueOf, kVarP);
            Iterator it = ((List) n1VarB2.getValue()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                long id2 = ((FolderEntity) next).getId();
                Long lR = r(n1Var9);
                if (lR != null && id2 == lR.longValue()) {
                    break;
                }
            }
            final FolderEntity folderEntity2 = (FolderEntity) next;
            Long lR2 = r(n1Var9);
            List list2 = (List) n1VarB2.getValue();
            kVarP.L(1872813887);
            boolean zK2 = kVarP.K(n1Var9) | kVarP.K(n1VarB2) | kVarP.K(folderEntity2);
            Object objG4 = kVarP.g();
            if (zK2 || objG4 == obj11) {
                obj = null;
                objG4 = new r3(folderEntity2, n1Var9, n1VarB2, null);
                kVarP.C(objG4);
            } else {
                obj = null;
            }
            kVarP.B();
            x0.o0.e(lR2, list2, (eh.p) objG4, kVarP);
            kVarP.L(1872818553);
            Object objG5 = kVarP.g();
            if (objG5 == obj11) {
                objG5 = bg.b.h(obj);
                kVarP.C(objG5);
            }
            final x0.n1 n1Var11 = (x0.n1) objG5;
            kVarP.B();
            c0.w0 w0VarA = c0.e1.a(0, 3, kVarP);
            b0.m0 m0VarA = b0.u0.a(kVarP);
            Object objG6 = kVarP.g();
            if (objG6 == obj11) {
                objG6 = x0.o0.h(kVarP);
                kVarP.C(objG6);
            }
            final ph.i0 i0Var2 = (ph.i0) objG6;
            q8.w0 w0Var2 = (q8.w0) kVarP.f(q8.p0.d());
            final boolean zA = q8.x1.a(kVarP);
            long jE = ((t0.e2) kVarP.f(t0.f2.f25858a)).e();
            float fN0 = ((f3.d) kVarP.f(j2.j2.f14779h)).N0(20);
            kVarP.L(1872839032);
            Object objG7 = kVarP.g();
            if (objG7 == obj11) {
                objG7 = new HashMap();
                kVarP.C(objG7);
            }
            HashMap map2 = (HashMap) objG7;
            kVarP.B();
            q8.d0 d0VarE = q8.p0.e(kVarP);
            kVarP.L(1872855001);
            Object objG8 = kVarP.g();
            if (objG8 == obj11) {
                boolean z12 = (f32665a || zA) ? false : true;
                if (zA) {
                    f32665a = true;
                }
                objG8 = Boolean.valueOf(z12);
                kVarP.C(objG8);
            }
            Boolean bool = (Boolean) objG8;
            boolean zBooleanValue = bool.booleanValue();
            kVarP.B();
            kVarP.L(1872860347);
            Object objG9 = kVarP.g();
            if (objG9 == obj11) {
                objG9 = bg.b.h(bool);
                kVarP.C(objG9);
            }
            x0.n1 n1Var12 = (x0.n1) objG9;
            kVarP.B();
            kVarP.L(1872862835);
            Object objG10 = kVarP.g();
            if (objG10 == obj11) {
                objG10 = bg.b.h(null);
                kVarP.C(objG10);
            }
            x0.n1 n1Var13 = (x0.n1) objG10;
            kVarP.B();
            kVarP.L(1872873643);
            Object objG11 = kVarP.g();
            float f11 = CropImageView.DEFAULT_ASPECT_RATIO;
            if (objG11 == obj11) {
                objG11 = s.d.a(r(n1Var9) != null ? 1.0f : 0.0f);
                kVarP.C(objG11);
            }
            final s.b bVar3 = (s.b) objG11;
            kVarP.B();
            kVarP.L(1872879603);
            Object objG12 = kVarP.g();
            if (objG12 == obj11) {
                obj2 = null;
                objG12 = bg.b.h(null);
                kVarP.C(objG12);
            } else {
                obj2 = null;
            }
            final x0.n1 n1Var14 = (x0.n1) objG12;
            kVarP.B();
            kVarP.L(1872884531);
            Object objG13 = kVarP.g();
            if (objG13 == obj11) {
                objG13 = bg.b.h(obj2);
                kVarP.C(objG13);
            }
            final x0.n1 n1Var15 = (x0.n1) objG13;
            kVarP.B();
            kVarP.L(1872886675);
            Object objG14 = kVarP.g();
            if (objG14 == obj11) {
                objG14 = bg.b.h(new p1.c(0L));
                kVarP.C(objG14);
            }
            final x0.n1 n1Var16 = (x0.n1) objG14;
            kVarP.B();
            kVarP.L(1872892141);
            Object objG15 = kVarP.g();
            if (objG15 == obj11) {
                objG15 = new HashMap();
                kVarP.C(objG15);
            }
            final HashMap map3 = (HashMap) objG15;
            kVarP.B();
            Long lR3 = r(n1Var9);
            if (lR3 == null) {
                lR3 = q(n1Var14);
            }
            Long l10 = lR3;
            kVarP.L(1872895990);
            boolean zK3 = kVarP.K(l10);
            Object objG16 = kVarP.g();
            if (zK3 || objG16 == obj11) {
                objG16 = new c0.w0(0);
                kVarP.C(objG16);
            }
            c0.w0 w0Var3 = (c0.w0) objG16;
            kVarP.B();
            kVarP.L(1872898301);
            Object objG17 = kVarP.g();
            if (objG17 == obj11) {
                objG17 = bg.b.d(new eh.a() { // from class: x8.y0
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // eh.a
                    public final Object invoke() {
                        return Boolean.valueOf(((Long) n1Var9.getValue()) == null || ((Number) bVar3.d()).floatValue() < 1.0f);
                    }
                });
                kVarP.C(objG17);
            }
            x0.r3 r3Var = (x0.r3) objG17;
            kVarP.B();
            boolean z13 = r(n1Var9) != null;
            kVarP.L(1872942812);
            boolean zK4 = kVarP.K(n1Var9) | kVarP.l(bVar3) | kVarP.l(i0Var2) | kVarP.l(map3) | kVarP.c(zA);
            Object objG18 = kVarP.g();
            if (zK4 || objG18 == obj11) {
                w0Var = w0VarA;
                objG18 = new eh.a() { // from class: x8.f1
                    @Override // eh.a
                    public final Object invoke() {
                        g5.e(bVar3, i0Var2, n1Var9, n1Var11, n1Var14, map3, zA, n1Var16, n1Var15);
                        return pg.f0.f21461a;
                    }
                };
                i0Var = i0Var2;
                n1Var = n1Var9;
                n1Var2 = n1Var11;
                map = map3;
                n1Var3 = n1Var16;
                bVar = bVar3;
                z10 = zA;
                kVarP.C(objG18);
            } else {
                i0Var = i0Var2;
                w0Var = w0VarA;
                bVar = bVar3;
                map = map3;
                n1Var = n1Var9;
                n1Var2 = n1Var11;
                n1Var3 = n1Var16;
                z10 = zA;
            }
            kVarP.B();
            c.e.a(0, 0, (eh.a) objG18, kVarP, z13);
            Object objR = r(n1Var);
            Object obj12 = (String) n1Var10.getValue();
            kVarP.L(1872944415);
            boolean zK5 = kVarP.K(objR) | kVarP.K(listA) | kVarP.K(obj12);
            Object objG19 = kVarP.g();
            Object obj13 = objG19;
            if (zK5 || objG19 == obj11) {
                ArrayList arrayList = new ArrayList();
                Iterator it2 = listA.iterator();
                while (it2.hasNext()) {
                    Object next5 = it2.next();
                    ProjectEntity projectEntity = (ProjectEntity) next5;
                    Iterator it3 = it2;
                    if (kotlin.jvm.internal.r.a(projectEntity.getFolderId(), r(n1Var)) && (((String) n1Var10.getValue()) == null || kotlin.jvm.internal.r.a(ProjectKind.INSTANCE.normalize(projectEntity.getKind()), (String) n1Var10.getValue()))) {
                        arrayList.add(next5);
                    }
                    it2 = it3;
                }
                kVarP.C(arrayList);
                obj13 = arrayList;
            }
            final List list3 = (List) obj13;
            kVarP.B();
            kVarP.L(1872951786);
            boolean zK6 = kVarP.K(listA);
            Object objG20 = kVarP.g();
            if (zK6 || objG20 == obj11) {
                objG20 = qg.d0.a(new i5(listA));
                kVarP.C(objG20);
            }
            Map map4 = (Map) objG20;
            kVarP.B();
            kVarP.L(1872955593);
            boolean zK7 = kVarP.K(listA);
            Object objG21 = kVarP.g();
            if (zK7 || objG21 == obj11) {
                ArrayList arrayList2 = new ArrayList();
                Iterator<T> it4 = listA.iterator();
                while (it4.hasNext()) {
                    Long folderId = ((ProjectEntity) it4.next()).getFolderId();
                    if (folderId != null) {
                        arrayList2.add(folderId);
                    }
                }
                objG21 = qg.d0.a(new j5(arrayList2));
                kVarP.C(objG21);
            }
            Map map5 = (Map) objG21;
            kVarP.B();
            Object obj14 = (List) n1Var2.getValue();
            kVarP.L(1872959326);
            boolean zK8 = kVarP.K(obj14) | kVarP.K(list3);
            Object objG22 = kVarP.g();
            if (zK8 || objG22 == obj11) {
                List list4 = (List) n1Var2.getValue();
                objG22 = list4 != null ? w7.b(list3, list4, new p5.a(1)) : list3;
                kVarP.C(objG22);
            }
            List list5 = (List) objG22;
            kVarP.B();
            kVarP.L(1872966260);
            boolean zL = kVarP.l(list3);
            Object objG23 = kVarP.g();
            if (zL || objG23 == obj11) {
                eVar = null;
                objG23 = new m4(list3, n1Var2, null);
                kVarP.C(objG23);
            } else {
                eVar = null;
            }
            kVarP.B();
            x0.o0.d((eh.p) objG23, list3, kVarP);
            Object[] objArr3 = new Object[0];
            kVarP.L(1872983434);
            Object objG24 = kVarP.g();
            if (objG24 == obj11) {
                objG24 = new eh.a() { // from class: x8.j1
                    @Override // eh.a
                    public final Object invoke() {
                        return bg.b.h(null);
                    }
                };
                kVarP.C(objG24);
            }
            kVarP.B();
            tg.e eVar2 = eVar;
            ph.i0 i0Var3 = i0Var;
            final HashMap map6 = map;
            final x0.n1 n1Var17 = (x0.n1) b0.a0.d(objArr3, null, (eh.a) objG24, kVarP, 3072, 6);
            Object[] objArr4 = new Object[0];
            kVarP.L(1872985994);
            Object objG25 = kVarP.g();
            if (objG25 == obj11) {
                objG25 = new eh.a() { // from class: x8.k1
                    @Override // eh.a
                    public final Object invoke() {
                        return bg.b.h(null);
                    }
                };
                kVarP.C(objG25);
            }
            kVarP.B();
            final x0.n1 n1Var18 = (x0.n1) b0.a0.d(objArr4, null, (eh.a) objG25, kVarP, 3072, 6);
            Object[] objArr5 = new Object[0];
            kVarP.L(1872988548);
            Object objG26 = kVarP.g();
            if (objG26 == obj11) {
                objG26 = new eh.a() { // from class: x8.l1
                    @Override // eh.a
                    public final Object invoke() {
                        return bg.b.h(Boolean.FALSE);
                    }
                };
                kVarP.C(objG26);
            }
            kVarP.B();
            final x0.n1 n1Var19 = (x0.n1) b0.a0.d(objArr5, null, (eh.a) objG26, kVarP, 3072, 6);
            Object[] objArr6 = new Object[0];
            kVarP.L(1872991012);
            Object objG27 = kVarP.g();
            if (objG27 == obj11) {
                objG27 = new eh.a() { // from class: x8.n1
                    @Override // eh.a
                    public final Object invoke() {
                        return bg.b.h(Boolean.FALSE);
                    }
                };
                kVarP.C(objG27);
            }
            kVarP.B();
            final x0.n1 n1Var20 = (x0.n1) b0.a0.d(objArr6, null, (eh.a) objG27, kVarP, 3072, 6);
            Object[] objArr7 = new Object[0];
            kVarP.L(1872993476);
            Object objG28 = kVarP.g();
            if (objG28 == obj11) {
                objG28 = new eh.a() { // from class: x8.o1
                    @Override // eh.a
                    public final Object invoke() {
                        return bg.b.h(Boolean.FALSE);
                    }
                };
                kVarP.C(objG28);
            }
            kVarP.B();
            final x0.n1 n1Var21 = (x0.n1) b0.a0.d(objArr7, null, (eh.a) objG28, kVarP, 3072, 6);
            x0.n1 n1VarB4 = bg.b.b(j6Var2.u(), kVarP);
            Object[] objArr8 = new Object[0];
            kVarP.L(1872998244);
            Object objG29 = kVarP.g();
            if (objG29 == obj11) {
                objG29 = new eh.a() { // from class: x8.w1
                    @Override // eh.a
                    public final Object invoke() {
                        return bg.b.h(Boolean.FALSE);
                    }
                };
                kVarP.C(objG29);
            }
            kVarP.B();
            x0.n1 n1Var22 = (x0.n1) b0.a0.d(objArr8, null, (eh.a) objG29, kVarP, 3072, 6);
            Object[] objArr9 = {x(n1VarB4), Integer.valueOf(listA.size()), Boolean.valueOf(((List) n1VarB2.getValue()).isEmpty()), Boolean.valueOf(((m0) n1VarB.getValue()).f32925b)};
            kVarP.L(1873005530);
            boolean zK9 = kVarP.K(n1VarB4) | kVarP.K(n1VarB) | kVarP.l(listA) | kVarP.K(n1VarB2) | kVarP.K(n1Var22) | kVarP.l(j6Var2);
            Object objG30 = kVarP.g();
            if (zK9 || objG30 == obj11) {
                n1Var4 = n1VarB;
                objG30 = new n4(listA, j6Var2, n1VarB4, n1Var4, n1VarB2, n1Var22, null);
                list = listA;
                n1Var5 = n1Var22;
                n1Var6 = n1VarB2;
                kVarP.C(objG30);
            } else {
                n1Var4 = n1VarB;
                list = listA;
                n1Var6 = n1VarB2;
                n1Var5 = n1Var22;
            }
            kVarP.B();
            x0.o0.g(objArr9, (eh.p) objG30, kVarP);
            boolean z14 = ((m0) n1Var4.getValue()).f32925b;
            final c0.w0 w0Var4 = r(n1Var) != null ? w0Var3 : w0Var;
            kVarP.L(1873021651);
            Object objG31 = kVarP.g();
            if (objG31 == obj11) {
                objG31 = bg.b.h(new p1.c(0L));
                kVarP.C(objG31);
            }
            final x0.n1 n1Var23 = (x0.n1) objG31;
            kVarP.B();
            ArrayList arrayList3 = new ArrayList(qg.p.h(list5, 10));
            Iterator it5 = list5.iterator();
            while (it5.hasNext()) {
                arrayList3.add(Long.valueOf(((ProjectEntity) it5.next()).getId()));
            }
            kVarP.L(1873027431);
            Object objG32 = kVarP.g();
            if (objG32 == obj11) {
                objG32 = new ec(n1Var2, 2);
                kVarP.C(objG32);
            }
            eh.l lVar = (eh.l) objG32;
            kVarP.B();
            kVarP.L(1873029390);
            boolean zL2 = kVarP.l(list3) | kVarP.l(j6Var2) | kVarP.l(list);
            Object objG33 = kVarP.g();
            if (zL2 || objG33 == obj11) {
                objG33 = new eh.l() { // from class: x8.x1
                    @Override // eh.l
                    public final Object invoke(Object obj15) {
                        boolean zBooleanValue2 = ((Boolean) obj15).booleanValue();
                        x0.n1 n1Var24 = n1Var2;
                        if (zBooleanValue2) {
                            n1Var24.setValue(null);
                        } else if (((List) n1Var24.getValue()) != null) {
                            List list6 = (List) n1Var24.getValue();
                            if (list6 == null) {
                                list6 = qg.z.f22752a;
                            }
                            List listB = w7.b(list3, list6, new q1());
                            ArrayList arrayList4 = new ArrayList(qg.p.h(listB, 10));
                            Iterator it6 = listB.iterator();
                            while (it6.hasNext()) {
                                arrayList4.add(Long.valueOf(((ProjectEntity) it6.next()).getId()));
                            }
                            g5.z(j6Var2, list, arrayList4, new androidx.credentials.playservices.controllers.identityauth.getsigninintent.d(1, arrayList4, n1Var24));
                        }
                        return pg.f0.f21461a;
                    }
                };
                kVarP.C(objG33);
            }
            eh.l lVar2 = (eh.l) objG33;
            kVarP.B();
            kVarP.L(1873043416);
            boolean zK10 = kVarP.K(w0Var4) | kVarP.K(n1Var) | kVarP.l(map6);
            Object objG34 = kVarP.g();
            if (zK10 || objG34 == obj11) {
                objG34 = new eh.l() { // from class: x8.y1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // eh.l
                    public final Object invoke(Object obj15) {
                        Object next6;
                        long jG = p1.c.g(((p1.c) n1Var23.getValue()).f21129a, ((p1.c) obj15).f21129a);
                        float fD = w0Var4.i().d();
                        long jG2 = p1.c.g(jG, (Float.floatToRawIntBits(CropImageView.DEFAULT_ASPECT_RATIO) << 32) | (Float.floatToRawIntBits(fD) & BodyPartID.bodyIdMax));
                        if (((Long) n1Var.getValue()) == null) {
                            Set setEntrySet = map6.entrySet();
                            kotlin.jvm.internal.r.d(setEntrySet, "<get-entries>(...)");
                            Iterator it6 = setEntrySet.iterator();
                            while (true) {
                                if (!it6.hasNext()) {
                                    next6 = null;
                                    break;
                                }
                                next6 = it6.next();
                                if (((p1.e) ((Map.Entry) next6).getValue()).a(jG2)) {
                                    break;
                                }
                            }
                            Map.Entry entry = (Map.Entry) next6;
                            if (entry != null) {
                                return (Long) entry.getKey();
                            }
                        }
                        return null;
                    }
                };
                kVarP.C(objG34);
            }
            eh.l lVar3 = (eh.l) objG34;
            kVarP.B();
            kVarP.L(1873055724);
            boolean zL3 = kVarP.l(j6Var2);
            List<ProjectEntity> list6 = list;
            Object objG35 = kVarP.g();
            if (zL3 || objG35 == obj11) {
                objG35 = new eh.p() { // from class: x8.z1
                    @Override // eh.p
                    public final Object invoke(Object obj15, Object obj16) {
                        long jLongValue = ((Long) obj15).longValue();
                        Long l11 = (Long) obj16;
                        l11.longValue();
                        n1Var2.setValue(null);
                        j6Var2.L(jLongValue, l11);
                        return pg.f0.f21461a;
                    }
                };
                kVarP.C(objG35);
            }
            kVarP.B();
            x0.n1 n1Var24 = n1Var2;
            n8 n8VarB = com.google.android.gms.common.api.internal.a.b(w0Var4, arrayList3, lVar, lVar2, lVar3, (eh.p) objG35, kVarP);
            x0.n1 n1VarB5 = bg.b.b(j6Var2.K(), kVarP);
            x0.n1 n1VarB6 = bg.b.b(k8.j.b(), kVarP);
            x0.n1 n1VarB7 = bg.b.b(j6Var2.B(), kVarP);
            x0.n1 n1VarB8 = bg.b.b(j6Var2.C(), kVarP);
            final Context context4 = (Context) kVarP.f(AndroidCompositionLocals_androidKt.f1281b);
            x0.n1 n1VarB9 = bg.b.b(j6Var2.I(), kVarP);
            x0.n1 n1VarB10 = bg.b.b(j6Var2.J(), kVarP);
            x0.n1 n1VarB11 = bg.b.b(j6Var2.v(), kVarP);
            x0.n1 n1VarB12 = bg.b.b(j6Var2.t(), kVarP);
            x0.n1 n1VarB13 = bg.b.b(j6Var2.D(), kVarP);
            x0.n1 n1VarB14 = bg.b.b(j6Var2.E(), kVarP);
            Object[] objArr10 = new Object[0];
            kVarP.L(1873085420);
            Object objG36 = kVarP.g();
            if (objG36 == obj11) {
                objG36 = new eh.a() { // from class: x8.o0
                    @Override // eh.a
                    public final Object invoke() {
                        return bg.b.h(null);
                    }
                };
                kVarP.C(objG36);
            }
            kVarP.B();
            final x0.n1 n1Var25 = (x0.n1) b0.a0.d(objArr10, null, (eh.a) objG36, kVarP, 3072, 6);
            final v8.q qVar2 = (v8.q) kVarP.f(v8.k.f());
            kVarP.L(1873088849);
            Object objG37 = kVarP.g();
            if (objG37 == obj11) {
                objG37 = bg.b.h(p1.e.f21130e);
                kVarP.C(objG37);
            }
            x0.n1 n1Var26 = (x0.n1) objG37;
            kVarP.B();
            long jD = ((t0.e2) kVarP.f(t0.f2.f25858a)).d();
            x0.n1 n1VarB15 = bg.b.b(j6Var2.r(), kVarP);
            Object[] objArr11 = new Object[0];
            kVarP.L(1873096106);
            Object objG38 = kVarP.g();
            if (objG38 == obj11) {
                n1Var7 = n1VarB5;
                objG38 = new t8.b(1);
                kVarP.C(objG38);
            } else {
                n1Var7 = n1VarB5;
            }
            kVarP.B();
            x0.n1 n1Var27 = (x0.n1) b0.a0.d(objArr11, null, (eh.a) objG38, kVarP, 3072, 6);
            Object[] objArr12 = new Object[0];
            kVarP.L(1873098602);
            Object objG39 = kVarP.g();
            if (objG39 == obj11) {
                z11 = true;
                objG39 = new t8.c(1);
                kVarP.C(objG39);
            } else {
                z11 = true;
            }
            kVarP.B();
            x0.n1 n1Var28 = (x0.n1) b0.a0.d(objArr12, null, (eh.a) objG39, kVarP, 3072, 6);
            Object[] objArr13 = new Object[0];
            kVarP.L(1873100865);
            Object objG40 = kVarP.g();
            if (objG40 == obj11) {
                objG40 = new eh.a() { // from class: x8.p0
                    @Override // eh.a
                    public final Object invoke() {
                        return bg.b.h("");
                    }
                };
                kVarP.C(objG40);
            }
            kVarP.B();
            x0.n1 n1Var29 = (x0.n1) b0.a0.d(objArr13, null, (eh.a) objG40, kVarP, 3072, 6);
            kVarP.L(1873102524);
            Object objG41 = kVarP.g();
            if (objG41 == obj11) {
                objG41 = bg.b.h(eVar2);
                kVarP.C(objG41);
            }
            x0.n1 n1Var30 = (x0.n1) objG41;
            kVarP.B();
            Object[] objArr14 = new Object[0];
            kVarP.L(1873105796);
            Object objG42 = kVarP.g();
            if (objG42 == obj11) {
                objG42 = new eh.a() { // from class: x8.q0
                    @Override // eh.a
                    public final Object invoke() {
                        return bg.b.h(Boolean.FALSE);
                    }
                };
                kVarP.C(objG42);
            }
            kVarP.B();
            x0.n1 n1Var31 = (x0.n1) b0.a0.d(objArr14, null, (eh.a) objG42, kVarP, 3072, 6);
            kVarP.L(1873107580);
            Object objG43 = kVarP.g();
            if (objG43 == obj11) {
                objG43 = bg.b.h(eVar2);
                kVarP.C(objG43);
            }
            final x0.n1 n1Var32 = (x0.n1) objG43;
            kVarP.B();
            Object[] objArr15 = new Object[0];
            kVarP.L(1873110628);
            Object objG44 = kVarP.g();
            if (objG44 == obj11) {
                objG44 = new eh.a() { // from class: x8.r0
                    @Override // eh.a
                    public final Object invoke() {
                        return bg.b.h(Boolean.FALSE);
                    }
                };
                kVarP.C(objG44);
            }
            kVarP.B();
            final x0.n1 n1Var33 = (x0.n1) b0.a0.d(objArr15, null, (eh.a) objG44, kVarP, 3072, 6);
            x0.n1 n1VarB16 = bg.b.b(j6Var2.x(), kVarP);
            l9.d0 d0Var = l9.d0.f16789a;
            String strO = o(n1VarB16);
            d0Var.getClass();
            boolean zJ = l9.d0.j(context4, strO);
            Object[] objArr16 = new Object[0];
            kVarP.L(1873118084);
            Object objG45 = kVarP.g();
            if (objG45 == obj11) {
                objG45 = new eh.a() { // from class: x8.s0
                    @Override // eh.a
                    public final Object invoke() {
                        return bg.b.h(Boolean.FALSE);
                    }
                };
                kVarP.C(objG45);
            }
            kVarP.B();
            x0.n1 n1Var34 = (x0.n1) b0.a0.d(objArr16, null, (eh.a) objG45, kVarP, 3072, 6);
            f.d dVar = new f.d();
            kVarP.L(1873122102);
            boolean zL4 = kVarP.l(j6Var2) | kVarP.l(context4);
            Object objG46 = kVarP.g();
            if (zL4 || objG46 == obj11) {
                objG46 = new eh.l() { // from class: x8.t0
                    @Override // eh.l
                    public final Object invoke(Object obj15) {
                        Uri uri = (Uri) obj15;
                        if (uri != null) {
                            Context context5 = context4;
                            kotlin.jvm.internal.r.e(context5, "context");
                            j6 j6Var7 = j6Var2;
                            ph.h.c(androidx.lifecycle.x0.a(j6Var7), null, null, new e7(j6Var7, context5, uri, null), 3);
                        }
                        return pg.f0.f21461a;
                    }
                };
                kVarP.C(objG46);
            }
            kVarP.B();
            c.k kVarA = c.d.a(dVar, (eh.l) objG46, kVarP, 0);
            kVarP.L(1873152059);
            boolean zK11 = kVarP.K(qVar2) | kVarP.l(navController) | kVarP.l(context4) | kVarP.K(n1Var25);
            Object objG47 = kVarP.g();
            if (zK11 || objG47 == obj11) {
                objG47 = new eh.l() { // from class: x8.u0
                    @Override // eh.l
                    public final Object invoke(Object obj15) {
                        j6.a result = (j6.a) obj15;
                        kotlin.jvm.internal.r.e(result, "result");
                        v8.q qVar3 = qVar2;
                        if (qVar3 != null) {
                            qVar3.f30742f.setValue(null);
                        }
                        boolean z15 = result instanceof j6.a.C0332a;
                        Context context5 = context4;
                        if (z15) {
                            g5.y(context5, ((j6.a.C0332a) result).f32800a, navController);
                            if (qVar3 != null) {
                                qVar3.f30740d.setValue(Boolean.TRUE);
                                qVar3.f30739c.setValue(Boolean.FALSE);
                            }
                        } else if (result instanceof j6.a.c) {
                            n1Var25.setValue(((j6.a.c) result).f32802a);
                        } else {
                            if (!(result instanceof j6.a.b)) {
                                throw new pg.l();
                            }
                            uc ucVar = q8.p2.f22362a;
                            String string = context5.getString(R.string.document_create_failed, ((j6.a.b) result).f32801a);
                            kotlin.jvm.internal.r.d(string, "getString(...)");
                            q8.p2.a(string, null, null);
                        }
                        return pg.f0.f21461a;
                    }
                };
                kVarP.C(objG47);
            }
            final eh.l lVar4 = (eh.l) objG47;
            kVarP.B();
            f.d dVar2 = new f.d();
            kVarP.L(1873170912);
            boolean zK12 = kVarP.K(qVar2) | kVarP.l(context4) | kVarP.l(j6Var2) | kVarP.K(lVar4);
            Object objG48 = kVarP.g();
            if (zK12 || objG48 == obj11) {
                objG48 = new eh.l() { // from class: x8.v0
                    @Override // eh.l
                    public final Object invoke(Object obj15) {
                        Uri uri = (Uri) obj15;
                        if (uri != null) {
                            v8.q qVar3 = qVar2;
                            if (qVar3 != null) {
                                qVar3.f30742f.setValue(context4.getString(R.string.opening_pdf));
                            }
                            eh.l<? super j6.a, pg.f0> onResult = lVar4;
                            kotlin.jvm.internal.r.e(onResult, "onResult");
                            j6 j6Var7 = j6Var2;
                            j6Var7.n(ProjectKind.PDF, onResult, uri, new q6(j6Var7, uri, null));
                        }
                        return pg.f0.f21461a;
                    }
                };
                kVarP.C(objG48);
            }
            kVarP.B();
            c.k kVarA2 = c.d.a(dVar2, (eh.l) objG48, kVarP, 0);
            f.d dVar3 = new f.d();
            kVarP.L(1873180034);
            boolean zK13 = kVarP.K(qVar2) | kVarP.l(context4) | kVarP.l(j6Var2) | kVarP.K(lVar4);
            Object objG49 = kVarP.g();
            if (zK13 || objG49 == obj11) {
                objG49 = new eh.l() { // from class: x8.w0
                    @Override // eh.l
                    public final Object invoke(Object obj15) {
                        Uri uri = (Uri) obj15;
                        if (uri != null) {
                            v8.q qVar3 = qVar2;
                            if (qVar3 != null) {
                                qVar3.f30742f.setValue(context4.getString(R.string.opening_html));
                            }
                            eh.l<? super j6.a, pg.f0> onResult = lVar4;
                            kotlin.jvm.internal.r.e(onResult, "onResult");
                            j6 j6Var7 = j6Var2;
                            j6Var7.n(ProjectKind.HTML, onResult, uri, new p6(j6Var7, uri, null));
                        }
                        return pg.f0.f21461a;
                    }
                };
                kVarP.C(objG49);
            }
            kVarP.B();
            c.k kVarA3 = c.d.a(dVar3, (eh.l) objG49, kVarP, 0);
            Object obj15 = (Long) n1Var27.getValue();
            kVarP.L(1873233229);
            boolean zK14 = kVarP.K(obj15) | kVarP.K(list5);
            Object objG50 = kVarP.g();
            if (zK14 || objG50 == obj11) {
                Iterator it6 = list5.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        next2 = eVar2;
                        break;
                    }
                    next2 = it6.next();
                    long id3 = ((ProjectEntity) next2).getId();
                    Long l11 = (Long) n1Var27.getValue();
                    if (l11 != null && id3 == l11.longValue()) {
                        break;
                    }
                }
                objG50 = (ProjectEntity) next2;
                kVarP.C(objG50);
            }
            ProjectEntity projectEntity2 = (ProjectEntity) objG50;
            kVarP.B();
            Object obj16 = (Long) n1Var28.getValue();
            kVarP.L(1873237229);
            boolean zK15 = kVarP.K(obj16) | kVarP.K(list5);
            Object objG51 = kVarP.g();
            if (zK15 || objG51 == obj11) {
                Iterator it7 = list5.iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        next3 = eVar2;
                        break;
                    }
                    next3 = it7.next();
                    long id4 = ((ProjectEntity) next3).getId();
                    Long l12 = (Long) n1Var28.getValue();
                    if (l12 != null && id4 == l12.longValue()) {
                        break;
                    }
                }
                objG51 = (ProjectEntity) next3;
                kVarP.C(objG51);
            }
            ProjectEntity projectEntity3 = (ProjectEntity) objG51;
            kVarP.B();
            kVarP.L(1873241255);
            Object objG52 = kVarP.g();
            if (objG52 == obj11) {
                if (!zBooleanValue) {
                    f11 = 1.0f;
                }
                objG52 = s.d.a(f11);
                kVarP.C(objG52);
            }
            s.b bVar4 = (s.b) objG52;
            kVarP.B();
            kVarP.L(1873244013);
            Object objG53 = kVarP.g();
            if (objG53 == obj11) {
                objG53 = bg.b.h(Boolean.FALSE);
                kVarP.C(objG53);
            }
            x0.n1 n1Var35 = (x0.n1) objG53;
            kVarP.B();
            pg.f0 f0Var = pg.f0.f21461a;
            kVarP.L(1873246031);
            boolean zL5 = kVarP.l(context4) | kVarP.l(j6Var2);
            Object objG54 = kVarP.g();
            if (zL5 || objG54 == obj11) {
                qVar = qVar2;
                objG54 = new o4(context4, eVar2, j6Var2);
                kVarP.C(objG54);
            } else {
                qVar = qVar2;
            }
            kVarP.B();
            x0.o0.d((eh.p) objG54, f0Var, kVarP);
            Boolean bool2 = (Boolean) n1Var35.getValue();
            bool2.getClass();
            kVarP.L(1873250691);
            boolean zL6 = kVarP.l(bVar4);
            Object objG55 = kVarP.g();
            if (zL6 || objG55 == obj11) {
                bVar2 = bVar4;
                objG55 = new q4(zBooleanValue, bVar2, n1Var35, n1Var13, null);
                kVarP.C(objG55);
            } else {
                bVar2 = bVar4;
            }
            kVarP.B();
            x0.o0.d((eh.p) objG55, bool2, kVarP);
            j6.b bVar5 = (j6.b) n1VarB15.getValue();
            kVarP.L(1873263890);
            boolean zK16 = kVarP.K(n1VarB15);
            Object objG56 = kVarP.g();
            if (zK16 || objG56 == obj11) {
                obj3 = null;
                objG56 = new r4(n1VarB15, null);
                kVarP.C(objG56);
            } else {
                obj3 = null;
            }
            kVarP.B();
            x0.o0.d((eh.p) objG56, bVar5, kVarP);
            final x0.n1 n1Var36 = n1Var;
            x0.n1 n1Var37 = n1Var7;
            f1.b bVarB = f1.c.b(-1086095470, new e5(zJ, n1Var34, j6Var2, navController, n1VarB13, n1Var37, n1VarB6, n1VarB3, kVarA, context4, n1Var31, n1Var30, n1VarB14), kVarP);
            int i17 = q1.b1.f21655i;
            x0.n1 n1Var38 = n1Var6;
            boolean z15 = z10;
            final v8.q qVar3 = qVar;
            final j6 j6Var7 = j6Var2;
            ra.a(null, bVarB, null, null, null, 0, b1.a.a(), 0L, new z.z(), f1.c.b(-365425891, new o3(list6, z14, n1Var5, n1Var19, n1Var38, n1Var3, w0Var, bVar, r3Var, n1Var36, list5, n8VarB, f10, i0Var3, map6, z15, n1Var20, n1Var21, n1VarB3, n1Var10, map4, n1Var37, map5, j6Var7, m0VarA, map2, navController, context4, d0VarE, jE, w0Var2, fN0, n1Var25, n1Var28, n1Var29, n1Var27, n1Var31, n1Var33, n1Var17, n1Var23, n1Var12, n1Var13, n1Var24, n1Var14, n1Var15, n1Var30, n1Var32, l10, w0Var3, n1Var35, n1Var26, bVar2, qVar3, jD, kVarA2, kVarA3, lVar4, n1VarB12, n1VarB9, n1VarB10), kVarP), kVarP, 806879280, 189);
            kVarP.L(1874270651);
            if (g(n1VarB7)) {
                kVarP.L(1874270667);
                boolean zL7 = kVarP.l(j6Var7);
                Object objG57 = kVarP.g();
                obj4 = obj11;
                if (zL7 || objG57 == obj4) {
                    i11 = 1;
                    objG57 = new g7.c(j6Var7, i11);
                    kVarP.C(objG57);
                } else {
                    i11 = 1;
                }
                kVarP.B();
                xVar = navController;
                t0.p.d((eh.a) objG57, null, null, f1.c.b(-1496411409, new q3(j6Var7, xVar), kVarP), kVarP, 3072, 6);
            } else {
                i11 = 1;
                xVar = navController;
                obj4 = obj11;
            }
            kVarP.B();
            kVarP.L(1874345098);
            if (h(n1VarB8)) {
                kVarP.L(1874347020);
                boolean zL8 = kVarP.l(j6Var7);
                Object objG58 = kVarP.g();
                if (zL8 || objG58 == obj4) {
                    i12 = 2;
                    objG58 = new pa(j6Var7, i12);
                    kVarP.C(objG58);
                } else {
                    i12 = 2;
                }
                eh.a aVar = (eh.a) objG58;
                kVarP.B();
                kVarP.L(1874349329);
                context = context4;
                boolean zL9 = kVarP.l(j6Var7) | kVarP.l(context);
                Object objG59 = kVarP.g();
                if (zL9 || objG59 == obj4) {
                    objG59 = new g7.d(i12, j6Var7, context);
                    kVarP.C(objG59);
                }
                kVarP.B();
                i13 = 0;
                q8.v1.a(aVar, (eh.a) objG59, null, kVarP, 0);
            } else {
                context = context4;
                i12 = 2;
                i13 = 0;
            }
            kVarP.B();
            kVarP.L(1874356628);
            if (u(n1Var19) || t(n1Var18) != null) {
                String strC = f3.q.c(R.string.folder_new, kVarP);
                kVarP.L(1874361642);
                boolean zL10 = kVarP.l(j6Var7) | kVarP.K(n1Var18) | kVarP.K(n1Var19);
                Object objG60 = kVarP.g();
                if (zL10 || objG60 == obj4) {
                    objG60 = new eh.l() { // from class: x8.x0
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // eh.l
                        public final Object invoke(Object obj17) {
                            String name = (String) obj17;
                            kotlin.jvm.internal.r.e(name, "name");
                            x0.n1 n1Var39 = n1Var18;
                            Long l13 = (Long) n1Var39.getValue();
                            List listC = l13 != null ? c0.g0.c(l13) : qg.z.f22752a;
                            String strB0 = mh.y.b0(40, mh.x.W(name).toString());
                            if (strB0.length() != 0) {
                                j6 j6Var8 = j6Var7;
                                ph.h.c(androidx.lifecycle.x0.a(j6Var8), null, null, new o6(j6Var8, strB0, listC, null), 3);
                            }
                            n1Var19.setValue(Boolean.FALSE);
                            n1Var39.setValue(null);
                            return pg.f0.f21461a;
                        }
                    };
                    kVarP.C(objG60);
                }
                eh.l lVar5 = (eh.l) objG60;
                kVarP.B();
                kVarP.L(1874368454);
                boolean zK17 = kVarP.K(n1Var19) | kVarP.K(n1Var18);
                Object objG61 = kVarP.g();
                if (zK17 || objG61 == obj4) {
                    objG61 = new androidx.credentials.playservices.controllers.identityauth.createpassword.g(i11, n1Var19, n1Var18);
                    kVarP.C(objG61);
                }
                kVarP.B();
                n1Var8 = n1Var18;
                kVar = kVarP;
                s.d(strC, null, lVar5, (eh.a) objG61, kVar, 0, 2);
            } else {
                kVar = kVarP;
                n1Var8 = n1Var18;
            }
            kVar.B();
            kVar.L(1874371368);
            if (!v(n1Var20) || folderEntity2 == null) {
                folderEntity = folderEntity2;
            } else {
                String strC2 = f3.q.c(R.string.folder_rename, kVar);
                String name = folderEntity2.getName();
                kVar.L(1874377709);
                boolean zL11 = kVar.l(j6Var7) | kVar.K(folderEntity2) | kVar.K(n1Var20);
                Object objG62 = kVar.g();
                if (zL11 || objG62 == obj4) {
                    objG62 = new eh.l() { // from class: x8.z0
                        @Override // eh.l
                        public final Object invoke(Object obj17) {
                            String name2 = (String) obj17;
                            kotlin.jvm.internal.r.e(name2, "name");
                            String strB0 = mh.y.b0(40, mh.x.W(name2).toString());
                            if (strB0.length() != 0) {
                                j6 j6Var8 = j6Var7;
                                ph.h.c(androidx.lifecycle.x0.a(j6Var8), null, null, new o7(j6Var8, folderEntity2, strB0, null), 3);
                            }
                            n1Var20.setValue(Boolean.FALSE);
                            return pg.f0.f21461a;
                        }
                    };
                    kVar.C(objG62);
                }
                eh.l lVar6 = (eh.l) objG62;
                kVar.B();
                kVar.L(1874382605);
                boolean zK18 = kVar.K(n1Var20);
                Object objG63 = kVar.g();
                if (zK18 || objG63 == obj4) {
                    objG63 = new v8.j(n1Var20, i11);
                    kVar.C(objG63);
                }
                eh.a aVar2 = (eh.a) objG63;
                kVar.B();
                folderEntity = folderEntity2;
                s.d(strC2, name, lVar6, aVar2, kVar, 0, 0);
            }
            kVar.B();
            kVar.L(1874384708);
            if (w(n1Var21) && folderEntity != null) {
                kVar.L(1874389065);
                boolean zL12 = kVar.l(j6Var7) | kVar.K(folderEntity) | kVar.K(n1Var21) | kVar.K(n1Var36);
                Object objG64 = kVar.g();
                if (zL12 || objG64 == obj4) {
                    objG64 = new eh.a() { // from class: x8.b1
                        @Override // eh.a
                        public final Object invoke() {
                            long id5 = folderEntity.getId();
                            j6 j6Var8 = j6Var7;
                            ph.h.c(androidx.lifecycle.x0.a(j6Var8), null, null, new r6(j6Var8, id5, null), 3);
                            n1Var21.setValue(Boolean.FALSE);
                            n1Var36.setValue(null);
                            return pg.f0.f21461a;
                        }
                    };
                    kVar.C(objG64);
                }
                eh.a aVar3 = (eh.a) objG64;
                kVar.B();
                kVar.L(1874394829);
                boolean zK19 = kVar.K(n1Var21);
                Object objG65 = kVar.g();
                if (zK19 || objG65 == obj4) {
                    objG65 = new v8.o(n1Var21, i11);
                    kVar.C(objG65);
                }
                kVar.B();
                s.a(folderEntity, aVar3, (eh.a) objG65, kVar, i13);
            }
            kVar.B();
            Long lS = s(n1Var17);
            kVar.L(1874397535);
            if (lS == null) {
                kVar2 = kVar;
            } else {
                final long jLongValue = lS.longValue();
                List list7 = (List) n1Var38.getValue();
                Iterator<T> it8 = list6.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        next4 = null;
                        break;
                    } else {
                        next4 = it8.next();
                        if (((ProjectEntity) next4).getId() == jLongValue) {
                            break;
                        }
                    }
                }
                ProjectEntity projectEntity4 = (ProjectEntity) next4;
                Long folderId2 = projectEntity4 != null ? projectEntity4.getFolderId() : null;
                kVar.L(1423448006);
                boolean zL13 = kVar.l(j6Var7) | kVar.j(jLongValue) | kVar.K(n1Var17);
                Object objG66 = kVar.g();
                if (zL13 || objG66 == obj4) {
                    objG66 = new eh.l() { // from class: x8.c1
                        @Override // eh.l
                        public final Object invoke(Object obj17) {
                            j6Var7.L(jLongValue, (Long) obj17);
                            n1Var17.setValue(null);
                            return pg.f0.f21461a;
                        }
                    };
                    kVar.C(objG66);
                }
                eh.l lVar7 = (eh.l) objG66;
                kVar.B();
                kVar.L(1423452942);
                boolean zK20 = kVar.K(n1Var8) | kVar.j(jLongValue) | kVar.K(n1Var17);
                Object objG67 = kVar.g();
                if (zK20 || objG67 == obj4) {
                    objG67 = new eh.a() { // from class: x8.d1
                        @Override // eh.a
                        public final Object invoke() {
                            n1Var8.setValue(Long.valueOf(jLongValue));
                            n1Var17.setValue(null);
                            return pg.f0.f21461a;
                        }
                    };
                    kVar.C(objG67);
                }
                eh.a aVar4 = (eh.a) objG67;
                kVar.B();
                kVar.L(1423456898);
                boolean zK21 = kVar.K(n1Var17);
                Object objG68 = kVar.g();
                if (zK21 || objG68 == obj4) {
                    objG68 = new s8.n0(n1Var17, i11);
                    kVar.C(objG68);
                }
                kVar.B();
                x0.k kVar8 = kVar;
                s.g(list7, folderId2, lVar7, aVar4, (eh.a) objG68, kVar8, 0);
                kVar2 = kVar8;
                pg.f0 f0Var2 = pg.f0.f21461a;
            }
            kVar2.B();
            String strJ = j(n1Var25);
            kVar2.L(1874414093);
            if (strJ != null) {
                kVar2.L(1423461965);
                boolean zK22 = kVar2.K(n1Var25) | kVar2.K(qVar3) | kVar2.l(xVar);
                Object objG69 = kVar2.g();
                if (zK22 || objG69 == obj4) {
                    objG69 = new eh.a() { // from class: x8.e1
                        @Override // eh.a
                        public final Object invoke() {
                            n1Var25.setValue(null);
                            v8.q qVar4 = qVar3;
                            if (qVar4 != null) {
                                qVar4.f30740d.setValue(Boolean.TRUE);
                                qVar4.f30739c.setValue(Boolean.FALSE);
                            }
                            p5.x.c(e2.r.f24648c.f24627a, xVar);
                            return pg.f0.f21461a;
                        }
                    };
                    kVar2.C(objG69);
                }
                eh.a aVar5 = (eh.a) objG69;
                kVar2.B();
                kVar2.L(1423467876);
                boolean zK23 = kVar2.K(n1Var25);
                Object objG70 = kVar2.g();
                if (zK23 || objG70 == obj4) {
                    objG70 = new f9.i2(n1Var25, i12);
                    kVar2.C(objG70);
                }
                kVar2.B();
                q8.o1.a(strJ, aVar5, (eh.a) objG70, kVar2, i13);
                pg.f0 f0Var3 = pg.f0.f21461a;
            }
            kVar2.B();
            kVar2.L(1874425303);
            if (projectEntity2 != null) {
                long jE2 = ((t0.e2) kVar2.f(t0.f2.f25858a)).e();
                kVar2.L(1874426951);
                boolean zK24 = kVar2.K(n1Var27);
                Object objG71 = kVar2.g();
                if (zK24 || objG71 == obj4) {
                    objG71 = new b9.o(n1Var27, i11);
                    kVar2.C(objG71);
                }
                kVar2.B();
                x0.k kVar9 = kVar2;
                j6Var3 = j6Var7;
                context2 = context;
                obj5 = obj4;
                t0.r.a((eh.a) objG71, f1.c.b(-909380644, new t3(projectEntity2, j6Var7, n1Var27), kVar2), null, f1.c.b(-1449810150, new v3(n1Var27), kVar2), null, c.f32356n, c.f32357o, null, jE2, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, kVar9, 1772592, 0, 16020);
                kVar3 = kVar9;
            } else {
                j6Var3 = j6Var7;
                obj5 = obj4;
                context2 = context;
                kVar3 = kVar2;
            }
            kVar3.B();
            kVar3.L(1874458938);
            if (projectEntity3 != null) {
                long jE3 = ((t0.e2) kVar3.f(t0.f2.f25858a)).e();
                kVar3.L(1874460295);
                boolean zK25 = kVar3.K(n1Var28);
                Object objG72 = kVar3.g();
                if (zK25 || objG72 == obj5) {
                    i16 = 1;
                    objG72 = new f9.m2(n1Var28, i16);
                    kVar3.C(objG72);
                } else {
                    i16 = 1;
                }
                kVar3.B();
                x0.k kVar10 = kVar3;
                obj6 = obj5;
                j6Var4 = j6Var3;
                t0.r.a((eh.a) objG72, f1.c.b(2101675485, new x3(projectEntity3, j6Var3, n1Var29, n1Var28), kVar3), null, f1.c.b(1561245979, new y3(n1Var28), kVar3), null, c.f32360r, f1.c.b(-1396881928, new a4(n1Var29), kVar3), null, jE3, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, kVar10, 1772592, 0, 16020);
                kVar4 = kVar10;
            } else {
                obj6 = obj5;
                j6Var4 = j6Var3;
                kVar4 = kVar3;
            }
            kVar4.B();
            j6.b bVar6 = (j6.b) n1VarB15.getValue();
            kVar4.L(1874505319);
            if (bVar6 == null) {
                obj7 = obj6;
                context3 = context2;
                i14 = 1;
            } else {
                kVar4.L(1423548467);
                boolean zL14 = kVar4.l(j6Var4);
                Object objG73 = kVar4.g();
                obj7 = obj6;
                if (zL14 || objG73 == obj7) {
                    i14 = 1;
                    objG73 = new b9.r(j6Var4, i14);
                    kVar4.C(objG73);
                } else {
                    i14 = 1;
                }
                kVar4.B();
                context3 = context2;
                t0.p.d((eh.a) objG73, null, null, f1.c.b(531230882, new f4(context3, bVar6, j6Var4), kVar4), kVar4, 3072, 6);
                pg.f0 f0Var4 = pg.f0.f21461a;
            }
            kVar4.B();
            kVar4.L(1874642020);
            if (k(n1Var31)) {
                long jE4 = ((t0.e2) kVar4.f(t0.f2.f25858a)).e();
                kVar4.L(1874643023);
                boolean zK26 = kVar4.K(n1Var31);
                Object objG74 = kVar4.g();
                if (zK26 || objG74 == obj7) {
                    objG74 = new androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.m(n1Var31, 2);
                    kVar4.C(objG74);
                }
                kVar4.B();
                x0.k kVar11 = kVar4;
                obj8 = obj7;
                t0.r.a((eh.a) objG74, f1.c.b(817764318, new h4(context3, n1Var31, n1Var30, j6Var4), kVar4), null, f1.c.b(277334812, new j4(context3, n1Var31, n1Var30, j6Var4), kVar4), null, c.f32367y, c.f32368z, null, jE4, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, kVar11, 1772592, 0, 16020);
                kVar5 = kVar11;
            } else {
                obj8 = obj7;
                kVar5 = kVar4;
            }
            kVar5.B();
            j6.c cVarI = i(n1VarB11);
            kVar5.L(1874696881);
            if (cVarI == null) {
                j6Var5 = j6Var4;
                obj10 = obj8;
                kVar6 = kVar5;
            } else {
                long jE5 = ((t0.e2) kVar5.f(t0.f2.f25858a)).e();
                kVar5.L(1423743339);
                boolean zL15 = kVar5.l(j6Var4);
                Object objG75 = kVar5.g();
                if (zL15) {
                    obj9 = obj8;
                } else {
                    obj9 = obj8;
                    if (objG75 != obj9) {
                        i15 = 1;
                    }
                    kVar5.B();
                    x0.k kVar12 = kVar5;
                    j6Var5 = j6Var4;
                    obj10 = obj9;
                    t0.r.a((eh.a) objG75, f1.c.b(257096290, new u8.b0(j6Var4, i15), kVar5), null, null, null, c.B, f1.c.b(-2058928217, new k4(cVarI), kVar5), null, jE5, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, kVar12, 1769520, 0, 16028);
                    kVar6 = kVar12;
                    pg.f0 f0Var5 = pg.f0.f21461a;
                }
                i15 = 1;
                objG75 = new b9.s(j6Var4, i15);
                kVar5.C(objG75);
                kVar5.B();
                x0.k kVar122 = kVar5;
                j6Var5 = j6Var4;
                obj10 = obj9;
                t0.r.a((eh.a) objG75, f1.c.b(257096290, new u8.b0(j6Var4, i15), kVar5), null, null, null, c.B, f1.c.b(-2058928217, new k4(cVarI), kVar5), null, jE5, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, kVar122, 1769520, 0, 16028);
                kVar6 = kVar122;
                pg.f0 f0Var52 = pg.f0.f21461a;
            }
            kVar6.B();
            ProjectEntity projectEntityM = m(n1Var32);
            kVar6.L(1874724987);
            if (projectEntityM != null) {
                kVar6.L(1874725756);
                if (n(n1Var33)) {
                    long id5 = projectEntityM.getId();
                    String name2 = projectEntityM.getName();
                    kVar6.L(1423776152);
                    boolean zK27 = kVar6.K(n1Var33);
                    Object objG76 = kVar6.g();
                    if (zK27 || objG76 == obj10) {
                        objG76 = new eh.a() { // from class: x8.h1
                            @Override // eh.a
                            public final Object invoke() {
                                n1Var33.setValue(Boolean.FALSE);
                                n1Var32.setValue(null);
                                return pg.f0.f21461a;
                            }
                        };
                        kVar6.C(objG76);
                    }
                    kVar6.B();
                    k8.a(0, id5, (eh.a) objG76, name2, kVar6);
                }
                kVar6.B();
                pg.f0 f0Var6 = pg.f0.f21461a;
            }
            kVar6.B();
            if (p(n1Var34)) {
                kVar6.L(1874738441);
                boolean zK28 = kVar6.K(n1Var34);
                Object objG77 = kVar6.g();
                if (zK28 || objG77 == obj10) {
                    objG77 = new q5.e0(n1Var34, 1);
                    kVar6.C(objG77);
                }
                kVar6.B();
                D(0, (eh.a) objG77, kVar6);
            }
            j6Var6 = j6Var5;
            kVar7 = kVar6;
        }
        x0.h2 h2VarV = kVar7.V();
        if (h2VarV != null) {
            h2VarV.f(new eh.p(j6Var6, f10, i10) { // from class: x8.i1

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ j6 f32736b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ float f32737c;

                @Override // eh.p
                public final Object invoke(Object obj17, Object obj18) {
                    ((Integer) obj18).getClass();
                    int iN = f3.i.n(1);
                    g5.d(this.f32735a, this.f32736b, this.f32737c, (x0.j) obj17, iN);
                    return pg.f0.f21461a;
                }
            });
        }
    }

    public static final void e(s.b<Float, s.o> bVar, ph.i0 i0Var, x0.n1<Long> n1Var, x0.n1<List<Long>> n1Var2, x0.n1<Long> n1Var3, HashMap<Long, p1.e> map, boolean z10, x0.n1<p1.c> n1Var4, x0.n1<p1.e> n1Var5) {
        Long value = n1Var.getValue();
        if (value != null) {
            long jLongValue = value.longValue();
            if (bVar.e()) {
                return;
            }
            n1Var2.setValue(null);
            n1Var3.setValue(value);
            n1Var.setValue(null);
            ph.h.c(i0Var, null, null, new a(map, jLongValue, bVar, z10, n1Var4, n1Var5, n1Var3, null), 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean f(x0.n1 n1Var) {
        return ((Boolean) n1Var.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean g(x0.n1 n1Var) {
        return ((Boolean) n1Var.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean h(x0.n1 n1Var) {
        return ((Boolean) n1Var.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final j6.c i(x0.n1 n1Var) {
        return (j6.c) n1Var.getValue();
    }

    public static final String j(x0.n1<String> n1Var) {
        return n1Var.getValue();
    }

    public static final boolean k(x0.n1<Boolean> n1Var) {
        return n1Var.getValue().booleanValue();
    }

    public static final void l(x0.n1<Boolean> n1Var, boolean z10) {
        n1Var.setValue(Boolean.valueOf(z10));
    }

    public static final ProjectEntity m(x0.n1<ProjectEntity> n1Var) {
        return n1Var.getValue();
    }

    public static final boolean n(x0.n1<Boolean> n1Var) {
        return n1Var.getValue().booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final String o(x0.n1 n1Var) {
        return (String) n1Var.getValue();
    }

    public static final boolean p(x0.n1<Boolean> n1Var) {
        return n1Var.getValue().booleanValue();
    }

    public static final Long q(x0.n1<Long> n1Var) {
        return n1Var.getValue();
    }

    public static final Long r(x0.n1<Long> n1Var) {
        return n1Var.getValue();
    }

    public static final Long s(x0.n1<Long> n1Var) {
        return n1Var.getValue();
    }

    public static final Long t(x0.n1<Long> n1Var) {
        return n1Var.getValue();
    }

    public static final boolean u(x0.n1<Boolean> n1Var) {
        return n1Var.getValue().booleanValue();
    }

    public static final boolean v(x0.n1<Boolean> n1Var) {
        return n1Var.getValue().booleanValue();
    }

    public static final boolean w(x0.n1<Boolean> n1Var) {
        return n1Var.getValue().booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Boolean x(x0.n1 n1Var) {
        return (Boolean) n1Var.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void y(Context context, ProjectEntity projectEntity, p5.x xVar) {
        File file;
        String strNormalize = ProjectKind.INSTANCE.normalize(projectEntity.getKind());
        if (kotlin.jvm.internal.r.a(strNormalize, ProjectKind.HTML)) {
            p5.x.c(e2.l.f24642c.a(projectEntity.getId()), xVar);
            return;
        }
        if (!kotlin.jvm.internal.r.a(strNormalize, ProjectKind.PDF)) {
            p5.x.c(e2.v.a(e2.v.f24652c, projectEntity.getId(), false, null, 6), xVar);
            return;
        }
        String sourcePath = projectEntity.getSourcePath();
        if (sourcePath != null) {
            file = new File(sourcePath);
            if (!file.isFile()) {
                file = null;
            }
        }
        if (file != null) {
            int i10 = PdfPreviewActivity.f5788v;
            PdfPreviewActivity.a.b(context, projectEntity, false);
        } else {
            uc ucVar = q8.p2.f22362a;
            String string = context.getString(R.string.pdf_required);
            kotlin.jvm.internal.r.d(string, "getString(...)");
            q8.p2.a(string, null, null);
        }
    }

    public static final void z(j6 j6Var, List<ProjectEntity> list, List<Long> list2, eh.a<pg.f0> aVar) {
        ArrayList arrayList = new ArrayList(qg.p.h(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((ProjectEntity) it.next()).getId()));
        }
        Set setH0 = qg.x.h0(list2);
        qg.l lVar = new qg.l(list2);
        ArrayList arrayList2 = new ArrayList(qg.p.h(arrayList, 10));
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            long jLongValue = ((Number) obj).longValue();
            if (setH0.contains(Long.valueOf(jLongValue)) && !lVar.isEmpty()) {
                jLongValue = ((Number) lVar.removeFirst()).longValue();
            }
            arrayList2.add(Long.valueOf(jLongValue));
        }
        sh.z0 z0Var = j6Var.f32782i;
        z0Var.getClass();
        z0Var.j(null, arrayList2);
        ph.h.c(androidx.lifecycle.x0.a(j6Var), null, null, new s7(j6Var, arrayList2, aVar, null), 3);
    }
}
