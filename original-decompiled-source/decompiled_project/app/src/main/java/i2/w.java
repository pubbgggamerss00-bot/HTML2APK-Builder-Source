package i2;

import androidx.compose.ui.d;
import com.yalantis.ucrop.view.CropImageView;
import i2.e0;
import i2.g1;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class w extends g1 {
    public static final q1.h0 X;
    public final l2 V;
    public a W;

    public final class a extends o0 {
        @Override // g2.p
        public final int J(int i10) {
            y yVarF = this.f13968n.f13874n.F();
            g2.l0 l0VarA = yVarF.a();
            e0 e0Var = yVarF.f14070a;
            return l0VarA.f(e0Var.I.f13791c, e0Var.v(), i10);
        }

        @Override // i2.o0
        public final void M0() {
            p0 p0Var = this.f13968n.f13874n.K.f13930q;
            kotlin.jvm.internal.r.b(p0Var);
            p0Var.u0();
        }

        @Override // g2.p
        public final int O(int i10) {
            y yVarF = this.f13968n.f13874n.F();
            g2.l0 l0VarA = yVarF.a();
            e0 e0Var = yVarF.f14070a;
            return l0VarA.c(e0Var.I.f13791c, e0Var.v(), i10);
        }

        @Override // g2.k0
        public final g2.g1 P(long j10) {
            p0(j10);
            g1 g1Var = this.f13968n;
            z0.b<e0> bVarJ = g1Var.f13874n.J();
            e0[] e0VarArr = bVarJ.f34700a;
            int i10 = bVarJ.f34702c;
            for (int i11 = 0; i11 < i10; i11++) {
                p0 p0Var = e0VarArr[i11].K.f13930q;
                kotlin.jvm.internal.r.b(p0Var);
                p0Var.f13980k = e0.f.f13842c;
            }
            e0 e0Var = g1Var.f13874n;
            o0.J0(this, e0Var.f13831z.h(this, e0Var.v(), j10));
            return this;
        }

        @Override // g2.p
        public final int b0(int i10) {
            y yVarF = this.f13968n.f13874n.F();
            g2.l0 l0VarA = yVarF.a();
            e0 e0Var = yVarF.f14070a;
            return l0VarA.g(e0Var.I.f13791c, e0Var.v(), i10);
        }

        @Override // i2.l0
        public final int q0(g2.a aVar) {
            p0 p0Var = this.f13968n.f13874n.K.f13930q;
            kotlin.jvm.internal.r.b(p0Var);
            k0 k0Var = p0Var.f13989v;
            if (!p0Var.f13981l) {
                j0 j0Var = p0Var.f13976f;
                if (j0Var.f13917d == e0.d.f13834b) {
                    k0Var.f13766f = true;
                    if (k0Var.f13762b) {
                        j0Var.f13919f = true;
                        j0Var.f13920g = true;
                    }
                } else {
                    k0Var.f13767g = true;
                }
            }
            a aVar2 = p0Var.F().W;
            if (aVar2 != null) {
                aVar2.f13938h = true;
            }
            p0Var.X();
            a aVar3 = p0Var.F().W;
            if (aVar3 != null) {
                aVar3.f13938h = false;
            }
            Integer num = (Integer) k0Var.f13769i.get(aVar);
            int iIntValue = num != null ? num.intValue() : PKIFailureInfo.systemUnavail;
            this.f13973t.h(iIntValue, aVar);
            return iIntValue;
        }

        @Override // g2.p
        public final int z(int i10) {
            y yVarF = this.f13968n.f13874n.F();
            g2.l0 l0VarA = yVarF.a();
            e0 e0Var = yVarF.f14070a;
            return l0VarA.i(e0Var.I.f13791c, e0Var.v(), i10);
        }
    }

    static {
        q1.h0 h0VarA = q1.i0.a();
        h0VarA.i(q1.b1.f21651e);
        h0VarA.p(1.0f);
        h0VarA.q(1);
        X = h0VarA;
    }

    public w(e0 e0Var) {
        super(e0Var);
        l2 l2Var = new l2();
        l2Var.f1147d = 0;
        this.V = l2Var;
        l2Var.f1151h = this;
        this.W = e0Var.f13816h != null ? new a(this) : null;
    }

    @Override // g2.p
    public final int J(int i10) {
        y yVarF = this.f13874n.F();
        g2.l0 l0VarA = yVarF.a();
        e0 e0Var = yVarF.f14070a;
        return l0VarA.f(e0Var.I.f13791c, e0Var.w(), i10);
    }

    @Override // i2.g1
    public final void M1(q1.w0 w0Var, t1.d dVar) {
        e0 e0Var = this.f13874n;
        v1 v1VarA = i0.a(e0Var);
        z0.b<e0> bVarI = e0Var.I();
        e0[] e0VarArr = bVarI.f34700a;
        int i10 = bVarI.f34702c;
        for (int i11 = 0; i11 < i10; i11++) {
            e0 e0Var2 = e0VarArr[i11];
            if (e0Var2.x()) {
                e0Var2.t(w0Var, dVar);
            }
        }
        if (v1VarA.getShowLayoutBounds()) {
            long j10 = this.f11384c;
            w0Var.t(0.5f, 0.5f, ((int) (j10 >> 32)) - 0.5f, ((int) (j10 & BodyPartID.bodyIdMax)) - 0.5f, X);
        }
    }

    @Override // g2.p
    public final int O(int i10) {
        y yVarF = this.f13874n.F();
        g2.l0 l0VarA = yVarF.a();
        e0 e0Var = yVarF.f14070a;
        return l0VarA.c(e0Var.I.f13791c, e0Var.w(), i10);
    }

    @Override // g2.k0
    public final g2.g1 P(long j10) {
        if (this.f13876q) {
            a aVar = this.W;
            kotlin.jvm.internal.r.b(aVar);
            j10 = aVar.f11385d;
        }
        p0(j10);
        e0 e0Var = this.f13874n;
        z0.b<e0> bVarJ = e0Var.J();
        e0[] e0VarArr = bVarJ.f34700a;
        int i10 = bVarJ.f34702c;
        for (int i11 = 0; i11 < i10; i11++) {
            e0VarArr[i11].K.f13929p.f14053m = e0.f.f13842c;
        }
        P1(e0Var.f13831z.h(this, e0Var.w(), j10));
        J1();
        return this;
    }

    @Override // i2.g1
    public final void Y0() {
        if (this.W == null) {
            this.W = new a(this);
        }
    }

    @Override // g2.p
    public final int b0(int i10) {
        y yVarF = this.f13874n.F();
        g2.l0 l0VarA = yVarF.a();
        e0 e0Var = yVarF.f14070a;
        return l0VarA.g(e0Var.I.f13791c, e0Var.w(), i10);
    }

    @Override // i2.g1
    public final o0 g1() {
        return this.W;
    }

    @Override // i2.g1, g2.g1
    public final void l0(float f10, long j10, eh.l lVar) {
        super.l0(f10, j10, lVar);
        if (this.f13937g) {
            return;
        }
        this.f13874n.K.f13929p.v0();
    }

    @Override // i2.g1
    public final d.c l1() {
        return this.V;
    }

    @Override // i2.g1, g2.g1
    public final void m0(long j10, float f10, t1.d dVar) {
        super.m0(j10, f10, dVar);
        if (this.f13937g) {
            return;
        }
        this.f13874n.K.f13929p.v0();
    }

    @Override // i2.l0
    public final int q0(g2.a aVar) {
        a aVar2 = this.W;
        if (aVar2 != null) {
            return aVar2.q0(aVar);
        }
        x0 x0Var = this.f13874n.K.f13929p;
        g0 g0Var = x0Var.B;
        if (!x0Var.f14054n) {
            if (x0Var.f14047f.f13917d == e0.d.f13833a) {
                g0Var.f13766f = true;
                if (g0Var.f13762b) {
                    x0Var.f14064z = true;
                    x0Var.A = true;
                }
            } else {
                g0Var.f13767g = true;
            }
        }
        x0Var.F().f13938h = true;
        x0Var.X();
        x0Var.F().f13938h = false;
        Integer num = (Integer) g0Var.f13769i.get(aVar);
        return num != null ? num.intValue() : PKIFailureInfo.systemUnavail;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v10, types: [z0.b] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [z0.b] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // i2.g1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w1(g1.e eVar, long j10, u uVar, int i10, boolean z10) {
        int i11;
        boolean z11;
        boolean z12;
        long j11 = j10;
        e0 e0Var = this.f13874n;
        g1.e eVar2 = eVar;
        if (eVar2.a(e0Var)) {
            if (V1(j11)) {
                i11 = i10;
                z11 = z10;
                z12 = true;
            } else {
                i11 = i10;
                if (i11 == 1 && (Float.floatToRawIntBits(O0(j11, i1())) & Integer.MAX_VALUE) < 2139095040) {
                    z12 = true;
                    z11 = false;
                }
            }
            if (z12) {
                return;
            }
            int i12 = uVar.f14023c;
            z0.b<e0> bVarI = e0Var.I();
            e0[] e0VarArr = bVarI.f34700a;
            int i13 = bVarI.f34702c - 1;
            loop0: while (i13 >= 0) {
                e0 e0Var2 = e0VarArr[i13];
                if (e0Var2.x()) {
                    eVar2.c(e0Var2, j11, uVar, i11, z11);
                    long jC = uVar.c();
                    if (f1.m.c(jC) < CropImageView.DEFAULT_ASPECT_RATIO && f1.m.f(jC) && !f1.m.e(jC)) {
                        g1 g1Var = e0Var2.I.f13791c;
                        g1Var.getClass();
                        d.c cVarN1 = g1Var.n1(j1.g(16));
                        if (cVarN1 == null || !cVarN1.f1157p) {
                            break;
                        }
                        if (!cVarN1.f1144a.f1157p) {
                            f2.a.b("visitLocalDescendants called on an unattached node");
                        }
                        d.c cVar = cVarN1.f1144a;
                        if ((cVar.f1147d & 16) == 0) {
                            break;
                        }
                        while (cVar != null) {
                            if ((cVar.f1146c & 16) != 0) {
                                m mVarB = cVar;
                                ?? bVar = 0;
                                while (mVarB != 0) {
                                    if (mVarB instanceof i2) {
                                        if (((i2) mVarB).i1()) {
                                            uVar.f14023c = uVar.f14021a.f20707b - 1;
                                        }
                                    } else if ((mVarB.f1146c & 16) != 0 && (mVarB instanceof m)) {
                                        d.c cVar2 = mVarB.f13947r;
                                        int i14 = 0;
                                        mVarB = mVarB;
                                        bVar = bVar;
                                        while (cVar2 != null) {
                                            if ((cVar2.f1146c & 16) != 0) {
                                                i14++;
                                                bVar = bVar;
                                                if (i14 == 1) {
                                                    mVarB = cVar2;
                                                } else {
                                                    if (bVar == 0) {
                                                        bVar = new z0.b(new d.c[16]);
                                                    }
                                                    if (mVarB != 0) {
                                                        bVar.b(mVarB);
                                                        mVarB = 0;
                                                    }
                                                    bVar.b(cVar2);
                                                }
                                            }
                                            cVar2 = cVar2.f1149f;
                                            mVarB = mVarB;
                                            bVar = bVar;
                                        }
                                        if (i14 == 1) {
                                        }
                                    }
                                    mVarB = k.b(bVar);
                                }
                            }
                            cVar = cVar.f1149f;
                        }
                        break loop0;
                    }
                }
                i13--;
                eVar2 = eVar;
                j11 = j10;
                i11 = i10;
            }
            uVar.f14023c = i12;
            return;
        }
        i11 = i10;
        z11 = z10;
        z12 = false;
        if (z12) {
        }
    }

    @Override // g2.p
    public final int z(int i10) {
        y yVarF = this.f13874n.F();
        g2.l0 l0VarA = yVarF.a();
        e0 e0Var = yVarF.f14070a;
        return l0VarA.i(e0Var.I.f13791c, e0Var.w(), i10);
    }
}
