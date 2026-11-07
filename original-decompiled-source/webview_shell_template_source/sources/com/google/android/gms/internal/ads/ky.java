package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ky extends rh implements my {
    public ky(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    @Override // com.google.android.gms.internal.ads.my
    public final void K(int i6, String str) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i6);
        parcelZza.writeString(str);
        zzda(22, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.my
    public final void M0(zze zzeVar) {
        Parcel parcelZza = zza();
        th.c(parcelZza, zzeVar);
        zzda(24, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.my
    public final void T(zze zzeVar) {
        Parcel parcelZza = zza();
        th.c(parcelZza, zzeVar);
        zzda(23, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.my
    public final void a(int i6) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i6);
        zzda(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.my
    public final void b1(l40 l40Var) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.my
    public final void c() {
        zzda(15, zza());
    }

    @Override // com.google.android.gms.internal.ads.my
    public final void d0(o40 o40Var) {
        Parcel parcelZza = zza();
        th.e(parcelZza, o40Var);
        zzda(16, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.my
    public final void j() {
        zzda(13, zza());
    }

    @Override // com.google.android.gms.internal.ads.my
    public final void m1(int i6) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.my
    public final void s1(String str, String str2) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzda(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.my
    public final void w1(tr trVar, String str) {
        Parcel parcelZza = zza();
        th.e(parcelZza, trVar);
        parcelZza.writeString(str);
        zzda(10, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.my
    public final void zze() {
        zzda(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.my
    public final void zzf() {
        zzda(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.my
    public final void zzl(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzda(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.my
    public final void zzm() {
        zzda(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.my
    public final void zzn() {
        zzda(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.my
    public final void zzo() {
        zzda(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.my
    public final void zzp() {
        zzda(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.my
    public final void zzu() {
        zzda(18, zza());
    }

    @Override // com.google.android.gms.internal.ads.my
    public final void zzv() {
        zzda(11, zza());
    }

    @Override // com.google.android.gms.internal.ads.my
    public final void zzx() {
        zzda(20, zza());
    }
}
