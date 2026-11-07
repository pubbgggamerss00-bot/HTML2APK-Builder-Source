package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ip1 extends eo1 {

    /* renamed from: y, reason: collision with root package name */
    public static final ip1 f5823y = new ip1(null, new Object[0], 0);

    /* renamed from: v, reason: collision with root package name */
    public final transient Object f5824v;

    /* renamed from: w, reason: collision with root package name */
    public final transient Object[] f5825w;

    /* renamed from: x, reason: collision with root package name */
    public final transient int f5826x;

    public ip1(Object obj, Object[] objArr, int i6) {
        this.f5824v = obj;
        this.f5825w = objArr;
        this.f5826x = i6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:74:0x019e  */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ip1 e(int i6, Object[] objArr, do1 do1Var) {
        boolean z6;
        int i7;
        char c7;
        Object obj;
        char c8;
        short[] sArr;
        boolean z7;
        int i8;
        ?? r16;
        boolean z8;
        boolean z9;
        int i9 = i6;
        Object[] objArrCopyOf = objArr;
        if (i9 == 0) {
            return f5823y;
        }
        Object obj2 = null;
        boolean z10 = false;
        int i10 = 1;
        if (i9 == 1) {
            Objects.requireNonNull(objArrCopyOf[0]);
            Objects.requireNonNull(objArrCopyOf[1]);
            return new ip1(null, objArrCopyOf, 1);
        }
        sl1.b(i9, objArrCopyOf.length >> 1);
        int iJ = go1.j(i9);
        char c9 = 2;
        if (i9 != 1) {
            int i11 = iJ - 1;
            if (iJ <= 128) {
                byte[] bArr = new byte[iJ];
                Arrays.fill(bArr, (byte) -1);
                int i12 = 0;
                int i13 = 0;
                while (i12 < i9) {
                    int i14 = i13 + i13;
                    int i15 = i12 + i12;
                    Object obj3 = objArrCopyOf[i15];
                    Objects.requireNonNull(obj3);
                    Object obj4 = objArrCopyOf[i15 ^ i10];
                    Objects.requireNonNull(obj4);
                    int iA = aa1.a(obj3.hashCode());
                    while (true) {
                        int i16 = iA & i11;
                        z7 = z10;
                        i8 = i10;
                        int i17 = bArr[i16] & 255;
                        if (i17 == 255) {
                            bArr[i16] = (byte) i14;
                            if (i13 < i12) {
                                objArrCopyOf[i14] = obj3;
                                objArrCopyOf[i14 ^ 1] = obj4;
                            }
                            i13++;
                        } else {
                            if (obj3.equals(objArrCopyOf[i17])) {
                                int i18 = i17 ^ 1;
                                Object obj5 = objArrCopyOf[i18];
                                Objects.requireNonNull(obj5);
                                co1 co1Var = new co1(obj3, obj4, obj5);
                                objArrCopyOf[i18] = obj4;
                                obj2 = co1Var;
                                break;
                            }
                            iA = i16 + 1;
                            z10 = z7;
                            i10 = i8;
                        }
                    }
                    i12++;
                    z10 = z7;
                    i10 = i8;
                }
                z6 = z10;
                i7 = i10;
                if (i13 == i9) {
                    obj2 = bArr;
                    z9 = z6;
                } else {
                    sArr = new Object[3];
                    sArr[z6 ? 1 : 0] = bArr;
                    sArr[i7] = Integer.valueOf(i13);
                    sArr[2] = obj2;
                    obj2 = sArr;
                    z9 = z6;
                }
            } else {
                z6 = false;
                i7 = 1;
                if (iJ <= 32768) {
                    sArr = new short[iJ];
                    Arrays.fill(sArr, (short) -1);
                    int i19 = 0;
                    for (int i20 = 0; i20 < i9; i20++) {
                        int i21 = i19 + i19;
                        int i22 = i20 + i20;
                        Object obj6 = objArrCopyOf[i22];
                        Objects.requireNonNull(obj6);
                        Object obj7 = objArrCopyOf[i22 ^ 1];
                        Objects.requireNonNull(obj7);
                        int iA2 = aa1.a(obj6.hashCode());
                        while (true) {
                            int i23 = iA2 & i11;
                            char c10 = (char) sArr[i23];
                            if (c10 == 65535) {
                                sArr[i23] = (short) i21;
                                if (i19 < i20) {
                                    objArrCopyOf[i21] = obj6;
                                    objArrCopyOf[i21 ^ 1] = obj7;
                                }
                                i19++;
                            } else {
                                if (obj6.equals(objArrCopyOf[c10])) {
                                    int i24 = c10 ^ 1;
                                    Object obj8 = objArrCopyOf[i24];
                                    Objects.requireNonNull(obj8);
                                    co1 co1Var2 = new co1(obj6, obj7, obj8);
                                    objArrCopyOf[i24] = obj7;
                                    obj2 = co1Var2;
                                    break;
                                }
                                iA2 = i23 + 1;
                            }
                        }
                    }
                    if (i19 == i9) {
                        obj2 = sArr;
                        z9 = z6;
                    } else {
                        obj2 = new Object[]{sArr, Integer.valueOf(i19), obj2};
                        z9 = z6;
                    }
                } else {
                    int[] iArr = new int[iJ];
                    Arrays.fill(iArr, -1);
                    int i25 = 0;
                    int i26 = 0;
                    while (i25 < i9) {
                        int i27 = i26 + i26;
                        int i28 = i25 + i25;
                        Object obj9 = objArrCopyOf[i28];
                        Objects.requireNonNull(obj9);
                        Object obj10 = objArrCopyOf[i28 ^ 1];
                        Objects.requireNonNull(obj10);
                        int iA3 = aa1.a(obj9.hashCode());
                        while (true) {
                            int i29 = iA3 & i11;
                            int i30 = iArr[i29];
                            if (i30 == -1) {
                                iArr[i29] = i27;
                                if (i26 < i25) {
                                    objArrCopyOf[i27] = obj9;
                                    objArrCopyOf[i27 ^ 1] = obj10;
                                }
                                i26++;
                                c8 = c9;
                            } else {
                                c8 = c9;
                                if (obj9.equals(objArrCopyOf[i30])) {
                                    int i31 = i30 ^ 1;
                                    Object obj11 = objArrCopyOf[i31];
                                    Objects.requireNonNull(obj11);
                                    co1 co1Var3 = new co1(obj9, obj10, obj11);
                                    objArrCopyOf[i31] = obj10;
                                    obj2 = co1Var3;
                                    break;
                                }
                                iA3 = i29 + 1;
                                c9 = c8;
                            }
                        }
                        i25++;
                        c9 = c8;
                    }
                    c7 = c9;
                    if (i26 == i9) {
                        obj = iArr;
                        r16 = z6;
                    } else {
                        Object[] objArr2 = new Object[3];
                        objArr2[0] = iArr;
                        objArr2[1] = Integer.valueOf(i26);
                        objArr2[c7] = obj2;
                        obj = objArr2;
                        r16 = z6;
                    }
                }
            }
            z8 = obj instanceof Object[];
            Object obj12 = obj;
            if (z8) {
                Object[] objArr3 = (Object[]) obj;
                co1 co1Var4 = (co1) objArr3[c7];
                if (do1Var == null) {
                    throw co1Var4.a();
                }
                do1Var.f3982c = co1Var4;
                Object obj13 = objArr3[r16];
                int iIntValue = ((Integer) objArr3[i7]).intValue();
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
                obj12 = obj13;
                i9 = iIntValue;
            }
            return new ip1(obj12, objArrCopyOf, i9);
        }
        Objects.requireNonNull(objArrCopyOf[0]);
        Objects.requireNonNull(objArrCopyOf[1]);
        z9 = false;
        i9 = 1;
        i7 = 1;
        c7 = 2;
        obj = obj2;
        r16 = z9;
        z8 = obj instanceof Object[];
        Object obj122 = obj;
        if (z8) {
        }
        return new ip1(obj122, objArrCopyOf, i9);
    }

    @Override // com.google.android.gms.internal.ads.eo1
    public final hp1 a() {
        return new hp1(this.f5825w, 1, this.f5826x);
    }

    @Override // com.google.android.gms.internal.ads.eo1
    public final fp1 c() {
        return new fp1(this, this.f5825w, this.f5826x);
    }

    @Override // com.google.android.gms.internal.ads.eo1
    public final gp1 d() {
        return new gp1(this, new hp1(this.f5825w, 0, this.f5826x));
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0003  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0003 A[EDGE_INSN: B:44:0x0003->B:4:0x0003 BREAK  A[LOOP:0: B:16:0x0038->B:22:0x004e], EDGE_INSN: B:46:0x0003->B:4:0x0003 BREAK  A[LOOP:1: B:26:0x0063->B:32:0x007a], EDGE_INSN: B:48:0x0003->B:4:0x0003 BREAK  A[LOOP:2: B:34:0x0089->B:43:0x00a0]] */
    @Override // com.google.android.gms.internal.ads.eo1, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            int i6 = this.f5826x;
            Object[] objArr = this.f5825w;
            if (i6 == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                }
            } else {
                Object obj4 = this.f5824v;
                if (obj4 != null) {
                    if (obj4 instanceof byte[]) {
                        byte[] bArr = (byte[]) obj4;
                        int length = bArr.length - 1;
                        int iA = aa1.a(obj.hashCode());
                        while (true) {
                            int i7 = iA & length;
                            int i8 = bArr[i7] & 255;
                            if (i8 == 255) {
                                break;
                            }
                            if (obj.equals(objArr[i8])) {
                                obj2 = objArr[i8 ^ 1];
                                break;
                            }
                            iA = i7 + 1;
                        }
                    } else if (obj4 instanceof short[]) {
                        short[] sArr = (short[]) obj4;
                        int length2 = sArr.length - 1;
                        int iA2 = aa1.a(obj.hashCode());
                        while (true) {
                            int i9 = iA2 & length2;
                            char c7 = (char) sArr[i9];
                            if (c7 == 65535) {
                                break;
                            }
                            if (obj.equals(objArr[c7])) {
                                obj2 = objArr[c7 ^ 1];
                                break;
                            }
                            iA2 = i9 + 1;
                        }
                    } else {
                        int[] iArr = (int[]) obj4;
                        int length3 = iArr.length - 1;
                        int iA3 = aa1.a(obj.hashCode());
                        while (true) {
                            int i10 = iA3 & length3;
                            int i11 = iArr[i10];
                            if (i11 == -1) {
                                break;
                            }
                            if (obj.equals(objArr[i11])) {
                                obj2 = objArr[i11 ^ 1];
                                break;
                            }
                            iA3 = i10 + 1;
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
        return this.f5826x;
    }
}
