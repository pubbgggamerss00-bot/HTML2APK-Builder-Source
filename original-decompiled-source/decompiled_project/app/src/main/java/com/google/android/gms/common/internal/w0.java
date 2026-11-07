package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* loaded from: classes2.dex */
public final class w0 extends l0 {

    /* renamed from: g, reason: collision with root package name */
    public final IBinder f6205g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ b f6206h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(b bVar, int i10, IBinder iBinder, Bundle bundle) {
        super(bVar, i10, bundle);
        this.f6206h = bVar;
        this.f6205g = iBinder;
    }

    @Override // com.google.android.gms.common.internal.l0
    public final void c(pa.a aVar) {
        b bVar = this.f6206h;
        if (bVar.zzx != null) {
            bVar.zzx.b(aVar);
        }
        bVar.onConnectionFailed(aVar);
    }

    @Override // com.google.android.gms.common.internal.l0
    public final boolean d() throws RemoteException {
        IBinder iBinder = this.f6205g;
        try {
            p.f(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            b bVar = this.f6206h;
            if (!bVar.getServiceDescriptor().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + bVar.getServiceDescriptor() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface iInterfaceCreateServiceInterface = bVar.createServiceInterface(iBinder);
            if (iInterfaceCreateServiceInterface == null || !(b.zzn(bVar, 2, 4, iInterfaceCreateServiceInterface) || b.zzn(bVar, 3, 4, iInterfaceCreateServiceInterface))) {
                return false;
            }
            bVar.zzC = null;
            Bundle connectionHint = bVar.getConnectionHint();
            if (bVar.zzw == null) {
                return true;
            }
            bVar.zzw.a(connectionHint);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
