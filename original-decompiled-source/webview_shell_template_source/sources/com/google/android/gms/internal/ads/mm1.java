package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class mm1 implements Iterator {
    public final Iterator s;

    /* renamed from: t, reason: collision with root package name */
    public Collection f7188t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ nm1 f7189u;

    public mm1(nm1 nm1Var) {
        this.f7189u = nm1Var;
        this.s = nm1Var.f7469u.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.s.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.s.next();
        this.f7188t = (Collection) entry.getValue();
        return this.f7189u.a(entry);
    }

    @Override // java.util.Iterator
    public final void remove() {
        sl1.h("no calls to next() since the last call to remove()", this.f7188t != null);
        this.s.remove();
        this.f7189u.f7470v.f2802w -= this.f7188t.size();
        this.f7188t.clear();
        this.f7188t = null;
    }
}
