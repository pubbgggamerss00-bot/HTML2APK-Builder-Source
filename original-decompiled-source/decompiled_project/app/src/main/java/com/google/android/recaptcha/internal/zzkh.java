package com.google.android.recaptcha.internal;

import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class zzkh {
    private static final zzkh zza = new zzke("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
    private static final zzkh zzb = new zzke("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');

    static {
        new zzkg("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
        new zzkg("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
        zzkd zzkdVar = new zzkd("base16()", "0123456789ABCDEF".toCharArray());
        new zzkg(zzkdVar, null);
        char[] cArr = new char[512];
        zzjf.zza(zzkdVar.zzf.length == 16);
        for (int i10 = 0; i10 < 256; i10++) {
            cArr[i10] = zzkdVar.zza(i10 >>> 4);
            cArr[i10 | 256] = zzkdVar.zza(i10 & 15);
        }
    }

    public static zzkh zzg() {
        return zza;
    }

    public static zzkh zzh() {
        return zzb;
    }

    public abstract int zza(byte[] bArr, CharSequence charSequence) throws zzkf;

    public abstract void zzb(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException;

    public abstract int zzc(int i10);

    public abstract int zzd(int i10);

    public CharSequence zze(CharSequence charSequence) {
        throw null;
    }

    public final String zzi(byte[] bArr, int i10, int i11) {
        zzjf.zzd(0, i11, bArr.length);
        StringBuilder sb = new StringBuilder(zzd(i11));
        try {
            zzb(sb, bArr, 0, i11);
            return sb.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public final byte[] zzj(CharSequence charSequence) {
        try {
            CharSequence charSequenceZze = zze(charSequence);
            int iZzc = zzc(charSequenceZze.length());
            byte[] bArr = new byte[iZzc];
            int iZza = zza(bArr, charSequenceZze);
            if (iZza == iZzc) {
                return bArr;
            }
            byte[] bArr2 = new byte[iZza];
            System.arraycopy(bArr, 0, bArr2, 0, iZza);
            return bArr2;
        } catch (zzkf e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}
