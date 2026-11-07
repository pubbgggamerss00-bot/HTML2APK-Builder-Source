package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.zzv;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class cv0 implements zr1 {
    public final /* synthetic */ fv0 s;

    public cv0(fv0 fv0Var) {
        this.s = fv0Var;
    }

    @Override // com.google.android.gms.internal.ads.zr1
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo2a(Object obj) {
        String str = (String) obj;
        synchronized (this) {
            fv0 fv0Var = this.s;
            fv0Var.f4789c = true;
            fv0Var.d("com.google.android.gms.ads.MobileAds", (int) (zzv.zzC().b() - this.s.f4790d), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, true);
            this.s.f4794i.execute(new ow(4, this, str));
        }
    }

    @Override // com.google.android.gms.internal.ads.zr1
    public final void j(Throwable th) {
        synchronized (this) {
            fv0 fv0Var = this.s;
            fv0Var.f4789c = true;
            fv0Var.d("com.google.android.gms.ads.MobileAds", (int) (zzv.zzC().b() - this.s.f4790d), "Internal Error.", false);
            this.s.f4791e.b(new Exception());
        }
    }
}
