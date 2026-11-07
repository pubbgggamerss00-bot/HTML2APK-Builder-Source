package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.rv0;
import com.google.android.gms.internal.ads.sv0;
import com.google.android.gms.internal.ads.zn;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzay {
    private sv0 zzg;
    private final Object zzb = new Object();
    private String zzc = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzd = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private boolean zze = false;
    private boolean zzf = false;
    protected String zza = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    /* JADX WARN: Multi-variable type inference failed */
    public static final String zzo(Context context, String str, String str2) {
        HashMap map = new HashMap();
        map.put("User-Agent", com.google.android.gms.ads.internal.zzv.zzq().zzc(context, str2));
        c5.a aVarZzb = new zzbo(context).zzb(0, str, map, null);
        try {
            return (String) aVarZzb.get(((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.O4)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e6) {
            zzo.zzh("Interrupted while retrieving a response from: ".concat(String.valueOf(str)), e6);
            aVarZzb.cancel(true);
            return null;
        } catch (TimeoutException e7) {
            zzo.zzh("Timeout while retrieving a response from: ".concat(String.valueOf(str)), e7);
            aVarZzb.cancel(true);
            return null;
        } catch (Exception e8) {
            zzo.zzh("Error retrieving a response from: ".concat(String.valueOf(str)), e8);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006e A[Catch: all -> 0x0031, TryCatch #0 {, blocks: (B:4:0x000b, B:6:0x0013, B:7:0x0018, B:12:0x003a, B:14:0x0042, B:16:0x0057, B:19:0x0069, B:11:0x0033, B:20:0x006e, B:21:0x0070), top: B:26:0x000b, inners: #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Uri zzp(Context context, String str, String str2, String str3) {
        String str4;
        String str5;
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        synchronized (this.zzb) {
            if (TextUtils.isEmpty(this.zzc)) {
                com.google.android.gms.ads.internal.zzv.zzq();
                try {
                    FileInputStream fileInputStreamOpenFileInput = context.openFileInput("debug_signals_id.txt");
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    i3.f.b(fileInputStreamOpenFileInput, byteArrayOutputStream, true);
                    str5 = new String(byteArrayOutputStream.toByteArray(), "UTF-8");
                } catch (IOException unused) {
                    zzo.zze("Error reading from internal storage.");
                    str5 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                }
                this.zzc = str5;
                if (TextUtils.isEmpty(str5)) {
                    com.google.android.gms.ads.internal.zzv.zzq();
                    this.zzc = UUID.randomUUID().toString();
                    com.google.android.gms.ads.internal.zzv.zzq();
                    String str6 = this.zzc;
                    try {
                        FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput("debug_signals_id.txt", 0);
                        fileOutputStreamOpenFileOutput.write(str6.getBytes("UTF-8"));
                        fileOutputStreamOpenFileOutput.close();
                    } catch (Exception e6) {
                        zzo.zzh("Error writing to file in internal storage.", e6);
                    }
                    str4 = this.zzc;
                } else {
                    str4 = this.zzc;
                }
            }
        }
        builderBuildUpon.appendQueryParameter("linkedDeviceId", str4);
        builderBuildUpon.appendQueryParameter("adSlotPath", str2);
        builderBuildUpon.appendQueryParameter("afmaVersion", str3);
        return builderBuildUpon.build();
    }

    public final sv0 zza() {
        return this.zzg;
    }

    public final String zzb() {
        String str;
        synchronized (this.zzb) {
            str = this.zzd;
        }
        return str;
    }

    public final void zzc(Context context) {
        sv0 sv0Var;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.c9)).booleanValue() || (sv0Var = this.zzg) == null) {
            return;
        }
        sv0Var.d(new b(this, context), rv0.f8713v);
    }

    public final void zzd(Context context, String str, String str2) {
        com.google.android.gms.ads.internal.zzv.zzq();
        zzs.zzU(context, zzp(context, (String) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.K4), str, str2));
    }

    public final void zze(Context context, String str, String str2, String str3) {
        Uri.Builder builderBuildUpon = zzp(context, (String) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.N4), str3, str).buildUpon();
        builderBuildUpon.appendQueryParameter("debugData", str2);
        com.google.android.gms.ads.internal.zzv.zzq();
        zzs.zzM(context, str, builderBuildUpon.build().toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037 A[Catch: all -> 0x0045, TryCatch #0 {all -> 0x0045, blocks: (B:4:0x0003, B:6:0x0017, B:8:0x0026, B:11:0x002c, B:13:0x0032, B:16:0x0037, B:17:0x003b, B:19:0x0041, B:22:0x0047), top: B:26:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0041 A[Catch: all -> 0x0045, TryCatch #0 {all -> 0x0045, blocks: (B:4:0x0003, B:6:0x0017, B:8:0x0026, B:11:0x002c, B:13:0x0032, B:16:0x0037, B:17:0x003b, B:19:0x0041, B:22:0x0047), top: B:26:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzf(boolean z6) {
        synchronized (this.zzb) {
            try {
                this.zzf = z6;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.c9)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzv.zzp().d().zzx(z6);
                    sv0 sv0Var = this.zzg;
                    if (sv0Var != null) {
                        if (!sv0Var.f9027u) {
                            if (z6) {
                                sv0Var.h();
                                if (sv0Var.s) {
                                    sv0Var.m();
                                }
                            }
                            if (!sv0Var.f()) {
                                sv0Var.l();
                            }
                        } else if (z6) {
                            if (sv0Var.s) {
                            }
                        } else if (!sv0Var.f()) {
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzg(sv0 sv0Var) {
        this.zzg = sv0Var;
    }

    public final void zzh(boolean z6) {
        synchronized (this.zzb) {
            this.zze = z6;
        }
    }

    public final void zzi(Context context, String str, boolean z6, boolean z7) {
        if (context instanceof Activity) {
            zzs.zza.post(new d((Activity) context, str, z6, z7));
        } else {
            zzo.zzi("Can not create dialog without Activity Context");
        }
    }

    public final boolean zzj(Context context, String str, String str2) {
        String strZzo = zzo(context, zzp(context, (String) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.M4), str, str2).toString(), str2);
        if (TextUtils.isEmpty(strZzo)) {
            zzo.zze("Not linked for debug signals.");
            return false;
        }
        try {
            boolean zEquals = "1".equals(new JSONObject(strZzo.trim()).optString("debug_mode"));
            zzf(zEquals);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.c9)).booleanValue()) {
                zzj zzjVarD = com.google.android.gms.ads.internal.zzv.zzp().d();
                if (true != zEquals) {
                    str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                }
                zzjVarD.zzw(str);
            }
            return zEquals;
        } catch (JSONException e6) {
            zzo.zzk("Fail to get debug mode response json.", e6);
            return false;
        }
    }

    public final boolean zzk(Context context, String str, String str2) {
        String strZzo = zzo(context, zzp(context, (String) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.L4), str, str2).toString(), str2);
        if (TextUtils.isEmpty(strZzo)) {
            zzo.zze("Not linked for in app preview.");
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(strZzo.trim());
            String strOptString = jSONObject.optString("gct");
            this.zza = jSONObject.optString("status");
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.c9)).booleanValue()) {
                boolean z6 = "0".equals(this.zza) || "2".equals(this.zza);
                zzf(z6);
                zzj zzjVarD = com.google.android.gms.ads.internal.zzv.zzp().d();
                if (!z6) {
                    str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                }
                zzjVarD.zzw(str);
            }
            synchronized (this.zzb) {
                this.zzd = strOptString;
            }
            return true;
        } catch (JSONException e6) {
            zzo.zzk("Fail to get in app preview response json.", e6);
            return false;
        }
    }

    public final boolean zzl() {
        boolean z6;
        synchronized (this.zzb) {
            z6 = this.zzf;
        }
        return z6;
    }

    public final boolean zzm() {
        boolean z6;
        synchronized (this.zzb) {
            z6 = this.zze;
        }
        return z6;
    }

    public final boolean zzn(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || !zzm()) {
            return false;
        }
        zzo.zze("Sending troubleshooting signals to the server.");
        zze(context, str, str2, str3);
        return true;
    }
}
