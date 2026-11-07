package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.rh;
import com.google.android.gms.internal.ads.th;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzdw extends rh implements zzdy {
    public zzdw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdy
    public final Bundle zze() {
        Parcel parcelZzcZ = zzcZ(5, zza());
        Bundle bundle = (Bundle) th.a(parcelZzcZ, Bundle.CREATOR);
        parcelZzcZ.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdy
    public final zzw zzf() {
        Parcel parcelZzcZ = zzcZ(4, zza());
        zzw zzwVar = (zzw) th.a(parcelZzcZ, zzw.CREATOR);
        parcelZzcZ.recycle();
        return zzwVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdy
    public final String zzg() {
        Parcel parcelZzcZ = zzcZ(1, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdy
    public final String zzh() {
        Parcel parcelZzcZ = zzcZ(6, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdy
    public final String zzi() {
        Parcel parcelZzcZ = zzcZ(2, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdy
    public final List zzj() {
        Parcel parcelZzcZ = zzcZ(3, zza());
        ArrayList arrayListCreateTypedArrayList = parcelZzcZ.createTypedArrayList(zzw.CREATOR);
        parcelZzcZ.recycle();
        return arrayListCreateTypedArrayList;
    }
}
