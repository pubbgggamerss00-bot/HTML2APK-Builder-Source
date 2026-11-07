package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class h72 implements Iterator {
    public int s = -1;

    /* renamed from: t, reason: collision with root package name */
    public boolean f5289t;

    /* renamed from: u, reason: collision with root package name */
    public Iterator f5290u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ j72 f5291v;

    public final Iterator a() {
        if (this.f5290u == null) {
            this.f5290u = this.f5291v.f5964u.entrySet().iterator();
        }
        return this.f5290u;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i6 = this.s + 1;
        j72 j72Var = this.f5291v;
        if (i6 >= j72Var.f5963t) {
            return !j72Var.f5964u.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.f5289t = true;
        int i6 = this.s + 1;
        this.s = i6;
        j72 j72Var = this.f5291v;
        return i6 < j72Var.f5963t ? (e72) j72Var.s[i6] : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f5289t) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f5289t = false;
        int i6 = j72.f5962y;
        j72 j72Var = this.f5291v;
        j72Var.h();
        int i7 = this.s;
        if (i7 >= j72Var.f5963t) {
            a().remove();
        } else {
            this.s = i7 - 1;
            j72Var.f(i7);
        }
    }
}
