package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.internal.util.client.zzo;
import k3.a;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class ew extends sh implements fw {
    @Override // com.google.android.gms.internal.ads.sh
    public final boolean zzdD(int i6, Parcel parcel, Parcel parcel2, int i7) {
        hp0 hp0Var;
        zzeb zzebVar = null;
        wqVar = null;
        wqVar = null;
        wq wqVar = null;
        hw gwVar = null;
        if (i6 == 3) {
            sr0 sr0Var = (sr0) this;
            com.google.android.gms.common.internal.l.d("#008 Must be called on the main UI thread.");
            if (sr0Var.f8996v) {
                zzo.zzg("getVideoController: Instream ad should not be used after destroyed");
            } else {
                zzebVar = sr0Var.f8994t;
            }
            parcel2.writeNoException();
            th.e(parcel2, zzebVar);
        } else if (i6 == 4) {
            sr0 sr0Var2 = (sr0) this;
            com.google.android.gms.common.internal.l.d("#008 Must be called on the main UI thread.");
            sr0Var2.f2();
            fp0 fp0Var = sr0Var2.f8995u;
            if (fp0Var != null) {
                fp0Var.p();
            }
            sr0Var2.f8995u = null;
            sr0Var2.s = null;
            sr0Var2.f8994t = null;
            sr0Var2.f8996v = true;
            parcel2.writeNoException();
        } else if (i6 == 5) {
            k3.a aVarR = a.AbstractBinderC0073a.r(parcel.readStrongBinder());
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                gwVar = iInterfaceQueryLocalInterface instanceof hw ? (hw) iInterfaceQueryLocalInterface : new gw(strongBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
            }
            th.b(parcel);
            ((sr0) this).i1(aVarR, gwVar);
            parcel2.writeNoException();
        } else if (i6 == 6) {
            k3.a aVarC = androidx.camera.core.c.c(parcel, parcel);
            com.google.android.gms.common.internal.l.d("#008 Must be called on the main UI thread.");
            ((sr0) this).i1(aVarC, new rr0("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback"));
            parcel2.writeNoException();
        } else {
            if (i6 != 7) {
                return false;
            }
            sr0 sr0Var3 = (sr0) this;
            com.google.android.gms.common.internal.l.d("#008 Must be called on the main UI thread.");
            if (sr0Var3.f8996v) {
                zzo.zzg("getVideoController: Instream ad should not be used after destroyed");
            } else {
                fp0 fp0Var2 = sr0Var3.f8995u;
                if (fp0Var2 != null && (hp0Var = fp0Var2.C) != null) {
                    synchronized (hp0Var) {
                        wqVar = hp0Var.f5451a;
                    }
                }
            }
            parcel2.writeNoException();
            th.e(parcel2, wqVar);
        }
        return true;
    }
}
