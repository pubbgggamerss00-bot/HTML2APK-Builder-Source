package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public abstract class zzln extends zzkw {
    private static final Logger zzb = Logger.getLogger(zzln.class.getName());
    private static final boolean zzc = zzps.zzx();
    zzlo zza;

    private zzln() {
        throw null;
    }

    public static int zzA(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int zzB(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    @Deprecated
    public static int zzw(int i10, zzoi zzoiVar, zzow zzowVar) {
        int iZzA = zzA(i10 << 3);
        return ((zzko) zzoiVar).zza(zzowVar) + iZzA + iZzA;
    }

    public static int zzx(zzoi zzoiVar) {
        int iZzo = zzoiVar.zzo();
        return zzA(iZzo) + iZzo;
    }

    public static int zzy(zzoi zzoiVar, zzow zzowVar) {
        int iZza = ((zzko) zzoiVar).zza(zzowVar);
        return zzA(iZza) + iZza;
    }

    public static int zzz(String str) {
        int length;
        try {
            length = zzpv.zzc(str);
        } catch (zzpu unused) {
            length = str.getBytes(zznl.zza).length;
        }
        return zzA(length) + length;
    }

    public final void zzC() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zzD(String str, zzpu zzpuVar) throws IOException {
        zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzpuVar);
        byte[] bytes = str.getBytes(zznl.zza);
        try {
            int length = bytes.length;
            zzt(length);
            zzl(bytes, 0, length);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzll(e10);
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b10) throws IOException;

    public abstract void zzd(int i10, boolean z10) throws IOException;

    public abstract void zze(int i10, zzle zzleVar) throws IOException;

    public abstract void zzf(int i10, int i11) throws IOException;

    public abstract void zzg(int i10) throws IOException;

    public abstract void zzh(int i10, long j10) throws IOException;

    public abstract void zzi(long j10) throws IOException;

    public abstract void zzj(int i10, int i11) throws IOException;

    public abstract void zzk(int i10) throws IOException;

    public abstract void zzl(byte[] bArr, int i10, int i11) throws IOException;

    public abstract void zzm(int i10, zzoi zzoiVar, zzow zzowVar) throws IOException;

    public abstract void zzn(int i10, zzoi zzoiVar) throws IOException;

    public abstract void zzo(int i10, zzle zzleVar) throws IOException;

    public abstract void zzp(int i10, String str) throws IOException;

    public abstract void zzr(int i10, int i11) throws IOException;

    public abstract void zzs(int i10, int i11) throws IOException;

    public abstract void zzt(int i10) throws IOException;

    public abstract void zzu(int i10, long j10) throws IOException;

    public abstract void zzv(long j10) throws IOException;

    public /* synthetic */ zzln(zzlm zzlmVar) {
    }
}
