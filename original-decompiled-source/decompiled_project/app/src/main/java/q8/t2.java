package q8;

import android.content.Context;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.yalantis.ucrop.view.CropImageView;
import i2.e0;
import i2.g;
import j1.d;
import t0.ff;
import x0.j;

/* loaded from: classes.dex */
public final class t2 {

    @vg.e(c = "com.basitce.htmltoapk.ui.components.WalkingPixelCatKt$HeartParticle$1$1", f = "WalkingPixelCat.kt", l = {330}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f22392a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ s.b<Float, s.o> f22393b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(s.b<Float, s.o> bVar, tg.e<? super a> eVar) {
            super(2, eVar);
            this.f22393b = bVar;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new a(this.f22393b, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f22392a;
            if (i10 == 0) {
                pg.q.b(obj);
                Float f10 = new Float(-50.0f);
                s.m2 m2VarD = s.m.d(750, 0, s.d0.f23706d, 2);
                this.f22392a = 1;
                if (s.b.c(this.f22393b, f10, m2VarD, null, this, 12) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
            }
            return pg.f0.f21461a;
        }
    }

    @vg.e(c = "com.basitce.htmltoapk.ui.components.WalkingPixelCatKt$HeartParticle$2$1", f = "WalkingPixelCat.kt", l = {334, 335}, m = "invokeSuspend")
    public static final class b extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f22394a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ s.b<Float, s.o> f22395b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f22396c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(s.b<Float, s.o> bVar, eh.a<pg.f0> aVar, tg.e<? super b> eVar) {
            super(2, eVar);
            this.f22395b = bVar;
            this.f22396c = aVar;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new b(this.f22395b, this.f22396c, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
        
            if (s.b.c(r10.f22395b, r5, r6, null, r8, 12) == r0) goto L15;
         */
        @Override // vg.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            b bVar;
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f22394a;
            if (i10 == 0) {
                pg.q.b(obj);
                this.f22394a = 1;
                if (ph.t0.b(350L, this) == aVar) {
                }
                return aVar;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
                bVar = this;
                bVar.f22396c.invoke();
                return pg.f0.f21461a;
            }
            pg.q.b(obj);
            Float f10 = new Float(CropImageView.DEFAULT_ASPECT_RATIO);
            s.m2 m2VarD = s.m.d(400, 0, s.d0.f23706d, 2);
            this.f22394a = 2;
            bVar = this;
        }
    }

    public static final void a(d1 d1Var, eh.a<pg.f0> aVar, x0.j jVar, int i10) {
        x0.k kVar;
        long j10 = d1Var.f22164a;
        x0.k kVarP = jVar.p(901948506);
        int i11 = (kVarP.K(d1Var) ? 4 : 2) | i10 | (kVarP.l(aVar) ? 32 : 16);
        if ((i11 & 19) == 18 && kVarP.s()) {
            kVarP.v();
            kVar = kVarP;
        } else {
            f3.d dVar = (f3.d) kVarP.f(j2.j2.f14779h);
            kVarP.L(965477335);
            Object objG = kVarP.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (objG == c0321a) {
                objG = s.d.a(CropImageView.DEFAULT_ASPECT_RATIO);
                kVarP.C(objG);
            }
            s.b bVar = (s.b) objG;
            Object objA = p0.h.a(kVarP, false, 965478743);
            if (objA == c0321a) {
                objA = s.d.a(1.0f);
                kVarP.C(objA);
            }
            s.b bVar2 = (s.b) objA;
            kVarP.T(false);
            Long lValueOf = Long.valueOf(j10);
            kVarP.L(965480694);
            boolean zL = kVarP.l(bVar);
            Object objG2 = kVarP.g();
            if (zL || objG2 == c0321a) {
                objG2 = new a(bVar, null);
                kVarP.C(objG2);
            }
            kVarP.T(false);
            x0.o0.d((eh.p) objG2, lValueOf, kVarP);
            Long lValueOf2 = Long.valueOf(j10);
            kVarP.L(965485626);
            boolean zL2 = kVarP.l(bVar2) | ((i11 & 112) == 32);
            Object objG3 = kVarP.g();
            if (zL2 || objG3 == c0321a) {
                objG3 = new b(bVar2, aVar, null);
                kVarP.C(objG3);
            }
            kVarP.T(false);
            x0.o0.d((eh.p) objG3, lValueOf2, kVarP);
            androidx.compose.ui.d dVarC = androidx.compose.foundation.layout.e.c(d.a.f1143b, dVar.v(d1Var.f22165b), CropImageView.DEFAULT_ASPECT_RATIO, 2);
            kVarP.L(965495176);
            boolean zL3 = kVarP.l(bVar);
            Object objG4 = kVarP.g();
            if (zL3 || objG4 == c0321a) {
                objG4 = new r2(bVar, 0);
                kVarP.C(objG4);
            }
            kVarP.T(false);
            androidx.compose.ui.d dVarA = androidx.compose.foundation.layout.e.a(dVarC, (eh.l) objG4);
            g2.l0 l0VarD = z.g.d(d.a.f14602a, false);
            int i12 = kVarP.P;
            x0.a2 a2VarP = kVarP.P();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarA, kVarP);
            i2.g.f13861o.getClass();
            e0.a aVar2 = g.a.f13863b;
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar2);
            } else {
                kVarP.z();
            }
            ph.v1.j(g.a.f13867f, l0VarD, kVarP);
            ph.v1.j(g.a.f13866e, a2VarP, kVarP);
            g.a.C0128a c0128a = g.a.f13868g;
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i12))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i12, kVarP, i12, c0128a);
            }
            ph.v1.j(g.a.f13865d, dVarC2, kVarP);
            ff.b(d1Var.f22166c, null, q1.b1.c(((Number) bVar2.d()).floatValue(), c2.n0.c(4294922880L)), f3.u.c(15), null, null, 0L, null, 0L, 0, false, 0, 0, null, kVarP, 3072, 0, 131058);
            kVar = kVarP;
            kVar.T(true);
        }
        x0.h2 h2VarV = kVar.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new s2(d1Var, aVar, i10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(androidx.compose.ui.d dVar, boolean z10, eh.a aVar, x0.j jVar, final int i10, final int i11) {
        androidx.compose.ui.d dVar2;
        int i12;
        boolean z11;
        int i13;
        eh.a aVar2;
        int i14;
        final boolean z12;
        final eh.a aVar3;
        x0.k kVarP = jVar.p(1417021382);
        int i15 = i11 & 1;
        if (i15 != 0) {
            i12 = i10 | 6;
            dVar2 = dVar;
        } else {
            dVar2 = dVar;
            i12 = i10 | (kVarP.K(dVar2) ? 4 : 2);
        }
        int i16 = i11 & 2;
        if (i16 != 0) {
            i13 = i12 | 48;
            z11 = z10;
        } else {
            z11 = z10;
            i13 = i12 | (kVarP.c(z11) ? 32 : 16);
        }
        int i17 = i13 | 3456;
        int i18 = i11 & 16;
        if (i18 != 0) {
            i14 = i13 | 28032;
            aVar2 = aVar;
        } else {
            aVar2 = aVar;
            i14 = i17 | (kVarP.l(aVar2) ? 16384 : 8192);
        }
        if ((i14 & 9363) == 9362 && kVarP.s()) {
            kVarP.v();
            aVar3 = aVar2;
            z12 = z11;
        } else {
            androidx.compose.ui.d dVar3 = i15 != 0 ? d.a.f1143b : dVar2;
            boolean z13 = i16 != 0 ? false : z11;
            eh.a aVar4 = i18 != 0 ? null : aVar2;
            Context context = (Context) kVarP.f(AndroidCompositionLocals_androidKt.f1281b);
            kVarP.L(-1511938181);
            Object objG = kVarP.g();
            Object obj = j.a.f31715a;
            if (objG == obj) {
                objG = bg.b.h(Boolean.FALSE);
                kVarP.C(objG);
            }
            x0.n1 n1Var = (x0.n1) objG;
            kVarP.T(false);
            kVarP.L(-1511936220);
            boolean zK = kVarP.K(context);
            Object objG2 = kVarP.g();
            if (zK || objG2 == obj) {
                objG2 = new f3(n8.n1.a(context).f30610a.getData());
                kVarP.C(objG2);
            }
            kVarP.T(false);
            boolean zBooleanValue = ((Boolean) bg.b.a((sh.f) objG2, Boolean.FALSE, null, kVarP, 48, 2).getValue()).booleanValue();
            kVarP.L(-1511929371);
            Object objG3 = kVarP.g();
            if (objG3 == obj) {
                objG3 = ((k8.d) qg.x.Q(k8.e.f16082a, hh.c.f13027a)).f16072a;
                kVarP.C(objG3);
            }
            String str = (String) objG3;
            kVarP.T(false);
            kVarP.L(-1511926223);
            boolean zK2 = kVarP.K(str);
            Object objG4 = kVarP.g();
            if (zK2 || objG4 == obj) {
                objG4 = k8.c.a(str);
                kVarP.C(objG4);
            }
            k8.b bVar = (k8.b) objG4;
            Object objA = p0.h.a(kVarP, false, -1511922717);
            if (objA == obj) {
                objA = bg.b.h(k.f22267a);
                kVarP.C(objA);
            }
            x0.n1 n1Var2 = (x0.n1) objA;
            Object objA2 = p0.h.a(kVarP, false, -1511920422);
            if (objA2 == obj) {
                objA2 = new x0.v1(0);
                kVarP.C(objA2);
            }
            x0.l1 l1Var = (x0.l1) objA2;
            Object objA3 = p0.h.a(kVarP, false, -1511918630);
            if (objA3 == obj) {
                objA3 = bg.b.h(Boolean.TRUE);
                kVarP.C(objA3);
            }
            x0.n1 n1Var3 = (x0.n1) objA3;
            Object objA4 = p0.h.a(kVarP, false, -1511916699);
            if (objA4 == obj) {
                objA4 = new h1.u();
                kVarP.C(objA4);
            }
            kVarP.T(false);
            dVar2 = dVar3;
            z.m.a(dVar2, null, f1.c.b(-339709648, new e3(z13, bVar.f16067a, bVar.f16068b, bVar.f16069c, bVar.f16070d, context, zBooleanValue, (h1.u) objA4, aVar4, n1Var2, n1Var3, l1Var, n1Var), kVarP), kVarP, (i14 & 14) | 3072, 6);
            z12 = z13;
            aVar3 = aVar4;
        }
        final androidx.compose.ui.d dVar4 = dVar2;
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(z12, aVar3, i10, i11) { // from class: q8.q2

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ boolean f22369b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ eh.a f22370c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ int f22371d;

                {
                    this.f22371d = i11;
                }

                @Override // eh.p
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iN = f3.i.n(1);
                    t2.b(this.f22368a, this.f22369b, this.f22370c, (x0.j) obj2, iN, this.f22371d);
                    return pg.f0.f21461a;
                }
            };
        }
    }
}
