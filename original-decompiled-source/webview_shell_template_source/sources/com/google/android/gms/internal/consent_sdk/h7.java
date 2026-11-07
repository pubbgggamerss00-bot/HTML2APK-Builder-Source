package com.google.android.gms.internal.consent_sdk;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class h7 implements Iterator {
    public final Iterator s;

    public h7(Iterator it) {
        this.s = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.s.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.s.next();
        return entry.getValue() instanceof i7 ? new g7(entry) : entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.s.remove();
    }
}
