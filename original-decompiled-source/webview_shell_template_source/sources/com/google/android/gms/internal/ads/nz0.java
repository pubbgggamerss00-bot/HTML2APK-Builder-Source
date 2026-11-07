package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import com.google.android.gms.ads.internal.overlay.zzm;
import java.util.Timer;
import java.util.TimerTask;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class nz0 extends TimerTask {
    public final /* synthetic */ AlertDialog s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Timer f7532t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ zzm f7533u;

    public nz0(AlertDialog alertDialog, Timer timer, zzm zzmVar) {
        this.s = alertDialog;
        this.f7532t = timer;
        this.f7533u = zzmVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.s.dismiss();
        this.f7532t.cancel();
        zzm zzmVar = this.f7533u;
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }
}
