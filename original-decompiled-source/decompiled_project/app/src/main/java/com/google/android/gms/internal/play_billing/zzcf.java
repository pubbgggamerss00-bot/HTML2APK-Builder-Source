package com.google.android.gms.internal.play_billing;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes2.dex */
final class zzcf extends zzbw {
    static final zzbw zza = new zzcf(null, new Object[0], 0);
    final transient Object[] zzb;
    private final transient Object zzc;
    private final transient int zzd;

    private zzcf(Object obj, Object[] objArr, int i10) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d1  */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzcf zzg(int i10, Object[] objArr, zzbv zzbvVar) {
        int iHighestOneBit;
        boolean z10;
        int i11;
        char c10;
        Object obj;
        char c11;
        short[] sArr;
        boolean z11;
        int i12;
        ?? r16;
        boolean z12;
        boolean z13;
        int i13 = i10;
        Object[] objArrCopyOf = objArr;
        if (i13 == 0) {
            return (zzcf) zza;
        }
        Object obj2 = null;
        boolean z14 = false;
        int i14 = 1;
        if (i13 == 1) {
            Object obj3 = objArrCopyOf[0];
            Objects.requireNonNull(obj3);
            Object obj4 = objArrCopyOf[1];
            Objects.requireNonNull(obj4);
            zzbo.zza(obj3, obj4);
            return new zzcf(null, objArrCopyOf, 1);
        }
        zzbg.zzb(i13, objArrCopyOf.length >> 1, "index");
        char c12 = 2;
        int iMax = Math.max(i13, 2);
        if (iMax < 751619276) {
            iHighestOneBit = Integer.highestOneBit(iMax - 1);
            do {
                iHighestOneBit += iHighestOneBit;
            } while (iHighestOneBit * 0.7d < iMax);
        } else {
            iHighestOneBit = 1073741824;
            if (iMax >= 1073741824) {
                throw new IllegalArgumentException("collection too large");
            }
        }
        if (i13 == 1) {
            Object obj5 = objArrCopyOf[0];
            Objects.requireNonNull(obj5);
            Object obj6 = objArrCopyOf[1];
            Objects.requireNonNull(obj6);
            zzbo.zza(obj5, obj6);
            z13 = false;
            i13 = 1;
            i11 = 1;
        } else {
            int i15 = iHighestOneBit - 1;
            if (iHighestOneBit <= 128) {
                byte[] bArr = new byte[iHighestOneBit];
                Arrays.fill(bArr, (byte) -1);
                int i16 = 0;
                int i17 = 0;
                while (i16 < i13) {
                    int i18 = i17 + i17;
                    int i19 = i16 + i16;
                    Object obj7 = objArrCopyOf[i19];
                    Objects.requireNonNull(obj7);
                    Object obj8 = objArrCopyOf[i19 ^ i14];
                    Objects.requireNonNull(obj8);
                    zzbo.zza(obj7, obj8);
                    int iZza = zzbp.zza(obj7.hashCode());
                    while (true) {
                        int i20 = iZza & i15;
                        z11 = z14;
                        i12 = i14;
                        int i21 = bArr[i20] & 255;
                        if (i21 == 255) {
                            bArr[i20] = (byte) i18;
                            if (i17 < i16) {
                                objArrCopyOf[i18] = obj7;
                                objArrCopyOf[i18 ^ 1] = obj8;
                            }
                            i17++;
                        } else {
                            if (obj7.equals(objArrCopyOf[i21])) {
                                int i22 = i21 ^ 1;
                                Object obj9 = objArrCopyOf[i22];
                                Objects.requireNonNull(obj9);
                                zzbu zzbuVar = new zzbu(obj7, obj8, obj9);
                                objArrCopyOf[i22] = obj8;
                                obj2 = zzbuVar;
                                break;
                            }
                            iZza = i20 + 1;
                            z14 = z11;
                            i14 = i12;
                        }
                    }
                    i16++;
                    z14 = z11;
                    i14 = i12;
                }
                z10 = z14;
                i11 = i14;
                if (i17 == i13) {
                    c10 = 2;
                    obj = bArr;
                    r16 = z10;
                    z12 = obj instanceof Object[];
                    Object obj10 = obj;
                    if (z12) {
                        Object[] objArr2 = (Object[]) obj;
                        zzbu zzbuVar2 = (zzbu) objArr2[c10];
                        if (zzbvVar == null) {
                            throw zzbuVar2.zza();
                        }
                        zzbvVar.zzc = zzbuVar2;
                        Object obj11 = objArr2[r16];
                        int iIntValue = ((Integer) objArr2[i11]).intValue();
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
                        obj10 = obj11;
                        i13 = iIntValue;
                    }
                    return new zzcf(obj10, objArrCopyOf, i13);
                }
                sArr = new Object[3];
                sArr[z10 ? 1 : 0] = bArr;
                sArr[i11] = Integer.valueOf(i17);
                sArr[2] = obj2;
                obj2 = sArr;
                z13 = z10;
            } else {
                z10 = false;
                i11 = 1;
                if (iHighestOneBit > 32768) {
                    int[] iArr = new int[iHighestOneBit];
                    Arrays.fill(iArr, -1);
                    int i23 = 0;
                    int i24 = 0;
                    while (i23 < i13) {
                        int i25 = i24 + i24;
                        int i26 = i23 + i23;
                        Object obj12 = objArrCopyOf[i26];
                        Objects.requireNonNull(obj12);
                        Object obj13 = objArrCopyOf[i26 ^ 1];
                        Objects.requireNonNull(obj13);
                        zzbo.zza(obj12, obj13);
                        int iZza2 = zzbp.zza(obj12.hashCode());
                        while (true) {
                            int i27 = iZza2 & i15;
                            int i28 = iArr[i27];
                            if (i28 == -1) {
                                iArr[i27] = i25;
                                if (i24 < i23) {
                                    objArrCopyOf[i25] = obj12;
                                    objArrCopyOf[i25 ^ 1] = obj13;
                                }
                                i24++;
                                c11 = c12;
                            } else {
                                c11 = c12;
                                if (obj12.equals(objArrCopyOf[i28])) {
                                    int i29 = i28 ^ 1;
                                    Object obj14 = objArrCopyOf[i29];
                                    Objects.requireNonNull(obj14);
                                    zzbu zzbuVar3 = new zzbu(obj12, obj13, obj14);
                                    objArrCopyOf[i29] = obj13;
                                    obj2 = zzbuVar3;
                                    break;
                                }
                                iZza2 = i27 + 1;
                                c12 = c11;
                            }
                        }
                        i23++;
                        c12 = c11;
                    }
                    c10 = c12;
                    if (i24 == i13) {
                        obj = iArr;
                        r16 = z10;
                    } else {
                        Object[] objArr3 = new Object[3];
                        objArr3[0] = iArr;
                        objArr3[1] = Integer.valueOf(i24);
                        objArr3[c10] = obj2;
                        obj = objArr3;
                        r16 = z10;
                    }
                    z12 = obj instanceof Object[];
                    Object obj102 = obj;
                    if (z12) {
                    }
                    return new zzcf(obj102, objArrCopyOf, i13);
                }
                sArr = new short[iHighestOneBit];
                Arrays.fill(sArr, (short) -1);
                int i30 = 0;
                for (int i31 = 0; i31 < i13; i31++) {
                    int i32 = i30 + i30;
                    int i33 = i31 + i31;
                    Object obj15 = objArrCopyOf[i33];
                    Objects.requireNonNull(obj15);
                    Object obj16 = objArrCopyOf[i33 ^ 1];
                    Objects.requireNonNull(obj16);
                    zzbo.zza(obj15, obj16);
                    int iZza3 = zzbp.zza(obj15.hashCode());
                    while (true) {
                        int i34 = iZza3 & i15;
                        char c13 = (char) sArr[i34];
                        if (c13 == 65535) {
                            sArr[i34] = (short) i32;
                            if (i30 < i31) {
                                objArrCopyOf[i32] = obj15;
                                objArrCopyOf[i32 ^ 1] = obj16;
                            }
                            i30++;
                        } else {
                            if (obj15.equals(objArrCopyOf[c13])) {
                                int i35 = c13 ^ 1;
                                Object obj17 = objArrCopyOf[i35];
                                Objects.requireNonNull(obj17);
                                zzbu zzbuVar4 = new zzbu(obj15, obj16, obj17);
                                objArrCopyOf[i35] = obj16;
                                obj2 = zzbuVar4;
                                break;
                            }
                            iZza3 = i34 + 1;
                        }
                    }
                }
                if (i30 == i13) {
                    obj2 = sArr;
                    z13 = z10;
                } else {
                    obj2 = new Object[]{sArr, Integer.valueOf(i30), obj2};
                    z13 = z10;
                }
            }
        }
        c10 = 2;
        obj = obj2;
        r16 = z13;
        z12 = obj instanceof Object[];
        Object obj1022 = obj;
        if (z12) {
        }
        return new zzcf(obj1022, objArrCopyOf, i13);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0003  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0003 A[EDGE_INSN: B:44:0x0003->B:4:0x0003 BREAK  A[LOOP:0: B:16:0x0038->B:22:0x004e], EDGE_INSN: B:46:0x0003->B:4:0x0003 BREAK  A[LOOP:1: B:26:0x0063->B:32:0x007a], EDGE_INSN: B:48:0x0003->B:4:0x0003 BREAK  A[LOOP:2: B:34:0x0089->B:43:0x00a0]] */
    @Override // com.google.android.gms.internal.play_billing.zzbw, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            int i10 = this.zzd;
            Object[] objArr = this.zzb;
            if (i10 == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                }
            } else {
                Object obj4 = this.zzc;
                if (obj4 != null) {
                    if (obj4 instanceof byte[]) {
                        byte[] bArr = (byte[]) obj4;
                        int length = bArr.length - 1;
                        int iZza = zzbp.zza(obj.hashCode());
                        while (true) {
                            int i11 = iZza & length;
                            int i12 = bArr[i11] & 255;
                            if (i12 == 255) {
                                break;
                            }
                            if (obj.equals(objArr[i12])) {
                                obj2 = objArr[i12 ^ 1];
                                break;
                            }
                            iZza = i11 + 1;
                        }
                    } else if (obj4 instanceof short[]) {
                        short[] sArr = (short[]) obj4;
                        int length2 = sArr.length - 1;
                        int iZza2 = zzbp.zza(obj.hashCode());
                        while (true) {
                            int i13 = iZza2 & length2;
                            char c10 = (char) sArr[i13];
                            if (c10 == 65535) {
                                break;
                            }
                            if (obj.equals(objArr[c10])) {
                                obj2 = objArr[c10 ^ 1];
                                break;
                            }
                            iZza2 = i13 + 1;
                        }
                    } else {
                        int[] iArr = (int[]) obj4;
                        int length3 = iArr.length - 1;
                        int iZza3 = zzbp.zza(obj.hashCode());
                        while (true) {
                            int i14 = iZza3 & length3;
                            int i15 = iArr[i14];
                            if (i15 == -1) {
                                break;
                            }
                            if (obj.equals(objArr[i15])) {
                                obj2 = objArr[i15 ^ 1];
                                break;
                            }
                            iZza3 = i14 + 1;
                        }
                    }
                }
            }
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbw
    public final zzbq zza() {
        return new zzce(this.zzb, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.play_billing.zzbw
    public final zzbx zzd() {
        return new zzcc(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.play_billing.zzbw
    public final zzbx zze() {
        return new zzcd(this, new zzce(this.zzb, 0, this.zzd));
    }
}
