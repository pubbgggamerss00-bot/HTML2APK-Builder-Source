package com.google.android.gms.internal.ads;

import android.os.Looper;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class l80 implements Runnable {
    public final /* synthetic */ int s;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.s) {
            case 0:
                Looper.myLooper().quit();
                break;
        }
    }

    private final void a() {
    }
}
