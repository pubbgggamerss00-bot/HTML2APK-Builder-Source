package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import org.bouncycastle.crypto.hpke.HPKE;

/* loaded from: classes2.dex */
final class zzau<K, V> extends zzan<K, V> {
    private static final zzan<Object, Object> zza = new zzau(null, new Object[0], 0);
    private final transient Object zzb;
    private final transient Object[] zzc;
    private final transient int zzd;

    private zzau(Object obj, Object[] objArr, int i10) {
        this.zzb = obj;
        this.zzc = objArr;
        this.zzd = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0009 A[EDGE_INSN: B:43:0x0009->B:4:0x0009 BREAK  A[LOOP:0: B:15:0x0037->B:21:0x004d], EDGE_INSN: B:45:0x0009->B:4:0x0009 BREAK  A[LOOP:1: B:25:0x0062->B:31:0x0079], EDGE_INSN: B:47:0x0009->B:4:0x0009 BREAK  A[LOOP:2: B:33:0x0088->B:42:0x00a0]] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzan, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final V get(Object obj) {
        V v10;
        Object obj2 = this.zzb;
        Object[] objArr = this.zzc;
        int i10 = this.zzd;
        if (obj != null) {
            if (i10 == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    v10 = (V) objArr[1];
                    Objects.requireNonNull(v10);
                } else {
                    v10 = null;
                }
            } else if (obj2 != null) {
                if (obj2 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj2;
                    int length = bArr.length - 1;
                    int iZza = zzaf.zza(obj.hashCode());
                    while (true) {
                        int i11 = iZza & length;
                        int i12 = bArr[i11] & 255;
                        if (i12 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i12])) {
                            v10 = (V) objArr[i12 ^ 1];
                            break;
                        }
                        iZza = i11 + 1;
                    }
                } else if (obj2 instanceof short[]) {
                    short[] sArr = (short[]) obj2;
                    int length2 = sArr.length - 1;
                    int iZza2 = zzaf.zza(obj.hashCode());
                    while (true) {
                        int i13 = iZza2 & length2;
                        int i14 = sArr[i13] & HPKE.aead_EXPORT_ONLY;
                        if (i14 == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[i14])) {
                            v10 = (V) objArr[i14 ^ 1];
                            break;
                        }
                        iZza2 = i13 + 1;
                    }
                } else {
                    int[] iArr = (int[]) obj2;
                    int length3 = iArr.length - 1;
                    int iZza3 = zzaf.zza(obj.hashCode());
                    while (true) {
                        int i15 = iZza3 & length3;
                        int i16 = iArr[i15];
                        if (i16 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i16])) {
                            v10 = (V) objArr[i16 ^ 1];
                            break;
                        }
                        iZza3 = i15 + 1;
                    }
                }
            }
        }
        if (v10 == null) {
            return null;
        }
        return v10;
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzan
    public final zzai<V> zza() {
        return new zzay(this.zzc, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzan
    public final zzas<Map.Entry<K, V>> zzb() {
        return new zzat(this, this.zzc, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzan
    public final zzas<K> zzc() {
        return new zzav(this, new zzay(this.zzc, 0, this.zzd));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzan
    public final boolean zzd() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01d5  */
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
    public static <K, V> zzau<K, V> zza(int i10, Object[] objArr, zzaq<K, V> zzaqVar) {
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
            return (zzau) zza;
        }
        Object zzapVar = null;
        boolean z14 = false;
        int i14 = 1;
        if (i13 == 1) {
            Object obj2 = objArrCopyOf[0];
            Objects.requireNonNull(obj2);
            Object obj3 = objArrCopyOf[1];
            Objects.requireNonNull(obj3);
            zzag.zza(obj2, obj3);
            return new zzau<>(null, objArrCopyOf, 1);
        }
        zzw.zzb(i13, objArrCopyOf.length >> 1);
        char c12 = 2;
        int iMax = Math.max(i13, 2);
        if (iMax < 751619276) {
            iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
            while (iHighestOneBit * 0.7d < iMax) {
                iHighestOneBit <<= 1;
            }
        } else {
            iHighestOneBit = 1073741824;
            zzw.zza(iMax < 1073741824, "collection too large");
        }
        if (i13 == 1) {
            Object obj4 = objArrCopyOf[0];
            Objects.requireNonNull(obj4);
            Object obj5 = objArrCopyOf[1];
            Objects.requireNonNull(obj5);
            zzag.zza(obj4, obj5);
            z13 = false;
            i11 = 1;
        } else {
            int i15 = iHighestOneBit - 1;
            if (iHighestOneBit <= 128) {
                byte[] bArr = new byte[iHighestOneBit];
                Arrays.fill(bArr, (byte) -1);
                int i16 = 0;
                int i17 = 0;
                while (i16 < i13) {
                    int i18 = i16 * 2;
                    int i19 = i17 * 2;
                    Object obj6 = objArrCopyOf[i18];
                    Objects.requireNonNull(obj6);
                    Object obj7 = objArrCopyOf[i18 ^ i14];
                    Objects.requireNonNull(obj7);
                    zzag.zza(obj6, obj7);
                    int iZza = zzaf.zza(obj6.hashCode());
                    while (true) {
                        int i20 = iZza & i15;
                        z11 = z14;
                        i12 = i14;
                        int i21 = bArr[i20] & 255;
                        if (i21 == 255) {
                            bArr[i20] = (byte) i19;
                            if (i17 < i16) {
                                objArrCopyOf[i19] = obj6;
                                objArrCopyOf[i19 ^ 1] = obj7;
                            }
                            i17++;
                        } else {
                            if (obj6.equals(objArrCopyOf[i21])) {
                                int i22 = i21 ^ 1;
                                Object obj8 = objArrCopyOf[i22];
                                Objects.requireNonNull(obj8);
                                zzapVar = new zzap(obj6, obj7, obj8);
                                objArrCopyOf[i22] = obj7;
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
                    Object obj9 = obj;
                    if (z12) {
                        Object[] objArr2 = (Object[]) obj;
                        zzap zzapVar2 = (zzap) objArr2[c10];
                        if (zzaqVar == null) {
                            throw zzapVar2.zza();
                        }
                        zzaqVar.zza = zzapVar2;
                        Object obj10 = objArr2[r16];
                        int iIntValue = ((Integer) objArr2[i11]).intValue();
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue << 1);
                        obj9 = obj10;
                        i13 = iIntValue;
                    }
                    return new zzau<>(obj9, objArrCopyOf, i13);
                }
                sArr = new Object[3];
                sArr[z10 ? 1 : 0] = bArr;
                sArr[i11] = Integer.valueOf(i17);
                sArr[2] = zzapVar;
                zzapVar = sArr;
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
                        int i25 = i23 * 2;
                        int i26 = i24 * 2;
                        Object obj11 = objArrCopyOf[i25];
                        Objects.requireNonNull(obj11);
                        Object obj12 = objArrCopyOf[i25 ^ 1];
                        Objects.requireNonNull(obj12);
                        zzag.zza(obj11, obj12);
                        int iZza2 = zzaf.zza(obj11.hashCode());
                        while (true) {
                            int i27 = iZza2 & i15;
                            int i28 = iArr[i27];
                            if (i28 == -1) {
                                iArr[i27] = i26;
                                if (i24 < i23) {
                                    objArrCopyOf[i26] = obj11;
                                    objArrCopyOf[i26 ^ 1] = obj12;
                                }
                                i24++;
                                c11 = c12;
                            } else {
                                c11 = c12;
                                if (obj11.equals(objArrCopyOf[i28])) {
                                    int i29 = i28 ^ 1;
                                    Object obj13 = objArrCopyOf[i29];
                                    Objects.requireNonNull(obj13);
                                    zzapVar = new zzap(obj11, obj12, obj13);
                                    objArrCopyOf[i29] = obj12;
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
                        objArr3[c10] = zzapVar;
                        obj = objArr3;
                        r16 = z10;
                    }
                    z12 = obj instanceof Object[];
                    Object obj92 = obj;
                    if (z12) {
                    }
                    return new zzau<>(obj92, objArrCopyOf, i13);
                }
                sArr = new short[iHighestOneBit];
                Arrays.fill(sArr, (short) -1);
                int i30 = 0;
                for (int i31 = 0; i31 < i13; i31++) {
                    int i32 = i31 * 2;
                    int i33 = i30 * 2;
                    Object obj14 = objArrCopyOf[i32];
                    Objects.requireNonNull(obj14);
                    Object obj15 = objArrCopyOf[i32 ^ 1];
                    Objects.requireNonNull(obj15);
                    zzag.zza(obj14, obj15);
                    int iZza3 = zzaf.zza(obj14.hashCode());
                    while (true) {
                        int i34 = iZza3 & i15;
                        int i35 = sArr[i34] & HPKE.aead_EXPORT_ONLY;
                        if (i35 == 65535) {
                            sArr[i34] = (short) i33;
                            if (i30 < i31) {
                                objArrCopyOf[i33] = obj14;
                                objArrCopyOf[i33 ^ 1] = obj15;
                            }
                            i30++;
                        } else {
                            if (obj14.equals(objArrCopyOf[i35])) {
                                int i36 = i35 ^ 1;
                                Object obj16 = objArrCopyOf[i36];
                                Objects.requireNonNull(obj16);
                                zzapVar = new zzap(obj14, obj15, obj16);
                                objArrCopyOf[i36] = obj15;
                                break;
                            }
                            iZza3 = i34 + 1;
                        }
                    }
                }
                if (i30 == i13) {
                    zzapVar = sArr;
                    z13 = z10;
                } else {
                    zzapVar = new Object[]{sArr, Integer.valueOf(i30), zzapVar};
                    z13 = z10;
                }
            }
        }
        c10 = 2;
        obj = zzapVar;
        r16 = z13;
        z12 = obj instanceof Object[];
        Object obj922 = obj;
        if (z12) {
        }
        return new zzau<>(obj922, objArrCopyOf, i13);
    }
}
