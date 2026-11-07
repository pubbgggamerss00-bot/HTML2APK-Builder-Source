package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.os.ConditionVariable;
import android.os.StrictMode;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbe;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class yn implements em1, om0 {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Context f11029t;

    public /* synthetic */ yn(Context context, int i6) {
        this.s = i6;
        this.f11029t = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00f7 A[Catch: all -> 0x00a2, Merged into TryCatch #2 {all -> 0x0052, all -> 0x00a2, blocks: (B:13:0x004b, B:15:0x004f, B:19:0x0055, B:21:0x005a, B:22:0x005c, B:24:0x006e, B:25:0x0072, B:26:0x0074, B:51:0x00ed, B:52:0x00f1, B:53:0x00f4, B:62:0x0126, B:81:0x018c, B:98:0x01e7, B:99:0x01ee, B:101:0x01f0, B:102:0x01f7, B:28:0x0089, B:29:0x008d, B:34:0x009a, B:40:0x00a7, B:43:0x00b2, B:44:0x00bc, B:46:0x00c2, B:48:0x00d2, B:50:0x00e9, B:55:0x00f7, B:57:0x00fb, B:59:0x010b, B:61:0x0122, B:64:0x012b, B:76:0x0182, B:83:0x0192, B:85:0x01a9, B:87:0x01ad, B:88:0x01b0, B:91:0x01b5, B:93:0x01d5, B:95:0x01e1, B:96:0x01e4, B:97:0x01e5, B:67:0x013c, B:69:0x014a, B:71:0x0152, B:73:0x0172, B:74:0x0175, B:78:0x0186, B:79:0x0189, B:72:0x0156), top: B:111:0x004b }, TRY_ENTER] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012b A[Catch: all -> 0x00a2, Merged into TryCatch #2 {all -> 0x0052, all -> 0x00a2, blocks: (B:13:0x004b, B:15:0x004f, B:19:0x0055, B:21:0x005a, B:22:0x005c, B:24:0x006e, B:25:0x0072, B:26:0x0074, B:51:0x00ed, B:52:0x00f1, B:53:0x00f4, B:62:0x0126, B:81:0x018c, B:98:0x01e7, B:99:0x01ee, B:101:0x01f0, B:102:0x01f7, B:28:0x0089, B:29:0x008d, B:34:0x009a, B:40:0x00a7, B:43:0x00b2, B:44:0x00bc, B:46:0x00c2, B:48:0x00d2, B:50:0x00e9, B:55:0x00f7, B:57:0x00fb, B:59:0x010b, B:61:0x0122, B:64:0x012b, B:76:0x0182, B:83:0x0192, B:85:0x01a9, B:87:0x01ad, B:88:0x01b0, B:91:0x01b5, B:93:0x01d5, B:95:0x01e1, B:96:0x01e4, B:97:0x01e5, B:67:0x013c, B:69:0x014a, B:71:0x0152, B:73:0x0172, B:74:0x0175, B:78:0x0186, B:79:0x0189, B:72:0x0156), top: B:111:0x004b }, TRY_ENTER] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x018c A[Catch: all -> 0x0052, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0052, all -> 0x00a2, blocks: (B:13:0x004b, B:15:0x004f, B:19:0x0055, B:21:0x005a, B:22:0x005c, B:24:0x006e, B:25:0x0072, B:26:0x0074, B:51:0x00ed, B:52:0x00f1, B:53:0x00f4, B:62:0x0126, B:81:0x018c, B:98:0x01e7, B:99:0x01ee, B:101:0x01f0, B:102:0x01f7, B:28:0x0089, B:29:0x008d, B:34:0x009a, B:40:0x00a7, B:43:0x00b2, B:44:0x00bc, B:46:0x00c2, B:48:0x00d2, B:50:0x00e9, B:55:0x00f7, B:57:0x00fb, B:59:0x010b, B:61:0x0122, B:64:0x012b, B:76:0x0182, B:83:0x0192, B:85:0x01a9, B:87:0x01ad, B:88:0x01b0, B:91:0x01b5, B:93:0x01d5, B:95:0x01e1, B:96:0x01e4, B:97:0x01e5, B:67:0x013c, B:69:0x014a, B:71:0x0152, B:73:0x0172, B:74:0x0175, B:78:0x0186, B:79:0x0189, B:72:0x0156), top: B:111:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0192 A[Catch: all -> 0x00a2, Merged into TryCatch #2 {all -> 0x0052, all -> 0x00a2, blocks: (B:13:0x004b, B:15:0x004f, B:19:0x0055, B:21:0x005a, B:22:0x005c, B:24:0x006e, B:25:0x0072, B:26:0x0074, B:51:0x00ed, B:52:0x00f1, B:53:0x00f4, B:62:0x0126, B:81:0x018c, B:98:0x01e7, B:99:0x01ee, B:101:0x01f0, B:102:0x01f7, B:28:0x0089, B:29:0x008d, B:34:0x009a, B:40:0x00a7, B:43:0x00b2, B:44:0x00bc, B:46:0x00c2, B:48:0x00d2, B:50:0x00e9, B:55:0x00f7, B:57:0x00fb, B:59:0x010b, B:61:0x0122, B:64:0x012b, B:76:0x0182, B:83:0x0192, B:85:0x01a9, B:87:0x01ad, B:88:0x01b0, B:91:0x01b5, B:93:0x01d5, B:95:0x01e1, B:96:0x01e4, B:97:0x01e5, B:67:0x013c, B:69:0x014a, B:71:0x0152, B:73:0x0172, B:74:0x0175, B:78:0x0186, B:79:0x0189, B:72:0x0156), top: B:111:0x004b }, TRY_ENTER] */
    @Override // com.google.android.gms.internal.ads.em1
    /* renamed from: zza */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo7zza() {
        Context applicationContext;
        SharedPreferences sharedPreferencesA;
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        ConditionVariable conditionVariable;
        switch (this.s) {
            case 0:
                sn snVar = zn.f11349a;
                xn xnVarZzc = zzbe.zzc();
                Context applicationContext2 = this.f11029t;
                if (!xnVarZzc.f10632c) {
                    synchronized (xnVarZzc.f10630a) {
                        try {
                            if (!xnVarZzc.f10632c) {
                                if (!xnVarZzc.f10633d) {
                                    xnVarZzc.f10633d = true;
                                }
                                xnVarZzc.f10637i = TextUtils.equals(applicationContext2.getPackageName(), "com.google.android.gms");
                                if (applicationContext2.getApplicationContext() != null) {
                                    applicationContext2 = applicationContext2.getApplicationContext();
                                }
                                xnVarZzc.f10636g = applicationContext2;
                                try {
                                    xnVarZzc.f10635f = j3.d.a(applicationContext2).a(128, xnVarZzc.f10636g.getPackageName()).metaData;
                                } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
                                }
                                Context context = xnVarZzc.f10636g;
                                AtomicBoolean atomicBoolean = c3.k.f2186a;
                                try {
                                    applicationContext = context.createPackageContext("com.google.android.gms", 3);
                                } catch (PackageManager.NameNotFoundException unused2) {
                                    applicationContext = null;
                                }
                                if (applicationContext != null || context == null || (applicationContext = context.getApplicationContext()) != null) {
                                    context = applicationContext;
                                }
                                if (context != null) {
                                    zzbe.zzb();
                                    sharedPreferencesA = vn.a(context);
                                } else {
                                    sharedPreferencesA = null;
                                }
                                if (sharedPreferencesA != null) {
                                    hq.f5455a.set(new wn(sharedPreferencesA));
                                }
                                if (!xnVarZzc.f10637i) {
                                    ep epVar = lp.f6809d;
                                    if (((Long) epVar.c()).longValue() > 0 && mn.b(xnVarZzc.f10636g, "crash_without_write") >= ((Long) epVar.c()).longValue()) {
                                        xnVarZzc.f10638j = true;
                                        xnVarZzc.f10632c = true;
                                        xnVarZzc.f10633d = false;
                                        conditionVariable = xnVarZzc.f10631b;
                                    } else if (!xnVarZzc.f10637i) {
                                        ep epVar2 = lp.f6811f;
                                        if (((Long) epVar2.c()).longValue() <= 0 || mn.b(xnVarZzc.f10636g, "init_without_write") < ((Long) epVar2.c()).longValue()) {
                                            Context context2 = xnVarZzc.f10636g;
                                            if (!((Boolean) rp.f8680g.c()).booleanValue()) {
                                                if (((Boolean) rp.h.c()).booleanValue() && (sharedPreferences = context2.getSharedPreferences("admob", 0)) != null) {
                                                    try {
                                                        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(StrictMode.getThreadPolicy()).permitDiskReads().permitDiskWrites().build());
                                                        try {
                                                            if (new JSONObject(sharedPreferences.getString("app_settings_json", "{}")).optBoolean("local_flags_enabled")) {
                                                            }
                                                        } catch (JSONException unused3) {
                                                        }
                                                    } finally {
                                                    }
                                                }
                                                if (context != null) {
                                                    xnVarZzc.f10633d = false;
                                                    conditionVariable = xnVarZzc.f10631b;
                                                } else {
                                                    zzbe.zzb();
                                                    xnVarZzc.f10634e = vn.a(context);
                                                    if (!((Boolean) rp.f8674a.c()).booleanValue() && (sharedPreferences2 = xnVarZzc.f10634e) != null) {
                                                        sharedPreferences2.registerOnSharedPreferenceChangeListener(xnVarZzc);
                                                    }
                                                    SharedPreferences sharedPreferences3 = xnVarZzc.f10634e;
                                                    if (sharedPreferences3 != null) {
                                                        try {
                                                            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                                                            try {
                                                                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                                                                String string = sharedPreferences3.getString("flag_configuration", "{}");
                                                                StrictMode.setThreadPolicy(threadPolicy);
                                                                xnVarZzc.h = new JSONObject(string);
                                                            } finally {
                                                            }
                                                        } catch (JSONException unused4) {
                                                        }
                                                    }
                                                    xnVarZzc.f10632c = true;
                                                    xnVarZzc.f10633d = false;
                                                    xnVarZzc.f10631b.open();
                                                }
                                            }
                                            context = xnVarZzc.f10636g;
                                            if (context != null) {
                                            }
                                        } else {
                                            xnVarZzc.f10638j = true;
                                            xnVarZzc.f10632c = true;
                                            xnVarZzc.f10633d = false;
                                            conditionVariable = xnVarZzc.f10631b;
                                        }
                                    }
                                    conditionVariable.open();
                                }
                            }
                        } catch (Throwable th) {
                            xnVarZzc.f10633d = false;
                            xnVarZzc.f10631b.open();
                            throw th;
                        } finally {
                        }
                    }
                }
                return null;
            case 1:
            default:
                Context context3 = this.f11029t;
                new s0();
                new j00(context3);
                ch2 ch2Var = new ch2();
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                map.clear();
                map2.clear();
                return ch2Var;
            case 2:
                AudioManager audioManager = (AudioManager) this.f11029t.getApplicationContext().getSystemService("audio");
                audioManager.getClass();
                return audioManager;
        }
    }

    @Override // com.google.android.gms.internal.ads.om0
    /* renamed from: zza */
    public void mo3zza(Object obj) {
        ((bl0) obj).i(this.f11029t);
    }
}
