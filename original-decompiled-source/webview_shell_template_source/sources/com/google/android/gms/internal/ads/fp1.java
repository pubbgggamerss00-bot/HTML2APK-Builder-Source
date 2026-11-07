package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class fp1 extends go1 {

    /* renamed from: v, reason: collision with root package name */
    public final transient ip1 f4764v;

    /* renamed from: w, reason: collision with root package name */
    public final transient Object[] f4765w;

    /* renamed from: x, reason: collision with root package name */
    public final transient int f4766x;

    public fp1(ip1 ip1Var, Object[] objArr, int i6) {
        this.f4764v = ip1Var;
        this.f4765w = objArr;
        this.f4766x = i6;
    }

    @Override // com.google.android.gms.internal.ads.wn1
    public final int c(Object[] objArr, int i6) {
        return f().c(objArr, i6);
    }

    @Override // com.google.android.gms.internal.ads.wn1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        return value != null && value.equals(this.f4764v.get(key));
    }

    @Override // com.google.android.gms.internal.ads.wn1
    /* renamed from: g */
    public final up1 iterator() {
        return f().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.wn1
    public final boolean h() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.wn1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return f().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.go1
    public final bo1 k() {
        return new ep1(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f4766x;
    }
}
