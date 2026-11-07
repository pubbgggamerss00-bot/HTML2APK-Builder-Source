package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.zzac;
import com.google.android.gms.ads.internal.overlay.zzr;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class yr0 implements zza, ft, zzr, ht, zzac {
    public zza s;

    /* renamed from: t, reason: collision with root package name */
    public ft f11064t;

    /* renamed from: u, reason: collision with root package name */
    public zzr f11065u;

    /* renamed from: v, reason: collision with root package name */
    public ht f11066v;

    /* renamed from: w, reason: collision with root package name */
    public zzac f11067w;

    @Override // com.google.android.gms.internal.ads.ht
    public final synchronized void a(String str, String str2) {
        ht htVar = this.f11066v;
        if (htVar != null) {
            htVar.a(str, str2);
        }
    }

    @Override // com.google.android.gms.internal.ads.ft
    public final synchronized void n(String str, Bundle bundle) {
        ft ftVar = this.f11064t;
        if (ftVar != null) {
            ftVar.n(str, bundle);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        zza zzaVar = this.s;
        if (zzaVar != null) {
            zzaVar.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdE() {
        zzr zzrVar = this.f11065u;
        if (zzrVar != null) {
            zzrVar.zzdE();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdi() {
        zzr zzrVar = this.f11065u;
        if (zzrVar != null) {
            zzrVar.zzdi();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdo() {
        zzr zzrVar = this.f11065u;
        if (zzrVar != null) {
            zzrVar.zzdo();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdp() {
        zzr zzrVar = this.f11065u;
        if (zzrVar != null) {
            zzrVar.zzdp();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdr() {
        zzr zzrVar = this.f11065u;
        if (zzrVar != null) {
            zzrVar.zzdr();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzds(int i6) {
        zzr zzrVar = this.f11065u;
        if (zzrVar != null) {
            zzrVar.zzds(i6);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzac
    public final synchronized void zzg() {
        zzac zzacVar = this.f11067w;
        if (zzacVar != null) {
            zzacVar.zzg();
        }
    }
}
