package com.google.android.gms.internal.play_billing;

import androidx.room.y0;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.EACTags;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
final class zzgo<T> implements zzgv<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzho.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzgl zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzhh zzl;
    private final zzev zzm;

    private zzgo(int[] iArr, Object[] objArr, int i10, int i11, zzgl zzglVar, boolean z10, int[] iArr2, int i12, int i13, zzgq zzgqVar, zzfy zzfyVar, zzhh zzhhVar, zzev zzevVar, zzgg zzggVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        boolean z11 = false;
        if (zzevVar != null && (zzglVar instanceof zzff)) {
            z11 = true;
        }
        this.zzh = z11;
        this.zzi = iArr2;
        this.zzj = i12;
        this.zzk = i13;
        this.zzl = zzhhVar;
        this.zzm = zzevVar;
        this.zzg = zzglVar;
    }

    private static void zzA(Object obj) {
        if (!zzL(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzB(Object obj, Object obj2, int i10) {
        if (zzI(obj2, i10)) {
            int iZzs = zzs(i10) & 1048575;
            Unsafe unsafe = zzb;
            long j10 = iZzs;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + obj2.toString());
            }
            zzgv zzgvVarZzv = zzv(i10);
            if (!zzI(obj, i10)) {
                if (zzL(object)) {
                    Object objZze = zzgvVarZzv.zze();
                    zzgvVarZzv.zzg(objZze, object);
                    unsafe.putObject(obj, j10, objZze);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                zzD(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzL(object2)) {
                Object objZze2 = zzgvVarZzv.zze();
                zzgvVarZzv.zzg(objZze2, object2);
                unsafe.putObject(obj, j10, objZze2);
                object2 = objZze2;
            }
            zzgvVarZzv.zzg(object2, object);
        }
    }

    private final void zzC(Object obj, Object obj2, int i10) {
        int[] iArr = this.zzc;
        int i11 = iArr[i10];
        if (zzM(obj2, i11, i10)) {
            int iZzs = zzs(i10) & 1048575;
            Unsafe unsafe = zzb;
            long j10 = iZzs;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i10] + " is present but null: " + obj2.toString());
            }
            zzgv zzgvVarZzv = zzv(i10);
            if (!zzM(obj, i11, i10)) {
                if (zzL(object)) {
                    Object objZze = zzgvVarZzv.zze();
                    zzgvVarZzv.zzg(objZze, object);
                    unsafe.putObject(obj, j10, objZze);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                zzE(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzL(object2)) {
                Object objZze2 = zzgvVarZzv.zze();
                zzgvVarZzv.zzg(objZze2, object2);
                unsafe.putObject(obj, j10, objZze2);
                object2 = objZze2;
            }
            zzgvVarZzv.zzg(object2, object);
        }
    }

    private final void zzD(Object obj, int i10) {
        int iZzp = zzp(i10);
        long j10 = 1048575 & iZzp;
        if (j10 == 1048575) {
            return;
        }
        zzho.zzq(obj, j10, (1 << (iZzp >>> 20)) | zzho.zzc(obj, j10));
    }

    private final void zzE(Object obj, int i10, int i11) {
        zzho.zzq(obj, zzp(i11) & 1048575, i10);
    }

    private final void zzF(Object obj, int i10, Object obj2) {
        zzb.putObject(obj, zzs(i10) & 1048575, obj2);
        zzD(obj, i10);
    }

    private final void zzG(Object obj, int i10, int i11, Object obj2) {
        zzb.putObject(obj, zzs(i11) & 1048575, obj2);
        zzE(obj, i10, i11);
    }

    private final boolean zzH(Object obj, Object obj2, int i10) {
        return zzI(obj, i10) == zzI(obj2, i10);
    }

    private final boolean zzI(Object obj, int i10) {
        int iZzp = zzp(i10);
        long j10 = iZzp & 1048575;
        if (j10 != 1048575) {
            return (zzho.zzc(obj, j10) & (1 << (iZzp >>> 20))) != 0;
        }
        int iZzs = zzs(i10);
        long j11 = iZzs & 1048575;
        switch (zzr(iZzs)) {
            case 0:
                return Double.doubleToRawLongBits(zzho.zza(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzho.zzb(obj, j11)) != 0;
            case 2:
                return zzho.zzd(obj, j11) != 0;
            case 3:
                return zzho.zzd(obj, j11) != 0;
            case 4:
                return zzho.zzc(obj, j11) != 0;
            case 5:
                return zzho.zzd(obj, j11) != 0;
            case 6:
                return zzho.zzc(obj, j11) != 0;
            case 7:
                return zzho.zzw(obj, j11);
            case 8:
                Object objZzf = zzho.zzf(obj, j11);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzei) {
                    return !zzei.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzho.zzf(obj, j11) != null;
            case 10:
                return !zzei.zzb.equals(zzho.zzf(obj, j11));
            case 11:
                return zzho.zzc(obj, j11) != 0;
            case 12:
                return zzho.zzc(obj, j11) != 0;
            case 13:
                return zzho.zzc(obj, j11) != 0;
            case 14:
                return zzho.zzd(obj, j11) != 0;
            case 15:
                return zzho.zzc(obj, j11) != 0;
            case 16:
                return zzho.zzd(obj, j11) != 0;
            case 17:
                return zzho.zzf(obj, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzJ(Object obj, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? zzI(obj, i10) : (i12 & i13) != 0;
    }

    private static boolean zzK(Object obj, int i10, zzgv zzgvVar) {
        return zzgvVar.zzk(zzho.zzf(obj, i10 & 1048575));
    }

    private static boolean zzL(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzfi) {
            return ((zzfi) obj).zzz();
        }
        return true;
    }

    private final boolean zzM(Object obj, int i10, int i11) {
        return zzho.zzc(obj, (long) (zzp(i11) & 1048575)) == i10;
    }

    private static boolean zzN(Object obj, long j10) {
        return ((Boolean) zzho.zzf(obj, j10)).booleanValue();
    }

    private static final void zzO(int i10, Object obj, zzhu zzhuVar) throws IOException {
        if (obj instanceof String) {
            zzhuVar.zzG(i10, (String) obj);
        } else {
            zzhuVar.zzd(i10, (zzei) obj);
        }
    }

    public static zzhi zzd(Object obj) {
        zzfi zzfiVar = (zzfi) obj;
        zzhi zzhiVar = zzfiVar.zzc;
        if (zzhiVar != zzhi.zzc()) {
            return zzhiVar;
        }
        zzhi zzhiVarZzf = zzhi.zzf();
        zzfiVar.zzc = zzhiVarZzf;
        return zzhiVarZzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzgo zzl(Class cls, zzgi zzgiVar, zzgq zzgqVar, zzfy zzfyVar, zzhh zzhhVar, zzev zzevVar, zzgg zzggVar) {
        int i10;
        int iCharAt;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int[] iArr;
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
        int i27;
        int i28;
        int i29;
        String str;
        int iObjectFieldOffset;
        char c10;
        int iObjectFieldOffset2;
        int i30;
        int i31;
        int i32;
        Field fieldZzz;
        char cCharAt9;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        Object obj;
        Field fieldZzz2;
        Object obj2;
        Field fieldZzz3;
        int i38;
        char cCharAt10;
        int i39;
        char cCharAt11;
        int i40;
        char cCharAt12;
        int i41;
        char cCharAt13;
        if (!(zzgiVar instanceof zzgu)) {
            throw null;
        }
        zzgu zzguVar = (zzgu) zzgiVar;
        String strZzd = zzguVar.zzd();
        int length = strZzd.length();
        char c11 = 55296;
        if (strZzd.charAt(0) >= 55296) {
            int i42 = 1;
            while (true) {
                i10 = i42 + 1;
                if (strZzd.charAt(i42) < 55296) {
                    break;
                }
                i42 = i10;
            }
        } else {
            i10 = 1;
        }
        int i43 = i10 + 1;
        int iCharAt2 = strZzd.charAt(i10);
        if (iCharAt2 >= 55296) {
            int i44 = iCharAt2 & 8191;
            int i45 = 13;
            while (true) {
                i41 = i43 + 1;
                cCharAt13 = strZzd.charAt(i43);
                if (cCharAt13 < 55296) {
                    break;
                }
                i44 |= (cCharAt13 & 8191) << i45;
                i45 += 13;
                i43 = i41;
            }
            iCharAt2 = i44 | (cCharAt13 << i45);
            i43 = i41;
        }
        if (iCharAt2 == 0) {
            i12 = 0;
            i15 = 0;
            iCharAt = 0;
            i11 = 0;
            i13 = 0;
            i14 = 0;
            iArr = zza;
            i16 = 0;
        } else {
            int i46 = i43 + 1;
            int iCharAt3 = strZzd.charAt(i43);
            if (iCharAt3 >= 55296) {
                int i47 = iCharAt3 & 8191;
                int i48 = 13;
                while (true) {
                    i24 = i46 + 1;
                    cCharAt8 = strZzd.charAt(i46);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i47 |= (cCharAt8 & 8191) << i48;
                    i48 += 13;
                    i46 = i24;
                }
                iCharAt3 = i47 | (cCharAt8 << i48);
                i46 = i24;
            }
            int i49 = i46 + 1;
            int iCharAt4 = strZzd.charAt(i46);
            if (iCharAt4 >= 55296) {
                int i50 = iCharAt4 & 8191;
                int i51 = 13;
                while (true) {
                    i23 = i49 + 1;
                    cCharAt7 = strZzd.charAt(i49);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i50 |= (cCharAt7 & 8191) << i51;
                    i51 += 13;
                    i49 = i23;
                }
                iCharAt4 = i50 | (cCharAt7 << i51);
                i49 = i23;
            }
            int i52 = i49 + 1;
            int iCharAt5 = strZzd.charAt(i49);
            if (iCharAt5 >= 55296) {
                int i53 = iCharAt5 & 8191;
                int i54 = 13;
                while (true) {
                    i22 = i52 + 1;
                    cCharAt6 = strZzd.charAt(i52);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i53 |= (cCharAt6 & 8191) << i54;
                    i54 += 13;
                    i52 = i22;
                }
                iCharAt5 = i53 | (cCharAt6 << i54);
                i52 = i22;
            }
            int i55 = i52 + 1;
            int iCharAt6 = strZzd.charAt(i52);
            if (iCharAt6 >= 55296) {
                int i56 = iCharAt6 & 8191;
                int i57 = 13;
                while (true) {
                    i21 = i55 + 1;
                    cCharAt5 = strZzd.charAt(i55);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i56 |= (cCharAt5 & 8191) << i57;
                    i57 += 13;
                    i55 = i21;
                }
                iCharAt6 = i56 | (cCharAt5 << i57);
                i55 = i21;
            }
            int i58 = i55 + 1;
            iCharAt = strZzd.charAt(i55);
            if (iCharAt >= 55296) {
                int i59 = iCharAt & 8191;
                int i60 = 13;
                while (true) {
                    i20 = i58 + 1;
                    cCharAt4 = strZzd.charAt(i58);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i59 |= (cCharAt4 & 8191) << i60;
                    i60 += 13;
                    i58 = i20;
                }
                iCharAt = i59 | (cCharAt4 << i60);
                i58 = i20;
            }
            int i61 = i58 + 1;
            int iCharAt7 = strZzd.charAt(i58);
            if (iCharAt7 >= 55296) {
                int i62 = iCharAt7 & 8191;
                int i63 = 13;
                while (true) {
                    i19 = i61 + 1;
                    cCharAt3 = strZzd.charAt(i61);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i62 |= (cCharAt3 & 8191) << i63;
                    i63 += 13;
                    i61 = i19;
                }
                iCharAt7 = i62 | (cCharAt3 << i63);
                i61 = i19;
            }
            int i64 = i61 + 1;
            int iCharAt8 = strZzd.charAt(i61);
            if (iCharAt8 >= 55296) {
                int i65 = iCharAt8 & 8191;
                int i66 = 13;
                while (true) {
                    i18 = i64 + 1;
                    cCharAt2 = strZzd.charAt(i64);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i65 |= (cCharAt2 & 8191) << i66;
                    i66 += 13;
                    i64 = i18;
                }
                iCharAt8 = i65 | (cCharAt2 << i66);
                i64 = i18;
            }
            int i67 = i64 + 1;
            int iCharAt9 = strZzd.charAt(i64);
            if (iCharAt9 >= 55296) {
                int i68 = iCharAt9 & 8191;
                int i69 = 13;
                while (true) {
                    i17 = i67 + 1;
                    cCharAt = strZzd.charAt(i67);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i68 |= (cCharAt & 8191) << i69;
                    i69 += 13;
                    i67 = i17;
                }
                iCharAt9 = i68 | (cCharAt << i69);
                i67 = i17;
            }
            int i70 = iCharAt3 + iCharAt3 + iCharAt4;
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            int i71 = iCharAt7;
            i11 = iCharAt5;
            i12 = i71;
            i13 = iCharAt6;
            i14 = iCharAt9;
            i15 = i70;
            iArr = iArr2;
            i16 = iCharAt3;
            i43 = i67;
        }
        Unsafe unsafe = zzb;
        Object[] objArrZze = zzguVar.zze();
        Class<?> cls2 = zzguVar.zza().getClass();
        int i72 = i14 + i12;
        int i73 = iCharAt + iCharAt;
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr = new Object[i73];
        int i74 = i14;
        int i75 = i72;
        int i76 = 0;
        int i77 = 0;
        while (i43 < length) {
            int i78 = i43 + 1;
            int iCharAt10 = strZzd.charAt(i43);
            if (iCharAt10 >= c11) {
                int i79 = iCharAt10 & 8191;
                int i80 = i78;
                int i81 = 13;
                while (true) {
                    i40 = i80 + 1;
                    cCharAt12 = strZzd.charAt(i80);
                    if (cCharAt12 < c11) {
                        break;
                    }
                    i79 |= (cCharAt12 & 8191) << i81;
                    i81 += 13;
                    i80 = i40;
                }
                iCharAt10 = i79 | (cCharAt12 << i81);
                i25 = i40;
            } else {
                i25 = i78;
            }
            int i82 = i25 + 1;
            int iCharAt11 = strZzd.charAt(i25);
            if (iCharAt11 >= c11) {
                int i83 = iCharAt11 & 8191;
                int i84 = i82;
                int i85 = 13;
                while (true) {
                    i39 = i84 + 1;
                    cCharAt11 = strZzd.charAt(i84);
                    if (cCharAt11 < c11) {
                        break;
                    }
                    i83 |= (cCharAt11 & 8191) << i85;
                    i85 += 13;
                    i84 = i39;
                }
                iCharAt11 = i83 | (cCharAt11 << i85);
                i26 = i39;
            } else {
                i26 = i82;
            }
            if ((iCharAt11 & 1024) != 0) {
                iArr[i76] = i77;
                i76++;
            }
            int i86 = iCharAt11 & 255;
            zzgu zzguVar2 = zzguVar;
            int i87 = iCharAt11 & 2048;
            if (i86 >= 51) {
                int i88 = i26 + 1;
                int iCharAt12 = strZzd.charAt(i26);
                char c12 = 55296;
                if (iCharAt12 >= 55296) {
                    int i89 = iCharAt12 & 8191;
                    int i90 = i88;
                    int i91 = 13;
                    while (true) {
                        i38 = i90 + 1;
                        cCharAt10 = strZzd.charAt(i90);
                        if (cCharAt10 < c12) {
                            break;
                        }
                        i89 |= (cCharAt10 & 8191) << i91;
                        i91 += 13;
                        i90 = i38;
                        c12 = 55296;
                    }
                    iCharAt12 = i89 | (cCharAt10 << i91);
                    i35 = i38;
                } else {
                    i35 = i88;
                }
                int i92 = i35;
                int i93 = i86 - 51;
                i27 = length;
                if (i93 == 9 || i93 == 17) {
                    i36 = i15 + 1;
                    int i94 = i77 / 3;
                    objArr[i94 + i94 + 1] = objArrZze[i15];
                } else {
                    if (i93 != 12) {
                        i37 = i87;
                    } else if (zzguVar2.zzc() == 1 || i87 != 0) {
                        i36 = i15 + 1;
                        int i95 = i77 / 3;
                        objArr[i95 + i95 + 1] = objArrZze[i15];
                    } else {
                        i37 = 0;
                    }
                    int i96 = iCharAt12 + iCharAt12;
                    obj = objArrZze[i96];
                    int i97 = i37;
                    if (obj instanceof Field) {
                        fieldZzz2 = zzz(cls2, (String) obj);
                        objArrZze[i96] = fieldZzz2;
                    } else {
                        fieldZzz2 = (Field) obj;
                    }
                    int i98 = i16;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzz2);
                    int i99 = i96 + 1;
                    obj2 = objArrZze[i99];
                    i28 = i98;
                    if (obj2 instanceof Field) {
                        fieldZzz3 = zzz(cls2, (String) obj2);
                        objArrZze[i99] = fieldZzz3;
                    } else {
                        fieldZzz3 = (Field) obj2;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzz3);
                    str = strZzd;
                    i31 = i97;
                    i26 = i92;
                    i30 = 0;
                    c10 = 55296;
                }
                i15 = i36;
                i37 = i87;
                int i962 = iCharAt12 + iCharAt12;
                obj = objArrZze[i962];
                int i972 = i37;
                if (obj instanceof Field) {
                }
                int i982 = i16;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzz2);
                int i992 = i962 + 1;
                obj2 = objArrZze[i992];
                i28 = i982;
                if (obj2 instanceof Field) {
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzz3);
                str = strZzd;
                i31 = i972;
                i26 = i92;
                i30 = 0;
                c10 = 55296;
            } else {
                i27 = length;
                i28 = i16;
                int i100 = i15 + 1;
                Field fieldZzz4 = zzz(cls2, (String) objArrZze[i15]);
                if (i86 == 9 || i86 == 17) {
                    i29 = i100;
                    int i101 = i77 / 3;
                    objArr[i101 + i101 + 1] = fieldZzz4.getType();
                } else {
                    if (i86 == 27) {
                        i33 = i100;
                        i34 = 1;
                        i15 += 2;
                    } else if (i86 == 49) {
                        i15 += 2;
                        i33 = i100;
                        i34 = 1;
                    } else if (i86 == 12 || i86 == 30 || i86 == 44) {
                        if (zzguVar2.zzc() == 1 || i87 != 0) {
                            i15 += 2;
                            int i102 = i77 / 3;
                            objArr[i102 + i102 + 1] = objArrZze[i100];
                            str = strZzd;
                            iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzz4);
                            if ((iCharAt11 & 4096) != 0 || i86 > 17) {
                                c10 = 55296;
                                iObjectFieldOffset2 = 1048575;
                                i30 = 0;
                            } else {
                                int i103 = i26 + 1;
                                int iCharAt13 = str.charAt(i26);
                                if (iCharAt13 >= 55296) {
                                    int i104 = iCharAt13 & 8191;
                                    int i105 = 13;
                                    while (true) {
                                        i32 = i103 + 1;
                                        cCharAt9 = str.charAt(i103);
                                        if (cCharAt9 < 55296) {
                                            break;
                                        }
                                        i104 |= (cCharAt9 & 8191) << i105;
                                        i105 += 13;
                                        i103 = i32;
                                    }
                                    iCharAt13 = i104 | (cCharAt9 << i105);
                                } else {
                                    i32 = i103;
                                }
                                int i106 = (iCharAt13 / 32) + i28 + i28;
                                Object obj3 = objArrZze[i106];
                                if (obj3 instanceof Field) {
                                    fieldZzz = (Field) obj3;
                                } else {
                                    fieldZzz = zzz(cls2, (String) obj3);
                                    objArrZze[i106] = fieldZzz;
                                }
                                i30 = iCharAt13 % 32;
                                i26 = i32;
                                c10 = 55296;
                                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzz);
                            }
                            if (i86 >= 18 && i86 <= 49) {
                                iArr[i75] = iObjectFieldOffset;
                                i75++;
                            }
                            i31 = i87;
                        } else {
                            str = strZzd;
                            i15 = i100;
                            i87 = 0;
                            iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzz4);
                            if ((iCharAt11 & 4096) != 0) {
                                c10 = 55296;
                                iObjectFieldOffset2 = 1048575;
                                i30 = 0;
                                if (i86 >= 18) {
                                    iArr[i75] = iObjectFieldOffset;
                                    i75++;
                                }
                                i31 = i87;
                            }
                        }
                    } else if (i86 == 50) {
                        int i107 = i15 + 2;
                        int i108 = i74 + 1;
                        iArr[i74] = i77;
                        int i109 = i77 / 3;
                        int i110 = i109 + i109;
                        objArr[i110] = objArrZze[i100];
                        if (i87 != 0) {
                            objArr[i110 + 1] = objArrZze[i107];
                            i15 += 3;
                            str = strZzd;
                            i74 = i108;
                            iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzz4);
                            if ((iCharAt11 & 4096) != 0) {
                            }
                        } else {
                            i15 = i107;
                            i74 = i108;
                            i87 = 0;
                            str = strZzd;
                            iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzz4);
                            if ((iCharAt11 & 4096) != 0) {
                            }
                        }
                    } else {
                        i29 = i100;
                    }
                    int i111 = i77 / 3;
                    objArr[i111 + i111 + i34] = objArrZze[i33];
                    str = strZzd;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzz4);
                    if ((iCharAt11 & 4096) != 0) {
                    }
                }
                str = strZzd;
                i15 = i29;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzz4);
                if ((iCharAt11 & 4096) != 0) {
                }
            }
            int i112 = i77 + 1;
            iArr3[i77] = iCharAt10;
            int i113 = i77 + 2;
            iArr3[i112] = ((iCharAt11 & 512) != 0 ? PKIFailureInfo.duplicateCertReq : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | (i31 != 0 ? PKIFailureInfo.systemUnavail : 0) | (i86 << 20) | iObjectFieldOffset;
            i77 += 3;
            iArr3[i113] = (i30 << 20) | iObjectFieldOffset2;
            i43 = i26;
            strZzd = str;
            c11 = c10;
            zzguVar = zzguVar2;
            length = i27;
            i16 = i28;
        }
        return new zzgo(iArr3, objArr, i11, i13, zzguVar.zza(), false, iArr, i14, i72, zzgqVar, zzfyVar, zzhhVar, zzevVar, zzggVar);
    }

    private static double zzm(Object obj, long j10) {
        return ((Double) zzho.zzf(obj, j10)).doubleValue();
    }

    private static float zzn(Object obj, long j10) {
        return ((Float) zzho.zzf(obj, j10)).floatValue();
    }

    private static int zzo(Object obj, long j10) {
        return ((Integer) zzho.zzf(obj, j10)).intValue();
    }

    private final int zzp(int i10) {
        return this.zzc[i10 + 2];
    }

    private final int zzq(int i10, int i11) {
        int[] iArr = this.zzc;
        int length = (iArr.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = iArr[i13];
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

    private static int zzr(int i10) {
        return (i10 >>> 20) & 255;
    }

    private final int zzs(int i10) {
        return this.zzc[i10 + 1];
    }

    private static long zzt(Object obj, long j10) {
        return ((Long) zzho.zzf(obj, j10)).longValue();
    }

    private final zzfl zzu(int i10) {
        int i11 = i10 / 3;
        return (zzfl) this.zzd[i11 + i11 + 1];
    }

    private final zzgv zzv(int i10) {
        Object[] objArr = this.zzd;
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zzgv zzgvVar = (zzgv) objArr[i12];
        if (zzgvVar != null) {
            return zzgvVar;
        }
        zzgv zzgvVarZzb = zzgs.zza().zzb((Class) objArr[i12 + 1]);
        objArr[i12] = zzgvVarZzb;
        return zzgvVarZzb;
    }

    private final Object zzw(int i10) {
        int i11 = i10 / 3;
        return this.zzd[i11 + i11];
    }

    private final Object zzx(Object obj, int i10) {
        zzgv zzgvVarZzv = zzv(i10);
        int iZzs = zzs(i10) & 1048575;
        if (!zzI(obj, i10)) {
            return zzgvVarZzv.zze();
        }
        Object object = zzb.getObject(obj, iZzs);
        if (zzL(object)) {
            return object;
        }
        Object objZze = zzgvVarZzv.zze();
        if (object != null) {
            zzgvVarZzv.zzg(objZze, object);
        }
        return objZze;
    }

    private final Object zzy(Object obj, int i10, int i11) {
        zzgv zzgvVarZzv = zzv(i11);
        if (!zzM(obj, i10, i11)) {
            return zzgvVarZzv.zze();
        }
        Object object = zzb.getObject(obj, zzs(i11) & 1048575);
        if (zzL(object)) {
            return object;
        }
        Object objZze = zzgvVarZzv.zze();
        if (object != null) {
            zzgvVarZzv.zzg(objZze, object);
        }
        return objZze;
    }

    private static Field zzz(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e10) {
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
            throw new RuntimeException(sbA.toString(), e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x04de  */
    @Override // com.google.android.gms.internal.play_billing.zzgv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zza(Object obj) {
        int i10;
        int iZzC;
        int iZzD;
        int iZzC2;
        int iZzd;
        int iZzC3;
        int iZzh;
        int iZzy;
        int size;
        int iZzl;
        int iZzC4;
        int iZzC5;
        int iZzC6;
        int iZzC7;
        int iZze;
        int iZzC8;
        int iZzC9;
        int iZzy2;
        int iZzC10;
        int iZzD2;
        zzgo<T> zzgoVar = this;
        Object obj2 = obj;
        Unsafe unsafe = zzb;
        int i11 = 1048575;
        int i12 = 0;
        int i13 = 0;
        int iA = 0;
        int i14 = 1048575;
        while (true) {
            int[] iArr = zzgoVar.zzc;
            if (i12 >= iArr.length) {
                int iZza = ((zzfi) obj).zzc.zza() + iA;
                if (!zzgoVar.zzh) {
                    return iZza;
                }
                zzhd zzhdVar = ((zzff) obj).zzb.zza;
                int iZzc = zzhdVar.zzc();
                int iZzc2 = 0;
                for (int i15 = 0; i15 < iZzc; i15++) {
                    Map.Entry entryZzg = zzhdVar.zzg(i15);
                    iZzc2 += zzez.zzc((zzey) ((zzgz) entryZzg).zza(), entryZzg.getValue());
                }
                for (Map.Entry entry : zzhdVar.zzd()) {
                    iZzc2 += zzez.zzc((zzey) entry.getKey(), entry.getValue());
                }
                return iZza + iZzc2;
            }
            int iZzs = zzgoVar.zzs(i12);
            int iZzr = zzr(iZzs);
            int i16 = iArr[i12];
            int i17 = iArr[i12 + 2];
            int i18 = i17 & i11;
            if (iZzr <= 17) {
                if (i18 != i14) {
                    i13 = i18 == i11 ? 0 : unsafe.getInt(obj2, i18);
                    i14 = i18;
                }
                i10 = 1 << (i17 >>> 20);
            } else {
                i10 = 0;
            }
            int i19 = iZzs & i11;
            if (iZzr >= zzfa.zzJ.zza()) {
                zzfa.zzW.zza();
            }
            long j10 = i19;
            switch (iZzr) {
                case 0:
                    if (zzgoVar.zzJ(obj2, i12, i14, i13, i10)) {
                        iA = b6.a.a(i16 << 3, 8, iA);
                    }
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case 1:
                    if (zzgoVar.zzJ(obj2, i12, i14, i13, i10)) {
                        iA = b6.a.a(i16 << 3, 4, iA);
                    }
                    zzgoVar = this;
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case 2:
                    if (zzgoVar.zzJ(obj2, i12, i14, i13, i10)) {
                        long j11 = unsafe.getLong(obj2, j10);
                        iZzC = zzep.zzC(i16 << 3);
                        iZzD = zzep.zzD(j11);
                        iA += iZzD + iZzC;
                    }
                    zzgoVar = this;
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case 3:
                    if (zzgoVar.zzJ(obj2, i12, i14, i13, i10)) {
                        long j12 = unsafe.getLong(obj2, j10);
                        iZzC = zzep.zzC(i16 << 3);
                        iZzD = zzep.zzD(j12);
                        iA += iZzD + iZzC;
                    }
                    zzgoVar = this;
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case 4:
                    if (zzgoVar.zzJ(obj2, i12, i14, i13, i10)) {
                        long j13 = unsafe.getInt(obj2, j10);
                        iZzC = zzep.zzC(i16 << 3);
                        iZzD = zzep.zzD(j13);
                        iA += iZzD + iZzC;
                    }
                    zzgoVar = this;
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case 5:
                    if (zzgoVar.zzJ(obj2, i12, i14, i13, i10)) {
                        iA = b6.a.a(i16 << 3, 8, iA);
                    }
                    zzgoVar = this;
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case 6:
                    if (zzgoVar.zzJ(obj2, i12, i14, i13, i10)) {
                        iA = b6.a.a(i16 << 3, 4, iA);
                    }
                    zzgoVar = this;
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case 7:
                    if (zzgoVar.zzJ(obj2, i12, i14, i13, i10)) {
                        iA = b6.a.a(i16 << 3, 1, iA);
                    }
                    zzgoVar = this;
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case 8:
                    if (zzgoVar.zzJ(obj2, i12, i14, i13, i10)) {
                        int i20 = i16 << 3;
                        Object object = unsafe.getObject(obj2, j10);
                        if (object instanceof zzei) {
                            iZzC2 = zzep.zzC(i20);
                            iZzd = ((zzei) object).zzd();
                            iZzC3 = zzep.zzC(iZzd);
                            iA += iZzC3 + iZzd + iZzC2;
                        } else {
                            iZzC = zzep.zzC(i20);
                            iZzD = zzep.zzB((String) object);
                            iA += iZzD + iZzC;
                        }
                    }
                    zzgoVar = this;
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case 9:
                    if (zzgoVar.zzJ(obj2, i12, i14, i13, i10)) {
                        iZzh = zzgx.zzh(i16, unsafe.getObject(obj2, j10), zzgoVar.zzv(i12));
                        iA += iZzh;
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    } else {
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    }
                case 10:
                    if (zzgoVar.zzJ(obj2, i12, i14, i13, i10)) {
                        zzei zzeiVar = (zzei) unsafe.getObject(obj2, j10);
                        iZzC2 = zzep.zzC(i16 << 3);
                        iZzd = zzeiVar.zzd();
                        iZzC3 = zzep.zzC(iZzd);
                        iA += iZzC3 + iZzd + iZzC2;
                    }
                    zzgoVar = this;
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case 11:
                    if (zzgoVar.zzJ(obj2, i12, i14, i13, i10)) {
                        iA = b6.a.a(unsafe.getInt(obj2, j10), zzep.zzC(i16 << 3), iA);
                    }
                    zzgoVar = this;
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case 12:
                    if (zzgoVar.zzJ(obj2, i12, i14, i13, i10)) {
                        long j14 = unsafe.getInt(obj2, j10);
                        iZzC = zzep.zzC(i16 << 3);
                        iZzD = zzep.zzD(j14);
                        iA += iZzD + iZzC;
                    }
                    zzgoVar = this;
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case 13:
                    if (zzgoVar.zzJ(obj2, i12, i14, i13, i10)) {
                        iA = b6.a.a(i16 << 3, 4, iA);
                    }
                    zzgoVar = this;
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case 14:
                    if (zzgoVar.zzJ(obj2, i12, i14, i13, i10)) {
                        iA = b6.a.a(i16 << 3, 8, iA);
                    }
                    zzgoVar = this;
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case 15:
                    if (zzgoVar.zzJ(obj2, i12, i14, i13, i10)) {
                        int i21 = unsafe.getInt(obj2, j10);
                        iA = b6.a.a((i21 >> 31) ^ (i21 + i21), zzep.zzC(i16 << 3), iA);
                    }
                    zzgoVar = this;
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case 16:
                    if (zzgoVar.zzJ(obj2, i12, i14, i13, i10)) {
                        long j15 = unsafe.getLong(obj2, j10);
                        iZzC = zzep.zzC(i16 << 3);
                        iZzD = zzep.zzD((j15 >> 63) ^ (j15 + j15));
                        iA += iZzD + iZzC;
                    }
                    zzgoVar = this;
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case 17:
                    if (zzgoVar.zzJ(obj2, i12, i14, i13, i10)) {
                        iZzy = zzep.zzy(i16, (zzgl) unsafe.getObject(obj2, j10), zzgoVar.zzv(i12));
                        iA += iZzy;
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    } else {
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    }
                case 18:
                    iZzh = zzgx.zzd(i16, (List) unsafe.getObject(obj2, j10), false);
                    iA += iZzh;
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case 19:
                    iZzh = zzgx.zzb(i16, (List) unsafe.getObject(obj2, j10), false);
                    iA += iZzh;
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case 20:
                    List list = (List) unsafe.getObject(obj2, j10);
                    int i22 = zzgx.zza;
                    iZzC5 = list.size() == 0 ? 0 : (zzep.zzC(i16 << 3) * list.size()) + zzgx.zzg(list);
                    iA += iZzC5;
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case 21:
                    List list2 = (List) unsafe.getObject(obj2, j10);
                    int i23 = zzgx.zza;
                    size = list2.size();
                    if (size != 0) {
                        iZzl = zzgx.zzl(list2);
                        iZzC4 = zzep.zzC(i16 << 3);
                        iZzC6 = (iZzC4 * size) + iZzl;
                        iA += iZzC6;
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    }
                    iZzC6 = 0;
                    iA += iZzC6;
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case 22:
                    List list3 = (List) unsafe.getObject(obj2, j10);
                    int i24 = zzgx.zza;
                    size = list3.size();
                    if (size != 0) {
                        iZzl = zzgx.zzf(list3);
                        iZzC4 = zzep.zzC(i16 << 3);
                        iZzC6 = (iZzC4 * size) + iZzl;
                        iA += iZzC6;
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    }
                    iZzC6 = 0;
                    iA += iZzC6;
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case 23:
                    iZzh = zzgx.zzd(i16, (List) unsafe.getObject(obj2, j10), false);
                    iA += iZzh;
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case 24:
                    iZzh = zzgx.zzb(i16, (List) unsafe.getObject(obj2, j10), false);
                    iA += iZzh;
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case 25:
                    List list4 = (List) unsafe.getObject(obj2, j10);
                    int i25 = zzgx.zza;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        iZzC5 = (zzep.zzC(i16 << 3) + 1) * size2;
                    }
                    iA += iZzC5;
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(obj2, j10);
                    int i26 = zzgx.zza;
                    int size3 = list5.size();
                    if (size3 == 0) {
                        iZzC6 = 0;
                    } else {
                        iZzC6 = zzep.zzC(i16 << 3) * size3;
                        if (list5 instanceof zzfx) {
                            zzfx zzfxVar = (zzfx) list5;
                            for (int i27 = 0; i27 < size3; i27++) {
                                Object objZza = zzfxVar.zza();
                                if (objZza instanceof zzei) {
                                    int iZzd2 = ((zzei) objZza).zzd();
                                    iZzC6 = b6.a.a(iZzd2, iZzd2, iZzC6);
                                } else {
                                    iZzC6 = zzep.zzB((String) objZza) + iZzC6;
                                }
                            }
                        } else {
                            for (int i28 = 0; i28 < size3; i28++) {
                                Object obj3 = list5.get(i28);
                                if (obj3 instanceof zzei) {
                                    int iZzd3 = ((zzei) obj3).zzd();
                                    iZzC6 = b6.a.a(iZzd3, iZzd3, iZzC6);
                                } else {
                                    iZzC6 = zzep.zzB((String) obj3) + iZzC6;
                                }
                            }
                        }
                    }
                    iA += iZzC6;
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case 27:
                    List list6 = (List) unsafe.getObject(obj2, j10);
                    zzgv zzgvVarZzv = zzgoVar.zzv(i12);
                    int i29 = zzgx.zza;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        iZzC7 = 0;
                    } else {
                        iZzC7 = zzep.zzC(i16 << 3) * size4;
                        for (int i30 = 0; i30 < size4; i30++) {
                            Object obj4 = list6.get(i30);
                            if (obj4 instanceof zzfw) {
                                int iZza2 = ((zzfw) obj4).zza();
                                iZzC7 = b6.a.a(iZza2, iZza2, iZzC7);
                            } else {
                                iZzC7 = zzep.zzA((zzgl) obj4, zzgvVarZzv) + iZzC7;
                            }
                        }
                    }
                    iA += iZzC7;
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case 28:
                    List list7 = (List) unsafe.getObject(obj2, j10);
                    int i31 = zzgx.zza;
                    int size5 = list7.size();
                    if (size5 != 0) {
                        iZzC6 = zzep.zzC(i16 << 3) * size5;
                        for (int i32 = 0; i32 < list7.size(); i32++) {
                            int iZzd4 = ((zzei) list7.get(i32)).zzd();
                            iZzC6 = b6.a.a(iZzd4, iZzd4, iZzC6);
                        }
                    }
                    iA += iZzC6;
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(obj2, j10);
                    int i33 = zzgx.zza;
                    size = list8.size();
                    if (size != 0) {
                        iZzl = zzgx.zzk(list8);
                        iZzC4 = zzep.zzC(i16 << 3);
                        iZzC6 = (iZzC4 * size) + iZzl;
                        iA += iZzC6;
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    }
                    iZzC6 = 0;
                    iA += iZzC6;
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case 30:
                    List list9 = (List) unsafe.getObject(obj2, j10);
                    int i34 = zzgx.zza;
                    size = list9.size();
                    if (size != 0) {
                        iZzl = zzgx.zza(list9);
                        iZzC4 = zzep.zzC(i16 << 3);
                        iZzC6 = (iZzC4 * size) + iZzl;
                        iA += iZzC6;
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    }
                    iZzC6 = 0;
                    iA += iZzC6;
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case 31:
                    iZzh = zzgx.zzb(i16, (List) unsafe.getObject(obj2, j10), false);
                    iA += iZzh;
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case 32:
                    iZzh = zzgx.zzd(i16, (List) unsafe.getObject(obj2, j10), false);
                    iA += iZzh;
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case 33:
                    List list10 = (List) unsafe.getObject(obj2, j10);
                    int i35 = zzgx.zza;
                    size = list10.size();
                    if (size != 0) {
                        iZzl = zzgx.zzi(list10);
                        iZzC4 = zzep.zzC(i16 << 3);
                        iZzC6 = (iZzC4 * size) + iZzl;
                        iA += iZzC6;
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    }
                    iZzC6 = 0;
                    iA += iZzC6;
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case 34:
                    List list11 = (List) unsafe.getObject(obj2, j10);
                    int i36 = zzgx.zza;
                    size = list11.size();
                    if (size != 0) {
                        iZzl = zzgx.zzj(list11);
                        iZzC4 = zzep.zzC(i16 << 3);
                        iZzC6 = (iZzC4 * size) + iZzl;
                        iA += iZzC6;
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    }
                    iZzC6 = 0;
                    iA += iZzC6;
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case 35:
                    iZze = zzgx.zze((List) unsafe.getObject(obj2, j10));
                    if (iZze > 0) {
                        iZzC8 = zzep.zzC(i16 << 3);
                        iZzC9 = zzep.zzC(iZze);
                        iA += iZzC9 + iZzC8 + iZze;
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    } else {
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    }
                case 36:
                    iZze = zzgx.zzc((List) unsafe.getObject(obj2, j10));
                    if (iZze > 0) {
                        iZzC8 = zzep.zzC(i16 << 3);
                        iZzC9 = zzep.zzC(iZze);
                        iA += iZzC9 + iZzC8 + iZze;
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    } else {
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    }
                case 37:
                    iZze = zzgx.zzg((List) unsafe.getObject(obj2, j10));
                    if (iZze > 0) {
                        iZzC8 = zzep.zzC(i16 << 3);
                        iZzC9 = zzep.zzC(iZze);
                        iA += iZzC9 + iZzC8 + iZze;
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    } else {
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    }
                case 38:
                    iZze = zzgx.zzl((List) unsafe.getObject(obj2, j10));
                    if (iZze > 0) {
                        iZzC8 = zzep.zzC(i16 << 3);
                        iZzC9 = zzep.zzC(iZze);
                        iA += iZzC9 + iZzC8 + iZze;
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    } else {
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    }
                case 39:
                    iZze = zzgx.zzf((List) unsafe.getObject(obj2, j10));
                    if (iZze > 0) {
                        iZzC8 = zzep.zzC(i16 << 3);
                        iZzC9 = zzep.zzC(iZze);
                        iA += iZzC9 + iZzC8 + iZze;
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    } else {
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    }
                case 40:
                    iZze = zzgx.zze((List) unsafe.getObject(obj2, j10));
                    if (iZze > 0) {
                        iZzC8 = zzep.zzC(i16 << 3);
                        iZzC9 = zzep.zzC(iZze);
                        iA += iZzC9 + iZzC8 + iZze;
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    } else {
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    }
                case 41:
                    iZze = zzgx.zzc((List) unsafe.getObject(obj2, j10));
                    if (iZze > 0) {
                        iZzC8 = zzep.zzC(i16 << 3);
                        iZzC9 = zzep.zzC(iZze);
                        iA += iZzC9 + iZzC8 + iZze;
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    } else {
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    }
                case 42:
                    List list12 = (List) unsafe.getObject(obj2, j10);
                    int i37 = zzgx.zza;
                    iZze = list12.size();
                    if (iZze > 0) {
                        iZzC8 = zzep.zzC(i16 << 3);
                        iZzC9 = zzep.zzC(iZze);
                        iA += iZzC9 + iZzC8 + iZze;
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    } else {
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    }
                case EACTags.DATE_OF_BIRTH /* 43 */:
                    iZze = zzgx.zzk((List) unsafe.getObject(obj2, j10));
                    if (iZze > 0) {
                        iZzC8 = zzep.zzC(i16 << 3);
                        iZzC9 = zzep.zzC(iZze);
                        iA += iZzC9 + iZzC8 + iZze;
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    } else {
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    }
                case 44:
                    iZze = zzgx.zza((List) unsafe.getObject(obj2, j10));
                    if (iZze > 0) {
                        iZzC8 = zzep.zzC(i16 << 3);
                        iZzC9 = zzep.zzC(iZze);
                        iA += iZzC9 + iZzC8 + iZze;
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    } else {
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    }
                case 45:
                    iZze = zzgx.zzc((List) unsafe.getObject(obj2, j10));
                    if (iZze > 0) {
                        iZzC8 = zzep.zzC(i16 << 3);
                        iZzC9 = zzep.zzC(iZze);
                        iA += iZzC9 + iZzC8 + iZze;
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    } else {
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    }
                case 46:
                    iZze = zzgx.zze((List) unsafe.getObject(obj2, j10));
                    if (iZze > 0) {
                        iZzC8 = zzep.zzC(i16 << 3);
                        iZzC9 = zzep.zzC(iZze);
                        iA += iZzC9 + iZzC8 + iZze;
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    } else {
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    }
                case EACTags.PIN_USAGE_POLICY /* 47 */:
                    iZze = zzgx.zzi((List) unsafe.getObject(obj2, j10));
                    if (iZze > 0) {
                        iZzC8 = zzep.zzC(i16 << 3);
                        iZzC9 = zzep.zzC(iZze);
                        iA += iZzC9 + iZzC8 + iZze;
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    } else {
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    }
                case 48:
                    iZze = zzgx.zzj((List) unsafe.getObject(obj2, j10));
                    if (iZze > 0) {
                        iZzC8 = zzep.zzC(i16 << 3);
                        iZzC9 = zzep.zzC(iZze);
                        iA += iZzC9 + iZzC8 + iZze;
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    } else {
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    }
                case 49:
                    List list13 = (List) unsafe.getObject(obj2, j10);
                    zzgv zzgvVarZzv2 = zzgoVar.zzv(i12);
                    int i38 = zzgx.zza;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        iZzy2 = 0;
                    } else {
                        iZzy2 = 0;
                        for (int i39 = 0; i39 < size6; i39++) {
                            iZzy2 += zzep.zzy(i16, (zzgl) list13.get(i39), zzgvVarZzv2);
                        }
                    }
                    iA += iZzy2;
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case 50:
                    zzgf zzgfVar = (zzgf) unsafe.getObject(obj2, j10);
                    if (zzgfVar.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = zzgfVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry2 = (Map.Entry) it.next();
                            entry2.getKey();
                            entry2.getValue();
                            throw null;
                        }
                    }
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case EACTags.TRANSACTION_DATE /* 51 */:
                    if (zzgoVar.zzM(obj2, i16, i12)) {
                        iA = b6.a.a(i16 << 3, 8, iA);
                    }
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case 52:
                    if (zzgoVar.zzM(obj2, i16, i12)) {
                        iA = b6.a.a(i16 << 3, 4, iA);
                    }
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case EACTags.SEX /* 53 */:
                    if (zzgoVar.zzM(obj2, i16, i12)) {
                        long jZzt = zzt(obj2, j10);
                        iZzC10 = zzep.zzC(i16 << 3);
                        iZzD2 = zzep.zzD(jZzt);
                        iA += iZzD2 + iZzC10;
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    } else {
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    }
                case EACTags.CURRENCY_EXPONENT /* 54 */:
                    if (zzgoVar.zzM(obj2, i16, i12)) {
                        long jZzt2 = zzt(obj2, j10);
                        iZzC10 = zzep.zzC(i16 << 3);
                        iZzD2 = zzep.zzD(jZzt2);
                        iA += iZzD2 + iZzC10;
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    } else {
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    }
                case 55:
                    if (zzgoVar.zzM(obj2, i16, i12)) {
                        long jZzo = zzo(obj2, j10);
                        iZzC10 = zzep.zzC(i16 << 3);
                        iZzD2 = zzep.zzD(jZzo);
                        iA += iZzD2 + iZzC10;
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    } else {
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    }
                case 56:
                    if (zzgoVar.zzM(obj2, i16, i12)) {
                        iA = b6.a.a(i16 << 3, 8, iA);
                    }
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case 57:
                    if (zzgoVar.zzM(obj2, i16, i12)) {
                        iA = b6.a.a(i16 << 3, 4, iA);
                    }
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    if (zzgoVar.zzM(obj2, i16, i12)) {
                        iA = b6.a.a(i16 << 3, 1, iA);
                    }
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (zzgoVar.zzM(obj2, i16, i12)) {
                        int i40 = i16 << 3;
                        Object object2 = unsafe.getObject(obj2, j10);
                        if (object2 instanceof zzei) {
                            iZze = zzep.zzC(i40);
                            iZzC8 = ((zzei) object2).zzd();
                            iZzC9 = zzep.zzC(iZzC8);
                            iA += iZzC9 + iZzC8 + iZze;
                            i12 += 3;
                            obj2 = obj;
                            i11 = 1048575;
                        } else {
                            iZzC10 = zzep.zzC(i40);
                            iZzD2 = zzep.zzB((String) object2);
                            iA += iZzD2 + iZzC10;
                            i12 += 3;
                            obj2 = obj;
                            i11 = 1048575;
                        }
                    } else {
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    }
                case 60:
                    if (zzgoVar.zzM(obj2, i16, i12)) {
                        iZzh = zzgx.zzh(i16, unsafe.getObject(obj2, j10), zzgoVar.zzv(i12));
                        iA += iZzh;
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    } else {
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    }
                case 61:
                    if (zzgoVar.zzM(obj2, i16, i12)) {
                        zzei zzeiVar2 = (zzei) unsafe.getObject(obj2, j10);
                        iZze = zzep.zzC(i16 << 3);
                        iZzC8 = zzeiVar2.zzd();
                        iZzC9 = zzep.zzC(iZzC8);
                        iA += iZzC9 + iZzC8 + iZze;
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    } else {
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    }
                case 62:
                    if (zzgoVar.zzM(obj2, i16, i12)) {
                        iA = b6.a.a(zzo(obj2, j10), zzep.zzC(i16 << 3), iA);
                    }
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case 63:
                    if (zzgoVar.zzM(obj2, i16, i12)) {
                        long jZzo2 = zzo(obj2, j10);
                        iZzC10 = zzep.zzC(i16 << 3);
                        iZzD2 = zzep.zzD(jZzo2);
                        iA += iZzD2 + iZzC10;
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    } else {
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    }
                case 64:
                    if (zzgoVar.zzM(obj2, i16, i12)) {
                        iA = b6.a.a(i16 << 3, 4, iA);
                    }
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case EACTags.ELEMENT_LIST /* 65 */:
                    if (zzgoVar.zzM(obj2, i16, i12)) {
                        iA = b6.a.a(i16 << 3, 8, iA);
                    }
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case EACTags.ADDRESS /* 66 */:
                    if (zzgoVar.zzM(obj2, i16, i12)) {
                        int iZzo = zzo(obj2, j10);
                        iA = b6.a.a((iZzo >> 31) ^ (iZzo + iZzo), zzep.zzC(i16 << 3), iA);
                    }
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (zzgoVar.zzM(obj2, i16, i12)) {
                        long jZzt3 = zzt(obj2, j10);
                        iZzC10 = zzep.zzC(i16 << 3);
                        iZzD2 = zzep.zzD((jZzt3 >> 63) ^ (jZzt3 + jZzt3));
                        iA += iZzD2 + iZzC10;
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    } else {
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    }
                case 68:
                    if (zzgoVar.zzM(obj2, i16, i12)) {
                        iZzy = zzep.zzy(i16, (zzgl) unsafe.getObject(obj2, j10), zzgoVar.zzv(i12));
                        iA += iZzy;
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    } else {
                        i12 += 3;
                        obj2 = obj;
                        i11 = 1048575;
                    }
                default:
                    i12 += 3;
                    obj2 = obj;
                    i11 = 1048575;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzgv
    public final int zzb(Object obj) {
        int i10;
        long jDoubleToLongBits;
        int i11;
        int iFloatToIntBits;
        int iZzc;
        int i12;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i13 >= iArr.length) {
                int iHashCode = ((zzfi) obj).zzc.hashCode() + (i14 * 53);
                return this.zzh ? (iHashCode * 53) + ((zzff) obj).zzb.zza.hashCode() : iHashCode;
            }
            int iZzs = zzs(i13);
            int i15 = 1048575 & iZzs;
            int iZzr = zzr(iZzs);
            int i16 = iArr[i13];
            long j10 = i15;
            int iHashCode2 = 37;
            switch (iZzr) {
                case 0:
                    i10 = i14 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzho.zza(obj, j10));
                    byte[] bArr = zzfo.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i14 = i10 + iZzc;
                    break;
                case 1:
                    i11 = i14 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzho.zzb(obj, j10));
                    i14 = iFloatToIntBits + i11;
                    break;
                case 2:
                    i10 = i14 * 53;
                    jDoubleToLongBits = zzho.zzd(obj, j10);
                    byte[] bArr2 = zzfo.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i14 = i10 + iZzc;
                    break;
                case 3:
                    i10 = i14 * 53;
                    jDoubleToLongBits = zzho.zzd(obj, j10);
                    byte[] bArr3 = zzfo.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i14 = i10 + iZzc;
                    break;
                case 4:
                    i10 = i14 * 53;
                    iZzc = zzho.zzc(obj, j10);
                    i14 = i10 + iZzc;
                    break;
                case 5:
                    i10 = i14 * 53;
                    jDoubleToLongBits = zzho.zzd(obj, j10);
                    byte[] bArr4 = zzfo.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i14 = i10 + iZzc;
                    break;
                case 6:
                    i10 = i14 * 53;
                    iZzc = zzho.zzc(obj, j10);
                    i14 = i10 + iZzc;
                    break;
                case 7:
                    i11 = i14 * 53;
                    iFloatToIntBits = zzfo.zza(zzho.zzw(obj, j10));
                    i14 = iFloatToIntBits + i11;
                    break;
                case 8:
                    i11 = i14 * 53;
                    iFloatToIntBits = ((String) zzho.zzf(obj, j10)).hashCode();
                    i14 = iFloatToIntBits + i11;
                    break;
                case 9:
                    i12 = i14 * 53;
                    Object objZzf = zzho.zzf(obj, j10);
                    if (objZzf != null) {
                        iHashCode2 = objZzf.hashCode();
                    }
                    i14 = i12 + iHashCode2;
                    break;
                case 10:
                    i11 = i14 * 53;
                    iFloatToIntBits = zzho.zzf(obj, j10).hashCode();
                    i14 = iFloatToIntBits + i11;
                    break;
                case 11:
                    i10 = i14 * 53;
                    iZzc = zzho.zzc(obj, j10);
                    i14 = i10 + iZzc;
                    break;
                case 12:
                    i10 = i14 * 53;
                    iZzc = zzho.zzc(obj, j10);
                    i14 = i10 + iZzc;
                    break;
                case 13:
                    i10 = i14 * 53;
                    iZzc = zzho.zzc(obj, j10);
                    i14 = i10 + iZzc;
                    break;
                case 14:
                    i10 = i14 * 53;
                    jDoubleToLongBits = zzho.zzd(obj, j10);
                    byte[] bArr5 = zzfo.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i14 = i10 + iZzc;
                    break;
                case 15:
                    i10 = i14 * 53;
                    iZzc = zzho.zzc(obj, j10);
                    i14 = i10 + iZzc;
                    break;
                case 16:
                    i10 = i14 * 53;
                    jDoubleToLongBits = zzho.zzd(obj, j10);
                    byte[] bArr6 = zzfo.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i14 = i10 + iZzc;
                    break;
                case 17:
                    i12 = i14 * 53;
                    Object objZzf2 = zzho.zzf(obj, j10);
                    if (objZzf2 != null) {
                        iHashCode2 = objZzf2.hashCode();
                    }
                    i14 = i12 + iHashCode2;
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
                    i11 = i14 * 53;
                    iFloatToIntBits = zzho.zzf(obj, j10).hashCode();
                    i14 = iFloatToIntBits + i11;
                    break;
                case 50:
                    i11 = i14 * 53;
                    iFloatToIntBits = zzho.zzf(obj, j10).hashCode();
                    i14 = iFloatToIntBits + i11;
                    break;
                case EACTags.TRANSACTION_DATE /* 51 */:
                    if (!zzM(obj, i16, i13)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzm(obj, j10));
                        byte[] bArr7 = zzfo.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i14 = i10 + iZzc;
                        break;
                    }
                case 52:
                    if (!zzM(obj, i16, i13)) {
                        break;
                    } else {
                        i11 = i14 * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzn(obj, j10));
                        i14 = iFloatToIntBits + i11;
                        break;
                    }
                case EACTags.SEX /* 53 */:
                    if (!zzM(obj, i16, i13)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        jDoubleToLongBits = zzt(obj, j10);
                        byte[] bArr8 = zzfo.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i14 = i10 + iZzc;
                        break;
                    }
                case EACTags.CURRENCY_EXPONENT /* 54 */:
                    if (!zzM(obj, i16, i13)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        jDoubleToLongBits = zzt(obj, j10);
                        byte[] bArr9 = zzfo.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i14 = i10 + iZzc;
                        break;
                    }
                case 55:
                    if (!zzM(obj, i16, i13)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        iZzc = zzo(obj, j10);
                        i14 = i10 + iZzc;
                        break;
                    }
                case 56:
                    if (!zzM(obj, i16, i13)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        jDoubleToLongBits = zzt(obj, j10);
                        byte[] bArr10 = zzfo.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i14 = i10 + iZzc;
                        break;
                    }
                case 57:
                    if (!zzM(obj, i16, i13)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        iZzc = zzo(obj, j10);
                        i14 = i10 + iZzc;
                        break;
                    }
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    if (!zzM(obj, i16, i13)) {
                        break;
                    } else {
                        i11 = i14 * 53;
                        iFloatToIntBits = zzfo.zza(zzN(obj, j10));
                        i14 = iFloatToIntBits + i11;
                        break;
                    }
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (!zzM(obj, i16, i13)) {
                        break;
                    } else {
                        i11 = i14 * 53;
                        iFloatToIntBits = ((String) zzho.zzf(obj, j10)).hashCode();
                        i14 = iFloatToIntBits + i11;
                        break;
                    }
                case 60:
                    if (!zzM(obj, i16, i13)) {
                        break;
                    } else {
                        i11 = i14 * 53;
                        iFloatToIntBits = zzho.zzf(obj, j10).hashCode();
                        i14 = iFloatToIntBits + i11;
                        break;
                    }
                case 61:
                    if (!zzM(obj, i16, i13)) {
                        break;
                    } else {
                        i11 = i14 * 53;
                        iFloatToIntBits = zzho.zzf(obj, j10).hashCode();
                        i14 = iFloatToIntBits + i11;
                        break;
                    }
                case 62:
                    if (!zzM(obj, i16, i13)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        iZzc = zzo(obj, j10);
                        i14 = i10 + iZzc;
                        break;
                    }
                case 63:
                    if (!zzM(obj, i16, i13)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        iZzc = zzo(obj, j10);
                        i14 = i10 + iZzc;
                        break;
                    }
                case 64:
                    if (!zzM(obj, i16, i13)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        iZzc = zzo(obj, j10);
                        i14 = i10 + iZzc;
                        break;
                    }
                case EACTags.ELEMENT_LIST /* 65 */:
                    if (!zzM(obj, i16, i13)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        jDoubleToLongBits = zzt(obj, j10);
                        byte[] bArr11 = zzfo.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i14 = i10 + iZzc;
                        break;
                    }
                case EACTags.ADDRESS /* 66 */:
                    if (!zzM(obj, i16, i13)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        iZzc = zzo(obj, j10);
                        i14 = i10 + iZzc;
                        break;
                    }
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (!zzM(obj, i16, i13)) {
                        break;
                    } else {
                        i10 = i14 * 53;
                        jDoubleToLongBits = zzt(obj, j10);
                        byte[] bArr12 = zzfo.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i14 = i10 + iZzc;
                        break;
                    }
                case 68:
                    if (!zzM(obj, i16, i13)) {
                        break;
                    } else {
                        i11 = i14 * 53;
                        iFloatToIntBits = zzho.zzf(obj, j10).hashCode();
                        i14 = iFloatToIntBits + i11;
                        break;
                    }
            }
            i13 += 3;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final int zzc(java.lang.Object r33, byte[] r34, int r35, int r36, int r37, com.google.android.gms.internal.play_billing.zzdw r38) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3742
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzgo.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.play_billing.zzdw):int");
    }

    @Override // com.google.android.gms.internal.play_billing.zzgv
    public final Object zze() {
        return ((zzfi) this.zzg).zzo();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    @Override // com.google.android.gms.internal.play_billing.zzgv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzf(Object obj) {
        if (zzL(obj)) {
            if (obj instanceof zzfi) {
                zzfi zzfiVar = (zzfi) obj;
                zzfiVar.zzx(Integer.MAX_VALUE);
                zzfiVar.zza = 0;
                zzfiVar.zzv();
            }
            int[] iArr = this.zzc;
            for (int i10 = 0; i10 < iArr.length; i10 += 3) {
                int iZzs = zzs(i10);
                int i11 = 1048575 & iZzs;
                int iZzr = zzr(iZzs);
                long j10 = i11;
                if (iZzr != 9) {
                    if (iZzr != 60 && iZzr != 68) {
                        switch (iZzr) {
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
                                ((zzfn) zzho.zzf(obj, j10)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j10);
                                if (object != null) {
                                    ((zzgf) object).zzc();
                                    unsafe.putObject(obj, j10, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzM(obj, iArr[i10], i10)) {
                        zzv(i10).zzf(zzb.getObject(obj, j10));
                    }
                } else if (zzI(obj, i10)) {
                    zzv(i10).zzf(zzb.getObject(obj, j10));
                }
            }
            this.zzl.zzb(obj);
            if (this.zzh) {
                this.zzm.zza(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzgv
    public final void zzg(Object obj, Object obj2) {
        zzA(obj);
        obj2.getClass();
        int i10 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i10 >= iArr.length) {
                zzgx.zzp(this.zzl, obj, obj2);
                if (this.zzh) {
                    zzgx.zzo(this.zzm, obj, obj2);
                    return;
                }
                return;
            }
            int iZzs = zzs(i10);
            int i11 = 1048575 & iZzs;
            int iZzr = zzr(iZzs);
            int i12 = iArr[i10];
            long j10 = i11;
            switch (iZzr) {
                case 0:
                    if (!zzI(obj2, i10)) {
                        break;
                    } else {
                        zzho.zzo(obj, j10, zzho.zza(obj2, j10));
                        zzD(obj, i10);
                        break;
                    }
                case 1:
                    if (!zzI(obj2, i10)) {
                        break;
                    } else {
                        zzho.zzp(obj, j10, zzho.zzb(obj2, j10));
                        zzD(obj, i10);
                        break;
                    }
                case 2:
                    if (!zzI(obj2, i10)) {
                        break;
                    } else {
                        zzho.zzr(obj, j10, zzho.zzd(obj2, j10));
                        zzD(obj, i10);
                        break;
                    }
                case 3:
                    if (!zzI(obj2, i10)) {
                        break;
                    } else {
                        zzho.zzr(obj, j10, zzho.zzd(obj2, j10));
                        zzD(obj, i10);
                        break;
                    }
                case 4:
                    if (!zzI(obj2, i10)) {
                        break;
                    } else {
                        zzho.zzq(obj, j10, zzho.zzc(obj2, j10));
                        zzD(obj, i10);
                        break;
                    }
                case 5:
                    if (!zzI(obj2, i10)) {
                        break;
                    } else {
                        zzho.zzr(obj, j10, zzho.zzd(obj2, j10));
                        zzD(obj, i10);
                        break;
                    }
                case 6:
                    if (!zzI(obj2, i10)) {
                        break;
                    } else {
                        zzho.zzq(obj, j10, zzho.zzc(obj2, j10));
                        zzD(obj, i10);
                        break;
                    }
                case 7:
                    if (!zzI(obj2, i10)) {
                        break;
                    } else {
                        zzho.zzm(obj, j10, zzho.zzw(obj2, j10));
                        zzD(obj, i10);
                        break;
                    }
                case 8:
                    if (!zzI(obj2, i10)) {
                        break;
                    } else {
                        zzho.zzs(obj, j10, zzho.zzf(obj2, j10));
                        zzD(obj, i10);
                        break;
                    }
                case 9:
                    zzB(obj, obj2, i10);
                    break;
                case 10:
                    if (!zzI(obj2, i10)) {
                        break;
                    } else {
                        zzho.zzs(obj, j10, zzho.zzf(obj2, j10));
                        zzD(obj, i10);
                        break;
                    }
                case 11:
                    if (!zzI(obj2, i10)) {
                        break;
                    } else {
                        zzho.zzq(obj, j10, zzho.zzc(obj2, j10));
                        zzD(obj, i10);
                        break;
                    }
                case 12:
                    if (!zzI(obj2, i10)) {
                        break;
                    } else {
                        zzho.zzq(obj, j10, zzho.zzc(obj2, j10));
                        zzD(obj, i10);
                        break;
                    }
                case 13:
                    if (!zzI(obj2, i10)) {
                        break;
                    } else {
                        zzho.zzq(obj, j10, zzho.zzc(obj2, j10));
                        zzD(obj, i10);
                        break;
                    }
                case 14:
                    if (!zzI(obj2, i10)) {
                        break;
                    } else {
                        zzho.zzr(obj, j10, zzho.zzd(obj2, j10));
                        zzD(obj, i10);
                        break;
                    }
                case 15:
                    if (!zzI(obj2, i10)) {
                        break;
                    } else {
                        zzho.zzq(obj, j10, zzho.zzc(obj2, j10));
                        zzD(obj, i10);
                        break;
                    }
                case 16:
                    if (!zzI(obj2, i10)) {
                        break;
                    } else {
                        zzho.zzr(obj, j10, zzho.zzd(obj2, j10));
                        zzD(obj, i10);
                        break;
                    }
                case 17:
                    zzB(obj, obj2, i10);
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
                    zzfn zzfnVarZzd = (zzfn) zzho.zzf(obj, j10);
                    zzfn zzfnVar = (zzfn) zzho.zzf(obj2, j10);
                    int size = zzfnVarZzd.size();
                    int size2 = zzfnVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzfnVarZzd.zzc()) {
                            zzfnVarZzd = zzfnVarZzd.zzd(size2 + size);
                        }
                        zzfnVarZzd.addAll(zzfnVar);
                    }
                    if (size > 0) {
                        zzfnVar = zzfnVarZzd;
                    }
                    zzho.zzs(obj, j10, zzfnVar);
                    break;
                case 50:
                    int i13 = zzgx.zza;
                    zzho.zzs(obj, j10, zzgg.zza(zzho.zzf(obj, j10), zzho.zzf(obj2, j10)));
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
                    if (!zzM(obj2, i12, i10)) {
                        break;
                    } else {
                        zzho.zzs(obj, j10, zzho.zzf(obj2, j10));
                        zzE(obj, i12, i10);
                        break;
                    }
                case 60:
                    zzC(obj, obj2, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case EACTags.ELEMENT_LIST /* 65 */:
                case EACTags.ADDRESS /* 66 */:
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (!zzM(obj2, i12, i10)) {
                        break;
                    } else {
                        zzho.zzs(obj, j10, zzho.zzf(obj2, j10));
                        zzE(obj, i12, i10);
                        break;
                    }
                case 68:
                    zzC(obj, obj2, i10);
                    break;
            }
            i10 += 3;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzgv
    public final void zzh(Object obj, byte[] bArr, int i10, int i11, zzdw zzdwVar) throws IOException {
        zzc(obj, bArr, i10, i11, 0, zzdwVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    @Override // com.google.android.gms.internal.play_billing.zzgv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzi(Object obj, zzhu zzhuVar) throws IOException {
        Map.Entry entry;
        int i10;
        int i11;
        zzgo<T> zzgoVar = this;
        if (zzgoVar.zzh) {
            zzez zzezVar = ((zzff) obj).zzb;
            entry = !zzezVar.zza.isEmpty() ? (Map.Entry) zzezVar.zzf().next() : null;
        }
        int[] iArr = zzgoVar.zzc;
        Unsafe unsafe = zzb;
        int i12 = 1048575;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        while (i14 < iArr.length) {
            int iZzs = zzgoVar.zzs(i14);
            int iZzr = zzr(iZzs);
            int i16 = iArr[i14];
            if (iZzr <= 17) {
                int i17 = iArr[i14 + 2];
                int i18 = i17 & i12;
                if (i18 != i13) {
                    i15 = i18 == i12 ? 0 : unsafe.getInt(obj, i18);
                    i13 = i18;
                }
                i10 = iZzs;
                i11 = 1 << (i17 >>> 20);
            } else {
                i10 = iZzs;
                i11 = 0;
            }
            if (entry != null) {
                throw null;
            }
            long j10 = i10 & i12;
            switch (iZzr) {
                case 0:
                    if (zzgoVar.zzJ(obj, i14, i13, i15, i11)) {
                        zzhuVar.zzf(i16, zzho.zza(obj, j10));
                        continue;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    zzgoVar = this;
                case 1:
                    if (zzgoVar.zzJ(obj, i14, i13, i15, i11)) {
                        zzhuVar.zzo(i16, zzho.zzb(obj, j10));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    zzgoVar = this;
                case 2:
                    if (zzgoVar.zzJ(obj, i14, i13, i15, i11)) {
                        zzhuVar.zzt(i16, unsafe.getLong(obj, j10));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    zzgoVar = this;
                case 3:
                    if (zzgoVar.zzJ(obj, i14, i13, i15, i11)) {
                        zzhuVar.zzK(i16, unsafe.getLong(obj, j10));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    zzgoVar = this;
                case 4:
                    if (zzgoVar.zzJ(obj, i14, i13, i15, i11)) {
                        zzhuVar.zzr(i16, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    zzgoVar = this;
                case 5:
                    if (zzgoVar.zzJ(obj, i14, i13, i15, i11)) {
                        zzhuVar.zzm(i16, unsafe.getLong(obj, j10));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    zzgoVar = this;
                case 6:
                    if (zzgoVar.zzJ(obj, i14, i13, i15, i11)) {
                        zzhuVar.zzk(i16, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    zzgoVar = this;
                case 7:
                    if (zzgoVar.zzJ(obj, i14, i13, i15, i11)) {
                        zzhuVar.zzb(i16, zzho.zzw(obj, j10));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    zzgoVar = this;
                case 8:
                    if (zzgoVar.zzJ(obj, i14, i13, i15, i11)) {
                        zzO(i16, unsafe.getObject(obj, j10), zzhuVar);
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    zzgoVar = this;
                case 9:
                    if (zzgoVar.zzJ(obj, i14, i13, i15, i11)) {
                        zzhuVar.zzv(i16, unsafe.getObject(obj, j10), zzgoVar.zzv(i14));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    zzgoVar = this;
                case 10:
                    if (zzgoVar.zzJ(obj, i14, i13, i15, i11)) {
                        zzhuVar.zzd(i16, (zzei) unsafe.getObject(obj, j10));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    zzgoVar = this;
                case 11:
                    if (zzgoVar.zzJ(obj, i14, i13, i15, i11)) {
                        zzhuVar.zzI(i16, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    zzgoVar = this;
                case 12:
                    if (zzgoVar.zzJ(obj, i14, i13, i15, i11)) {
                        zzhuVar.zzi(i16, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    zzgoVar = this;
                case 13:
                    if (zzgoVar.zzJ(obj, i14, i13, i15, i11)) {
                        zzhuVar.zzx(i16, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    zzgoVar = this;
                case 14:
                    if (zzgoVar.zzJ(obj, i14, i13, i15, i11)) {
                        zzhuVar.zzz(i16, unsafe.getLong(obj, j10));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    zzgoVar = this;
                case 15:
                    if (zzgoVar.zzJ(obj, i14, i13, i15, i11)) {
                        zzhuVar.zzB(i16, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    zzgoVar = this;
                case 16:
                    if (zzgoVar.zzJ(obj, i14, i13, i15, i11)) {
                        zzhuVar.zzD(i16, unsafe.getLong(obj, j10));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    zzgoVar = this;
                case 17:
                    if (zzgoVar.zzJ(obj, i14, i13, i15, i11)) {
                        zzhuVar.zzq(i16, unsafe.getObject(obj, j10), zzgoVar.zzv(i14));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    zzgoVar = this;
                case 18:
                    zzgx.zzr(iArr[i14], (List) unsafe.getObject(obj, j10), zzhuVar, false);
                    continue;
                    i14 += 3;
                    i12 = 1048575;
                    zzgoVar = this;
                case 19:
                    zzgx.zzv(iArr[i14], (List) unsafe.getObject(obj, j10), zzhuVar, false);
                    continue;
                    i14 += 3;
                    i12 = 1048575;
                    zzgoVar = this;
                case 20:
                    zzgx.zzx(iArr[i14], (List) unsafe.getObject(obj, j10), zzhuVar, false);
                    continue;
                    i14 += 3;
                    i12 = 1048575;
                    zzgoVar = this;
                case 21:
                    zzgx.zzD(iArr[i14], (List) unsafe.getObject(obj, j10), zzhuVar, false);
                    continue;
                    i14 += 3;
                    i12 = 1048575;
                    zzgoVar = this;
                case 22:
                    zzgx.zzw(iArr[i14], (List) unsafe.getObject(obj, j10), zzhuVar, false);
                    continue;
                    i14 += 3;
                    i12 = 1048575;
                    zzgoVar = this;
                case 23:
                    zzgx.zzu(iArr[i14], (List) unsafe.getObject(obj, j10), zzhuVar, false);
                    continue;
                    i14 += 3;
                    i12 = 1048575;
                    zzgoVar = this;
                case 24:
                    zzgx.zzt(iArr[i14], (List) unsafe.getObject(obj, j10), zzhuVar, false);
                    continue;
                    i14 += 3;
                    i12 = 1048575;
                    zzgoVar = this;
                case 25:
                    zzgx.zzq(iArr[i14], (List) unsafe.getObject(obj, j10), zzhuVar, false);
                    continue;
                    i14 += 3;
                    i12 = 1048575;
                    zzgoVar = this;
                case 26:
                    int i19 = iArr[i14];
                    List list = (List) unsafe.getObject(obj, j10);
                    int i20 = zzgx.zza;
                    if (list != null && !list.isEmpty()) {
                        zzhuVar.zzH(i19, list);
                        break;
                    }
                    break;
                case 27:
                    int i21 = iArr[i14];
                    List list2 = (List) unsafe.getObject(obj, j10);
                    zzgv zzgvVarZzv = zzgoVar.zzv(i14);
                    int i22 = zzgx.zza;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i23 = 0; i23 < list2.size(); i23++) {
                            ((zzeq) zzhuVar).zzv(i21, list2.get(i23), zzgvVarZzv);
                        }
                        break;
                    }
                    break;
                case 28:
                    int i24 = iArr[i14];
                    List list3 = (List) unsafe.getObject(obj, j10);
                    int i25 = zzgx.zza;
                    if (list3 != null && !list3.isEmpty()) {
                        zzhuVar.zze(i24, list3);
                        break;
                    }
                    break;
                case 29:
                    zzgx.zzC(iArr[i14], (List) unsafe.getObject(obj, j10), zzhuVar, false);
                    continue;
                    i14 += 3;
                    i12 = 1048575;
                    zzgoVar = this;
                case 30:
                    zzgx.zzs(iArr[i14], (List) unsafe.getObject(obj, j10), zzhuVar, false);
                    continue;
                    i14 += 3;
                    i12 = 1048575;
                    zzgoVar = this;
                case 31:
                    zzgx.zzy(iArr[i14], (List) unsafe.getObject(obj, j10), zzhuVar, false);
                    continue;
                    i14 += 3;
                    i12 = 1048575;
                    zzgoVar = this;
                case 32:
                    zzgx.zzz(iArr[i14], (List) unsafe.getObject(obj, j10), zzhuVar, false);
                    continue;
                    i14 += 3;
                    i12 = 1048575;
                    zzgoVar = this;
                case 33:
                    zzgx.zzA(iArr[i14], (List) unsafe.getObject(obj, j10), zzhuVar, false);
                    continue;
                    i14 += 3;
                    i12 = 1048575;
                    zzgoVar = this;
                case 34:
                    zzgx.zzB(iArr[i14], (List) unsafe.getObject(obj, j10), zzhuVar, false);
                    continue;
                    i14 += 3;
                    i12 = 1048575;
                    zzgoVar = this;
                case 35:
                    zzgx.zzr(iArr[i14], (List) unsafe.getObject(obj, j10), zzhuVar, true);
                    break;
                case 36:
                    zzgx.zzv(iArr[i14], (List) unsafe.getObject(obj, j10), zzhuVar, true);
                    break;
                case 37:
                    zzgx.zzx(iArr[i14], (List) unsafe.getObject(obj, j10), zzhuVar, true);
                    break;
                case 38:
                    zzgx.zzD(iArr[i14], (List) unsafe.getObject(obj, j10), zzhuVar, true);
                    break;
                case 39:
                    zzgx.zzw(iArr[i14], (List) unsafe.getObject(obj, j10), zzhuVar, true);
                    break;
                case 40:
                    zzgx.zzu(iArr[i14], (List) unsafe.getObject(obj, j10), zzhuVar, true);
                    break;
                case 41:
                    zzgx.zzt(iArr[i14], (List) unsafe.getObject(obj, j10), zzhuVar, true);
                    break;
                case 42:
                    zzgx.zzq(iArr[i14], (List) unsafe.getObject(obj, j10), zzhuVar, true);
                    break;
                case EACTags.DATE_OF_BIRTH /* 43 */:
                    zzgx.zzC(iArr[i14], (List) unsafe.getObject(obj, j10), zzhuVar, true);
                    break;
                case 44:
                    zzgx.zzs(iArr[i14], (List) unsafe.getObject(obj, j10), zzhuVar, true);
                    break;
                case 45:
                    zzgx.zzy(iArr[i14], (List) unsafe.getObject(obj, j10), zzhuVar, true);
                    break;
                case 46:
                    zzgx.zzz(iArr[i14], (List) unsafe.getObject(obj, j10), zzhuVar, true);
                    break;
                case EACTags.PIN_USAGE_POLICY /* 47 */:
                    zzgx.zzA(iArr[i14], (List) unsafe.getObject(obj, j10), zzhuVar, true);
                    break;
                case 48:
                    zzgx.zzB(iArr[i14], (List) unsafe.getObject(obj, j10), zzhuVar, true);
                    break;
                case 49:
                    int i26 = iArr[i14];
                    List list4 = (List) unsafe.getObject(obj, j10);
                    zzgv zzgvVarZzv2 = zzgoVar.zzv(i14);
                    int i27 = zzgx.zza;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i28 = 0; i28 < list4.size(); i28++) {
                            ((zzeq) zzhuVar).zzq(i26, list4.get(i28), zzgvVarZzv2);
                        }
                        break;
                    }
                    break;
                case 50:
                    if (unsafe.getObject(obj, j10) != null) {
                        throw null;
                    }
                    break;
                case EACTags.TRANSACTION_DATE /* 51 */:
                    if (zzgoVar.zzM(obj, i16, i14)) {
                        zzhuVar.zzf(i16, zzm(obj, j10));
                        break;
                    }
                    break;
                case 52:
                    if (zzgoVar.zzM(obj, i16, i14)) {
                        zzhuVar.zzo(i16, zzn(obj, j10));
                        break;
                    }
                    break;
                case EACTags.SEX /* 53 */:
                    if (zzgoVar.zzM(obj, i16, i14)) {
                        zzhuVar.zzt(i16, zzt(obj, j10));
                        break;
                    }
                    break;
                case EACTags.CURRENCY_EXPONENT /* 54 */:
                    if (zzgoVar.zzM(obj, i16, i14)) {
                        zzhuVar.zzK(i16, zzt(obj, j10));
                        break;
                    }
                    break;
                case 55:
                    if (zzgoVar.zzM(obj, i16, i14)) {
                        zzhuVar.zzr(i16, zzo(obj, j10));
                        break;
                    }
                    break;
                case 56:
                    if (zzgoVar.zzM(obj, i16, i14)) {
                        zzhuVar.zzm(i16, zzt(obj, j10));
                        break;
                    }
                    break;
                case 57:
                    if (zzgoVar.zzM(obj, i16, i14)) {
                        zzhuVar.zzk(i16, zzo(obj, j10));
                        break;
                    }
                    break;
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    if (zzgoVar.zzM(obj, i16, i14)) {
                        zzhuVar.zzb(i16, zzN(obj, j10));
                        break;
                    }
                    break;
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (zzgoVar.zzM(obj, i16, i14)) {
                        zzO(i16, unsafe.getObject(obj, j10), zzhuVar);
                        break;
                    }
                    break;
                case 60:
                    if (zzgoVar.zzM(obj, i16, i14)) {
                        zzhuVar.zzv(i16, unsafe.getObject(obj, j10), zzgoVar.zzv(i14));
                        break;
                    }
                    break;
                case 61:
                    if (zzgoVar.zzM(obj, i16, i14)) {
                        zzhuVar.zzd(i16, (zzei) unsafe.getObject(obj, j10));
                        break;
                    }
                    break;
                case 62:
                    if (zzgoVar.zzM(obj, i16, i14)) {
                        zzhuVar.zzI(i16, zzo(obj, j10));
                        break;
                    }
                    break;
                case 63:
                    if (zzgoVar.zzM(obj, i16, i14)) {
                        zzhuVar.zzi(i16, zzo(obj, j10));
                        break;
                    }
                    break;
                case 64:
                    if (zzgoVar.zzM(obj, i16, i14)) {
                        zzhuVar.zzx(i16, zzo(obj, j10));
                        break;
                    }
                    break;
                case EACTags.ELEMENT_LIST /* 65 */:
                    if (zzgoVar.zzM(obj, i16, i14)) {
                        zzhuVar.zzz(i16, zzt(obj, j10));
                        break;
                    }
                    break;
                case EACTags.ADDRESS /* 66 */:
                    if (zzgoVar.zzM(obj, i16, i14)) {
                        zzhuVar.zzB(i16, zzo(obj, j10));
                        break;
                    }
                    break;
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (zzgoVar.zzM(obj, i16, i14)) {
                        zzhuVar.zzD(i16, zzt(obj, j10));
                        break;
                    }
                    break;
                case 68:
                    if (zzgoVar.zzM(obj, i16, i14)) {
                        zzhuVar.zzq(i16, unsafe.getObject(obj, j10), zzgoVar.zzv(i14));
                        break;
                    }
                    break;
            }
            i14 += 3;
            i12 = 1048575;
            zzgoVar = this;
        }
        if (entry != null) {
            throw null;
        }
        ((zzfi) obj).zzc.zzl(zzhuVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgv
    public final boolean zzj(Object obj, Object obj2) {
        boolean zZzE;
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int iZzs = zzs(i10);
            long j10 = iZzs & 1048575;
            switch (zzr(iZzs)) {
                case 0:
                    if (!zzH(obj, obj2, i10) || Double.doubleToLongBits(zzho.zza(obj, j10)) != Double.doubleToLongBits(zzho.zza(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 1:
                    if (!zzH(obj, obj2, i10) || Float.floatToIntBits(zzho.zzb(obj, j10)) != Float.floatToIntBits(zzho.zzb(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 2:
                    if (!zzH(obj, obj2, i10) || zzho.zzd(obj, j10) != zzho.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 3:
                    if (!zzH(obj, obj2, i10) || zzho.zzd(obj, j10) != zzho.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 4:
                    if (!zzH(obj, obj2, i10) || zzho.zzc(obj, j10) != zzho.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 5:
                    if (!zzH(obj, obj2, i10) || zzho.zzd(obj, j10) != zzho.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 6:
                    if (!zzH(obj, obj2, i10) || zzho.zzc(obj, j10) != zzho.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 7:
                    if (!zzH(obj, obj2, i10) || zzho.zzw(obj, j10) != zzho.zzw(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 8:
                    if (!zzH(obj, obj2, i10) || !zzgx.zzE(zzho.zzf(obj, j10), zzho.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 9:
                    if (!zzH(obj, obj2, i10) || !zzgx.zzE(zzho.zzf(obj, j10), zzho.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 10:
                    if (!zzH(obj, obj2, i10) || !zzgx.zzE(zzho.zzf(obj, j10), zzho.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 11:
                    if (!zzH(obj, obj2, i10) || zzho.zzc(obj, j10) != zzho.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 12:
                    if (!zzH(obj, obj2, i10) || zzho.zzc(obj, j10) != zzho.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 13:
                    if (!zzH(obj, obj2, i10) || zzho.zzc(obj, j10) != zzho.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 14:
                    if (!zzH(obj, obj2, i10) || zzho.zzd(obj, j10) != zzho.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 15:
                    if (!zzH(obj, obj2, i10) || zzho.zzc(obj, j10) != zzho.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 16:
                    if (!zzH(obj, obj2, i10) || zzho.zzd(obj, j10) != zzho.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 17:
                    if (!zzH(obj, obj2, i10) || !zzgx.zzE(zzho.zzf(obj, j10), zzho.zzf(obj2, j10))) {
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
                    zZzE = zzgx.zzE(zzho.zzf(obj, j10), zzho.zzf(obj2, j10));
                    break;
                case 50:
                    zZzE = zzgx.zzE(zzho.zzf(obj, j10), zzho.zzf(obj2, j10));
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
                    long jZzp = zzp(i10) & 1048575;
                    if (zzho.zzc(obj, jZzp) != zzho.zzc(obj2, jZzp) || !zzgx.zzE(zzho.zzf(obj, j10), zzho.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                default:
            }
            if (!zZzE) {
                return false;
            }
        }
        if (!((zzfi) obj).zzc.equals(((zzfi) obj2).zzc)) {
            return false;
        }
        if (this.zzh) {
            return ((zzff) obj).zzb.equals(((zzff) obj2).zzb);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x008d  */
    @Override // com.google.android.gms.internal.play_billing.zzgv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzk(Object obj) {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        int i14 = 0;
        int i15 = 1048575;
        while (i14 < this.zzj) {
            int[] iArr = this.zzi;
            int[] iArr2 = this.zzc;
            int i16 = iArr[i14];
            int i17 = iArr2[i16];
            int iZzs = zzs(i16);
            int i18 = iArr2[i16 + 2];
            int i19 = i18 & 1048575;
            int i20 = 1 << (i18 >>> 20);
            if (i19 != i15) {
                if (i19 != 1048575) {
                    i13 = zzb.getInt(obj, i19);
                }
                i11 = i16;
                i12 = i13;
                i10 = i19;
            } else {
                int i21 = i13;
                i10 = i15;
                i11 = i16;
                i12 = i21;
            }
            if ((268435456 & iZzs) != 0 && !zzJ(obj, i11, i10, i12, i20)) {
                return false;
            }
            int iZzr = zzr(iZzs);
            if (iZzr == 9 || iZzr == 17) {
                if (zzJ(obj, i11, i10, i12, i20) && !zzK(obj, iZzs, zzv(i11))) {
                    return false;
                }
            } else if (iZzr == 27) {
                List list = (List) zzho.zzf(obj, iZzs & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzgv zzgvVarZzv = zzv(i11);
                    for (int i22 = 0; i22 < list.size(); i22++) {
                        if (!zzgvVarZzv.zzk(list.get(i22))) {
                            return false;
                        }
                    }
                }
            } else if (iZzr == 60 || iZzr == 68) {
                if (zzM(obj, i17, i11) && !zzK(obj, iZzs, zzv(i11))) {
                    return false;
                }
            } else if (iZzr != 49) {
                if (iZzr == 50 && !((zzgf) zzho.zzf(obj, iZzs & 1048575)).isEmpty()) {
                    throw null;
                }
            }
            i14++;
            i15 = i10;
            i13 = i12;
        }
        return !this.zzh || ((zzff) obj).zzb.zzi();
    }
}
