package com.google.android.gms.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.google.android.gms.internal.ads.hw0;
import com.google.android.gms.internal.ads.j31;
import com.google.android.gms.internal.ads.ou0;
import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class m extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2370a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2371b;

    public /* synthetic */ m(int i6, Object obj) {
        this.f2370a = i6;
        this.f2371b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onReceive(Context context, Intent intent) {
        switch (this.f2370a) {
            case 0:
                zzs zzsVar = (zzs) this.f2371b;
                if (Objects.equals(intent.getAction(), "android.intent.action.USER_PRESENT")) {
                    zzsVar.zzf = true;
                    return;
                } else {
                    if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                        zzsVar.zzf = false;
                        return;
                    }
                    return;
                }
            default:
                hw0 hw0Var = (hw0) this.f2371b;
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                int i6 = 0;
                if (connectivityManager != null) {
                    try {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            i6 = 1;
                        } else {
                            int type = activeNetworkInfo.getType();
                            if (type == 0) {
                                switch (activeNetworkInfo.getSubtype()) {
                                    case 1:
                                    case 2:
                                        i6 = 3;
                                        break;
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 14:
                                    case 15:
                                    case 17:
                                        i6 = 4;
                                        break;
                                    case 13:
                                        i6 = 5;
                                        break;
                                    case 16:
                                    case 19:
                                    default:
                                        i6 = 6;
                                        break;
                                    case 18:
                                        i6 = 2;
                                        break;
                                    case 20:
                                        if (j31.f5914a >= 29) {
                                            i6 = 9;
                                            break;
                                        }
                                        break;
                                }
                            } else if (type != 1) {
                                if (type != 4 && type != 5) {
                                    if (type != 6) {
                                        i6 = type != 9 ? 8 : 7;
                                    }
                                }
                            }
                        }
                    } catch (SecurityException unused) {
                    }
                }
                if (j31.f5914a < 31 || i6 != 5) {
                    hw0.c(hw0Var, i6);
                    return;
                }
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                    if (telephonyManager == null) {
                        throw null;
                    }
                    ou0 ou0Var = new ou0(hw0Var);
                    telephonyManager.registerTelephonyCallback(context.getMainExecutor(), ou0Var);
                    telephonyManager.unregisterTelephonyCallback(ou0Var);
                    return;
                } catch (RuntimeException unused2) {
                    hw0.c(hw0Var, 5);
                    return;
                }
        }
    }
}
