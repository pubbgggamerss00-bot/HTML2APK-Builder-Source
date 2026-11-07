package com.google.android.gms.internal.consent_sdk;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d6 implements Iterator {
    public int s = 0;

    /* renamed from: t, reason: collision with root package name */
    public final int f11681t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ h6 f11682u;

    public d6(h6 h6Var) {
        this.f11682u = h6Var;
        this.f11681t = h6Var.e();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.s < this.f11681t;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i6 = this.s;
        if (i6 >= this.f11681t) {
            throw new NoSuchElementException();
        }
        this.s = i6 + 1;
        return Byte.valueOf(this.f11682u.d(i6));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
