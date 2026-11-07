package t0;

import androidx.compose.ui.d;
import com.android.apksig.internal.apk.v4.V4Signature;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import t0.ef;

/* loaded from: classes.dex */
public final class k9 {

    /* renamed from: a, reason: collision with root package name */
    public static final k9 f26240a = new k9();

    /* renamed from: b, reason: collision with root package name */
    public static final float f26241b = 56;

    /* renamed from: c, reason: collision with root package name */
    public static final float f26242c = 280;

    /* renamed from: d, reason: collision with root package name */
    public static final float f26243d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final float f26244e = 2;

    public /* synthetic */ class a extends kotlin.jvm.internal.y {
        @Override // kh.g
        public final Object get() {
            return ((x0.r3) this.receiver).getValue();
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f26246b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f26247c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ x.l f26248d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.d f26249e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ df f26250f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ q1.f2 f26251g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ float f26252h;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ float f26253j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ int f26254k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ int f26255l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z10, boolean z11, x.l lVar, androidx.compose.ui.d dVar, df dfVar, q1.f2 f2Var, float f10, float f11, int i10, int i11) {
            super(2);
            this.f26246b = z10;
            this.f26247c = z11;
            this.f26248d = lVar;
            this.f26249e = dVar;
            this.f26250f = dfVar;
            this.f26251g = f2Var;
            this.f26252h = f10;
            this.f26253j = f11;
            this.f26254k = i10;
            this.f26255l = i11;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            num.intValue();
            k9.this.a(this.f26246b, this.f26247c, this.f26248d, this.f26249e, this.f26250f, this.f26251g, this.f26252h, this.f26253j, jVar, f3.i.n(this.f26254k | 1), this.f26255l);
            return pg.f0.f21461a;
        }
    }

