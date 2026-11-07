package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class r92 implements Iterator {
    public int s = 0;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ s92 f8593t;

    public r92(s92 s92Var) {
        this.f8593t = s92Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i6 = this.s;
        s92 s92Var = this.f8593t;
        return i6 < s92Var.s.size() || s92Var.f8860t.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i6 = this.s;
        s92 s92Var = this.f8593t;
        List list = s92Var.s;
        if (i6 >= list.size()) {
            list.add(s92Var.f8860t.next());
            return next();
        }
        int i7 = this.s;
        this.s = i7 + 1;
        return list.get(i7);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
