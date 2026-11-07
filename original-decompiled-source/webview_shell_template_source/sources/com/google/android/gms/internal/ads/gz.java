package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.ads.mediation.MediationInterscrollerAd;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class gz extends sh implements oy {
    public final MediationInterscrollerAd s;

    public gz(MediationInterscrollerAd mediationInterscrollerAd) {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
        this.s = mediationInterscrollerAd;
    }

    @Override // com.google.android.gms.internal.ads.sh
    public final boolean zzdD(int i6, Parcel parcel, Parcel parcel2, int i7) {
        if (i6 == 1) {
            k3.a aVarZze = zze();
            parcel2.writeNoException();
            th.e(parcel2, aVarZze);
        } else {
            if (i6 != 2) {
                return false;
            }
            boolean zShouldDelegateInterscrollerEffect = this.s.shouldDelegateInterscrollerEffect();
            parcel2.writeNoException();
            ClassLoader classLoader = th.f9281a;
            parcel2.writeInt(zShouldDelegateInterscrollerEffect ? 1 : 0);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.oy
    public final k3.a zze() {
        return new k3.b(this.s.getView());
    }

    @Override // com.google.android.gms.internal.ads.oy
    public final boolean zzf() {
        return this.s.shouldDelegateInterscrollerEffect();
    }
}
