package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.e;
import com.google.crypto.tink.shaded.protobuf.o;
import com.google.crypto.tink.shaded.protobuf.r1;
import com.google.crypto.tink.shaded.protobuf.s;
import com.google.crypto.tink.shaded.protobuf.w;
import com.google.crypto.tink.shaded.protobuf.y;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.EACTags;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public final class u0<T> implements g1<T> {

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f6773q = new int[0];

    /* renamed from: r, reason: collision with root package name */
    public static final Unsafe f6774r = r1.j();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f6775a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f6776b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6777c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6778d;

    /* renamed from: e, reason: collision with root package name */
    public final p0 f6779e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f6780f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f6781g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f6782h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f6783i;

    /* renamed from: j, reason: collision with root package name */
    public final int f6784j;

    /* renamed from: k, reason: collision with root package name */
    public final int f6785k;

    /* renamed from: l, reason: collision with root package name */
    public final w0 f6786l;

    /* renamed from: m, reason: collision with root package name */
    public final f0 f6787m;

    /* renamed from: n, reason: collision with root package name */
    public final n1<?, ?> f6788n;

    /* renamed from: o, reason: collision with root package name */
    public final p<?> f6789o;

    /* renamed from: p, reason: collision with root package name */
    public final k0 f6790p;

    public u0(int[] iArr, Object[] objArr, int i10, int i11, p0 p0Var, boolean z10, int[] iArr2, int i12, int i13, w0 w0Var, f0 f0Var, n1 n1Var, p pVar, k0 k0Var) {
        this.f6775a = iArr;
        this.f6776b = objArr;
        this.f6777c = i10;
        this.f6778d = i11;
        this.f6781g = p0Var instanceof w;
        this.f6782h = z10;
        this.f6780f = pVar != null && pVar.e(p0Var);
        this.f6783i = iArr2;
        this.f6784j = i12;
        this.f6785k = i13;
        this.f6786l = w0Var;
        this.f6787m = f0Var;
        this.f6788n = n1Var;
        this.f6789o = pVar;
        this.f6779e = p0Var;
        this.f6790p = k0Var;
    }

    public static long A(int i10) {
        return i10 & 1048575;
    }

    public static <T> int B(T t3, long j10) {
        return ((Integer) r1.f6751c.i(t3, j10)).intValue();
    }

    public static <T> long C(T t3, long j10) {
        return ((Long) r1.f6751c.i(t3, j10)).longValue();
    }

    public static Field M(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbA = e.e.a("Field ", str, " for ");
            androidx.datastore.preferences.protobuf.y0.a(cls, sbA, " not found. Known fields are ");
            sbA.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbA.toString());
        }
    }

    public static int S(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    public static void W(int i10, Object obj, v1 v1Var) throws IOException {
        if (obj instanceof String) {
            ((l) v1Var).f6726a.g0(i10, (String) obj);
        } else {
            ((l) v1Var).a(i10, (h) obj);
        }
    }

    public static void h(Object obj) {
        if (!q(obj)) {
            throw new IllegalArgumentException(androidx.datastore.preferences.protobuf.z0.a(obj, "Mutating immutable message: "));
        }
    }

    public static o1 m(Object obj) {
        w wVar = (w) obj;
        o1 o1Var = wVar.unknownFields;
        if (o1Var != o1.f6737f) {
            return o1Var;
        }
        o1 o1Var2 = new o1();
        wVar.unknownFields = o1Var2;
        return o1Var2;
    }

    public static boolean q(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof w) {
            return ((w) obj).n();
        }
        return true;
    }

    public static List s(a aVar, long j10) {
        return (List) r1.f6751c.i(aVar, j10);
    }

    public static u0 y(n0 n0Var, w0 w0Var, f0 f0Var, n1 n1Var, p pVar, k0 k0Var) {
        if (n0Var instanceof e1) {
            return z((e1) n0Var, w0Var, f0Var, n1Var, pVar, k0Var);
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <T> u0<T> z(e1 e1Var, w0 w0Var, f0 f0Var, n1<?, ?> n1Var, p<?> pVar, k0 k0Var) {
        int i10;
        int iCharAt;
        int iCharAt2;
        int iCharAt3;
        int iCharAt4;
        int i11;
        int i12;
        int[] iArr;
        int i13;
        char cCharAt;
        int i14;
        char cCharAt2;
        int i15;
        char cCharAt3;
        int i16;
        char cCharAt4;
        int i17;
        char cCharAt5;
        int i18;
        char cCharAt6;
        int i19;
        char cCharAt7;
        int i20;
        char cCharAt8;
        Object[] objArr;
        int i21;
        int i22;
        int i23;
        int i24;
        boolean z10;
        int i25;
        int iObjectFieldOffset;
        int i26;
        int iObjectFieldOffset2;
        int i27;
        int i28;
        int i29;
        int iObjectFieldOffset3;
        Field fieldM;
        int i30;
        char cCharAt9;
        int i31;
        int i32;
        Field fieldM2;
        Field fieldM3;
        int i33;
        char cCharAt10;
        int i34;
        char cCharAt11;
        int i35;
        int i36;
        char cCharAt12;
        int i37;
        char cCharAt13;
        int i38 = 0;
        boolean z11 = e1Var.getSyntax() == b1.f6633b;
        String str = e1Var.f6652b;
        int length = str.length();
        if (str.charAt(0) >= 55296) {
            int i39 = 1;
            while (true) {
                i10 = i39 + 1;
                if (str.charAt(i39) < 55296) {
                    break;
                }
                i39 = i10;
            }
        } else {
            i10 = 1;
        }
        int i40 = i10 + 1;
        int iCharAt5 = str.charAt(i10);
        if (iCharAt5 >= 55296) {
            int i41 = iCharAt5 & 8191;
            int i42 = 13;
            while (true) {
                i37 = i40 + 1;
                cCharAt13 = str.charAt(i40);
                if (cCharAt13 < 55296) {
                    break;
                }
                i41 |= (cCharAt13 & 8191) << i42;
                i42 += 13;
                i40 = i37;
            }
            iCharAt5 = i41 | (cCharAt13 << i42);
            i40 = i37;
        }
        if (iCharAt5 == 0) {
            iCharAt = 0;
            iCharAt2 = 0;
            iCharAt3 = 0;
            i11 = 0;
            iCharAt4 = 0;
            iArr = f6773q;
            i12 = 0;
        } else {
            int i43 = i40 + 1;
            int iCharAt6 = str.charAt(i40);
            if (iCharAt6 >= 55296) {
                int i44 = iCharAt6 & 8191;
                int i45 = 13;
                while (true) {
                    i20 = i43 + 1;
                    cCharAt8 = str.charAt(i43);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i44 |= (cCharAt8 & 8191) << i45;
                    i45 += 13;
                    i43 = i20;
                }
                iCharAt6 = i44 | (cCharAt8 << i45);
                i43 = i20;
            }
            int i46 = i43 + 1;
            int iCharAt7 = str.charAt(i43);
            if (iCharAt7 >= 55296) {
                int i47 = iCharAt7 & 8191;
                int i48 = 13;
                while (true) {
                    i19 = i46 + 1;
                    cCharAt7 = str.charAt(i46);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i47 |= (cCharAt7 & 8191) << i48;
                    i48 += 13;
                    i46 = i19;
                }
                iCharAt7 = i47 | (cCharAt7 << i48);
                i46 = i19;
            }
            int i49 = i46 + 1;
            iCharAt = str.charAt(i46);
            if (iCharAt >= 55296) {
                int i50 = iCharAt & 8191;
                int i51 = 13;
                while (true) {
                    i18 = i49 + 1;
                    cCharAt6 = str.charAt(i49);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i50 |= (cCharAt6 & 8191) << i51;
                    i51 += 13;
                    i49 = i18;
                }
                iCharAt = i50 | (cCharAt6 << i51);
                i49 = i18;
            }
            int i52 = i49 + 1;
            iCharAt2 = str.charAt(i49);
            if (iCharAt2 >= 55296) {
                int i53 = iCharAt2 & 8191;
                int i54 = 13;
                while (true) {
                    i17 = i52 + 1;
                    cCharAt5 = str.charAt(i52);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i53 |= (cCharAt5 & 8191) << i54;
                    i54 += 13;
                    i52 = i17;
                }
                iCharAt2 = i53 | (cCharAt5 << i54);
                i52 = i17;
            }
            int i55 = i52 + 1;
            int iCharAt8 = str.charAt(i52);
            if (iCharAt8 >= 55296) {
                int i56 = iCharAt8 & 8191;
                int i57 = 13;
                while (true) {
                    i16 = i55 + 1;
                    cCharAt4 = str.charAt(i55);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i56 |= (cCharAt4 & 8191) << i57;
                    i57 += 13;
                    i55 = i16;
                }
                iCharAt8 = i56 | (cCharAt4 << i57);
                i55 = i16;
            }
            int i58 = i55 + 1;
            iCharAt3 = str.charAt(i55);
            if (iCharAt3 >= 55296) {
                int i59 = iCharAt3 & 8191;
                int i60 = 13;
                while (true) {
                    i15 = i58 + 1;
                    cCharAt3 = str.charAt(i58);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i59 |= (cCharAt3 & 8191) << i60;
                    i60 += 13;
                    i58 = i15;
                }
                iCharAt3 = i59 | (cCharAt3 << i60);
                i58 = i15;
            }
            int i61 = i58 + 1;
            int iCharAt9 = str.charAt(i58);
            if (iCharAt9 >= 55296) {
                int i62 = iCharAt9 & 8191;
                int i63 = 13;
                while (true) {
                    i14 = i61 + 1;
                    cCharAt2 = str.charAt(i61);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i62 |= (cCharAt2 & 8191) << i63;
                    i63 += 13;
                    i61 = i14;
                }
                iCharAt9 = i62 | (cCharAt2 << i63);
                i61 = i14;
            }
            int i64 = i61 + 1;
            iCharAt4 = str.charAt(i61);
            if (iCharAt4 >= 55296) {
                int i65 = iCharAt4 & 8191;
                int i66 = i64;
                int i67 = 13;
                while (true) {
                    i13 = i66 + 1;
                    cCharAt = str.charAt(i66);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i65 |= (cCharAt & 8191) << i67;
                    i67 += 13;
                    i66 = i13;
                }
                iCharAt4 = i65 | (cCharAt << i67);
                i64 = i13;
            }
            int[] iArr2 = new int[iCharAt4 + iCharAt3 + iCharAt9];
            i11 = (iCharAt6 * 2) + iCharAt7;
            i12 = iCharAt8;
            iArr = iArr2;
            i38 = iCharAt6;
            i40 = i64;
        }
        Unsafe unsafe = f6774r;
        Object[] objArr2 = e1Var.f6653c;
        Class<?> cls = e1Var.f6651a.getClass();
        int i68 = i38;
        int[] iArr3 = new int[i12 * 3];
        Object[] objArr3 = new Object[i12 * 2];
        int i69 = iCharAt3 + iCharAt4;
        int i70 = i69;
        int i71 = iCharAt4;
        int i72 = 0;
        int i73 = 0;
        while (i40 < length) {
            int i74 = i40 + 1;
            int iCharAt10 = str.charAt(i40);
            int i75 = length;
            if (iCharAt10 >= 55296) {
                int i76 = iCharAt10 & 8191;
                int i77 = i74;
                int i78 = 13;
                while (true) {
                    i36 = i77 + 1;
                    cCharAt12 = str.charAt(i77);
                    objArr = objArr2;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i76 |= (cCharAt12 & 8191) << i78;
                    i78 += 13;
                    i77 = i36;
                    objArr2 = objArr;
                }
                iCharAt10 = i76 | (cCharAt12 << i78);
                i21 = i36;
            } else {
                objArr = objArr2;
                i21 = i74;
            }
            int i79 = i21 + 1;
            int iCharAt11 = str.charAt(i21);
            if (iCharAt11 >= 55296) {
                int i80 = iCharAt11 & 8191;
                int i81 = i79;
                int i82 = 13;
                while (true) {
                    i34 = i81 + 1;
                    cCharAt11 = str.charAt(i81);
                    i35 = i80;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i80 = i35 | ((cCharAt11 & 8191) << i82);
                    i82 += 13;
                    i81 = i34;
                }
                iCharAt11 = i35 | (cCharAt11 << i82);
                i22 = i34;
            } else {
                i22 = i79;
            }
            int i83 = iCharAt10;
            int i84 = iCharAt11 & 255;
            Object[] objArr4 = objArr3;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i73] = i72;
                i73++;
            }
            int i85 = iCharAt;
            if (i84 >= 51) {
                int i86 = i22 + 1;
                int iCharAt12 = str.charAt(i22);
                char c10 = 55296;
                if (iCharAt12 >= 55296) {
                    int i87 = iCharAt12 & 8191;
                    int i88 = 13;
                    while (true) {
                        i33 = i86 + 1;
                        cCharAt10 = str.charAt(i86);
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
                int i89 = i84 - 51;
                int i90 = iCharAt12;
                if (i89 == 9 || i89 == 17) {
                    i32 = i86;
                    objArr4[androidx.datastore.preferences.protobuf.a1.b(i72, 3, 2, 1)] = objArr[i11];
                    i11++;
                } else if (i89 != 12 || z11) {
                    i32 = i86;
                } else {
                    i32 = i86;
                    objArr4[androidx.datastore.preferences.protobuf.a1.b(i72, 3, 2, 1)] = objArr[i11];
                    i11++;
                }
                int i91 = i90 * 2;
                Object obj = objArr[i91];
                if (obj instanceof Field) {
                    fieldM2 = (Field) obj;
                } else {
                    fieldM2 = M(cls, (String) obj);
                    objArr[i91] = fieldM2;
                }
                i23 = iCharAt2;
                iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldM2);
                int i92 = i91 + 1;
                Object obj2 = objArr[i92];
                if (obj2 instanceof Field) {
                    fieldM3 = (Field) obj2;
                } else {
                    fieldM3 = M(cls, (String) obj2);
                    objArr[i92] = fieldM3;
                }
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldM3);
                i29 = i11;
                i27 = i32;
                i26 = i72;
                iObjectFieldOffset2 = iObjectFieldOffset4;
                z10 = z11;
                i28 = 0;
            } else {
                i23 = iCharAt2;
                int i93 = i11 + 1;
                Field fieldM4 = M(cls, (String) objArr[i11]);
                if (i84 == 9 || i84 == 17) {
                    i24 = i93;
                    z10 = z11;
                    objArr4[androidx.datastore.preferences.protobuf.a1.b(i72, 3, 2, 1)] = fieldM4.getType();
                } else {
                    if (i84 == 27 || i84 == 49) {
                        z10 = z11;
                        i31 = i11 + 2;
                        objArr4[androidx.datastore.preferences.protobuf.a1.b(i72, 3, 2, 1)] = objArr[i93];
                    } else {
                        if (i84 == 12 || i84 == 30 || i84 == 44) {
                            if (!z11) {
                                z10 = z11;
                                i31 = i11 + 2;
                                objArr4[androidx.datastore.preferences.protobuf.a1.b(i72, 3, 2, 1)] = objArr[i93];
                            }
                        } else if (i84 == 50) {
                            int i94 = i71 + 1;
                            iArr[i71] = i72;
                            int i95 = (i72 / 3) * 2;
                            int i96 = i11 + 2;
                            objArr4[i95] = objArr[i93];
                            if ((iCharAt11 & 2048) != 0) {
                                i25 = i11 + 3;
                                objArr4[i95 + 1] = objArr[i96];
                                i71 = i94;
                            } else {
                                i71 = i94;
                                i25 = i96;
                            }
                            z10 = z11;
                            iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM4);
                            if ((iCharAt11 & 4096) != 4096 || i84 > 17) {
                                i26 = i72;
                                iObjectFieldOffset2 = 1048575;
                                i27 = i22;
                                i28 = 0;
                            } else {
                                i27 = i22 + 1;
                                int iCharAt13 = str.charAt(i22);
                                if (iCharAt13 >= 55296) {
                                    int i97 = iCharAt13 & 8191;
                                    int i98 = 13;
                                    while (true) {
                                        i30 = i27 + 1;
                                        cCharAt9 = str.charAt(i27);
                                        if (cCharAt9 < 55296) {
                                            break;
                                        }
                                        i97 |= (cCharAt9 & 8191) << i98;
                                        i98 += 13;
                                        i27 = i30;
                                    }
                                    iCharAt13 = i97 | (cCharAt9 << i98);
                                    i27 = i30;
                                }
                                int i99 = (iCharAt13 / 32) + (i68 * 2);
                                Object obj3 = objArr[i99];
                                if (obj3 instanceof Field) {
                                    fieldM = (Field) obj3;
                                } else {
                                    fieldM = M(cls, (String) obj3);
                                    objArr[i99] = fieldM;
                                }
                                i26 = i72;
                                int i100 = iCharAt13;
                                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM);
                                i28 = i100 % 32;
                            }
                            if (i84 >= 18 || i84 > 49) {
                                i29 = i25;
                                iObjectFieldOffset3 = iObjectFieldOffset;
                            } else {
                                iArr[i70] = iObjectFieldOffset;
                                i29 = i25;
                                iObjectFieldOffset3 = iObjectFieldOffset;
                                i70++;
                            }
                        }
                        i24 = i93;
                        z10 = z11;
                    }
                    i25 = i31;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM4);
                    if ((iCharAt11 & 4096) != 4096) {
                        i26 = i72;
                        iObjectFieldOffset2 = 1048575;
                        i27 = i22;
                        i28 = 0;
                        if (i84 >= 18) {
                            i29 = i25;
                            iObjectFieldOffset3 = iObjectFieldOffset;
                        }
                    }
                }
                i25 = i24;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM4);
                if ((iCharAt11 & 4096) != 4096) {
                }
            }
            int i101 = i26 + 1;
            iArr3[i26] = i83;
            int i102 = i26 + 2;
            String str2 = str;
            iArr3[i101] = ((iCharAt11 & 512) != 0 ? PKIFailureInfo.duplicateCertReq : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | (i84 << 20) | iObjectFieldOffset3;
            iArr3[i102] = (i28 << 20) | iObjectFieldOffset2;
            i72 = i26 + 3;
            i11 = i29;
            i40 = i27;
            str = str2;
            length = i75;
            objArr3 = objArr4;
            objArr2 = objArr;
            z11 = z10;
            iCharAt = i85;
            iCharAt2 = i23;
        }
        return new u0<>(iArr3, objArr3, iCharAt, iCharAt2, e1Var.f6651a, z11, iArr, iCharAt4, i69, w0Var, f0Var, n1Var, pVar, k0Var);
    }

    public final void D(Object obj, byte[] bArr, int i10, int i11, int i12, long j10, e.a aVar) throws IOException {
        Unsafe unsafe = f6774r;
        Object objK = k(i12);
        Object object = unsafe.getObject(obj, j10);
        k0 k0Var = this.f6790p;
        if (k0Var.isImmutable(object)) {
            j0 j0VarA = k0Var.a();
            k0Var.mergeFrom(j0VarA, object);
            unsafe.putObject(obj, j10, j0VarA);
            object = j0VarA;
        }
        k0Var.forMapMetadata(objK);
        k0Var.forMutableMapData(object);
        int i13 = e.i(bArr, i10, aVar);
        int i14 = aVar.f6647a;
        if (i14 >= 0 && i14 <= i11 - i13) {
            throw null;
        }
        throw z.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int E(T t3, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, e.a aVar) throws IOException {
        int i18;
        Unsafe unsafe = f6774r;
        long j11 = this.f6775a[i17 + 2] & 1048575;
        switch (i16) {
            case EACTags.TRANSACTION_DATE /* 51 */:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(t3, j10, Double.valueOf(Double.longBitsToDouble(e.c(bArr, i10))));
                int i19 = i10 + 8;
                unsafe.putInt(t3, j11, i13);
                return i19;
            case 52:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(t3, j10, Float.valueOf(Float.intBitsToFloat(e.b(bArr, i10))));
                int i20 = i10 + 4;
                unsafe.putInt(t3, j11, i13);
                return i20;
            case EACTags.SEX /* 53 */:
            case EACTags.CURRENCY_EXPONENT /* 54 */:
                if (i14 != 0) {
                    return i10;
                }
                int iK = e.k(bArr, i10, aVar);
                unsafe.putObject(t3, j10, Long.valueOf(aVar.f6648b));
                unsafe.putInt(t3, j11, i13);
                return iK;
            case 55:
            case 62:
                if (i14 != 0) {
                    return i10;
                }
                int i21 = e.i(bArr, i10, aVar);
                unsafe.putObject(t3, j10, Integer.valueOf(aVar.f6647a));
                unsafe.putInt(t3, j11, i13);
                return i21;
            case 56:
            case EACTags.ELEMENT_LIST /* 65 */:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(t3, j10, Long.valueOf(e.c(bArr, i10)));
                int i22 = i10 + 8;
                unsafe.putInt(t3, j11, i13);
                return i22;
            case 57:
            case 64:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(t3, j10, Integer.valueOf(e.b(bArr, i10)));
                int i23 = i10 + 4;
                unsafe.putInt(t3, j11, i13);
                return i23;
            case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                if (i14 != 0) {
                    return i10;
                }
                int iK2 = e.k(bArr, i10, aVar);
                unsafe.putObject(t3, j10, Boolean.valueOf(aVar.f6648b != 0));
                unsafe.putInt(t3, j11, i13);
                return iK2;
            case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                if (i14 != 2) {
                    return i10;
                }
                int i24 = e.i(bArr, i10, aVar);
                int i25 = aVar.f6647a;
                if (i25 == 0) {
                    unsafe.putObject(t3, j10, "");
                } else {
                    if ((i15 & PKIFailureInfo.duplicateCertReq) != 0) {
                        if (!s1.f6761a.c(bArr, i24, i24 + i25)) {
                            throw z.b();
                        }
                    }
                    unsafe.putObject(t3, j10, new String(bArr, i24, i25, y.f6818a));
                    i24 += i25;
                }
                unsafe.putInt(t3, j11, i13);
                return i24;
            case 60:
                i18 = i10;
                if (i14 == 2) {
                    Object objX = x(t3, i13, i17);
                    int iL = e.l(objX, l(i17), bArr, i18, i11, aVar);
                    R(t3, i13, i17, objX);
                    return iL;
                }
                return i18;
            case 61:
                i18 = i10;
                if (i14 == 2) {
                    int iA = e.a(bArr, i18, aVar);
                    unsafe.putObject(t3, j10, aVar.f6649c);
                    unsafe.putInt(t3, j11, i13);
                    return iA;
                }
                return i18;
            case 63:
                i18 = i10;
                if (i14 == 0) {
                    int i26 = e.i(bArr, i18, aVar);
                    int i27 = aVar.f6647a;
                    y.b bVarJ = j(i17);
                    if (bVarJ != null && !bVarJ.a()) {
                        m(t3).c(i12, Long.valueOf(i27));
                        return i26;
                    }
                    unsafe.putObject(t3, j10, Integer.valueOf(i27));
                    unsafe.putInt(t3, j11, i13);
                    return i26;
                }
                return i18;
            case EACTags.ADDRESS /* 66 */:
                i18 = i10;
                if (i14 == 0) {
                    int i28 = e.i(bArr, i18, aVar);
                    unsafe.putObject(t3, j10, Integer.valueOf(i.b(aVar.f6647a)));
                    unsafe.putInt(t3, j11, i13);
                    return i28;
                }
                return i18;
            case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                i18 = i10;
                if (i14 == 0) {
                    int iK3 = e.k(bArr, i18, aVar);
                    unsafe.putObject(t3, j10, Long.valueOf(i.c(aVar.f6648b)));
                    unsafe.putInt(t3, j11, i13);
                    return iK3;
                }
                return i18;
            case 68:
                if (i14 == 3) {
                    Object objX2 = x(t3, i13, i17);
                    int iF = ((u0) l(i17)).F(objX2, bArr, i10, i11, (i12 & (-8)) | 4, aVar);
                    aVar.f6649c = objX2;
                    R(t3, i13, i17, objX2);
                    return iF;
                }
            default:
                return i10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:165:0x0564, code lost:
    
        if (r8 == 1048575) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0566, code lost:
    
        r26.putInt(r10, r8, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x056c, code lost:
    
        r8 = r9.f6784j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0571, code lost:
    
        if (r8 >= r9.f6785k) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0573, code lost:
    
        r9.i(r10, r9.f6783i[r8], null, r9.f6788n, r30);
        r8 = r8 + 1;
        r9 = r29;
        r10 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0588, code lost:
    
        if (r34 != 0) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x058a, code lost:
    
        if (r6 != r12) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0591, code lost:
    
        throw com.google.crypto.tink.shaded.protobuf.z.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0592, code lost:
    
        if (r6 > r12) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0594, code lost:
    
        if (r7 != r34) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0596, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x059b, code lost:
    
        throw com.google.crypto.tink.shaded.protobuf.z.f();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:146:0x04ef A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0539  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int F(T t3, byte[] bArr, int i10, int i11, int i12, e.a aVar) throws IOException {
        u0<T> u0Var;
        int i13;
        Unsafe unsafe;
        T t10;
        int i14;
        int i15;
        int i16;
        int iP;
        int i17;
        o oVar;
        int i18;
        o oVar2;
        int iG;
        int i19;
        int i20;
        int i21;
        byte[] bArr2;
        int i22;
        int i23;
        Unsafe unsafe2;
        e.a aVar2;
        int i24;
        e.a aVar3;
        o oVar3;
        int i25;
        Unsafe unsafe3;
        byte[] bArr3;
        int i26;
        e.a aVar4;
        T t11;
        byte[] bArr4;
        int i27;
        Unsafe unsafe4;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        u0<T> u0Var2 = this;
        T t12 = t3;
        byte[] bArr5 = bArr;
        int i34 = i11;
        e.a aVar5 = aVar;
        o oVar4 = aVar5.f6650d;
        h(t12);
        Unsafe unsafe5 = f6774r;
        int i35 = i10;
        int i36 = -1;
        int i37 = 0;
        int i38 = 1048575;
        int i39 = 0;
        int i40 = 0;
        while (true) {
            if (i35 < i34) {
                int iH = i35 + 1;
                int i41 = bArr5[i35];
                if (i41 < 0) {
                    iH = e.h(i41, bArr5, iH, aVar5);
                    i41 = aVar5.f6647a;
                }
                int i42 = iH;
                int i43 = i41;
                int i44 = i43 >>> 3;
                int i45 = i37;
                int i46 = i43 & 7;
                int i47 = u0Var2.f6778d;
                int i48 = u0Var2.f6777c;
                if (i44 > i36) {
                    iP = (i44 < i48 || i44 > i47) ? -1 : u0Var2.P(i44, i45 / 3);
                    i16 = 0;
                } else if (i44 < i48 || i44 > i47) {
                    i16 = 0;
                    iP = -1;
                } else {
                    i16 = 0;
                    iP = u0Var2.P(i44, 0);
                }
                if (iP == -1) {
                    i17 = i42;
                    oVar = oVar4;
                    unsafe = unsafe5;
                    i37 = i16;
                    i36 = i44;
                    u0Var = u0Var2;
                    t10 = t12;
                } else {
                    int[] iArr = u0Var2.f6775a;
                    int i49 = iArr[iP + 1];
                    int iS = S(i49);
                    long j10 = i49 & 1048575;
                    if (iS <= 17) {
                        int i50 = iArr[iP + 2];
                        int i51 = 1 << (i50 >>> 20);
                        int i52 = i50 & 1048575;
                        if (i52 != i38) {
                            if (i38 != 1048575) {
                                unsafe5.putInt(t12, i38, i39);
                            }
                            i21 = i52;
                            i20 = unsafe5.getInt(t12, i52);
                        } else {
                            i20 = i39;
                            i21 = i38;
                        }
                        switch (iS) {
                            case 0:
                                i24 = i42;
                                oVar3 = oVar4;
                                i25 = iP;
                                unsafe3 = unsafe5;
                                if (i46 != 1) {
                                    unsafe4 = unsafe3;
                                    t10 = t12;
                                    unsafe = unsafe4;
                                    i17 = i24;
                                    i37 = i25;
                                    i36 = i44;
                                    i38 = i21;
                                    oVar = oVar3;
                                    i39 = i20;
                                    u0Var = u0Var2;
                                    break;
                                } else {
                                    r1.f6751c.m(t3, j10, Double.longBitsToDouble(e.c(bArr, i24)));
                                    t12 = t3;
                                    i35 = i24 + 8;
                                    i34 = i11;
                                    i40 = i43;
                                    aVar5 = aVar;
                                    i36 = i44;
                                    i38 = i21;
                                    i39 = i20 | i51;
                                    bArr5 = bArr;
                                    unsafe5 = unsafe3;
                                    i37 = i25;
                                    oVar4 = oVar3;
                                    break;
                                }
                            case 1:
                                i24 = i42;
                                aVar3 = aVar;
                                oVar3 = oVar4;
                                i25 = iP;
                                unsafe3 = unsafe5;
                                bArr3 = bArr;
                                if (i46 != 5) {
                                    unsafe4 = unsafe3;
                                    t10 = t12;
                                    unsafe = unsafe4;
                                    i17 = i24;
                                    i37 = i25;
                                    i36 = i44;
                                    i38 = i21;
                                    oVar = oVar3;
                                    i39 = i20;
                                    u0Var = u0Var2;
                                    break;
                                } else {
                                    r1.f6751c.n(t12, j10, Float.intBitsToFloat(e.b(bArr3, i24)));
                                    i35 = i24 + 4;
                                    i26 = i20 | i51;
                                    byte[] bArr6 = bArr3;
                                    unsafe5 = unsafe3;
                                    bArr5 = bArr6;
                                    i37 = i25;
                                    i40 = i43;
                                    aVar5 = aVar3;
                                    i36 = i44;
                                    i38 = i21;
                                    oVar4 = oVar3;
                                    i39 = i26;
                                    i34 = i11;
                                    break;
                                }
                            case 2:
                            case 3:
                                i24 = i42;
                                oVar3 = oVar4;
                                i25 = iP;
                                unsafe3 = unsafe5;
                                if (i46 != 0) {
                                    unsafe4 = unsafe3;
                                    t10 = t12;
                                    unsafe = unsafe4;
                                    i17 = i24;
                                    i37 = i25;
                                    i36 = i44;
                                    i38 = i21;
                                    oVar = oVar3;
                                    i39 = i20;
                                    u0Var = u0Var2;
                                    break;
                                } else {
                                    int iK = e.k(bArr, i24, aVar);
                                    T t13 = t12;
                                    unsafe3.putLong(t13, j10, aVar.f6648b);
                                    t12 = t13;
                                    unsafe5 = unsafe3;
                                    bArr5 = bArr;
                                    i34 = i11;
                                    i40 = i43;
                                    aVar5 = aVar;
                                    i36 = i44;
                                    i38 = i21;
                                    i39 = i20 | i51;
                                    i35 = iK;
                                    i37 = i25;
                                    oVar4 = oVar3;
                                    break;
                                }
                            case 4:
                            case 11:
                                i24 = i42;
                                oVar3 = oVar4;
                                i25 = iP;
                                unsafe3 = unsafe5;
                                if (i46 != 0) {
                                    unsafe4 = unsafe3;
                                    t10 = t12;
                                    unsafe = unsafe4;
                                    i17 = i24;
                                    i37 = i25;
                                    i36 = i44;
                                    i38 = i21;
                                    oVar = oVar3;
                                    i39 = i20;
                                    u0Var = u0Var2;
                                    break;
                                } else {
                                    int i53 = e.i(bArr, i24, aVar);
                                    unsafe3.putInt(t12, j10, aVar.f6647a);
                                    unsafe5 = unsafe3;
                                    bArr5 = bArr;
                                    i34 = i11;
                                    i37 = i25;
                                    i40 = i43;
                                    i36 = i44;
                                    i38 = i21;
                                    oVar4 = oVar3;
                                    i39 = i20 | i51;
                                    i35 = i53;
                                    aVar5 = aVar;
                                    break;
                                }
                            case 5:
                            case 14:
                                aVar3 = aVar;
                                T t14 = t12;
                                oVar3 = oVar4;
                                i25 = iP;
                                if (i46 != 1) {
                                    t12 = t14;
                                    i24 = i42;
                                    unsafe3 = unsafe5;
                                    unsafe4 = unsafe3;
                                    t10 = t12;
                                    unsafe = unsafe4;
                                    i17 = i24;
                                    i37 = i25;
                                    i36 = i44;
                                    i38 = i21;
                                    oVar = oVar3;
                                    i39 = i20;
                                    u0Var = u0Var2;
                                    break;
                                } else {
                                    long jC = e.c(bArr, i42);
                                    Unsafe unsafe6 = unsafe5;
                                    bArr3 = bArr;
                                    unsafe6.putLong(t14, j10, jC);
                                    unsafe3 = unsafe6;
                                    t12 = t14;
                                    i35 = i42 + 8;
                                    i26 = i20 | i51;
                                    byte[] bArr62 = bArr3;
                                    unsafe5 = unsafe3;
                                    bArr5 = bArr62;
                                    i37 = i25;
                                    i40 = i43;
                                    aVar5 = aVar3;
                                    i36 = i44;
                                    i38 = i21;
                                    oVar4 = oVar3;
                                    i39 = i26;
                                    i34 = i11;
                                    break;
                                }
                            case 6:
                            case 13:
                                t11 = t12;
                                oVar3 = oVar4;
                                bArr4 = bArr;
                                i25 = iP;
                                i27 = i42;
                                if (i46 != 5) {
                                    unsafe4 = unsafe5;
                                    t12 = t11;
                                    i24 = i27;
                                    t10 = t12;
                                    unsafe = unsafe4;
                                    i17 = i24;
                                    i37 = i25;
                                    i36 = i44;
                                    i38 = i21;
                                    oVar = oVar3;
                                    i39 = i20;
                                    u0Var = u0Var2;
                                    break;
                                } else {
                                    unsafe5.putInt(t11, j10, e.b(bArr4, i27));
                                    i35 = i27 + 4;
                                    bArr5 = bArr4;
                                    t12 = t11;
                                    i38 = i21;
                                    i39 = i20 | i51;
                                    i34 = i11;
                                    i37 = i25;
                                    i40 = i43;
                                    aVar5 = aVar;
                                    i36 = i44;
                                    oVar4 = oVar3;
                                    break;
                                }
                            case 7:
                                aVar4 = aVar;
                                t11 = t12;
                                oVar3 = oVar4;
                                bArr4 = bArr;
                                i25 = iP;
                                i27 = i42;
                                if (i46 != 0) {
                                    unsafe4 = unsafe5;
                                    t12 = t11;
                                    i24 = i27;
                                    t10 = t12;
                                    unsafe = unsafe4;
                                    i17 = i24;
                                    i37 = i25;
                                    i36 = i44;
                                    i38 = i21;
                                    oVar = oVar3;
                                    i39 = i20;
                                    u0Var = u0Var2;
                                    break;
                                } else {
                                    int iK2 = e.k(bArr4, i27, aVar4);
                                    r1.f6751c.k(t11, j10, aVar4.f6648b != 0);
                                    bArr5 = bArr4;
                                    t12 = t11;
                                    i38 = i21;
                                    i39 = i20 | i51;
                                    i35 = iK2;
                                    aVar5 = aVar4;
                                    i37 = i25;
                                    i40 = i43;
                                    i36 = i44;
                                    oVar4 = oVar3;
                                    i34 = i11;
                                    break;
                                }
                            case 8:
                                aVar4 = aVar;
                                t11 = t12;
                                oVar3 = oVar4;
                                bArr4 = bArr;
                                i25 = iP;
                                i27 = i42;
                                if (i46 != 2) {
                                    unsafe4 = unsafe5;
                                    t12 = t11;
                                    i24 = i27;
                                    t10 = t12;
                                    unsafe = unsafe4;
                                    i17 = i24;
                                    i37 = i25;
                                    i36 = i44;
                                    i38 = i21;
                                    oVar = oVar3;
                                    i39 = i20;
                                    u0Var = u0Var2;
                                    break;
                                } else {
                                    i35 = (536870912 & i49) == 0 ? e.e(bArr4, i27, aVar4) : e.f(bArr4, i27, aVar4);
                                    unsafe5.putObject(t11, j10, aVar4.f6649c);
                                    bArr5 = bArr4;
                                    t12 = t11;
                                    i38 = i21;
                                    i39 = i20 | i51;
                                    aVar5 = aVar4;
                                    i37 = i25;
                                    i40 = i43;
                                    i36 = i44;
                                    oVar4 = oVar3;
                                    i34 = i11;
                                    break;
                                }
                            case 9:
                                int i54 = iP;
                                Unsafe unsafe7 = unsafe5;
                                if (i46 != 2) {
                                    t11 = t12;
                                    i27 = i42;
                                    oVar3 = oVar4;
                                    unsafe4 = unsafe7;
                                    i25 = i54;
                                    t12 = t11;
                                    i24 = i27;
                                    t10 = t12;
                                    unsafe = unsafe4;
                                    i17 = i24;
                                    i37 = i25;
                                    i36 = i44;
                                    i38 = i21;
                                    oVar = oVar3;
                                    i39 = i20;
                                    u0Var = u0Var2;
                                    break;
                                } else {
                                    T t15 = t12;
                                    Object objW = u0Var2.w(t15, i54);
                                    unsafe5 = unsafe7;
                                    int iL = e.l(objW, u0Var2.l(i54), bArr, i42, i11, aVar);
                                    u0Var2.Q(t15, i54, objW);
                                    bArr5 = bArr;
                                    t12 = t15;
                                    i38 = i21;
                                    i39 = i20 | i51;
                                    i35 = iL;
                                    aVar5 = aVar;
                                    i40 = i43;
                                    i37 = i54;
                                    i36 = i44;
                                    i34 = i11;
                                    break;
                                }
                            case 10:
                                bArr2 = bArr;
                                i22 = i42;
                                i23 = iP;
                                unsafe2 = unsafe5;
                                aVar2 = aVar;
                                if (i46 != 2) {
                                    unsafe4 = unsafe2;
                                    oVar3 = oVar4;
                                    i25 = i23;
                                    i24 = i22;
                                    t10 = t12;
                                    unsafe = unsafe4;
                                    i17 = i24;
                                    i37 = i25;
                                    i36 = i44;
                                    i38 = i21;
                                    oVar = oVar3;
                                    i39 = i20;
                                    u0Var = u0Var2;
                                    break;
                                } else {
                                    i35 = e.a(bArr2, i22, aVar2);
                                    unsafe2.putObject(t12, j10, aVar2.f6649c);
                                    i26 = i20 | i51;
                                    aVar5 = aVar2;
                                    i40 = i43;
                                    i37 = i23;
                                    i36 = i44;
                                    unsafe5 = unsafe2;
                                    bArr5 = bArr2;
                                    i38 = i21;
                                    i39 = i26;
                                    i34 = i11;
                                    break;
                                }
                            case 12:
                                bArr2 = bArr;
                                i22 = i42;
                                i23 = iP;
                                unsafe2 = unsafe5;
                                aVar2 = aVar;
                                if (i46 != 0) {
                                    unsafe4 = unsafe2;
                                    oVar3 = oVar4;
                                    i25 = i23;
                                    i24 = i22;
                                    t10 = t12;
                                    unsafe = unsafe4;
                                    i17 = i24;
                                    i37 = i25;
                                    i36 = i44;
                                    i38 = i21;
                                    oVar = oVar3;
                                    i39 = i20;
                                    u0Var = u0Var2;
                                    break;
                                } else {
                                    i35 = e.i(bArr2, i22, aVar2);
                                    int i55 = aVar2.f6647a;
                                    y.b bVarJ = u0Var2.j(i23);
                                    if (bVarJ != null && !bVarJ.a()) {
                                        m(t12).c(i43, Long.valueOf(i55));
                                        i34 = i11;
                                        aVar5 = aVar2;
                                        i40 = i43;
                                        i37 = i23;
                                        i36 = i44;
                                        unsafe5 = unsafe2;
                                        bArr5 = bArr2;
                                        i38 = i21;
                                        i39 = i20;
                                        break;
                                    } else {
                                        unsafe2.putInt(t12, j10, i55);
                                        i26 = i20 | i51;
                                        aVar5 = aVar2;
                                        i40 = i43;
                                        i37 = i23;
                                        i36 = i44;
                                        unsafe5 = unsafe2;
                                        bArr5 = bArr2;
                                        i38 = i21;
                                        i39 = i26;
                                        i34 = i11;
                                        break;
                                    }
                                }
                            case 15:
                                bArr2 = bArr;
                                i22 = i42;
                                i23 = iP;
                                unsafe2 = unsafe5;
                                aVar2 = aVar;
                                if (i46 != 0) {
                                    unsafe4 = unsafe2;
                                    oVar3 = oVar4;
                                    i25 = i23;
                                    i24 = i22;
                                    t10 = t12;
                                    unsafe = unsafe4;
                                    i17 = i24;
                                    i37 = i25;
                                    i36 = i44;
                                    i38 = i21;
                                    oVar = oVar3;
                                    i39 = i20;
                                    u0Var = u0Var2;
                                    break;
                                } else {
                                    i35 = e.i(bArr2, i22, aVar2);
                                    unsafe2.putInt(t12, j10, i.b(aVar2.f6647a));
                                    i26 = i20 | i51;
                                    aVar5 = aVar2;
                                    i40 = i43;
                                    i37 = i23;
                                    i36 = i44;
                                    unsafe5 = unsafe2;
                                    bArr5 = bArr2;
                                    i38 = i21;
                                    i39 = i26;
                                    i34 = i11;
                                    break;
                                }
                            case 16:
                                i22 = i42;
                                int i56 = iP;
                                if (i46 != 0) {
                                    unsafe4 = unsafe5;
                                    oVar3 = oVar4;
                                    i25 = i56;
                                    i24 = i22;
                                    t10 = t12;
                                    unsafe = unsafe4;
                                    i17 = i24;
                                    i37 = i25;
                                    i36 = i44;
                                    i38 = i21;
                                    oVar = oVar3;
                                    i39 = i20;
                                    u0Var = u0Var2;
                                    break;
                                } else {
                                    int iK3 = e.k(bArr, i22, aVar);
                                    T t16 = t12;
                                    Unsafe unsafe8 = unsafe5;
                                    unsafe8.putLong(t16, j10, i.c(aVar.f6648b));
                                    t12 = t16;
                                    i34 = i11;
                                    aVar5 = aVar;
                                    i40 = i43;
                                    i36 = i44;
                                    unsafe5 = unsafe8;
                                    bArr5 = bArr;
                                    i38 = i21;
                                    i39 = i20 | i51;
                                    i35 = iK3;
                                    i37 = i56;
                                    break;
                                }
                            case 17:
                                if (i46 != 3) {
                                    i24 = i42;
                                    oVar3 = oVar4;
                                    unsafe4 = unsafe5;
                                    i25 = iP;
                                    t10 = t12;
                                    unsafe = unsafe4;
                                    i17 = i24;
                                    i37 = i25;
                                    i36 = i44;
                                    i38 = i21;
                                    oVar = oVar3;
                                    i39 = i20;
                                    u0Var = u0Var2;
                                    break;
                                } else {
                                    Object objW2 = u0Var2.w(t12, iP);
                                    int i57 = iP;
                                    int iF = ((u0) u0Var2.l(iP)).F(objW2, bArr, i42, i11, (i44 << 3) | 4, aVar);
                                    bArr2 = bArr;
                                    aVar.f6649c = objW2;
                                    u0Var2.Q(t12, i57, objW2);
                                    i26 = i20 | i51;
                                    aVar5 = aVar;
                                    i40 = i43;
                                    i37 = i57;
                                    i36 = i44;
                                    i35 = iF;
                                    bArr5 = bArr2;
                                    i38 = i21;
                                    i39 = i26;
                                    i34 = i11;
                                    break;
                                }
                            default:
                                i24 = i42;
                                oVar3 = oVar4;
                                unsafe4 = unsafe5;
                                i25 = iP;
                                t10 = t12;
                                unsafe = unsafe4;
                                i17 = i24;
                                i37 = i25;
                                i36 = i44;
                                i38 = i21;
                                oVar = oVar3;
                                i39 = i20;
                                u0Var = u0Var2;
                                break;
                        }
                    } else {
                        o oVar5 = oVar4;
                        int i58 = iP;
                        Unsafe unsafe9 = unsafe5;
                        if (iS != 27) {
                            i28 = i42;
                            if (iS <= 49) {
                                int i59 = i38;
                                i30 = i58;
                                unsafe = unsafe9;
                                i29 = i59;
                                i32 = i39;
                                oVar = oVar5;
                                int iH2 = u0Var2.H(t3, bArr, i28, i11, i43, i44, i46, i30, i49, iS, j10, aVar);
                                i33 = i43;
                                i31 = i44;
                                if (iH2 != i28) {
                                    u0Var2 = this;
                                    t12 = t3;
                                    bArr5 = bArr;
                                    i34 = i11;
                                    aVar5 = aVar;
                                    i35 = iH2;
                                    i37 = i30;
                                    i36 = i31;
                                    i40 = i33;
                                } else {
                                    i17 = iH2;
                                    i37 = i30;
                                    i36 = i31;
                                    i18 = i33;
                                    i38 = i29;
                                    i39 = i32;
                                    u0Var = this;
                                    t10 = t3;
                                    if (i18 == i12 || i12 == 0) {
                                        if (u0Var.f6780f) {
                                            oVar2 = oVar;
                                        } else {
                                            oVar2 = oVar;
                                            if (oVar2 != o.a() && oVar2.f6734a.get(new o.a(i36, u0Var.f6779e)) != null) {
                                                w.c cVar = (w.c) t10;
                                                s<w.d> sVar = cVar.extensions;
                                                if (!sVar.f6759b) {
                                                    throw null;
                                                }
                                                cVar.extensions = sVar.clone();
                                                throw null;
                                            }
                                            iG = e.g(i18, bArr, i17, i11, m(t10), aVar);
                                            i19 = i11;
                                            i35 = iG;
                                            bArr5 = bArr;
                                            aVar5 = aVar;
                                            i40 = i18;
                                            u0Var2 = u0Var;
                                            t12 = t10;
                                            oVar4 = oVar2;
                                            i34 = i19;
                                            unsafe5 = unsafe;
                                        }
                                        iG = e.g(i18, bArr, i17, i11, m(t10), aVar);
                                        i19 = i11;
                                        i35 = iG;
                                        bArr5 = bArr;
                                        aVar5 = aVar;
                                        i40 = i18;
                                        u0Var2 = u0Var;
                                        t12 = t10;
                                        oVar4 = oVar2;
                                        i34 = i19;
                                        unsafe5 = unsafe;
                                    } else {
                                        i13 = i11;
                                        i15 = i18;
                                        i14 = i17;
                                    }
                                }
                            } else {
                                i29 = i38;
                                i30 = i58;
                                unsafe = unsafe9;
                                i31 = i44;
                                i32 = i39;
                                oVar = oVar5;
                                i33 = i43;
                                if (iS != 50) {
                                    i36 = i31;
                                    int iE = E(t3, bArr, i28, i11, i33, i36, i46, i49, iS, j10, i30, aVar);
                                    u0Var = this;
                                    t10 = t3;
                                    i18 = i33;
                                    if (iE != i28) {
                                        bArr5 = bArr;
                                        i34 = i11;
                                        aVar5 = aVar;
                                        i40 = i18;
                                        i35 = iE;
                                        i37 = i30;
                                        u0Var2 = u0Var;
                                        t12 = t10;
                                    } else {
                                        i17 = iE;
                                        i37 = i30;
                                        i38 = i29;
                                        i39 = i32;
                                        if (i18 == i12) {
                                        }
                                        if (u0Var.f6780f) {
                                        }
                                        iG = e.g(i18, bArr, i17, i11, m(t10), aVar);
                                        i19 = i11;
                                        i35 = iG;
                                        bArr5 = bArr;
                                        aVar5 = aVar;
                                        i40 = i18;
                                        u0Var2 = u0Var;
                                        t12 = t10;
                                        oVar4 = oVar2;
                                        i34 = i19;
                                        unsafe5 = unsafe;
                                    }
                                } else if (i46 == 2) {
                                    D(t3, bArr, i28, i11, i30, j10, aVar);
                                    throw null;
                                }
                            }
                            i38 = i29;
                            i39 = i32;
                            oVar4 = oVar;
                            unsafe5 = unsafe;
                        } else if (i46 == 2) {
                            y.c cVarMutableCopyWithCapacity = (y.c) unsafe9.getObject(t12, j10);
                            if (!cVarMutableCopyWithCapacity.isModifiable()) {
                                int size = cVarMutableCopyWithCapacity.size();
                                cVarMutableCopyWithCapacity = cVarMutableCopyWithCapacity.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
                                unsafe9.putObject(t12, j10, cVarMutableCopyWithCapacity);
                            }
                            unsafe5 = unsafe9;
                            i34 = i11;
                            aVar5 = aVar;
                            i35 = e.d(u0Var2.l(i58), i43, bArr, i42, i11, cVarMutableCopyWithCapacity, aVar);
                            i40 = i43;
                            i37 = i58;
                            i36 = i44;
                            oVar4 = oVar5;
                            t12 = t3;
                            bArr5 = bArr;
                        } else {
                            i28 = i42;
                            i29 = i38;
                            i30 = i58;
                            unsafe = unsafe9;
                            i33 = i43;
                            i31 = i44;
                            i32 = i39;
                            oVar = oVar5;
                        }
                        i17 = i28;
                        i37 = i30;
                        i36 = i31;
                        i18 = i33;
                        i38 = i29;
                        i39 = i32;
                        u0Var = this;
                        t10 = t3;
                        if (i18 == i12) {
                        }
                        if (u0Var.f6780f) {
                        }
                        iG = e.g(i18, bArr, i17, i11, m(t10), aVar);
                        i19 = i11;
                        i35 = iG;
                        bArr5 = bArr;
                        aVar5 = aVar;
                        i40 = i18;
                        u0Var2 = u0Var;
                        t12 = t10;
                        oVar4 = oVar2;
                        i34 = i19;
                        unsafe5 = unsafe;
                    }
                }
                i18 = i43;
                if (i18 == i12) {
                }
                if (u0Var.f6780f) {
                }
                iG = e.g(i18, bArr, i17, i11, m(t10), aVar);
                i19 = i11;
                i35 = iG;
                bArr5 = bArr;
                aVar5 = aVar;
                i40 = i18;
                u0Var2 = u0Var;
                t12 = t10;
                oVar4 = oVar2;
                i34 = i19;
                unsafe5 = unsafe;
            } else {
                u0Var = u0Var2;
                i13 = i34;
                unsafe = unsafe5;
                t10 = t12;
                i14 = i35;
                i15 = i40;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:34:0x009b. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    public final void G(Object obj, byte[] bArr, int i10, int i11, e.a aVar) throws IOException {
        int i12;
        int iP;
        Unsafe unsafe;
        int i13;
        int i14;
        T t3;
        int i15;
        int i16;
        int i17;
        Unsafe unsafe2;
        T t10;
        Unsafe unsafe3;
        e.a aVar2;
        byte[] bArr2;
        int i18;
        byte[] bArr3;
        int i19;
        T t11;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        u0<T> u0Var = this;
        T t12 = obj;
        byte[] bArr4 = bArr;
        int i25 = i11;
        e.a aVar3 = aVar;
        h(t12);
        Unsafe unsafe4 = f6774r;
        int iA = i10;
        int i26 = -1;
        int i27 = 0;
        int i28 = 1048575;
        int i29 = 0;
        while (iA < i25) {
            int iH = iA + 1;
            int i30 = bArr4[iA];
            if (i30 < 0) {
                iH = e.h(i30, bArr4, iH, aVar3);
                i30 = aVar3.f6647a;
            }
            int i31 = i30 >>> 3;
            int i32 = i30 & 7;
            int i33 = u0Var.f6778d;
            int i34 = u0Var.f6777c;
            if (i31 > i26) {
                iP = (i31 < i34 || i31 > i33) ? -1 : u0Var.P(i31, i27 / 3);
                i12 = 0;
            } else if (i31 < i34 || i31 > i33) {
                i12 = 0;
                iP = -1;
            } else {
                i12 = 0;
                iP = u0Var.P(i31, 0);
            }
            int i35 = iP;
            if (i35 == -1) {
                unsafe = unsafe4;
                i13 = i30;
                i14 = i12;
                t3 = t12;
                i15 = iH;
                i16 = i31;
            } else {
                int[] iArr = u0Var.f6775a;
                int i36 = iArr[i35 + 1];
                int iS = S(i36);
                int i37 = i30;
                long j10 = i36 & 1048575;
                if (iS <= 17) {
                    int i38 = iArr[i35 + 2];
                    int i39 = 1 << (i38 >>> 20);
                    int i40 = i38 & 1048575;
                    if (i40 != i28) {
                        int i41 = 1048575;
                        i17 = i36;
                        if (i28 != 1048575) {
                            unsafe4.putInt(t12, i28, i29);
                            i41 = 1048575;
                        }
                        if (i40 != i41) {
                            i29 = unsafe4.getInt(t12, i40);
                        }
                        i28 = i40;
                    } else {
                        i17 = i36;
                    }
                    switch (iS) {
                        case 0:
                            unsafe3 = unsafe4;
                            aVar2 = aVar3;
                            bArr2 = bArr4;
                            i18 = iH;
                            if (i32 != 1) {
                                t10 = t12;
                                i13 = i37;
                                t3 = t10;
                                i15 = i18;
                                unsafe = unsafe3;
                                i14 = i35;
                                i16 = i31;
                                break;
                            } else {
                                r1.f6751c.m(t12, j10, Double.longBitsToDouble(e.c(bArr2, i18)));
                                iA = i18 + 8;
                                i29 |= i39;
                                unsafe4 = unsafe3;
                                i27 = i35;
                                bArr4 = bArr2;
                                i26 = i31;
                                i25 = i11;
                                aVar3 = aVar2;
                                break;
                            }
                        case 1:
                            unsafe3 = unsafe4;
                            aVar2 = aVar3;
                            bArr2 = bArr4;
                            i18 = iH;
                            if (i32 != 5) {
                                t10 = t12;
                                i13 = i37;
                                t3 = t10;
                                i15 = i18;
                                unsafe = unsafe3;
                                i14 = i35;
                                i16 = i31;
                                break;
                            } else {
                                r1.f6751c.n(t12, j10, Float.intBitsToFloat(e.b(bArr2, i18)));
                                iA = i18 + 4;
                                i29 |= i39;
                                unsafe4 = unsafe3;
                                i27 = i35;
                                bArr4 = bArr2;
                                i26 = i31;
                                i25 = i11;
                                aVar3 = aVar2;
                                break;
                            }
                        case 2:
                        case 3:
                            aVar2 = aVar3;
                            bArr2 = bArr4;
                            i18 = iH;
                            if (i32 != 0) {
                                unsafe3 = unsafe4;
                                t10 = t12;
                                i13 = i37;
                                t3 = t10;
                                i15 = i18;
                                unsafe = unsafe3;
                                i14 = i35;
                                i16 = i31;
                                break;
                            } else {
                                int iK = e.k(bArr2, i18, aVar2);
                                unsafe4.putLong(t12, j10, aVar2.f6648b);
                                i29 |= i39;
                                iA = iK;
                                i27 = i35;
                                bArr4 = bArr2;
                                i26 = i31;
                                i25 = i11;
                                aVar3 = aVar2;
                                break;
                            }
                        case 4:
                        case 11:
                            aVar2 = aVar3;
                            bArr3 = bArr4;
                            i18 = iH;
                            if (i32 != 0) {
                                unsafe3 = unsafe4;
                                t10 = t12;
                                i13 = i37;
                                t3 = t10;
                                i15 = i18;
                                unsafe = unsafe3;
                                i14 = i35;
                                i16 = i31;
                                break;
                            } else {
                                int i42 = e.i(bArr3, i18, aVar2);
                                unsafe4.putInt(t12, j10, aVar2.f6647a);
                                i29 |= i39;
                                i25 = i11;
                                iA = i42;
                                i27 = i35;
                                bArr4 = bArr3;
                                i26 = i31;
                                aVar3 = aVar2;
                                break;
                            }
                        case 5:
                        case 14:
                            unsafe3 = unsafe4;
                            int i43 = iH;
                            aVar2 = aVar3;
                            bArr3 = bArr4;
                            T t13 = t12;
                            if (i32 != 1) {
                                t12 = t13;
                                i18 = i43;
                                t10 = t12;
                                i13 = i37;
                                t3 = t10;
                                i15 = i18;
                                unsafe = unsafe3;
                                i14 = i35;
                                i16 = i31;
                                break;
                            } else {
                                long jC = e.c(bArr3, i43);
                                t12 = t13;
                                unsafe4 = unsafe3;
                                unsafe4.putLong(t12, j10, jC);
                                iA = i43 + 8;
                                i29 |= i39;
                                i25 = i11;
                                i27 = i35;
                                bArr4 = bArr3;
                                i26 = i31;
                                aVar3 = aVar2;
                                break;
                            }
                        case 6:
                        case 13:
                            unsafe3 = unsafe4;
                            i19 = iH;
                            aVar2 = aVar3;
                            bArr2 = bArr4;
                            t11 = t12;
                            if (i32 != 5) {
                                T t14 = t11;
                                i18 = i19;
                                t10 = t14;
                                i13 = i37;
                                t3 = t10;
                                i15 = i18;
                                unsafe = unsafe3;
                                i14 = i35;
                                i16 = i31;
                                break;
                            } else {
                                unsafe3.putInt(t11, j10, e.b(bArr2, i19));
                                iA = i19 + 4;
                                i29 |= i39;
                                t12 = t11;
                                unsafe4 = unsafe3;
                                i27 = i35;
                                bArr4 = bArr2;
                                i26 = i31;
                                i25 = i11;
                                aVar3 = aVar2;
                                break;
                            }
                        case 7:
                            unsafe3 = unsafe4;
                            i19 = iH;
                            aVar2 = aVar3;
                            bArr2 = bArr4;
                            t11 = t12;
                            if (i32 != 0) {
                                T t142 = t11;
                                i18 = i19;
                                t10 = t142;
                                i13 = i37;
                                t3 = t10;
                                i15 = i18;
                                unsafe = unsafe3;
                                i14 = i35;
                                i16 = i31;
                                break;
                            } else {
                                iA = e.k(bArr2, i19, aVar2);
                                r1.f6751c.k(t11, j10, aVar2.f6648b != 0);
                                i29 |= i39;
                                t12 = t11;
                                unsafe4 = unsafe3;
                                i27 = i35;
                                bArr4 = bArr2;
                                i26 = i31;
                                i25 = i11;
                                aVar3 = aVar2;
                                break;
                            }
                        case 8:
                            unsafe3 = unsafe4;
                            i19 = iH;
                            aVar2 = aVar3;
                            bArr2 = bArr4;
                            t11 = t12;
                            if (i32 != 2) {
                                T t1422 = t11;
                                i18 = i19;
                                t10 = t1422;
                                i13 = i37;
                                t3 = t10;
                                i15 = i18;
                                unsafe = unsafe3;
                                i14 = i35;
                                i16 = i31;
                                break;
                            } else {
                                iA = (i17 & PKIFailureInfo.duplicateCertReq) == 0 ? e.e(bArr2, i19, aVar2) : e.f(bArr2, i19, aVar2);
                                unsafe3.putObject(t11, j10, aVar2.f6649c);
                                i29 |= i39;
                                t12 = t11;
                                unsafe4 = unsafe3;
                                i27 = i35;
                                bArr4 = bArr2;
                                i26 = i31;
                                i25 = i11;
                                aVar3 = aVar2;
                                break;
                            }
                        case 9:
                            T t15 = t12;
                            Unsafe unsafe5 = unsafe4;
                            t10 = t15;
                            if (i32 != 2) {
                                unsafe3 = unsafe5;
                                i18 = iH;
                                i13 = i37;
                                t3 = t10;
                                i15 = i18;
                                unsafe = unsafe3;
                                i14 = i35;
                                i16 = i31;
                                break;
                            } else {
                                Object objW = u0Var.w(t10, i35);
                                byte[] bArr5 = bArr4;
                                t11 = t10;
                                int i44 = i25;
                                unsafe3 = unsafe5;
                                int i45 = iH;
                                e.a aVar4 = aVar3;
                                int iL = e.l(objW, u0Var.l(i35), bArr5, i45, i44, aVar4);
                                bArr2 = bArr5;
                                aVar2 = aVar4;
                                u0Var.Q(t11, i35, objW);
                                i29 |= i39;
                                iA = iL;
                                t12 = t11;
                                unsafe4 = unsafe3;
                                i27 = i35;
                                bArr4 = bArr2;
                                i26 = i31;
                                i25 = i11;
                                aVar3 = aVar2;
                                break;
                            }
                        case 10:
                            T t16 = t12;
                            unsafe2 = unsafe4;
                            t10 = t16;
                            if (i32 != 2) {
                                unsafe3 = unsafe2;
                                i18 = iH;
                                i13 = i37;
                                t3 = t10;
                                i15 = i18;
                                unsafe = unsafe3;
                                i14 = i35;
                                i16 = i31;
                                break;
                            } else {
                                iA = e.a(bArr4, iH, aVar3);
                                unsafe2.putObject(t10, j10, aVar3.f6649c);
                                i29 |= i39;
                                Unsafe unsafe6 = unsafe2;
                                t12 = t10;
                                unsafe4 = unsafe6;
                                i27 = i35;
                                i26 = i31;
                                break;
                            }
                        case 12:
                            T t17 = t12;
                            unsafe2 = unsafe4;
                            t10 = t17;
                            if (i32 != 0) {
                                unsafe3 = unsafe2;
                                i18 = iH;
                                i13 = i37;
                                t3 = t10;
                                i15 = i18;
                                unsafe = unsafe3;
                                i14 = i35;
                                i16 = i31;
                                break;
                            } else {
                                iA = e.i(bArr4, iH, aVar3);
                                unsafe2.putInt(t10, j10, aVar3.f6647a);
                                i29 |= i39;
                                Unsafe unsafe62 = unsafe2;
                                t12 = t10;
                                unsafe4 = unsafe62;
                                i27 = i35;
                                i26 = i31;
                                break;
                            }
                        case 15:
                            T t18 = t12;
                            unsafe2 = unsafe4;
                            t10 = t18;
                            if (i32 != 0) {
                                unsafe3 = unsafe2;
                                i18 = iH;
                                i13 = i37;
                                t3 = t10;
                                i15 = i18;
                                unsafe = unsafe3;
                                i14 = i35;
                                i16 = i31;
                                break;
                            } else {
                                iA = e.i(bArr4, iH, aVar3);
                                unsafe2.putInt(t10, j10, i.b(aVar3.f6647a));
                                i29 |= i39;
                                Unsafe unsafe622 = unsafe2;
                                t12 = t10;
                                unsafe4 = unsafe622;
                                i27 = i35;
                                i26 = i31;
                                break;
                            }
                        case 16:
                            if (i32 != 0) {
                                T t19 = t12;
                                unsafe2 = unsafe4;
                                t10 = t19;
                                unsafe3 = unsafe2;
                                i18 = iH;
                                i13 = i37;
                                t3 = t10;
                                i15 = i18;
                                unsafe = unsafe3;
                                i14 = i35;
                                i16 = i31;
                                break;
                            } else {
                                int iK2 = e.k(bArr4, iH, aVar3);
                                unsafe4.putLong(t12, j10, i.c(aVar3.f6648b));
                                i29 |= i39;
                                t12 = t12;
                                unsafe4 = unsafe4;
                                iA = iK2;
                                i27 = i35;
                                i26 = i31;
                                break;
                            }
                        default:
                            unsafe3 = unsafe4;
                            t10 = t12;
                            i18 = iH;
                            i13 = i37;
                            t3 = t10;
                            i15 = i18;
                            unsafe = unsafe3;
                            i14 = i35;
                            i16 = i31;
                            break;
                    }
                } else {
                    Unsafe unsafe7 = unsafe4;
                    T t20 = t12;
                    byte[] bArr6 = bArr4;
                    int i46 = iH;
                    if (iS != 27) {
                        if (iS <= 49) {
                            i14 = i35;
                            i22 = i28;
                            unsafe = unsafe7;
                            i20 = i29;
                            int iH2 = u0Var.H(obj, bArr, i46, i11, i37, i31, i32, i14, i36, iS, j10, aVar);
                            i21 = i37;
                            i23 = i31;
                            if (iH2 != i46) {
                                u0Var = this;
                                t12 = obj;
                                aVar3 = aVar;
                                iA = iH2;
                                i27 = i14;
                                i26 = i23;
                            } else {
                                i15 = iH2;
                                i16 = i23;
                                i13 = i21;
                                i28 = i22;
                                i29 = i20;
                                t3 = obj;
                            }
                        } else {
                            unsafe = unsafe7;
                            i14 = i35;
                            i20 = i29;
                            i21 = i37;
                            i22 = i28;
                            i23 = i31;
                            i24 = i46;
                            if (iS == 50) {
                                if (i32 == 2) {
                                    D(obj, bArr, i24, i11, i14, j10, aVar);
                                    throw null;
                                }
                                i15 = i24;
                                i16 = i23;
                                i13 = i21;
                                i28 = i22;
                                i29 = i20;
                                t3 = obj;
                            } else {
                                i16 = i23;
                                i13 = i21;
                                int iE = E(obj, bArr, i24, i11, i13, i16, i32, i36, iS, j10, i14, aVar);
                                t3 = obj;
                                i14 = i14;
                                if (iE != i24) {
                                    u0Var = this;
                                    aVar3 = aVar;
                                    i26 = i16;
                                    iA = iE;
                                    i27 = i14;
                                    t12 = t3;
                                } else {
                                    i15 = iE;
                                    i28 = i22;
                                    i29 = i20;
                                }
                            }
                        }
                        i28 = i22;
                        i29 = i20;
                        unsafe4 = unsafe;
                        bArr4 = bArr;
                        i25 = i11;
                    } else if (i32 == 2) {
                        y.c cVarMutableCopyWithCapacity = (y.c) unsafe7.getObject(t20, j10);
                        if (!cVarMutableCopyWithCapacity.isModifiable()) {
                            int size = cVarMutableCopyWithCapacity.size();
                            cVarMutableCopyWithCapacity = cVarMutableCopyWithCapacity.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
                            unsafe7.putObject(t20, j10, cVarMutableCopyWithCapacity);
                        }
                        int iD = e.d(u0Var.l(i35), i37, bArr6, i46, i11, cVarMutableCopyWithCapacity, aVar);
                        t12 = obj;
                        bArr4 = bArr;
                        aVar3 = aVar;
                        iA = iD;
                        unsafe4 = unsafe7;
                        i27 = i35;
                        i26 = i31;
                        i25 = i11;
                    } else {
                        i24 = i46;
                        unsafe = unsafe7;
                        i14 = i35;
                        i22 = i28;
                        i20 = i29;
                        i23 = i31;
                        i21 = i37;
                        i15 = i24;
                        i16 = i23;
                        i13 = i21;
                        i28 = i22;
                        i29 = i20;
                        t3 = obj;
                    }
                }
            }
            int iG = e.g(i13, bArr, i15, i11, m(t3), aVar);
            bArr4 = bArr;
            aVar3 = aVar;
            i26 = i16;
            i27 = i14;
            t12 = t3;
            unsafe4 = unsafe;
            i25 = i11;
            iA = iG;
            u0Var = this;
        }
        Unsafe unsafe8 = unsafe4;
        T t21 = t12;
        int i47 = i25;
        int i48 = i28;
        int i49 = i29;
        if (i48 != 1048575) {
            unsafe8.putInt(t21, i48, i49);
        }
        if (iA != i47) {
            throw z.f();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    public final int H(T t3, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, long j10, int i16, long j11, e.a aVar) throws IOException {
        int iJ;
        Unsafe unsafe = f6774r;
        y.c cVarMutableCopyWithCapacity = (y.c) unsafe.getObject(t3, j11);
        if (!cVarMutableCopyWithCapacity.isModifiable()) {
            int size = cVarMutableCopyWithCapacity.size();
            cVarMutableCopyWithCapacity = cVarMutableCopyWithCapacity.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
            unsafe.putObject(t3, j11, cVarMutableCopyWithCapacity);
        }
        y.c cVar = cVarMutableCopyWithCapacity;
        switch (i16) {
            case 18:
            case 35:
                if (i14 == 2) {
                    m mVar = (m) cVar;
                    int i17 = e.i(bArr, i10, aVar);
                    int i18 = aVar.f6647a + i17;
                    while (i17 < i18) {
                        mVar.addDouble(Double.longBitsToDouble(e.c(bArr, i17)));
                        i17 += 8;
                    }
                    if (i17 == i18) {
                        return i17;
                    }
                    throw z.g();
                }
                if (i14 == 1) {
                    m mVar2 = (m) cVar;
                    mVar2.addDouble(Double.longBitsToDouble(e.c(bArr, i10)));
                    i10 += 8;
                    while (i10 < i11) {
                        int i19 = e.i(bArr, i10, aVar);
                        if (i12 == aVar.f6647a) {
                            mVar2.addDouble(Double.longBitsToDouble(e.c(bArr, i19)));
                            i10 = i19 + 8;
                        }
                    }
                }
                return i10;
            case 19:
            case 36:
                if (i14 == 2) {
                    u uVar = (u) cVar;
                    int i20 = e.i(bArr, i10, aVar);
                    int i21 = aVar.f6647a + i20;
                    while (i20 < i21) {
                        uVar.addFloat(Float.intBitsToFloat(e.b(bArr, i20)));
                        i20 += 4;
                    }
                    if (i20 == i21) {
                        return i20;
                    }
                    throw z.g();
                }
                if (i14 == 5) {
                    u uVar2 = (u) cVar;
                    uVar2.addFloat(Float.intBitsToFloat(e.b(bArr, i10)));
                    int i22 = i10 + 4;
                    while (i22 < i11) {
                        int i23 = e.i(bArr, i22, aVar);
                        if (i12 != aVar.f6647a) {
                            return i22;
                        }
                        uVar2.addFloat(Float.intBitsToFloat(e.b(bArr, i23)));
                        i22 = i23 + 4;
                    }
                    return i22;
                }
                return i10;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i14 == 2) {
                    g0 g0Var = (g0) cVar;
                    int i24 = e.i(bArr, i10, aVar);
                    int i25 = aVar.f6647a + i24;
                    while (i24 < i25) {
                        i24 = e.k(bArr, i24, aVar);
                        g0Var.addLong(aVar.f6648b);
                    }
                    if (i24 == i25) {
                        return i24;
                    }
                    throw z.g();
                }
                if (i14 == 0) {
                    g0 g0Var2 = (g0) cVar;
                    int iK = e.k(bArr, i10, aVar);
                    g0Var2.addLong(aVar.f6648b);
                    while (iK < i11) {
                        int i26 = e.i(bArr, iK, aVar);
                        if (i12 != aVar.f6647a) {
                            return iK;
                        }
                        iK = e.k(bArr, i26, aVar);
                        g0Var2.addLong(aVar.f6648b);
                    }
                    return iK;
                }
                return i10;
            case 22:
            case 29:
            case 39:
            case EACTags.DATE_OF_BIRTH /* 43 */:
                if (i14 != 2) {
                    if (i14 == 0) {
                        return e.j(i12, bArr, i10, i11, cVar, aVar);
                    }
                    return i10;
                }
                x xVar = (x) cVar;
                int i27 = e.i(bArr, i10, aVar);
                int i28 = aVar.f6647a + i27;
                while (i27 < i28) {
                    i27 = e.i(bArr, i27, aVar);
                    xVar.addInt(aVar.f6647a);
                }
                if (i27 == i28) {
                    return i27;
                }
                throw z.g();
            case 23:
            case 32:
            case 40:
            case 46:
                if (i14 == 2) {
                    g0 g0Var3 = (g0) cVar;
                    int i29 = e.i(bArr, i10, aVar);
                    int i30 = aVar.f6647a + i29;
                    while (i29 < i30) {
                        g0Var3.addLong(e.c(bArr, i29));
                        i29 += 8;
                    }
                    if (i29 == i30) {
                        return i29;
                    }
                    throw z.g();
                }
                if (i14 == 1) {
                    g0 g0Var4 = (g0) cVar;
                    g0Var4.addLong(e.c(bArr, i10));
                    int i31 = i10 + 8;
                    while (i31 < i11) {
                        int i32 = e.i(bArr, i31, aVar);
                        if (i12 != aVar.f6647a) {
                            return i31;
                        }
                        g0Var4.addLong(e.c(bArr, i32));
                        i31 = i32 + 8;
                    }
                    return i31;
                }
                return i10;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i14 == 2) {
                    x xVar2 = (x) cVar;
                    int i33 = e.i(bArr, i10, aVar);
                    int i34 = aVar.f6647a + i33;
                    while (i33 < i34) {
                        xVar2.addInt(e.b(bArr, i33));
                        i33 += 4;
                    }
                    if (i33 == i34) {
                        return i33;
                    }
                    throw z.g();
                }
                if (i14 == 5) {
                    x xVar3 = (x) cVar;
                    xVar3.addInt(e.b(bArr, i10));
                    int i35 = i10 + 4;
                    while (i35 < i11) {
                        int i36 = e.i(bArr, i35, aVar);
                        if (i12 != aVar.f6647a) {
                            return i35;
                        }
                        xVar3.addInt(e.b(bArr, i36));
                        i35 = i36 + 4;
                    }
                    return i35;
                }
                return i10;
            case 25:
            case 42:
                if (i14 == 2) {
                    f fVar = (f) cVar;
                    int i37 = e.i(bArr, i10, aVar);
                    int i38 = aVar.f6647a + i37;
                    while (i37 < i38) {
                        i37 = e.k(bArr, i37, aVar);
                        fVar.addBoolean(aVar.f6648b != 0);
                    }
                    if (i37 == i38) {
                        return i37;
                    }
                    throw z.g();
                }
                if (i14 == 0) {
                    f fVar2 = (f) cVar;
                    int iK2 = e.k(bArr, i10, aVar);
                    fVar2.addBoolean(aVar.f6648b != 0);
                    while (iK2 < i11) {
                        int i39 = e.i(bArr, iK2, aVar);
                        if (i12 != aVar.f6647a) {
                            return iK2;
                        }
                        iK2 = e.k(bArr, i39, aVar);
                        fVar2.addBoolean(aVar.f6648b != 0);
                    }
                    return iK2;
                }
                return i10;
            case 26:
                if (i14 == 2) {
                    if ((j10 & 536870912) == 0) {
                        int i40 = e.i(bArr, i10, aVar);
                        int i41 = aVar.f6647a;
                        if (i41 < 0) {
                            throw z.e();
                        }
                        if (i41 == 0) {
                            cVar.add("");
                        } else {
                            cVar.add(new String(bArr, i40, i41, y.f6818a));
                            i40 += i41;
                        }
                        while (i40 < i11) {
                            int i42 = e.i(bArr, i40, aVar);
                            if (i12 != aVar.f6647a) {
                                return i40;
                            }
                            i40 = e.i(bArr, i42, aVar);
                            int i43 = aVar.f6647a;
                            if (i43 < 0) {
                                throw z.e();
                            }
                            if (i43 == 0) {
                                cVar.add("");
                            } else {
                                cVar.add(new String(bArr, i40, i43, y.f6818a));
                                i40 += i43;
                            }
                        }
                        return i40;
                    }
                    int i44 = e.i(bArr, i10, aVar);
                    int i45 = aVar.f6647a;
                    if (i45 < 0) {
                        throw z.e();
                    }
                    if (i45 == 0) {
                        cVar.add("");
                    } else {
                        int i46 = i44 + i45;
                        if (!s1.f6761a.c(bArr, i44, i46)) {
                            throw z.b();
                        }
                        cVar.add(new String(bArr, i44, i45, y.f6818a));
                        i44 = i46;
                    }
                    while (i44 < i11) {
                        int i47 = e.i(bArr, i44, aVar);
                        if (i12 != aVar.f6647a) {
                            return i44;
                        }
                        i44 = e.i(bArr, i47, aVar);
                        int i48 = aVar.f6647a;
                        if (i48 < 0) {
                            throw z.e();
                        }
                        if (i48 == 0) {
                            cVar.add("");
                        } else {
                            int i49 = i44 + i48;
                            if (!s1.f6761a.c(bArr, i44, i49)) {
                                throw z.b();
                            }
                            cVar.add(new String(bArr, i44, i48, y.f6818a));
                            i44 = i49;
                        }
                    }
                    return i44;
                }
                return i10;
            case 27:
                if (i14 == 2) {
                    return e.d(l(i15), i12, bArr, i10, i11, cVar, aVar);
                }
                return i10;
            case 28:
                if (i14 == 2) {
                    int i50 = e.i(bArr, i10, aVar);
                    int i51 = aVar.f6647a;
                    if (i51 < 0) {
                        throw z.e();
                    }
                    if (i51 > bArr.length - i50) {
                        throw z.g();
                    }
                    if (i51 == 0) {
                        cVar.add(h.f6665b);
                    } else {
                        cVar.add(h.c(i50, i51, bArr));
                        i50 += i51;
                    }
                    while (i50 < i11) {
                        int i52 = e.i(bArr, i50, aVar);
                        if (i12 != aVar.f6647a) {
                            return i50;
                        }
                        i50 = e.i(bArr, i52, aVar);
                        int i53 = aVar.f6647a;
                        if (i53 < 0) {
                            throw z.e();
                        }
                        if (i53 > bArr.length - i50) {
                            throw z.g();
                        }
                        if (i53 == 0) {
                            cVar.add(h.f6665b);
                        } else {
                            cVar.add(h.c(i50, i53, bArr));
                            i50 += i53;
                        }
                    }
                    return i50;
                }
                return i10;
            case 30:
            case 44:
                if (i14 != 2) {
                    if (i14 == 0) {
                        iJ = e.j(i12, bArr, i10, i11, cVar, aVar);
                    }
                    return i10;
                }
                x xVar4 = (x) cVar;
                iJ = e.i(bArr, i10, aVar);
                int i54 = aVar.f6647a + iJ;
                while (iJ < i54) {
                    iJ = e.i(bArr, iJ, aVar);
                    xVar4.addInt(aVar.f6647a);
                }
                if (iJ != i54) {
                    throw z.g();
                }
                h1.w(t3, i13, cVar, j(i15), null, this.f6788n);
                return iJ;
            case 33:
            case EACTags.PIN_USAGE_POLICY /* 47 */:
                if (i14 == 2) {
                    x xVar5 = (x) cVar;
                    int i55 = e.i(bArr, i10, aVar);
                    int i56 = aVar.f6647a + i55;
                    while (i55 < i56) {
                        i55 = e.i(bArr, i55, aVar);
                        xVar5.addInt(i.b(aVar.f6647a));
                    }
                    if (i55 == i56) {
                        return i55;
                    }
                    throw z.g();
                }
                if (i14 == 0) {
                    x xVar6 = (x) cVar;
                    int i57 = e.i(bArr, i10, aVar);
                    xVar6.addInt(i.b(aVar.f6647a));
                    while (i57 < i11) {
                        int i58 = e.i(bArr, i57, aVar);
                        if (i12 != aVar.f6647a) {
                            return i57;
                        }
                        i57 = e.i(bArr, i58, aVar);
                        xVar6.addInt(i.b(aVar.f6647a));
                    }
                    return i57;
                }
                return i10;
            case 34:
            case 48:
                if (i14 == 2) {
                    g0 g0Var5 = (g0) cVar;
                    int i59 = e.i(bArr, i10, aVar);
                    int i60 = aVar.f6647a + i59;
                    while (i59 < i60) {
                        i59 = e.k(bArr, i59, aVar);
                        g0Var5.addLong(i.c(aVar.f6648b));
                    }
                    if (i59 == i60) {
                        return i59;
                    }
                    throw z.g();
                }
                if (i14 == 0) {
                    g0 g0Var6 = (g0) cVar;
                    int iK3 = e.k(bArr, i10, aVar);
                    g0Var6.addLong(i.c(aVar.f6648b));
                    while (iK3 < i11) {
                        int i61 = e.i(bArr, iK3, aVar);
                        if (i12 != aVar.f6647a) {
                            return iK3;
                        }
                        iK3 = e.k(bArr, i61, aVar);
                        g0Var6.addLong(i.c(aVar.f6648b));
                    }
                    return iK3;
                }
                return i10;
            case 49:
                if (i14 == 3) {
                    g1 g1VarL = l(i15);
                    int i62 = (i12 & (-8)) | 4;
                    Object objNewInstance = g1VarL.newInstance();
                    u0 u0Var = (u0) g1VarL;
                    int iF = u0Var.F(objNewInstance, bArr, i10, i11, i62, aVar);
                    int i63 = i62;
                    aVar.f6649c = objNewInstance;
                    g1VarL.makeImmutable(objNewInstance);
                    aVar.f6649c = objNewInstance;
                    cVar.add(objNewInstance);
                    while (iF < i11) {
                        int i64 = e.i(bArr, iF, aVar);
                        if (i12 != aVar.f6647a) {
                            return iF;
                        }
                        Object objNewInstance2 = g1VarL.newInstance();
                        int i65 = i63;
                        iF = u0Var.F(objNewInstance2, bArr, i64, i11, i65, aVar);
                        aVar.f6649c = objNewInstance2;
                        g1VarL.makeImmutable(objNewInstance2);
                        aVar.f6649c = objNewInstance2;
                        cVar.add(objNewInstance2);
                        i63 = i65;
                    }
                    return iF;
                }
                return i10;
            default:
                return i10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void I(Object obj, long j10, j jVar, g1 g1Var, o oVar) throws IOException {
        int iX;
        List listC = this.f6787m.c(obj, j10);
        i iVar = jVar.f6697a;
        int i10 = jVar.f6698b;
        if ((i10 & 7) != 3) {
            throw z.c();
        }
        do {
            Object objNewInstance = g1Var.newInstance();
            jVar.b(objNewInstance, g1Var, oVar);
            g1Var.makeImmutable(objNewInstance);
            listC.add(objNewInstance);
            if (iVar.e() || jVar.f6700d != 0) {
                return;
            } else {
                iX = iVar.x();
            }
        } while (iX == i10);
        jVar.f6700d = iX;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void J(Object obj, int i10, j jVar, g1 g1Var, o oVar) throws IOException {
        int iX;
        List listC = this.f6787m.c(obj, i10 & 1048575);
        i iVar = jVar.f6697a;
        int i11 = jVar.f6698b;
        if ((i11 & 7) != 2) {
            throw z.c();
        }
        do {
            Object objNewInstance = g1Var.newInstance();
            jVar.c(objNewInstance, g1Var, oVar);
            g1Var.makeImmutable(objNewInstance);
            listC.add(objNewInstance);
            if (iVar.e() || jVar.f6700d != 0) {
                return;
            } else {
                iX = iVar.x();
            }
        } while (iX == i11);
        jVar.f6700d = iX;
    }

    public final void K(Object obj, int i10, j jVar) throws IOException {
        if ((536870912 & i10) != 0) {
            jVar.v(2);
            r1.p(obj, i10 & 1048575, jVar.f6697a.w());
        } else if (!this.f6781g) {
            r1.p(obj, i10 & 1048575, jVar.e());
        } else {
            jVar.v(2);
            r1.p(obj, i10 & 1048575, jVar.f6697a.v());
        }
    }

    public final void L(Object obj, int i10, j jVar) throws IOException {
        int i11 = 536870912 & i10;
        f0 f0Var = this.f6787m;
        if (i11 != 0) {
            jVar.r(f0Var.c(obj, i10 & 1048575), true);
        } else {
            jVar.r(f0Var.c(obj, i10 & 1048575), false);
        }
    }

    public final void N(T t3, int i10) {
        int i11 = this.f6775a[i10 + 2];
        long j10 = 1048575 & i11;
        if (j10 == 1048575) {
            return;
        }
        r1.n(t3, j10, (1 << (i11 >>> 20)) | r1.f6751c.g(t3, j10));
    }

    public final void O(T t3, int i10, int i11) {
        r1.n(t3, this.f6775a[i11 + 2] & 1048575, i10);
    }

    public final int P(int i10, int i11) {
        int[] iArr = this.f6775a;
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

    public final void Q(T t3, int i10, Object obj) {
        f6774r.putObject(t3, T(i10) & 1048575, obj);
        N(t3, i10);
    }

    public final void R(T t3, int i10, int i11, Object obj) {
        f6774r.putObject(t3, T(i11) & 1048575, obj);
        O(t3, i10, i11);
    }

    public final int T(int i10) {
        return this.f6775a[i10 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1, types: [long] */
    /* JADX WARN: Type inference failed for: r19v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U(T t3, v1 v1Var) throws IOException {
        Map.Entry entry;
        boolean z10;
        int i10;
        boolean z11;
        boolean z12 = this.f6780f;
        p<?> pVar = this.f6789o;
        if (z12) {
            s sVarC = pVar.c(t3);
            entry = !sVarC.f6758a.isEmpty() ? (Map.Entry) sVarC.f().next() : null;
        }
        int[] iArr = this.f6775a;
        int length = iArr.length;
        Unsafe unsafe = f6774r;
        int i11 = 0;
        int i12 = 1048575;
        int i13 = 0;
        while (i11 < length) {
            int iT = T(i11);
            int i14 = iArr[i11];
            int iS = S(iT);
            if (iS <= 17) {
                int i15 = iArr[i11 + 2];
                z10 = 1;
                int i16 = i15 & 1048575;
                if (i16 != i12) {
                    i13 = unsafe.getInt(t3, i16);
                    i12 = i16;
                }
                i10 = 1 << (i15 >>> 20);
            } else {
                z10 = 1;
                i10 = 0;
            }
            if (entry != null) {
                pVar.a(entry);
                if (i14 >= 0) {
                    pVar.j(entry);
                    throw null;
                }
            }
            int i17 = iT & 1048575;
            int[] iArr2 = iArr;
            long j10 = i17;
            switch (iS) {
                case 0:
                    if ((i10 & i13) == 0) {
                        break;
                    } else {
                        double dE = r1.f6751c.e(t3, j10);
                        k kVar = ((l) v1Var).f6726a;
                        kVar.getClass();
                        kVar.Z(i14, Double.doubleToRawLongBits(dE));
                        break;
                    }
                case 1:
                    if ((i10 & i13) == 0) {
                        break;
                    } else {
                        float f10 = r1.f6751c.f(t3, j10);
                        k kVar2 = ((l) v1Var).f6726a;
                        kVar2.getClass();
                        kVar2.X(i14, Float.floatToRawIntBits(f10));
                        break;
                    }
                case 2:
                    if ((i10 & i13) == 0) {
                        break;
                    } else {
                        ((l) v1Var).f6726a.k0(i14, unsafe.getLong(t3, j10));
                        break;
                    }
                case 3:
                    if ((i10 & i13) == 0) {
                        break;
                    } else {
                        ((l) v1Var).f6726a.k0(i14, unsafe.getLong(t3, j10));
                        break;
                    }
                case 4:
                    if ((i10 & i13) == 0) {
                        break;
                    } else {
                        ((l) v1Var).f6726a.b0(i14, unsafe.getInt(t3, j10));
                        break;
                    }
                case 5:
                    if ((i10 & i13) == 0) {
                        break;
                    } else {
                        ((l) v1Var).f6726a.Z(i14, unsafe.getLong(t3, j10));
                        break;
                    }
                case 6:
                    if ((i10 & i13) == 0) {
                        break;
                    } else {
                        ((l) v1Var).f6726a.X(i14, unsafe.getInt(t3, j10));
                        break;
                    }
                case 7:
                    if ((i10 & i13) == 0) {
                        break;
                    } else {
                        ((l) v1Var).f6726a.V(i14, r1.f6751c.c(t3, j10));
                        break;
                    }
                case 8:
                    if ((i10 & i13) == 0) {
                        break;
                    } else {
                        W(i14, unsafe.getObject(t3, j10), v1Var);
                        break;
                    }
                case 9:
                    if ((i10 & i13) == 0) {
                        break;
                    } else {
                        ((l) v1Var).f6726a.d0(i14, (p0) unsafe.getObject(t3, j10), l(i11));
                        break;
                    }
                case 10:
                    if ((i10 & i13) == 0) {
                        break;
                    } else {
                        ((l) v1Var).a(i14, (h) unsafe.getObject(t3, j10));
                        break;
                    }
                case 11:
                    if ((i10 & i13) == 0) {
                        break;
                    } else {
                        ((l) v1Var).f6726a.i0(i14, unsafe.getInt(t3, j10));
                        break;
                    }
                case 12:
                    if ((i10 & i13) == 0) {
                        break;
                    } else {
                        ((l) v1Var).f6726a.b0(i14, unsafe.getInt(t3, j10));
                        break;
                    }
                case 13:
                    if ((i10 & i13) == 0) {
                        break;
                    } else {
                        ((l) v1Var).f6726a.X(i14, unsafe.getInt(t3, j10));
                        break;
                    }
                case 14:
                    if ((i10 & i13) == 0) {
                        break;
                    } else {
                        ((l) v1Var).f6726a.Z(i14, unsafe.getLong(t3, j10));
                        break;
                    }
                case 15:
                    if ((i10 & i13) == 0) {
                        break;
                    } else {
                        int i18 = unsafe.getInt(t3, j10);
                        ((l) v1Var).f6726a.i0(i14, (i18 >> 31) ^ (i18 << 1));
                        break;
                    }
                case 16:
                    if ((i10 & i13) == 0) {
                        break;
                    } else {
                        long j11 = unsafe.getLong(t3, j10);
                        ((l) v1Var).f6726a.k0(i14, (j11 << 1) ^ (j11 >> 63));
                        break;
                    }
                case 17:
                    z11 = false;
                    if ((i10 & i13) != 0) {
                        ((l) v1Var).b(i14, unsafe.getObject(t3, j10), l(i11));
                    }
                    break;
                case 18:
                    z11 = false;
                    h1.D(iArr2[i11], (List) unsafe.getObject(t3, j10), v1Var, false);
                    break;
                case 19:
                    z11 = false;
                    h1.H(iArr2[i11], (List) unsafe.getObject(t3, j10), v1Var, false);
                    break;
                case 20:
                    z11 = false;
                    h1.K(iArr2[i11], (List) unsafe.getObject(t3, j10), v1Var, false);
                    break;
                case 21:
                    z11 = false;
                    h1.S(iArr2[i11], (List) unsafe.getObject(t3, j10), v1Var, false);
                    break;
                case 22:
                    z11 = false;
                    h1.J(iArr2[i11], (List) unsafe.getObject(t3, j10), v1Var, false);
                    break;
                case 23:
                    z11 = false;
                    h1.G(iArr2[i11], (List) unsafe.getObject(t3, j10), v1Var, false);
                    break;
                case 24:
                    z11 = false;
                    h1.F(iArr2[i11], (List) unsafe.getObject(t3, j10), v1Var, false);
                    break;
                case 25:
                    z11 = false;
                    h1.B(iArr2[i11], (List) unsafe.getObject(t3, j10), v1Var, false);
                    break;
                case 26:
                    h1.Q(iArr2[i11], (List) unsafe.getObject(t3, j10), v1Var);
                    break;
                case 27:
                    h1.L(iArr2[i11], (List) unsafe.getObject(t3, j10), v1Var, l(i11));
                    break;
                case 28:
                    h1.C(iArr2[i11], (List) unsafe.getObject(t3, j10), v1Var);
                    break;
                case 29:
                    z11 = false;
                    h1.R(iArr2[i11], (List) unsafe.getObject(t3, j10), v1Var, false);
                    break;
                case 30:
                    z11 = false;
                    h1.E(iArr2[i11], (List) unsafe.getObject(t3, j10), v1Var, false);
                    break;
                case 31:
                    z11 = false;
                    h1.M(iArr2[i11], (List) unsafe.getObject(t3, j10), v1Var, false);
                    break;
                case 32:
                    z11 = false;
                    h1.N(iArr2[i11], (List) unsafe.getObject(t3, j10), v1Var, false);
                    break;
                case 33:
                    z11 = false;
                    h1.O(iArr2[i11], (List) unsafe.getObject(t3, j10), v1Var, false);
                    break;
                case 34:
                    z11 = false;
                    h1.P(iArr2[i11], (List) unsafe.getObject(t3, j10), v1Var, false);
                    break;
                case 35:
                    h1.D(iArr2[i11], (List) unsafe.getObject(t3, j10), v1Var, z10);
                    break;
                case 36:
                    h1.H(iArr2[i11], (List) unsafe.getObject(t3, j10), v1Var, z10);
                    break;
                case 37:
                    h1.K(iArr2[i11], (List) unsafe.getObject(t3, j10), v1Var, z10);
                    break;
                case 38:
                    h1.S(iArr2[i11], (List) unsafe.getObject(t3, j10), v1Var, z10);
                    break;
                case 39:
                    h1.J(iArr2[i11], (List) unsafe.getObject(t3, j10), v1Var, z10);
                    break;
                case 40:
                    h1.G(iArr2[i11], (List) unsafe.getObject(t3, j10), v1Var, z10);
                    break;
                case 41:
                    h1.F(iArr2[i11], (List) unsafe.getObject(t3, j10), v1Var, z10);
                    break;
                case 42:
                    h1.B(iArr2[i11], (List) unsafe.getObject(t3, j10), v1Var, z10);
                    break;
                case EACTags.DATE_OF_BIRTH /* 43 */:
                    h1.R(iArr2[i11], (List) unsafe.getObject(t3, j10), v1Var, z10);
                    break;
                case 44:
                    h1.E(iArr2[i11], (List) unsafe.getObject(t3, j10), v1Var, z10);
                    break;
                case 45:
                    h1.M(iArr2[i11], (List) unsafe.getObject(t3, j10), v1Var, z10);
                    break;
                case 46:
                    h1.N(iArr2[i11], (List) unsafe.getObject(t3, j10), v1Var, z10);
                    break;
                case EACTags.PIN_USAGE_POLICY /* 47 */:
                    h1.O(iArr2[i11], (List) unsafe.getObject(t3, j10), v1Var, z10);
                    break;
                case 48:
                    h1.P(iArr2[i11], (List) unsafe.getObject(t3, j10), v1Var, z10);
                    break;
                case 49:
                    h1.I(iArr2[i11], (List) unsafe.getObject(t3, j10), v1Var, l(i11));
                    break;
                case 50:
                    V(v1Var, i14, unsafe.getObject(t3, j10), i11);
                    break;
                case EACTags.TRANSACTION_DATE /* 51 */:
                    if (r(t3, i14, i11)) {
                        double dDoubleValue = ((Double) r1.f6751c.i(t3, j10)).doubleValue();
                        k kVar3 = ((l) v1Var).f6726a;
                        kVar3.getClass();
                        kVar3.Z(i14, Double.doubleToRawLongBits(dDoubleValue));
                    }
                    break;
                case 52:
                    if (r(t3, i14, i11)) {
                        float fFloatValue = ((Float) r1.f6751c.i(t3, j10)).floatValue();
                        k kVar4 = ((l) v1Var).f6726a;
                        kVar4.getClass();
                        kVar4.X(i14, Float.floatToRawIntBits(fFloatValue));
                    }
                    break;
                case EACTags.SEX /* 53 */:
                    if (r(t3, i14, i11)) {
                        ((l) v1Var).f6726a.k0(i14, C(t3, j10));
                    }
                    break;
                case EACTags.CURRENCY_EXPONENT /* 54 */:
                    if (r(t3, i14, i11)) {
                        ((l) v1Var).f6726a.k0(i14, C(t3, j10));
                    }
                    break;
                case 55:
                    if (r(t3, i14, i11)) {
                        ((l) v1Var).f6726a.b0(i14, B(t3, j10));
                    }
                    break;
                case 56:
                    if (r(t3, i14, i11)) {
                        ((l) v1Var).f6726a.Z(i14, C(t3, j10));
                    }
                    break;
                case 57:
                    if (r(t3, i14, i11)) {
                        ((l) v1Var).f6726a.X(i14, B(t3, j10));
                    }
                    break;
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    if (r(t3, i14, i11)) {
                        ((l) v1Var).f6726a.V(i14, ((Boolean) r1.f6751c.i(t3, j10)).booleanValue());
                    }
                    break;
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (r(t3, i14, i11)) {
                        W(i14, unsafe.getObject(t3, j10), v1Var);
                    }
                    break;
                case 60:
                    if (r(t3, i14, i11)) {
                        ((l) v1Var).f6726a.d0(i14, (p0) unsafe.getObject(t3, j10), l(i11));
                    }
                    break;
                case 61:
                    if (r(t3, i14, i11)) {
                        ((l) v1Var).a(i14, (h) unsafe.getObject(t3, j10));
                    }
                    break;
                case 62:
                    if (r(t3, i14, i11)) {
                        ((l) v1Var).f6726a.i0(i14, B(t3, j10));
                    }
                    break;
                case 63:
                    if (r(t3, i14, i11)) {
                        ((l) v1Var).f6726a.b0(i14, B(t3, j10));
                    }
                    break;
                case 64:
                    if (r(t3, i14, i11)) {
                        ((l) v1Var).f6726a.X(i14, B(t3, j10));
                    }
                    break;
                case EACTags.ELEMENT_LIST /* 65 */:
                    if (r(t3, i14, i11)) {
                        ((l) v1Var).f6726a.Z(i14, C(t3, j10));
                    }
                    break;
                case EACTags.ADDRESS /* 66 */:
                    if (r(t3, i14, i11)) {
                        int iB = B(t3, j10);
                        ((l) v1Var).f6726a.i0(i14, (iB >> 31) ^ (iB << 1));
                    }
                    break;
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (r(t3, i14, i11)) {
                        long jC = C(t3, j10);
                        ((l) v1Var).f6726a.k0(i14, (jC << z10) ^ (jC >> 63));
                    }
                    break;
                case 68:
                    if (r(t3, i14, i11)) {
                        ((l) v1Var).b(i14, unsafe.getObject(t3, j10), l(i11));
                    }
                    break;
            }
            i11 += 3;
            iArr = iArr2;
        }
        if (entry != null) {
            pVar.j(entry);
            throw null;
        }
        n1<?, ?> n1Var = this.f6788n;
        n1Var.r(n1Var.g(t3), v1Var);
    }

    public final <K, V> void V(v1 v1Var, int i10, Object obj, int i11) throws IOException {
        if (obj != null) {
            Object objK = k(i11);
            k0 k0Var = this.f6790p;
            k0Var.forMapMetadata(objK);
            j0 j0VarForMapData = k0Var.forMapData(obj);
            k kVar = ((l) v1Var).f6726a;
            kVar.getClass();
            Iterator<Map.Entry<K, V>> it = j0VarForMapData.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                kVar.h0(i10, 2);
                next.getKey();
                next.getValue();
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    @Override // com.google.crypto.tink.shaded.protobuf.g1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(w wVar, w wVar2) {
        int[] iArr = this.f6775a;
        int length = iArr.length;
        int i10 = 0;
        while (true) {
            boolean z10 = true;
            if (i10 < length) {
                int iT = T(i10);
                long j10 = iT & 1048575;
                switch (S(iT)) {
                    case 0:
                        if (g(wVar, wVar2, i10)) {
                            r1.e eVar = r1.f6751c;
                            if (Double.doubleToLongBits(eVar.e(wVar, j10)) != Double.doubleToLongBits(eVar.e(wVar2, j10))) {
                                z10 = false;
                                break;
                            }
                        }
                        break;
                    case 1:
                        if (g(wVar, wVar2, i10)) {
                            r1.e eVar2 = r1.f6751c;
                            if (Float.floatToIntBits(eVar2.f(wVar, j10)) != Float.floatToIntBits(eVar2.f(wVar2, j10))) {
                            }
                        }
                        break;
                    case 2:
                        if (g(wVar, wVar2, i10)) {
                            r1.e eVar3 = r1.f6751c;
                            if (eVar3.h(wVar, j10) != eVar3.h(wVar2, j10)) {
                            }
                        }
                        break;
                    case 3:
                        if (g(wVar, wVar2, i10)) {
                            r1.e eVar4 = r1.f6751c;
                            if (eVar4.h(wVar, j10) != eVar4.h(wVar2, j10)) {
                            }
                        }
                        break;
                    case 4:
                        if (g(wVar, wVar2, i10)) {
                            r1.e eVar5 = r1.f6751c;
                            if (eVar5.g(wVar, j10) != eVar5.g(wVar2, j10)) {
                            }
                        }
                        break;
                    case 5:
                        if (g(wVar, wVar2, i10)) {
                            r1.e eVar6 = r1.f6751c;
                            if (eVar6.h(wVar, j10) != eVar6.h(wVar2, j10)) {
                            }
                        }
                        break;
                    case 6:
                        if (g(wVar, wVar2, i10)) {
                            r1.e eVar7 = r1.f6751c;
                            if (eVar7.g(wVar, j10) != eVar7.g(wVar2, j10)) {
                            }
                        }
                        break;
                    case 7:
                        if (g(wVar, wVar2, i10)) {
                            r1.e eVar8 = r1.f6751c;
                            if (eVar8.c(wVar, j10) != eVar8.c(wVar2, j10)) {
                            }
                        }
                        break;
                    case 8:
                        if (g(wVar, wVar2, i10)) {
                            r1.e eVar9 = r1.f6751c;
                            if (!h1.z(eVar9.i(wVar, j10), eVar9.i(wVar2, j10))) {
                            }
                        }
                        break;
                    case 9:
                        if (g(wVar, wVar2, i10)) {
                            r1.e eVar10 = r1.f6751c;
                            if (!h1.z(eVar10.i(wVar, j10), eVar10.i(wVar2, j10))) {
                            }
                        }
                        break;
                    case 10:
                        if (g(wVar, wVar2, i10)) {
                            r1.e eVar11 = r1.f6751c;
                            if (!h1.z(eVar11.i(wVar, j10), eVar11.i(wVar2, j10))) {
                            }
                        }
                        break;
                    case 11:
                        if (g(wVar, wVar2, i10)) {
                            r1.e eVar12 = r1.f6751c;
                            if (eVar12.g(wVar, j10) != eVar12.g(wVar2, j10)) {
                            }
                        }
                        break;
                    case 12:
                        if (g(wVar, wVar2, i10)) {
                            r1.e eVar13 = r1.f6751c;
                            if (eVar13.g(wVar, j10) != eVar13.g(wVar2, j10)) {
                            }
                        }
                        break;
                    case 13:
                        if (g(wVar, wVar2, i10)) {
                            r1.e eVar14 = r1.f6751c;
                            if (eVar14.g(wVar, j10) != eVar14.g(wVar2, j10)) {
                            }
                        }
                        break;
                    case 14:
                        if (g(wVar, wVar2, i10)) {
                            r1.e eVar15 = r1.f6751c;
                            if (eVar15.h(wVar, j10) != eVar15.h(wVar2, j10)) {
                            }
                        }
                        break;
                    case 15:
                        if (g(wVar, wVar2, i10)) {
                            r1.e eVar16 = r1.f6751c;
                            if (eVar16.g(wVar, j10) != eVar16.g(wVar2, j10)) {
                            }
                        }
                        break;
                    case 16:
                        if (g(wVar, wVar2, i10)) {
                            r1.e eVar17 = r1.f6751c;
                            if (eVar17.h(wVar, j10) != eVar17.h(wVar2, j10)) {
                            }
                        }
                        break;
                    case 17:
                        if (g(wVar, wVar2, i10)) {
                            r1.e eVar18 = r1.f6751c;
                            if (!h1.z(eVar18.i(wVar, j10), eVar18.i(wVar2, j10))) {
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
                        r1.e eVar19 = r1.f6751c;
                        z10 = h1.z(eVar19.i(wVar, j10), eVar19.i(wVar2, j10));
                        break;
                    case 50:
                        r1.e eVar20 = r1.f6751c;
                        z10 = h1.z(eVar20.i(wVar, j10), eVar20.i(wVar2, j10));
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
                        r1.e eVar21 = r1.f6751c;
                        if (eVar21.g(wVar, j11) != eVar21.g(wVar2, j11) || !h1.z(eVar21.i(wVar, j10), eVar21.i(wVar2, j10))) {
                        }
                        break;
                }
                if (z10) {
                    i10 += 3;
                }
            } else {
                n1<?, ?> n1Var = this.f6788n;
                if (n1Var.g(wVar).equals(n1Var.g(wVar2))) {
                    if (!this.f6780f) {
                        return true;
                    }
                    p<?> pVar = this.f6789o;
                    return pVar.c(wVar).equals(pVar.c(wVar2));
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1 A[PHI: r3
      0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0216, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.crypto.tink.shaded.protobuf.g1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(w wVar) {
        int i10;
        int iB;
        int i11;
        int[] iArr = this.f6775a;
        int length = iArr.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int iT = T(i13);
            int i14 = iArr[i13];
            long j10 = 1048575 & iT;
            int i15 = 1237;
            int iHashCode = 37;
            switch (S(iT)) {
                case 0:
                    i10 = i12 * 53;
                    iB = y.b(Double.doubleToLongBits(r1.f6751c.e(wVar, j10)));
                    i12 = iB + i10;
                    break;
                case 1:
                    i10 = i12 * 53;
                    iB = Float.floatToIntBits(r1.f6751c.f(wVar, j10));
                    i12 = iB + i10;
                    break;
                case 2:
                    i10 = i12 * 53;
                    iB = y.b(r1.f6751c.h(wVar, j10));
                    i12 = iB + i10;
                    break;
                case 3:
                    i10 = i12 * 53;
                    iB = y.b(r1.f6751c.h(wVar, j10));
                    i12 = iB + i10;
                    break;
                case 4:
                    i10 = i12 * 53;
                    iB = r1.f6751c.g(wVar, j10);
                    i12 = iB + i10;
                    break;
                case 5:
                    i10 = i12 * 53;
                    iB = y.b(r1.f6751c.h(wVar, j10));
                    i12 = iB + i10;
                    break;
                case 6:
                    i10 = i12 * 53;
                    iB = r1.f6751c.g(wVar, j10);
                    i12 = iB + i10;
                    break;
                case 7:
                    i11 = i12 * 53;
                    boolean zC = r1.f6751c.c(wVar, j10);
                    Charset charset = y.f6818a;
                    if (zC) {
                        i15 = 1231;
                    }
                    i12 = i15 + i11;
                    break;
                case 8:
                    i10 = i12 * 53;
                    iB = ((String) r1.f6751c.i(wVar, j10)).hashCode();
                    i12 = iB + i10;
                    break;
                case 9:
                    Object objI = r1.f6751c.i(wVar, j10);
                    if (objI != null) {
                        iHashCode = objI.hashCode();
                    }
                    i12 = (i12 * 53) + iHashCode;
                    break;
                case 10:
                    i10 = i12 * 53;
                    iB = r1.f6751c.i(wVar, j10).hashCode();
                    i12 = iB + i10;
                    break;
                case 11:
                    i10 = i12 * 53;
                    iB = r1.f6751c.g(wVar, j10);
                    i12 = iB + i10;
                    break;
                case 12:
                    i10 = i12 * 53;
                    iB = r1.f6751c.g(wVar, j10);
                    i12 = iB + i10;
                    break;
                case 13:
                    i10 = i12 * 53;
                    iB = r1.f6751c.g(wVar, j10);
                    i12 = iB + i10;
                    break;
                case 14:
                    i10 = i12 * 53;
                    iB = y.b(r1.f6751c.h(wVar, j10));
                    i12 = iB + i10;
                    break;
                case 15:
                    i10 = i12 * 53;
                    iB = r1.f6751c.g(wVar, j10);
                    i12 = iB + i10;
                    break;
                case 16:
                    i10 = i12 * 53;
                    iB = y.b(r1.f6751c.h(wVar, j10));
                    i12 = iB + i10;
                    break;
                case 17:
                    Object objI2 = r1.f6751c.i(wVar, j10);
                    if (objI2 != null) {
                        iHashCode = objI2.hashCode();
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
                    iB = r1.f6751c.i(wVar, j10).hashCode();
                    i12 = iB + i10;
                    break;
                case 50:
                    i10 = i12 * 53;
                    iB = r1.f6751c.i(wVar, j10).hashCode();
                    i12 = iB + i10;
                    break;
                case EACTags.TRANSACTION_DATE /* 51 */:
                    if (r(wVar, i14, i13)) {
                        i10 = i12 * 53;
                        iB = y.b(Double.doubleToLongBits(((Double) r1.f6751c.i(wVar, j10)).doubleValue()));
                        i12 = iB + i10;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (r(wVar, i14, i13)) {
                        i10 = i12 * 53;
                        iB = Float.floatToIntBits(((Float) r1.f6751c.i(wVar, j10)).floatValue());
                        i12 = iB + i10;
                        break;
                    } else {
                        break;
                    }
                case EACTags.SEX /* 53 */:
                    if (r(wVar, i14, i13)) {
                        i10 = i12 * 53;
                        iB = y.b(C(wVar, j10));
                        i12 = iB + i10;
                        break;
                    } else {
                        break;
                    }
                case EACTags.CURRENCY_EXPONENT /* 54 */:
                    if (r(wVar, i14, i13)) {
                        i10 = i12 * 53;
                        iB = y.b(C(wVar, j10));
                        i12 = iB + i10;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (r(wVar, i14, i13)) {
                        i10 = i12 * 53;
                        iB = B(wVar, j10);
                        i12 = iB + i10;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (r(wVar, i14, i13)) {
                        i10 = i12 * 53;
                        iB = y.b(C(wVar, j10));
                        i12 = iB + i10;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (r(wVar, i14, i13)) {
                        i10 = i12 * 53;
                        iB = B(wVar, j10);
                        i12 = iB + i10;
                        break;
                    } else {
                        break;
                    }
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    if (r(wVar, i14, i13)) {
                        i11 = i12 * 53;
                        boolean zBooleanValue = ((Boolean) r1.f6751c.i(wVar, j10)).booleanValue();
                        Charset charset2 = y.f6818a;
                        if (zBooleanValue) {
                        }
                        i12 = i15 + i11;
                        break;
                    } else {
                        break;
                    }
                    break;
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (r(wVar, i14, i13)) {
                        i10 = i12 * 53;
                        iB = ((String) r1.f6751c.i(wVar, j10)).hashCode();
                        i12 = iB + i10;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (r(wVar, i14, i13)) {
                        i10 = i12 * 53;
                        iB = r1.f6751c.i(wVar, j10).hashCode();
                        i12 = iB + i10;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (r(wVar, i14, i13)) {
                        i10 = i12 * 53;
                        iB = r1.f6751c.i(wVar, j10).hashCode();
                        i12 = iB + i10;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (r(wVar, i14, i13)) {
                        i10 = i12 * 53;
                        iB = B(wVar, j10);
                        i12 = iB + i10;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (r(wVar, i14, i13)) {
                        i10 = i12 * 53;
                        iB = B(wVar, j10);
                        i12 = iB + i10;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (r(wVar, i14, i13)) {
                        i10 = i12 * 53;
                        iB = B(wVar, j10);
                        i12 = iB + i10;
                        break;
                    } else {
                        break;
                    }
                case EACTags.ELEMENT_LIST /* 65 */:
                    if (r(wVar, i14, i13)) {
                        i10 = i12 * 53;
                        iB = y.b(C(wVar, j10));
                        i12 = iB + i10;
                        break;
                    } else {
                        break;
                    }
                case EACTags.ADDRESS /* 66 */:
                    if (r(wVar, i14, i13)) {
                        i10 = i12 * 53;
                        iB = B(wVar, j10);
                        i12 = iB + i10;
                        break;
                    } else {
                        break;
                    }
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (r(wVar, i14, i13)) {
                        i10 = i12 * 53;
                        iB = y.b(C(wVar, j10));
                        i12 = iB + i10;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (r(wVar, i14, i13)) {
                        i10 = i12 * 53;
                        iB = r1.f6751c.i(wVar, j10).hashCode();
                        i12 = iB + i10;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = this.f6788n.g(wVar).hashCode() + (i12 * 53);
        if (!this.f6780f) {
            return iHashCode2;
        }
        return this.f6789o.c(wVar).f6758a.hashCode() + (iHashCode2 * 53);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public final void c(T t3, byte[] bArr, int i10, int i11, e.a aVar) throws IOException {
        if (this.f6782h) {
            G(t3, bArr, i10, i11, aVar);
        } else {
            F(t3, bArr, i10, i11, 0, aVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    @Override // com.google.crypto.tink.shaded.protobuf.g1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(T t3, v1 v1Var) throws Throwable {
        Map.Entry entry;
        Throwable th2;
        p<?> pVar;
        v1Var.getClass();
        if (!this.f6782h) {
            U(t3, v1Var);
            return;
        }
        boolean z10 = this.f6780f;
        Throwable th3 = null;
        p<?> pVar2 = this.f6789o;
        if (z10) {
            s<T> sVarC = pVar2.c(t3);
            entry = !sVarC.f6758a.isEmpty() ? (Map.Entry) sVarC.f().next() : null;
        }
        int[] iArr = this.f6775a;
        int length = iArr.length;
        int i10 = 0;
        while (i10 < length) {
            int iT = T(i10);
            int i11 = iArr[i10];
            if (entry != null) {
                pVar2.a(entry);
                if (i11 >= 0) {
                    pVar2.j(entry);
                    throw th3;
                }
            }
            switch (S(iT)) {
                case 0:
                    th2 = th3;
                    pVar = pVar2;
                    if (p(t3, i10)) {
                        double dE = r1.f6751c.e(t3, iT & 1048575);
                        k kVar = ((l) v1Var).f6726a;
                        kVar.getClass();
                        kVar.Z(i11, Double.doubleToRawLongBits(dE));
                        continue;
                    }
                    i10 += 3;
                    th3 = th2;
                    pVar2 = pVar;
                case 1:
                    th2 = th3;
                    pVar = pVar2;
                    if (p(t3, i10)) {
                        float f10 = r1.f6751c.f(t3, iT & 1048575);
                        k kVar2 = ((l) v1Var).f6726a;
                        kVar2.getClass();
                        kVar2.X(i11, Float.floatToRawIntBits(f10));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    th3 = th2;
                    pVar2 = pVar;
                case 2:
                    th2 = th3;
                    pVar = pVar2;
                    if (p(t3, i10)) {
                        ((l) v1Var).f6726a.k0(i11, r1.f6751c.h(t3, iT & 1048575));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    th3 = th2;
                    pVar2 = pVar;
                case 3:
                    th2 = th3;
                    pVar = pVar2;
                    if (p(t3, i10)) {
                        ((l) v1Var).f6726a.k0(i11, r1.f6751c.h(t3, iT & 1048575));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    th3 = th2;
                    pVar2 = pVar;
                case 4:
                    th2 = th3;
                    pVar = pVar2;
                    if (p(t3, i10)) {
                        ((l) v1Var).f6726a.b0(i11, r1.f6751c.g(t3, iT & 1048575));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    th3 = th2;
                    pVar2 = pVar;
                case 5:
                    th2 = th3;
                    pVar = pVar2;
                    if (p(t3, i10)) {
                        ((l) v1Var).f6726a.Z(i11, r1.f6751c.h(t3, iT & 1048575));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    th3 = th2;
                    pVar2 = pVar;
                case 6:
                    th2 = th3;
                    pVar = pVar2;
                    if (p(t3, i10)) {
                        ((l) v1Var).f6726a.X(i11, r1.f6751c.g(t3, iT & 1048575));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    th3 = th2;
                    pVar2 = pVar;
                case 7:
                    th2 = th3;
                    pVar = pVar2;
                    if (p(t3, i10)) {
                        ((l) v1Var).f6726a.V(i11, r1.f6751c.c(t3, iT & 1048575));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    th3 = th2;
                    pVar2 = pVar;
                case 8:
                    th2 = th3;
                    pVar = pVar2;
                    if (p(t3, i10)) {
                        W(i11, r1.f6751c.i(t3, iT & 1048575), v1Var);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    th3 = th2;
                    pVar2 = pVar;
                case 9:
                    th2 = th3;
                    pVar = pVar2;
                    if (p(t3, i10)) {
                        ((l) v1Var).f6726a.d0(i11, (p0) r1.f6751c.i(t3, iT & 1048575), l(i10));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    th3 = th2;
                    pVar2 = pVar;
                case 10:
                    th2 = th3;
                    pVar = pVar2;
                    if (p(t3, i10)) {
                        ((l) v1Var).a(i11, (h) r1.f6751c.i(t3, iT & 1048575));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    th3 = th2;
                    pVar2 = pVar;
                case 11:
                    th2 = th3;
                    pVar = pVar2;
                    if (p(t3, i10)) {
                        ((l) v1Var).f6726a.i0(i11, r1.f6751c.g(t3, iT & 1048575));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    th3 = th2;
                    pVar2 = pVar;
                case 12:
                    th2 = th3;
                    pVar = pVar2;
                    if (p(t3, i10)) {
                        ((l) v1Var).f6726a.b0(i11, r1.f6751c.g(t3, iT & 1048575));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    th3 = th2;
                    pVar2 = pVar;
                case 13:
                    th2 = th3;
                    pVar = pVar2;
                    if (p(t3, i10)) {
                        ((l) v1Var).f6726a.X(i11, r1.f6751c.g(t3, iT & 1048575));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    th3 = th2;
                    pVar2 = pVar;
                case 14:
                    th2 = th3;
                    pVar = pVar2;
                    if (p(t3, i10)) {
                        ((l) v1Var).f6726a.Z(i11, r1.f6751c.h(t3, iT & 1048575));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    th3 = th2;
                    pVar2 = pVar;
                case 15:
                    th2 = th3;
                    pVar = pVar2;
                    if (p(t3, i10)) {
                        int iG = r1.f6751c.g(t3, iT & 1048575);
                        ((l) v1Var).f6726a.i0(i11, (iG >> 31) ^ (iG << 1));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    th3 = th2;
                    pVar2 = pVar;
                case 16:
                    th2 = th3;
                    pVar = pVar2;
                    if (p(t3, i10)) {
                        long jH = r1.f6751c.h(t3, iT & 1048575);
                        ((l) v1Var).f6726a.k0(i11, (jH >> 63) ^ (jH << 1));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    th3 = th2;
                    pVar2 = pVar;
                case 17:
                    th2 = th3;
                    pVar = pVar2;
                    if (p(t3, i10)) {
                        ((l) v1Var).b(i11, r1.f6751c.i(t3, iT & 1048575), l(i10));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    th3 = th2;
                    pVar2 = pVar;
                case 18:
                    th2 = th3;
                    pVar = pVar2;
                    h1.D(iArr[i10], (List) r1.f6751c.i(t3, iT & 1048575), v1Var, false);
                    continue;
                    i10 += 3;
                    th3 = th2;
                    pVar2 = pVar;
                case 19:
                    th2 = th3;
                    pVar = pVar2;
                    h1.H(iArr[i10], (List) r1.f6751c.i(t3, iT & 1048575), v1Var, false);
                    continue;
                    i10 += 3;
                    th3 = th2;
                    pVar2 = pVar;
                case 20:
                    th2 = th3;
                    pVar = pVar2;
                    h1.K(iArr[i10], (List) r1.f6751c.i(t3, iT & 1048575), v1Var, false);
                    continue;
                    i10 += 3;
                    th3 = th2;
                    pVar2 = pVar;
                case 21:
                    th2 = th3;
                    pVar = pVar2;
                    h1.S(iArr[i10], (List) r1.f6751c.i(t3, iT & 1048575), v1Var, false);
                    continue;
                    i10 += 3;
                    th3 = th2;
                    pVar2 = pVar;
                case 22:
                    th2 = th3;
                    pVar = pVar2;
                    h1.J(iArr[i10], (List) r1.f6751c.i(t3, iT & 1048575), v1Var, false);
                    continue;
                    i10 += 3;
                    th3 = th2;
                    pVar2 = pVar;
                case 23:
                    th2 = th3;
                    pVar = pVar2;
                    h1.G(iArr[i10], (List) r1.f6751c.i(t3, iT & 1048575), v1Var, false);
                    continue;
                    i10 += 3;
                    th3 = th2;
                    pVar2 = pVar;
                case 24:
                    th2 = th3;
                    pVar = pVar2;
                    h1.F(iArr[i10], (List) r1.f6751c.i(t3, iT & 1048575), v1Var, false);
                    continue;
                    i10 += 3;
                    th3 = th2;
                    pVar2 = pVar;
                case 25:
                    th2 = th3;
                    pVar = pVar2;
                    h1.B(iArr[i10], (List) r1.f6751c.i(t3, iT & 1048575), v1Var, false);
                    continue;
                    i10 += 3;
                    th3 = th2;
                    pVar2 = pVar;
                case 26:
                    th2 = th3;
                    pVar = pVar2;
                    h1.Q(iArr[i10], (List) r1.f6751c.i(t3, iT & 1048575), v1Var);
                    continue;
                    i10 += 3;
                    th3 = th2;
                    pVar2 = pVar;
                case 27:
                    th2 = th3;
                    pVar = pVar2;
                    h1.L(iArr[i10], (List) r1.f6751c.i(t3, iT & 1048575), v1Var, l(i10));
                    continue;
                    i10 += 3;
                    th3 = th2;
                    pVar2 = pVar;
                case 28:
                    th2 = th3;
                    pVar = pVar2;
                    h1.C(iArr[i10], (List) r1.f6751c.i(t3, iT & 1048575), v1Var);
                    continue;
                    i10 += 3;
                    th3 = th2;
                    pVar2 = pVar;
                case 29:
                    th2 = th3;
                    pVar = pVar2;
                    h1.R(iArr[i10], (List) r1.f6751c.i(t3, iT & 1048575), v1Var, false);
                    continue;
                    i10 += 3;
                    th3 = th2;
                    pVar2 = pVar;
                case 30:
                    th2 = th3;
                    pVar = pVar2;
                    h1.E(iArr[i10], (List) r1.f6751c.i(t3, iT & 1048575), v1Var, false);
                    continue;
                    i10 += 3;
                    th3 = th2;
                    pVar2 = pVar;
                case 31:
                    th2 = th3;
                    pVar = pVar2;
                    h1.M(iArr[i10], (List) r1.f6751c.i(t3, iT & 1048575), v1Var, false);
                    continue;
                    i10 += 3;
                    th3 = th2;
                    pVar2 = pVar;
                case 32:
                    th2 = th3;
                    pVar = pVar2;
                    h1.N(iArr[i10], (List) r1.f6751c.i(t3, iT & 1048575), v1Var, false);
                    continue;
                    i10 += 3;
                    th3 = th2;
                    pVar2 = pVar;
                case 33:
                    th2 = th3;
                    pVar = pVar2;
                    h1.O(iArr[i10], (List) r1.f6751c.i(t3, iT & 1048575), v1Var, false);
                    continue;
                    i10 += 3;
                    th3 = th2;
                    pVar2 = pVar;
                case 34:
                    th2 = th3;
                    pVar = pVar2;
                    h1.P(iArr[i10], (List) r1.f6751c.i(t3, iT & 1048575), v1Var, false);
                    continue;
                    i10 += 3;
                    th3 = th2;
                    pVar2 = pVar;
                case 35:
                    th2 = th3;
                    pVar = pVar2;
                    h1.D(iArr[i10], (List) r1.f6751c.i(t3, iT & 1048575), v1Var, true);
                    continue;
                    i10 += 3;
                    th3 = th2;
                    pVar2 = pVar;
                case 36:
                    th2 = th3;
                    pVar = pVar2;
                    h1.H(iArr[i10], (List) r1.f6751c.i(t3, iT & 1048575), v1Var, true);
                    continue;
                    i10 += 3;
                    th3 = th2;
                    pVar2 = pVar;
                case 37:
                    th2 = th3;
                    pVar = pVar2;
                    h1.K(iArr[i10], (List) r1.f6751c.i(t3, iT & 1048575), v1Var, true);
                    continue;
                    i10 += 3;
                    th3 = th2;
                    pVar2 = pVar;
                case 38:
                    th2 = th3;
                    pVar = pVar2;
                    h1.S(iArr[i10], (List) r1.f6751c.i(t3, iT & 1048575), v1Var, true);
                    continue;
                    i10 += 3;
                    th3 = th2;
                    pVar2 = pVar;
                case 39:
                    th2 = th3;
                    pVar = pVar2;
                    h1.J(iArr[i10], (List) r1.f6751c.i(t3, iT & 1048575), v1Var, true);
                    continue;
                    i10 += 3;
                    th3 = th2;
                    pVar2 = pVar;
                case 40:
                    th2 = th3;
                    pVar = pVar2;
                    h1.G(iArr[i10], (List) r1.f6751c.i(t3, iT & 1048575), v1Var, true);
                    continue;
                    i10 += 3;
                    th3 = th2;
                    pVar2 = pVar;
                case 41:
                    th2 = th3;
                    pVar = pVar2;
                    h1.F(iArr[i10], (List) r1.f6751c.i(t3, iT & 1048575), v1Var, true);
                    continue;
                    i10 += 3;
                    th3 = th2;
                    pVar2 = pVar;
                case 42:
                    th2 = th3;
                    pVar = pVar2;
                    h1.B(iArr[i10], (List) r1.f6751c.i(t3, iT & 1048575), v1Var, true);
                    continue;
                    i10 += 3;
                    th3 = th2;
                    pVar2 = pVar;
                case EACTags.DATE_OF_BIRTH /* 43 */:
                    th2 = th3;
                    pVar = pVar2;
                    h1.R(iArr[i10], (List) r1.f6751c.i(t3, iT & 1048575), v1Var, true);
                    continue;
                    i10 += 3;
                    th3 = th2;
                    pVar2 = pVar;
                case 44:
                    th2 = th3;
                    pVar = pVar2;
                    h1.E(iArr[i10], (List) r1.f6751c.i(t3, iT & 1048575), v1Var, true);
                    continue;
                    i10 += 3;
                    th3 = th2;
                    pVar2 = pVar;
                case 45:
                    th2 = th3;
                    pVar = pVar2;
                    h1.M(iArr[i10], (List) r1.f6751c.i(t3, iT & 1048575), v1Var, true);
                    continue;
                    i10 += 3;
                    th3 = th2;
                    pVar2 = pVar;
                case 46:
                    th2 = th3;
                    pVar = pVar2;
                    h1.N(iArr[i10], (List) r1.f6751c.i(t3, iT & 1048575), v1Var, true);
                    continue;
                    i10 += 3;
                    th3 = th2;
                    pVar2 = pVar;
                case EACTags.PIN_USAGE_POLICY /* 47 */:
                    th2 = th3;
                    pVar = pVar2;
                    h1.O(iArr[i10], (List) r1.f6751c.i(t3, iT & 1048575), v1Var, true);
                    continue;
                    i10 += 3;
                    th3 = th2;
                    pVar2 = pVar;
                case 48:
                    th2 = th3;
                    pVar = pVar2;
                    h1.P(iArr[i10], (List) r1.f6751c.i(t3, iT & 1048575), v1Var, true);
                    continue;
                    i10 += 3;
                    th3 = th2;
                    pVar2 = pVar;
                case 49:
                    th2 = th3;
                    pVar = pVar2;
                    h1.I(iArr[i10], (List) r1.f6751c.i(t3, iT & 1048575), v1Var, l(i10));
                    continue;
                    i10 += 3;
                    th3 = th2;
                    pVar2 = pVar;
                case 50:
                    th2 = th3;
                    pVar = pVar2;
                    V(v1Var, i11, r1.f6751c.i(t3, iT & 1048575), i10);
                    continue;
                    i10 += 3;
                    th3 = th2;
                    pVar2 = pVar;
                case EACTags.TRANSACTION_DATE /* 51 */:
                    th2 = th3;
                    pVar = pVar2;
                    if (r(t3, i11, i10)) {
                        double dDoubleValue = ((Double) r1.f6751c.i(t3, iT & 1048575)).doubleValue();
                        k kVar3 = ((l) v1Var).f6726a;
                        kVar3.getClass();
                        kVar3.Z(i11, Double.doubleToRawLongBits(dDoubleValue));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    th3 = th2;
                    pVar2 = pVar;
                case 52:
                    th2 = th3;
                    pVar = pVar2;
                    if (r(t3, i11, i10)) {
                        float fFloatValue = ((Float) r1.f6751c.i(t3, iT & 1048575)).floatValue();
                        k kVar4 = ((l) v1Var).f6726a;
                        kVar4.getClass();
                        kVar4.X(i11, Float.floatToRawIntBits(fFloatValue));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    th3 = th2;
                    pVar2 = pVar;
                case EACTags.SEX /* 53 */:
                    th2 = th3;
                    pVar = pVar2;
                    if (r(t3, i11, i10)) {
                        ((l) v1Var).f6726a.k0(i11, C(t3, iT & 1048575));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    th3 = th2;
                    pVar2 = pVar;
                case EACTags.CURRENCY_EXPONENT /* 54 */:
                    th2 = th3;
                    pVar = pVar2;
                    if (r(t3, i11, i10)) {
                        ((l) v1Var).f6726a.k0(i11, C(t3, iT & 1048575));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    th3 = th2;
                    pVar2 = pVar;
                case 55:
                    th2 = th3;
                    pVar = pVar2;
                    if (r(t3, i11, i10)) {
                        ((l) v1Var).f6726a.b0(i11, B(t3, iT & 1048575));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    th3 = th2;
                    pVar2 = pVar;
                case 56:
                    th2 = th3;
                    pVar = pVar2;
                    if (r(t3, i11, i10)) {
                        ((l) v1Var).f6726a.Z(i11, C(t3, iT & 1048575));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    th3 = th2;
                    pVar2 = pVar;
                case 57:
                    th2 = th3;
                    pVar = pVar2;
                    if (r(t3, i11, i10)) {
                        ((l) v1Var).f6726a.X(i11, B(t3, iT & 1048575));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    th3 = th2;
                    pVar2 = pVar;
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    th2 = th3;
                    pVar = pVar2;
                    if (r(t3, i11, i10)) {
                        ((l) v1Var).f6726a.V(i11, ((Boolean) r1.f6751c.i(t3, iT & 1048575)).booleanValue());
                    } else {
                        continue;
                    }
                    i10 += 3;
                    th3 = th2;
                    pVar2 = pVar;
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    th2 = th3;
                    pVar = pVar2;
                    if (r(t3, i11, i10)) {
                        W(i11, r1.f6751c.i(t3, iT & 1048575), v1Var);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    th3 = th2;
                    pVar2 = pVar;
                case 60:
                    th2 = th3;
                    pVar = pVar2;
                    if (r(t3, i11, i10)) {
                        ((l) v1Var).f6726a.d0(i11, (p0) r1.f6751c.i(t3, iT & 1048575), l(i10));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    th3 = th2;
                    pVar2 = pVar;
                case 61:
                    th2 = th3;
                    pVar = pVar2;
                    if (r(t3, i11, i10)) {
                        ((l) v1Var).a(i11, (h) r1.f6751c.i(t3, iT & 1048575));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    th3 = th2;
                    pVar2 = pVar;
                case 62:
                    th2 = th3;
                    pVar = pVar2;
                    if (r(t3, i11, i10)) {
                        ((l) v1Var).f6726a.i0(i11, B(t3, iT & 1048575));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    th3 = th2;
                    pVar2 = pVar;
                case 63:
                    th2 = th3;
                    pVar = pVar2;
                    if (r(t3, i11, i10)) {
                        ((l) v1Var).f6726a.b0(i11, B(t3, iT & 1048575));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    th3 = th2;
                    pVar2 = pVar;
                case 64:
                    th2 = th3;
                    pVar = pVar2;
                    if (r(t3, i11, i10)) {
                        ((l) v1Var).f6726a.X(i11, B(t3, iT & 1048575));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    th3 = th2;
                    pVar2 = pVar;
                case EACTags.ELEMENT_LIST /* 65 */:
                    th2 = th3;
                    pVar = pVar2;
                    if (r(t3, i11, i10)) {
                        ((l) v1Var).f6726a.Z(i11, C(t3, iT & 1048575));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    th3 = th2;
                    pVar2 = pVar;
                case EACTags.ADDRESS /* 66 */:
                    th2 = th3;
                    pVar = pVar2;
                    if (r(t3, i11, i10)) {
                        int iB = B(t3, iT & 1048575);
                        ((l) v1Var).f6726a.i0(i11, (iB >> 31) ^ (iB << 1));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    th3 = th2;
                    pVar2 = pVar;
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (r(t3, i11, i10)) {
                        th2 = th3;
                        pVar = pVar2;
                        long jC = C(t3, iT & 1048575);
                        ((l) v1Var).f6726a.k0(i11, (jC >> 63) ^ (jC << 1));
                    }
                    i10 += 3;
                    th3 = th2;
                    pVar2 = pVar;
                    break;
                case 68:
                    if (r(t3, i11, i10)) {
                        ((l) v1Var).b(i11, r1.f6751c.i(t3, iT & 1048575), l(i10));
                        break;
                    }
                    break;
            }
            th2 = th3;
            pVar = pVar2;
            i10 += 3;
            th3 = th2;
            pVar2 = pVar;
        }
        Throwable th4 = th3;
        p<?> pVar3 = pVar2;
        if (entry != null) {
            pVar3.j(entry);
            throw th4;
        }
        n1<?, ?> n1Var = this.f6788n;
        n1Var.r(n1Var.g(t3), v1Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public final int e(a aVar) {
        return this.f6782h ? o(aVar) : n(aVar);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public final void f(java.lang.Object r21, com.google.crypto.tink.shaded.protobuf.j r22, com.google.crypto.tink.shaded.protobuf.o r23) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 2110
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.u0.f(java.lang.Object, com.google.crypto.tink.shaded.protobuf.j, com.google.crypto.tink.shaded.protobuf.o):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean g(w wVar, w wVar2, int i10) {
        return p(wVar, i10) == p(wVar2, i10);
    }

    public final void i(Object obj, int i10, Object obj2, n1 n1Var, Object obj3) {
        y.b bVarJ;
        int i11 = this.f6775a[i10];
        Object objI = r1.f6751c.i(obj, T(i10) & 1048575);
        if (objI == null || (bVarJ = j(i10)) == null) {
            return;
        }
        k0 k0Var = this.f6790p;
        j0 j0VarForMutableMapData = k0Var.forMutableMapData(objI);
        k0Var.forMapMetadata(k(i10));
        for (Map.Entry entry : j0VarForMutableMapData.entrySet()) {
            ((Integer) entry.getValue()).getClass();
            if (!bVarJ.a()) {
                if (obj2 == null) {
                    n1Var.f(obj3);
                }
                entry.getKey();
                entry.getValue();
                throw null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    @Override // com.google.crypto.tink.shaded.protobuf.g1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isInitialized(T t3) {
        int i10 = 1048575;
        int i11 = 0;
        int i12 = 0;
        loop0: while (true) {
            boolean zP = true;
            if (i11 >= this.f6784j) {
                if (this.f6780f) {
                    this.f6789o.c(t3).d();
                }
                return true;
            }
            int i13 = this.f6783i[i11];
            int[] iArr = this.f6775a;
            int i14 = iArr[i13];
            int iT = T(i13);
            int i15 = iArr[i13 + 2];
            int i16 = i15 & 1048575;
            int i17 = 1 << (i15 >>> 20);
            if (i16 != i10) {
                if (i16 != 1048575) {
                    i12 = f6774r.getInt(t3, i16);
                }
                i10 = i16;
            }
            if ((268435456 & iT) != 0) {
                if (!(i10 == 1048575 ? p(t3, i13) : (i12 & i17) != 0)) {
                    break;
                }
            } else {
                int iS = S(iT);
                if (iS == 9 || iS == 17) {
                    if (i10 == 1048575) {
                        zP = p(t3, i13);
                    } else if ((i17 & i12) == 0) {
                        zP = false;
                    }
                    if (zP) {
                        if (!l(i13).isInitialized(r1.f6751c.i(t3, iT & 1048575))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                    i11++;
                } else {
                    if (iS != 27) {
                        if (iS == 60 || iS == 68) {
                            if (r(t3, i14, i13)) {
                                if (!l(i13).isInitialized(r1.f6751c.i(t3, iT & 1048575))) {
                                    break;
                                }
                            } else {
                                continue;
                            }
                        } else if (iS != 49) {
                            if (iS != 50) {
                                continue;
                            } else {
                                Object objI = r1.f6751c.i(t3, iT & 1048575);
                                k0 k0Var = this.f6790p;
                                if (!k0Var.forMapData(objI).isEmpty()) {
                                    k0Var.forMapMetadata(k(i13));
                                    throw null;
                                }
                            }
                        }
                        i11++;
                    }
                    List list = (List) r1.f6751c.i(t3, iT & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        g1 g1VarL = l(i13);
                        for (int i18 = 0; i18 < list.size(); i18++) {
                            if (!g1VarL.isInitialized(list.get(i18))) {
                                break loop0;
                            }
                        }
                    }
                    i11++;
                }
            }
        }
        return false;
    }

    public final y.b j(int i10) {
        return (y.b) this.f6776b[androidx.datastore.preferences.protobuf.a1.b(i10, 3, 2, 1)];
    }

    public final Object k(int i10) {
        return this.f6776b[(i10 / 3) * 2];
    }

    public final g1 l(int i10) {
        int i11 = (i10 / 3) * 2;
        Object[] objArr = this.f6776b;
        g1 g1Var = (g1) objArr[i11];
        if (g1Var != null) {
            return g1Var;
        }
        g1<T> g1VarA = c1.f6638c.a((Class) objArr[i11 + 1]);
        objArr[i11] = g1VarA;
        return g1VarA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    @Override // com.google.crypto.tink.shaded.protobuf.g1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void makeImmutable(T t3) {
        if (q(t3)) {
            if (t3 instanceof w) {
                w wVar = (w) t3;
                wVar.e(Integer.MAX_VALUE);
                wVar.memoizedHashCode = 0;
                wVar.o();
            }
            int length = this.f6775a.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int iT = T(i10);
                long j10 = 1048575 & iT;
                int iS = S(iT);
                if (iS != 9) {
                    switch (iS) {
                        case 17:
                            if (p(t3, i10)) {
                                l(i10).makeImmutable(f6774r.getObject(t3, j10));
                                break;
                            } else {
                                break;
                            }
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
                            this.f6787m.a(t3, j10);
                            break;
                        case 50:
                            Unsafe unsafe = f6774r;
                            Object object = unsafe.getObject(t3, j10);
                            if (object != null) {
                                unsafe.putObject(t3, j10, this.f6790p.toImmutable(object));
                                break;
                            } else {
                                break;
                            }
                    }
                }
            }
            this.f6788n.j(t3);
            if (this.f6780f) {
                this.f6789o.f(t3);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // com.google.crypto.tink.shaded.protobuf.g1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mergeFrom(T t3, T t10) {
        T t11;
        h(t3);
        t10.getClass();
        int i10 = 0;
        while (true) {
            int[] iArr = this.f6775a;
            if (i10 >= iArr.length) {
                T t12 = t3;
                Class<?> cls = h1.f6674a;
                n1<?, ?> n1Var = this.f6788n;
                n1Var.o(t12, n1Var.k(n1Var.g(t12), n1Var.g(t10)));
                if (this.f6780f) {
                    h1.y(this.f6789o, t12, t10);
                    return;
                }
                return;
            }
            int iT = T(i10);
            long j10 = 1048575 & iT;
            int i11 = iArr[i10];
            switch (S(iT)) {
                case 0:
                    if (!p(t10, i10)) {
                        t11 = t3;
                        break;
                    } else {
                        r1.e eVar = r1.f6751c;
                        t11 = t3;
                        eVar.m(t11, j10, eVar.e(t10, j10));
                        N(t11, i10);
                        break;
                    }
                case 1:
                    if (p(t10, i10)) {
                        r1.e eVar2 = r1.f6751c;
                        eVar2.n(t3, j10, eVar2.f(t10, j10));
                        N(t3, i10);
                    }
                    t11 = t3;
                    break;
                case 2:
                    if (p(t10, i10)) {
                        r1.o(t3, j10, r1.f6751c.h(t10, j10));
                        N(t3, i10);
                    }
                    t11 = t3;
                    break;
                case 3:
                    if (p(t10, i10)) {
                        r1.o(t3, j10, r1.f6751c.h(t10, j10));
                        N(t3, i10);
                    }
                    t11 = t3;
                    break;
                case 4:
                    if (p(t10, i10)) {
                        r1.n(t3, j10, r1.f6751c.g(t10, j10));
                        N(t3, i10);
                    }
                    t11 = t3;
                    break;
                case 5:
                    if (p(t10, i10)) {
                        r1.o(t3, j10, r1.f6751c.h(t10, j10));
                        N(t3, i10);
                    }
                    t11 = t3;
                    break;
                case 6:
                    if (p(t10, i10)) {
                        r1.n(t3, j10, r1.f6751c.g(t10, j10));
                        N(t3, i10);
                    }
                    t11 = t3;
                    break;
                case 7:
                    if (p(t10, i10)) {
                        r1.e eVar3 = r1.f6751c;
                        eVar3.k(t3, j10, eVar3.c(t10, j10));
                        N(t3, i10);
                    }
                    t11 = t3;
                    break;
                case 8:
                    if (p(t10, i10)) {
                        r1.p(t3, j10, r1.f6751c.i(t10, j10));
                        N(t3, i10);
                    }
                    t11 = t3;
                    break;
                case 9:
                    u(t3, t10, i10);
                    t11 = t3;
                    break;
                case 10:
                    if (p(t10, i10)) {
                        r1.p(t3, j10, r1.f6751c.i(t10, j10));
                        N(t3, i10);
                    }
                    t11 = t3;
                    break;
                case 11:
                    if (p(t10, i10)) {
                        r1.n(t3, j10, r1.f6751c.g(t10, j10));
                        N(t3, i10);
                    }
                    t11 = t3;
                    break;
                case 12:
                    if (p(t10, i10)) {
                        r1.n(t3, j10, r1.f6751c.g(t10, j10));
                        N(t3, i10);
                    }
                    t11 = t3;
                    break;
                case 13:
                    if (p(t10, i10)) {
                        r1.n(t3, j10, r1.f6751c.g(t10, j10));
                        N(t3, i10);
                    }
                    t11 = t3;
                    break;
                case 14:
                    if (p(t10, i10)) {
                        r1.o(t3, j10, r1.f6751c.h(t10, j10));
                        N(t3, i10);
                    }
                    t11 = t3;
                    break;
                case 15:
                    if (p(t10, i10)) {
                        r1.n(t3, j10, r1.f6751c.g(t10, j10));
                        N(t3, i10);
                    }
                    t11 = t3;
                    break;
                case 16:
                    if (p(t10, i10)) {
                        r1.o(t3, j10, r1.f6751c.h(t10, j10));
                        N(t3, i10);
                    }
                    t11 = t3;
                    break;
                case 17:
                    u(t3, t10, i10);
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
                    this.f6787m.b(t3, t10, j10);
                    t11 = t3;
                    break;
                case 50:
                    Class<?> cls2 = h1.f6674a;
                    r1.e eVar4 = r1.f6751c;
                    r1.p(t3, j10, this.f6790p.mergeFrom(eVar4.i(t3, j10), eVar4.i(t10, j10)));
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
                        r1.p(t3, j10, r1.f6751c.i(t10, j10));
                        O(t3, i11, i10);
                    }
                    t11 = t3;
                    break;
                case 60:
                    v(t3, t10, i10);
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
                        r1.p(t3, j10, r1.f6751c.i(t10, j10));
                        O(t3, i11, i10);
                    }
                    t11 = t3;
                    break;
                case 68:
                    v(t3, t10, i10);
                    t11 = t3;
                    break;
            }
            i10 += 3;
            t3 = t11;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int n(a aVar) {
        int i10;
        int iQ;
        int iT;
        int iQ2;
        int iN;
        int iL;
        int iQ3;
        int iP;
        int iA;
        int iM;
        Unsafe unsafe = f6774r;
        int i11 = 1048575;
        int i12 = 1048575;
        int i13 = 0;
        int iA2 = 0;
        int i14 = 0;
        while (true) {
            int[] iArr = this.f6775a;
            if (i13 >= iArr.length) {
                n1<?, ?> n1Var = this.f6788n;
                int iH = n1Var.h(n1Var.g(aVar)) + iA2;
                if (!this.f6780f) {
                    return iH;
                }
                i1 i1Var = this.f6789o.c(aVar).f6758a;
                int iB = 0;
                for (int i15 = 0; i15 < i1Var.f6705b.size(); i15++) {
                    Map.Entry<Object, Object> entryF = i1Var.f(i15);
                    iB = s.b((s.a) entryF.getKey(), entryF.getValue()) + iB;
                }
                for (Map.Entry<Object, Object> entry : i1Var.g()) {
                    iB = s.b((s.a) entry.getKey(), entry.getValue()) + iB;
                }
                return iH + iB;
            }
            int iT2 = T(i13);
            int i16 = iArr[i13];
            int iS = S(iT2);
            if (iS <= 17) {
                int i17 = iArr[i13 + 2];
                int i18 = i17 & i11;
                i10 = 1 << (i17 >>> 20);
                if (i18 != i12) {
                    i14 = unsafe.getInt(aVar, i18);
                    i12 = i18;
                }
            } else {
                i10 = 0;
            }
            long j10 = iT2 & i11;
            switch (iS) {
                case 0:
                    if ((i14 & i10) != 0) {
                        iA2 = s0.a(i16, 8, iA2);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if ((i14 & i10) != 0) {
                        iA2 = s0.a(i16, 4, iA2);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if ((i10 & i14) != 0) {
                        long j11 = unsafe.getLong(aVar, j10);
                        iQ = k.Q(i16);
                        iT = k.T(j11);
                        iL = iT + iQ;
                        iA2 += iL;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if ((i10 & i14) != 0) {
                        long j12 = unsafe.getLong(aVar, j10);
                        iQ = k.Q(i16);
                        iT = k.T(j12);
                        iL = iT + iQ;
                        iA2 += iL;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if ((i10 & i14) != 0) {
                        int i19 = unsafe.getInt(aVar, j10);
                        iQ2 = k.Q(i16);
                        iN = k.N(i19);
                        iL = iN + iQ2;
                        iA2 += iL;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if ((i14 & i10) != 0) {
                        iL = k.L(i16);
                        iA2 += iL;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if ((i14 & i10) != 0) {
                        iL = k.K(i16);
                        iA2 += iL;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if ((i14 & i10) != 0) {
                        iA2 = s0.a(i16, 1, iA2);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if ((i10 & i14) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(aVar, j10);
                        if (object instanceof h) {
                            int iQ4 = k.Q(i16);
                            int size = ((h) object).size();
                            iA = t0.a(size, size, iQ4, iA2);
                            iA2 = iA;
                            break;
                        } else {
                            iQ3 = k.Q(i16);
                            iP = k.P((String) object);
                            iA = iP + iQ3 + iA2;
                            iA2 = iA;
                        }
                    }
                case 9:
                    if ((i10 & i14) != 0) {
                        iL = h1.l(i16, unsafe.getObject(aVar, j10), l(i13));
                        iA2 += iL;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if ((i10 & i14) != 0) {
                        iL = k.I(i16, (h) unsafe.getObject(aVar, j10));
                        iA2 += iL;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if ((i10 & i14) != 0) {
                        iL = k.R(i16, unsafe.getInt(aVar, j10));
                        iA2 += iL;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if ((i10 & i14) != 0) {
                        int i20 = unsafe.getInt(aVar, j10);
                        iQ2 = k.Q(i16);
                        iN = k.N(i20);
                        iL = iN + iQ2;
                        iA2 += iL;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if ((i14 & i10) != 0) {
                        iA2 = s0.a(i16, 4, iA2);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if ((i14 & i10) != 0) {
                        iA2 = s0.a(i16, 8, iA2);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if ((i10 & i14) != 0) {
                        int i21 = unsafe.getInt(aVar, j10);
                        iQ2 = k.Q(i16);
                        iN = k.S((i21 >> 31) ^ (i21 << 1));
                        iL = iN + iQ2;
                        iA2 += iL;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if ((i10 & i14) != 0) {
                        long j13 = unsafe.getLong(aVar, j10);
                        iQ = k.Q(i16);
                        iT = k.T((j13 >> 63) ^ (j13 << 1));
                        iL = iT + iQ;
                        iA2 += iL;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if ((i10 & i14) != 0) {
                        iL = k.M(i16, (p0) unsafe.getObject(aVar, j10), l(i13));
                        iA2 += iL;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    iL = h1.f(i16, (List) unsafe.getObject(aVar, j10));
                    iA2 += iL;
                    break;
                case 19:
                    iL = h1.d(i16, (List) unsafe.getObject(aVar, j10));
                    iA2 += iL;
                    break;
                case 20:
                    iL = h1.j(i16, (List) unsafe.getObject(aVar, j10));
                    iA2 += iL;
                    break;
                case 21:
                    iL = h1.u(i16, (List) unsafe.getObject(aVar, j10));
                    iA2 += iL;
                    break;
                case 22:
                    iL = h1.h(i16, (List) unsafe.getObject(aVar, j10));
                    iA2 += iL;
                    break;
                case 23:
                    iL = h1.f(i16, (List) unsafe.getObject(aVar, j10));
                    iA2 += iL;
                    break;
                case 24:
                    iL = h1.d(i16, (List) unsafe.getObject(aVar, j10));
                    iA2 += iL;
                    break;
                case 25:
                    List list = (List) unsafe.getObject(aVar, j10);
                    Class<?> cls = h1.f6674a;
                    int size2 = list.size();
                    iA2 += size2 == 0 ? 0 : (k.Q(i16) + 1) * size2;
                    break;
                case 26:
                    iL = h1.r(i16, (List) unsafe.getObject(aVar, j10));
                    iA2 += iL;
                    break;
                case 27:
                    iL = h1.m(i16, (List) unsafe.getObject(aVar, j10), l(i13));
                    iA2 += iL;
                    break;
                case 28:
                    iL = h1.a(i16, (List) unsafe.getObject(aVar, j10));
                    iA2 += iL;
                    break;
                case 29:
                    iL = h1.s(i16, (List) unsafe.getObject(aVar, j10));
                    iA2 += iL;
                    break;
                case 30:
                    iL = h1.b(i16, (List) unsafe.getObject(aVar, j10));
                    iA2 += iL;
                    break;
                case 31:
                    iL = h1.d(i16, (List) unsafe.getObject(aVar, j10));
                    iA2 += iL;
                    break;
                case 32:
                    iL = h1.f(i16, (List) unsafe.getObject(aVar, j10));
                    iA2 += iL;
                    break;
                case 33:
                    iL = h1.n(i16, (List) unsafe.getObject(aVar, j10));
                    iA2 += iL;
                    break;
                case 34:
                    iL = h1.p(i16, (List) unsafe.getObject(aVar, j10));
                    iA2 += iL;
                    break;
                case 35:
                    int iG = h1.g((List) unsafe.getObject(aVar, j10));
                    if (iG > 0) {
                        iA2 = t0.a(iG, k.Q(i16), iG, iA2);
                        break;
                    } else {
                        break;
                    }
                case 36:
                    int iE = h1.e((List) unsafe.getObject(aVar, j10));
                    if (iE > 0) {
                        iA2 = t0.a(iE, k.Q(i16), iE, iA2);
                        break;
                    } else {
                        break;
                    }
                case 37:
                    int iK = h1.k((List) unsafe.getObject(aVar, j10));
                    if (iK > 0) {
                        iA2 = t0.a(iK, k.Q(i16), iK, iA2);
                        break;
                    } else {
                        break;
                    }
                case 38:
                    int iV = h1.v((List) unsafe.getObject(aVar, j10));
                    if (iV > 0) {
                        iA2 = t0.a(iV, k.Q(i16), iV, iA2);
                        break;
                    } else {
                        break;
                    }
                case 39:
                    int i22 = h1.i((List) unsafe.getObject(aVar, j10));
                    if (i22 > 0) {
                        iA2 = t0.a(i22, k.Q(i16), i22, iA2);
                        break;
                    } else {
                        break;
                    }
                case 40:
                    int iG2 = h1.g((List) unsafe.getObject(aVar, j10));
                    if (iG2 > 0) {
                        iA2 = t0.a(iG2, k.Q(i16), iG2, iA2);
                        break;
                    } else {
                        break;
                    }
                case 41:
                    int iE2 = h1.e((List) unsafe.getObject(aVar, j10));
                    if (iE2 > 0) {
                        iA2 = t0.a(iE2, k.Q(i16), iE2, iA2);
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list2 = (List) unsafe.getObject(aVar, j10);
                    Class<?> cls2 = h1.f6674a;
                    int size3 = list2.size();
                    if (size3 > 0) {
                        iA2 = t0.a(size3, k.Q(i16), size3, iA2);
                        break;
                    } else {
                        break;
                    }
                case EACTags.DATE_OF_BIRTH /* 43 */:
                    int iT3 = h1.t((List) unsafe.getObject(aVar, j10));
                    if (iT3 > 0) {
                        iA2 = t0.a(iT3, k.Q(i16), iT3, iA2);
                        break;
                    } else {
                        break;
                    }
                case 44:
                    int iC = h1.c((List) unsafe.getObject(aVar, j10));
                    if (iC > 0) {
                        iA2 = t0.a(iC, k.Q(i16), iC, iA2);
                        break;
                    } else {
                        break;
                    }
                case 45:
                    int iE3 = h1.e((List) unsafe.getObject(aVar, j10));
                    if (iE3 > 0) {
                        iA2 = t0.a(iE3, k.Q(i16), iE3, iA2);
                        break;
                    } else {
                        break;
                    }
                case 46:
                    int iG3 = h1.g((List) unsafe.getObject(aVar, j10));
                    if (iG3 > 0) {
                        iA2 = t0.a(iG3, k.Q(i16), iG3, iA2);
                        break;
                    } else {
                        break;
                    }
                case EACTags.PIN_USAGE_POLICY /* 47 */:
                    int iO = h1.o((List) unsafe.getObject(aVar, j10));
                    if (iO > 0) {
                        iA2 = t0.a(iO, k.Q(i16), iO, iA2);
                        break;
                    } else {
                        break;
                    }
                case 48:
                    int iQ5 = h1.q((List) unsafe.getObject(aVar, j10));
                    if (iQ5 > 0) {
                        iA2 = t0.a(iQ5, k.Q(i16), iQ5, iA2);
                        break;
                    } else {
                        break;
                    }
                case 49:
                    List list3 = (List) unsafe.getObject(aVar, j10);
                    g1 g1VarL = l(i13);
                    Class<?> cls3 = h1.f6674a;
                    int size4 = list3.size();
                    if (size4 == 0) {
                        iM = 0;
                    } else {
                        iM = 0;
                        for (int i23 = 0; i23 < size4; i23++) {
                            iM += k.M(i16, (p0) list3.get(i23), g1VarL);
                        }
                    }
                    iA2 += iM;
                    break;
                case 50:
                    iL = this.f6790p.getSerializedSize(i16, unsafe.getObject(aVar, j10), k(i13));
                    iA2 += iL;
                    break;
                case EACTags.TRANSACTION_DATE /* 51 */:
                    if (r(aVar, i16, i13)) {
                        iA2 = s0.a(i16, 8, iA2);
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (r(aVar, i16, i13)) {
                        iA2 = s0.a(i16, 4, iA2);
                        break;
                    } else {
                        break;
                    }
                case EACTags.SEX /* 53 */:
                    if (r(aVar, i16, i13)) {
                        long jC = C(aVar, j10);
                        iQ = k.Q(i16);
                        iT = k.T(jC);
                        iL = iT + iQ;
                        iA2 += iL;
                        break;
                    } else {
                        break;
                    }
                case EACTags.CURRENCY_EXPONENT /* 54 */:
                    if (r(aVar, i16, i13)) {
                        long jC2 = C(aVar, j10);
                        iQ = k.Q(i16);
                        iT = k.T(jC2);
                        iL = iT + iQ;
                        iA2 += iL;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (r(aVar, i16, i13)) {
                        int iB2 = B(aVar, j10);
                        iQ2 = k.Q(i16);
                        iN = k.N(iB2);
                        iL = iN + iQ2;
                        iA2 += iL;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (r(aVar, i16, i13)) {
                        iL = k.L(i16);
                        iA2 += iL;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (r(aVar, i16, i13)) {
                        iL = k.K(i16);
                        iA2 += iL;
                        break;
                    } else {
                        break;
                    }
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    if (r(aVar, i16, i13)) {
                        iA2 = s0.a(i16, 1, iA2);
                        break;
                    } else {
                        break;
                    }
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (!r(aVar, i16, i13)) {
                        break;
                    } else {
                        Object object2 = unsafe.getObject(aVar, j10);
                        if (object2 instanceof h) {
                            int iQ6 = k.Q(i16);
                            int size5 = ((h) object2).size();
                            iA = t0.a(size5, size5, iQ6, iA2);
                            iA2 = iA;
                            break;
                        } else {
                            iQ3 = k.Q(i16);
                            iP = k.P((String) object2);
                            iA = iP + iQ3 + iA2;
                            iA2 = iA;
                        }
                    }
                case 60:
                    if (r(aVar, i16, i13)) {
                        iL = h1.l(i16, unsafe.getObject(aVar, j10), l(i13));
                        iA2 += iL;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (r(aVar, i16, i13)) {
                        iL = k.I(i16, (h) unsafe.getObject(aVar, j10));
                        iA2 += iL;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (r(aVar, i16, i13)) {
                        iL = k.R(i16, B(aVar, j10));
                        iA2 += iL;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (r(aVar, i16, i13)) {
                        int iB3 = B(aVar, j10);
                        iQ2 = k.Q(i16);
                        iN = k.N(iB3);
                        iL = iN + iQ2;
                        iA2 += iL;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (r(aVar, i16, i13)) {
                        iA2 = s0.a(i16, 4, iA2);
                        break;
                    } else {
                        break;
                    }
                case EACTags.ELEMENT_LIST /* 65 */:
                    if (r(aVar, i16, i13)) {
                        iA2 = s0.a(i16, 8, iA2);
                        break;
                    } else {
                        break;
                    }
                case EACTags.ADDRESS /* 66 */:
                    if (r(aVar, i16, i13)) {
                        int iB4 = B(aVar, j10);
                        iQ2 = k.Q(i16);
                        iN = k.S((iB4 >> 31) ^ (iB4 << 1));
                        iL = iN + iQ2;
                        iA2 += iL;
                        break;
                    } else {
                        break;
                    }
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (r(aVar, i16, i13)) {
                        long jC3 = C(aVar, j10);
                        iQ = k.Q(i16);
                        iT = k.T((jC3 >> 63) ^ (jC3 << 1));
                        iL = iT + iQ;
                        iA2 += iL;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (r(aVar, i16, i13)) {
                        iL = k.M(i16, (p0) unsafe.getObject(aVar, j10), l(i13));
                        iA2 += iL;
                        break;
                    } else {
                        break;
                    }
            }
            i13 += 3;
            i11 = 1048575;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public final T newInstance() {
        return (T) this.f6786l.newInstance(this.f6779e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int o(a aVar) {
        int iQ;
        int iT;
        int iQ2;
        int iN;
        int iL;
        int iQ3;
        int iP;
        int iQ4;
        int iT2;
        int iM;
        Unsafe unsafe = f6774r;
        int i10 = 0;
        int iA = 0;
        while (true) {
            int[] iArr = this.f6775a;
            if (i10 >= iArr.length) {
                n1<?, ?> n1Var = this.f6788n;
                return n1Var.h(n1Var.g(aVar)) + iA;
            }
            int iT3 = T(i10);
            int iS = S(iT3);
            int i11 = iArr[i10];
            long j10 = iT3 & 1048575;
            if (iS >= t.f6762b.f6766a && iS <= t.f6763c.f6766a) {
                int i12 = iArr[i10 + 2];
            }
            switch (iS) {
                case 0:
                    if (p(aVar, i10)) {
                        iA = s0.a(i11, 8, iA);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (p(aVar, i10)) {
                        iA = s0.a(i11, 4, iA);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (p(aVar, i10)) {
                        long jH = r1.f6751c.h(aVar, j10);
                        iQ = k.Q(i11);
                        iT = k.T(jH);
                        iL = iT + iQ;
                        iA += iL;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (p(aVar, i10)) {
                        long jH2 = r1.f6751c.h(aVar, j10);
                        iQ = k.Q(i11);
                        iT = k.T(jH2);
                        iL = iT + iQ;
                        iA += iL;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (p(aVar, i10)) {
                        int iG = r1.f6751c.g(aVar, j10);
                        iQ2 = k.Q(i11);
                        iN = k.N(iG);
                        iL = iN + iQ2;
                        iA += iL;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (p(aVar, i10)) {
                        iL = k.L(i11);
                        iA += iL;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (p(aVar, i10)) {
                        iL = k.K(i11);
                        iA += iL;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (p(aVar, i10)) {
                        iA = s0.a(i11, 1, iA);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (p(aVar, i10)) {
                        Object objI = r1.f6751c.i(aVar, j10);
                        if (objI instanceof h) {
                            int iQ5 = k.Q(i11);
                            int size = ((h) objI).size();
                            iA = t0.a(size, size, iQ5, iA);
                            break;
                        } else {
                            iQ3 = k.Q(i11);
                            iP = k.P((String) objI);
                            iA = iP + iQ3 + iA;
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (p(aVar, i10)) {
                        iL = h1.l(i11, r1.f6751c.i(aVar, j10), l(i10));
                        iA += iL;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (p(aVar, i10)) {
                        iL = k.I(i11, (h) r1.f6751c.i(aVar, j10));
                        iA += iL;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (p(aVar, i10)) {
                        iL = k.R(i11, r1.f6751c.g(aVar, j10));
                        iA += iL;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (p(aVar, i10)) {
                        int iG2 = r1.f6751c.g(aVar, j10);
                        iQ2 = k.Q(i11);
                        iN = k.N(iG2);
                        iL = iN + iQ2;
                        iA += iL;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (p(aVar, i10)) {
                        iA = s0.a(i11, 4, iA);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (p(aVar, i10)) {
                        iA = s0.a(i11, 8, iA);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (p(aVar, i10)) {
                        int iG3 = r1.f6751c.g(aVar, j10);
                        iQ2 = k.Q(i11);
                        iN = k.S((iG3 >> 31) ^ (iG3 << 1));
                        iL = iN + iQ2;
                        iA += iL;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (p(aVar, i10)) {
                        long jH3 = r1.f6751c.h(aVar, j10);
                        iQ4 = k.Q(i11);
                        iT2 = k.T((jH3 >> 63) ^ (jH3 << 1));
                        iL = iT2 + iQ4;
                        iA += iL;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (p(aVar, i10)) {
                        iL = k.M(i11, (p0) r1.f6751c.i(aVar, j10), l(i10));
                        iA += iL;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    iL = h1.f(i11, s(aVar, j10));
                    iA += iL;
                    break;
                case 19:
                    iL = h1.d(i11, s(aVar, j10));
                    iA += iL;
                    break;
                case 20:
                    iL = h1.j(i11, s(aVar, j10));
                    iA += iL;
                    break;
                case 21:
                    iL = h1.u(i11, s(aVar, j10));
                    iA += iL;
                    break;
                case 22:
                    iL = h1.h(i11, s(aVar, j10));
                    iA += iL;
                    break;
                case 23:
                    iL = h1.f(i11, s(aVar, j10));
                    iA += iL;
                    break;
                case 24:
                    iL = h1.d(i11, s(aVar, j10));
                    iA += iL;
                    break;
                case 25:
                    List listS = s(aVar, j10);
                    Class<?> cls = h1.f6674a;
                    int size2 = listS.size();
                    iA += size2 == 0 ? 0 : (k.Q(i11) + 1) * size2;
                    break;
                case 26:
                    iL = h1.r(i11, s(aVar, j10));
                    iA += iL;
                    break;
                case 27:
                    iL = h1.m(i11, s(aVar, j10), l(i10));
                    iA += iL;
                    break;
                case 28:
                    iL = h1.a(i11, s(aVar, j10));
                    iA += iL;
                    break;
                case 29:
                    iL = h1.s(i11, s(aVar, j10));
                    iA += iL;
                    break;
                case 30:
                    iL = h1.b(i11, s(aVar, j10));
                    iA += iL;
                    break;
                case 31:
                    iL = h1.d(i11, s(aVar, j10));
                    iA += iL;
                    break;
                case 32:
                    iL = h1.f(i11, s(aVar, j10));
                    iA += iL;
                    break;
                case 33:
                    iL = h1.n(i11, s(aVar, j10));
                    iA += iL;
                    break;
                case 34:
                    iL = h1.p(i11, s(aVar, j10));
                    iA += iL;
                    break;
                case 35:
                    int iG4 = h1.g((List) unsafe.getObject(aVar, j10));
                    if (iG4 > 0) {
                        iA = t0.a(iG4, k.Q(i11), iG4, iA);
                        break;
                    } else {
                        break;
                    }
                case 36:
                    int iE = h1.e((List) unsafe.getObject(aVar, j10));
                    if (iE > 0) {
                        iA = t0.a(iE, k.Q(i11), iE, iA);
                        break;
                    } else {
                        break;
                    }
                case 37:
                    int iK = h1.k((List) unsafe.getObject(aVar, j10));
                    if (iK > 0) {
                        iA = t0.a(iK, k.Q(i11), iK, iA);
                        break;
                    } else {
                        break;
                    }
                case 38:
                    int iV = h1.v((List) unsafe.getObject(aVar, j10));
                    if (iV > 0) {
                        iA = t0.a(iV, k.Q(i11), iV, iA);
                        break;
                    } else {
                        break;
                    }
                case 39:
                    int i13 = h1.i((List) unsafe.getObject(aVar, j10));
                    if (i13 > 0) {
                        iA = t0.a(i13, k.Q(i11), i13, iA);
                        break;
                    } else {
                        break;
                    }
                case 40:
                    int iG5 = h1.g((List) unsafe.getObject(aVar, j10));
                    if (iG5 > 0) {
                        iA = t0.a(iG5, k.Q(i11), iG5, iA);
                        break;
                    } else {
                        break;
                    }
                case 41:
                    int iE2 = h1.e((List) unsafe.getObject(aVar, j10));
                    if (iE2 > 0) {
                        iA = t0.a(iE2, k.Q(i11), iE2, iA);
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list = (List) unsafe.getObject(aVar, j10);
                    Class<?> cls2 = h1.f6674a;
                    int size3 = list.size();
                    if (size3 > 0) {
                        iA = t0.a(size3, k.Q(i11), size3, iA);
                        break;
                    } else {
                        break;
                    }
                case EACTags.DATE_OF_BIRTH /* 43 */:
                    int iT4 = h1.t((List) unsafe.getObject(aVar, j10));
                    if (iT4 > 0) {
                        iA = t0.a(iT4, k.Q(i11), iT4, iA);
                        break;
                    } else {
                        break;
                    }
                case 44:
                    int iC = h1.c((List) unsafe.getObject(aVar, j10));
                    if (iC > 0) {
                        iA = t0.a(iC, k.Q(i11), iC, iA);
                        break;
                    } else {
                        break;
                    }
                case 45:
                    int iE3 = h1.e((List) unsafe.getObject(aVar, j10));
                    if (iE3 > 0) {
                        iA = t0.a(iE3, k.Q(i11), iE3, iA);
                        break;
                    } else {
                        break;
                    }
                case 46:
                    int iG6 = h1.g((List) unsafe.getObject(aVar, j10));
                    if (iG6 > 0) {
                        iA = t0.a(iG6, k.Q(i11), iG6, iA);
                        break;
                    } else {
                        break;
                    }
                case EACTags.PIN_USAGE_POLICY /* 47 */:
                    int iO = h1.o((List) unsafe.getObject(aVar, j10));
                    if (iO > 0) {
                        iA = t0.a(iO, k.Q(i11), iO, iA);
                        break;
                    } else {
                        break;
                    }
                case 48:
                    int iQ6 = h1.q((List) unsafe.getObject(aVar, j10));
                    if (iQ6 > 0) {
                        iA = t0.a(iQ6, k.Q(i11), iQ6, iA);
                        break;
                    } else {
                        break;
                    }
                case 49:
                    List listS2 = s(aVar, j10);
                    g1 g1VarL = l(i10);
                    Class<?> cls3 = h1.f6674a;
                    int size4 = listS2.size();
                    if (size4 == 0) {
                        iM = 0;
                    } else {
                        iM = 0;
                        for (int i14 = 0; i14 < size4; i14++) {
                            iM += k.M(i11, (p0) listS2.get(i14), g1VarL);
                        }
                    }
                    iA += iM;
                    break;
                case 50:
                    iL = this.f6790p.getSerializedSize(i11, r1.f6751c.i(aVar, j10), k(i10));
                    iA += iL;
                    break;
                case EACTags.TRANSACTION_DATE /* 51 */:
                    if (r(aVar, i11, i10)) {
                        iA = s0.a(i11, 8, iA);
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (r(aVar, i11, i10)) {
                        iA = s0.a(i11, 4, iA);
                        break;
                    } else {
                        break;
                    }
                case EACTags.SEX /* 53 */:
                    if (r(aVar, i11, i10)) {
                        long jC = C(aVar, j10);
                        iQ = k.Q(i11);
                        iT = k.T(jC);
                        iL = iT + iQ;
                        iA += iL;
                        break;
                    } else {
                        break;
                    }
                case EACTags.CURRENCY_EXPONENT /* 54 */:
                    if (r(aVar, i11, i10)) {
                        long jC2 = C(aVar, j10);
                        iQ = k.Q(i11);
                        iT = k.T(jC2);
                        iL = iT + iQ;
                        iA += iL;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (r(aVar, i11, i10)) {
                        int iB = B(aVar, j10);
                        iQ2 = k.Q(i11);
                        iN = k.N(iB);
                        iL = iN + iQ2;
                        iA += iL;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (r(aVar, i11, i10)) {
                        iL = k.L(i11);
                        iA += iL;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (r(aVar, i11, i10)) {
                        iL = k.K(i11);
                        iA += iL;
                        break;
                    } else {
                        break;
                    }
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    if (r(aVar, i11, i10)) {
                        iA = s0.a(i11, 1, iA);
                        break;
                    } else {
                        break;
                    }
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (r(aVar, i11, i10)) {
                        Object objI2 = r1.f6751c.i(aVar, j10);
                        if (objI2 instanceof h) {
                            int iQ7 = k.Q(i11);
                            int size5 = ((h) objI2).size();
                            iA = t0.a(size5, size5, iQ7, iA);
                            break;
                        } else {
                            iQ3 = k.Q(i11);
                            iP = k.P((String) objI2);
                            iA = iP + iQ3 + iA;
                            break;
                        }
                    } else {
                        break;
                    }
                case 60:
                    if (r(aVar, i11, i10)) {
                        iL = h1.l(i11, r1.f6751c.i(aVar, j10), l(i10));
                        iA += iL;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (r(aVar, i11, i10)) {
                        iL = k.I(i11, (h) r1.f6751c.i(aVar, j10));
                        iA += iL;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (r(aVar, i11, i10)) {
                        iL = k.R(i11, B(aVar, j10));
                        iA += iL;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (r(aVar, i11, i10)) {
                        int iB2 = B(aVar, j10);
                        iQ2 = k.Q(i11);
                        iN = k.N(iB2);
                        iL = iN + iQ2;
                        iA += iL;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (r(aVar, i11, i10)) {
                        iA = s0.a(i11, 4, iA);
                        break;
                    } else {
                        break;
                    }
                case EACTags.ELEMENT_LIST /* 65 */:
                    if (r(aVar, i11, i10)) {
                        iA = s0.a(i11, 8, iA);
                        break;
                    } else {
                        break;
                    }
                case EACTags.ADDRESS /* 66 */:
                    if (r(aVar, i11, i10)) {
                        int iB3 = B(aVar, j10);
                        iQ2 = k.Q(i11);
                        iN = k.S((iB3 >> 31) ^ (iB3 << 1));
                        iL = iN + iQ2;
                        iA += iL;
                        break;
                    } else {
                        break;
                    }
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (r(aVar, i11, i10)) {
                        long jC3 = C(aVar, j10);
                        iQ4 = k.Q(i11);
                        iT2 = k.T((jC3 >> 63) ^ (jC3 << 1));
                        iL = iT2 + iQ4;
                        iA += iL;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (r(aVar, i11, i10)) {
                        iL = k.M(i11, (p0) r1.f6751c.i(aVar, j10), l(i10));
                        iA += iL;
                        break;
                    } else {
                        break;
                    }
            }
            i10 += 3;
        }
    }

    public final boolean p(T t3, int i10) {
        int i11 = this.f6775a[i10 + 2];
        long j10 = i11 & 1048575;
        if (j10 == 1048575) {
            int iT = T(i10);
            long j11 = iT & 1048575;
            switch (S(iT)) {
                case 0:
                    if (Double.doubleToRawLongBits(r1.f6751c.e(t3, j11)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(r1.f6751c.f(t3, j11)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (r1.f6751c.h(t3, j11) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (r1.f6751c.h(t3, j11) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (r1.f6751c.g(t3, j11) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (r1.f6751c.h(t3, j11) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (r1.f6751c.g(t3, j11) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return r1.f6751c.c(t3, j11);
                case 8:
                    Object objI = r1.f6751c.i(t3, j11);
                    if (objI instanceof String) {
                        return !((String) objI).isEmpty();
                    }
                    if (objI instanceof h) {
                        return !h.f6665b.equals(objI);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (r1.f6751c.i(t3, j11) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !h.f6665b.equals(r1.f6751c.i(t3, j11));
                case 11:
                    if (r1.f6751c.g(t3, j11) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (r1.f6751c.g(t3, j11) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (r1.f6751c.g(t3, j11) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (r1.f6751c.h(t3, j11) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (r1.f6751c.g(t3, j11) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (r1.f6751c.h(t3, j11) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (r1.f6751c.i(t3, j11) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            if ((r1.f6751c.g(t3, j10) & (1 << (i11 >>> 20))) == 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean r(T t3, int i10, int i11) {
        return r1.f6751c.g(t3, (long) (this.f6775a[i11 + 2] & 1048575)) == i10;
    }

    public final void t(Object obj, int i10, Object obj2, j jVar) throws IOException {
        long jT = T(i10) & 1048575;
        Object objI = r1.f6751c.i(obj, jT);
        k0 k0Var = this.f6790p;
        if (objI == null) {
            objI = k0Var.a();
            r1.p(obj, jT, objI);
        } else if (k0Var.isImmutable(objI)) {
            j0 j0VarA = k0Var.a();
            k0Var.mergeFrom(j0VarA, objI);
            r1.p(obj, jT, j0VarA);
            objI = j0VarA;
        }
        k0Var.forMutableMapData(objI);
        k0Var.forMapMetadata(obj2);
        jVar.v(2);
        i iVar = jVar.f6697a;
        iVar.h(iVar.y());
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u(T t3, T t10, int i10) {
        if (p(t10, i10)) {
            long jT = T(i10) & 1048575;
            Unsafe unsafe = f6774r;
            Object object = unsafe.getObject(t10, jT);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f6775a[i10] + " is present but null: " + t10);
            }
            g1 g1VarL = l(i10);
            if (!p(t3, i10)) {
                if (q(object)) {
                    Object objNewInstance = g1VarL.newInstance();
                    g1VarL.mergeFrom(objNewInstance, object);
                    unsafe.putObject(t3, jT, objNewInstance);
                } else {
                    unsafe.putObject(t3, jT, object);
                }
                N(t3, i10);
                return;
            }
            Object object2 = unsafe.getObject(t3, jT);
            if (!q(object2)) {
                Object objNewInstance2 = g1VarL.newInstance();
                g1VarL.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(t3, jT, objNewInstance2);
                object2 = objNewInstance2;
            }
            g1VarL.mergeFrom(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v(T t3, T t10, int i10) {
        int[] iArr = this.f6775a;
        int i11 = iArr[i10];
        if (r(t10, i11, i10)) {
            long jT = T(i10) & 1048575;
            Unsafe unsafe = f6774r;
            Object object = unsafe.getObject(t10, jT);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i10] + " is present but null: " + t10);
            }
            g1 g1VarL = l(i10);
            if (!r(t3, i11, i10)) {
                if (q(object)) {
                    Object objNewInstance = g1VarL.newInstance();
                    g1VarL.mergeFrom(objNewInstance, object);
                    unsafe.putObject(t3, jT, objNewInstance);
                } else {
                    unsafe.putObject(t3, jT, object);
                }
                O(t3, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(t3, jT);
            if (!q(object2)) {
                Object objNewInstance2 = g1VarL.newInstance();
                g1VarL.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(t3, jT, objNewInstance2);
                object2 = objNewInstance2;
            }
            g1VarL.mergeFrom(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object w(T t3, int i10) {
        g1 g1VarL = l(i10);
        long jT = T(i10) & 1048575;
        if (!p(t3, i10)) {
            return g1VarL.newInstance();
        }
        Object object = f6774r.getObject(t3, jT);
        if (q(object)) {
            return object;
        }
        Object objNewInstance = g1VarL.newInstance();
        if (object != null) {
            g1VarL.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object x(T t3, int i10, int i11) {
        g1 g1VarL = l(i11);
        if (!r(t3, i10, i11)) {
            return g1VarL.newInstance();
        }
        Object object = f6774r.getObject(t3, T(i11) & 1048575);
        if (q(object)) {
            return object;
        }
        Object objNewInstance = g1VarL.newInstance();
        if (object != null) {
            g1VarL.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }
}
