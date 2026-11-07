package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import com.google.android.gms.ads.internal.offline.buffering.zza;
import com.google.android.gms.internal.ads.sh;
import com.google.android.gms.internal.ads.th;
import k3.a;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class zzbq extends sh implements zzbr {
    public zzbq() {
        super("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // com.google.android.gms.internal.ads.sh
    public final boolean zzdD(int i6, Parcel parcel, Parcel parcel2, int i7) {
        if (i6 == 1) {
            k3.a aVarR = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
            String string = parcel.readString();
            String string2 = parcel.readString();
            th.b(parcel);
            boolean zZzf = zzf(aVarR, string, string2);
            parcel2.writeNoException();
            parcel2.writeInt(zZzf ? 1 : 0);
        } else if (i6 == 2) {
            k3.a aVarR2 = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
            th.b(parcel);
            zze(aVarR2);
            parcel2.writeNoException();
        } else {
            if (i6 != 3) {
                return false;
            }
            k3.a aVarR3 = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
            zza zzaVar = (zza) th.a(parcel, zza.CREATOR);
            th.b(parcel);
            boolean zZzg = zzg(aVarR3, zzaVar);
            parcel2.writeNoException();
            parcel2.writeInt(zZzg ? 1 : 0);
        }
        return true;
    }
}
