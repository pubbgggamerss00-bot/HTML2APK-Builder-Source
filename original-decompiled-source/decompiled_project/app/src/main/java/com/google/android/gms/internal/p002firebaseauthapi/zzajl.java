package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import java.io.IOException;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jf.dexlib2.analysis.RegisterType;

/* loaded from: classes2.dex */
final class zzajl {
    private static volatile int zza = 100;

    public static double zza(byte[] bArr, int i10) {
        return Double.longBitsToDouble(zzd(bArr, i10));
    }

    public static float zzb(byte[] bArr, int i10) {
        return Float.intBitsToFloat(zzc(bArr, i10));
    }

    public static int zzc(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public static int zzd(byte[] bArr, int i10, zzajk zzajkVar) {
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        if (j10 >= 0) {
            zzajkVar.zzb = j10;
            return i11;
        }
        int i12 = i10 + 2;
        byte b10 = bArr[i11];
        long j11 = (j10 & 127) | ((b10 & Byte.MAX_VALUE) << 7);
        int i13 = 7;
        while (b10 < 0) {
            int i14 = i12 + 1;
            i13 += 7;
            j11 |= (r10 & Byte.MAX_VALUE) << i13;
            b10 = bArr[i12];
            i12 = i14;
        }
        zzajkVar.zzb = j11;
        return i12;
    }

    public static int zza(byte[] bArr, int i10, zzajk zzajkVar) throws zzalf {
        int iZzc = zzc(bArr, i10, zzajkVar);
        int i11 = zzajkVar.zza;
        if (i11 < 0) {
            throw zzalf.zzf();
        }
        if (i11 > bArr.length - iZzc) {
            throw zzalf.zzj();
        }
        if (i11 == 0) {
            zzajkVar.zzc = zzajp.zza;
            return iZzc;
        }
        zzajkVar.zzc = zzajp.zza(bArr, iZzc, i11);
        return iZzc + i11;
    }

    public static int zzb(zzamv<?> zzamvVar, int i10, byte[] bArr, int i11, int i12, zzalc<?> zzalcVar, zzajk zzajkVar) throws IOException {
        int iZza = zza(zzamvVar, bArr, i11, i12, zzajkVar);
        zzalcVar.add(zzajkVar.zzc);
        while (iZza < i12) {
            int iZzc = zzc(bArr, iZza, zzajkVar);
            if (i10 != zzajkVar.zza) {
                break;
            }
            iZza = zza(zzamvVar, bArr, iZzc, i12, zzajkVar);
            zzalcVar.add(zzajkVar.zzc);
        }
        return iZza;
    }

    public static int zzc(byte[] bArr, int i10, zzajk zzajkVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return zza(b10, bArr, i11, zzajkVar);
        }
        zzajkVar.zza = b10;
        return i11;
    }

