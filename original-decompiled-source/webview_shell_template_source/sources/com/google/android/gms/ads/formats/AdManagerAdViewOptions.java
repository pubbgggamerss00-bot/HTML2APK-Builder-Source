package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.ns;
import com.google.android.gms.internal.ads.os;
import com.google.android.gms.internal.ads.ps;
import e5.i;
import f3.a;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class AdManagerAdViewOptions extends a {
    public static final Parcelable.Creator<AdManagerAdViewOptions> CREATOR = new zzc();
    private final boolean zza;
    private final IBinder zzb;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class Builder {
        private boolean zza = false;

        public AdManagerAdViewOptions build() {
            return new AdManagerAdViewOptions(this, (zzb) null);
        }

        public Builder setManualImpressionsEnabled(boolean z6) {
            this.zza = z6;
            return this;
        }
    }

    public /* synthetic */ AdManagerAdViewOptions(Builder builder, zzb zzbVar) {
        this.zza = builder.zza;
        this.zzb = null;
    }

    public boolean getManualImpressionsEnabled() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int iS = i.s(20293, parcel);
        boolean manualImpressionsEnabled = getManualImpressionsEnabled();
        i.r(parcel, 1, 4);
        parcel.writeInt(manualImpressionsEnabled ? 1 : 0);
        i.k(parcel, 2, this.zzb);
        i.t(iS, parcel);
    }

    public final ps zza() {
        IBinder iBinder = this.zzb;
        if (iBinder == null) {
            return null;
        }
        int i6 = os.s;
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
        return iInterfaceQueryLocalInterface instanceof ps ? (ps) iInterfaceQueryLocalInterface : new ns(iBinder, "com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
    }

    public AdManagerAdViewOptions(boolean z6, IBinder iBinder) {
        this.zza = z6;
        this.zzb = iBinder;
    }
}
