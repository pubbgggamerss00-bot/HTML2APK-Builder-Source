package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b42 extends up1 {

    /* renamed from: t, reason: collision with root package name */
    public int f2911t;

    /* renamed from: u, reason: collision with root package name */
    public final int f2912u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ g42 f2913v;

    public b42(g42 g42Var) {
        super(1);
        this.f2913v = g42Var;
        this.f2911t = 0;
        this.f2912u = g42Var.g();
    }

    @Override // com.google.android.gms.internal.ads.up1
    public final byte a() {
        int i6 = this.f2911t;
        if (i6 >= this.f2912u) {
            throw new NoSuchElementException();
        }
        this.f2911t = i6 + 1;
        return this.f2913v.e(i6);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2911t < this.f2912u;
    }
}
