package g2;

import java.util.Map;

/* loaded from: classes.dex */
public final class u implements o0, q {

    /* renamed from: a, reason: collision with root package name */
    public final f3.r f11454a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f11455b;

    public u(q qVar, f3.r rVar) {
        this.f11454a = rVar;
        this.f11455b = qVar;
    }

    @Override // f3.d
    public final long E(long j10) {
        return this.f11455b.E(j10);
    }

    @Override // f3.d
    public final float G0() {
        return this.f11455b.G0();
    }

    @Override // g2.q
    public final boolean I0() {
        return this.f11455b.I0();
    }

    @Override // g2.o0
    public final m0 K0(int i10, int i11, Map map, eh.l lVar) {
        if (i10 < 0) {
            i10 = 0;
        }
        if (i11 < 0) {
            i11 = 0;
        }
        if ((i10 & (-16777216)) != 0 || ((-16777216) & i11) != 0) {
            f2.a.b("Size(" + i10 + " x " + i11 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new t(i10, i11, map);
    }

    @Override // f3.d
    public final float N0(float f10) {
        return this.f11455b.N0(f10);
    }

    @Override // f3.d
    public final int T0(long j10) {
        return this.f11455b.T0(j10);
    }

    @Override // f3.d
    public final int b1(float f10) {
        return this.f11455b.b1(f10);
    }

    @Override // f3.d
    public final float getDensity() {
        return this.f11455b.getDensity();
    }

    @Override // g2.q
    public final f3.r getLayoutDirection() {
        return this.f11454a;
    }

    @Override // f3.d
    public final long o(float f10) {
        return this.f11455b.o(f10);
    }

    @Override // f3.d
    public final long p(long j10) {
        return this.f11455b.p(j10);
    }

    @Override // f3.d
    public final float q(long j10) {
        return this.f11455b.q(j10);
    }

    @Override // f3.d
    public final float r1(long j10) {
        return this.f11455b.r1(j10);
    }

    @Override // f3.d
    public final long t(float f10) {
        return this.f11455b.t(f10);
    }

    @Override // f3.d
    public final float u(int i10) {
        return this.f11455b.u(i10);
    }

    @Override // f3.d
    public final float v(float f10) {
        return this.f11455b.v(f10);
    }
}
