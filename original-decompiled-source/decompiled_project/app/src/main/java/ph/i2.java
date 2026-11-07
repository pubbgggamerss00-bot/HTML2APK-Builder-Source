package ph;

import ph.y1;

/* loaded from: classes2.dex */
public final class i2<T> extends x1 {

    /* renamed from: e, reason: collision with root package name */
    public final y1.a f21550e;

    public i2(y1.a aVar) {
        this.f21550e = aVar;
    }

    @Override // ph.x1
    public final boolean j() {
        return false;
    }

    @Override // ph.x1
    public final void k(Throwable th2) {
        Object obj = y1.f21611a.get(i());
        boolean z10 = obj instanceof y;
        y1.a aVar = this.f21550e;
        if (z10) {
            aVar.resumeWith(pg.q.a(((y) obj).f21609a));
        } else {
            aVar.resumeWith(b2.a(obj));
        }
    }
}
