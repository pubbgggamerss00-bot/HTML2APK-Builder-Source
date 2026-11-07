package com.google.android.gms.internal.ads;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zn1 extends up1 implements ListIterator {

    /* renamed from: t, reason: collision with root package name */
    public final int f11525t;

    /* renamed from: u, reason: collision with root package name */
    public int f11526u;

    /* renamed from: v, reason: collision with root package name */
    public final bo1 f11527v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zn1(bo1 bo1Var, int i6) {
        super(0);
        int size = bo1Var.size();
        sl1.b(i6, size);
        this.f11525t = size;
        this.f11526u = i6;
        this.f11527v = bo1Var;
    }

    @Override // java.util.ListIterator
    @Deprecated
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final Object b(int i6) {
        return this.f11527v.get(i6);
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f11526u < this.f11525t;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f11526u > 0;
    }

    @Override // com.google.android.gms.internal.ads.up1, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i6 = this.f11526u;
        this.f11526u = i6 + 1;
        return b(i6);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f11526u;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i6 = this.f11526u - 1;
        this.f11526u = i6;
        return b(i6);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f11526u - 1;
    }

    @Override // java.util.ListIterator
    @Deprecated
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
