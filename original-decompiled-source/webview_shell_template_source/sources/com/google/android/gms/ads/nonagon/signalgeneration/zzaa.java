package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.ads.ec1;
import com.google.android.gms.internal.ads.fu0;
import com.google.android.gms.internal.ads.i70;
import com.google.android.gms.internal.ads.ke1;
import com.google.android.gms.internal.ads.zn;
import com.google.android.gms.internal.ads.zt0;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzaa {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static ke1 zza(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle2 != null) {
            bundle = bundle2;
        }
        String string = bundle.getString("query_info_type");
        boolean zIsEmpty = TextUtils.isEmpty(string);
        ke1 ke1Var = ke1.SCAR_REQUEST_TYPE_UNSPECIFIED;
        if (zIsEmpty) {
            return ke1Var;
        }
        switch (string.hashCode()) {
            case 1743582862:
                if (string.equals("requester_type_0")) {
                    return ke1.SCAR_REQUEST_TYPE_ADMOB;
                }
                return ke1Var;
            case 1743582863:
                if (string.equals("requester_type_1")) {
                    return ke1.SCAR_REQUEST_TYPE_INBOUND_MEDIATION;
                }
                return ke1Var;
            case 1743582864:
                if (string.equals("requester_type_2")) {
                    return ke1.SCAR_REQUEST_TYPE_GBID;
                }
                return ke1Var;
            case 1743582865:
                if (string.equals("requester_type_3")) {
                    return ke1.SCAR_REQUEST_TYPE_GOLDENEYE;
                }
                return ke1Var;
            case 1743582866:
                if (string.equals("requester_type_4")) {
                    return ke1.SCAR_REQUEST_TYPE_YAVIN;
                }
                return ke1Var;
            case 1743582867:
                if (string.equals("requester_type_5")) {
                    return ke1.SCAR_REQUEST_TYPE_UNITY;
                }
                return ke1Var;
            case 1743582868:
                if (string.equals("requester_type_6")) {
                    return ke1.SCAR_REQUEST_TYPE_PAW;
                }
                return ke1Var;
            case 1743582869:
                if (string.equals("requester_type_7")) {
                    return ke1.SCAR_REQUEST_TYPE_GUILDER;
                }
                return ke1Var;
            case 1743582870:
                if (string.equals("requester_type_8")) {
                    return ke1.SCAR_REQUEST_TYPE_GAM_S2S;
                }
                return ke1Var;
            default:
                return ke1Var;
        }
    }

    public static String zzb(String str) {
        if (TextUtils.isEmpty(str)) {
            return "unspecified";
        }
        switch (str.hashCode()) {
            case 1743582862:
                return str.equals("requester_type_0") ? "0" : str;
            case 1743582863:
                return str.equals("requester_type_1") ? "1" : str;
            case 1743582864:
                return str.equals("requester_type_2") ? "2" : str;
            case 1743582865:
                return str.equals("requester_type_3") ? "3" : str;
            case 1743582866:
                return str.equals("requester_type_4") ? "4" : str;
            case 1743582867:
                return str.equals("requester_type_5") ? "5" : str;
            case 1743582868:
                return str.equals("requester_type_6") ? "6" : str;
            case 1743582869:
                return str.equals("requester_type_7") ? "7" : str;
            case 1743582870:
                return str.equals("requester_type_8") ? "8" : str;
            default:
                return str;
        }
    }

    public static String zzc(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        Bundle bundle;
        return (zzmVar == null || (bundle = zzmVar.zzc) == null) ? "unspecified" : bundle.getString("query_info_type");
    }

    public static void zzd(final fu0 fu0Var, zt0 zt0Var, final String str, final Pair... pairArr) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.M6)).booleanValue()) {
            final zt0 zt0Var2 = null;
            i70.f5586a.execute(new Runnable(zt0Var2, str, pairArr) { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzz
                public final /* synthetic */ String zzb;
                public final /* synthetic */ Pair[] zzc;

                {
                    this.zzb = str;
                    this.zzc = pairArr;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzaa.zze(this.zza, null, this.zzb, this.zzc);
                }
            });
        }
    }

    public static void zze(fu0 fu0Var, zt0 zt0Var, String str, Pair... pairArr) {
        fu0Var.getClass();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(fu0Var.f5483a);
        zzg(concurrentHashMap, "action", str);
        for (Pair pair : pairArr) {
            zzg(concurrentHashMap, (String) pair.first, (String) pair.second);
        }
        fu0Var.b(concurrentHashMap, false);
    }

    public static int zzf(ec1 ec1Var) {
        if (ec1Var.f4222r) {
            return 2;
        }
        com.google.android.gms.ads.internal.client.zzm zzmVar = ec1Var.f4209d;
        com.google.android.gms.ads.internal.client.zzc zzcVar = zzmVar.zzs;
        if (zzcVar == null && zzmVar.zzx == null) {
            return 1;
        }
        if (zzcVar == null || zzmVar.zzx == null) {
            return zzcVar != null ? 3 : 4;
        }
        return 5;
    }

    private static void zzg(Map map, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        map.put(str, str2);
    }
}
