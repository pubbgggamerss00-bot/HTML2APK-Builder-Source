package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ps0 implements mu {
    public final fl0 s;

    /* renamed from: t, reason: collision with root package name */
    public final l40 f8139t;

    /* renamed from: u, reason: collision with root package name */
    public final String f8140u;

    /* renamed from: v, reason: collision with root package name */
    public final String f8141v;

    public ps0(fl0 fl0Var, tb1 tb1Var) {
        this.s = fl0Var;
        this.f8139t = tb1Var.f9192l;
        this.f8140u = tb1Var.f9188j;
        this.f8141v = tb1Var.f9190k;
    }

    @Override // com.google.android.gms.internal.ads.mu
    public final void Q(l40 l40Var) {
        int i6;
        String str;
        l40 l40Var2 = this.f8139t;
        if (l40Var2 != null) {
            l40Var = l40Var2;
        }
        if (l40Var != null) {
            str = l40Var.s;
            i6 = l40Var.f6572t;
        } else {
            i6 = 1;
            str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        y30 y30Var = new y30(str, i6);
        fl0 fl0Var = this.s;
        fl0Var.getClass();
        fl0Var.o0(new androidx.camera.view.b(y30Var, this.f8140u, this.f8141v, 3, false));
    }

    @Override // com.google.android.gms.internal.ads.mu
    public final void zzb() {
        this.s.o0(new f0(17));
    }

    @Override // com.google.android.gms.internal.ads.mu
    public final void zzc() {
        this.s.o0(new fo(13));
    }
}
