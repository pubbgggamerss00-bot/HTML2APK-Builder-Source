package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.BatteryManager;
import android.telephony.TelephonyManager;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class i61 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5575a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q81 f5576b;

    public /* synthetic */ i61(q81 q81Var, int i6) {
        this.f5575a = i6;
        this.f5576b = q81Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int intExtra;
        boolean zIsCharging;
        int intExtra2;
        boolean zIsActiveNetworkMetered;
        int i6;
        switch (this.f5575a) {
            case 0:
                k61 k61Var = (k61) this.f5576b;
                boolean z6 = true;
                if (((Boolean) zzbe.zzc().a(zn.Sb)).booleanValue()) {
                    BatteryManager batteryManager = (BatteryManager) k61Var.f6267b.getSystemService("batterymanager");
                    intExtra = batteryManager != null ? batteryManager.getIntProperty(4) / 100.0d : -1.0d;
                    if (batteryManager != null) {
                        zIsCharging = batteryManager.isCharging();
                        return new l61(intExtra, zIsCharging);
                    }
                    Intent intentA = k61Var.a();
                    if (intentA == null || ((intExtra2 = intentA.getIntExtra("status", -1)) != 2 && intExtra2 != 5)) {
                        z6 = false;
                    }
                } else {
                    Intent intentA2 = k61Var.a();
                    if (intentA2 == null || ((intExtra = intentA2.getIntExtra("status", -1)) != 2 && intExtra != 5)) {
                        z6 = false;
                    }
                    if (intentA2 != null) {
                        intExtra = intentA2.getIntExtra("level", -1) / intentA2.getIntExtra("scale", -1);
                    }
                }
                zIsCharging = z6;
                return new l61(intExtra, zIsCharging);
            default:
                Context context = ((a91) this.f5576b).f2632b;
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                String networkOperator = telephonyManager.getNetworkOperator();
                int phoneType = telephonyManager.getPhoneType();
                zzv.zzq();
                int i7 = -1;
                if (zzs.zzB(context, "android.permission.ACCESS_NETWORK_STATE")) {
                    ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo != null) {
                        int type = activeNetworkInfo.getType();
                        int iOrdinal = activeNetworkInfo.getDetailedState().ordinal();
                        i6 = type;
                        i7 = iOrdinal;
                    } else {
                        i6 = -1;
                    }
                    zIsActiveNetworkMetered = connectivityManager.isActiveNetworkMetered();
                } else {
                    zIsActiveNetworkMetered = false;
                    i6 = -2;
                }
                return new z81(networkOperator, i6, zzv.zzr().zzm(context), phoneType, zIsActiveNetworkMetered, i7);
        }
    }
}
