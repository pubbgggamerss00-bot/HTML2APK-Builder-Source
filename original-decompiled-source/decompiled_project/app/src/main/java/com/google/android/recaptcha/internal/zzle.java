package com.google.android.recaptcha.internal;

import androidx.datastore.preferences.protobuf.h;
import b.o;
import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes2.dex */
public abstract class zzle implements Iterable, Serializable {
    public static final zzle zzb = new zzlc(zznl.zzb);
    private int zza = 0;

    static {
        int i10 = zzks.zza;
    }

    public static int zzi(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException(ad.b.b(i10, "Beginning index: ", " < 0"));
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException(e1.c.a(i10, i11, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(e1.c.a(i11, i12, "End index: ", " >= "));
    }

    public static zzle zzk(byte[] bArr, int i10, int i11) {
        zzi(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new zzlc(bArr2);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iZzf = this.zza;
        if (iZzf == 0) {
            int iZzd = zzd();
            iZzf = zzf(iZzd, 0, iZzd);
            if (iZzf == 0) {
                iZzf = 1;
            }
            this.zza = iZzf;
        }
        return iZzf;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzkx(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return o.a(h.a(zzd(), "<ByteString@", hexString, " size=", " contents=\""), zzd() <= 50 ? zzpg.zza(this) : zzpg.zza(zzg(0, 47)).concat("..."), "\">");
    }

    public abstract byte zza(int i10);

    public abstract byte zzb(int i10);

    public abstract int zzd();

    public abstract void zze(byte[] bArr, int i10, int i11, int i12);

    public abstract int zzf(int i10, int i11, int i12);

    public abstract zzle zzg(int i10, int i11);

    public abstract void zzh(zzkw zzkwVar) throws IOException;

    public final int zzj() {
        return this.zza;
    }

    public final byte[] zzl() {
        int iZzd = zzd();
        if (iZzd == 0) {
            return zznl.zzb;
        }
        byte[] bArr = new byte[iZzd];
        zze(bArr, 0, 0, iZzd);
        return bArr;
    }
}
