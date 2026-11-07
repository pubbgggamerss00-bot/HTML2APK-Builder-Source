package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class jo1 extends up1 {

    /* renamed from: t, reason: collision with root package name */
    public final Object f6114t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f6115u;

    public jo1(Object obj) {
        super(0);
        this.f6114t = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f6115u;
    }

    @Override // com.google.android.gms.internal.ads.up1, java.util.Iterator
    public final Object next() {
        if (this.f6115u) {
            throw new NoSuchElementException();
        }
        this.f6115u = true;
        return this.f6114t;
    }
}
