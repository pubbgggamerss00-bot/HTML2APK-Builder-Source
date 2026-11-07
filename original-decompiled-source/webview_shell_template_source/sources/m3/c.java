package m3;

import android.os.Parcel;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c extends a implements e {
    @Override // m3.e
    public final String zzc() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        Parcel parcelN = n(1, parcelObtain);
        String string = parcelN.readString();
        parcelN.recycle();
        return string;
    }

    @Override // m3.e
    public final boolean zzd() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        Parcel parcelN = n(6, parcelObtain);
        int i6 = b.f13886a;
        boolean z6 = parcelN.readInt() != 0;
        parcelN.recycle();
        return z6;
    }

    @Override // m3.e
    public final boolean zze() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        int i6 = b.f13886a;
        parcelObtain.writeInt(1);
        Parcel parcelN = n(2, parcelObtain);
        boolean z6 = parcelN.readInt() != 0;
        parcelN.recycle();
        return z6;
    }
}
