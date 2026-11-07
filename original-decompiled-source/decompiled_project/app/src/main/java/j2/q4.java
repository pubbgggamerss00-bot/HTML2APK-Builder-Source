package j2;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.platform.AndroidComposeView;
import com.yalantis.ucrop.view.CropImageView;
import org.bouncycastle.asn1.cmc.BodyPartID;
import q1.y1;

/* loaded from: classes.dex */
public final class q4 implements i2.u1 {

    /* renamed from: p, reason: collision with root package name */
    public static final a f14868p = a.f14882a;

    /* renamed from: a, reason: collision with root package name */
    public final AndroidComposeView f14869a;

    /* renamed from: b, reason: collision with root package name */
    public eh.p<? super q1.w0, ? super t1.d, pg.f0> f14870b;

    /* renamed from: c, reason: collision with root package name */
    public eh.a<pg.f0> f14871c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f14872d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f14874f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f14875g;

    /* renamed from: h, reason: collision with root package name */
    public q1.h0 f14876h;

    /* renamed from: m, reason: collision with root package name */
    public final m2 f14880m;

    /* renamed from: n, reason: collision with root package name */
    public int f14881n;

    /* renamed from: e, reason: collision with root package name */
    public final p3 f14873e = new p3();

    /* renamed from: j, reason: collision with root package name */
    public final i3<m2> f14877j = new i3<>(f14868p);

    /* renamed from: k, reason: collision with root package name */
    public final q1.x0 f14878k = new q1.x0();

    /* renamed from: l, reason: collision with root package name */
    public long f14879l = q1.l2.f21718b;

    public static final class a extends kotlin.jvm.internal.s implements eh.p<m2, Matrix, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f14882a = new a(2);

        @Override // eh.p
        public final pg.f0 invoke(m2 m2Var, Matrix matrix) {
            m2Var.O(matrix);
            return pg.f0.f21461a;
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements eh.l<q1.w0, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ eh.p<q1.w0, t1.d, pg.f0> f14883a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(eh.p<? super q1.w0, ? super t1.d, pg.f0> pVar) {
            super(1);
            this.f14883a = pVar;
        }

        @Override // eh.l
        public final pg.f0 invoke(q1.w0 w0Var) {
            this.f14883a.invoke(w0Var, null);
            return pg.f0.f21461a;
        }
    }

    public q4(AndroidComposeView androidComposeView, eh.p<? super q1.w0, ? super t1.d, pg.f0> pVar, eh.a<pg.f0> aVar) {
        this.f14869a = androidComposeView;
        this.f14870b = pVar;
        this.f14871c = aVar;
        m2 p4Var = Build.VERSION.SDK_INT >= 29 ? new p4() : new z3(androidComposeView);
        p4Var.G();
        p4Var.z(false);
        this.f14880m = p4Var;
    }

    @Override // i2.u1
    public final void a(float[] fArr) {
        q1.r1.e(fArr, this.f14877j.b(this.f14880m));
    }

    @Override // i2.u1
    public final void b(q1.w0 w0Var, t1.d dVar) {
        Canvas canvasA = q1.c0.a(w0Var);
        boolean zIsHardwareAccelerated = canvasA.isHardwareAccelerated();
        m2 m2Var = this.f14880m;
        if (zIsHardwareAccelerated) {
            j();
            boolean z10 = m2Var.P() > CropImageView.DEFAULT_ASPECT_RATIO;
            this.f14875g = z10;
            if (z10) {
                w0Var.s();
            }
            m2Var.w(canvasA);
            if (this.f14875g) {
                w0Var.f();
                return;
            }
            return;
        }
        float fX = m2Var.x();
        float fI = m2Var.I();
        float fK = m2Var.K();
        float fV = m2Var.v();
        if (m2Var.i() < 1.0f) {
            q1.h0 h0VarA = this.f14876h;
            if (h0VarA == null) {
                h0VarA = q1.i0.a();
                this.f14876h = h0VarA;
            }
            h0VarA.g(m2Var.i());
            canvasA.saveLayer(fX, fI, fK, fV, h0VarA.f21694a);
        } else {
            w0Var.d();
        }
        w0Var.n(fX, fI);
        w0Var.g(this.f14877j.b(m2Var));
        if (m2Var.L() || m2Var.H()) {
            this.f14873e.a(w0Var);
        }
        eh.p<? super q1.w0, ? super t1.d, pg.f0> pVar = this.f14870b;
        if (pVar != null) {
            pVar.invoke(w0Var, null);
        }
        w0Var.o();
        l(false);
    }

