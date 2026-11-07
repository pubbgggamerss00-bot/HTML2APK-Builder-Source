package ii;

import hi.g0;
import hi.z;
import java.io.EOFException;
import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f14534a;

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f14535b;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(mh.a.f18238b);
        r.d(bytes, "getBytes(...)");
        f14534a = bytes;
        f14535b = new long[]{-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};
    }

    public static final String a(long j10, hi.g gVar) throws EOFException {
        r.e(gVar, "<this>");
        if (j10 > 0) {
            long j11 = j10 - 1;
            if (gVar.z(j11) == 13) {
                String strD0 = gVar.d0(j11, mh.a.f18238b);
                gVar.skip(2L);
                return strD0;
            }
        }
        String strD02 = gVar.d0(j10, mh.a.f18238b);
        gVar.skip(1L);
        return strD02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        if (r18 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0063, code lost:
    
        return -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0083, code lost:
    
        return r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int b(hi.g gVar, z options, boolean z10) {
        int i10;
        int i11;
        int i12;
        g0 g0Var;
        int i13;
        r.e(gVar, "<this>");
        r.e(options, "options");
        g0 g0Var2 = gVar.f13060a;
        if (g0Var2 != null) {
            byte[] bArr = g0Var2.f13063a;
            int i14 = g0Var2.f13064b;
            int i15 = g0Var2.f13065c;
            int[] iArr = options.f13121b;
            g0 g0Var3 = g0Var2;
            int i16 = -1;
            int i17 = 0;
            loop0: while (true) {
                int i18 = i17 + 1;
                int i19 = iArr[i17];
                int i20 = i17 + 2;
                int i21 = iArr[i18];
                if (i21 != -1) {
                    i16 = i21;
                }
                if (g0Var3 == null) {
                    break;
                }
                if (i19 >= 0) {
                    int i22 = i14 + 1;
                    int i23 = bArr[i14] & 255;
                    int i24 = i20 + i19;
                    while (i20 != i24) {
                        if (i23 == iArr[i20]) {
                            i10 = iArr[i20 + i19];
                            if (i22 == i15) {
                                g0Var3 = g0Var3.f13068f;
                                r.b(g0Var3);
                                int i25 = g0Var3.f13064b;
                                byte[] bArr2 = g0Var3.f13063a;
                                i11 = g0Var3.f13065c;
                                if (g0Var3 == g0Var2) {
                                    i12 = i25;
                                    bArr = bArr2;
                                    g0Var3 = null;
                                } else {
                                    i12 = i25;
                                    bArr = bArr2;
                                }
                            } else {
                                i11 = i15;
                                i12 = i22;
                            }
                            if (i10 >= 0) {
                                return i10;
                            }
                            int i26 = i11;
                            i17 = -i10;
                            i14 = i12;
                            i15 = i26;
                        } else {
                            i20++;
                        }
                    }
                    break loop0;
                }
                int i27 = (i19 * (-1)) + i20;
                while (true) {
                    int i28 = i14 + 1;
                    int i29 = i20 + 1;
                    if ((bArr[i14] & 255) != iArr[i20]) {
                        break loop0;
                    }
                    boolean z11 = i29 == i27;
                    if (i28 == i15) {
                        r.b(g0Var3);
                        g0 g0Var4 = g0Var3.f13068f;
                        r.b(g0Var4);
                        i12 = g0Var4.f13064b;
                        byte[] bArr3 = g0Var4.f13063a;
                        i13 = g0Var4.f13065c;
                        if (g0Var4 != g0Var2) {
                            g0Var = g0Var4;
                            bArr = bArr3;
                        } else {
                            if (!z11) {
                                break loop0;
                            }
                            bArr = bArr3;
                            g0Var = null;
                        }
                    } else {
                        g0Var = g0Var3;
                        i13 = i15;
                        i12 = i28;
                    }
                    if (z11) {
                        i10 = iArr[i29];
                        int i30 = i13;
                        g0Var3 = g0Var;
                        i11 = i30;
                        break;
                    }
                    i14 = i12;
                    i15 = i13;
                    g0Var3 = g0Var;
                    i20 = i29;
                }
            }
        } else {
            return z10 ? -2 : -1;
        }
    }
}
