package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class jm1 extends up1 {

    /* renamed from: t, reason: collision with root package name */
    public Object f6106t;

    /* renamed from: u, reason: collision with root package name */
    public int f6107u;

    public jm1() {
        super(0);
        this.f6107u = 2;
    }

    public abstract Object b();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i6 = this.f6107u;
        if (i6 == 4) {
            throw new IllegalStateException();
        }
        int i7 = i6 - 1;
        if (i6 == 0) {
            throw null;
        }
        if (i7 == 0) {
            return true;
        }
        if (i7 != 2) {
            this.f6107u = 4;
            this.f6106t = b();
            if (this.f6107u != 3) {
                this.f6107u = 1;
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.up1, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f6107u = 2;
        Object obj = this.f6106t;
        this.f6106t = null;
        return obj;
    }
}
