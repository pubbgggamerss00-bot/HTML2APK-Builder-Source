package r;

/* loaded from: classes.dex */
public final class k2 implements j2 {

    /* renamed from: a, reason: collision with root package name */
    public final eh.p<f3.p, f3.p, s.e0<f3.p>> f22871a;

    public k2(eh.p pVar) {
        this.f22871a = pVar;
    }

    @Override // r.j2
    public final boolean a() {
        return true;
    }

    @Override // r.j2
    public final s.e0<f3.p> b(long j10, long j11) {
        return this.f22871a.invoke(new f3.p(j10), new f3.p(j11));
    }
}
