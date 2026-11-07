package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.i70;
import com.google.android.gms.internal.ads.kp;
import com.google.android.gms.internal.ads.lp;
import com.google.android.gms.internal.ads.ri;
import com.google.android.gms.internal.ads.w60;
import com.google.android.gms.internal.ads.zn;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzj implements zzg {
    private boolean zzb;
    private c5.a zzd;
    private SharedPreferences zzf;
    private SharedPreferences.Editor zzg;
    private String zzi;
    private String zzj;
    private final Object zza = new Object();
    private final List zzc = new ArrayList();
    private ri zze = null;
    private boolean zzh = true;
    private boolean zzk = true;
    private String zzl = "-1";
    private int zzm = -1;
    private w60 zzn = new w60(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, 0);
    private long zzo = 0;
    private long zzp = 0;
    private int zzq = -1;
    private int zzr = 0;
    private Set zzs = Collections.EMPTY_SET;
    private JSONObject zzt = new JSONObject();
    private boolean zzu = true;
    private boolean zzv = true;
    private String zzw = null;
    private String zzx = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private boolean zzy = false;
    private String zzz = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzA = "{}";
    private int zzB = -1;
    private int zzC = -1;
    private long zzD = 0;

    private final void zzR() throws ExecutionException, InterruptedException, TimeoutException {
        c5.a aVar = this.zzd;
        if (aVar == null || aVar.isDone()) {
            return;
        }
        try {
            this.zzd.get(1L, TimeUnit.SECONDS);
        } catch (InterruptedException e6) {
            Thread.currentThread().interrupt();
            zzo.zzk("Interrupted while waiting for preferences loaded.", e6);
        } catch (CancellationException e7) {
            e = e7;
            zzo.zzh("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (ExecutionException e8) {
            e = e8;
            zzo.zzh("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (TimeoutException e9) {
            e = e9;
            zzo.zzh("Fail to initialize AdSharedPreferenceManager.", e);
        }
    }

    private final void zzS() {
        i70.f5586a.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzh
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzP();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzA(int i6) throws ExecutionException, InterruptedException, TimeoutException {
        zzR();
        synchronized (this.zza) {
            try {
                this.zzm = i6;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    if (i6 == -1) {
                        editor.remove("gad_has_consent_for_cookies");
                    } else {
                        editor.putInt("gad_has_consent_for_cookies", i6);
                    }
                    this.zzg.apply();
                }
                zzS();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzB(String str) throws ExecutionException, InterruptedException, TimeoutException {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.N8)).booleanValue()) {
            zzR();
            synchronized (this.zza) {
                try {
                    if (this.zzx.equals(str)) {
                        return;
                    }
                    this.zzx = str;
                    SharedPreferences.Editor editor = this.zzg;
                    if (editor != null) {
                        editor.putString("inspector_info", str);
                        this.zzg.apply();
                    }
                    zzS();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzC(String str) throws ExecutionException, InterruptedException, TimeoutException {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.p9)).booleanValue()) {
            zzR();
            synchronized (this.zza) {
                try {
                    if (this.zzA.equals(str)) {
                        return;
                    }
                    this.zzA = str;
                    SharedPreferences.Editor editor = this.zzg;
                    if (editor != null) {
                        editor.putString("inspector_ui_storage", str);
                        this.zzg.apply();
                    }
                    zzS();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzD(boolean z6) throws ExecutionException, InterruptedException, TimeoutException {
        zzR();
        synchronized (this.zza) {
            try {
                if (z6 == this.zzk) {
                    return;
                }
                this.zzk = z6;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putBoolean("gad_idless", z6);
                    this.zzg.apply();
                }
                zzS();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzE(boolean z6) throws ExecutionException, InterruptedException, TimeoutException {
        zzR();
        synchronized (this.zza) {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis() + ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.pa)).longValue();
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putBoolean("is_topics_ad_personalization_allowed", z6);
                    this.zzg.putLong("topics_consent_expiry_time_ms", jCurrentTimeMillis);
                    this.zzg.apply();
                }
                zzS();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
    
        r3 = new org.json.JSONObject();
        r3.put("template_id", r9);
        r3.put("uses_media_view", r10);
        r3.put("timestamp_ms", com.google.android.gms.ads.internal.zzv.zzC().a());
        r1.put(r2, r3);
        r7.zzt.put(r8, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006e, code lost:
    
        com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not update native advanced settings", r8);
     */
    @Override // com.google.android.gms.ads.internal.util.zzg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzF(String str, String str2, boolean z6) throws ExecutionException, InterruptedException, TimeoutException {
        zzR();
        synchronized (this.zza) {
            try {
                JSONArray jSONArrayOptJSONArray = this.zzt.optJSONArray(str);
                if (jSONArrayOptJSONArray == null) {
                    jSONArrayOptJSONArray = new JSONArray();
                }
                int length = jSONArrayOptJSONArray.length();
                int i6 = 0;
                while (true) {
                    if (i6 < jSONArrayOptJSONArray.length()) {
                        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i6);
                        if (jSONObjectOptJSONObject == null) {
                            return;
                        }
                        if (!str2.equals(jSONObjectOptJSONObject.optString("template_id"))) {
                            i6++;
                        } else if (z6 && jSONObjectOptJSONObject.optBoolean("uses_media_view", false)) {
                            return;
                        } else {
                            length = i6;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        SharedPreferences.Editor editor = this.zzg;
        if (editor != null) {
            editor.putString("native_advanced_settings", this.zzt.toString());
            this.zzg.apply();
        }
        zzS();
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzG(int i6) throws ExecutionException, InterruptedException, TimeoutException {
        zzR();
        synchronized (this.zza) {
            try {
                if (this.zzq == i6) {
                    return;
                }
                this.zzq = i6;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putInt("request_in_session_count", i6);
                    this.zzg.apply();
                }
                zzS();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzH(int i6) throws ExecutionException, InterruptedException, TimeoutException {
        zzR();
        synchronized (this.zza) {
            try {
                if (this.zzC == i6) {
                    return;
                }
                this.zzC = i6;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putInt("sd_app_measure_npa", i6);
                    this.zzg.apply();
                }
                zzS();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzI(long j6) throws ExecutionException, InterruptedException, TimeoutException {
        zzR();
        synchronized (this.zza) {
            try {
                if (this.zzD == j6) {
                    return;
                }
                this.zzD = j6;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putLong("sd_app_measure_npa_ts", j6);
                    this.zzg.apply();
                }
                zzS();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzJ(String str) throws ExecutionException, InterruptedException, TimeoutException {
        zzR();
        synchronized (this.zza) {
            try {
                this.zzl = str;
                if (this.zzg != null) {
                    if (str.equals("-1")) {
                        this.zzg.remove("IABTCF_TCString");
                    } else {
                        this.zzg.putString("IABTCF_TCString", str);
                    }
                    this.zzg.apply();
                }
                zzS();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzK() throws ExecutionException, InterruptedException, TimeoutException {
        boolean z6;
        zzR();
        synchronized (this.zza) {
            z6 = this.zzu;
        }
        return z6;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzL() throws ExecutionException, InterruptedException, TimeoutException {
        boolean z6;
        zzR();
        synchronized (this.zza) {
            z6 = this.zzv;
        }
        return z6;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzM() throws ExecutionException, InterruptedException, TimeoutException {
        boolean z6;
        zzR();
        synchronized (this.zza) {
            z6 = this.zzy;
        }
        return z6;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzN() throws ExecutionException, InterruptedException, TimeoutException {
        boolean z6;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.H0)).booleanValue()) {
            return false;
        }
        zzR();
        synchronized (this.zza) {
            z6 = this.zzk;
        }
        return z6;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzO() throws ExecutionException, InterruptedException, TimeoutException {
        zzR();
        synchronized (this.zza) {
            try {
                SharedPreferences sharedPreferences = this.zzf;
                boolean z6 = false;
                if (sharedPreferences == null) {
                    return false;
                }
                if (sharedPreferences.getLong("topics_consent_expiry_time_ms", 0L) < System.currentTimeMillis()) {
                    return false;
                }
                if (this.zzf.getBoolean("is_topics_ad_personalization_allowed", false) && !this.zzk) {
                    z6 = true;
                }
                return z6;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ri zzP() {
        if (!this.zzb || ((zzK() && zzL()) || !((Boolean) kp.f6460b.c()).booleanValue())) {
            return null;
        }
        synchronized (this.zza) {
            try {
                if (Looper.getMainLooper() == null) {
                    return null;
                }
                if (this.zze == null) {
                    this.zze = new ri();
                }
                ri riVar = this.zze;
                synchronized (riVar.f8640u) {
                    try {
                        if (riVar.s) {
                            zzo.zze("Content hash thread already started, quitting...");
                        } else {
                            riVar.s = true;
                            riVar.start();
                        }
                    } finally {
                    }
                }
                zzo.zzi("start fetching content...");
                return this.zze;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzQ(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("admob", 0);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        try {
            synchronized (this.zza) {
                try {
                    this.zzf = sharedPreferences;
                    this.zzg = editorEdit;
                    NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
                    this.zzh = this.zzf.getBoolean("use_https", this.zzh);
                    this.zzu = this.zzf.getBoolean("content_url_opted_out", this.zzu);
                    this.zzi = this.zzf.getString("content_url_hashes", this.zzi);
                    this.zzk = this.zzf.getBoolean("gad_idless", this.zzk);
                    this.zzv = this.zzf.getBoolean("content_vertical_opted_out", this.zzv);
                    this.zzj = this.zzf.getString("content_vertical_hashes", this.zzj);
                    this.zzr = this.zzf.getInt("version_code", this.zzr);
                    if (((Boolean) lp.f6812g.c()).booleanValue() && com.google.android.gms.ads.internal.client.zzbe.zzc().f10638j) {
                        this.zzn = new w60(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, 0L);
                    } else {
                        this.zzn = new w60(this.zzf.getString("app_settings_json", this.zzn.f10066e), this.zzf.getLong("app_settings_last_update_ms", this.zzn.f10067f));
                    }
                    this.zzo = this.zzf.getLong("app_last_background_time_ms", this.zzo);
                    this.zzq = this.zzf.getInt("request_in_session_count", this.zzq);
                    this.zzp = this.zzf.getLong("first_ad_req_time_ms", this.zzp);
                    this.zzs = this.zzf.getStringSet("never_pool_slots", this.zzs);
                    this.zzw = this.zzf.getString("display_cutout", this.zzw);
                    this.zzB = this.zzf.getInt("app_measurement_npa", this.zzB);
                    this.zzC = this.zzf.getInt("sd_app_measure_npa", this.zzC);
                    this.zzD = this.zzf.getLong("sd_app_measure_npa_ts", this.zzD);
                    this.zzx = this.zzf.getString("inspector_info", this.zzx);
                    this.zzy = this.zzf.getBoolean("linked_device", this.zzy);
                    this.zzz = this.zzf.getString("linked_ad_unit", this.zzz);
                    this.zzA = this.zzf.getString("inspector_ui_storage", this.zzA);
                    this.zzl = this.zzf.getString("IABTCF_TCString", this.zzl);
                    this.zzm = this.zzf.getInt("gad_has_consent_for_cookies", this.zzm);
                    try {
                        this.zzt = new JSONObject(this.zzf.getString("native_advanced_settings", "{}"));
                    } catch (JSONException e6) {
                        zzo.zzk("Could not convert native advanced settings to json object", e6);
                    }
                    zzS();
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            com.google.android.gms.ads.internal.zzv.zzp().h("AdSharedPreferenceManagerImpl.initializeOnBackgroundThread", th2);
            zze.zzb("AdSharedPreferenceManagerImpl.initializeOnBackgroundThread, errorMessage = ", th2);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int zza() throws ExecutionException, InterruptedException, TimeoutException {
        int i6;
        zzR();
        synchronized (this.zza) {
            i6 = this.zzr;
        }
        return i6;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int zzb() throws ExecutionException, InterruptedException, TimeoutException {
        zzR();
        return this.zzm;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int zzc() throws ExecutionException, InterruptedException, TimeoutException {
        int i6;
        zzR();
        synchronized (this.zza) {
            i6 = this.zzq;
        }
        return i6;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final long zzd() throws ExecutionException, InterruptedException, TimeoutException {
        long j6;
        zzR();
        synchronized (this.zza) {
            j6 = this.zzo;
        }
        return j6;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final long zze() throws ExecutionException, InterruptedException, TimeoutException {
        long j6;
        zzR();
        synchronized (this.zza) {
            j6 = this.zzp;
        }
        return j6;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final long zzf() throws ExecutionException, InterruptedException, TimeoutException {
        long j6;
        zzR();
        synchronized (this.zza) {
            j6 = this.zzD;
        }
        return j6;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final w60 zzg() throws ExecutionException, InterruptedException, TimeoutException {
        w60 w60Var;
        zzR();
        synchronized (this.zza) {
            try {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.zb)).booleanValue() && this.zzn.a()) {
                    Iterator it = this.zzc.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                }
                w60Var = this.zzn;
            } catch (Throwable th) {
                throw th;
            }
        }
        return w60Var;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final w60 zzh() {
        w60 w60Var;
        synchronized (this.zza) {
            w60Var = this.zzn;
        }
        return w60Var;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzi() throws ExecutionException, InterruptedException, TimeoutException {
        String str;
        zzR();
        synchronized (this.zza) {
            str = this.zzz;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzj() throws ExecutionException, InterruptedException, TimeoutException {
        String str;
        zzR();
        synchronized (this.zza) {
            str = this.zzw;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzk() throws ExecutionException, InterruptedException, TimeoutException {
        String str;
        zzR();
        synchronized (this.zza) {
            str = this.zzx;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzl() throws ExecutionException, InterruptedException, TimeoutException {
        String str;
        zzR();
        synchronized (this.zza) {
            str = this.zzA;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzm() throws ExecutionException, InterruptedException, TimeoutException {
        zzR();
        return this.zzl;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final JSONObject zzn() throws ExecutionException, InterruptedException, TimeoutException {
        JSONObject jSONObject;
        zzR();
        synchronized (this.zza) {
            jSONObject = this.zzt;
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzo(Runnable runnable) {
        this.zzc.add(runnable);
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzp(final Context context) {
        synchronized (this.zza) {
            try {
                if (this.zzf != null) {
                    return;
                }
                final String str = "admob";
                this.zzd = i70.f5586a.w(new Runnable(context, str) { // from class: com.google.android.gms.ads.internal.util.zzi
                    public final /* synthetic */ Context zzb;
                    public final /* synthetic */ String zzc = "admob";

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzQ(this.zzb, this.zzc);
                    }
                });
                this.zzb = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzq() throws ExecutionException, InterruptedException, TimeoutException {
        zzR();
        synchronized (this.zza) {
            try {
                this.zzt = new JSONObject();
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.remove("native_advanced_settings");
                    this.zzg.apply();
                }
                zzS();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzr(long j6) throws ExecutionException, InterruptedException, TimeoutException {
        zzR();
        synchronized (this.zza) {
            try {
                if (this.zzo == j6) {
                    return;
                }
                this.zzo = j6;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putLong("app_last_background_time_ms", j6);
                    this.zzg.apply();
                }
                zzS();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzs(String str) throws ExecutionException, InterruptedException, TimeoutException {
        zzR();
        synchronized (this.zza) {
            try {
                long jA = com.google.android.gms.ads.internal.zzv.zzC().a();
                if (str != null && !str.equals(this.zzn.f10066e)) {
                    this.zzn = new w60(str, jA);
                    SharedPreferences.Editor editor = this.zzg;
                    if (editor != null) {
                        editor.putString("app_settings_json", str);
                        this.zzg.putLong("app_settings_last_update_ms", jA);
                        this.zzg.apply();
                    }
                    zzS();
                    Iterator it = this.zzc.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    return;
                }
                this.zzn.f10067f = jA;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzt(int i6) throws ExecutionException, InterruptedException, TimeoutException {
        zzR();
        synchronized (this.zza) {
            try {
                if (this.zzr == i6) {
                    return;
                }
                this.zzr = i6;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putInt("version_code", i6);
                    this.zzg.apply();
                }
                zzS();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzu(boolean z6) throws ExecutionException, InterruptedException, TimeoutException {
        zzR();
        synchronized (this.zza) {
            try {
                if (this.zzu == z6) {
                    return;
                }
                this.zzu = z6;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putBoolean("content_url_opted_out", z6);
                    this.zzg.apply();
                }
                zzS();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzv(boolean z6) throws ExecutionException, InterruptedException, TimeoutException {
        zzR();
        synchronized (this.zza) {
            try {
                if (this.zzv == z6) {
                    return;
                }
                this.zzv = z6;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putBoolean("content_vertical_opted_out", z6);
                    this.zzg.apply();
                }
                zzS();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzw(String str) throws ExecutionException, InterruptedException, TimeoutException {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.c9)).booleanValue()) {
            zzR();
            synchronized (this.zza) {
                try {
                    if (this.zzz.equals(str)) {
                        return;
                    }
                    this.zzz = str;
                    SharedPreferences.Editor editor = this.zzg;
                    if (editor != null) {
                        editor.putString("linked_ad_unit", str);
                        this.zzg.apply();
                    }
                    zzS();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzx(boolean z6) throws ExecutionException, InterruptedException, TimeoutException {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.c9)).booleanValue()) {
            zzR();
            synchronized (this.zza) {
                try {
                    if (this.zzy == z6) {
                        return;
                    }
                    this.zzy = z6;
                    SharedPreferences.Editor editor = this.zzg;
                    if (editor != null) {
                        editor.putBoolean("linked_device", z6);
                        this.zzg.apply();
                    }
                    zzS();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzy(String str) throws ExecutionException, InterruptedException, TimeoutException {
        zzR();
        synchronized (this.zza) {
            try {
                if (TextUtils.equals(this.zzw, str)) {
                    return;
                }
                this.zzw = str;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putString("display_cutout", str);
                    this.zzg.apply();
                }
                zzS();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzz(long j6) throws ExecutionException, InterruptedException, TimeoutException {
        zzR();
        synchronized (this.zza) {
            try {
                if (this.zzp == j6) {
                    return;
                }
                this.zzp = j6;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putLong("first_ad_req_time_ms", j6);
                    this.zzg.apply();
                }
                zzS();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
