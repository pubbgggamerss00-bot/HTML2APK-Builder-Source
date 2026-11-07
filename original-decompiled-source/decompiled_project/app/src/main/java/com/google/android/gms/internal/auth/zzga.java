package com.google.android.gms.internal.auth;

import androidx.room.y0;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.EACTags;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
final class zzga<T> implements zzgi<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzhj.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzfx zzg;
    private final int[] zzh;
    private final int zzi;
    private final int zzj;
    private final zzfl zzk;
    private final zzgz zzl;
    private final zzem zzm;
    private final zzgc zzn;
    private final zzfs zzo;

    private zzga(int[] iArr, Object[] objArr, int i10, int i11, zzfx zzfxVar, int i12, boolean z10, int[] iArr2, int i13, int i14, zzgc zzgcVar, zzfl zzflVar, zzgz zzgzVar, zzem zzemVar, zzfs zzfsVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        this.zzh = iArr2;
        this.zzi = i13;
        this.zzj = i14;
        this.zzn = zzgcVar;
        this.zzk = zzflVar;
        this.zzl = zzgzVar;
        this.zzm = zzemVar;
        this.zzg = zzfxVar;
        this.zzo = zzfsVar;
    }

    private final void zzA(Object obj, int i10, int i11) {
        zzhj.zzn(obj, zzl(i11) & 1048575, i10);
    }

    private final void zzB(Object obj, int i10, Object obj2) {
        zzb.putObject(obj, zzo(i10) & 1048575, obj2);
        zzz(obj, i10);
    }

    private final void zzC(Object obj, int i10, int i11, Object obj2) {
        zzb.putObject(obj, zzo(i11) & 1048575, obj2);
        zzA(obj, i10, i11);
    }

    private final boolean zzD(Object obj, Object obj2, int i10) {
        return zzE(obj, i10) == zzE(obj2, i10);
    }

    private final boolean zzE(Object obj, int i10) {
        int iZzl = zzl(i10);
        long j10 = iZzl & 1048575;
        if (j10 != 1048575) {
            return (zzhj.zzc(obj, j10) & (1 << (iZzl >>> 20))) != 0;
        }
        int iZzo = zzo(i10);
        long j11 = iZzo & 1048575;
        switch (zzn(iZzo)) {
            case 0:
                return Double.doubleToRawLongBits(zzhj.zza(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzhj.zzb(obj, j11)) != 0;
            case 2:
                return zzhj.zzd(obj, j11) != 0;
            case 3:
                return zzhj.zzd(obj, j11) != 0;
            case 4:
                return zzhj.zzc(obj, j11) != 0;
            case 5:
                return zzhj.zzd(obj, j11) != 0;
            case 6:
                return zzhj.zzc(obj, j11) != 0;
            case 7:
                return zzhj.zzt(obj, j11);
            case 8:
                Object objZzf = zzhj.zzf(obj, j11);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzef) {
                    return !zzef.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzhj.zzf(obj, j11) != null;
            case 10:
                return !zzef.zzb.equals(zzhj.zzf(obj, j11));
            case 11:
                return zzhj.zzc(obj, j11) != 0;
            case 12:
                return zzhj.zzc(obj, j11) != 0;
            case 13:
                return zzhj.zzc(obj, j11) != 0;
            case 14:
                return zzhj.zzd(obj, j11) != 0;
            case 15:
                return zzhj.zzc(obj, j11) != 0;
            case 16:
                return zzhj.zzd(obj, j11) != 0;
            case 17:
                return zzhj.zzf(obj, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzF(Object obj, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? zzE(obj, i10) : (i12 & i13) != 0;
    }

    private static boolean zzG(Object obj, int i10, zzgi zzgiVar) {
        return zzgiVar.zzi(zzhj.zzf(obj, i10 & 1048575));
    }

    private static boolean zzH(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzev) {
            return ((zzev) obj).zzm();
        }
        return true;
    }

    private final boolean zzI(Object obj, int i10, int i11) {
        return zzhj.zzc(obj, (long) (zzl(i11) & 1048575)) == i10;
    }

    public static zzha zzc(Object obj) {
        zzev zzevVar = (zzev) obj;
        zzha zzhaVar = zzevVar.zzc;
        if (zzhaVar != zzha.zza()) {
            return zzhaVar;
        }
        zzha zzhaVarZzd = zzha.zzd();
        zzevVar.zzc = zzhaVarZzd;
        return zzhaVarZzd;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0273  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzga zzj(Class cls, zzfu zzfuVar, zzgc zzgcVar, zzfl zzflVar, zzgz zzgzVar, zzem zzemVar, zzfs zzfsVar) {
        int i10;
        int iCharAt;
        int i11;
        int i12;
        int i13;
        int[] iArr;
        int i14;
        int i15;
        int i16;
        int i17;
        char cCharAt;
        int i18;
        char cCharAt2;
        int i19;
        char cCharAt3;
        int i20;
        char cCharAt4;
        int i21;
        char cCharAt5;
        int i22;
        char cCharAt6;
        int i23;
        char cCharAt7;
        int i24;
        char cCharAt8;
        int i25;
        int i26;
        zzgh zzghVar;
        int i27;
        int i28;
        int i29;
        String str;
        int i30;
        int i31;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        Field fieldZzv;
        char cCharAt9;
        int i32;
        int i33;
        Object obj;
        Field fieldZzv2;
        Object obj2;
        Field fieldZzv3;
        int i34;
        char cCharAt10;
        int i35;
        char cCharAt11;
        int i36;
        char cCharAt12;
        int i37;
        char cCharAt13;
        if (!(zzfuVar instanceof zzgh)) {
            throw null;
        }
        zzgh zzghVar2 = (zzgh) zzfuVar;
        String strZzd = zzghVar2.zzd();
        int length = strZzd.length();
        char c10 = 55296;
        if (strZzd.charAt(0) >= 55296) {
            int i38 = 1;
            while (true) {
                i10 = i38 + 1;
                if (strZzd.charAt(i38) < 55296) {
                    break;
                }
                i38 = i10;
            }
        } else {
            i10 = 1;
        }
        int i39 = i10 + 1;
        int iCharAt2 = strZzd.charAt(i10);
        if (iCharAt2 >= 55296) {
            int i40 = iCharAt2 & 8191;
            int i41 = 13;
            while (true) {
                i37 = i39 + 1;
                cCharAt13 = strZzd.charAt(i39);
                if (cCharAt13 < 55296) {
                    break;
                }
                i40 |= (cCharAt13 & 8191) << i41;
                i41 += 13;
                i39 = i37;
            }
            iCharAt2 = i40 | (cCharAt13 << i41);
            i39 = i37;
        }
        if (iCharAt2 == 0) {
            i13 = 0;
            iCharAt = 0;
            i12 = 0;
            i14 = 0;
            i11 = 0;
            i15 = 0;
            iArr = zza;
            i16 = 0;
        } else {
            int i42 = i39 + 1;
            int iCharAt3 = strZzd.charAt(i39);
            if (iCharAt3 >= 55296) {
                int i43 = iCharAt3 & 8191;
                int i44 = 13;
                while (true) {
                    i24 = i42 + 1;
                    cCharAt8 = strZzd.charAt(i42);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i43 |= (cCharAt8 & 8191) << i44;
                    i44 += 13;
                    i42 = i24;
                }
                iCharAt3 = i43 | (cCharAt8 << i44);
                i42 = i24;
            }
            int i45 = i42 + 1;
            int iCharAt4 = strZzd.charAt(i42);
            if (iCharAt4 >= 55296) {
                int i46 = iCharAt4 & 8191;
                int i47 = 13;
                while (true) {
                    i23 = i45 + 1;
                    cCharAt7 = strZzd.charAt(i45);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i46 |= (cCharAt7 & 8191) << i47;
                    i47 += 13;
                    i45 = i23;
                }
                iCharAt4 = i46 | (cCharAt7 << i47);
                i45 = i23;
            }
            int i48 = i45 + 1;
            int iCharAt5 = strZzd.charAt(i45);
            if (iCharAt5 >= 55296) {
                int i49 = iCharAt5 & 8191;
                int i50 = 13;
                while (true) {
                    i22 = i48 + 1;
                    cCharAt6 = strZzd.charAt(i48);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt6 & 8191) << i50;
                    i50 += 13;
                    i48 = i22;
                }
                iCharAt5 = i49 | (cCharAt6 << i50);
                i48 = i22;
            }
            int i51 = i48 + 1;
            int iCharAt6 = strZzd.charAt(i48);
            if (iCharAt6 >= 55296) {
                int i52 = iCharAt6 & 8191;
                int i53 = 13;
                while (true) {
                    i21 = i51 + 1;
                    cCharAt5 = strZzd.charAt(i51);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i52 |= (cCharAt5 & 8191) << i53;
                    i53 += 13;
                    i51 = i21;
                }
                iCharAt6 = i52 | (cCharAt5 << i53);
                i51 = i21;
            }
            int i54 = i51 + 1;
            iCharAt = strZzd.charAt(i51);
            if (iCharAt >= 55296) {
                int i55 = iCharAt & 8191;
                int i56 = 13;
                while (true) {
                    i20 = i54 + 1;
                    cCharAt4 = strZzd.charAt(i54);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i55 |= (cCharAt4 & 8191) << i56;
                    i56 += 13;
                    i54 = i20;
                }
                iCharAt = i55 | (cCharAt4 << i56);
                i54 = i20;
            }
            int i57 = i54 + 1;
            int iCharAt7 = strZzd.charAt(i54);
            if (iCharAt7 >= 55296) {
                int i58 = iCharAt7 & 8191;
                int i59 = 13;
                while (true) {
                    i19 = i57 + 1;
                    cCharAt3 = strZzd.charAt(i57);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i58 |= (cCharAt3 & 8191) << i59;
                    i59 += 13;
                    i57 = i19;
                }
                iCharAt7 = i58 | (cCharAt3 << i59);
                i57 = i19;
            }
            int i60 = i57 + 1;
            int iCharAt8 = strZzd.charAt(i57);
            if (iCharAt8 >= 55296) {
                int i61 = iCharAt8 & 8191;
                int i62 = 13;
                while (true) {
                    i18 = i60 + 1;
                    cCharAt2 = strZzd.charAt(i60);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i61 |= (cCharAt2 & 8191) << i62;
                    i62 += 13;
                    i60 = i18;
                }
                iCharAt8 = i61 | (cCharAt2 << i62);
                i60 = i18;
            }
            int i63 = i60 + 1;
            int iCharAt9 = strZzd.charAt(i60);
            if (iCharAt9 >= 55296) {
                int i64 = iCharAt9 & 8191;
                int i65 = 13;
                while (true) {
                    i17 = i63 + 1;
                    cCharAt = strZzd.charAt(i63);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i64 |= (cCharAt & 8191) << i65;
                    i65 += 13;
                    i63 = i17;
                }
                iCharAt9 = i64 | (cCharAt << i65);
                i63 = i17;
            }
            i11 = iCharAt3 + iCharAt3 + iCharAt4;
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            int i66 = iCharAt7;
            i12 = iCharAt5;
            i13 = i66;
            iArr = iArr2;
            i14 = iCharAt6;
            i15 = iCharAt9;
            i16 = iCharAt3;
            i39 = i63;
        }
        Unsafe unsafe = zzb;
        Object[] objArrZze = zzghVar2.zze();
        Class<?> cls2 = zzghVar2.zza().getClass();
        int i67 = i15 + i13;
        int i68 = iCharAt + iCharAt;
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr = new Object[i68];
        int i69 = 0;
        int i70 = 0;
        int i71 = i15;
        int i72 = i67;
        while (i39 < length) {
            int i73 = i39 + 1;
            int iCharAt10 = strZzd.charAt(i39);
            if (iCharAt10 >= c10) {
                int i74 = iCharAt10 & 8191;
                int i75 = i73;
                int i76 = 13;
                while (true) {
                    i36 = i75 + 1;
                    cCharAt12 = strZzd.charAt(i75);
                    if (cCharAt12 < c10) {
                        break;
                    }
                    i74 |= (cCharAt12 & 8191) << i76;
                    i76 += 13;
                    i75 = i36;
                }
                iCharAt10 = i74 | (cCharAt12 << i76);
                i25 = i36;
            } else {
                i25 = i73;
            }
            int i77 = i25 + 1;
            int iCharAt11 = strZzd.charAt(i25);
            if (iCharAt11 >= c10) {
                int i78 = iCharAt11 & 8191;
                int i79 = i77;
                int i80 = 13;
                while (true) {
                    i35 = i79 + 1;
                    cCharAt11 = strZzd.charAt(i79);
                    if (cCharAt11 < c10) {
                        break;
                    }
                    i78 |= (cCharAt11 & 8191) << i80;
                    i80 += 13;
                    i79 = i35;
                }
                iCharAt11 = i78 | (cCharAt11 << i80);
                i26 = i35;
            } else {
                i26 = i77;
            }
            if ((iCharAt11 & 1024) != 0) {
                iArr[i69] = i70;
                i69++;
            }
            int i81 = iCharAt11 & 255;
            if (i81 >= 51) {
                int i82 = i26 + 1;
                int iCharAt12 = strZzd.charAt(i26);
                zzghVar = zzghVar2;
                char c11 = 55296;
                if (iCharAt12 >= 55296) {
                    int i83 = iCharAt12 & 8191;
                    int i84 = 13;
                    while (true) {
                        i34 = i82 + 1;
                        cCharAt10 = strZzd.charAt(i82);
                        if (cCharAt10 < c11) {
                            break;
                        }
                        i83 |= (cCharAt10 & 8191) << i84;
                        i84 += 13;
                        i82 = i34;
                        c11 = 55296;
                    }
                    iCharAt12 = i83 | (cCharAt10 << i84);
                    i82 = i34;
                }
                int i85 = i81 - 51;
                i27 = length;
                if (i85 == 9 || i85 == 17) {
                    int i86 = i70 / 3;
                    i33 = i11 + 1;
                    objArr[i86 + i86 + 1] = objArrZze[i11];
                } else {
                    if (i85 == 12 && (zzghVar.zzc() == 1 || (iCharAt11 & 2048) != 0)) {
                        int i87 = i70 / 3;
                        i33 = i11 + 1;
                        objArr[i87 + i87 + 1] = objArrZze[i11];
                    }
                    int i88 = iCharAt12 + iCharAt12;
                    obj = objArrZze[i88];
                    if (obj instanceof Field) {
                        fieldZzv2 = zzv(cls2, (String) obj);
                        objArrZze[i88] = fieldZzv2;
                    } else {
                        fieldZzv2 = (Field) obj;
                    }
                    i28 = iCharAt10;
                    int i89 = i82;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzv2);
                    int i90 = i88 + 1;
                    obj2 = objArrZze[i90];
                    if (obj2 instanceof Field) {
                        fieldZzv3 = zzv(cls2, (String) obj2);
                        objArrZze[i90] = fieldZzv3;
                    } else {
                        fieldZzv3 = (Field) obj2;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzv3);
                    str = strZzd;
                    i30 = i89;
                    i31 = 0;
                }
                i11 = i33;
                int i882 = iCharAt12 + iCharAt12;
                obj = objArrZze[i882];
                if (obj instanceof Field) {
                }
                i28 = iCharAt10;
                int i892 = i82;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzv2);
                int i902 = i882 + 1;
                obj2 = objArrZze[i902];
                if (obj2 instanceof Field) {
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzv3);
                str = strZzd;
                i30 = i892;
                i31 = 0;
            } else {
                zzghVar = zzghVar2;
                i27 = length;
                i28 = iCharAt10;
                int i91 = i11 + 1;
                Field fieldZzv4 = zzv(cls2, (String) objArrZze[i11]);
                if (i81 == 9 || i81 == 17) {
                    i29 = i91;
                    int i92 = i70 / 3;
                    objArr[i92 + i92 + 1] = fieldZzv4.getType();
                } else {
                    if (i81 == 27 || i81 == 49) {
                        int i93 = i70 / 3;
                        i32 = i11 + 2;
                        objArr[i93 + i93 + 1] = objArrZze[i91];
                    } else if (i81 == 12 || i81 == 30 || i81 == 44) {
                        i29 = i91;
                        if (zzghVar.zzc() == 1 || (iCharAt11 & 2048) != 0) {
                            int i94 = i70 / 3;
                            i32 = i11 + 2;
                            objArr[i94 + i94 + 1] = objArrZze[i29];
                        }
                    } else if (i81 == 50) {
                        int i95 = i71 + 1;
                        iArr[i71] = i70;
                        int i96 = i70 / 3;
                        i29 = i11 + 2;
                        int i97 = i96 + i96;
                        objArr[i97] = objArrZze[i91];
                        if ((iCharAt11 & 2048) != 0) {
                            objArr[i97 + 1] = objArrZze[i29];
                            i29 = i11 + 3;
                        }
                        i71 = i95;
                    } else {
                        i29 = i91;
                    }
                    i29 = i32;
                }
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzv4);
                int iObjectFieldOffset4 = 1048575;
                if ((iCharAt11 & 4096) == 0 || i81 > 17) {
                    str = strZzd;
                    i30 = i26;
                    i31 = 0;
                } else {
                    int i98 = i26 + 1;
                    int iCharAt13 = strZzd.charAt(i26);
                    if (iCharAt13 >= 55296) {
                        int i99 = iCharAt13 & 8191;
                        int i100 = 13;
                        while (true) {
                            i30 = i98 + 1;
                            cCharAt9 = strZzd.charAt(i98);
                            if (cCharAt9 < 55296) {
                                break;
                            }
                            i99 |= (cCharAt9 & 8191) << i100;
                            i100 += 13;
                            i98 = i30;
                        }
                        iCharAt13 = i99 | (cCharAt9 << i100);
                    } else {
                        i30 = i98;
                    }
                    int i101 = (iCharAt13 / 32) + i16 + i16;
                    Object obj3 = objArrZze[i101];
                    if (obj3 instanceof Field) {
                        fieldZzv = (Field) obj3;
                    } else {
                        fieldZzv = zzv(cls2, (String) obj3);
                        objArrZze[i101] = fieldZzv;
                    }
                    str = strZzd;
                    i31 = iCharAt13 % 32;
                    iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldZzv);
                }
                if (i81 >= 18 && i81 <= 49) {
                    iArr[i72] = iObjectFieldOffset3;
                    i72++;
                }
                iObjectFieldOffset = iObjectFieldOffset3;
                iObjectFieldOffset2 = iObjectFieldOffset4;
                i11 = i29;
            }
            int i102 = i70 + 1;
            iArr3[i70] = i28;
            int i103 = i70 + 2;
            iArr3[i102] = ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 512) != 0 ? PKIFailureInfo.duplicateCertReq : 0) | ((iCharAt11 & 2048) != 0 ? PKIFailureInfo.systemUnavail : 0) | (i81 << 20) | iObjectFieldOffset;
            i70 += 3;
            iArr3[i103] = (i31 << 20) | iObjectFieldOffset2;
            i39 = i30;
            zzghVar2 = zzghVar;
            strZzd = str;
            length = i27;
            c10 = 55296;
        }
        zzgh zzghVar3 = zzghVar2;
        return new zzga(iArr3, objArr, i12, i14, zzghVar3.zza(), zzghVar3.zzc(), false, iArr, i15, i67, zzgcVar, zzflVar, zzgzVar, zzemVar, zzfsVar);
    }

    private static int zzk(Object obj, long j10) {
        return ((Integer) zzhj.zzf(obj, j10)).intValue();
    }

    private final int zzl(int i10) {
        return this.zzc[i10 + 2];
    }

    private final int zzm(int i10, int i11) {
        int length = (this.zzc.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = this.zzc[i13];
            if (i10 == i14) {
                return i13;
            }
            if (i10 < i14) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    private static int zzn(int i10) {
        return (i10 >>> 20) & 255;
    }

    private final int zzo(int i10) {
        return this.zzc[i10 + 1];
    }

    private static long zzp(Object obj, long j10) {
        return ((Long) zzhj.zzf(obj, j10)).longValue();
    }

    private final zzey zzq(int i10) {
        int i11 = i10 / 3;
        return (zzey) this.zzd[i11 + i11 + 1];
    }

    private final zzgi zzr(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zzgi zzgiVar = (zzgi) this.zzd[i12];
        if (zzgiVar != null) {
            return zzgiVar;
        }
        zzgi zzgiVarZzb = zzgf.zza().zzb((Class) this.zzd[i12 + 1]);
        this.zzd[i12] = zzgiVarZzb;
        return zzgiVarZzb;
    }

    private final Object zzs(int i10) {
        int i11 = i10 / 3;
        return this.zzd[i11 + i11];
    }

    private final Object zzt(Object obj, int i10) {
        zzgi zzgiVarZzr = zzr(i10);
        int iZzo = zzo(i10) & 1048575;
        if (!zzE(obj, i10)) {
            return zzgiVarZzr.zzd();
        }
        Object object = zzb.getObject(obj, iZzo);
        if (zzH(object)) {
            return object;
        }
        Object objZzd = zzgiVarZzr.zzd();
        if (object != null) {
            zzgiVarZzr.zzf(objZzd, object);
        }
        return objZzd;
    }

    private final Object zzu(Object obj, int i10, int i11) {
        zzgi zzgiVarZzr = zzr(i11);
        if (!zzI(obj, i10, i11)) {
            return zzgiVarZzr.zzd();
        }
        Object object = zzb.getObject(obj, zzo(i11) & 1048575);
        if (zzH(object)) {
            return object;
        }
        Object objZzd = zzgiVarZzr.zzd();
        if (object != null) {
            zzgiVarZzr.zzf(objZzd, object);
        }
        return objZzd;
    }

    private static Field zzv(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sbA = y0.a("Field ", str, " for ", name, " not found. Known fields are ");
            sbA.append(string);
            throw new RuntimeException(sbA.toString());
        }
    }

    private static void zzw(Object obj) {
        if (!zzH(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzx(Object obj, Object obj2, int i10) {
        if (zzE(obj2, i10)) {
            int iZzo = zzo(i10) & 1048575;
            Unsafe unsafe = zzb;
            long j10 = iZzo;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + obj2.toString());
            }
            zzgi zzgiVarZzr = zzr(i10);
            if (!zzE(obj, i10)) {
                if (zzH(object)) {
                    Object objZzd = zzgiVarZzr.zzd();
                    zzgiVarZzr.zzf(objZzd, object);
                    unsafe.putObject(obj, j10, objZzd);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                zzz(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzH(object2)) {
                Object objZzd2 = zzgiVarZzr.zzd();
                zzgiVarZzr.zzf(objZzd2, object2);
                unsafe.putObject(obj, j10, objZzd2);
                object2 = objZzd2;
            }
            zzgiVarZzr.zzf(object2, object);
        }
    }

    private final void zzy(Object obj, Object obj2, int i10) {
        int i11 = this.zzc[i10];
        if (zzI(obj2, i11, i10)) {
            int iZzo = zzo(i10) & 1048575;
            Unsafe unsafe = zzb;
            long j10 = iZzo;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + obj2.toString());
            }
            zzgi zzgiVarZzr = zzr(i10);
            if (!zzI(obj, i11, i10)) {
                if (zzH(object)) {
                    Object objZzd = zzgiVarZzr.zzd();
                    zzgiVarZzr.zzf(objZzd, object);
                    unsafe.putObject(obj, j10, objZzd);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                zzA(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzH(object2)) {
                Object objZzd2 = zzgiVarZzr.zzd();
                zzgiVarZzr.zzf(objZzd2, object2);
                unsafe.putObject(obj, j10, objZzd2);
                object2 = objZzd2;
            }
            zzgiVarZzr.zzf(object2, object);
        }
    }

    private final void zzz(Object obj, int i10) {
        int iZzl = zzl(i10);
        long j10 = 1048575 & iZzl;
        if (j10 == 1048575) {
            return;
        }
        zzhj.zzn(obj, j10, (1 << (iZzl >>> 20)) | zzhj.zzc(obj, j10));
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final int zza(Object obj) {
        int i10;
        long jDoubleToLongBits;
        int i11;
        int iFloatToIntBits;
        int iZzc;
        int length = this.zzc.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int iZzo = zzo(i13);
            int i14 = this.zzc[i13];
            long j10 = 1048575 & iZzo;
            int iHashCode = 37;
            switch (zzn(iZzo)) {
                case 0:
                    i10 = i12 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzhj.zza(obj, j10));
                    byte[] bArr = zzfa.zzd;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i10 + iZzc;
                    break;
                case 1:
                    i11 = i12 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzhj.zzb(obj, j10));
                    i12 = iFloatToIntBits + i11;
                    break;
                case 2:
                    i10 = i12 * 53;
                    jDoubleToLongBits = zzhj.zzd(obj, j10);
                    byte[] bArr2 = zzfa.zzd;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i10 + iZzc;
                    break;
                case 3:
                    i10 = i12 * 53;
                    jDoubleToLongBits = zzhj.zzd(obj, j10);
                    byte[] bArr3 = zzfa.zzd;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i10 + iZzc;
                    break;
                case 4:
                    i10 = i12 * 53;
                    iZzc = zzhj.zzc(obj, j10);
                    i12 = i10 + iZzc;
                    break;
                case 5:
                    i10 = i12 * 53;
                    jDoubleToLongBits = zzhj.zzd(obj, j10);
                    byte[] bArr4 = zzfa.zzd;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i10 + iZzc;
                    break;
                case 6:
                    i10 = i12 * 53;
                    iZzc = zzhj.zzc(obj, j10);
                    i12 = i10 + iZzc;
                    break;
                case 7:
                    i11 = i12 * 53;
                    iFloatToIntBits = zzfa.zza(zzhj.zzt(obj, j10));
                    i12 = iFloatToIntBits + i11;
                    break;
                case 8:
                    i11 = i12 * 53;
                    iFloatToIntBits = ((String) zzhj.zzf(obj, j10)).hashCode();
                    i12 = iFloatToIntBits + i11;
                    break;
                case 9:
                    Object objZzf = zzhj.zzf(obj, j10);
                    if (objZzf != null) {
                        iHashCode = objZzf.hashCode();
                    }
                    i12 = (i12 * 53) + iHashCode;
                    break;
                case 10:
                    i11 = i12 * 53;
                    iFloatToIntBits = zzhj.zzf(obj, j10).hashCode();
                    i12 = iFloatToIntBits + i11;
                    break;
                case 11:
                    i10 = i12 * 53;
                    iZzc = zzhj.zzc(obj, j10);
                    i12 = i10 + iZzc;
                    break;
                case 12:
                    i10 = i12 * 53;
                    iZzc = zzhj.zzc(obj, j10);
                    i12 = i10 + iZzc;
                    break;
                case 13:
                    i10 = i12 * 53;
                    iZzc = zzhj.zzc(obj, j10);
                    i12 = i10 + iZzc;
                    break;
                case 14:
                    i10 = i12 * 53;
                    jDoubleToLongBits = zzhj.zzd(obj, j10);
                    byte[] bArr5 = zzfa.zzd;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i10 + iZzc;
                    break;
                case 15:
                    i10 = i12 * 53;
                    iZzc = zzhj.zzc(obj, j10);
                    i12 = i10 + iZzc;
                    break;
                case 16:
                    i10 = i12 * 53;
                    jDoubleToLongBits = zzhj.zzd(obj, j10);
                    byte[] bArr6 = zzfa.zzd;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i10 + iZzc;
                    break;
                case 17:
                    Object objZzf2 = zzhj.zzf(obj, j10);
                    if (objZzf2 != null) {
                        iHashCode = objZzf2.hashCode();
                    }
                    i12 = (i12 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case EACTags.DATE_OF_BIRTH /* 43 */:
                case 44:
                case 45:
                case 46:
                case EACTags.PIN_USAGE_POLICY /* 47 */:
                case 48:
                case 49:
                    i11 = i12 * 53;
                    iFloatToIntBits = zzhj.zzf(obj, j10).hashCode();
                    i12 = iFloatToIntBits + i11;
                    break;
                case 50:
                    i11 = i12 * 53;
                    iFloatToIntBits = zzhj.zzf(obj, j10).hashCode();
                    i12 = iFloatToIntBits + i11;
                    break;
                case EACTags.TRANSACTION_DATE /* 51 */:
                    if (zzI(obj, i14, i13)) {
                        i10 = i12 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(((Double) zzhj.zzf(obj, j10)).doubleValue());
                        byte[] bArr7 = zzfa.zzd;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzI(obj, i14, i13)) {
                        i11 = i12 * 53;
                        iFloatToIntBits = Float.floatToIntBits(((Float) zzhj.zzf(obj, j10)).floatValue());
                        i12 = iFloatToIntBits + i11;
                        break;
                    } else {
                        break;
                    }
                case EACTags.SEX /* 53 */:
                    if (zzI(obj, i14, i13)) {
                        i10 = i12 * 53;
                        jDoubleToLongBits = zzp(obj, j10);
                        byte[] bArr8 = zzfa.zzd;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case EACTags.CURRENCY_EXPONENT /* 54 */:
                    if (zzI(obj, i14, i13)) {
                        i10 = i12 * 53;
                        jDoubleToLongBits = zzp(obj, j10);
                        byte[] bArr9 = zzfa.zzd;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzI(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iZzc = zzk(obj, j10);
                        i12 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzI(obj, i14, i13)) {
                        i10 = i12 * 53;
                        jDoubleToLongBits = zzp(obj, j10);
                        byte[] bArr10 = zzfa.zzd;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzI(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iZzc = zzk(obj, j10);
                        i12 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    if (zzI(obj, i14, i13)) {
                        i11 = i12 * 53;
                        iFloatToIntBits = zzfa.zza(((Boolean) zzhj.zzf(obj, j10)).booleanValue());
                        i12 = iFloatToIntBits + i11;
                        break;
                    } else {
                        break;
                    }
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (zzI(obj, i14, i13)) {
                        i11 = i12 * 53;
                        iFloatToIntBits = ((String) zzhj.zzf(obj, j10)).hashCode();
                        i12 = iFloatToIntBits + i11;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzI(obj, i14, i13)) {
                        i11 = i12 * 53;
                        iFloatToIntBits = zzhj.zzf(obj, j10).hashCode();
                        i12 = iFloatToIntBits + i11;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzI(obj, i14, i13)) {
                        i11 = i12 * 53;
                        iFloatToIntBits = zzhj.zzf(obj, j10).hashCode();
                        i12 = iFloatToIntBits + i11;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzI(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iZzc = zzk(obj, j10);
                        i12 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzI(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iZzc = zzk(obj, j10);
                        i12 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzI(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iZzc = zzk(obj, j10);
                        i12 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case EACTags.ELEMENT_LIST /* 65 */:
                    if (zzI(obj, i14, i13)) {
                        i10 = i12 * 53;
                        jDoubleToLongBits = zzp(obj, j10);
                        byte[] bArr11 = zzfa.zzd;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case EACTags.ADDRESS /* 66 */:
                    if (zzI(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iZzc = zzk(obj, j10);
                        i12 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (zzI(obj, i14, i13)) {
                        i10 = i12 * 53;
                        jDoubleToLongBits = zzp(obj, j10);
                        byte[] bArr12 = zzfa.zzd;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzI(obj, i14, i13)) {
                        i11 = i12 * 53;
                        iFloatToIntBits = zzhj.zzf(obj, j10).hashCode();
                        i12 = iFloatToIntBits + i11;
                        break;
                    } else {
                        break;
                    }
            }
        }
        return this.zzl.zzb(obj).hashCode() + (i12 * 53);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final int zzb(java.lang.Object r36, byte[] r37, int r38, int r39, int r40, com.google.android.gms.internal.auth.zzdt r41) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzga.zzb(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.auth.zzdt):int");
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final Object zzd() {
        return ((zzev) this.zzg).zzc();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    @Override // com.google.android.gms.internal.auth.zzgi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zze(Object obj) {
        if (zzH(obj)) {
            if (obj instanceof zzev) {
                zzev zzevVar = (zzev) obj;
                zzevVar.zzl(Integer.MAX_VALUE);
                zzevVar.zza = 0;
                zzevVar.zzj();
            }
            int length = this.zzc.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int iZzo = zzo(i10);
                int i11 = 1048575 & iZzo;
                int iZzn = zzn(iZzo);
                long j10 = i11;
                if (iZzn != 9) {
                    if (iZzn != 60 && iZzn != 68) {
                        switch (iZzn) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case EACTags.DATE_OF_BIRTH /* 43 */:
                            case 44:
                            case 45:
                            case 46:
                            case EACTags.PIN_USAGE_POLICY /* 47 */:
                            case 48:
                            case 49:
                                this.zzk.zza(obj, j10);
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j10);
                                if (object != null) {
                                    ((zzfr) object).zzc();
                                    unsafe.putObject(obj, j10, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzI(obj, this.zzc[i10], i10)) {
                        zzr(i10).zze(zzb.getObject(obj, j10));
                    }
                } else if (zzE(obj, i10)) {
                    zzr(i10).zze(zzb.getObject(obj, j10));
                }
            }
            this.zzl.zze(obj);
        }
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final void zzf(Object obj, Object obj2) {
        zzw(obj);
        obj2.getClass();
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int iZzo = zzo(i10);
            int i11 = this.zzc[i10];
            long j10 = 1048575 & iZzo;
            switch (zzn(iZzo)) {
                case 0:
                    if (zzE(obj2, i10)) {
                        zzhj.zzl(obj, j10, zzhj.zza(obj2, j10));
                        zzz(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzE(obj2, i10)) {
                        zzhj.zzm(obj, j10, zzhj.zzb(obj2, j10));
                        zzz(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzE(obj2, i10)) {
                        zzhj.zzo(obj, j10, zzhj.zzd(obj2, j10));
                        zzz(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzE(obj2, i10)) {
                        zzhj.zzo(obj, j10, zzhj.zzd(obj2, j10));
                        zzz(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzE(obj2, i10)) {
                        zzhj.zzn(obj, j10, zzhj.zzc(obj2, j10));
                        zzz(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzE(obj2, i10)) {
                        zzhj.zzo(obj, j10, zzhj.zzd(obj2, j10));
                        zzz(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzE(obj2, i10)) {
                        zzhj.zzn(obj, j10, zzhj.zzc(obj2, j10));
                        zzz(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzE(obj2, i10)) {
                        zzhj.zzk(obj, j10, zzhj.zzt(obj2, j10));
                        zzz(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzE(obj2, i10)) {
                        zzhj.zzp(obj, j10, zzhj.zzf(obj2, j10));
                        zzz(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzx(obj, obj2, i10);
                    break;
                case 10:
                    if (zzE(obj2, i10)) {
                        zzhj.zzp(obj, j10, zzhj.zzf(obj2, j10));
                        zzz(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzE(obj2, i10)) {
                        zzhj.zzn(obj, j10, zzhj.zzc(obj2, j10));
                        zzz(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzE(obj2, i10)) {
                        zzhj.zzn(obj, j10, zzhj.zzc(obj2, j10));
                        zzz(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzE(obj2, i10)) {
                        zzhj.zzn(obj, j10, zzhj.zzc(obj2, j10));
                        zzz(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzE(obj2, i10)) {
                        zzhj.zzo(obj, j10, zzhj.zzd(obj2, j10));
                        zzz(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzE(obj2, i10)) {
                        zzhj.zzn(obj, j10, zzhj.zzc(obj2, j10));
                        zzz(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzE(obj2, i10)) {
                        zzhj.zzo(obj, j10, zzhj.zzd(obj2, j10));
                        zzz(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzx(obj, obj2, i10);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case EACTags.DATE_OF_BIRTH /* 43 */:
                case 44:
                case 45:
                case 46:
                case EACTags.PIN_USAGE_POLICY /* 47 */:
                case 48:
                case 49:
                    this.zzk.zzb(obj, obj2, j10);
                    break;
                case 50:
                    int i12 = zzgk.zza;
                    zzhj.zzp(obj, j10, zzfs.zza(zzhj.zzf(obj, j10), zzhj.zzf(obj2, j10)));
                    break;
                case EACTags.TRANSACTION_DATE /* 51 */:
                case 52:
                case EACTags.SEX /* 53 */:
                case EACTags.CURRENCY_EXPONENT /* 54 */:
                case 55:
                case 56:
                case 57:
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (zzI(obj2, i11, i10)) {
                        zzhj.zzp(obj, j10, zzhj.zzf(obj2, j10));
                        zzA(obj, i11, i10);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzy(obj, obj2, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case EACTags.ELEMENT_LIST /* 65 */:
                case EACTags.ADDRESS /* 66 */:
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (zzI(obj2, i11, i10)) {
                        zzhj.zzp(obj, j10, zzhj.zzf(obj2, j10));
                        zzA(obj, i11, i10);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzy(obj, obj2, i10);
                    break;
            }
        }
        zzgk.zzd(this.zzl, obj, obj2);
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final void zzg(Object obj, byte[] bArr, int i10, int i11, zzdt zzdtVar) throws IOException {
        zzb(obj, bArr, i10, i11, 0, zzdtVar);
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final boolean zzh(Object obj, Object obj2) {
        boolean zZzf;
        int length = this.zzc.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int iZzo = zzo(i10);
            long j10 = iZzo & 1048575;
            switch (zzn(iZzo)) {
                case 0:
                    if (!zzD(obj, obj2, i10) || Double.doubleToLongBits(zzhj.zza(obj, j10)) != Double.doubleToLongBits(zzhj.zza(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 1:
                    if (!zzD(obj, obj2, i10) || Float.floatToIntBits(zzhj.zzb(obj, j10)) != Float.floatToIntBits(zzhj.zzb(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 2:
                    if (!zzD(obj, obj2, i10) || zzhj.zzd(obj, j10) != zzhj.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 3:
                    if (!zzD(obj, obj2, i10) || zzhj.zzd(obj, j10) != zzhj.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 4:
                    if (!zzD(obj, obj2, i10) || zzhj.zzc(obj, j10) != zzhj.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 5:
                    if (!zzD(obj, obj2, i10) || zzhj.zzd(obj, j10) != zzhj.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 6:
                    if (!zzD(obj, obj2, i10) || zzhj.zzc(obj, j10) != zzhj.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 7:
                    if (!zzD(obj, obj2, i10) || zzhj.zzt(obj, j10) != zzhj.zzt(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 8:
                    if (!zzD(obj, obj2, i10) || !zzgk.zzf(zzhj.zzf(obj, j10), zzhj.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 9:
                    if (!zzD(obj, obj2, i10) || !zzgk.zzf(zzhj.zzf(obj, j10), zzhj.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 10:
                    if (!zzD(obj, obj2, i10) || !zzgk.zzf(zzhj.zzf(obj, j10), zzhj.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 11:
                    if (!zzD(obj, obj2, i10) || zzhj.zzc(obj, j10) != zzhj.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 12:
                    if (!zzD(obj, obj2, i10) || zzhj.zzc(obj, j10) != zzhj.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 13:
                    if (!zzD(obj, obj2, i10) || zzhj.zzc(obj, j10) != zzhj.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 14:
                    if (!zzD(obj, obj2, i10) || zzhj.zzd(obj, j10) != zzhj.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 15:
                    if (!zzD(obj, obj2, i10) || zzhj.zzc(obj, j10) != zzhj.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 16:
                    if (!zzD(obj, obj2, i10) || zzhj.zzd(obj, j10) != zzhj.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 17:
                    if (!zzD(obj, obj2, i10) || !zzgk.zzf(zzhj.zzf(obj, j10), zzhj.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case EACTags.DATE_OF_BIRTH /* 43 */:
                case 44:
                case 45:
                case 46:
                case EACTags.PIN_USAGE_POLICY /* 47 */:
                case 48:
                case 49:
                    zZzf = zzgk.zzf(zzhj.zzf(obj, j10), zzhj.zzf(obj2, j10));
                    break;
                case 50:
                    zZzf = zzgk.zzf(zzhj.zzf(obj, j10), zzhj.zzf(obj2, j10));
                    break;
                case EACTags.TRANSACTION_DATE /* 51 */:
                case 52:
                case EACTags.SEX /* 53 */:
                case EACTags.CURRENCY_EXPONENT /* 54 */:
                case 55:
                case 56:
                case 57:
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case EACTags.ELEMENT_LIST /* 65 */:
                case EACTags.ADDRESS /* 66 */:
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                case 68:
                    long jZzl = zzl(i10) & 1048575;
                    if (zzhj.zzc(obj, jZzl) != zzhj.zzc(obj2, jZzl) || !zzgk.zzf(zzhj.zzf(obj, j10), zzhj.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                default:
            }
            if (!zZzf) {
                return false;
            }
        }
        return this.zzl.zzb(obj).equals(this.zzl.zzb(obj2));
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x008d  */
    @Override // com.google.android.gms.internal.auth.zzgi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzi(Object obj) {
        int i10;
        int i11;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1048575;
        while (i12 < this.zzi) {
            int i15 = this.zzh[i12];
            int i16 = this.zzc[i15];
            int iZzo = zzo(i15);
            int i17 = this.zzc[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i14) {
                if (i18 != 1048575) {
                    i13 = zzb.getInt(obj, i18);
                }
                i11 = i13;
                i10 = i18;
            } else {
                i10 = i14;
                i11 = i13;
            }
            Object obj2 = obj;
            if ((268435456 & iZzo) != 0 && !zzF(obj2, i15, i10, i11, i19)) {
                return false;
            }
            int iZzn = zzn(iZzo);
            if (iZzn == 9 || iZzn == 17) {
                if (zzF(obj2, i15, i10, i11, i19) && !zzG(obj2, iZzo, zzr(i15))) {
                    return false;
                }
            } else if (iZzn == 27) {
                List list = (List) zzhj.zzf(obj2, iZzo & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzgi zzgiVarZzr = zzr(i15);
                    for (int i20 = 0; i20 < list.size(); i20++) {
                        if (!zzgiVarZzr.zzi(list.get(i20))) {
                            return false;
                        }
                    }
                }
            } else if (iZzn == 60 || iZzn == 68) {
                if (zzI(obj2, i16, i15) && !zzG(obj2, iZzo, zzr(i15))) {
                    return false;
                }
            } else if (iZzn != 49) {
                if (iZzn == 50 && !((zzfr) zzhj.zzf(obj2, iZzo & 1048575)).isEmpty()) {
                    throw null;
                }
            }
            i12++;
            obj = obj2;
            i14 = i10;
            i13 = i11;
        }
        return true;
    }
}
