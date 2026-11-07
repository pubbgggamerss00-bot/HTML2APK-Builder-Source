package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class c1 extends p3.i {
    @Override // p3.i
    public final boolean n(int i6, Parcel parcel, Parcel parcel2) {
        if (i6 == 1) {
            int i7 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) p3.j.a(parcel, Bundle.CREATOR);
            p3.j.c(parcel);
            m0 m0Var = (m0) this;
            l.g("onPostInitComplete can be called only once per call to getRemoteService", m0Var.s);
            m0Var.s.onPostInitHandler(i7, strongBinder, bundle, m0Var.f2469t);
            m0Var.s = null;
        } else if (i6 == 2) {
            parcel.readInt();
            p3.j.c(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i6 != 3) {
                return false;
            }
            int i8 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            q0 q0Var = (q0) p3.j.a(parcel, q0.CREATOR);
            p3.j.c(parcel);
            m0 m0Var2 = (m0) this;
            b bVar = m0Var2.s;
            l.g("onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService", bVar);
            l.f(q0Var);
            bVar.zzc(q0Var);
            Bundle bundle2 = q0Var.s;
            l.g("onPostInitComplete can be called only once per call to getRemoteService", m0Var2.s);
            m0Var2.s.onPostInitHandler(i8, strongBinder2, bundle2, m0Var2.f2469t);
            m0Var2.s = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
