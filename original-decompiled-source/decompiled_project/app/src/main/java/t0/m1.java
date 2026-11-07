package t0;

import androidx.compose.material3.MinimumInteractiveModifier;
import androidx.compose.ui.d;
import com.android.apksig.internal.apk.v4.V4Signature;
import com.yalantis.ucrop.view.CropImageView;
import j1.d;
import s.y1;
import x0.j;

/* loaded from: classes.dex */
public final class m1 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f26404a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f26405b = 20;

    /* renamed from: c, reason: collision with root package name */
    public static final float f26406c;

    /* renamed from: d, reason: collision with root package name */
    public static final float f26407d;

    public static final class a extends kotlin.jvm.internal.s implements eh.l<s1.e, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x0.r3<q1.b1> f26408a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x0.r3<q1.b1> f26409b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x0.r3<q1.b1> f26410c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ x0.r3<Float> f26411d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ x0.r3<Float> f26412e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ h1 f26413f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x0.r3 r3Var, x0.r3 r3Var2, x0.r3 r3Var3, y1.d dVar, y1.d dVar2, h1 h1Var) {
            super(1);
            this.f26408a = r3Var;
            this.f26409b = r3Var2;
            this.f26410c = r3Var3;
            this.f26411d = dVar;
            this.f26412e = dVar2;
            this.f26413f = h1Var;
        }

        @Override // eh.l
        public final pg.f0 invoke(s1.e eVar) {
            float f10;
            float f11;
            s1.e eVar2 = eVar;
            float fFloor = (float) Math.floor(eVar2.N0(m1.f26406c));
            long j10 = this.f26408a.getValue().f21656a;
            long j11 = this.f26409b.getValue().f21656a;
            float fN0 = eVar2.N0(m1.f26407d);
            float f12 = fFloor / 2.0f;
            s1.i iVar = new s1.i(fFloor, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0, 30);
            float fD = p1.h.d(eVar2.i());
            if (q1.b1.d(j10, j11)) {
                f11 = 0.0f;
                eVar2.B1(j10, (240 & 2) != 0 ? 0L : 0L, d0.h.a(fD, fD), p1.a.a(fN0), (240 & 16) != 0 ? s1.h.f24186a : s1.h.f24186a, (240 & 32) != 0 ? 1.0f : CropImageView.DEFAULT_ASPECT_RATIO);
                f10 = fFloor;
            } else {
                float f13 = fD - (2 * fFloor);
                f10 = fFloor;
                f11 = 0.0f;
                eVar2.B1(j10, (240 & 2) != 0 ? 0L : p1.d.a(fFloor, fFloor), d0.h.a(f13, f13), p1.a.a(Math.max(CropImageView.DEFAULT_ASPECT_RATIO, fN0 - fFloor)), (240 & 16) != 0 ? s1.h.f24186a : s1.h.f24186a, (240 & 32) != 0 ? 1.0f : CropImageView.DEFAULT_ASPECT_RATIO);
                float f14 = fD - f10;
                eVar2.B1(j11, (240 & 2) != 0 ? 0L : p1.d.a(f12, f12), d0.h.a(f14, f14), p1.a.a(fN0 - f12), (240 & 16) != 0 ? s1.h.f24186a : iVar, (240 & 32) != 0 ? 1.0f : CropImageView.DEFAULT_ASPECT_RATIO);
            }
            long j12 = this.f26410c.getValue().f21656a;
            float fFloatValue = this.f26411d.getValue().floatValue();
            float fFloatValue2 = this.f26412e.getValue().floatValue();
            s1.i iVar2 = new s1.i(f10, CropImageView.DEFAULT_ASPECT_RATIO, 2, 0, 26);
            float fD2 = p1.h.d(eVar2.i());
            float fB = h3.b.b(0.4f, 0.5f, fFloatValue2);
            float fB2 = h3.b.b(0.7f, 0.5f, fFloatValue2);
            float fB3 = h3.b.b(0.5f, 0.5f, fFloatValue2);
            float fB4 = h3.b.b(0.3f, 0.5f, fFloatValue2);
            h1 h1Var = this.f26413f;
            h1Var.f25967a.reset();
            q1.j0 j0Var = h1Var.f25967a;
            j0Var.l(0.2f * fD2, fB3 * fD2);
            j0Var.p(fB * fD2, fB2 * fD2);
            j0Var.p(0.8f * fD2, fD2 * fB4);
            q1.k0 k0Var = h1Var.f25968b;
            k0Var.b(j0Var);
            q1.j0 j0Var2 = h1Var.f25969c;
            j0Var2.reset();
            k0Var.a(f11, k0Var.f21717a.getLength() * fFloatValue, j0Var2);
            s1.e.P0(eVar2, h1Var.f25969c, j12, iVar2, 0, 52);
            return pg.f0.f21461a;
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f26414a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ s2.a f26415b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.d f26416c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ i1 f26417d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f26418e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z10, s2.a aVar, androidx.compose.ui.d dVar, i1 i1Var, int i10) {
            super(2);
            this.f26414a = z10;
            this.f26415b = aVar;
            this.f26416c = dVar;
            this.f26417d = i1Var;
            this.f26418e = i10;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            num.intValue();
            m1.b(this.f26414a, this.f26415b, this.f26416c, this.f26417d, jVar, f3.i.n(this.f26418e | 1));
            return pg.f0.f21461a;
        }
    }

    public static final class c extends kotlin.jvm.internal.s implements eh.q<y1.b<s2.a>, x0.j, Integer, s.e0<Float>> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f26419a = new c(3);

        @Override // eh.q
        public final s.e0<Float> b(y1.b<s2.a> bVar, x0.j jVar, Integer num) {
            y1.b<s2.a> bVar2 = bVar;
            x0.j jVar2 = jVar;
            num.intValue();
            jVar2.L(-1324481169);
            s2.a aVarC = bVar2.c();
            s2.a aVar = s2.a.f24192b;
            s.e0<Float> j1Var = aVarC == aVar ? new s.j1<>(0) : bVar2.e() == aVar ? new s.j1<>(100) : s.m.d(100, 0, null, 6);
            jVar2.B();
            return j1Var;
        }
    }

    public static final class d extends kotlin.jvm.internal.s implements eh.q<y1.b<s2.a>, x0.j, Integer, s.e0<Float>> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f26420a = new d(3);

        @Override // eh.q
        public final s.e0<Float> b(y1.b<s2.a> bVar, x0.j jVar, Integer num) {
            y1.b<s2.a> bVar2 = bVar;
            x0.j jVar2 = jVar;
            num.intValue();
            jVar2.L(1373301606);
            s2.a aVarC = bVar2.c();
            s2.a aVar = s2.a.f24192b;
            s.e0<Float> e0VarD = aVarC == aVar ? s.m.d(100, 0, null, 6) : bVar2.e() == aVar ? new s.j1<>(100) : s.m.c(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, 7);
            jVar2.B();
            return e0VarD;
        }
    }

    static {
        float f10 = 2;
        f26404a = f10;
        f26406c = f10;
        f26407d = f10;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(boolean z10, eh.l lVar, androidx.compose.ui.d dVar, boolean z11, i1 i1Var, x0.j jVar, int i10, int i11) {
        eh.a aVar;
        androidx.compose.ui.d dVar2;
        boolean z12;
        i1 i1Var2;
        x0.k kVarP = jVar.p(-1406741137);
        int i12 = (kVarP.c(z10) ? 4 : 2) | i10;
        if ((i10 & 48) == 0) {
            i12 |= kVarP.l(lVar) ? 32 : 16;
        }
        int i13 = i11 & 4;
        if (i13 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= kVarP.K(dVar) ? 256 : 128;
        }
        int i14 = i11 & 8;
        if (i14 != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= kVarP.c(z11) ? 2048 : 1024;
        }
        int i15 = i12 | (((i11 & 16) == 0 && kVarP.K(i1Var)) ? 16384 : 8192) | 196608;
        if ((74899 & i15) == 74898 && kVarP.s()) {
            kVarP.v();
            i1Var2 = i1Var;
            z12 = z11;
            dVar2 = dVar;
        } else {
            kVarP.r0();
            if ((i10 & 1) == 0 || kVarP.a0()) {
                if (i13 != 0) {
                    dVar = d.a.f1143b;
                }
                if (i14 != 0) {
                    z11 = true;
                }
                if ((i11 & 16) != 0) {
                    i1Var = j1.a((e2) kVarP.f(f2.f25858a));
                    i15 &= -57345;
                }
                androidx.compose.ui.d dVar3 = dVar;
                boolean z13 = z11;
                i1 i1Var3 = i1Var;
                kVarP.U();
                s2.a aVar2 = !z10 ? s2.a.f24191a : s2.a.f24192b;
                kVarP.L(1046936362);
                if (lVar == null) {
                    boolean z14 = ((i15 & 112) == 32) | ((i15 & 14) == 4);
                    Object objG = kVarP.g();
                    if (z14 || objG == j.a.f31715a) {
                        objG = new k1(lVar, z10);
                        kVarP.C(objG);
                    }
                    aVar = (eh.a) objG;
                } else {
                    aVar = null;
                }
                eh.a aVar3 = aVar;
                kVarP.T(false);
                c(aVar2, aVar3, dVar3, z13, i1Var3, kVarP, i15 & 524160);
                dVar2 = dVar3;
                z12 = z13;
                i1Var2 = i1Var3;
            } else {
                kVarP.v();
                if ((i11 & 16) != 0) {
                    i15 &= -57345;
                }
                androidx.compose.ui.d dVar32 = dVar;
                boolean z132 = z11;
                i1 i1Var32 = i1Var;
                kVarP.U();
                s2.a aVar22 = !z10 ? s2.a.f24191a : s2.a.f24192b;
                kVarP.L(1046936362);
                if (lVar == null) {
                }
                eh.a aVar32 = aVar;
                kVarP.T(false);
                c(aVar22, aVar32, dVar32, z132, i1Var32, kVarP, i15 & 524160);
                dVar2 = dVar32;
                z12 = z132;
                i1Var2 = i1Var32;
            }
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new l1(z10, lVar, dVar2, z12, i1Var2, i10, i11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ff A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(boolean z10, s2.a aVar, androidx.compose.ui.d dVar, i1 i1Var, x0.j jVar, int i10) {
        int i11;
        float f10;
        int iOrdinal;
        float f11;
        y1.d dVarC;
        int iOrdinal2;
        float f12;
        int iOrdinal3;
        y1.d dVarC2;
        Object objG;
        Object obj;
        h1 h1Var;
        long j10;
        x0.r3 r3Var;
        x0.r3 r3VarK;
        x0.r3 r3Var2;
        long j11;
        x0.r3 r3VarK2;
        x0.r3 r3Var3;
        boolean zK;
        Object objG2;
        x0.k kVarP = jVar.p(2007131616);
        if ((i10 & 6) == 0) {
            i11 = (kVarP.c(z10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= kVarP.K(aVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= kVarP.K(dVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= kVarP.K(i1Var) ? 2048 : 1024;
        }
        if ((i11 & 1171) == 1170 && kVarP.s()) {
            kVarP.v();
        } else {
            s.y1 y1VarE = s.c2.e(aVar, null, kVarP, (i11 >> 3) & 14, 2);
            x0.x1 x1Var = y1VarE.f24004d;
            c2.g0 g0Var = y1VarE.f24001a;
            s.o2 o2Var = s.p2.f23868a;
            s2.a aVar2 = (s2.a) g0Var.V();
            kVarP.L(1800065638);
            int iOrdinal4 = aVar2.ordinal();
            float f13 = CropImageView.DEFAULT_ASPECT_RATIO;
            if (iOrdinal4 == 0) {
                f10 = 1.0f;
                kVarP.T(false);
                Float fValueOf = Float.valueOf(f10);
                s2.a aVar3 = (s2.a) x1Var.getValue();
                kVarP.L(1800065638);
                iOrdinal = aVar3.ordinal();
                if (iOrdinal == 0) {
                    f11 = 1.0f;
                    kVarP.T(false);
                    dVarC = s.c2.c(y1VarE, fValueOf, Float.valueOf(f11), d.f26420a.b(y1VarE.f(), kVarP, 0), o2Var, kVarP, 0);
                    s2.a aVar4 = (s2.a) g0Var.V();
                    kVarP.L(-1426969489);
                    iOrdinal2 = aVar4.ordinal();
                    if (iOrdinal2 == 0 || iOrdinal2 == 1) {
                        f12 = 0.0f;
                    } else {
                        if (iOrdinal2 != 2) {
                            throw new pg.l();
                        }
                        f12 = 1.0f;
                    }
                    kVarP.T(false);
                    Float fValueOf2 = Float.valueOf(f12);
                    s2.a aVar5 = (s2.a) x1Var.getValue();
                    kVarP.L(-1426969489);
                    iOrdinal3 = aVar5.ordinal();
                    if (iOrdinal3 != 0 && iOrdinal3 != 1) {
                        if (iOrdinal3 == 2) {
                            throw new pg.l();
                        }
                        f13 = 1.0f;
                    }
                    kVarP.T(false);
                    dVarC2 = s.c2.c(y1VarE, fValueOf2, Float.valueOf(f13), c.f26419a.b(y1VarE.f(), kVarP, 0), o2Var, kVarP, 0);
                    kVarP = kVarP;
                    objG = kVarP.g();
                    obj = j.a.f31715a;
                    if (objG == obj) {
                        objG = new h1(0);
                        kVarP.C(objG);
                    }
                    h1Var = (h1) objG;
                    i1Var.getClass();
                    s2.a aVar6 = s2.a.f24192b;
                    x0.r3 r3VarA = r.g2.a(aVar != aVar6 ? i1Var.f26044b : i1Var.f26043a, s.m.d(aVar != aVar6 ? 100 : 50, 0, null, 6), null, kVarP, 0, 12);
                    if (z10) {
                        int iOrdinal5 = aVar.ordinal();
                        if (iOrdinal5 == 0) {
                            j10 = i1Var.f26047e;
                        } else if (iOrdinal5 == 1) {
                            j10 = i1Var.f26048f;
                        } else {
                            if (iOrdinal5 != 2) {
                                throw new pg.l();
                            }
                            j10 = i1Var.f26049g;
                        }
                    } else {
                        int iOrdinal6 = aVar.ordinal();
                        if (iOrdinal6 == 0) {
                            j10 = i1Var.f26045c;
                        } else if (iOrdinal6 != 1) {
                            if (iOrdinal6 != 2) {
                                throw new pg.l();
                            }
                            j10 = i1Var.f26045c;
                        } else {
                            j10 = i1Var.f26046d;
                        }
                    }
                    if (z10) {
                        r3Var = r3VarA;
                        kVarP.L(-392031362);
                        r3VarK = bg.b.k(new q1.b1(j10), kVarP);
                        kVarP.T(false);
                    } else {
                        kVarP.L(-392211906);
                        r3Var = r3VarA;
                        r3VarK = r.g2.a(j10, s.m.d(aVar == aVar6 ? 100 : 50, 0, null, 6), null, kVarP, 0, 12);
                        kVarP.T(false);
                    }
                    r3Var2 = r3VarK;
                    if (z10) {
                        int iOrdinal7 = aVar.ordinal();
                        if (iOrdinal7 == 0) {
                            j11 = i1Var.f26052j;
                        } else if (iOrdinal7 == 1) {
                            j11 = i1Var.f26053k;
                        } else {
                            if (iOrdinal7 != 2) {
                                throw new pg.l();
                            }
                            j11 = i1Var.f26054l;
                        }
                    } else {
                        int iOrdinal8 = aVar.ordinal();
                        if (iOrdinal8 == 0) {
                            j11 = i1Var.f26050h;
                        } else if (iOrdinal8 != 1) {
                            if (iOrdinal8 != 2) {
                                throw new pg.l();
                            }
                            j11 = i1Var.f26050h;
                        } else {
                            j11 = i1Var.f26051i;
                        }
                    }
                    if (z10) {
                        kVarP.L(-1725635953);
                        r3VarK2 = bg.b.k(new q1.b1(j11), kVarP);
                        kVarP.T(false);
                    } else {
                        kVarP.L(-1725816497);
                        r3VarK2 = r.g2.a(j11, s.m.d(aVar == aVar6 ? 100 : 50, 0, null, 6), null, kVarP, 0, 12);
                        kVarP.T(false);
                    }
                    androidx.compose.ui.d dVarJ = androidx.compose.foundation.layout.g.j(androidx.compose.foundation.layout.g.u(dVar, d.a.f14606e), f26405b);
                    r3Var3 = r3Var;
                    zK = kVarP.K(r3Var2) | kVarP.K(r3VarK2) | kVarP.K(r3Var3) | kVarP.K(dVarC) | kVarP.K(dVarC2);
                    objG2 = kVarP.g();
                    if (!zK || objG2 == obj) {
                        objG2 = new a(r3Var2, r3VarK2, r3Var3, dVarC, dVarC2, h1Var);
                        kVarP.C(objG2);
                    }
                    t.w.a(dVarJ, (eh.l) objG2, kVarP, 0);
                } else if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        throw new pg.l();
                    }
                    f11 = 1.0f;
                    kVarP.T(false);
                    dVarC = s.c2.c(y1VarE, fValueOf, Float.valueOf(f11), d.f26420a.b(y1VarE.f(), kVarP, 0), o2Var, kVarP, 0);
                    s2.a aVar42 = (s2.a) g0Var.V();
                    kVarP.L(-1426969489);
                    iOrdinal2 = aVar42.ordinal();
                    if (iOrdinal2 == 0) {
                        f12 = 0.0f;
                        kVarP.T(false);
                        Float fValueOf22 = Float.valueOf(f12);
                        s2.a aVar52 = (s2.a) x1Var.getValue();
                        kVarP.L(-1426969489);
                        iOrdinal3 = aVar52.ordinal();
                        if (iOrdinal3 != 0) {
                            if (iOrdinal3 == 2) {
                            }
                        }
                        kVarP.T(false);
                        dVarC2 = s.c2.c(y1VarE, fValueOf22, Float.valueOf(f13), c.f26419a.b(y1VarE.f(), kVarP, 0), o2Var, kVarP, 0);
                        kVarP = kVarP;
                        objG = kVarP.g();
                        obj = j.a.f31715a;
                        if (objG == obj) {
                        }
                        h1Var = (h1) objG;
                        i1Var.getClass();
                        s2.a aVar62 = s2.a.f24192b;
                        if (aVar != aVar62) {
                        }
                        x0.r3 r3VarA2 = r.g2.a(aVar != aVar62 ? i1Var.f26044b : i1Var.f26043a, s.m.d(aVar != aVar62 ? 100 : 50, 0, null, 6), null, kVarP, 0, 12);
                        if (z10) {
                        }
                        if (z10) {
                        }
                        r3Var2 = r3VarK;
                        if (z10) {
                        }
                        if (z10) {
                        }
                        androidx.compose.ui.d dVarJ2 = androidx.compose.foundation.layout.g.j(androidx.compose.foundation.layout.g.u(dVar, d.a.f14606e), f26405b);
                        r3Var3 = r3Var;
                        zK = kVarP.K(r3Var2) | kVarP.K(r3VarK2) | kVarP.K(r3Var3) | kVarP.K(dVarC) | kVarP.K(dVarC2);
                        objG2 = kVarP.g();
                        if (!zK) {
                            objG2 = new a(r3Var2, r3VarK2, r3Var3, dVarC, dVarC2, h1Var);
                            kVarP.C(objG2);
                            t.w.a(dVarJ2, (eh.l) objG2, kVarP, 0);
                        }
                    }
                } else {
                    f11 = 0.0f;
                    kVarP.T(false);
                    dVarC = s.c2.c(y1VarE, fValueOf, Float.valueOf(f11), d.f26420a.b(y1VarE.f(), kVarP, 0), o2Var, kVarP, 0);
                    s2.a aVar422 = (s2.a) g0Var.V();
                    kVarP.L(-1426969489);
                    iOrdinal2 = aVar422.ordinal();
                    if (iOrdinal2 == 0) {
                    }
                }
            } else if (iOrdinal4 != 1) {
                if (iOrdinal4 != 2) {
                    throw new pg.l();
                }
                f10 = 1.0f;
                kVarP.T(false);
                Float fValueOf3 = Float.valueOf(f10);
                s2.a aVar32 = (s2.a) x1Var.getValue();
                kVarP.L(1800065638);
                iOrdinal = aVar32.ordinal();
                if (iOrdinal == 0) {
                }
            } else {
                f10 = 0.0f;
                kVarP.T(false);
                Float fValueOf32 = Float.valueOf(f10);
                s2.a aVar322 = (s2.a) x1Var.getValue();
                kVarP.L(1800065638);
                iOrdinal = aVar322.ordinal();
                if (iOrdinal == 0) {
                }
            }
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new b(z10, aVar, dVar, i1Var, i10);
        }
    }

    public static final void c(s2.a aVar, eh.a aVar2, androidx.compose.ui.d dVar, boolean z10, i1 i1Var, x0.j jVar, int i10) {
        int i11;
        s2.a aVar3;
        boolean z11;
        i1 i1Var2;
        x0.k kVarP = jVar.p(-1608358065);
        if ((i10 & 6) == 0) {
            i11 = (kVarP.K(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= kVarP.l(aVar2) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= kVarP.K(dVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= kVarP.c(z10) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= kVarP.K(i1Var) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= kVarP.K(null) ? 131072 : 65536;
        }
        if ((74899 & i11) == 74898 && kVarP.s()) {
            kVarP.v();
            aVar3 = aVar;
            i1Var2 = i1Var;
            z11 = z10;
        } else {
            kVarP.r0();
            if ((i10 & 1) != 0 && !kVarP.a0()) {
                kVarP.v();
            }
            kVarP.U();
            kVarP.L(-97239746);
            androidx.compose.ui.d dVar2 = d.a.f1143b;
            androidx.compose.ui.d dVarB = aVar2 != null ? androidx.compose.foundation.selection.b.b(aVar2, new q2.i(1), aVar, ha.a(false, v0.a.f30189d / 2, 0L, kVarP, 54, 4), z10) : dVar2;
            kVarP.T(false);
            if (aVar2 != null) {
                x0.s3 s3Var = w4.f27281a;
                dVar2 = MinimumInteractiveModifier.f1120b;
            }
            aVar3 = aVar;
            b(z10, aVar3, androidx.compose.foundation.layout.f.h(dVar.h(dVar2).h(dVarB), f26404a), i1Var, kVarP, ((i11 >> 9) & 14) | ((i11 << 3) & 112) | ((i11 >> 3) & V4Signature.MAX_SIGNING_INFOS_SIZE));
            z11 = z10;
            i1Var2 = i1Var;
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new n1(aVar3, aVar2, dVar, z11, i1Var2, i10);
        }
    }
}
