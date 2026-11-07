package d4;

import android.os.CancellationSignal;

/* loaded from: classes.dex */
public final class q implements eh.l<Throwable, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CancellationSignal f7356a;

    public q(CancellationSignal cancellationSignal) {
        this.f7356a = cancellationSignal;
    }

    @Override // eh.l
    public final pg.f0 invoke(Throwable th2) {
        this.f7356a.cancel();
        return pg.f0.f21461a;
    }
}
