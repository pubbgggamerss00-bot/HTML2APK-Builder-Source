package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class om1 implements Iterator {
    public final Iterator s;

    /* renamed from: t, reason: collision with root package name */
    public Collection f7816t = null;

    /* renamed from: u, reason: collision with root package name */
    public Iterator f7817u = io1.s;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ an1 f7818v;

    public om1(an1 an1Var) {
        this.f7818v = an1Var;
        this.s = an1Var.f2801v.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.s.hasNext() || this.f7817u.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f7817u.hasNext()) {
            Map.Entry entry = (Map.Entry) this.s.next();
            entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f7816t = collection;
            this.f7817u = collection.iterator();
        }
        return this.f7817u.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f7817u.remove();
        Collection collection = this.f7816t;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.s.remove();
        }
        an1 an1Var = this.f7818v;
        an1Var.f2802w--;
    }
}
