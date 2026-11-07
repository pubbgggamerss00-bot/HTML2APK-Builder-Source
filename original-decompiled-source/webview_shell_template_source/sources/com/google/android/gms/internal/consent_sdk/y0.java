package com.google.android.gms.internal.consent_sdk;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class y0 extends d1 {
    public final Object s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f11943t;

    public y0(Object obj) {
        this.s = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f11943t;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f11943t) {
            throw new NoSuchElementException();
        }
        this.f11943t = true;
        return this.s;
    }
}
