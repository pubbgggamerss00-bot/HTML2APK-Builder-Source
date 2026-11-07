package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class cw0 extends AdListener {
    public final /* synthetic */ String s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ dw0 f3675t;

    public cw0(dw0 dw0Var, String str) {
        this.s = str;
        this.f3675t = dw0Var;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f3675t.h2(dw0.g2(loadAdError), this.s);
    }
}
