package com.google.android.gms.ads.internal.overlay;

import android.view.View;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a implements View.OnClickListener {
    public final /* synthetic */ zzm s;

    public a(zzm zzmVar) {
        this.s = zzmVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        zzm zzmVar = this.s;
        zzmVar.zzn = 2;
        zzmVar.zzb.finish();
    }
}
