package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class n0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final int f2474a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f2475b;

    public n0(b bVar, int i6) {
        this.f2475b = bVar;
        this.f2474a = i6;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        b bVar = this.f2475b;
        if (iBinder == null) {
            bVar.zzf(16);
            return;
        }
        synchronized (bVar.zzh()) {
            try {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                bVar.zzi((iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof i)) ? new f0(iBinder) : (i) iInterfaceQueryLocalInterface);
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f2475b.zzb(0, null, this.f2474a);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        b bVar = this.f2475b;
        synchronized (bVar.zzh()) {
            bVar.zzi(null);
        }
        b bVar2 = this.f2475b;
        int i6 = this.f2474a;
        Handler handler = bVar2.zzb;
        handler.sendMessage(handler.obtainMessage(6, i6, 1));
    }
}
