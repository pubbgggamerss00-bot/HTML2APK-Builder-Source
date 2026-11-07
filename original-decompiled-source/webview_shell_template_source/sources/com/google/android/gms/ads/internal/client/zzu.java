package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzu extends f3.a {
    public static final Parcelable.Creator<zzu> CREATOR = new zzv();
    public final int zza;
    public final int zzb;
    public final String zzc;
    public final long zzd;

    public zzu(int i6, int i7, String str, long j6) {
        this.zza = i6;
        this.zzb = i7;
        this.zzc = str;
        this.zzd = j6;
    }

    public static zzu zza(JSONObject jSONObject) {
        return new zzu(jSONObject.getInt("type_num"), jSONObject.getInt("precision_num"), jSONObject.getString("currency"), jSONObject.getLong("value"));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int i7 = this.zza;
        int iS = e5.i.s(20293, parcel);
        e5.i.r(parcel, 1, 4);
        parcel.writeInt(i7);
        int i8 = this.zzb;
        e5.i.r(parcel, 2, 4);
        parcel.writeInt(i8);
        e5.i.m(parcel, 3, this.zzc);
        long j6 = this.zzd;
        e5.i.r(parcel, 4, 8);
        parcel.writeLong(j6);
        e5.i.t(iS, parcel);
    }
}
