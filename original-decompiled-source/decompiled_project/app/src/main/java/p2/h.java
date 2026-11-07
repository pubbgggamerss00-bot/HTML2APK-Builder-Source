package p2;

import android.os.CancellationSignal;
import pg.f0;

/* loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.s implements eh.l<Throwable, f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CancellationSignal f21171a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(CancellationSignal cancellationSignal) {
        super(1);
        this.f21171a = cancellationSignal;
    }

    @Override // eh.l
    public final f0 invoke(Throwable th2) {
        if (th2 != null) {
            this.f21171a.cancel();
        }
        return f0.f21461a;
    }
}
