package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class sp1 implements Iterator {
    public final Iterator s;

    public sp1(Iterator it) {
        it.getClass();
        this.s = it;
    }

    public abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.s.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.s.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.s.remove();
    }
}
