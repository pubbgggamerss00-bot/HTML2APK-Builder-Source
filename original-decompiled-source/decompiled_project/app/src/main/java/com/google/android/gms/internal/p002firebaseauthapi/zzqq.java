package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Build;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class zzqq {
    public static final Charset zza = Charset.forName("UTF-8");

    public static int zza() {
        int i10 = 0;
        while (i10 == 0) {
            byte[] bArrZza = zzqg.zza(4);
            i10 = (bArrZza[3] & 255) | ((bArrZza[0] & 255) << 24) | ((bArrZza[1] & 255) << 16) | ((bArrZza[2] & 255) << 8);
        }
        return i10;
    }

    public static final zzaae zzb(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt < '!' || cCharAt > '~') {
                throw new zzqo("Not a printable ASCII character: " + cCharAt);
            }
            bArr[i10] = (byte) cCharAt;
        }
        return zzaae.zza(bArr);
    }

    public static final zzaae zza(String str) throws GeneralSecurityException {
        byte[] bArr = new byte[str.length()];
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt >= '!' && cCharAt <= '~') {
                bArr[i10] = (byte) cCharAt;
            } else {
                throw new GeneralSecurityException("Not a printable ASCII character: " + cCharAt);
            }
        }
        return zzaae.zza(bArr);
    }

    public static Integer zzb() {
        if (Objects.equals(System.getProperty("java.vendor"), "The Android Project")) {
            return Integer.valueOf(Build.VERSION.SDK_INT);
        }
        return null;
    }

    public static boolean zza(byte[] bArr, byte[] bArr2) {
        if (bArr2.length < bArr.length) {
            return false;
        }
        for (int i10 = 0; i10 < bArr.length; i10++) {
            if (bArr2[i10] != bArr[i10]) {
                return false;
            }
        }
        return true;
    }
}
