package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class sf {

    /* renamed from: a, reason: collision with root package name */
    public NetworkCapabilities f8914a;

    public static sf a(Context context) {
        if (context == null) {
            return null;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        sf sfVar = new sf();
        if (connectivityManager != null) {
            try {
                connectivityManager.registerDefaultNetworkCallback(new rf(sfVar));
                return sfVar;
            } catch (RuntimeException unused) {
                synchronized (sf.class) {
                    sfVar.f8914a = null;
                }
            }
        }
        return sfVar;
    }
}
