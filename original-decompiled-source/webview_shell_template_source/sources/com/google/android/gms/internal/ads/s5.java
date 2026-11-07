package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import com.google.android.gms.ads.RequestConfiguration;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class s5 {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f8792a;

    static {
        int i6 = j31.f5914a;
        f8792a = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static int a(int i6) {
        return (i6 >> 24) & 255;
    }

    public static r91 b(ex0 ex0Var) {
        long jC;
        long jC2;
        ex0Var.j(8);
        if (a(ex0Var.q()) == 0) {
            jC = ex0Var.D();
            jC2 = ex0Var.D();
        } else {
            jC = ex0Var.C();
            jC2 = ex0Var.C();
        }
        return new r91(jC, jC2, ex0Var.D());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0303 A[ADDED_TO_REGION, LOOP:14: B:110:0x0303->B:114:0x030e, LOOP_START, PHI: r17
      0x0303: PHI (r17v12 int) = (r17v2 int), (r17v13 int) binds: [B:109:0x0301, B:114:0x030e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x02f4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0212 A[PHI: r12
      0x0212: PHI (r12v4 int) = (r12v3 int), (r12v3 int), (r12v22 int), (r12v3 int) binds: [B:42:0x0144, B:49:0x0162, B:67:0x0210, B:48:0x0160] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x023f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static i6 c(f6 f6Var, s51 s51Var, g1 g1Var) throws rn {
        n5 r5Var;
        n5 n5Var;
        int i6;
        long j6;
        f6 f6Var2;
        boolean z6;
        int iY;
        int iY2;
        ex0 ex0Var;
        int iY3;
        int[] iArr;
        int i7;
        w wVar;
        long j7;
        int i8;
        int i9;
        long j8;
        long[] jArrCopyOf;
        int[] iArrCopyOf;
        long[] jArrCopyOf2;
        int[] iArrCopyOf2;
        int i10;
        int i11;
        int[] iArr2;
        int i12;
        long[] jArr;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        long j9;
        int i18;
        int i19;
        int[] iArr3;
        long[] jArr2;
        long j10;
        int i20;
        int i21;
        int i22;
        long j11;
        w wVar2;
        int i23;
        int i24;
        f6 f6Var3;
        int[] iArr4;
        int i25;
        int i26;
        int length;
        long j12;
        w wVar3 = f6Var.f4497g;
        j61 j61VarC = s51Var.c(1937011578);
        if (j61VarC != null) {
            r5Var = new q5(j61VarC, wVar3);
        } else {
            j61 j61VarC2 = s51Var.c(1937013298);
            if (j61VarC2 == null) {
                throw rn.a(null, "Track has no sample table size information");
            }
            r5Var = new r5(j61VarC2);
        }
        int iZzb = r5Var.zzb();
        if (iZzb == 0) {
            return new i6(f6Var, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        if (f6Var.f4492b == 2) {
            long j13 = f6Var.f4496f;
            if (j13 > 0) {
                wVar3.getClass();
                tk2 tk2Var = new tk2(wVar3);
                tk2Var.f9338u = iZzb / (j13 / 1000000.0f);
                j6 = 0;
                n5Var = r5Var;
                i6 = 0;
                f6Var2 = new f6(f6Var.f4491a, f6Var.f4492b, f6Var.f4493c, f6Var.f4494d, f6Var.f4495e, f6Var.f4496f, new w(tk2Var), f6Var.h, f6Var.f4501l, f6Var.f4500k, f6Var.f4498i, f6Var.f4499j);
            } else {
                n5Var = r5Var;
                i6 = 0;
                j6 = 0;
                f6Var2 = f6Var;
            }
        }
        long j14 = f6Var2.f4493c;
        int i27 = f6Var2.f4492b;
        long[] jArr3 = f6Var2.f4499j;
        w wVar4 = f6Var2.f4497g;
        long[] jArr4 = f6Var2.f4498i;
        j61 j61VarC3 = s51Var.c(1937007471);
        if (j61VarC3 == null) {
            j61VarC3 = s51Var.c(1668232756);
            j61VarC3.getClass();
            z6 = 1;
        } else {
            z6 = i6;
        }
        j61 j61VarC4 = s51Var.c(1937011555);
        j61VarC4.getClass();
        ex0 ex0Var2 = j61VarC4.f5954b;
        j61 j61VarC5 = s51Var.c(1937011827);
        j61VarC5.getClass();
        ex0 ex0Var3 = j61VarC5.f5954b;
        j61 j61VarC6 = s51Var.c(1937011571);
        ex0 ex0Var4 = j61VarC6 != null ? j61VarC6.f5954b : null;
        j61 j61VarC7 = s51Var.c(1668576371);
        ex0 ex0Var5 = j61VarC7 != null ? j61VarC7.f5954b : null;
        k5 k5Var = new k5(ex0Var2, j61VarC3.f5954b, z6);
        ex0Var3.j(12);
        int iY4 = ex0Var3.y() - 1;
        int iY5 = ex0Var3.y();
        int iY6 = ex0Var3.y();
        if (ex0Var5 != null) {
            ex0Var5.j(12);
            iY = ex0Var5.y();
        } else {
            iY = i6;
        }
        if (ex0Var4 != null) {
            ex0Var4.j(12);
            iY3 = ex0Var4.y();
            if (iY3 > 0) {
                iY2 = ex0Var4.y() - 1;
                ex0Var = ex0Var5;
            } else {
                iY2 = -1;
                ex0Var = ex0Var5;
                ex0Var4 = null;
            }
        } else {
            iY2 = -1;
            ex0Var = ex0Var5;
            iY3 = i6;
        }
        int iZza = n5Var.zza();
        if (iZza != -1) {
            String str = wVar4.f9978m;
            if ((!"audio/raw".equals(str) && !"audio/g711-mlaw".equals(str) && !"audio/g711-alaw".equals(str)) || iY4 != 0) {
                long[] jArr5 = new long[iZzb];
                iArr = new int[iZzb];
                int i28 = iY3;
                long[] jArr6 = new long[iZzb];
                int i29 = iY4;
                int[] iArr5 = new int[iZzb];
                i7 = i27;
                wVar = wVar4;
                int iY7 = iY5;
                int i30 = i29;
                j7 = j6;
                long j15 = j7;
                int iQ = i6;
                int i31 = iQ;
                int iY8 = i31;
                int iY9 = iY2;
                int i32 = i28;
                i8 = iY8;
                ex0 ex0Var6 = ex0Var4;
                i9 = i8;
                while (true) {
                    if (i9 < iZzb) {
                    }
                    j7 += iArr[i9];
                    i8 = i22 - 1;
                    i9++;
                    j14 = j8;
                    iZzb = i21;
                }
                long j16 = j15 + iQ;
                if (ex0Var == null) {
                }
            } else if (iY == 0 && iY3 == 0) {
                int i33 = k5Var.f6239a;
                long[] jArr7 = new long[i33];
                int[] iArr6 = new int[i33];
                while (k5Var.a()) {
                    int i34 = k5Var.f6240b;
                    jArr7[i34] = k5Var.f6242d;
                    iArr6[i34] = k5Var.f6241c;
                }
                long j17 = iY6;
                int i35 = 8192 / iZza;
                int i36 = i6;
                int i37 = i36;
                while (i36 < i33) {
                    int i38 = iArr6[i36];
                    int i39 = j31.f5914a;
                    i37 = (((i38 + i35) - 1) / i35) + i37;
                    i36++;
                }
                jArrCopyOf = new long[i37];
                int[] iArr7 = new int[i37];
                long[] jArr8 = new long[i37];
                iArrCopyOf2 = new int[i37];
                int i40 = i6;
                int i41 = i40;
                i20 = i41;
                int i42 = i20;
                while (i40 < i33) {
                    int i43 = iArr6[i40];
                    long j18 = jArr7[i40];
                    int i44 = i42;
                    int i45 = i33;
                    int iMax = i20;
                    int i46 = i44;
                    int i47 = i40;
                    int i48 = i43;
                    while (i48 > 0) {
                        int iMin = Math.min(i35, i48);
                        jArrCopyOf[i46] = j18;
                        int i49 = i48;
                        int i50 = iZza * iMin;
                        iArr7[i46] = i50;
                        iMax = Math.max(iMax, i50);
                        long j19 = j17;
                        jArr8[i46] = i41 * j19;
                        iArrCopyOf2[i46] = 1;
                        j18 += iArr7[i46];
                        i41 += iMin;
                        i48 = i49 - iMin;
                        i46++;
                        j17 = j19;
                    }
                    long j20 = j17;
                    i40 = i47 + 1;
                    int i51 = i46;
                    i20 = iMax;
                    i33 = i45;
                    i42 = i51;
                    j17 = j20;
                }
                j10 = j17 * i41;
                i7 = i27;
                wVar = wVar4;
                j8 = j14;
                iArr3 = iArr7;
                jArr2 = jArr8;
            } else {
                iY4 = i6;
                long[] jArr52 = new long[iZzb];
                iArr = new int[iZzb];
                int i282 = iY3;
                long[] jArr62 = new long[iZzb];
                int i292 = iY4;
                int[] iArr52 = new int[iZzb];
                i7 = i27;
                wVar = wVar4;
                int iY72 = iY5;
                int i302 = i292;
                j7 = j6;
                long j152 = j7;
                int iQ2 = i6;
                int i312 = iQ2;
                int iY82 = i312;
                int iY92 = iY2;
                int i322 = i282;
                i8 = iY82;
                ex0 ex0Var62 = ex0Var4;
                i9 = i8;
                while (true) {
                    if (i9 < iZzb) {
                        j8 = j14;
                        jArrCopyOf = jArr52;
                        iArrCopyOf = iArr;
                        jArrCopyOf2 = jArr62;
                        iArrCopyOf2 = iArr52;
                        i10 = i8;
                        break;
                    }
                    i10 = i8;
                    boolean zA = true;
                    while (true) {
                        if (i10 != 0) {
                            i21 = iZzb;
                            i22 = i10;
                            break;
                        }
                        zA = k5Var.a();
                        if (!zA) {
                            i21 = iZzb;
                            i22 = i6;
                            break;
                        }
                        long j21 = j14;
                        long j22 = k5Var.f6242d;
                        i10 = k5Var.f6241c;
                        j7 = j22;
                        j14 = j21;
                        iZzb = iZzb;
                    }
                    j8 = j14;
                    if (!zA) {
                        qs0.f("BoxParsers", "Unexpected end of chunk data");
                        jArrCopyOf = Arrays.copyOf(jArr52, i9);
                        iArrCopyOf = Arrays.copyOf(iArr, i9);
                        jArrCopyOf2 = Arrays.copyOf(jArr62, i9);
                        iZzb = i9;
                        iArrCopyOf2 = Arrays.copyOf(iArr52, i9);
                        break;
                    }
                    if (ex0Var != null) {
                        while (true) {
                            if (iY82 != 0) {
                                break;
                            }
                            if (iY <= 0) {
                                iY82 = i6;
                                break;
                            }
                            iY--;
                            iY82 = ex0Var.y();
                            iQ2 = ex0Var.q();
                        }
                        iY82--;
                    }
                    jArr52[i9] = j7;
                    int iZzc = n5Var.zzc();
                    iArr[i9] = iZzc;
                    if (iZzc > i312) {
                        i312 = iZzc;
                    }
                    jArr62[i9] = j152 + iQ2;
                    iArr52[i9] = ex0Var62 == null ? 1 : i6;
                    if (i9 == iY92) {
                        iArr52[i9] = 1;
                        i322--;
                        if (i322 > 0) {
                            ex0Var62.getClass();
                            iY92 = ex0Var62.y() - 1;
                        }
                    }
                    j152 += iY6;
                    int i52 = iY72 - 1;
                    if (i52 != 0) {
                        iY72 = i52;
                    } else if (i302 > 0) {
                        i302--;
                        iY72 = ex0Var3.y();
                        iY6 = ex0Var3.q();
                    } else {
                        iY72 = i6;
                    }
                    j7 += iArr[i9];
                    i8 = i22 - 1;
                    i9++;
                    j14 = j8;
                    iZzb = i21;
                }
                long j162 = j152 + iQ2;
                if (ex0Var == null) {
                    while (iY > 0) {
                        if (ex0Var.y() != 0) {
                            i11 = i6;
                            break;
                        }
                        ex0Var.q();
                        iY--;
                    }
                    i11 = 1;
                    if (i322 == 0) {
                        iArr2 = iArrCopyOf;
                        i12 = i11;
                        jArr = jArrCopyOf2;
                        i13 = i322;
                        i14 = iY72;
                        i15 = i302;
                        i16 = iY82;
                        i17 = i10;
                    } else if (iY72 != 0) {
                        iArr2 = iArrCopyOf;
                        i12 = i11;
                        jArr = jArrCopyOf2;
                        i14 = iY72;
                        i15 = i302;
                        i16 = iY82;
                        i17 = i10;
                        i13 = i6;
                    } else if (i10 != 0) {
                        iArr2 = iArrCopyOf;
                        i12 = i11;
                        jArr = jArrCopyOf2;
                        i15 = i302;
                        i16 = iY82;
                        i17 = i10;
                        i13 = i6;
                        i14 = i13;
                    } else if (i302 != 0) {
                        iArr2 = iArrCopyOf;
                        i12 = i11;
                        jArr = jArrCopyOf2;
                        i15 = i302;
                        i16 = iY82;
                        i13 = i6;
                        i14 = i13;
                        i17 = i14;
                    } else if (iY82 != 0) {
                        iArr2 = iArrCopyOf;
                        i12 = i11;
                        jArr = jArrCopyOf2;
                        i16 = iY82;
                        i13 = i6;
                        i14 = i13;
                        i17 = i14;
                        i15 = i17;
                    } else if (i11 == 0) {
                        iArr2 = iArrCopyOf;
                        jArr = jArrCopyOf2;
                        i12 = i6;
                        i13 = i12;
                        i14 = i13;
                        i17 = i14;
                        i15 = i17;
                        i16 = i15;
                    } else {
                        iArr2 = iArrCopyOf;
                        jArr = jArrCopyOf2;
                        i19 = iZzb;
                        i18 = i312;
                        j9 = j162;
                        iArr3 = iArr2;
                        jArr2 = jArr;
                        iZzb = i19;
                        j10 = j9;
                        i20 = i18;
                    }
                    i19 = iZzb;
                    i18 = i312;
                    j9 = j162;
                    StringBuilder sbA = androidx.camera.camera2.internal.g0.a("Inconsistent stbl box for track ", f6Var2.f4491a, ": remainingSynchronizationSamples ", i13, ", remainingSamplesAtTimestampDelta ");
                    sbA.append(i14);
                    sbA.append(", remainingSamplesInChunk ");
                    sbA.append(i17);
                    sbA.append(", remainingTimestampDeltaChanges ");
                    sbA.append(i15);
                    sbA.append(", remainingSamplesAtTimestampOffset ");
                    sbA.append(i16);
                    sbA.append(1 == i12 ? ", ctts invalid" : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                    qs0.f("BoxParsers", sbA.toString());
                    iArr3 = iArr2;
                    jArr2 = jArr;
                    iZzb = i19;
                    j10 = j9;
                    i20 = i18;
                } else {
                    i11 = 1;
                    if (i322 == 0) {
                    }
                    i19 = iZzb;
                    i18 = i312;
                    j9 = j162;
                    StringBuilder sbA2 = androidx.camera.camera2.internal.g0.a("Inconsistent stbl box for track ", f6Var2.f4491a, ": remainingSynchronizationSamples ", i13, ", remainingSamplesAtTimestampDelta ");
                    sbA2.append(i14);
                    sbA2.append(", remainingSamplesInChunk ");
                    sbA2.append(i17);
                    sbA2.append(", remainingTimestampDeltaChanges ");
                    sbA2.append(i15);
                    sbA2.append(", remainingSamplesAtTimestampOffset ");
                    sbA2.append(i16);
                    sbA2.append(1 == i12 ? ", ctts invalid" : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                    qs0.f("BoxParsers", sbA2.toString());
                    iArr3 = iArr2;
                    jArr2 = jArr;
                    iZzb = i19;
                    j10 = j9;
                    i20 = i18;
                }
            }
        }
        long[] jArr9 = jArrCopyOf;
        int[] iArr8 = iArrCopyOf2;
        long j23 = f6Var2.f4493c;
        RoundingMode roundingMode = RoundingMode.DOWN;
        long jU = j31.u(j10, 1000000L, j23, roundingMode);
        if (jArr4 == null) {
            j31.b(jArr2, j8);
            return new i6(f6Var2, jArr9, iArr3, i20, jArr2, iArr8, jU);
        }
        long j24 = j10;
        long j25 = j8;
        if (jArr4.length == 1) {
            i23 = i7;
            if (i23 != 1 || (length = jArr2.length) < 2) {
                j11 = j24;
            } else {
                jArr3.getClass();
                long j26 = jArr3[i6];
                j11 = j24;
                long jU2 = j26 + j31.u(jArr4[i6], f6Var2.f4493c, f6Var2.f4494d, roundingMode);
                int i53 = length - 1;
                int i54 = i6;
                int iMax2 = Math.max(i54, Math.min(4, i53));
                int iMax3 = Math.max(i54, Math.min(length - 4, i53));
                long j27 = jArr2[i54];
                if (j27 <= j26 && j26 < jArr2[iMax2] && jArr2[iMax3] < jU2 && jU2 <= j11) {
                    int[] iArr9 = iArr3;
                    wVar2 = wVar;
                    long jU3 = j31.u(j26 - j27, wVar2.C, f6Var2.f4493c, roundingMode);
                    long jU4 = j31.u(j11 - jU2, wVar2.C, f6Var2.f4493c, roundingMode);
                    if (jU3 == j6) {
                        if (jU4 != j6) {
                            j12 = j6;
                        }
                        iArr3 = iArr9;
                        jArr9 = jArr9;
                    } else {
                        j12 = jU3;
                    }
                    if (j12 <= 2147483647L && jU4 <= 2147483647L) {
                        g1Var.f4863a = (int) j12;
                        g1Var.f4864b = (int) jU4;
                        j31.b(jArr2, j25);
                        return new i6(f6Var2, jArr9, iArr9, i20, jArr2, iArr8, j31.u(jArr4[0], 1000000L, f6Var2.f4494d, roundingMode));
                    }
                    iArr3 = iArr9;
                    jArr9 = jArr9;
                }
            }
            wVar2 = wVar;
        } else {
            j11 = j24;
            wVar2 = wVar;
            i23 = i7;
        }
        int length2 = jArr4.length;
        int i55 = 1;
        if (length2 == 1) {
            i24 = 0;
            if (jArr4[0] == j6) {
                jArr3.getClass();
                long j28 = jArr3[0];
                for (int i56 = 0; i56 < jArr2.length; i56++) {
                    jArr2[i56] = j31.u(jArr2[i56] - j28, 1000000L, f6Var2.f4493c, RoundingMode.DOWN);
                }
                return new i6(f6Var2, jArr9, iArr3, i20, jArr2, iArr8, j31.u(j11 - j28, 1000000L, f6Var2.f4493c, RoundingMode.DOWN));
            }
            length2 = 1;
            i55 = 1;
        } else {
            i24 = 0;
        }
        int i57 = i23 == i55 ? 1 : i24;
        int[] iArr10 = new int[length2];
        int[] iArr11 = new int[length2];
        jArr3.getClass();
        int i58 = i24;
        int i59 = i58;
        int i60 = i59;
        int i61 = i60;
        while (i59 < jArr4.length) {
            int i62 = i57;
            long j29 = jArr3[i59];
            if (j29 != -1) {
                i25 = i59;
                int i63 = i60;
                long jU5 = j31.u(jArr4[i59], f6Var2.f4493c, f6Var2.f4494d, RoundingMode.DOWN);
                iArr4 = iArr10;
                iArr4[i25] = j31.j(jArr2, j29, true);
                while (true) {
                    int i64 = iArr4[i25];
                    if (i64 < 0 || (iArr8[i64] & 1) != 0) {
                        break;
                    }
                    iArr4[i25] = i64 - 1;
                }
                long j30 = j29 + jU5;
                int iBinarySearch = Arrays.binarySearch(jArr2, j30);
                if (iBinarySearch < 0) {
                    iBinarySearch = ~iBinarySearch;
                } else {
                    while (true) {
                        i26 = iBinarySearch + 1;
                        if (i26 >= jArr2.length || jArr2[i26] != j30) {
                            break;
                        }
                        iBinarySearch = i26;
                    }
                    if (i62 == 0) {
                        iBinarySearch = i26;
                    }
                }
                iArr11[i25] = iBinarySearch;
                if (i23 == 2) {
                    while (true) {
                        iBinarySearch = iArr11[i25];
                        if (iBinarySearch >= jArr2.length - 1) {
                            break;
                        }
                        int i65 = iBinarySearch + 1;
                        if (jArr2[i65] > j30) {
                            break;
                        }
                        iArr11[i25] = i65;
                    }
                }
                int i66 = iArr4[i25];
                int i67 = (iBinarySearch - i66) + i58;
                i60 = i63 | (i61 != i66 ? 1 : i24);
                i58 = i67;
                i61 = iBinarySearch;
            } else {
                iArr4 = iArr10;
                i25 = i59;
            }
            i57 = i62;
            i59 = i25 + 1;
            iArr10 = iArr4;
        }
        int[] iArr12 = iArr10;
        int i68 = i60 | (i58 != iZzb ? 1 : i24);
        long[] jArr10 = i68 != 0 ? new long[i58] : jArr9;
        int[] iArr13 = i68 != 0 ? new int[i58] : iArr3;
        if (1 == i68) {
            i20 = i24;
        }
        int[] iArr14 = i68 != 0 ? new int[i58] : iArr8;
        long[] jArr11 = new long[i58];
        int i69 = i20;
        long j31 = j6;
        int i70 = i24;
        int i71 = i70;
        int i72 = i71;
        while (i71 < jArr4.length) {
            long j32 = jArr3[i71];
            int i73 = iArr12[i71];
            int i74 = i68;
            int i75 = iArr11[i71];
            long[] jArr12 = jArr11;
            if (i74 != 0) {
                int i76 = i75 - i73;
                System.arraycopy(jArr9, i73, jArr10, i72, i76);
                System.arraycopy(iArr3, i73, iArr13, i72, i76);
                System.arraycopy(iArr8, i73, iArr14, i72, i76);
            }
            int i77 = i69;
            while (i73 < i75) {
                int i78 = i75;
                long[] jArr13 = jArr10;
                long j33 = f6Var2.f4494d;
                RoundingMode roundingMode2 = RoundingMode.DOWN;
                long jU6 = j31.u(j31, 1000000L, j33, roundingMode2);
                long jU7 = j31.u(jArr2[i73] - j32, 1000000L, f6Var2.f4493c, roundingMode2);
                i70 = ((jU7 < j6 ? i24 : 1) ^ 1) | i70;
                jArr12[i72] = jU6 + jU7;
                if (i74 != 0 && iArr13[i72] > i77) {
                    i77 = iArr3[i73];
                }
                i72++;
                i73++;
                i75 = i78;
                jArr10 = jArr13;
            }
            j31 += jArr4[i71];
            i71++;
            i68 = i74;
            i69 = i77;
            jArr10 = jArr10;
            jArr11 = jArr12;
        }
        long[] jArr14 = jArr10;
        long[] jArr15 = jArr11;
        long jU8 = j31.u(j31, 1000000L, f6Var2.f4494d, RoundingMode.DOWN);
        if (i70 != 0) {
            wVar2.getClass();
            tk2 tk2Var2 = new tk2(wVar2);
            tk2Var2.f9336r = true;
            f6Var3 = new f6(f6Var2.f4491a, f6Var2.f4492b, f6Var2.f4493c, f6Var2.f4494d, f6Var2.f4495e, f6Var2.f4496f, new w(tk2Var2), f6Var2.h, f6Var2.f4501l, f6Var2.f4500k, f6Var2.f4498i, f6Var2.f4499j);
        } else {
            f6Var3 = f6Var2;
        }
        return new i6(f6Var3, jArr14, iArr13, i69, jArr15, iArr14, jU8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00df, code lost:
    
        r7 = -9223372036854775807L;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x08c1  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x08c6  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x08da  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x08f9  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x09df  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x09ec  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x09f2  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x09f5  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x09fd  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x0a04  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x0a34  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x0a36  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x0a44  */
    /* JADX WARN: Removed duplicated region for block: B:604:0x0c89  */
    /* JADX WARN: Removed duplicated region for block: B:605:0x0c8b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:652:0x0de0  */
    /* JADX WARN: Removed duplicated region for block: B:653:0x0de4  */
    /* JADX WARN: Removed duplicated region for block: B:656:0x0e0f  */
    /* JADX WARN: Removed duplicated region for block: B:657:0x0e39  */
    /* JADX WARN: Removed duplicated region for block: B:664:0x0e46 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:671:0x01c6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x019d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList d(s51 s51Var, g1 g1Var, long j6, ih2 ih2Var, boolean z6, boolean z7, pl1 pl1Var) {
        long jU;
        long jD;
        int i6;
        long j7;
        long j8;
        long jU2;
        int iA;
        int i7;
        int i8;
        char c7;
        j61 j61VarC;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i9;
        s51 s51Var2;
        long j9;
        long[] jArr;
        long[] jArr2;
        w wVar;
        pl1 pl1Var2;
        f6 f6Var;
        Pair pairCreate;
        ex0 ex0Var;
        int i10;
        int i11;
        ArrayList arrayList3;
        String str;
        int i12;
        int i13;
        ih2 ih2VarL;
        String str2;
        ArrayList arrayList4;
        s51 s51Var3;
        int i14;
        int i15;
        char c8;
        char c9;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z8;
        int i20;
        int i21;
        int i22;
        List list;
        p5 p5Var;
        String str3;
        androidx.fragment.app.f0 f0Var;
        int i23;
        boolean z9;
        int i24;
        int iW;
        int i25;
        int i26;
        boolean z10;
        int iA2;
        int i27;
        int iB;
        mb2 mb2Var;
        int i28;
        int i29;
        int iW2;
        mb2 mb2Var2;
        int i30;
        char c10;
        androidx.fragment.app.f0 f0Var2;
        int i31;
        boolean z11;
        int i32;
        int i33;
        boolean z12;
        boolean z13;
        boolean z14;
        int i34;
        long j10;
        cp1 cp1VarN;
        f6 f6Var2;
        ArrayList arrayList5;
        s51 s51Var4 = s51Var;
        ArrayList arrayList6 = s51Var4.f8800d;
        ArrayList arrayList7 = new ArrayList();
        int i35 = 0;
        while (i35 < arrayList6.size()) {
            s51 s51Var5 = (s51) arrayList6.get(i35);
            if (s51Var5.f9732a != 1953653099) {
                arrayList = arrayList6;
                arrayList5 = arrayList7;
                i9 = i35;
            } else {
                j61 j61VarC2 = s51Var4.c(1836476516);
                j61VarC2.getClass();
                s51 s51VarB = s51Var5.b(1835297121);
                s51VarB.getClass();
                j61 j61VarC3 = s51VarB.c(1751411826);
                j61VarC3.getClass();
                ex0 ex0Var2 = j61VarC3.f5954b;
                ex0Var2.j(16);
                int iQ = ex0Var2.q();
                int i36 = iQ == 1936684398 ? 1 : iQ == 1986618469 ? 2 : (iQ == 1952807028 || iQ == 1935832172 || iQ == 1937072756 || iQ == 1668047728) ? 3 : iQ == 1835365473 ? 5 : -1;
                if (i36 == -1) {
                    pl1Var2 = pl1Var;
                    arrayList = arrayList6;
                    arrayList2 = arrayList7;
                    i9 = i35;
                    s51Var2 = s51Var5;
                } else {
                    j61 j61VarC4 = s51Var5.c(1953196132);
                    j61VarC4.getClass();
                    ex0 ex0Var3 = j61VarC4.f5954b;
                    ex0Var3.j(8);
                    int iA3 = a(ex0Var3.q());
                    ex0Var3.k(iA3 == 0 ? 8 : 16);
                    int iQ2 = ex0Var3.q();
                    ex0Var3.k(4);
                    int i37 = ex0Var3.f4417b;
                    int i38 = 0;
                    while (true) {
                        int i39 = iA3 == 0 ? 4 : 8;
                        jU = -9223372036854775807L;
                        if (i38 >= i39) {
                            ex0Var3.k(i39);
                            break;
                        }
                        if (ex0Var3.f4416a[i37 + i38] != -1) {
                            jD = iA3 == 0 ? ex0Var3.D() : ex0Var3.E();
                            if (jD == 0) {
                                break;
                            }
                        } else {
                            i38++;
                        }
                    }
                    ex0Var3.k(16);
                    int iQ3 = ex0Var3.q();
                    int iQ4 = ex0Var3.q();
                    ex0Var3.k(4);
                    int iQ5 = ex0Var3.q();
                    int iQ6 = ex0Var3.q();
                    int i40 = 65536;
                    if (iQ3 != 0) {
                        if (iQ3 == 0) {
                            i40 = iQ5;
                        } else if (iQ4 != -65536) {
                            i40 = iQ5;
                            iQ3 = 0;
                        } else if (iQ5 != 65536) {
                            iQ4 = -65536;
                            i40 = iQ5;
                            iQ3 = 0;
                        } else if (iQ6 == 0) {
                            i6 = 270;
                            j7 = j6 != -9223372036854775807L ? jD : j6;
                            long j11 = b(j61VarC2.f5954b).f8592u;
                            if (j7 != -9223372036854775807L) {
                                j8 = j11;
                                jU2 = -9223372036854775807L;
                            } else {
                                j8 = j11;
                                jU2 = j31.u(j7, 1000000L, j8, RoundingMode.DOWN);
                            }
                            s51 s51VarB2 = s51VarB.b(1835626086);
                            s51VarB2.getClass();
                            s51 s51VarB3 = s51VarB2.b(1937007212);
                            s51VarB3.getClass();
                            j61 j61VarC5 = s51VarB.c(1835296868);
                            j61VarC5.getClass();
                            ex0 ex0Var4 = j61VarC5.f5954b;
                            ex0Var4.j(8);
                            iA = a(ex0Var4.q());
                            ex0Var4.k(iA != 0 ? 8 : 16);
                            long jD2 = ex0Var4.D();
                            int i41 = ex0Var4.f4417b;
                            i7 = 0;
                            while (true) {
                                i8 = iA != 0 ? 4 : 8;
                                if (i7 < i8) {
                                    c7 = 65535;
                                    ex0Var4.k(i8);
                                    break;
                                }
                                c7 = 65535;
                                if (ex0Var4.f4416a[i41 + i7] != -1) {
                                    long jD3 = iA == 0 ? ex0Var4.D() : ex0Var4.E();
                                    if (jD3 != 0) {
                                        jU = j31.u(jD3, 1000000L, jD2, RoundingMode.DOWN);
                                    }
                                } else {
                                    i7++;
                                }
                            }
                            int iZ = ex0Var4.z();
                            StringBuilder sb = new StringBuilder();
                            sb.append((char) (((iZ >> 10) & 31) + 96));
                            sb.append((char) (((iZ >> 5) & 31) + 96));
                            sb.append((char) ((iZ & 31) + 96));
                            String string = sb.toString();
                            j61VarC = s51VarB3.c(1937011556);
                            if (j61VarC != null) {
                                throw rn.a(null, "Malformed sample table (stbl) missing sample description (stsd)");
                            }
                            ex0 ex0Var5 = j61VarC.f5954b;
                            ex0Var5.j(12);
                            int iQ7 = ex0Var5.q();
                            p5 p5Var2 = new p5(iQ7);
                            char c11 = c7;
                            int i42 = 0;
                            while (i42 < iQ7) {
                                int i43 = ex0Var5.f4417b;
                                int i44 = i36;
                                int iQ8 = ex0Var5.q();
                                String str4 = "childAtomSize must be positive";
                                me0.l("childAtomSize must be positive", iQ8 > 0);
                                int iQ9 = ex0Var5.q();
                                if (iQ9 == 1635148593 || iQ9 == 1635148595 || iQ9 == 1701733238 || iQ9 == 1831958048 || iQ9 == 1836070006 || iQ9 == 1752589105 || iQ9 == 1751479857 || iQ9 == 1932670515 || iQ9 == 1211250227 || iQ9 == 1748121139 || iQ9 == 1987063864 || iQ9 == 1987063865 || iQ9 == 1635135537 || iQ9 == 1685479798 || iQ9 == 1685479729 || iQ9 == 1685481573 || iQ9 == 1685481521) {
                                    ex0Var = ex0Var5;
                                    i10 = iQ7;
                                    int i45 = iQ2;
                                    i11 = i44;
                                    int i46 = iQ8;
                                    int i47 = 5;
                                    String str5 = string;
                                    arrayList3 = arrayList6;
                                    ex0Var.j(i43 + 16);
                                    ex0Var.k(16);
                                    int iZ2 = ex0Var.z();
                                    int iZ3 = ex0Var.z();
                                    str = str5;
                                    ex0Var.k(50);
                                    int i48 = ex0Var.f4417b;
                                    i12 = i42;
                                    int iIntValue = 1701733238;
                                    if (iQ9 == 1701733238) {
                                        Pair pairF = f(ex0Var, i43, i46);
                                        if (pairF != null) {
                                            iIntValue = ((Integer) pairF.first).intValue();
                                            if (ih2Var == null) {
                                                i13 = i43;
                                                ih2VarL = null;
                                            } else {
                                                i13 = i43;
                                                ih2VarL = ih2Var.l(((g6) pairF.second).f4903b);
                                            }
                                            p5Var2.f7936a[i12] = (g6) pairF.second;
                                        } else {
                                            i13 = i43;
                                            ih2VarL = ih2Var;
                                        }
                                        ex0Var.j(i48);
                                    } else {
                                        i13 = i43;
                                        iIntValue = iQ9;
                                        ih2VarL = ih2Var;
                                    }
                                    if (iIntValue == 1831958048) {
                                        str2 = "video/mpeg";
                                    } else if (iIntValue == 1211250227) {
                                        iIntValue = 1211250227;
                                        str2 = "video/3gpp";
                                    } else {
                                        str2 = null;
                                    }
                                    int i49 = i6;
                                    ih2 ih2Var2 = ih2VarL;
                                    arrayList4 = arrayList7;
                                    s51Var3 = s51Var5;
                                    float fY = 1.0f;
                                    int i50 = -1;
                                    List listN = null;
                                    int i51 = -1;
                                    int i52 = 8;
                                    int i53 = -1;
                                    int iB2 = -1;
                                    androidx.fragment.app.f0 f0Var3 = null;
                                    ByteBuffer byteBufferOrder = null;
                                    byte[] bArrCopyOfRange = null;
                                    String str6 = null;
                                    boolean z15 = false;
                                    m5 m5Var = null;
                                    int i54 = -1;
                                    i14 = i35;
                                    int i55 = i48;
                                    int i56 = 8;
                                    while (i55 - i13 < i46) {
                                        ex0Var.j(i55);
                                        int i57 = ex0Var.f4417b;
                                        int iQ10 = ex0Var.q();
                                        int i58 = i55;
                                        if (iQ10 != 0) {
                                            i18 = iQ10;
                                        } else {
                                            if (ex0Var.f4417b - i13 == i46) {
                                                break;
                                            }
                                            i18 = 0;
                                        }
                                        if (i18 > 0) {
                                            i19 = i46;
                                            z8 = true;
                                        } else {
                                            i19 = i46;
                                            z8 = false;
                                        }
                                        me0.l(str4, z8);
                                        int iQ11 = ex0Var.q();
                                        if (iQ11 != 1635148611) {
                                            int i59 = iIntValue;
                                            if (iQ11 == 1752589123) {
                                                int i60 = i57 + 8;
                                                me0.l(null, str2 == null);
                                                ex0Var.j(i60);
                                                h1 h1VarA = h1.a(ex0Var, false, null);
                                                List list2 = h1VarA.f5200a;
                                                p5Var2.f7938c = h1VarA.f5201b;
                                                if (z15) {
                                                    z13 = true;
                                                } else {
                                                    fY = h1VarA.f5207i;
                                                    z13 = false;
                                                }
                                                int i61 = h1VarA.f5208j;
                                                String str7 = h1VarA.f5209k;
                                                int i62 = h1VarA.h;
                                                if (i62 == -1) {
                                                    i62 = i50;
                                                }
                                                int i63 = h1VarA.f5204e;
                                                int i64 = h1VarA.f5205f;
                                                int i65 = h1VarA.f5206g;
                                                z15 = z13;
                                                i54 = i61;
                                                str6 = str7;
                                                p5Var = p5Var2;
                                                i56 = h1VarA.f5202c;
                                                str3 = str4;
                                                i23 = i59;
                                                iB2 = i65;
                                                i53 = i63;
                                                i50 = i62;
                                                i51 = i64;
                                                i52 = h1VarA.f5203d;
                                                f0Var3 = h1VarA.f5210l;
                                                listN = list2;
                                                str2 = "video/hevc";
                                            } else if (iQ11 == 1818785347) {
                                                int i66 = i57 + 8;
                                                me0.l("lhvC must follow hvcC atom", "video/hevc".equals(str2));
                                                if (f0Var3 != null) {
                                                    z12 = ((bo1) f0Var3.f1102t).size() >= 2;
                                                } else {
                                                    z12 = false;
                                                    f0Var3 = null;
                                                }
                                                me0.l("must have at least two layers", z12);
                                                ex0Var.j(i66);
                                                f0Var3.getClass();
                                                h1 h1VarA2 = h1.a(ex0Var, true, f0Var3);
                                                me0.l("nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms", p5Var2.f7938c == h1VarA2.f5201b);
                                                int i67 = h1VarA2.f5204e;
                                                if (i67 != -1) {
                                                    me0.l("colorSpace must be the same for both views", i53 == i67);
                                                }
                                                int i68 = h1VarA2.f5205f;
                                                if (i68 != -1) {
                                                    me0.l("colorRange must be the same for both views", i51 == i68);
                                                }
                                                int i69 = h1VarA2.f5206g;
                                                if (i69 != -1) {
                                                    me0.l("colorTransfer must be the same for both views", iB2 == i69);
                                                }
                                                me0.l("bitdepthLuma must be the same for both views", i56 == h1VarA2.f5202c);
                                                me0.l("bitdepthChroma must be the same for both views", i52 == h1VarA2.f5203d);
                                                if (listN != null) {
                                                    yn1 yn1Var = new yn1();
                                                    yn1Var.r(listN);
                                                    yn1Var.r(h1VarA2.f5200a);
                                                    listN = yn1Var.t();
                                                } else {
                                                    me0.l("initializationData must be already set from hvcC atom", false);
                                                }
                                                str6 = h1VarA2.f5209k;
                                                str2 = "video/mv-hevc";
                                                p5Var = p5Var2;
                                                str3 = str4;
                                                i23 = i59;
                                            } else {
                                                if (iQ11 == 1986361461) {
                                                    ex0Var.j(i57 + 8);
                                                    int i70 = ex0Var.f4417b;
                                                    xj0 xj0Var = null;
                                                    while (i70 - i57 < i18) {
                                                        ex0Var.j(i70);
                                                        int iQ12 = ex0Var.q();
                                                        if (iQ12 > 0) {
                                                            i31 = i70;
                                                            z11 = true;
                                                        } else {
                                                            i31 = i70;
                                                            z11 = false;
                                                        }
                                                        me0.l(str4, z11);
                                                        int i71 = i56;
                                                        if (ex0Var.q() == 1702454643) {
                                                            ex0Var.j(i31 + 8);
                                                            int i72 = ex0Var.f4417b;
                                                            while (true) {
                                                                if (i72 - i31 >= iQ12) {
                                                                    i32 = i51;
                                                                    i33 = i52;
                                                                    xj0Var = null;
                                                                    break;
                                                                }
                                                                ex0Var.j(i72);
                                                                int iQ13 = ex0Var.q();
                                                                me0.l(str4, iQ13 > 0);
                                                                int i73 = i72;
                                                                if (ex0Var.q() == 1937011305) {
                                                                    ex0Var.k(4);
                                                                    int iV = ex0Var.v();
                                                                    i32 = i51;
                                                                    i33 = i52;
                                                                    xj0Var = new xj0(2, new o5(1 == (iV & 1), (iV & 2) == 2, (iV & 8) == 8));
                                                                } else {
                                                                    i72 = i73 + iQ13;
                                                                }
                                                            }
                                                        } else {
                                                            i32 = i51;
                                                            i33 = i52;
                                                        }
                                                        i70 = i31 + iQ12;
                                                        i56 = i71;
                                                        i51 = i32;
                                                        i52 = i33;
                                                    }
                                                    i20 = i56;
                                                    i21 = i51;
                                                    i22 = i52;
                                                    l2 l2Var = xj0Var == null ? null : new l2(2, xj0Var);
                                                    if (l2Var != null) {
                                                        o5 o5Var = (o5) ((xj0) l2Var.f6565t).f10617t;
                                                        if (f0Var3 == null) {
                                                            f0Var2 = null;
                                                        } else if (((bo1) f0Var3.f1102t).size() >= 2) {
                                                            me0.l("both eye views must be marked as available", o5Var.f7600a && o5Var.f7601b);
                                                            me0.l("for MV-HEVC, eye_views_reversed must be set to false", !o5Var.f7602c);
                                                        } else {
                                                            f0Var2 = f0Var3;
                                                        }
                                                        if (i50 == -1) {
                                                            f0Var3 = f0Var2;
                                                            p5Var = p5Var2;
                                                            str3 = str4;
                                                            if (true != o5Var.f7602c) {
                                                                i23 = i59;
                                                                i56 = i20;
                                                                i51 = i21;
                                                                i52 = i22;
                                                                i50 = 4;
                                                            } else {
                                                                i50 = i47;
                                                                i23 = i59;
                                                                i56 = i20;
                                                                i51 = i21;
                                                                i52 = i22;
                                                            }
                                                        } else {
                                                            f0Var3 = f0Var2;
                                                            p5Var = p5Var2;
                                                            str3 = str4;
                                                            i23 = i59;
                                                            i56 = i20;
                                                            i51 = i21;
                                                            i52 = i22;
                                                        }
                                                    }
                                                    list = listN;
                                                    p5Var = p5Var2;
                                                    str3 = str4;
                                                    f0Var = f0Var3;
                                                    i23 = i59;
                                                } else {
                                                    i20 = i56;
                                                    i21 = i51;
                                                    i22 = i52;
                                                    if (iQ11 == 1685480259 || iQ11 == 1685485123) {
                                                        list = listN;
                                                        p5Var = p5Var2;
                                                        str3 = str4;
                                                        f0Var = f0Var3;
                                                        i23 = i59;
                                                        u0 u0VarA = u0.a(ex0Var);
                                                        if (u0VarA != null) {
                                                            str6 = u0VarA.f9416a;
                                                            str2 = "video/dolby-vision";
                                                        }
                                                    } else if (iQ11 == 1987076931) {
                                                        me0.l(null, str2 == null);
                                                        ex0Var.j(i57 + 12);
                                                        byte bV = (byte) ex0Var.v();
                                                        byte bV2 = (byte) ex0Var.v();
                                                        int iV2 = ex0Var.v();
                                                        int i74 = iV2 >> 4;
                                                        int i75 = iV2 >> 1;
                                                        String str8 = i59 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                                        if (str8.equals("video/x-vnd.on2.vp9")) {
                                                            byte[] bArr = sl0.f8977a;
                                                            byte[] bArr2 = new byte[12];
                                                            i30 = 1;
                                                            bArr2[0] = 1;
                                                            bArr2[1] = 1;
                                                            bArr2[2] = bV;
                                                            c10 = 3;
                                                            bArr2[3] = 2;
                                                            bArr2[4] = 1;
                                                            bArr2[i47] = bV2;
                                                            bArr2[6] = 3;
                                                            bArr2[7] = 1;
                                                            bArr2[8] = (byte) i74;
                                                            bArr2[9] = 4;
                                                            bArr2[10] = 1;
                                                            bArr2[11] = (byte) (i75 & 7);
                                                            listN = bo1.n(bArr2);
                                                        } else {
                                                            i30 = 1;
                                                            c10 = 3;
                                                        }
                                                        int i76 = iV2 & 1;
                                                        int iV3 = ex0Var.v();
                                                        int iV4 = ex0Var.v();
                                                        int iA4 = mb2.a(iV3);
                                                        String str9 = str8;
                                                        i51 = i30 != i76 ? 2 : 1;
                                                        str2 = str9;
                                                        i53 = iA4;
                                                        iB2 = mb2.b(iV4);
                                                        i23 = i59;
                                                        p5Var = p5Var2;
                                                        i56 = i74;
                                                        i52 = i56;
                                                        str3 = str4;
                                                    } else {
                                                        int i77 = 7;
                                                        int i78 = 10;
                                                        if (iQ11 == 1635135811) {
                                                            int i79 = i18 - 8;
                                                            byte[] bArr3 = new byte[i79];
                                                            ex0Var.f(0, i79, bArr3);
                                                            listN = bo1.n(bArr3);
                                                            ex0Var.j(i57 + 8);
                                                            byte[] bArr4 = ex0Var.f4416a;
                                                            l42 l42Var = new l42(bArr4.length, bArr4);
                                                            l42Var.B(ex0Var.f4417b * 8);
                                                            l42Var.E(1);
                                                            int iW3 = l42Var.w(3);
                                                            l42Var.D(6);
                                                            boolean zG = l42Var.G();
                                                            boolean zG2 = l42Var.G();
                                                            int i80 = -1;
                                                            if (iW3 != 2) {
                                                                if (iW3 > 2) {
                                                                    if (true != zG) {
                                                                        i78 = 8;
                                                                    }
                                                                    i24 = i78;
                                                                    int i81 = i24;
                                                                    int i82 = 13;
                                                                    l42Var.D(13);
                                                                    l42Var.C();
                                                                    iW = l42Var.w(4);
                                                                    if (iW != 1) {
                                                                        qs0.e("BoxParsers", "Unsupported obu_type: " + iW);
                                                                        mb2Var2 = new mb2(-1, -1, -1, i24, i81, null);
                                                                    } else if (l42Var.G()) {
                                                                        qs0.e("BoxParsers", "Unsupported obu_extension_flag");
                                                                        mb2Var2 = new mb2(-1, -1, -1, i24, i81, null);
                                                                    } else {
                                                                        boolean zG3 = l42Var.G();
                                                                        l42Var.C();
                                                                        if (!zG3 || l42Var.w(8) <= 127) {
                                                                            int iW4 = l42Var.w(3);
                                                                            l42Var.C();
                                                                            if (l42Var.G()) {
                                                                                qs0.e("BoxParsers", "Unsupported reduced_still_picture_header");
                                                                                mb2Var2 = new mb2(-1, -1, -1, i24, i81, null);
                                                                            } else if (l42Var.G()) {
                                                                                qs0.e("BoxParsers", "Unsupported timing_info_present_flag");
                                                                                mb2Var2 = new mb2(-1, -1, -1, i24, i81, null);
                                                                            } else if (l42Var.G()) {
                                                                                qs0.e("BoxParsers", "Unsupported initial_display_delay_present_flag");
                                                                                mb2Var2 = new mb2(-1, -1, -1, i24, i81, null);
                                                                            } else {
                                                                                int i83 = i47;
                                                                                int iW5 = l42Var.w(i83);
                                                                                int i84 = 0;
                                                                                while (i84 <= iW5) {
                                                                                    l42Var.D(12);
                                                                                    if (l42Var.w(i83) > i77) {
                                                                                        l42Var.C();
                                                                                    }
                                                                                    i84++;
                                                                                    i83 = 5;
                                                                                    i77 = 7;
                                                                                }
                                                                                int iW6 = l42Var.w(4);
                                                                                int iW7 = l42Var.w(4);
                                                                                l42Var.D(iW6 + 1);
                                                                                l42Var.D(iW7 + 1);
                                                                                if (l42Var.G()) {
                                                                                    i25 = 7;
                                                                                    l42Var.D(7);
                                                                                } else {
                                                                                    i25 = 7;
                                                                                }
                                                                                l42Var.D(i25);
                                                                                boolean zG4 = l42Var.G();
                                                                                if (zG4) {
                                                                                    l42Var.D(2);
                                                                                }
                                                                                if (l42Var.G()) {
                                                                                    i26 = 1;
                                                                                } else {
                                                                                    i26 = 1;
                                                                                    if (l42Var.w(1) > 0) {
                                                                                    }
                                                                                    if (zG4) {
                                                                                        l42Var.D(3);
                                                                                    }
                                                                                    l42Var.D(3);
                                                                                    boolean zG5 = l42Var.G();
                                                                                    if (iW4 != 2) {
                                                                                        if (zG5) {
                                                                                            l42Var.C();
                                                                                        }
                                                                                    } else if (iW4 == 1) {
                                                                                        z10 = false;
                                                                                        if (l42Var.G()) {
                                                                                            int iW8 = l42Var.w(8);
                                                                                            int iW9 = l42Var.w(8);
                                                                                            int iW10 = l42Var.w(8);
                                                                                            if (z10) {
                                                                                                i28 = 1;
                                                                                            } else {
                                                                                                i28 = 1;
                                                                                                if (iW8 == 1) {
                                                                                                    if (iW9 != 13) {
                                                                                                        i29 = 1;
                                                                                                    } else if (iW10 == 0) {
                                                                                                        iW2 = 1;
                                                                                                        i29 = 1;
                                                                                                        iA2 = mb2.a(i29);
                                                                                                        i27 = i81;
                                                                                                        i80 = iW2 != i28 ? 1 : 2;
                                                                                                        iB = mb2.b(i82);
                                                                                                    } else {
                                                                                                        i29 = 1;
                                                                                                        iW2 = l42Var.w(i28);
                                                                                                        iA2 = mb2.a(i29);
                                                                                                        i27 = i81;
                                                                                                        i80 = iW2 != i28 ? 1 : 2;
                                                                                                        iB = mb2.b(i82);
                                                                                                    }
                                                                                                }
                                                                                                i82 = iW9;
                                                                                                iW2 = l42Var.w(i28);
                                                                                                iA2 = mb2.a(i29);
                                                                                                i27 = i81;
                                                                                                i80 = iW2 != i28 ? 1 : 2;
                                                                                                iB = mb2.b(i82);
                                                                                            }
                                                                                            i29 = iW8;
                                                                                            i82 = iW9;
                                                                                            iW2 = l42Var.w(i28);
                                                                                            iA2 = mb2.a(i29);
                                                                                            i27 = i81;
                                                                                            i80 = iW2 != i28 ? 1 : 2;
                                                                                            iB = mb2.b(i82);
                                                                                        } else {
                                                                                            iA2 = -1;
                                                                                            i27 = i81;
                                                                                            iB = -1;
                                                                                        }
                                                                                        mb2Var = new mb2(iA2, i80, iB, i24, i27, null);
                                                                                        int i85 = mb2Var.f7079e;
                                                                                        int i86 = mb2Var.f7080f;
                                                                                        int i87 = mb2Var.f7075a;
                                                                                        int i88 = mb2Var.f7076b;
                                                                                        iB2 = mb2Var.f7077c;
                                                                                        str2 = "video/av01";
                                                                                        i53 = i87;
                                                                                        i51 = i88;
                                                                                        i23 = i59;
                                                                                        p5Var = p5Var2;
                                                                                        str3 = str4;
                                                                                        i52 = i86;
                                                                                        i56 = i85;
                                                                                    }
                                                                                    if (!l42Var.G()) {
                                                                                        z10 = true;
                                                                                    }
                                                                                    if (l42Var.G()) {
                                                                                    }
                                                                                    mb2Var = new mb2(iA2, i80, iB, i24, i27, null);
                                                                                    int i852 = mb2Var.f7079e;
                                                                                    int i862 = mb2Var.f7080f;
                                                                                    int i872 = mb2Var.f7075a;
                                                                                    int i882 = mb2Var.f7076b;
                                                                                    iB2 = mb2Var.f7077c;
                                                                                    str2 = "video/av01";
                                                                                    i53 = i872;
                                                                                    i51 = i882;
                                                                                    i23 = i59;
                                                                                    p5Var = p5Var2;
                                                                                    str3 = str4;
                                                                                    i52 = i862;
                                                                                    i56 = i852;
                                                                                }
                                                                                if (!l42Var.G()) {
                                                                                    l42Var.D(i26);
                                                                                }
                                                                                if (zG4) {
                                                                                }
                                                                                l42Var.D(3);
                                                                                boolean zG52 = l42Var.G();
                                                                                if (iW4 != 2) {
                                                                                }
                                                                                if (!l42Var.G()) {
                                                                                }
                                                                                if (l42Var.G()) {
                                                                                }
                                                                                mb2Var = new mb2(iA2, i80, iB, i24, i27, null);
                                                                                int i8522 = mb2Var.f7079e;
                                                                                int i8622 = mb2Var.f7080f;
                                                                                int i8722 = mb2Var.f7075a;
                                                                                int i8822 = mb2Var.f7076b;
                                                                                iB2 = mb2Var.f7077c;
                                                                                str2 = "video/av01";
                                                                                i53 = i8722;
                                                                                i51 = i8822;
                                                                                i23 = i59;
                                                                                p5Var = p5Var2;
                                                                                str3 = str4;
                                                                                i52 = i8622;
                                                                                i56 = i8522;
                                                                            }
                                                                        } else {
                                                                            qs0.e("BoxParsers", "Excessive obu_size");
                                                                            mb2Var2 = new mb2(-1, -1, -1, i24, i81, null);
                                                                        }
                                                                    }
                                                                    mb2Var = mb2Var2;
                                                                    int i85222 = mb2Var.f7079e;
                                                                    int i86222 = mb2Var.f7080f;
                                                                    int i87222 = mb2Var.f7075a;
                                                                    int i88222 = mb2Var.f7076b;
                                                                    iB2 = mb2Var.f7077c;
                                                                    str2 = "video/av01";
                                                                    i53 = i87222;
                                                                    i51 = i88222;
                                                                    i23 = i59;
                                                                    p5Var = p5Var2;
                                                                    str3 = str4;
                                                                    i52 = i86222;
                                                                    i56 = i85222;
                                                                } else {
                                                                    i24 = -1;
                                                                    int i812 = i24;
                                                                    int i822 = 13;
                                                                    l42Var.D(13);
                                                                    l42Var.C();
                                                                    iW = l42Var.w(4);
                                                                    if (iW != 1) {
                                                                    }
                                                                    mb2Var = mb2Var2;
                                                                    int i852222 = mb2Var.f7079e;
                                                                    int i862222 = mb2Var.f7080f;
                                                                    int i872222 = mb2Var.f7075a;
                                                                    int i882222 = mb2Var.f7076b;
                                                                    iB2 = mb2Var.f7077c;
                                                                    str2 = "video/av01";
                                                                    i53 = i872222;
                                                                    i51 = i882222;
                                                                    i23 = i59;
                                                                    p5Var = p5Var2;
                                                                    str3 = str4;
                                                                    i52 = i862222;
                                                                    i56 = i852222;
                                                                }
                                                            } else if (zG) {
                                                                if (true == zG2) {
                                                                    i78 = 12;
                                                                }
                                                                i24 = i78;
                                                                int i8122 = i24;
                                                                int i8222 = 13;
                                                                l42Var.D(13);
                                                                l42Var.C();
                                                                iW = l42Var.w(4);
                                                                if (iW != 1) {
                                                                }
                                                                mb2Var = mb2Var2;
                                                                int i8522222 = mb2Var.f7079e;
                                                                int i8622222 = mb2Var.f7080f;
                                                                int i8722222 = mb2Var.f7075a;
                                                                int i8822222 = mb2Var.f7076b;
                                                                iB2 = mb2Var.f7077c;
                                                                str2 = "video/av01";
                                                                i53 = i8722222;
                                                                i51 = i8822222;
                                                                i23 = i59;
                                                                p5Var = p5Var2;
                                                                str3 = str4;
                                                                i52 = i8622222;
                                                                i56 = i8522222;
                                                            } else {
                                                                iW3 = 2;
                                                                zG = false;
                                                                if (iW3 > 2) {
                                                                }
                                                            }
                                                        } else if (iQ11 == 1668050025) {
                                                            if (byteBufferOrder == null) {
                                                                byteBufferOrder = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                                            }
                                                            ByteBuffer byteBuffer = byteBufferOrder;
                                                            byteBuffer.position(21);
                                                            byteBuffer.putShort(ex0Var.d());
                                                            byteBuffer.putShort(ex0Var.d());
                                                            byteBufferOrder = byteBuffer;
                                                            i23 = i59;
                                                            p5Var = p5Var2;
                                                            str3 = str4;
                                                            i56 = i20;
                                                            i51 = i21;
                                                            i52 = i22;
                                                        } else {
                                                            if (iQ11 == 1835295606) {
                                                                if (byteBufferOrder == null) {
                                                                    byteBufferOrder = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                                                }
                                                                ByteBuffer byteBuffer2 = byteBufferOrder;
                                                                short sD = ex0Var.d();
                                                                short sD2 = ex0Var.d();
                                                                short sD3 = ex0Var.d();
                                                                short sD4 = ex0Var.d();
                                                                i23 = i59;
                                                                short sD5 = ex0Var.d();
                                                                str3 = str4;
                                                                short sD6 = ex0Var.d();
                                                                f0Var = f0Var3;
                                                                short sD7 = ex0Var.d();
                                                                p5Var = p5Var2;
                                                                short sD8 = ex0Var.d();
                                                                long jD4 = ex0Var.D();
                                                                long jD5 = ex0Var.D();
                                                                list = listN;
                                                                byteBuffer2.position(1);
                                                                byteBuffer2.putShort(sD5);
                                                                byteBuffer2.putShort(sD6);
                                                                byteBuffer2.putShort(sD);
                                                                byteBuffer2.putShort(sD2);
                                                                byteBuffer2.putShort(sD3);
                                                                byteBuffer2.putShort(sD4);
                                                                byteBuffer2.putShort(sD7);
                                                                byteBuffer2.putShort(sD8);
                                                                byteBuffer2.putShort((short) (jD4 / 10000));
                                                                byteBuffer2.putShort((short) (jD5 / 10000));
                                                                byteBufferOrder = byteBuffer2;
                                                            } else {
                                                                list = listN;
                                                                i23 = i59;
                                                                p5Var = p5Var2;
                                                                str3 = str4;
                                                                f0Var = f0Var3;
                                                                if (iQ11 == 1681012275) {
                                                                    me0.l(null, str2 == null);
                                                                    str2 = "video/3gpp";
                                                                } else if (iQ11 == 1702061171) {
                                                                    me0.l(null, str2 == null);
                                                                    m5 m5VarG = g(i57, ex0Var);
                                                                    String str10 = m5VarG.f6937a;
                                                                    byte[] bArr5 = m5VarG.f6938b;
                                                                    if (bArr5 != null) {
                                                                        m5Var = m5VarG;
                                                                        str2 = str10;
                                                                        listN = bo1.n(bArr5);
                                                                        i56 = i20;
                                                                        f0Var3 = f0Var;
                                                                        i51 = i21;
                                                                        i52 = i22;
                                                                    } else {
                                                                        m5Var = m5VarG;
                                                                        str2 = str10;
                                                                    }
                                                                } else if (iQ11 == 1885434736) {
                                                                    ex0Var.j(i57 + 8);
                                                                    fY = ex0Var.y() / ex0Var.y();
                                                                    i56 = i20;
                                                                    f0Var3 = f0Var;
                                                                    i51 = i21;
                                                                    i52 = i22;
                                                                    listN = list;
                                                                    z15 = true;
                                                                } else if (iQ11 == 1937126244) {
                                                                    int i89 = i57 + 8;
                                                                    while (i89 - i57 < i18) {
                                                                        ex0Var.j(i89);
                                                                        int iQ14 = ex0Var.q() + i89;
                                                                        if (ex0Var.q() == 1886547818) {
                                                                            bArrCopyOfRange = Arrays.copyOfRange(ex0Var.f4416a, i89, iQ14);
                                                                        } else {
                                                                            i89 = iQ14;
                                                                        }
                                                                    }
                                                                    i56 = i20;
                                                                    f0Var3 = f0Var;
                                                                    i51 = i21;
                                                                    i52 = i22;
                                                                    listN = list;
                                                                    bArrCopyOfRange = null;
                                                                } else if (iQ11 == 1936995172) {
                                                                    int iV5 = ex0Var.v();
                                                                    ex0Var.k(3);
                                                                    if (iV5 == 0) {
                                                                        int iV6 = ex0Var.v();
                                                                        if (iV6 == 0) {
                                                                            i56 = i20;
                                                                            f0Var3 = f0Var;
                                                                            i51 = i21;
                                                                            i52 = i22;
                                                                            listN = list;
                                                                            i50 = 0;
                                                                        } else if (iV6 == 1) {
                                                                            i56 = i20;
                                                                            f0Var3 = f0Var;
                                                                            i51 = i21;
                                                                            i52 = i22;
                                                                            listN = list;
                                                                            i50 = 1;
                                                                        } else if (iV6 == 2) {
                                                                            i56 = i20;
                                                                            f0Var3 = f0Var;
                                                                            i51 = i21;
                                                                            i52 = i22;
                                                                            listN = list;
                                                                            i50 = 2;
                                                                        } else if (iV6 == 3) {
                                                                            i50 = 3;
                                                                            i56 = i20;
                                                                            f0Var3 = f0Var;
                                                                            i51 = i21;
                                                                            i52 = i22;
                                                                            listN = list;
                                                                        }
                                                                    }
                                                                } else if (iQ11 == 1668246642) {
                                                                    if (i53 == -1) {
                                                                        if (iB2 == -1) {
                                                                            int iQ15 = ex0Var.q();
                                                                            if (iQ15 == 1852009592 || iQ15 == 1852009571) {
                                                                                int iZ4 = ex0Var.z();
                                                                                int iZ5 = ex0Var.z();
                                                                                ex0Var.k(2);
                                                                                if (i18 != 19) {
                                                                                    z9 = false;
                                                                                    int iA5 = mb2.a(iZ4);
                                                                                    int i90 = true != z9 ? 2 : 1;
                                                                                    i53 = iA5;
                                                                                    iB2 = mb2.b(iZ5);
                                                                                    i51 = i90;
                                                                                    i56 = i20;
                                                                                    f0Var3 = f0Var;
                                                                                    i52 = i22;
                                                                                    listN = list;
                                                                                } else if ((ex0Var.v() & 128) != 0) {
                                                                                    i18 = 19;
                                                                                    z9 = true;
                                                                                    int iA52 = mb2.a(iZ4);
                                                                                    if (true != z9) {
                                                                                    }
                                                                                    i53 = iA52;
                                                                                    iB2 = mb2.b(iZ5);
                                                                                    i51 = i90;
                                                                                    i56 = i20;
                                                                                    f0Var3 = f0Var;
                                                                                    i52 = i22;
                                                                                    listN = list;
                                                                                } else {
                                                                                    i18 = 19;
                                                                                    z9 = false;
                                                                                    int iA522 = mb2.a(iZ4);
                                                                                    if (true != z9) {
                                                                                    }
                                                                                    i53 = iA522;
                                                                                    iB2 = mb2.b(iZ5);
                                                                                    i51 = i90;
                                                                                    i56 = i20;
                                                                                    f0Var3 = f0Var;
                                                                                    i52 = i22;
                                                                                    listN = list;
                                                                                }
                                                                            } else {
                                                                                qs0.f("BoxParsers", "Unsupported color type: ".concat(v61.a(iQ15)));
                                                                                i53 = -1;
                                                                                iB2 = -1;
                                                                            }
                                                                        } else {
                                                                            i53 = -1;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            i56 = i20;
                                                            f0Var3 = f0Var;
                                                            i51 = i21;
                                                            i52 = i22;
                                                            listN = list;
                                                        }
                                                    }
                                                }
                                                i56 = i20;
                                                f0Var3 = f0Var;
                                                i51 = i21;
                                                i52 = i22;
                                                listN = list;
                                            }
                                            break;
                                        }
                                        int i91 = i57 + 8;
                                        me0.l(null, str2 == null);
                                        ex0Var.j(i91);
                                        g0 g0VarA = g0.a(ex0Var);
                                        listN = g0VarA.f4847a;
                                        p5Var2.f7938c = g0VarA.f4848b;
                                        if (z15) {
                                            z14 = true;
                                        } else {
                                            fY = g0VarA.f4856k;
                                            z14 = false;
                                        }
                                        String str11 = g0VarA.f4857l;
                                        int i92 = g0VarA.f4855j;
                                        int i93 = g0VarA.f4853g;
                                        int i94 = g0VarA.h;
                                        int i95 = g0VarA.f4854i;
                                        z15 = z14;
                                        i54 = i92;
                                        p5Var = p5Var2;
                                        i23 = iIntValue;
                                        i56 = g0VarA.f4851e;
                                        str3 = str4;
                                        iB2 = i95;
                                        i53 = i93;
                                        i51 = i94;
                                        i52 = g0VarA.f4852f;
                                        str2 = "video/avc";
                                        str6 = str11;
                                        i55 = i58 + i18;
                                        iIntValue = i23;
                                        i46 = i19;
                                        str4 = str3;
                                        p5Var2 = p5Var;
                                        i47 = 5;
                                    }
                                    List list3 = listN;
                                    i15 = i46;
                                    int i96 = i56;
                                    int i97 = i51;
                                    int i98 = i52;
                                    p5 p5Var3 = p5Var2;
                                    c8 = 65535;
                                    c9 = '\f';
                                    if (str2 == null) {
                                        i17 = i49;
                                        i16 = i45;
                                        p5Var2 = p5Var3;
                                    } else {
                                        tk2 tk2Var = new tk2();
                                        i16 = i45;
                                        tk2Var.b(i16);
                                        tk2Var.c(str2);
                                        tk2Var.f9327i = str6;
                                        tk2Var.s = iZ2;
                                        tk2Var.f9337t = iZ3;
                                        tk2Var.f9340w = fY;
                                        i17 = i49;
                                        tk2Var.f9339v = i17;
                                        tk2Var.f9341x = bArrCopyOfRange;
                                        tk2Var.f9342y = i50;
                                        tk2Var.f9333o = list3;
                                        tk2Var.f9332n = i54;
                                        tk2Var.f9334p = ih2Var2;
                                        tk2Var.f9343z = new mb2(i53, i97, iB2, i96, i98, byteBufferOrder != null ? byteBufferOrder.array() : null);
                                        m5 m5Var2 = m5Var;
                                        if (m5Var2 != null) {
                                            tk2Var.f9326g = ed0.t(m5Var2.f6939c);
                                            tk2Var.h = ed0.t(m5Var2.f6940d);
                                        }
                                        p5Var2 = p5Var3;
                                        p5Var2.f7937b = new w(tk2Var);
                                    }
                                } else if (iQ9 == 1836069985 || iQ9 == 1701733217 || iQ9 == 1633889587 || iQ9 == 1700998451 || iQ9 == 1633889588 || iQ9 == 1835823201 || iQ9 == 1685353315 || iQ9 == 1685353317 || iQ9 == 1685353320 || iQ9 == 1685353324 || iQ9 == 1685353336 || iQ9 == 1935764850 || iQ9 == 1935767394 || iQ9 == 1819304813 || iQ9 == 1936684916 || iQ9 == 1953984371 || iQ9 == 778924082 || iQ9 == 778924083 || iQ9 == 1835557169 || iQ9 == 1835560241 || iQ9 == 1634492771 || iQ9 == 1634492791 || iQ9 == 1970037111 || iQ9 == 1332770163 || iQ9 == 1716281667 || iQ9 == 1767992678) {
                                    ex0Var = ex0Var5;
                                    i10 = iQ7;
                                    int i99 = iQ2;
                                    i11 = i44;
                                    String str12 = string;
                                    arrayList3 = arrayList6;
                                    h(ex0Var, iQ9, i43, iQ8, i99, str12, z7, ih2Var, p5Var2, i42);
                                    i17 = i6;
                                    i13 = i43;
                                    i15 = iQ8;
                                    i16 = i99;
                                    str = str12;
                                    i12 = i42;
                                    arrayList4 = arrayList7;
                                    i14 = i35;
                                    s51Var3 = s51Var5;
                                    c8 = c11;
                                    c9 = '\f';
                                } else {
                                    if (iQ9 == 1414810956 || iQ9 == 1954034535 || iQ9 == 2004251764 || iQ9 == 1937010800 || iQ9 == 1664495672) {
                                        ex0Var5.j(i43 + 16);
                                        String str13 = "application/ttml+xml";
                                        if (iQ9 == 1414810956) {
                                            i34 = i43;
                                            i11 = i44;
                                            j10 = Long.MAX_VALUE;
                                            cp1VarN = null;
                                            tk2 tk2Var2 = new tk2();
                                            tk2Var2.b(iQ2);
                                            tk2Var2.c(str13);
                                            tk2Var2.f9323d = string;
                                            tk2Var2.f9335q = j10;
                                            tk2Var2.f9333o = cp1VarN;
                                            p5Var2.f7937b = new w(tk2Var2);
                                            ex0Var = ex0Var5;
                                            str = string;
                                            i10 = iQ7;
                                            i16 = iQ2;
                                            i12 = i42;
                                            arrayList4 = arrayList7;
                                            i14 = i35;
                                            s51Var3 = s51Var5;
                                            c8 = c11;
                                            i15 = iQ8;
                                            i13 = i34;
                                        } else if (iQ9 == 1954034535) {
                                            int i100 = iQ8 - 16;
                                            byte[] bArr6 = new byte[i100];
                                            ex0Var5.f(0, i100, bArr6);
                                            cp1VarN = bo1.n(bArr6);
                                            str13 = "application/x-quicktime-tx3g";
                                            i34 = i43;
                                            i11 = i44;
                                            j10 = Long.MAX_VALUE;
                                            tk2 tk2Var22 = new tk2();
                                            tk2Var22.b(iQ2);
                                            tk2Var22.c(str13);
                                            tk2Var22.f9323d = string;
                                            tk2Var22.f9335q = j10;
                                            tk2Var22.f9333o = cp1VarN;
                                            p5Var2.f7937b = new w(tk2Var22);
                                            ex0Var = ex0Var5;
                                            str = string;
                                            i10 = iQ7;
                                            i16 = iQ2;
                                            i12 = i42;
                                            arrayList4 = arrayList7;
                                            i14 = i35;
                                            s51Var3 = s51Var5;
                                            c8 = c11;
                                            i15 = iQ8;
                                            i13 = i34;
                                        } else {
                                            if (iQ9 == 2004251764) {
                                                str13 = "application/x-mp4-vtt";
                                            } else if (iQ9 == 1937010800) {
                                                i34 = i43;
                                                i11 = i44;
                                                j10 = 0;
                                                cp1VarN = null;
                                                tk2 tk2Var222 = new tk2();
                                                tk2Var222.b(iQ2);
                                                tk2Var222.c(str13);
                                                tk2Var222.f9323d = string;
                                                tk2Var222.f9335q = j10;
                                                tk2Var222.f9333o = cp1VarN;
                                                p5Var2.f7937b = new w(tk2Var222);
                                                ex0Var = ex0Var5;
                                                str = string;
                                                i10 = iQ7;
                                                i16 = iQ2;
                                                i12 = i42;
                                                arrayList4 = arrayList7;
                                                i14 = i35;
                                                s51Var3 = s51Var5;
                                                c8 = c11;
                                                i15 = iQ8;
                                                i13 = i34;
                                            } else {
                                                p5Var2.f7939d = 1;
                                                str13 = "application/x-mp4-cea-608";
                                            }
                                            i34 = i43;
                                            i11 = i44;
                                            j10 = Long.MAX_VALUE;
                                            cp1VarN = null;
                                            tk2 tk2Var2222 = new tk2();
                                            tk2Var2222.b(iQ2);
                                            tk2Var2222.c(str13);
                                            tk2Var2222.f9323d = string;
                                            tk2Var2222.f9335q = j10;
                                            tk2Var2222.f9333o = cp1VarN;
                                            p5Var2.f7937b = new w(tk2Var2222);
                                            ex0Var = ex0Var5;
                                            str = string;
                                            i10 = iQ7;
                                            i16 = iQ2;
                                            i12 = i42;
                                            arrayList4 = arrayList7;
                                            i14 = i35;
                                            s51Var3 = s51Var5;
                                            c8 = c11;
                                            i15 = iQ8;
                                            i13 = i34;
                                        }
                                    } else {
                                        if (iQ9 == 1835365492) {
                                            ex0Var5.j(i43 + 16);
                                            ex0Var5.G();
                                            String strG = ex0Var5.G();
                                            if (strG != null) {
                                                tk2 tk2Var3 = new tk2();
                                                tk2Var3.b(iQ2);
                                                tk2Var3.c(strG);
                                                p5Var2.f7937b = new w(tk2Var3);
                                            }
                                        } else if (iQ9 == 1667329389) {
                                            tk2 tk2Var4 = new tk2();
                                            tk2Var4.b(iQ2);
                                            tk2Var4.c("application/x-camera-motion");
                                            p5Var2.f7937b = new w(tk2Var4);
                                        }
                                        ex0Var = ex0Var5;
                                        str = string;
                                        i10 = iQ7;
                                        i16 = iQ2;
                                        i13 = i43;
                                        i11 = i44;
                                        i12 = i42;
                                        arrayList4 = arrayList7;
                                        i14 = i35;
                                        s51Var3 = s51Var5;
                                        c8 = c11;
                                        i15 = iQ8;
                                    }
                                    c9 = '\f';
                                    i17 = i6;
                                    arrayList3 = arrayList6;
                                }
                                ex0Var.j(i13 + i15);
                                iQ2 = i16;
                                c11 = c8;
                                iQ7 = i10;
                                string = str;
                                arrayList6 = arrayList3;
                                i35 = i14;
                                arrayList7 = arrayList4;
                                i36 = i11;
                                s51Var5 = s51Var3;
                                i42 = i12 + 1;
                                i6 = i17;
                                ex0Var5 = ex0Var;
                            }
                            int i101 = i36;
                            int i102 = iQ2;
                            arrayList = arrayList6;
                            arrayList2 = arrayList7;
                            i9 = i35;
                            s51 s51Var6 = s51Var5;
                            if (z6) {
                                s51Var2 = s51Var6;
                            } else {
                                s51Var2 = s51Var6;
                                s51 s51VarB4 = s51Var2.b(1701082227);
                                if (s51VarB4 != null) {
                                    j61 j61VarC6 = s51VarB4.c(1701606260);
                                    if (j61VarC6 == null) {
                                        pairCreate = null;
                                    } else {
                                        ex0 ex0Var6 = j61VarC6.f5954b;
                                        ex0Var6.j(8);
                                        int iA6 = a(ex0Var6.q());
                                        int iY = ex0Var6.y();
                                        long[] jArr3 = new long[iY];
                                        long[] jArr4 = new long[iY];
                                        for (int i103 = 0; i103 < iY; i103++) {
                                            jArr3[i103] = iA6 == 1 ? ex0Var6.E() : ex0Var6.D();
                                            jArr4[i103] = iA6 == 1 ? ex0Var6.C() : ex0Var6.q();
                                            if (ex0Var6.d() != 1) {
                                                throw new IllegalArgumentException("Unsupported media rate.");
                                            }
                                            ex0Var6.k(2);
                                        }
                                        pairCreate = Pair.create(jArr3, jArr4);
                                    }
                                    if (pairCreate != null) {
                                        long[] jArr5 = (long[]) pairCreate.first;
                                        j9 = jU2;
                                        jArr2 = (long[]) pairCreate.second;
                                        jArr = jArr5;
                                    }
                                    wVar = p5Var2.f7937b;
                                    if (wVar != null) {
                                        pl1Var2 = pl1Var;
                                    } else {
                                        f6 f6Var3 = new f6(i102, i101, jD2, j8, j9, jU, wVar, p5Var2.f7939d, p5Var2.f7936a, p5Var2.f7938c, jArr, jArr2);
                                        pl1Var2 = pl1Var;
                                        f6Var = f6Var3;
                                        f6Var2 = (f6) pl1Var2.apply(f6Var);
                                        if (f6Var2 == null) {
                                            s51 s51VarB5 = s51Var2.b(1835297121);
                                            s51VarB5.getClass();
                                            s51 s51VarB6 = s51VarB5.b(1835626086);
                                            s51VarB6.getClass();
                                            s51 s51VarB7 = s51VarB6.b(1937007212);
                                            s51VarB7.getClass();
                                            i6 i6VarC = c(f6Var2, s51VarB7, g1Var);
                                            arrayList5 = arrayList2;
                                            arrayList5.add(i6VarC);
                                        } else {
                                            arrayList5 = arrayList2;
                                        }
                                    }
                                }
                            }
                            j9 = jU2;
                            jArr = null;
                            jArr2 = null;
                            wVar = p5Var2.f7937b;
                            if (wVar != null) {
                            }
                        } else {
                            iQ4 = -65536;
                            iQ3 = 0;
                        }
                        i6 = (iQ3 != -65536 && iQ4 == 0 && i40 == 0 && iQ6 == -65536) ? 180 : 0;
                        if (j6 != -9223372036854775807L) {
                        }
                        long j112 = b(j61VarC2.f5954b).f8592u;
                        if (j7 != -9223372036854775807L) {
                        }
                        s51 s51VarB22 = s51VarB.b(1835626086);
                        s51VarB22.getClass();
                        s51 s51VarB32 = s51VarB22.b(1937007212);
                        s51VarB32.getClass();
                        j61 j61VarC52 = s51VarB.c(1835296868);
                        j61VarC52.getClass();
                        ex0 ex0Var42 = j61VarC52.f5954b;
                        ex0Var42.j(8);
                        iA = a(ex0Var42.q());
                        ex0Var42.k(iA != 0 ? 8 : 16);
                        long jD22 = ex0Var42.D();
                        int i412 = ex0Var42.f4417b;
                        i7 = 0;
                        while (true) {
                            if (iA != 0) {
                            }
                            if (i7 < i8) {
                            }
                            i7++;
                        }
                        int iZ6 = ex0Var42.z();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append((char) (((iZ6 >> 10) & 31) + 96));
                        sb2.append((char) (((iZ6 >> 5) & 31) + 96));
                        sb2.append((char) ((iZ6 & 31) + 96));
                        String string2 = sb2.toString();
                        j61VarC = s51VarB32.c(1937011556);
                        if (j61VarC != null) {
                        }
                    } else {
                        if (iQ4 == 65536) {
                            if (iQ5 == -65536) {
                                if (iQ6 == 0) {
                                    i6 = 90;
                                    if (j6 != -9223372036854775807L) {
                                    }
                                    long j1122 = b(j61VarC2.f5954b).f8592u;
                                    if (j7 != -9223372036854775807L) {
                                    }
                                    s51 s51VarB222 = s51VarB.b(1835626086);
                                    s51VarB222.getClass();
                                    s51 s51VarB322 = s51VarB222.b(1937007212);
                                    s51VarB322.getClass();
                                    j61 j61VarC522 = s51VarB.c(1835296868);
                                    j61VarC522.getClass();
                                    ex0 ex0Var422 = j61VarC522.f5954b;
                                    ex0Var422.j(8);
                                    iA = a(ex0Var422.q());
                                    ex0Var422.k(iA != 0 ? 8 : 16);
                                    long jD222 = ex0Var422.D();
                                    int i4122 = ex0Var422.f4417b;
                                    i7 = 0;
                                    while (true) {
                                        if (iA != 0) {
                                        }
                                        if (i7 < i8) {
                                        }
                                        i7++;
                                    }
                                    int iZ62 = ex0Var422.z();
                                    StringBuilder sb22 = new StringBuilder();
                                    sb22.append((char) (((iZ62 >> 10) & 31) + 96));
                                    sb22.append((char) (((iZ62 >> 5) & 31) + 96));
                                    sb22.append((char) ((iZ62 & 31) + 96));
                                    String string22 = sb22.toString();
                                    j61VarC = s51VarB322.c(1937011556);
                                    if (j61VarC != null) {
                                    }
                                } else {
                                    iQ5 = -65536;
                                }
                            }
                            iQ4 = 65536;
                        }
                        iQ3 = 0;
                        if (iQ3 == 0) {
                        }
                        if (iQ3 != -65536) {
                            if (j6 != -9223372036854775807L) {
                            }
                            long j11222 = b(j61VarC2.f5954b).f8592u;
                            if (j7 != -9223372036854775807L) {
                            }
                            s51 s51VarB2222 = s51VarB.b(1835626086);
                            s51VarB2222.getClass();
                            s51 s51VarB3222 = s51VarB2222.b(1937007212);
                            s51VarB3222.getClass();
                            j61 j61VarC5222 = s51VarB.c(1835296868);
                            j61VarC5222.getClass();
                            ex0 ex0Var4222 = j61VarC5222.f5954b;
                            ex0Var4222.j(8);
                            iA = a(ex0Var4222.q());
                            ex0Var4222.k(iA != 0 ? 8 : 16);
                            long jD2222 = ex0Var4222.D();
                            int i41222 = ex0Var4222.f4417b;
                            i7 = 0;
                            while (true) {
                                if (iA != 0) {
                                }
                                if (i7 < i8) {
                                }
                                i7++;
                            }
                            int iZ622 = ex0Var4222.z();
                            StringBuilder sb222 = new StringBuilder();
                            sb222.append((char) (((iZ622 >> 10) & 31) + 96));
                            sb222.append((char) (((iZ622 >> 5) & 31) + 96));
                            sb222.append((char) ((iZ622 & 31) + 96));
                            String string222 = sb222.toString();
                            j61VarC = s51VarB3222.c(1937011556);
                            if (j61VarC != null) {
                            }
                        }
                    }
                }
                f6Var = null;
                f6Var2 = (f6) pl1Var2.apply(f6Var);
                if (f6Var2 == null) {
                }
            }
            i35 = i9 + 1;
            s51Var4 = s51Var;
            arrayList7 = arrayList5;
            arrayList6 = arrayList;
        }
        return arrayList7;
    }

    public static int e(ex0 ex0Var) {
        int iV = ex0Var.v();
        int i6 = iV & 127;
        while ((iV & 128) == 128) {
            iV = ex0Var.v();
            i6 = (i6 << 7) | (iV & 127);
        }
        return i6;
    }

    public static Pair f(ex0 ex0Var, int i6, int i7) throws rn {
        Integer num;
        g6 g6Var;
        Pair pairCreate;
        int i8;
        int i9;
        Integer num2;
        boolean z6;
        int i10 = ex0Var.f4417b;
        while (i10 - i6 < i7) {
            ex0Var.j(i10);
            int iQ = ex0Var.q();
            me0.l("childAtomSize must be positive", iQ > 0);
            if (ex0Var.q() == 1936289382) {
                int i11 = i10 + 8;
                int i12 = 0;
                int i13 = -1;
                Integer numValueOf = null;
                String strB = null;
                while (i11 - i10 < iQ) {
                    ex0Var.j(i11);
                    int iQ2 = ex0Var.q();
                    int iQ3 = ex0Var.q();
                    if (iQ3 == 1718775137) {
                        numValueOf = Integer.valueOf(ex0Var.q());
                    } else if (iQ3 == 1935894637) {
                        ex0Var.k(4);
                        strB = ex0Var.b(4, StandardCharsets.UTF_8);
                    } else if (iQ3 == 1935894633) {
                        i13 = i11;
                        i12 = iQ2;
                    }
                    i11 += iQ2;
                }
                byte[] bArr = null;
                if ("cenc".equals(strB) || "cbc1".equals(strB) || "cens".equals(strB) || "cbcs".equals(strB)) {
                    me0.l("frma atom is mandatory", numValueOf != null);
                    me0.l("schi atom is mandatory", i13 != -1);
                    int i14 = i13 + 8;
                    while (true) {
                        if (i14 - i13 >= i12) {
                            num = numValueOf;
                            g6Var = null;
                            break;
                        }
                        ex0Var.j(i14);
                        int iQ4 = ex0Var.q();
                        if (ex0Var.q() == 1952804451) {
                            int iA = a(ex0Var.q());
                            ex0Var.k(1);
                            if (iA == 0) {
                                ex0Var.k(1);
                                i9 = 0;
                                i8 = 0;
                            } else {
                                int iV = ex0Var.v();
                                i8 = iV & 15;
                                i9 = (iV & 240) >> 4;
                            }
                            if (ex0Var.v() == 1) {
                                num2 = numValueOf;
                                z6 = true;
                            } else {
                                num2 = numValueOf;
                                z6 = false;
                            }
                            int iV2 = ex0Var.v();
                            byte[] bArr2 = new byte[16];
                            ex0Var.f(0, 16, bArr2);
                            if (z6 && iV2 == 0) {
                                int iV3 = ex0Var.v();
                                byte[] bArr3 = new byte[iV3];
                                ex0Var.f(0, iV3, bArr3);
                                bArr = bArr3;
                            }
                            num = num2;
                            g6Var = new g6(z6, strB, iV2, bArr2, i9, i8, bArr);
                        } else {
                            i14 += iQ4;
                        }
                    }
                    me0.l("tenc atom is mandatory", g6Var != null);
                    int i15 = j31.f5914a;
                    pairCreate = Pair.create(num, g6Var);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            i10 += iQ;
        }
        return null;
    }

    public static m5 g(int i6, ex0 ex0Var) {
        ex0Var.j(i6 + 12);
        ex0Var.k(1);
        e(ex0Var);
        ex0Var.k(2);
        int iV = ex0Var.v();
        if ((iV & 128) != 0) {
            ex0Var.k(2);
        }
        if ((iV & 64) != 0) {
            ex0Var.k(ex0Var.v());
        }
        if ((iV & 32) != 0) {
            ex0Var.k(2);
        }
        ex0Var.k(1);
        e(ex0Var);
        String strD = bk.d(ex0Var.v());
        if ("audio/mpeg".equals(strD) || "audio/vnd.dts".equals(strD) || "audio/vnd.dts.hd".equals(strD)) {
            return new m5(strD, null, -1L, -1L);
        }
        ex0Var.k(4);
        long jD = ex0Var.D();
        long jD2 = ex0Var.D();
        ex0Var.k(1);
        int iE = e(ex0Var);
        long j6 = jD2;
        byte[] bArr = new byte[iE];
        ex0Var.f(0, iE, bArr);
        if (j6 <= 0) {
            j6 = -1;
        }
        return new m5(strD, bArr, j6, jD > 0 ? jD : -1L);
    }

    /* JADX WARN: Removed duplicated region for block: B:207:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0151  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void h(ex0 ex0Var, int i6, int i7, int i8, int i9, String str, boolean z6, ih2 ih2Var, p5 p5Var, int i10) throws rn {
        int iZ;
        int i11;
        int iZ2;
        int iQ;
        int i12;
        int i13;
        String str2;
        int i14;
        String str3;
        String str4;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        String str5;
        boolean z7;
        cp1 cp1VarN;
        int i20;
        boolean z8;
        ex0 ex0Var2 = ex0Var;
        int i21 = i8;
        ih2 ih2VarL = ih2Var;
        int[] iArr = d0.f3704w;
        int[] iArr2 = d0.f3702u;
        ex0Var2.j(i7 + 16);
        if (z6) {
            iZ = ex0Var2.z();
            ex0Var2.k(6);
        } else {
            ex0Var2.k(8);
            iZ = 0;
        }
        if (iZ == 0 || iZ == 1) {
            i11 = 2;
            iZ2 = ex0Var2.z();
            ex0Var2.k(6);
            int iW = ex0Var2.w();
            ex0Var2.j(ex0Var2.f4417b - 4);
            iQ = ex0Var2.q();
            if (iZ == 1) {
                ex0Var2.k(16);
            }
            i12 = iW;
            i13 = -1;
        } else {
            if (iZ != 2) {
                return;
            }
            ex0Var2.k(16);
            i11 = 2;
            int iRound = (int) Math.round(Double.longBitsToDouble(ex0Var2.C()));
            int iY = ex0Var2.y();
            ex0Var2.k(4);
            int iY2 = ex0Var2.y();
            int iY3 = ex0Var2.y();
            int i22 = iY3 & 1;
            int i23 = iY3 & 2;
            if (i22 == 0) {
                i13 = iY2 == 8 ? 3 : iY2 == 16 ? i23 != 0 ? 268435456 : 2 : iY2 == 24 ? i23 != 0 ? 1342177280 : 21 : iY2 == 32 ? i23 != 0 ? 1610612736 : 22 : -1;
                ex0Var2.k(8);
                i12 = iRound;
                iZ2 = iY;
                iQ = 0;
            } else {
                if (iY2 == 32) {
                    i13 = 4;
                }
                ex0Var2.k(8);
                i12 = iRound;
                iZ2 = iY;
                iQ = 0;
            }
        }
        if (i6 == 1767992678) {
            i12 = -1;
        }
        if (i6 == 1767992678) {
            iZ2 = -1;
        }
        int i24 = ex0Var2.f4417b;
        int iIntValue = 1701733217;
        if (i6 == 1701733217) {
            Pair pairF = f(ex0Var2, i7, i21);
            if (pairF != null) {
                iIntValue = ((Integer) pairF.first).intValue();
                ih2VarL = ih2VarL == null ? null : ih2VarL.l(((g6) pairF.second).f4903b);
                p5Var.f7936a[i10] = (g6) pairF.second;
            }
            ex0Var2.j(i24);
        } else {
            iIntValue = i6;
        }
        String str6 = "audio/mhm1";
        String str7 = "audio/ac4";
        String str8 = "audio/ac3";
        if (iIntValue == 1633889587) {
            str2 = "audio/ac3";
        } else if (iIntValue == 1700998451) {
            str2 = "audio/eac3";
        } else if (iIntValue == 1633889588) {
            str2 = "audio/ac4";
        } else if (iIntValue == 1685353315) {
            str2 = "audio/vnd.dts";
        } else if (iIntValue == 1685353320 || iIntValue == 1685353324) {
            str2 = "audio/vnd.dts.hd";
        } else if (iIntValue == 1685353317) {
            str2 = "audio/vnd.dts.hd;profile=lbr";
        } else if (iIntValue == 1685353336) {
            str2 = "audio/vnd.dts.uhd;profile=p2";
        } else if (iIntValue == 1935764850) {
            str2 = "audio/3gpp";
        } else if (iIntValue == 1935767394) {
            str2 = "audio/amr-wb";
        } else if (iIntValue != 1936684916) {
            if (iIntValue == 1953984371) {
                str2 = "audio/raw";
                i13 = 268435456;
            } else if (iIntValue == 1819304813) {
                if (i13 == -1) {
                    i13 = i11;
                }
                str2 = "audio/raw";
            } else {
                str2 = (iIntValue == 778924082 || iIntValue == 778924083) ? "audio/mpeg" : iIntValue == 1835557169 ? "audio/mha1" : iIntValue == 1835560241 ? "audio/mhm1" : iIntValue == 1634492771 ? "audio/alac" : iIntValue == 1634492791 ? "audio/g711-alaw" : iIntValue == 1970037111 ? "audio/g711-mlaw" : iIntValue == 1332770163 ? "audio/opus" : iIntValue == 1716281667 ? "audio/flac" : iIntValue == 1835823201 ? "audio/true-hd" : iIntValue == 1767992678 ? "audio/iamf" : null;
            }
        }
        int i25 = i13;
        List listN = null;
        String str9 = null;
        m5 m5Var = null;
        while (i24 - i7 < i21) {
            ex0Var2.j(i24);
            int iQ2 = ex0Var2.q();
            int i26 = i12;
            me0.l("childAtomSize must be positive", iQ2 > 0);
            int iQ3 = ex0Var2.q();
            int i27 = iZ2;
            if (iQ3 == 1835557187) {
                ex0Var2.j(i24 + 8);
                ex0Var2.k(1);
                int iV = ex0Var2.v();
                ex0Var2.k(1);
                String str10 = Objects.equals(str2, str6) ? String.format("mhm1.%02X", Integer.valueOf(iV)) : String.format("mha1.%02X", Integer.valueOf(iV));
                int iZ3 = ex0Var2.z();
                byte[] bArr = new byte[iZ3];
                String str11 = str10;
                ex0Var2.f(0, iZ3, bArr);
                if (listN == null) {
                    listN = bo1.n(bArr);
                    iZ2 = i27;
                    str9 = str11;
                    str5 = str7;
                    str3 = str8;
                    str4 = str6;
                    i15 = i24;
                    i16 = iQ2;
                    i12 = i26;
                } else {
                    listN = bo1.o(bArr, (byte[]) listN.get(0));
                    iZ2 = i27;
                    str9 = str11;
                    str5 = str7;
                    str3 = str8;
                    str4 = str6;
                    i15 = i24;
                    i16 = iQ2;
                    i12 = i26;
                }
            } else {
                if (iQ3 == 1835557200) {
                    ex0Var2.j(i24 + 8);
                    int iV2 = ex0Var2.v();
                    if (iV2 > 0) {
                        byte[] bArr2 = new byte[iV2];
                        ex0Var2.f(0, iV2, bArr2);
                        if (listN == null) {
                            listN = bo1.n(bArr2);
                            iZ2 = i27;
                            str5 = str7;
                            str3 = str8;
                            str4 = str6;
                            i15 = i24;
                            i16 = iQ2;
                            i12 = i26;
                        } else {
                            listN = bo1.o((byte[]) listN.get(0), bArr2);
                            iZ2 = i27;
                            str5 = str7;
                            str3 = str8;
                            str4 = str6;
                            i15 = i24;
                            i16 = iQ2;
                            i12 = i26;
                        }
                    } else {
                        i14 = i27;
                        str5 = str7;
                        str3 = str8;
                        str4 = str6;
                        i15 = i24;
                        i16 = iQ2;
                        i12 = i26;
                    }
                } else {
                    if (iQ3 == 1702061171) {
                        i14 = i27;
                        str3 = str8;
                        str4 = str6;
                        i15 = i24;
                        i16 = iQ2;
                        i12 = i26;
                        i17 = iQ;
                        i18 = i15;
                        i19 = -1;
                    } else if (z6 && iQ3 == 2002876005) {
                        int i28 = ex0Var2.f4417b;
                        me0.l(null, i28 >= i24);
                        int i29 = i28;
                        while (true) {
                            if (i29 - i24 >= iQ2) {
                                str4 = str6;
                                i14 = i27;
                                str3 = str8;
                                i15 = i24;
                                i16 = iQ2;
                                i12 = i26;
                                i18 = -1;
                                i19 = -1;
                                break;
                            }
                            ex0Var2.j(i29);
                            int iQ4 = ex0Var2.q();
                            if (iQ4 > 0) {
                                i20 = i29;
                                z8 = true;
                            } else {
                                i20 = i29;
                                z8 = false;
                            }
                            me0.l("childAtomSize must be positive", z8);
                            str4 = str6;
                            if (ex0Var2.q() == 1702061171) {
                                i14 = i27;
                                str3 = str8;
                                i16 = iQ2;
                                i12 = i26;
                                i18 = i20;
                                i19 = -1;
                                i15 = i24;
                                break;
                            }
                            i29 = i20 + iQ4;
                            str6 = str4;
                        }
                        i17 = iQ;
                    } else {
                        str4 = str6;
                        if (iQ3 == 1684103987) {
                            ex0Var2.j(i24 + 8);
                            String string = Integer.toString(i9);
                            l42 l42Var = new l42();
                            l42Var.A(ex0Var2);
                            int i30 = iArr2[l42Var.w(i11)];
                            l42Var.D(8);
                            int i31 = iArr[l42Var.w(3)];
                            i15 = i24;
                            if (l42Var.w(1) != 0) {
                                i31++;
                            }
                            int i32 = d0.f3705x[l42Var.w(5)] * CameraAccessExceptionCompat.CAMERA_DEPRECATED_HAL;
                            l42Var.y();
                            ex0Var2.j(l42Var.u());
                            tk2 tk2Var = new tk2();
                            tk2Var.f9320a = string;
                            tk2Var.c(str8);
                            tk2Var.A = i31;
                            tk2Var.B = i30;
                            tk2Var.f9334p = ih2VarL;
                            tk2Var.f9323d = str;
                            tk2Var.f9326g = i32;
                            tk2Var.h = i32;
                            p5Var.f7937b = new w(tk2Var);
                            i14 = i27;
                            str5 = str7;
                            str3 = str8;
                            i16 = iQ2;
                            i12 = i26;
                            i11 = 2;
                        } else {
                            i15 = i24;
                            if (iQ3 == 1684366131) {
                                ex0Var2.j(i15 + 8);
                                String string2 = Integer.toString(i9);
                                l42 l42Var2 = new l42();
                                l42Var2.A(ex0Var2);
                                int iW2 = l42Var2.w(13) * CameraAccessExceptionCompat.CAMERA_DEPRECATED_HAL;
                                l42Var2.D(3);
                                int i33 = iArr2[l42Var2.w(2)];
                                str3 = str8;
                                l42Var2.D(10);
                                int i34 = iArr[l42Var2.w(3)];
                                if (l42Var2.w(1) != 0) {
                                    i34++;
                                }
                                l42Var2.D(3);
                                int iW3 = l42Var2.w(4);
                                l42Var2.D(1);
                                int i35 = i34;
                                if (iW3 > 0) {
                                    l42Var2.D(6);
                                    int i36 = l42Var2.w(1) != 0 ? i35 + 2 : i35;
                                    l42Var2.D(1);
                                    i34 = i36;
                                }
                                i16 = iQ2;
                                if (l42Var2.t() > 7) {
                                    l42Var2.D(7);
                                    String str12 = l42Var2.w(1) != 0 ? "audio/eac3-joc" : "audio/eac3";
                                    l42Var2.y();
                                    ex0Var2.j(l42Var2.u());
                                    tk2 tk2Var2 = new tk2();
                                    tk2Var2.f9320a = string2;
                                    tk2Var2.c(str12);
                                    tk2Var2.A = i34;
                                    tk2Var2.B = i33;
                                    tk2Var2.f9334p = ih2VarL;
                                    tk2Var2.f9323d = str;
                                    tk2Var2.h = iW2;
                                    p5Var.f7937b = new w(tk2Var2);
                                    i14 = i27;
                                    str5 = str7;
                                    i17 = iQ;
                                    i12 = i26;
                                }
                                i24 = i15 + i16;
                                ex0Var2 = ex0Var;
                                i21 = i8;
                                str7 = str5;
                                iQ = i17;
                                str6 = str4;
                                str8 = str3;
                            } else {
                                str3 = str8;
                                i16 = iQ2;
                                if (iQ3 == 1684103988) {
                                    ex0Var2.j(i15 + 8);
                                    String string3 = Integer.toString(i9);
                                    ex0Var2.k(1);
                                    int iV3 = ex0Var2.v() & 32;
                                    tk2 tk2Var3 = new tk2();
                                    tk2Var3.f9320a = string3;
                                    tk2Var3.c(str7);
                                    tk2Var3.A = 2;
                                    tk2Var3.B = 1 != (iV3 >> 5) ? 44100 : 48000;
                                    tk2Var3.f9334p = ih2VarL;
                                    tk2Var3.f9323d = str;
                                    p5Var.f7937b = new w(tk2Var3);
                                    i14 = i27;
                                    str5 = str7;
                                    i17 = iQ;
                                    i12 = i26;
                                } else {
                                    if (iQ3 == 1684892784) {
                                        if (iQ <= 0) {
                                            throw rn.a(null, "Invalid sample rate for Dolby TrueHD MLP stream: " + iQ);
                                        }
                                        str5 = str7;
                                        i12 = iQ;
                                        i17 = i12;
                                        iZ2 = 2;
                                    } else if (iQ3 == 1684305011 || iQ3 == 1969517683) {
                                        i17 = iQ;
                                        i11 = 2;
                                        tk2 tk2Var4 = new tk2();
                                        tk2Var4.b(i9);
                                        tk2Var4.c(str2);
                                        i14 = i27;
                                        tk2Var4.A = i14;
                                        i12 = i26;
                                        tk2Var4.B = i12;
                                        tk2Var4.f9334p = ih2VarL;
                                        tk2Var4.f9323d = str;
                                        p5Var.f7937b = new w(tk2Var4);
                                        str5 = str7;
                                        iZ2 = i14;
                                        i24 = i15 + i16;
                                        ex0Var2 = ex0Var;
                                        i21 = i8;
                                        str7 = str5;
                                        iQ = i17;
                                        str6 = str4;
                                        str8 = str3;
                                    } else if (iQ3 == 1682927731) {
                                        int i37 = i16 - 8;
                                        byte[] bArr3 = f8792a;
                                        byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length + i37);
                                        ex0Var2.j(i15 + 8);
                                        ex0Var2.f(bArr3.length, i37, bArrCopyOf);
                                        listN = me0.q(bArrCopyOf);
                                        iZ2 = i27;
                                        str5 = str7;
                                        i17 = iQ;
                                        i12 = i26;
                                    } else {
                                        if (iQ3 == 1684425825) {
                                            byte[] bArr4 = new byte[i16 - 8];
                                            bArr4[0] = 102;
                                            bArr4[1] = 76;
                                            i11 = 2;
                                            bArr4[2] = 97;
                                            bArr4[3] = 67;
                                            ex0Var2.j(i15 + 12);
                                            ex0Var2.f(4, i16 - 12, bArr4);
                                            listN = bo1.n(bArr4);
                                            iZ2 = i27;
                                            str5 = str7;
                                            i17 = iQ;
                                        } else {
                                            i11 = 2;
                                            if (iQ3 == 1634492771) {
                                                int i38 = i16 - 12;
                                                byte[] bArr5 = new byte[i38];
                                                ex0Var2.j(i15 + 12);
                                                ex0Var2.f(0, i38, bArr5);
                                                byte[] bArr6 = sl0.f8977a;
                                                ex0 ex0Var3 = new ex0(bArr5);
                                                ex0Var3.j(9);
                                                int iV4 = ex0Var3.v();
                                                ex0Var3.j(20);
                                                Pair pairCreate = Pair.create(Integer.valueOf(ex0Var3.y()), Integer.valueOf(iV4));
                                                int iIntValue2 = ((Integer) pairCreate.first).intValue();
                                                int iIntValue3 = ((Integer) pairCreate.second).intValue();
                                                listN = bo1.n(bArr5);
                                                str5 = str7;
                                                iZ2 = iIntValue3;
                                                i12 = iIntValue2;
                                                i17 = iQ;
                                                i24 = i15 + i16;
                                                ex0Var2 = ex0Var;
                                                i21 = i8;
                                                str7 = str5;
                                                iQ = i17;
                                                str6 = str4;
                                                str8 = str3;
                                            } else if (iQ3 == 1767990114) {
                                                ex0Var2.j(i15 + 9);
                                                long j6 = 0;
                                                int i39 = 0;
                                                while (true) {
                                                    if (i39 >= 9) {
                                                        i17 = iQ;
                                                        break;
                                                    }
                                                    if (ex0Var2.f4417b == ex0Var2.f4418c) {
                                                        throw new IllegalStateException("Attempting to read a byte over the limit.");
                                                    }
                                                    i17 = iQ;
                                                    long jV = ex0Var2.v();
                                                    j6 |= (jV & 127) << (i39 * 7);
                                                    if ((jV & 128) == 0) {
                                                        break;
                                                    }
                                                    i39++;
                                                    iQ = i17;
                                                }
                                                int iL = ed0.l(j6);
                                                byte[] bArr7 = new byte[iL];
                                                ex0Var2.f(0, iL, bArr7);
                                                listN = bo1.n(bArr7);
                                                iZ2 = i27;
                                                str5 = str7;
                                            } else {
                                                i17 = iQ;
                                                i14 = i27;
                                                str5 = str7;
                                                i12 = i26;
                                                iZ2 = i14;
                                                i24 = i15 + i16;
                                                ex0Var2 = ex0Var;
                                                i21 = i8;
                                                str7 = str5;
                                                iQ = i17;
                                                str6 = str4;
                                                str8 = str3;
                                            }
                                        }
                                        i12 = i26;
                                        i24 = i15 + i16;
                                        ex0Var2 = ex0Var;
                                        i21 = i8;
                                        str7 = str5;
                                        iQ = i17;
                                        str6 = str4;
                                        str8 = str3;
                                    }
                                    i11 = 2;
                                    i24 = i15 + i16;
                                    ex0Var2 = ex0Var;
                                    i21 = i8;
                                    str7 = str5;
                                    iQ = i17;
                                    str6 = str4;
                                    str8 = str3;
                                }
                            }
                            i11 = 2;
                            iZ2 = i14;
                            i24 = i15 + i16;
                            ex0Var2 = ex0Var;
                            i21 = i8;
                            str7 = str5;
                            iQ = i17;
                            str6 = str4;
                            str8 = str3;
                        }
                    }
                    if (i18 != i19) {
                        m5 m5VarG = g(i18, ex0Var2);
                        str2 = m5VarG.f6937a;
                        byte[] bArr8 = m5VarG.f6938b;
                        if (bArr8 != null) {
                            if ("audio/vorbis".equals(str2)) {
                                ex0 ex0Var4 = new ex0(bArr8);
                                ex0Var4.k(1);
                                int i40 = 0;
                                while (ex0Var4.o() > 0 && (ex0Var4.f4416a[ex0Var4.f4417b] & 255) == 255) {
                                    ex0Var4.k(1);
                                    i40 += 255;
                                }
                                int iV5 = ex0Var4.v() + i40;
                                int i41 = 0;
                                while (true) {
                                    if (ex0Var4.o() <= 0) {
                                        str5 = str7;
                                        break;
                                    }
                                    str5 = str7;
                                    if ((ex0Var4.f4416a[ex0Var4.f4417b] & 255) != 255) {
                                        break;
                                    }
                                    ex0Var4.k(1);
                                    i41 += 255;
                                    str7 = str5;
                                }
                                int iV6 = ex0Var4.v() + i41;
                                byte[] bArr9 = new byte[iV5];
                                int i42 = ex0Var4.f4417b;
                                z7 = false;
                                System.arraycopy(bArr8, i42, bArr9, 0, iV5);
                                int i43 = i42 + iV5 + iV6;
                                int length = bArr8.length - i43;
                                byte[] bArr10 = new byte[length];
                                System.arraycopy(bArr8, i43, bArr10, 0, length);
                                cp1VarN = bo1.o(bArr9, bArr10);
                                m5Var = m5VarG;
                                iZ2 = i14;
                            } else {
                                str5 = str7;
                                z7 = false;
                                if ("audio/mp4a-latm".equals(str2)) {
                                    b0 b0VarA = c0.a(new l42(bArr8.length, bArr8), false);
                                    i12 = b0VarA.f2880a;
                                    iZ2 = b0VarA.f2881b;
                                    str9 = b0VarA.f2882c;
                                } else {
                                    iZ2 = i14;
                                }
                                cp1VarN = bo1.n(bArr8);
                                m5Var = m5VarG;
                            }
                            listN = cp1VarN;
                            i24 = i15 + i16;
                            ex0Var2 = ex0Var;
                            i21 = i8;
                            str7 = str5;
                            iQ = i17;
                            str6 = str4;
                            str8 = str3;
                        } else {
                            str5 = str7;
                            m5Var = m5VarG;
                            iZ2 = i14;
                            i24 = i15 + i16;
                            ex0Var2 = ex0Var;
                            i21 = i8;
                            str7 = str5;
                            iQ = i17;
                            str6 = str4;
                            str8 = str3;
                        }
                    }
                    str5 = str7;
                    iZ2 = i14;
                    i24 = i15 + i16;
                    ex0Var2 = ex0Var;
                    i21 = i8;
                    str7 = str5;
                    iQ = i17;
                    str6 = str4;
                    str8 = str3;
                }
                i17 = iQ;
                iZ2 = i14;
                i24 = i15 + i16;
                ex0Var2 = ex0Var;
                i21 = i8;
                str7 = str5;
                iQ = i17;
                str6 = str4;
                str8 = str3;
            }
            i17 = iQ;
            i24 = i15 + i16;
            ex0Var2 = ex0Var;
            i21 = i8;
            str7 = str5;
            iQ = i17;
            str6 = str4;
            str8 = str3;
        }
        int i44 = iZ2;
        if (p5Var.f7937b != null || str2 == null) {
            return;
        }
        tk2 tk2Var5 = new tk2();
        tk2Var5.b(i9);
        tk2Var5.c(str2);
        tk2Var5.f9327i = str9;
        tk2Var5.A = i44;
        tk2Var5.B = i12;
        tk2Var5.C = i25;
        tk2Var5.f9333o = listN;
        tk2Var5.f9334p = ih2VarL;
        tk2Var5.f9323d = str;
        m5 m5Var2 = m5Var;
        if (m5Var2 != null) {
            tk2Var5.f9326g = ed0.t(m5Var2.f6939c);
            tk2Var5.h = ed0.t(m5Var2.f6940d);
        }
        p5Var.f7937b = new w(tk2Var5);
    }
}
