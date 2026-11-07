package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.ads.internal.client.zzbe;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class k61 implements q81 {

    /* renamed from: a, reason: collision with root package name */
    public final hs1 f6266a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f6267b;

    public k61(Context context, hs1 hs1Var) {
        this.f6266a = hs1Var;
        this.f6267b = context;
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final Intent a() {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        boolean zBooleanValue = ((Boolean) zzbe.zzc().a(zn.Ra)).booleanValue();
        Context context = this.f6267b;
        return (!zBooleanValue || Build.VERSION.SDK_INT < 33) ? context.registerReceiver(null, intentFilter) : context.registerReceiver(null, intentFilter, 4);
    }

    @Override // com.google.android.gms.internal.ads.q81
    public final int zza() {
        return 14;
    }

    @Override // com.google.android.gms.internal.ads.q81
    @SuppressLint({"UnprotectedReceiver"})
    public final c5.a zzb() {
        return this.f6266a.u(new i61(this, 0));
    }
}
