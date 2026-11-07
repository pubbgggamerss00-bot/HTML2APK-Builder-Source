package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import org.json.JSONException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class qu0 {

    /* renamed from: a, reason: collision with root package name */
    public final uu f8455a;

    public qu0(uu uuVar) {
        this.f8455a = uuVar;
    }

    public final void a(long j6) throws JSONException {
        pu0 pu0Var = new pu0("creation");
        pu0Var.f8150a = Long.valueOf(j6);
        pu0Var.f8152c = "nativeObjectNotCreated";
        b(pu0Var);
    }

    public final void b(pu0 pu0Var) throws JSONException {
        String strA = pu0.a(pu0Var);
        zzo.zzi("Dispatching AFMA event on publisher webview: ".concat(strA));
        this.f8455a.zzb(strA);
    }
}
