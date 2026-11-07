package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.internal.ads.al1;
import com.google.android.gms.internal.ads.cl1;
import com.google.android.gms.internal.ads.dh0;
import com.google.android.gms.internal.ads.dl1;
import com.google.android.gms.internal.ads.el1;
import com.google.android.gms.internal.ads.hl1;
import com.google.android.gms.internal.ads.i70;
import com.google.android.gms.internal.ads.jl1;
import com.google.android.gms.internal.ads.kk1;
import com.google.android.gms.internal.ads.o30;
import com.google.android.gms.internal.ads.ok1;
import com.google.android.gms.internal.ads.qk1;
import com.google.android.gms.internal.ads.uk1;
import com.google.android.gms.internal.ads.x70;
import com.google.android.gms.internal.ads.xa0;
import com.google.android.gms.internal.ads.zk1;
import com.google.android.gms.internal.ads.zn;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzz {
    private dl1 zzf;
    private xa0 zzc = null;
    private boolean zze = false;
    private String zza = null;
    private qk1 zzd = null;
    private String zzb = null;

    private final el1 zzl() {
        String str;
        String str2 = null;
        if (!((Boolean) zzbe.zzc().a(zn.qb)).booleanValue() || TextUtils.isEmpty(this.zzb)) {
            String str3 = this.zza;
            if (str3 != null) {
                str2 = str3;
                str = null;
            } else {
                zzf("Missing session token and/or appId", "onLMDupdate");
                str = null;
            }
        } else {
            str = this.zzb;
        }
        return new ok1(str2, str);
    }

    private final void zzm() {
        if (this.zzf == null) {
            this.zzf = new i(0, this);
        }
    }

    public final synchronized void zza(xa0 xa0Var, Context context) {
        this.zzc = xa0Var;
        if (!zzk(context)) {
            zzf("Unable to bind", "on_play_store_bind");
            return;
        }
        HashMap map = new HashMap();
        map.put("action", "fetch_completed");
        zze("on_play_store_bind", map);
    }

    public final void zzb() {
        qk1 qk1Var;
        if (!this.zze || (qk1Var = this.zzd) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
        } else {
            ((zk1) ((dh0) qk1Var).f3937t).a(zzl(), this.zzf, 2);
            zzd("onLMDOverlayCollapse");
        }
    }

    public final void zzc() {
        qk1 qk1Var;
        String str;
        if (!this.zze || (qk1Var = this.zzd) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
            return;
        }
        String str2 = null;
        if (!((Boolean) zzbe.zzc().a(zn.qb)).booleanValue() || TextUtils.isEmpty(this.zzb)) {
            String str3 = this.zza;
            if (str3 != null) {
                str2 = str3;
                str = null;
            } else {
                zzf("Missing session token and/or appId", "onLMDupdate");
                str = null;
            }
        } else {
            str = this.zzb;
        }
        kk1 kk1Var = new kk1(str2, str);
        dl1 dl1Var = this.zzf;
        zk1 zk1Var = (zk1) ((dh0) qk1Var).f3937t;
        hl1 hl1Var = zk1Var.f11328a;
        if (hl1Var == null) {
            zk1.f11326c.a("error: %s", "Play Store not found.");
        } else if (zk1.c(dl1Var, "Failed to apply OverlayDisplayDismissRequest: missing appId and sessionToken.", Arrays.asList(kk1Var.f6443a, kk1Var.f6444b))) {
            hl1Var.a(new o30(4, hl1Var, new uk1(zk1Var, kk1Var, dl1Var, 0)));
        }
    }

    public final void zzd(String str) {
        zze(str, new HashMap());
    }

    public final void zze(final String str, final Map map) {
        i70.f5591f.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzx
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzh(str, map);
            }
        });
    }

    public final void zzf(String str, String str2) {
        com.google.android.gms.ads.internal.util.zze.zza(str);
        if (this.zzc != null) {
            HashMap map = new HashMap();
            map.put("message", str);
            map.put("action", str2);
            zze("onError", map);
        }
    }

    public final void zzg() {
        qk1 qk1Var;
        if (!this.zze || (qk1Var = this.zzd) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
        } else {
            ((zk1) ((dh0) qk1Var).f3937t).a(zzl(), this.zzf, 1);
            zzd("onLMDOverlayExpand");
        }
    }

    public final /* synthetic */ void zzh(String str, Map map) {
        xa0 xa0Var = this.zzc;
        if (xa0Var != null) {
            xa0Var.G(str, map);
        }
    }

    public final void zzi(cl1 cl1Var) {
        if (!TextUtils.isEmpty(cl1Var.b())) {
            if (!((Boolean) zzbe.zzc().a(zn.qb)).booleanValue()) {
                this.zza = cl1Var.b();
            }
        }
        switch (cl1Var.a()) {
            case 8152:
                zzd("onLMDOverlayOpened");
                break;
            case 8153:
                zzd("onLMDOverlayClicked");
                break;
            case 8155:
                zzd("onLMDOverlayClose");
                break;
            case 8157:
                this.zza = null;
                this.zzb = null;
                this.zze = false;
                break;
            case 8160:
            case 8161:
            case 8162:
                HashMap map = new HashMap();
                map.put("error", String.valueOf(cl1Var.a()));
                zze("onLMDOverlayFailedToOpen", map);
                break;
        }
    }

    public final void zzj(xa0 xa0Var, al1 al1Var) {
        if (xa0Var == null) {
            zzf("adWebview missing", "onLMDShow");
            return;
        }
        this.zzc = xa0Var;
        if (!this.zze && !zzk(xa0Var.getContext())) {
            zzf("LMDOverlay not bound", "on_play_store_bind");
            return;
        }
        if (((Boolean) zzbe.zzc().a(zn.qb)).booleanValue()) {
            this.zzb = al1Var.f();
        }
        zzm();
        qk1 qk1Var = this.zzd;
        if (qk1Var != null) {
            dl1 dl1Var = this.zzf;
            zk1 zk1Var = (zk1) ((dh0) qk1Var).f3937t;
            hl1 hl1Var = zk1Var.f11328a;
            if (hl1Var == null) {
                zk1.f11326c.a("error: %s", "Play Store not found.");
            } else if (zk1.c(dl1Var, "Failed to apply OverlayDisplayShowRequest: missing appId and sessionToken.", Arrays.asList(null, al1Var.f()))) {
                hl1Var.a(new o30(4, hl1Var, new x70(zk1Var, al1Var, dl1Var, 1)));
            }
        }
    }

    public final synchronized boolean zzk(Context context) {
        if (!jl1.a(context)) {
            return false;
        }
        try {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            this.zzd = new dh0(21, new zk1(context));
        } catch (NullPointerException e6) {
            com.google.android.gms.ads.internal.util.zze.zza("Error connecting LMD Overlay service");
            com.google.android.gms.ads.internal.zzv.zzp().h("LastMileDeliveryOverlay.bindLastMileDeliveryService", e6);
        }
        if (this.zzd == null) {
            this.zze = false;
            return false;
        }
        zzm();
        this.zze = true;
        return true;
    }
}
