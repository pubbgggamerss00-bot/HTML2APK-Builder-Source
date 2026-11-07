package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class fr0 implements zr1 {
    public final /* synthetic */ o70 s;

    public fr0(o70 o70Var) {
        this.s = o70Var;
    }

    @Override // com.google.android.gms.internal.ads.zr1
    /* renamed from: a */
    public final void mo2a(Object obj) {
        xa0 xa0Var = (xa0) obj;
        o70 o70Var = this.s;
        if (xa0Var == null) {
            o70Var.b(new p21(1, "Missing webview from video view future."));
        } else {
            xa0Var.Z("/video", new e90(new er0(0, o70Var)));
            xa0Var.zzaa();
        }
    }

    @Override // com.google.android.gms.internal.ads.zr1
    public final void j(Throwable th) {
        zzo.zzg("Failed to load media data due to video view load failure.");
        this.s.b(th);
    }
}
