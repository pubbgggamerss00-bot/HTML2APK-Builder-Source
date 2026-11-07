package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ym1 extends xm1 implements ListIterator {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ zm1 f11028v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ym1(zm1 zm1Var) {
        super(zm1Var);
        this.f11028v = zm1Var;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        zm1 zm1Var = this.f11028v;
        boolean zIsEmpty = zm1Var.isEmpty();
        a();
        ((ListIterator) this.s).add(obj);
        zm1Var.f11348x.f2802w++;
        if (zIsEmpty) {
            zm1Var.c();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        a();
        return ((ListIterator) this.s).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        a();
        return ((ListIterator) this.s).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        return ((ListIterator) this.s).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        a();
        return ((ListIterator) this.s).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        a();
        ((ListIterator) this.s).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ym1(zm1 zm1Var, int i6) {
        super(zm1Var, ((List) zm1Var.f11344t).listIterator(i6));
        this.f11028v = zm1Var;
    }
}
