package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class vn1 extends me {

    /* renamed from: t, reason: collision with root package name */
    public Object[] f9901t;

    /* renamed from: u, reason: collision with root package name */
    public int f9902u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f9903v;

    public vn1(int i6) {
        super(7);
        en1.a(i6, "initialCapacity");
        this.f9901t = new Object[i6];
        this.f9902u = 0;
    }

    public final void q(Object obj) {
        obj.getClass();
        s(1);
        Object[] objArr = this.f9901t;
        int i6 = this.f9902u;
        this.f9902u = i6 + 1;
        objArr[i6] = obj;
    }

    public final void r(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            s(collection.size());
            if (collection instanceof wn1) {
                this.f9902u = ((wn1) collection).c(this.f9901t, this.f9902u);
                return;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            h(it.next());
        }
    }

    public final void s(int i6) {
        int length = this.f9901t.length;
        int iO = me.o(length, this.f9902u + i6);
        if (iO > length || this.f9903v) {
            this.f9901t = Arrays.copyOf(this.f9901t, iO);
            this.f9903v = false;
        }
    }
}
