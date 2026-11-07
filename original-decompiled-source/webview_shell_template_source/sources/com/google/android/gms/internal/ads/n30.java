package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class n30 extends me {

    /* renamed from: t, reason: collision with root package name */
    public final Object f7305t;

    /* renamed from: u, reason: collision with root package name */
    public final Context f7306u;

    /* renamed from: v, reason: collision with root package name */
    public SharedPreferences f7307v;

    /* renamed from: w, reason: collision with root package name */
    public final ox f7308w;

    /* renamed from: x, reason: collision with root package name */
    public final VersionInfoParcel f7309x;

    public n30(Context context, ox oxVar, VersionInfoParcel versionInfoParcel) {
        super(1);
        this.f7305t = new Object();
        this.f7306u = context.getApplicationContext();
        this.f7309x = versionInfoParcel;
        this.f7308w = oxVar;
    }

    public static JSONObject r(Context context, VersionInfoParcel versionInfoParcel) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            if (((Boolean) rp.f8675b.c()).booleanValue()) {
                jSONObject.put("package_name", context.getPackageName());
            }
            jSONObject.put("js", versionInfoParcel.afmaVersion);
            jSONObject.put("mf", rp.f8676c.c());
            jSONObject.put("cl", "697668803");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", 12451000);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", DynamiteModule.d(context, ModuleDescriptor.MODULE_ID, false));
            jSONObject.put("container_version", 12451000);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final c5.a q() {
        synchronized (this.f7305t) {
            try {
                if (this.f7307v == null) {
                    this.f7307v = this.f7306u.getSharedPreferences("google_ads_flags_meta", 0);
                }
            } finally {
            }
        }
        SharedPreferences sharedPreferences = this.f7307v;
        if (zzv.zzC().a() - (sharedPreferences != null ? sharedPreferences.getLong("js_last_update", 0L) : 0L) < ((Long) rp.f8677d.c()).longValue()) {
            return ds1.f4001t;
        }
        return bs1.o(this.f7308w.a(r(this.f7306u, this.f7309x)), new m30(0, this), i70.f5592g);
    }
}
