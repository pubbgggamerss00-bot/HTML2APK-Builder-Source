package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class pm1 implements Iterator {
    public Map.Entry s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Iterator f8106t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ qm1 f8107u;

    public pm1(qm1 qm1Var, Iterator it) {
        this.f8106t = it;
        this.f8107u = qm1Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8106t.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f8106t.next();
        this.s = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        sl1.h("no calls to next() since the last call to remove()", this.s != null);
        Collection collection = (Collection) this.s.getValue();
        this.f8106t.remove();
        this.f8107u.f8419t.f2802w -= collection.size();
        collection.clear();
        this.s = null;
    }
}
