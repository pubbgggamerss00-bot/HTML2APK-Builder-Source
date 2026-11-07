package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class xm1 implements Iterator {
    public final Iterator s;

    /* renamed from: t, reason: collision with root package name */
    public final Collection f10628t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ zm1 f10629u;

    public xm1(zm1 zm1Var, ListIterator listIterator) {
        this.f10629u = zm1Var;
        this.f10628t = zm1Var.f11344t;
        this.s = listIterator;
    }

    public final void a() {
        zm1 zm1Var = this.f10629u;
        zm1Var.zzb();
        if (zm1Var.f11344t != this.f10628t) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a();
        return this.s.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        a();
        return this.s.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.s.remove();
        zm1 zm1Var = this.f10629u;
        an1 an1Var = zm1Var.f11347w;
        an1Var.f2802w--;
        zm1Var.d();
    }

    public xm1(zm1 zm1Var) {
        this.f10629u = zm1Var;
        Collection collection = zm1Var.f11344t;
        this.f10628t = collection;
        this.s = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }
}
