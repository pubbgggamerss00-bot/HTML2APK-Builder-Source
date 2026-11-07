package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.view.View;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class qo extends sh implements ro {
    @Override // com.google.android.gms.internal.ads.sh
    public final boolean zzdD(int i6, Parcel parcel, Parcel parcel2, int i7) {
        if (i6 == 1) {
            parcel2.writeNoException();
            parcel2.writeString(((po) this).f8108t);
        } else if (i6 == 2) {
            parcel2.writeNoException();
            parcel2.writeString(((po) this).f8109u);
        } else if (i6 == 3) {
            k3.a aVarC = androidx.camera.core.c.c(parcel, parcel);
            po poVar = (po) this;
            if (aVarC != null) {
                poVar.s.zza((View) k3.b.i1(aVarC));
            }
            parcel2.writeNoException();
        } else if (i6 == 4) {
            ((po) this).s.zzb();
            parcel2.writeNoException();
        } else {
            if (i6 != 5) {
                return false;
            }
            ((po) this).s.zzc();
            parcel2.writeNoException();
        }
        return true;
    }
}
