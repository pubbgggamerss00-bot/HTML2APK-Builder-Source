package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.b2;
import androidx.datastore.preferences.protobuf.d;
import androidx.datastore.preferences.protobuf.d0;
import androidx.datastore.preferences.protobuf.e0;
import androidx.datastore.preferences.protobuf.j;
import androidx.datastore.preferences.protobuf.m;
import androidx.datastore.preferences.protobuf.p0;
import androidx.datastore.preferences.protobuf.z1;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.EACTags;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class b1<T> implements o1<T> {

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f1954p = new int[0];

    /* renamed from: q, reason: collision with root package name */
    public static final Unsafe f1955q = z1.j();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f1956a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f1957b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1958c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1959d;

    /* renamed from: e, reason: collision with root package name */
    public final MessageLite f1960e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f1961f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1962g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f1963h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1964i;

    /* renamed from: j, reason: collision with root package name */
    public final int f1965j;

    /* renamed from: k, reason: collision with root package name */
    public final d1 f1966k;

    /* renamed from: l, reason: collision with root package name */
    public final k0 f1967l;

    /* renamed from: m, reason: collision with root package name */
    public final w1<?, ?> f1968m;

    /* renamed from: n, reason: collision with root package name */
    public final u<?> f1969n;

    /* renamed from: o, reason: collision with root package name */
    public final r0 f1970o;

    public b1(int[] iArr, Object[] objArr, int i10, int i11, MessageLite messageLite, int[] iArr2, int i12, int i13, d1 d1Var, k0 k0Var, w1 w1Var, u uVar, r0 r0Var) {
        this.f1956a = iArr;
        this.f1957b = objArr;
        this.f1958c = i10;
        this.f1959d = i11;
        this.f1962g = messageLite instanceof GeneratedMessageLite;
        this.f1961f = uVar != null && uVar.e(messageLite);
        this.f1963h = iArr2;
        this.f1964i = i12;
        this.f1965j = i13;
        this.f1966k = d1Var;
        this.f1967l = k0Var;
        this.f1968m = w1Var;
        this.f1969n = uVar;
        this.f1960e = messageLite;
        this.f1970o = r0Var;
    }

    public static <T> long A(T t3, long j10) {
        return ((Long) z1.f2186c.k(t3, j10)).longValue();
    }

    public static java.lang.reflect.Field J(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
            for (java.lang.reflect.Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbA = e.e.a("Field ", str, " for ");
            y0.a(cls, sbA, " not found. Known fields are ");
            sbA.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbA.toString());
        }
    }

    public static int P(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    public static void h(Object obj) {
        if (!q(obj)) {
            throw new IllegalArgumentException(z0.a(obj, "Mutating immutable message: "));
        }
    }

    public static int i(byte[] bArr, int i10, int i11, b2.a aVar, Class cls, d.a aVar2) throws IOException {
        switch (aVar.ordinal()) {
            case 0:
                aVar2.f2002c = Double.valueOf(Double.longBitsToDouble(d.c(bArr, i10)));
                return i10 + 8;
            case 1:
                aVar2.f2002c = Float.valueOf(Float.intBitsToFloat(d.b(bArr, i10)));
                return i10 + 4;
            case 2:
            case 3:
                int iT = d.t(bArr, i10, aVar2);
                aVar2.f2002c = Long.valueOf(aVar2.f2001b);
                return iT;
            case 4:
            case 12:
            case 13:
                int iR = d.r(bArr, i10, aVar2);
                aVar2.f2002c = Integer.valueOf(aVar2.f2000a);
                return iR;
            case 5:
            case 15:
                aVar2.f2002c = Long.valueOf(d.c(bArr, i10));
                return i10 + 8;
            case 6:
            case 14:
                aVar2.f2002c = Integer.valueOf(d.b(bArr, i10));
                return i10 + 4;
            case 7:
                int iT2 = d.t(bArr, i10, aVar2);
                aVar2.f2002c = Boolean.valueOf(aVar2.f2001b != 0);
                return iT2;
            case 8:
                int iR2 = d.r(bArr, i10, aVar2);
                int i12 = aVar2.f2000a;
                if (i12 < 0) {
                    throw e0.e();
                }
                if (i12 == 0) {
                    aVar2.f2002c = "";
                    return iR2;
                }
                aVar2.f2002c = a2.f1951a.a(bArr, iR2, i12);
                return iR2 + i12;
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                return d.e(k1.f2075c.a(cls), bArr, i10, i11, aVar2);
            case 11:
                return d.a(bArr, i10, aVar2);
            case 16:
                int iR3 = d.r(bArr, i10, aVar2);
                aVar2.f2002c = Integer.valueOf(k.c(aVar2.f2000a));
                return iR3;
            case 17:
                int iT3 = d.t(bArr, i10, aVar2);
                aVar2.f2002c = Long.valueOf(k.d(aVar2.f2001b));
                return iT3;
        }
    }

    public static x1 n(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        x1 x1Var = generatedMessageLite.unknownFields;
        if (x1Var != x1.f2170f) {
            return x1Var;
        }
        x1 x1Var2 = new x1();
        generatedMessageLite.unknownFields = x1Var2;
        return x1Var2;
    }

    public static boolean q(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof GeneratedMessageLite) {
            return ((GeneratedMessageLite) obj).isMutable();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:166:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x039d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <T> b1<T> x(m1 m1Var, d1 d1Var, k0 k0Var, w1<?, ?> w1Var, u<?> uVar, r0 r0Var) {
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
        Object[] objArr;
        int i25;
        int i26;
        Object[] objArr2;
        int i27;
        int iObjectFieldOffset;
        String str;
        Object[] objArr3;
        int i28;
        int iObjectFieldOffset2;
        int i29;
        int i30;
        java.lang.reflect.Field fieldJ;
        int i31;
        char cCharAt9;
        int i32;
        java.lang.reflect.Field fieldJ2;
        java.lang.reflect.Field fieldJ3;
        int i33;
        char cCharAt10;
        int i34;
        char cCharAt11;
        int i35;
        int i36;
        char cCharAt12;
        int i37;
        char cCharAt13;
        String str2 = m1Var.f2098b;
        int length = str2.length();
        if (str2.charAt(0) >= 55296) {
            int i38 = 1;
            while (true) {
                i10 = i38 + 1;
                if (str2.charAt(i38) < 55296) {
                    break;
                }
                i38 = i10;
            }
        } else {
            i10 = 1;
        }
        int i39 = i10 + 1;
        int iCharAt2 = str2.charAt(i10);
        if (iCharAt2 >= 55296) {
            int i40 = iCharAt2 & 8191;
            int i41 = 13;
            while (true) {
                i37 = i39 + 1;
                cCharAt13 = str2.charAt(i39);
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
            i12 = 0;
            i15 = 0;
            iCharAt = 0;
            i11 = 0;
            i14 = 0;
            i16 = 0;
            iArr = f1954p;
            i13 = 0;
        } else {
            int i42 = i39 + 1;
            int iCharAt3 = str2.charAt(i39);
            if (iCharAt3 >= 55296) {
                int i43 = iCharAt3 & 8191;
                int i44 = 13;
                while (true) {
                    i24 = i42 + 1;
                    cCharAt8 = str2.charAt(i42);
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
            int iCharAt4 = str2.charAt(i42);
            if (iCharAt4 >= 55296) {
                int i46 = iCharAt4 & 8191;
                int i47 = 13;
                while (true) {
                    i23 = i45 + 1;
                    cCharAt7 = str2.charAt(i45);
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
            int iCharAt5 = str2.charAt(i45);
            if (iCharAt5 >= 55296) {
                int i49 = iCharAt5 & 8191;
                int i50 = 13;
                while (true) {
                    i22 = i48 + 1;
                    cCharAt6 = str2.charAt(i48);
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
            int iCharAt6 = str2.charAt(i48);
            if (iCharAt6 >= 55296) {
                int i52 = iCharAt6 & 8191;
                int i53 = 13;
                while (true) {
                    i21 = i51 + 1;
                    cCharAt5 = str2.charAt(i51);
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
            iCharAt = str2.charAt(i51);
            if (iCharAt >= 55296) {
                int i55 = iCharAt & 8191;
                int i56 = 13;
                while (true) {
                    i20 = i54 + 1;
                    cCharAt4 = str2.charAt(i54);
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
            int iCharAt7 = str2.charAt(i54);
            if (iCharAt7 >= 55296) {
                int i58 = iCharAt7 & 8191;
                int i59 = 13;
                while (true) {
                    i19 = i57 + 1;
                    cCharAt3 = str2.charAt(i57);
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
            int iCharAt8 = str2.charAt(i57);
            if (iCharAt8 >= 55296) {
                int i61 = iCharAt8 & 8191;
                int i62 = 13;
                while (true) {
                    i18 = i60 + 1;
                    cCharAt2 = str2.charAt(i60);
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
            int iCharAt9 = str2.charAt(i60);
            if (iCharAt9 >= 55296) {
                int i64 = iCharAt9 & 8191;
                int i65 = 13;
                while (true) {
                    i17 = i63 + 1;
                    cCharAt = str2.charAt(i63);
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
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            int i66 = (iCharAt3 * 2) + iCharAt4;
            int i67 = iCharAt7;
            i11 = iCharAt5;
            i12 = i67;
            i13 = iCharAt3;
            i39 = i63;
            iArr = iArr2;
            i14 = iCharAt6;
            i15 = i66;
            i16 = iCharAt9;
        }
        Unsafe unsafe = f1955q;
        Object[] objArr4 = m1Var.f2099c;
        Class<?> cls = m1Var.f2097a.getClass();
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr5 = new Object[iCharAt * 2];
        int i68 = i16 + i12;
        int i69 = i68;
        int i70 = i16;
        int i71 = 0;
        int i72 = 0;
        while (i39 < length) {
            int i73 = i39 + 1;
            int iCharAt10 = str2.charAt(i39);
            int i74 = length;
            if (iCharAt10 >= 55296) {
                int i75 = iCharAt10 & 8191;
                int i76 = i73;
                int i77 = 13;
                while (true) {
                    i36 = i76 + 1;
                    cCharAt12 = str2.charAt(i76);
                    objArr = objArr4;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i75 |= (cCharAt12 & 8191) << i77;
                    i77 += 13;
                    i76 = i36;
                    objArr4 = objArr;
                }
                iCharAt10 = i75 | (cCharAt12 << i77);
                i25 = i36;
            } else {
                objArr = objArr4;
                i25 = i73;
            }
            int i78 = i25 + 1;
            int iCharAt11 = str2.charAt(i25);
            if (iCharAt11 >= 55296) {
                int i79 = iCharAt11 & 8191;
                int i80 = i78;
                int i81 = 13;
                while (true) {
                    i34 = i80 + 1;
                    cCharAt11 = str2.charAt(i80);
                    i35 = i79;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i79 = i35 | ((cCharAt11 & 8191) << i81);
                    i81 += 13;
                    i80 = i34;
                }
                iCharAt11 = i35 | (cCharAt11 << i81);
                i26 = i34;
            } else {
                i26 = i78;
            }
            int i82 = iCharAt10;
            int i83 = iCharAt11 & 255;
            int[] iArr4 = iArr3;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i72] = i71;
                i72++;
            }
            j1 j1Var = j1.f2044a;
            int i84 = i13;
            int i85 = i68;
            if (i83 >= 51) {
                int i86 = i26 + 1;
                int iCharAt12 = str2.charAt(i26);
                char c10 = 55296;
                if (iCharAt12 >= 55296) {
                    int i87 = iCharAt12 & 8191;
                    int i88 = 13;
                    while (true) {
                        i33 = i86 + 1;
                        cCharAt10 = str2.charAt(i86);
                        if (cCharAt10 < c10) {
                            break;
                        }
                        i87 |= (cCharAt10 & 8191) << i88;
                        i88 += 13;
                        i86 = i33;
                        c10 = 55296;
                    }
                    iCharAt12 = i87 | (cCharAt10 << i88);
                    i86 = i33;
                }
                int i89 = i83 - 51;
                int i90 = iCharAt12;
                if (i89 == 9 || i89 == 17) {
                    objArr5[a1.b(i71, 3, 2, 1)] = objArr[i15];
                    i15++;
                } else if (i89 == 12 && (m1Var.getSyntax().equals(j1Var) || (iCharAt11 & 2048) != 0)) {
                    objArr5[a1.b(i71, 3, 2, 1)] = objArr[i15];
                    i15++;
                }
                int i91 = i90 * 2;
                Object obj = objArr[i91];
                if (obj instanceof java.lang.reflect.Field) {
                    fieldJ2 = (java.lang.reflect.Field) obj;
                } else {
                    fieldJ2 = J(cls, (String) obj);
                    objArr[i91] = fieldJ2;
                }
                int i92 = i15;
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldJ2);
                int i93 = i91 + 1;
                Object obj2 = objArr[i93];
                if (obj2 instanceof java.lang.reflect.Field) {
                    fieldJ3 = (java.lang.reflect.Field) obj2;
                } else {
                    fieldJ3 = J(cls, (String) obj2);
                    objArr[i93] = fieldJ3;
                }
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldJ3);
                str = str2;
                iObjectFieldOffset = iObjectFieldOffset3;
                i28 = i71;
                i29 = i86;
                i27 = i92;
                iObjectFieldOffset2 = iObjectFieldOffset4;
                objArr3 = objArr5;
                i30 = 0;
            } else {
                int i94 = i15 + 1;
                java.lang.reflect.Field fieldJ4 = J(cls, (String) objArr[i15]);
                if (i83 == 9 || i83 == 17) {
                    objArr5[a1.b(i71, 3, 2, 1)] = fieldJ4.getType();
                } else {
                    if (i83 == 27 || i83 == 49) {
                        i32 = i15 + 2;
                        objArr5[a1.b(i71, 3, 2, 1)] = objArr[i94];
                    } else if (i83 == 12 || i83 == 30 || i83 == 44) {
                        if (m1Var.getSyntax() == j1Var || (iCharAt11 & 2048) != 0) {
                            i32 = i15 + 2;
                            objArr5[a1.b(i71, 3, 2, 1)] = objArr[i94];
                        }
                    } else if (i83 == 50) {
                        int i95 = i70 + 1;
                        iArr[i70] = i71;
                        int i96 = (i71 / 3) * 2;
                        int i97 = i15 + 2;
                        objArr5[i96] = objArr[i94];
                        if ((iCharAt11 & 2048) != 0) {
                            objArr5[i96 + 1] = objArr[i97];
                            i27 = i15 + 3;
                            objArr2 = objArr5;
                        } else {
                            objArr2 = objArr5;
                            i27 = i97;
                        }
                        i70 = i95;
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldJ4);
                        if ((iCharAt11 & 4096) == 0 || i83 > 17) {
                            str = str2;
                            objArr3 = objArr2;
                            i28 = i71;
                            iObjectFieldOffset2 = 1048575;
                            i29 = i26;
                            i30 = 0;
                        } else {
                            i29 = i26 + 1;
                            int iCharAt13 = str2.charAt(i26);
                            if (iCharAt13 >= 55296) {
                                int i98 = iCharAt13 & 8191;
                                int i99 = 13;
                                while (true) {
                                    i31 = i29 + 1;
                                    cCharAt9 = str2.charAt(i29);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i98 |= (cCharAt9 & 8191) << i99;
                                    i99 += 13;
                                    i29 = i31;
                                }
                                iCharAt13 = i98 | (cCharAt9 << i99);
                                i29 = i31;
                            }
                            int i100 = (iCharAt13 / 32) + (i84 * 2);
                            Object obj3 = objArr[i100];
                            str = str2;
                            if (obj3 instanceof java.lang.reflect.Field) {
                                fieldJ = (java.lang.reflect.Field) obj3;
                            } else {
                                fieldJ = J(cls, (String) obj3);
                                objArr[i100] = fieldJ;
                            }
                            objArr3 = objArr2;
                            i28 = i71;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldJ);
                            i30 = iCharAt13 % 32;
                        }
                        if (i83 >= 18 && i83 <= 49) {
                            iArr[i69] = iObjectFieldOffset;
                            i69++;
                        }
                    }
                    objArr2 = objArr5;
                    i27 = i32;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldJ4);
                    if ((iCharAt11 & 4096) == 0) {
                        str = str2;
                        objArr3 = objArr2;
                        i28 = i71;
                        iObjectFieldOffset2 = 1048575;
                        i29 = i26;
                        i30 = 0;
                        if (i83 >= 18) {
                            iArr[i69] = iObjectFieldOffset;
                            i69++;
                        }
                    }
                }
                objArr2 = objArr5;
                i27 = i94;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldJ4);
                if ((iCharAt11 & 4096) == 0) {
                }
            }
            int i101 = i28 + 1;
            iArr4[i28] = i82;
            int i102 = i28 + 2;
            int i103 = i28;
            iArr4[i101] = ((iCharAt11 & 512) != 0 ? PKIFailureInfo.duplicateCertReq : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 2048) != 0 ? PKIFailureInfo.systemUnavail : 0) | (i83 << 20) | iObjectFieldOffset;
            i71 = i103 + 3;
            iArr4[i102] = (i30 << 20) | iObjectFieldOffset2;
            i39 = i29;
            length = i74;
            iArr3 = iArr4;
            objArr4 = objArr;
            objArr5 = objArr3;
            str2 = str;
            i68 = i85;
            i15 = i27;
            i13 = i84;
        }
        return new b1<>(iArr3, objArr5, i11, i14, m1Var.f2097a, iArr, i16, i68, d1Var, k0Var, w1Var, uVar, r0Var);
    }

    public static long y(int i10) {
        return i10 & 1048575;
    }

    public static <T> int z(T t3, long j10) {
        return ((Integer) z1.f2186c.k(t3, j10)).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <K, V> int B(T t3, byte[] bArr, int i10, int i11, int i12, long j10, d.a aVar) throws IOException {
        int i13;
        Unsafe unsafe = f1955q;
        Object objL = l(i12);
        Object object = unsafe.getObject(t3, j10);
        r0 r0Var = this.f1970o;
        if (r0Var.isImmutable(object)) {
            q0 q0VarA = r0Var.a();
            r0Var.mergeFrom(q0VarA, object);
            unsafe.putObject(t3, j10, q0VarA);
            object = q0VarA;
        }
        p0.a<?, ?> aVarForMapMetadata = r0Var.forMapMetadata(objL);
        q0 q0VarForMutableMapData = r0Var.forMutableMapData(object);
        int iR = d.r(bArr, i10, aVar);
        int i14 = aVar.f2000a;
        if (i14 < 0 || i14 > i11 - iR) {
            throw e0.g();
        }
        int i15 = iR + i14;
        aVarForMapMetadata.getClass();
        V v10 = aVarForMapMetadata.f2126c;
        Object obj = "";
        Object obj2 = v10;
        while (iR < i15) {
            int iQ = iR + 1;
            int i16 = bArr[iR];
            if (i16 < 0) {
                iQ = d.q(i16, bArr, iQ, aVar);
                i16 = aVar.f2000a;
            }
            int i17 = i16 >>> 3;
            int i18 = i16 & 7;
            if (i17 != 1) {
                if (i17 == 2) {
                    b2.a aVar2 = aVarForMapMetadata.f2125b;
                    if (i18 == aVar2.f1977b) {
                        i13 = i(bArr, iQ, i11, aVar2, v10.getClass(), aVar);
                        obj2 = aVar.f2002c;
                        iR = i13;
                    }
                }
                iR = d.w(i16, bArr, iQ, i11, aVar);
            } else {
                b2.a aVar3 = aVarForMapMetadata.f2124a;
                if (i18 == aVar3.f1977b) {
                    i13 = i(bArr, iQ, i11, aVar3, null, aVar);
                    obj = aVar.f2002c;
                    iR = i13;
                } else {
                    iR = d.w(i16, bArr, iQ, i11, aVar);
                }
            }
        }
        if (iR != i15) {
            throw e0.f();
        }
        q0VarForMutableMapData.put(obj, obj2);
        return i15;
    }

    /* JADX WARN: Code restructure failed: missing block: B:160:0x0542, code lost:
    
        r0 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0804, code lost:
    
        if (r0 == 1048575) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0806, code lost:
    
        r27.putInt(r10, r0, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x080c, code lost:
    
        r3 = null;
        r11 = r8.f1964i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x0813, code lost:
    
        if (r11 >= r8.f1965j) goto L337;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0815, code lost:
    
        r3 = (androidx.datastore.preferences.protobuf.x1) r8.j(r10, r8.f1963h[r11], r3, r8.f1968m, r31);
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0829, code lost:
    
        r0 = r8;
        r1 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x082b, code lost:
    
        if (r3 == null) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x082d, code lost:
    
        r0.f1968m.n(r1, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0832, code lost:
    
        if (r35 != 0) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0834, code lost:
    
        if (r7 != r6) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x083b, code lost:
    
        throw androidx.datastore.preferences.protobuf.e0.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x083c, code lost:
    
        if (r7 > r6) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x083e, code lost:
    
        if (r9 != r35) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0840, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0845, code lost:
    
        throw androidx.datastore.preferences.protobuf.e0.f();
     */
    /* JADX WARN: Removed duplicated region for block: B:239:0x07b3  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x07b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int C(T t3, byte[] bArr, int i10, int i11, int i12, d.a aVar) throws IOException {
        int i13;
        int i14;
        Unsafe unsafe;
        b1<T> b1Var;
        T t10;
        int i15;
        int i16;
        int i17;
        int iM;
        int iA;
        t tVar;
        int i18;
        int i19;
        t tVar2;
        int i20;
        int i21;
        int i22;
        Object objValueOf;
        int i23;
        int iT;
        Object objValueOf2;
        int iH;
        int iU;
        int i24;
        int i25;
        int i26;
        int i27;
        d.a aVar2;
        int i28;
        Unsafe unsafe2;
        byte[] bArr2;
        int i29;
        d.a aVar3;
        T t11;
        byte[] bArr3;
        int i30;
        int iT2;
        Unsafe unsafe3;
        byte[] bArr4;
        int i31;
        int i32;
        Unsafe unsafe4;
        d.a aVar4;
        byte[] bArr5;
        int i33;
        int i34;
        Unsafe unsafe5;
        d.a aVar5;
        int i35;
        int i36;
        int i37;
        int i38;
        b1<T> b1Var2 = this;
        T t12 = t3;
        byte[] bArr6 = bArr;
        int i39 = i11;
        d.a aVar6 = aVar;
        t tVar3 = aVar6.f2003d;
        h(t12);
        Unsafe unsafe6 = f1955q;
        int iP = i10;
        int i40 = -1;
        int i41 = 0;
        int i42 = 1048575;
        int i43 = 0;
        int i44 = 0;
        while (true) {
            if (iP < i39) {
                int iQ = iP + 1;
                int i45 = bArr6[iP];
                if (i45 < 0) {
                    iQ = d.q(i45, bArr6, iQ, aVar6);
                    i45 = aVar6.f2000a;
                }
                int i46 = iQ;
                int i47 = i45;
                int i48 = i47 >>> 3;
                int i49 = i41;
                int i50 = i47 & 7;
                int i51 = b1Var2.f1959d;
                int i52 = b1Var2.f1958c;
                if (i48 > i40) {
                    iM = (i48 < i52 || i48 > i51) ? -1 : b1Var2.M(i48, i49 / 3);
                    i17 = 0;
                } else if (i48 < i52 || i48 > i51) {
                    i17 = 0;
                    iM = -1;
                } else {
                    i17 = 0;
                    iM = b1Var2.M(i48, 0);
                }
                if (iM == -1) {
                    iA = i46;
                    i14 = i42;
                    tVar = tVar3;
                    unsafe = unsafe6;
                    i41 = i17;
                    i18 = i48;
                    b1Var = b1Var2;
                    t10 = t12;
                    i19 = i47;
                } else {
                    int[] iArr = b1Var2.f1956a;
                    int i53 = iArr[iM + 1];
                    int iP2 = P(i53);
                    long j10 = i53 & 1048575;
                    if (iP2 <= 17) {
                        int i54 = iArr[iM + 2];
                        int i55 = 1 << (i54 >>> 20);
                        int i56 = i54 & 1048575;
                        if (i56 != i42) {
                            int i57 = 1048575;
                            if (i42 != 1048575) {
                                unsafe6.putInt(t12, i42, i43);
                                i57 = 1048575;
                            }
                            if (i56 == i57) {
                                i24 = i50;
                                i35 = 0;
                            } else {
                                i24 = i50;
                                i35 = unsafe6.getInt(t12, i56);
                            }
                            i26 = i56;
                            i25 = i35;
                        } else {
                            i24 = i50;
                            i25 = i43;
                            i26 = i42;
                        }
                        switch (iP2) {
                            case 0:
                                i27 = i46;
                                i44 = i47;
                                i28 = iM;
                                unsafe2 = unsafe6;
                                if (i24 != 1) {
                                    unsafe3 = unsafe2;
                                    b1Var = b1Var2;
                                    t10 = t12;
                                    unsafe = unsafe3;
                                    tVar = tVar3;
                                    i41 = i28;
                                    iA = i27;
                                    i18 = i48;
                                    i14 = i26;
                                    i19 = i44;
                                    i43 = i25;
                                    break;
                                } else {
                                    z1.f2186c.o(t3, j10, Double.longBitsToDouble(d.c(bArr, i27)));
                                    t12 = t3;
                                    iP = i27 + 8;
                                    i39 = i11;
                                    aVar6 = aVar;
                                    i40 = i48;
                                    i42 = i26;
                                    i43 = i25 | i55;
                                    bArr6 = bArr;
                                    unsafe6 = unsafe2;
                                    i41 = i28;
                                    break;
                                }
                            case 1:
                                i27 = i46;
                                aVar2 = aVar;
                                i44 = i47;
                                i28 = iM;
                                unsafe2 = unsafe6;
                                bArr2 = bArr;
                                if (i24 != 5) {
                                    unsafe3 = unsafe2;
                                    b1Var = b1Var2;
                                    t10 = t12;
                                    unsafe = unsafe3;
                                    tVar = tVar3;
                                    i41 = i28;
                                    iA = i27;
                                    i18 = i48;
                                    i14 = i26;
                                    i19 = i44;
                                    i43 = i25;
                                    break;
                                } else {
                                    z1.f2186c.p(t12, j10, Float.intBitsToFloat(d.b(bArr2, i27)));
                                    iP = i27 + 4;
                                    i29 = i25 | i55;
                                    byte[] bArr7 = bArr2;
                                    unsafe6 = unsafe2;
                                    bArr6 = bArr7;
                                    aVar6 = aVar2;
                                    i41 = i28;
                                    i40 = i48;
                                    i42 = i26;
                                    i43 = i29;
                                    i39 = i11;
                                    break;
                                }
                            case 2:
                            case 3:
                                i27 = i46;
                                i44 = i47;
                                i28 = iM;
                                unsafe2 = unsafe6;
                                if (i24 != 0) {
                                    unsafe3 = unsafe2;
                                    b1Var = b1Var2;
                                    t10 = t12;
                                    unsafe = unsafe3;
                                    tVar = tVar3;
                                    i41 = i28;
                                    iA = i27;
                                    i18 = i48;
                                    i14 = i26;
                                    i19 = i44;
                                    i43 = i25;
                                    break;
                                } else {
                                    int iT3 = d.t(bArr, i27, aVar);
                                    T t13 = t12;
                                    unsafe2.putLong(t13, j10, aVar.f2001b);
                                    t12 = t13;
                                    unsafe6 = unsafe2;
                                    bArr6 = bArr;
                                    i39 = i11;
                                    aVar6 = aVar;
                                    i40 = i48;
                                    i42 = i26;
                                    i43 = i25 | i55;
                                    iP = iT3;
                                    i41 = i28;
                                    break;
                                }
                            case 4:
                            case 11:
                                i27 = i46;
                                i44 = i47;
                                i28 = iM;
                                unsafe2 = unsafe6;
                                if (i24 != 0) {
                                    unsafe3 = unsafe2;
                                    b1Var = b1Var2;
                                    t10 = t12;
                                    unsafe = unsafe3;
                                    tVar = tVar3;
                                    i41 = i28;
                                    iA = i27;
                                    i18 = i48;
                                    i14 = i26;
                                    i19 = i44;
                                    i43 = i25;
                                    break;
                                } else {
                                    int iR = d.r(bArr, i27, aVar);
                                    unsafe2.putInt(t12, j10, aVar.f2000a);
                                    unsafe6 = unsafe2;
                                    bArr6 = bArr;
                                    int i58 = i26;
                                    i43 = i25 | i55;
                                    iP = iR;
                                    aVar6 = aVar;
                                    i42 = i58;
                                    i39 = i11;
                                    i41 = i28;
                                    i40 = i48;
                                    break;
                                }
                            case 5:
                            case 14:
                                T t14 = t12;
                                i44 = i47;
                                i28 = iM;
                                if (i24 != 1) {
                                    i27 = i46;
                                    unsafe2 = unsafe6;
                                    t12 = t14;
                                    unsafe3 = unsafe2;
                                    b1Var = b1Var2;
                                    t10 = t12;
                                    unsafe = unsafe3;
                                    tVar = tVar3;
                                    i41 = i28;
                                    iA = i27;
                                    i18 = i48;
                                    i14 = i26;
                                    i19 = i44;
                                    i43 = i25;
                                    break;
                                } else {
                                    Unsafe unsafe7 = unsafe6;
                                    bArr2 = bArr;
                                    aVar2 = aVar;
                                    unsafe7.putLong(t14, j10, d.c(bArr, i46));
                                    unsafe2 = unsafe7;
                                    t12 = t14;
                                    iP = i46 + 8;
                                    i29 = i25 | i55;
                                    byte[] bArr72 = bArr2;
                                    unsafe6 = unsafe2;
                                    bArr6 = bArr72;
                                    aVar6 = aVar2;
                                    i41 = i28;
                                    i40 = i48;
                                    i42 = i26;
                                    i43 = i29;
                                    i39 = i11;
                                    break;
                                }
                            case 6:
                            case 13:
                                aVar3 = aVar;
                                t11 = t12;
                                i44 = i47;
                                bArr3 = bArr;
                                i28 = iM;
                                i30 = i46;
                                if (i24 != 5) {
                                    i27 = i30;
                                    unsafe3 = unsafe6;
                                    t12 = t11;
                                    b1Var = b1Var2;
                                    t10 = t12;
                                    unsafe = unsafe3;
                                    tVar = tVar3;
                                    i41 = i28;
                                    iA = i27;
                                    i18 = i48;
                                    i14 = i26;
                                    i19 = i44;
                                    i43 = i25;
                                    break;
                                } else {
                                    unsafe6.putInt(t11, j10, d.b(bArr3, i30));
                                    iT2 = i30 + 4;
                                    i29 = i25 | i55;
                                    aVar6 = aVar3;
                                    i41 = i28;
                                    i40 = i48;
                                    iP = iT2;
                                    bArr6 = bArr3;
                                    t12 = t11;
                                    i42 = i26;
                                    i43 = i29;
                                    i39 = i11;
                                    break;
                                }
                            case 7:
                                int i59 = iM;
                                i30 = i46;
                                aVar3 = aVar;
                                t11 = t12;
                                bArr3 = bArr;
                                if (i24 != 0) {
                                    i44 = i47;
                                    i28 = i59;
                                    i27 = i30;
                                    unsafe3 = unsafe6;
                                    t12 = t11;
                                    b1Var = b1Var2;
                                    t10 = t12;
                                    unsafe = unsafe3;
                                    tVar = tVar3;
                                    i41 = i28;
                                    iA = i27;
                                    i18 = i48;
                                    i14 = i26;
                                    i19 = i44;
                                    i43 = i25;
                                    break;
                                } else {
                                    iT2 = d.t(bArr3, i30, aVar3);
                                    i44 = i47;
                                    z1.f2186c.m(t11, j10, aVar3.f2001b != 0);
                                    i29 = i25 | i55;
                                    i41 = i59;
                                    aVar6 = aVar3;
                                    i40 = i48;
                                    iP = iT2;
                                    bArr6 = bArr3;
                                    t12 = t11;
                                    i42 = i26;
                                    i43 = i29;
                                    i39 = i11;
                                    break;
                                }
                            case 8:
                                int i60 = iM;
                                aVar3 = aVar;
                                t11 = t12;
                                bArr3 = bArr;
                                if (i24 != 2) {
                                    i27 = i46;
                                    unsafe3 = unsafe6;
                                    i44 = i47;
                                    i28 = i60;
                                    t12 = t11;
                                    b1Var = b1Var2;
                                    t10 = t12;
                                    unsafe = unsafe3;
                                    tVar = tVar3;
                                    i41 = i28;
                                    iA = i27;
                                    i18 = i48;
                                    i14 = i26;
                                    i19 = i44;
                                    i43 = i25;
                                    break;
                                } else {
                                    if ((536870912 & i53) != 0) {
                                        iT2 = d.r(bArr3, i46, aVar3);
                                        int i61 = aVar3.f2000a;
                                        if (i61 < 0) {
                                            throw e0.e();
                                        }
                                        if (i61 == 0) {
                                            aVar3.f2002c = "";
                                        } else {
                                            aVar3.f2002c = a2.f1951a.a(bArr3, iT2, i61);
                                            iT2 += i61;
                                        }
                                    } else {
                                        iT2 = d.o(bArr3, i46, aVar3);
                                    }
                                    unsafe6.putObject(t11, j10, aVar3.f2002c);
                                    i29 = i25 | i55;
                                    i41 = i60;
                                    aVar6 = aVar3;
                                    i44 = i47;
                                    i40 = i48;
                                    iP = iT2;
                                    bArr6 = bArr3;
                                    t12 = t11;
                                    i42 = i26;
                                    i43 = i29;
                                    i39 = i11;
                                    break;
                                }
                            case 9:
                                int i62 = iM;
                                Unsafe unsafe8 = unsafe6;
                                if (i24 != 2) {
                                    t11 = t12;
                                    aVar3 = aVar;
                                    i27 = i46;
                                    unsafe3 = unsafe8;
                                    i44 = i47;
                                    i28 = i62;
                                    t12 = t11;
                                    b1Var = b1Var2;
                                    t10 = t12;
                                    unsafe = unsafe3;
                                    tVar = tVar3;
                                    i41 = i28;
                                    iA = i27;
                                    i18 = i48;
                                    i14 = i26;
                                    i19 = i44;
                                    i43 = i25;
                                    break;
                                } else {
                                    T t15 = t12;
                                    Object objV = b1Var2.v(t15, i62);
                                    unsafe6 = unsafe8;
                                    i41 = i62;
                                    t11 = t15;
                                    iT2 = d.v(objV, b1Var2.m(i62), bArr, i46, i11, aVar);
                                    bArr3 = bArr;
                                    aVar3 = aVar;
                                    b1Var2.N(t11, i41, objV);
                                    i29 = i25 | i55;
                                    aVar6 = aVar3;
                                    i44 = i47;
                                    i40 = i48;
                                    iP = iT2;
                                    bArr6 = bArr3;
                                    t12 = t11;
                                    i42 = i26;
                                    i43 = i29;
                                    i39 = i11;
                                    break;
                                }
                            case 10:
                                bArr4 = bArr;
                                i31 = i46;
                                i32 = iM;
                                unsafe4 = unsafe6;
                                aVar4 = aVar;
                                if (i24 != 2) {
                                    unsafe3 = unsafe4;
                                    i27 = i31;
                                    i44 = i47;
                                    i28 = i32;
                                    b1Var = b1Var2;
                                    t10 = t12;
                                    unsafe = unsafe3;
                                    tVar = tVar3;
                                    i41 = i28;
                                    iA = i27;
                                    i18 = i48;
                                    i14 = i26;
                                    i19 = i44;
                                    i43 = i25;
                                    break;
                                } else {
                                    iP = d.a(bArr4, i31, aVar4);
                                    unsafe4.putObject(t12, j10, aVar4.f2002c);
                                    unsafe6 = unsafe4;
                                    bArr6 = bArr4;
                                    i42 = i26;
                                    i43 = i25 | i55;
                                    aVar6 = aVar4;
                                    i41 = i32;
                                    i44 = i47;
                                    i40 = i48;
                                    i39 = i11;
                                    break;
                                }
                            case 12:
                                bArr4 = bArr;
                                i31 = i46;
                                i32 = iM;
                                unsafe4 = unsafe6;
                                aVar4 = aVar;
                                if (i24 != 0) {
                                    unsafe3 = unsafe4;
                                    i27 = i31;
                                    i44 = i47;
                                    i28 = i32;
                                    b1Var = b1Var2;
                                    t10 = t12;
                                    unsafe = unsafe3;
                                    tVar = tVar3;
                                    i41 = i28;
                                    iA = i27;
                                    i18 = i48;
                                    i14 = i26;
                                    i19 = i44;
                                    i43 = i25;
                                    break;
                                } else {
                                    int iR2 = d.r(bArr4, i31, aVar4);
                                    int i63 = aVar4.f2000a;
                                    d0.e eVarK = b1Var2.k(i32);
                                    if ((i53 & PKIFailureInfo.systemUnavail) != 0 && eVarK != null && !eVarK.isInRange(i63)) {
                                        n(t12).f(i47, Long.valueOf(i63));
                                        iP = iR2;
                                        i41 = i32;
                                        aVar6 = aVar4;
                                        i44 = i47;
                                        i40 = i48;
                                        i39 = i11;
                                        unsafe6 = unsafe4;
                                        bArr6 = bArr4;
                                        i42 = i26;
                                        i43 = i25;
                                        break;
                                    } else {
                                        unsafe4.putInt(t12, j10, i63);
                                        i41 = i32;
                                        aVar6 = aVar4;
                                        i44 = i47;
                                        i40 = i48;
                                        i39 = i11;
                                        unsafe6 = unsafe4;
                                        bArr6 = bArr4;
                                        i42 = i26;
                                        i43 = i25 | i55;
                                        iP = iR2;
                                        break;
                                    }
                                }
                                break;
                            case 15:
                                bArr5 = bArr;
                                i33 = i46;
                                i34 = iM;
                                unsafe5 = unsafe6;
                                aVar5 = aVar;
                                if (i24 != 0) {
                                    unsafe3 = unsafe5;
                                    i44 = i47;
                                    i28 = i34;
                                    i27 = i33;
                                    b1Var = b1Var2;
                                    t10 = t12;
                                    unsafe = unsafe3;
                                    tVar = tVar3;
                                    i41 = i28;
                                    iA = i27;
                                    i18 = i48;
                                    i14 = i26;
                                    i19 = i44;
                                    i43 = i25;
                                    break;
                                } else {
                                    iP = d.r(bArr5, i33, aVar5);
                                    unsafe5.putInt(t12, j10, k.c(aVar5.f2000a));
                                    i29 = i25 | i55;
                                    aVar6 = aVar5;
                                    i44 = i47;
                                    i41 = i34;
                                    i40 = i48;
                                    unsafe6 = unsafe5;
                                    bArr6 = bArr5;
                                    i42 = i26;
                                    i43 = i29;
                                    i39 = i11;
                                    break;
                                }
                            case 16:
                                bArr5 = bArr;
                                i33 = i46;
                                i34 = iM;
                                if (i24 != 0) {
                                    Unsafe unsafe9 = unsafe6;
                                    aVar5 = aVar;
                                    unsafe5 = unsafe9;
                                    unsafe3 = unsafe5;
                                    i44 = i47;
                                    i28 = i34;
                                    i27 = i33;
                                    b1Var = b1Var2;
                                    t10 = t12;
                                    unsafe = unsafe3;
                                    tVar = tVar3;
                                    i41 = i28;
                                    iA = i27;
                                    i18 = i48;
                                    i14 = i26;
                                    i19 = i44;
                                    i43 = i25;
                                    break;
                                } else {
                                    int iT4 = d.t(bArr5, i33, aVar);
                                    T t16 = t12;
                                    Unsafe unsafe10 = unsafe6;
                                    unsafe10.putLong(t16, j10, k.d(aVar.f2001b));
                                    t12 = t16;
                                    i39 = i11;
                                    aVar6 = aVar;
                                    i44 = i47;
                                    i40 = i48;
                                    unsafe6 = unsafe10;
                                    bArr6 = bArr5;
                                    i42 = i26;
                                    i43 = i25 | i55;
                                    iP = iT4;
                                    i41 = i34;
                                    break;
                                }
                            case 17:
                                if (i24 != 3) {
                                    i27 = i46;
                                    unsafe3 = unsafe6;
                                    i44 = i47;
                                    i28 = iM;
                                    b1Var = b1Var2;
                                    t10 = t12;
                                    unsafe = unsafe3;
                                    tVar = tVar3;
                                    i41 = i28;
                                    iA = i27;
                                    i18 = i48;
                                    i14 = i26;
                                    i19 = i44;
                                    i43 = i25;
                                    break;
                                } else {
                                    Object objV2 = b1Var2.v(t12, iM);
                                    int i64 = iM;
                                    iP = d.u(objV2, b1Var2.m(iM), bArr, i46, i11, (i48 << 3) | 4, aVar);
                                    b1Var2.N(t12, i64, objV2);
                                    i29 = i25 | i55;
                                    aVar6 = aVar;
                                    bArr6 = bArr;
                                    i44 = i47;
                                    i41 = i64;
                                    i40 = i48;
                                    i42 = i26;
                                    i43 = i29;
                                    i39 = i11;
                                    break;
                                }
                            default:
                                i27 = i46;
                                unsafe3 = unsafe6;
                                i44 = i47;
                                i28 = iM;
                                b1Var = b1Var2;
                                t10 = t12;
                                unsafe = unsafe3;
                                tVar = tVar3;
                                i41 = i28;
                                iA = i27;
                                i18 = i48;
                                i14 = i26;
                                i19 = i44;
                                i43 = i25;
                                break;
                        }
                    } else {
                        i44 = i47;
                        int i65 = iM;
                        Unsafe unsafe11 = unsafe6;
                        if (iP2 == 27) {
                            if (i50 == 2) {
                                d0.j jVarMutableCopyWithCapacity = (d0.j) unsafe11.getObject(t12, j10);
                                if (!jVarMutableCopyWithCapacity.isModifiable()) {
                                    int size = jVarMutableCopyWithCapacity.size();
                                    jVarMutableCopyWithCapacity = jVarMutableCopyWithCapacity.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
                                    unsafe11.putObject(t12, j10, jVarMutableCopyWithCapacity);
                                }
                                unsafe6 = unsafe11;
                                bArr6 = bArr;
                                i39 = i11;
                                aVar6 = aVar;
                                iP = d.f(b1Var2.m(i65), i44, bArr, i46, i11, jVarMutableCopyWithCapacity, aVar);
                                i41 = i65;
                                i40 = i48;
                                t12 = t3;
                            } else {
                                i38 = i46;
                                unsafe = unsafe11;
                                i14 = i42;
                                tVar = tVar3;
                                i36 = i48;
                                i37 = i43;
                            }
                        } else if (iP2 <= 49) {
                            tVar = tVar3;
                            unsafe = unsafe11;
                            i14 = i42;
                            i37 = i43;
                            int iE = b1Var2.E(t3, bArr, i46, i11, i44, i48, i50, i65, i53, iP2, j10, aVar);
                            i18 = i48;
                            i65 = i65;
                            if (iE != i46) {
                                b1Var2 = this;
                                t12 = t3;
                                bArr6 = bArr;
                                i39 = i11;
                                aVar6 = aVar;
                                iP = iE;
                                i40 = i18;
                                i41 = i65;
                                i42 = i14;
                                i43 = i37;
                                tVar3 = tVar;
                                unsafe6 = unsafe;
                            } else {
                                b1Var = this;
                                t10 = t3;
                                iA = iE;
                                i41 = i65;
                                i19 = i44;
                                i43 = i37;
                            }
                        } else {
                            i14 = i42;
                            tVar = tVar3;
                            unsafe = unsafe11;
                            i36 = i48;
                            i37 = i43;
                            i38 = i46;
                            if (iP2 == 50) {
                                if (i50 == 2) {
                                    int iB = B(t3, bArr, i38, i11, i65, j10, aVar);
                                    if (iB != i38) {
                                        b1Var2 = this;
                                        t12 = t3;
                                        bArr6 = bArr;
                                        i39 = i11;
                                        aVar6 = aVar;
                                        iP = iB;
                                        i40 = i36;
                                    } else {
                                        b1Var = this;
                                        iA = iB;
                                    }
                                }
                                i18 = i36;
                                i41 = i65;
                                i19 = i44;
                                i43 = i37;
                                t10 = t3;
                            } else {
                                int iD = D(t3, bArr, i38, i11, i44, i36, i50, i53, iP2, j10, i65, aVar);
                                b1Var = this;
                                t10 = t3;
                                i19 = i44;
                                i18 = i36;
                                i65 = i65;
                                if (iD != i38) {
                                    bArr6 = bArr;
                                    i39 = i11;
                                    aVar6 = aVar;
                                    i44 = i19;
                                    iP = iD;
                                    b1Var2 = b1Var;
                                    i40 = i18;
                                    t12 = t10;
                                } else {
                                    iA = iD;
                                    i41 = i65;
                                    i43 = i37;
                                }
                            }
                            i41 = i65;
                            i42 = i14;
                            i43 = i37;
                            tVar3 = tVar;
                            unsafe6 = unsafe;
                        }
                        b1Var = this;
                        iA = i38;
                        i18 = i36;
                        i41 = i65;
                        i19 = i44;
                        i43 = i37;
                        t10 = t3;
                    }
                }
                if (i19 != i12 || i12 == 0) {
                    if (b1Var.f1961f) {
                        tVar2 = tVar;
                        if (tVar2 != t.b()) {
                            GeneratedMessageLite.c cVarA = tVar2.a(i18, b1Var.f1960e);
                            if (cVarA == null) {
                                i44 = i19;
                                iH = d.p(i19, bArr, iA, i11, n(t10), aVar);
                            } else {
                                i44 = i19;
                                GeneratedMessageLite.ExtendableMessage extendableMessage = (GeneratedMessageLite.ExtendableMessage) t10;
                                extendableMessage.ensureExtensionsAreMutable();
                                x<GeneratedMessageLite.b> xVar = extendableMessage.extensions;
                                int i66 = i44 >>> 3;
                                GeneratedMessageLite.b bVar = cVarA.f1924d;
                                MessageLite messageLite = cVarA.f1923c;
                                boolean z10 = bVar.f1919c;
                                b2.a aVar7 = bVar.f1918b;
                                if (z10 && bVar.f1920d) {
                                    switch (aVar7.ordinal()) {
                                        case 0:
                                            i20 = i43;
                                            q qVar = new q();
                                            iH = d.h(bArr, iA, qVar, aVar);
                                            xVar.p(bVar, qVar);
                                            break;
                                        case 1:
                                            i20 = i43;
                                            a0 a0Var = new a0();
                                            iH = d.k(bArr, iA, a0Var, aVar);
                                            xVar.p(bVar, a0Var);
                                            break;
                                        case 2:
                                        case 3:
                                            n0 n0Var = new n0();
                                            iH = d.r(bArr, iA, aVar);
                                            int i67 = aVar.f2000a + iH;
                                            while (iH < i67) {
                                                iH = d.t(bArr, iH, aVar);
                                                n0Var.addLong(aVar.f2001b);
                                                i43 = i43;
                                            }
                                            i20 = i43;
                                            if (iH != i67) {
                                                throw e0.g();
                                            }
                                            xVar.p(bVar, n0Var);
                                            break;
                                        case 4:
                                        case 12:
                                            c0 c0Var = new c0();
                                            iH = d.n(bArr, iA, c0Var, aVar);
                                            xVar.p(bVar, c0Var);
                                            break;
                                        case 5:
                                        case 15:
                                            n0 n0Var2 = new n0();
                                            iH = d.j(bArr, iA, n0Var2, aVar);
                                            xVar.p(bVar, n0Var2);
                                            break;
                                        case 6:
                                        case 14:
                                            c0 c0Var2 = new c0();
                                            iH = d.i(bArr, iA, c0Var2, aVar);
                                            xVar.p(bVar, c0Var2);
                                            break;
                                        case 7:
                                            f fVar = new f();
                                            iH = d.g(bArr, iA, fVar, aVar);
                                            xVar.p(bVar, fVar);
                                            break;
                                        case 8:
                                        case 9:
                                        case 10:
                                        case 11:
                                        default:
                                            throw new IllegalStateException("Type cannot be packed: " + bVar.f1918b);
                                        case 13:
                                            c0 c0Var3 = new c0();
                                            iH = d.n(bArr, iA, c0Var3, aVar);
                                            p1.j(extendableMessage, i66, c0Var3, null, null, b1Var.f1968m);
                                            xVar.p(bVar, c0Var3);
                                            break;
                                        case 16:
                                            c0 c0Var4 = new c0();
                                            iH = d.l(bArr, iA, c0Var4, aVar);
                                            xVar.p(bVar, c0Var4);
                                            break;
                                        case 17:
                                            n0 n0Var3 = new n0();
                                            iH = d.m(bArr, iA, n0Var3, aVar);
                                            xVar.p(bVar, n0Var3);
                                            break;
                                    }
                                } else {
                                    i20 = i43;
                                    if (aVar7 == b2.a.f1974f) {
                                        d.r(bArr, iA, aVar);
                                        int i68 = aVar.f2000a;
                                        throw null;
                                    }
                                    switch (aVar7.ordinal()) {
                                        case 0:
                                            i22 = iA;
                                            objValueOf = Double.valueOf(Double.longBitsToDouble(d.c(bArr, i22)));
                                            iH = i22 + 8;
                                            if (bVar.f1919c) {
                                                xVar.p(bVar, objValueOf);
                                            } else {
                                                xVar.a(bVar, objValueOf);
                                            }
                                            i21 = i11;
                                            iP = iH;
                                            break;
                                        case 1:
                                            i23 = iA;
                                            objValueOf = Float.valueOf(Float.intBitsToFloat(d.b(bArr, i23)));
                                            iH = i23 + 4;
                                            if (bVar.f1919c) {
                                            }
                                            i21 = i11;
                                            iP = iH;
                                            break;
                                        case 2:
                                        case 3:
                                            iT = d.t(bArr, iA, aVar);
                                            objValueOf2 = Long.valueOf(aVar.f2001b);
                                            Object obj = objValueOf2;
                                            iH = iT;
                                            objValueOf = obj;
                                            if (bVar.f1919c) {
                                            }
                                            i21 = i11;
                                            iP = iH;
                                            break;
                                        case 4:
                                        case 12:
                                            iT = d.r(bArr, iA, aVar);
                                            objValueOf2 = Integer.valueOf(aVar.f2000a);
                                            Object obj2 = objValueOf2;
                                            iH = iT;
                                            objValueOf = obj2;
                                            if (bVar.f1919c) {
                                            }
                                            i21 = i11;
                                            iP = iH;
                                            break;
                                        case 5:
                                        case 15:
                                            i22 = iA;
                                            objValueOf = Long.valueOf(d.c(bArr, i22));
                                            iH = i22 + 8;
                                            if (bVar.f1919c) {
                                            }
                                            i21 = i11;
                                            iP = iH;
                                            break;
                                        case 6:
                                        case 14:
                                            i23 = iA;
                                            objValueOf = Integer.valueOf(d.b(bArr, i23));
                                            iH = i23 + 4;
                                            if (bVar.f1919c) {
                                            }
                                            i21 = i11;
                                            iP = iH;
                                            break;
                                        case 7:
                                            iT = d.t(bArr, iA, aVar);
                                            objValueOf2 = Boolean.valueOf(aVar.f2001b != 0);
                                            Object obj22 = objValueOf2;
                                            iH = iT;
                                            objValueOf = obj22;
                                            if (bVar.f1919c) {
                                            }
                                            i21 = i11;
                                            iP = iH;
                                            break;
                                        case 8:
                                            iT = d.o(bArr, iA, aVar);
                                            objValueOf2 = aVar.f2002c;
                                            Object obj222 = objValueOf2;
                                            iH = iT;
                                            objValueOf = obj222;
                                            if (bVar.f1919c) {
                                            }
                                            i21 = i11;
                                            iP = iH;
                                            break;
                                        case 9:
                                            int i69 = (i66 << 3) | 4;
                                            o1<T> o1VarA = k1.f2075c.a(messageLite.getClass());
                                            if (bVar.f1919c) {
                                                iU = d.d(o1VarA, bArr, iA, i11, i69, aVar);
                                                xVar.a(bVar, aVar.f2002c);
                                            } else {
                                                Object objF = xVar.f(bVar);
                                                if (objF == null) {
                                                    objF = o1VarA.newInstance();
                                                    xVar.p(bVar, objF);
                                                }
                                                iU = d.u(objF, o1VarA, bArr, iA, i11, i69, aVar);
                                            }
                                            iH = iU;
                                            i21 = i11;
                                            iP = iH;
                                            break;
                                        case 10:
                                            o1<T> o1VarA2 = k1.f2075c.a(messageLite.getClass());
                                            if (!bVar.f1919c) {
                                                Object objF2 = xVar.f(bVar);
                                                if (objF2 == null) {
                                                    objF2 = o1VarA2.newInstance();
                                                    xVar.p(bVar, objF2);
                                                }
                                                iU = d.v(objF2, o1VarA2, bArr, iA, i11, aVar);
                                                iH = iU;
                                                i21 = i11;
                                                iP = iH;
                                                break;
                                            } else {
                                                int iE2 = d.e(o1VarA2, bArr, iA, i11, aVar);
                                                xVar.a(bVar, aVar.f2002c);
                                                iH = iE2;
                                                break;
                                            }
                                        case 11:
                                            iA = d.a(bArr, iA, aVar);
                                            objValueOf = aVar.f2002c;
                                            iH = iA;
                                            if (bVar.f1919c) {
                                            }
                                            i21 = i11;
                                            iP = iH;
                                            break;
                                        case 13:
                                            throw new IllegalStateException("Shouldn't reach here.");
                                        case 16:
                                            iA = d.r(bArr, iA, aVar);
                                            objValueOf = Integer.valueOf(k.c(aVar.f2000a));
                                            iH = iA;
                                            if (bVar.f1919c) {
                                            }
                                            i21 = i11;
                                            iP = iH;
                                            break;
                                        case 17:
                                            iA = d.t(bArr, iA, aVar);
                                            objValueOf = Long.valueOf(k.d(aVar.f2001b));
                                            iH = iA;
                                            if (bVar.f1919c) {
                                            }
                                            i21 = i11;
                                            iP = iH;
                                            break;
                                        default:
                                            objValueOf = null;
                                            iH = iA;
                                            if (bVar.f1919c) {
                                            }
                                            i21 = i11;
                                            iP = iH;
                                            break;
                                    }
                                }
                                i21 = i11;
                                iP = iH;
                            }
                            i20 = i43;
                            i21 = i11;
                            iP = iH;
                        }
                        bArr6 = bArr;
                        i43 = i20;
                        aVar6 = aVar;
                        i39 = i21;
                        b1Var2 = b1Var;
                        i40 = i18;
                        t12 = t10;
                        tVar3 = tVar2;
                        i42 = i14;
                        unsafe6 = unsafe;
                    } else {
                        tVar2 = tVar;
                    }
                    i44 = i19;
                    i20 = i43;
                    i21 = i11;
                    iP = d.p(i44, bArr, iA, i11, n(t10), aVar);
                    bArr6 = bArr;
                    i43 = i20;
                    aVar6 = aVar;
                    i39 = i21;
                    b1Var2 = b1Var;
                    i40 = i18;
                    t12 = t10;
                    tVar3 = tVar2;
                    i42 = i14;
                    unsafe6 = unsafe;
                } else {
                    i13 = i11;
                    i16 = i19;
                    i15 = iA;
                }
            } else {
                i13 = i39;
                i14 = i42;
                unsafe = unsafe6;
                b1Var = b1Var2;
                t10 = t12;
                i15 = iP;
                i16 = i44;
            }
        }
    }

    public final int D(T t3, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, d.a aVar) throws IOException {
        Unsafe unsafe = f1955q;
        long j11 = this.f1956a[i17 + 2] & 1048575;
        switch (i16) {
            case EACTags.TRANSACTION_DATE /* 51 */:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(t3, j10, Double.valueOf(Double.longBitsToDouble(d.c(bArr, i10))));
                int i18 = i10 + 8;
                unsafe.putInt(t3, j11, i13);
                return i18;
            case 52:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(t3, j10, Float.valueOf(Float.intBitsToFloat(d.b(bArr, i10))));
                int i19 = i10 + 4;
                unsafe.putInt(t3, j11, i13);
                return i19;
            case EACTags.SEX /* 53 */:
            case EACTags.CURRENCY_EXPONENT /* 54 */:
                if (i14 != 0) {
                    return i10;
                }
                int iT = d.t(bArr, i10, aVar);
                unsafe.putObject(t3, j10, Long.valueOf(aVar.f2001b));
                unsafe.putInt(t3, j11, i13);
                return iT;
            case 55:
            case 62:
                if (i14 != 0) {
                    return i10;
                }
                int iR = d.r(bArr, i10, aVar);
                unsafe.putObject(t3, j10, Integer.valueOf(aVar.f2000a));
                unsafe.putInt(t3, j11, i13);
                return iR;
            case 56:
            case EACTags.ELEMENT_LIST /* 65 */:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(t3, j10, Long.valueOf(d.c(bArr, i10)));
                int i20 = i10 + 8;
                unsafe.putInt(t3, j11, i13);
                return i20;
            case 57:
            case 64:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(t3, j10, Integer.valueOf(d.b(bArr, i10)));
                int i21 = i10 + 4;
                unsafe.putInt(t3, j11, i13);
                return i21;
            case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                if (i14 != 0) {
                    return i10;
                }
                int iT2 = d.t(bArr, i10, aVar);
                unsafe.putObject(t3, j10, Boolean.valueOf(aVar.f2001b != 0));
                unsafe.putInt(t3, j11, i13);
                return iT2;
            case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                if (i14 != 2) {
                    return i10;
                }
                int iR2 = d.r(bArr, i10, aVar);
                int i22 = aVar.f2000a;
                if (i22 == 0) {
                    unsafe.putObject(t3, j10, "");
                } else {
                    if ((i15 & PKIFailureInfo.duplicateCertReq) != 0) {
                        if (a2.f1951a.e(bArr, iR2, iR2 + i22) != 0) {
                            throw e0.b();
                        }
                    }
                    unsafe.putObject(t3, j10, new String(bArr, iR2, i22, d0.f2005a));
                    iR2 += i22;
                }
                unsafe.putInt(t3, j11, i13);
                return iR2;
            case 60:
                if (i14 != 2) {
                    return i10;
                }
                Object objW = w(t3, i13, i17);
                int iV = d.v(objW, m(i17), bArr, i10, i11, aVar);
                O(t3, i13, i17, objW);
                return iV;
            case 61:
                if (i14 != 2) {
                    return i10;
                }
                int iA = d.a(bArr, i10, aVar);
                unsafe.putObject(t3, j10, aVar.f2002c);
                unsafe.putInt(t3, j11, i13);
                return iA;
            case 63:
                if (i14 != 0) {
                    return i10;
                }
                int iR3 = d.r(bArr, i10, aVar);
                int i23 = aVar.f2000a;
                d0.e eVarK = k(i17);
                if (eVarK != null && !eVarK.isInRange(i23)) {
                    n(t3).f(i12, Long.valueOf(i23));
                    return iR3;
                }
                unsafe.putObject(t3, j10, Integer.valueOf(i23));
                unsafe.putInt(t3, j11, i13);
                return iR3;
            case EACTags.ADDRESS /* 66 */:
                if (i14 != 0) {
                    return i10;
                }
                int iR4 = d.r(bArr, i10, aVar);
                unsafe.putObject(t3, j10, Integer.valueOf(k.c(aVar.f2000a)));
                unsafe.putInt(t3, j11, i13);
                return iR4;
            case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                if (i14 != 0) {
                    return i10;
                }
                int iT3 = d.t(bArr, i10, aVar);
                unsafe.putObject(t3, j10, Long.valueOf(k.d(aVar.f2001b)));
                unsafe.putInt(t3, j11, i13);
                return iT3;
            case 68:
                if (i14 == 3) {
                    Object objW2 = w(t3, i13, i17);
                    int iU = d.u(objW2, m(i17), bArr, i10, i11, (i12 & (-8)) | 4, aVar);
                    O(t3, i13, i17, objW2);
                    return iU;
                }
                break;
        }
        return i10;
    }

    public final int E(T t3, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, long j10, int i16, long j11, d.a aVar) throws IOException {
        int i17;
        int iS;
        Unsafe unsafe = f1955q;
        d0.j jVarMutableCopyWithCapacity = (d0.j) unsafe.getObject(t3, j11);
        if (!jVarMutableCopyWithCapacity.isModifiable()) {
            int size = jVarMutableCopyWithCapacity.size();
            jVarMutableCopyWithCapacity = jVarMutableCopyWithCapacity.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
            unsafe.putObject(t3, j11, jVarMutableCopyWithCapacity);
        }
        d0.j jVar = jVarMutableCopyWithCapacity;
        switch (i16) {
            case 18:
            case 35:
                if (i14 == 2) {
                    return d.h(bArr, i10, jVar, aVar);
                }
                if (i14 != 1) {
                    return i10;
                }
                q qVar = (q) jVar;
                qVar.addDouble(Double.longBitsToDouble(d.c(bArr, i10)));
                int i18 = i10 + 8;
                while (i18 < i11) {
                    int iR = d.r(bArr, i18, aVar);
                    if (i12 != aVar.f2000a) {
                        return i18;
                    }
                    qVar.addDouble(Double.longBitsToDouble(d.c(bArr, iR)));
                    i18 = iR + 8;
                }
                return i18;
            case 19:
            case 36:
                if (i14 == 2) {
                    return d.k(bArr, i10, jVar, aVar);
                }
                if (i14 != 5) {
                    return i10;
                }
                a0 a0Var = (a0) jVar;
                a0Var.addFloat(Float.intBitsToFloat(d.b(bArr, i10)));
                int i19 = i10 + 4;
                while (i19 < i11) {
                    int iR2 = d.r(bArr, i19, aVar);
                    if (i12 != aVar.f2000a) {
                        return i19;
                    }
                    a0Var.addFloat(Float.intBitsToFloat(d.b(bArr, iR2)));
                    i19 = iR2 + 4;
                }
                return i19;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i14 == 2) {
                    n0 n0Var = (n0) jVar;
                    int iR3 = d.r(bArr, i10, aVar);
                    int i20 = aVar.f2000a + iR3;
                    while (iR3 < i20) {
                        iR3 = d.t(bArr, iR3, aVar);
                        n0Var.addLong(aVar.f2001b);
                    }
                    if (iR3 == i20) {
                        return iR3;
                    }
                    throw e0.g();
                }
                if (i14 != 0) {
                    return i10;
                }
                n0 n0Var2 = (n0) jVar;
                int iT = d.t(bArr, i10, aVar);
                n0Var2.addLong(aVar.f2001b);
                while (iT < i11) {
                    int iR4 = d.r(bArr, iT, aVar);
                    if (i12 != aVar.f2000a) {
                        return iT;
                    }
                    iT = d.t(bArr, iR4, aVar);
                    n0Var2.addLong(aVar.f2001b);
                }
                return iT;
            case 22:
            case 29:
            case 39:
            case EACTags.DATE_OF_BIRTH /* 43 */:
                return i14 == 2 ? d.n(bArr, i10, jVar, aVar) : i14 == 0 ? d.s(i12, bArr, i10, i11, jVar, aVar) : i10;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i14 == 2) {
                    return d.j(bArr, i10, jVar, aVar);
                }
                if (i14 != 1) {
                    return i10;
                }
                n0 n0Var3 = (n0) jVar;
                n0Var3.addLong(d.c(bArr, i10));
                int i21 = i10 + 8;
                while (i21 < i11) {
                    int iR5 = d.r(bArr, i21, aVar);
                    if (i12 != aVar.f2000a) {
                        return i21;
                    }
                    n0Var3.addLong(d.c(bArr, iR5));
                    i21 = iR5 + 8;
                }
                return i21;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i14 == 2) {
                    return d.i(bArr, i10, jVar, aVar);
                }
                if (i14 != 5) {
                    return i10;
                }
                c0 c0Var = (c0) jVar;
                c0Var.addInt(d.b(bArr, i10));
                int i22 = i10 + 4;
                while (i22 < i11) {
                    int iR6 = d.r(bArr, i22, aVar);
                    if (i12 != aVar.f2000a) {
                        return i22;
                    }
                    c0Var.addInt(d.b(bArr, iR6));
                    i22 = iR6 + 4;
                }
                return i22;
            case 25:
            case 42:
                if (i14 == 2) {
                    return d.g(bArr, i10, jVar, aVar);
                }
                if (i14 != 0) {
                    return i10;
                }
                f fVar = (f) jVar;
                int iT2 = d.t(bArr, i10, aVar);
                fVar.addBoolean(aVar.f2001b != 0);
                while (iT2 < i11) {
                    int iR7 = d.r(bArr, iT2, aVar);
                    if (i12 != aVar.f2000a) {
                        return iT2;
                    }
                    iT2 = d.t(bArr, iR7, aVar);
                    fVar.addBoolean(aVar.f2001b != 0);
                }
                return iT2;
            case 26:
                if (i14 != 2) {
                    return i10;
                }
                if ((j10 & 536870912) == 0) {
                    int iR8 = d.r(bArr, i10, aVar);
                    int i23 = aVar.f2000a;
                    if (i23 < 0) {
                        throw e0.e();
                    }
                    if (i23 == 0) {
                        jVar.add("");
                    } else {
                        jVar.add(new String(bArr, iR8, i23, d0.f2005a));
                        iR8 += i23;
                    }
                    while (iR8 < i11) {
                        int iR9 = d.r(bArr, iR8, aVar);
                        if (i12 != aVar.f2000a) {
                            return iR8;
                        }
                        iR8 = d.r(bArr, iR9, aVar);
                        int i24 = aVar.f2000a;
                        if (i24 < 0) {
                            throw e0.e();
                        }
                        if (i24 == 0) {
                            jVar.add("");
                        } else {
                            jVar.add(new String(bArr, iR8, i24, d0.f2005a));
                            iR8 += i24;
                        }
                    }
                    return iR8;
                }
                int iR10 = d.r(bArr, i10, aVar);
                int i25 = aVar.f2000a;
                if (i25 < 0) {
                    throw e0.e();
                }
                if (i25 == 0) {
                    jVar.add("");
                } else {
                    int i26 = iR10 + i25;
                    if (a2.f1951a.e(bArr, iR10, i26) != 0) {
                        throw e0.b();
                    }
                    jVar.add(new String(bArr, iR10, i25, d0.f2005a));
                    iR10 = i26;
                }
                while (iR10 < i11) {
                    int iR11 = d.r(bArr, iR10, aVar);
                    if (i12 != aVar.f2000a) {
                        return iR10;
                    }
                    iR10 = d.r(bArr, iR11, aVar);
                    int i27 = aVar.f2000a;
                    if (i27 < 0) {
                        throw e0.e();
                    }
                    if (i27 == 0) {
                        jVar.add("");
                    } else {
                        int i28 = iR10 + i27;
                        if (a2.f1951a.e(bArr, iR10, i28) != 0) {
                            throw e0.b();
                        }
                        jVar.add(new String(bArr, iR10, i27, d0.f2005a));
                        iR10 = i28;
                    }
                }
                return iR10;
            case 27:
                i17 = i10;
                if (i14 == 2) {
                    return d.f(m(i15), i12, bArr, i17, i11, jVar, aVar);
                }
                break;
            case 28:
                i17 = i10;
                if (i14 == 2) {
                    int iR12 = d.r(bArr, i17, aVar);
                    int i29 = aVar.f2000a;
                    if (i29 < 0) {
                        throw e0.e();
                    }
                    if (i29 > bArr.length - iR12) {
                        throw e0.g();
                    }
                    if (i29 == 0) {
                        jVar.add(j.f2038b);
                    } else {
                        jVar.add(j.c(iR12, i29, bArr));
                        iR12 += i29;
                    }
                    while (iR12 < i11) {
                        int iR13 = d.r(bArr, iR12, aVar);
                        if (i12 != aVar.f2000a) {
                            return iR12;
                        }
                        iR12 = d.r(bArr, iR13, aVar);
                        int i30 = aVar.f2000a;
                        if (i30 < 0) {
                            throw e0.e();
                        }
                        if (i30 > bArr.length - iR12) {
                            throw e0.g();
                        }
                        if (i30 == 0) {
                            jVar.add(j.f2038b);
                        } else {
                            jVar.add(j.c(iR12, i30, bArr));
                            iR12 += i30;
                        }
                    }
                    return iR12;
                }
                break;
            case 30:
            case 44:
                if (i14 == 2) {
                    iS = d.n(bArr, i10, jVar, aVar);
                } else {
                    if (i14 != 0) {
                        return i10;
                    }
                    iS = d.s(i12, bArr, i10, i11, jVar, aVar);
                }
                p1.k(t3, i13, jVar, k(i15), null, this.f1968m);
                return iS;
            case 33:
            case EACTags.PIN_USAGE_POLICY /* 47 */:
                if (i14 == 2) {
                    return d.l(bArr, i10, jVar, aVar);
                }
                if (i14 != 0) {
                    return i10;
                }
                c0 c0Var2 = (c0) jVar;
                int iR14 = d.r(bArr, i10, aVar);
                c0Var2.addInt(k.c(aVar.f2000a));
                while (iR14 < i11) {
                    int iR15 = d.r(bArr, iR14, aVar);
                    if (i12 != aVar.f2000a) {
                        return iR14;
                    }
                    iR14 = d.r(bArr, iR15, aVar);
                    c0Var2.addInt(k.c(aVar.f2000a));
                }
                return iR14;
            case 34:
            case 48:
                if (i14 == 2) {
                    return d.m(bArr, i10, jVar, aVar);
                }
                if (i14 != 0) {
                    return i10;
                }
                n0 n0Var4 = (n0) jVar;
                int iT3 = d.t(bArr, i10, aVar);
                n0Var4.addLong(k.d(aVar.f2001b));
                while (iT3 < i11) {
                    int iR16 = d.r(bArr, iT3, aVar);
                    if (i12 != aVar.f2000a) {
                        return iT3;
                    }
                    iT3 = d.t(bArr, iR16, aVar);
                    n0Var4.addLong(k.d(aVar.f2001b));
                }
                return iT3;
            case 49:
                if (i14 == 3) {
                    o1 o1VarM = m(i15);
                    int i31 = (i12 & (-8)) | 4;
                    int iD = d.d(o1VarM, bArr, i10, i11, i31, aVar);
                    o1 o1Var = o1VarM;
                    byte[] bArr2 = bArr;
                    jVar.add(aVar.f2002c);
                    while (iD < i11) {
                        int iR17 = d.r(bArr2, iD, aVar);
                        if (i12 != aVar.f2000a) {
                            return iD;
                        }
                        byte[] bArr3 = bArr2;
                        o1 o1Var2 = o1Var;
                        iD = d.d(o1Var2, bArr3, iR17, i11, i31, aVar);
                        jVar.add(aVar.f2002c);
                        o1Var = o1Var2;
                        bArr2 = bArr3;
                    }
                    return iD;
                }
            default:
                return i10;
        }
        return i17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void F(Object obj, long j10, l lVar, o1 o1Var, t tVar) throws IOException {
        int iE;
        d0.j jVarC = this.f1967l.c(obj, j10);
        k kVar = lVar.f2078a;
        int i10 = lVar.f2079b;
        if ((i10 & 7) != 3) {
            throw e0.c();
        }
        do {
            Object objNewInstance = o1Var.newInstance();
            lVar.b(objNewInstance, o1Var, tVar);
            o1Var.makeImmutable(objNewInstance);
            jVarC.add(objNewInstance);
            if (kVar.g() || lVar.f2081d != 0) {
                return;
            } else {
                iE = kVar.E();
            }
        } while (iE == i10);
        lVar.f2081d = iE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void G(Object obj, int i10, l lVar, o1 o1Var, t tVar) throws IOException {
        int iE;
        d0.j jVarC = this.f1967l.c(obj, i10 & 1048575);
        k kVar = lVar.f2078a;
        int i11 = lVar.f2079b;
        if ((i11 & 7) != 2) {
            throw e0.c();
        }
        do {
            Object objNewInstance = o1Var.newInstance();
            lVar.c(objNewInstance, o1Var, tVar);
            o1Var.makeImmutable(objNewInstance);
            jVarC.add(objNewInstance);
            if (kVar.g() || lVar.f2081d != 0) {
                return;
            } else {
                iE = kVar.E();
            }
        } while (iE == i11);
        lVar.f2081d = iE;
    }

    public final void H(Object obj, int i10, l lVar) throws IOException {
        if ((536870912 & i10) != 0) {
            lVar.x(2);
            z1.p(obj, i10 & 1048575, lVar.f2078a.D());
        } else if (!this.f1962g) {
            z1.p(obj, i10 & 1048575, lVar.e());
        } else {
            lVar.x(2);
            z1.p(obj, i10 & 1048575, lVar.f2078a.C());
        }
    }

    public final void I(Object obj, int i10, l lVar) throws IOException {
        int i11 = 536870912 & i10;
        k0 k0Var = this.f1967l;
        if (i11 != 0) {
            lVar.t(k0Var.c(obj, i10 & 1048575), true);
        } else {
            lVar.t(k0Var.c(obj, i10 & 1048575), false);
        }
    }

    public final void K(T t3, int i10) {
        int i11 = this.f1956a[i10 + 2];
        long j10 = 1048575 & i11;
        if (j10 == 1048575) {
            return;
        }
        z1.n(t3, j10, (1 << (i11 >>> 20)) | z1.f2186c.i(t3, j10));
    }

    public final void L(T t3, int i10, int i11) {
        z1.n(t3, this.f1956a[i11 + 2] & 1048575, i10);
    }

    public final int M(int i10, int i11) {
        int[] iArr = this.f1956a;
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

    public final void N(T t3, int i10, Object obj) {
        f1955q.putObject(t3, Q(i10) & 1048575, obj);
        K(t3, i10);
    }

    public final void O(T t3, int i10, int i11, Object obj) {
        f1955q.putObject(t3, Q(i11) & 1048575, obj);
        L(t3, i10, i11);
    }

    public final int Q(int i10) {
        return this.f1956a[i10 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R(T t3, c2 c2Var) throws IOException {
        Map.Entry<?, ?> entry;
        Iterator it;
        int i10;
        int i11;
        int i12;
        Map.Entry<?, ?> entry2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z10;
        b1<T> b1Var = this;
        boolean z11 = b1Var.f1961f;
        u<?> uVar = b1Var.f1969n;
        if (z11) {
            x<T> xVarC = uVar.c(t3);
            if (xVarC.f2166a.isEmpty()) {
                entry = null;
                it = null;
            } else {
                Iterator itL = xVarC.l();
                entry = (Map.Entry) itL.next();
                it = itL;
            }
        }
        int[] iArr = b1Var.f1956a;
        int length = iArr.length;
        Unsafe unsafe = f1955q;
        int i18 = 0;
        int i19 = 1048575;
        int i20 = 0;
        while (i18 < length) {
            int iQ = b1Var.Q(i18);
            int i21 = iArr[i18];
            int iP = P(iQ);
            Iterator it2 = it;
            if (iP <= 17) {
                int i22 = iArr[i18 + 2];
                i10 = 1;
                int i23 = i22 & 1048575;
                Map.Entry<?, ?> entry3 = entry;
                if (i23 != i19) {
                    i20 = i23 == 1048575 ? 0 : unsafe.getInt(t3, i23);
                    i19 = i23;
                }
                int i24 = i20;
                i13 = 1 << (i22 >>> 20);
                i11 = i19;
                i12 = i24;
                entry2 = entry3;
            } else {
                Map.Entry<?, ?> entry4 = entry;
                i10 = 1;
                i11 = i19;
                i12 = i20;
                entry2 = entry4;
                i13 = 0;
            }
            while (entry2 != null && uVar.a(entry2) <= i21) {
                uVar.j(c2Var, entry2);
                entry2 = it2.hasNext() ? (Map.Entry) it2.next() : null;
            }
            int i25 = iQ & 1048575;
            Map.Entry<?, ?> entry5 = entry2;
            int[] iArr2 = iArr;
            long j10 = i25;
            switch (iP) {
                case 0:
                    if (b1Var.p(t3, i18, i11, i12, i13)) {
                        double dG = z1.f2186c.g(t3, j10);
                        m mVar = ((n) c2Var).f2101a;
                        mVar.getClass();
                        mVar.r(i21, Double.doubleToRawLongBits(dG));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (b1Var.p(t3, i18, i11, i12, i13)) {
                        float fH = z1.f2186c.h(t3, j10);
                        m mVar2 = ((n) c2Var).f2101a;
                        mVar2.getClass();
                        mVar2.p(i21, Float.floatToRawIntBits(fH));
                    }
                    b1Var = this;
                    break;
                case 2:
                    if (b1Var.p(t3, i18, i11, i12, i13)) {
                        ((n) c2Var).f2101a.E(i21, unsafe.getLong(t3, j10));
                    }
                    b1Var = this;
                    break;
                case 3:
                    if (b1Var.p(t3, i18, i11, i12, i13)) {
                        ((n) c2Var).f2101a.E(i21, unsafe.getLong(t3, j10));
                    }
                    b1Var = this;
                    break;
                case 4:
                    if (b1Var.p(t3, i18, i11, i12, i13)) {
                        ((n) c2Var).f2101a.t(i21, unsafe.getInt(t3, j10));
                    }
                    b1Var = this;
                    break;
                case 5:
                    if (b1Var.p(t3, i18, i11, i12, i13)) {
                        ((n) c2Var).f2101a.r(i21, unsafe.getLong(t3, j10));
                    }
                    b1Var = this;
                    break;
                case 6:
                    if (b1Var.p(t3, i18, i11, i12, i13)) {
                        ((n) c2Var).f2101a.p(i21, unsafe.getInt(t3, j10));
                    }
                    b1Var = this;
                    break;
                case 7:
                    if (b1Var.p(t3, i18, i11, i12, i13)) {
                        ((n) c2Var).f2101a.l(i21, z1.f2186c.d(t3, j10));
                    }
                    b1Var = this;
                    break;
                case 8:
                    if (b1Var.p(t3, i18, i11, i12, i13)) {
                        Object object = unsafe.getObject(t3, j10);
                        if (object instanceof String) {
                            ((n) c2Var).f2101a.z(i21, (String) object);
                        } else {
                            ((n) c2Var).f2101a.n(i21, (j) object);
                        }
                    }
                    b1Var = this;
                    break;
                case 9:
                    if (b1Var.p(t3, i18, i11, i12, i13)) {
                        ((n) c2Var).f2101a.v(i21, (MessageLite) unsafe.getObject(t3, j10), b1Var.m(i18));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (b1Var.p(t3, i18, i11, i12, i13)) {
                        ((n) c2Var).f2101a.n(i21, (j) unsafe.getObject(t3, j10));
                    }
                    b1Var = this;
                    break;
                case 11:
                    if (b1Var.p(t3, i18, i11, i12, i13)) {
                        ((n) c2Var).f2101a.C(i21, unsafe.getInt(t3, j10));
                    }
                    b1Var = this;
                    break;
                case 12:
                    if (b1Var.p(t3, i18, i11, i12, i13)) {
                        ((n) c2Var).f2101a.t(i21, unsafe.getInt(t3, j10));
                    }
                    b1Var = this;
                    break;
                case 13:
                    if (b1Var.p(t3, i18, i11, i12, i13)) {
                        ((n) c2Var).f2101a.p(i21, unsafe.getInt(t3, j10));
                    }
                    b1Var = this;
                    break;
                case 14:
                    if (b1Var.p(t3, i18, i11, i12, i13)) {
                        ((n) c2Var).f2101a.r(i21, unsafe.getLong(t3, j10));
                    }
                    b1Var = this;
                    break;
                case 15:
                    if (b1Var.p(t3, i18, i11, i12, i13)) {
                        int i26 = unsafe.getInt(t3, j10);
                        ((n) c2Var).f2101a.C(i21, (i26 >> 31) ^ (i26 << 1));
                    }
                    b1Var = this;
                    break;
                case 16:
                    if (b1Var.p(t3, i18, i11, i12, i13)) {
                        long j11 = unsafe.getLong(t3, j10);
                        ((n) c2Var).f2101a.E(i21, (j11 << 1) ^ (j11 >> 63));
                    }
                    b1Var = this;
                    break;
                case 17:
                    if (b1Var.p(t3, i18, i11, i12, i13)) {
                        ((n) c2Var).a(i21, unsafe.getObject(t3, j10), b1Var.m(i18));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    i14 = i11;
                    i15 = i12;
                    p1.p(iArr2[i18], (List) unsafe.getObject(t3, j10), c2Var, false);
                    i11 = i14;
                    i12 = i15;
                    break;
                case 19:
                    i14 = i11;
                    i15 = i12;
                    p1.t(iArr2[i18], (List) unsafe.getObject(t3, j10), c2Var, false);
                    i11 = i14;
                    i12 = i15;
                    break;
                case 20:
                    i14 = i11;
                    i15 = i12;
                    p1.w(iArr2[i18], (List) unsafe.getObject(t3, j10), c2Var, false);
                    i11 = i14;
                    i12 = i15;
                    break;
                case 21:
                    i14 = i11;
                    i15 = i12;
                    p1.E(iArr2[i18], (List) unsafe.getObject(t3, j10), c2Var, false);
                    i11 = i14;
                    i12 = i15;
                    break;
                case 22:
                    i14 = i11;
                    i15 = i12;
                    p1.v(iArr2[i18], (List) unsafe.getObject(t3, j10), c2Var, false);
                    i11 = i14;
                    i12 = i15;
                    break;
                case 23:
                    i14 = i11;
                    i15 = i12;
                    p1.s(iArr2[i18], (List) unsafe.getObject(t3, j10), c2Var, false);
                    i11 = i14;
                    i12 = i15;
                    break;
                case 24:
                    i14 = i11;
                    i15 = i12;
                    p1.r(iArr2[i18], (List) unsafe.getObject(t3, j10), c2Var, false);
                    i11 = i14;
                    i12 = i15;
                    break;
                case 25:
                    i14 = i11;
                    i15 = i12;
                    p1.n(iArr2[i18], (List) unsafe.getObject(t3, j10), c2Var, false);
                    i11 = i14;
                    i12 = i15;
                    break;
                case 26:
                    i16 = i11;
                    i17 = i12;
                    p1.C(iArr2[i18], (List) unsafe.getObject(t3, j10), c2Var);
                    i11 = i16;
                    i12 = i17;
                    break;
                case 27:
                    i16 = i11;
                    i17 = i12;
                    p1.x(iArr2[i18], (List) unsafe.getObject(t3, j10), c2Var, b1Var.m(i18));
                    i11 = i16;
                    i12 = i17;
                    break;
                case 28:
                    i16 = i11;
                    i17 = i12;
                    p1.o(iArr2[i18], (List) unsafe.getObject(t3, j10), c2Var);
                    i11 = i16;
                    i12 = i17;
                    break;
                case 29:
                    i14 = i11;
                    i15 = i12;
                    z10 = false;
                    p1.D(iArr2[i18], (List) unsafe.getObject(t3, j10), c2Var, false);
                    i11 = i14;
                    i12 = i15;
                    break;
                case 30:
                    i14 = i11;
                    i15 = i12;
                    z10 = false;
                    p1.q(iArr2[i18], (List) unsafe.getObject(t3, j10), c2Var, false);
                    i11 = i14;
                    i12 = i15;
                    break;
                case 31:
                    i14 = i11;
                    i15 = i12;
                    z10 = false;
                    p1.y(iArr2[i18], (List) unsafe.getObject(t3, j10), c2Var, false);
                    i11 = i14;
                    i12 = i15;
                    break;
                case 32:
                    i14 = i11;
                    i15 = i12;
                    z10 = false;
                    p1.z(iArr2[i18], (List) unsafe.getObject(t3, j10), c2Var, false);
                    i11 = i14;
                    i12 = i15;
                    break;
                case 33:
                    i14 = i11;
                    i15 = i12;
                    z10 = false;
                    p1.A(iArr2[i18], (List) unsafe.getObject(t3, j10), c2Var, false);
                    i11 = i14;
                    i12 = i15;
                    break;
                case 34:
                    i14 = i11;
                    i15 = i12;
                    z10 = false;
                    p1.B(iArr2[i18], (List) unsafe.getObject(t3, j10), c2Var, false);
                    i11 = i14;
                    i12 = i15;
                    break;
                case 35:
                    i16 = i11;
                    i17 = i12;
                    p1.p(iArr2[i18], (List) unsafe.getObject(t3, j10), c2Var, i10 == true ? 1 : 0);
                    i11 = i16;
                    i12 = i17;
                    break;
                case 36:
                    i16 = i11;
                    i17 = i12;
                    p1.t(iArr2[i18], (List) unsafe.getObject(t3, j10), c2Var, i10 == true ? 1 : 0);
                    i11 = i16;
                    i12 = i17;
                    break;
                case 37:
                    i16 = i11;
                    i17 = i12;
                    p1.w(iArr2[i18], (List) unsafe.getObject(t3, j10), c2Var, i10 == true ? 1 : 0);
                    i11 = i16;
                    i12 = i17;
                    break;
                case 38:
                    i16 = i11;
                    i17 = i12;
                    p1.E(iArr2[i18], (List) unsafe.getObject(t3, j10), c2Var, i10 == true ? 1 : 0);
                    i11 = i16;
                    i12 = i17;
                    break;
                case 39:
                    i16 = i11;
                    i17 = i12;
                    p1.v(iArr2[i18], (List) unsafe.getObject(t3, j10), c2Var, i10 == true ? 1 : 0);
                    i11 = i16;
                    i12 = i17;
                    break;
                case 40:
                    i16 = i11;
                    i17 = i12;
                    p1.s(iArr2[i18], (List) unsafe.getObject(t3, j10), c2Var, i10 == true ? 1 : 0);
                    i11 = i16;
                    i12 = i17;
                    break;
                case 41:
                    i16 = i11;
                    i17 = i12;
                    p1.r(iArr2[i18], (List) unsafe.getObject(t3, j10), c2Var, i10 == true ? 1 : 0);
                    i11 = i16;
                    i12 = i17;
                    break;
                case 42:
                    i16 = i11;
                    i17 = i12;
                    p1.n(iArr2[i18], (List) unsafe.getObject(t3, j10), c2Var, i10 == true ? 1 : 0);
                    i11 = i16;
                    i12 = i17;
                    break;
                case EACTags.DATE_OF_BIRTH /* 43 */:
                    i16 = i11;
                    i17 = i12;
                    p1.D(iArr2[i18], (List) unsafe.getObject(t3, j10), c2Var, i10 == true ? 1 : 0);
                    i11 = i16;
                    i12 = i17;
                    break;
                case 44:
                    i16 = i11;
                    i17 = i12;
                    p1.q(iArr2[i18], (List) unsafe.getObject(t3, j10), c2Var, i10 == true ? 1 : 0);
                    i11 = i16;
                    i12 = i17;
                    break;
                case 45:
                    i16 = i11;
                    i17 = i12;
                    p1.y(iArr2[i18], (List) unsafe.getObject(t3, j10), c2Var, i10 == true ? 1 : 0);
                    i11 = i16;
                    i12 = i17;
                    break;
                case 46:
                    i16 = i11;
                    i17 = i12;
                    p1.z(iArr2[i18], (List) unsafe.getObject(t3, j10), c2Var, i10 == true ? 1 : 0);
                    i11 = i16;
                    i12 = i17;
                    break;
                case EACTags.PIN_USAGE_POLICY /* 47 */:
                    i16 = i11;
                    i17 = i12;
                    p1.A(iArr2[i18], (List) unsafe.getObject(t3, j10), c2Var, i10 == true ? 1 : 0);
                    i11 = i16;
                    i12 = i17;
                    break;
                case 48:
                    i16 = i11;
                    i17 = i12;
                    p1.B(iArr2[i18], (List) unsafe.getObject(t3, j10), c2Var, true);
                    i11 = i16;
                    i12 = i17;
                    break;
                case 49:
                    i16 = i11;
                    i17 = i12;
                    p1.u(iArr2[i18], (List) unsafe.getObject(t3, j10), c2Var, b1Var.m(i18));
                    i11 = i16;
                    i12 = i17;
                    break;
                case 50:
                    Object object2 = unsafe.getObject(t3, j10);
                    if (object2 != null) {
                        Object objL = b1Var.l(i18);
                        r0 r0Var = b1Var.f1970o;
                        p0.a<?, ?> aVarForMapMetadata = r0Var.forMapMetadata(objL);
                        q0 q0VarForMapData = r0Var.forMapData(object2);
                        m mVar3 = ((n) c2Var).f2101a;
                        mVar3.getClass();
                        for (Map.Entry entry6 : q0VarForMapData.entrySet()) {
                            mVar3.B(i21, 2);
                            int i27 = i11;
                            mVar3.D(p0.a(aVarForMapMetadata, entry6.getKey(), entry6.getValue()));
                            Object key = entry6.getKey();
                            Object value = entry6.getValue();
                            x.r(mVar3, aVarForMapMetadata.f2124a, i10, key);
                            x.r(mVar3, aVarForMapMetadata.f2125b, 2, value);
                            i11 = i27;
                            i12 = i12;
                            i10 = 1;
                        }
                    }
                    i16 = i11;
                    i17 = i12;
                    i11 = i16;
                    i12 = i17;
                    break;
                case EACTags.TRANSACTION_DATE /* 51 */:
                    if (b1Var.r(t3, i21, i18)) {
                        double dDoubleValue = ((Double) z1.f2186c.k(t3, j10)).doubleValue();
                        m mVar4 = ((n) c2Var).f2101a;
                        mVar4.getClass();
                        mVar4.r(i21, Double.doubleToRawLongBits(dDoubleValue));
                    }
                    break;
                case 52:
                    if (b1Var.r(t3, i21, i18)) {
                        float fFloatValue = ((Float) z1.f2186c.k(t3, j10)).floatValue();
                        m mVar5 = ((n) c2Var).f2101a;
                        mVar5.getClass();
                        mVar5.p(i21, Float.floatToRawIntBits(fFloatValue));
                    }
                    break;
                case EACTags.SEX /* 53 */:
                    if (b1Var.r(t3, i21, i18)) {
                        ((n) c2Var).f2101a.E(i21, A(t3, j10));
                    }
                    break;
                case EACTags.CURRENCY_EXPONENT /* 54 */:
                    if (b1Var.r(t3, i21, i18)) {
                        ((n) c2Var).f2101a.E(i21, A(t3, j10));
                    }
                    break;
                case 55:
                    if (b1Var.r(t3, i21, i18)) {
                        ((n) c2Var).f2101a.t(i21, z(t3, j10));
                    }
                    break;
                case 56:
                    if (b1Var.r(t3, i21, i18)) {
                        ((n) c2Var).f2101a.r(i21, A(t3, j10));
                    }
                    break;
                case 57:
                    if (b1Var.r(t3, i21, i18)) {
                        ((n) c2Var).f2101a.p(i21, z(t3, j10));
                    }
                    break;
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    if (b1Var.r(t3, i21, i18)) {
                        ((n) c2Var).f2101a.l(i21, ((Boolean) z1.f2186c.k(t3, j10)).booleanValue());
                    }
                    break;
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (b1Var.r(t3, i21, i18)) {
                        Object object3 = unsafe.getObject(t3, j10);
                        if (object3 instanceof String) {
                            ((n) c2Var).f2101a.z(i21, (String) object3);
                        } else {
                            ((n) c2Var).f2101a.n(i21, (j) object3);
                        }
                    }
                    break;
                case 60:
                    if (b1Var.r(t3, i21, i18)) {
                        ((n) c2Var).f2101a.v(i21, (MessageLite) unsafe.getObject(t3, j10), b1Var.m(i18));
                    }
                    break;
                case 61:
                    if (b1Var.r(t3, i21, i18)) {
                        ((n) c2Var).f2101a.n(i21, (j) unsafe.getObject(t3, j10));
                    }
                    break;
                case 62:
                    if (b1Var.r(t3, i21, i18)) {
                        ((n) c2Var).f2101a.C(i21, z(t3, j10));
                    }
                    break;
                case 63:
                    if (b1Var.r(t3, i21, i18)) {
                        ((n) c2Var).f2101a.t(i21, z(t3, j10));
                    }
                    break;
                case 64:
                    if (b1Var.r(t3, i21, i18)) {
                        ((n) c2Var).f2101a.p(i21, z(t3, j10));
                    }
                    break;
                case EACTags.ELEMENT_LIST /* 65 */:
                    if (b1Var.r(t3, i21, i18)) {
                        ((n) c2Var).f2101a.r(i21, A(t3, j10));
                    }
                    break;
                case EACTags.ADDRESS /* 66 */:
                    if (b1Var.r(t3, i21, i18)) {
                        int iZ = z(t3, j10);
                        ((n) c2Var).f2101a.C(i21, (iZ >> 31) ^ (iZ << 1));
                    }
                    break;
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (b1Var.r(t3, i21, i18)) {
                        long jA = A(t3, j10);
                        ((n) c2Var).f2101a.E(i21, (jA << (i10 == true ? 1L : 0L)) ^ (jA >> 63));
                    }
                    break;
                case 68:
                    if (b1Var.r(t3, i21, i18)) {
                        ((n) c2Var).a(i21, unsafe.getObject(t3, j10), b1Var.m(i18));
                    }
                    break;
            }
            i18 += 3;
            i20 = i12;
            iArr = iArr2;
            it = it2;
            i19 = i11;
            entry = entry5;
        }
        Iterator it3 = it;
        while (entry != null) {
            uVar.j(c2Var, entry);
            entry = it3.hasNext() ? (Map.Entry) it3.next() : null;
        }
        w1<?, ?> w1Var = b1Var.f1968m;
        w1Var.r(w1Var.g(t3), c2Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0357  */
    @Override // androidx.datastore.preferences.protobuf.o1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(AbstractMessageLite abstractMessageLite) {
        int i10;
        int iG;
        int iG2;
        int iG3;
        int i11;
        int iG4;
        int i12;
        int iG5;
        int iG6;
        int iG7;
        int serializedSize;
        int iH;
        int iG8;
        int iC;
        int iB;
        int iG9;
        int serializedSize2;
        int iC2;
        int size;
        int i13;
        int iG10;
        int iG11;
        int iG12;
        int size2;
        int iG13;
        int iH2;
        int serializedSize3;
        int iG14;
        int iG15;
        int i14;
        b1<T> b1Var = this;
        T t3 = abstractMessageLite;
        Unsafe unsafe = f1955q;
        int i15 = 0;
        int i16 = 0;
        int iB2 = 0;
        int i17 = 1048575;
        while (true) {
            int[] iArr = b1Var.f1956a;
            if (i15 >= iArr.length) {
                w1<?, ?> w1Var = b1Var.f1968m;
                int iH3 = w1Var.h(w1Var.g(t3)) + iB2;
                return b1Var.f1961f ? b1Var.f1969n.c(t3).i() + iH3 : iH3;
            }
            int iQ = b1Var.Q(i15);
            int iP = P(iQ);
            int i18 = iArr[i15];
            int i19 = iArr[i15 + 2];
            int i20 = i19 & 1048575;
            if (iP <= 17) {
                if (i20 != i17) {
                    i16 = i20 == 1048575 ? 0 : unsafe.getInt(t3, i20);
                    i17 = i20;
                }
                i10 = 1 << (i19 >>> 20);
            } else {
                i10 = 0;
            }
            long j10 = iQ & 1048575;
            if (iP >= y.f2176b.f2180a) {
                int i21 = y.f2177c.f2180a;
            }
            switch (iP) {
                case 0:
                    if (b1Var.p(t3, i15, i17, i16, i10)) {
                        iG = m.g(i18);
                        iC2 = iG + 8;
                        iB2 += iC2;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (b1Var.p(t3, i15, i17, i16, i10)) {
                        iG2 = m.g(i18);
                        iG6 = iG2 + 4;
                        iB2 += iG6;
                    }
                    b1Var = this;
                    t3 = abstractMessageLite;
                    break;
                case 2:
                    if (b1Var.p(t3, i15, i17, i16, i10)) {
                        long j11 = unsafe.getLong(t3, j10);
                        iG3 = m.g(i18);
                        i11 = m.i(j11);
                        iB2 += i11 + iG3;
                    }
                    b1Var = this;
                    break;
                case 3:
                    if (b1Var.p(t3, i15, i17, i16, i10)) {
                        long j12 = unsafe.getLong(t3, j10);
                        iG3 = m.g(i18);
                        i11 = m.i(j12);
                        iB2 += i11 + iG3;
                    }
                    b1Var = this;
                    break;
                case 4:
                    if (b1Var.p(t3, i15, i17, i16, i10)) {
                        int i22 = unsafe.getInt(t3, j10);
                        iG4 = m.g(i18);
                        i12 = m.i(i22);
                        iB = i12 + iG4;
                        iB2 += iB;
                    }
                    b1Var = this;
                    break;
                case 5:
                    if (b1Var.p(t3, i15, i17, i16, i10)) {
                        iG5 = m.g(i18);
                        iG6 = iG5 + 8;
                        iB2 += iG6;
                    }
                    b1Var = this;
                    t3 = abstractMessageLite;
                    break;
                case 6:
                    if (b1Var.p(t3, i15, i17, i16, i10)) {
                        iG2 = m.g(i18);
                        iG6 = iG2 + 4;
                        iB2 += iG6;
                    }
                    b1Var = this;
                    t3 = abstractMessageLite;
                    break;
                case 7:
                    if (b1Var.p(t3, i15, i17, i16, i10)) {
                        iG6 = m.g(i18) + 1;
                        iB2 += iG6;
                    }
                    b1Var = this;
                    t3 = abstractMessageLite;
                    break;
                case 8:
                    if (b1Var.p(t3, i15, i17, i16, i10)) {
                        Object object = unsafe.getObject(t3, j10);
                        iB2 = (object instanceof j ? m.b(i18, (j) object) : m.f((String) object) + m.g(i18)) + iB2;
                    }
                    b1Var = this;
                    break;
                case 9:
                    if (!b1Var.p(t3, i15, i17, i16, i10)) {
                        break;
                    } else {
                        Object object2 = unsafe.getObject(t3, j10);
                        o1 o1VarM = b1Var.m(i15);
                        Class<?> cls = p1.f2127a;
                        if (object2 instanceof i0) {
                            iG8 = m.g(i18);
                            iC = m.c((i0) object2);
                            iC2 = iC + iG8;
                            iB2 += iC2;
                            break;
                        } else {
                            iG7 = m.g(i18);
                            serializedSize = ((AbstractMessageLite) ((MessageLite) object2)).getSerializedSize(o1VarM);
                            iH = m.h(serializedSize);
                            iC2 = iH + serializedSize + iG7;
                            iB2 += iC2;
                        }
                    }
                case 10:
                    if (b1Var.p(t3, i15, i17, i16, i10)) {
                        iB = m.b(i18, (j) unsafe.getObject(t3, j10));
                        iB2 += iB;
                    }
                    b1Var = this;
                    break;
                case 11:
                    if (b1Var.p(t3, i15, i17, i16, i10)) {
                        int i23 = unsafe.getInt(t3, j10);
                        iG4 = m.g(i18);
                        i12 = m.h(i23);
                        iB = i12 + iG4;
                        iB2 += iB;
                    }
                    b1Var = this;
                    break;
                case 12:
                    if (b1Var.p(t3, i15, i17, i16, i10)) {
                        int i24 = unsafe.getInt(t3, j10);
                        iG4 = m.g(i18);
                        i12 = m.i(i24);
                        iB = i12 + iG4;
                        iB2 += iB;
                    }
                    b1Var = this;
                    break;
                case 13:
                    if (b1Var.p(t3, i15, i17, i16, i10)) {
                        iG2 = m.g(i18);
                        iG6 = iG2 + 4;
                        iB2 += iG6;
                    }
                    b1Var = this;
                    t3 = abstractMessageLite;
                    break;
                case 14:
                    if (b1Var.p(t3, i15, i17, i16, i10)) {
                        iG5 = m.g(i18);
                        iG6 = iG5 + 8;
                        iB2 += iG6;
                    }
                    b1Var = this;
                    t3 = abstractMessageLite;
                    break;
                case 15:
                    if (b1Var.p(t3, i15, i17, i16, i10)) {
                        int i25 = unsafe.getInt(t3, j10);
                        iG4 = m.g(i18);
                        i12 = m.d(i25);
                        iB = i12 + iG4;
                        iB2 += iB;
                    }
                    b1Var = this;
                    break;
                case 16:
                    if (b1Var.p(t3, i15, i17, i16, i10)) {
                        long j13 = unsafe.getLong(t3, j10);
                        iG3 = m.g(i18);
                        i11 = m.e(j13);
                        iB2 += i11 + iG3;
                    }
                    b1Var = this;
                    break;
                case 17:
                    if (b1Var.p(t3, i15, i17, i16, i10)) {
                        MessageLite messageLite = (MessageLite) unsafe.getObject(t3, j10);
                        o1 o1VarM2 = b1Var.m(i15);
                        iG9 = m.g(i18) * 2;
                        serializedSize2 = ((AbstractMessageLite) messageLite).getSerializedSize(o1VarM2);
                        iC2 = serializedSize2 + iG9;
                        iB2 += iC2;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    iC2 = p1.c(i18, (List) unsafe.getObject(t3, j10));
                    iB2 += iC2;
                    break;
                case 19:
                    iC2 = p1.b(i18, (List) unsafe.getObject(t3, j10));
                    iB2 += iC2;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(t3, j10);
                    Class<?> cls2 = p1.f2127a;
                    iG11 = list.size() == 0 ? 0 : (m.g(i18) * list.size()) + p1.e(list);
                    iB2 += iG11;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(t3, j10);
                    Class<?> cls3 = p1.f2127a;
                    size = list2.size();
                    if (size != 0) {
                        i13 = p1.i(list2);
                        iG10 = m.g(i18);
                        iG11 = (iG10 * size) + i13;
                        iB2 += iG11;
                        break;
                    }
                    iB2 += iG11;
                case 22:
                    List list3 = (List) unsafe.getObject(t3, j10);
                    Class<?> cls4 = p1.f2127a;
                    size = list3.size();
                    if (size != 0) {
                        i13 = p1.d(list3);
                        iG10 = m.g(i18);
                        iG11 = (iG10 * size) + i13;
                        iB2 += iG11;
                        break;
                    }
                    iB2 += iG11;
                case 23:
                    iC2 = p1.c(i18, (List) unsafe.getObject(t3, j10));
                    iB2 += iC2;
                    break;
                case 24:
                    iC2 = p1.b(i18, (List) unsafe.getObject(t3, j10));
                    iB2 += iC2;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(t3, j10);
                    Class<?> cls5 = p1.f2127a;
                    int size3 = list4.size();
                    iB2 += size3 == 0 ? 0 : (m.g(i18) + 1) * size3;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(t3, j10);
                    Class<?> cls6 = p1.f2127a;
                    int size4 = list5.size();
                    if (size4 != 0) {
                        iG11 = m.g(i18) * size4;
                        if (list5 instanceof j0) {
                            j0 j0Var = (j0) list5;
                            for (int i26 = 0; i26 < size4; i26++) {
                                Object objH = j0Var.h();
                                if (objH instanceof j) {
                                    int size5 = ((j) objH).size();
                                    iG11 = m.h(size5) + size5 + iG11;
                                } else {
                                    iG11 = m.f((String) objH) + iG11;
                                }
                            }
                        } else {
                            for (int i27 = 0; i27 < size4; i27++) {
                                Object obj = list5.get(i27);
                                if (obj instanceof j) {
                                    int size6 = ((j) obj).size();
                                    iG11 = m.h(size6) + size6 + iG11;
                                } else {
                                    iG11 = m.f((String) obj) + iG11;
                                }
                            }
                        }
                    }
                    iB2 += iG11;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(t3, j10);
                    o1 o1VarM3 = b1Var.m(i15);
                    Class<?> cls7 = p1.f2127a;
                    int size7 = list6.size();
                    if (size7 == 0) {
                        iG12 = 0;
                    } else {
                        iG12 = m.g(i18) * size7;
                        for (int i28 = 0; i28 < size7; i28++) {
                            Object obj2 = list6.get(i28);
                            if (obj2 instanceof i0) {
                                iG12 = m.c((i0) obj2) + iG12;
                            } else {
                                int serializedSize4 = ((AbstractMessageLite) ((MessageLite) obj2)).getSerializedSize(o1VarM3);
                                iG12 = m.h(serializedSize4) + serializedSize4 + iG12;
                            }
                        }
                    }
                    iB2 += iG12;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(t3, j10);
                    Class<?> cls8 = p1.f2127a;
                    int size8 = list7.size();
                    if (size8 != 0) {
                        iG11 = m.g(i18) * size8;
                        for (int i29 = 0; i29 < list7.size(); i29++) {
                            int size9 = ((j) list7.get(i29)).size();
                            iG11 += m.h(size9) + size9;
                        }
                    }
                    iB2 += iG11;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(t3, j10);
                    Class<?> cls9 = p1.f2127a;
                    size = list8.size();
                    if (size != 0) {
                        i13 = p1.h(list8);
                        iG10 = m.g(i18);
                        iG11 = (iG10 * size) + i13;
                        iB2 += iG11;
                        break;
                    }
                    iB2 += iG11;
                case 30:
                    List list9 = (List) unsafe.getObject(t3, j10);
                    Class<?> cls10 = p1.f2127a;
                    size = list9.size();
                    if (size != 0) {
                        i13 = p1.a(list9);
                        iG10 = m.g(i18);
                        iG11 = (iG10 * size) + i13;
                        iB2 += iG11;
                        break;
                    }
                    iB2 += iG11;
                case 31:
                    iC2 = p1.b(i18, (List) unsafe.getObject(t3, j10));
                    iB2 += iC2;
                    break;
                case 32:
                    iC2 = p1.c(i18, (List) unsafe.getObject(t3, j10));
                    iB2 += iC2;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(t3, j10);
                    Class<?> cls11 = p1.f2127a;
                    size = list10.size();
                    if (size != 0) {
                        i13 = p1.f(list10);
                        iG10 = m.g(i18);
                        iG11 = (iG10 * size) + i13;
                        iB2 += iG11;
                        break;
                    }
                    iB2 += iG11;
                case 34:
                    List list11 = (List) unsafe.getObject(t3, j10);
                    Class<?> cls12 = p1.f2127a;
                    size = list11.size();
                    if (size != 0) {
                        i13 = p1.g(list11);
                        iG10 = m.g(i18);
                        iG11 = (iG10 * size) + i13;
                        iB2 += iG11;
                        break;
                    }
                    iB2 += iG11;
                case 35:
                    List list12 = (List) unsafe.getObject(t3, j10);
                    Class<?> cls13 = p1.f2127a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        iG13 = m.g(i18);
                        iH2 = m.h(size2);
                        iB2 += iH2 + iG13 + size2;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    List list13 = (List) unsafe.getObject(t3, j10);
                    Class<?> cls14 = p1.f2127a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        iG13 = m.g(i18);
                        iH2 = m.h(size2);
                        iB2 += iH2 + iG13 + size2;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    size2 = p1.e((List) unsafe.getObject(t3, j10));
                    if (size2 > 0) {
                        iG13 = m.g(i18);
                        iH2 = m.h(size2);
                        iB2 += iH2 + iG13 + size2;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    size2 = p1.i((List) unsafe.getObject(t3, j10));
                    if (size2 > 0) {
                        iG13 = m.g(i18);
                        iH2 = m.h(size2);
                        iB2 += iH2 + iG13 + size2;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    size2 = p1.d((List) unsafe.getObject(t3, j10));
                    if (size2 > 0) {
                        iG13 = m.g(i18);
                        iH2 = m.h(size2);
                        iB2 += iH2 + iG13 + size2;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    List list14 = (List) unsafe.getObject(t3, j10);
                    Class<?> cls15 = p1.f2127a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        iG13 = m.g(i18);
                        iH2 = m.h(size2);
                        iB2 += iH2 + iG13 + size2;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    List list15 = (List) unsafe.getObject(t3, j10);
                    Class<?> cls16 = p1.f2127a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        iG13 = m.g(i18);
                        iH2 = m.h(size2);
                        iB2 += iH2 + iG13 + size2;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list16 = (List) unsafe.getObject(t3, j10);
                    Class<?> cls17 = p1.f2127a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        iG13 = m.g(i18);
                        iH2 = m.h(size2);
                        iB2 += iH2 + iG13 + size2;
                        break;
                    } else {
                        break;
                    }
                case EACTags.DATE_OF_BIRTH /* 43 */:
                    size2 = p1.h((List) unsafe.getObject(t3, j10));
                    if (size2 > 0) {
                        iG13 = m.g(i18);
                        iH2 = m.h(size2);
                        iB2 += iH2 + iG13 + size2;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    size2 = p1.a((List) unsafe.getObject(t3, j10));
                    if (size2 > 0) {
                        iG13 = m.g(i18);
                        iH2 = m.h(size2);
                        iB2 += iH2 + iG13 + size2;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    List list17 = (List) unsafe.getObject(t3, j10);
                    Class<?> cls18 = p1.f2127a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        iG13 = m.g(i18);
                        iH2 = m.h(size2);
                        iB2 += iH2 + iG13 + size2;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    List list18 = (List) unsafe.getObject(t3, j10);
                    Class<?> cls19 = p1.f2127a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        iG13 = m.g(i18);
                        iH2 = m.h(size2);
                        iB2 += iH2 + iG13 + size2;
                        break;
                    } else {
                        break;
                    }
                case EACTags.PIN_USAGE_POLICY /* 47 */:
                    size2 = p1.f((List) unsafe.getObject(t3, j10));
                    if (size2 > 0) {
                        iG13 = m.g(i18);
                        iH2 = m.h(size2);
                        iB2 += iH2 + iG13 + size2;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    size2 = p1.g((List) unsafe.getObject(t3, j10));
                    if (size2 > 0) {
                        iG13 = m.g(i18);
                        iH2 = m.h(size2);
                        iB2 += iH2 + iG13 + size2;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    List list19 = (List) unsafe.getObject(t3, j10);
                    o1 o1VarM4 = b1Var.m(i15);
                    Class<?> cls20 = p1.f2127a;
                    int size10 = list19.size();
                    if (size10 == 0) {
                        serializedSize3 = 0;
                    } else {
                        serializedSize3 = 0;
                        for (int i30 = 0; i30 < size10; i30++) {
                            serializedSize3 += ((AbstractMessageLite) ((MessageLite) list19.get(i30))).getSerializedSize(o1VarM4) + (m.g(i18) * 2);
                        }
                    }
                    iB2 += serializedSize3;
                    break;
                case 50:
                    iC2 = b1Var.f1970o.getSerializedSize(i18, unsafe.getObject(t3, j10), b1Var.l(i15));
                    iB2 += iC2;
                    break;
                case EACTags.TRANSACTION_DATE /* 51 */:
                    if (b1Var.r(t3, i18, i15)) {
                        iG = m.g(i18);
                        iC2 = iG + 8;
                        iB2 += iC2;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (b1Var.r(t3, i18, i15)) {
                        iG14 = m.g(i18);
                        iC2 = iG14 + 4;
                        iB2 += iC2;
                        break;
                    } else {
                        break;
                    }
                case EACTags.SEX /* 53 */:
                    if (b1Var.r(t3, i18, i15)) {
                        long jA = A(t3, j10);
                        iG15 = m.g(i18);
                        i14 = m.i(jA);
                        iB2 += i14 + iG15;
                        break;
                    } else {
                        break;
                    }
                case EACTags.CURRENCY_EXPONENT /* 54 */:
                    if (b1Var.r(t3, i18, i15)) {
                        long jA2 = A(t3, j10);
                        iG15 = m.g(i18);
                        i14 = m.i(jA2);
                        iB2 += i14 + iG15;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (b1Var.r(t3, i18, i15)) {
                        int iZ = z(t3, j10);
                        iG8 = m.g(i18);
                        iC = m.i(iZ);
                        iC2 = iC + iG8;
                        iB2 += iC2;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (b1Var.r(t3, i18, i15)) {
                        iG = m.g(i18);
                        iC2 = iG + 8;
                        iB2 += iC2;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (b1Var.r(t3, i18, i15)) {
                        iG14 = m.g(i18);
                        iC2 = iG14 + 4;
                        iB2 += iC2;
                        break;
                    } else {
                        break;
                    }
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    if (b1Var.r(t3, i18, i15)) {
                        iC2 = m.g(i18) + 1;
                        iB2 += iC2;
                        break;
                    } else {
                        break;
                    }
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (b1Var.r(t3, i18, i15)) {
                        Object object3 = unsafe.getObject(t3, j10);
                        iB2 = (object3 instanceof j ? m.b(i18, (j) object3) : m.f((String) object3) + m.g(i18)) + iB2;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (!b1Var.r(t3, i18, i15)) {
                        break;
                    } else {
                        Object object4 = unsafe.getObject(t3, j10);
                        o1 o1VarM5 = b1Var.m(i15);
                        Class<?> cls21 = p1.f2127a;
                        if (object4 instanceof i0) {
                            iG8 = m.g(i18);
                            iC = m.c((i0) object4);
                            iC2 = iC + iG8;
                            iB2 += iC2;
                            break;
                        } else {
                            iG7 = m.g(i18);
                            serializedSize = ((AbstractMessageLite) ((MessageLite) object4)).getSerializedSize(o1VarM5);
                            iH = m.h(serializedSize);
                            iC2 = iH + serializedSize + iG7;
                            iB2 += iC2;
                        }
                    }
                case 61:
                    if (b1Var.r(t3, i18, i15)) {
                        iC2 = m.b(i18, (j) unsafe.getObject(t3, j10));
                        iB2 += iC2;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (b1Var.r(t3, i18, i15)) {
                        int iZ2 = z(t3, j10);
                        iG8 = m.g(i18);
                        iC = m.h(iZ2);
                        iC2 = iC + iG8;
                        iB2 += iC2;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (b1Var.r(t3, i18, i15)) {
                        int iZ3 = z(t3, j10);
                        iG8 = m.g(i18);
                        iC = m.i(iZ3);
                        iC2 = iC + iG8;
                        iB2 += iC2;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (b1Var.r(t3, i18, i15)) {
                        iG14 = m.g(i18);
                        iC2 = iG14 + 4;
                        iB2 += iC2;
                        break;
                    } else {
                        break;
                    }
                case EACTags.ELEMENT_LIST /* 65 */:
                    if (b1Var.r(t3, i18, i15)) {
                        iG = m.g(i18);
                        iC2 = iG + 8;
                        iB2 += iC2;
                        break;
                    } else {
                        break;
                    }
                case EACTags.ADDRESS /* 66 */:
                    if (b1Var.r(t3, i18, i15)) {
                        int iZ4 = z(t3, j10);
                        iG8 = m.g(i18);
                        iC = m.d(iZ4);
                        iC2 = iC + iG8;
                        iB2 += iC2;
                        break;
                    } else {
                        break;
                    }
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (b1Var.r(t3, i18, i15)) {
                        long jA3 = A(t3, j10);
                        iG15 = m.g(i18);
                        i14 = m.e(jA3);
                        iB2 += i14 + iG15;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (b1Var.r(t3, i18, i15)) {
                        MessageLite messageLite2 = (MessageLite) unsafe.getObject(t3, j10);
                        o1 o1VarM6 = b1Var.m(i15);
                        iG9 = m.g(i18) * 2;
                        serializedSize2 = ((AbstractMessageLite) messageLite2).getSerializedSize(o1VarM6);
                        iC2 = serializedSize2 + iG9;
                        iB2 += iC2;
                        break;
                    } else {
                        break;
                    }
            }
            i15 += 3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1 A[PHI: r3
      0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0216, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.datastore.preferences.protobuf.o1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(GeneratedMessageLite generatedMessageLite) {
        int i10;
        int iB;
        int i11;
        int[] iArr = this.f1956a;
        int length = iArr.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int iQ = Q(i13);
            int i14 = iArr[i13];
            long j10 = 1048575 & iQ;
            int i15 = 1237;
            int iHashCode = 37;
            switch (P(iQ)) {
                case 0:
                    i10 = i12 * 53;
                    iB = d0.b(Double.doubleToLongBits(z1.f2186c.g(generatedMessageLite, j10)));
                    i12 = iB + i10;
                    break;
                case 1:
                    i10 = i12 * 53;
                    iB = Float.floatToIntBits(z1.f2186c.h(generatedMessageLite, j10));
                    i12 = iB + i10;
                    break;
                case 2:
                    i10 = i12 * 53;
                    iB = d0.b(z1.f2186c.j(generatedMessageLite, j10));
                    i12 = iB + i10;
                    break;
                case 3:
                    i10 = i12 * 53;
                    iB = d0.b(z1.f2186c.j(generatedMessageLite, j10));
                    i12 = iB + i10;
                    break;
                case 4:
                    i10 = i12 * 53;
                    iB = z1.f2186c.i(generatedMessageLite, j10);
                    i12 = iB + i10;
                    break;
                case 5:
                    i10 = i12 * 53;
                    iB = d0.b(z1.f2186c.j(generatedMessageLite, j10));
                    i12 = iB + i10;
                    break;
                case 6:
                    i10 = i12 * 53;
                    iB = z1.f2186c.i(generatedMessageLite, j10);
                    i12 = iB + i10;
                    break;
                case 7:
                    i11 = i12 * 53;
                    boolean zD = z1.f2186c.d(generatedMessageLite, j10);
                    Charset charset = d0.f2005a;
                    if (zD) {
                        i15 = 1231;
                    }
                    i12 = i15 + i11;
                    break;
                case 8:
                    i10 = i12 * 53;
                    iB = ((String) z1.f2186c.k(generatedMessageLite, j10)).hashCode();
                    i12 = iB + i10;
                    break;
                case 9:
                    Object objK = z1.f2186c.k(generatedMessageLite, j10);
                    if (objK != null) {
                        iHashCode = objK.hashCode();
                    }
                    i12 = (i12 * 53) + iHashCode;
                    break;
                case 10:
                    i10 = i12 * 53;
                    iB = z1.f2186c.k(generatedMessageLite, j10).hashCode();
                    i12 = iB + i10;
                    break;
                case 11:
                    i10 = i12 * 53;
                    iB = z1.f2186c.i(generatedMessageLite, j10);
                    i12 = iB + i10;
                    break;
                case 12:
                    i10 = i12 * 53;
                    iB = z1.f2186c.i(generatedMessageLite, j10);
                    i12 = iB + i10;
                    break;
                case 13:
                    i10 = i12 * 53;
                    iB = z1.f2186c.i(generatedMessageLite, j10);
                    i12 = iB + i10;
                    break;
                case 14:
                    i10 = i12 * 53;
                    iB = d0.b(z1.f2186c.j(generatedMessageLite, j10));
                    i12 = iB + i10;
                    break;
                case 15:
                    i10 = i12 * 53;
                    iB = z1.f2186c.i(generatedMessageLite, j10);
                    i12 = iB + i10;
                    break;
                case 16:
                    i10 = i12 * 53;
                    iB = d0.b(z1.f2186c.j(generatedMessageLite, j10));
                    i12 = iB + i10;
                    break;
                case 17:
                    Object objK2 = z1.f2186c.k(generatedMessageLite, j10);
                    if (objK2 != null) {
                        iHashCode = objK2.hashCode();
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
                    iB = z1.f2186c.k(generatedMessageLite, j10).hashCode();
                    i12 = iB + i10;
                    break;
                case 50:
                    i10 = i12 * 53;
                    iB = z1.f2186c.k(generatedMessageLite, j10).hashCode();
                    i12 = iB + i10;
                    break;
                case EACTags.TRANSACTION_DATE /* 51 */:
                    if (r(generatedMessageLite, i14, i13)) {
                        i10 = i12 * 53;
                        iB = d0.b(Double.doubleToLongBits(((Double) z1.f2186c.k(generatedMessageLite, j10)).doubleValue()));
                        i12 = iB + i10;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (r(generatedMessageLite, i14, i13)) {
                        i10 = i12 * 53;
                        iB = Float.floatToIntBits(((Float) z1.f2186c.k(generatedMessageLite, j10)).floatValue());
                        i12 = iB + i10;
                        break;
                    } else {
                        break;
                    }
                case EACTags.SEX /* 53 */:
                    if (r(generatedMessageLite, i14, i13)) {
                        i10 = i12 * 53;
                        iB = d0.b(A(generatedMessageLite, j10));
                        i12 = iB + i10;
                        break;
                    } else {
                        break;
                    }
                case EACTags.CURRENCY_EXPONENT /* 54 */:
                    if (r(generatedMessageLite, i14, i13)) {
                        i10 = i12 * 53;
                        iB = d0.b(A(generatedMessageLite, j10));
                        i12 = iB + i10;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (r(generatedMessageLite, i14, i13)) {
                        i10 = i12 * 53;
                        iB = z(generatedMessageLite, j10);
                        i12 = iB + i10;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (r(generatedMessageLite, i14, i13)) {
                        i10 = i12 * 53;
                        iB = d0.b(A(generatedMessageLite, j10));
                        i12 = iB + i10;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (r(generatedMessageLite, i14, i13)) {
                        i10 = i12 * 53;
                        iB = z(generatedMessageLite, j10);
                        i12 = iB + i10;
                        break;
                    } else {
                        break;
                    }
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    if (r(generatedMessageLite, i14, i13)) {
                        i11 = i12 * 53;
                        boolean zBooleanValue = ((Boolean) z1.f2186c.k(generatedMessageLite, j10)).booleanValue();
                        Charset charset2 = d0.f2005a;
                        if (zBooleanValue) {
                        }
                        i12 = i15 + i11;
                        break;
                    } else {
                        break;
                    }
                    break;
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (r(generatedMessageLite, i14, i13)) {
                        i10 = i12 * 53;
                        iB = ((String) z1.f2186c.k(generatedMessageLite, j10)).hashCode();
                        i12 = iB + i10;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (r(generatedMessageLite, i14, i13)) {
                        i10 = i12 * 53;
                        iB = z1.f2186c.k(generatedMessageLite, j10).hashCode();
                        i12 = iB + i10;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (r(generatedMessageLite, i14, i13)) {
                        i10 = i12 * 53;
                        iB = z1.f2186c.k(generatedMessageLite, j10).hashCode();
                        i12 = iB + i10;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (r(generatedMessageLite, i14, i13)) {
                        i10 = i12 * 53;
                        iB = z(generatedMessageLite, j10);
                        i12 = iB + i10;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (r(generatedMessageLite, i14, i13)) {
                        i10 = i12 * 53;
                        iB = z(generatedMessageLite, j10);
                        i12 = iB + i10;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (r(generatedMessageLite, i14, i13)) {
                        i10 = i12 * 53;
                        iB = z(generatedMessageLite, j10);
                        i12 = iB + i10;
                        break;
                    } else {
                        break;
                    }
                case EACTags.ELEMENT_LIST /* 65 */:
                    if (r(generatedMessageLite, i14, i13)) {
                        i10 = i12 * 53;
                        iB = d0.b(A(generatedMessageLite, j10));
                        i12 = iB + i10;
                        break;
                    } else {
                        break;
                    }
                case EACTags.ADDRESS /* 66 */:
                    if (r(generatedMessageLite, i14, i13)) {
                        i10 = i12 * 53;
                        iB = z(generatedMessageLite, j10);
                        i12 = iB + i10;
                        break;
                    } else {
                        break;
                    }
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (r(generatedMessageLite, i14, i13)) {
                        i10 = i12 * 53;
                        iB = d0.b(A(generatedMessageLite, j10));
                        i12 = iB + i10;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (r(generatedMessageLite, i14, i13)) {
                        i10 = i12 * 53;
                        iB = z1.f2186c.k(generatedMessageLite, j10).hashCode();
                        i12 = iB + i10;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = this.f1968m.g(generatedMessageLite).hashCode() + (i12 * 53);
        if (!this.f1961f) {
            return iHashCode2;
        }
        return this.f1969n.c(generatedMessageLite).f2166a.hashCode() + (iHashCode2 * 53);
    }

    @Override // androidx.datastore.preferences.protobuf.o1
    public final void c(T t3, c2 c2Var) throws IOException {
        c2Var.getClass();
        R(t3, c2Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    @Override // androidx.datastore.preferences.protobuf.o1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2) {
        int[] iArr = this.f1956a;
        int length = iArr.length;
        int i10 = 0;
        while (true) {
            boolean zL = true;
            if (i10 < length) {
                int iQ = Q(i10);
                long j10 = iQ & 1048575;
                switch (P(iQ)) {
                    case 0:
                        if (g(generatedMessageLite, generatedMessageLite2, i10)) {
                            z1.e eVar = z1.f2186c;
                            if (Double.doubleToLongBits(eVar.g(generatedMessageLite, j10)) != Double.doubleToLongBits(eVar.g(generatedMessageLite2, j10))) {
                                zL = false;
                                break;
                            }
                        }
                        break;
                    case 1:
                        if (g(generatedMessageLite, generatedMessageLite2, i10)) {
                            z1.e eVar2 = z1.f2186c;
                            if (Float.floatToIntBits(eVar2.h(generatedMessageLite, j10)) != Float.floatToIntBits(eVar2.h(generatedMessageLite2, j10))) {
                            }
                        }
                        break;
                    case 2:
                        if (g(generatedMessageLite, generatedMessageLite2, i10)) {
                            z1.e eVar3 = z1.f2186c;
                            if (eVar3.j(generatedMessageLite, j10) != eVar3.j(generatedMessageLite2, j10)) {
                            }
                        }
                        break;
                    case 3:
                        if (g(generatedMessageLite, generatedMessageLite2, i10)) {
                            z1.e eVar4 = z1.f2186c;
                            if (eVar4.j(generatedMessageLite, j10) != eVar4.j(generatedMessageLite2, j10)) {
                            }
                        }
                        break;
                    case 4:
                        if (g(generatedMessageLite, generatedMessageLite2, i10)) {
                            z1.e eVar5 = z1.f2186c;
                            if (eVar5.i(generatedMessageLite, j10) != eVar5.i(generatedMessageLite2, j10)) {
                            }
                        }
                        break;
                    case 5:
                        if (g(generatedMessageLite, generatedMessageLite2, i10)) {
                            z1.e eVar6 = z1.f2186c;
                            if (eVar6.j(generatedMessageLite, j10) != eVar6.j(generatedMessageLite2, j10)) {
                            }
                        }
                        break;
                    case 6:
                        if (g(generatedMessageLite, generatedMessageLite2, i10)) {
                            z1.e eVar7 = z1.f2186c;
                            if (eVar7.i(generatedMessageLite, j10) != eVar7.i(generatedMessageLite2, j10)) {
                            }
                        }
                        break;
                    case 7:
                        if (g(generatedMessageLite, generatedMessageLite2, i10)) {
                            z1.e eVar8 = z1.f2186c;
                            if (eVar8.d(generatedMessageLite, j10) != eVar8.d(generatedMessageLite2, j10)) {
                            }
                        }
                        break;
                    case 8:
                        if (g(generatedMessageLite, generatedMessageLite2, i10)) {
                            z1.e eVar9 = z1.f2186c;
                            if (!p1.l(eVar9.k(generatedMessageLite, j10), eVar9.k(generatedMessageLite2, j10))) {
                            }
                        }
                        break;
                    case 9:
                        if (g(generatedMessageLite, generatedMessageLite2, i10)) {
                            z1.e eVar10 = z1.f2186c;
                            if (!p1.l(eVar10.k(generatedMessageLite, j10), eVar10.k(generatedMessageLite2, j10))) {
                            }
                        }
                        break;
                    case 10:
                        if (g(generatedMessageLite, generatedMessageLite2, i10)) {
                            z1.e eVar11 = z1.f2186c;
                            if (!p1.l(eVar11.k(generatedMessageLite, j10), eVar11.k(generatedMessageLite2, j10))) {
                            }
                        }
                        break;
                    case 11:
                        if (g(generatedMessageLite, generatedMessageLite2, i10)) {
                            z1.e eVar12 = z1.f2186c;
                            if (eVar12.i(generatedMessageLite, j10) != eVar12.i(generatedMessageLite2, j10)) {
                            }
                        }
                        break;
                    case 12:
                        if (g(generatedMessageLite, generatedMessageLite2, i10)) {
                            z1.e eVar13 = z1.f2186c;
                            if (eVar13.i(generatedMessageLite, j10) != eVar13.i(generatedMessageLite2, j10)) {
                            }
                        }
                        break;
                    case 13:
                        if (g(generatedMessageLite, generatedMessageLite2, i10)) {
                            z1.e eVar14 = z1.f2186c;
                            if (eVar14.i(generatedMessageLite, j10) != eVar14.i(generatedMessageLite2, j10)) {
                            }
                        }
                        break;
                    case 14:
                        if (g(generatedMessageLite, generatedMessageLite2, i10)) {
                            z1.e eVar15 = z1.f2186c;
                            if (eVar15.j(generatedMessageLite, j10) != eVar15.j(generatedMessageLite2, j10)) {
                            }
                        }
                        break;
                    case 15:
                        if (g(generatedMessageLite, generatedMessageLite2, i10)) {
                            z1.e eVar16 = z1.f2186c;
                            if (eVar16.i(generatedMessageLite, j10) != eVar16.i(generatedMessageLite2, j10)) {
                            }
                        }
                        break;
                    case 16:
                        if (g(generatedMessageLite, generatedMessageLite2, i10)) {
                            z1.e eVar17 = z1.f2186c;
                            if (eVar17.j(generatedMessageLite, j10) != eVar17.j(generatedMessageLite2, j10)) {
                            }
                        }
                        break;
                    case 17:
                        if (g(generatedMessageLite, generatedMessageLite2, i10)) {
                            z1.e eVar18 = z1.f2186c;
                            if (!p1.l(eVar18.k(generatedMessageLite, j10), eVar18.k(generatedMessageLite2, j10))) {
                            }
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
                        z1.e eVar19 = z1.f2186c;
                        zL = p1.l(eVar19.k(generatedMessageLite, j10), eVar19.k(generatedMessageLite2, j10));
                        break;
                    case 50:
                        z1.e eVar20 = z1.f2186c;
                        zL = p1.l(eVar20.k(generatedMessageLite, j10), eVar20.k(generatedMessageLite2, j10));
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
                        long j11 = iArr[i10 + 2] & 1048575;
                        z1.e eVar21 = z1.f2186c;
                        if (eVar21.i(generatedMessageLite, j11) != eVar21.i(generatedMessageLite2, j11) || !p1.l(eVar21.k(generatedMessageLite, j10), eVar21.k(generatedMessageLite2, j10))) {
                        }
                        break;
                }
                if (zL) {
                    i10 += 3;
                }
            } else {
                w1<?, ?> w1Var = this.f1968m;
                if (w1Var.g(generatedMessageLite).equals(w1Var.g(generatedMessageLite2))) {
                    if (!this.f1961f) {
                        return true;
                    }
                    u<?> uVar = this.f1969n;
                    return uVar.c(generatedMessageLite).equals(uVar.c(generatedMessageLite2));
                }
            }
        }
        return false;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // androidx.datastore.preferences.protobuf.o1
    public final void e(java.lang.Object r21, androidx.datastore.preferences.protobuf.l r22, androidx.datastore.preferences.protobuf.t r23) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 2362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.b1.e(java.lang.Object, androidx.datastore.preferences.protobuf.l, androidx.datastore.preferences.protobuf.t):void");
    }

    @Override // androidx.datastore.preferences.protobuf.o1
    public final void f(T t3, byte[] bArr, int i10, int i11, d.a aVar) throws IOException {
        C(t3, bArr, i10, i11, 0, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean g(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2, int i10) {
        return o(generatedMessageLite, i10) == o(generatedMessageLite2, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [androidx.datastore.preferences.protobuf.o1] */
    /* JADX WARN: Type inference failed for: r2v6, types: [androidx.datastore.preferences.protobuf.o1] */
    /* JADX WARN: Type inference failed for: r2v9, types: [androidx.datastore.preferences.protobuf.o1] */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25, types: [androidx.datastore.preferences.protobuf.o1] */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    @Override // androidx.datastore.preferences.protobuf.o1
    public final boolean isInitialized(T t3) {
        int i10;
        int i11;
        int i12;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        loop0: while (true) {
            if (i15 < this.f1964i) {
                int i16 = this.f1963h[i15];
                int[] iArr = this.f1956a;
                int i17 = iArr[i16];
                int iQ = Q(i16);
                int i18 = iArr[i16 + 2];
                int i19 = i18 & 1048575;
                int i20 = 1 << (i18 >>> 20);
                if (i19 != i13) {
                    if (i19 != 1048575) {
                        i14 = f1955q.getInt(t3, i19);
                    }
                    i11 = i16;
                    i12 = i14;
                    i10 = i19;
                } else {
                    int i21 = i14;
                    i10 = i13;
                    i11 = i16;
                    i12 = i21;
                }
                if ((268435456 & iQ) != 0 && !p(t3, i11, i10, i12, i20)) {
                    break;
                }
                int iP = P(iQ);
                if (iP == 9 || iP == 17) {
                    if (p(t3, i11, i10, i12, i20)) {
                        if (!m(i11).isInitialized(z1.f2186c.k(t3, iQ & 1048575))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                    i15++;
                    i13 = i10;
                    i14 = i12;
                } else {
                    if (iP != 27) {
                        if (iP == 60 || iP == 68) {
                            if (r(t3, i17, i11)) {
                                if (!m(i11).isInitialized(z1.f2186c.k(t3, iQ & 1048575))) {
                                    break;
                                }
                            } else {
                                continue;
                            }
                            i15++;
                            i13 = i10;
                            i14 = i12;
                        } else if (iP != 49) {
                            if (iP != 50) {
                                continue;
                            } else {
                                Object objK = z1.f2186c.k(t3, iQ & 1048575);
                                r0 r0Var = this.f1970o;
                                q0 q0VarForMapData = r0Var.forMapData(objK);
                                if (!q0VarForMapData.isEmpty() && r0Var.forMapMetadata(l(i11)).f2125b.f1976a == b2.b.MESSAGE) {
                                    ?? A = 0;
                                    for (Object obj : q0VarForMapData.values()) {
                                        A = A;
                                        if (A == 0) {
                                            A = k1.f2075c.a(obj.getClass());
                                        }
                                        if (!A.isInitialized(obj)) {
                                            break loop0;
                                        }
                                    }
                                }
                            }
                            i15++;
                            i13 = i10;
                            i14 = i12;
                        }
                    }
                    List list = (List) z1.f2186c.k(t3, iQ & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        ?? M = m(i11);
                        for (int i22 = 0; i22 < list.size(); i22++) {
                            if (!M.isInitialized(list.get(i22))) {
                                break loop0;
                            }
                        }
                    }
                    i15++;
                    i13 = i10;
                    i14 = i12;
                }
            } else if (!this.f1961f || this.f1969n.c(t3).j()) {
                return true;
            }
        }
        return false;
    }

    public final <UT, UB> UB j(Object obj, int i10, UB ub2, w1<UT, UB> w1Var, Object obj2) {
        d0.e eVarK;
        int i11 = this.f1956a[i10];
        Object objK = z1.f2186c.k(obj, Q(i10) & 1048575);
        if (objK == null || (eVarK = k(i10)) == null) {
            return ub2;
        }
        r0 r0Var = this.f1970o;
        q0 q0VarForMutableMapData = r0Var.forMutableMapData(objK);
        p0.a<?, ?> aVarForMapMetadata = r0Var.forMapMetadata(l(i10));
        Iterator it = q0VarForMutableMapData.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!eVarK.isInRange(((Integer) entry.getValue()).intValue())) {
                if (ub2 == null) {
                    ub2 = (UB) w1Var.f(obj2);
                }
                int iA = p0.a(aVarForMapMetadata, entry.getKey(), entry.getValue());
                byte[] bArr = new byte[iA];
                Logger logger = m.f2085b;
                m.b bVar = new m.b(bArr, iA);
                try {
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    x.r(bVar, aVarForMapMetadata.f2124a, 1, key);
                    x.r(bVar, aVarForMapMetadata.f2125b, 2, value);
                    if (bVar.G() != 0) {
                        throw new IllegalStateException("Did not write as much data as expected.");
                    }
                    w1Var.d(ub2, i11, new j.f(bArr));
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return ub2;
    }

    public final d0.e k(int i10) {
        return (d0.e) this.f1957b[a1.b(i10, 3, 2, 1)];
    }

    public final Object l(int i10) {
        return this.f1957b[(i10 / 3) * 2];
    }

    public final o1 m(int i10) {
        int i11 = (i10 / 3) * 2;
        Object[] objArr = this.f1957b;
        o1 o1Var = (o1) objArr[i11];
        if (o1Var != null) {
            return o1Var;
        }
        o1<T> o1VarA = k1.f2075c.a((Class) objArr[i11 + 1]);
        objArr[i11] = o1VarA;
        return o1VarA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    @Override // androidx.datastore.preferences.protobuf.o1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void makeImmutable(T t3) {
        if (q(t3)) {
            if (t3 instanceof GeneratedMessageLite) {
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) t3;
                generatedMessageLite.clearMemoizedSerializedSize();
                generatedMessageLite.clearMemoizedHashCode();
                generatedMessageLite.markImmutable();
            }
            int[] iArr = this.f1956a;
            int length = iArr.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int iQ = Q(i10);
                long j10 = 1048575 & iQ;
                int iP = P(iQ);
                if (iP != 9) {
                    if (iP != 60 && iP != 68) {
                        switch (iP) {
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
                                this.f1967l.b(t3, j10);
                                break;
                            case 50:
                                Unsafe unsafe = f1955q;
                                Object object = unsafe.getObject(t3, j10);
                                if (object != null) {
                                    unsafe.putObject(t3, j10, this.f1970o.toImmutable(object));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (r(t3, iArr[i10], i10)) {
                        m(i10).makeImmutable(f1955q.getObject(t3, j10));
                    }
                } else if (o(t3, i10)) {
                    m(i10).makeImmutable(f1955q.getObject(t3, j10));
                }
            }
            this.f1968m.j(t3);
            if (this.f1961f) {
                this.f1969n.f(t3);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // androidx.datastore.preferences.protobuf.o1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mergeFrom(T t3, T t10) {
        T t11;
        h(t3);
        t10.getClass();
        int i10 = 0;
        while (true) {
            int[] iArr = this.f1956a;
            if (i10 >= iArr.length) {
                T t12 = t3;
                Class<?> cls = p1.f2127a;
                w1<?, ?> w1Var = this.f1968m;
                w1Var.o(t12, w1Var.k(w1Var.g(t12), w1Var.g(t10)));
                if (this.f1961f) {
                    u<?> uVar = this.f1969n;
                    x<T> xVarC = uVar.c(t10);
                    if (xVarC.f2166a.isEmpty()) {
                        return;
                    }
                    uVar.d(t12).n(xVarC);
                    return;
                }
                return;
            }
            int iQ = Q(i10);
            long j10 = 1048575 & iQ;
            int i11 = iArr[i10];
            switch (P(iQ)) {
                case 0:
                    if (!o(t10, i10)) {
                        t11 = t3;
                        break;
                    } else {
                        z1.e eVar = z1.f2186c;
                        t11 = t3;
                        eVar.o(t11, j10, eVar.g(t10, j10));
                        K(t11, i10);
                        break;
                    }
                case 1:
                    if (o(t10, i10)) {
                        z1.e eVar2 = z1.f2186c;
                        eVar2.p(t3, j10, eVar2.h(t10, j10));
                        K(t3, i10);
                    }
                    t11 = t3;
                    break;
                case 2:
                    if (o(t10, i10)) {
                        z1.o(t3, j10, z1.f2186c.j(t10, j10));
                        K(t3, i10);
                    }
                    t11 = t3;
                    break;
                case 3:
                    if (o(t10, i10)) {
                        z1.o(t3, j10, z1.f2186c.j(t10, j10));
                        K(t3, i10);
                    }
                    t11 = t3;
                    break;
                case 4:
                    if (o(t10, i10)) {
                        z1.n(t3, j10, z1.f2186c.i(t10, j10));
                        K(t3, i10);
                    }
                    t11 = t3;
                    break;
                case 5:
                    if (o(t10, i10)) {
                        z1.o(t3, j10, z1.f2186c.j(t10, j10));
                        K(t3, i10);
                    }
                    t11 = t3;
                    break;
                case 6:
                    if (o(t10, i10)) {
                        z1.n(t3, j10, z1.f2186c.i(t10, j10));
                        K(t3, i10);
                    }
                    t11 = t3;
                    break;
                case 7:
                    if (o(t10, i10)) {
                        z1.e eVar3 = z1.f2186c;
                        eVar3.m(t3, j10, eVar3.d(t10, j10));
                        K(t3, i10);
                    }
                    t11 = t3;
                    break;
                case 8:
                    if (o(t10, i10)) {
                        z1.p(t3, j10, z1.f2186c.k(t10, j10));
                        K(t3, i10);
                    }
                    t11 = t3;
                    break;
                case 9:
                    t(t3, t10, i10);
                    t11 = t3;
                    break;
                case 10:
                    if (o(t10, i10)) {
                        z1.p(t3, j10, z1.f2186c.k(t10, j10));
                        K(t3, i10);
                    }
                    t11 = t3;
                    break;
                case 11:
                    if (o(t10, i10)) {
                        z1.n(t3, j10, z1.f2186c.i(t10, j10));
                        K(t3, i10);
                    }
                    t11 = t3;
                    break;
                case 12:
                    if (o(t10, i10)) {
                        z1.n(t3, j10, z1.f2186c.i(t10, j10));
                        K(t3, i10);
                    }
                    t11 = t3;
                    break;
                case 13:
                    if (o(t10, i10)) {
                        z1.n(t3, j10, z1.f2186c.i(t10, j10));
                        K(t3, i10);
                    }
                    t11 = t3;
                    break;
                case 14:
                    if (o(t10, i10)) {
                        z1.o(t3, j10, z1.f2186c.j(t10, j10));
                        K(t3, i10);
                    }
                    t11 = t3;
                    break;
                case 15:
                    if (o(t10, i10)) {
                        z1.n(t3, j10, z1.f2186c.i(t10, j10));
                        K(t3, i10);
                    }
                    t11 = t3;
                    break;
                case 16:
                    if (o(t10, i10)) {
                        z1.o(t3, j10, z1.f2186c.j(t10, j10));
                        K(t3, i10);
                    }
                    t11 = t3;
                    break;
                case 17:
                    t(t3, t10, i10);
                    t11 = t3;
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
                    this.f1967l.a(t3, t10, j10);
                    t11 = t3;
                    break;
                case 50:
                    Class<?> cls2 = p1.f2127a;
                    z1.e eVar4 = z1.f2186c;
                    z1.p(t3, j10, this.f1970o.mergeFrom(eVar4.k(t3, j10), eVar4.k(t10, j10)));
                    t11 = t3;
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
                    if (r(t10, i11, i10)) {
                        z1.p(t3, j10, z1.f2186c.k(t10, j10));
                        L(t3, i11, i10);
                    }
                    t11 = t3;
                    break;
                case 60:
                    u(t3, t10, i10);
                    t11 = t3;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case EACTags.ELEMENT_LIST /* 65 */:
                case EACTags.ADDRESS /* 66 */:
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (r(t10, i11, i10)) {
                        z1.p(t3, j10, z1.f2186c.k(t10, j10));
                        L(t3, i11, i10);
                    }
                    t11 = t3;
                    break;
                case 68:
                    u(t3, t10, i10);
                    t11 = t3;
                    break;
            }
            i10 += 3;
            t3 = t11;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.o1
    public final T newInstance() {
        return (T) this.f1966k.newInstance(this.f1960e);
    }

    public final boolean o(T t3, int i10) {
        int i11 = this.f1956a[i10 + 2];
        long j10 = i11 & 1048575;
        if (j10 == 1048575) {
            int iQ = Q(i10);
            long j11 = iQ & 1048575;
            switch (P(iQ)) {
                case 0:
                    if (Double.doubleToRawLongBits(z1.f2186c.g(t3, j11)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(z1.f2186c.h(t3, j11)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (z1.f2186c.j(t3, j11) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (z1.f2186c.j(t3, j11) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (z1.f2186c.i(t3, j11) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (z1.f2186c.j(t3, j11) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (z1.f2186c.i(t3, j11) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return z1.f2186c.d(t3, j11);
                case 8:
                    Object objK = z1.f2186c.k(t3, j11);
                    if (objK instanceof String) {
                        return !((String) objK).isEmpty();
                    }
                    if (objK instanceof j) {
                        return !j.f2038b.equals(objK);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (z1.f2186c.k(t3, j11) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !j.f2038b.equals(z1.f2186c.k(t3, j11));
                case 11:
                    if (z1.f2186c.i(t3, j11) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (z1.f2186c.i(t3, j11) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (z1.f2186c.i(t3, j11) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (z1.f2186c.j(t3, j11) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (z1.f2186c.i(t3, j11) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (z1.f2186c.j(t3, j11) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (z1.f2186c.k(t3, j11) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            if ((z1.f2186c.i(t3, j10) & (1 << (i11 >>> 20))) == 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean p(T t3, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? o(t3, i10) : (i12 & i13) != 0;
    }

    public final boolean r(T t3, int i10, int i11) {
        return z1.f2186c.i(t3, (long) (this.f1956a[i11 + 2] & 1048575)) == i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0090, code lost:
    
        r9.put(r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0093, code lost:
    
        r0.j(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0096, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(Object obj, int i10, Object obj2, t tVar, l lVar) throws IOException {
        long jQ = Q(i10) & 1048575;
        Object objK = z1.f2186c.k(obj, jQ);
        r0 r0Var = this.f1970o;
        if (objK == null) {
            objK = r0Var.a();
            z1.p(obj, jQ, objK);
        } else if (r0Var.isImmutable(objK)) {
            q0 q0VarA = r0Var.a();
            r0Var.mergeFrom(q0VarA, objK);
            z1.p(obj, jQ, q0VarA);
            objK = q0VarA;
        }
        q0 q0VarForMutableMapData = r0Var.forMutableMapData(objK);
        p0.a<?, ?> aVarForMapMetadata = r0Var.forMapMetadata(obj2);
        lVar.x(2);
        k kVar = lVar.f2078a;
        int iK = kVar.k(kVar.F());
        aVarForMapMetadata.getClass();
        Object obj3 = aVarForMapMetadata.f2126c;
        Object objI = "";
        Object objI2 = obj3;
        while (true) {
            try {
                int iA = lVar.a();
                if (iA == Integer.MAX_VALUE || kVar.g()) {
                    break;
                }
                if (iA == 1) {
                    objI = lVar.i(aVarForMapMetadata.f2124a, null, null);
                } else if (iA != 2) {
                    try {
                        if (!lVar.y()) {
                            throw new e0("Unable to parse map entry.");
                        }
                    } catch (e0.a unused) {
                        if (!lVar.y()) {
                            throw new e0("Unable to parse map entry.");
                        }
                    }
                } else {
                    objI2 = lVar.i(aVarForMapMetadata.f2125b, obj3.getClass(), tVar);
                }
            } catch (Throwable th2) {
                kVar.j(iK);
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void t(T t3, T t10, int i10) {
        if (o(t10, i10)) {
            long jQ = Q(i10) & 1048575;
            Unsafe unsafe = f1955q;
            Object object = unsafe.getObject(t10, jQ);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f1956a[i10] + " is present but null: " + t10);
            }
            o1 o1VarM = m(i10);
            if (!o(t3, i10)) {
                if (q(object)) {
                    Object objNewInstance = o1VarM.newInstance();
                    o1VarM.mergeFrom(objNewInstance, object);
                    unsafe.putObject(t3, jQ, objNewInstance);
                } else {
                    unsafe.putObject(t3, jQ, object);
                }
                K(t3, i10);
                return;
            }
            Object object2 = unsafe.getObject(t3, jQ);
            if (!q(object2)) {
                Object objNewInstance2 = o1VarM.newInstance();
                o1VarM.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(t3, jQ, objNewInstance2);
                object2 = objNewInstance2;
            }
            o1VarM.mergeFrom(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u(T t3, T t10, int i10) {
        int[] iArr = this.f1956a;
        int i11 = iArr[i10];
        if (r(t10, i11, i10)) {
            long jQ = Q(i10) & 1048575;
            Unsafe unsafe = f1955q;
            Object object = unsafe.getObject(t10, jQ);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i10] + " is present but null: " + t10);
            }
            o1 o1VarM = m(i10);
            if (!r(t3, i11, i10)) {
                if (q(object)) {
                    Object objNewInstance = o1VarM.newInstance();
                    o1VarM.mergeFrom(objNewInstance, object);
                    unsafe.putObject(t3, jQ, objNewInstance);
                } else {
                    unsafe.putObject(t3, jQ, object);
                }
                L(t3, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(t3, jQ);
            if (!q(object2)) {
                Object objNewInstance2 = o1VarM.newInstance();
                o1VarM.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(t3, jQ, objNewInstance2);
                object2 = objNewInstance2;
            }
            o1VarM.mergeFrom(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object v(T t3, int i10) {
        o1 o1VarM = m(i10);
        long jQ = Q(i10) & 1048575;
        if (!o(t3, i10)) {
            return o1VarM.newInstance();
        }
        Object object = f1955q.getObject(t3, jQ);
        if (q(object)) {
            return object;
        }
        Object objNewInstance = o1VarM.newInstance();
        if (object != null) {
            o1VarM.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object w(T t3, int i10, int i11) {
        o1 o1VarM = m(i11);
        if (!r(t3, i10, i11)) {
            return o1VarM.newInstance();
        }
        Object object = f1955q.getObject(t3, Q(i11) & 1048575);
        if (q(object)) {
            return object;
        }
        Object objNewInstance = o1VarM.newInstance();
        if (object != null) {
            o1VarM.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }
}
