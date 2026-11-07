package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.JsonReader;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.ak1;
import com.google.android.gms.internal.ads.bk1;
import com.google.android.gms.internal.ads.p60;
import com.google.android.gms.internal.ads.xt0;
import com.google.android.gms.internal.ads.y2;
import com.google.android.gms.internal.ads.zn;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzb {
    private final Context zza;
    private final zzd zzb;
    private final long zzc;
    private final ScheduledExecutorService zzd;
    private final PackageInfo zze;

    public zzb(Context context, long j6, PackageInfo packageInfo, zzd zzdVar, ScheduledExecutorService scheduledExecutorService) {
        this.zza = context;
        this.zzc = j6;
        this.zze = packageInfo;
        this.zzb = zzdVar;
        this.zzd = scheduledExecutorService;
    }

    public static String zzb(String str) {
        if (str == null) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        char[] charArray = str.toCharArray();
        for (int i6 = 0; i6 < charArray.length; i6++) {
            charArray[i6] = (char) (charArray[i6] ^ "f8L7o2HxjA4p9Z1nQw3E5r6T8yU2iCv0B9kM4sD1f7G3hJ5lK2z0X9cW8vQ6b5N3m1Rg8F2o0Lp7A1e9I4u3Y2t0H8x6W5v4Z1n9Q2w7E3r5T8y6U1i0C9vB8k7M4s3D1f2G0h9J5l8K4z7X3cW2v1Q0b9N8m6A5r4F3o2Lp1E0u9I8y7Y6t5H4x3W2v1Z0n9Q8w7E6r5T4y3U2i1C0v9B8k7M6s5D4f3G2h1J0l9K8z7X6cW5v4Q3b2N1m0Rg9F8o7Lp6A5e4I3u2Y1t0H8x7W6v5Z4n3Q2w1E0r9T8y7U6i5C4v3B2k1M0s9D8f7G6h5J4l3K2z1X0cW9v8Q7b6N5m4A3r2F1o0Lp9E8u7I6y5T4h3W2v1Z0n0Q9w8E7r6T5y4U3i2C1v0B9k8M7s6D5f4G3h2J1l0K9z8X7cW6v5Q4b3N2m1R0g9F8o7L6p5A4e3I2u1Y0t9H8x7W6v5Z4n3Q2w1E0r9T8y7U6i5C4v3B2k1M0s9D8f7G6h5J4l3K2z1X0cW9v8Q7b6N5m4A3r2F1o0Lp9E8u7I6y5T4h3W2".charAt(i6 % 555));
        }
        return new String(charArray);
    }

    private final boolean zze() {
        return this.zzb.zzf().size() >= ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.v7)).intValue();
    }

    private static final void zzf(Bundle bundle, xt0 xt0Var) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.w7)).booleanValue()) {
            androidx.camera.camera2.internal.compat.workaround.c.f(xt0Var.s, bundle);
        }
    }

    private static final void zzg(Bundle bundle, int i6) {
        bundle.putBoolean("sod_h", false);
        bundle.putInt("cmr", i6 - 1);
    }

    public final zzbk zza(p60 p60Var, final zzau zzauVar, Bundle bundle) throws JSONException {
        long j6;
        y2 y2VarA;
        zzf(bundle, xt0.W);
        if (com.google.android.gms.ads.internal.zzv.zzp().d().zzN()) {
            this.zzb.zzg();
            zzg(bundle, 7);
            return null;
        }
        if (this.zze == null) {
            this.zzb.zzg();
            zzg(bundle, 10);
            return null;
        }
        zzd zzdVar = this.zzb;
        Context context = this.zza;
        String strZze = zzdVar.zze();
        int iZzb = zzdVar.zzb();
        String strZzd = zzdVar.zzd();
        int iZza = zzdVar.zza();
        if (TextUtils.equals(context.getApplicationInfo().packageName, strZze) && iZzb == this.zze.versionCode && TextUtils.equals(Build.MODEL, strZzd) && iZza == Build.VERSION.SDK_INT) {
            for (Map.Entry entry : this.zzb.zzf().entrySet()) {
                try {
                    j6 = new JSONObject((String) entry.getValue()).getLong("ts_ms");
                } catch (IOException | JSONException unused) {
                }
                if (com.google.android.gms.ads.internal.zzv.zzC().a() - j6 <= ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.u7)).longValue()) {
                    ak1 ak1VarF = ak1.f(this.zza);
                    long jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.f11456p3)).longValue();
                    boolean zZzN = com.google.android.gms.ads.internal.zzv.zzp().d().zzN();
                    ak1VarF.getClass();
                    synchronized (ak1.class) {
                        y2VarA = ak1VarF.a(null, null, jLongValue, zZzN);
                    }
                    y2 y2VarF = bk1.g(this.zza).f(com.google.android.gms.ads.internal.zzv.zzp().d().zzN(), ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.f11463q3)).longValue());
                    long j7 = y2VarA.f10780a;
                    if (j7 == -1 || j7 <= j6) {
                        long j8 = y2VarF.f10780a;
                        if (j8 == -1 || j8 <= j6) {
                        }
                    }
                }
                this.zzb.zzc((String) entry.getKey());
            }
        } else {
            this.zzb.zzg();
            this.zzb.zzi(this.zza.getApplicationInfo().packageName, this.zze.versionCode, Build.MODEL, Build.VERSION.SDK_INT);
        }
        zzf(bundle, xt0.X);
        if (com.google.android.gms.ads.internal.zzv.zzC().a() - this.zzc > ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.r7)).longValue()) {
            zzg(bundle, 2);
            return null;
        }
        zzf(bundle, xt0.Y);
        String str = p60Var.s;
        com.google.android.gms.ads.internal.client.zzm zzmVar = p60Var.f7958v;
        final String strZzg = com.google.android.gms.ads.internal.util.client.zzf.zzg(str + p60Var.f7956t + zzmVar.zzn.toString() + zzmVar.zzc.toString() + zzmVar.zzi + zzmVar.zzp + String.valueOf(zzmVar.zzo));
        if (TextUtils.isEmpty(strZzg)) {
            zzg(bundle, 3);
            return null;
        }
        zzf(bundle, xt0.Z);
        zzf(bundle, xt0.f10691a0);
        String strZzc = this.zzb.zzc(strZzg);
        zzf(bundle, xt0.f10692b0);
        if (!zze()) {
            final p60 p60Var2 = new p60(p60Var.s, p60Var.f7956t, p60Var.f7957u, p60Var.f7958v, 2, strZzg);
            this.zzd.schedule(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zza
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzc(strZzg, zzauVar, p60Var2);
                }
            }, ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.t7)).longValue(), TimeUnit.MILLISECONDS);
        }
        if (TextUtils.isEmpty(strZzc)) {
            zzg(bundle, 4);
            return null;
        }
        zzf(bundle, xt0.f10693c0);
        try {
            JSONObject jSONObject = new JSONObject(strZzc);
            String string = jSONObject.getString("sr");
            if (TextUtils.isEmpty(string)) {
                zzg(bundle, 8);
            } else {
                String string2 = jSONObject.getString("rs");
                if (!TextUtils.isEmpty(string2)) {
                    String strZzb = zzb(new String(Base64.decode(string2, 10), StandardCharsets.UTF_8));
                    zzf(bundle, xt0.f10694d0);
                    try {
                        zzbk zzbkVar = new zzbk(new JsonReader(new StringReader(string)), null);
                        zzbkVar.zzc = strZzb;
                        zzbkVar.zze = bundle;
                        bundle.putBoolean("sod_h", true);
                        return zzbkVar;
                    } catch (IOException e6) {
                        zzg(bundle, 6);
                        com.google.android.gms.ads.internal.zzv.zzp().h("DiskCachingManager.getSignalResponse", e6);
                        return null;
                    }
                }
                zzg(bundle, 9);
            }
            return null;
        } catch (JSONException e7) {
            zzg(bundle, 5);
            com.google.android.gms.ads.internal.zzv.zzp().h("DiskCachingManager.getSignalResponse", e7);
            return null;
        }
    }

    public final void zzc(String str, zzau zzauVar, p60 p60Var) {
        if (this.zzb.zzj(str) || zze()) {
            return;
        }
        zzauVar.zzf(new k3.b(this.zza), p60Var, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd(String str, zzbk zzbkVar) throws JSONException {
        String string;
        String str2;
        if (TextUtils.isEmpty(str) || zze()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("params", zzbkVar.zza);
            jSONObject2.put("signal_dictionary", com.google.android.gms.ads.internal.client.zzbc.zzb().zzi(zzbkVar.zzf));
            jSONObject.put("sr", jSONObject2);
            str2 = zzbkVar.zzc;
        } catch (JSONException e6) {
            com.google.android.gms.ads.internal.zzv.zzp().h("DiskCachingManager.createStringToWrite", e6);
        }
        if (TextUtils.isEmpty(str2)) {
            string = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            if (TextUtils.isEmpty(string)) {
                this.zzb.zzh(str, string);
                return;
            }
            return;
        }
        jSONObject.put("rs", Base64.encodeToString(zzb(str2).getBytes(StandardCharsets.UTF_8), 10));
        jSONObject.put("ts_ms", com.google.android.gms.ads.internal.zzv.zzC().a());
        string = jSONObject.toString();
        if (TextUtils.isEmpty(string)) {
        }
    }
}
