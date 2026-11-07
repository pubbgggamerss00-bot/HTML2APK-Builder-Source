package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ep1 extends bo1 {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ fp1 f4367u;

    public ep1(fp1 fp1Var) {
        this.f4367u = fp1Var;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i6) {
        fp1 fp1Var = this.f4367u;
        sl1.a(i6, fp1Var.f4766x);
        Object[] objArr = fp1Var.f4765w;
        int i7 = i6 + i6;
        Object obj = objArr[i7];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i7 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.wn1
    public final boolean h() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4367u.f4766x;
    }
}
