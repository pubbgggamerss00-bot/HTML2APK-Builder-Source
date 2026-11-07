package i2;

import com.yalantis.ucrop.view.CropImageView;
import java.util.LinkedHashMap;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public abstract class o0 extends l0 implements g2.k0 {

    /* renamed from: n, reason: collision with root package name */
    public final g1 f13968n;

    /* renamed from: q, reason: collision with root package name */
    public LinkedHashMap f13970q;

    /* renamed from: s, reason: collision with root package name */
    public g2.m0 f13972s;

    /* renamed from: p, reason: collision with root package name */
    public long f13969p = 0;

    /* renamed from: r, reason: collision with root package name */
    public final g2.i0 f13971r = new g2.i0(this);

    /* renamed from: t, reason: collision with root package name */
    public final p.f0<g2.a> f13973t = p.p0.a();

    public o0(g1 g1Var) {
        this.f13968n = g1Var;
    }

    public static final void J0(o0 o0Var, g2.m0 m0Var) {
        pg.f0 f0Var;
        LinkedHashMap linkedHashMap;
        if (m0Var != null) {
            o0Var.o0((m0Var.getHeight() & BodyPartID.bodyIdMax) | (m0Var.a() << 32));
            f0Var = pg.f0.f21461a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            o0Var.o0(0L);
        }
        if (!kotlin.jvm.internal.r.a(o0Var.f13972s, m0Var) && m0Var != null && ((((linkedHashMap = o0Var.f13970q) != null && !linkedHashMap.isEmpty()) || !m0Var.r().isEmpty()) && !kotlin.jvm.internal.r.a(m0Var.r(), o0Var.f13970q))) {
            p0 p0Var = o0Var.f13968n.f13874n.K.f13930q;
            kotlin.jvm.internal.r.b(p0Var);
            p0Var.f13989v.g();
            LinkedHashMap linkedHashMap2 = o0Var.f13970q;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                o0Var.f13970q = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(m0Var.r());
        }
        o0Var.f13972s = m0Var;
    }

    @Override // i2.l0
    public final void E0() {
        l0(CropImageView.DEFAULT_ASPECT_RATIO, this.f13969p, null);
    }

    @Override // f3.d
    public final float G0() {
        return this.f13968n.G0();
    }

    @Override // i2.l0, g2.q
    public final boolean I0() {
        return true;
    }

    public final long L0() {
        return (this.f11383b & BodyPartID.bodyIdMax) | (this.f11382a << 32);
    }

    public void M0() {
        v0().s();
    }

    public final void O0(long j10) {
        if (!f3.m.b(this.f13969p, j10)) {
            this.f13969p = j10;
            g1 g1Var = this.f13968n;
            p0 p0Var = g1Var.f13874n.K.f13930q;
            if (p0Var != null) {
                p0Var.s0();
            }
            l0.B0(g1Var);
        }
        if (this.f13938h) {
            return;
        }
        r0(new h2(v0(), this));
    }

    public final long V0(o0 o0Var, boolean z10) {
        long jD = 0;
        o0 o0VarG1 = this;
        while (!o0VarG1.equals(o0Var)) {
            if (!o0VarG1.f13936f || !z10) {
                jD = f3.m.d(jD, o0VarG1.f13969p);
            }
            g1 g1Var = o0VarG1.f13968n.f13878s;
            kotlin.jvm.internal.r.b(g1Var);
            o0VarG1 = g1Var.g1();
            kotlin.jvm.internal.r.b(o0VarG1);
        }
        return jD;
    }

    @Override // f3.d
    public final float getDensity() {
        return this.f13968n.getDensity();
    }

    @Override // g2.q
    public final f3.r getLayoutDirection() {
        return this.f13968n.f13874n.C;
    }

    @Override // i2.l0, i2.y0
    public final e0 k1() {
        return this.f13968n.f13874n;
    }

    @Override // g2.g1
    public final void l0(float f10, long j10, eh.l lVar) {
        O0(j10);
        if (this.f13937g) {
            return;
        }
        M0();
    }

    @Override // i2.l0
    public final l0 s0() {
        g1 g1Var = this.f13968n.f13877r;
        if (g1Var != null) {
            return g1Var.g1();
        }
        return null;
    }

    @Override // i2.l0
    public final g2.v t0() {
        return this.f13971r;
    }

    @Override // i2.l0
    public final boolean u0() {
        return this.f13972s != null;
    }

    @Override // i2.l0
    public final g2.m0 v0() {
        g2.m0 m0Var = this.f13972s;
        if (m0Var != null) {
            return m0Var;
        }
        throw k1.a.a("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // g2.p0, g2.p
    public final Object w() {
        return this.f13968n.w();
    }

    @Override // i2.l0
    public final l0 w0() {
        g1 g1Var = this.f13968n.f13878s;
        if (g1Var != null) {
            return g1Var.g1();
        }
        return null;
    }

    @Override // i2.l0
    public final long z0() {
        return this.f13969p;
    }
}
