package com.google.android.gms.internal.ads;

import android.os.Handler;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class m50 implements Runnable {
    public final /* synthetic */ int s;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.s) {
            case 0:
                me0.h("Pinged SB successfully.");
                break;
            default:
                Handler handler = oh1.f7760i;
                if (handler != null) {
                    handler.post(oh1.f7761j);
                    oh1.f7760i.postDelayed(oh1.f7762k, 200L);
                    break;
                }
                break;
        }
    }
}
