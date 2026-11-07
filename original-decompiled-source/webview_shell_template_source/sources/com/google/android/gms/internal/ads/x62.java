package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class x62 extends up1 {

    /* renamed from: t, reason: collision with root package name */
    public final z62 f10394t;

    /* renamed from: u, reason: collision with root package name */
    public up1 f10395u;

    public x62(a72 a72Var) {
        super(1);
        this.f10394t = new z62(a72Var);
        this.f10395u = b();
    }

    @Override // com.google.android.gms.internal.ads.up1
    public final byte a() {
        up1 up1Var = this.f10395u;
        if (up1Var == null) {
            throw new NoSuchElementException();
        }
        byte bA = up1Var.a();
        if (!this.f10395u.hasNext()) {
            this.f10395u = b();
        }
        return bA;
    }

    public final b42 b() {
        z62 z62Var = this.f10394t;
        if (z62Var.hasNext()) {
            return new b42(z62Var.next());
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f10395u != null;
    }
}
