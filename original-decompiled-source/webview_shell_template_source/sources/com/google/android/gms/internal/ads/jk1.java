package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.ads.internal.overlay.zzz;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class jk1 extends sh {
    @Override // com.google.android.gms.internal.ads.sh
    public final boolean zzdD(int i6, Parcel parcel, Parcel parcel2, int i7) {
        hl1 hl1Var;
        if (i6 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) th.a(parcel, Bundle.CREATOR);
        th.b(parcel);
        yk1 yk1Var = (yk1) this;
        int i8 = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        if (string == null) {
            string = null;
        }
        ((zzz) ((com.google.android.gms.ads.internal.overlay.i) yk1Var.s).f2343t).zzi(new nk1(i8, string));
        if (i8 == 8157 && (hl1Var = yk1Var.f11019t.f11328a) != null) {
            zk1.f11326c.c("unbind LMD display overlay service", new Object[0]);
            hl1Var.a(new p(16, hl1Var));
        }
        return true;
    }
}
