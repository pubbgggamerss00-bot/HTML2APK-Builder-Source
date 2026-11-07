package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.io.IOException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class s60 implements Runnable {
    public final /* synthetic */ Context s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ o70 f8816t;

    public s60(Context context, o70 o70Var) {
        this.s = context;
        this.f8816t = o70Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o70 o70Var = this.f8816t;
        try {
            o70Var.a(AdvertisingIdClient.getAdvertisingIdInfo(this.s));
        } catch (c3.i | IOException | IllegalStateException e6) {
            o70Var.b(e6);
            zzo.zzh("Exception while getting advertising Id info", e6);
        }
    }
}
