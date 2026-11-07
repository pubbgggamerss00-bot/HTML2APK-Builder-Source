package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b implements View.OnTouchListener {
    public final /* synthetic */ zzu s;

    public b(zzu zzuVar) {
        this.s = zzuVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        zzu zzuVar = this.s;
        if (zzuVar.zzh == null) {
            return false;
        }
        zzuVar.zzh.f7110b.zzk(motionEvent);
        return false;
    }
}
