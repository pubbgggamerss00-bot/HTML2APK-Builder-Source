package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class fo1 extends vn1 {

    /* renamed from: w, reason: collision with root package name */
    public Object[] f4742w;

    /* renamed from: x, reason: collision with root package name */
    public int f4743x;

    @Override // com.google.android.gms.internal.ads.me
    public final /* bridge */ /* synthetic */ me h(Object obj) {
        t(obj);
        return this;
    }

    public final void t(Object obj) {
        obj.getClass();
        if (this.f4742w != null) {
            int iJ = go1.j(this.f9902u);
            Object[] objArr = this.f4742w;
            if (iJ <= objArr.length) {
                int length = objArr.length - 1;
                int iHashCode = obj.hashCode();
                int iA = aa1.a(iHashCode);
                while (true) {
                    int i6 = iA & length;
                    Object[] objArr2 = this.f4742w;
                    Object obj2 = objArr2[i6];
                    if (obj2 == null) {
                        objArr2[i6] = obj;
                        this.f4743x += iHashCode;
                        q(obj);
                        return;
                    } else if (obj2.equals(obj)) {
                        return;
                    } else {
                        iA = i6 + 1;
                    }
                }
            }
        }
        this.f4742w = null;
        q(obj);
    }

    public final void u(Iterable iterable) {
        iterable.getClass();
        if (this.f4742w == null) {
            r(iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            t(it.next());
        }
    }

    public final go1 v() {
        go1 go1VarM;
        int i6 = this.f9902u;
        if (i6 == 0) {
            return jp1.B;
        }
        if (i6 == 1) {
            Object obj = this.f9901t[0];
            Objects.requireNonNull(obj);
            return new rp1(obj);
        }
        if (this.f4742w == null || go1.j(i6) != this.f4742w.length) {
            go1VarM = go1.m(this.f9901t, this.f9902u);
            this.f9902u = go1VarM.size();
        } else {
            int i7 = this.f9902u;
            Object[] objArrCopyOf = this.f9901t;
            int length = objArrCopyOf.length;
            if (i7 < (length >> 1) + (length >> 2)) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i7);
            }
            go1VarM = new jp1(this.f4743x, r8.length - 1, this.f9902u, objArrCopyOf, this.f4742w);
        }
        this.f9903v = true;
        this.f4742w = null;
        return go1VarM;
    }
}
