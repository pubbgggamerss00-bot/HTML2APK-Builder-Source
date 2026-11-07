package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;

/* loaded from: classes2.dex */
public abstract class n0 extends zzb {
    @Override // com.google.android.gms.internal.common.zzb
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            int i12 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) zzc.zza(parcel, Bundle.CREATOR);
            zzc.zzb(parcel);
            u0 u0Var = (u0) this;
            p.g(u0Var.f6201a, "onPostInitComplete can be called only once per call to getRemoteService");
            u0Var.f6201a.onPostInitHandler(i12, strongBinder, bundle, u0Var.f6202b);
            u0Var.f6201a = null;
        } else if (i10 == 2) {
            parcel.readInt();
            zzc.zzb(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i10 != 3) {
                return false;
            }
            int i13 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            y0 y0Var = (y0) zzc.zza(parcel, y0.CREATOR);
            zzc.zzb(parcel);
            u0 u0Var2 = (u0) this;
            b bVar = u0Var2.f6201a;
            p.g(bVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            p.f(y0Var);
            b.zzj(bVar, y0Var);
            Bundle bundle2 = y0Var.f6210a;
            p.g(u0Var2.f6201a, "onPostInitComplete can be called only once per call to getRemoteService");
            u0Var2.f6201a.onPostInitHandler(i13, strongBinder2, bundle2, u0Var2.f6202b);
            u0Var2.f6201a = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
