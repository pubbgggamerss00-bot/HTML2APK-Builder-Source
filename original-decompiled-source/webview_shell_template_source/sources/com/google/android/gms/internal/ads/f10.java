package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeCustomFormatAd;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class f10 extends as {
    public final /* synthetic */ h10 s;

    @Override // com.google.android.gms.internal.ads.cs
    public final void D0(tr trVar, String str) {
        i10 i10Var;
        h10 h10Var = this.s;
        NativeCustomFormatAd.OnCustomClickListener onCustomClickListener = h10Var.f5212b;
        if (onCustomClickListener == null) {
            return;
        }
        synchronized (h10Var) {
            i10Var = h10Var.f5213c;
            if (i10Var == null) {
                i10Var = new i10(trVar);
                h10Var.f5213c = i10Var;
            }
        }
        onCustomClickListener.onCustomClick(i10Var, str);
    }
}
