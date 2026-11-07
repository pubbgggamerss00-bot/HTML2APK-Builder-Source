package j2;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.platform.AndroidComposeView;
import com.yalantis.ucrop.view.CropImageView;
import org.bouncycastle.asn1.cmc.BodyPartID;
import q1.s1;
import s1.a;

/* loaded from: classes.dex */
public final class w2 implements i2.u1 {

    /* renamed from: a, reason: collision with root package name */
    public t1.d f14938a;

    /* renamed from: b, reason: collision with root package name */
    public final q1.k1 f14939b;

    /* renamed from: c, reason: collision with root package name */
    public final AndroidComposeView f14940c;

    /* renamed from: d, reason: collision with root package name */
    public eh.p<? super q1.w0, ? super t1.d, pg.f0> f14941d;

    /* renamed from: e, reason: collision with root package name */
    public eh.a<pg.f0> f14942e;

    /* renamed from: f, reason: collision with root package name */
    public long f14943f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f14944g;

    /* renamed from: j, reason: collision with root package name */
    public float[] f14946j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f14947k;

    /* renamed from: p, reason: collision with root package name */
    public int f14951p;

    /* renamed from: r, reason: collision with root package name */
    public q1.s1 f14953r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f14954s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f14955t;

    /* renamed from: w, reason: collision with root package name */
    public boolean f14957w;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f14945h = q1.r1.a();

    /* renamed from: l, reason: collision with root package name */
    public f3.d f14948l = f3.f.a();

    /* renamed from: m, reason: collision with root package name */
    public f3.r f14949m = f3.r.f8828a;

    /* renamed from: n, reason: collision with root package name */
    public final s1.a f14950n = new s1.a();

    /* renamed from: q, reason: collision with root package name */
    public long f14952q = q1.l2.f21718b;

    /* renamed from: v, reason: collision with root package name */
    public boolean f14956v = true;

    /* renamed from: x, reason: collision with root package name */
    public final a f14958x = new a();

    public static final class a extends kotlin.jvm.internal.s implements eh.l<s1.e, pg.f0> {
        public a() {
            super(1);
        }

        @Override // eh.l
        public final pg.f0 invoke(s1.e eVar) {
            s1.e eVar2 = eVar;
            q1.w0 w0VarA = eVar2.Q0().a();
            eh.p<? super q1.w0, ? super t1.d, pg.f0> pVar = w2.this.f14941d;
            if (pVar != null) {
                pVar.invoke(w0VarA, eVar2.Q0().f24181b);
            }
            return pg.f0.f21461a;
        }
    }

    public w2(t1.d dVar, q1.k1 k1Var, AndroidComposeView androidComposeView, eh.p<? super q1.w0, ? super t1.d, pg.f0> pVar, eh.a<pg.f0> aVar) {
        this.f14938a = dVar;
        this.f14939b = k1Var;
        this.f14940c = androidComposeView;
        this.f14941d = pVar;
        this.f14942e = aVar;
        long j10 = Integer.MAX_VALUE;
        this.f14943f = (j10 & BodyPartID.bodyIdMax) | (j10 << 32);
    }

    @Override // i2.u1
    public final void a(float[] fArr) {
        q1.r1.e(fArr, m());
    }

    @Override // i2.u1
    public final void b(q1.w0 w0Var, t1.d dVar) {
        j();
        this.f14957w = this.f14938a.f27634a.J() > CropImageView.DEFAULT_ASPECT_RATIO;
        s1.a aVar = this.f14950n;
        a.b bVar = aVar.f24173b;
        bVar.e(w0Var);
        bVar.f24181b = dVar;
        t1.f.a(aVar, this.f14938a);
    }

