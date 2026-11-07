package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import k3.a;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzc extends f3.a {
    public static final Parcelable.Creator<zzc> CREATOR = new zzb();
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final String zze;
    public final String zzf;
    public final String zzg;
    public final Intent zzh;
    public final zzaa zzi;
    public final boolean zzj;

    public zzc(Intent intent, zzaa zzaaVar) {
        this(null, null, null, null, null, null, null, intent, new k3.b(zzaaVar), false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        String str = this.zza;
        int iS = e5.i.s(20293, parcel);
        e5.i.m(parcel, 2, str);
        e5.i.m(parcel, 3, this.zzb);
        e5.i.m(parcel, 4, this.zzc);
        e5.i.m(parcel, 5, this.zzd);
        e5.i.m(parcel, 6, this.zze);
        e5.i.m(parcel, 7, this.zzf);
        e5.i.m(parcel, 8, this.zzg);
        e5.i.l(parcel, 9, this.zzh, i6);
        e5.i.k(parcel, 10, new k3.b(this.zzi));
        boolean z6 = this.zzj;
        e5.i.r(parcel, 11, 4);
        parcel.writeInt(z6 ? 1 : 0);
        e5.i.t(iS, parcel);
    }

    public zzc(String str, String str2, String str3, String str4, String str5, String str6, String str7, zzaa zzaaVar) {
        this(str, str2, str3, str4, str5, str6, str7, null, new k3.b(zzaaVar), false);
    }

    public zzc(String str, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent, IBinder iBinder, boolean z6) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
        this.zzg = str7;
        this.zzh = intent;
        this.zzi = (zzaa) k3.b.i1(a.AbstractBinderC0073a.r(iBinder));
        this.zzj = z6;
    }
}
