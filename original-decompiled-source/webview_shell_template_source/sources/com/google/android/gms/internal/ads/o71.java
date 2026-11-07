package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class o71 implements p81 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7629a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7630b;

    public /* synthetic */ o71(int i6, Object obj) {
        this.f7629a = i6;
        this.f7630b = obj;
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final void a(Object obj) throws JSONException {
        boolean z6;
        boolean z7;
        switch (this.f7629a) {
            case 0:
                ck0 ck0Var = (ck0) obj;
                if (((sb1) this.f7630b) != null) {
                    if (((Boolean) zzbe.zzc().a(zn.Nb)).booleanValue()) {
                        return;
                    }
                    Bundle bundle = ck0Var.f3610a;
                    sb1 sb1Var = (sb1) this.f7630b;
                    synchronized (sb1Var.f8886c) {
                        sb1Var.b();
                        z6 = sb1Var.f8888e == 2;
                    }
                    bundle.putBoolean("render_in_browser", z6);
                    Bundle bundle2 = ck0Var.f3610a;
                    sb1 sb1Var2 = (sb1) this.f7630b;
                    synchronized (sb1Var2.f8886c) {
                        sb1Var2.b();
                        z7 = sb1Var2.f8888e == 3;
                    }
                    bundle2.putBoolean("disable_ml", z7);
                    return;
                }
                return;
            default:
                try {
                    ((JSONObject) obj).put("gms_sdk_env", ((l91) this.f7630b).f6630a);
                    return;
                } catch (JSONException unused) {
                    zze.zza("Failed putting version constants.");
                    return;
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final /* synthetic */ void zza(Object obj) {
        int i6 = this.f7629a;
    }

    private final /* synthetic */ void b(Object obj) {
    }

    private final /* synthetic */ void c(Object obj) {
    }
}
