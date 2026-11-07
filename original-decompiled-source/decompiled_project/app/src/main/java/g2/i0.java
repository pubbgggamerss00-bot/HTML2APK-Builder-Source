package g2;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class i0 implements v {

    /* renamed from: a, reason: collision with root package name */
    public final i2.o0 f11396a;

    public i0(i2.o0 o0Var) {
        this.f11396a = o0Var;
    }

    @Override // g2.v
    public final long B(long j10) {
        return this.f11396a.f13968n.B(p1.c.g(j10, b()));
    }

    @Override // g2.v
    public final void G(v vVar, float[] fArr) {
        this.f11396a.f13968n.G(vVar, fArr);
    }

    @Override // g2.v
    public final void I(float[] fArr) {
        this.f11396a.f13968n.I(fArr);
    }

    @Override // g2.v
    public final long L(v vVar, long j10) {
        return c(vVar, j10);
    }

    @Override // g2.v
    public final p1.e N(v vVar, boolean z10) {
        return this.f11396a.f13968n.N(vVar, z10);
    }

    @Override // g2.v
    public final long R(long j10) {
        return p1.c.g(this.f11396a.f13968n.R(j10), b());
    }

    @Override // g2.v
    public final v S() {
        i2.o0 o0VarG1;
        if (!m()) {
            f2.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        i2.g1 g1Var = this.f11396a.f13968n.f13874n.I.f13791c.f13878s;
        if (g1Var == null || (o0VarG1 = g1Var.g1()) == null) {
            return null;
        }
        return o0VarG1.f13971r;
    }

    @Override // g2.v
    public final long Y(long j10) {
        return this.f11396a.f13968n.Y(p1.c.g(j10, b()));
    }

    @Override // g2.v
    public final long a() {
        i2.o0 o0Var = this.f11396a;
        return (o0Var.f11382a << 32) | (o0Var.f11383b & BodyPartID.bodyIdMax);
    }

    public final long b() {
        i2.o0 o0Var = this.f11396a;
        i2.o0 o0VarA = j0.a(o0Var);
        return p1.c.f(c(o0VarA.f13971r, 0L), o0Var.f13968n.F1(o0VarA.f13968n, 0L));
    }

    public final long c(v vVar, long j10) {
        boolean z10 = vVar instanceof i0;
        i2.o0 o0Var = this.f11396a;
        if (!z10) {
            i2.o0 o0VarA = j0.a(o0Var);
            i2.g1 g1Var = o0VarA.f13968n;
            long jC = c(o0VarA.f13971r, j10);
            long j11 = o0VarA.f13969p;
            float f10 = (int) (j11 >> 32);
            float f11 = (int) (j11 & BodyPartID.bodyIdMax);
            long jF = p1.c.f(jC, (BodyPartID.bodyIdMax & Float.floatToRawIntBits(f11)) | (Float.floatToRawIntBits(f10) << 32));
            if (!g1Var.l1().f1157p) {
                f2.a.b("LayoutCoordinate operations are only valid when isAttached is true");
            }
            g1Var.I1();
            i2.g1 g1Var2 = g1Var.f13878s;
            if (g1Var2 != null) {
                g1Var = g1Var2;
            }
            return p1.c.g(jF, g1Var.F1(vVar, 0L));
        }
        i2.o0 o0Var2 = ((i0) vVar).f11396a;
        i2.g1 g1Var3 = o0Var2.f13968n;
        g1Var3.I1();
        i2.o0 o0VarG1 = o0Var.f13968n.Z0(g1Var3).g1();
        if (o0VarG1 != null) {
            long jC2 = f3.m.c(f3.m.d(o0Var2.V0(o0VarG1, false), ph.m0.d(j10)), o0Var.V0(o0VarG1, false));
            float f12 = (int) (jC2 >> 32);
            float f13 = (int) (jC2 & BodyPartID.bodyIdMax);
            return (Float.floatToRawIntBits(f12) << 32) | (Float.floatToRawIntBits(f13) & BodyPartID.bodyIdMax);
        }
        i2.o0 o0VarA2 = j0.a(o0Var2);
        long jD = f3.m.d(f3.m.d(o0Var2.V0(o0VarA2, false), o0VarA2.f13969p), ph.m0.d(j10));
        i2.o0 o0VarA3 = j0.a(o0Var);
        long jC3 = f3.m.c(jD, f3.m.d(o0Var.V0(o0VarA3, false), o0VarA3.f13969p));
        float f14 = (int) (jC3 >> 32);
        float f15 = (int) (jC3 & BodyPartID.bodyIdMax);
        long jFloatToRawIntBits = Float.floatToRawIntBits(f14);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(f15) & BodyPartID.bodyIdMax;
        i2.g1 g1Var4 = o0VarA3.f13968n.f13878s;
        kotlin.jvm.internal.r.b(g1Var4);
        i2.g1 g1Var5 = o0VarA2.f13968n.f13878s;
        kotlin.jvm.internal.r.b(g1Var5);
        return g1Var4.F1(g1Var5, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32));
    }

    @Override // g2.v
    public final boolean m() {
        return this.f11396a.f13968n.l1().f1157p;
    }

    @Override // g2.v
    public final long y(long j10) {
        return p1.c.g(this.f11396a.f13968n.y(j10), b());
    }
}
