package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class yi0 implements o21 {

    /* renamed from: a, reason: collision with root package name */
    public final List f10996a;

    public yi0(List list) {
        this.f10996a = list;
    }

    @Override // com.google.android.gms.internal.ads.o21
    public final void zzr() {
        Iterator it = this.f10996a.iterator();
        while (it.hasNext()) {
            bs1.t((c5.a) it.next(), new me0(19), ur1.s);
        }
    }

    public yi0(ti0 ti0Var) {
        this.f10996a = Collections.singletonList(bs1.m(ti0Var));
    }
}
