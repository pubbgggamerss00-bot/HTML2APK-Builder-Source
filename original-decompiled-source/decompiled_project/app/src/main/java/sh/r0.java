package sh;

/* loaded from: classes2.dex */
public final class r0 extends th.d<o0<?>> {

    /* renamed from: a, reason: collision with root package name */
    public long f25078a = -1;

    /* renamed from: b, reason: collision with root package name */
    public ph.m f25079b;

    @Override // th.d
    public final boolean a(th.b bVar) {
        o0 o0Var = (o0) bVar;
        if (this.f25078a >= 0) {
            return false;
        }
        long j10 = o0Var.f25045j;
        if (j10 < o0Var.f25046k) {
            o0Var.f25046k = j10;
        }
        this.f25078a = j10;
        return true;
    }

    @Override // th.d
    public final tg.e[] b(th.b bVar) {
        long j10 = this.f25078a;
        this.f25078a = -1L;
        this.f25079b = null;
        return ((o0) bVar).w(j10);
    }
}
