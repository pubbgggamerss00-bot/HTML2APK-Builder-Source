package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ho1 extends jm1 {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Iterator f5448v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ tl1 f5449w;

    public ho1(Iterator it, tl1 tl1Var) {
        this.f5448v = it;
        this.f5449w = tl1Var;
    }

    @Override // com.google.android.gms.internal.ads.jm1
    public final Object b() {
        Object next;
        do {
            Iterator it = this.f5448v;
            if (!it.hasNext()) {
                this.f6107u = 3;
                return null;
            }
            next = it.next();
        } while (!this.f5449w.zza(next));
        return next;
    }
}
