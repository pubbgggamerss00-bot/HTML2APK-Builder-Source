package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class mp1 extends jm1 {

    /* renamed from: v, reason: collision with root package name */
    public final Iterator f7203v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Set f7204w;

    public mp1(Set set, Set set2) {
        this.f7204w = set2;
        this.f7203v = set.iterator();
    }

    @Override // com.google.android.gms.internal.ads.jm1
    public final Object b() {
        Object next;
        do {
            Iterator it = this.f7203v;
            if (!it.hasNext()) {
                this.f6107u = 3;
                return null;
            }
            next = it.next();
        } while (!this.f7204w.contains(next));
        return next;
    }
}
