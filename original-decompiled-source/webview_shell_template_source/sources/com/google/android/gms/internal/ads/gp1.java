package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class gp1 extends go1 {

    /* renamed from: v, reason: collision with root package name */
    public final transient ip1 f5118v;

    /* renamed from: w, reason: collision with root package name */
    public final transient hp1 f5119w;

    public gp1(ip1 ip1Var, hp1 hp1Var) {
        this.f5118v = ip1Var;
        this.f5119w = hp1Var;
    }

    @Override // com.google.android.gms.internal.ads.wn1
    public final int c(Object[] objArr, int i6) {
        return this.f5119w.c(objArr, i6);
    }

    @Override // com.google.android.gms.internal.ads.wn1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f5118v.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.ads.go1, com.google.android.gms.internal.ads.wn1
    public final bo1 f() {
        return this.f5119w;
    }

    @Override // com.google.android.gms.internal.ads.wn1
    /* renamed from: g */
    public final up1 iterator() {
        return this.f5119w.listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.wn1
    public final boolean h() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.wn1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return this.f5119w.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f5118v.f5826x;
    }
}
