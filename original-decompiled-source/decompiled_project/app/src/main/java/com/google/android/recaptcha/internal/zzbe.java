package com.google.android.recaptcha.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.r;
import pg.n;
import qg.b0;
import qg.k0;

/* loaded from: classes2.dex */
public final class zzbe {
    public zzbe() {
        new ConcurrentHashMap();
        zzb();
    }

    public static final Set zza(Context context) {
        try {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Object systemService = context.getSystemService("connectivity");
            r.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities != null && networkCapabilities.hasTransport(1)) {
                linkedHashSet.add(zzqi.TRANSPORT_WIFI);
            }
            if (networkCapabilities != null && networkCapabilities.hasTransport(0)) {
                linkedHashSet.add(zzqi.TRANSPORT_CELLULAR);
            }
            if (networkCapabilities != null && networkCapabilities.hasTransport(4)) {
                linkedHashSet.add(zzqi.TRANSPORT_VPN);
            }
            if (networkCapabilities != null && networkCapabilities.hasTransport(3)) {
                linkedHashSet.add(zzqi.TRANSPORT_ETHERNET);
            }
            if (networkCapabilities != null && networkCapabilities.hasCapability(16)) {
                linkedHashSet.add(zzqi.NET_CAPABILITY_VALIDATED);
            }
            return linkedHashSet;
        } catch (Exception unused) {
            return b0.f22711a;
        }
    }

    private static final Map zzb() {
        LinkedHashMap linkedHashMapE = k0.e(new n(0, zzqi.NET_CAPABILITY_MMS), new n(1, zzqi.NET_CAPABILITY_SUPL), new n(2, zzqi.NET_CAPABILITY_DUN), new n(3, zzqi.NET_CAPABILITY_FOTA), new n(4, zzqi.NET_CAPABILITY_IMS), new n(5, zzqi.NET_CAPABILITY_CBS), new n(6, zzqi.NET_CAPABILITY_WIFI_P2P), new n(7, zzqi.NET_CAPABILITY_IA), new n(8, zzqi.NET_CAPABILITY_RCS), new n(9, zzqi.NET_CAPABILITY_XCAP), new n(10, zzqi.NET_CAPABILITY_EIMS), new n(11, zzqi.NET_CAPABILITY_NOT_METERED), new n(12, zzqi.NET_CAPABILITY_INTERNET), new n(13, zzqi.NET_CAPABILITY_NOT_RESTRICTED), new n(14, zzqi.NET_CAPABILITY_TRUSTED), new n(15, zzqi.NET_CAPABILITY_NOT_VPN));
        int i10 = Build.VERSION.SDK_INT;
        linkedHashMapE.put(17, zzqi.NET_CAPABILITY_CAPTIVE_PORTAL);
        linkedHashMapE.put(16, zzqi.NET_CAPABILITY_VALIDATED);
        linkedHashMapE.put(18, zzqi.NET_CAPABILITY_NOT_ROAMING);
        linkedHashMapE.put(19, zzqi.NET_CAPABILITY_FOREGROUND);
        linkedHashMapE.put(20, zzqi.NET_CAPABILITY_NOT_CONGESTED);
        linkedHashMapE.put(21, zzqi.NET_CAPABILITY_NOT_SUSPENDED);
        if (i10 >= 29) {
            linkedHashMapE.put(23, zzqi.NET_CAPABILITY_MCX);
        }
        if (i10 >= 30) {
            linkedHashMapE.put(25, zzqi.NET_CAPABILITY_TEMPORARILY_NOT_METERED);
        }
        if (i10 >= 31) {
            linkedHashMapE.put(32, zzqi.NET_CAPABILITY_HEAD_UNIT);
            linkedHashMapE.put(29, zzqi.NET_CAPABILITY_ENTERPRISE);
        }
        if (i10 >= 33) {
            linkedHashMapE.put(35, zzqi.NET_CAPABILITY_PRIORITIZE_BANDWIDTH);
            linkedHashMapE.put(34, zzqi.NET_CAPABILITY_PRIORITIZE_LATENCY);
            linkedHashMapE.put(33, zzqi.NET_CAPABILITY_MMTEL);
        }
        return linkedHashMapE;
    }
}
