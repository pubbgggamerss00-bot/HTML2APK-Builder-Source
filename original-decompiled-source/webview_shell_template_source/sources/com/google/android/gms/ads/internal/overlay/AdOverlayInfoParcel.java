package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.ads.ft;
import com.google.android.gms.internal.ads.ht;
import com.google.android.gms.internal.ads.i70;
import com.google.android.gms.internal.ads.n10;
import com.google.android.gms.internal.ads.on0;
import com.google.android.gms.internal.ads.vk0;
import com.google.android.gms.internal.ads.xa0;
import com.google.android.gms.internal.ads.zn;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import k3.a;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class AdOverlayInfoParcel extends f3.a implements ReflectedParcelable {
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new zzo();
    private static final AtomicLong zzy = new AtomicLong(0);
    private static final ConcurrentHashMap zzz = new ConcurrentHashMap();
    public final zzc zza;
    public final com.google.android.gms.ads.internal.client.zza zzb;
    public final zzr zzc;
    public final xa0 zzd;
    public final ht zze;
    public final String zzf;
    public final boolean zzg;
    public final String zzh;
    public final zzac zzi;
    public final int zzj;
    public final int zzk;
    public final String zzl;
    public final VersionInfoParcel zzm;
    public final String zzn;
    public final com.google.android.gms.ads.internal.zzl zzo;
    public final ft zzp;
    public final String zzq;
    public final String zzr;
    public final String zzs;
    public final vk0 zzt;
    public final on0 zzu;
    public final n10 zzv;
    public final boolean zzw;
    public final long zzx;

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzr zzrVar, ft ftVar, ht htVar, zzac zzacVar, xa0 xa0Var, boolean z6, int i6, String str, VersionInfoParcel versionInfoParcel, on0 on0Var, n10 n10Var, boolean z7) {
        this.zza = null;
        this.zzb = zzaVar;
        this.zzc = zzrVar;
        this.zzd = xa0Var;
        this.zzp = ftVar;
        this.zze = htVar;
        this.zzf = null;
        this.zzg = z6;
        this.zzh = null;
        this.zzi = zzacVar;
        this.zzj = i6;
        this.zzk = 3;
        this.zzl = str;
        this.zzm = versionInfoParcel;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = on0Var;
        this.zzv = n10Var;
        this.zzw = z7;
        this.zzx = zzy.getAndIncrement();
    }

    public static AdOverlayInfoParcel zza(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception e6) {
            if (!((Boolean) zzbe.zzc().a(zn.Lc)).booleanValue()) {
                return null;
            }
            com.google.android.gms.ads.internal.zzv.zzp().h("AdOverlayInfoParcel.getFromIntent", e6);
            return null;
        }
    }

    private static final IBinder zzc(Object obj) {
        if (((Boolean) zzbe.zzc().a(zn.Lc)).booleanValue()) {
            return null;
        }
        return new k3.b(obj);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int iS = e5.i.s(20293, parcel);
        e5.i.l(parcel, 2, this.zza, i6);
        e5.i.k(parcel, 3, zzc(this.zzb));
        e5.i.k(parcel, 4, zzc(this.zzc));
        e5.i.k(parcel, 5, zzc(this.zzd));
        e5.i.k(parcel, 6, zzc(this.zze));
        e5.i.m(parcel, 7, this.zzf);
        boolean z6 = this.zzg;
        e5.i.r(parcel, 8, 4);
        parcel.writeInt(z6 ? 1 : 0);
        e5.i.m(parcel, 9, this.zzh);
        e5.i.k(parcel, 10, zzc(this.zzi));
        int i7 = this.zzj;
        e5.i.r(parcel, 11, 4);
        parcel.writeInt(i7);
        int i8 = this.zzk;
        e5.i.r(parcel, 12, 4);
        parcel.writeInt(i8);
        e5.i.m(parcel, 13, this.zzl);
        e5.i.l(parcel, 14, this.zzm, i6);
        e5.i.m(parcel, 16, this.zzn);
        e5.i.l(parcel, 17, this.zzo, i6);
        e5.i.k(parcel, 18, zzc(this.zzp));
        e5.i.m(parcel, 19, this.zzq);
        e5.i.m(parcel, 24, this.zzr);
        e5.i.m(parcel, 25, this.zzs);
        e5.i.k(parcel, 26, zzc(this.zzt));
        e5.i.k(parcel, 27, zzc(this.zzu));
        e5.i.k(parcel, 28, zzc(this.zzv));
        boolean z7 = this.zzw;
        e5.i.r(parcel, 29, 4);
        parcel.writeInt(z7 ? 1 : 0);
        long j6 = this.zzx;
        e5.i.r(parcel, 30, 8);
        parcel.writeLong(j6);
        e5.i.t(iS, parcel);
        if (((Boolean) zzbe.zzc().a(zn.Lc)).booleanValue()) {
            zzz.put(Long.valueOf(this.zzx), new f(this.zzb, this.zzc, this.zzd, this.zzp, this.zze, this.zzi, this.zzt, this.zzu, this.zzv, i70.f5589d.schedule(new g(this.zzx), ((Integer) zzbe.zzc().a(zn.Nc)).intValue(), TimeUnit.SECONDS)));
        }
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzr zzrVar, ft ftVar, ht htVar, zzac zzacVar, xa0 xa0Var, boolean z6, int i6, String str, String str2, VersionInfoParcel versionInfoParcel, on0 on0Var, n10 n10Var) {
        this.zza = null;
        this.zzb = zzaVar;
        this.zzc = zzrVar;
        this.zzd = xa0Var;
        this.zzp = ftVar;
        this.zze = htVar;
        this.zzf = str2;
        this.zzg = z6;
        this.zzh = str;
        this.zzi = zzacVar;
        this.zzj = i6;
        this.zzk = 3;
        this.zzl = null;
        this.zzm = versionInfoParcel;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = on0Var;
        this.zzv = n10Var;
        this.zzw = false;
        this.zzx = zzy.getAndIncrement();
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzr zzrVar, zzac zzacVar, xa0 xa0Var, int i6, VersionInfoParcel versionInfoParcel, String str, com.google.android.gms.ads.internal.zzl zzlVar, String str2, String str3, String str4, vk0 vk0Var, n10 n10Var, String str5) {
        this.zza = null;
        this.zzb = null;
        this.zzc = zzrVar;
        this.zzd = xa0Var;
        this.zzp = null;
        this.zze = null;
        this.zzg = false;
        if (((Boolean) zzbe.zzc().a(zn.T0)).booleanValue()) {
            this.zzf = null;
            this.zzh = null;
        } else {
            this.zzf = str2;
            this.zzh = str3;
        }
        this.zzi = null;
        this.zzj = i6;
        this.zzk = 1;
        this.zzl = null;
        this.zzm = versionInfoParcel;
        this.zzn = str;
        this.zzo = zzlVar;
        this.zzq = str5;
        this.zzr = null;
        this.zzs = str4;
        this.zzt = vk0Var;
        this.zzu = null;
        this.zzv = n10Var;
        this.zzw = false;
        this.zzx = zzy.getAndIncrement();
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzr zzrVar, zzac zzacVar, xa0 xa0Var, boolean z6, int i6, VersionInfoParcel versionInfoParcel, on0 on0Var, n10 n10Var) {
        this.zza = null;
        this.zzb = zzaVar;
        this.zzc = zzrVar;
        this.zzd = xa0Var;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = z6;
        this.zzh = null;
        this.zzi = zzacVar;
        this.zzj = i6;
        this.zzk = 2;
        this.zzl = null;
        this.zzm = versionInfoParcel;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = on0Var;
        this.zzv = n10Var;
        this.zzw = false;
        this.zzx = zzy.getAndIncrement();
    }

    public AdOverlayInfoParcel(zzc zzcVar, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z6, String str2, IBinder iBinder5, int i6, int i7, String str3, VersionInfoParcel versionInfoParcel, String str4, com.google.android.gms.ads.internal.zzl zzlVar, IBinder iBinder6, String str5, String str6, String str7, IBinder iBinder7, IBinder iBinder8, IBinder iBinder9, boolean z7, long j6) {
        this.zza = zzcVar;
        this.zzf = str;
        this.zzg = z6;
        this.zzh = str2;
        this.zzj = i6;
        this.zzk = i7;
        this.zzl = str3;
        this.zzm = versionInfoParcel;
        this.zzn = str4;
        this.zzo = zzlVar;
        this.zzq = str5;
        this.zzr = str6;
        this.zzs = str7;
        this.zzw = z7;
        this.zzx = j6;
        if (((Boolean) zzbe.zzc().a(zn.Lc)).booleanValue()) {
            f fVar = (f) zzz.remove(Long.valueOf(j6));
            if (fVar != null) {
                this.zzb = fVar.f2331a;
                this.zzc = fVar.f2332b;
                this.zzd = fVar.f2333c;
                this.zzp = fVar.f2334d;
                this.zze = fVar.f2335e;
                this.zzt = fVar.f2337g;
                this.zzu = fVar.h;
                this.zzv = fVar.f2338i;
                this.zzi = fVar.f2336f;
                fVar.f2339j.cancel(false);
                return;
            }
            throw new NullPointerException("AdOverlayObjects is null");
        }
        this.zzb = (com.google.android.gms.ads.internal.client.zza) k3.b.i1(a.AbstractBinderC0073a.r(iBinder));
        this.zzc = (zzr) k3.b.i1(a.AbstractBinderC0073a.r(iBinder2));
        this.zzd = (xa0) k3.b.i1(a.AbstractBinderC0073a.r(iBinder3));
        this.zzp = (ft) k3.b.i1(a.AbstractBinderC0073a.r(iBinder6));
        this.zze = (ht) k3.b.i1(a.AbstractBinderC0073a.r(iBinder4));
        this.zzi = (zzac) k3.b.i1(a.AbstractBinderC0073a.r(iBinder5));
        this.zzt = (vk0) k3.b.i1(a.AbstractBinderC0073a.r(iBinder7));
        this.zzu = (on0) k3.b.i1(a.AbstractBinderC0073a.r(iBinder8));
        this.zzv = (n10) k3.b.i1(a.AbstractBinderC0073a.r(iBinder9));
    }

    public AdOverlayInfoParcel(zzc zzcVar, com.google.android.gms.ads.internal.client.zza zzaVar, zzr zzrVar, zzac zzacVar, VersionInfoParcel versionInfoParcel, xa0 xa0Var, on0 on0Var, String str) {
        this.zza = zzcVar;
        this.zzb = zzaVar;
        this.zzc = zzrVar;
        this.zzd = xa0Var;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = zzacVar;
        this.zzj = -1;
        this.zzk = 4;
        this.zzl = null;
        this.zzm = versionInfoParcel;
        this.zzn = null;
        this.zzo = null;
        this.zzq = str;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = on0Var;
        this.zzv = null;
        this.zzw = false;
        this.zzx = zzy.getAndIncrement();
    }

    public AdOverlayInfoParcel(zzr zzrVar, xa0 xa0Var, int i6, VersionInfoParcel versionInfoParcel) {
        this.zzc = zzrVar;
        this.zzd = xa0Var;
        this.zzj = 1;
        this.zzm = versionInfoParcel;
        this.zza = null;
        this.zzb = null;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = null;
        this.zzk = 1;
        this.zzl = null;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzv = null;
        this.zzw = false;
        this.zzx = zzy.getAndIncrement();
    }

    public AdOverlayInfoParcel(xa0 xa0Var, VersionInfoParcel versionInfoParcel, String str, String str2, int i6, n10 n10Var) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = xa0Var;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = null;
        this.zzj = 14;
        this.zzk = 5;
        this.zzl = null;
        this.zzm = versionInfoParcel;
        this.zzn = null;
        this.zzo = null;
        this.zzq = str;
        this.zzr = str2;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzv = n10Var;
        this.zzw = false;
        this.zzx = zzy.getAndIncrement();
    }
}
