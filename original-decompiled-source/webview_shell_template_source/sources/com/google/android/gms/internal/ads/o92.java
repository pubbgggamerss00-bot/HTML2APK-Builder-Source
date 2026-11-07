package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class o92 implements Iterator, Closeable {

    /* renamed from: y, reason: collision with root package name */
    public static final wc f7657y = new wc("eof ", 1);
    public qc s;

    /* renamed from: t, reason: collision with root package name */
    public b90 f7658t;

    /* renamed from: u, reason: collision with root package name */
    public sc f7659u = null;

    /* renamed from: v, reason: collision with root package name */
    public long f7660v = 0;

    /* renamed from: w, reason: collision with root package name */
    public long f7661w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final ArrayList f7662x = new ArrayList();

    static {
        me.g(o92.class);
    }

    @Override // java.util.Iterator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final sc next() {
        sc scVarB;
        sc scVar = this.f7659u;
        if (scVar != null && scVar != f7657y) {
            this.f7659u = null;
            return scVar;
        }
        b90 b90Var = this.f7658t;
        if (b90Var == null || this.f7660v >= this.f7661w) {
            this.f7659u = f7657y;
            throw new NoSuchElementException();
        }
        try {
            synchronized (b90Var) {
                this.f7658t.s.position((int) this.f7660v);
                scVarB = ((pc) this.s).b(this.f7658t, this);
                this.f7660v = this.f7658t.b();
            }
            return scVarB;
        } catch (EOFException unused) {
            throw new NoSuchElementException();
        } catch (IOException unused2) {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        sc scVar = this.f7659u;
        wc wcVar = f7657y;
        if (scVar == wcVar) {
            return false;
        }
        if (scVar != null) {
            return true;
        }
        try {
            this.f7659u = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.f7659u = wcVar;
            return false;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        int i6 = 0;
        while (true) {
            ArrayList arrayList = this.f7662x;
            if (i6 >= arrayList.size()) {
                sb.append("]");
                return sb.toString();
            }
            if (i6 > 0) {
                sb.append(";");
            }
            sb.append(((sc) arrayList.get(i6)).toString());
            i6++;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
