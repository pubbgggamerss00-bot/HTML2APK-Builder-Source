package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class z62 implements Iterator {
    public final ArrayDeque s;

    /* renamed from: t, reason: collision with root package name */
    public d42 f11193t;

    public z62(g42 g42Var) {
        if (!(g42Var instanceof a72)) {
            this.s = null;
            this.f11193t = (d42) g42Var;
            return;
        }
        a72 a72Var = (a72) g42Var;
        ArrayDeque arrayDeque = new ArrayDeque(a72Var.f2602y);
        this.s = arrayDeque;
        arrayDeque.push(a72Var);
        g42 g42Var2 = a72Var.f2599v;
        while (g42Var2 instanceof a72) {
            a72 a72Var2 = (a72) g42Var2;
            this.s.push(a72Var2);
            g42Var2 = a72Var2.f2599v;
        }
        this.f11193t = (d42) g42Var2;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final d42 next() {
        d42 d42Var;
        d42 d42Var2 = this.f11193t;
        if (d42Var2 == null) {
            throw new NoSuchElementException();
        }
        do {
            d42Var = null;
            ArrayDeque arrayDeque = this.s;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            g42 g42Var = ((a72) arrayDeque.pop()).f2600w;
            while (g42Var instanceof a72) {
                a72 a72Var = (a72) g42Var;
                arrayDeque.push(a72Var);
                g42Var = a72Var.f2599v;
            }
            d42Var = (d42) g42Var;
        } while (d42Var.g() == 0);
        this.f11193t = d42Var;
        return d42Var2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f11193t != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
