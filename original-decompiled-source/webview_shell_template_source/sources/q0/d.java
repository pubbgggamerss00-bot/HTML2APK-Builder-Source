package q0;

import android.os.OutcomeReceiver;
import java.lang.Throwable;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d<R, E extends Throwable> extends AtomicBoolean implements OutcomeReceiver {
    public final y5.f s;

    public d(y5.f fVar) {
        super(false);
        this.s = fVar;
    }

    public final void onError(E e6) {
        if (compareAndSet(false, true)) {
            this.s.g(d5.e.a(e6));
        }
    }

    public final void onResult(R r5) {
        if (compareAndSet(false, true)) {
            this.s.g(r5);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
