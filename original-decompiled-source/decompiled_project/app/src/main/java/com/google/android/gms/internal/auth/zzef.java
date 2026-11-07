package com.google.android.gms.internal.auth;

import ad.b;
import androidx.datastore.preferences.protobuf.h;
import b.o;
import e1.c;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes2.dex */
public abstract class zzef implements Iterable, Serializable {
    private static final Comparator zza;
    public static final zzef zzb = new zzec(zzfa.zzd);
    private static final zzee zzd;
    private int zzc = 0;

    static {
        int i10 = zzds.zza;
        zzd = new zzee(null);
        zza = new zzdx();
    }

    public static int zzi(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException(b.b(i10, "Beginning index: ", " < 0"));
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException(c.a(i10, i11, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(c.a(i11, i12, "End index: ", " >= "));
    }

    public static zzef zzk(byte[] bArr, int i10, int i11) {
        zzi(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new zzec(bArr2);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iZze = this.zzc;
        if (iZze == 0) {
            int iZzd = zzd();
            iZze = zze(iZzd, 0, iZzd);
            if (iZze == 0) {
                iZze = 1;
            }
            this.zzc = iZze;
        }
        return iZze;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzdw(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return o.a(h.a(zzd(), "<ByteString@", hexString, " size=", " contents=\""), zzd() <= 50 ? zzgx.zza(this) : zzgx.zza(zzf(0, 47)).concat("..."), "\">");
    }

    public abstract byte zza(int i10);

    public abstract byte zzb(int i10);

    public abstract int zzd();

    public abstract int zze(int i10, int i11, int i12);

    public abstract zzef zzf(int i10, int i11);

    public abstract String zzg(Charset charset);

    public abstract boolean zzh();

    public final int zzj() {
        return this.zzc;
    }

    public final String zzl(Charset charset) {
        return zzd() == 0 ? "" : zzg(charset);
    }
}
