package com.google.android.gms.internal.consent_sdk;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class i8 implements Iterator {
    public int s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f11779t;

    /* renamed from: u, reason: collision with root package name */
    public Iterator f11780u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ k8 f11781v;

    public /* synthetic */ i8(k8 k8Var) {
        Objects.requireNonNull(k8Var);
        this.f11781v = k8Var;
        this.s = -1;
    }

    public final Iterator a() {
        if (this.f11780u == null) {
            this.f11780u = this.f11781v.f11803u.entrySet().iterator();
        }
        return this.f11780u;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i6 = this.s + 1;
        k8 k8Var = this.f11781v;
        if (i6 >= k8Var.f11802t) {
            return !k8Var.f11803u.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.f11779t = true;
        int i6 = this.s + 1;
        this.s = i6;
        k8 k8Var = this.f11781v;
        return i6 < k8Var.f11802t ? (h8) k8Var.s[i6] : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f11779t) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f11779t = false;
        int i6 = k8.f11801y;
        k8 k8Var = this.f11781v;
        k8Var.h();
        int i7 = this.s;
        if (i7 >= k8Var.f11802t) {
            a().remove();
        } else {
            this.s = i7 - 1;
            k8Var.f(i7);
        }
    }
}
