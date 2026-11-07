package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.room.y0;
import androidx.room.z0;
import b.o;

/* loaded from: classes2.dex */
final class zzagg extends zzahw {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final zzagy zzd;
    private final String zze;

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzahw) {
            zzahw zzahwVar = (zzahw) obj;
            if (this.zza.equals(zzahwVar.zzd()) && ((str = this.zzb) != null ? str.equals(zzahwVar.zze()) : zzahwVar.zze() == null) && this.zzc.equals(zzahwVar.zzf()) && this.zzd.equals(zzahwVar.zzb()) && this.zze.equals(zzahwVar.zzc())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.zza.hashCode() ^ 1000003) * 1000003;
        String str = this.zzb;
        return ((((((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.zzc.hashCode()) * 1000003) ^ this.zzd.hashCode()) * 1000003) ^ this.zze.hashCode();
    }

    public final String toString() {
        String str = this.zza;
        String str2 = this.zzb;
        String str3 = this.zzc;
        String strValueOf = String.valueOf(this.zzd);
        String str4 = this.zze;
        StringBuilder sbA = y0.a("RevokeTokenRequest{providerId=", str, ", tenantId=", str2, ", token=");
        z0.a(sbA, str3, ", tokenType=", strValueOf, ", idToken=");
        return o.a(sbA, str4, "}");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahw
    public final zzagy zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahw
    public final String zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahw
    public final String zzd() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahw
    public final String zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahw
    public final String zzf() {
        return this.zzc;
    }

    private zzagg(String str, String str2, String str3, zzagy zzagyVar, String str4) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = zzagyVar;
        this.zze = str4;
    }
}
