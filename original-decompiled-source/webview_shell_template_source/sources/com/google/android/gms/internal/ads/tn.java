package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbe;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class tn {

    /* renamed from: a, reason: collision with root package name */
    public final int f9348a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9349b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f9350c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f9351d;

    public tn(int i6, Object obj, Object obj2, String str) {
        this.f9348a = i6;
        this.f9349b = str;
        this.f9350c = obj;
        this.f9351d = obj2;
        zzbe.zza().f9587a.add(this);
    }

    public static on e(int i6, int i7, String str) {
        return new on(1, Integer.valueOf(i6), Integer.valueOf(i7), str);
    }

    public static pn f(String str, long j6, long j7) {
        return new pn(1, Long.valueOf(j6), Long.valueOf(j7), str);
    }

    public static void g() {
        zzbe.zza().f9588b.add(new sn(1, null, null, "gads:sdk_core_constants:experiment_id"));
    }

    public abstract Object a(JSONObject jSONObject);

    public abstract Object b(Bundle bundle);

    public abstract Object c(SharedPreferences sharedPreferences);

    public abstract void d(SharedPreferences.Editor editor, Object obj);

    public final Object h() {
        return zzbe.zzc().f10637i ? this.f9351d : this.f9350c;
    }
}
