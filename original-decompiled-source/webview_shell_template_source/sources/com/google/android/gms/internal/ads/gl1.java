package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class gl1 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hl1 f5088a;

    public /* synthetic */ gl1(hl1 hl1Var) {
        this.f5088a = hl1Var;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        hl1 hl1Var = this.f5088a;
        hl1Var.f5439c.c("LmdServiceConnectionManager.onServiceConnected(%s)", componentName);
        hl1Var.a(new q(12, this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        hl1 hl1Var = this.f5088a;
        hl1Var.f5439c.c("LmdServiceConnectionManager.onServiceDisconnected(%s)", componentName);
        hl1Var.a(new x(21, this));
    }
}
