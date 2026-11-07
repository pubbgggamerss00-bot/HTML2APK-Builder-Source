package com.google.android.gms.ads.internal.util.client;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b extends Thread {
    public final /* synthetic */ String s;

    public b(String str) {
        this.s = str;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        new zzu(null).zza(this.s);
    }
}
