package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzdl;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class vv0 implements zzr, zb0 {
    public boolean A;
    public final Context s;

    /* renamed from: t, reason: collision with root package name */
    public final VersionInfoParcel f9944t;

    /* renamed from: u, reason: collision with root package name */
    public sv0 f9945u;

    /* renamed from: v, reason: collision with root package name */
    public xa0 f9946v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f9947w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f9948x;

    /* renamed from: y, reason: collision with root package name */
    public long f9949y;

    /* renamed from: z, reason: collision with root package name */
    public zzdl f9950z;

    public vv0(Context context, VersionInfoParcel versionInfoParcel) {
        this.s = context;
        this.f9944t = versionInfoParcel;
    }

    public final synchronized void a(zzdl zzdlVar, pu puVar, zt ztVar, zt ztVar2) {
        if (c(zzdlVar)) {
            try {
                zzv.zzA();
                xa0 xa0VarA = ib0.a(this.s, new cc0(0, 0, 0), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, false, false, null, null, this.f9944t, null, null, new kk(), null, null, null, null);
                this.f9946v = xa0VarA;
                eb0 eb0VarZzN = xa0VarA.zzN();
                if (eb0VarZzN == null) {
                    zzo.zzj("Failed to obtain a web view for the ad inspector");
                    try {
                        zzv.zzp().h("InspectorUi.openInspector 2", new NullPointerException("Failed to obtain a web view for the ad inspector"));
                        zzdlVar.zze(tc1.d(17, "Failed to obtain a web view for the ad inspector", null));
                        return;
                    } catch (RemoteException e6) {
                        zzv.zzp().h("InspectorUi.openInspector 3", e6);
                        return;
                    }
                }
                this.f9950z = zzdlVar;
                eb0VarZzN.j(null, null, null, null, null, false, null, null, null, null, null, null, null, puVar, null, new ou(this.s), ztVar, ztVar2, null);
                eb0VarZzN.f4196y = this;
                this.f9946v.loadUrl((String) zzbe.zzc().a(zn.O8));
                zzv.zzj();
                zzn.zza(this.s, new AdOverlayInfoParcel(this, this.f9946v, 1, this.f9944t), true, null);
                this.f9949y = zzv.zzC().a();
            } catch (hb0 e7) {
                zzo.zzk("Failed to obtain a web view for the ad inspector", e7);
                try {
                    zzv.zzp().h("InspectorUi.openInspector 0", e7);
                    zzdlVar.zze(tc1.d(17, "Failed to obtain a web view for the ad inspector", null));
                } catch (RemoteException e8) {
                    zzv.zzp().h("InspectorUi.openInspector 1", e8);
                }
            }
        }
    }

    public final synchronized void b(String str) {
        if (this.f9947w && this.f9948x) {
            i70.f5591f.execute(new bb(this, str, 8, false));
        }
    }

    public final synchronized boolean c(zzdl zzdlVar) {
        if (!((Boolean) zzbe.zzc().a(zn.N8)).booleanValue()) {
            zzo.zzj("Ad inspector had an internal error.");
            try {
                zzdlVar.zze(tc1.d(16, null, null));
            } catch (RemoteException unused) {
            }
            return false;
        }
        if (this.f9945u == null) {
            zzo.zzj("Ad inspector had an internal error.");
            try {
                zzv.zzp().h("InspectorUi.shouldOpenUi", new NullPointerException("InspectorManager null"));
                zzdlVar.zze(tc1.d(16, null, null));
            } catch (RemoteException unused2) {
            }
            return false;
        }
        if (!this.f9947w && !this.f9948x) {
            if (zzv.zzC().a() >= this.f9949y + ((Integer) zzbe.zzc().a(zn.Q8)).intValue()) {
                return true;
            }
        }
        zzo.zzj("Ad inspector cannot be opened because it is already open.");
        try {
            zzdlVar.zze(tc1.d(19, null, null));
        } catch (RemoteException unused3) {
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zb0
    public final synchronized void zza(boolean z6, int i6, String str, String str2) {
        if (z6) {
            zze.zza("Ad inspector loaded.");
            this.f9947w = true;
            b(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            return;
        }
        zzo.zzj("Ad inspector failed to load.");
        try {
            zzv.zzp().h("InspectorUi.onAdWebViewFinishedLoading 0", new Exception("Failed to load UI. Error code: " + i6 + ", Description: " + str + ", Failing URL: " + str2));
            zzdl zzdlVar = this.f9950z;
            if (zzdlVar != null) {
                zzdlVar.zze(tc1.d(17, null, null));
            }
        } catch (RemoteException e6) {
            zzv.zzp().h("InspectorUi.onAdWebViewFinishedLoading 1", e6);
        }
        this.A = true;
        this.f9946v.destroy();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdp() {
        this.f9948x = true;
        b(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzds(int i6) {
        this.f9946v.destroy();
        if (!this.A) {
            zze.zza("Inspector closed.");
            zzdl zzdlVar = this.f9950z;
            if (zzdlVar != null) {
                try {
                    zzdlVar.zze(null);
                } catch (RemoteException unused) {
                }
            }
        }
        this.f9948x = false;
        this.f9947w = false;
        this.f9949y = 0L;
        this.A = false;
        this.f9950z = null;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdE() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdi() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdr() {
    }
}
