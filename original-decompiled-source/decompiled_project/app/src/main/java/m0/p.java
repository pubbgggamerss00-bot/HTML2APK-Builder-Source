package m0;

/* loaded from: classes.dex */
public final class p implements j3.o0 {

    /* renamed from: a, reason: collision with root package name */
    public final j1.d f17443a;

    /* renamed from: b, reason: collision with root package name */
    public final w f17444b;

    /* renamed from: c, reason: collision with root package name */
    public long f17445c = 0;

    public p(j1.d dVar, w wVar) {
        this.f17443a = dVar;
        this.f17444b = wVar;
    }

    @Override // j3.o0
    public final long a(f3.n nVar, long j10, f3.r rVar, long j11) {
        long jA = this.f17444b.a();
        if ((9223372034707292159L & jA) == 9205357640488583168L) {
            jA = this.f17445c;
        }
        this.f17445c = jA;
        return f3.m.d(f3.m.d(nVar.c(), ph.m0.d(jA)), this.f17443a.a(j11, 0L, rVar));
    }
}
