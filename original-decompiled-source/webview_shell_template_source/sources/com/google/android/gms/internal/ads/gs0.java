package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzv;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class gs0 {

    /* renamed from: b, reason: collision with root package name */
    public final zza f5141b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f5142c;

    /* renamed from: d, reason: collision with root package name */
    public final cu0 f5143d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f5144e;

    /* renamed from: f, reason: collision with root package name */
    public final mf f5145f;

    /* renamed from: g, reason: collision with root package name */
    public final VersionInfoParcel f5146g;

    /* renamed from: i, reason: collision with root package name */
    public final dz0 f5147i;

    /* renamed from: j, reason: collision with root package name */
    public final cf1 f5148j;

    /* renamed from: k, reason: collision with root package name */
    public final oz0 f5149k;

    /* renamed from: l, reason: collision with root package name */
    public final fc1 f5150l;

    /* renamed from: m, reason: collision with root package name */
    public hr1 f5151m;

    /* renamed from: a, reason: collision with root package name */
    public final yr0 f5140a = new yr0();
    public final lu h = new lu();

    public gs0(es0 es0Var) {
        this.f5142c = es0Var.f4374b;
        this.f5144e = es0Var.f4377e;
        this.f5145f = es0Var.f4378f;
        this.f5146g = es0Var.f4379g;
        this.f5141b = es0Var.f4373a;
        this.f5147i = es0Var.f4376d;
        this.f5148j = es0Var.h;
        this.f5143d = es0Var.f4375c;
        this.f5149k = es0Var.f4380i;
        this.f5150l = es0Var.f4381j;
    }

    public final synchronized c5.a a(final String str, final JSONObject jSONObject) {
        hr1 hr1Var = this.f5151m;
        if (hr1Var == null) {
            return ds1.f4001t;
        }
        return bs1.p(hr1Var, new pr1() { // from class: com.google.android.gms.internal.ads.zr0
            @Override // com.google.android.gms.internal.ads.pr1
            public final c5.a zza(Object obj) throws JSONException {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                xa0 xa0Var = (xa0) obj;
                lu luVar = this.f11571a.h;
                luVar.getClass();
                o70 o70Var = new o70();
                zzv.zzq();
                String string = UUID.randomUUID().toString();
                luVar.a(string, new ju(o70Var));
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("id", string);
                    jSONObject3.put("args", jSONObject2);
                    xa0Var.l0(str2, jSONObject3);
                    return o70Var;
                } catch (Exception e6) {
                    o70Var.b(e6);
                    return o70Var;
                }
            }
        }, this.f5144e);
    }

    public final synchronized void b(Map map) {
        hr1 hr1Var = this.f5151m;
        if (hr1Var == null) {
            return;
        }
        xj1 xj1Var = new xj1(12, map);
        hr1Var.addListener(new as1(0, hr1Var, xj1Var), this.f5144e);
    }

    public final synchronized void c(String str, yt ytVar) {
        hr1 hr1Var = this.f5151m;
        if (hr1Var == null) {
            return;
        }
        ni0 ni0Var = new ni0(11, str, ytVar);
        hr1Var.addListener(new as1(0, hr1Var, ni0Var), this.f5144e);
    }

    public final synchronized void d(String str, yt ytVar) {
        hr1 hr1Var = this.f5151m;
        if (hr1Var == null) {
            return;
        }
        lo loVar = new lo(3, str, ytVar);
        hr1Var.addListener(new as1(0, hr1Var, loVar), this.f5144e);
    }
}
