package b6;

import b6.u;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import y5.i1;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class u<S extends u<S>> extends c<S> implements i1 {
    private volatile int cleanedAndPointers;

    static {
        AtomicIntegerFieldUpdater.newUpdater(u.class, "cleanedAndPointers");
    }

    public abstract void a();
}
