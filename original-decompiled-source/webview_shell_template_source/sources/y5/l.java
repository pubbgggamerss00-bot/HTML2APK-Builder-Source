package y5;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class l {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f15357b = AtomicIntegerFieldUpdater.newUpdater(l.class, "_handled");
    private volatile int _handled;

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f15358a;

    public l(Throwable th, boolean z6) {
        this.f15358a = th;
        this._handled = z6 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f15358a + ']';
    }
}
