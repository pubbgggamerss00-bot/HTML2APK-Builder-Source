package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Base64;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.ln;
import com.google.android.gms.internal.ads.zn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzf {
    private final Context zza;
    private final ApplicationInfo zzb;
    private final List zzc;
    private final VersionInfoParcel zzd;
    private final JSONObject zze = new JSONObject();
    private final AtomicBoolean zzf = new AtomicBoolean(false);

    public zzf(Context context, ln lnVar, List list, VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        this.zzb = context.getApplicationInfo();
        this.zzc = list;
        this.zzd = versionInfoParcel;
    }

    public final JSONObject zza() {
        if (!this.zzf.get()) {
            zzb();
        }
        return this.zze;
    }

    public final void zzb() {
        if (this.zzf.getAndSet(true)) {
            return;
        }
        PackageInfo packageInfoB = null;
        try {
            if (this.zzb != null) {
                packageInfoB = j3.d.a(this.zza).b(0, this.zzb.packageName);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (packageInfoB != null) {
            try {
                this.zze.put("vc", packageInfoB.versionCode);
                this.zze.put("vnm", packageInfoB.versionName);
            } catch (JSONException e6) {
                com.google.android.gms.ads.internal.zzv.zzp().h("PawAppSignalGenerator.initialize", e6);
                return;
            }
        }
        ApplicationInfo applicationInfo = this.zzb;
        if (applicationInfo != null) {
            this.zze.put("pn", applicationInfo.packageName);
        }
        JSONObject jSONObject = this.zze;
        List list = this.zzc;
        ArrayList arrayList = new ArrayList();
        for (String str : ((String) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.G9)).split(",", -1)) {
            if (list.contains(str)) {
                arrayList.add(str);
            }
        }
        jSONObject.put("eid", arrayList);
        this.zze.put("js", this.zzd.afmaVersion);
        Iterator<String> itKeys = this.zze.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = this.zze.get(next);
            if (obj != null) {
                this.zze.put(next, Base64.encodeToString(obj.toString().getBytes(), 2));
            }
        }
    }
}
