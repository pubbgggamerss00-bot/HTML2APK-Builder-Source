package g2;

/* loaded from: classes.dex */
public final class l implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public final p f11405a;

    /* renamed from: b, reason: collision with root package name */
    public final r f11406b;

    /* renamed from: c, reason: collision with root package name */
    public final s f11407c;

    public l(p pVar, r rVar, s sVar) {
        this.f11405a = pVar;
        this.f11406b = rVar;
        this.f11407c = sVar;
    }

    @Override // g2.p
    public final int J(int i10) {
        return this.f11405a.J(i10);
    }

    @Override // g2.p
    public final int O(int i10) {
        return this.f11405a.O(i10);
    }

    @Override // g2.k0
    public final g1 P(long j10) {
        s sVar = this.f11407c;
        s sVar2 = s.f11434a;
        r rVar = this.f11406b;
        p pVar = this.f11405a;
        if (sVar == sVar2) {
            return new n(rVar == r.f11428b ? pVar.O(f3.b.h(j10)) : pVar.J(f3.b.h(j10)), f3.b.d(j10) ? f3.b.h(j10) : 32767);
        }
        return new n(f3.b.e(j10) ? f3.b.i(j10) : 32767, rVar == r.f11428b ? pVar.z(f3.b.i(j10)) : pVar.b0(f3.b.i(j10)));
    }

    @Override // g2.p
    public final int b0(int i10) {
        return this.f11405a.b0(i10);
    }

    @Override // g2.p
    public final Object w() {
        return this.f11405a.w();
    }

    @Override // g2.p
    public final int z(int i10) {
        return this.f11405a.z(i10);
    }
}
