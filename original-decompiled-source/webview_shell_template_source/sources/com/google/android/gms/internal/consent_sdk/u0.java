package com.google.android.gms.internal.consent_sdk;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class u0 extends d1 implements ListIterator {
    public final int s;

    /* renamed from: t, reason: collision with root package name */
    public int f11911t;

    /* renamed from: u, reason: collision with root package name */
    public final w0 f11912u;

    public u0(w0 w0Var, int i6) {
        int size = w0Var.size();
        q0.b(i6, size);
        this.s = size;
        this.f11911t = i6;
        this.f11912u = w0Var;
    }

    public final Object a(int i6) {
        return this.f11912u.get(i6);
    }

    @Override // java.util.ListIterator
    @Deprecated
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f11911t < this.s;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f11911t > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i6 = this.f11911t;
        this.f11911t = i6 + 1;
        return a(i6);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f11911t;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i6 = this.f11911t - 1;
        this.f11911t = i6;
        return a(i6);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f11911t - 1;
    }

    @Override // java.util.ListIterator
    @Deprecated
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
