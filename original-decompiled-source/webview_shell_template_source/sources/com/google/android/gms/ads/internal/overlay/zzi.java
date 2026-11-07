package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.internal.ads.xa0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzi {
    public final int zza;
    public final ViewGroup.LayoutParams zzb;
    public final ViewGroup zzc;
    public final Context zzd;

    public zzi(xa0 xa0Var) throws b {
        this.zzb = xa0Var.getLayoutParams();
        ViewParent parent = xa0Var.getParent();
        this.zzd = xa0Var.zzE();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new b("Could not get the parent of the WebView for an overlay.");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        this.zzc = viewGroup;
        this.zza = viewGroup.indexOfChild(xa0Var.zzF());
        viewGroup.removeView(xa0Var.zzF());
        xa0Var.Y(true);
    }
}
