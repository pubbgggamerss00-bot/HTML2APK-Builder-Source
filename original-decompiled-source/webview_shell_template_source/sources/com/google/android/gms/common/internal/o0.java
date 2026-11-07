package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class o0 extends e0 {

    /* renamed from: g, reason: collision with root package name */
    public final IBinder f2477g;
    public final /* synthetic */ b h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(b bVar, int i6, IBinder iBinder, Bundle bundle) {
        super(bVar, i6, bundle);
        this.h = bVar;
        this.f2477g = iBinder;
    }

    @Override // com.google.android.gms.common.internal.e0
    public final boolean b() throws RemoteException {
        IBinder iBinder = this.f2477g;
        try {
            l.f(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            b bVar = this.h;
            if (!bVar.getServiceDescriptor().equals(interfaceDescriptor)) {
                String serviceDescriptor = bVar.getServiceDescriptor();
                StringBuilder sb = new StringBuilder(String.valueOf(serviceDescriptor).length() + 34 + String.valueOf(interfaceDescriptor).length());
                sb.append("service descriptor mismatch: ");
                sb.append(serviceDescriptor);
                sb.append(" vs. ");
                sb.append(interfaceDescriptor);
                Log.w("GmsClient", sb.toString());
                return false;
            }
            IInterface iInterfaceCreateServiceInterface = bVar.createServiceInterface(iBinder);
            if (iInterfaceCreateServiceInterface == null || !(bVar.zze(2, 4, iInterfaceCreateServiceInterface) || bVar.zze(3, 4, iInterfaceCreateServiceInterface))) {
                return false;
            }
            bVar.zzn(null);
            b.a aVarZzk = bVar.zzk();
            Bundle connectionHint = bVar.getConnectionHint();
            if (aVarZzk == null) {
                return true;
            }
            bVar.zzk().o(connectionHint);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }

    @Override // com.google.android.gms.common.internal.e0
    public final void c(c3.b bVar) {
        b bVar2 = this.h;
        if (bVar2.zzl() != null) {
            bVar2.zzl().r(bVar);
        }
        bVar2.onConnectionFailed(bVar);
    }
}