    @Override // i2.u1
    public final boolean c(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (BodyPartID.bodyIdMax & j10));
        m2 m2Var = this.f14880m;
        if (m2Var.H()) {
            return CropImageView.DEFAULT_ASPECT_RATIO <= fIntBitsToFloat && fIntBitsToFloat < ((float) m2Var.a()) && CropImageView.DEFAULT_ASPECT_RATIO <= fIntBitsToFloat2 && fIntBitsToFloat2 < ((float) m2Var.getHeight());
        }
        if (m2Var.L()) {
            return this.f14873e.c(j10);
        }
        return true;
    }

    @Override // i2.u1
    public final long d(long j10, boolean z10) {
        m2 m2Var = this.f14880m;
        i3<m2> i3Var = this.f14877j;
        if (!z10) {
            return !i3Var.f14767h ? q1.r1.b(i3Var.b(m2Var), j10) : j10;
        }
        float[] fArrA = i3Var.a(m2Var);
        if (fArrA == null) {
            return 9187343241974906880L;
        }
        return !i3Var.f14767h ? q1.r1.b(fArrA, j10) : j10;
    }

    @Override // i2.u1
    public final void destroy() {
        m2 m2Var = this.f14880m;
        if (m2Var.t()) {
            m2Var.m();
        }
        this.f14870b = null;
        this.f14871c = null;
        this.f14874f = true;
        l(false);
        AndroidComposeView androidComposeView = this.f14869a;
        androidComposeView.I = true;
        androidComposeView.Y(this);
    }

    @Override // i2.u1
    public final void e(long j10) {
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & BodyPartID.bodyIdMax);
        float fB = q1.l2.b(this.f14879l) * i10;
        m2 m2Var = this.f14880m;
        m2Var.y(fB);
        m2Var.B(q1.l2.c(this.f14879l) * i11);
        if (m2Var.A(m2Var.x(), m2Var.I(), m2Var.x() + i10, m2Var.I() + i11)) {
            m2Var.F(this.f14873e.b());
            if (!this.f14872d && !this.f14874f) {
                this.f14869a.invalidate();
                l(true);
            }
            this.f14877j.c();
        }
    }

    @Override // i2.u1
    public final void f(eh.p<? super q1.w0, ? super t1.d, pg.f0> pVar, eh.a<pg.f0> aVar) {
        i3<m2> i3Var = this.f14877j;
        i3Var.f14764e = false;
        i3Var.f14765f = false;
        i3Var.f14767h = true;
        i3Var.f14766g = true;
        q1.r1.d(i3Var.f14762c);
        q1.r1.d(i3Var.f14763d);
        l(false);
        this.f14874f = false;
        this.f14875g = false;
        this.f14879l = q1.l2.f21718b;
        this.f14870b = pVar;
        this.f14871c = aVar;
    }

    @Override // i2.u1
    public final void g(float[] fArr) {
        float[] fArrA = this.f14877j.a(this.f14880m);
        if (fArrA != null) {
            q1.r1.e(fArr, fArrA);
        }
    }

    @Override // i2.u1
    /* renamed from: getUnderlyingMatrix-sQKQjiQ */
    public final float[] mo1getUnderlyingMatrixsQKQjiQ() {
        return this.f14877j.b(this.f14880m);
    }

    @Override // i2.u1
    public final void h(q1.c2 c2Var) {
        eh.a<pg.f0> aVar;
        int i10 = c2Var.f21659a | this.f14881n;
        int i11 = i10 & 4096;
        if (i11 != 0) {
            this.f14879l = c2Var.f21670m;
        }
        m2 m2Var = this.f14880m;
        boolean zL = m2Var.L();
        p3 p3Var = this.f14873e;
        boolean z10 = false;
        boolean z11 = zL && p3Var.f14852g;
        if ((i10 & 1) != 0) {
            m2Var.h(c2Var.f21660b);
        }
        if ((i10 & 2) != 0) {
            m2Var.d(c2Var.f21661c);
        }
        if ((i10 & 4) != 0) {
            m2Var.f(c2Var.f21662d);
        }
        if ((i10 & 8) != 0) {
            m2Var.j(c2Var.f21663e);
        }
        if ((i10 & 16) != 0) {
            m2Var.c(c2Var.f21664f);
        }
        if ((i10 & 32) != 0) {
            m2Var.C(c2Var.f21665g);
        }
        if ((i10 & 64) != 0) {
            m2Var.J(c2.n0.j(c2Var.f21666h));
        }
        if ((i10 & 128) != 0) {
            m2Var.N(c2.n0.j(c2Var.f21667j));
        }
        if ((i10 & 1024) != 0) {
            m2Var.b(c2Var.f21668k);
        }
        if ((i10 & 256) != 0) {
            m2Var.e();
        }
        if ((i10 & 512) != 0) {
            m2Var.g();
        }
        if ((i10 & 2048) != 0) {
            m2Var.k(c2Var.f21669l);
        }
        if (i11 != 0) {
            m2Var.y(q1.l2.b(this.f14879l) * m2Var.a());
            m2Var.B(q1.l2.c(this.f14879l) * m2Var.getHeight());
        }
        boolean z12 = c2Var.f21672p;
        y1.a aVar2 = q1.y1.f21750a;
        boolean z13 = z12 && c2Var.f21671n != aVar2;
        if ((i10 & 24576) != 0) {
            m2Var.M(z13);
            m2Var.z(c2Var.f21672p && c2Var.f21671n == aVar2);
        }
        if ((131072 & i10) != 0) {
            m2Var.l(c2Var.f21677v);
        }
        if ((32768 & i10) != 0) {
            m2Var.s(c2Var.f21673q);
        }
        boolean zD = this.f14873e.d(c2Var.f21678w, c2Var.f21662d, z13, c2Var.f21665g, c2Var.f21674r);
        if (p3Var.f14851f) {
            m2Var.F(p3Var.b());
        }
        if (z13 && p3Var.f14852g) {
            z10 = true;
        }
        View view = this.f14869a;
        if (z11 == z10 && (!z10 || !zD)) {
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.onDescendantInvalidated(view, view);
            }
        } else if (!this.f14872d && !this.f14874f) {
            view.invalidate();
            l(true);
        }
        if (!this.f14875g && m2Var.P() > CropImageView.DEFAULT_ASPECT_RATIO && (aVar = this.f14871c) != null) {
            aVar.invoke();
        }
        if ((i10 & 7963) != 0) {
            this.f14877j.c();
        }
        this.f14881n = c2Var.f21659a;
    }

    @Override // i2.u1
    public final void i(long j10) {
        m2 m2Var = this.f14880m;
        int iX = m2Var.x();
        int I = m2Var.I();
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & BodyPartID.bodyIdMax);
        if (iX == i10 && I == i11) {
            return;
        }
        if (iX != i10) {
            m2Var.u(i10 - iX);
        }
        if (I != i11) {
            m2Var.D(i11 - I);
        }
        View view = this.f14869a;
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(view, view);
        }
        this.f14877j.c();
    }

    @Override // i2.u1
    public final void invalidate() {
        if (this.f14872d || this.f14874f) {
            return;
        }
        this.f14869a.invalidate();
        l(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
    @Override // i2.u1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j() {
        q1.u1 u1Var;
        boolean z10 = this.f14872d;
        m2 m2Var = this.f14880m;
        if (z10 || !m2Var.t()) {
            if (m2Var.L()) {
                p3 p3Var = this.f14873e;
                if (p3Var.f14852g) {
                    p3Var.e();
                    u1Var = p3Var.f14850e;
                } else {
                    u1Var = null;
                }
            }
            eh.p<? super q1.w0, ? super t1.d, pg.f0> pVar = this.f14870b;
            if (pVar != null) {
                m2Var.E(this.f14878k, u1Var, new b(pVar));
            }
            l(false);
        }
    }

    @Override // i2.u1
    public final void k(p1.b bVar, boolean z10) {
        m2 m2Var = this.f14880m;
        i3<m2> i3Var = this.f14877j;
        if (!z10) {
            float[] fArrB = i3Var.b(m2Var);
            if (i3Var.f14767h) {
                return;
            }
            q1.r1.c(fArrB, bVar);
            return;
        }
        float[] fArrA = i3Var.a(m2Var);
        if (fArrA != null) {
            if (i3Var.f14767h) {
                return;
            }
            q1.r1.c(fArrA, bVar);
        } else {
            bVar.f21125a = CropImageView.DEFAULT_ASPECT_RATIO;
            bVar.f21126b = CropImageView.DEFAULT_ASPECT_RATIO;
            bVar.f21127c = CropImageView.DEFAULT_ASPECT_RATIO;
            bVar.f21128d = CropImageView.DEFAULT_ASPECT_RATIO;
        }
    }

    public final void l(boolean z10) {
        if (z10 != this.f14872d) {
            this.f14872d = z10;
            this.f14869a.U(this, z10);
        }
    }
}
