package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.rewarded.RewardItem;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class h50 extends sh implements o40 {
    public final String s;

    /* renamed from: t, reason: collision with root package name */
    public final int f5258t;

    public h50(RewardItem rewardItem) {
        this(rewardItem != null ? rewardItem.getType() : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, rewardItem != null ? rewardItem.getAmount() : 1);
    }

    @Override // com.google.android.gms.internal.ads.sh
    public final boolean zzdD(int i6, Parcel parcel, Parcel parcel2, int i7) {
        if (i6 == 1) {
            parcel2.writeNoException();
            parcel2.writeString(this.s);
        } else {
            if (i6 != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(this.f5258t);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.o40
    public final int zze() {
        return this.f5258t;
    }

    @Override // com.google.android.gms.internal.ads.o40
    public final String zzf() {
        return this.s;
    }

    public h50(String str, int i6) {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
        this.s = str;
        this.f5258t = i6;
    }
}
