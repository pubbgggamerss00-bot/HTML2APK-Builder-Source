package com.google.android.gms.internal.p002firebaseauthapi;

import ad.b;
import androidx.datastore.preferences.protobuf.h;
import b.o;
import e1.c;
import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
import k3.a;

/* loaded from: classes2.dex */
public abstract class zzajp implements Serializable, Iterable<Byte> {
    public static final zzajp zza = new zzajw(zzalb.zzb);
    private static final zzajs zzb = new zzajz();
    private int zzc = 0;

    static {
        new zzajr();
    }

    public static /* synthetic */ int zza(byte b10) {
        return b10 & 255;
    }

    public static zzajp zzb(byte[] bArr) {
        return new zzajw(bArr);
    }

    public static zzaju zzc(int i10) {
        return new zzaju(i10);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iZzb = this.zzc;
        if (iZzb == 0) {
            int iZzb2 = zzb();
            iZzb = zzb(iZzb2, 0, iZzb2);
            if (iZzb == 0) {
                iZzb = 1;
            }
            this.zzc = iZzb;
        }
        return iZzb;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new zzajo(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return o.a(h.a(zzb(), "<ByteString@", hexString, " size=", " contents=\""), zzb() <= 50 ? zzanh.zza(this) : a.a(zzanh.zza(zza(0, 47)), "..."), "\">");
    }

    public abstract byte zza(int i10);

    public abstract zzajp zza(int i10, int i11);

    public abstract void zza(zzajm zzajmVar) throws IOException;

    public abstract void zza(byte[] bArr, int i10, int i11, int i12);

    public abstract byte zzb(int i10);

    public abstract int zzb();

    public abstract int zzb(int i10, int i11, int i12);

    public abstract zzakb zzc();

    public final byte[] zzd() {
        int iZzb = zzb();
        if (iZzb == 0) {
            return zzalb.zzb;
        }
        byte[] bArr = new byte[iZzb];
        zza(bArr, 0, 0, iZzb);
        return bArr;
    }

    public static int zza(int i10, int i11, int i12) {
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

    public final int zza() {
        return this.zzc;
    }

    public static zzajp zza(byte[] bArr) {
        return zza(bArr, 0, bArr.length);
    }

    public static zzajp zza(byte[] bArr, int i10, int i11) {
        zza(i10, i10 + i11, bArr.length);
        return new zzajw(zzb.zza(bArr, i10, i11));
    }

    public static zzajp zza(String str) {
        return new zzajw(str.getBytes(zzalb.zza));
    }
}