    public static long zzd(byte[] bArr, int i10) {
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    public static int zzb(byte[] bArr, int i10, zzajk zzajkVar) throws zzalf {
        int iZzc = zzc(bArr, i10, zzajkVar);
        int i11 = zzajkVar.zza;
        if (i11 < 0) {
            throw zzalf.zzf();
        }
        if (i11 == 0) {
            zzajkVar.zzc = "";
            return iZzc;
        }
        zzajkVar.zzc = zzant.zzb(bArr, iZzc, i11);
        return iZzc + i11;
    }

    public static int zza(int i10, byte[] bArr, int i11, int i12, Object obj, zzamc zzamcVar, zzano<zzann, zzann> zzanoVar, zzajk zzajkVar) throws IOException {
        if (zzajkVar.zzd.zza(zzamcVar, i10 >>> 3) == null) {
            return zza(i10, bArr, i11, i12, zzamg.zzc(obj), zzajkVar);
        }
        zzaky.zzb zzbVar = (zzaky.zzb) obj;
        zzbVar.zza();
        zzakr<zzaky.zze> zzakrVar = zzbVar.zzc;
        throw new NoSuchMethodError();
    }

    private static <T> int zza(zzamv<T> zzamvVar, byte[] bArr, int i10, int i11, int i12, zzajk zzajkVar) throws IOException {
        T tZza = zzamvVar.zza();
        int iZza = zza(tZza, zzamvVar, bArr, i10, i11, i12, zzajkVar);
        zzamvVar.zzd(tZza);
        zzajkVar.zzc = tZza;
        return iZza;
    }

    public static int zza(zzamv<?> zzamvVar, int i10, byte[] bArr, int i11, int i12, zzalc<Object> zzalcVar, zzajk zzajkVar) throws IOException {
        int i13 = (i10 & (-8)) | 4;
        int iZza = zza(zzamvVar, bArr, i11, i12, i13, zzajkVar);
        zzalcVar.add(zzajkVar.zzc);
        while (iZza < i12) {
            int iZzc = zzc(bArr, iZza, zzajkVar);
            if (i10 != zzajkVar.zza) {
                break;
            }
            iZza = zza(zzamvVar, bArr, iZzc, i12, i13, zzajkVar);
            zzalcVar.add(zzajkVar.zzc);
        }
        return iZza;
    }

    public static <T> int zza(zzamv<T> zzamvVar, byte[] bArr, int i10, int i11, zzajk zzajkVar) throws IOException {
        T tZza = zzamvVar.zza();
        int iZza = zza(tZza, zzamvVar, bArr, i10, i11, zzajkVar);
        zzamvVar.zzd(tZza);
        zzajkVar.zzc = tZza;
        return iZza;
    }

    public static int zza(byte[] bArr, int i10, zzalc<?> zzalcVar, zzajk zzajkVar) throws IOException {
        zzakz zzakzVar = (zzakz) zzalcVar;
        int iZzc = zzc(bArr, i10, zzajkVar);
        int i11 = zzajkVar.zza + iZzc;
        while (iZzc < i11) {
            iZzc = zzc(bArr, iZzc, zzajkVar);
            zzakzVar.zzc(zzajkVar.zza);
        }
        if (iZzc == i11) {
            return iZzc;
        }
        throw zzalf.zzj();
    }

    public static int zza(int i10, byte[] bArr, int i11, int i12, zzann zzannVar, zzajk zzajkVar) throws zzalf {
        if ((i10 >>> 3) == 0) {
            throw zzalf.zzc();
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int iZzd = zzd(bArr, i11, zzajkVar);
            zzannVar.zza(i10, Long.valueOf(zzajkVar.zzb));
            return iZzd;
        }
        if (i13 == 1) {
            zzannVar.zza(i10, Long.valueOf(zzd(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int iZzc = zzc(bArr, i11, zzajkVar);
            int i14 = zzajkVar.zza;
            if (i14 >= 0) {
                if (i14 > bArr.length - iZzc) {
                    throw zzalf.zzj();
                }
                if (i14 == 0) {
                    zzannVar.zza(i10, zzajp.zza);
                } else {
                    zzannVar.zza(i10, zzajp.zza(bArr, iZzc, i14));
                }
                return iZzc + i14;
            }
            throw zzalf.zzf();
        }
        if (i13 != 3) {
            if (i13 == 5) {
                zzannVar.zza(i10, Integer.valueOf(zzc(bArr, i11)));
                return i11 + 4;
            }
            throw zzalf.zzc();
        }
        zzann zzannVarZzd = zzann.zzd();
        int i15 = (i10 & (-8)) | 4;
        int i16 = zzajkVar.zze + 1;
        zzajkVar.zze = i16;
        zza(i16);
        int i17 = 0;
        while (true) {
            if (i11 >= i12) {
                break;
            }
            int iZzc2 = zzc(bArr, i11, zzajkVar);
            i17 = zzajkVar.zza;
            if (i17 == i15) {
                i11 = iZzc2;
                break;
            }
            i11 = zza(i17, bArr, iZzc2, i12, zzannVarZzd, zzajkVar);
        }
        zzajkVar.zze--;
        if (i11 <= i12 && i17 == i15) {
            zzannVar.zza(i10, zzannVarZzd);
            return i11;
        }
        throw zzalf.zzg();
    }

    public static int zza(int i10, byte[] bArr, int i11, zzajk zzajkVar) {
        int i12 = i10 & CertificateBody.profileType;
        int i13 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            zzajkVar.zza = i12 | (b10 << 7);
            return i13;
        }
        int i14 = i12 | ((b10 & Byte.MAX_VALUE) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i13];
        if (b11 >= 0) {
            zzajkVar.zza = i14 | (b11 << RegisterType.DOUBLE_LO);
            return i15;
        }
        int i16 = i14 | ((b11 & Byte.MAX_VALUE) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            zzajkVar.zza = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & Byte.MAX_VALUE) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            zzajkVar.zza = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                zzajkVar.zza = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    public static int zza(int i10, byte[] bArr, int i11, int i12, zzalc<?> zzalcVar, zzajk zzajkVar) {
        zzakz zzakzVar = (zzakz) zzalcVar;
        int iZzc = zzc(bArr, i11, zzajkVar);
        zzakzVar.zzc(zzajkVar.zza);
        while (iZzc < i12) {
            int iZzc2 = zzc(bArr, iZzc, zzajkVar);
            if (i10 != zzajkVar.zza) {
                break;
            }
            iZzc = zzc(bArr, iZzc2, zzajkVar);
            zzakzVar.zzc(zzajkVar.zza);
        }
        return iZzc;
    }

    public static <T> int zza(Object obj, zzamv<T> zzamvVar, byte[] bArr, int i10, int i11, int i12, zzajk zzajkVar) throws IOException {
        int i13 = zzajkVar.zze + 1;
        zzajkVar.zze = i13;
        zza(i13);
        int iZza = ((zzamg) zzamvVar).zza((zzamg) obj, bArr, i10, i11, i12, zzajkVar);
        zzajkVar.zze--;
        zzajkVar.zzc = obj;
        return iZza;
    }

    public static <T> int zza(Object obj, zzamv<T> zzamvVar, byte[] bArr, int i10, int i11, zzajk zzajkVar) throws IOException {
        int iZza = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iZza = zza(i12, bArr, iZza, zzajkVar);
            i12 = zzajkVar.zza;
        }
        int i13 = iZza;
        if (i12 >= 0 && i12 <= i11 - i13) {
            int i14 = zzajkVar.zze + 1;
            zzajkVar.zze = i14;
            zza(i14);
            int i15 = i13 + i12;
            zzamvVar.zza(obj, bArr, i13, i15, zzajkVar);
            zzajkVar.zze--;
            zzajkVar.zzc = obj;
            return i15;
        }
        throw zzalf.zzj();
    }

    public static int zza(int i10, byte[] bArr, int i11, int i12, zzajk zzajkVar) throws zzalf {
        if ((i10 >>> 3) == 0) {
            throw zzalf.zzc();
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            return zzd(bArr, i11, zzajkVar);
        }
        if (i13 == 1) {
            return i11 + 8;
        }
        if (i13 == 2) {
            return zzc(bArr, i11, zzajkVar) + zzajkVar.zza;
        }
        if (i13 != 3) {
            if (i13 == 5) {
                return i11 + 4;
            }
            throw zzalf.zzc();
        }
        int i14 = (i10 & (-8)) | 4;
        int i15 = 0;
        while (i11 < i12) {
            i11 = zzc(bArr, i11, zzajkVar);
            i15 = zzajkVar.zza;
            if (i15 == i14) {
                break;
            }
            i11 = zza(i15, bArr, i11, i12, zzajkVar);
        }
        if (i11 > i12 || i15 != i14) {
            throw zzalf.zzg();
        }
        return i11;
    }

    private static void zza(int i10) throws zzalf {
        if (i10 >= zza) {
            throw zzalf.zzh();
        }
    }
}
