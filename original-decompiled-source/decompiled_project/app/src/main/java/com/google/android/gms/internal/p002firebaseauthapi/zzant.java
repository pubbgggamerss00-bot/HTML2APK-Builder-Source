package com.google.android.gms.internal.p002firebaseauthapi;

import m0.r;
import org.jf.dexlib2.analysis.RegisterType;

/* loaded from: classes2.dex */
final class zzant {
    private static final zzanv zza;

    static {
        if (zzanp.zzc()) {
            zzanp.zzd();
        }
        zza = new zzanu();
    }

    public static /* synthetic */ int zza(byte[] bArr, int i10, int i11) {
        byte b10 = bArr[i10 - 1];
        int i12 = i11 - i10;
        if (i12 == 0) {
            if (b10 > -12) {
                return -1;
            }
            return b10;
        }
        if (i12 == 1) {
            byte b11 = bArr[i10];
            if (b10 > -12 || b11 > -65) {
                return -1;
            }
            return (b11 << 8) ^ b10;
        }
        if (i12 != 2) {
            throw new AssertionError();
        }
        byte b12 = bArr[i10];
        byte b13 = bArr[i10 + 1];
        if (b10 > -12 || b12 > -65 || b13 > -65) {
            return -1;
        }
        return (b13 << RegisterType.UNINIT_REF) ^ ((b12 << 8) ^ b10);
    }

    public static String zzb(byte[] bArr, int i10, int i11) throws zzalf {
        return zza.zza(bArr, i10, i11);
    }

    public static boolean zzc(byte[] bArr, int i10, int i11) {
        return zza.zza(0, bArr, i10, i11) == 0;
    }

    public static int zza(String str, byte[] bArr, int i10, int i11) {
        return zza.zza(str, bArr, i10, i11);
    }

    public static int zza(String str) {
        int length = str.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < length && str.charAt(i11) < 128) {
            i11++;
        }
        int i12 = length;
        while (true) {
            if (i11 >= length) {
                break;
            }
            char cCharAt = str.charAt(i11);
            if (cCharAt < 2048) {
                i12 += (127 - cCharAt) >>> 31;
                i11++;
            } else {
                int length2 = str.length();
                while (i11 < length2) {
                    char cCharAt2 = str.charAt(i11);
                    if (cCharAt2 < 2048) {
                        i10 += (127 - cCharAt2) >>> 31;
                    } else {
                        i10 += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i11) < 65536) {
                                throw new zzanx(i11, length2);
                            }
                            i11++;
                        }
                    }
                    i11++;
                }
                i12 += i10;
            }
        }
        if (i12 >= length) {
            return i12;
        }
        throw new IllegalArgumentException(r.a("UTF-8 length does not fit in int: ", i12 + 4294967296L));
    }
}
