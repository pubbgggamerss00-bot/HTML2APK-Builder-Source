package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class k51 implements q81 {

    /* renamed from: a, reason: collision with root package name */
    public final Set f6254a;

    public k51(Set set) {
        this.f6254a = set;
    }

    @Override // com.google.android.gms.internal.ads.q81
    public final int zza() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.q81
    public final c5.a zzb() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f6254a.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return bs1.m(new j51(0, arrayList));
    }
}
