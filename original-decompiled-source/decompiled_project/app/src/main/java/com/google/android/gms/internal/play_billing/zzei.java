package com.google.android.gms.internal.play_billing;

import ad.b;
import androidx.datastore.preferences.protobuf.h;
import b.o;
import e1.c;
import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes2.dex */
public abstract class zzei implements Iterable, Serializable {
    public static final zzei zzb = new zzeg(zzfo.zzb);
    private int zza = 0;

    static {
        int i10 = zzdv.zza;
    }

    public static int zzh(int i10, int i11, int i12) {
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

    public static zzei zzj(byte[] bArr, int i10, int i11) {
        zzh(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new zzeg(bArr2);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iZze = this.zza;
        if (iZze == 0) {
            int iZzd = zzd();
            iZze = zze(iZzd, 0, iZzd);
            if (iZze == 0) {
                iZze = 1;
            }
            this.zza = iZze;
        }
        return iZze;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzea(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return o.a(h.a(zzd(), "<ByteString@", hexString, " size=", " contents=\""), zzd() <= 50 ? zzhf.zza(this) : zzhf.zza(zzf(0, 47)).concat("..."), "\">");
    }

    public abstract byte zza(int i10);

    public abstract byte zzb(int i10);

    public abstract int zzd();

    public abstract int zze(int i10, int i11, int i12);

    public abstract zzei zzf(int i10, int i11);

    public abstract void zzg(zzdz zzdzVar) throws IOException;

    public final int zzi() {
        return this.zza;
    }
}
