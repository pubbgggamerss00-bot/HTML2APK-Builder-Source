package g2;

import g2.g1;
import java.util.Map;

/* loaded from: classes.dex */
public final class f implements c, o0 {

    /* renamed from: a, reason: collision with root package name */
    public final i2.c0 f11365a;

    /* renamed from: b, reason: collision with root package name */
    public d f11366b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f11367c;

    public f(i2.c0 c0Var, d dVar) {
        this.f11365a = c0Var;
        this.f11366b = dVar;
    }

    @Override // f3.d
    public final long E(long j10) {
        return this.f11365a.E(j10);
    }

    @Override // f3.d
    public final float G0() {
        return this.f11365a.G0();
    }

    @Override // g2.q
    public final boolean I0() {
        return false;
    }

    @Override // g2.o0
    public final m0 K0(int i10, int i11, Map map, eh.l lVar) {
        if ((i10 & (-16777216)) != 0 || ((-16777216) & i11) != 0) {
            f2.a.b("Size(" + i10 + " x " + i11 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new e(i10, i11, map, lVar, this);
    }

    @Override // f3.d
    public final float N0(float f10) {
        return this.f11365a.getDensity() * f10;
    }

    @Override // f3.d
    public final int T0(long j10) {
        return this.f11365a.T0(j10);
    }

    @Override // f3.d
    public final int b1(float f10) {
        return this.f11365a.b1(f10);
    }

    @Override // f3.d
    public final float getDensity() {
        return this.f11365a.getDensity();
    }

    @Override // g2.q
    public final f3.r getLayoutDirection() {
        return this.f11365a.f13874n.C;
    }

    @Override // g2.o0
    public final m0 i0(int i10, int i11, Map<a, Integer> map, eh.l<? super g1.a, pg.f0> lVar) {
        return this.f11365a.K0(i10, i11, map, lVar);
    }

    @Override // f3.d
    public final long o(float f10) {
        return this.f11365a.o(f10);
    }

    @Override // f3.d
    public final long p(long j10) {
        return this.f11365a.p(j10);
    }

    @Override // f3.d
    public final float q(long j10) {
        return this.f11365a.q(j10);
    }

    @Override // f3.d
    public final float r1(long j10) {
        return this.f11365a.r1(j10);
    }

    @Override // f3.d
    public final long t(float f10) {
        return this.f11365a.t(f10);
    }

    @Override // f3.d
    public final float u(int i10) {
        return this.f11365a.u(i10);
    }

    @Override // f3.d
    public final float v(float f10) {
        return f10 / this.f11365a.getDensity();
    }
}
