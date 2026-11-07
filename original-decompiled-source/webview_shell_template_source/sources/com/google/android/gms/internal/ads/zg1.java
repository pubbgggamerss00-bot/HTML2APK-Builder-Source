package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zg1 extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ah1 ah1Var = ah1.f2759d;
        if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
            ah1Var.a(true, ah1Var.f2762c);
            ah1Var.f2761b = true;
        } else if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
            ah1Var.a(false, ah1Var.f2762c);
            ah1Var.f2761b = false;
        }
    }
}
