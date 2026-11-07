package q8;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.d;
import b9.g3;
import b9.h3;
import com.android.apksig.internal.apk.v4.V4Signature;
import com.yalantis.ucrop.view.CropImageView;
import i2.e0;
import i2.g;
import j1.d;
import org.jf.dexlib2.dexbacked.raw.HeaderItem;
import t0.md;
import x0.j;

/* loaded from: classes.dex */
public final class n2 {

    /* renamed from: a, reason: collision with root package name */
    public static final mh.k f22323a = new mh.k("%([12])\\$s");

    public static final class a implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f22324a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f22325b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f22326c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f22327d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ x0.n1<Boolean> f22328e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ x0.n1<Boolean> f22329f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ x0.n1<Boolean> f22330g;

        public a(boolean z10, boolean z11, eh.a<pg.f0> aVar, eh.a<pg.f0> aVar2, x0.n1<Boolean> n1Var, x0.n1<Boolean> n1Var2, x0.n1<Boolean> n1Var3) {
            this.f22324a = z10;
            this.f22325b = z11;
            this.f22326c = aVar;
            this.f22327d = aVar2;
            this.f22328e = n1Var;
            this.f22329f = n1Var2;
            this.f22330g = n1Var3;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                md.a(androidx.compose.foundation.layout.g.d(androidx.compose.foundation.layout.g.s(androidx.compose.foundation.layout.f.h(d.a.f1143b, 24), CropImageView.DEFAULT_ASPECT_RATIO, 440, 1), 1.0f), h0.f.a(28), ((t0.e2) jVar2.f(t0.f2.f25858a)).G, 0L, 6, CropImageView.DEFAULT_ASPECT_RATIO, null, f1.c.b(455663680, new m2(this.f22324a, this.f22325b, this.f22326c, this.f22327d, this.f22328e, this.f22329f, this.f22330g), jVar2), jVar2, 12607494, HeaderItem.DATA_SIZE_OFFSET);
            }
            return pg.f0.f21461a;
        }
    }

    public static final void a(int i10, x0.j jVar) {
        x0.k kVarP = jVar.p(1648564609);
        if (i10 == 0 && kVarP.s()) {
            kVarP.v();
        } else {
            t0.v2.a(androidx.compose.foundation.layout.f.j(d.a.f1143b, 16, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, q1.b1.c(0.5f, ((t0.e2) kVarP.f(t0.f2.f25858a)).B), kVarP, 6, 2);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new c2();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final boolean z10, final boolean z11, final eh.l lVar, f1.b bVar, x0.j jVar, final int i10) {
        int i11;
        int i12;
        final f1.b bVar2;
        x0.k kVarP = jVar.p(-1827187642);
        int i13 = i10 | (kVarP.c(z10) ? 4 : 2) | (kVarP.c(z11) ? 32 : 16) | (kVarP.l(lVar) ? 256 : 128);
        if ((i13 & 1171) == 1170 && kVarP.s()) {
            kVarP.v();
            bVar2 = bVar;
        } else {
            d.a aVar = d.a.f1143b;
            float f10 = 6;
            androidx.compose.ui.d dVarK = androidx.compose.foundation.layout.f.k(androidx.compose.ui.c.a(androidx.compose.foundation.layout.g.d(aVar, 1.0f), j2.c3.f14686a, new g0.d(z10, z11, new q2.i(1), lVar)), 4, f10, 16, f10);
            z.m1 m1VarA = z.k1.a(z.b.f34444a, d.a.f14612k, kVarP, 48);
            int i14 = kVarP.P;
            x0.a2 a2VarP = kVarP.P();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarK, kVarP);
            i2.g.f13861o.getClass();
            e0.a aVar2 = g.a.f13863b;
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar2);
            } else {
                kVarP.z();
            }
            g.a.b bVar3 = g.a.f13867f;
            ph.v1.j(bVar3, m1VarA, kVarP);
            g.a.d dVar = g.a.f13866e;
            ph.v1.j(dVar, a2VarP, kVarP);
            g.a.C0128a c0128a = g.a.f13868g;
            if (kVarP.O) {
                i11 = 6;
            } else {
                i11 = 6;
                if (!kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i14))) {
                }
                g.a.c cVar = g.a.f13865d;
                ph.v1.j(cVar, dVarC, kVarP);
                t0.m1.a(z10, null, androidx.compose.foundation.layout.f.h(aVar, 12), z11, null, kVarP, (i13 & 14) | 432 | ((i13 << 6) & V4Signature.MAX_SIGNING_INFOS_SIZE), 48);
                if (1.0f <= 0.0d) {
                    a0.a.a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                g2.l0 l0VarD = z.g.d(d.a.f14602a, false);
                i12 = kVarP.P;
                x0.a2 a2VarP2 = kVarP.P();
                androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(layoutWeightElement, kVarP);
                kVarP.r();
                if (kVarP.O) {
                    kVarP.z();
                } else {
                    kVarP.w(aVar2);
                }
                ph.v1.j(bVar3, l0VarD, kVarP);
                ph.v1.j(dVar, a2VarP2, kVarP);
                if (!kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i12))) {
                    org.bouncycastle.jcajce.provider.digest.e.a(i12, kVarP, i12, c0128a);
                }
                ph.v1.j(cVar, dVarC2, kVarP);
                bVar2 = bVar;
                bVar2.invoke(kVarP, Integer.valueOf(i11));
                kVarP.T(true);
                kVarP.T(true);
            }
            org.bouncycastle.jcajce.provider.digest.e.a(i14, kVarP, i14, c0128a);
            g.a.c cVar2 = g.a.f13865d;
            ph.v1.j(cVar2, dVarC, kVarP);
            t0.m1.a(z10, null, androidx.compose.foundation.layout.f.h(aVar, 12), z11, null, kVarP, (i13 & 14) | 432 | ((i13 << 6) & V4Signature.MAX_SIGNING_INFOS_SIZE), 48);
            if (1.0f <= 0.0d) {
            }
            LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f, true);
            g2.l0 l0VarD2 = z.g.d(d.a.f14602a, false);
            i12 = kVarP.P;
            x0.a2 a2VarP22 = kVarP.P();
            androidx.compose.ui.d dVarC22 = androidx.compose.ui.c.c(layoutWeightElement2, kVarP);
            kVarP.r();
            if (kVarP.O) {
            }
            ph.v1.j(bVar3, l0VarD2, kVarP);
            ph.v1.j(dVar, a2VarP22, kVarP);
            if (!kVarP.O) {
                org.bouncycastle.jcajce.provider.digest.e.a(i12, kVarP, i12, c0128a);
                ph.v1.j(cVar2, dVarC22, kVarP);
                bVar2 = bVar;
                bVar2.invoke(kVarP, Integer.valueOf(i11));
                kVarP.T(true);
                kVarP.T(true);
            }
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(z10, z11, lVar, bVar2, i10) { // from class: q8.d2

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ boolean f22167a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ boolean f22168b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ eh.l f22169c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ f1.b f22170d;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(3073);
                    n2.b(this.f22167a, this.f22168b, this.f22169c, this.f22170d, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(final boolean z10, final eh.a<pg.f0> onDismiss, eh.a<pg.f0> onConfirm, x0.j jVar, final int i10) {
        final boolean z11;
        final eh.a<pg.f0> aVar;
        final eh.a<pg.f0> aVar2;
        kotlin.jvm.internal.r.e(onDismiss, "onDismiss");
        kotlin.jvm.internal.r.e(onConfirm, "onConfirm");
        x0.k kVarP = jVar.p(997737266);
        int i11 = (kVarP.c(z10) ? 4 : 2) | i10 | (kVarP.l(onDismiss) ? 32 : 16) | (kVarP.l(onConfirm) ? 256 : 128);
        if ((i11 & 147) == 146 && kVarP.s()) {
            kVarP.v();
            z11 = z10;
            aVar = onConfirm;
            aVar2 = onDismiss;
        } else {
            Object[] objArr = new Object[0];
            kVarP.L(-891789367);
            Object objG = kVarP.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (objG == c0321a) {
                objG = new g2();
                kVarP.C(objG);
            }
            kVarP.T(false);
            x0.n1 n1Var = (x0.n1) b0.a0.d(objArr, null, (eh.a) objG, kVarP, 3072, 6);
            Object[] objArr2 = new Object[0];
            kVarP.L(-891787351);
            Object objG2 = kVarP.g();
            if (objG2 == c0321a) {
                objG2 = new h2();
                kVarP.C(objG2);
            }
            kVarP.T(false);
            x0.n1 n1Var2 = (x0.n1) b0.a0.d(objArr2, null, (eh.a) objG2, kVarP, 3072, 6);
            Object[] objArr3 = new Object[0];
            kVarP.L(-891785431);
            Object objG3 = kVarP.g();
            if (objG3 == c0321a) {
                objG3 = new z1();
                kVarP.C(objG3);
            }
            kVarP.T(false);
            x0.n1 n1Var3 = (x0.n1) b0.a0.d(objArr3, null, (eh.a) objG3, kVarP, 3072, 6);
            boolean z12 = ((Boolean) n1Var.getValue()).booleanValue() && ((Boolean) n1Var2.getValue()).booleanValue() && ((Boolean) n1Var3.getValue()).booleanValue();
            kVarP.L(-891781782);
            boolean z13 = ((i11 & 14) == 4) | ((i11 & 112) == 32);
            Object objG4 = kVarP.g();
            if (z13 || objG4 == c0321a) {
                objG4 = new eh.a() { // from class: q8.a2
                    @Override // eh.a
                    public final Object invoke() {
                        if (!z10) {
                            onDismiss.invoke();
                        }
                        return pg.f0.f21461a;
                    }
                };
                kVarP.C(objG4);
            }
            kVarP.T(false);
            j3.d0 d0Var = new j3.d0(3);
            a aVar3 = new a(z12, z10, onConfirm, onDismiss, n1Var, n1Var2, n1Var3);
            z11 = z10;
            aVar = onConfirm;
            aVar2 = onDismiss;
            j3.j.a((eh.a) objG4, d0Var, f1.c.b(475584635, aVar3, kVarP), kVarP, 432, 0);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(z11, aVar2, aVar, i10) { // from class: q8.b2

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ boolean f22119a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ eh.a f22120b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ eh.a f22121c;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    n2.c(this.f22119a, this.f22120b, this.f22121c, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final eh.a d(boolean z10, eh.l onSignIn, x0.j jVar) {
        kotlin.jvm.internal.r.e(onSignIn, "onSignIn");
        jVar.L(-152474901);
        Object[] objArr = new Object[0];
        jVar.L(-1908619689);
        Object objG = jVar.g();
        Object obj = j.a.f31715a;
        if (objG == obj) {
            objG = new e2();
            jVar.C(objG);
        }
        jVar.B();
        final x0.n1 n1Var = (x0.n1) b0.a0.d(objArr, null, (eh.a) objG, jVar, 3072, 6);
        jVar.L(-1908618577);
        if (((Boolean) n1Var.getValue()).booleanValue()) {
            jVar.L(-1908615858);
            boolean zK = jVar.K(n1Var);
            Object objG2 = jVar.g();
            if (zK || objG2 == obj) {
                objG2 = new eh.a() { // from class: q8.f2
                    @Override // eh.a
                    public final Object invoke() {
                        n1Var.setValue(Boolean.FALSE);
                        return pg.f0.f21461a;
                    }
                };
                jVar.C(objG2);
            }
            eh.a aVar = (eh.a) objG2;
            jVar.B();
            jVar.L(-1908614501);
            boolean zK2 = jVar.K(onSignIn) | jVar.K(n1Var);
            Object objG3 = jVar.g();
            if (zK2 || objG3 == obj) {
                objG3 = new g3(2, onSignIn, n1Var);
                jVar.C(objG3);
            }
            jVar.B();
            c(z10, aVar, (eh.a) objG3, jVar, 0);
        }
        boolean zB = androidx.datastore.preferences.protobuf.e.b(jVar, -1908612691, n1Var);
        Object objG4 = jVar.g();
        if (zB || objG4 == obj) {
            objG4 = new h3(n1Var, 1);
            jVar.C(objG4);
        }
        eh.a aVar2 = (eh.a) objG4;
        jVar.B();
        jVar.B();
        return aVar2;
    }
}
