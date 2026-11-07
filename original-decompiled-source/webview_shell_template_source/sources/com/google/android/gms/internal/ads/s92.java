package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class s92 extends AbstractList {

    /* renamed from: u, reason: collision with root package name */
    public static final me f8859u = me.g(s92.class);
    public final List s;

    /* renamed from: t, reason: collision with root package name */
    public final o92 f8860t;

    public s92(ArrayList arrayList, o92 o92Var) {
        this.s = arrayList;
        this.f8860t = o92Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i6) {
        List list = this.s;
        if (list.size() > i6) {
            return list.get(i6);
        }
        o92 o92Var = this.f8860t;
        if (!o92Var.hasNext()) {
            throw new NoSuchElementException();
        }
        list.add(o92Var.next());
        return get(i6);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new r92(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        me meVar = f8859u;
        meVar.f("potentially expensive size() call");
        meVar.f("blowup running");
        while (true) {
            o92 o92Var = this.f8860t;
            boolean zHasNext = o92Var.hasNext();
            List list = this.s;
            if (!zHasNext) {
                return list.size();
            }
            list.add(o92Var.next());
        }
    }
}
