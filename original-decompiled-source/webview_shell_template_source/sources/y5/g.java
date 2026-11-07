package y5;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class g extends l {

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f15345c = AtomicIntegerFieldUpdater.newUpdater(g.class, "_resumed");
    private volatile int _resumed;

    public g(f fVar, Throwable th, boolean z6) {
        if (th == null) {
            th = new CancellationException("Continuation " + fVar + " was cancelled normally");
        }
        super(th, z6);
        this._resumed = 0;
    }
}
