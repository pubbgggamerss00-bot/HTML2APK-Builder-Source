package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class uj1 extends Handler {
    public uj1() {
        Looper.getMainLooper();
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        zza(message);
    }

    public void zza(Message message) {
        super.dispatchMessage(message);
    }

    public uj1(Looper looper) {
        super(looper);
        Looper.getMainLooper();
    }
}
