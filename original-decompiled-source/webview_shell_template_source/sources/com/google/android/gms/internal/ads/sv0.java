package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.RemoteException;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzdl;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzj;
import com.google.android.gms.ads.internal.zzv;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class sv0 {

    /* renamed from: a, reason: collision with root package name */
    public final vv0 f9009a;

    /* renamed from: b, reason: collision with root package name */
    public final fw0 f9010b;

    /* renamed from: c, reason: collision with root package name */
    public final iv0 f9011c;

    /* renamed from: d, reason: collision with root package name */
    public final ov0 f9012d;

    /* renamed from: e, reason: collision with root package name */
    public final hv0 f9013e;

    /* renamed from: f, reason: collision with root package name */
    public final dw0 f9014f;

    /* renamed from: g, reason: collision with root package name */
    public final uv0 f9015g;
    public final uv0 h;

    /* renamed from: i, reason: collision with root package name */
    public final String f9016i;

    /* renamed from: j, reason: collision with root package name */
    public final Context f9017j;

    /* renamed from: k, reason: collision with root package name */
    public final String f9018k;

    /* renamed from: p, reason: collision with root package name */
    public JSONObject f9023p;
    public boolean s;

    /* renamed from: t, reason: collision with root package name */
    public int f9026t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f9027u;

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f9019l = new HashMap();

    /* renamed from: m, reason: collision with root package name */
    public final HashMap f9020m = new HashMap();

    /* renamed from: n, reason: collision with root package name */
    public final HashMap f9021n = new HashMap();

    /* renamed from: o, reason: collision with root package name */
    public String f9022o = "{}";

    /* renamed from: q, reason: collision with root package name */
    public long f9024q = Long.MAX_VALUE;

    /* renamed from: r, reason: collision with root package name */
    public pv0 f9025r = pv0.s;

    /* renamed from: v, reason: collision with root package name */
    public rv0 f9028v = rv0.s;

    /* renamed from: w, reason: collision with root package name */
    public long f9029w = 0;

    /* renamed from: x, reason: collision with root package name */
    public String f9030x = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    public sv0(vv0 vv0Var, fw0 fw0Var, iv0 iv0Var, Context context, VersionInfoParcel versionInfoParcel, ov0 ov0Var, dw0 dw0Var, uv0 uv0Var, uv0 uv0Var2, String str) {
        this.f9009a = vv0Var;
        this.f9010b = fw0Var;
        this.f9011c = iv0Var;
        this.f9013e = new hv0(context);
        this.f9016i = versionInfoParcel.afmaVersion;
        this.f9018k = str;
        this.f9012d = ov0Var;
        this.f9014f = dw0Var;
        this.f9015g = uv0Var;
        this.h = uv0Var2;
        this.f9017j = context;
        zzv.zzt().zzg(this);
    }

    public final synchronized o70 a(String str) {
        o70 o70Var;
        try {
            o70Var = new o70();
            if (this.f9020m.containsKey(str)) {
                o70Var.a((kv0) this.f9020m.get(str));
            } else {
                if (!this.f9021n.containsKey(str)) {
                    this.f9021n.put(str, new ArrayList());
                }
                ((List) this.f9021n.get(str)).add(o70Var);
            }
        } catch (Throwable th) {
            throw th;
        }
        return o70Var;
    }

    public final synchronized void b(String str, kv0 kv0Var) {
        if (((Boolean) zzbe.zzc().a(zn.N8)).booleanValue() && f()) {
            if (this.f9026t >= ((Integer) zzbe.zzc().a(zn.P8)).intValue()) {
                zzo.zzj("Maximum number of ad requests stored reached. Dropping the current request.");
                return;
            }
            if (!this.f9019l.containsKey(str)) {
                this.f9019l.put(str, new ArrayList());
            }
            this.f9026t++;
            ((List) this.f9019l.get(str)).add(kv0Var);
            if (((Boolean) zzbe.zzc().a(zn.l9)).booleanValue()) {
                String str2 = kv0Var.f6497u;
                this.f9020m.put(str2, kv0Var);
                if (this.f9021n.containsKey(str2)) {
                    List list = (List) this.f9021n.get(str2);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((o70) it.next()).a(kv0Var);
                    }
                    list.clear();
                }
            }
        }
    }

    public final void c() {
        if (((Boolean) zzbe.zzc().a(zn.N8)).booleanValue()) {
            if (((Boolean) zzbe.zzc().a(zn.c9)).booleanValue() && zzv.zzp().d().zzM()) {
                h();
                return;
            }
            String strZzk = zzv.zzp().d().zzk();
            if (TextUtils.isEmpty(strZzk)) {
                return;
            }
            try {
                if (new JSONObject(strZzk).optBoolean("isTestMode", false)) {
                    h();
                }
            } catch (JSONException unused) {
            }
        }
    }

    public final synchronized void d(zzdl zzdlVar, rv0 rv0Var) {
        if (!f()) {
            try {
                zzdlVar.zze(tc1.d(18, null, null));
                return;
            } catch (RemoteException unused) {
                zzo.zzj("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
                return;
            }
        }
        if (((Boolean) zzbe.zzc().a(zn.N8)).booleanValue()) {
            this.f9028v = rv0Var;
            this.f9009a.a(zzdlVar, new pu(0, this), new zt(1, this.f9014f), new zt(0, this));
            return;
        } else {
            try {
                zzdlVar.zze(tc1.d(1, null, null));
                return;
            } catch (RemoteException unused2) {
                zzo.zzj("Ad inspector had an internal error.");
                return;
            }
        }
    }

    public final void e(boolean z6) {
        if (!this.f9027u && z6) {
            h();
        }
        k(z6, true);
    }

    public final synchronized boolean f() {
        if (((Boolean) zzbe.zzc().a(zn.c9)).booleanValue()) {
            return this.s || zzv.zzt().zzl();
        }
        return this.s;
    }

    public final synchronized JSONObject g() {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            for (Map.Entry entry : this.f9019l.entrySet()) {
                JSONArray jSONArray = new JSONArray();
                for (kv0 kv0Var : (List) entry.getValue()) {
                    if (kv0Var.f6499w != jv0.s) {
                        jSONArray.put(kv0Var.a());
                    }
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put((String) entry.getKey(), jSONArray);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject;
    }

    public final void h() {
        this.f9027u = true;
        ov0 ov0Var = this.f9012d;
        ov0Var.getClass();
        mv0 mv0Var = new mv0(ov0Var);
        fv0 fv0Var = ov0Var.f7869a;
        fv0Var.getClass();
        fv0Var.f4791e.s.addListener(new o30(2, fv0Var, mv0Var), fv0Var.f4795j);
        this.f9009a.f9945u = this;
        this.f9010b.f4812f = this;
        this.f9011c.f5869i = this;
        this.f9014f.f4052x = this;
        sn snVar = zn.q9;
        if (!TextUtils.isEmpty((CharSequence) zzbe.zzc().a(snVar))) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f9017j);
            List listAsList = Arrays.asList(((String) zzbe.zzc().a(snVar)).split(","));
            uv0 uv0Var = this.f9015g;
            uv0Var.f9637b = listAsList;
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(uv0Var);
            Iterator it = listAsList.iterator();
            while (it.hasNext()) {
                uv0Var.onSharedPreferenceChanged(defaultSharedPreferences, (String) it.next());
            }
        }
        sn snVar2 = zn.r9;
        if (!TextUtils.isEmpty((CharSequence) zzbe.zzc().a(snVar2))) {
            SharedPreferences sharedPreferences = this.f9017j.getSharedPreferences("admob", 0);
            List listAsList2 = Arrays.asList(((String) zzbe.zzc().a(snVar2)).split(","));
            uv0 uv0Var2 = this.h;
            uv0Var2.f9637b = listAsList2;
            sharedPreferences.registerOnSharedPreferenceChangeListener(uv0Var2);
            Iterator it2 = listAsList2.iterator();
            while (it2.hasNext()) {
                uv0Var2.onSharedPreferenceChanged(sharedPreferences, (String) it2.next());
            }
        }
        String strZzk = zzv.zzp().d().zzk();
        synchronized (this) {
            if (!TextUtils.isEmpty(strZzk)) {
                try {
                    JSONObject jSONObject = new JSONObject(strZzk);
                    k(jSONObject.optBoolean("isTestMode", false), false);
                    j((pv0) Enum.valueOf(pv0.class, jSONObject.optString("gesture", "NONE")), false);
                    this.f9022o = jSONObject.optString("networkExtras", "{}");
                    this.f9024q = jSONObject.optLong("networkExtrasExpirationSecs", Long.MAX_VALUE);
                } catch (JSONException unused) {
                }
            }
        }
        this.f9030x = zzv.zzp().d().zzl();
    }

    public final void i() {
        String string;
        zzj zzjVarD = zzv.zzp().d();
        synchronized (this) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("isTestMode", this.s);
                jSONObject.put("gesture", this.f9025r);
                if (this.f9024q > zzv.zzC().a() / 1000) {
                    jSONObject.put("networkExtras", this.f9022o);
                    jSONObject.put("networkExtrasExpirationSecs", this.f9024q);
                }
            } catch (JSONException unused) {
            }
            string = jSONObject.toString();
        }
        zzjVarD.zzB(string);
    }

    public final synchronized void j(pv0 pv0Var, boolean z6) {
        try {
            if (this.f9025r != pv0Var) {
                if (f()) {
                    l();
                }
                this.f9025r = pv0Var;
                if (f()) {
                    m();
                }
                if (z6) {
                    i();
                }
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:3:0x0001, B:6:0x0006, B:8:0x000a, B:10:0x001c, B:15:0x0029, B:20:0x0038, B:16:0x002d, B:18:0x0033), top: B:27:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void k(boolean z6, boolean z7) {
        try {
            if (this.s != z6) {
                this.s = z6;
                if (z6) {
                    if (!((Boolean) zzbe.zzc().a(zn.c9)).booleanValue() || !zzv.zzt().zzl()) {
                        m();
                    } else if (!f()) {
                        l();
                    }
                    if (z7) {
                        i();
                    }
                }
            }
        } finally {
        }
    }

    public final synchronized void l() {
        SensorManager sensorManager;
        Sensor sensor;
        try {
            int iOrdinal = this.f9025r.ordinal();
            if (iOrdinal == 1) {
                fw0 fw0Var = this.f9010b;
                synchronized (fw0Var) {
                    try {
                        if (fw0Var.f4813g) {
                            SensorManager sensorManager2 = fw0Var.f4808b;
                            if (sensorManager2 != null) {
                                sensorManager2.unregisterListener(fw0Var, fw0Var.f4809c);
                                zze.zza("Stopped listening for shake gestures.");
                            }
                            fw0Var.f4813g = false;
                        }
                    } finally {
                    }
                }
                return;
            }
            if (iOrdinal != 2) {
                return;
            }
            iv0 iv0Var = this.f9011c;
            synchronized (iv0Var) {
                try {
                    if (iv0Var.f5870j && (sensorManager = iv0Var.f5862a) != null && (sensor = iv0Var.f5863b) != null) {
                        sensorManager.unregisterListener(iv0Var, sensor);
                        iv0Var.f5870j = false;
                        zze.zza("Stopped listening for flick gestures.");
                    }
                } finally {
                }
            }
            return;
        } catch (Throwable th) {
            throw th;
        }
        throw th;
    }

    public final synchronized void m() {
        int iOrdinal = this.f9025r.ordinal();
        if (iOrdinal == 1) {
            this.f9010b.b();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            this.f9011c.b();
        }
    }
}
