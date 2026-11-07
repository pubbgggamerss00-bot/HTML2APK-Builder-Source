package com.google.android.recaptcha.internal;

import androidx.room.y0;
import i0.x1;
import mh.x;

/* loaded from: classes2.dex */
public final class zzbj implements Comparable {
    private int zza;
    private long zzb;
    private long zzc;

    public final String toString() {
        String strF = x.F(10, String.valueOf(this.zzb / this.zza));
        String strF2 = x.F(10, String.valueOf(this.zzc));
        String strF3 = x.F(10, String.valueOf(this.zzb));
        String strF4 = x.F(5, String.valueOf(this.zza));
        StringBuilder sbA = y0.a("avgExecutionTime: ", strF, " us| maxExecutionTime: ", strF2, " us| totalTime: ");
        sbA.append(strF3);
        sbA.append(" us| #Usages: ");
        sbA.append(strF4);
        return sbA.toString();
    }

    @Override // java.lang.Comparable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzbj zzbjVar) {
        return x1.b(Long.valueOf(this.zzb), Long.valueOf(zzbjVar.zzb));
    }

    public final int zzb() {
        return this.zza;
    }

    public final long zzc() {
        return this.zzc;
    }

    public final long zzd() {
        return this.zzb;
    }

    public final void zze(long j10) {
        this.zzc = j10;
    }

    public final void zzf(long j10) {
        this.zzb = j10;
    }

    public final void zzg(int i10) {
        this.zza = i10;
    }
}