    public static final class c extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f26256a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f26257b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x.l f26258c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ df f26259d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z10, boolean z11, x.l lVar, df dfVar) {
            super(2);
            this.f26256a = z10;
            this.f26257b = z11;
            this.f26258c = lVar;
            this.f26259d = dfVar;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                k9.f26240a.a(this.f26256a, this.f26257b, this.f26258c, d.a.f1143b, this.f26259d, ab.a(v0.c0.f30230c, jVar2), k9.f26244e, k9.f26243d, jVar2, 114822144, 0);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class d extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f26261b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ eh.p<x0.j, Integer, pg.f0> f26262c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f26263d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f26264e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ y2.q0 f26265f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ x.l f26266g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ boolean f26267h;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ eh.p<x0.j, Integer, pg.f0> f26268j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ eh.p<x0.j, Integer, pg.f0> f26269k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ eh.p<x0.j, Integer, pg.f0> f26270l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ eh.p<x0.j, Integer, pg.f0> f26271m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ eh.p<x0.j, Integer, pg.f0> f26272n;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ eh.p<x0.j, Integer, pg.f0> f26273p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ eh.p<x0.j, Integer, pg.f0> f26274q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ df f26275r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ z.f1 f26276s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ eh.p<x0.j, Integer, pg.f0> f26277t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ int f26278v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ int f26279w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ int f26280x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(String str, eh.p<? super x0.j, ? super Integer, pg.f0> pVar, boolean z10, boolean z11, y2.q0 q0Var, x.l lVar, boolean z12, eh.p<? super x0.j, ? super Integer, pg.f0> pVar2, eh.p<? super x0.j, ? super Integer, pg.f0> pVar3, eh.p<? super x0.j, ? super Integer, pg.f0> pVar4, eh.p<? super x0.j, ? super Integer, pg.f0> pVar5, eh.p<? super x0.j, ? super Integer, pg.f0> pVar6, eh.p<? super x0.j, ? super Integer, pg.f0> pVar7, eh.p<? super x0.j, ? super Integer, pg.f0> pVar8, df dfVar, z.f1 f1Var, eh.p<? super x0.j, ? super Integer, pg.f0> pVar9, int i10, int i11, int i12) {
            super(2);
            this.f26261b = str;
            this.f26262c = pVar;
            this.f26263d = z10;
            this.f26264e = z11;
            this.f26265f = q0Var;
            this.f26266g = lVar;
            this.f26267h = z12;
            this.f26268j = pVar2;
            this.f26269k = pVar3;
            this.f26270l = pVar4;
            this.f26271m = pVar5;
            this.f26272n = pVar6;
            this.f26273p = pVar7;
            this.f26274q = pVar8;
            this.f26275r = dfVar;
            this.f26276s = f1Var;
            this.f26277t = pVar9;
            this.f26278v = i10;
            this.f26279w = i11;
            this.f26280x = i12;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            num.intValue();
            int iN = f3.i.n(this.f26278v | 1);
            int iN2 = f3.i.n(this.f26279w);
            int i10 = this.f26280x;
            k9.this.b(this.f26261b, this.f26262c, this.f26263d, this.f26264e, this.f26265f, this.f26266g, this.f26267h, this.f26268j, this.f26269k, this.f26270l, this.f26271m, this.f26272n, this.f26273p, this.f26274q, this.f26275r, this.f26276s, this.f26277t, jVar, iN, iN2, i10);
            return pg.f0.f21461a;
        }
    }

    public static df c(int i10, x0.j jVar) {
        return d((e2) jVar.f(f2.f25858a), jVar);
    }

    public static df d(e2 e2Var, x0.j jVar) {
        df dfVar = e2Var.f25758d0;
        jVar.L(1540400102);
        if (dfVar == null) {
            v0.d dVar = v0.d.f30244h;
            long jD = f2.d(e2Var, dVar);
            long jD2 = f2.d(e2Var, dVar);
            long jC = q1.b1.c(0.38f, f2.d(e2Var, dVar));
            long jD3 = f2.d(e2Var, dVar);
            long j10 = q1.b1.f21653g;
            v0.d dVar2 = v0.d.f30248m;
            long jD4 = f2.d(e2Var, dVar2);
            v0.d dVar3 = v0.d.f30237a;
            long jD5 = f2.d(e2Var, dVar3);
            m0.q3 q3Var = (m0.q3) jVar.f(m0.r3.f17501a);
            long jD6 = f2.d(e2Var, dVar2);
            long jD7 = f2.d(e2Var, v0.d.f30246k);
            long jC2 = q1.b1.c(0.12f, f2.d(e2Var, dVar));
            long jD8 = f2.d(e2Var, dVar3);
            v0.d dVar4 = v0.d.f30245j;
            df dfVar2 = new df(jD, jD2, jC, jD3, j10, j10, j10, j10, jD4, jD5, q3Var, jD6, jD7, jC2, jD8, f2.d(e2Var, dVar4), f2.d(e2Var, dVar4), q1.b1.c(0.38f, f2.d(e2Var, dVar)), f2.d(e2Var, dVar4), f2.d(e2Var, dVar4), f2.d(e2Var, dVar4), q1.b1.c(0.38f, f2.d(e2Var, dVar)), f2.d(e2Var, dVar3), f2.d(e2Var, dVar2), f2.d(e2Var, dVar4), q1.b1.c(0.38f, f2.d(e2Var, dVar)), f2.d(e2Var, dVar3), f2.d(e2Var, dVar4), f2.d(e2Var, dVar4), q1.b1.c(0.38f, f2.d(e2Var, dVar)), f2.d(e2Var, dVar4), f2.d(e2Var, dVar4), f2.d(e2Var, dVar4), q1.b1.c(0.38f, f2.d(e2Var, dVar)), f2.d(e2Var, dVar3), f2.d(e2Var, dVar4), f2.d(e2Var, dVar4), q1.b1.c(0.38f, f2.d(e2Var, dVar4)), f2.d(e2Var, dVar4), f2.d(e2Var, dVar4), f2.d(e2Var, dVar4), q1.b1.c(0.38f, f2.d(e2Var, dVar4)), f2.d(e2Var, dVar4));
            e2Var.f25758d0 = dfVar2;
            dfVar = dfVar2;
        }
        jVar.B();
        return dfVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0172  */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v26 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z10, boolean z11, x.l lVar, androidx.compose.ui.d dVar, df dfVar, q1.f2 f2Var, float f10, float f11, x0.j jVar, int i10, int i11) {
        androidx.compose.ui.d dVar2;
        int i12;
        float f12;
        float f13;
        androidx.compose.ui.d dVar3;
        float f14;
        float f15;
        int i13;
        boolean z12;
        s.b0 b0Var;
        ?? r12;
        int i14;
        x0.r3 r3VarK;
        x0.k kVar;
        x0.r3 r3VarK2;
        x0.k kVar2;
        x0.h2 h2VarV;
        int i15;
        x0.k kVarP = jVar.p(1035477640);
        int i16 = (kVarP.c(z10) ? 4 : 2) | i10 | (kVarP.c(z11) ? 32 : 16) | (kVarP.K(lVar) ? 256 : 128);
        int i17 = i11 & 8;
        if (i17 == 0) {
            if ((i10 & 3072) == 0) {
                dVar2 = dVar;
                i16 |= kVarP.K(dVar2) ? 2048 : 1024;
            }
            i12 = i16 | (!kVarP.K(dfVar) ? 16384 : 8192) | (!kVarP.K(f2Var) ? 131072 : 65536);
            if ((1572864 & i10) != 0) {
                if ((i11 & 64) == 0) {
                    f12 = f10;
                    if (kVarP.h(f12)) {
                        i15 = PKIFailureInfo.badCertTemplate;
                    }
                    i12 |= i15;
                } else {
                    f12 = f10;
                }
                i15 = PKIFailureInfo.signerNotTrusted;
                i12 |= i15;
            } else {
                f12 = f10;
            }
            if ((12582912 & i10) != 0) {
                if ((i11 & 128) == 0) {
                    f13 = f11;
                    int i18 = kVarP.h(f13) ? 8388608 : 4194304;
                    i12 |= i18;
                } else {
                    f13 = f11;
                }
                i12 |= i18;
            } else {
                f13 = f11;
            }
            if ((38347923 & i12) == 38347922 || !kVarP.s()) {
                kVarP.r0();
                if ((i10 & 1) != 0 || kVarP.a0()) {
                    dVar3 = i17 == 0 ? d.a.f1143b : dVar2;
                    if ((i11 & 64) == 0) {
                        i12 &= -3670017;
                        f14 = f26244e;
                    } else {
                        f14 = f12;
                    }
                    if ((i11 & 128) == 0) {
                        i12 &= -29360129;
                        f15 = f26243d;
                    }
                    kVarP.U();
                    boolean zBooleanValue = ((Boolean) x.h.a(lVar, kVarP, (i12 >> 6) & 14).getValue()).booleanValue();
                    float f16 = u0.t1.f29148b;
                    long j10 = !z10 ? dfVar.f25718n : z11 ? dfVar.f25719o : zBooleanValue ? dfVar.f25716l : dfVar.f25717m;
                    if (z10) {
                        z12 = zBooleanValue;
                        kVarP.L(1023053998);
                        r12 = 0;
                        i14 = 6;
                        b0Var = null;
                        i13 = 150;
                        r3VarK = r.g2.a(j10, s.m.d(150, 0, null, 6), null, kVarP, 48, 12);
                        x0.k kVar3 = kVarP;
                        kVar3.T(false);
                        kVar = kVar3;
                    } else {
                        long j11 = j10;
                        x0.k kVar4 = kVarP;
                        i13 = 150;
                        z12 = zBooleanValue;
                        b0Var = null;
                        r12 = 0;
                        i14 = 6;
                        kVar4.L(1023165505);
                        r3VarK = bg.b.k(new q1.b1(j11), kVar4);
                        kVar4.T(false);
                        kVar = kVar4;
                    }
                    if (z10) {
                        kVar.L(1023269417);
                        r3VarK2 = s.g.a(z12 ? f14 : f15, s.m.d(i13, r12, b0Var, i14), kVar, 48);
                        kVar.T(r12);
                    } else {
                        kVar.L(1023478388);
                        r3VarK2 = bg.b.k(new f3.h(f15), kVar);
                        kVar.T(r12);
                    }
                    x0.n1 n1VarK = bg.b.k(a9.d2.a(((f3.h) r3VarK2.getValue()).f8817a, ((q1.b1) r3VarK.getValue()).f21656a), kVar);
                    x0.k kVar5 = kVar;
                    x0.r3 r3VarA = r.g2.a(!z10 ? dfVar.f25711g : z11 ? dfVar.f25712h : z12 ? dfVar.f25709e : dfVar.f25710f, s.m.d(150, r12, b0Var, i14), null, kVar5, 48, 12);
                    kVar2 = kVar5;
                    t.v vVar = (t.v) n1VarK.getValue();
                    z.g.a(androidx.compose.ui.draw.a.b(t.o.b(dVar3, vVar.f25389a, vVar.f25390b, f2Var), new u0.w1(f2Var, new ef.a(new a(r3VarA, x0.r3.class, "value", "getValue()Ljava/lang/Object;", 0)))), kVar2, r12);
                } else {
                    kVarP.v();
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        i12 &= -29360129;
                    }
                    dVar3 = dVar2;
                    f14 = f12;
                }
                f15 = f13;
                kVarP.U();
                boolean zBooleanValue2 = ((Boolean) x.h.a(lVar, kVarP, (i12 >> 6) & 14).getValue()).booleanValue();
                float f162 = u0.t1.f29148b;
                if (!z10) {
                }
                if (z10) {
                }
                if (z10) {
                }
                x0.n1 n1VarK2 = bg.b.k(a9.d2.a(((f3.h) r3VarK2.getValue()).f8817a, ((q1.b1) r3VarK.getValue()).f21656a), kVar);
                x0.k kVar52 = kVar;
                x0.r3 r3VarA2 = r.g2.a(!z10 ? dfVar.f25711g : z11 ? dfVar.f25712h : z12 ? dfVar.f25709e : dfVar.f25710f, s.m.d(150, r12, b0Var, i14), null, kVar52, 48, 12);
                kVar2 = kVar52;
                t.v vVar2 = (t.v) n1VarK2.getValue();
                z.g.a(androidx.compose.ui.draw.a.b(t.o.b(dVar3, vVar2.f25389a, vVar2.f25390b, f2Var), new u0.w1(f2Var, new ef.a(new a(r3VarA2, x0.r3.class, "value", "getValue()Ljava/lang/Object;", 0)))), kVar2, r12);
            } else {
                kVarP.v();
                kVar2 = kVarP;
                dVar3 = dVar2;
                f14 = f12;
                f15 = f13;
            }
            h2VarV = kVar2.V();
            if (h2VarV == null) {
                h2VarV.f31703d = new b(z10, z11, lVar, dVar3, dfVar, f2Var, f14, f15, i10, i11);
                return;
            }
            return;
        }
        i16 |= 3072;
        dVar2 = dVar;
        i12 = i16 | (!kVarP.K(dfVar) ? 16384 : 8192) | (!kVarP.K(f2Var) ? 131072 : 65536);
        if ((1572864 & i10) != 0) {
        }
        if ((12582912 & i10) != 0) {
        }
        if ((38347923 & i12) == 38347922) {
            kVarP.r0();
            if ((i10 & 1) != 0) {
                if (i17 == 0) {
                }
                if ((i11 & 64) == 0) {
                }
                if ((i11 & 128) == 0) {
                    f15 = f13;
                }
                kVarP.U();
                boolean zBooleanValue22 = ((Boolean) x.h.a(lVar, kVarP, (i12 >> 6) & 14).getValue()).booleanValue();
                float f1622 = u0.t1.f29148b;
                if (!z10) {
                }
                if (z10) {
                }
                if (z10) {
                }
                x0.n1 n1VarK22 = bg.b.k(a9.d2.a(((f3.h) r3VarK2.getValue()).f8817a, ((q1.b1) r3VarK.getValue()).f21656a), kVar);
                x0.k kVar522 = kVar;
                x0.r3 r3VarA22 = r.g2.a(!z10 ? dfVar.f25711g : z11 ? dfVar.f25712h : z12 ? dfVar.f25709e : dfVar.f25710f, s.m.d(150, r12, b0Var, i14), null, kVar522, 48, 12);
                kVar2 = kVar522;
                t.v vVar22 = (t.v) n1VarK22.getValue();
                z.g.a(androidx.compose.ui.draw.a.b(t.o.b(dVar3, vVar22.f25389a, vVar22.f25390b, f2Var), new u0.w1(f2Var, new ef.a(new a(r3VarA22, x0.r3.class, "value", "getValue()Ljava/lang/Object;", 0)))), kVar2, r12);
            }
        }
        h2VarV = kVar2.V();
        if (h2VarV == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:198:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(String str, eh.p<? super x0.j, ? super Integer, pg.f0> pVar, boolean z10, boolean z11, y2.q0 q0Var, x.l lVar, boolean z12, eh.p<? super x0.j, ? super Integer, pg.f0> pVar2, eh.p<? super x0.j, ? super Integer, pg.f0> pVar3, eh.p<? super x0.j, ? super Integer, pg.f0> pVar4, eh.p<? super x0.j, ? super Integer, pg.f0> pVar5, eh.p<? super x0.j, ? super Integer, pg.f0> pVar6, eh.p<? super x0.j, ? super Integer, pg.f0> pVar7, eh.p<? super x0.j, ? super Integer, pg.f0> pVar8, df dfVar, z.f1 f1Var, eh.p<? super x0.j, ? super Integer, pg.f0> pVar9, x0.j jVar, int i10, int i11, int i12) {
        int i13;
        boolean z13;
        boolean z14;
        eh.p<? super x0.j, ? super Integer, pg.f0> pVar10;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        eh.p<? super x0.j, ? super Integer, pg.f0> pVar11;
        df dfVarC;
        int i19;
        boolean z15;
        eh.p<? super x0.j, ? super Integer, pg.f0> pVarB;
        eh.p<? super x0.j, ? super Integer, pg.f0> pVar12;
        eh.p<? super x0.j, ? super Integer, pg.f0> pVar13;
        eh.p<? super x0.j, ? super Integer, pg.f0> pVar14;
        z.f1 f1Var2;
        df dfVar2;
        eh.p<? super x0.j, ? super Integer, pg.f0> pVar15;
        eh.p<? super x0.j, ? super Integer, pg.f0> pVar16;
        eh.p<? super x0.j, ? super Integer, pg.f0> pVar17;
        x0.k kVar;
        z.f1 f1Var3;
        df dfVar3;
        eh.p<? super x0.j, ? super Integer, pg.f0> pVar18;
        boolean z16;
        eh.p<? super x0.j, ? super Integer, pg.f0> pVar19;
        x0.h2 h2VarV;
        x0.k kVarP = jVar.p(-350442135);
        if ((i10 & 6) == 0) {
            i13 = (kVarP.K(str) ? 4 : 2) | i10;
        } else {
            i13 = i10;
        }
        if ((i10 & 48) == 0) {
            i13 |= kVarP.l(pVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i13 |= kVarP.c(z10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            z13 = z11;
            i13 |= kVarP.c(z13) ? 2048 : 1024;
        } else {
            z13 = z11;
        }
        int i20 = 8192;
        if ((i10 & 24576) == 0) {
            i13 |= kVarP.K(q0Var) ? 16384 : 8192;
        }
        if ((i10 & 196608) == 0) {
            i13 |= kVarP.K(lVar) ? 131072 : 65536;
        }
        int i21 = i12 & 64;
        int i22 = PKIFailureInfo.signerNotTrusted;
        if (i21 != 0) {
            i13 |= 1572864;
            z14 = z12;
        } else {
            z14 = z12;
            if ((i10 & 1572864) == 0) {
                i13 |= kVarP.c(z14) ? 1048576 : 524288;
            }
        }
        if ((i10 & 12582912) == 0) {
            i13 |= kVarP.l(pVar2) ? 8388608 : 4194304;
        }
        if ((i10 & 100663296) == 0) {
            i13 |= kVarP.l(pVar3) ? 67108864 : 33554432;
        }
        int i23 = i12 & 512;
        if (i23 != 0) {
            i13 |= 805306368;
            pVar10 = pVar4;
        } else {
            pVar10 = pVar4;
            if ((i10 & 805306368) == 0) {
                i13 |= kVarP.l(pVar10) ? PKIFailureInfo.duplicateCertReq : 268435456;
            }
        }
        int i24 = i12 & 1024;
        if (i24 != 0) {
            i15 = i11 | 6;
            i14 = i24;
        } else if ((i11 & 6) == 0) {
            i14 = i24;
            i15 = i11 | (kVarP.l(pVar5) ? 4 : 2);
        } else {
            i14 = i24;
            i15 = i11;
        }
        int i25 = i12 & 2048;
        if (i25 != 0) {
            i15 |= 48;
            i16 = i25;
        } else if ((i11 & 48) == 0) {
            i16 = i25;
            i15 |= kVarP.l(pVar6) ? 32 : 16;
        } else {
            i16 = i25;
        }
        int i26 = i15;
        int i27 = i12 & 4096;
        if (i27 == 0) {
            i17 = i26;
            if ((i11 & 384) == 0) {
                i17 |= kVarP.l(pVar7) ? 256 : 128;
            }
            if ((i11 & 3072) == 0) {
                i17 |= kVarP.l(pVar8) ? 2048 : 1024;
            }
            if ((i11 & 24576) == 0) {
                if ((i12 & 16384) == 0 && kVarP.K(dfVar)) {
                    i20 = 16384;
                }
                i17 |= i20;
            }
            if ((i11 & 196608) == 0) {
                i17 |= 65536;
            }
            i18 = i12 & 65536;
            if (i18 == 0) {
                i17 |= 1572864;
            } else if ((i11 & 1572864) == 0) {
                if (kVarP.l(pVar9)) {
                    i22 = 1048576;
                }
                i17 |= i22;
            }
            if ((i11 & 12582912) == 0) {
                i17 |= kVarP.K(this) ? 8388608 : 4194304;
            }
            if ((i13 & 306783379) != 306783378 && (i17 & 4793491) == 4793490 && kVarP.s()) {
                kVarP.v();
                pVar19 = pVar5;
                pVar16 = pVar6;
                pVar18 = pVar7;
                dfVar3 = dfVar;
                f1Var3 = f1Var;
                pVar17 = pVar9;
                kVar = kVarP;
                z16 = z14;
                pVar15 = pVar10;
            } else {
                kVarP.r0();
                if ((i10 & 1) != 0 || kVarP.a0()) {
                    boolean z17 = i21 == 0 ? false : z14;
                    if (i23 != 0) {
                        pVar10 = null;
                    }
                    eh.p<? super x0.j, ? super Integer, pg.f0> pVar20 = i14 == 0 ? null : pVar5;
                    pVar11 = i16 == 0 ? null : pVar6;
                    eh.p<? super x0.j, ? super Integer, pg.f0> pVar21 = i27 == 0 ? pVar7 : null;
                    if ((i12 & 16384) == 0) {
                        dfVarC = c((i17 >> 21) & 14, kVarP);
                        i17 &= -57345;
                    } else {
                        dfVarC = dfVar;
                    }
                    float f10 = u0.t1.f29148b;
                    z.g1 g1Var = new z.g1(f10, f10, f10, f10);
                    i19 = i17 & (-458753);
                    if (i18 == 0) {
                        z15 = z17;
                        pVarB = f1.c.b(-1448570018, new c(z10, z17, lVar, dfVarC), kVarP);
                        i19 = i19;
                    } else {
                        z15 = z17;
                        pVarB = pVar9;
                    }
                    pVar12 = pVar21;
                    pVar13 = pVar20;
                    pVar14 = pVar10;
                    f1Var2 = g1Var;
                    dfVar2 = dfVarC;
                } else {
                    kVarP.v();
                    if ((i12 & 16384) != 0) {
                        i17 &= -57345;
                    }
                    pVar11 = pVar6;
                    pVar12 = pVar7;
                    f1Var2 = f1Var;
                    i19 = i17 & (-458753);
                    z15 = z14;
                    pVar14 = pVar10;
                    pVar13 = pVar5;
                    dfVar2 = dfVar;
                    pVarB = pVar9;
                }
                kVarP.U();
                int i28 = i13 << 3;
                int i29 = i13 >> 3;
                eh.p<? super x0.j, ? super Integer, pg.f0> pVar22 = pVarB;
                int i30 = (i29 & V4Signature.MAX_SIGNING_INFOS_SIZE) | (i28 & 896) | (i28 & 112) | 6;
                int i31 = i13 >> 9;
                int i32 = i19 << 21;
                int i33 = (i31 & V4Signature.MAX_SIGNING_INFOS_SIZE) | ((i19 >> 9) & 14) | ((i13 >> 6) & 112) | (i13 & 896) | (i29 & 57344) | ((i19 << 6) & 3670016) | ((i19 << 3) & 29360128);
                boolean z18 = z13;
                boolean z19 = z15;
                eh.p<? super x0.j, ? super Integer, pg.f0> pVar23 = pVar11;
                u0.t1.a(str, pVar, q0Var, pVar2, pVar3, pVar14, pVar13, pVar23, pVar12, pVar8, z18, z10, z19, lVar, f1Var2, dfVar2, pVar22, kVarP, i30 | (i31 & 57344) | (i31 & 458752) | (i31 & 3670016) | (i32 & 29360128) | (i32 & 234881024) | (i32 & 1879048192), i33);
                pVar15 = pVar14;
                pVar16 = pVar23;
                pVar17 = pVar22;
                kVar = kVarP;
                f1Var3 = f1Var2;
                dfVar3 = dfVar2;
                pVar18 = pVar12;
                z16 = z19;
                pVar19 = pVar13;
            }
            h2VarV = kVar.V();
            if (h2VarV == null) {
                h2VarV.f31703d = new d(str, pVar, z10, z11, q0Var, lVar, z16, pVar2, pVar3, pVar15, pVar19, pVar16, pVar18, pVar8, dfVar3, f1Var3, pVar17, i10, i11, i12);
                return;
            }
            return;
        }
        i17 = i26 | 384;
        if ((i11 & 3072) == 0) {
        }
        if ((i11 & 24576) == 0) {
        }
        if ((i11 & 196608) == 0) {
        }
        i18 = i12 & 65536;
        if (i18 == 0) {
        }
        if ((i11 & 12582912) == 0) {
        }
        if ((i13 & 306783379) != 306783378) {
            kVarP.r0();
            if ((i10 & 1) != 0) {
                if (i21 == 0) {
                }
                if (i23 != 0) {
                }
                if (i14 == 0) {
                }
                if (i16 == 0) {
                }
                if (i27 == 0) {
                }
                if ((i12 & 16384) == 0) {
                }
                float f102 = u0.t1.f29148b;
                z.g1 g1Var2 = new z.g1(f102, f102, f102, f102);
                i19 = i17 & (-458753);
                if (i18 == 0) {
                }
                pVar12 = pVar21;
                pVar13 = pVar20;
                pVar14 = pVar10;
                f1Var2 = g1Var2;
                dfVar2 = dfVarC;
                kVarP.U();
                int i282 = i13 << 3;
                int i292 = i13 >> 3;
                eh.p<? super x0.j, ? super Integer, pg.f0> pVar222 = pVarB;
                int i302 = (i292 & V4Signature.MAX_SIGNING_INFOS_SIZE) | (i282 & 896) | (i282 & 112) | 6;
                int i312 = i13 >> 9;
                int i322 = i19 << 21;
                int i332 = (i312 & V4Signature.MAX_SIGNING_INFOS_SIZE) | ((i19 >> 9) & 14) | ((i13 >> 6) & 112) | (i13 & 896) | (i292 & 57344) | ((i19 << 6) & 3670016) | ((i19 << 3) & 29360128);
                boolean z182 = z13;
                boolean z192 = z15;
                eh.p<? super x0.j, ? super Integer, pg.f0> pVar232 = pVar11;
                u0.t1.a(str, pVar, q0Var, pVar2, pVar3, pVar14, pVar13, pVar232, pVar12, pVar8, z182, z10, z192, lVar, f1Var2, dfVar2, pVar222, kVarP, i302 | (i312 & 57344) | (i312 & 458752) | (i312 & 3670016) | (i322 & 29360128) | (i322 & 234881024) | (i322 & 1879048192), i332);
                pVar15 = pVar14;
                pVar16 = pVar232;
                pVar17 = pVar222;
                kVar = kVarP;
                f1Var3 = f1Var2;
                dfVar3 = dfVar2;
                pVar18 = pVar12;
                z16 = z192;
                pVar19 = pVar13;
            }
        }
        h2VarV = kVar.V();
        if (h2VarV == null) {
        }
    }
}
