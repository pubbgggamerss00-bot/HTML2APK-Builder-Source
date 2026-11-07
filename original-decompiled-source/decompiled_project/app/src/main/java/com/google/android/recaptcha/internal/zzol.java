package com.google.android.recaptcha.internal;

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
final class zzol<T> implements zzow<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzps.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzoi zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzpl zzm;
    private final zzmp zzn;

    private zzol(int[] iArr, Object[] objArr, int i10, int i11, zzoi zzoiVar, boolean z10, int[] iArr2, int i12, int i13, zzoo zzooVar, zznv zznvVar, zzpl zzplVar, zzmp zzmpVar, zzod zzodVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        this.zzi = zzoiVar instanceof zznd;
        boolean z11 = false;
        if (zzmpVar != null && (zzoiVar instanceof zzna)) {
            z11 = true;
        }
        this.zzh = z11;
        this.zzj = iArr2;
        this.zzk = i12;
        this.zzl = i13;
        this.zzm = zzplVar;
        this.zzn = zzmpVar;
        this.zzg = zzoiVar;
    }

    private final Object zzA(Object obj, int i10) {
        zzow zzowVarZzx = zzx(i10);
        int iZzu = zzu(i10) & 1048575;
        if (!zzN(obj, i10)) {
            return zzowVarZzx.zze();
        }
        Object object = zzb.getObject(obj, iZzu);
        if (zzQ(object)) {
            return object;
        }
        Object objZze = zzowVarZzx.zze();
        if (object != null) {
            zzowVarZzx.zzg(objZze, object);
        }
        return objZze;
    }

    private final Object zzB(Object obj, int i10, int i11) {
        zzow zzowVarZzx = zzx(i11);
        if (!zzR(obj, i10, i11)) {
            return zzowVarZzx.zze();
        }
        Object object = zzb.getObject(obj, zzu(i11) & 1048575);
        if (zzQ(object)) {
            return object;
        }
        Object objZze = zzowVarZzx.zze();
        if (object != null) {
            zzowVarZzx.zzg(objZze, object);
        }
        return objZze;
    }

    private static Field zzC(Class cls, String str) {
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

    private static void zzD(Object obj) {
        if (!zzQ(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzE(Object obj, Object obj2, int i10) {
        if (zzN(obj2, i10)) {
            int iZzu = zzu(i10) & 1048575;
            Unsafe unsafe = zzb;
            long j10 = iZzu;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + obj2.toString());
            }
            zzow zzowVarZzx = zzx(i10);
            if (!zzN(obj, i10)) {
                if (zzQ(object)) {
                    Object objZze = zzowVarZzx.zze();
                    zzowVarZzx.zzg(objZze, object);
                    unsafe.putObject(obj, j10, objZze);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                zzH(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzQ(object2)) {
                Object objZze2 = zzowVarZzx.zze();
                zzowVarZzx.zzg(objZze2, object2);
                unsafe.putObject(obj, j10, objZze2);
                object2 = objZze2;
            }
            zzowVarZzx.zzg(object2, object);
        }
    }

    private final void zzF(Object obj, Object obj2, int i10) {
        int i11 = this.zzc[i10];
        if (zzR(obj2, i11, i10)) {
            int iZzu = zzu(i10) & 1048575;
            Unsafe unsafe = zzb;
            long j10 = iZzu;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + obj2.toString());
            }
            zzow zzowVarZzx = zzx(i10);
            if (!zzR(obj, i11, i10)) {
                if (zzQ(object)) {
                    Object objZze = zzowVarZzx.zze();
                    zzowVarZzx.zzg(objZze, object);
                    unsafe.putObject(obj, j10, objZze);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                zzI(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzQ(object2)) {
                Object objZze2 = zzowVarZzx.zze();
                zzowVarZzx.zzg(objZze2, object2);
                unsafe.putObject(obj, j10, objZze2);
                object2 = objZze2;
            }
            zzowVarZzx.zzg(object2, object);
        }
    }

    private final void zzG(Object obj, int i10, zzov zzovVar) throws IOException {
        long j10 = i10 & 1048575;
        if (zzM(i10)) {
            zzps.zzs(obj, j10, zzovVar.zzs());
        } else if (this.zzi) {
            zzps.zzs(obj, j10, zzovVar.zzr());
        } else {
            zzps.zzs(obj, j10, zzovVar.zzp());
        }
    }

    private final void zzH(Object obj, int i10) {
        int iZzr = zzr(i10);
        long j10 = 1048575 & iZzr;
        if (j10 == 1048575) {
            return;
        }
        zzps.zzq(obj, j10, (1 << (iZzr >>> 20)) | zzps.zzc(obj, j10));
    }

    private final void zzI(Object obj, int i10, int i11) {
        zzps.zzq(obj, zzr(i11) & 1048575, i10);
    }

    private final void zzJ(Object obj, int i10, Object obj2) {
        zzb.putObject(obj, zzu(i10) & 1048575, obj2);
        zzH(obj, i10);
    }

    private final void zzK(Object obj, int i10, int i11, Object obj2) {
        zzb.putObject(obj, zzu(i11) & 1048575, obj2);
        zzI(obj, i10, i11);
    }

    private final boolean zzL(Object obj, Object obj2, int i10) {
        return zzN(obj, i10) == zzN(obj2, i10);
    }

    private static boolean zzM(int i10) {
        return (i10 & PKIFailureInfo.duplicateCertReq) != 0;
    }

    private final boolean zzN(Object obj, int i10) {
        int iZzr = zzr(i10);
        long j10 = iZzr & 1048575;
        if (j10 != 1048575) {
            return (zzps.zzc(obj, j10) & (1 << (iZzr >>> 20))) != 0;
        }
        int iZzu = zzu(i10);
        long j11 = iZzu & 1048575;
        switch (zzt(iZzu)) {
            case 0:
                return Double.doubleToRawLongBits(zzps.zza(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzps.zzb(obj, j11)) != 0;
            case 2:
                return zzps.zzd(obj, j11) != 0;
            case 3:
                return zzps.zzd(obj, j11) != 0;
            case 4:
                return zzps.zzc(obj, j11) != 0;
            case 5:
                return zzps.zzd(obj, j11) != 0;
            case 6:
                return zzps.zzc(obj, j11) != 0;
            case 7:
                return zzps.zzw(obj, j11);
            case 8:
                Object objZzf = zzps.zzf(obj, j11);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzle) {
                    return !zzle.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzps.zzf(obj, j11) != null;
            case 10:
                return !zzle.zzb.equals(zzps.zzf(obj, j11));
            case 11:
                return zzps.zzc(obj, j11) != 0;
            case 12:
                return zzps.zzc(obj, j11) != 0;
            case 13:
                return zzps.zzc(obj, j11) != 0;
            case 14:
                return zzps.zzd(obj, j11) != 0;
            case 15:
                return zzps.zzc(obj, j11) != 0;
            case 16:
                return zzps.zzd(obj, j11) != 0;
            case 17:
                return zzps.zzf(obj, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzO(Object obj, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? zzN(obj, i10) : (i12 & i13) != 0;
    }

    private static boolean zzP(Object obj, int i10, zzow zzowVar) {
        return zzowVar.zzl(zzps.zzf(obj, i10 & 1048575));
    }

    private static boolean zzQ(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zznd) {
            return ((zznd) obj).zzL();
        }
        return true;
    }

    private final boolean zzR(Object obj, int i10, int i11) {
        return zzps.zzc(obj, (long) (zzr(i11) & 1048575)) == i10;
    }

    private static boolean zzS(Object obj, long j10) {
        return ((Boolean) zzps.zzf(obj, j10)).booleanValue();
    }

    private static final void zzT(int i10, Object obj, zzpy zzpyVar) throws IOException {
        if (obj instanceof String) {
            zzpyVar.zzG(i10, (String) obj);
        } else {
            zzpyVar.zzd(i10, (zzle) obj);
        }
    }

    public static zzpm zzd(Object obj) {
        zznd zzndVar = (zznd) obj;
        zzpm zzpmVar = zzndVar.zzc;
        if (zzpmVar != zzpm.zzc()) {
            return zzpmVar;
        }
        zzpm zzpmVarZzf = zzpm.zzf();
        zzndVar.zzc = zzpmVarZzf;
        return zzpmVarZzf;
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
    public static zzol zzm(Class cls, zzof zzofVar, zzoo zzooVar, zznv zznvVar, zzpl zzplVar, zzmp zzmpVar, zzod zzodVar) {
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
        Field fieldZzC;
        char cCharAt9;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        Object obj;
        Field fieldZzC2;
        Object obj2;
        Field fieldZzC3;
        int i38;
        char cCharAt10;
        int i39;
        char cCharAt11;
        int i40;
        char cCharAt12;
        int i41;
        char cCharAt13;
        if (!(zzofVar instanceof zzou)) {
            throw null;
        }
        zzou zzouVar = (zzou) zzofVar;
        String strZzd = zzouVar.zzd();
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
        Object[] objArrZze = zzouVar.zze();
        Class<?> cls2 = zzouVar.zza().getClass();
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
            zzou zzouVar2 = zzouVar;
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
                    } else if (zzouVar2.zzc() == 1 || i87 != 0) {
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
                        fieldZzC2 = zzC(cls2, (String) obj);
                        objArrZze[i96] = fieldZzC2;
                    } else {
                        fieldZzC2 = (Field) obj;
                    }
                    int i98 = i16;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzC2);
                    int i99 = i96 + 1;
                    obj2 = objArrZze[i99];
                    i28 = i98;
                    if (obj2 instanceof Field) {
                        fieldZzC3 = zzC(cls2, (String) obj2);
                        objArrZze[i99] = fieldZzC3;
                    } else {
                        fieldZzC3 = (Field) obj2;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzC3);
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
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzC2);
                int i992 = i962 + 1;
                obj2 = objArrZze[i992];
                i28 = i982;
                if (obj2 instanceof Field) {
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzC3);
                str = strZzd;
                i31 = i972;
                i26 = i92;
                i30 = 0;
                c10 = 55296;
            } else {
                i27 = length;
                i28 = i16;
                int i100 = i15 + 1;
                Field fieldZzC4 = zzC(cls2, (String) objArrZze[i15]);
                if (i86 == 9 || i86 == 17) {
                    i29 = i100;
                    int i101 = i77 / 3;
                    objArr[i101 + i101 + 1] = fieldZzC4.getType();
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
                        if (zzouVar2.zzc() == 1 || i87 != 0) {
                            i15 += 2;
                            int i102 = i77 / 3;
                            objArr[i102 + i102 + 1] = objArrZze[i100];
                            str = strZzd;
                            iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzC4);
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
                                    fieldZzC = (Field) obj3;
                                } else {
                                    fieldZzC = zzC(cls2, (String) obj3);
                                    objArrZze[i106] = fieldZzC;
                                }
                                i30 = iCharAt13 % 32;
                                i26 = i32;
                                c10 = 55296;
                                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzC);
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
                            iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzC4);
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
                            iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzC4);
                            if ((iCharAt11 & 4096) != 0) {
                            }
                        } else {
                            i15 = i107;
                            i74 = i108;
                            i87 = 0;
                            str = strZzd;
                            iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzC4);
                            if ((iCharAt11 & 4096) != 0) {
                            }
                        }
                    } else {
                        i29 = i100;
                    }
                    int i111 = i77 / 3;
                    objArr[i111 + i111 + i34] = objArrZze[i33];
                    str = strZzd;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzC4);
                    if ((iCharAt11 & 4096) != 0) {
                    }
                }
                str = strZzd;
                i15 = i29;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzC4);
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
            zzouVar = zzouVar2;
            length = i27;
            i16 = i28;
        }
        return new zzol(iArr3, objArr, i11, i13, zzouVar.zza(), false, iArr, i14, i72, zzooVar, zznvVar, zzplVar, zzmpVar, zzodVar);
    }

    private static double zzn(Object obj, long j10) {
        return ((Double) zzps.zzf(obj, j10)).doubleValue();
    }

    private static float zzo(Object obj, long j10) {
        return ((Float) zzps.zzf(obj, j10)).floatValue();
    }

    private static int zzp(Object obj, long j10) {
        return ((Integer) zzps.zzf(obj, j10)).intValue();
    }

    private final int zzq(int i10) {
        if (i10 < this.zze || i10 > this.zzf) {
            return -1;
        }
        return zzs(i10, 0);
    }

    private final int zzr(int i10) {
        return this.zzc[i10 + 2];
    }

    private final int zzs(int i10, int i11) {
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

    private static int zzt(int i10) {
        return (i10 >>> 20) & 255;
    }

    private final int zzu(int i10) {
        return this.zzc[i10 + 1];
    }

    private static long zzv(Object obj, long j10) {
        return ((Long) zzps.zzf(obj, j10)).longValue();
    }

    private final zznh zzw(int i10) {
        int i11 = i10 / 3;
        return (zznh) this.zzd[i11 + i11 + 1];
    }

    private final zzow zzx(int i10) {
        Object[] objArr = this.zzd;
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zzow zzowVar = (zzow) objArr[i12];
        if (zzowVar != null) {
            return zzowVar;
        }
        zzow zzowVarZzb = zzos.zza().zzb((Class) objArr[i12 + 1]);
        this.zzd[i12] = zzowVarZzb;
        return zzowVarZzb;
    }

    private final Object zzy(Object obj, int i10, Object obj2, zzpl zzplVar, Object obj3) {
        int i11 = this.zzc[i10];
        Object objZzf = zzps.zzf(obj, zzu(i10) & 1048575);
        if (objZzf == null || zzw(i10) == null) {
            return obj2;
        }
        throw null;
    }

    private final Object zzz(int i10) {
        int i11 = i10 / 3;
        return this.zzd[i11 + i11];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.recaptcha.internal.zzow
    public final int zza(Object obj) {
        int i10;
        int iZzA;
        int iZzB;
        int iZzA2;
        int iZzd;
        int iZzA3;
        int iZzh;
        int size;
        int iZzl;
        int iZzA4;
        int iZzA5;
        int iZzd2;
        boolean z10;
        int iZzb;
        int iZzz;
        int iZzA6;
        int iZzA7;
        int size2;
        int iZzk;
        int iZzA8;
        int size3;
        int iZzi;
        int iZzA9;
        int i11;
        int iZze;
        int iZzA10;
        int iZzA11;
        int iZzA12;
        int iZzB2;
        zzol<T> zzolVar = this;
        Object obj2 = obj;
        Unsafe unsafe = zzb;
        int i12 = 1048575;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        int iA = 0;
        while (i14 < zzolVar.zzc.length) {
            int iZzu = zzolVar.zzu(i14);
            int iZzt = zzt(iZzu);
            int[] iArr = zzolVar.zzc;
            int i16 = iArr[i14];
            int i17 = iArr[i14 + 2];
            int i18 = i17 & i12;
            if (iZzt <= 17) {
                if (i18 != i13) {
                    i15 = i18 == i12 ? 0 : unsafe.getInt(obj2, i18);
                    i13 = i18;
                }
                i10 = 1 << (i17 >>> 20);
            } else {
                i10 = 0;
            }
            int i19 = iZzu & i12;
            if (iZzt >= zzmu.zzJ.zza()) {
                zzmu.zzW.zza();
            }
            long j10 = i19;
            switch (iZzt) {
                case 0:
                    if (zzolVar.zzO(obj2, i14, i13, i15, i10)) {
                        iA = e.a(i16 << 3, 8, iA);
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 1:
                    if (zzolVar.zzO(obj2, i14, i13, i15, i10)) {
                        iA = e.a(i16 << 3, 4, iA);
                    }
                    zzolVar = this;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 2:
                    if (zzolVar.zzO(obj2, i14, i13, i15, i10)) {
                        long j11 = unsafe.getLong(obj2, j10);
                        iZzA = zzln.zzA(i16 << 3);
                        iZzB = zzln.zzB(j11);
                        iA += iZzB + iZzA;
                    }
                    zzolVar = this;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 3:
                    if (zzolVar.zzO(obj2, i14, i13, i15, i10)) {
                        long j12 = unsafe.getLong(obj2, j10);
                        iZzA = zzln.zzA(i16 << 3);
                        iZzB = zzln.zzB(j12);
                        iA += iZzB + iZzA;
                    }
                    zzolVar = this;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 4:
                    if (zzolVar.zzO(obj2, i14, i13, i15, i10)) {
                        long j13 = unsafe.getInt(obj2, j10);
                        iZzA = zzln.zzA(i16 << 3);
                        iZzB = zzln.zzB(j13);
                        iA += iZzB + iZzA;
                    }
                    zzolVar = this;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 5:
                    if (zzolVar.zzO(obj2, i14, i13, i15, i10)) {
                        iA = e.a(i16 << 3, 8, iA);
                    }
                    zzolVar = this;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 6:
                    if (zzolVar.zzO(obj2, i14, i13, i15, i10)) {
                        iA = e.a(i16 << 3, 4, iA);
                    }
                    zzolVar = this;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 7:
                    if (zzolVar.zzO(obj2, i14, i13, i15, i10)) {
                        iA = e.a(i16 << 3, 1, iA);
                    }
                    zzolVar = this;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 8:
                    if (zzolVar.zzO(obj2, i14, i13, i15, i10)) {
                        int i20 = i16 << 3;
                        Object object = unsafe.getObject(obj2, j10);
                        if (object instanceof zzle) {
                            iZzA2 = zzln.zzA(i20);
                            iZzd = ((zzle) object).zzd();
                            iZzA3 = zzln.zzA(iZzd);
                            iA += iZzA3 + iZzd + iZzA2;
                        } else {
                            iZzA = zzln.zzA(i20);
                            iZzB = zzln.zzz((String) object);
                            iA += iZzB + iZzA;
                        }
                    }
                    zzolVar = this;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 9:
                    if (zzolVar.zzO(obj2, i14, i13, i15, i10)) {
                        iZzh = zzoy.zzh(i16, unsafe.getObject(obj2, j10), zzolVar.zzx(i14));
                        iA += iZzh;
                        i14 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    } else {
                        i14 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    }
                case 10:
                    if (zzolVar.zzO(obj2, i14, i13, i15, i10)) {
                        zzle zzleVar = (zzle) unsafe.getObject(obj2, j10);
                        iZzA2 = zzln.zzA(i16 << 3);
                        iZzd = zzleVar.zzd();
                        iZzA3 = zzln.zzA(iZzd);
                        iA += iZzA3 + iZzd + iZzA2;
                    }
                    zzolVar = this;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 11:
                    if (zzolVar.zzO(obj2, i14, i13, i15, i10)) {
                        iA = e.a(unsafe.getInt(obj2, j10), zzln.zzA(i16 << 3), iA);
                    }
                    zzolVar = this;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 12:
                    if (zzolVar.zzO(obj2, i14, i13, i15, i10)) {
                        long j14 = unsafe.getInt(obj2, j10);
                        iZzA = zzln.zzA(i16 << 3);
                        iZzB = zzln.zzB(j14);
                        iA += iZzB + iZzA;
                    }
                    zzolVar = this;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 13:
                    if (zzolVar.zzO(obj2, i14, i13, i15, i10)) {
                        iA = e.a(i16 << 3, 4, iA);
                    }
                    zzolVar = this;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 14:
                    if (zzolVar.zzO(obj2, i14, i13, i15, i10)) {
                        iA = e.a(i16 << 3, 8, iA);
                    }
                    zzolVar = this;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 15:
                    if (zzolVar.zzO(obj2, i14, i13, i15, i10)) {
                        int i21 = unsafe.getInt(obj2, j10);
                        iA = e.a((i21 >> 31) ^ (i21 + i21), zzln.zzA(i16 << 3), iA);
                    }
                    zzolVar = this;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 16:
                    if (zzolVar.zzO(obj2, i14, i13, i15, i10)) {
                        long j15 = unsafe.getLong(obj2, j10);
                        iZzA = zzln.zzA(i16 << 3);
                        iZzB = zzln.zzB((j15 >> 63) ^ (j15 + j15));
                        iA += iZzB + iZzA;
                    }
                    zzolVar = this;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 17:
                    if (zzolVar.zzO(obj2, i14, i13, i15, i10)) {
                        iA += zzln.zzw(i16, (zzoi) unsafe.getObject(obj2, j10), zzolVar.zzx(i14));
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 18:
                    iZzh = zzoy.zzd(i16, (List) unsafe.getObject(obj2, j10), false);
                    iA += iZzh;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 19:
                    iZzh = zzoy.zzb(i16, (List) unsafe.getObject(obj2, j10), false);
                    iA += iZzh;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 20:
                    List list = (List) unsafe.getObject(obj2, j10);
                    int i22 = zzoy.zza;
                    iZzA5 = list.size() == 0 ? 0 : (zzln.zzA(i16 << 3) * list.size()) + zzoy.zzg(list);
                    iA += iZzA5;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 21:
                    List list2 = (List) unsafe.getObject(obj2, j10);
                    int i23 = zzoy.zza;
                    size = list2.size();
                    if (size != 0) {
                        iZzl = zzoy.zzl(list2);
                        iZzA4 = zzln.zzA(i16 << 3);
                        iZzA5 = (iZzA4 * size) + iZzl;
                        iA += iZzA5;
                        i14 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    }
                    iA += iZzA5;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 22:
                    List list3 = (List) unsafe.getObject(obj2, j10);
                    int i24 = zzoy.zza;
                    size = list3.size();
                    if (size != 0) {
                        iZzl = zzoy.zzf(list3);
                        iZzA4 = zzln.zzA(i16 << 3);
                        iZzA5 = (iZzA4 * size) + iZzl;
                        iA += iZzA5;
                        i14 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    }
                    iA += iZzA5;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 23:
                    iZzd2 = zzoy.zzd(i16, (List) unsafe.getObject(obj2, j10), false);
                    iA += iZzd2;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 24:
                    z10 = false;
                    iZzb = zzoy.zzb(i16, (List) unsafe.getObject(obj2, j10), false);
                    iA += iZzb;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 25:
                    List list4 = (List) unsafe.getObject(obj2, j10);
                    int i25 = zzoy.zza;
                    int size4 = list4.size();
                    iZzd2 = size4 == 0 ? 0 : size4 * (zzln.zzA(i16 << 3) + 1);
                    iA += iZzd2;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 26:
                    List list5 = (List) unsafe.getObject(obj2, j10);
                    int i26 = zzoy.zza;
                    int size5 = list5.size();
                    if (size5 == 0) {
                        iZzz = 0;
                    } else {
                        int iZzA13 = zzln.zzA(i16 << 3) * size5;
                        if (list5 instanceof zznu) {
                            zznu zznuVar = (zznu) list5;
                            iZzz = iZzA13;
                            for (int i27 = 0; i27 < size5; i27++) {
                                Object objZzc = zznuVar.zzc();
                                if (objZzc instanceof zzle) {
                                    int iZzd3 = ((zzle) objZzc).zzd();
                                    iZzz = e.a(iZzd3, iZzd3, iZzz);
                                } else {
                                    iZzz = zzln.zzz((String) objZzc) + iZzz;
                                }
                            }
                        } else {
                            iZzz = iZzA13;
                            for (int i28 = 0; i28 < size5; i28++) {
                                Object obj3 = list5.get(i28);
                                if (obj3 instanceof zzle) {
                                    int iZzd4 = ((zzle) obj3).zzd();
                                    iZzz = e.a(iZzd4, iZzd4, iZzz);
                                } else {
                                    iZzz = zzln.zzz((String) obj3) + iZzz;
                                }
                            }
                        }
                    }
                    iA += iZzz;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 27:
                    List list6 = (List) unsafe.getObject(obj2, j10);
                    zzow zzowVarZzx = zzolVar.zzx(i14);
                    int i29 = zzoy.zza;
                    int size6 = list6.size();
                    if (size6 == 0) {
                        iZzA6 = 0;
                    } else {
                        iZzA6 = zzln.zzA(i16 << 3) * size6;
                        for (int i30 = 0; i30 < size6; i30++) {
                            Object obj4 = list6.get(i30);
                            if (obj4 instanceof zznt) {
                                int iZza = ((zznt) obj4).zza();
                                iZzA6 = e.a(iZza, iZza, iZzA6);
                            } else {
                                iZzA6 = zzln.zzy((zzoi) obj4, zzowVarZzx) + iZzA6;
                            }
                        }
                    }
                    iA += iZzA6;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 28:
                    List list7 = (List) unsafe.getObject(obj2, j10);
                    int i31 = zzoy.zza;
                    int size7 = list7.size();
                    if (size7 == 0) {
                        iZzA7 = 0;
                    } else {
                        iZzA7 = zzln.zzA(i16 << 3) * size7;
                        for (int i32 = 0; i32 < list7.size(); i32++) {
                            int iZzd5 = ((zzle) list7.get(i32)).zzd();
                            iZzA7 = e.a(iZzd5, iZzd5, iZzA7);
                        }
                    }
                    iA += iZzA7;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 29:
                    List list8 = (List) unsafe.getObject(obj2, j10);
                    int i33 = zzoy.zza;
                    size2 = list8.size();
                    if (size2 != 0) {
                        iZzk = zzoy.zzk(list8);
                        iZzA8 = zzln.zzA(i16 << 3);
                        iZzd2 = iZzk + (iZzA8 * size2);
                        iA += iZzd2;
                        i14 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    }
                    iA += iZzd2;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 30:
                    List list9 = (List) unsafe.getObject(obj2, j10);
                    int i34 = zzoy.zza;
                    size2 = list9.size();
                    if (size2 != 0) {
                        iZzk = zzoy.zza(list9);
                        iZzA8 = zzln.zzA(i16 << 3);
                        iZzd2 = iZzk + (iZzA8 * size2);
                        iA += iZzd2;
                        i14 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    }
                    iA += iZzd2;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 31:
                    iZzd2 = zzoy.zzb(i16, (List) unsafe.getObject(obj2, j10), false);
                    iA += iZzd2;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 32:
                    z10 = false;
                    iZzb = zzoy.zzd(i16, (List) unsafe.getObject(obj2, j10), false);
                    iA += iZzb;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 33:
                    List list10 = (List) unsafe.getObject(obj2, j10);
                    int i35 = zzoy.zza;
                    size3 = list10.size();
                    if (size3 != 0) {
                        iZzi = zzoy.zzi(list10);
                        iZzA9 = zzln.zzA(i16 << 3);
                        i11 = (iZzA9 * size3) + iZzi;
                        iA += i11;
                        i14 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    }
                    i11 = 0;
                    iA += i11;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 34:
                    List list11 = (List) unsafe.getObject(obj2, j10);
                    int i36 = zzoy.zza;
                    size3 = list11.size();
                    if (size3 != 0) {
                        iZzi = zzoy.zzj(list11);
                        iZzA9 = zzln.zzA(i16 << 3);
                        i11 = (iZzA9 * size3) + iZzi;
                        iA += i11;
                        i14 += 3;
                        obj2 = obj;
                        i12 = 1048575;
                    }
                    i11 = 0;
                    iA += i11;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 35:
                    iZze = zzoy.zze((List) unsafe.getObject(obj2, j10));
                    if (iZze > 0) {
                        iZzA10 = zzln.zzA(i16 << 3);
                        iZzA11 = zzln.zzA(iZze);
                        iA += iZzA11 + iZzA10 + iZze;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 36:
                    iZze = zzoy.zzc((List) unsafe.getObject(obj2, j10));
                    if (iZze > 0) {
                        iZzA10 = zzln.zzA(i16 << 3);
                        iZzA11 = zzln.zzA(iZze);
                        iA += iZzA11 + iZzA10 + iZze;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 37:
                    iZze = zzoy.zzg((List) unsafe.getObject(obj2, j10));
                    if (iZze > 0) {
                        iZzA10 = zzln.zzA(i16 << 3);
                        iZzA11 = zzln.zzA(iZze);
                        iA += iZzA11 + iZzA10 + iZze;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 38:
                    iZze = zzoy.zzl((List) unsafe.getObject(obj2, j10));
                    if (iZze > 0) {
                        iZzA10 = zzln.zzA(i16 << 3);
                        iZzA11 = zzln.zzA(iZze);
                        iA += iZzA11 + iZzA10 + iZze;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 39:
                    iZze = zzoy.zzf((List) unsafe.getObject(obj2, j10));
                    if (iZze > 0) {
                        iZzA10 = zzln.zzA(i16 << 3);
                        iZzA11 = zzln.zzA(iZze);
                        iA += iZzA11 + iZzA10 + iZze;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 40:
                    iZze = zzoy.zze((List) unsafe.getObject(obj2, j10));
                    if (iZze > 0) {
                        iZzA10 = zzln.zzA(i16 << 3);
                        iZzA11 = zzln.zzA(iZze);
                        iA += iZzA11 + iZzA10 + iZze;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 41:
                    iZze = zzoy.zzc((List) unsafe.getObject(obj2, j10));
                    if (iZze > 0) {
                        iZzA10 = zzln.zzA(i16 << 3);
                        iZzA11 = zzln.zzA(iZze);
                        iA += iZzA11 + iZzA10 + iZze;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 42:
                    List list12 = (List) unsafe.getObject(obj2, j10);
                    int i37 = zzoy.zza;
                    iZze = list12.size();
                    if (iZze > 0) {
                        iZzA10 = zzln.zzA(i16 << 3);
                        iZzA11 = zzln.zzA(iZze);
                        iA += iZzA11 + iZzA10 + iZze;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case EACTags.DATE_OF_BIRTH /* 43 */:
                    iZze = zzoy.zzk((List) unsafe.getObject(obj2, j10));
                    if (iZze > 0) {
                        iZzA10 = zzln.zzA(i16 << 3);
                        iZzA11 = zzln.zzA(iZze);
                        iA += iZzA11 + iZzA10 + iZze;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 44:
                    iZze = zzoy.zza((List) unsafe.getObject(obj2, j10));
                    if (iZze > 0) {
                        iZzA10 = zzln.zzA(i16 << 3);
                        iZzA11 = zzln.zzA(iZze);
                        iA += iZzA11 + iZzA10 + iZze;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 45:
                    iZze = zzoy.zzc((List) unsafe.getObject(obj2, j10));
                    if (iZze > 0) {
                        iZzA10 = zzln.zzA(i16 << 3);
                        iZzA11 = zzln.zzA(iZze);
                        iA += iZzA11 + iZzA10 + iZze;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 46:
                    iZze = zzoy.zze((List) unsafe.getObject(obj2, j10));
                    if (iZze > 0) {
                        iZzA10 = zzln.zzA(i16 << 3);
                        iZzA11 = zzln.zzA(iZze);
                        iA += iZzA11 + iZzA10 + iZze;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case EACTags.PIN_USAGE_POLICY /* 47 */:
                    iZze = zzoy.zzi((List) unsafe.getObject(obj2, j10));
                    if (iZze > 0) {
                        iZzA10 = zzln.zzA(i16 << 3);
                        iZzA11 = zzln.zzA(iZze);
                        iA += iZzA11 + iZzA10 + iZze;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 48:
                    iZze = zzoy.zzj((List) unsafe.getObject(obj2, j10));
                    if (iZze > 0) {
                        iZzA10 = zzln.zzA(i16 << 3);
                        iZzA11 = zzln.zzA(iZze);
                        iA += iZzA11 + iZzA10 + iZze;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 49:
                    List list13 = (List) unsafe.getObject(obj2, j10);
                    zzow zzowVarZzx2 = zzolVar.zzx(i14);
                    int i38 = zzoy.zza;
                    int size8 = list13.size();
                    if (size8 == 0) {
                        i11 = 0;
                    } else {
                        int iZzw = 0;
                        for (int i39 = 0; i39 < size8; i39++) {
                            iZzw += zzln.zzw(i16, (zzoi) list13.get(i39), zzowVarZzx2);
                        }
                        i11 = iZzw;
                    }
                    iA += i11;
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 50:
                    zzoc zzocVar = (zzoc) unsafe.getObject(obj2, j10);
                    if (!zzocVar.isEmpty()) {
                        Iterator it = zzocVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case EACTags.TRANSACTION_DATE /* 51 */:
                    if (zzolVar.zzR(obj2, i16, i14)) {
                        iA = e.a(i16 << 3, 8, iA);
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 52:
                    if (zzolVar.zzR(obj2, i16, i14)) {
                        iA = e.a(i16 << 3, 4, iA);
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case EACTags.SEX /* 53 */:
                    if (zzolVar.zzR(obj2, i16, i14)) {
                        long jZzv = zzv(obj2, j10);
                        iZzA12 = zzln.zzA(i16 << 3);
                        iZzB2 = zzln.zzB(jZzv);
                        iA += iZzB2 + iZzA12;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case EACTags.CURRENCY_EXPONENT /* 54 */:
                    if (zzolVar.zzR(obj2, i16, i14)) {
                        long jZzv2 = zzv(obj2, j10);
                        iZzA12 = zzln.zzA(i16 << 3);
                        iZzB2 = zzln.zzB(jZzv2);
                        iA += iZzB2 + iZzA12;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 55:
                    if (zzolVar.zzR(obj2, i16, i14)) {
                        long jZzp = zzp(obj2, j10);
                        iZzA12 = zzln.zzA(i16 << 3);
                        iZzB2 = zzln.zzB(jZzp);
                        iA += iZzB2 + iZzA12;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 56:
                    if (zzolVar.zzR(obj2, i16, i14)) {
                        iA = e.a(i16 << 3, 8, iA);
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 57:
                    if (zzolVar.zzR(obj2, i16, i14)) {
                        iA = e.a(i16 << 3, 4, iA);
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    if (zzolVar.zzR(obj2, i16, i14)) {
                        iA = e.a(i16 << 3, 1, iA);
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (zzolVar.zzR(obj2, i16, i14)) {
                        int i40 = i16 << 3;
                        Object object2 = unsafe.getObject(obj2, j10);
                        if (object2 instanceof zzle) {
                            iZze = zzln.zzA(i40);
                            iZzA10 = ((zzle) object2).zzd();
                            iZzA11 = zzln.zzA(iZzA10);
                            iA += iZzA11 + iZzA10 + iZze;
                        } else {
                            iZzA12 = zzln.zzA(i40);
                            iZzB2 = zzln.zzz((String) object2);
                            iA += iZzB2 + iZzA12;
                        }
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 60:
                    if (zzolVar.zzR(obj2, i16, i14)) {
                        iZzd2 = zzoy.zzh(i16, unsafe.getObject(obj2, j10), zzolVar.zzx(i14));
                        iA += iZzd2;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 61:
                    if (zzolVar.zzR(obj2, i16, i14)) {
                        zzle zzleVar2 = (zzle) unsafe.getObject(obj2, j10);
                        iZze = zzln.zzA(i16 << 3);
                        iZzA10 = zzleVar2.zzd();
                        iZzA11 = zzln.zzA(iZzA10);
                        iA += iZzA11 + iZzA10 + iZze;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 62:
                    if (zzolVar.zzR(obj2, i16, i14)) {
                        iA = e.a(zzp(obj2, j10), zzln.zzA(i16 << 3), iA);
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 63:
                    if (zzolVar.zzR(obj2, i16, i14)) {
                        long jZzp2 = zzp(obj2, j10);
                        iZzA12 = zzln.zzA(i16 << 3);
                        iZzB2 = zzln.zzB(jZzp2);
                        iA += iZzB2 + iZzA12;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 64:
                    if (zzolVar.zzR(obj2, i16, i14)) {
                        iA = e.a(i16 << 3, 4, iA);
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case EACTags.ELEMENT_LIST /* 65 */:
                    if (zzolVar.zzR(obj2, i16, i14)) {
                        iA = e.a(i16 << 3, 8, iA);
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case EACTags.ADDRESS /* 66 */:
                    if (zzolVar.zzR(obj2, i16, i14)) {
                        int iZzp = zzp(obj2, j10);
                        iA = e.a((iZzp >> 31) ^ (iZzp + iZzp), zzln.zzA(i16 << 3), iA);
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (zzolVar.zzR(obj2, i16, i14)) {
                        long jZzv3 = zzv(obj2, j10);
                        iZzA12 = zzln.zzA(i16 << 3);
                        iZzB2 = zzln.zzB((jZzv3 >> 63) ^ (jZzv3 + jZzv3));
                        iA += iZzB2 + iZzA12;
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                case 68:
                    if (zzolVar.zzR(obj2, i16, i14)) {
                        iA += zzln.zzw(i16, (zzoi) unsafe.getObject(obj2, j10), zzolVar.zzx(i14));
                    }
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
                default:
                    i14 += 3;
                    obj2 = obj;
                    i12 = 1048575;
            }
        }
        int iZza2 = 0;
        int iZza3 = ((zznd) obj).zzc.zza() + iA;
        if (!zzolVar.zzh) {
            return iZza3;
        }
        zzmt zzmtVar = ((zzna) obj).zzb;
        int iZzc = zzmtVar.zza.zzc();
        for (int i41 = 0; i41 < iZzc; i41++) {
            Map.Entry entryZzg = zzmtVar.zza.zzg(i41);
            iZza2 += zzmt.zza((zzms) ((zzpa) entryZzg).zza(), entryZzg.getValue());
        }
        for (Map.Entry entry2 : zzmtVar.zza.zzd()) {
            iZza2 += zzmt.zza((zzms) entry2.getKey(), entry2.getValue());
        }
        return iZza3 + iZza2;
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final int zzb(Object obj) {
        int i10;
        long jDoubleToLongBits;
        int i11;
        int iFloatToIntBits;
        int iZzc;
        int i12;
        int i13 = 0;
        for (int i14 = 0; i14 < this.zzc.length; i14 += 3) {
            int iZzu = zzu(i14);
            int[] iArr = this.zzc;
            int i15 = 1048575 & iZzu;
            int iZzt = zzt(iZzu);
            int i16 = iArr[i14];
            long j10 = i15;
            int iHashCode = 37;
            switch (iZzt) {
                case 0:
                    i10 = i13 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzps.zza(obj, j10));
                    byte[] bArr = zznl.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iZzc;
                    break;
                case 1:
                    i11 = i13 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzps.zzb(obj, j10));
                    i13 = iFloatToIntBits + i11;
                    break;
                case 2:
                    i10 = i13 * 53;
                    jDoubleToLongBits = zzps.zzd(obj, j10);
                    byte[] bArr2 = zznl.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iZzc;
                    break;
                case 3:
                    i10 = i13 * 53;
                    jDoubleToLongBits = zzps.zzd(obj, j10);
                    byte[] bArr3 = zznl.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iZzc;
                    break;
                case 4:
                    i10 = i13 * 53;
                    iZzc = zzps.zzc(obj, j10);
                    i13 = i10 + iZzc;
                    break;
                case 5:
                    i10 = i13 * 53;
                    jDoubleToLongBits = zzps.zzd(obj, j10);
                    byte[] bArr4 = zznl.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iZzc;
                    break;
                case 6:
                    i10 = i13 * 53;
                    iZzc = zzps.zzc(obj, j10);
                    i13 = i10 + iZzc;
                    break;
                case 7:
                    i11 = i13 * 53;
                    iFloatToIntBits = zznl.zza(zzps.zzw(obj, j10));
                    i13 = iFloatToIntBits + i11;
                    break;
                case 8:
                    i11 = i13 * 53;
                    iFloatToIntBits = ((String) zzps.zzf(obj, j10)).hashCode();
                    i13 = iFloatToIntBits + i11;
                    break;
                case 9:
                    i12 = i13 * 53;
                    Object objZzf = zzps.zzf(obj, j10);
                    if (objZzf != null) {
                        iHashCode = objZzf.hashCode();
                    }
                    i13 = i12 + iHashCode;
                    break;
                case 10:
                    i11 = i13 * 53;
                    iFloatToIntBits = zzps.zzf(obj, j10).hashCode();
                    i13 = iFloatToIntBits + i11;
                    break;
                case 11:
                    i10 = i13 * 53;
                    iZzc = zzps.zzc(obj, j10);
                    i13 = i10 + iZzc;
                    break;
                case 12:
                    i10 = i13 * 53;
                    iZzc = zzps.zzc(obj, j10);
                    i13 = i10 + iZzc;
                    break;
                case 13:
                    i10 = i13 * 53;
                    iZzc = zzps.zzc(obj, j10);
                    i13 = i10 + iZzc;
                    break;
                case 14:
                    i10 = i13 * 53;
                    jDoubleToLongBits = zzps.zzd(obj, j10);
                    byte[] bArr5 = zznl.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iZzc;
                    break;
                case 15:
                    i10 = i13 * 53;
                    iZzc = zzps.zzc(obj, j10);
                    i13 = i10 + iZzc;
                    break;
                case 16:
                    i10 = i13 * 53;
                    jDoubleToLongBits = zzps.zzd(obj, j10);
                    byte[] bArr6 = zznl.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iZzc;
                    break;
                case 17:
                    i12 = i13 * 53;
                    Object objZzf2 = zzps.zzf(obj, j10);
                    if (objZzf2 != null) {
                        iHashCode = objZzf2.hashCode();
                    }
                    i13 = i12 + iHashCode;
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
                    i11 = i13 * 53;
                    iFloatToIntBits = zzps.zzf(obj, j10).hashCode();
                    i13 = iFloatToIntBits + i11;
                    break;
                case 50:
                    i11 = i13 * 53;
                    iFloatToIntBits = zzps.zzf(obj, j10).hashCode();
                    i13 = iFloatToIntBits + i11;
                    break;
                case EACTags.TRANSACTION_DATE /* 51 */:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzn(obj, j10));
                        byte[] bArr7 = zznl.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzR(obj, i16, i14)) {
                        i11 = i13 * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzo(obj, j10));
                        i13 = iFloatToIntBits + i11;
                        break;
                    } else {
                        break;
                    }
                case EACTags.SEX /* 53 */:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = zzv(obj, j10);
                        byte[] bArr8 = zznl.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case EACTags.CURRENCY_EXPONENT /* 54 */:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = zzv(obj, j10);
                        byte[] bArr9 = zznl.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        iZzc = zzp(obj, j10);
                        i13 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = zzv(obj, j10);
                        byte[] bArr10 = zznl.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        iZzc = zzp(obj, j10);
                        i13 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    if (zzR(obj, i16, i14)) {
                        i11 = i13 * 53;
                        iFloatToIntBits = zznl.zza(zzS(obj, j10));
                        i13 = iFloatToIntBits + i11;
                        break;
                    } else {
                        break;
                    }
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (zzR(obj, i16, i14)) {
                        i11 = i13 * 53;
                        iFloatToIntBits = ((String) zzps.zzf(obj, j10)).hashCode();
                        i13 = iFloatToIntBits + i11;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzR(obj, i16, i14)) {
                        i11 = i13 * 53;
                        iFloatToIntBits = zzps.zzf(obj, j10).hashCode();
                        i13 = iFloatToIntBits + i11;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzR(obj, i16, i14)) {
                        i11 = i13 * 53;
                        iFloatToIntBits = zzps.zzf(obj, j10).hashCode();
                        i13 = iFloatToIntBits + i11;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        iZzc = zzp(obj, j10);
                        i13 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        iZzc = zzp(obj, j10);
                        i13 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        iZzc = zzp(obj, j10);
                        i13 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case EACTags.ELEMENT_LIST /* 65 */:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = zzv(obj, j10);
                        byte[] bArr11 = zznl.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case EACTags.ADDRESS /* 66 */:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        iZzc = zzp(obj, j10);
                        i13 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = zzv(obj, j10);
                        byte[] bArr12 = zznl.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzR(obj, i16, i14)) {
                        i11 = i13 * 53;
                        iFloatToIntBits = zzps.zzf(obj, j10).hashCode();
                        i13 = iFloatToIntBits + i11;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = ((zznd) obj).zzc.hashCode() + (i13 * 53);
        return this.zzh ? (iHashCode2 * 53) + ((zzna) obj).zzb.zza.hashCode() : iHashCode2;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final int zzc(java.lang.Object r31, byte[] r32, int r33, int r34, int r35, com.google.android.recaptcha.internal.zzkt r36) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3852
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzol.zzc(java.lang.Object, byte[], int, int, int, com.google.android.recaptcha.internal.zzkt):int");
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final Object zze() {
        return ((zznd) this.zzg).zzv();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    @Override // com.google.android.recaptcha.internal.zzow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzf(Object obj) {
        if (zzQ(obj)) {
            if (obj instanceof zznd) {
                zznd zzndVar = (zznd) obj;
                zzndVar.zzJ(Integer.MAX_VALUE);
                zzndVar.zza = 0;
                zzndVar.zzH();
            }
            int[] iArr = this.zzc;
            for (int i10 = 0; i10 < iArr.length; i10 += 3) {
                int iZzu = zzu(i10);
                int i11 = 1048575 & iZzu;
                int iZzt = zzt(iZzu);
                long j10 = i11;
                if (iZzt != 9) {
                    if (iZzt != 60 && iZzt != 68) {
                        switch (iZzt) {
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
                                ((zznk) zzps.zzf(obj, j10)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j10);
                                if (object != null) {
                                    ((zzoc) object).zzc();
                                    unsafe.putObject(obj, j10, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzR(obj, this.zzc[i10], i10)) {
                        zzx(i10).zzf(zzb.getObject(obj, j10));
                    }
                } else if (zzN(obj, i10)) {
                    zzx(i10).zzf(zzb.getObject(obj, j10));
                }
            }
            this.zzm.zzi(obj);
            if (this.zzh) {
                this.zzn.zza(obj);
            }
        }
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzg(Object obj, Object obj2) {
        zzD(obj);
        obj2.getClass();
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int iZzu = zzu(i10);
            int i11 = 1048575 & iZzu;
            int[] iArr = this.zzc;
            int iZzt = zzt(iZzu);
            int i12 = iArr[i10];
            long j10 = i11;
            switch (iZzt) {
                case 0:
                    if (zzN(obj2, i10)) {
                        zzps.zzo(obj, j10, zzps.zza(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzN(obj2, i10)) {
                        zzps.zzp(obj, j10, zzps.zzb(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzN(obj2, i10)) {
                        zzps.zzr(obj, j10, zzps.zzd(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzN(obj2, i10)) {
                        zzps.zzr(obj, j10, zzps.zzd(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzN(obj2, i10)) {
                        zzps.zzq(obj, j10, zzps.zzc(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzN(obj2, i10)) {
                        zzps.zzr(obj, j10, zzps.zzd(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzN(obj2, i10)) {
                        zzps.zzq(obj, j10, zzps.zzc(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzN(obj2, i10)) {
                        zzps.zzm(obj, j10, zzps.zzw(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzN(obj2, i10)) {
                        zzps.zzs(obj, j10, zzps.zzf(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzE(obj, obj2, i10);
                    break;
                case 10:
                    if (zzN(obj2, i10)) {
                        zzps.zzs(obj, j10, zzps.zzf(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzN(obj2, i10)) {
                        zzps.zzq(obj, j10, zzps.zzc(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzN(obj2, i10)) {
                        zzps.zzq(obj, j10, zzps.zzc(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzN(obj2, i10)) {
                        zzps.zzq(obj, j10, zzps.zzc(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzN(obj2, i10)) {
                        zzps.zzr(obj, j10, zzps.zzd(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzN(obj2, i10)) {
                        zzps.zzq(obj, j10, zzps.zzc(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzN(obj2, i10)) {
                        zzps.zzr(obj, j10, zzps.zzd(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzE(obj, obj2, i10);
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
                    zznk zznkVarZzd = (zznk) zzps.zzf(obj, j10);
                    zznk zznkVar = (zznk) zzps.zzf(obj2, j10);
                    int size = zznkVarZzd.size();
                    int size2 = zznkVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!zznkVarZzd.zzc()) {
                            zznkVarZzd = zznkVarZzd.zzd(size2 + size);
                        }
                        zznkVarZzd.addAll(zznkVar);
                    }
                    if (size > 0) {
                        zznkVar = zznkVarZzd;
                    }
                    zzps.zzs(obj, j10, zznkVar);
                    break;
                case 50:
                    int i13 = zzoy.zza;
                    zzps.zzs(obj, j10, zzod.zzb(zzps.zzf(obj, j10), zzps.zzf(obj2, j10)));
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
                    if (zzR(obj2, i12, i10)) {
                        zzps.zzs(obj, j10, zzps.zzf(obj2, j10));
                        zzI(obj, i12, i10);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzF(obj, obj2, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case EACTags.ELEMENT_LIST /* 65 */:
                case EACTags.ADDRESS /* 66 */:
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (zzR(obj2, i12, i10)) {
                        zzps.zzs(obj, j10, zzps.zzf(obj2, j10));
                        zzI(obj, i12, i10);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzF(obj, obj2, i10);
                    break;
            }
        }
        zzoy.zzq(this.zzm, obj, obj2);
        if (this.zzh) {
            zzoy.zzp(this.zzn, obj, obj2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x01bd, code lost:
    
        r2 = r3;
        r5 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:245:0x073f  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0750 A[LOOP:3: B:251:0x074c->B:253:0x0750, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x075f  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x071d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:361:0x072b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:370:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:371:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016f A[Catch: all -> 0x0054, TryCatch #11 {all -> 0x0054, blocks: (B:20:0x004b, B:24:0x005c, B:26:0x0064, B:27:0x0068, B:60:0x015e, B:68:0x0189, B:65:0x016f, B:67:0x0177, B:29:0x006e, B:30:0x0078, B:31:0x0082, B:32:0x008c, B:33:0x0096, B:34:0x009d, B:35:0x009e, B:36:0x00a8, B:37:0x00ae, B:39:0x00b8, B:41:0x00cd, B:42:0x00da, B:43:0x00df, B:44:0x00e0, B:46:0x00ea, B:48:0x00ff, B:49:0x010c, B:50:0x0111, B:51:0x0112, B:52:0x0117, B:53:0x0120, B:54:0x0129, B:55:0x0132, B:56:0x013b, B:57:0x0144, B:58:0x014d, B:59:0x0156, B:71:0x0192, B:72:0x0195, B:74:0x0198), top: B:269:0x004b }] */
    @Override // com.google.android.recaptcha.internal.zzow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzh(Object obj, zzov zzovVar, zzmo zzmoVar) throws Throwable {
        Object obj2;
        Object obj3;
        zzol<T> zzolVar;
        Throwable th2;
        int i10;
        zzpl zzplVar;
        Object obj4;
        Object obj5;
        Object objValueOf;
        int iOrdinal;
        Object objZze;
        zzmoVar.getClass();
        zzD(obj);
        zzpl zzplVar2 = this.zzm;
        Object objZza = null;
        zzmt zzmtVarZzi = null;
        while (true) {
            try {
                int iZzc = zzovVar.zzc();
                int iZzq = zzq(iZzc);
                if (iZzq >= 0) {
                    obj5 = obj;
                    zzplVar = zzplVar2;
                    zzolVar = this;
                    obj4 = objZza;
                    try {
                        int iZzu = zzu(iZzq);
                        try {
                        } catch (zznm unused) {
                            obj2 = obj5;
                        }
                        switch (zzt(iZzu)) {
                            case 0:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzps.zzo(obj2, iZzu & 1048575, zzovVar.zza());
                                zzH(obj2, iZzq);
                                objZza = obj3;
                                obj = obj2;
                            case 1:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzps.zzp(obj2, iZzu & 1048575, zzovVar.zzb());
                                zzH(obj2, iZzq);
                                objZza = obj3;
                                obj = obj2;
                            case 2:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzps.zzr(obj2, iZzu & 1048575, zzovVar.zzl());
                                zzH(obj2, iZzq);
                                objZza = obj3;
                                obj = obj2;
                            case 3:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzps.zzr(obj2, iZzu & 1048575, zzovVar.zzo());
                                zzH(obj2, iZzq);
                                objZza = obj3;
                                obj = obj2;
                            case 4:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzps.zzq(obj2, iZzu & 1048575, zzovVar.zzg());
                                zzH(obj2, iZzq);
                                objZza = obj3;
                                obj = obj2;
                            case 5:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzps.zzr(obj2, iZzu & 1048575, zzovVar.zzk());
                                zzH(obj2, iZzq);
                                objZza = obj3;
                                obj = obj2;
                            case 6:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzps.zzq(obj2, iZzu & 1048575, zzovVar.zzf());
                                zzH(obj2, iZzq);
                                objZza = obj3;
                                obj = obj2;
                            case 7:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzps.zzm(obj2, iZzu & 1048575, zzovVar.zzN());
                                zzH(obj2, iZzq);
                                objZza = obj3;
                                obj = obj2;
                            case 8:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzG(obj2, iZzu, zzovVar);
                                zzH(obj2, iZzq);
                                objZza = obj3;
                                obj = obj2;
                            case 9:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzoi zzoiVar = (zzoi) zzA(obj2, iZzq);
                                zzovVar.zzu(zzoiVar, zzx(iZzq), zzmoVar);
                                zzJ(obj2, iZzq, zzoiVar);
                                objZza = obj3;
                                obj = obj2;
                            case 10:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzps.zzs(obj2, iZzu & 1048575, zzovVar.zzp());
                                zzH(obj2, iZzq);
                                objZza = obj3;
                                obj = obj2;
                            case 11:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzps.zzq(obj2, iZzu & 1048575, zzovVar.zzj());
                                zzH(obj2, iZzq);
                                objZza = obj3;
                                obj = obj2;
                            case 12:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                int iZze = zzovVar.zze();
                                zznh zznhVarZzw = zzw(iZzq);
                                if (zznhVarZzw != null && !zznhVarZzw.zza(iZze)) {
                                    objZza = zzoy.zzo(obj2, iZzc, iZze, obj3, zzplVar2);
                                    obj = obj2;
                                }
                                zzps.zzq(obj2, iZzu & 1048575, iZze);
                                zzH(obj2, iZzq);
                                objZza = obj3;
                                obj = obj2;
                                break;
                            case 13:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzps.zzq(obj2, iZzu & 1048575, zzovVar.zzh());
                                zzH(obj2, iZzq);
                                objZza = obj3;
                                obj = obj2;
                            case 14:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzps.zzr(obj2, iZzu & 1048575, zzovVar.zzm());
                                zzH(obj2, iZzq);
                                objZza = obj3;
                                obj = obj2;
                            case 15:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzps.zzq(obj2, iZzu & 1048575, zzovVar.zzi());
                                zzH(obj2, iZzq);
                                objZza = obj3;
                                obj = obj2;
                            case 16:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzps.zzr(obj2, iZzu & 1048575, zzovVar.zzn());
                                zzH(obj2, iZzq);
                                objZza = obj3;
                                obj = obj2;
                            case 17:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzoi zzoiVar2 = (zzoi) zzA(obj2, iZzq);
                                zzovVar.zzt(zzoiVar2, zzx(iZzq), zzmoVar);
                                zzJ(obj2, iZzq, zzoiVar2);
                                objZza = obj3;
                                obj = obj2;
                            case 18:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzx(zznv.zza(obj2, iZzu & 1048575));
                                objZza = obj3;
                                obj = obj2;
                            case 19:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzB(zznv.zza(obj2, iZzu & 1048575));
                                objZza = obj3;
                                obj = obj2;
                            case 20:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzE(zznv.zza(obj2, iZzu & 1048575));
                                objZza = obj3;
                                obj = obj2;
                            case 21:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzM(zznv.zza(obj2, iZzu & 1048575));
                                objZza = obj3;
                                obj = obj2;
                            case 22:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzD(zznv.zza(obj2, iZzu & 1048575));
                                objZza = obj3;
                                obj = obj2;
                            case 23:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzA(zznv.zza(obj2, iZzu & 1048575));
                                objZza = obj3;
                                obj = obj2;
                            case 24:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzz(zznv.zza(obj2, iZzu & 1048575));
                                objZza = obj3;
                                obj = obj2;
                            case 25:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzv(zznv.zza(obj2, iZzu & 1048575));
                                objZza = obj3;
                                obj = obj2;
                            case 26:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                if (zzM(iZzu)) {
                                    ((zzlj) zzovVar).zzK(zznv.zza(obj2, iZzu & 1048575), true);
                                } else {
                                    ((zzlj) zzovVar).zzK(zznv.zza(obj2, iZzu & 1048575), false);
                                }
                                objZza = obj3;
                                obj = obj2;
                            case 27:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzF(zznv.zza(obj2, iZzu & 1048575), zzx(iZzq), zzmoVar);
                                objZza = obj3;
                                obj = obj2;
                            case 28:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzw(zznv.zza(obj2, iZzu & 1048575));
                                objZza = obj3;
                                obj = obj2;
                            case 29:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzL(zznv.zza(obj2, iZzu & 1048575));
                                objZza = obj3;
                                obj = obj2;
                            case 30:
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                try {
                                    List listZza = zznv.zza(obj5, iZzu & 1048575);
                                    zzovVar.zzy(listZza);
                                    objZza = zzoy.zzn(obj5, iZzc, listZza, zzw(iZzq), obj3, zzplVar2);
                                    obj2 = obj5;
                                    zzplVar2 = zzplVar2;
                                } catch (zznm unused2) {
                                    obj2 = obj5;
                                    objZza = obj3;
                                    if (objZza == null) {
                                    }
                                    if (!zzplVar2.zzk(objZza, zzovVar, 0)) {
                                    }
                                    obj = obj2;
                                } catch (Throwable th3) {
                                    th = th3;
                                    obj2 = obj5;
                                    th2 = th;
                                    objZza = obj3;
                                    i10 = zzolVar.zzk;
                                    while (i10 < zzolVar.zzl) {
                                    }
                                    if (objZza == null) {
                                    }
                                }
                                obj = obj2;
                                break;
                            case 31:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzG(zznv.zza(obj2, iZzu & 1048575));
                                objZza = obj3;
                                obj = obj2;
                            case 32:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzH(zznv.zza(obj2, iZzu & 1048575));
                                objZza = obj3;
                                obj = obj2;
                            case 33:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzI(zznv.zza(obj2, iZzu & 1048575));
                                objZza = obj3;
                                obj = obj2;
                            case 34:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzJ(zznv.zza(obj2, iZzu & 1048575));
                                objZza = obj3;
                                obj = obj2;
                            case 35:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzx(zznv.zza(obj2, iZzu & 1048575));
                                objZza = obj3;
                                obj = obj2;
                            case 36:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzB(zznv.zza(obj2, iZzu & 1048575));
                                objZza = obj3;
                                obj = obj2;
                            case 37:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzE(zznv.zza(obj2, iZzu & 1048575));
                                objZza = obj3;
                                obj = obj2;
                            case 38:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzM(zznv.zza(obj2, iZzu & 1048575));
                                objZza = obj3;
                                obj = obj2;
                            case 39:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzD(zznv.zza(obj2, iZzu & 1048575));
                                objZza = obj3;
                                obj = obj2;
                            case 40:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzA(zznv.zza(obj2, iZzu & 1048575));
                                objZza = obj3;
                                obj = obj2;
                            case 41:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzz(zznv.zza(obj2, iZzu & 1048575));
                                objZza = obj3;
                                obj = obj2;
                            case 42:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzv(zznv.zza(obj2, iZzu & 1048575));
                                objZza = obj3;
                                obj = obj2;
                            case EACTags.DATE_OF_BIRTH /* 43 */:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                try {
                                    zzovVar.zzL(zznv.zza(obj2, iZzu & 1048575));
                                    objZza = obj3;
                                } catch (zznm unused3) {
                                    objZza = obj3;
                                    if (objZza == null) {
                                        try {
                                            objZza = zzplVar2.zza(obj2);
                                        } catch (Throwable th4) {
                                            th2 = th4;
                                        }
                                    }
                                    if (!zzplVar2.zzk(objZza, zzovVar, 0)) {
                                        for (int i11 = zzolVar.zzk; i11 < zzolVar.zzl; i11++) {
                                            zzolVar.zzy(obj2, zzolVar.zzj[i11], objZza, zzplVar2, obj2);
                                        }
                                        if (objZza == null) {
                                        }
                                    }
                                    obj = obj2;
                                } catch (Throwable th5) {
                                    th = th5;
                                    th2 = th;
                                    objZza = obj3;
                                    i10 = zzolVar.zzk;
                                    while (i10 < zzolVar.zzl) {
                                    }
                                    if (objZza == null) {
                                    }
                                }
                                obj = obj2;
                                break;
                            case 44:
                                List listZza2 = zznv.zza(obj5, iZzu & 1048575);
                                zzovVar.zzy(listZza2);
                                try {
                                    objZza = zzoy.zzn(obj5, iZzc, listZza2, zzw(iZzq), obj4, zzplVar);
                                    obj2 = obj5;
                                    zzplVar2 = zzplVar;
                                } catch (zznm unused4) {
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    objZza = obj3;
                                    if (objZza == null) {
                                    }
                                    if (!zzplVar2.zzk(objZza, zzovVar, 0)) {
                                    }
                                    obj = obj2;
                                } catch (Throwable th6) {
                                    th = th6;
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    th2 = th;
                                    objZza = obj3;
                                    i10 = zzolVar.zzk;
                                    while (i10 < zzolVar.zzl) {
                                    }
                                    if (objZza == null) {
                                    }
                                }
                                obj = obj2;
                                break;
                            case 45:
                                zzovVar.zzG(zznv.zza(obj5, iZzu & 1048575));
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                objZza = obj3;
                                obj = obj2;
                            case 46:
                                zzovVar.zzH(zznv.zza(obj5, iZzu & 1048575));
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                objZza = obj3;
                                obj = obj2;
                            case EACTags.PIN_USAGE_POLICY /* 47 */:
                                zzovVar.zzI(zznv.zza(obj5, iZzu & 1048575));
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                objZza = obj3;
                                obj = obj2;
                            case 48:
                                zzovVar.zzJ(zznv.zza(obj5, iZzu & 1048575));
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                objZza = obj3;
                                obj = obj2;
                            case 49:
                                zzovVar.zzC(zznv.zza(obj5, iZzu & 1048575), zzx(iZzq), zzmoVar);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                objZza = obj3;
                                obj = obj2;
                            case 50:
                                Object objZzz = zzz(iZzq);
                                long jZzu = zzu(iZzq) & 1048575;
                                Object objZzf = zzps.zzf(obj5, jZzu);
                                if (objZzf == null) {
                                    objZzf = zzoc.zza().zzb();
                                    zzps.zzs(obj5, jZzu, objZzf);
                                } else if (zzod.zza(objZzf)) {
                                    Object objZzb = zzoc.zza().zzb();
                                    zzod.zzb(objZzb, objZzf);
                                    zzps.zzs(obj5, jZzu, objZzb);
                                    objZzf = objZzb;
                                }
                                throw null;
                                break;
                            case EACTags.TRANSACTION_DATE /* 51 */:
                                zzps.zzs(obj5, iZzu & 1048575, Double.valueOf(zzovVar.zza()));
                                zzI(obj5, iZzc, iZzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                objZza = obj3;
                                obj = obj2;
                            case 52:
                                zzps.zzs(obj5, iZzu & 1048575, Float.valueOf(zzovVar.zzb()));
                                zzI(obj5, iZzc, iZzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                objZza = obj3;
                                obj = obj2;
                            case EACTags.SEX /* 53 */:
                                zzps.zzs(obj5, iZzu & 1048575, Long.valueOf(zzovVar.zzl()));
                                zzI(obj5, iZzc, iZzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                objZza = obj3;
                                obj = obj2;
                            case EACTags.CURRENCY_EXPONENT /* 54 */:
                                zzps.zzs(obj5, iZzu & 1048575, Long.valueOf(zzovVar.zzo()));
                                zzI(obj5, iZzc, iZzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                objZza = obj3;
                                obj = obj2;
                            case 55:
                                zzps.zzs(obj5, iZzu & 1048575, Integer.valueOf(zzovVar.zzg()));
                                zzI(obj5, iZzc, iZzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                objZza = obj3;
                                obj = obj2;
                            case 56:
                                zzps.zzs(obj5, iZzu & 1048575, Long.valueOf(zzovVar.zzk()));
                                zzI(obj5, iZzc, iZzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                objZza = obj3;
                                obj = obj2;
                            case 57:
                                zzps.zzs(obj5, iZzu & 1048575, Integer.valueOf(zzovVar.zzf()));
                                zzI(obj5, iZzc, iZzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                objZza = obj3;
                                obj = obj2;
                            case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                                zzps.zzs(obj5, iZzu & 1048575, Boolean.valueOf(zzovVar.zzN()));
                                zzI(obj5, iZzc, iZzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                objZza = obj3;
                                obj = obj2;
                            case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                                zzG(obj5, iZzu, zzovVar);
                                zzI(obj5, iZzc, iZzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                objZza = obj3;
                                obj = obj2;
                            case 60:
                                zzoi zzoiVar3 = (zzoi) zzB(obj5, iZzc, iZzq);
                                zzovVar.zzu(zzoiVar3, zzx(iZzq), zzmoVar);
                                zzK(obj5, iZzc, iZzq, zzoiVar3);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                objZza = obj3;
                                obj = obj2;
                            case 61:
                                zzps.zzs(obj5, iZzu & 1048575, zzovVar.zzp());
                                zzI(obj5, iZzc, iZzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                objZza = obj3;
                                obj = obj2;
                            case 62:
                                zzps.zzs(obj5, iZzu & 1048575, Integer.valueOf(zzovVar.zzj()));
                                zzI(obj5, iZzc, iZzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                objZza = obj3;
                                obj = obj2;
                            case 63:
                                int iZze2 = zzovVar.zze();
                                zznh zznhVarZzw2 = zzw(iZzq);
                                if (zznhVarZzw2 != null && !zznhVarZzw2.zza(iZze2)) {
                                    objZza = zzoy.zzo(obj5, iZzc, iZze2, obj4, zzplVar);
                                    obj = obj5;
                                    zzplVar2 = zzplVar;
                                }
                                zzps.zzs(obj5, iZzu & 1048575, Integer.valueOf(iZze2));
                                zzI(obj5, iZzc, iZzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                objZza = obj3;
                                obj = obj2;
                                break;
                            case 64:
                                zzps.zzs(obj5, iZzu & 1048575, Integer.valueOf(zzovVar.zzh()));
                                zzI(obj5, iZzc, iZzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                objZza = obj3;
                                obj = obj2;
                            case EACTags.ELEMENT_LIST /* 65 */:
                                zzps.zzs(obj5, iZzu & 1048575, Long.valueOf(zzovVar.zzm()));
                                zzI(obj5, iZzc, iZzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                objZza = obj3;
                                obj = obj2;
                            case EACTags.ADDRESS /* 66 */:
                                zzps.zzs(obj5, iZzu & 1048575, Integer.valueOf(zzovVar.zzi()));
                                zzI(obj5, iZzc, iZzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                objZza = obj3;
                                obj = obj2;
                            case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                                zzps.zzs(obj5, iZzu & 1048575, Long.valueOf(zzovVar.zzn()));
                                zzI(obj5, iZzc, iZzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                objZza = obj3;
                                obj = obj2;
                            case 68:
                                zzoi zzoiVar4 = (zzoi) zzB(obj5, iZzc, iZzq);
                                zzovVar.zzt(zzoiVar4, zzx(iZzq), zzmoVar);
                                zzK(obj5, iZzc, iZzq, zzoiVar4);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                objZza = obj3;
                                obj = obj2;
                            default:
                                if (obj4 == null) {
                                    try {
                                        objZza = zzplVar.zza(obj5);
                                    } catch (Throwable th7) {
                                        th = th7;
                                        th2 = th;
                                        obj2 = obj5;
                                        obj3 = obj4;
                                        zzplVar2 = zzplVar;
                                        objZza = obj3;
                                        i10 = zzolVar.zzk;
                                        while (i10 < zzolVar.zzl) {
                                        }
                                        if (objZza == null) {
                                        }
                                    }
                                } else {
                                    objZza = obj4;
                                }
                                try {
                                    if (!zzplVar.zzk(objZza, zzovVar, 0)) {
                                        for (int i12 = zzolVar.zzk; i12 < zzolVar.zzl; i12++) {
                                            zzpl zzplVar3 = zzplVar;
                                            Object obj6 = obj5;
                                            zzolVar.zzy(obj6, zzolVar.zzj[i12], objZza, zzplVar3, obj5);
                                            obj5 = obj6;
                                            zzplVar = zzplVar3;
                                        }
                                        break;
                                    }
                                    obj = obj5;
                                    zzplVar2 = zzplVar;
                                } catch (zznm unused5) {
                                    obj2 = obj5;
                                    zzplVar2 = zzplVar;
                                    if (objZza == null) {
                                    }
                                    if (!zzplVar2.zzk(objZza, zzovVar, 0)) {
                                    }
                                    obj = obj2;
                                } catch (Throwable th8) {
                                    th = th8;
                                    th2 = th;
                                    obj2 = obj5;
                                    zzplVar2 = zzplVar;
                                    i10 = zzolVar.zzk;
                                    while (i10 < zzolVar.zzl) {
                                    }
                                    if (objZza == null) {
                                    }
                                }
                                break;
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        obj2 = obj5;
                    }
                } else if (iZzc == Integer.MAX_VALUE) {
                    int i13 = this.zzk;
                    while (i13 < this.zzl) {
                        zzy(obj, this.zzj[i13], objZza, zzplVar2, obj);
                        i13++;
                        zzplVar2 = zzplVar2;
                    }
                    obj2 = obj;
                    zzplVar2 = zzplVar2;
                } else {
                    zzplVar = zzplVar2;
                    obj4 = objZza;
                    try {
                        zznc zzncVarZza = !this.zzh ? null : zzmoVar.zza(this.zzg, iZzc);
                        if (zzncVarZza != null) {
                            if (zzmtVarZzi == null) {
                                try {
                                    zzmtVarZzi = ((zzna) obj).zzi();
                                } catch (Throwable th10) {
                                    th2 = th10;
                                    obj2 = obj;
                                    zzolVar = this;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    objZza = obj3;
                                    i10 = zzolVar.zzk;
                                    while (i10 < zzolVar.zzl) {
                                    }
                                    if (objZza == null) {
                                    }
                                }
                            }
                            zznb zznbVar = zzncVarZza.zza;
                            zzpw zzpwVar = zzpw.zzn;
                            zzpw zzpwVar2 = zznbVar.zzb;
                            if (zzpwVar2 == zzpwVar) {
                                zzovVar.zzg();
                                throw null;
                            }
                            switch (zzpwVar2.ordinal()) {
                                case 0:
                                    objValueOf = Double.valueOf(zzovVar.zza());
                                    iOrdinal = zzncVarZza.zza.zzb.ordinal();
                                    if ((iOrdinal != 9 || iOrdinal == 10) && (objZze = zzmtVarZzi.zze(zzncVarZza.zza)) != null) {
                                        byte[] bArr = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                    }
                                    zzmtVarZzi.zzi(zzncVarZza.zza, objValueOf);
                                    objZza = obj4;
                                    zzplVar2 = zzplVar;
                                    break;
                                case 1:
                                    objValueOf = Float.valueOf(zzovVar.zzb());
                                    iOrdinal = zzncVarZza.zza.zzb.ordinal();
                                    if (iOrdinal != 9) {
                                        byte[] bArr2 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                        zzmtVarZzi.zzi(zzncVarZza.zza, objValueOf);
                                        objZza = obj4;
                                        zzplVar2 = zzplVar;
                                        break;
                                    } else {
                                        byte[] bArr22 = zznl.zzb;
                                        objValueOf = ((zzoi) objZze).zzae().zzc((zzoi) objValueOf).zzl();
                                        zzmtVarZzi.zzi(zzncVarZza.zza, objValueOf);
                                        objZza = obj4;
                                        zzplVar2 = zzplVar;
                                    }
                                case 2:
                                    objValueOf = Long.valueOf(zzovVar.zzl());
                                    iOrdinal = zzncVarZza.zza.zzb.ordinal();
                                    if (iOrdinal != 9) {
                                    }
                                    break;
                                case 3:
                                    objValueOf = Long.valueOf(zzovVar.zzo());
                                    iOrdinal = zzncVarZza.zza.zzb.ordinal();
                                    if (iOrdinal != 9) {
                                    }
                                    break;
                                case 4:
                                    objValueOf = Integer.valueOf(zzovVar.zzg());
                                    iOrdinal = zzncVarZza.zza.zzb.ordinal();
                                    if (iOrdinal != 9) {
                                    }
                                    break;
                                case 5:
                                    objValueOf = Long.valueOf(zzovVar.zzk());
                                    iOrdinal = zzncVarZza.zza.zzb.ordinal();
                                    if (iOrdinal != 9) {
                                    }
                                    break;
                                case 6:
                                    objValueOf = Integer.valueOf(zzovVar.zzf());
                                    iOrdinal = zzncVarZza.zza.zzb.ordinal();
                                    if (iOrdinal != 9) {
                                    }
                                    break;
                                case 7:
                                    objValueOf = Boolean.valueOf(zzovVar.zzN());
                                    iOrdinal = zzncVarZza.zza.zzb.ordinal();
                                    if (iOrdinal != 9) {
                                    }
                                    break;
                                case 8:
                                    objValueOf = zzovVar.zzr();
                                    iOrdinal = zzncVarZza.zza.zzb.ordinal();
                                    if (iOrdinal != 9) {
                                    }
                                    break;
                                case 9:
                                    Object objZze2 = zzmtVarZzi.zze(zzncVarZza.zza);
                                    if (!(objZze2 instanceof zznd)) {
                                        throw null;
                                    }
                                    zzow zzowVarZzb = zzos.zza().zzb(objZze2.getClass());
                                    if (!((zznd) objZze2).zzL()) {
                                        Object objZze3 = zzowVarZzb.zze();
                                        zzowVarZzb.zzg(objZze3, objZze2);
                                        zzmtVarZzi.zzi(zzncVarZza.zza, objZze3);
                                        objZze2 = objZze3;
                                    }
                                    zzovVar.zzt(objZze2, zzowVarZzb, zzmoVar);
                                    objZza = obj4;
                                    zzplVar2 = zzplVar;
                                case 10:
                                    Object objZze4 = zzmtVarZzi.zze(zzncVarZza.zza);
                                    if (!(objZze4 instanceof zznd)) {
                                        throw null;
                                    }
                                    zzow zzowVarZzb2 = zzos.zza().zzb(objZze4.getClass());
                                    if (!((zznd) objZze4).zzL()) {
                                        Object objZze5 = zzowVarZzb2.zze();
                                        zzowVarZzb2.zzg(objZze5, objZze4);
                                        zzmtVarZzi.zzi(zzncVarZza.zza, objZze5);
                                        objZze4 = objZze5;
                                    }
                                    zzovVar.zzu(objZze4, zzowVarZzb2, zzmoVar);
                                    objZza = obj4;
                                    zzplVar2 = zzplVar;
                                case 11:
                                    objValueOf = zzovVar.zzp();
                                    iOrdinal = zzncVarZza.zza.zzb.ordinal();
                                    if (iOrdinal != 9) {
                                    }
                                    break;
                                case 12:
                                    objValueOf = Integer.valueOf(zzovVar.zzj());
                                    iOrdinal = zzncVarZza.zza.zzb.ordinal();
                                    if (iOrdinal != 9) {
                                    }
                                    break;
                                case 13:
                                    throw new IllegalStateException("Shouldn't reach here.");
                                case 14:
                                    objValueOf = Integer.valueOf(zzovVar.zzh());
                                    iOrdinal = zzncVarZza.zza.zzb.ordinal();
                                    if (iOrdinal != 9) {
                                    }
                                    break;
                                case 15:
                                    objValueOf = Long.valueOf(zzovVar.zzm());
                                    iOrdinal = zzncVarZza.zza.zzb.ordinal();
                                    if (iOrdinal != 9) {
                                    }
                                    break;
                                case 16:
                                    objValueOf = Integer.valueOf(zzovVar.zzi());
                                    iOrdinal = zzncVarZza.zza.zzb.ordinal();
                                    if (iOrdinal != 9) {
                                    }
                                    break;
                                case 17:
                                    objValueOf = Long.valueOf(zzovVar.zzn());
                                    iOrdinal = zzncVarZza.zza.zzb.ordinal();
                                    if (iOrdinal != 9) {
                                    }
                                    break;
                                default:
                                    objValueOf = null;
                                    iOrdinal = zzncVarZza.zza.zzb.ordinal();
                                    if (iOrdinal != 9) {
                                    }
                                    break;
                            }
                        } else {
                            objZza = obj4 == null ? zzplVar.zza(obj) : obj4;
                            try {
                                if (zzplVar.zzk(objZza, zzovVar, 0)) {
                                    obj5 = obj;
                                    obj = obj5;
                                    zzplVar2 = zzplVar;
                                } else {
                                    int i14 = this.zzk;
                                    while (i14 < this.zzl) {
                                        zzpl zzplVar4 = zzplVar;
                                        Object obj7 = obj;
                                        zzy(obj7, this.zzj[i14], objZza, zzplVar4, obj);
                                        zzplVar = zzplVar4;
                                        i14++;
                                        obj = obj7;
                                    }
                                    obj5 = obj;
                                }
                            } catch (Throwable th11) {
                                th = th11;
                                obj5 = obj;
                                zzolVar = this;
                                th2 = th;
                                obj2 = obj5;
                                zzplVar2 = zzplVar;
                                i10 = zzolVar.zzk;
                                while (i10 < zzolVar.zzl) {
                                }
                                if (objZza == null) {
                                }
                            }
                        }
                    } catch (Throwable th12) {
                        th = th12;
                        obj5 = obj;
                        zzolVar = this;
                        th2 = th;
                        obj2 = obj5;
                        obj3 = obj4;
                        zzplVar2 = zzplVar;
                        objZza = obj3;
                        i10 = zzolVar.zzk;
                        while (i10 < zzolVar.zzl) {
                        }
                        if (objZza == null) {
                        }
                    }
                }
            } catch (Throwable th13) {
                th = th13;
                obj2 = obj;
                obj3 = objZza;
                zzolVar = this;
            }
            i10 = zzolVar.zzk;
            while (i10 < zzolVar.zzl) {
                zzolVar.zzy(obj2, zzolVar.zzj[i10], objZza, zzplVar2, obj2);
                i10++;
                zzolVar = this;
            }
            if (objZza == null) {
                throw th2;
            }
            zzplVar2.zzj(obj2, objZza);
            throw th2;
        }
        if (objZza == null) {
            zzplVar2.zzj(obj2, objZza);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzi(Object obj, byte[] bArr, int i10, int i11, zzkt zzktVar) throws IOException {
        zzc(obj, bArr, i10, i11, 0, zzktVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    @Override // com.google.android.recaptcha.internal.zzow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzj(Object obj, zzpy zzpyVar) throws IOException {
        Map.Entry entry;
        Iterator it;
        int i10;
        Map.Entry entry2;
        int i11;
        int i12;
        int i13;
        zzol<T> zzolVar = this;
        if (zzolVar.zzh) {
            zzmt zzmtVar = ((zzna) obj).zzb;
            if (zzmtVar.zza.isEmpty()) {
                entry = null;
                it = null;
            } else {
                Iterator itZzf = zzmtVar.zzf();
                entry = (Map.Entry) itZzf.next();
                it = itZzf;
            }
        }
        int[] iArr = zzolVar.zzc;
        Unsafe unsafe = zzb;
        int i14 = 0;
        int i15 = 1048575;
        int i16 = 0;
        while (i14 < iArr.length) {
            int iZzu = zzolVar.zzu(i14);
            int[] iArr2 = zzolVar.zzc;
            int iZzt = zzt(iZzu);
            int i17 = iArr2[i14];
            if (iZzt <= 17) {
                int i18 = iArr2[i14 + 2];
                int i19 = i18 & 1048575;
                if (i19 != i15) {
                    i10 = 1;
                    i16 = i19 == 1048575 ? 0 : unsafe.getInt(obj, i19);
                    i15 = i19;
                } else {
                    i10 = 1;
                }
                entry2 = entry;
                i11 = i15;
                i12 = i16;
                i13 = i10 << (i18 >>> 20);
            } else {
                i10 = 1;
                entry2 = entry;
                i11 = i15;
                i12 = i16;
                i13 = 0;
            }
            while (entry2 != null && ((zznb) entry2.getKey()).zza <= i17) {
                zzolVar.zzn.zzb(zzpyVar, entry2);
                entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
            }
            long j10 = iZzu & 1048575;
            switch (iZzt) {
                case 0:
                    if (zzolVar.zzO(obj, i14, i11, i12, i13)) {
                        zzpyVar.zzf(i17, zzps.zza(obj, j10));
                    }
                    i14 += 3;
                    i16 = i12;
                    i15 = i11;
                    entry = entry2;
                case 1:
                    if (zzolVar.zzO(obj, i14, i11, i12, i13)) {
                        zzpyVar.zzo(i17, zzps.zzb(obj, j10));
                    }
                    zzolVar = this;
                    i14 += 3;
                    i16 = i12;
                    i15 = i11;
                    entry = entry2;
                case 2:
                    if (zzolVar.zzO(obj, i14, i11, i12, i13)) {
                        zzpyVar.zzt(i17, unsafe.getLong(obj, j10));
                    }
                    zzolVar = this;
                    i14 += 3;
                    i16 = i12;
                    i15 = i11;
                    entry = entry2;
                case 3:
                    if (zzolVar.zzO(obj, i14, i11, i12, i13)) {
                        zzpyVar.zzK(i17, unsafe.getLong(obj, j10));
                    }
                    zzolVar = this;
                    i14 += 3;
                    i16 = i12;
                    i15 = i11;
                    entry = entry2;
                case 4:
                    if (zzolVar.zzO(obj, i14, i11, i12, i13)) {
                        zzpyVar.zzr(i17, unsafe.getInt(obj, j10));
                    }
                    zzolVar = this;
                    i14 += 3;
                    i16 = i12;
                    i15 = i11;
                    entry = entry2;
                case 5:
                    if (zzolVar.zzO(obj, i14, i11, i12, i13)) {
                        zzpyVar.zzm(i17, unsafe.getLong(obj, j10));
                    }
                    zzolVar = this;
                    i14 += 3;
                    i16 = i12;
                    i15 = i11;
                    entry = entry2;
                case 6:
                    if (zzolVar.zzO(obj, i14, i11, i12, i13)) {
                        zzpyVar.zzk(i17, unsafe.getInt(obj, j10));
                    }
                    zzolVar = this;
                    i14 += 3;
                    i16 = i12;
                    i15 = i11;
                    entry = entry2;
                case 7:
                    if (zzolVar.zzO(obj, i14, i11, i12, i13)) {
                        zzpyVar.zzb(i17, zzps.zzw(obj, j10));
                    }
                    zzolVar = this;
                    i14 += 3;
                    i16 = i12;
                    i15 = i11;
                    entry = entry2;
                case 8:
                    if (zzolVar.zzO(obj, i14, i11, i12, i13)) {
                        zzT(i17, unsafe.getObject(obj, j10), zzpyVar);
                    }
                    zzolVar = this;
                    i14 += 3;
                    i16 = i12;
                    i15 = i11;
                    entry = entry2;
                case 9:
                    if (zzolVar.zzO(obj, i14, i11, i12, i13)) {
                        zzpyVar.zzv(i17, unsafe.getObject(obj, j10), zzolVar.zzx(i14));
                    }
                    i14 += 3;
                    i16 = i12;
                    i15 = i11;
                    entry = entry2;
                case 10:
                    if (zzolVar.zzO(obj, i14, i11, i12, i13)) {
                        zzpyVar.zzd(i17, (zzle) unsafe.getObject(obj, j10));
                    }
                    zzolVar = this;
                    i14 += 3;
                    i16 = i12;
                    i15 = i11;
                    entry = entry2;
                case 11:
                    if (zzolVar.zzO(obj, i14, i11, i12, i13)) {
                        zzpyVar.zzI(i17, unsafe.getInt(obj, j10));
                    }
                    zzolVar = this;
                    i14 += 3;
                    i16 = i12;
                    i15 = i11;
                    entry = entry2;
                case 12:
                    if (zzolVar.zzO(obj, i14, i11, i12, i13)) {
                        zzpyVar.zzi(i17, unsafe.getInt(obj, j10));
                    }
                    zzolVar = this;
                    i14 += 3;
                    i16 = i12;
                    i15 = i11;
                    entry = entry2;
                case 13:
                    if (zzolVar.zzO(obj, i14, i11, i12, i13)) {
                        zzpyVar.zzx(i17, unsafe.getInt(obj, j10));
                    }
                    zzolVar = this;
                    i14 += 3;
                    i16 = i12;
                    i15 = i11;
                    entry = entry2;
                case 14:
                    if (zzolVar.zzO(obj, i14, i11, i12, i13)) {
                        zzpyVar.zzz(i17, unsafe.getLong(obj, j10));
                    }
                    zzolVar = this;
                    i14 += 3;
                    i16 = i12;
                    i15 = i11;
                    entry = entry2;
                case 15:
                    if (zzolVar.zzO(obj, i14, i11, i12, i13)) {
                        zzpyVar.zzB(i17, unsafe.getInt(obj, j10));
                    }
                    zzolVar = this;
                    i14 += 3;
                    i16 = i12;
                    i15 = i11;
                    entry = entry2;
                case 16:
                    if (zzolVar.zzO(obj, i14, i11, i12, i13)) {
                        zzpyVar.zzD(i17, unsafe.getLong(obj, j10));
                    }
                    zzolVar = this;
                    i14 += 3;
                    i16 = i12;
                    i15 = i11;
                    entry = entry2;
                case 17:
                    if (zzolVar.zzO(obj, i14, i11, i12, i13)) {
                        zzpyVar.zzq(i17, unsafe.getObject(obj, j10), zzolVar.zzx(i14));
                    }
                    i14 += 3;
                    i16 = i12;
                    i15 = i11;
                    entry = entry2;
                case 18:
                    zzoy.zzs(zzolVar.zzc[i14], (List) unsafe.getObject(obj, j10), zzpyVar, false);
                    i14 += 3;
                    i16 = i12;
                    i15 = i11;
                    entry = entry2;
                case 19:
                    zzoy.zzw(zzolVar.zzc[i14], (List) unsafe.getObject(obj, j10), zzpyVar, false);
                    i14 += 3;
                    i16 = i12;
                    i15 = i11;
                    entry = entry2;
                case 20:
                    zzoy.zzy(zzolVar.zzc[i14], (List) unsafe.getObject(obj, j10), zzpyVar, false);
                    i14 += 3;
                    i16 = i12;
                    i15 = i11;
                    entry = entry2;
                case 21:
                    zzoy.zzE(zzolVar.zzc[i14], (List) unsafe.getObject(obj, j10), zzpyVar, false);
                    i14 += 3;
                    i16 = i12;
                    i15 = i11;
                    entry = entry2;
                case 22:
                    zzoy.zzx(zzolVar.zzc[i14], (List) unsafe.getObject(obj, j10), zzpyVar, false);
                    i14 += 3;
                    i16 = i12;
                    i15 = i11;
                    entry = entry2;
                case 23:
                    zzoy.zzv(zzolVar.zzc[i14], (List) unsafe.getObject(obj, j10), zzpyVar, false);
                    i14 += 3;
                    i16 = i12;
                    i15 = i11;
                    entry = entry2;
                case 24:
                    zzoy.zzu(zzolVar.zzc[i14], (List) unsafe.getObject(obj, j10), zzpyVar, false);
                    i14 += 3;
                    i16 = i12;
                    i15 = i11;
                    entry = entry2;
                case 25:
                    zzoy.zzr(zzolVar.zzc[i14], (List) unsafe.getObject(obj, j10), zzpyVar, false);
                    i14 += 3;
                    i16 = i12;
                    i15 = i11;
                    entry = entry2;
                case 26:
                    int i20 = zzolVar.zzc[i14];
                    List list = (List) unsafe.getObject(obj, j10);
                    int i21 = zzoy.zza;
                    if (list != null && !list.isEmpty()) {
                        zzpyVar.zzH(i20, list);
                    }
                    i14 += 3;
                    i16 = i12;
                    i15 = i11;
                    entry = entry2;
                    break;
                case 27:
                    int i22 = zzolVar.zzc[i14];
                    List list2 = (List) unsafe.getObject(obj, j10);
                    zzow zzowVarZzx = zzolVar.zzx(i14);
                    int i23 = zzoy.zza;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i24 = 0; i24 < list2.size(); i24++) {
                            ((zzlo) zzpyVar).zzv(i22, list2.get(i24), zzowVarZzx);
                        }
                    }
                    i14 += 3;
                    i16 = i12;
                    i15 = i11;
                    entry = entry2;
                    break;
                case 28:
                    int i25 = zzolVar.zzc[i14];
                    List list3 = (List) unsafe.getObject(obj, j10);
                    int i26 = zzoy.zza;
                    if (list3 != null && !list3.isEmpty()) {
                        zzpyVar.zze(i25, list3);
                    }
                    i14 += 3;
                    i16 = i12;
                    i15 = i11;
                    entry = entry2;
                    break;
                case 29:
                    zzoy.zzD(zzolVar.zzc[i14], (List) unsafe.getObject(obj, j10), zzpyVar, false);
                    i14 += 3;
                    i16 = i12;
                    i15 = i11;
                    entry = entry2;
                case 30:
                    zzoy.zzt(zzolVar.zzc[i14], (List) unsafe.getObject(obj, j10), zzpyVar, false);
                    i14 += 3;
                    i16 = i12;
                    i15 = i11;
                    entry = entry2;
                case 31:
                    zzoy.zzz(zzolVar.zzc[i14], (List) unsafe.getObject(obj, j10), zzpyVar, false);
                    i14 += 3;
                    i16 = i12;
                    i15 = i11;
                    entry = entry2;
                case 32:
                    zzoy.zzA(zzolVar.zzc[i14], (List) unsafe.getObject(obj, j10), zzpyVar, false);
                    i14 += 3;
                    i16 = i12;
                    i15 = i11;
                    entry = entry2;
                case 33:
                    zzoy.zzB(zzolVar.zzc[i14], (List) unsafe.getObject(obj, j10), zzpyVar, false);
                    i14 += 3;
                    i16 = i12;
                    i15 = i11;
                    entry = entry2;
                case 34:
                    zzoy.zzC(zzolVar.zzc[i14], (List) unsafe.getObject(obj, j10), zzpyVar, false);
                    i14 += 3;
                    i16 = i12;
                    i15 = i11;
                    entry = entry2;
                case 35:
                    zzoy.zzs(zzolVar.zzc[i14], (List) unsafe.getObject(obj, j10), zzpyVar, i10);
                    i14 += 3;
                    i16 = i12;
                    i15 = i11;
                    entry = entry2;
                case 36:
                    zzoy.zzw(zzolVar.zzc[i14], (List) unsafe.getObject(obj, j10), zzpyVar, i10);
                    i14 += 3;
                    i16 = i12;
                    i15 = i11;
                    entry = entry2;
                case 37:
                    zzoy.zzy(zzolVar.zzc[i14], (List) unsafe.getObject(obj, j10), zzpyVar, i10);
                    i14 += 3;
                    i16 = i12;
                    i15 = i11;
                    entry = entry2;
                case 38:
                    zzoy.zzE(zzolVar.zzc[i14], (List) unsafe.getObject(obj, j10), zzpyVar, i10);
                    i14 += 3;
                    i16 = i12;
                    i15 = i11;
                    entry = entry2;
                case 39:
                    zzoy.zzx(zzolVar.zzc[i14], (List) unsafe.getObject(obj, j10), zzpyVar, i10);
                    i14 += 3;
                    i16 = i12;
                    i15 = i11;
                    entry = entry2;
                case 40:
                    zzoy.zzv(zzolVar.zzc[i14], (List) unsafe.getObject(obj, j10), zzpyVar, i10);
                    i14 += 3;
                    i16 = i12;
                    i15 = i11;
                    entry = entry2;
                case 41:
                    zzoy.zzu(zzolVar.zzc[i14], (List) unsafe.getObject(obj, j10), zzpyVar, i10);
                    i14 += 3;
                    i16 = i12;
                    i15 = i11;
                    entry = entry2;
                case 42:
                    zzoy.zzr(zzolVar.zzc[i14], (List) unsafe.getObject(obj, j10), zzpyVar, i10);
                    i14 += 3;
                    i16 = i12;
                    i15 = i11;
                    entry = entry2;
                case EACTags.DATE_OF_BIRTH /* 43 */:
                    zzoy.zzD(zzolVar.zzc[i14], (List) unsafe.getObject(obj, j10), zzpyVar, i10);
                    i14 += 3;
                    i16 = i12;
                    i15 = i11;
                    entry = entry2;
                case 44:
                    zzoy.zzt(zzolVar.zzc[i14], (List) unsafe.getObject(obj, j10), zzpyVar, i10);
                    i14 += 3;
                    i16 = i12;
                    i15 = i11;
                    entry = entry2;
                case 45:
                    zzoy.zzz(zzolVar.zzc[i14], (List) unsafe.getObject(obj, j10), zzpyVar, i10);
                    i14 += 3;
                    i16 = i12;
                    i15 = i11;
                    entry = entry2;
                case 46:
                    zzoy.zzA(zzolVar.zzc[i14], (List) unsafe.getObject(obj, j10), zzpyVar, i10);
                    i14 += 3;
                    i16 = i12;
                    i15 = i11;
                    entry = entry2;
                case EACTags.PIN_USAGE_POLICY /* 47 */:
                    zzoy.zzB(zzolVar.zzc[i14], (List) unsafe.getObject(obj, j10), zzpyVar, i10);
                    i14 += 3;
                    i16 = i12;
                    i15 = i11;
                    entry = entry2;
                case 48:
                    zzoy.zzC(zzolVar.zzc[i14], (List) unsafe.getObject(obj, j10), zzpyVar, i10);
                    i14 += 3;
                    i16 = i12;
                    i15 = i11;
                    entry = entry2;
                case 49:
                    int i27 = zzolVar.zzc[i14];
                    List list4 = (List) unsafe.getObject(obj, j10);
                    zzow zzowVarZzx2 = zzolVar.zzx(i14);
                    int i28 = zzoy.zza;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i29 = 0; i29 < list4.size(); i29++) {
                            ((zzlo) zzpyVar).zzq(i27, list4.get(i29), zzowVarZzx2);
                        }
                    }
                    i14 += 3;
                    i16 = i12;
                    i15 = i11;
                    entry = entry2;
                    break;
                case 50:
                    if (unsafe.getObject(obj, j10) != null) {
                        throw null;
                    }
                    i14 += 3;
                    i16 = i12;
                    i15 = i11;
                    entry = entry2;
                case EACTags.TRANSACTION_DATE /* 51 */:
                    if (zzolVar.zzR(obj, i17, i14)) {
                        zzpyVar.zzf(i17, zzn(obj, j10));
                    }
                    i14 += 3;
                    i16 = i12;
                    i15 = i11;
                    entry = entry2;
                case 52:
                    if (zzolVar.zzR(obj, i17, i14)) {
                        zzpyVar.zzo(i17, zzo(obj, j10));
                    }
                    i14 += 3;
                    i16 = i12;
                    i15 = i11;
                    entry = entry2;
                case EACTags.SEX /* 53 */:
                    if (zzolVar.zzR(obj, i17, i14)) {
                        zzpyVar.zzt(i17, zzv(obj, j10));
                    }
                    i14 += 3;
                    i16 = i12;
                    i15 = i11;
                    entry = entry2;
                case EACTags.CURRENCY_EXPONENT /* 54 */:
                    if (zzolVar.zzR(obj, i17, i14)) {
                        zzpyVar.zzK(i17, zzv(obj, j10));
                    }
                    i14 += 3;
                    i16 = i12;
                    i15 = i11;
                    entry = entry2;
                case 55:
                    if (zzolVar.zzR(obj, i17, i14)) {
                        zzpyVar.zzr(i17, zzp(obj, j10));
                    }
                    i14 += 3;
                    i16 = i12;
                    i15 = i11;
                    entry = entry2;
                case 56:
                    if (zzolVar.zzR(obj, i17, i14)) {
                        zzpyVar.zzm(i17, zzv(obj, j10));
                    }
                    i14 += 3;
                    i16 = i12;
                    i15 = i11;
                    entry = entry2;
                case 57:
                    if (zzolVar.zzR(obj, i17, i14)) {
                        zzpyVar.zzk(i17, zzp(obj, j10));
                    }
                    i14 += 3;
                    i16 = i12;
                    i15 = i11;
                    entry = entry2;
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    if (zzolVar.zzR(obj, i17, i14)) {
                        zzpyVar.zzb(i17, zzS(obj, j10));
                    }
                    i14 += 3;
                    i16 = i12;
                    i15 = i11;
                    entry = entry2;
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (zzolVar.zzR(obj, i17, i14)) {
                        zzT(i17, unsafe.getObject(obj, j10), zzpyVar);
                    }
                    i14 += 3;
                    i16 = i12;
                    i15 = i11;
                    entry = entry2;
                case 60:
                    if (zzolVar.zzR(obj, i17, i14)) {
                        zzpyVar.zzv(i17, unsafe.getObject(obj, j10), zzolVar.zzx(i14));
                    }
                    i14 += 3;
                    i16 = i12;
                    i15 = i11;
                    entry = entry2;
                case 61:
                    if (zzolVar.zzR(obj, i17, i14)) {
                        zzpyVar.zzd(i17, (zzle) unsafe.getObject(obj, j10));
                    }
                    i14 += 3;
                    i16 = i12;
                    i15 = i11;
                    entry = entry2;
                case 62:
                    if (zzolVar.zzR(obj, i17, i14)) {
                        zzpyVar.zzI(i17, zzp(obj, j10));
                    }
                    i14 += 3;
                    i16 = i12;
                    i15 = i11;
                    entry = entry2;
                case 63:
                    if (zzolVar.zzR(obj, i17, i14)) {
                        zzpyVar.zzi(i17, zzp(obj, j10));
                    }
                    i14 += 3;
                    i16 = i12;
                    i15 = i11;
                    entry = entry2;
                case 64:
                    if (zzolVar.zzR(obj, i17, i14)) {
                        zzpyVar.zzx(i17, zzp(obj, j10));
                    }
                    i14 += 3;
                    i16 = i12;
                    i15 = i11;
                    entry = entry2;
                case EACTags.ELEMENT_LIST /* 65 */:
                    if (zzolVar.zzR(obj, i17, i14)) {
                        zzpyVar.zzz(i17, zzv(obj, j10));
                    }
                    i14 += 3;
                    i16 = i12;
                    i15 = i11;
                    entry = entry2;
                case EACTags.ADDRESS /* 66 */:
                    if (zzolVar.zzR(obj, i17, i14)) {
                        zzpyVar.zzB(i17, zzp(obj, j10));
                    }
                    i14 += 3;
                    i16 = i12;
                    i15 = i11;
                    entry = entry2;
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (zzolVar.zzR(obj, i17, i14)) {
                        zzpyVar.zzD(i17, zzv(obj, j10));
                    }
                    i14 += 3;
                    i16 = i12;
                    i15 = i11;
                    entry = entry2;
                case 68:
                    if (zzolVar.zzR(obj, i17, i14)) {
                        zzpyVar.zzq(i17, unsafe.getObject(obj, j10), zzolVar.zzx(i14));
                    }
                    i14 += 3;
                    i16 = i12;
                    i15 = i11;
                    entry = entry2;
                default:
                    i14 += 3;
                    i16 = i12;
                    i15 = i11;
                    entry = entry2;
            }
        }
        while (entry != null) {
            zzolVar.zzn.zzb(zzpyVar, entry);
            entry = it.hasNext() ? (Map.Entry) it.next() : null;
        }
        ((zznd) obj).zzc.zzl(zzpyVar);
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final boolean zzk(Object obj, Object obj2) {
        boolean zZzF;
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int iZzu = zzu(i10);
            long j10 = iZzu & 1048575;
            switch (zzt(iZzu)) {
                case 0:
                    if (!zzL(obj, obj2, i10) || Double.doubleToLongBits(zzps.zza(obj, j10)) != Double.doubleToLongBits(zzps.zza(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 1:
                    if (!zzL(obj, obj2, i10) || Float.floatToIntBits(zzps.zzb(obj, j10)) != Float.floatToIntBits(zzps.zzb(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 2:
                    if (!zzL(obj, obj2, i10) || zzps.zzd(obj, j10) != zzps.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 3:
                    if (!zzL(obj, obj2, i10) || zzps.zzd(obj, j10) != zzps.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 4:
                    if (!zzL(obj, obj2, i10) || zzps.zzc(obj, j10) != zzps.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 5:
                    if (!zzL(obj, obj2, i10) || zzps.zzd(obj, j10) != zzps.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 6:
                    if (!zzL(obj, obj2, i10) || zzps.zzc(obj, j10) != zzps.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 7:
                    if (!zzL(obj, obj2, i10) || zzps.zzw(obj, j10) != zzps.zzw(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 8:
                    if (!zzL(obj, obj2, i10) || !zzoy.zzF(zzps.zzf(obj, j10), zzps.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 9:
                    if (!zzL(obj, obj2, i10) || !zzoy.zzF(zzps.zzf(obj, j10), zzps.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 10:
                    if (!zzL(obj, obj2, i10) || !zzoy.zzF(zzps.zzf(obj, j10), zzps.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 11:
                    if (!zzL(obj, obj2, i10) || zzps.zzc(obj, j10) != zzps.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 12:
                    if (!zzL(obj, obj2, i10) || zzps.zzc(obj, j10) != zzps.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 13:
                    if (!zzL(obj, obj2, i10) || zzps.zzc(obj, j10) != zzps.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 14:
                    if (!zzL(obj, obj2, i10) || zzps.zzd(obj, j10) != zzps.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 15:
                    if (!zzL(obj, obj2, i10) || zzps.zzc(obj, j10) != zzps.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 16:
                    if (!zzL(obj, obj2, i10) || zzps.zzd(obj, j10) != zzps.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 17:
                    if (!zzL(obj, obj2, i10) || !zzoy.zzF(zzps.zzf(obj, j10), zzps.zzf(obj2, j10))) {
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
                    zZzF = zzoy.zzF(zzps.zzf(obj, j10), zzps.zzf(obj2, j10));
                    break;
                case 50:
                    zZzF = zzoy.zzF(zzps.zzf(obj, j10), zzps.zzf(obj2, j10));
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
                    long jZzr = zzr(i10) & 1048575;
                    if (zzps.zzc(obj, jZzr) != zzps.zzc(obj2, jZzr) || !zzoy.zzF(zzps.zzf(obj, j10), zzps.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                default:
            }
            if (!zZzF) {
                return false;
            }
        }
        if (!((zznd) obj).zzc.equals(((zznd) obj2).zzc)) {
            return false;
        }
        if (this.zzh) {
            return ((zzna) obj).zzb.equals(((zzna) obj2).zzb);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x008d  */
    @Override // com.google.android.recaptcha.internal.zzow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzl(Object obj) {
        int i10;
        int i11;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1048575;
        while (i12 < this.zzk) {
            int[] iArr = this.zzj;
            int[] iArr2 = this.zzc;
            int i15 = iArr[i12];
            int i16 = iArr2[i15];
            int iZzu = zzu(i15);
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
            if ((268435456 & iZzu) != 0 && !zzO(obj2, i15, i10, i11, i19)) {
                return false;
            }
            int iZzt = zzt(iZzu);
            if (iZzt == 9 || iZzt == 17) {
                if (zzO(obj2, i15, i10, i11, i19) && !zzP(obj2, iZzu, zzx(i15))) {
                    return false;
                }
            } else if (iZzt == 27) {
                List list = (List) zzps.zzf(obj2, iZzu & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzow zzowVarZzx = zzx(i15);
                    for (int i20 = 0; i20 < list.size(); i20++) {
                        if (!zzowVarZzx.zzl(list.get(i20))) {
                            return false;
                        }
                    }
                }
            } else if (iZzt == 60 || iZzt == 68) {
                if (zzR(obj2, i16, i15) && !zzP(obj2, iZzu, zzx(i15))) {
                    return false;
                }
            } else if (iZzt != 49) {
                if (iZzt == 50 && !((zzoc) zzps.zzf(obj2, iZzu & 1048575)).isEmpty()) {
                    throw null;
                }
            }
            i12++;
            obj = obj2;
            i14 = i10;
            i13 = i11;
        }
        return !this.zzh || ((zzna) obj).zzb.zzk();
    }
}
