package b6;

import b6.c;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class c<N extends c<N>> {
    private volatile Object _next;
    private volatile Object _prev;

    static {
        AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_next");
        AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_prev");
    }
}
