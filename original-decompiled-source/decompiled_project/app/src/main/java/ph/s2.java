package ph;

import nh.b;

/* loaded from: classes2.dex */
public final class s2<U, T extends U> extends uh.r<T> implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final long f21590e;

    public s2(long j10, vg.c cVar) {
        super(cVar, cVar.getContext());
        this.f21590e = j10;
    }

    @Override // ph.y1
    public final String K() {
        return super.K() + "(timeMillis=" + this.f21590e + ')';
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String strA;
        r0 r0VarC = t0.c(this.f21494c);
        u0 u0Var = r0VarC instanceof u0 ? (u0) r0VarC : null;
        long j10 = this.f21590e;
        if (u0Var != null) {
            b.a aVar = nh.b.f18809b;
            nh.d.g(j10, nh.e.f18815c);
            strA = u0Var.l();
            if (strA == null) {
                strA = c2.u.a("Timed out waiting for ", " ms", j10);
            }
        }
        l(new r2(strA, this));
    }
}
