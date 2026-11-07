package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class y3 {

    /* renamed from: a, reason: collision with root package name */
    public static final d0 f10822a = new d0(10);

    public static int a(int i6) {
        return (i6 == 0 || i6 == 3) ? 1 : 2;
    }

    public static int b(int i6, int i7, byte[] bArr) {
        int iC = c(i6, bArr);
        if (i7 == 0 || i7 == 3) {
            return iC;
        }
        while (true) {
            int length = bArr.length;
            if (iC >= length - 1) {
                return length;
            }
            int i8 = iC + 1;
            if ((iC - i6) % 2 == 0 && bArr[i8] == 0) {
                return iC;
            }
            iC = c(i8, bArr);
        }
    }

    public static int c(int i6, byte[] bArr) {
        while (true) {
            int length = bArr.length;
            if (i6 >= length) {
                return length;
            }
            if (bArr[i6] == 0) {
                return i6;
            }
            i6++;
        }
    }

    public static int d(int i6, ex0 ex0Var) {
        byte[] bArr = ex0Var.f4416a;
        int i7 = ex0Var.f4417b;
        int i8 = i7;
        while (true) {
            int i9 = i8 + 1;
            if (i9 >= i7 + i6) {
                return i6;
            }
            if ((bArr[i8] & 255) == 255 && bArr[i9] == 0) {
                System.arraycopy(bArr, i8 + 2, bArr, i9, (i6 - (i8 - i7)) - 2);
                i6--;
            }
            i8 = i9;
        }
    }

    public static cp1 e(int i6, int i7, byte[] bArr) {
        if (i7 >= bArr.length) {
            return bo1.n(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        }
        yn1 yn1Var = new yn1();
        int iB = b(i7, i6, bArr);
        while (i7 < iB) {
            yn1Var.q(new String(bArr, i7, iB - i7, h(i6)));
            i7 = a(i6) + iB;
            iB = b(i7, i6, bArr);
        }
        cp1 cp1VarT = yn1Var.t();
        return cp1VarT.isEmpty() ? bo1.n(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED) : cp1VarT;
    }

    public static String f(byte[] bArr, int i6, int i7, Charset charset) {
        return (i7 <= i6 || i7 > bArr.length) ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : new String(bArr, i6, i7 - i6, charset);
    }

    public static String g(int i6, int i7, int i8, int i9, int i10) {
        return i6 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10));
    }

    public static Charset h(int i6) {
        return i6 != 1 ? i6 != 2 ? i6 != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8 : StandardCharsets.UTF_16BE : StandardCharsets.UTF_16;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006b A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:3:0x0006, B:7:0x0013, B:20:0x003e, B:23:0x0049, B:25:0x006b, B:29:0x0071, B:41:0x008d, B:42:0x008f, B:45:0x0095, B:48:0x009f, B:31:0x007b, B:35:0x0082, B:10:0x0023), top: B:54:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008d A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:3:0x0006, B:7:0x0013, B:20:0x003e, B:23:0x0049, B:25:0x006b, B:29:0x0071, B:41:0x008d, B:42:0x008f, B:45:0x0095, B:48:0x009f, B:31:0x007b, B:35:0x0082, B:10:0x0023), top: B:54:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean i(ex0 ex0Var, int i6, int i7, boolean z6) {
        boolean z7;
        int iX;
        long jX;
        int iZ;
        int i8;
        int i9 = ex0Var.f4417b;
        while (true) {
            try {
                z7 = true;
                z7 = true;
                int i10 = 1;
                int i11 = 1;
                if (ex0Var.o() < i7) {
                    break;
                }
                if (i6 >= 3) {
                    iX = ex0Var.q();
                    jX = ex0Var.D();
                    iZ = ex0Var.z();
                } else {
                    iX = ex0Var.x();
                    jX = ex0Var.x();
                    iZ = 0;
                }
                if (iX != 0 || jX != 0 || iZ != 0) {
                    if (i6 != 4 || z6) {
                        if (i6 != 4) {
                            if ((iZ & 64) == 0) {
                                i10 = 0;
                            }
                            int i12 = i10;
                            i11 = iZ & 1;
                            i8 = i12;
                        } else if (i6 == 3) {
                            i8 = (iZ & 32) != 0 ? 1 : 0;
                            if ((iZ & 128) == 0) {
                                i11 = 0;
                            }
                        } else {
                            i8 = 0;
                            i11 = 0;
                        }
                        if (i11 != 0) {
                            i8 += 4;
                        }
                        if (jX < i8 && ex0Var.o() >= jX) {
                            ex0Var.k((int) jX);
                        }
                    } else {
                        if ((8421504 & jX) != 0) {
                            break;
                        }
                        jX = ((jX >> 24) << 21) | (((jX >> 16) & 255) << 14) | (jX & 255) | (((jX >> 8) & 255) << 7);
                        if (i6 != 4) {
                        }
                        if (i11 != 0) {
                        }
                        if (jX < i8) {
                            break;
                        }
                        ex0Var.k((int) jX);
                    }
                }
            } finally {
                ex0Var.j(i9);
            }
        }
        z7 = false;
        return z7;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:153:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0297 A[Catch: all -> 0x0130, Exception -> 0x0255, OutOfMemoryError -> 0x025a, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0130, blocks: (B:83:0x0105, B:92:0x013e, B:95:0x0145, B:106:0x016f, B:109:0x01a1, B:117:0x01cc, B:119:0x01e0, B:121:0x01e7, B:120:0x01e3, B:135:0x0206, B:137:0x021d, B:139:0x0244, B:141:0x024b, B:140:0x0247, B:164:0x0284, B:167:0x0297, B:169:0x02a0, B:180:0x02e3, B:182:0x0300, B:184:0x0307, B:183:0x0303, B:177:0x02c3, B:179:0x02df, B:196:0x0325, B:202:0x0366, B:206:0x03a0, B:210:0x03ad, B:211:0x03b3, B:213:0x03b9, B:215:0x03c0, B:216:0x03c4, B:224:0x03e5, B:228:0x0410, B:230:0x041b, B:231:0x044d, B:232:0x0458, B:234:0x045e, B:236:0x0465, B:237:0x0469, B:242:0x0482, B:249:0x0493, B:251:0x04bd, B:252:0x04cc, B:253:0x04d7), top: B:265:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02c3 A[Catch: all -> 0x0130, Exception -> 0x02bd, OutOfMemoryError -> 0x02c0, TryCatch #0 {all -> 0x0130, blocks: (B:83:0x0105, B:92:0x013e, B:95:0x0145, B:106:0x016f, B:109:0x01a1, B:117:0x01cc, B:119:0x01e0, B:121:0x01e7, B:120:0x01e3, B:135:0x0206, B:137:0x021d, B:139:0x0244, B:141:0x024b, B:140:0x0247, B:164:0x0284, B:167:0x0297, B:169:0x02a0, B:180:0x02e3, B:182:0x0300, B:184:0x0307, B:183:0x0303, B:177:0x02c3, B:179:0x02df, B:196:0x0325, B:202:0x0366, B:206:0x03a0, B:210:0x03ad, B:211:0x03b3, B:213:0x03b9, B:215:0x03c0, B:216:0x03c4, B:224:0x03e5, B:228:0x0410, B:230:0x041b, B:231:0x044d, B:232:0x0458, B:234:0x045e, B:236:0x0465, B:237:0x0469, B:242:0x0482, B:249:0x0493, B:251:0x04bd, B:252:0x04cc, B:253:0x04d7), top: B:265:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0300 A[Catch: all -> 0x0130, Exception -> 0x02bd, OutOfMemoryError -> 0x02c0, TryCatch #0 {all -> 0x0130, blocks: (B:83:0x0105, B:92:0x013e, B:95:0x0145, B:106:0x016f, B:109:0x01a1, B:117:0x01cc, B:119:0x01e0, B:121:0x01e7, B:120:0x01e3, B:135:0x0206, B:137:0x021d, B:139:0x0244, B:141:0x024b, B:140:0x0247, B:164:0x0284, B:167:0x0297, B:169:0x02a0, B:180:0x02e3, B:182:0x0300, B:184:0x0307, B:183:0x0303, B:177:0x02c3, B:179:0x02df, B:196:0x0325, B:202:0x0366, B:206:0x03a0, B:210:0x03ad, B:211:0x03b3, B:213:0x03b9, B:215:0x03c0, B:216:0x03c4, B:224:0x03e5, B:228:0x0410, B:230:0x041b, B:231:0x044d, B:232:0x0458, B:234:0x045e, B:236:0x0465, B:237:0x0469, B:242:0x0482, B:249:0x0493, B:251:0x04bd, B:252:0x04cc, B:253:0x04d7), top: B:265:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0303 A[Catch: all -> 0x0130, Exception -> 0x02bd, OutOfMemoryError -> 0x02c0, TryCatch #0 {all -> 0x0130, blocks: (B:83:0x0105, B:92:0x013e, B:95:0x0145, B:106:0x016f, B:109:0x01a1, B:117:0x01cc, B:119:0x01e0, B:121:0x01e7, B:120:0x01e3, B:135:0x0206, B:137:0x021d, B:139:0x0244, B:141:0x024b, B:140:0x0247, B:164:0x0284, B:167:0x0297, B:169:0x02a0, B:180:0x02e3, B:182:0x0300, B:184:0x0307, B:183:0x0303, B:177:0x02c3, B:179:0x02df, B:196:0x0325, B:202:0x0366, B:206:0x03a0, B:210:0x03ad, B:211:0x03b3, B:213:0x03b9, B:215:0x03c0, B:216:0x03c4, B:224:0x03e5, B:228:0x0410, B:230:0x041b, B:231:0x044d, B:232:0x0458, B:234:0x045e, B:236:0x0465, B:237:0x0469, B:242:0x0482, B:249:0x0493, B:251:0x04bd, B:252:0x04cc, B:253:0x04d7), top: B:265:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x04f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static z3 j(int i6, ex0 ex0Var, boolean z6, d0 d0Var) {
        int iY;
        int i7;
        int i8;
        boolean z7;
        boolean z8;
        boolean z9;
        int i9;
        String str;
        z3 z3Var;
        int i10;
        z3 o3Var;
        z3 e4Var;
        int iC;
        String strG;
        int iV = ex0Var.v();
        int iV2 = ex0Var.v();
        int iV3 = ex0Var.v();
        int iV4 = i6 >= 3 ? ex0Var.v() : 0;
        if (i6 == 4) {
            iY = ex0Var.y();
            if (!z6) {
                iY = ((iY >> 24) << 21) | (iY & 255) | (((iY >> 8) & 255) << 7) | (((iY >> 16) & 255) << 14);
            }
        } else {
            iY = i6 == 3 ? ex0Var.y() : ex0Var.x();
        }
        int iZ = i6 >= 3 ? ex0Var.z() : 0;
        if (iV == 0 && iV2 == 0 && iV3 == 0 && iV4 == 0 && iY == 0 && iZ == 0) {
            ex0Var.j(ex0Var.f4418c);
            return null;
        }
        int iP = ex0Var.p() + iY;
        if (iP > ex0Var.f4418c) {
            qs0.f("Id3Decoder", "Frame size exceeds remaining tag data");
            ex0Var.j(ex0Var.f4418c);
            return null;
        }
        if (d0Var != null) {
            ex0Var.j(iP);
            return null;
        }
        if (i6 == 3) {
            int i11 = iZ & 64;
            i7 = (iZ & 128) != 0 ? 1 : 0;
            z9 = false;
            z8 = i11 != 0;
            z7 = (iZ & 32) != 0;
            i8 = i7;
        } else if (i6 == 4) {
            boolean z10 = (iZ & 64) != 0;
            int i12 = (iZ & 8) != 0 ? 1 : 0;
            z8 = (iZ & 4) != 0;
            z9 = (iZ & 2) != 0;
            i8 = iZ & 1;
            int i13 = i12;
            z7 = z10;
            i7 = i13;
        } else {
            i7 = 0;
            i8 = 0;
            z7 = false;
            z8 = false;
            z9 = false;
        }
        if (i7 != 0 || z8) {
            qs0.f("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            ex0Var.j(iP);
            return null;
        }
        if (z7) {
            ex0Var.k(1);
            iY--;
        }
        if (i8 != 0) {
            ex0Var.k(4);
            iY -= 4;
        }
        if (z9) {
            iY = d(iY, ex0Var);
        }
        try {
            try {
            } catch (Throwable th) {
                ex0Var.j(iP);
                throw th;
            }
        } catch (Exception e6) {
            e = e6;
            i9 = iV;
            str = "Id3Decoder";
            ex0Var.j(iP);
            z3Var = null;
            if (z3Var == null) {
            }
            return z3Var;
        } catch (OutOfMemoryError e7) {
            e = e7;
            i9 = iV;
            str = "Id3Decoder";
            ex0Var.j(iP);
            z3Var = null;
            if (z3Var == null) {
            }
            return z3Var;
        }
        if (iV == 84 && iV2 == 88 && iV3 == 88 && (i6 == 2 || iV4 == 88)) {
            if (iY > 0) {
                int iV5 = ex0Var.v();
                int i14 = iY - 1;
                byte[] bArr = new byte[i14];
                ex0Var.f(0, i14, bArr);
                int iB = b(0, iV5, bArr);
                o3Var = new i4("TXXX", new String(bArr, 0, iB, h(iV5)), e(iV5, iB + a(iV5), bArr));
                i9 = iV;
            }
            i9 = iV;
            o3Var = null;
        } else {
            if (iV == 84) {
                String strG2 = g(i6, 84, iV2, iV3, iV4);
                if (iY > 0) {
                    int iV6 = ex0Var.v();
                    int i15 = iY - 1;
                    byte[] bArr2 = new byte[i15];
                    ex0Var.f(0, i15, bArr2);
                    i9 = iV;
                    o3Var = new i4(strG2, null, e(iV6, 0, bArr2));
                }
            } else {
                if (iV == 87) {
                    if (iV2 != 88 || iV3 != 88 || (i6 != 2 && iV4 != 88)) {
                        i10 = 87;
                    }
                    if (iY > 0) {
                        int iV7 = ex0Var.v();
                        int i16 = iY - 1;
                        byte[] bArr3 = new byte[i16];
                        ex0Var.f(0, i16, bArr3);
                        int iB2 = b(0, iV7, bArr3);
                        String str2 = new String(bArr3, 0, iB2, h(iV7));
                        int iA = iB2 + a(iV7);
                        o3Var = new k4("WXXX", str2, f(bArr3, iA, c(iA, bArr3), StandardCharsets.ISO_8859_1));
                        i9 = iV;
                    }
                } else {
                    i10 = iV;
                }
                if (i10 != 87) {
                    if (i10 == 80) {
                        if (iV2 == 82 && iV3 == 73 && iV4 == 86) {
                            byte[] bArr4 = new byte[iY];
                            ex0Var.f(0, iY, bArr4);
                            int iC2 = c(0, bArr4);
                            String str3 = new String(bArr4, 0, iC2, StandardCharsets.ISO_8859_1);
                            int i17 = iC2 + 1;
                            o3Var = new g4(str3, iY <= i17 ? j31.f5919f : Arrays.copyOfRange(bArr4, i17, iY));
                        } else {
                            i10 = 80;
                        }
                    }
                    try {
                        if (i10 != 71) {
                            str = "Id3Decoder";
                            try {
                                if (i6 == 2) {
                                    if (i10 == 80 && iV2 == 73 && iV3 == 67) {
                                        int iV8 = ex0Var.v();
                                        Charset charsetH = h(iV8);
                                        int i18 = iY - 1;
                                        byte[] bArr5 = new byte[i18];
                                        ex0Var.f(0, i18, bArr5);
                                        if (i6 != 2) {
                                            i9 = iV;
                                            String strConcat = "image/".concat(String.valueOf(rj1.g(new String(bArr5, 0, 3, StandardCharsets.ISO_8859_1))));
                                            if ("image/jpg".equals(strConcat)) {
                                                strConcat = "image/jpeg";
                                            }
                                            strG = strConcat;
                                            iC = 2;
                                        } else {
                                            i9 = iV;
                                            iC = c(0, bArr5);
                                            strG = rj1.g(new String(bArr5, 0, iC, StandardCharsets.ISO_8859_1));
                                            if (strG.indexOf(47) == -1) {
                                                strG = "image/".concat(strG);
                                            }
                                        }
                                        int i19 = bArr5[iC + 1] & 255;
                                        int i20 = iC + 2;
                                        int iB3 = b(i20, iV8, bArr5);
                                        String str4 = new String(bArr5, i20, iB3 - i20, charsetH);
                                        int iA2 = iB3 + a(iV8);
                                        o3Var = new m3(strG, str4, i19, i18 > iA2 ? j31.f5919f : Arrays.copyOfRange(bArr5, iA2, i18));
                                    }
                                    i9 = iV;
                                    if (i10 == 67 || iV2 != 79 || iV3 != 77 || (iV4 != 77 && i6 != 2)) {
                                        if (i10 != 67 && iV2 == 72 && iV3 == 65 && iV4 == 80) {
                                            int iP2 = ex0Var.p();
                                            int iC3 = c(iP2, ex0Var.l());
                                            String str5 = new String(ex0Var.l(), iP2, iC3 - iP2, StandardCharsets.ISO_8859_1);
                                            ex0Var.j(iC3 + 1);
                                            int iQ = ex0Var.q();
                                            int iQ2 = ex0Var.q();
                                            long jD = ex0Var.D();
                                            long j6 = jD == 4294967295L ? -1L : jD;
                                            long jD2 = ex0Var.D();
                                            long j7 = jD2 == 4294967295L ? -1L : jD2;
                                            ArrayList arrayList = new ArrayList();
                                            int i21 = iP2 + iY;
                                            while (ex0Var.p() < i21) {
                                                z3 z3VarJ = j(i6, ex0Var, z6, null);
                                                if (z3VarJ != null) {
                                                    arrayList.add(z3VarJ);
                                                }
                                            }
                                            e4Var = new q3(str5, iQ, iQ2, j6, j7, (z3[]) arrayList.toArray(new z3[0]));
                                        } else if (i10 != 67 && iV2 == 84 && iV3 == 79 && iV4 == 67) {
                                            int iP3 = ex0Var.p();
                                            int iC4 = c(iP3, ex0Var.l());
                                            String str6 = new String(ex0Var.l(), iP3, iC4 - iP3, StandardCharsets.ISO_8859_1);
                                            ex0Var.j(iC4 + 1);
                                            int iV9 = ex0Var.v();
                                            boolean z11 = (iV9 & 2) != 0;
                                            int i22 = iV9 & 1;
                                            int iV10 = ex0Var.v();
                                            String[] strArr = new String[iV10];
                                            int i23 = 0;
                                            while (i23 < iV10) {
                                                int iP4 = ex0Var.p();
                                                int iC5 = c(iP4, ex0Var.l());
                                                strArr[i23] = new String(ex0Var.l(), iP4, iC5 - iP4, StandardCharsets.ISO_8859_1);
                                                ex0Var.j(iC5 + 1);
                                                i23++;
                                                iP3 = iP3;
                                                iV10 = iV10;
                                                str6 = str6;
                                            }
                                            int i24 = iP3;
                                            String str7 = str6;
                                            ArrayList arrayList2 = new ArrayList();
                                            int i25 = i24 + iY;
                                            while (ex0Var.p() < i25) {
                                                z3 z3VarJ2 = j(i6, ex0Var, z6, null);
                                                if (z3VarJ2 != null) {
                                                    arrayList2.add(z3VarJ2);
                                                }
                                            }
                                            e4Var = new s3(str7, z11, 1 == i22, strArr, (z3[]) arrayList2.toArray(new z3[0]));
                                        } else if (i10 != 77 && iV2 == 76 && iV3 == 76 && iV4 == 84) {
                                            int iZ2 = ex0Var.z();
                                            int iX = ex0Var.x();
                                            int iX2 = ex0Var.x();
                                            int iV11 = ex0Var.v();
                                            int iV12 = ex0Var.v();
                                            l42 l42Var = new l42();
                                            l42Var.A(ex0Var);
                                            int i26 = ((iY - 10) * 8) / (iV11 + iV12);
                                            int[] iArr = new int[i26];
                                            int[] iArr2 = new int[i26];
                                            for (int i27 = 0; i27 < i26; i27++) {
                                                int iW = l42Var.w(iV11);
                                                int iW2 = l42Var.w(iV12);
                                                iArr[i27] = iW;
                                                iArr2[i27] = iW2;
                                            }
                                            e4Var = new e4(iZ2, iX, iArr, iArr2, iX2);
                                        } else {
                                            String strG3 = g(i6, i10, iV2, iV3, iV4);
                                            byte[] bArr6 = new byte[iY];
                                            ex0Var.f(0, iY, bArr6);
                                            o3Var = new o3(strG3, bArr6);
                                        }
                                        o3Var = e4Var;
                                    } else if (iY < 4) {
                                        o3Var = null;
                                    } else {
                                        int iV13 = ex0Var.v();
                                        Charset charsetH2 = h(iV13);
                                        byte[] bArr7 = new byte[3];
                                        ex0Var.f(0, 3, bArr7);
                                        String str8 = new String(bArr7, 0, 3);
                                        int i28 = iY - 4;
                                        byte[] bArr8 = new byte[i28];
                                        ex0Var.f(0, i28, bArr8);
                                        int iB4 = b(0, iV13, bArr8);
                                        String str9 = new String(bArr8, 0, iB4, charsetH2);
                                        int iA3 = iB4 + a(iV13);
                                        o3Var = new u3(str8, str9, f(bArr8, iA3, b(iA3, iV13, bArr8), charsetH2));
                                    }
                                } else if (i10 == 65 && iV2 == 80 && iV3 == 73 && iV4 == 67) {
                                    int iV82 = ex0Var.v();
                                    Charset charsetH3 = h(iV82);
                                    int i182 = iY - 1;
                                    byte[] bArr52 = new byte[i182];
                                    ex0Var.f(0, i182, bArr52);
                                    if (i6 != 2) {
                                    }
                                    int i192 = bArr52[iC + 1] & 255;
                                    int i202 = iC + 2;
                                    int iB32 = b(i202, iV82, bArr52);
                                    String str42 = new String(bArr52, i202, iB32 - i202, charsetH3);
                                    int iA22 = iB32 + a(iV82);
                                    o3Var = new m3(strG, str42, i192, i182 > iA22 ? j31.f5919f : Arrays.copyOfRange(bArr52, iA22, i182));
                                } else {
                                    i9 = iV;
                                    if (i10 == 67) {
                                        if (i10 != 67) {
                                            if (i10 != 67) {
                                                if (i10 != 77) {
                                                }
                                                String strG32 = g(i6, i10, iV2, iV3, iV4);
                                                byte[] bArr62 = new byte[iY];
                                                ex0Var.f(0, iY, bArr62);
                                                o3Var = new o3(strG32, bArr62);
                                            }
                                        }
                                    }
                                }
                                ex0Var.j(iP);
                                z3Var = o3Var;
                                e = null;
                            } catch (Exception e8) {
                                e = e8;
                                ex0Var.j(iP);
                                z3Var = null;
                                if (z3Var == null) {
                                }
                                return z3Var;
                            } catch (OutOfMemoryError e9) {
                                e = e9;
                                ex0Var.j(iP);
                                z3Var = null;
                                if (z3Var == null) {
                                }
                                return z3Var;
                            }
                        } else if (iV2 != 69 || iV3 != 79) {
                            str = "Id3Decoder";
                            i10 = 71;
                            if (i6 == 2) {
                            }
                            ex0Var.j(iP);
                            z3Var = o3Var;
                            e = null;
                        } else if (iV4 == 66 || i6 == 2) {
                            try {
                                int iV14 = ex0Var.v();
                                Charset charsetH4 = h(iV14);
                                int i29 = iY - 1;
                                byte[] bArr9 = new byte[i29];
                                ex0Var.f(0, i29, bArr9);
                                int iC6 = c(0, bArr9);
                                str = "Id3Decoder";
                                String strE = bk.e(new String(bArr9, 0, iC6, StandardCharsets.ISO_8859_1));
                                int i30 = iC6 + 1;
                                int iB5 = b(i30, iV14, bArr9);
                                String strF = f(bArr9, i30, iB5, charsetH4);
                                int iA4 = iB5 + a(iV14);
                                int iB6 = b(iA4, iV14, bArr9);
                                String strF2 = f(bArr9, iA4, iB6, charsetH4);
                                int iA5 = iB6 + a(iV14);
                                i9 = iV;
                                o3Var = new w3(strE, strF, strF2, i29 <= iA5 ? j31.f5919f : Arrays.copyOfRange(bArr9, iA5, i29));
                                ex0Var.j(iP);
                                z3Var = o3Var;
                                e = null;
                            } catch (Exception e10) {
                                e = e10;
                                str = "Id3Decoder";
                                i9 = iV;
                                ex0Var.j(iP);
                                z3Var = null;
                                if (z3Var == null) {
                                }
                                return z3Var;
                            } catch (OutOfMemoryError e11) {
                                e = e11;
                                str = "Id3Decoder";
                                i9 = iV;
                                ex0Var.j(iP);
                                z3Var = null;
                                if (z3Var == null) {
                                }
                                return z3Var;
                            }
                        } else {
                            i10 = 71;
                            str = "Id3Decoder";
                            if (i6 == 2) {
                            }
                            ex0Var.j(iP);
                            z3Var = o3Var;
                            e = null;
                        }
                    } catch (Exception e12) {
                        e = e12;
                    } catch (OutOfMemoryError e13) {
                        e = e13;
                    }
                    if (z3Var == null) {
                        qs0.g(str, "Failed to decode frame: id=" + g(i6, i9, iV2, iV3, iV4) + ", frameSize=" + iY, e);
                    }
                    return z3Var;
                }
                String strG4 = g(i6, 87, iV2, iV3, iV4);
                byte[] bArr10 = new byte[iY];
                ex0Var.f(0, iY, bArr10);
                o3Var = new k4(strG4, null, new String(bArr10, 0, c(0, bArr10), StandardCharsets.ISO_8859_1));
                i9 = iV;
            }
            i9 = iV;
            o3Var = null;
        }
        str = "Id3Decoder";
        ex0Var.j(iP);
        z3Var = o3Var;
        e = null;
        if (z3Var == null) {
        }
        return z3Var;
    }
}
