package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzcl;
import com.google.android.gms.ads.internal.client.zzcm;
import com.google.android.gms.internal.ads.ns;
import com.google.android.gms.internal.ads.os;
import com.google.android.gms.internal.ads.ps;
import e5.i;
import f3.a;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
@Deprecated
/* loaded from: classes.dex */
public final class PublisherAdViewOptions extends a {
    public static final Parcelable.Creator<PublisherAdViewOptions> CREATOR = new zzh();
    private final boolean zza;
    private final zzcm zzb;
    private final IBinder zzc;

    public PublisherAdViewOptions(boolean z6, IBinder iBinder, IBinder iBinder2) {
        this.zza = z6;
        this.zzb = iBinder != null ? zzcl.zzd(iBinder) : null;
        this.zzc = iBinder2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int iS = i.s(20293, parcel);
        boolean z6 = this.zza;
        i.r(parcel, 1, 4);
        parcel.writeInt(z6 ? 1 : 0);
        zzcm zzcmVar = this.zzb;
        i.k(parcel, 2, zzcmVar == null ? null : zzcmVar.asBinder());
        i.k(parcel, 3, this.zzc);
        i.t(iS, parcel);
    }

    public final zzcm zza() {
        return this.zzb;
    }

    public final ps zzb() {
        IBinder iBinder = this.zzc;
        if (iBinder == null) {
            return null;
        }
        int i6 = os.s;
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
        return iInterfaceQueryLocalInterface instanceof ps ? (ps) iInterfaceQueryLocalInterface : new ns(iBinder, "com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
    }

    public final boolean zzc() {
        return this.zza;
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    @Deprecated
    public static final class Builder {
        public Builder setShouldDelayBannerRenderingListener(ShouldDelayBannerRenderingListener shouldDelayBannerRenderingListener) {
            return this;
        }
    }
}
