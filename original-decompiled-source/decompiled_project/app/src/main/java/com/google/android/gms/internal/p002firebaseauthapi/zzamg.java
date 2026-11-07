package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.room.y0;
import com.yalantis.ucrop.view.CropImageView;
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
final class zzamg<T> implements zzamv<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzanp.zzb();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzamc zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final int[] zzk;
    private final int zzl;
    private final int zzm;
    private final zzamk zzn;
    private final zzalm zzo;
    private final zzano<?, ?> zzp;
    private final zzakm<?> zzq;
    private final zzalz zzr;

    private zzamg(int[] iArr, Object[] objArr, int i10, int i11, zzamc zzamcVar, boolean z10, int[] iArr2, int i12, int i13, zzamk zzamkVar, zzalm zzalmVar, zzano<?, ?> zzanoVar, zzakm<?> zzakmVar, zzalz zzalzVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        this.zzi = zzamcVar instanceof zzaky;
        this.zzh = zzakmVar != null && zzakmVar.zza(zzamcVar);
        this.zzj = false;
        this.zzk = iArr2;
        this.zzl = i12;
        this.zzm = i13;
        this.zzn = zzamkVar;
        this.zzo = zzalmVar;
        this.zzp = zzanoVar;
        this.zzq = zzakmVar;
        this.zzg = zzamcVar;
        this.zzr = zzalzVar;
    }

    private static <T> double zza(T t3, long j10) {
        return ((Double) zzanp.zze(t3, j10)).doubleValue();
    }

    private static <T> float zzb(T t3, long j10) {
        return ((Float) zzanp.zze(t3, j10)).floatValue();
    }

    private static <T> int zzc(T t3, long j10) {
        return ((Integer) zzanp.zze(t3, j10)).intValue();
    }

    private static <T> long zzd(T t3, long j10) {
        return ((Long) zzanp.zze(t3, j10)).longValue();
    }

    private final zzamv zze(int i10) {
        int i11 = (i10 / 3) << 1;
        zzamv zzamvVar = (zzamv) this.zzd[i11];
        if (zzamvVar != null) {
            return zzamvVar;
        }
        zzamv<T> zzamvVarZza = zzamr.zza().zza((Class) this.zzd[i11 + 1]);
        this.zzd[i11] = zzamvVarZza;
        return zzamvVarZza;
    }

    private final Object zzf(int i10) {
        return this.zzd[(i10 / 3) << 1];
    }

    private static boolean zzg(int i10) {
        return (i10 & PKIFailureInfo.duplicateCertReq) != 0;
    }

    private static int zza(byte[] bArr, int i10, int i11, zzanw zzanwVar, Class<?> cls, zzajk zzajkVar) throws IOException {
        switch (zzamj.zza[zzanwVar.ordinal()]) {
            case 1:
                int iZzd = zzajl.zzd(bArr, i10, zzajkVar);
                zzajkVar.zzc = Boolean.valueOf(zzajkVar.zzb != 0);
                return iZzd;
            case 2:
                return zzajl.zza(bArr, i10, zzajkVar);
            case 3:
                zzajkVar.zzc = Double.valueOf(zzajl.zza(bArr, i10));
                return i10 + 8;
            case 4:
            case 5:
                zzajkVar.zzc = Integer.valueOf(zzajl.zzc(bArr, i10));
                return i10 + 4;
            case 6:
            case 7:
                zzajkVar.zzc = Long.valueOf(zzajl.zzd(bArr, i10));
                return i10 + 8;
            case 8:
                zzajkVar.zzc = Float.valueOf(zzajl.zzb(bArr, i10));
                return i10 + 4;
            case 9:
            case 10:
            case 11:
                int iZzc = zzajl.zzc(bArr, i10, zzajkVar);
                zzajkVar.zzc = Integer.valueOf(zzajkVar.zza);
                return iZzc;
            case 12:
            case 13:
                int iZzd2 = zzajl.zzd(bArr, i10, zzajkVar);
                zzajkVar.zzc = Long.valueOf(zzajkVar.zzb);
                return iZzd2;
            case 14:
                return zzajl.zza(zzamr.zza().zza((Class) cls), bArr, i10, i11, zzajkVar);
            case 15:
                int iZzc2 = zzajl.zzc(bArr, i10, zzajkVar);
                zzajkVar.zzc = Integer.valueOf(zzakb.zze(zzajkVar.zza));
                return iZzc2;
            case 16:
                int iZzd3 = zzajl.zzd(bArr, i10, zzajkVar);
                zzajkVar.zzc = Long.valueOf(zzakb.zza(zzajkVar.zzb));
                return iZzd3;
            case 17:
                return zzajl.zzb(bArr, i10, zzajkVar);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private final int zzc(int i10) {
        return this.zzc[i10 + 1];
    }

    private final zzald zzd(int i10) {
        return (zzald) this.zzd[((i10 / 3) << 1) + 1];
    }

    private static void zzf(Object obj) {
        if (!zzg(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private static boolean zzg(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzaky) {
            return ((zzaky) obj).zzu();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    public final int zzb(T t3) {
        int i10;
        int iZza;
        int i11;
        int iZzc;
        int length = this.zzc.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int iZzc2 = zzc(i13);
            int i14 = this.zzc[i13];
            long j10 = 1048575 & iZzc2;
            int iHashCode = 37;
            switch ((iZzc2 & 267386880) >>> 20) {
                case 0:
                    i10 = i12 * 53;
                    iZza = zzalb.zza(Double.doubleToLongBits(zzanp.zza(t3, j10)));
                    i12 = iZza + i10;
                    break;
                case 1:
                    i10 = i12 * 53;
                    iZza = Float.floatToIntBits(zzanp.zzb(t3, j10));
                    i12 = iZza + i10;
                    break;
                case 2:
                    i10 = i12 * 53;
                    iZza = zzalb.zza(zzanp.zzd(t3, j10));
                    i12 = iZza + i10;
                    break;
                case 3:
                    i10 = i12 * 53;
                    iZza = zzalb.zza(zzanp.zzd(t3, j10));
                    i12 = iZza + i10;
                    break;
                case 4:
                    i11 = i12 * 53;
                    iZzc = zzanp.zzc(t3, j10);
                    i12 = i11 + iZzc;
                    break;
                case 5:
                    i10 = i12 * 53;
                    iZza = zzalb.zza(zzanp.zzd(t3, j10));
                    i12 = iZza + i10;
                    break;
                case 6:
                    i11 = i12 * 53;
                    iZzc = zzanp.zzc(t3, j10);
                    i12 = i11 + iZzc;
                    break;
                case 7:
                    i10 = i12 * 53;
                    iZza = zzalb.zza(zzanp.zzh(t3, j10));
                    i12 = iZza + i10;
                    break;
                case 8:
                    i10 = i12 * 53;
                    iZza = ((String) zzanp.zze(t3, j10)).hashCode();
                    i12 = iZza + i10;
                    break;
                case 9:
                    Object objZze = zzanp.zze(t3, j10);
                    if (objZze != null) {
                        iHashCode = objZze.hashCode();
                    }
                    i12 = (i12 * 53) + iHashCode;
                    break;
                case 10:
                    i10 = i12 * 53;
                    iZza = zzanp.zze(t3, j10).hashCode();
                    i12 = iZza + i10;
                    break;
                case 11:
                    i11 = i12 * 53;
                    iZzc = zzanp.zzc(t3, j10);
                    i12 = i11 + iZzc;
                    break;
                case 12:
                    i11 = i12 * 53;
                    iZzc = zzanp.zzc(t3, j10);
                    i12 = i11 + iZzc;
                    break;
                case 13:
                    i11 = i12 * 53;
                    iZzc = zzanp.zzc(t3, j10);
                    i12 = i11 + iZzc;
                    break;
                case 14:
                    i10 = i12 * 53;
                    iZza = zzalb.zza(zzanp.zzd(t3, j10));
                    i12 = iZza + i10;
                    break;
                case 15:
                    i11 = i12 * 53;
                    iZzc = zzanp.zzc(t3, j10);
                    i12 = i11 + iZzc;
                    break;
                case 16:
                    i10 = i12 * 53;
                    iZza = zzalb.zza(zzanp.zzd(t3, j10));
                    i12 = iZza + i10;
                    break;
                case 17:
                    Object objZze2 = zzanp.zze(t3, j10);
                    if (objZze2 != null) {
                        iHashCode = objZze2.hashCode();
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
                    i10 = i12 * 53;
                    iZza = zzanp.zze(t3, j10).hashCode();
                    i12 = iZza + i10;
                    break;
                case 50:
                    i10 = i12 * 53;
                    iZza = zzanp.zze(t3, j10).hashCode();
                    i12 = iZza + i10;
                    break;
                case EACTags.TRANSACTION_DATE /* 51 */:
                    if (zzc((zzamg<T>) t3, i14, i13)) {
                        i10 = i12 * 53;
                        iZza = zzalb.zza(Double.doubleToLongBits(zza(t3, j10)));
                        i12 = iZza + i10;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzc((zzamg<T>) t3, i14, i13)) {
                        i10 = i12 * 53;
                        iZza = Float.floatToIntBits(zzb(t3, j10));
                        i12 = iZza + i10;
                        break;
                    } else {
                        break;
                    }
                case EACTags.SEX /* 53 */:
                    if (zzc((zzamg<T>) t3, i14, i13)) {
                        i10 = i12 * 53;
                        iZza = zzalb.zza(zzd(t3, j10));
                        i12 = iZza + i10;
                        break;
                    } else {
                        break;
                    }
                case EACTags.CURRENCY_EXPONENT /* 54 */:
                    if (zzc((zzamg<T>) t3, i14, i13)) {
                        i10 = i12 * 53;
                        iZza = zzalb.zza(zzd(t3, j10));
                        i12 = iZza + i10;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzc((zzamg<T>) t3, i14, i13)) {
                        i11 = i12 * 53;
                        iZzc = zzc(t3, j10);
                        i12 = i11 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzc((zzamg<T>) t3, i14, i13)) {
                        i10 = i12 * 53;
                        iZza = zzalb.zza(zzd(t3, j10));
                        i12 = iZza + i10;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzc((zzamg<T>) t3, i14, i13)) {
                        i11 = i12 * 53;
                        iZzc = zzc(t3, j10);
                        i12 = i11 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    if (zzc((zzamg<T>) t3, i14, i13)) {
                        i10 = i12 * 53;
                        iZza = zzalb.zza(zze(t3, j10));
                        i12 = iZza + i10;
                        break;
                    } else {
                        break;
                    }
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (zzc((zzamg<T>) t3, i14, i13)) {
                        i10 = i12 * 53;
                        iZza = ((String) zzanp.zze(t3, j10)).hashCode();
                        i12 = iZza + i10;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzc((zzamg<T>) t3, i14, i13)) {
                        i10 = i12 * 53;
                        iZza = zzanp.zze(t3, j10).hashCode();
                        i12 = iZza + i10;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzc((zzamg<T>) t3, i14, i13)) {
                        i10 = i12 * 53;
                        iZza = zzanp.zze(t3, j10).hashCode();
                        i12 = iZza + i10;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzc((zzamg<T>) t3, i14, i13)) {
                        i11 = i12 * 53;
                        iZzc = zzc(t3, j10);
                        i12 = i11 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzc((zzamg<T>) t3, i14, i13)) {
                        i11 = i12 * 53;
                        iZzc = zzc(t3, j10);
                        i12 = i11 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzc((zzamg<T>) t3, i14, i13)) {
                        i11 = i12 * 53;
                        iZzc = zzc(t3, j10);
                        i12 = i11 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case EACTags.ELEMENT_LIST /* 65 */:
                    if (zzc((zzamg<T>) t3, i14, i13)) {
                        i10 = i12 * 53;
                        iZza = zzalb.zza(zzd(t3, j10));
                        i12 = iZza + i10;
                        break;
                    } else {
                        break;
                    }
                case EACTags.ADDRESS /* 66 */:
                    if (zzc((zzamg<T>) t3, i14, i13)) {
                        i11 = i12 * 53;
                        iZzc = zzc(t3, j10);
                        i12 = i11 + iZzc;
                        break;
                    } else {
                        break;
                    }
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (zzc((zzamg<T>) t3, i14, i13)) {
                        i10 = i12 * 53;
                        iZza = zzalb.zza(zzd(t3, j10));
                        i12 = iZza + i10;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzc((zzamg<T>) t3, i14, i13)) {
                        i10 = i12 * 53;
                        iZza = zzanp.zze(t3, j10).hashCode();
                        i12 = iZza + i10;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = this.zzp.zzd(t3).hashCode() + (i12 * 53);
        return this.zzh ? (iHashCode2 * 53) + this.zzq.zza(t3).hashCode() : iHashCode2;
    }

    public static zzann zzc(Object obj) {
        zzaky zzakyVar = (zzaky) obj;
        zzann zzannVar = zzakyVar.zzb;
        if (zzannVar != zzann.zzc()) {
            return zzannVar;
        }
        zzann zzannVarZzd = zzann.zzd();
        zzakyVar.zzb = zzannVarZzd;
        return zzannVarZzd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd(T t3) {
        if (zzg(t3)) {
            if (t3 instanceof zzaky) {
                zzaky zzakyVar = (zzaky) t3;
                zzakyVar.zzb(Integer.MAX_VALUE);
                zzakyVar.zza = 0;
                zzakyVar.zzt();
            }
            int length = this.zzc.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int iZzc = zzc(i10);
                long j10 = 1048575 & iZzc;
                int i11 = (iZzc & 267386880) >>> 20;
                if (i11 != 9) {
                    if (i11 != 60 && i11 != 68) {
                        switch (i11) {
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
                                this.zzo.zzb(t3, j10);
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(t3, j10);
                                if (object != null) {
                                    unsafe.putObject(t3, j10, this.zzr.zzc(object));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzc((zzamg<T>) t3, this.zzc[i10], i10)) {
                        zze(i10).zzd(zzb.getObject(t3, j10));
                    }
                } else if (zzc((zzamg<T>) t3, i10)) {
                    zze(i10).zzd(zzb.getObject(t3, j10));
                }
            }
            this.zzp.zzf(t3);
            if (this.zzh) {
                this.zzq.zzc(t3);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c7  */
    /* JADX WARN: Type inference failed for: r3v10, types: [com.google.android.gms.internal.firebase-auth-api.zzamv] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25, types: [com.google.android.gms.internal.firebase-auth-api.zzamv] */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zze(T t3) {
        int i10;
        int i11;
        zzamg<T> zzamgVar;
        T t10;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i13 < this.zzl) {
            int i15 = this.zzk[i13];
            int i16 = this.zzc[i15];
            int iZzc = zzc(i15);
            int i17 = this.zzc[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i12) {
                if (i18 != 1048575) {
                    i14 = zzb.getInt(t3, i18);
                }
                i11 = i14;
                i10 = i18;
            } else {
                i10 = i12;
                i11 = i14;
            }
            if ((268435456 & iZzc) != 0) {
                zzamgVar = this;
                t10 = t3;
                if (!zzamgVar.zza((zzamg<T>) t10, i15, i10, i11, i19)) {
                    return false;
                }
            } else {
                zzamgVar = this;
                t10 = t3;
            }
            int i20 = (267386880 & iZzc) >>> 20;
            if (i20 == 9 || i20 == 17) {
                if (zzamgVar.zza((zzamg<T>) t10, i15, i10, i11, i19) && !zza((Object) t10, iZzc, zze(i15))) {
                    return false;
                }
            } else if (i20 == 27) {
                List list = (List) zzanp.zze(t10, iZzc & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    ?? Zze = zze(i15);
                    for (int i21 = 0; i21 < list.size(); i21++) {
                        if (!Zze.zze(list.get(i21))) {
                            return false;
                        }
                    }
                }
            } else if (i20 == 60 || i20 == 68) {
                if (zzc((zzamg<T>) t10, i16, i15) && !zza((Object) t10, iZzc, zze(i15))) {
                    return false;
                }
            } else if (i20 != 49) {
                if (i20 != 50) {
                    continue;
                } else {
                    Map<?, ?> mapZzd = zzamgVar.zzr.zzd(zzanp.zze(t10, iZzc & 1048575));
                    if (mapZzd.isEmpty()) {
                        continue;
                    } else if (zzamgVar.zzr.zza(zzf(i15)).zzc.zzb() == zzaod.MESSAGE) {
                        ?? Zza = 0;
                        for (Object obj : mapZzd.values()) {
                            Zza = Zza;
                            if (Zza == 0) {
                                Zza = zzamr.zza().zza((Class) obj.getClass());
                            }
                            if (!Zza.zze(obj)) {
                                return false;
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
            i13++;
            t3 = t10;
            i12 = i10;
            i14 = i11;
        }
        return !this.zzh || this.zzq.zza(t3).zzg();
    }

    private final boolean zzc(T t3, T t10, int i10) {
        return zzc((zzamg<T>) t3, i10) == zzc((zzamg<T>) t10, i10);
    }

    private final boolean zzc(T t3, int i10) {
        int iZzb = zzb(i10);
        long j10 = iZzb & 1048575;
        if (j10 != 1048575) {
            return (zzanp.zzc(t3, j10) & (1 << (iZzb >>> 20))) != 0;
        }
        int iZzc = zzc(i10);
        long j11 = iZzc & 1048575;
        switch ((iZzc & 267386880) >>> 20) {
            case 0:
                return Double.doubleToRawLongBits(zzanp.zza(t3, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzanp.zzb(t3, j11)) != 0;
            case 2:
                return zzanp.zzd(t3, j11) != 0;
            case 3:
                return zzanp.zzd(t3, j11) != 0;
            case 4:
                return zzanp.zzc(t3, j11) != 0;
            case 5:
                return zzanp.zzd(t3, j11) != 0;
            case 6:
                return zzanp.zzc(t3, j11) != 0;
            case 7:
                return zzanp.zzh(t3, j11);
            case 8:
                Object objZze = zzanp.zze(t3, j11);
                if (objZze instanceof String) {
                    return !((String) objZze).isEmpty();
                }
                if (objZze instanceof zzajp) {
                    return !zzajp.zza.equals(objZze);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzanp.zze(t3, j11) != null;
            case 10:
                return !zzajp.zza.equals(zzanp.zze(t3, j11));
            case 11:
                return zzanp.zzc(t3, j11) != 0;
            case 12:
                return zzanp.zzc(t3, j11) != 0;
            case 13:
                return zzanp.zzc(t3, j11) != 0;
            case 14:
                return zzanp.zzd(t3, j11) != 0;
            case 15:
                return zzanp.zzc(t3, j11) != 0;
            case 16:
                return zzanp.zzd(t3, j11) != 0;
            case 17:
                return zzanp.zze(t3, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    public final int zza(T t3) {
        int i10;
        int iZza;
        int iZza2;
        int iZzb;
        int iZza3;
        int iZzd;
        int iZzi;
        int iZzj;
        zzamg<T> zzamgVar = this;
        T t10 = t3;
        Unsafe unsafe = zzb;
        int i11 = 1048575;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 1048575;
        while (i12 < zzamgVar.zzc.length) {
            int iZzc = zzamgVar.zzc(i12);
            int i16 = (267386880 & iZzc) >>> 20;
            int[] iArr = zzamgVar.zzc;
            int i17 = iArr[i12];
            int i18 = iArr[i12 + 2];
            int i19 = i18 & i11;
            if (i16 <= 17) {
                if (i19 != i15) {
                    i13 = i19 == i11 ? 0 : unsafe.getInt(t10, i19);
                    i15 = i19;
                }
                i10 = 1 << (i18 >>> 20);
            } else {
                i10 = 0;
            }
            long j10 = iZzc & i11;
            if (i16 >= zzaks.zza.zza()) {
                zzaks.zzb.zza();
            }
            int i20 = i14;
            switch (i16) {
                case 0:
                    if (zzamgVar.zza((zzamg<T>) t10, i12, i15, i13, i10)) {
                        iZza = zzakg.zza(i17, 0.0d);
                        i14 = iZza + i20;
                        break;
                    }
                    i14 = i20;
                    break;
                case 1:
                    if (zzamgVar.zza((zzamg<T>) t10, i12, i15, i13, i10)) {
                        iZza2 = zzakg.zza(i17, CropImageView.DEFAULT_ASPECT_RATIO);
                        i14 = iZza2 + i20;
                        zzamgVar = this;
                        t10 = t3;
                        break;
                    }
                    zzamgVar = this;
                    t10 = t3;
                    i14 = i20;
                    break;
                case 2:
                    if (zzamgVar.zza((zzamg<T>) t10, i12, i15, i13, i10)) {
                        iZzb = zzakg.zzb(i17, unsafe.getLong(t10, j10));
                        i14 = iZzb + i20;
                        zzamgVar = this;
                        break;
                    }
                    zzamgVar = this;
                    i14 = i20;
                    break;
                case 3:
                    if (zzamgVar.zza((zzamg<T>) t10, i12, i15, i13, i10)) {
                        iZzb = zzakg.zze(i17, unsafe.getLong(t10, j10));
                        i14 = iZzb + i20;
                        zzamgVar = this;
                        break;
                    }
                    zzamgVar = this;
                    i14 = i20;
                    break;
                case 4:
                    if (zzamgVar.zza((zzamg<T>) t10, i12, i15, i13, i10)) {
                        iZzb = zzakg.zzd(i17, unsafe.getInt(t10, j10));
                        i14 = iZzb + i20;
                        zzamgVar = this;
                        break;
                    }
                    zzamgVar = this;
                    i14 = i20;
                    break;
                case 5:
                    if (zzamgVar.zza((zzamg<T>) t10, i12, i15, i13, i10)) {
                        iZza2 = zzakg.zza(i17, 0L);
                        i14 = iZza2 + i20;
                        zzamgVar = this;
                        t10 = t3;
                        break;
                    }
                    zzamgVar = this;
                    t10 = t3;
                    i14 = i20;
                    break;
                case 6:
                    if (zzamgVar.zza((zzamg<T>) t10, i12, i15, i13, i10)) {
                        iZza2 = zzakg.zzc(i17, 0);
                        i14 = iZza2 + i20;
                        zzamgVar = this;
                        t10 = t3;
                        break;
                    }
                    zzamgVar = this;
                    t10 = t3;
                    i14 = i20;
                    break;
                case 7:
                    if (zzamgVar.zza((zzamg<T>) t10, i12, i15, i13, i10)) {
                        iZza2 = zzakg.zza(i17, true);
                        i14 = iZza2 + i20;
                        zzamgVar = this;
                        t10 = t3;
                        break;
                    }
                    zzamgVar = this;
                    t10 = t3;
                    i14 = i20;
                    break;
                case 8:
                    if (zzamgVar.zza((zzamg<T>) t10, i12, i15, i13, i10)) {
                        Object object = unsafe.getObject(t10, j10);
                        if (object instanceof zzajp) {
                            iZzb = zzakg.zza(i17, (zzajp) object);
                        } else {
                            iZzb = zzakg.zza(i17, (String) object);
                        }
                        i14 = iZzb + i20;
                        zzamgVar = this;
                        break;
                    }
                    zzamgVar = this;
                    i14 = i20;
                    break;
                case 9:
                    if (zzamgVar.zza((zzamg<T>) t10, i12, i15, i13, i10)) {
                        iZza3 = zzamx.zza(i17, unsafe.getObject(t10, j10), (zzamv<?>) zzamgVar.zze(i12));
                        i14 = i20 + iZza3;
                        break;
                    }
                    i14 = i20;
                    break;
                case 10:
                    if (zzamgVar.zza((zzamg<T>) t10, i12, i15, i13, i10)) {
                        iZzb = zzakg.zza(i17, (zzajp) unsafe.getObject(t10, j10));
                        i14 = iZzb + i20;
                        zzamgVar = this;
                        break;
                    }
                    zzamgVar = this;
                    i14 = i20;
                    break;
                case 11:
                    if (zzamgVar.zza((zzamg<T>) t10, i12, i15, i13, i10)) {
                        iZzb = zzakg.zzg(i17, unsafe.getInt(t10, j10));
                        i14 = iZzb + i20;
                        zzamgVar = this;
                        break;
                    }
                    zzamgVar = this;
                    i14 = i20;
                    break;
                case 12:
                    if (zzamgVar.zza((zzamg<T>) t10, i12, i15, i13, i10)) {
                        iZzb = zzakg.zzb(i17, unsafe.getInt(t10, j10));
                        i14 = iZzb + i20;
                        zzamgVar = this;
                        break;
                    }
                    zzamgVar = this;
                    i14 = i20;
                    break;
                case 13:
                    if (zzamgVar.zza((zzamg<T>) t10, i12, i15, i13, i10)) {
                        iZza2 = zzakg.zze(i17, 0);
                        i14 = iZza2 + i20;
                        zzamgVar = this;
                        t10 = t3;
                        break;
                    }
                    zzamgVar = this;
                    t10 = t3;
                    i14 = i20;
                    break;
                case 14:
                    if (zzamgVar.zza((zzamg<T>) t10, i12, i15, i13, i10)) {
                        iZza2 = zzakg.zzc(i17, 0L);
                        i14 = iZza2 + i20;
                        zzamgVar = this;
                        t10 = t3;
                        break;
                    }
                    zzamgVar = this;
                    t10 = t3;
                    i14 = i20;
                    break;
                case 15:
                    if (zzamgVar.zza((zzamg<T>) t10, i12, i15, i13, i10)) {
                        iZzb = zzakg.zzf(i17, unsafe.getInt(t10, j10));
                        i14 = iZzb + i20;
                        zzamgVar = this;
                        break;
                    }
                    zzamgVar = this;
                    i14 = i20;
                    break;
                case 16:
                    if (zzamgVar.zza((zzamg<T>) t10, i12, i15, i13, i10)) {
                        iZzb = zzakg.zzd(i17, unsafe.getLong(t10, j10));
                        i14 = iZzb + i20;
                        zzamgVar = this;
                        break;
                    }
                    zzamgVar = this;
                    i14 = i20;
                    break;
                case 17:
                    if (zzamgVar.zza((zzamg<T>) t10, i12, i15, i13, i10)) {
                        iZza = zzakg.zza(i17, (zzamc) unsafe.getObject(t10, j10), zzamgVar.zze(i12));
                        i14 = iZza + i20;
                        break;
                    }
                    i14 = i20;
                    break;
                case 18:
                    iZza3 = zzamx.zzd(i17, (List) unsafe.getObject(t10, j10), false);
                    i14 = i20 + iZza3;
                    break;
                case 19:
                    iZza3 = zzamx.zzc(i17, (List) unsafe.getObject(t10, j10), false);
                    i14 = i20 + iZza3;
                    break;
                case 20:
                    iZza3 = zzamx.zzf(i17, (List) unsafe.getObject(t10, j10), false);
                    i14 = i20 + iZza3;
                    break;
                case 21:
                    iZza3 = zzamx.zzj(i17, (List) unsafe.getObject(t10, j10), false);
                    i14 = i20 + iZza3;
                    break;
                case 22:
                    iZza3 = zzamx.zze(i17, (List) unsafe.getObject(t10, j10), false);
                    i14 = i20 + iZza3;
                    break;
                case 23:
                    iZza3 = zzamx.zzd(i17, (List) unsafe.getObject(t10, j10), false);
                    i14 = i20 + iZza3;
                    break;
                case 24:
                    iZza3 = zzamx.zzc(i17, (List) unsafe.getObject(t10, j10), false);
                    i14 = i20 + iZza3;
                    break;
                case 25:
                    iZza3 = zzamx.zza(i17, (List<?>) unsafe.getObject(t10, j10), false);
                    i14 = i20 + iZza3;
                    break;
                case 26:
                    iZza3 = zzamx.zzb(i17, (List) unsafe.getObject(t10, j10));
                    i14 = i20 + iZza3;
                    break;
                case 27:
                    iZza3 = zzamx.zzb(i17, (List<?>) unsafe.getObject(t10, j10), (zzamv<?>) zzamgVar.zze(i12));
                    i14 = i20 + iZza3;
                    break;
                case 28:
                    iZza3 = zzamx.zza(i17, (List<zzajp>) unsafe.getObject(t10, j10));
                    i14 = i20 + iZza3;
                    break;
                case 29:
                    iZza3 = zzamx.zzi(i17, (List) unsafe.getObject(t10, j10), false);
                    i14 = i20 + iZza3;
                    break;
                case 30:
                    iZza3 = zzamx.zzb(i17, (List<Integer>) unsafe.getObject(t10, j10), false);
                    i14 = i20 + iZza3;
                    break;
                case 31:
                    iZza3 = zzamx.zzc(i17, (List) unsafe.getObject(t10, j10), false);
                    i14 = i20 + iZza3;
                    break;
                case 32:
                    iZza3 = zzamx.zzd(i17, (List) unsafe.getObject(t10, j10), false);
                    i14 = i20 + iZza3;
                    break;
                case 33:
                    iZza3 = zzamx.zzg(i17, (List) unsafe.getObject(t10, j10), false);
                    i14 = i20 + iZza3;
                    break;
                case 34:
                    iZza3 = zzamx.zzh(i17, (List) unsafe.getObject(t10, j10), false);
                    i14 = i20 + iZza3;
                    break;
                case 35:
                    iZzd = zzamx.zzd((List) unsafe.getObject(t10, j10));
                    if (iZzd > 0) {
                        iZzi = zzakg.zzi(i17);
                        iZzj = zzakg.zzj(iZzd);
                        i14 = iZzj + iZzi + iZzd + i20;
                        break;
                    }
                    i14 = i20;
                    break;
                case 36:
                    iZzd = zzamx.zzc((List) unsafe.getObject(t10, j10));
                    if (iZzd > 0) {
                        iZzi = zzakg.zzi(i17);
                        iZzj = zzakg.zzj(iZzd);
                        i14 = iZzj + iZzi + iZzd + i20;
                        break;
                    }
                    i14 = i20;
                    break;
                case 37:
                    iZzd = zzamx.zzf((List) unsafe.getObject(t10, j10));
                    if (iZzd > 0) {
                        iZzi = zzakg.zzi(i17);
                        iZzj = zzakg.zzj(iZzd);
                        i14 = iZzj + iZzi + iZzd + i20;
                        break;
                    }
                    i14 = i20;
                    break;
                case 38:
                    iZzd = zzamx.zzj((List) unsafe.getObject(t10, j10));
                    if (iZzd > 0) {
                        iZzi = zzakg.zzi(i17);
                        iZzj = zzakg.zzj(iZzd);
                        i14 = iZzj + iZzi + iZzd + i20;
                        break;
                    }
                    i14 = i20;
                    break;
                case 39:
                    iZzd = zzamx.zze((List) unsafe.getObject(t10, j10));
                    if (iZzd > 0) {
                        iZzi = zzakg.zzi(i17);
                        iZzj = zzakg.zzj(iZzd);
                        i14 = iZzj + iZzi + iZzd + i20;
                        break;
                    }
                    i14 = i20;
                    break;
                case 40:
                    iZzd = zzamx.zzd((List) unsafe.getObject(t10, j10));
                    if (iZzd > 0) {
                        iZzi = zzakg.zzi(i17);
                        iZzj = zzakg.zzj(iZzd);
                        i14 = iZzj + iZzi + iZzd + i20;
                        break;
                    }
                    i14 = i20;
                    break;
                case 41:
                    iZzd = zzamx.zzc((List) unsafe.getObject(t10, j10));
                    if (iZzd > 0) {
                        iZzi = zzakg.zzi(i17);
                        iZzj = zzakg.zzj(iZzd);
                        i14 = iZzj + iZzi + iZzd + i20;
                        break;
                    }
                    i14 = i20;
                    break;
                case 42:
                    iZzd = zzamx.zza((List<?>) unsafe.getObject(t10, j10));
                    if (iZzd > 0) {
                        iZzi = zzakg.zzi(i17);
                        iZzj = zzakg.zzj(iZzd);
                        i14 = iZzj + iZzi + iZzd + i20;
                        break;
                    }
                    i14 = i20;
                    break;
                case EACTags.DATE_OF_BIRTH /* 43 */:
                    iZzd = zzamx.zzi((List) unsafe.getObject(t10, j10));
                    if (iZzd > 0) {
                        iZzi = zzakg.zzi(i17);
                        iZzj = zzakg.zzj(iZzd);
                        i14 = iZzj + iZzi + iZzd + i20;
                        break;
                    }
                    i14 = i20;
                    break;
                case 44:
                    iZzd = zzamx.zzb((List) unsafe.getObject(t10, j10));
                    if (iZzd > 0) {
                        iZzi = zzakg.zzi(i17);
                        iZzj = zzakg.zzj(iZzd);
                        i14 = iZzj + iZzi + iZzd + i20;
                        break;
                    }
                    i14 = i20;
                    break;
                case 45:
                    iZzd = zzamx.zzc((List) unsafe.getObject(t10, j10));
                    if (iZzd > 0) {
                        iZzi = zzakg.zzi(i17);
                        iZzj = zzakg.zzj(iZzd);
                        i14 = iZzj + iZzi + iZzd + i20;
                        break;
                    }
                    i14 = i20;
                    break;
                case 46:
                    iZzd = zzamx.zzd((List) unsafe.getObject(t10, j10));
                    if (iZzd > 0) {
                        iZzi = zzakg.zzi(i17);
                        iZzj = zzakg.zzj(iZzd);
                        i14 = iZzj + iZzi + iZzd + i20;
                        break;
                    }
                    i14 = i20;
                    break;
                case EACTags.PIN_USAGE_POLICY /* 47 */:
                    iZzd = zzamx.zzg((List) unsafe.getObject(t10, j10));
                    if (iZzd > 0) {
                        iZzi = zzakg.zzi(i17);
                        iZzj = zzakg.zzj(iZzd);
                        i14 = iZzj + iZzi + iZzd + i20;
                        break;
                    }
                    i14 = i20;
                    break;
                case 48:
                    iZzd = zzamx.zzh((List) unsafe.getObject(t10, j10));
                    if (iZzd > 0) {
                        iZzi = zzakg.zzi(i17);
                        iZzj = zzakg.zzj(iZzd);
                        i14 = iZzj + iZzi + iZzd + i20;
                        break;
                    }
                    i14 = i20;
                    break;
                case 49:
                    iZza3 = zzamx.zza(i17, (List<zzamc>) unsafe.getObject(t10, j10), (zzamv<?>) zzamgVar.zze(i12));
                    i14 = i20 + iZza3;
                    break;
                case 50:
                    iZza3 = zzamgVar.zzr.zza(i17, unsafe.getObject(t10, j10), zzamgVar.zzf(i12));
                    i14 = i20 + iZza3;
                    break;
                case EACTags.TRANSACTION_DATE /* 51 */:
                    if (zzamgVar.zzc((zzamg<T>) t10, i17, i12)) {
                        iZza = zzakg.zza(i17, 0.0d);
                        i14 = iZza + i20;
                        break;
                    }
                    i14 = i20;
                    break;
                case 52:
                    if (zzamgVar.zzc((zzamg<T>) t10, i17, i12)) {
                        iZza = zzakg.zza(i17, CropImageView.DEFAULT_ASPECT_RATIO);
                        i14 = iZza + i20;
                        break;
                    }
                    i14 = i20;
                    break;
                case EACTags.SEX /* 53 */:
                    if (zzamgVar.zzc((zzamg<T>) t10, i17, i12)) {
                        iZza = zzakg.zzb(i17, zzd(t10, j10));
                        i14 = iZza + i20;
                        break;
                    }
                    i14 = i20;
                    break;
                case EACTags.CURRENCY_EXPONENT /* 54 */:
                    if (zzamgVar.zzc((zzamg<T>) t10, i17, i12)) {
                        iZza = zzakg.zze(i17, zzd(t10, j10));
                        i14 = iZza + i20;
                        break;
                    }
                    i14 = i20;
                    break;
                case 55:
                    if (zzamgVar.zzc((zzamg<T>) t10, i17, i12)) {
                        iZza = zzakg.zzd(i17, zzc(t10, j10));
                        i14 = iZza + i20;
                        break;
                    }
                    i14 = i20;
                    break;
                case 56:
                    if (zzamgVar.zzc((zzamg<T>) t10, i17, i12)) {
                        iZza = zzakg.zza(i17, 0L);
                        i14 = iZza + i20;
                        break;
                    }
                    i14 = i20;
                    break;
                case 57:
                    if (zzamgVar.zzc((zzamg<T>) t10, i17, i12)) {
                        iZza = zzakg.zzc(i17, 0);
                        i14 = iZza + i20;
                        break;
                    }
                    i14 = i20;
                    break;
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    if (zzamgVar.zzc((zzamg<T>) t10, i17, i12)) {
                        iZza = zzakg.zza(i17, true);
                        i14 = iZza + i20;
                        break;
                    }
                    i14 = i20;
                    break;
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (zzamgVar.zzc((zzamg<T>) t10, i17, i12)) {
                        Object object2 = unsafe.getObject(t10, j10);
                        if (object2 instanceof zzajp) {
                            iZza = zzakg.zza(i17, (zzajp) object2);
                        } else {
                            iZza = zzakg.zza(i17, (String) object2);
                        }
                        i14 = iZza + i20;
                        break;
                    }
                    i14 = i20;
                    break;
                case 60:
                    if (zzamgVar.zzc((zzamg<T>) t10, i17, i12)) {
                        iZza3 = zzamx.zza(i17, unsafe.getObject(t10, j10), (zzamv<?>) zzamgVar.zze(i12));
                        i14 = i20 + iZza3;
                        break;
                    }
                    i14 = i20;
                    break;
                case 61:
                    if (zzamgVar.zzc((zzamg<T>) t10, i17, i12)) {
                        iZza = zzakg.zza(i17, (zzajp) unsafe.getObject(t10, j10));
                        i14 = iZza + i20;
                        break;
                    }
                    i14 = i20;
                    break;
                case 62:
                    if (zzamgVar.zzc((zzamg<T>) t10, i17, i12)) {
                        iZza = zzakg.zzg(i17, zzc(t10, j10));
                        i14 = iZza + i20;
                        break;
                    }
                    i14 = i20;
                    break;
                case 63:
                    if (zzamgVar.zzc((zzamg<T>) t10, i17, i12)) {
                        iZza = zzakg.zzb(i17, zzc(t10, j10));
                        i14 = iZza + i20;
                        break;
                    }
                    i14 = i20;
                    break;
                case 64:
                    if (zzamgVar.zzc((zzamg<T>) t10, i17, i12)) {
                        iZza = zzakg.zze(i17, 0);
                        i14 = iZza + i20;
                        break;
                    }
                    i14 = i20;
                    break;
                case EACTags.ELEMENT_LIST /* 65 */:
                    if (zzamgVar.zzc((zzamg<T>) t10, i17, i12)) {
                        iZza = zzakg.zzc(i17, 0L);
                        i14 = iZza + i20;
                        break;
                    }
                    i14 = i20;
                    break;
                case EACTags.ADDRESS /* 66 */:
                    if (zzamgVar.zzc((zzamg<T>) t10, i17, i12)) {
                        iZza = zzakg.zzf(i17, zzc(t10, j10));
                        i14 = iZza + i20;
                        break;
                    }
                    i14 = i20;
                    break;
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (zzamgVar.zzc((zzamg<T>) t10, i17, i12)) {
                        iZza = zzakg.zzd(i17, zzd(t10, j10));
                        i14 = iZza + i20;
                        break;
                    }
                    i14 = i20;
                    break;
                case 68:
                    if (zzamgVar.zzc((zzamg<T>) t10, i17, i12)) {
                        iZza = zzakg.zza(i17, (zzamc) unsafe.getObject(t10, j10), zzamgVar.zze(i12));
                        i14 = iZza + i20;
                        break;
                    }
                    i14 = i20;
                    break;
                default:
                    i14 = i20;
                    break;
            }
            i12 += 3;
            i11 = 1048575;
        }
        zzano<?, ?> zzanoVar = zzamgVar.zzp;
        int iZza4 = i14 + zzanoVar.zza((zzano<?, ?>) zzanoVar.zzd(t10));
        if (!zzamgVar.zzh) {
            return iZza4;
        }
        zzakr<T> zzakrVarZza = zzamgVar.zzq.zza(t10);
        int iZza5 = zzakrVarZza.zza.zza();
        int iZza6 = 0;
        for (int i21 = 0; i21 < iZza5; i21++) {
            Map.Entry entryZza = zzakrVarZza.zza.zza(i21);
            iZza6 += zzakr.zza((zzakt<?>) entryZza.getKey(), entryZza.getValue());
        }
        for (Map.Entry entry : zzakrVarZza.zza.zzb()) {
            iZza6 += zzakr.zza((zzakt<?>) entry.getKey(), entry.getValue());
        }
        return iZza4 + iZza6;
    }

    private static <T> boolean zze(T t3, long j10) {
        return ((Boolean) zzanp.zze(t3, j10)).booleanValue();
    }

    private final boolean zzc(T t3, int i10, int i11) {
        return zzanp.zzc(t3, (long) (zzb(i11) & 1048575)) == i10;
    }

    private final int zzb(int i10) {
        return this.zzc[i10 + 2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zzb(T t3, T t10, int i10) {
        int i11 = this.zzc[i10];
        if (zzc((zzamg<T>) t10, i11, i10)) {
            long jZzc = zzc(i10) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(t10, jZzc);
            if (object != null) {
                zzamv zzamvVarZze = zze(i10);
                if (!zzc((zzamg<T>) t3, i11, i10)) {
                    if (!zzg(object)) {
                        unsafe.putObject(t3, jZzc, object);
                    } else {
                        Object objZza = zzamvVarZze.zza();
                        zzamvVarZze.zza(objZza, object);
                        unsafe.putObject(t3, jZzc, objZza);
                    }
                    zzb((zzamg<T>) t3, i11, i10);
                    return;
                }
                Object object2 = unsafe.getObject(t3, jZzc);
                if (!zzg(object2)) {
                    Object objZza2 = zzamvVarZze.zza();
                    zzamvVarZze.zza(objZza2, object2);
                    unsafe.putObject(t3, jZzc, objZza2);
                    object2 = objZza2;
                }
                zzamvVarZze.zza(object2, object);
                return;
            }
            throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + String.valueOf(t10));
        }
    }

    private final void zzb(T t3, int i10) {
        int iZzb = zzb(i10);
        long j10 = 1048575 & iZzb;
        if (j10 == 1048575) {
            return;
        }
        zzanp.zza((Object) t3, j10, (1 << (iZzb >>> 20)) | zzanp.zzc(t3, j10));
    }

    private final void zzb(T t3, int i10, int i11) {
        zzanp.zza((Object) t3, zzb(i11) & 1048575, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzb(T t3, T t10) {
        int length = this.zzc.length;
        int i10 = 0;
        while (true) {
            boolean zZza = true;
            if (i10 < length) {
                int iZzc = zzc(i10);
                long j10 = iZzc & 1048575;
                switch ((iZzc & 267386880) >>> 20) {
                    case 0:
                        if (!zzc(t3, t10, i10) || Double.doubleToLongBits(zzanp.zza(t3, j10)) != Double.doubleToLongBits(zzanp.zza(t10, j10))) {
                            zZza = false;
                            break;
                        }
                        break;
                    case 1:
                        if (!zzc(t3, t10, i10) || Float.floatToIntBits(zzanp.zzb(t3, j10)) != Float.floatToIntBits(zzanp.zzb(t10, j10))) {
                        }
                        break;
                    case 2:
                        if (!zzc(t3, t10, i10) || zzanp.zzd(t3, j10) != zzanp.zzd(t10, j10)) {
                        }
                        break;
                    case 3:
                        if (!zzc(t3, t10, i10) || zzanp.zzd(t3, j10) != zzanp.zzd(t10, j10)) {
                        }
                        break;
                    case 4:
                        if (!zzc(t3, t10, i10) || zzanp.zzc(t3, j10) != zzanp.zzc(t10, j10)) {
                        }
                        break;
                    case 5:
                        if (!zzc(t3, t10, i10) || zzanp.zzd(t3, j10) != zzanp.zzd(t10, j10)) {
                        }
                        break;
                    case 6:
                        if (!zzc(t3, t10, i10) || zzanp.zzc(t3, j10) != zzanp.zzc(t10, j10)) {
                        }
                        break;
                    case 7:
                        if (!zzc(t3, t10, i10) || zzanp.zzh(t3, j10) != zzanp.zzh(t10, j10)) {
                        }
                        break;
                    case 8:
                        if (!zzc(t3, t10, i10) || !zzamx.zza(zzanp.zze(t3, j10), zzanp.zze(t10, j10))) {
                        }
                        break;
                    case 9:
                        if (!zzc(t3, t10, i10) || !zzamx.zza(zzanp.zze(t3, j10), zzanp.zze(t10, j10))) {
                        }
                        break;
                    case 10:
                        if (!zzc(t3, t10, i10) || !zzamx.zza(zzanp.zze(t3, j10), zzanp.zze(t10, j10))) {
                        }
                        break;
                    case 11:
                        if (!zzc(t3, t10, i10) || zzanp.zzc(t3, j10) != zzanp.zzc(t10, j10)) {
                        }
                        break;
                    case 12:
                        if (!zzc(t3, t10, i10) || zzanp.zzc(t3, j10) != zzanp.zzc(t10, j10)) {
                        }
                        break;
                    case 13:
                        if (!zzc(t3, t10, i10) || zzanp.zzc(t3, j10) != zzanp.zzc(t10, j10)) {
                        }
                        break;
                    case 14:
                        if (!zzc(t3, t10, i10) || zzanp.zzd(t3, j10) != zzanp.zzd(t10, j10)) {
                        }
                        break;
                    case 15:
                        if (!zzc(t3, t10, i10) || zzanp.zzc(t3, j10) != zzanp.zzc(t10, j10)) {
                        }
                        break;
                    case 16:
                        if (!zzc(t3, t10, i10) || zzanp.zzd(t3, j10) != zzanp.zzd(t10, j10)) {
                        }
                        break;
                    case 17:
                        if (!zzc(t3, t10, i10) || !zzamx.zza(zzanp.zze(t3, j10), zzanp.zze(t10, j10))) {
                        }
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
                        zZza = zzamx.zza(zzanp.zze(t3, j10), zzanp.zze(t10, j10));
                        break;
                    case 50:
                        zZza = zzamx.zza(zzanp.zze(t3, j10), zzanp.zze(t10, j10));
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
                        long jZzb = zzb(i10) & 1048575;
                        if (zzanp.zzc(t3, jZzb) != zzanp.zzc(t10, jZzb) || !zzamx.zza(zzanp.zze(t3, j10), zzanp.zze(t10, j10))) {
                        }
                        break;
                }
                if (!zZza) {
                    return false;
                }
                i10 += 3;
            } else {
                if (!this.zzp.zzd(t3).equals(this.zzp.zzd(t10))) {
                    return false;
                }
                if (this.zzh) {
                    return this.zzq.zza(t3).equals(this.zzq.zza(t10));
                }
                return true;
            }
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final int zza(T r30, byte[] r31, int r32, int r33, int r34, com.google.android.gms.internal.p002firebaseauthapi.zzajk r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzamg.zza(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.firebase-auth-api.zzajk):int");
    }

    private final int zza(int i10) {
        if (i10 < this.zze || i10 > this.zzf) {
            return -1;
        }
        return zza(i10, 0);
    }

    private final int zza(int i10, int i11) {
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

    /* JADX WARN: Removed duplicated region for block: B:123:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x028a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <T> zzamg<T> zza(Class<T> cls, zzama zzamaVar, zzamk zzamkVar, zzalm zzalmVar, zzano<?, ?> zzanoVar, zzakm<?> zzakmVar, zzalz zzalzVar) {
        int i10;
        int iCharAt;
        int i11;
        int i12;
        int i13;
        int i14;
        int[] iArr;
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
        zzamt zzamtVar;
        int i26;
        int[] iArr2;
        int i27;
        String str;
        int iObjectFieldOffset;
        int i28;
        int i29;
        int iObjectFieldOffset2;
        int iObjectFieldOffset3;
        Field fieldZza;
        int i30;
        char cCharAt9;
        int i31;
        int i32;
        Object obj;
        Field fieldZza2;
        Object obj2;
        Field fieldZza3;
        int i33;
        char cCharAt10;
        int i34;
        char cCharAt11;
        int i35;
        char cCharAt12;
        int i36;
        char cCharAt13;
        if (zzamaVar instanceof zzamt) {
            zzamt zzamtVar2 = (zzamt) zzamaVar;
            String strZzd = zzamtVar2.zzd();
            int length = strZzd.length();
            char c10 = 55296;
            if (strZzd.charAt(0) >= 55296) {
                int i37 = 1;
                while (true) {
                    i10 = i37 + 1;
                    if (strZzd.charAt(i37) < 55296) {
                        break;
                    }
                    i37 = i10;
                }
            } else {
                i10 = 1;
            }
            int i38 = i10 + 1;
            int iCharAt2 = strZzd.charAt(i10);
            if (iCharAt2 >= 55296) {
                int i39 = iCharAt2 & 8191;
                int i40 = 13;
                while (true) {
                    i36 = i38 + 1;
                    cCharAt13 = strZzd.charAt(i38);
                    if (cCharAt13 < 55296) {
                        break;
                    }
                    i39 |= (cCharAt13 & 8191) << i40;
                    i40 += 13;
                    i38 = i36;
                }
                iCharAt2 = i39 | (cCharAt13 << i40);
                i38 = i36;
            }
            if (iCharAt2 == 0) {
                i12 = 0;
                i14 = 0;
                iCharAt = 0;
                i11 = 0;
                i13 = 0;
                i16 = 0;
                iArr = zza;
                i15 = 0;
            } else {
                int i41 = i38 + 1;
                int iCharAt3 = strZzd.charAt(i38);
                if (iCharAt3 >= 55296) {
                    int i42 = iCharAt3 & 8191;
                    int i43 = 13;
                    while (true) {
                        i24 = i41 + 1;
                        cCharAt8 = strZzd.charAt(i41);
                        if (cCharAt8 < 55296) {
                            break;
                        }
                        i42 |= (cCharAt8 & 8191) << i43;
                        i43 += 13;
                        i41 = i24;
                    }
                    iCharAt3 = i42 | (cCharAt8 << i43);
                    i41 = i24;
                }
                int i44 = i41 + 1;
                int iCharAt4 = strZzd.charAt(i41);
                if (iCharAt4 >= 55296) {
                    int i45 = iCharAt4 & 8191;
                    int i46 = 13;
                    while (true) {
                        i23 = i44 + 1;
                        cCharAt7 = strZzd.charAt(i44);
                        if (cCharAt7 < 55296) {
                            break;
                        }
                        i45 |= (cCharAt7 & 8191) << i46;
                        i46 += 13;
                        i44 = i23;
                    }
                    iCharAt4 = i45 | (cCharAt7 << i46);
                    i44 = i23;
                }
                int i47 = i44 + 1;
                int iCharAt5 = strZzd.charAt(i44);
                if (iCharAt5 >= 55296) {
                    int i48 = iCharAt5 & 8191;
                    int i49 = 13;
                    while (true) {
                        i22 = i47 + 1;
                        cCharAt6 = strZzd.charAt(i47);
                        if (cCharAt6 < 55296) {
                            break;
                        }
                        i48 |= (cCharAt6 & 8191) << i49;
                        i49 += 13;
                        i47 = i22;
                    }
                    iCharAt5 = i48 | (cCharAt6 << i49);
                    i47 = i22;
                }
                int i50 = i47 + 1;
                int iCharAt6 = strZzd.charAt(i47);
                if (iCharAt6 >= 55296) {
                    int i51 = iCharAt6 & 8191;
                    int i52 = 13;
                    while (true) {
                        i21 = i50 + 1;
                        cCharAt5 = strZzd.charAt(i50);
                        if (cCharAt5 < 55296) {
                            break;
                        }
                        i51 |= (cCharAt5 & 8191) << i52;
                        i52 += 13;
                        i50 = i21;
                    }
                    iCharAt6 = i51 | (cCharAt5 << i52);
                    i50 = i21;
                }
                int i53 = i50 + 1;
                iCharAt = strZzd.charAt(i50);
                if (iCharAt >= 55296) {
                    int i54 = iCharAt & 8191;
                    int i55 = 13;
                    while (true) {
                        i20 = i53 + 1;
                        cCharAt4 = strZzd.charAt(i53);
                        if (cCharAt4 < 55296) {
                            break;
                        }
                        i54 |= (cCharAt4 & 8191) << i55;
                        i55 += 13;
                        i53 = i20;
                    }
                    iCharAt = i54 | (cCharAt4 << i55);
                    i53 = i20;
                }
                int i56 = i53 + 1;
                int iCharAt7 = strZzd.charAt(i53);
                if (iCharAt7 >= 55296) {
                    int i57 = iCharAt7 & 8191;
                    int i58 = 13;
                    while (true) {
                        i19 = i56 + 1;
                        cCharAt3 = strZzd.charAt(i56);
                        if (cCharAt3 < 55296) {
                            break;
                        }
                        i57 |= (cCharAt3 & 8191) << i58;
                        i58 += 13;
                        i56 = i19;
                    }
                    iCharAt7 = i57 | (cCharAt3 << i58);
                    i56 = i19;
                }
                int i59 = i56 + 1;
                int iCharAt8 = strZzd.charAt(i56);
                if (iCharAt8 >= 55296) {
                    int i60 = iCharAt8 & 8191;
                    int i61 = 13;
                    while (true) {
                        i18 = i59 + 1;
                        cCharAt2 = strZzd.charAt(i59);
                        if (cCharAt2 < 55296) {
                            break;
                        }
                        i60 |= (cCharAt2 & 8191) << i61;
                        i61 += 13;
                        i59 = i18;
                    }
                    iCharAt8 = i60 | (cCharAt2 << i61);
                    i59 = i18;
                }
                int i62 = i59 + 1;
                int iCharAt9 = strZzd.charAt(i59);
                if (iCharAt9 >= 55296) {
                    int i63 = iCharAt9 & 8191;
                    int i64 = 13;
                    while (true) {
                        i17 = i62 + 1;
                        cCharAt = strZzd.charAt(i62);
                        if (cCharAt < 55296) {
                            break;
                        }
                        i63 |= (cCharAt & 8191) << i64;
                        i64 += 13;
                        i62 = i17;
                    }
                    iCharAt9 = i63 | (cCharAt << i64);
                    i62 = i17;
                }
                int[] iArr3 = new int[iCharAt9 + iCharAt7 + iCharAt8];
                int i65 = (iCharAt3 << 1) + iCharAt4;
                int i66 = iCharAt7;
                i11 = iCharAt5;
                i12 = i66;
                i13 = iCharAt6;
                i14 = i65;
                iArr = iArr3;
                i15 = iCharAt3;
                i16 = iCharAt9;
                i38 = i62;
            }
            Unsafe unsafe = zzb;
            Object[] objArrZze = zzamtVar2.zze();
            Class<?> cls2 = zzamtVar2.zza().getClass();
            int[] iArr4 = new int[iCharAt * 3];
            Object[] objArr = new Object[iCharAt << 1];
            int i67 = i16 + i12;
            int i68 = i16;
            int i69 = i67;
            int i70 = 0;
            int i71 = 0;
            while (i38 < length) {
                int i72 = i38 + 1;
                int iCharAt10 = strZzd.charAt(i38);
                if (iCharAt10 >= c10) {
                    int i73 = iCharAt10 & 8191;
                    int i74 = i72;
                    int i75 = 13;
                    while (true) {
                        i35 = i74 + 1;
                        cCharAt12 = strZzd.charAt(i74);
                        if (cCharAt12 < c10) {
                            break;
                        }
                        i73 |= (cCharAt12 & 8191) << i75;
                        i75 += 13;
                        i74 = i35;
                    }
                    iCharAt10 = i73 | (cCharAt12 << i75);
                    i25 = i35;
                } else {
                    i25 = i72;
                }
                int i76 = i25 + 1;
                int iCharAt11 = strZzd.charAt(i25);
                if (iCharAt11 >= c10) {
                    int i77 = iCharAt11 & 8191;
                    int i78 = i76;
                    int i79 = 13;
                    while (true) {
                        i34 = i78 + 1;
                        cCharAt11 = strZzd.charAt(i78);
                        zzamtVar = zzamtVar2;
                        if (cCharAt11 < 55296) {
                            break;
                        }
                        i77 |= (cCharAt11 & 8191) << i79;
                        i79 += 13;
                        i78 = i34;
                        zzamtVar2 = zzamtVar;
                    }
                    iCharAt11 = i77 | (cCharAt11 << i79);
                    i26 = i34;
                } else {
                    zzamtVar = zzamtVar2;
                    i26 = i76;
                }
                int i80 = iCharAt11 & 255;
                int i81 = length;
                if ((iCharAt11 & 1024) != 0) {
                    iArr[i71] = i70;
                    i71++;
                }
                int i82 = iCharAt10;
                if (i80 >= 51) {
                    i29 = i26 + 1;
                    int iCharAt12 = strZzd.charAt(i26);
                    char c11 = 55296;
                    if (iCharAt12 >= 55296) {
                        int i83 = iCharAt12 & 8191;
                        int i84 = 13;
                        while (true) {
                            i33 = i29 + 1;
                            cCharAt10 = strZzd.charAt(i29);
                            if (cCharAt10 < c11) {
                                break;
                            }
                            i83 |= (cCharAt10 & 8191) << i84;
                            i84 += 13;
                            i29 = i33;
                            c11 = 55296;
                        }
                        iCharAt12 = i83 | (cCharAt10 << i84);
                        i29 = i33;
                    }
                    int i85 = i80 - 51;
                    int i86 = iCharAt12;
                    if (i85 != 9 && i85 != 17) {
                        if (i85 == 12 && (zzamtVar.zzb().equals(zzamo.PROTO2) || (iCharAt11 & 2048) != 0)) {
                            i32 = i14 + 1;
                            objArr[((i70 / 3) << 1) + 1] = objArrZze[i14];
                        }
                        int i87 = i86 << 1;
                        obj = objArrZze[i87];
                        if (!(obj instanceof Field)) {
                            fieldZza2 = (Field) obj;
                        } else {
                            fieldZza2 = zza(cls2, (String) obj);
                            objArrZze[i87] = fieldZza2;
                        }
                        iArr2 = iArr4;
                        i27 = i15;
                        iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZza2);
                        int i88 = i87 + 1;
                        obj2 = objArrZze[i88];
                        if (!(obj2 instanceof Field)) {
                            fieldZza3 = (Field) obj2;
                        } else {
                            fieldZza3 = zza(cls2, (String) obj2);
                            objArrZze[i88] = fieldZza3;
                        }
                        iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZza3);
                        str = strZzd;
                        i28 = 0;
                    } else {
                        i32 = i14 + 1;
                        objArr[((i70 / 3) << 1) + 1] = objArrZze[i14];
                    }
                    i14 = i32;
                    int i872 = i86 << 1;
                    obj = objArrZze[i872];
                    if (!(obj instanceof Field)) {
                    }
                    iArr2 = iArr4;
                    i27 = i15;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZza2);
                    int i882 = i872 + 1;
                    obj2 = objArrZze[i882];
                    if (!(obj2 instanceof Field)) {
                    }
                    iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZza3);
                    str = strZzd;
                    i28 = 0;
                } else {
                    iArr2 = iArr4;
                    i27 = i15;
                    int i89 = i14 + 1;
                    Field fieldZza4 = zza(cls2, (String) objArrZze[i14]);
                    if (i80 == 9 || i80 == 17) {
                        objArr[((i70 / 3) << 1) + 1] = fieldZza4.getType();
                    } else {
                        if (i80 == 27 || i80 == 49) {
                            i31 = i14 + 2;
                            objArr[((i70 / 3) << 1) + 1] = objArrZze[i89];
                        } else if (i80 == 12 || i80 == 30 || i80 == 44) {
                            if (zzamtVar.zzb() == zzamo.PROTO2 || (iCharAt11 & 2048) != 0) {
                                i31 = i14 + 2;
                                objArr[((i70 / 3) << 1) + 1] = objArrZze[i89];
                            }
                        } else if (i80 == 50) {
                            int i90 = i68 + 1;
                            iArr[i68] = i70;
                            int i91 = (i70 / 3) << 1;
                            int i92 = i14 + 2;
                            objArr[i91] = objArrZze[i89];
                            if ((iCharAt11 & 2048) != 0) {
                                i89 = i14 + 3;
                                objArr[i91 + 1] = objArrZze[i92];
                                i68 = i90;
                            } else {
                                i68 = i90;
                                i89 = i92;
                            }
                        }
                        i89 = i31;
                    }
                    int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldZza4);
                    if ((iCharAt11 & 4096) == 0 || i80 > 17) {
                        str = strZzd;
                        iObjectFieldOffset = 1048575;
                        i28 = 0;
                    } else {
                        int i93 = i26 + 1;
                        int iCharAt13 = strZzd.charAt(i26);
                        if (iCharAt13 >= 55296) {
                            int i94 = iCharAt13 & 8191;
                            int i95 = 13;
                            while (true) {
                                i30 = i93 + 1;
                                cCharAt9 = strZzd.charAt(i93);
                                if (cCharAt9 < 55296) {
                                    break;
                                }
                                i94 |= (cCharAt9 & 8191) << i95;
                                i95 += 13;
                                i93 = i30;
                            }
                            iCharAt13 = i94 | (cCharAt9 << i95);
                            i93 = i30;
                        }
                        int i96 = (iCharAt13 / 32) + (i27 << 1);
                        Object obj3 = objArrZze[i96];
                        if (obj3 instanceof Field) {
                            fieldZza = (Field) obj3;
                        } else {
                            fieldZza = zza(cls2, (String) obj3);
                            objArrZze[i96] = fieldZza;
                        }
                        str = strZzd;
                        i28 = iCharAt13 % 32;
                        int i97 = i93;
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZza);
                        i26 = i97;
                    }
                    if (i80 >= 18 && i80 <= 49) {
                        iArr[i69] = iObjectFieldOffset4;
                        i69++;
                    }
                    i14 = i89;
                    i29 = i26;
                    iObjectFieldOffset2 = iObjectFieldOffset4;
                    iObjectFieldOffset3 = iObjectFieldOffset;
                }
                int i98 = i70 + 1;
                iArr2[i70] = i82;
                int i99 = i70 + 2;
                iArr2[i98] = ((iCharAt11 & 512) != 0 ? PKIFailureInfo.duplicateCertReq : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 2048) != 0 ? PKIFailureInfo.systemUnavail : 0) | (i80 << 20) | iObjectFieldOffset2;
                i70 += 3;
                iArr2[i99] = (i28 << 20) | iObjectFieldOffset3;
                i38 = i29;
                strZzd = str;
                length = i81;
                zzamtVar2 = zzamtVar;
                i15 = i27;
                iArr4 = iArr2;
                c10 = 55296;
            }
            return new zzamg<>(iArr4, objArr, i11, i13, zzamtVar2.zza(), false, iArr, i16, i67, zzamkVar, zzalmVar, zzanoVar, zzakmVar, zzalzVar);
        }
        throw new NoSuchMethodError();
    }

    private final <UT, UB> UB zza(Object obj, int i10, UB ub2, zzano<UT, UB> zzanoVar, Object obj2) {
        zzald zzaldVarZzd;
        int i11 = this.zzc[i10];
        Object objZze = zzanp.zze(obj, zzc(i10) & 1048575);
        return (objZze == null || (zzaldVarZzd = zzd(i10)) == null) ? ub2 : (UB) zza(i10, i11, this.zzr.zze(objZze), zzaldVarZzd, (zzald) ub2, (zzano<UT, zzald>) zzanoVar, obj2);
    }

    private final <K, V, UT, UB> UB zza(int i10, int i11, Map<K, V> map, zzald zzaldVar, UB ub2, zzano<UT, UB> zzanoVar, Object obj) {
        zzalx<?, ?> zzalxVarZza = this.zzr.zza(zzf(i10));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!zzaldVar.zza(((Integer) next.getValue()).intValue())) {
                if (ub2 == null) {
                    ub2 = zzanoVar.zzc(obj);
                }
                zzaju zzajuVarZzc = zzajp.zzc(zzalu.zza(zzalxVarZza, next.getKey(), next.getValue()));
                try {
                    zzalu.zza(zzajuVarZzc.zzb(), zzalxVarZza, next.getKey(), next.getValue());
                    zzanoVar.zza((zzano<UT, UB>) ub2, i11, zzajuVarZzc.zza());
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return ub2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object zza(T t3, int i10) {
        zzamv zzamvVarZze = zze(i10);
        long jZzc = zzc(i10) & 1048575;
        if (!zzc((zzamg<T>) t3, i10)) {
            return zzamvVarZze.zza();
        }
        Object object = zzb.getObject(t3, jZzc);
        if (zzg(object)) {
            return object;
        }
        Object objZza = zzamvVarZze.zza();
        if (object != null) {
            zzamvVarZze.zza(objZza, object);
        }
        return objZza;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object zza(T t3, int i10, int i11) {
        zzamv zzamvVarZze = zze(i11);
        if (!zzc((zzamg<T>) t3, i10, i11)) {
            return zzamvVarZze.zza();
        }
        Object object = zzb.getObject(t3, zzc(i11) & 1048575);
        if (zzg(object)) {
            return object;
        }
        Object objZza = zzamvVarZze.zza();
        if (object != null) {
            zzamvVarZze.zza(objZza, object);
        }
        return objZza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    public final T zza() {
        return (T) this.zzn.zza(this.zzg);
    }

    private static Field zza(Class<?> cls, String str) {
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

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    public final void zza(T t3, T t10) {
        zzf(t3);
        t10.getClass();
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int iZzc = zzc(i10);
            long j10 = 1048575 & iZzc;
            int i11 = this.zzc[i10];
            switch ((iZzc & 267386880) >>> 20) {
                case 0:
                    if (zzc((zzamg<T>) t10, i10)) {
                        zzanp.zza(t3, j10, zzanp.zza(t10, j10));
                        zzb((zzamg<T>) t3, i10);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzc((zzamg<T>) t10, i10)) {
                        zzanp.zza((Object) t3, j10, zzanp.zzb(t10, j10));
                        zzb((zzamg<T>) t3, i10);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzc((zzamg<T>) t10, i10)) {
                        zzanp.zza((Object) t3, j10, zzanp.zzd(t10, j10));
                        zzb((zzamg<T>) t3, i10);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzc((zzamg<T>) t10, i10)) {
                        zzanp.zza((Object) t3, j10, zzanp.zzd(t10, j10));
                        zzb((zzamg<T>) t3, i10);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzc((zzamg<T>) t10, i10)) {
                        zzanp.zza((Object) t3, j10, zzanp.zzc(t10, j10));
                        zzb((zzamg<T>) t3, i10);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzc((zzamg<T>) t10, i10)) {
                        zzanp.zza((Object) t3, j10, zzanp.zzd(t10, j10));
                        zzb((zzamg<T>) t3, i10);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzc((zzamg<T>) t10, i10)) {
                        zzanp.zza((Object) t3, j10, zzanp.zzc(t10, j10));
                        zzb((zzamg<T>) t3, i10);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzc((zzamg<T>) t10, i10)) {
                        zzanp.zzc(t3, j10, zzanp.zzh(t10, j10));
                        zzb((zzamg<T>) t3, i10);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzc((zzamg<T>) t10, i10)) {
                        zzanp.zza(t3, j10, zzanp.zze(t10, j10));
                        zzb((zzamg<T>) t3, i10);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zza(t3, t10, i10);
                    break;
                case 10:
                    if (zzc((zzamg<T>) t10, i10)) {
                        zzanp.zza(t3, j10, zzanp.zze(t10, j10));
                        zzb((zzamg<T>) t3, i10);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzc((zzamg<T>) t10, i10)) {
                        zzanp.zza((Object) t3, j10, zzanp.zzc(t10, j10));
                        zzb((zzamg<T>) t3, i10);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzc((zzamg<T>) t10, i10)) {
                        zzanp.zza((Object) t3, j10, zzanp.zzc(t10, j10));
                        zzb((zzamg<T>) t3, i10);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzc((zzamg<T>) t10, i10)) {
                        zzanp.zza((Object) t3, j10, zzanp.zzc(t10, j10));
                        zzb((zzamg<T>) t3, i10);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzc((zzamg<T>) t10, i10)) {
                        zzanp.zza((Object) t3, j10, zzanp.zzd(t10, j10));
                        zzb((zzamg<T>) t3, i10);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzc((zzamg<T>) t10, i10)) {
                        zzanp.zza((Object) t3, j10, zzanp.zzc(t10, j10));
                        zzb((zzamg<T>) t3, i10);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzc((zzamg<T>) t10, i10)) {
                        zzanp.zza((Object) t3, j10, zzanp.zzd(t10, j10));
                        zzb((zzamg<T>) t3, i10);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zza(t3, t10, i10);
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
                    this.zzo.zza(t3, t10, j10);
                    break;
                case 50:
                    zzamx.zza(this.zzr, t3, t10, j10);
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
                    if (zzc((zzamg<T>) t10, i11, i10)) {
                        zzanp.zza(t3, j10, zzanp.zze(t10, j10));
                        zzb((zzamg<T>) t3, i11, i10);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzb(t3, t10, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case EACTags.ELEMENT_LIST /* 65 */:
                case EACTags.ADDRESS /* 66 */:
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (zzc((zzamg<T>) t10, i11, i10)) {
                        zzanp.zza(t3, j10, zzanp.zze(t10, j10));
                        zzb((zzamg<T>) t3, i11, i10);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzb(t3, t10, i10);
                    break;
            }
        }
        zzamx.zza(this.zzp, t3, t10);
        if (this.zzh) {
            zzamx.zza(this.zzq, t3, t10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:244:?, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0775 A[Catch: all -> 0x0062, TryCatch #3 {all -> 0x0062, blocks: (B:24:0x0058, B:186:0x0770, B:188:0x0775, B:189:0x077a, B:83:0x013a, B:84:0x014c, B:85:0x0164, B:86:0x017c, B:87:0x0194, B:88:0x01ac, B:90:0x01bc, B:93:0x01c3, B:94:0x01c9, B:95:0x01d7, B:96:0x01ef, B:97:0x0203, B:98:0x021b, B:99:0x0229, B:100:0x0241, B:101:0x0259, B:102:0x0271, B:103:0x0289, B:104:0x02a1, B:105:0x02b9, B:106:0x02d1, B:107:0x02e9, B:109:0x02ff, B:113:0x0320, B:110:0x0309, B:112:0x0311, B:114:0x0331, B:115:0x0349, B:116:0x035d, B:117:0x0371, B:118:0x0385, B:119:0x0399, B:128:0x03cc, B:129:0x03da, B:130:0x03ee, B:131:0x0402, B:132:0x0416, B:133:0x042a, B:134:0x043e, B:135:0x0452, B:136:0x0466, B:137:0x047a, B:138:0x048e, B:139:0x04a2, B:140:0x04b6, B:141:0x04ca, B:146:0x04f1, B:147:0x04ff, B:148:0x0513, B:149:0x052b, B:151:0x0537, B:152:0x0545, B:153:0x0553, B:154:0x0567, B:155:0x057b, B:156:0x058f, B:157:0x05a3, B:158:0x05b7, B:159:0x05cb, B:160:0x05df, B:161:0x05f3, B:162:0x060b, B:163:0x0620, B:164:0x0634, B:165:0x0648, B:166:0x065c, B:168:0x066b, B:171:0x0672, B:172:0x0678, B:173:0x0682, B:174:0x0696, B:175:0x06aa, B:176:0x06c2, B:177:0x06d0, B:178:0x06e4, B:179:0x06f8, B:180:0x070c, B:181:0x0720, B:182:0x0734, B:183:0x0748, B:184:0x075c), top: B:215:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x07a0  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x07ae A[LOOP:1: B:203:0x07aa->B:205:0x07ae, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x07c1  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0781 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(T t3, zzams zzamsVar, zzakk zzakkVar) throws Throwable {
        T t10;
        int i10;
        Object objZza;
        zzakm<?> zzakmVar;
        zzakk zzakkVar2;
        zzano zzanoVar;
        T t11;
        zzamg<T> zzamgVar;
        Object objZza2;
        T t12;
        zzano zzanoVar2;
        zzano zzanoVar3;
        zzamg<T> zzamgVar2;
        zzamg<T> zzamgVar3 = this;
        zzakk zzakkVar3 = zzakkVar;
        zzakkVar3.getClass();
        zzf(t3);
        zzano zzanoVar4 = zzamgVar3.zzp;
        zzakm<?> zzakmVar2 = zzamgVar3.zzq;
        Object objZza3 = null;
        Object objZzb = null;
        while (true) {
            try {
                int iZzc = zzamsVar.zzc();
                int iZza = zzamgVar3.zza(iZzc);
                if (iZza >= 0) {
                    zzakmVar = zzakmVar2;
                    zzakkVar2 = zzakkVar3;
                    zzanoVar = zzanoVar4;
                    t11 = t3;
                    try {
                        int iZzc2 = zzamgVar3.zzc(iZza);
                        switch ((267386880 & iZzc2) >>> 20) {
                            case 0:
                                zzamgVar = zzamgVar3;
                                zzanoVar4 = zzanoVar;
                                zzanp.zza(t11, iZzc2 & 1048575, zzamsVar.zza());
                                zzamgVar.zzb((zzamg<T>) t11, iZza);
                                zzamgVar3 = zzamgVar;
                                zzakkVar3 = zzakkVar2;
                                zzakmVar2 = zzakmVar;
                            case 1:
                                zzamgVar = zzamgVar3;
                                zzanoVar4 = zzanoVar;
                                zzanp.zza((Object) t11, iZzc2 & 1048575, zzamsVar.zzb());
                                zzamgVar.zzb((zzamg<T>) t11, iZza);
                                zzamgVar3 = zzamgVar;
                                zzakkVar3 = zzakkVar2;
                                zzakmVar2 = zzakmVar;
                            case 2:
                                zzamgVar = zzamgVar3;
                                zzanoVar4 = zzanoVar;
                                zzanp.zza((Object) t11, iZzc2 & 1048575, zzamsVar.zzl());
                                zzamgVar.zzb((zzamg<T>) t11, iZza);
                                zzamgVar3 = zzamgVar;
                                zzakkVar3 = zzakkVar2;
                                zzakmVar2 = zzakmVar;
                            case 3:
                                zzamgVar = zzamgVar3;
                                zzanoVar4 = zzanoVar;
                                zzanp.zza((Object) t11, iZzc2 & 1048575, zzamsVar.zzo());
                                zzamgVar.zzb((zzamg<T>) t11, iZza);
                                zzamgVar3 = zzamgVar;
                                zzakkVar3 = zzakkVar2;
                                zzakmVar2 = zzakmVar;
                            case 4:
                                zzamgVar = zzamgVar3;
                                zzanoVar4 = zzanoVar;
                                zzanp.zza((Object) t11, iZzc2 & 1048575, zzamsVar.zzg());
                                zzamgVar.zzb((zzamg<T>) t11, iZza);
                                zzamgVar3 = zzamgVar;
                                zzakkVar3 = zzakkVar2;
                                zzakmVar2 = zzakmVar;
                            case 5:
                                zzamgVar = zzamgVar3;
                                zzanoVar4 = zzanoVar;
                                zzanp.zza((Object) t11, iZzc2 & 1048575, zzamsVar.zzk());
                                zzamgVar.zzb((zzamg<T>) t11, iZza);
                                zzamgVar3 = zzamgVar;
                                zzakkVar3 = zzakkVar2;
                                zzakmVar2 = zzakmVar;
                            case 6:
                                zzamgVar = zzamgVar3;
                                zzanoVar4 = zzanoVar;
                                zzanp.zza((Object) t11, iZzc2 & 1048575, zzamsVar.zzf());
                                zzamgVar.zzb((zzamg<T>) t11, iZza);
                                zzamgVar3 = zzamgVar;
                                zzakkVar3 = zzakkVar2;
                                zzakmVar2 = zzakmVar;
                            case 7:
                                zzamgVar = zzamgVar3;
                                zzanoVar4 = zzanoVar;
                                zzanp.zzc(t11, iZzc2 & 1048575, zzamsVar.zzs());
                                zzamgVar.zzb((zzamg<T>) t11, iZza);
                                zzamgVar3 = zzamgVar;
                                zzakkVar3 = zzakkVar2;
                                zzakmVar2 = zzakmVar;
                            case 8:
                                zzamgVar = zzamgVar3;
                                zzanoVar4 = zzanoVar;
                                zzamgVar.zza((Object) t11, iZzc2, zzamsVar);
                                zzamgVar.zzb((zzamg<T>) t11, iZza);
                                zzamgVar3 = zzamgVar;
                                zzakkVar3 = zzakkVar2;
                                zzakmVar2 = zzakmVar;
                            case 9:
                                zzamgVar = zzamgVar3;
                                zzanoVar4 = zzanoVar;
                                zzamc zzamcVar = (zzamc) zzamgVar.zza((zzamg<T>) t11, iZza);
                                zzamsVar.zzb((zzams) zzamcVar, (zzamv<zzams>) zzamgVar.zze(iZza), zzakkVar2);
                                zzamgVar.zza((zzamg<T>) t11, iZza, zzamcVar);
                                zzamgVar3 = zzamgVar;
                                zzakkVar3 = zzakkVar2;
                                zzakmVar2 = zzakmVar;
                            case 10:
                                zzamgVar = zzamgVar3;
                                zzanoVar4 = zzanoVar;
                                zzanp.zza(t11, iZzc2 & 1048575, zzamsVar.zzp());
                                zzamgVar.zzb((zzamg<T>) t11, iZza);
                                zzamgVar3 = zzamgVar;
                                zzakkVar3 = zzakkVar2;
                                zzakmVar2 = zzakmVar;
                            case 11:
                                zzamgVar = zzamgVar3;
                                zzanoVar4 = zzanoVar;
                                zzanp.zza((Object) t11, iZzc2 & 1048575, zzamsVar.zzj());
                                zzamgVar.zzb((zzamg<T>) t11, iZza);
                                zzamgVar3 = zzamgVar;
                                zzakkVar3 = zzakkVar2;
                                zzakmVar2 = zzakmVar;
                            case 12:
                                zzamgVar = zzamgVar3;
                                zzanoVar4 = zzanoVar;
                                int iZze = zzamsVar.zze();
                                zzald zzaldVarZzd = zzamgVar.zzd(iZza);
                                if (zzaldVarZzd != null && !zzaldVarZzd.zza(iZze)) {
                                    objZza3 = zzamx.zza(t11, iZzc, iZze, objZza3, zzanoVar4);
                                } else {
                                    zzanp.zza((Object) t11, iZzc2 & 1048575, iZze);
                                    zzamgVar.zzb((zzamg<T>) t11, iZza);
                                }
                                zzamgVar3 = zzamgVar;
                                zzakkVar3 = zzakkVar2;
                                zzakmVar2 = zzakmVar;
                                break;
                            case 13:
                                zzamgVar = zzamgVar3;
                                zzanoVar4 = zzanoVar;
                                zzanp.zza((Object) t11, iZzc2 & 1048575, zzamsVar.zzh());
                                zzamgVar.zzb((zzamg<T>) t11, iZza);
                                zzamgVar3 = zzamgVar;
                                zzakkVar3 = zzakkVar2;
                                zzakmVar2 = zzakmVar;
                            case 14:
                                zzamgVar = zzamgVar3;
                                zzanoVar4 = zzanoVar;
                                zzanp.zza((Object) t11, iZzc2 & 1048575, zzamsVar.zzm());
                                zzamgVar.zzb((zzamg<T>) t11, iZza);
                                zzamgVar3 = zzamgVar;
                                zzakkVar3 = zzakkVar2;
                                zzakmVar2 = zzakmVar;
                            case 15:
                                zzamgVar = zzamgVar3;
                                zzanoVar4 = zzanoVar;
                                zzanp.zza((Object) t11, iZzc2 & 1048575, zzamsVar.zzi());
                                zzamgVar.zzb((zzamg<T>) t11, iZza);
                                zzamgVar3 = zzamgVar;
                                zzakkVar3 = zzakkVar2;
                                zzakmVar2 = zzakmVar;
                            case 16:
                                zzamgVar = zzamgVar3;
                                zzanoVar4 = zzanoVar;
                                zzanp.zza((Object) t11, iZzc2 & 1048575, zzamsVar.zzn());
                                zzamgVar.zzb((zzamg<T>) t11, iZza);
                                zzamgVar3 = zzamgVar;
                                zzakkVar3 = zzakkVar2;
                                zzakmVar2 = zzakmVar;
                            case 17:
                                zzamgVar = zzamgVar3;
                                zzanoVar4 = zzanoVar;
                                zzamc zzamcVar2 = (zzamc) zzamgVar.zza((zzamg<T>) t11, iZza);
                                zzamsVar.zza((zzams) zzamcVar2, (zzamv<zzams>) zzamgVar.zze(iZza), zzakkVar2);
                                zzamgVar.zza((zzamg<T>) t11, iZza, zzamcVar2);
                                zzamgVar3 = zzamgVar;
                                zzakkVar3 = zzakkVar2;
                                zzakmVar2 = zzakmVar;
                            case 18:
                                zzamgVar = zzamgVar3;
                                zzanoVar4 = zzanoVar;
                                zzamsVar.zzc(zzamgVar.zzo.zza(t11, iZzc2 & 1048575));
                                zzamgVar3 = zzamgVar;
                                zzakkVar3 = zzakkVar2;
                                zzakmVar2 = zzakmVar;
                            case 19:
                                zzamgVar = zzamgVar3;
                                zzanoVar4 = zzanoVar;
                                zzamsVar.zzg(zzamgVar.zzo.zza(t11, iZzc2 & 1048575));
                                zzamgVar3 = zzamgVar;
                                zzakkVar3 = zzakkVar2;
                                zzakmVar2 = zzakmVar;
                            case 20:
                                zzamgVar = zzamgVar3;
                                zzanoVar4 = zzanoVar;
                                zzamsVar.zzi(zzamgVar.zzo.zza(t11, iZzc2 & 1048575));
                                zzamgVar3 = zzamgVar;
                                zzakkVar3 = zzakkVar2;
                                zzakmVar2 = zzakmVar;
                            case 21:
                                zzamgVar = zzamgVar3;
                                zzanoVar4 = zzanoVar;
                                zzamsVar.zzq(zzamgVar.zzo.zza(t11, iZzc2 & 1048575));
                                zzamgVar3 = zzamgVar;
                                zzakkVar3 = zzakkVar2;
                                zzakmVar2 = zzakmVar;
                            case 22:
                                zzamgVar = zzamgVar3;
                                zzanoVar4 = zzanoVar;
                                zzamsVar.zzh(zzamgVar.zzo.zza(t11, iZzc2 & 1048575));
                                zzamgVar3 = zzamgVar;
                                zzakkVar3 = zzakkVar2;
                                zzakmVar2 = zzakmVar;
                            case 23:
                                zzamgVar = zzamgVar3;
                                zzanoVar4 = zzanoVar;
                                zzamsVar.zzf(zzamgVar.zzo.zza(t11, iZzc2 & 1048575));
                                zzamgVar3 = zzamgVar;
                                zzakkVar3 = zzakkVar2;
                                zzakmVar2 = zzakmVar;
                            case 24:
                                zzamgVar = zzamgVar3;
                                zzanoVar4 = zzanoVar;
                                zzamsVar.zze(zzamgVar.zzo.zza(t11, iZzc2 & 1048575));
                                zzamgVar3 = zzamgVar;
                                zzakkVar3 = zzakkVar2;
                                zzakmVar2 = zzakmVar;
                            case 25:
                                zzamgVar = zzamgVar3;
                                zzanoVar4 = zzanoVar;
                                zzamsVar.zza(zzamgVar.zzo.zza(t11, iZzc2 & 1048575));
                                zzamgVar3 = zzamgVar;
                                zzakkVar3 = zzakkVar2;
                                zzakmVar2 = zzakmVar;
                            case 26:
                                zzamgVar = zzamgVar3;
                                zzanoVar4 = zzanoVar;
                                if (zzg(iZzc2)) {
                                    zzamsVar.zzo(zzamgVar.zzo.zza(t11, iZzc2 & 1048575));
                                } else {
                                    zzamsVar.zzn(zzamgVar.zzo.zza(t11, iZzc2 & 1048575));
                                }
                                zzamgVar3 = zzamgVar;
                                zzakkVar3 = zzakkVar2;
                                zzakmVar2 = zzakmVar;
                            case 27:
                                zzamgVar = zzamgVar3;
                                zzanoVar4 = zzanoVar;
                                zzamsVar.zzb((List) zzamgVar.zzo.zza(t11, iZzc2 & 1048575), (zzamv) zzamgVar.zze(iZza), zzakkVar2);
                                zzamgVar3 = zzamgVar;
                                zzakkVar3 = zzakkVar2;
                                zzakmVar2 = zzakmVar;
                            case 28:
                                zzamgVar = zzamgVar3;
                                zzanoVar4 = zzanoVar;
                                zzamsVar.zzb(zzamgVar.zzo.zza(t11, iZzc2 & 1048575));
                                zzamgVar3 = zzamgVar;
                                zzakkVar3 = zzakkVar2;
                                zzakmVar2 = zzakmVar;
                            case 29:
                                zzamgVar = zzamgVar3;
                                zzanoVar4 = zzanoVar;
                                zzamsVar.zzp(zzamgVar.zzo.zza(t11, iZzc2 & 1048575));
                                zzamgVar3 = zzamgVar;
                                zzakkVar3 = zzakkVar2;
                                zzakmVar2 = zzakmVar;
                            case 30:
                                zzamgVar = zzamgVar3;
                                List<Integer> listZza = zzamgVar.zzo.zza(t11, iZzc2 & 1048575);
                                zzamsVar.zzd(listZza);
                                objZza2 = zzamx.zza(t11, iZzc, listZza, zzamgVar.zzd(iZza), objZza3, zzanoVar);
                                zzanoVar4 = zzanoVar;
                                objZza3 = objZza2;
                                zzamgVar3 = zzamgVar;
                                zzakkVar3 = zzakkVar2;
                                zzakmVar2 = zzakmVar;
                            case 31:
                                zzamgVar = zzamgVar3;
                                zzanoVar4 = zzanoVar;
                                zzamsVar.zzj(zzamgVar.zzo.zza(t11, iZzc2 & 1048575));
                                zzamgVar3 = zzamgVar;
                                zzakkVar3 = zzakkVar2;
                                zzakmVar2 = zzakmVar;
                            case 32:
                                zzamgVar = zzamgVar3;
                                zzanoVar4 = zzanoVar;
                                zzamsVar.zzk(zzamgVar.zzo.zza(t11, iZzc2 & 1048575));
                                zzamgVar3 = zzamgVar;
                                zzakkVar3 = zzakkVar2;
                                zzakmVar2 = zzakmVar;
                            case 33:
                                zzamgVar = zzamgVar3;
                                zzanoVar4 = zzanoVar;
                                zzamsVar.zzl(zzamgVar.zzo.zza(t11, iZzc2 & 1048575));
                                zzamgVar3 = zzamgVar;
                                zzakkVar3 = zzakkVar2;
                                zzakmVar2 = zzakmVar;
                            case 34:
                                zzamgVar = zzamgVar3;
                                zzanoVar4 = zzanoVar;
                                zzamsVar.zzm(zzamgVar.zzo.zza(t11, iZzc2 & 1048575));
                                zzamgVar3 = zzamgVar;
                                zzakkVar3 = zzakkVar2;
                                zzakmVar2 = zzakmVar;
                            case 35:
                                zzamgVar = zzamgVar3;
                                zzanoVar4 = zzanoVar;
                                zzamsVar.zzc(zzamgVar.zzo.zza(t11, iZzc2 & 1048575));
                                zzamgVar3 = zzamgVar;
                                zzakkVar3 = zzakkVar2;
                                zzakmVar2 = zzakmVar;
                            case 36:
                                zzamgVar = zzamgVar3;
                                zzanoVar4 = zzanoVar;
                                zzamsVar.zzg(zzamgVar.zzo.zza(t11, iZzc2 & 1048575));
                                zzamgVar3 = zzamgVar;
                                zzakkVar3 = zzakkVar2;
                                zzakmVar2 = zzakmVar;
                            case 37:
                                zzamgVar = zzamgVar3;
                                zzanoVar4 = zzanoVar;
                                zzamsVar.zzi(zzamgVar.zzo.zza(t11, iZzc2 & 1048575));
                                zzamgVar3 = zzamgVar;
                                zzakkVar3 = zzakkVar2;
                                zzakmVar2 = zzakmVar;
                            case 38:
                                zzamgVar = zzamgVar3;
                                zzanoVar4 = zzanoVar;
                                zzamsVar.zzq(zzamgVar.zzo.zza(t11, iZzc2 & 1048575));
                                zzamgVar3 = zzamgVar;
                                zzakkVar3 = zzakkVar2;
                                zzakmVar2 = zzakmVar;
                            case 39:
                                zzamgVar = zzamgVar3;
                                zzanoVar4 = zzanoVar;
                                zzamsVar.zzh(zzamgVar.zzo.zza(t11, iZzc2 & 1048575));
                                zzamgVar3 = zzamgVar;
                                zzakkVar3 = zzakkVar2;
                                zzakmVar2 = zzakmVar;
                            case 40:
                                zzamgVar = zzamgVar3;
                                zzanoVar4 = zzanoVar;
                                zzamsVar.zzf(zzamgVar.zzo.zza(t11, iZzc2 & 1048575));
                                zzamgVar3 = zzamgVar;
                                zzakkVar3 = zzakkVar2;
                                zzakmVar2 = zzakmVar;
                            case 41:
                                zzamgVar = zzamgVar3;
                                zzanoVar4 = zzanoVar;
                                zzamsVar.zze(zzamgVar.zzo.zza(t11, iZzc2 & 1048575));
                                zzamgVar3 = zzamgVar;
                                zzakkVar3 = zzakkVar2;
                                zzakmVar2 = zzakmVar;
                            case 42:
                                zzamgVar = zzamgVar3;
                                zzanoVar4 = zzanoVar;
                                zzamsVar.zza(zzamgVar.zzo.zza(t11, iZzc2 & 1048575));
                                zzamgVar3 = zzamgVar;
                                zzakkVar3 = zzakkVar2;
                                zzakmVar2 = zzakmVar;
                            case EACTags.DATE_OF_BIRTH /* 43 */:
                                zzamgVar = zzamgVar3;
                                zzanoVar4 = zzanoVar;
                                zzamsVar.zzp(zzamgVar.zzo.zza(t11, iZzc2 & 1048575));
                                zzamgVar3 = zzamgVar;
                                zzakkVar3 = zzakkVar2;
                                zzakmVar2 = zzakmVar;
                            case 44:
                                zzamgVar = zzamgVar3;
                                t12 = t11;
                                List<Integer> listZza2 = zzamgVar.zzo.zza(t12, iZzc2 & 1048575);
                                zzamsVar.zzd(listZza2);
                                zzald zzaldVarZzd2 = zzamgVar.zzd(iZza);
                                Object obj = objZza3;
                                try {
                                    objZza2 = zzamx.zza(t12, iZzc, listZza2, zzaldVarZzd2, obj, zzanoVar);
                                    zzanoVar4 = zzanoVar;
                                    objZza3 = objZza2;
                                } catch (zzale unused) {
                                    zzanoVar3 = zzanoVar;
                                    objZza3 = obj;
                                    zzanoVar4 = zzanoVar3;
                                    zzanoVar4.zza(zzamsVar);
                                    if (objZza3 == null) {
                                    }
                                    if (!zzanoVar4.zza((zzano) objZza3, zzamsVar, 0)) {
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    zzanoVar2 = zzanoVar;
                                    objZza3 = obj;
                                    zzanoVar4 = zzanoVar2;
                                    t10 = t12;
                                    zzamgVar3 = zzamgVar;
                                    i10 = zzamgVar3.zzl;
                                    objZza = objZza3;
                                    while (i10 < zzamgVar3.zzm) {
                                    }
                                    T t13 = t10;
                                    if (objZza != null) {
                                    }
                                    throw th;
                                }
                                zzamgVar3 = zzamgVar;
                                zzakkVar3 = zzakkVar2;
                                zzakmVar2 = zzakmVar;
                                break;
                            case 45:
                                zzamgVar = zzamgVar3;
                                zzanoVar4 = zzanoVar;
                                zzamsVar.zzj(zzamgVar.zzo.zza(t11, iZzc2 & 1048575));
                                zzamgVar3 = zzamgVar;
                                zzakkVar3 = zzakkVar2;
                                zzakmVar2 = zzakmVar;
                            case 46:
                                zzamgVar = zzamgVar3;
                                zzanoVar4 = zzanoVar;
                                zzamsVar.zzk(zzamgVar.zzo.zza(t11, iZzc2 & 1048575));
                                zzamgVar3 = zzamgVar;
                                zzakkVar3 = zzakkVar2;
                                zzakmVar2 = zzakmVar;
                            case EACTags.PIN_USAGE_POLICY /* 47 */:
                                zzamgVar = zzamgVar3;
                                zzanoVar4 = zzanoVar;
                                zzamsVar.zzl(zzamgVar.zzo.zza(t11, iZzc2 & 1048575));
                                zzamgVar3 = zzamgVar;
                                zzakkVar3 = zzakkVar2;
                                zzakmVar2 = zzakmVar;
                            case 48:
                                zzamgVar = zzamgVar3;
                                zzanoVar4 = zzanoVar;
                                zzamsVar.zzm(zzamgVar.zzo.zza(t11, iZzc2 & 1048575));
                                zzamgVar3 = zzamgVar;
                                zzakkVar3 = zzakkVar2;
                                zzakmVar2 = zzakmVar;
                            case 49:
                                zzamgVar = zzamgVar3;
                                zzanoVar4 = zzanoVar;
                                zzamsVar.zza((List) zzamgVar.zzo.zza(t11, iZzc2 & 1048575), (zzamv) zzamgVar.zze(iZza), zzakkVar2);
                                zzamgVar3 = zzamgVar;
                                zzakkVar3 = zzakkVar2;
                                zzakmVar2 = zzakmVar;
                            case 50:
                                zzamgVar = zzamgVar3;
                                zzanoVar4 = zzanoVar;
                                Object objZzf = zzamgVar.zzf(iZza);
                                long jZzc = zzamgVar.zzc(iZza) & 1048575;
                                Object objZze = zzanp.zze(t11, jZzc);
                                if (objZze == null) {
                                    objZze = zzamgVar.zzr.zzb(objZzf);
                                    zzanp.zza(t11, jZzc, objZze);
                                } else if (zzamgVar.zzr.zzf(objZze)) {
                                    Object objZzb2 = zzamgVar.zzr.zzb(objZzf);
                                    zzamgVar.zzr.zza(objZzb2, objZze);
                                    zzanp.zza(t11, jZzc, objZzb2);
                                    objZze = objZzb2;
                                }
                                zzamsVar.zza(zzamgVar.zzr.zze(objZze), zzamgVar.zzr.zza(objZzf), zzakkVar2);
                                zzamgVar3 = zzamgVar;
                                zzakkVar3 = zzakkVar2;
                                zzakmVar2 = zzakmVar;
                            case EACTags.TRANSACTION_DATE /* 51 */:
                                zzamgVar = zzamgVar3;
                                zzanoVar4 = zzanoVar;
                                zzanp.zza(t11, iZzc2 & 1048575, Double.valueOf(zzamsVar.zza()));
                                zzamgVar.zzb((zzamg<T>) t11, iZzc, iZza);
                                zzamgVar3 = zzamgVar;
                                zzakkVar3 = zzakkVar2;
                                zzakmVar2 = zzakmVar;
                            case 52:
                                zzamgVar = zzamgVar3;
                                zzanoVar4 = zzanoVar;
                                zzanp.zza(t11, iZzc2 & 1048575, Float.valueOf(zzamsVar.zzb()));
                                zzamgVar.zzb((zzamg<T>) t11, iZzc, iZza);
                                zzamgVar3 = zzamgVar;
                                zzakkVar3 = zzakkVar2;
                                zzakmVar2 = zzakmVar;
                            case EACTags.SEX /* 53 */:
                                zzamgVar = zzamgVar3;
                                zzanoVar4 = zzanoVar;
                                zzanp.zza(t11, iZzc2 & 1048575, Long.valueOf(zzamsVar.zzl()));
                                zzamgVar.zzb((zzamg<T>) t11, iZzc, iZza);
                                zzamgVar3 = zzamgVar;
                                zzakkVar3 = zzakkVar2;
                                zzakmVar2 = zzakmVar;
                            case EACTags.CURRENCY_EXPONENT /* 54 */:
                                zzamgVar = zzamgVar3;
                                zzanoVar4 = zzanoVar;
                                zzanp.zza(t11, iZzc2 & 1048575, Long.valueOf(zzamsVar.zzo()));
                                zzamgVar.zzb((zzamg<T>) t11, iZzc, iZza);
                                zzamgVar3 = zzamgVar;
                                zzakkVar3 = zzakkVar2;
                                zzakmVar2 = zzakmVar;
                            case 55:
                                zzamgVar = zzamgVar3;
                                zzanoVar4 = zzanoVar;
                                zzanp.zza(t11, iZzc2 & 1048575, Integer.valueOf(zzamsVar.zzg()));
                                zzamgVar.zzb((zzamg<T>) t11, iZzc, iZza);
                                zzamgVar3 = zzamgVar;
                                zzakkVar3 = zzakkVar2;
                                zzakmVar2 = zzakmVar;
                            case 56:
                                zzamgVar = zzamgVar3;
                                zzanoVar4 = zzanoVar;
                                zzanp.zza(t11, iZzc2 & 1048575, Long.valueOf(zzamsVar.zzk()));
                                zzamgVar.zzb((zzamg<T>) t11, iZzc, iZza);
                                zzamgVar3 = zzamgVar;
                                zzakkVar3 = zzakkVar2;
                                zzakmVar2 = zzakmVar;
                            case 57:
                                zzamgVar = zzamgVar3;
                                zzanoVar4 = zzanoVar;
                                zzanp.zza(t11, iZzc2 & 1048575, Integer.valueOf(zzamsVar.zzf()));
                                zzamgVar.zzb((zzamg<T>) t11, iZzc, iZza);
                                zzamgVar3 = zzamgVar;
                                zzakkVar3 = zzakkVar2;
                                zzakmVar2 = zzakmVar;
                            case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                                zzamgVar = zzamgVar3;
                                zzanoVar4 = zzanoVar;
                                zzanp.zza(t11, iZzc2 & 1048575, Boolean.valueOf(zzamsVar.zzs()));
                                zzamgVar.zzb((zzamg<T>) t11, iZzc, iZza);
                                zzamgVar3 = zzamgVar;
                                zzakkVar3 = zzakkVar2;
                                zzakmVar2 = zzakmVar;
                            case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                                zzamgVar = zzamgVar3;
                                zzanoVar4 = zzanoVar;
                                zzamgVar.zza((Object) t11, iZzc2, zzamsVar);
                                zzamgVar.zzb((zzamg<T>) t11, iZzc, iZza);
                                zzamgVar3 = zzamgVar;
                                zzakkVar3 = zzakkVar2;
                                zzakmVar2 = zzakmVar;
                            case 60:
                                zzamgVar = zzamgVar3;
                                zzanoVar4 = zzanoVar;
                                zzamc zzamcVar3 = (zzamc) zzamgVar.zza((zzamg<T>) t11, iZzc, iZza);
                                zzamsVar.zzb((zzams) zzamcVar3, (zzamv<zzams>) zzamgVar.zze(iZza), zzakkVar2);
                                zzamgVar.zza((zzamg<T>) t11, iZzc, iZza, zzamcVar3);
                                zzamgVar3 = zzamgVar;
                                zzakkVar3 = zzakkVar2;
                                zzakmVar2 = zzakmVar;
                            case 61:
                                zzamgVar = zzamgVar3;
                                zzanoVar4 = zzanoVar;
                                zzanp.zza(t11, iZzc2 & 1048575, zzamsVar.zzp());
                                zzamgVar.zzb((zzamg<T>) t11, iZzc, iZza);
                                zzamgVar3 = zzamgVar;
                                zzakkVar3 = zzakkVar2;
                                zzakmVar2 = zzakmVar;
                            case 62:
                                zzamgVar = zzamgVar3;
                                zzanoVar4 = zzanoVar;
                                zzanp.zza(t11, iZzc2 & 1048575, Integer.valueOf(zzamsVar.zzj()));
                                zzamgVar.zzb((zzamg<T>) t11, iZzc, iZza);
                                zzamgVar3 = zzamgVar;
                                zzakkVar3 = zzakkVar2;
                                zzakmVar2 = zzakmVar;
                            case 63:
                                zzamgVar = zzamgVar3;
                                zzanoVar4 = zzanoVar;
                                int iZze2 = zzamsVar.zze();
                                zzald zzaldVarZzd3 = zzamgVar.zzd(iZza);
                                if (zzaldVarZzd3 != null && !zzaldVarZzd3.zza(iZze2)) {
                                    objZza3 = zzamx.zza(t11, iZzc, iZze2, objZza3, zzanoVar4);
                                } else {
                                    zzanp.zza(t11, iZzc2 & 1048575, Integer.valueOf(iZze2));
                                    zzamgVar.zzb((zzamg<T>) t11, iZzc, iZza);
                                }
                                zzamgVar3 = zzamgVar;
                                zzakkVar3 = zzakkVar2;
                                zzakmVar2 = zzakmVar;
                                break;
                            case 64:
                                zzamgVar = zzamgVar3;
                                zzanoVar4 = zzanoVar;
                                zzanp.zza(t11, iZzc2 & 1048575, Integer.valueOf(zzamsVar.zzh()));
                                zzamgVar.zzb((zzamg<T>) t11, iZzc, iZza);
                                zzamgVar3 = zzamgVar;
                                zzakkVar3 = zzakkVar2;
                                zzakmVar2 = zzakmVar;
                            case EACTags.ELEMENT_LIST /* 65 */:
                                zzamgVar = zzamgVar3;
                                zzanoVar4 = zzanoVar;
                                zzanp.zza(t11, iZzc2 & 1048575, Long.valueOf(zzamsVar.zzm()));
                                zzamgVar.zzb((zzamg<T>) t11, iZzc, iZza);
                                zzamgVar3 = zzamgVar;
                                zzakkVar3 = zzakkVar2;
                                zzakmVar2 = zzakmVar;
                            case EACTags.ADDRESS /* 66 */:
                                zzamgVar = zzamgVar3;
                                zzanoVar4 = zzanoVar;
                                zzanp.zza(t11, iZzc2 & 1048575, Integer.valueOf(zzamsVar.zzi()));
                                zzamgVar.zzb((zzamg<T>) t11, iZzc, iZza);
                                zzamgVar3 = zzamgVar;
                                zzakkVar3 = zzakkVar2;
                                zzakmVar2 = zzakmVar;
                            case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                                zzamgVar = zzamgVar3;
                                zzanoVar4 = zzanoVar;
                                zzanp.zza(t11, iZzc2 & 1048575, Long.valueOf(zzamsVar.zzn()));
                                zzamgVar.zzb((zzamg<T>) t11, iZzc, iZza);
                                zzamgVar3 = zzamgVar;
                                zzakkVar3 = zzakkVar2;
                                zzakmVar2 = zzakmVar;
                            case 68:
                                zzamgVar = zzamgVar3;
                                t12 = t11;
                                zzanoVar4 = zzanoVar;
                                try {
                                    zzamc zzamcVar4 = (zzamc) zzamgVar.zza((zzamg<T>) t12, iZzc, iZza);
                                    zzamsVar.zza((zzams) zzamcVar4, (zzamv<zzams>) zzamgVar.zze(iZza), zzakkVar2);
                                    zzamgVar.zza((zzamg<T>) t12, iZzc, iZza, zzamcVar4);
                                } catch (zzale unused2) {
                                    zzanoVar4.zza(zzamsVar);
                                    if (objZza3 == null) {
                                        objZza3 = zzanoVar4.zzc(t12);
                                    }
                                    if (!zzanoVar4.zza((zzano) objZza3, zzamsVar, 0)) {
                                        int i11 = zzamgVar.zzl;
                                        Object objZza4 = objZza3;
                                        while (i11 < zzamgVar.zzm) {
                                            T t14 = t12;
                                            objZza4 = zzamgVar.zza((Object) t14, zzamgVar.zzk[i11], (int) objZza4, (zzano<UT, int>) zzanoVar4, (Object) t3);
                                            i11++;
                                            t12 = t14;
                                        }
                                        T t15 = t12;
                                        if (objZza4 != null) {
                                            zzanoVar4.zzb((Object) t15, (T) objZza4);
                                            return;
                                        }
                                        return;
                                    }
                                    zzamgVar3 = zzamgVar;
                                    zzakkVar3 = zzakkVar2;
                                    zzakmVar2 = zzakmVar;
                                }
                                zzamgVar3 = zzamgVar;
                                zzakkVar3 = zzakkVar2;
                                zzakmVar2 = zzakmVar;
                            default:
                                if (objZza3 == null) {
                                    try {
                                        objZza3 = zzanoVar.zzc(t11);
                                    } catch (zzale unused3) {
                                        zzanoVar3 = zzanoVar;
                                        zzamgVar = zzamgVar3;
                                        t12 = t11;
                                        zzanoVar4 = zzanoVar3;
                                        zzanoVar4.zza(zzamsVar);
                                        if (objZza3 == null) {
                                        }
                                        if (!zzanoVar4.zza((zzano) objZza3, zzamsVar, 0)) {
                                        }
                                    }
                                }
                                try {
                                    if (!zzanoVar.zza((zzano) objZza3, zzamsVar, 0)) {
                                        int i12 = zzamgVar3.zzl;
                                        Object objZza5 = objZza3;
                                        while (i12 < zzamgVar3.zzm) {
                                            T t16 = t11;
                                            zzano zzanoVar5 = zzanoVar;
                                            objZza5 = zzamgVar3.zza((Object) t16, zzamgVar3.zzk[i12], (int) objZza5, (zzano<UT, int>) zzanoVar5, (Object) t3);
                                            i12++;
                                            t11 = t16;
                                            zzamgVar3 = zzamgVar3;
                                            zzanoVar = zzanoVar5;
                                        }
                                        zzano zzanoVar6 = zzanoVar;
                                        zzamgVar2 = zzamgVar3;
                                        T t17 = t11;
                                        if (objZza5 != null) {
                                            zzanoVar6.zzb((Object) t17, (T) objZza5);
                                            break;
                                        }
                                    } else {
                                        zzamgVar = zzamgVar3;
                                        zzanoVar4 = zzanoVar;
                                        zzamgVar3 = zzamgVar;
                                        zzakkVar3 = zzakkVar2;
                                        zzakmVar2 = zzakmVar;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    zzanoVar2 = zzanoVar;
                                    zzamgVar = zzamgVar3;
                                    t12 = t11;
                                    zzanoVar4 = zzanoVar2;
                                    t10 = t12;
                                    zzamgVar3 = zzamgVar;
                                    i10 = zzamgVar3.zzl;
                                    objZza = objZza3;
                                    while (i10 < zzamgVar3.zzm) {
                                    }
                                    T t132 = t10;
                                    if (objZza != null) {
                                    }
                                    throw th;
                                }
                                break;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        t10 = t11;
                        zzanoVar4 = zzanoVar;
                        i10 = zzamgVar3.zzl;
                        objZza = objZza3;
                        while (i10 < zzamgVar3.zzm) {
                        }
                        T t1322 = t10;
                        if (objZza != null) {
                        }
                        throw th;
                    }
                } else if (iZzc == Integer.MAX_VALUE) {
                    int i13 = zzamgVar3.zzl;
                    Object objZza6 = objZza3;
                    while (i13 < zzamgVar3.zzm) {
                        objZza6 = zzamgVar3.zza((Object) t3, zzamgVar3.zzk[i13], (int) objZza6, (zzano<UT, int>) zzanoVar4, (Object) t3);
                        i13++;
                        zzamgVar3 = zzamgVar3;
                    }
                    zzamgVar2 = zzamgVar3;
                    if (objZza6 != null) {
                        zzanoVar4.zzb((Object) t3, (T) objZza6);
                    }
                } else {
                    zzamgVar = zzamgVar3;
                    t12 = t3;
                    try {
                        Object objZza7 = !zzamgVar.zzh ? null : zzakmVar2.zza(zzakkVar3, zzamgVar.zzg, iZzc);
                        if (objZza7 != null) {
                            if (objZzb == null) {
                                try {
                                    objZzb = zzakmVar2.zzb(t12);
                                } catch (Throwable th5) {
                                    th = th5;
                                    t10 = t12;
                                    zzamgVar3 = zzamgVar;
                                    i10 = zzamgVar3.zzl;
                                    objZza = objZza3;
                                    while (i10 < zzamgVar3.zzm) {
                                    }
                                    T t13222 = t10;
                                    if (objZza != null) {
                                    }
                                    throw th;
                                }
                            }
                            zzakr<T> zzakrVar = objZzb;
                            zzano zzanoVar7 = zzanoVar4;
                            try {
                                objZza3 = zzakmVar2.zza(t12, zzamsVar, objZza7, zzakkVar3, zzakrVar, objZza3, zzanoVar7);
                                objZzb = zzakrVar;
                                zzanoVar4 = zzanoVar7;
                                zzakmVar = zzakmVar2;
                                zzakkVar2 = zzakkVar3;
                                zzamgVar3 = zzamgVar;
                                zzakkVar3 = zzakkVar2;
                                zzakmVar2 = zzakmVar;
                            } catch (Throwable th6) {
                                th = th6;
                                t10 = t12;
                                zzanoVar4 = zzanoVar7;
                            }
                        } else {
                            zzakmVar = zzakmVar2;
                            t10 = t12;
                            zzakkVar2 = zzakkVar3;
                            try {
                                zzanoVar4.zza(zzamsVar);
                                if (objZza3 == null) {
                                    try {
                                        objZza3 = zzanoVar4.zzc(t10);
                                    } catch (Throwable th7) {
                                        th = th7;
                                    }
                                }
                                if (!zzanoVar4.zza((zzano) objZza3, zzamsVar, 0)) {
                                    int i14 = zzamgVar.zzl;
                                    Object objZza8 = objZza3;
                                    while (i14 < zzamgVar.zzm) {
                                        zzamg<T> zzamgVar4 = zzamgVar;
                                        objZza8 = zzamgVar4.zza((Object) t10, zzamgVar.zzk[i14], (int) objZza8, (zzano<UT, int>) zzanoVar4, (Object) t3);
                                        i14++;
                                        zzanoVar4 = zzanoVar4;
                                        zzamgVar = zzamgVar4;
                                    }
                                    zzano zzanoVar8 = zzanoVar4;
                                    if (objZza8 != null) {
                                        zzanoVar8.zzb((Object) t10, (T) objZza8);
                                        return;
                                    }
                                    return;
                                }
                                zzamgVar3 = zzamgVar;
                                zzanoVar4 = zzanoVar4;
                                zzakkVar3 = zzakkVar2;
                                zzakmVar2 = zzakmVar;
                            } catch (Throwable th8) {
                                th = th8;
                                zzamgVar3 = zzamgVar;
                                zzanoVar = zzanoVar4;
                                zzanoVar4 = zzanoVar;
                                i10 = zzamgVar3.zzl;
                                objZza = objZza3;
                                while (i10 < zzamgVar3.zzm) {
                                }
                                T t132222 = t10;
                                if (objZza != null) {
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        zzano zzanoVar9 = zzanoVar4;
                        t11 = t12;
                        zzamgVar3 = zzamgVar;
                        zzanoVar = zzanoVar9;
                        t10 = t11;
                        zzanoVar4 = zzanoVar;
                        i10 = zzamgVar3.zzl;
                        objZza = objZza3;
                        while (i10 < zzamgVar3.zzm) {
                        }
                        T t1322222 = t10;
                        if (objZza != null) {
                        }
                        throw th;
                    }
                    zzamgVar3 = zzamgVar;
                }
            } catch (Throwable th10) {
                th = th10;
                t10 = t3;
            }
            i10 = zzamgVar3.zzl;
            objZza = objZza3;
            while (i10 < zzamgVar3.zzm) {
                objZza = zzamgVar3.zza((Object) t10, zzamgVar3.zzk[i10], (int) objZza, (zzano<UT, int>) zzanoVar4, (Object) t3);
                i10++;
                zzamgVar3 = this;
            }
            T t13222222 = t10;
            if (objZza != null) {
                zzanoVar4.zzb((Object) t13222222, (T) objZza);
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    public final void zza(T t3, byte[] bArr, int i10, int i11, zzajk zzajkVar) throws IOException {
        zza((zzamg<T>) t3, bArr, i10, i11, 0, zzajkVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zza(T t3, T t10, int i10) {
        if (zzc((zzamg<T>) t10, i10)) {
            long jZzc = zzc(i10) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(t10, jZzc);
            if (object != null) {
                zzamv zzamvVarZze = zze(i10);
                if (!zzc((zzamg<T>) t3, i10)) {
                    if (!zzg(object)) {
                        unsafe.putObject(t3, jZzc, object);
                    } else {
                        Object objZza = zzamvVarZze.zza();
                        zzamvVarZze.zza(objZza, object);
                        unsafe.putObject(t3, jZzc, objZza);
                    }
                    zzb((zzamg<T>) t3, i10);
                    return;
                }
                Object object2 = unsafe.getObject(t3, jZzc);
                if (!zzg(object2)) {
                    Object objZza2 = zzamvVarZze.zza();
                    zzamvVarZze.zza(objZza2, object2);
                    unsafe.putObject(t3, jZzc, objZza2);
                    object2 = objZza2;
                }
                zzamvVarZze.zza(object2, object);
                return;
            }
            throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + String.valueOf(t10));
        }
    }

    private final void zza(Object obj, int i10, zzams zzamsVar) throws IOException {
        if (zzg(i10)) {
            zzanp.zza(obj, i10 & 1048575, zzamsVar.zzr());
        } else if (this.zzi) {
            zzanp.zza(obj, i10 & 1048575, zzamsVar.zzq());
        } else {
            zzanp.zza(obj, i10 & 1048575, zzamsVar.zzp());
        }
    }

    private final void zza(T t3, int i10, Object obj) {
        zzb.putObject(t3, zzc(i10) & 1048575, obj);
        zzb((zzamg<T>) t3, i10);
    }

    private final void zza(T t3, int i10, int i11, Object obj) {
        zzb.putObject(t3, zzc(i11) & 1048575, obj);
        zzb((zzamg<T>) t3, i10, i11);
    }

    private final <K, V> void zza(zzaof zzaofVar, int i10, Object obj, int i11) throws IOException {
        if (obj != null) {
            zzaofVar.zza(i10, this.zzr.zza(zzf(i11)), this.zzr.zzd(obj));
        }
    }

    private static void zza(int i10, Object obj, zzaof zzaofVar) throws IOException {
        if (obj instanceof String) {
            zzaofVar.zza(i10, (String) obj);
        } else {
            zzaofVar.zza(i10, (zzajp) obj);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:176:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(T t3, zzaof zzaofVar) throws IOException {
        Map.Entry<?, ?> entry;
        Iterator it;
        Map.Entry<?, ?> entry2;
        int i10;
        int i11;
        int i12;
        int i13;
        Iterator itZzc;
        Map.Entry<?, ?> entry3;
        zzamg<T> zzamgVar = this;
        int i14 = 267386880;
        int i15 = 1;
        int i16 = 1048575;
        if (zzaofVar.zza() == 2) {
            zza(zzamgVar.zzp, t3, zzaofVar);
            if (zzamgVar.zzh) {
                zzakr<T> zzakrVarZza = zzamgVar.zzq.zza(t3);
                if (zzakrVarZza.zza.isEmpty()) {
                    itZzc = null;
                    entry3 = null;
                } else {
                    itZzc = zzakrVarZza.zzc();
                    entry3 = (Map.Entry) itZzc.next();
                }
            }
            for (int length = zzamgVar.zzc.length - 3; length >= 0; length -= 3) {
                int iZzc = zzamgVar.zzc(length);
                int i17 = zzamgVar.zzc[length];
                while (entry3 != null && zzamgVar.zzq.zza(entry3) > i17) {
                    zzamgVar.zzq.zza(zzaofVar, entry3);
                    entry3 = itZzc.hasNext() ? (Map.Entry) itZzc.next() : null;
                }
                switch ((iZzc & 267386880) >>> 20) {
                    case 0:
                        if (zzamgVar.zzc((zzamg<T>) t3, length)) {
                            zzaofVar.zza(i17, zzanp.zza(t3, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (zzamgVar.zzc((zzamg<T>) t3, length)) {
                            zzaofVar.zza(i17, zzanp.zzb(t3, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (zzamgVar.zzc((zzamg<T>) t3, length)) {
                            zzaofVar.zzb(i17, zzanp.zzd(t3, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (zzamgVar.zzc((zzamg<T>) t3, length)) {
                            zzaofVar.zze(i17, zzanp.zzd(t3, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (zzamgVar.zzc((zzamg<T>) t3, length)) {
                            zzaofVar.zzc(i17, zzanp.zzc(t3, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (zzamgVar.zzc((zzamg<T>) t3, length)) {
                            zzaofVar.zza(i17, zzanp.zzd(t3, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (zzamgVar.zzc((zzamg<T>) t3, length)) {
                            zzaofVar.zzb(i17, zzanp.zzc(t3, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (zzamgVar.zzc((zzamg<T>) t3, length)) {
                            zzaofVar.zza(i17, zzanp.zzh(t3, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (zzamgVar.zzc((zzamg<T>) t3, length)) {
                            zza(i17, zzanp.zze(t3, iZzc & 1048575), zzaofVar);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (zzamgVar.zzc((zzamg<T>) t3, length)) {
                            zzaofVar.zzb(i17, zzanp.zze(t3, iZzc & 1048575), zzamgVar.zze(length));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (zzamgVar.zzc((zzamg<T>) t3, length)) {
                            zzaofVar.zza(i17, (zzajp) zzanp.zze(t3, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (zzamgVar.zzc((zzamg<T>) t3, length)) {
                            zzaofVar.zzf(i17, zzanp.zzc(t3, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (zzamgVar.zzc((zzamg<T>) t3, length)) {
                            zzaofVar.zza(i17, zzanp.zzc(t3, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (zzamgVar.zzc((zzamg<T>) t3, length)) {
                            zzaofVar.zzd(i17, zzanp.zzc(t3, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (zzamgVar.zzc((zzamg<T>) t3, length)) {
                            zzaofVar.zzc(i17, zzanp.zzd(t3, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (zzamgVar.zzc((zzamg<T>) t3, length)) {
                            zzaofVar.zze(i17, zzanp.zzc(t3, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (zzamgVar.zzc((zzamg<T>) t3, length)) {
                            zzaofVar.zzd(i17, zzanp.zzd(t3, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (zzamgVar.zzc((zzamg<T>) t3, length)) {
                            zzaofVar.zza(i17, zzanp.zze(t3, iZzc & 1048575), zzamgVar.zze(length));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        zzamx.zzb(zzamgVar.zzc[length], (List<Double>) zzanp.zze(t3, iZzc & 1048575), zzaofVar, false);
                        break;
                    case 19:
                        zzamx.zzf(zzamgVar.zzc[length], (List) zzanp.zze(t3, iZzc & 1048575), zzaofVar, false);
                        break;
                    case 20:
                        zzamx.zzh(zzamgVar.zzc[length], (List) zzanp.zze(t3, iZzc & 1048575), zzaofVar, false);
                        break;
                    case 21:
                        zzamx.zzn(zzamgVar.zzc[length], (List) zzanp.zze(t3, iZzc & 1048575), zzaofVar, false);
                        break;
                    case 22:
                        zzamx.zzg(zzamgVar.zzc[length], (List) zzanp.zze(t3, iZzc & 1048575), zzaofVar, false);
                        break;
                    case 23:
                        zzamx.zze(zzamgVar.zzc[length], (List) zzanp.zze(t3, iZzc & 1048575), zzaofVar, false);
                        break;
                    case 24:
                        zzamx.zzd(zzamgVar.zzc[length], (List) zzanp.zze(t3, iZzc & 1048575), zzaofVar, false);
                        break;
                    case 25:
                        zzamx.zza(zzamgVar.zzc[length], (List<Boolean>) zzanp.zze(t3, iZzc & 1048575), zzaofVar, false);
                        break;
                    case 26:
                        zzamx.zzb(zzamgVar.zzc[length], (List<String>) zzanp.zze(t3, iZzc & 1048575), zzaofVar);
                        break;
                    case 27:
                        zzamx.zzb(zzamgVar.zzc[length], (List<?>) zzanp.zze(t3, iZzc & 1048575), zzaofVar, (zzamv<?>) zzamgVar.zze(length));
                        break;
                    case 28:
                        zzamx.zza(zzamgVar.zzc[length], (List<zzajp>) zzanp.zze(t3, iZzc & 1048575), zzaofVar);
                        break;
                    case 29:
                        zzamx.zzm(zzamgVar.zzc[length], (List) zzanp.zze(t3, iZzc & 1048575), zzaofVar, false);
                        break;
                    case 30:
                        zzamx.zzc(zzamgVar.zzc[length], (List) zzanp.zze(t3, iZzc & 1048575), zzaofVar, false);
                        break;
                    case 31:
                        zzamx.zzi(zzamgVar.zzc[length], (List) zzanp.zze(t3, iZzc & 1048575), zzaofVar, false);
                        break;
                    case 32:
                        zzamx.zzj(zzamgVar.zzc[length], (List) zzanp.zze(t3, iZzc & 1048575), zzaofVar, false);
                        break;
                    case 33:
                        zzamx.zzk(zzamgVar.zzc[length], (List) zzanp.zze(t3, iZzc & 1048575), zzaofVar, false);
                        break;
                    case 34:
                        zzamx.zzl(zzamgVar.zzc[length], (List) zzanp.zze(t3, iZzc & 1048575), zzaofVar, false);
                        break;
                    case 35:
                        zzamx.zzb(zzamgVar.zzc[length], (List<Double>) zzanp.zze(t3, iZzc & 1048575), zzaofVar, true);
                        break;
                    case 36:
                        zzamx.zzf(zzamgVar.zzc[length], (List) zzanp.zze(t3, iZzc & 1048575), zzaofVar, true);
                        break;
                    case 37:
                        zzamx.zzh(zzamgVar.zzc[length], (List) zzanp.zze(t3, iZzc & 1048575), zzaofVar, true);
                        break;
                    case 38:
                        zzamx.zzn(zzamgVar.zzc[length], (List) zzanp.zze(t3, iZzc & 1048575), zzaofVar, true);
                        break;
                    case 39:
                        zzamx.zzg(zzamgVar.zzc[length], (List) zzanp.zze(t3, iZzc & 1048575), zzaofVar, true);
                        break;
                    case 40:
                        zzamx.zze(zzamgVar.zzc[length], (List) zzanp.zze(t3, iZzc & 1048575), zzaofVar, true);
                        break;
                    case 41:
                        zzamx.zzd(zzamgVar.zzc[length], (List) zzanp.zze(t3, iZzc & 1048575), zzaofVar, true);
                        break;
                    case 42:
                        zzamx.zza(zzamgVar.zzc[length], (List<Boolean>) zzanp.zze(t3, iZzc & 1048575), zzaofVar, true);
                        break;
                    case EACTags.DATE_OF_BIRTH /* 43 */:
                        zzamx.zzm(zzamgVar.zzc[length], (List) zzanp.zze(t3, iZzc & 1048575), zzaofVar, true);
                        break;
                    case 44:
                        zzamx.zzc(zzamgVar.zzc[length], (List) zzanp.zze(t3, iZzc & 1048575), zzaofVar, true);
                        break;
                    case 45:
                        zzamx.zzi(zzamgVar.zzc[length], (List) zzanp.zze(t3, iZzc & 1048575), zzaofVar, true);
                        break;
                    case 46:
                        zzamx.zzj(zzamgVar.zzc[length], (List) zzanp.zze(t3, iZzc & 1048575), zzaofVar, true);
                        break;
                    case EACTags.PIN_USAGE_POLICY /* 47 */:
                        zzamx.zzk(zzamgVar.zzc[length], (List) zzanp.zze(t3, iZzc & 1048575), zzaofVar, true);
                        break;
                    case 48:
                        zzamx.zzl(zzamgVar.zzc[length], (List) zzanp.zze(t3, iZzc & 1048575), zzaofVar, true);
                        break;
                    case 49:
                        zzamx.zza(zzamgVar.zzc[length], (List<?>) zzanp.zze(t3, iZzc & 1048575), zzaofVar, (zzamv<?>) zzamgVar.zze(length));
                        break;
                    case 50:
                        zzamgVar.zza(zzaofVar, i17, zzanp.zze(t3, iZzc & 1048575), length);
                        break;
                    case EACTags.TRANSACTION_DATE /* 51 */:
                        if (zzamgVar.zzc((zzamg<T>) t3, i17, length)) {
                            zzaofVar.zza(i17, zza(t3, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (zzamgVar.zzc((zzamg<T>) t3, i17, length)) {
                            zzaofVar.zza(i17, zzb(t3, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case EACTags.SEX /* 53 */:
                        if (zzamgVar.zzc((zzamg<T>) t3, i17, length)) {
                            zzaofVar.zzb(i17, zzd(t3, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case EACTags.CURRENCY_EXPONENT /* 54 */:
                        if (zzamgVar.zzc((zzamg<T>) t3, i17, length)) {
                            zzaofVar.zze(i17, zzd(t3, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (zzamgVar.zzc((zzamg<T>) t3, i17, length)) {
                            zzaofVar.zzc(i17, zzc(t3, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (zzamgVar.zzc((zzamg<T>) t3, i17, length)) {
                            zzaofVar.zza(i17, zzd(t3, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (zzamgVar.zzc((zzamg<T>) t3, i17, length)) {
                            zzaofVar.zzb(i17, zzc(t3, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                        if (zzamgVar.zzc((zzamg<T>) t3, i17, length)) {
                            zzaofVar.zza(i17, zze(t3, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                        if (zzamgVar.zzc((zzamg<T>) t3, i17, length)) {
                            zza(i17, zzanp.zze(t3, iZzc & 1048575), zzaofVar);
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        if (zzamgVar.zzc((zzamg<T>) t3, i17, length)) {
                            zzaofVar.zzb(i17, zzanp.zze(t3, iZzc & 1048575), zzamgVar.zze(length));
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (zzamgVar.zzc((zzamg<T>) t3, i17, length)) {
                            zzaofVar.zza(i17, (zzajp) zzanp.zze(t3, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (zzamgVar.zzc((zzamg<T>) t3, i17, length)) {
                            zzaofVar.zzf(i17, zzc(t3, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (zzamgVar.zzc((zzamg<T>) t3, i17, length)) {
                            zzaofVar.zza(i17, zzc(t3, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (zzamgVar.zzc((zzamg<T>) t3, i17, length)) {
                            zzaofVar.zzd(i17, zzc(t3, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case EACTags.ELEMENT_LIST /* 65 */:
                        if (zzamgVar.zzc((zzamg<T>) t3, i17, length)) {
                            zzaofVar.zzc(i17, zzd(t3, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case EACTags.ADDRESS /* 66 */:
                        if (zzamgVar.zzc((zzamg<T>) t3, i17, length)) {
                            zzaofVar.zze(i17, zzc(t3, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                        if (zzamgVar.zzc((zzamg<T>) t3, i17, length)) {
                            zzaofVar.zzd(i17, zzd(t3, iZzc & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (zzamgVar.zzc((zzamg<T>) t3, i17, length)) {
                            zzaofVar.zza(i17, zzanp.zze(t3, iZzc & 1048575), zzamgVar.zze(length));
                            break;
                        } else {
                            break;
                        }
                }
            }
            while (entry3 != null) {
                zzamgVar.zzq.zza(zzaofVar, entry3);
                entry3 = itZzc.hasNext() ? (Map.Entry) itZzc.next() : null;
            }
            return;
        }
        if (zzamgVar.zzh) {
            zzakr<T> zzakrVarZza2 = zzamgVar.zzq.zza(t3);
            if (zzakrVarZza2.zza.isEmpty()) {
                entry = null;
                it = null;
            } else {
                Iterator itZzd = zzakrVarZza2.zzd();
                entry = (Map.Entry) itZzd.next();
                it = itZzd;
            }
        }
        int length2 = zzamgVar.zzc.length;
        Unsafe unsafe = zzb;
        int i18 = 0;
        int i19 = 0;
        int i20 = 1048575;
        while (i18 < length2) {
            int iZzc2 = zzamgVar.zzc(i18);
            int i21 = i14;
            int[] iArr = zzamgVar.zzc;
            int i22 = iArr[i18];
            int i23 = (iZzc2 & i21) >>> 20;
            int i24 = i15;
            if (i23 <= 17) {
                int i25 = iArr[i18 + 2];
                int i26 = i25 & i16;
                if (i26 != i20) {
                    i19 = i26 == i16 ? 0 : unsafe.getInt(t3, i26);
                    i20 = i26;
                }
                int i27 = i24 << (i25 >>> 20);
                entry2 = entry;
                i10 = i20;
                i11 = i19;
                i12 = i27;
            } else {
                entry2 = entry;
                i10 = i20;
                i11 = i19;
                i12 = 0;
            }
            while (entry2 != null && zzamgVar.zzq.zza(entry2) <= i22) {
                zzamgVar.zzq.zza(zzaofVar, entry2);
                entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
            }
            Iterator it2 = it;
            long j10 = iZzc2 & i16;
            switch (i23) {
                case 0:
                    i13 = i24;
                    if (zzamgVar.zza((zzamg<T>) t3, i18, i10, i11, i12)) {
                        zzaofVar.zza(i22, zzanp.zza(t3, j10));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    int i28 = i24;
                    i13 = i28;
                    if (zzamgVar.zza((zzamg<T>) t3, i18, i10, i11, i12)) {
                        zzaofVar.zza(i22, zzanp.zzb(t3, j10));
                        i13 = i28;
                    }
                    zzamgVar = this;
                    break;
                case 2:
                    int i29 = i24;
                    i13 = i29;
                    if (zzamgVar.zza((zzamg<T>) t3, i18, i10, i11, i12)) {
                        zzaofVar.zzb(i22, unsafe.getLong(t3, j10));
                        i13 = i29;
                    }
                    zzamgVar = this;
                    break;
                case 3:
                    int i30 = i24;
                    i13 = i30;
                    if (zzamgVar.zza((zzamg<T>) t3, i18, i10, i11, i12)) {
                        zzaofVar.zze(i22, unsafe.getLong(t3, j10));
                        i13 = i30;
                    }
                    zzamgVar = this;
                    break;
                case 4:
                    int i31 = i24;
                    i13 = i31;
                    if (zzamgVar.zza((zzamg<T>) t3, i18, i10, i11, i12)) {
                        zzaofVar.zzc(i22, unsafe.getInt(t3, j10));
                        i13 = i31;
                    }
                    zzamgVar = this;
                    break;
                case 5:
                    int i32 = i24;
                    i13 = i32;
                    if (zzamgVar.zza((zzamg<T>) t3, i18, i10, i11, i12)) {
                        zzaofVar.zza(i22, unsafe.getLong(t3, j10));
                        i13 = i32;
                    }
                    zzamgVar = this;
                    break;
                case 6:
                    int i33 = i24;
                    i13 = i33;
                    if (zzamgVar.zza((zzamg<T>) t3, i18, i10, i11, i12)) {
                        zzaofVar.zzb(i22, unsafe.getInt(t3, j10));
                        i13 = i33;
                    }
                    zzamgVar = this;
                    break;
                case 7:
                    int i34 = i24;
                    i13 = i34;
                    if (zzamgVar.zza((zzamg<T>) t3, i18, i10, i11, i12)) {
                        zzaofVar.zza(i22, zzanp.zzh(t3, j10));
                        i13 = i34;
                    }
                    zzamgVar = this;
                    break;
                case 8:
                    int i35 = i24;
                    i13 = i35;
                    if (zzamgVar.zza((zzamg<T>) t3, i18, i10, i11, i12)) {
                        zza(i22, unsafe.getObject(t3, j10), zzaofVar);
                        i13 = i35;
                    }
                    zzamgVar = this;
                    break;
                case 9:
                    i13 = i24;
                    if (zzamgVar.zza((zzamg<T>) t3, i18, i10, i11, i12)) {
                        zzaofVar.zzb(i22, unsafe.getObject(t3, j10), zzamgVar.zze(i18));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    int i36 = i24;
                    i13 = i36;
                    if (zzamgVar.zza((zzamg<T>) t3, i18, i10, i11, i12)) {
                        zzaofVar.zza(i22, (zzajp) unsafe.getObject(t3, j10));
                        i13 = i36;
                    }
                    zzamgVar = this;
                    break;
                case 11:
                    int i37 = i24;
                    i13 = i37;
                    if (zzamgVar.zza((zzamg<T>) t3, i18, i10, i11, i12)) {
                        zzaofVar.zzf(i22, unsafe.getInt(t3, j10));
                        i13 = i37;
                    }
                    zzamgVar = this;
                    break;
                case 12:
                    int i38 = i24;
                    i13 = i38;
                    if (zzamgVar.zza((zzamg<T>) t3, i18, i10, i11, i12)) {
                        zzaofVar.zza(i22, unsafe.getInt(t3, j10));
                        i13 = i38;
                    }
                    zzamgVar = this;
                    break;
                case 13:
                    int i39 = i24;
                    i13 = i39;
                    if (zzamgVar.zza((zzamg<T>) t3, i18, i10, i11, i12)) {
                        zzaofVar.zzd(i22, unsafe.getInt(t3, j10));
                        i13 = i39;
                    }
                    zzamgVar = this;
                    break;
                case 14:
                    int i40 = i24;
                    i13 = i40;
                    if (zzamgVar.zza((zzamg<T>) t3, i18, i10, i11, i12)) {
                        zzaofVar.zzc(i22, unsafe.getLong(t3, j10));
                        i13 = i40;
                    }
                    zzamgVar = this;
                    break;
                case 15:
                    int i41 = i24;
                    i13 = i41;
                    if (zzamgVar.zza((zzamg<T>) t3, i18, i10, i11, i12)) {
                        zzaofVar.zze(i22, unsafe.getInt(t3, j10));
                        i13 = i41;
                    }
                    zzamgVar = this;
                    break;
                case 16:
                    int i42 = i24;
                    i13 = i42;
                    if (zzamgVar.zza((zzamg<T>) t3, i18, i10, i11, i12)) {
                        zzaofVar.zzd(i22, unsafe.getLong(t3, j10));
                        i13 = i42;
                    }
                    zzamgVar = this;
                    break;
                case 17:
                    i13 = i24;
                    if (zzamgVar.zza((zzamg<T>) t3, i18, i10, i11, i12)) {
                        zzaofVar.zza(i22, unsafe.getObject(t3, j10), zzamgVar.zze(i18));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    i13 = i24;
                    zzamx.zzb(zzamgVar.zzc[i18], (List<Double>) unsafe.getObject(t3, j10), zzaofVar, false);
                    break;
                case 19:
                    i13 = i24;
                    zzamx.zzf(zzamgVar.zzc[i18], (List) unsafe.getObject(t3, j10), zzaofVar, false);
                    break;
                case 20:
                    i13 = i24;
                    zzamx.zzh(zzamgVar.zzc[i18], (List) unsafe.getObject(t3, j10), zzaofVar, false);
                    break;
                case 21:
                    i13 = i24;
                    zzamx.zzn(zzamgVar.zzc[i18], (List) unsafe.getObject(t3, j10), zzaofVar, false);
                    break;
                case 22:
                    i13 = i24;
                    zzamx.zzg(zzamgVar.zzc[i18], (List) unsafe.getObject(t3, j10), zzaofVar, false);
                    break;
                case 23:
                    i13 = i24;
                    zzamx.zze(zzamgVar.zzc[i18], (List) unsafe.getObject(t3, j10), zzaofVar, false);
                    break;
                case 24:
                    i13 = i24;
                    zzamx.zzd(zzamgVar.zzc[i18], (List) unsafe.getObject(t3, j10), zzaofVar, false);
                    break;
                case 25:
                    i13 = i24;
                    zzamx.zza(zzamgVar.zzc[i18], (List<Boolean>) unsafe.getObject(t3, j10), zzaofVar, false);
                    break;
                case 26:
                    i13 = i24;
                    zzamx.zzb(zzamgVar.zzc[i18], (List<String>) unsafe.getObject(t3, j10), zzaofVar);
                    break;
                case 27:
                    i13 = i24;
                    zzamx.zzb(zzamgVar.zzc[i18], (List<?>) unsafe.getObject(t3, j10), zzaofVar, (zzamv<?>) zzamgVar.zze(i18));
                    break;
                case 28:
                    i13 = i24;
                    zzamx.zza(zzamgVar.zzc[i18], (List<zzajp>) unsafe.getObject(t3, j10), zzaofVar);
                    break;
                case 29:
                    i13 = i24;
                    zzamx.zzm(zzamgVar.zzc[i18], (List) unsafe.getObject(t3, j10), zzaofVar, false);
                    break;
                case 30:
                    i13 = i24;
                    zzamx.zzc(zzamgVar.zzc[i18], (List) unsafe.getObject(t3, j10), zzaofVar, false);
                    break;
                case 31:
                    i13 = i24;
                    zzamx.zzi(zzamgVar.zzc[i18], (List) unsafe.getObject(t3, j10), zzaofVar, false);
                    break;
                case 32:
                    i13 = i24;
                    zzamx.zzj(zzamgVar.zzc[i18], (List) unsafe.getObject(t3, j10), zzaofVar, false);
                    break;
                case 33:
                    i13 = i24;
                    zzamx.zzk(zzamgVar.zzc[i18], (List) unsafe.getObject(t3, j10), zzaofVar, false);
                    break;
                case 34:
                    i13 = i24;
                    zzamx.zzl(zzamgVar.zzc[i18], (List) unsafe.getObject(t3, j10), zzaofVar, false);
                    break;
                case 35:
                    boolean z10 = i24;
                    zzamx.zzb(zzamgVar.zzc[i18], (List<Double>) unsafe.getObject(t3, j10), zzaofVar, z10);
                    i13 = z10;
                    break;
                case 36:
                    boolean z11 = i24;
                    zzamx.zzf(zzamgVar.zzc[i18], (List) unsafe.getObject(t3, j10), zzaofVar, z11);
                    i13 = z11;
                    break;
                case 37:
                    boolean z12 = i24;
                    zzamx.zzh(zzamgVar.zzc[i18], (List) unsafe.getObject(t3, j10), zzaofVar, z12);
                    i13 = z12;
                    break;
                case 38:
                    boolean z13 = i24;
                    zzamx.zzn(zzamgVar.zzc[i18], (List) unsafe.getObject(t3, j10), zzaofVar, z13);
                    i13 = z13;
                    break;
                case 39:
                    boolean z14 = i24;
                    zzamx.zzg(zzamgVar.zzc[i18], (List) unsafe.getObject(t3, j10), zzaofVar, z14);
                    i13 = z14;
                    break;
                case 40:
                    boolean z15 = i24;
                    zzamx.zze(zzamgVar.zzc[i18], (List) unsafe.getObject(t3, j10), zzaofVar, z15);
                    i13 = z15;
                    break;
                case 41:
                    boolean z16 = i24;
                    zzamx.zzd(zzamgVar.zzc[i18], (List) unsafe.getObject(t3, j10), zzaofVar, z16);
                    i13 = z16;
                    break;
                case 42:
                    boolean z17 = i24;
                    zzamx.zza(zzamgVar.zzc[i18], (List<Boolean>) unsafe.getObject(t3, j10), zzaofVar, z17);
                    i13 = z17;
                    break;
                case EACTags.DATE_OF_BIRTH /* 43 */:
                    boolean z18 = i24;
                    zzamx.zzm(zzamgVar.zzc[i18], (List) unsafe.getObject(t3, j10), zzaofVar, z18);
                    i13 = z18;
                    break;
                case 44:
                    boolean z19 = i24;
                    zzamx.zzc(zzamgVar.zzc[i18], (List) unsafe.getObject(t3, j10), zzaofVar, z19);
                    i13 = z19;
                    break;
                case 45:
                    boolean z20 = i24;
                    zzamx.zzi(zzamgVar.zzc[i18], (List) unsafe.getObject(t3, j10), zzaofVar, z20);
                    i13 = z20;
                    break;
                case 46:
                    boolean z21 = i24;
                    zzamx.zzj(zzamgVar.zzc[i18], (List) unsafe.getObject(t3, j10), zzaofVar, z21);
                    i13 = z21;
                    break;
                case EACTags.PIN_USAGE_POLICY /* 47 */:
                    boolean z22 = i24;
                    zzamx.zzk(zzamgVar.zzc[i18], (List) unsafe.getObject(t3, j10), zzaofVar, z22);
                    i13 = z22;
                    break;
                case 48:
                    boolean z23 = i24;
                    zzamx.zzl(zzamgVar.zzc[i18], (List) unsafe.getObject(t3, j10), zzaofVar, z23);
                    i13 = z23;
                    break;
                case 49:
                    zzamx.zza(zzamgVar.zzc[i18], (List<?>) unsafe.getObject(t3, j10), zzaofVar, (zzamv<?>) zzamgVar.zze(i18));
                    i13 = i24;
                    break;
                case 50:
                    zzamgVar.zza(zzaofVar, i22, unsafe.getObject(t3, j10), i18);
                    i13 = i24;
                    break;
                case EACTags.TRANSACTION_DATE /* 51 */:
                    if (zzamgVar.zzc((zzamg<T>) t3, i22, i18)) {
                        zzaofVar.zza(i22, zza(t3, j10));
                    }
                    i13 = i24;
                    break;
                case 52:
                    if (zzamgVar.zzc((zzamg<T>) t3, i22, i18)) {
                        zzaofVar.zza(i22, zzb(t3, j10));
                    }
                    i13 = i24;
                    break;
                case EACTags.SEX /* 53 */:
                    if (zzamgVar.zzc((zzamg<T>) t3, i22, i18)) {
                        zzaofVar.zzb(i22, zzd(t3, j10));
                    }
                    i13 = i24;
                    break;
                case EACTags.CURRENCY_EXPONENT /* 54 */:
                    if (zzamgVar.zzc((zzamg<T>) t3, i22, i18)) {
                        zzaofVar.zze(i22, zzd(t3, j10));
                    }
                    i13 = i24;
                    break;
                case 55:
                    if (zzamgVar.zzc((zzamg<T>) t3, i22, i18)) {
                        zzaofVar.zzc(i22, zzc(t3, j10));
                    }
                    i13 = i24;
                    break;
                case 56:
                    if (zzamgVar.zzc((zzamg<T>) t3, i22, i18)) {
                        zzaofVar.zza(i22, zzd(t3, j10));
                    }
                    i13 = i24;
                    break;
                case 57:
                    if (zzamgVar.zzc((zzamg<T>) t3, i22, i18)) {
                        zzaofVar.zzb(i22, zzc(t3, j10));
                    }
                    i13 = i24;
                    break;
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    if (zzamgVar.zzc((zzamg<T>) t3, i22, i18)) {
                        zzaofVar.zza(i22, zze(t3, j10));
                    }
                    i13 = i24;
                    break;
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (zzamgVar.zzc((zzamg<T>) t3, i22, i18)) {
                        zza(i22, unsafe.getObject(t3, j10), zzaofVar);
                    }
                    i13 = i24;
                    break;
                case 60:
                    if (zzamgVar.zzc((zzamg<T>) t3, i22, i18)) {
                        zzaofVar.zzb(i22, unsafe.getObject(t3, j10), zzamgVar.zze(i18));
                    }
                    i13 = i24;
                    break;
                case 61:
                    if (zzamgVar.zzc((zzamg<T>) t3, i22, i18)) {
                        zzaofVar.zza(i22, (zzajp) unsafe.getObject(t3, j10));
                    }
                    i13 = i24;
                    break;
                case 62:
                    if (zzamgVar.zzc((zzamg<T>) t3, i22, i18)) {
                        zzaofVar.zzf(i22, zzc(t3, j10));
                    }
                    i13 = i24;
                    break;
                case 63:
                    if (zzamgVar.zzc((zzamg<T>) t3, i22, i18)) {
                        zzaofVar.zza(i22, zzc(t3, j10));
                    }
                    i13 = i24;
                    break;
                case 64:
                    if (zzamgVar.zzc((zzamg<T>) t3, i22, i18)) {
                        zzaofVar.zzd(i22, zzc(t3, j10));
                    }
                    i13 = i24;
                    break;
                case EACTags.ELEMENT_LIST /* 65 */:
                    if (zzamgVar.zzc((zzamg<T>) t3, i22, i18)) {
                        zzaofVar.zzc(i22, zzd(t3, j10));
                    }
                    i13 = i24;
                    break;
                case EACTags.ADDRESS /* 66 */:
                    if (zzamgVar.zzc((zzamg<T>) t3, i22, i18)) {
                        zzaofVar.zze(i22, zzc(t3, j10));
                    }
                    i13 = i24;
                    break;
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (zzamgVar.zzc((zzamg<T>) t3, i22, i18)) {
                        zzaofVar.zzd(i22, zzd(t3, j10));
                    }
                    i13 = i24;
                    break;
                case 68:
                    if (zzamgVar.zzc((zzamg<T>) t3, i22, i18)) {
                        zzaofVar.zza(i22, unsafe.getObject(t3, j10), zzamgVar.zze(i18));
                    }
                    i13 = i24;
                    break;
                default:
                    i13 = i24;
                    break;
            }
            i18 += 3;
            i19 = i11;
            it = it2;
            i16 = 1048575;
            i20 = i10;
            entry = entry2;
            i14 = i21;
            i15 = i13;
        }
        Iterator it3 = it;
        while (entry != null) {
            zzamgVar.zzq.zza(zzaofVar, entry);
            entry = it3.hasNext() ? (Map.Entry) it3.next() : null;
        }
        zza(zzamgVar.zzp, t3, zzaofVar);
    }

    private static <UT, UB> void zza(zzano<UT, UB> zzanoVar, T t3, zzaof zzaofVar) throws IOException {
        zzanoVar.zzb((zzano<UT, UB>) zzanoVar.zzd(t3), zzaofVar);
    }

    private final boolean zza(T t3, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return zzc((zzamg<T>) t3, i10);
        }
        return (i12 & i13) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zza(Object obj, int i10, zzamv zzamvVar) {
        return zzamvVar.zze(zzanp.zze(obj, i10 & 1048575));
    }
}
