package s;

/* loaded from: classes.dex */
public final class h0 implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f23758a;

    /* renamed from: b, reason: collision with root package name */
    public final b0 f23759b;

    /* renamed from: c, reason: collision with root package name */
    public final long f23760c;

    /* renamed from: d, reason: collision with root package name */
    public final long f23761d;

    public h0(int i10, int i11, b0 b0Var) {
        this.f23758a = i10;
        this.f23759b = b0Var;
        this.f23760c = i10 * 1000000;
        this.f23761d = i11 * 1000000;
    }

    @Override // s.f0
    public final long b(float f10, float f11, float f12) {
        return this.f23761d + this.f23760c;
    }

    @Override // s.f0
    public final float c(float f10, float f11, float f12, long j10) {
        long j11 = j10 - this.f23761d;
        if (j11 < 0) {
            j11 = 0;
        }
        long j12 = this.f23760c;
        long j13 = j11 > j12 ? j12 : j11;
        if (j13 == 0) {
            return f12;
        }
        return (e(f10, f11, f12, j13) - e(f10, f11, f12, j13 - 1000000)) * 1000.0f;
    }

    @Override // s.f0
    public final float e(float f10, float f11, float f12, long j10) {
        long j11 = j10 - this.f23761d;
        if (j11 < 0) {
            j11 = 0;
        }
        long j12 = this.f23760c;
        if (j11 > j12) {
            j11 = j12;
        }
        float fA = this.f23759b.a(this.f23758a == 0 ? 1.0f : j11 / j12);
        return (f11 * fA) + ((1 - fA) * f10);
    }
}
