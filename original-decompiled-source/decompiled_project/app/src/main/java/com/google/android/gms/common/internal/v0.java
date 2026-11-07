package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes2.dex */
public final class v0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final int f6203a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f6204b;

    public v0(b bVar, int i10) {
        this.f6204b = bVar;
        this.f6203a = i10;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        b bVar = this.f6204b;
        if (iBinder == null) {
            b.zzk(bVar, 16);
            return;
        }
        synchronized (bVar.zzq) {
            try {
                b bVar2 = this.f6204b;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                bVar2.zzr = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof l)) ? new o0(iBinder) : (l) iInterfaceQueryLocalInterface;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f6204b.zzl(0, null, this.f6203a);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f6204b.zzq) {
            this.f6204b.zzr = null;
        }
        b bVar = this.f6204b;
        int i10 = this.f6203a;
        Handler handler = bVar.zzb;
        handler.sendMessage(handler.obtainMessage(6, i10, 1));
    }
}
