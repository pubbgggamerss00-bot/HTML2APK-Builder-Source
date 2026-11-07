package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class jn1 implements Iterator {
    public int s;

    /* renamed from: t, reason: collision with root package name */
    public int f6108t;

    /* renamed from: u, reason: collision with root package name */
    public int f6109u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ nn1 f6110v;

    public jn1(nn1 nn1Var) {
        this.f6110v = nn1Var;
        this.s = nn1Var.f7474w;
        this.f6108t = nn1Var.isEmpty() ? -1 : 0;
        this.f6109u = -1;
    }

    public abstract Object a(int i6);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6108t >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        nn1 nn1Var = this.f6110v;
        if (nn1Var.f7474w != this.s) {
            throw new ConcurrentModificationException();
        }
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i6 = this.f6108t;
        this.f6109u = i6;
        Object objA = a(i6);
        int i7 = this.f6108t + 1;
        if (i7 >= nn1Var.f7475x) {
            i7 = -1;
        }
        this.f6108t = i7;
        return objA;
    }

    @Override // java.util.Iterator
    public final void remove() {
        nn1 nn1Var = this.f6110v;
        if (nn1Var.f7474w != this.s) {
            throw new ConcurrentModificationException();
        }
        sl1.h("no calls to next() since the last call to remove()", this.f6109u >= 0);
        this.s += 32;
        nn1Var.remove(nn1Var.b()[this.f6109u]);
        this.f6108t--;
        this.f6109u = -1;
    }
}
