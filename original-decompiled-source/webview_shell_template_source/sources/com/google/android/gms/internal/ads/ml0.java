package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Set;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ml0 extends pm0 implements ft {

    /* renamed from: t, reason: collision with root package name */
    public final Bundle f7187t;

    public ml0(Set set) {
        super(set);
        this.f7187t = new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.ft
    public final synchronized void n(String str, Bundle bundle) {
        this.f7187t.putAll(bundle);
        o0(new f0(18));
    }
}