    @Override // i2.u1
    public final boolean c(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & BodyPartID.bodyIdMax));
        t1.d dVar = this.f14938a;
        if (dVar.f27656w) {
            return y4.a(dVar.d(), fIntBitsToFloat, fIntBitsToFloat2);
        }
        return true;
    }

    @Override // i2.u1
    public final long d(long j10, boolean z10) {
        float[] fArrM;
        if (z10) {
            fArrM = l();
            if (fArrM == null) {
                return 9187343241974906880L;
            }
        } else {
            fArrM = m();
        }
        return this.f14956v ? j10 : q1.r1.b(fArrM, j10);
    }

    @Override // i2.u1
    public final void destroy() {
        this.f14941d = null;
        this.f14942e = null;
        this.f14944g = true;
        boolean z10 = this.f14947k;
        AndroidComposeView androidComposeView = this.f14940c;
        if (z10) {
            this.f14947k = false;
            androidComposeView.U(this, false);
        }
        q1.k1 k1Var = this.f14939b;
        if (k1Var != null) {
            k1Var.a(this.f14938a);
            androidComposeView.Y(this);
        }
    }

    @Override // i2.u1
    public final void e(long j10) {
        if (f3.p.b(j10, this.f14943f)) {
            return;
        }
        this.f14943f = j10;
        if (this.f14947k || this.f14944g) {
            return;
        }
        AndroidComposeView androidComposeView = this.f14940c;
        androidComposeView.invalidate();
        if (true != this.f14947k) {
            this.f14947k = true;
            androidComposeView.U(this, true);
        }
    }

    @Override // i2.u1
    public final void f(eh.p<? super q1.w0, ? super t1.d, pg.f0> pVar, eh.a<pg.f0> aVar) {
        q1.k1 k1Var = this.f14939b;
        if (k1Var == null) {
            throw k1.a.a("currently reuse is only supported when we manage the layer lifecycle");
        }
        if (!this.f14938a.f27652s) {
            f2.a.a("layer should have been released before reuse");
        }
        this.f14938a = k1Var.b();
        this.f14944g = false;
        this.f14941d = pVar;
        this.f14942e = aVar;
        this.f14954s = false;
        this.f14955t = false;
        this.f14956v = true;
        q1.r1.d(this.f14945h);
        float[] fArr = this.f14946j;
        if (fArr != null) {
            q1.r1.d(fArr);
        }
        this.f14952q = q1.l2.f21718b;
        this.f14957w = false;
        long j10 = Integer.MAX_VALUE;
        this.f14943f = (j10 & BodyPartID.bodyIdMax) | (j10 << 32);
        this.f14953r = null;
        this.f14951p = 0;
    }

    @Override // i2.u1
    public final void g(float[] fArr) {
        float[] fArrL = l();
        if (fArrL != null) {
            q1.r1.e(fArr, fArrL);
        }
    }

    @Override // i2.u1
    /* renamed from: getUnderlyingMatrix-sQKQjiQ */
    public final float[] mo1getUnderlyingMatrixsQKQjiQ() {
        return m();
    }

    @Override // i2.u1
    public final void h(q1.c2 c2Var) {
        View view;
        ViewParent parent;
        eh.a<pg.f0> aVar;
        int i10;
        eh.a<pg.f0> aVar2;
        int i11 = c2Var.f21659a | this.f14951p;
        this.f14949m = c2Var.f21676t;
        this.f14948l = c2Var.f21675s;
        int i12 = i11 & 4096;
        if (i12 != 0) {
            this.f14952q = c2Var.f21670m;
        }
        if ((i11 & 1) != 0) {
            t1.d dVar = this.f14938a;
            float f10 = c2Var.f21660b;
            t1.e eVar = dVar.f27634a;
            if (eVar.a() != f10) {
                eVar.h(f10);
            }
        }
        if ((i11 & 2) != 0) {
            t1.d dVar2 = this.f14938a;
            float f11 = c2Var.f21661c;
            t1.e eVar2 = dVar2.f27634a;
            if (eVar2.K() != f11) {
                eVar2.d(f11);
            }
        }
        if ((i11 & 4) != 0) {
            this.f14938a.f(c2Var.f21662d);
        }
        if ((i11 & 8) != 0) {
            t1.d dVar3 = this.f14938a;
            float f12 = c2Var.f21663e;
            t1.e eVar3 = dVar3.f27634a;
            if (eVar3.F() != f12) {
                eVar3.j(f12);
            }
        }
        if ((i11 & 16) != 0) {
            t1.d dVar4 = this.f14938a;
            float f13 = c2Var.f21664f;
            t1.e eVar4 = dVar4.f27634a;
            if (eVar4.z() != f13) {
                eVar4.c(f13);
            }
        }
        boolean z10 = true;
        if ((i11 & 32) != 0) {
            t1.d dVar5 = this.f14938a;
            float f14 = c2Var.f21665g;
            t1.e eVar5 = dVar5.f27634a;
            if (eVar5.J() != f14) {
                eVar5.n(f14);
                dVar5.f27640g = true;
                dVar5.a();
            }
            if (c2Var.f21665g > CropImageView.DEFAULT_ASPECT_RATIO && !this.f14957w && (aVar2 = this.f14942e) != null) {
                aVar2.invoke();
            }
        }
        if ((i11 & 64) != 0) {
            t1.d dVar6 = this.f14938a;
            long j10 = c2Var.f21666h;
            t1.e eVar6 = dVar6.f27634a;
            if (!q1.b1.d(j10, eVar6.y())) {
                eVar6.A(j10);
            }
        }
        if ((i11 & 128) != 0) {
            t1.d dVar7 = this.f14938a;
            long j11 = c2Var.f21667j;
            t1.e eVar7 = dVar7.f27634a;
            if (!q1.b1.d(j11, eVar7.B())) {
                eVar7.D(j11);
            }
        }
        if ((i11 & 1024) != 0) {
            t1.d dVar8 = this.f14938a;
            float f15 = c2Var.f21668k;
            t1.e eVar8 = dVar8.f27634a;
            if (eVar8.w() != f15) {
                eVar8.b(f15);
            }
        }
        if ((i11 & 256) != 0) {
            t1.e eVar9 = this.f14938a.f27634a;
            if (eVar9.G() != CropImageView.DEFAULT_ASPECT_RATIO) {
                eVar9.e();
            }
        }
        if ((i11 & 512) != 0) {
            t1.e eVar10 = this.f14938a.f27634a;
            if (eVar10.s() != CropImageView.DEFAULT_ASPECT_RATIO) {
                eVar10.g();
            }
        }
        if ((i11 & 2048) != 0) {
            t1.d dVar9 = this.f14938a;
            float f16 = c2Var.f21669l;
            t1.e eVar11 = dVar9.f27634a;
            if (eVar11.E() != f16) {
                eVar11.k(f16);
            }
        }
        if (i12 != 0) {
            if (q1.l2.a(this.f14952q, q1.l2.f21718b)) {
                t1.d dVar10 = this.f14938a;
                if (!p1.c.b(dVar10.f27655v, 9205357640488583168L)) {
                    dVar10.f27655v = 9205357640488583168L;
                    dVar10.f27634a.x(9205357640488583168L);
                }
            } else {
                t1.d dVar11 = this.f14938a;
                float fB = q1.l2.b(this.f14952q) * ((int) (this.f14943f >> 32));
                long jFloatToRawIntBits = (Float.floatToRawIntBits(q1.l2.c(this.f14952q) * ((int) (this.f14943f & BodyPartID.bodyIdMax))) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(fB) << 32);
                if (!p1.c.b(dVar11.f27655v, jFloatToRawIntBits)) {
                    dVar11.f27655v = jFloatToRawIntBits;
                    dVar11.f27634a.x(jFloatToRawIntBits);
                }
            }
        }
        if ((i11 & 16384) != 0) {
            t1.d dVar12 = this.f14938a;
            boolean z11 = c2Var.f21672p;
            if (dVar12.f27656w != z11) {
                dVar12.f27656w = z11;
                dVar12.f27640g = true;
                dVar12.a();
            }
        }
        if ((131072 & i11) != 0) {
            t1.d dVar13 = this.f14938a;
            q1.z1 z1Var = c2Var.f21677v;
            t1.e eVar12 = dVar13.f27634a;
            if (!kotlin.jvm.internal.r.a(eVar12.o(), z1Var)) {
                eVar12.l(z1Var);
            }
        }
        if ((32768 & i11) != 0) {
            t1.d dVar14 = this.f14938a;
            int i13 = c2Var.f21673q;
            if (i13 == 0) {
                i10 = 0;
            } else if (i13 == 1) {
                i10 = 1;
            } else {
                i10 = 2;
                if (i13 != 2) {
                    throw new IllegalStateException("Not supported composition strategy");
                }
            }
            t1.e eVar13 = dVar14.f27634a;
            if (eVar13.q() != i10) {
                eVar13.H(i10);
            }
        }
        if ((i11 & 7963) != 0) {
            this.f14954s = true;
            this.f14955t = true;
        }
        if (kotlin.jvm.internal.r.a(this.f14953r, c2Var.f21678w)) {
            z10 = false;
        } else {
            q1.s1 s1Var = c2Var.f21678w;
            this.f14953r = s1Var;
            if (s1Var != null) {
                t1.d dVar15 = this.f14938a;
                if (s1Var instanceof s1.b) {
                    p1.e eVar14 = ((s1.b) s1Var).f21734a;
                    float f17 = eVar14.f21131a;
                    float f18 = eVar14.f21132b;
                    dVar15.g((Float.floatToRawIntBits(f17) << 32) | (Float.floatToRawIntBits(f18) & BodyPartID.bodyIdMax), (Float.floatToRawIntBits(eVar14.f21133c - eVar14.f21131a) << 32) | (Float.floatToRawIntBits(eVar14.f21134d - f18) & BodyPartID.bodyIdMax), CropImageView.DEFAULT_ASPECT_RATIO);
                } else if (s1Var instanceof s1.a) {
                    q1.u1 u1Var = ((s1.a) s1Var).f21733a;
                    dVar15.f27644k = null;
                    dVar15.f27642i = 9205357640488583168L;
                    dVar15.f27641h = 0L;
                    dVar15.f27643j = CropImageView.DEFAULT_ASPECT_RATIO;
                    dVar15.f27640g = true;
                    dVar15.f27647n = false;
                    dVar15.f27645l = u1Var;
                    dVar15.a();
                } else if (s1Var instanceof s1.c) {
                    s1.c cVar = (s1.c) s1Var;
                    q1.j0 j0Var = cVar.f21736b;
                    if (j0Var != null) {
                        dVar15.f27644k = null;
                        dVar15.f27642i = 9205357640488583168L;
                        dVar15.f27641h = 0L;
                        dVar15.f27643j = CropImageView.DEFAULT_ASPECT_RATIO;
                        dVar15.f27640g = true;
                        dVar15.f27647n = false;
                        dVar15.f27645l = j0Var;
                        dVar15.a();
                    } else {
                        dVar15.g((Float.floatToRawIntBits(r4.f21135a) << 32) | (Float.floatToRawIntBits(r4.f21136b) & BodyPartID.bodyIdMax), (Float.floatToRawIntBits(r4.b()) << 32) | (Float.floatToRawIntBits(r4.a()) & BodyPartID.bodyIdMax), Float.intBitsToFloat((int) (cVar.f21735a.f21142h >> 32)));
                    }
                }
                if ((s1Var instanceof s1.a) && Build.VERSION.SDK_INT < 33 && (aVar = this.f14942e) != null) {
                    aVar.invoke();
                }
            }
        }
        this.f14951p = c2Var.f21659a;
        if ((i11 != 0 || z10) && (parent = (view = this.f14940c).getParent()) != null) {
            parent.onDescendantInvalidated(view, view);
        }
    }

    @Override // i2.u1
    public final void i(long j10) {
        t1.d dVar = this.f14938a;
        if (!f3.m.b(dVar.f27653t, j10)) {
            dVar.f27653t = j10;
            dVar.f27634a.r((int) (j10 >> 32), (int) (j10 & BodyPartID.bodyIdMax), dVar.f27654u);
        }
        View view = this.f14940c;
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(view, view);
        }
    }

    @Override // i2.u1
    public final void invalidate() {
        if (this.f14947k || this.f14944g) {
            return;
        }
        AndroidComposeView androidComposeView = this.f14940c;
        androidComposeView.invalidate();
        if (true != this.f14947k) {
            this.f14947k = true;
            androidComposeView.U(this, true);
        }
    }

    @Override // i2.u1
    public final void j() {
        if (this.f14947k) {
            if (!q1.l2.a(this.f14952q, q1.l2.f21718b) && !f3.p.b(this.f14938a.f27654u, this.f14943f)) {
                t1.d dVar = this.f14938a;
                float fB = q1.l2.b(this.f14952q) * ((int) (this.f14943f >> 32));
                float fC = q1.l2.c(this.f14952q) * ((int) (this.f14943f & BodyPartID.bodyIdMax));
                long jFloatToRawIntBits = (Float.floatToRawIntBits(fC) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(fB) << 32);
                if (!p1.c.b(dVar.f27655v, jFloatToRawIntBits)) {
                    dVar.f27655v = jFloatToRawIntBits;
                    dVar.f27634a.x(jFloatToRawIntBits);
                }
            }
            t1.d dVar2 = this.f14938a;
            f3.d dVar3 = this.f14948l;
            f3.r rVar = this.f14949m;
            long j10 = this.f14943f;
            long j11 = dVar2.f27654u;
            t1.e eVar = dVar2.f27634a;
            if (!f3.p.b(j11, j10)) {
                dVar2.f27654u = j10;
                long j12 = dVar2.f27653t;
                eVar.r((int) (j12 >> 32), (int) (BodyPartID.bodyIdMax & j12), j10);
                if (dVar2.f27642i == 9205357640488583168L) {
                    dVar2.f27640g = true;
                    dVar2.a();
                }
            }
            dVar2.f27635b = dVar3;
            dVar2.f27636c = rVar;
            dVar2.f27637d = this.f14958x;
            eVar.u(dVar3, rVar, dVar2, dVar2.f27638e);
            if (this.f14947k) {
                this.f14947k = false;
                this.f14940c.U(this, false);
            }
        }
    }

    @Override // i2.u1
    public final void k(p1.b bVar, boolean z10) {
        float[] fArrL = z10 ? l() : m();
        if (this.f14956v) {
            return;
        }
        if (fArrL != null) {
            q1.r1.c(fArrL, bVar);
            return;
        }
        bVar.f21125a = CropImageView.DEFAULT_ASPECT_RATIO;
        bVar.f21126b = CropImageView.DEFAULT_ASPECT_RATIO;
        bVar.f21127c = CropImageView.DEFAULT_ASPECT_RATIO;
        bVar.f21128d = CropImageView.DEFAULT_ASPECT_RATIO;
    }

    public final float[] l() {
        float[] fArrA = this.f14946j;
        if (fArrA == null) {
            fArrA = q1.r1.a();
            this.f14946j = fArrA;
        }
        if (this.f14955t) {
            this.f14955t = false;
            float[] fArrM = m();
            if (this.f14956v) {
                return fArrM;
            }
            if (!g3.a(fArrM, fArrA)) {
                fArrA[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArrA[0])) {
            return null;
        }
        return fArrA;
    }

    public final float[] m() {
        boolean z10 = this.f14954s;
        float[] fArr = this.f14945h;
        if (z10) {
            t1.d dVar = this.f14938a;
            long jD = dVar.f27655v;
            t1.e eVar = dVar.f27634a;
            if ((9223372034707292159L & jD) == 9205357640488583168L) {
                jD = d0.h.d(f3.q.e(this.f14943f));
            }
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jD >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jD & BodyPartID.bodyIdMax));
            float F = eVar.F();
            float fZ = eVar.z();
            float fG = eVar.G();
            float fS = eVar.s();
            float fW = eVar.w();
            float fA = eVar.a();
            float fK = eVar.K();
            double d10 = fG * 0.017453292519943295d;
            float fSin = (float) Math.sin(d10);
            float fCos = (float) Math.cos(d10);
            float f10 = -fSin;
            float f11 = (fZ * fCos) - (1.0f * fSin);
            float f12 = (1.0f * fCos) + (fZ * fSin);
            double d11 = fS * 0.017453292519943295d;
            float fSin2 = (float) Math.sin(d11);
            float fCos2 = (float) Math.cos(d11);
            float f13 = -fSin2;
            float f14 = fSin * fSin2;
            float f15 = fSin * fCos2;
            float f16 = fCos * fSin2;
            float f17 = fCos * fCos2;
            float f18 = (f12 * fSin2) + (F * fCos2);
            float f19 = (f12 * fCos2) + ((-F) * fSin2);
            double d12 = fW * 0.017453292519943295d;
            float fSin3 = (float) Math.sin(d12);
            float fCos3 = (float) Math.cos(d12);
            float f20 = -fSin3;
            float f21 = (fCos3 * f14) + (f20 * fCos2);
            float f22 = ((f14 * fSin3) + (fCos2 * fCos3)) * fA;
            float f23 = fSin3 * fCos * fA;
            float f24 = ((fSin3 * f15) + (fCos3 * f13)) * fA;
            float f25 = f21 * fK;
            float f26 = fCos * fCos3 * fK;
            float f27 = ((fCos3 * f15) + (f20 * f13)) * fK;
            float f28 = f16 * 1.0f;
            float f29 = f10 * 1.0f;
            float f30 = f17 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f22;
                fArr[1] = f23;
                fArr[2] = f24;
                fArr[3] = 0.0f;
                fArr[4] = f25;
                fArr[5] = f26;
                fArr[6] = f27;
                fArr[7] = 0.0f;
                fArr[8] = f28;
                fArr[9] = f29;
                fArr[10] = f30;
                fArr[11] = 0.0f;
                float f31 = -fIntBitsToFloat;
                fArr[12] = ((f22 * f31) - (fIntBitsToFloat2 * f25)) + f18 + fIntBitsToFloat;
                fArr[13] = ((f23 * f31) - (fIntBitsToFloat2 * f26)) + f11 + fIntBitsToFloat2;
                fArr[14] = ((f31 * f24) - (fIntBitsToFloat2 * f27)) + f19;
                fArr[15] = 1.0f;
            }
            this.f14954s = false;
            this.f14956v = g2.w.d(fArr);
        }
        return fArr;
    }
}
