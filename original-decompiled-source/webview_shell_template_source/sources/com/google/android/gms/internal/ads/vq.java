package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzeb;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class vq extends sh implements wq {
    @Override // com.google.android.gms.internal.ads.sh
    public final boolean zzdD(int i6, Parcel parcel, Parcel parcel2, int i7) {
        gs gsVar;
        switch (i6) {
            case 2:
                float fZze = ((ap0) this).zze();
                parcel2.writeNoException();
                parcel2.writeFloat(fZze);
                return true;
            case 3:
                ((ap0) this).f2817t = androidx.camera.core.c.c(parcel, parcel);
                parcel2.writeNoException();
                return true;
            case 4:
                k3.a aVarZzi = ((ap0) this).zzi();
                parcel2.writeNoException();
                th.e(parcel2, aVarZzi);
                return true;
            case 5:
                float fZzg = ((ap0) this).zzg();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzg);
                return true;
            case 6:
                float fZzf = ((ap0) this).zzf();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzf);
                return true;
            case 7:
                zzeb zzebVarI = ((ap0) this).s.i();
                parcel2.writeNoException();
                th.e(parcel2, zzebVarI);
                return true;
            case 8:
                boolean zZzl = ((ap0) this).zzl();
                parcel2.writeNoException();
                ClassLoader classLoader = th.f9281a;
                parcel2.writeInt(zZzl ? 1 : 0);
                return true;
            case 9:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    gsVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener");
                    gsVar = iInterfaceQueryLocalInterface instanceof gs ? (gs) iInterfaceQueryLocalInterface : new gs(strongBinder, "com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener");
                }
                th.b(parcel);
                ap0 ap0Var = (ap0) this;
                if (ap0Var.s.i() instanceof ob0) {
                    ob0 ob0Var = (ob0) ap0Var.s.i();
                    synchronized (ob0Var.f7669t) {
                        ob0Var.F = gsVar;
                    }
                }
                parcel2.writeNoException();
                return true;
            case 10:
                boolean zZzk = ((ap0) this).zzk();
                parcel2.writeNoException();
                ClassLoader classLoader2 = th.f9281a;
                parcel2.writeInt(zZzk ? 1 : 0);
                return true;
            default:
                return false;
        }
    }
}
