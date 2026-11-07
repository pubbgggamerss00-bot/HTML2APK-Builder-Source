package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import java.util.ArrayList;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class uz0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f9667a;

    /* renamed from: b, reason: collision with root package name */
    public final VersionInfoParcel f9668b;

    /* renamed from: c, reason: collision with root package name */
    public final tb1 f9669c;

    /* renamed from: d, reason: collision with root package name */
    public final xa0 f9670d;

    /* renamed from: e, reason: collision with root package name */
    public final cu0 f9671e;

    /* renamed from: f, reason: collision with root package name */
    public t31 f9672f;

    public uz0(Context context, VersionInfoParcel versionInfoParcel, tb1 tb1Var, xa0 xa0Var, cu0 cu0Var) {
        this.f9667a = context;
        this.f9668b = versionInfoParcel;
        this.f9669c = tb1Var;
        this.f9670d = xa0Var;
        this.f9671e = cu0Var;
    }

    public final synchronized void a(View view) {
        t31 t31Var = this.f9672f;
        if (t31Var != null) {
            ((sz0) zzv.zzB()).getClass();
            sz0.j(new wx(8, t31Var, view));
        }
    }

    public final synchronized void b() {
        xa0 xa0Var;
        if (this.f9672f == null || (xa0Var = this.f9670d) == null) {
            return;
        }
        xa0Var.G("onSdkImpression", ip1.f5823y);
    }

    public final synchronized void c() {
        xa0 xa0Var;
        try {
            t31 t31Var = this.f9672f;
            if (t31Var == null || (xa0Var = this.f9670d) == null) {
                return;
            }
            ArrayList arrayListH = xa0Var.H();
            int size = arrayListH.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj = arrayListH.get(i6);
                i6++;
                ((sz0) zzv.zzB()).getClass();
                sz0.j(new wx(8, t31Var, (View) obj));
            }
            this.f9670d.G("onSdkLoaded", ip1.f5823y);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean d() {
        if (this.f9669c.T) {
            if (((Boolean) zzbe.zzc().a(zn.f11371c5)).booleanValue()) {
                if (((Boolean) zzbe.zzc().a(zn.f11394f5)).booleanValue() && this.f9670d != null) {
                    if (this.f9672f != null) {
                        zzo.zzj("Omid javascript session service already started for ad.");
                        return false;
                    }
                    if (!((sz0) zzv.zzB()).f(this.f9667a)) {
                        zzo.zzj("Unable to initialize omid.");
                        return false;
                    }
                    l2 l2Var = this.f9669c.V;
                    l2Var.getClass();
                    if (((JSONObject) l2Var.f6565t).optBoolean((String) zzbe.zzc().a(zn.f11406h5), true)) {
                        t31 t31VarB = ((sz0) zzv.zzB()).b(this.f9668b, this.f9670d.u());
                        if (((Boolean) zzbe.zzc().a(zn.f11400g5)).booleanValue()) {
                            cu0 cu0Var = this.f9671e;
                            String str = t31VarB != null ? "1" : "0";
                            bu0 bu0VarA = cu0Var.a();
                            bu0VarA.a("omid_js_session_success", str);
                            bu0VarA.c();
                        }
                        if (t31VarB == null) {
                            zzo.zzj("Unable to create javascript session service.");
                            return false;
                        }
                        zzo.zzi("Created omid javascript session service.");
                        this.f9672f = t31VarB;
                        this.f9670d.U(this);
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
