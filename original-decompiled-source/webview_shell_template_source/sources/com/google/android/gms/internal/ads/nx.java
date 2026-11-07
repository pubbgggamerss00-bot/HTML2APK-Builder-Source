package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class nx implements ku {

    /* renamed from: a, reason: collision with root package name */
    public final zw f7528a;

    /* renamed from: b, reason: collision with root package name */
    public final o70 f7529b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ox f7530c;

    public nx(ox oxVar, zw zwVar, o70 o70Var) {
        this.f7530c = oxVar;
        this.f7528a = zwVar;
        this.f7529b = o70Var;
    }

    @Override // com.google.android.gms.internal.ads.ku
    public final void a(JSONObject jSONObject) {
        zw zwVar = this.f7528a;
        o70 o70Var = this.f7529b;
        try {
            try {
                o70Var.a(this.f7530c.f7878a.c(jSONObject));
            } catch (IllegalStateException unused) {
            } catch (JSONException e6) {
                o70Var.b(e6);
            }
        } finally {
            zwVar.e();
        }
    }

    @Override // com.google.android.gms.internal.ads.ku
    public final void zza(String str) {
        zw zwVar = this.f7528a;
        o70 o70Var = this.f7529b;
        try {
            if (str == null) {
                o70Var.b(new fx());
            } else {
                o70Var.b(new fx(str));
            }
        } catch (IllegalStateException unused) {
        } catch (Throwable th) {
            zwVar.e();
            throw th;
        }
        zwVar.e();
    }
}
