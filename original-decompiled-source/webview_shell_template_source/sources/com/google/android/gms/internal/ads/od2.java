package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class od2 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pd2 f7732a;

    public /* synthetic */ od2(pd2 pd2Var) {
        this.f7732a = pd2Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (isInitialStickyBroadcast()) {
            return;
        }
        pd2 pd2Var = this.f7732a;
        pd2Var.b(ld2.c(context, intent, pd2Var.h, pd2Var.f8047g));
    }
}
