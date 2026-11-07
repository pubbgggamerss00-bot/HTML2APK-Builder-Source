package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.google.android.gms.ads.internal.util.zzj;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ry0 extends lo {
    public static final SparseArray A;

    /* renamed from: v, reason: collision with root package name */
    public final Context f8734v;

    /* renamed from: w, reason: collision with root package name */
    public final dk0 f8735w;

    /* renamed from: x, reason: collision with root package name */
    public final TelephonyManager f8736x;

    /* renamed from: y, reason: collision with root package name */
    public final my0 f8737y;

    /* renamed from: z, reason: collision with root package name */
    public bn f8738z;

    static {
        SparseArray sparseArray = new SparseArray();
        A = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), al.CONNECTED);
        int iOrdinal = NetworkInfo.DetailedState.AUTHENTICATING.ordinal();
        al alVar = al.CONNECTING;
        sparseArray.put(iOrdinal, alVar);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), alVar);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), alVar);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), al.DISCONNECTING);
        int iOrdinal2 = NetworkInfo.DetailedState.BLOCKED.ordinal();
        al alVar2 = al.DISCONNECTED;
        sparseArray.put(iOrdinal2, alVar2);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), alVar2);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), alVar2);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), alVar2);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), alVar2);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), al.SUSPENDED);
        sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), alVar);
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), alVar);
    }

    public ry0(Context context, dk0 dk0Var, my0 my0Var, jy0 jy0Var, zzj zzjVar) {
        super(jy0Var, zzjVar, 6, false);
        this.f8734v = context;
        this.f8735w = dk0Var;
        this.f8737y = my0Var;
        this.f8736x = (TelephonyManager) context.getSystemService("phone");
    }
}
