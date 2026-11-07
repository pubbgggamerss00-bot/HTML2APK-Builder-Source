package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzr;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class db0 implements zzr {
    public final xa0 s;

    /* renamed from: t, reason: collision with root package name */
    public final zzr f3828t;

    public db0(xa0 xa0Var, zzr zzrVar) {
        this.s = xa0Var;
        this.f3828t = zzrVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
        zzr zzrVar = this.f3828t;
        if (zzrVar != null) {
            zzrVar.zzdo();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
        zzr zzrVar = this.f3828t;
        if (zzrVar != null) {
            zzrVar.zzdp();
        }
        this.s.zzaa();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdr() {
        zzr zzrVar = this.f3828t;
        if (zzrVar != null) {
            zzrVar.zzdr();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzds(int i6) {
        zzr zzrVar = this.f3828t;
        if (zzrVar != null) {
            zzrVar.zzds(i6);
        }
        this.s.zzY();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdE() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdi() {
    }
}
