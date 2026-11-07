package com.google.android.gms.internal.ads;

import androidx.camera.core.impl.ImageFormatConstants;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.RequestConfiguration;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class p62<T> implements b72<T> {

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f7962m = new int[0];

    /* renamed from: n, reason: collision with root package name */
    public static final Unsafe f7963n = r72.k();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f7964a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f7965b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7966c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7967d;

    /* renamed from: e, reason: collision with root package name */
    public final m62 f7968e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f7969f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f7970g;
    public final int[] h;

    /* renamed from: i, reason: collision with root package name */
    public final int f7971i;

    /* renamed from: j, reason: collision with root package name */
    public final int f7972j;

    /* renamed from: k, reason: collision with root package name */
    public final ed0 f7973k;

    /* renamed from: l, reason: collision with root package name */
    public final v42 f7974l;

    public p62(int[] iArr, Object[] objArr, int i6, int i7, m62 m62Var, int[] iArr2, int i8, int i9, ed0 ed0Var, v42 v42Var) {
        this.f7964a = iArr;
        this.f7965b = objArr;
        this.f7966c = i6;
        this.f7967d = i7;
        this.f7970g = m62Var instanceof j52;
        boolean z6 = false;
        if (v42Var != null && (m62Var instanceof g52)) {
            z6 = true;
        }
        this.f7969f = z6;
        this.h = iArr2;
        this.f7971i = i8;
        this.f7972j = i9;
        this.f7973k = ed0Var;
        this.f7974l = v42Var;
        this.f7968e = m62Var;
    }

    public static m72 A(Object obj) {
        j52 j52Var = (j52) obj;
        m72 m72Var = j52Var.zzt;
        if (m72Var != m72.f6958f) {
            return m72Var;
        }
        m72 m72Var2 = new m72();
        j52Var.zzt = m72Var2;
        return m72Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static p62 B(i62 i62Var, ed0 ed0Var, w42 w42Var) {
        int i6;
        int iCharAt;
        int i7;
        int[] iArr;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
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
        int i21;
        int i22;
        Object[] objArr;
        int i23;
        Class<?> cls;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        Field fieldL;
        char cCharAt9;
        int i29;
        int i30;
        int i31;
        int i32;
        Object obj;
        Field fieldL2;
        Object obj2;
        Field fieldL3;
        int i33;
        char cCharAt10;
        int i34;
        char cCharAt11;
        int i35;
        char cCharAt12;
        int i36;
        char cCharAt13;
        if (!(i62Var instanceof w62)) {
            throw null;
        }
        w62 w62Var = (w62) i62Var;
        String str = w62Var.f10075b;
        int length = str.length();
        int i37 = 55296;
        if (str.charAt(0) >= 55296) {
            int i38 = 1;
            while (true) {
                i6 = i38 + 1;
                if (str.charAt(i38) < 55296) {
                    break;
                }
                i38 = i6;
            }
        } else {
            i6 = 1;
        }
        int i39 = i6 + 1;
        int iCharAt2 = str.charAt(i6);
        if (iCharAt2 >= 55296) {
            int i40 = iCharAt2 & 8191;
            int i41 = 13;
            while (true) {
                i36 = i39 + 1;
                cCharAt13 = str.charAt(i39);
                if (cCharAt13 < 55296) {
                    break;
                }
                i40 |= (cCharAt13 & 8191) << i41;
                i41 += 13;
                i39 = i36;
            }
            iCharAt2 = i40 | (cCharAt13 << i41);
            i39 = i36;
        }
        if (iCharAt2 == 0) {
            i9 = 0;
            i11 = 0;
            iCharAt = 0;
            i8 = 0;
            i10 = 0;
            i12 = 0;
            iArr = f7962m;
            i7 = 0;
        } else {
            int i42 = i39 + 1;
            int iCharAt3 = str.charAt(i39);
            if (iCharAt3 >= 55296) {
                int i43 = iCharAt3 & 8191;
                int i44 = 13;
                while (true) {
                    i20 = i42 + 1;
                    cCharAt8 = str.charAt(i42);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i43 |= (cCharAt8 & 8191) << i44;
                    i44 += 13;
                    i42 = i20;
                }
                iCharAt3 = i43 | (cCharAt8 << i44);
                i42 = i20;
            }
            int i45 = i42 + 1;
            int iCharAt4 = str.charAt(i42);
            if (iCharAt4 >= 55296) {
                int i46 = iCharAt4 & 8191;
                int i47 = 13;
                while (true) {
                    i19 = i45 + 1;
                    cCharAt7 = str.charAt(i45);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i46 |= (cCharAt7 & 8191) << i47;
                    i47 += 13;
                    i45 = i19;
                }
                iCharAt4 = i46 | (cCharAt7 << i47);
                i45 = i19;
            }
            int i48 = i45 + 1;
            int iCharAt5 = str.charAt(i45);
            if (iCharAt5 >= 55296) {
                int i49 = iCharAt5 & 8191;
                int i50 = 13;
                while (true) {
                    i18 = i48 + 1;
                    cCharAt6 = str.charAt(i48);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt6 & 8191) << i50;
                    i50 += 13;
                    i48 = i18;
                }
                iCharAt5 = i49 | (cCharAt6 << i50);
                i48 = i18;
            }
            int i51 = i48 + 1;
            int iCharAt6 = str.charAt(i48);
            if (iCharAt6 >= 55296) {
                int i52 = iCharAt6 & 8191;
                int i53 = 13;
                while (true) {
                    i17 = i51 + 1;
                    cCharAt5 = str.charAt(i51);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i52 |= (cCharAt5 & 8191) << i53;
                    i53 += 13;
                    i51 = i17;
                }
                iCharAt6 = i52 | (cCharAt5 << i53);
                i51 = i17;
            }
            int i54 = i51 + 1;
            iCharAt = str.charAt(i51);
            if (iCharAt >= 55296) {
                int i55 = iCharAt & 8191;
                int i56 = 13;
                while (true) {
                    i16 = i54 + 1;
                    cCharAt4 = str.charAt(i54);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i55 |= (cCharAt4 & 8191) << i56;
                    i56 += 13;
                    i54 = i16;
                }
                iCharAt = i55 | (cCharAt4 << i56);
                i54 = i16;
            }
            int i57 = i54 + 1;
            int iCharAt7 = str.charAt(i54);
            if (iCharAt7 >= 55296) {
                int i58 = iCharAt7 & 8191;
                int i59 = 13;
                while (true) {
                    i15 = i57 + 1;
                    cCharAt3 = str.charAt(i57);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i58 |= (cCharAt3 & 8191) << i59;
                    i59 += 13;
                    i57 = i15;
                }
                iCharAt7 = i58 | (cCharAt3 << i59);
                i57 = i15;
            }
            int i60 = i57 + 1;
            int iCharAt8 = str.charAt(i57);
            if (iCharAt8 >= 55296) {
                int i61 = iCharAt8 & 8191;
                int i62 = 13;
                while (true) {
                    i14 = i60 + 1;
                    cCharAt2 = str.charAt(i60);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i61 |= (cCharAt2 & 8191) << i62;
                    i62 += 13;
                    i60 = i14;
                }
                iCharAt8 = i61 | (cCharAt2 << i62);
                i60 = i14;
            }
            int i63 = i60 + 1;
            int iCharAt9 = str.charAt(i60);
            if (iCharAt9 >= 55296) {
                int i64 = iCharAt9 & 8191;
                int i65 = 13;
                while (true) {
                    i13 = i63 + 1;
                    cCharAt = str.charAt(i63);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i64 |= (cCharAt & 8191) << i65;
                    i65 += 13;
                    i63 = i13;
                }
                iCharAt9 = i64 | (cCharAt << i65);
                i63 = i13;
            }
            int i66 = iCharAt3 + iCharAt3 + iCharAt4;
            i7 = iCharAt3;
            i39 = i63;
            iArr = new int[iCharAt9 + iCharAt7 + iCharAt8];
            int i67 = iCharAt7;
            i8 = iCharAt5;
            i9 = i67;
            i10 = iCharAt6;
            i11 = i66;
            i12 = iCharAt9;
        }
        Unsafe unsafe = f7963n;
        Object[] objArr2 = w62Var.f10076c;
        Class<?> cls2 = w62Var.f10074a.getClass();
        int i68 = i12 + i9;
        int i69 = iCharAt + iCharAt;
        int[] iArr2 = new int[iCharAt * 3];
        Object[] objArr3 = new Object[i69];
        int i70 = i68;
        int i71 = i12;
        int i72 = 0;
        int i73 = 0;
        while (i39 < length) {
            int i74 = i39 + 1;
            int iCharAt10 = str.charAt(i39);
            if (iCharAt10 >= i37) {
                int i75 = iCharAt10 & 8191;
                int i76 = i74;
                int i77 = 13;
                while (true) {
                    i35 = i76 + 1;
                    cCharAt12 = str.charAt(i76);
                    i21 = length;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i75 |= (cCharAt12 & 8191) << i77;
                    i77 += 13;
                    i76 = i35;
                    length = i21;
                }
                iCharAt10 = i75 | (cCharAt12 << i77);
                i22 = i35;
            } else {
                i21 = length;
                i22 = i74;
            }
            int i78 = i22 + 1;
            int iCharAt11 = str.charAt(i22);
            Object[] objArr4 = objArr2;
            char c7 = 55296;
            if (iCharAt11 >= 55296) {
                int i79 = iCharAt11 & 8191;
                int i80 = 13;
                while (true) {
                    i34 = i78 + 1;
                    cCharAt11 = str.charAt(i78);
                    if (cCharAt11 < c7) {
                        break;
                    }
                    i79 |= (cCharAt11 & 8191) << i80;
                    i80 += 13;
                    i78 = i34;
                    c7 = 55296;
                }
                iCharAt11 = i79 | (cCharAt11 << i80);
                i78 = i34;
            }
            if ((iCharAt11 & 1024) != 0) {
                iArr[i72] = i73;
                i72++;
            }
            int i81 = iCharAt11 & 255;
            int i82 = iCharAt10;
            int i83 = iCharAt11 & 2048;
            if (i81 >= 51) {
                int i84 = i78 + 1;
                int iCharAt12 = str.charAt(i78);
                char c8 = 55296;
                if (iCharAt12 >= 55296) {
                    int i85 = iCharAt12 & 8191;
                    int i86 = i84;
                    int i87 = 13;
                    while (true) {
                        i33 = i86 + 1;
                        cCharAt10 = str.charAt(i86);
                        if (cCharAt10 < c8) {
                            break;
                        }
                        i85 |= (cCharAt10 & 8191) << i87;
                        i87 += 13;
                        i86 = i33;
                        c8 = 55296;
                    }
                    iCharAt12 = i85 | (cCharAt10 << i87);
                    i30 = i33;
                } else {
                    i30 = i84;
                }
                int i88 = i30;
                int i89 = i81 - 51;
                int i90 = iCharAt12;
                if (i89 == 9 || i89 == 17) {
                    i31 = i11 + 1;
                    int i91 = i73 / 3;
                    objArr3[i91 + i91 + 1] = objArr4[i11];
                } else {
                    if (i89 != 12) {
                        i32 = i83;
                    } else if (w62Var.zzc() == 1 || i83 != 0) {
                        i31 = i11 + 1;
                        int i92 = i73 / 3;
                        objArr3[i92 + i92 + 1] = objArr4[i11];
                    } else {
                        i32 = 0;
                    }
                    int i93 = i90 + i90;
                    i83 = i32;
                    obj = objArr4[i93];
                    if (obj instanceof Field) {
                        fieldL2 = l(cls2, (String) obj);
                        objArr4[i93] = fieldL2;
                    } else {
                        fieldL2 = (Field) obj;
                    }
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldL2);
                    int i94 = i93 + 1;
                    obj2 = objArr4[i94];
                    if (obj2 instanceof Field) {
                        fieldL3 = l(cls2, (String) obj2);
                        objArr4[i94] = fieldL3;
                    } else {
                        fieldL3 = (Field) obj2;
                    }
                    i25 = i88;
                    i28 = iObjectFieldOffset3;
                    i24 = 55296;
                    objArr = objArr3;
                    i23 = i7;
                    cls = cls2;
                    i27 = 0;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldL3);
                }
                i11 = i31;
                i32 = i83;
                int i932 = i90 + i90;
                i83 = i32;
                obj = objArr4[i932];
                if (obj instanceof Field) {
                }
                int iObjectFieldOffset32 = (int) unsafe.objectFieldOffset(fieldL2);
                int i942 = i932 + 1;
                obj2 = objArr4[i942];
                if (obj2 instanceof Field) {
                }
                i25 = i88;
                i28 = iObjectFieldOffset32;
                i24 = 55296;
                objArr = objArr3;
                i23 = i7;
                cls = cls2;
                i27 = 0;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldL3);
            } else {
                int i95 = i11 + 1;
                Field fieldL4 = l(cls2, (String) objArr4[i11]);
                objArr = objArr3;
                if (i81 == 9 || i81 == 17) {
                    i23 = i7;
                    int i96 = i73 / 3;
                    objArr[i96 + i96 + 1] = fieldL4.getType();
                } else {
                    if (i81 == 27) {
                        i23 = i7;
                        i29 = 1;
                        i11 += 2;
                    } else if (i81 == 49) {
                        i11 += 2;
                        i23 = i7;
                        i29 = 1;
                    } else {
                        if (i81 == 12 || i81 == 30 || i81 == 44) {
                            i23 = i7;
                            if (w62Var.zzc() == 1 || i83 != 0) {
                                i11 += 2;
                                int i97 = i73 / 3;
                                objArr[i97 + i97 + 1] = objArr4[i95];
                                cls = cls2;
                            } else {
                                cls = cls2;
                                i11 = i95;
                                i83 = 0;
                            }
                        } else if (i81 == 50) {
                            int i98 = i11 + 2;
                            int i99 = i71 + 1;
                            iArr[i71] = i73;
                            int i100 = i73 / 3;
                            int i101 = i100 + i100;
                            objArr[i101] = objArr4[i95];
                            if (i83 != 0) {
                                i11 += 3;
                                objArr[i101 + 1] = objArr4[i98];
                                cls = cls2;
                                i71 = i99;
                            } else {
                                i11 = i98;
                                cls = cls2;
                                i71 = i99;
                                i83 = 0;
                            }
                            i23 = i7;
                        } else {
                            i23 = i7;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldL4);
                        iObjectFieldOffset2 = 1048575;
                        if ((iCharAt11 & 4096) == 0 || i81 > 17) {
                            i24 = 55296;
                            i25 = i78;
                            i26 = 0;
                        } else {
                            int i102 = i78 + 1;
                            int iCharAt13 = str.charAt(i78);
                            if (iCharAt13 >= 55296) {
                                int i103 = iCharAt13 & 8191;
                                int i104 = 13;
                                while (true) {
                                    i25 = i102 + 1;
                                    cCharAt9 = str.charAt(i102);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i103 |= (cCharAt9 & 8191) << i104;
                                    i104 += 13;
                                    i102 = i25;
                                }
                                iCharAt13 = i103 | (cCharAt9 << i104);
                            } else {
                                i25 = i102;
                            }
                            int i105 = (iCharAt13 / 32) + i23 + i23;
                            Object obj3 = objArr4[i105];
                            if (obj3 instanceof Field) {
                                fieldL = (Field) obj3;
                            } else {
                                fieldL = l(cls, (String) obj3);
                                objArr4[i105] = fieldL;
                            }
                            i26 = iCharAt13 % 32;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldL);
                            i24 = 55296;
                        }
                        if (i81 >= 18 && i81 <= 49) {
                            iArr[i70] = iObjectFieldOffset;
                            i70++;
                        }
                        i27 = i26;
                        i28 = iObjectFieldOffset;
                    }
                    int i106 = i73 / 3;
                    objArr[i106 + i106 + i29] = objArr4[i95];
                    cls = cls2;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldL4);
                    iObjectFieldOffset2 = 1048575;
                    if ((iCharAt11 & 4096) == 0) {
                        i24 = 55296;
                        i25 = i78;
                        i26 = 0;
                        if (i81 >= 18) {
                            iArr[i70] = iObjectFieldOffset;
                            i70++;
                        }
                        i27 = i26;
                        i28 = iObjectFieldOffset;
                    }
                }
                cls = cls2;
                i11 = i95;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldL4);
                iObjectFieldOffset2 = 1048575;
                if ((iCharAt11 & 4096) == 0) {
                }
            }
            int i107 = i83;
            int i108 = i73 + 1;
            iArr2[i73] = i82;
            int i109 = i73 + 2;
            String str2 = str;
            iArr2[i108] = ((iCharAt11 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | (i107 != 0 ? Integer.MIN_VALUE : 0) | (i81 << 20) | i28;
            i73 += 3;
            iArr2[i109] = (i27 << 20) | iObjectFieldOffset2;
            cls2 = cls;
            objArr2 = objArr4;
            i37 = i24;
            length = i21;
            objArr3 = objArr;
            i7 = i23;
            i39 = i25;
            str = str2;
        }
        return new p62(iArr2, objArr3, i8, i10, w62Var.f10074a, iArr, i12, i68, ed0Var, w42Var);
    }

    public static int C(long j6, Object obj) {
        return ((Integer) r72.j(j6, obj)).intValue();
    }

    public static int E(int i6) {
        return (i6 >>> 20) & 255;
    }

    public static long G(long j6, Object obj) {
        return ((Long) r72.j(j6, obj)).longValue();
    }

    public static Field l(Class cls, String str) {
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
            StringBuilder sbA = androidx.camera.camera2.internal.i0.a("Field ", str, " for ", name, " not found. Known fields are ");
            sbA.append(string);
            throw new RuntimeException(sbA.toString());
        }
    }

    public static void m(Object obj) {
        if (!x(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    public static boolean x(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof j52) {
            return ((j52) obj).w();
        }
        return true;
    }

    public final int D(int i6, int i7) {
        int[] iArr = this.f7964a;
        int length = (iArr.length / 3) - 1;
        while (i7 <= length) {
            int i8 = (length + i7) >>> 1;
            int i9 = i8 * 3;
            int i10 = iArr[i9];
            if (i6 == i10) {
                return i9;
            }
            if (i6 < i10) {
                length = i8 - 1;
            } else {
                i7 = i8 + 1;
            }
        }
        return -1;
    }

    public final int F(int i6) {
        return this.f7964a[i6 + 1];
    }

    public final m52 H(int i6) {
        int i7 = i6 / 3;
        return (m52) this.f7965b[i7 + i7 + 1];
    }

    public final b72 I(int i6) {
        int i7 = i6 / 3;
        int i8 = i7 + i7;
        Object[] objArr = this.f7965b;
        b72 b72Var = (b72) objArr[i8];
        if (b72Var != null) {
            return b72Var;
        }
        b72 b72VarA = u62.f9474c.a((Class) objArr[i8 + 1]);
        objArr[i8] = b72VarA;
        return b72VarA;
    }

    public final void J(int i6, Object obj, Object obj2) {
        int i7 = this.f7964a[i6];
        Object objJ = r72.j(F(i6) & 1048575, obj);
        if (objJ == null || H(i6) == null) {
            return;
        }
        throw null;
    }

    public final Object K(int i6) {
        int i7 = i6 / 3;
        return this.f7965b[i7 + i7];
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    @Override // com.google.android.gms.internal.ads.b72
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        if (!x(obj)) {
            return;
        }
        if (obj instanceof j52) {
            j52 j52Var = (j52) obj;
            j52Var.k(Integer.MAX_VALUE);
            j52Var.zzq = 0;
            j52Var.p();
        }
        int i6 = 0;
        while (true) {
            int[] iArr = this.f7964a;
            if (i6 >= iArr.length) {
                this.f7973k.getClass();
                m72 m72Var = ((j52) obj).zzt;
                if (m72Var.f6963e) {
                    m72Var.f6963e = false;
                }
                if (this.f7969f) {
                    ((w42) this.f7974l).getClass();
                    ((g52) obj).zza.c();
                    return;
                }
                return;
            }
            int iF = F(i6);
            int i7 = 1048575 & iF;
            int iE = E(iF);
            long j6 = i7;
            if (iE != 9) {
                if (iE != 60 && iE != 68) {
                    switch (iE) {
                        case 18:
                        case 19:
                        case 20:
                        case dn.zzm /* 21 */:
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
                        case ImageFormatConstants.INTERNAL_DEFINED_IMAGE_FORMAT_JPEG /* 33 */:
                        case ImageFormatConstants.INTERNAL_DEFINED_IMAGE_FORMAT_PRIVATE /* 34 */:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            ((r52) r72.j(j6, obj)).zzb();
                            break;
                        case 50:
                            Unsafe unsafe = f7963n;
                            Object object = unsafe.getObject(obj, j6);
                            if (object == null) {
                                break;
                            } else {
                                ((f62) object).s = false;
                                unsafe.putObject(obj, j6, object);
                                break;
                            }
                    }
                } else if (y(iArr[i6], i6, obj)) {
                    I(i6).a(f7963n.getObject(obj, j6));
                }
            } else if (v(i6, obj)) {
                I(i6).a(f7963n.getObject(obj, j6));
            }
            i6 += 3;
        }
    }

    @Override // com.google.android.gms.internal.ads.b72
    public final boolean b(j52 j52Var, j52 j52Var2) {
        boolean zH;
        int i6 = 0;
        while (true) {
            int[] iArr = this.f7964a;
            if (i6 < iArr.length) {
                int iF = F(i6);
                long j6 = iF & 1048575;
                switch (E(iF)) {
                    case 0:
                        if (!u(j52Var, j52Var2, i6)) {
                            break;
                        } else {
                            q72 q72Var = r72.f8574c;
                            if (Double.doubleToLongBits(q72Var.d(j6, j52Var)) != Double.doubleToLongBits(q72Var.d(j6, j52Var2))) {
                                break;
                            } else {
                                continue;
                                i6 += 3;
                            }
                        }
                    case 1:
                        if (!u(j52Var, j52Var2, i6)) {
                            break;
                        } else {
                            q72 q72Var2 = r72.f8574c;
                            if (Float.floatToIntBits(q72Var2.f(j6, j52Var)) != Float.floatToIntBits(q72Var2.f(j6, j52Var2))) {
                                break;
                            } else {
                                continue;
                                i6 += 3;
                            }
                        }
                    case 2:
                        if (!u(j52Var, j52Var2, i6) || r72.h(j6, j52Var) != r72.h(j6, j52Var2)) {
                            break;
                        } else {
                            continue;
                            i6 += 3;
                        }
                        break;
                    case 3:
                        if (!u(j52Var, j52Var2, i6) || r72.h(j6, j52Var) != r72.h(j6, j52Var2)) {
                            break;
                        } else {
                            continue;
                            i6 += 3;
                        }
                        break;
                    case 4:
                        if (!u(j52Var, j52Var2, i6) || r72.f(j6, j52Var) != r72.f(j6, j52Var2)) {
                            break;
                        } else {
                            continue;
                            i6 += 3;
                        }
                        break;
                    case 5:
                        if (!u(j52Var, j52Var2, i6) || r72.h(j6, j52Var) != r72.h(j6, j52Var2)) {
                            break;
                        } else {
                            continue;
                            i6 += 3;
                        }
                        break;
                    case 6:
                        if (!u(j52Var, j52Var2, i6) || r72.f(j6, j52Var) != r72.f(j6, j52Var2)) {
                            break;
                        } else {
                            continue;
                            i6 += 3;
                        }
                        break;
                    case 7:
                        if (!u(j52Var, j52Var2, i6)) {
                            break;
                        } else {
                            q72 q72Var3 = r72.f8574c;
                            if (q72Var3.r(j6, j52Var) != q72Var3.r(j6, j52Var2)) {
                                break;
                            } else {
                                continue;
                                i6 += 3;
                            }
                        }
                    case 8:
                        if (!u(j52Var, j52Var2, i6) || !c72.h(r72.j(j6, j52Var), r72.j(j6, j52Var2))) {
                            break;
                        } else {
                            continue;
                            i6 += 3;
                        }
                        break;
                    case 9:
                        if (!u(j52Var, j52Var2, i6) || !c72.h(r72.j(j6, j52Var), r72.j(j6, j52Var2))) {
                            break;
                        } else {
                            continue;
                            i6 += 3;
                        }
                        break;
                    case 10:
                        if (!u(j52Var, j52Var2, i6) || !c72.h(r72.j(j6, j52Var), r72.j(j6, j52Var2))) {
                            break;
                        } else {
                            continue;
                            i6 += 3;
                        }
                        break;
                    case 11:
                        if (!u(j52Var, j52Var2, i6) || r72.f(j6, j52Var) != r72.f(j6, j52Var2)) {
                            break;
                        } else {
                            continue;
                            i6 += 3;
                        }
                        break;
                    case 12:
                        if (!u(j52Var, j52Var2, i6) || r72.f(j6, j52Var) != r72.f(j6, j52Var2)) {
                            break;
                        } else {
                            continue;
                            i6 += 3;
                        }
                        break;
                    case 13:
                        if (!u(j52Var, j52Var2, i6) || r72.f(j6, j52Var) != r72.f(j6, j52Var2)) {
                            break;
                        } else {
                            continue;
                            i6 += 3;
                        }
                        break;
                    case 14:
                        if (!u(j52Var, j52Var2, i6) || r72.h(j6, j52Var) != r72.h(j6, j52Var2)) {
                            break;
                        } else {
                            continue;
                            i6 += 3;
                        }
                        break;
                    case 15:
                        if (!u(j52Var, j52Var2, i6) || r72.f(j6, j52Var) != r72.f(j6, j52Var2)) {
                            break;
                        } else {
                            continue;
                            i6 += 3;
                        }
                        break;
                    case 16:
                        if (!u(j52Var, j52Var2, i6) || r72.h(j6, j52Var) != r72.h(j6, j52Var2)) {
                            break;
                        } else {
                            continue;
                            i6 += 3;
                        }
                        break;
                    case 17:
                        if (!u(j52Var, j52Var2, i6) || !c72.h(r72.j(j6, j52Var), r72.j(j6, j52Var2))) {
                            break;
                        } else {
                            continue;
                            i6 += 3;
                        }
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case dn.zzm /* 21 */:
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
                    case ImageFormatConstants.INTERNAL_DEFINED_IMAGE_FORMAT_JPEG /* 33 */:
                    case ImageFormatConstants.INTERNAL_DEFINED_IMAGE_FORMAT_PRIVATE /* 34 */:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        zH = c72.h(r72.j(j6, j52Var), r72.j(j6, j52Var2));
                        break;
                    case 50:
                        zH = c72.h(r72.j(j6, j52Var), r72.j(j6, j52Var2));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                        long j7 = iArr[i6 + 2] & 1048575;
                        if (r72.f(j7, j52Var) != r72.f(j7, j52Var2) || !c72.h(r72.j(j6, j52Var), r72.j(j6, j52Var2))) {
                            break;
                        } else {
                            continue;
                            i6 += 3;
                        }
                        break;
                    default:
                        i6 += 3;
                }
                if (zH) {
                    i6 += 3;
                }
            } else if (j52Var.zzt.equals(j52Var2.zzt)) {
                if (this.f7969f) {
                    return ((g52) j52Var).zza.equals(((g52) j52Var2).zza);
                }
                return true;
            }
        }
        return false;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type update terminated with stack overflow, arg: (r18v1 java.lang.Object), method size: 1966
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // com.google.android.gms.internal.ads.b72
    public final void c(java.lang.Object r22, com.google.android.gms.internal.ads.l42 r23, com.google.android.gms.internal.ads.u42 r24) {
        /*
            Method dump skipped, instructions count: 1966
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.p62.c(java.lang.Object, com.google.android.gms.internal.ads.l42, com.google.android.gms.internal.ads.u42):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00db A[PHI: r1
      0x00db: PHI (r1v35 int) = (r1v11 int), (r1v36 int) binds: [B:85:0x01ea, B:43:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.ads.b72
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int d(j52 j52Var) {
        int i6;
        long jDoubleToLongBits;
        int i7;
        int iFloatToIntBits;
        int i8;
        int i9;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int[] iArr = this.f7964a;
            if (i10 >= iArr.length) {
                int iHashCode = j52Var.zzt.hashCode() + (i11 * 53);
                if (!this.f7969f) {
                    return iHashCode;
                }
                return ((g52) j52Var).zza.f11175a.hashCode() + (iHashCode * 53);
            }
            int iF = F(i10);
            int i12 = 1048575 & iF;
            int iE = E(iF);
            int i13 = iArr[i10];
            long j6 = i12;
            int i14 = 1237;
            int iHashCode2 = 37;
            switch (iE) {
                case 0:
                    i6 = i11 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(r72.f8574c.d(j6, j52Var));
                    Charset charset = s52.f8801a;
                    i11 = i6 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 1:
                    i7 = i11 * 53;
                    iFloatToIntBits = Float.floatToIntBits(r72.f8574c.f(j6, j52Var));
                    i11 = iFloatToIntBits + i7;
                    break;
                case 2:
                    i6 = i11 * 53;
                    jDoubleToLongBits = r72.h(j6, j52Var);
                    Charset charset2 = s52.f8801a;
                    i11 = i6 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 3:
                    i6 = i11 * 53;
                    jDoubleToLongBits = r72.h(j6, j52Var);
                    Charset charset3 = s52.f8801a;
                    i11 = i6 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 4:
                    i7 = i11 * 53;
                    iFloatToIntBits = r72.f(j6, j52Var);
                    i11 = iFloatToIntBits + i7;
                    break;
                case 5:
                    i6 = i11 * 53;
                    jDoubleToLongBits = r72.h(j6, j52Var);
                    Charset charset4 = s52.f8801a;
                    i11 = i6 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 6:
                    i7 = i11 * 53;
                    iFloatToIntBits = r72.f(j6, j52Var);
                    i11 = iFloatToIntBits + i7;
                    break;
                case 7:
                    i8 = i11 * 53;
                    boolean zR = r72.f8574c.r(j6, j52Var);
                    Charset charset5 = s52.f8801a;
                    if (zR) {
                        i14 = 1231;
                    }
                    i11 = i14 + i8;
                    break;
                case 8:
                    i7 = i11 * 53;
                    iFloatToIntBits = ((String) r72.j(j6, j52Var)).hashCode();
                    i11 = iFloatToIntBits + i7;
                    break;
                case 9:
                    i9 = i11 * 53;
                    Object objJ = r72.j(j6, j52Var);
                    if (objJ != null) {
                        iHashCode2 = objJ.hashCode();
                    }
                    i11 = i9 + iHashCode2;
                    break;
                case 10:
                    i7 = i11 * 53;
                    iFloatToIntBits = r72.j(j6, j52Var).hashCode();
                    i11 = iFloatToIntBits + i7;
                    break;
                case 11:
                    i7 = i11 * 53;
                    iFloatToIntBits = r72.f(j6, j52Var);
                    i11 = iFloatToIntBits + i7;
                    break;
                case 12:
                    i7 = i11 * 53;
                    iFloatToIntBits = r72.f(j6, j52Var);
                    i11 = iFloatToIntBits + i7;
                    break;
                case 13:
                    i7 = i11 * 53;
                    iFloatToIntBits = r72.f(j6, j52Var);
                    i11 = iFloatToIntBits + i7;
                    break;
                case 14:
                    i6 = i11 * 53;
                    jDoubleToLongBits = r72.h(j6, j52Var);
                    Charset charset6 = s52.f8801a;
                    i11 = i6 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 15:
                    i7 = i11 * 53;
                    iFloatToIntBits = r72.f(j6, j52Var);
                    i11 = iFloatToIntBits + i7;
                    break;
                case 16:
                    i6 = i11 * 53;
                    jDoubleToLongBits = r72.h(j6, j52Var);
                    Charset charset7 = s52.f8801a;
                    i11 = i6 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 17:
                    i9 = i11 * 53;
                    Object objJ2 = r72.j(j6, j52Var);
                    if (objJ2 != null) {
                        iHashCode2 = objJ2.hashCode();
                    }
                    i11 = i9 + iHashCode2;
                    break;
                case 18:
                case 19:
                case 20:
                case dn.zzm /* 21 */:
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
                case ImageFormatConstants.INTERNAL_DEFINED_IMAGE_FORMAT_JPEG /* 33 */:
                case ImageFormatConstants.INTERNAL_DEFINED_IMAGE_FORMAT_PRIVATE /* 34 */:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i7 = i11 * 53;
                    iFloatToIntBits = r72.j(j6, j52Var).hashCode();
                    i11 = iFloatToIntBits + i7;
                    break;
                case 50:
                    i7 = i11 * 53;
                    iFloatToIntBits = r72.j(j6, j52Var).hashCode();
                    i11 = iFloatToIntBits + i7;
                    break;
                case 51:
                    if (!y(i13, i10, j52Var)) {
                        break;
                    } else {
                        i6 = i11 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(((Double) r72.j(j6, j52Var)).doubleValue());
                        Charset charset8 = s52.f8801a;
                        i11 = i6 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                        break;
                    }
                case 52:
                    if (!y(i13, i10, j52Var)) {
                        break;
                    } else {
                        i7 = i11 * 53;
                        iFloatToIntBits = Float.floatToIntBits(((Float) r72.j(j6, j52Var)).floatValue());
                        i11 = iFloatToIntBits + i7;
                        break;
                    }
                case 53:
                    if (!y(i13, i10, j52Var)) {
                        break;
                    } else {
                        i6 = i11 * 53;
                        jDoubleToLongBits = G(j6, j52Var);
                        Charset charset9 = s52.f8801a;
                        i11 = i6 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                        break;
                    }
                case 54:
                    if (!y(i13, i10, j52Var)) {
                        break;
                    } else {
                        i6 = i11 * 53;
                        jDoubleToLongBits = G(j6, j52Var);
                        Charset charset10 = s52.f8801a;
                        i11 = i6 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                        break;
                    }
                case 55:
                    if (!y(i13, i10, j52Var)) {
                        break;
                    } else {
                        i7 = i11 * 53;
                        iFloatToIntBits = C(j6, j52Var);
                        i11 = iFloatToIntBits + i7;
                        break;
                    }
                case 56:
                    if (!y(i13, i10, j52Var)) {
                        break;
                    } else {
                        i6 = i11 * 53;
                        jDoubleToLongBits = G(j6, j52Var);
                        Charset charset11 = s52.f8801a;
                        i11 = i6 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                        break;
                    }
                case 57:
                    if (!y(i13, i10, j52Var)) {
                        break;
                    } else {
                        i7 = i11 * 53;
                        iFloatToIntBits = C(j6, j52Var);
                        i11 = iFloatToIntBits + i7;
                        break;
                    }
                case 58:
                    if (!y(i13, i10, j52Var)) {
                        break;
                    } else {
                        i8 = i11 * 53;
                        boolean zBooleanValue = ((Boolean) r72.j(j6, j52Var)).booleanValue();
                        Charset charset12 = s52.f8801a;
                        if (zBooleanValue) {
                        }
                        i11 = i14 + i8;
                        break;
                    }
                case 59:
                    if (!y(i13, i10, j52Var)) {
                        break;
                    } else {
                        i7 = i11 * 53;
                        iFloatToIntBits = ((String) r72.j(j6, j52Var)).hashCode();
                        i11 = iFloatToIntBits + i7;
                        break;
                    }
                case 60:
                    if (!y(i13, i10, j52Var)) {
                        break;
                    } else {
                        i7 = i11 * 53;
                        iFloatToIntBits = r72.j(j6, j52Var).hashCode();
                        i11 = iFloatToIntBits + i7;
                        break;
                    }
                case 61:
                    if (!y(i13, i10, j52Var)) {
                        break;
                    } else {
                        i7 = i11 * 53;
                        iFloatToIntBits = r72.j(j6, j52Var).hashCode();
                        i11 = iFloatToIntBits + i7;
                        break;
                    }
                case 62:
                    if (!y(i13, i10, j52Var)) {
                        break;
                    } else {
                        i7 = i11 * 53;
                        iFloatToIntBits = C(j6, j52Var);
                        i11 = iFloatToIntBits + i7;
                        break;
                    }
                case 63:
                    if (!y(i13, i10, j52Var)) {
                        break;
                    } else {
                        i7 = i11 * 53;
                        iFloatToIntBits = C(j6, j52Var);
                        i11 = iFloatToIntBits + i7;
                        break;
                    }
                case 64:
                    if (!y(i13, i10, j52Var)) {
                        break;
                    } else {
                        i7 = i11 * 53;
                        iFloatToIntBits = C(j6, j52Var);
                        i11 = iFloatToIntBits + i7;
                        break;
                    }
                case 65:
                    if (!y(i13, i10, j52Var)) {
                        break;
                    } else {
                        i6 = i11 * 53;
                        jDoubleToLongBits = G(j6, j52Var);
                        Charset charset13 = s52.f8801a;
                        i11 = i6 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                        break;
                    }
                case 66:
                    if (!y(i13, i10, j52Var)) {
                        break;
                    } else {
                        i7 = i11 * 53;
                        iFloatToIntBits = C(j6, j52Var);
                        i11 = iFloatToIntBits + i7;
                        break;
                    }
                case 67:
                    if (!y(i13, i10, j52Var)) {
                        break;
                    } else {
                        i6 = i11 * 53;
                        jDoubleToLongBits = G(j6, j52Var);
                        Charset charset14 = s52.f8801a;
                        i11 = i6 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                        break;
                    }
                case 68:
                    if (!y(i13, i10, j52Var)) {
                        break;
                    } else {
                        i7 = i11 * 53;
                        iFloatToIntBits = r72.j(j6, j52Var).hashCode();
                        i11 = iFloatToIntBits + i7;
                        break;
                    }
            }
            i10 += 3;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    @Override // com.google.android.gms.internal.ads.b72
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(Object obj, y72 y72Var) {
        Map.Entry entry;
        boolean z6;
        int[] iArr;
        int i6;
        boolean z7;
        p62<T> p62Var = this;
        if (p62Var.f7969f) {
            z42 z42Var = ((g52) obj).zza;
            entry = !z42Var.f11175a.isEmpty() ? (Map.Entry) z42Var.b().next() : null;
        }
        Unsafe unsafe = f7963n;
        int i7 = 1048575;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            int[] iArr2 = p62Var.f7964a;
            int length = iArr2.length;
            v42 v42Var = p62Var.f7974l;
            if (i8 >= length) {
                if (entry == null) {
                    ((j52) obj).zzt.c(y72Var);
                    return;
                }
                ((w42) v42Var).getClass();
                ((h52) entry.getKey()).getClass();
                w72 w72Var = w72.s;
                throw null;
            }
            int iF = p62Var.F(i8);
            int iE = E(iF);
            int i10 = iArr2[i8];
            if (iE <= 17) {
                int i11 = iArr2[i8 + 2];
                z6 = true;
                int i12 = i11 & 1048575;
                if (i12 != i7) {
                    i9 = i12 == 1048575 ? 0 : unsafe.getInt(obj, i12);
                    i7 = i12;
                }
                int i13 = 1 << (i11 >>> 20);
                iArr = iArr2;
                i6 = i13;
            } else {
                z6 = true;
                iArr = iArr2;
                i6 = 0;
            }
            if (entry != null) {
                ((h52) entry.getKey()).getClass();
                if (i10 >= 0) {
                    ((w42) v42Var).getClass();
                    ((h52) entry.getKey()).getClass();
                    w72 w72Var2 = w72.s;
                    throw null;
                }
            }
            long j6 = iF & 1048575;
            switch (iE) {
                case 0:
                    if (p62Var.w(obj, i8, i7, i9, i6)) {
                        ((q42) y72Var).f8227a.z(i10, Double.doubleToRawLongBits(r72.f8574c.d(j6, obj)));
                    }
                    i8 += 3;
                    p62Var = this;
                case 1:
                    if (p62Var.w(obj, i8, i7, i9, i6)) {
                        ((q42) y72Var).f8227a.x(i10, Float.floatToRawIntBits(r72.f8574c.f(j6, obj)));
                    }
                    i8 += 3;
                    p62Var = this;
                case 2:
                    if (p62Var.w(obj, i8, i7, i9, i6)) {
                        ((q42) y72Var).f8227a.K(i10, unsafe.getLong(obj, j6));
                    }
                    i8 += 3;
                    p62Var = this;
                case 3:
                    if (p62Var.w(obj, i8, i7, i9, i6)) {
                        ((q42) y72Var).f8227a.K(i10, unsafe.getLong(obj, j6));
                    }
                    i8 += 3;
                    p62Var = this;
                case 4:
                    if (p62Var.w(obj, i8, i7, i9, i6)) {
                        ((q42) y72Var).f8227a.B(i10, unsafe.getInt(obj, j6));
                    }
                    i8 += 3;
                    p62Var = this;
                case 5:
                    if (p62Var.w(obj, i8, i7, i9, i6)) {
                        ((q42) y72Var).f8227a.z(i10, unsafe.getLong(obj, j6));
                    }
                    i8 += 3;
                    p62Var = this;
                case 6:
                    if (p62Var.w(obj, i8, i7, i9, i6)) {
                        ((q42) y72Var).f8227a.x(i10, unsafe.getInt(obj, j6));
                    }
                    i8 += 3;
                    p62Var = this;
                case 7:
                    if (p62Var.w(obj, i8, i7, i9, i6)) {
                        ((q42) y72Var).f8227a.v(i10, r72.f8574c.r(j6, obj));
                    }
                    i8 += 3;
                    p62Var = this;
                case 8:
                    if (p62Var.w(obj, i8, i7, i9, i6)) {
                        Object object = unsafe.getObject(obj, j6);
                        if (object instanceof String) {
                            ((q42) y72Var).f8227a.G(i10, (String) object);
                        } else {
                            ((q42) y72Var).f8227a.w(i10, (g42) object);
                        }
                    }
                    i8 += 3;
                    p62Var = this;
                case 9:
                    if (p62Var.w(obj, i8, i7, i9, i6)) {
                        Object object2 = unsafe.getObject(obj, j6);
                        b72 b72VarI = p62Var.I(i8);
                        q42 q42Var = (q42) y72Var;
                        q42Var.getClass();
                        q42Var.f8227a.D(i10, (m62) object2, b72VarI);
                    }
                    i8 += 3;
                    p62Var = this;
                case 10:
                    if (p62Var.w(obj, i8, i7, i9, i6)) {
                        ((q42) y72Var).f8227a.w(i10, (g42) unsafe.getObject(obj, j6));
                    }
                    i8 += 3;
                    p62Var = this;
                case 11:
                    if (p62Var.w(obj, i8, i7, i9, i6)) {
                        ((q42) y72Var).f8227a.I(i10, unsafe.getInt(obj, j6));
                    }
                    i8 += 3;
                    p62Var = this;
                case 12:
                    if (p62Var.w(obj, i8, i7, i9, i6)) {
                        ((q42) y72Var).f8227a.B(i10, unsafe.getInt(obj, j6));
                    }
                    i8 += 3;
                    p62Var = this;
                case 13:
                    if (p62Var.w(obj, i8, i7, i9, i6)) {
                        ((q42) y72Var).f8227a.x(i10, unsafe.getInt(obj, j6));
                    }
                    i8 += 3;
                    p62Var = this;
                case 14:
                    if (p62Var.w(obj, i8, i7, i9, i6)) {
                        ((q42) y72Var).f8227a.z(i10, unsafe.getLong(obj, j6));
                    }
                    i8 += 3;
                    p62Var = this;
                case 15:
                    if (p62Var.w(obj, i8, i7, i9, i6)) {
                        int i14 = unsafe.getInt(obj, j6);
                        ((q42) y72Var).f8227a.I(i10, (i14 >> 31) ^ (i14 + i14));
                    }
                    i8 += 3;
                    p62Var = this;
                case 16:
                    if (p62Var.w(obj, i8, i7, i9, i6)) {
                        long j7 = unsafe.getLong(obj, j6);
                        ((q42) y72Var).f8227a.K(i10, (j7 + j7) ^ (j7 >> 63));
                    }
                    i8 += 3;
                    p62Var = this;
                case 17:
                    if (p62Var.w(obj, i8, i7, i9, i6)) {
                        ((q42) y72Var).a(i10, unsafe.getObject(obj, j6), p62Var.I(i8));
                    }
                    i8 += 3;
                    p62Var = this;
                case 18:
                    c72.v(iArr[i8], (List) unsafe.getObject(obj, j6), y72Var, false);
                    i8 += 3;
                    p62Var = this;
                case 19:
                    c72.z(iArr[i8], (List) unsafe.getObject(obj, j6), y72Var, false);
                    i8 += 3;
                    p62Var = this;
                case 20:
                    c72.a(iArr[i8], (List) unsafe.getObject(obj, j6), y72Var, false);
                    i8 += 3;
                    p62Var = this;
                case dn.zzm /* 21 */:
                    c72.g(iArr[i8], (List) unsafe.getObject(obj, j6), y72Var, false);
                    i8 += 3;
                    p62Var = this;
                case 22:
                    c72.A(iArr[i8], (List) unsafe.getObject(obj, j6), y72Var, false);
                    i8 += 3;
                    p62Var = this;
                case 23:
                    c72.y(iArr[i8], (List) unsafe.getObject(obj, j6), y72Var, false);
                    i8 += 3;
                    p62Var = this;
                case 24:
                    c72.x(iArr[i8], (List) unsafe.getObject(obj, j6), y72Var, false);
                    i8 += 3;
                    p62Var = this;
                case 25:
                    c72.u(iArr[i8], (List) unsafe.getObject(obj, j6), y72Var, false);
                    i8 += 3;
                    p62Var = this;
                case 26:
                    int i15 = iArr[i8];
                    List list = (List) unsafe.getObject(obj, j6);
                    ed0 ed0Var = c72.f3456a;
                    if (list != null && !list.isEmpty()) {
                        p42 p42Var = ((q42) y72Var).f8227a;
                        if (list instanceof a62) {
                            a62 a62Var = (a62) list;
                            for (int i16 = 0; i16 < list.size(); i16++) {
                                Object objZzc = a62Var.zzc();
                                if (objZzc instanceof String) {
                                    p42Var.G(i15, (String) objZzc);
                                } else {
                                    p42Var.w(i15, (g42) objZzc);
                                }
                            }
                        } else {
                            for (int i17 = 0; i17 < list.size(); i17++) {
                                p42Var.G(i15, (String) list.get(i17));
                            }
                        }
                    }
                    i8 += 3;
                    p62Var = this;
                    break;
                case 27:
                    int i18 = iArr[i8];
                    List list2 = (List) unsafe.getObject(obj, j6);
                    b72 b72VarI2 = p62Var.I(i8);
                    ed0 ed0Var2 = c72.f3456a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i19 = 0; i19 < list2.size(); i19++) {
                            Object obj2 = list2.get(i19);
                            q42 q42Var2 = (q42) y72Var;
                            q42Var2.getClass();
                            q42Var2.f8227a.D(i18, (m62) obj2, b72VarI2);
                        }
                    }
                    i8 += 3;
                    p62Var = this;
                    break;
                case 28:
                    int i20 = iArr[i8];
                    List list3 = (List) unsafe.getObject(obj, j6);
                    ed0 ed0Var3 = c72.f3456a;
                    if (list3 != null && !list3.isEmpty()) {
                        q42 q42Var3 = (q42) y72Var;
                        q42Var3.getClass();
                        for (int i21 = 0; i21 < list3.size(); i21++) {
                            q42Var3.f8227a.w(i20, (g42) list3.get(i21));
                        }
                    }
                    i8 += 3;
                    p62Var = this;
                    break;
                case 29:
                    z7 = false;
                    c72.f(iArr[i8], (List) unsafe.getObject(obj, j6), y72Var, false);
                    i8 += 3;
                    p62Var = this;
                case 30:
                    z7 = false;
                    c72.w(iArr[i8], (List) unsafe.getObject(obj, j6), y72Var, false);
                    i8 += 3;
                    p62Var = this;
                case 31:
                    z7 = false;
                    c72.b(iArr[i8], (List) unsafe.getObject(obj, j6), y72Var, false);
                    i8 += 3;
                    p62Var = this;
                case 32:
                    z7 = false;
                    c72.c(iArr[i8], (List) unsafe.getObject(obj, j6), y72Var, false);
                    i8 += 3;
                    p62Var = this;
                case ImageFormatConstants.INTERNAL_DEFINED_IMAGE_FORMAT_JPEG /* 33 */:
                    z7 = false;
                    c72.d(iArr[i8], (List) unsafe.getObject(obj, j6), y72Var, false);
                    i8 += 3;
                    p62Var = this;
                case ImageFormatConstants.INTERNAL_DEFINED_IMAGE_FORMAT_PRIVATE /* 34 */:
                    z7 = false;
                    c72.e(iArr[i8], (List) unsafe.getObject(obj, j6), y72Var, false);
                    i8 += 3;
                    p62Var = this;
                case 35:
                    c72.v(iArr[i8], (List) unsafe.getObject(obj, j6), y72Var, z6);
                    i8 += 3;
                    p62Var = this;
                case 36:
                    c72.z(iArr[i8], (List) unsafe.getObject(obj, j6), y72Var, z6);
                    i8 += 3;
                    p62Var = this;
                case 37:
                    c72.a(iArr[i8], (List) unsafe.getObject(obj, j6), y72Var, z6);
                    i8 += 3;
                    p62Var = this;
                case 38:
                    c72.g(iArr[i8], (List) unsafe.getObject(obj, j6), y72Var, z6);
                    i8 += 3;
                    p62Var = this;
                case 39:
                    c72.A(iArr[i8], (List) unsafe.getObject(obj, j6), y72Var, z6);
                    i8 += 3;
                    p62Var = this;
                case 40:
                    c72.y(iArr[i8], (List) unsafe.getObject(obj, j6), y72Var, z6);
                    i8 += 3;
                    p62Var = this;
                case 41:
                    c72.x(iArr[i8], (List) unsafe.getObject(obj, j6), y72Var, z6);
                    i8 += 3;
                    p62Var = this;
                case 42:
                    c72.u(iArr[i8], (List) unsafe.getObject(obj, j6), y72Var, z6);
                    i8 += 3;
                    p62Var = this;
                case 43:
                    c72.f(iArr[i8], (List) unsafe.getObject(obj, j6), y72Var, z6);
                    i8 += 3;
                    p62Var = this;
                case 44:
                    c72.w(iArr[i8], (List) unsafe.getObject(obj, j6), y72Var, z6);
                    i8 += 3;
                    p62Var = this;
                case 45:
                    c72.b(iArr[i8], (List) unsafe.getObject(obj, j6), y72Var, z6);
                    i8 += 3;
                    p62Var = this;
                case 46:
                    c72.c(iArr[i8], (List) unsafe.getObject(obj, j6), y72Var, z6);
                    i8 += 3;
                    p62Var = this;
                case 47:
                    c72.d(iArr[i8], (List) unsafe.getObject(obj, j6), y72Var, z6);
                    i8 += 3;
                    p62Var = this;
                case 48:
                    c72.e(iArr[i8], (List) unsafe.getObject(obj, j6), y72Var, z6);
                    i8 += 3;
                    p62Var = this;
                case 49:
                    int i22 = iArr[i8];
                    List list4 = (List) unsafe.getObject(obj, j6);
                    b72 b72VarI3 = p62Var.I(i8);
                    ed0 ed0Var4 = c72.f3456a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i23 = 0; i23 < list4.size(); i23++) {
                            ((q42) y72Var).a(i22, list4.get(i23), b72VarI3);
                        }
                    }
                    i8 += 3;
                    p62Var = this;
                    break;
                case 50:
                    if (unsafe.getObject(obj, j6) != null) {
                        throw null;
                    }
                    i8 += 3;
                    p62Var = this;
                case 51:
                    if (p62Var.y(i10, i8, obj)) {
                        ((q42) y72Var).f8227a.z(i10, Double.doubleToRawLongBits(((Double) r72.j(j6, obj)).doubleValue()));
                    }
                    i8 += 3;
                    p62Var = this;
                case 52:
                    if (p62Var.y(i10, i8, obj)) {
                        ((q42) y72Var).f8227a.x(i10, Float.floatToRawIntBits(((Float) r72.j(j6, obj)).floatValue()));
                    }
                    i8 += 3;
                    p62Var = this;
                case 53:
                    if (p62Var.y(i10, i8, obj)) {
                        ((q42) y72Var).f8227a.K(i10, G(j6, obj));
                    }
                    i8 += 3;
                    p62Var = this;
                case 54:
                    if (p62Var.y(i10, i8, obj)) {
                        ((q42) y72Var).f8227a.K(i10, G(j6, obj));
                    }
                    i8 += 3;
                    p62Var = this;
                case 55:
                    if (p62Var.y(i10, i8, obj)) {
                        ((q42) y72Var).f8227a.B(i10, C(j6, obj));
                    }
                    i8 += 3;
                    p62Var = this;
                case 56:
                    if (p62Var.y(i10, i8, obj)) {
                        ((q42) y72Var).f8227a.z(i10, G(j6, obj));
                    }
                    i8 += 3;
                    p62Var = this;
                case 57:
                    if (p62Var.y(i10, i8, obj)) {
                        ((q42) y72Var).f8227a.x(i10, C(j6, obj));
                    }
                    i8 += 3;
                    p62Var = this;
                case 58:
                    if (p62Var.y(i10, i8, obj)) {
                        ((q42) y72Var).f8227a.v(i10, ((Boolean) r72.j(j6, obj)).booleanValue());
                    }
                    i8 += 3;
                    p62Var = this;
                case 59:
                    if (p62Var.y(i10, i8, obj)) {
                        Object object3 = unsafe.getObject(obj, j6);
                        if (object3 instanceof String) {
                            ((q42) y72Var).f8227a.G(i10, (String) object3);
                        } else {
                            ((q42) y72Var).f8227a.w(i10, (g42) object3);
                        }
                    }
                    i8 += 3;
                    p62Var = this;
                case 60:
                    if (p62Var.y(i10, i8, obj)) {
                        Object object4 = unsafe.getObject(obj, j6);
                        b72 b72VarI4 = p62Var.I(i8);
                        q42 q42Var4 = (q42) y72Var;
                        q42Var4.getClass();
                        q42Var4.f8227a.D(i10, (m62) object4, b72VarI4);
                    }
                    i8 += 3;
                    p62Var = this;
                case 61:
                    if (p62Var.y(i10, i8, obj)) {
                        ((q42) y72Var).f8227a.w(i10, (g42) unsafe.getObject(obj, j6));
                    }
                    i8 += 3;
                    p62Var = this;
                case 62:
                    if (p62Var.y(i10, i8, obj)) {
                        ((q42) y72Var).f8227a.I(i10, C(j6, obj));
                    }
                    i8 += 3;
                    p62Var = this;
                case 63:
                    if (p62Var.y(i10, i8, obj)) {
                        ((q42) y72Var).f8227a.B(i10, C(j6, obj));
                    }
                    i8 += 3;
                    p62Var = this;
                case 64:
                    if (p62Var.y(i10, i8, obj)) {
                        ((q42) y72Var).f8227a.x(i10, C(j6, obj));
                    }
                    i8 += 3;
                    p62Var = this;
                case 65:
                    if (p62Var.y(i10, i8, obj)) {
                        ((q42) y72Var).f8227a.z(i10, G(j6, obj));
                    }
                    i8 += 3;
                    p62Var = this;
                case 66:
                    if (p62Var.y(i10, i8, obj)) {
                        int iC = C(j6, obj);
                        ((q42) y72Var).f8227a.I(i10, (iC >> 31) ^ (iC + iC));
                    }
                    i8 += 3;
                    p62Var = this;
                case 67:
                    if (p62Var.y(i10, i8, obj)) {
                        long jG = G(j6, obj);
                        ((q42) y72Var).f8227a.K(i10, (jG + jG) ^ (jG >> 63));
                    }
                    i8 += 3;
                    p62Var = this;
                case 68:
                    if (p62Var.y(i10, i8, obj)) {
                        ((q42) y72Var).a(i10, unsafe.getObject(obj, j6), p62Var.I(i8));
                    }
                    i8 += 3;
                    p62Var = this;
                default:
                    i8 += 3;
                    p62Var = this;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.b72
    public final void f(Object obj, byte[] bArr, int i6, int i7, x32 x32Var) throws u52 {
        z(obj, bArr, i6, i7, 0, x32Var);
    }

    @Override // com.google.android.gms.internal.ads.b72
    public final boolean g(Object obj) {
        int i6;
        int i7;
        int i8;
        int i9 = 0;
        int i10 = 0;
        int i11 = 1048575;
        while (i10 < this.f7971i) {
            int i12 = this.h[i10];
            int[] iArr = this.f7964a;
            int i13 = iArr[i12];
            int iF = F(i12);
            int i14 = iArr[i12 + 2];
            int i15 = i14 & 1048575;
            int i16 = 1 << (i14 >>> 20);
            if (i15 != i11) {
                if (i15 != 1048575) {
                    i9 = f7963n.getInt(obj, i15);
                }
                i7 = i12;
                i8 = i9;
                i6 = i15;
            } else {
                int i17 = i9;
                i6 = i11;
                i7 = i12;
                i8 = i17;
            }
            if ((268435456 & iF) == 0 || w(obj, i7, i6, i8, i16)) {
                int iE = E(iF);
                if (iE != 9 && iE != 17) {
                    if (iE != 27) {
                        if (iE == 60 || iE == 68) {
                            if (!y(i13, i7, obj) || I(i7).g(r72.j(iF & 1048575, obj))) {
                            }
                        } else if (iE != 49) {
                            if (iE == 50 && !((f62) r72.j(iF & 1048575, obj)).isEmpty()) {
                                throw null;
                            }
                        }
                        i10++;
                        i11 = i6;
                        i9 = i8;
                    }
                    List list = (List) r72.j(iF & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        b72 b72VarI = I(i7);
                        for (int i18 = 0; i18 < list.size(); i18++) {
                            if (b72VarI.g(list.get(i18))) {
                            }
                        }
                    }
                    i10++;
                    i11 = i6;
                    i9 = i8;
                } else if (!w(obj, i7, i6, i8, i16) || I(i7).g(r72.j(iF & 1048575, obj))) {
                    i10++;
                    i11 = i6;
                    i9 = i8;
                }
            }
            return false;
        }
        if (this.f7969f) {
            ((g52) obj).zza.e();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0504  */
    @Override // com.google.android.gms.internal.ads.b72
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int h(j52 j52Var) {
        int i6;
        int iR;
        int iS;
        int iR2;
        int iG;
        int iR3;
        int iN;
        int i7;
        int iF;
        int size;
        int iR4;
        int iR5;
        int iR6;
        int iR7;
        int iR8;
        int size2;
        int iR9;
        int iR10;
        int iF2;
        int iR11;
        int iS2;
        p62<T> p62Var = this;
        j52 j52Var2 = j52Var;
        Unsafe unsafe = f7963n;
        int i8 = 1048575;
        int i9 = 1048575;
        int i10 = 0;
        int i11 = 0;
        int iC = 0;
        while (true) {
            int[] iArr = p62Var.f7964a;
            if (i10 >= iArr.length) {
                int iA = j52Var2.zzt.a() + iC;
                if (!p62Var.f7969f) {
                    return iA;
                }
                d72 d72Var = ((g52) j52Var2).zza.f11175a;
                int i12 = d72Var.f5963t;
                int iA2 = 0;
                for (int i13 = 0; i13 < i12; i13++) {
                    e72 e72VarD = d72Var.d(i13);
                    iA2 = z42.a((y42) e72VarD.s, e72VarD.f4151t) + iA2;
                }
                for (Map.Entry entry : d72Var.b()) {
                    iA2 = z42.a((y42) entry.getKey(), entry.getValue()) + iA2;
                }
                return iA + iA2;
            }
            int iF3 = p62Var.F(i10);
            int iE = E(iF3);
            int i14 = iArr[i10];
            int i15 = iArr[i10 + 2];
            int i16 = i15 & i8;
            if (iE <= 17) {
                if (i16 != i9) {
                    i11 = i16 == i8 ? 0 : unsafe.getInt(j52Var2, i16);
                    i9 = i16;
                }
                i6 = 1 << (i15 >>> 20);
            } else {
                i6 = 0;
            }
            int i17 = iF3 & i8;
            if (iE >= a52.f2584t.s) {
                a52.f2585u.getClass();
            }
            long j6 = i17;
            switch (iE) {
                case 0:
                    if (p62Var.w(j52Var2, i10, i9, i11, i6)) {
                        iC = androidx.camera.view.g.c(i14 << 3, 8, iC);
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 1:
                    if (p62Var.w(j52Var2, i10, i9, i11, i6)) {
                        iC = androidx.camera.view.g.c(i14 << 3, 4, iC);
                    }
                    p62Var = this;
                    j52Var2 = j52Var;
                    i10 += 3;
                    i8 = 1048575;
                case 2:
                    if (p62Var.w(j52Var2, i10, i9, i11, i6)) {
                        long j7 = unsafe.getLong(j52Var2, j6);
                        iR = p42.r(i14 << 3);
                        iS = p42.s(j7);
                        iC += iS + iR;
                    }
                    p62Var = this;
                    i10 += 3;
                    i8 = 1048575;
                case 3:
                    if (p62Var.w(j52Var2, i10, i9, i11, i6)) {
                        long j8 = unsafe.getLong(j52Var2, j6);
                        iR = p42.r(i14 << 3);
                        iS = p42.s(j8);
                        iC += iS + iR;
                    }
                    p62Var = this;
                    i10 += 3;
                    i8 = 1048575;
                case 4:
                    if (p62Var.w(j52Var2, i10, i9, i11, i6)) {
                        long j9 = unsafe.getInt(j52Var2, j6);
                        iR = p42.r(i14 << 3);
                        iS = p42.s(j9);
                        iC += iS + iR;
                    }
                    p62Var = this;
                    i10 += 3;
                    i8 = 1048575;
                case 5:
                    if (p62Var.w(j52Var2, i10, i9, i11, i6)) {
                        iC = androidx.camera.view.g.c(i14 << 3, 8, iC);
                    }
                    p62Var = this;
                    j52Var2 = j52Var;
                    i10 += 3;
                    i8 = 1048575;
                case 6:
                    if (p62Var.w(j52Var2, i10, i9, i11, i6)) {
                        iC = androidx.camera.view.g.c(i14 << 3, 4, iC);
                    }
                    p62Var = this;
                    j52Var2 = j52Var;
                    i10 += 3;
                    i8 = 1048575;
                case 7:
                    if (p62Var.w(j52Var2, i10, i9, i11, i6)) {
                        iC = androidx.camera.view.g.c(i14 << 3, 1, iC);
                    }
                    p62Var = this;
                    j52Var2 = j52Var;
                    i10 += 3;
                    i8 = 1048575;
                case 8:
                    if (p62Var.w(j52Var2, i10, i9, i11, i6)) {
                        int i18 = i14 << 3;
                        Object object = unsafe.getObject(j52Var2, j6);
                        if (object instanceof g42) {
                            iR2 = p42.r(i18);
                            iG = ((g42) object).g();
                            iR3 = p42.r(iG);
                            iC += iR3 + iG + iR2;
                        } else {
                            iR = p42.r(i18);
                            iS = p42.q((String) object);
                            iC += iS + iR;
                        }
                    }
                    p62Var = this;
                    i10 += 3;
                    i8 = 1048575;
                case 9:
                    if (p62Var.w(j52Var2, i10, i9, i11, i6)) {
                        iN = c72.n(i14, unsafe.getObject(j52Var2, j6), p62Var.I(i10));
                        iC += iN;
                        i10 += 3;
                        i8 = 1048575;
                    } else {
                        i10 += 3;
                        i8 = 1048575;
                    }
                case 10:
                    if (p62Var.w(j52Var2, i10, i9, i11, i6)) {
                        g42 g42Var = (g42) unsafe.getObject(j52Var2, j6);
                        iR2 = p42.r(i14 << 3);
                        iG = g42Var.g();
                        iR3 = p42.r(iG);
                        iC += iR3 + iG + iR2;
                    }
                    p62Var = this;
                    i10 += 3;
                    i8 = 1048575;
                case 11:
                    if (p62Var.w(j52Var2, i10, i9, i11, i6)) {
                        iC = androidx.camera.view.g.c(unsafe.getInt(j52Var2, j6), p42.r(i14 << 3), iC);
                    }
                    p62Var = this;
                    i10 += 3;
                    i8 = 1048575;
                case 12:
                    if (p62Var.w(j52Var2, i10, i9, i11, i6)) {
                        long j10 = unsafe.getInt(j52Var2, j6);
                        iR = p42.r(i14 << 3);
                        iS = p42.s(j10);
                        iC += iS + iR;
                    }
                    p62Var = this;
                    i10 += 3;
                    i8 = 1048575;
                case 13:
                    if (p62Var.w(j52Var2, i10, i9, i11, i6)) {
                        iC = androidx.camera.view.g.c(i14 << 3, 4, iC);
                    }
                    p62Var = this;
                    j52Var2 = j52Var;
                    i10 += 3;
                    i8 = 1048575;
                case 14:
                    if (p62Var.w(j52Var2, i10, i9, i11, i6)) {
                        iC = androidx.camera.view.g.c(i14 << 3, 8, iC);
                    }
                    p62Var = this;
                    j52Var2 = j52Var;
                    i10 += 3;
                    i8 = 1048575;
                case 15:
                    if (p62Var.w(j52Var2, i10, i9, i11, i6)) {
                        int i19 = unsafe.getInt(j52Var2, j6);
                        iC = androidx.camera.view.g.c((i19 >> 31) ^ (i19 + i19), p42.r(i14 << 3), iC);
                    }
                    p62Var = this;
                    i10 += 3;
                    i8 = 1048575;
                case 16:
                    if (p62Var.w(j52Var2, i10, i9, i11, i6)) {
                        long j11 = unsafe.getLong(j52Var2, j6);
                        iR = p42.r(i14 << 3);
                        iS = p42.s((j11 >> 63) ^ (j11 + j11));
                        iC += iS + iR;
                    }
                    p62Var = this;
                    i10 += 3;
                    i8 = 1048575;
                case 17:
                    if (p62Var.w(j52Var2, i10, i9, i11, i6)) {
                        m62 m62Var = (m62) unsafe.getObject(j52Var2, j6);
                        b72 b72VarI = p62Var.I(i10);
                        int iR12 = p42.r(i14 << 3);
                        i7 = iR12 + iR12;
                        iF = ((t32) m62Var).f(b72VarI);
                        iN = iF + i7;
                        iC += iN;
                        i10 += 3;
                        i8 = 1048575;
                    } else {
                        i10 += 3;
                        i8 = 1048575;
                    }
                case 18:
                    iN = c72.k(i14, (List) unsafe.getObject(j52Var2, j6));
                    iC += iN;
                    i10 += 3;
                    i8 = 1048575;
                case 19:
                    iN = c72.j(i14, (List) unsafe.getObject(j52Var2, j6));
                    iC += iN;
                    i10 += 3;
                    i8 = 1048575;
                case 20:
                    List list = (List) unsafe.getObject(j52Var2, j6);
                    ed0 ed0Var = c72.f3456a;
                    iR6 = list.size() == 0 ? 0 : (p42.r(i14 << 3) * list.size()) + c72.m(list);
                    iC += iR6;
                    i10 += 3;
                    i8 = 1048575;
                case dn.zzm /* 21 */:
                    List list2 = (List) unsafe.getObject(j52Var2, j6);
                    ed0 ed0Var2 = c72.f3456a;
                    size = list2.size();
                    if (size != 0) {
                        iR4 = c72.r(list2);
                        iR5 = p42.r(i14 << 3);
                        iR7 = (iR5 * size) + iR4;
                        iC += iR7;
                        i10 += 3;
                        i8 = 1048575;
                    }
                    iR7 = 0;
                    iC += iR7;
                    i10 += 3;
                    i8 = 1048575;
                case 22:
                    List list3 = (List) unsafe.getObject(j52Var2, j6);
                    ed0 ed0Var3 = c72.f3456a;
                    size = list3.size();
                    if (size != 0) {
                        iR4 = c72.l(list3);
                        iR5 = p42.r(i14 << 3);
                        iR7 = (iR5 * size) + iR4;
                        iC += iR7;
                        i10 += 3;
                        i8 = 1048575;
                    }
                    iR7 = 0;
                    iC += iR7;
                    i10 += 3;
                    i8 = 1048575;
                case 23:
                    iN = c72.k(i14, (List) unsafe.getObject(j52Var2, j6));
                    iC += iN;
                    i10 += 3;
                    i8 = 1048575;
                case 24:
                    iN = c72.j(i14, (List) unsafe.getObject(j52Var2, j6));
                    iC += iN;
                    i10 += 3;
                    i8 = 1048575;
                case 25:
                    List list4 = (List) unsafe.getObject(j52Var2, j6);
                    ed0 ed0Var4 = c72.f3456a;
                    int size3 = list4.size();
                    if (size3 != 0) {
                        iR6 = (p42.r(i14 << 3) + 1) * size3;
                    }
                    iC += iR6;
                    i10 += 3;
                    i8 = 1048575;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(j52Var2, j6);
                    ed0 ed0Var5 = c72.f3456a;
                    int size4 = list5.size();
                    if (size4 == 0) {
                        iR7 = 0;
                    } else {
                        iR7 = p42.r(i14 << 3) * size4;
                        if (list5 instanceof a62) {
                            a62 a62Var = (a62) list5;
                            for (int i20 = 0; i20 < size4; i20++) {
                                Object objZzc = a62Var.zzc();
                                if (objZzc instanceof g42) {
                                    int iG2 = ((g42) objZzc).g();
                                    iR7 = androidx.camera.view.g.c(iG2, iG2, iR7);
                                } else {
                                    iR7 = p42.q((String) objZzc) + iR7;
                                }
                            }
                        } else {
                            for (int i21 = 0; i21 < size4; i21++) {
                                Object obj = list5.get(i21);
                                if (obj instanceof g42) {
                                    int iG3 = ((g42) obj).g();
                                    iR7 = androidx.camera.view.g.c(iG3, iG3, iR7);
                                } else {
                                    iR7 = p42.q((String) obj) + iR7;
                                }
                            }
                        }
                    }
                    iC += iR7;
                    i10 += 3;
                    i8 = 1048575;
                case 27:
                    List list6 = (List) unsafe.getObject(j52Var2, j6);
                    b72 b72VarI2 = p62Var.I(i10);
                    ed0 ed0Var6 = c72.f3456a;
                    int size5 = list6.size();
                    if (size5 == 0) {
                        iR8 = 0;
                    } else {
                        iR8 = p42.r(i14 << 3) * size5;
                        for (int i22 = 0; i22 < size5; i22++) {
                            Object obj2 = list6.get(i22);
                            if (obj2 instanceof z52) {
                                int iA3 = ((z52) obj2).a();
                                iR8 = androidx.camera.view.g.c(iA3, iA3, iR8);
                            } else {
                                int iF4 = ((t32) ((m62) obj2)).f(b72VarI2);
                                iR8 = androidx.camera.view.g.c(iF4, iF4, iR8);
                            }
                        }
                    }
                    iC += iR8;
                    i10 += 3;
                    i8 = 1048575;
                case 28:
                    List list7 = (List) unsafe.getObject(j52Var2, j6);
                    ed0 ed0Var7 = c72.f3456a;
                    int size6 = list7.size();
                    if (size6 != 0) {
                        iR7 = p42.r(i14 << 3) * size6;
                        for (int i23 = 0; i23 < list7.size(); i23++) {
                            int iG4 = ((g42) list7.get(i23)).g();
                            iR7 = androidx.camera.view.g.c(iG4, iG4, iR7);
                        }
                    }
                    iC += iR7;
                    i10 += 3;
                    i8 = 1048575;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(j52Var2, j6);
                    ed0 ed0Var8 = c72.f3456a;
                    size = list8.size();
                    if (size != 0) {
                        iR4 = c72.q(list8);
                        iR5 = p42.r(i14 << 3);
                        iR7 = (iR5 * size) + iR4;
                        iC += iR7;
                        i10 += 3;
                        i8 = 1048575;
                    }
                    iR7 = 0;
                    iC += iR7;
                    i10 += 3;
                    i8 = 1048575;
                case 30:
                    List list9 = (List) unsafe.getObject(j52Var2, j6);
                    ed0 ed0Var9 = c72.f3456a;
                    size = list9.size();
                    if (size != 0) {
                        iR4 = c72.i(list9);
                        iR5 = p42.r(i14 << 3);
                        iR7 = (iR5 * size) + iR4;
                        iC += iR7;
                        i10 += 3;
                        i8 = 1048575;
                    }
                    iR7 = 0;
                    iC += iR7;
                    i10 += 3;
                    i8 = 1048575;
                case 31:
                    iN = c72.j(i14, (List) unsafe.getObject(j52Var2, j6));
                    iC += iN;
                    i10 += 3;
                    i8 = 1048575;
                case 32:
                    iN = c72.k(i14, (List) unsafe.getObject(j52Var2, j6));
                    iC += iN;
                    i10 += 3;
                    i8 = 1048575;
                case ImageFormatConstants.INTERNAL_DEFINED_IMAGE_FORMAT_JPEG /* 33 */:
                    List list10 = (List) unsafe.getObject(j52Var2, j6);
                    ed0 ed0Var10 = c72.f3456a;
                    size = list10.size();
                    if (size != 0) {
                        iR4 = c72.o(list10);
                        iR5 = p42.r(i14 << 3);
                        iR7 = (iR5 * size) + iR4;
                        iC += iR7;
                        i10 += 3;
                        i8 = 1048575;
                    }
                    iR7 = 0;
                    iC += iR7;
                    i10 += 3;
                    i8 = 1048575;
                case ImageFormatConstants.INTERNAL_DEFINED_IMAGE_FORMAT_PRIVATE /* 34 */:
                    List list11 = (List) unsafe.getObject(j52Var2, j6);
                    ed0 ed0Var11 = c72.f3456a;
                    size = list11.size();
                    if (size != 0) {
                        iR4 = c72.p(list11);
                        iR5 = p42.r(i14 << 3);
                        iR7 = (iR5 * size) + iR4;
                        iC += iR7;
                        i10 += 3;
                        i8 = 1048575;
                    }
                    iR7 = 0;
                    iC += iR7;
                    i10 += 3;
                    i8 = 1048575;
                case 35:
                    List list12 = (List) unsafe.getObject(j52Var2, j6);
                    ed0 ed0Var12 = c72.f3456a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        iR9 = p42.r(i14 << 3);
                        iR10 = p42.r(size2);
                        iC += iR10 + iR9 + size2;
                        i10 += 3;
                        i8 = 1048575;
                    } else {
                        i10 += 3;
                        i8 = 1048575;
                    }
                case 36:
                    List list13 = (List) unsafe.getObject(j52Var2, j6);
                    ed0 ed0Var13 = c72.f3456a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        iR9 = p42.r(i14 << 3);
                        iR10 = p42.r(size2);
                        iC += iR10 + iR9 + size2;
                        i10 += 3;
                        i8 = 1048575;
                    } else {
                        i10 += 3;
                        i8 = 1048575;
                    }
                case 37:
                    size2 = c72.m((List) unsafe.getObject(j52Var2, j6));
                    if (size2 > 0) {
                        iR9 = p42.r(i14 << 3);
                        iR10 = p42.r(size2);
                        iC += iR10 + iR9 + size2;
                        i10 += 3;
                        i8 = 1048575;
                    } else {
                        i10 += 3;
                        i8 = 1048575;
                    }
                case 38:
                    size2 = c72.r((List) unsafe.getObject(j52Var2, j6));
                    if (size2 > 0) {
                        iR9 = p42.r(i14 << 3);
                        iR10 = p42.r(size2);
                        iC += iR10 + iR9 + size2;
                        i10 += 3;
                        i8 = 1048575;
                    } else {
                        i10 += 3;
                        i8 = 1048575;
                    }
                case 39:
                    size2 = c72.l((List) unsafe.getObject(j52Var2, j6));
                    if (size2 > 0) {
                        iR9 = p42.r(i14 << 3);
                        iR10 = p42.r(size2);
                        iC += iR10 + iR9 + size2;
                        i10 += 3;
                        i8 = 1048575;
                    } else {
                        i10 += 3;
                        i8 = 1048575;
                    }
                case 40:
                    List list14 = (List) unsafe.getObject(j52Var2, j6);
                    ed0 ed0Var14 = c72.f3456a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        iR9 = p42.r(i14 << 3);
                        iR10 = p42.r(size2);
                        iC += iR10 + iR9 + size2;
                        i10 += 3;
                        i8 = 1048575;
                    } else {
                        i10 += 3;
                        i8 = 1048575;
                    }
                case 41:
                    List list15 = (List) unsafe.getObject(j52Var2, j6);
                    ed0 ed0Var15 = c72.f3456a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        iR9 = p42.r(i14 << 3);
                        iR10 = p42.r(size2);
                        iC += iR10 + iR9 + size2;
                        i10 += 3;
                        i8 = 1048575;
                    } else {
                        i10 += 3;
                        i8 = 1048575;
                    }
                case 42:
                    List list16 = (List) unsafe.getObject(j52Var2, j6);
                    ed0 ed0Var16 = c72.f3456a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        iR9 = p42.r(i14 << 3);
                        iR10 = p42.r(size2);
                        iC += iR10 + iR9 + size2;
                        i10 += 3;
                        i8 = 1048575;
                    } else {
                        i10 += 3;
                        i8 = 1048575;
                    }
                case 43:
                    size2 = c72.q((List) unsafe.getObject(j52Var2, j6));
                    if (size2 > 0) {
                        iR9 = p42.r(i14 << 3);
                        iR10 = p42.r(size2);
                        iC += iR10 + iR9 + size2;
                        i10 += 3;
                        i8 = 1048575;
                    } else {
                        i10 += 3;
                        i8 = 1048575;
                    }
                case 44:
                    size2 = c72.i((List) unsafe.getObject(j52Var2, j6));
                    if (size2 > 0) {
                        iR9 = p42.r(i14 << 3);
                        iR10 = p42.r(size2);
                        iC += iR10 + iR9 + size2;
                        i10 += 3;
                        i8 = 1048575;
                    } else {
                        i10 += 3;
                        i8 = 1048575;
                    }
                case 45:
                    List list17 = (List) unsafe.getObject(j52Var2, j6);
                    ed0 ed0Var17 = c72.f3456a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        iR9 = p42.r(i14 << 3);
                        iR10 = p42.r(size2);
                        iC += iR10 + iR9 + size2;
                        i10 += 3;
                        i8 = 1048575;
                    } else {
                        i10 += 3;
                        i8 = 1048575;
                    }
                case 46:
                    List list18 = (List) unsafe.getObject(j52Var2, j6);
                    ed0 ed0Var18 = c72.f3456a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        iR9 = p42.r(i14 << 3);
                        iR10 = p42.r(size2);
                        iC += iR10 + iR9 + size2;
                        i10 += 3;
                        i8 = 1048575;
                    } else {
                        i10 += 3;
                        i8 = 1048575;
                    }
                case 47:
                    size2 = c72.o((List) unsafe.getObject(j52Var2, j6));
                    if (size2 > 0) {
                        iR9 = p42.r(i14 << 3);
                        iR10 = p42.r(size2);
                        iC += iR10 + iR9 + size2;
                        i10 += 3;
                        i8 = 1048575;
                    } else {
                        i10 += 3;
                        i8 = 1048575;
                    }
                case 48:
                    size2 = c72.p((List) unsafe.getObject(j52Var2, j6));
                    if (size2 > 0) {
                        iR9 = p42.r(i14 << 3);
                        iR10 = p42.r(size2);
                        iC += iR10 + iR9 + size2;
                        i10 += 3;
                        i8 = 1048575;
                    } else {
                        i10 += 3;
                        i8 = 1048575;
                    }
                case 49:
                    List list19 = (List) unsafe.getObject(j52Var2, j6);
                    b72 b72VarI3 = p62Var.I(i10);
                    ed0 ed0Var19 = c72.f3456a;
                    int size7 = list19.size();
                    if (size7 == 0) {
                        iF2 = 0;
                    } else {
                        iF2 = 0;
                        for (int i24 = 0; i24 < size7; i24++) {
                            m62 m62Var2 = (m62) list19.get(i24);
                            int iR13 = p42.r(i14 << 3);
                            iF2 += ((t32) m62Var2).f(b72VarI3) + iR13 + iR13;
                        }
                    }
                    iC += iF2;
                    i10 += 3;
                    i8 = 1048575;
                case 50:
                    f62 f62Var = (f62) unsafe.getObject(j52Var2, j6);
                    if (f62Var.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = f62Var.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry2 = (Map.Entry) it.next();
                            entry2.getKey();
                            entry2.getValue();
                            throw null;
                        }
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 51:
                    if (p62Var.y(i14, i10, j52Var2)) {
                        iC = androidx.camera.view.g.c(i14 << 3, 8, iC);
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 52:
                    if (p62Var.y(i14, i10, j52Var2)) {
                        iC = androidx.camera.view.g.c(i14 << 3, 4, iC);
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 53:
                    if (p62Var.y(i14, i10, j52Var2)) {
                        long jG = G(j6, j52Var2);
                        iR11 = p42.r(i14 << 3);
                        iS2 = p42.s(jG);
                        iC += iS2 + iR11;
                        i10 += 3;
                        i8 = 1048575;
                    } else {
                        i10 += 3;
                        i8 = 1048575;
                    }
                case 54:
                    if (p62Var.y(i14, i10, j52Var2)) {
                        long jG2 = G(j6, j52Var2);
                        iR11 = p42.r(i14 << 3);
                        iS2 = p42.s(jG2);
                        iC += iS2 + iR11;
                        i10 += 3;
                        i8 = 1048575;
                    } else {
                        i10 += 3;
                        i8 = 1048575;
                    }
                case 55:
                    if (p62Var.y(i14, i10, j52Var2)) {
                        long jC = C(j6, j52Var2);
                        iR11 = p42.r(i14 << 3);
                        iS2 = p42.s(jC);
                        iC += iS2 + iR11;
                        i10 += 3;
                        i8 = 1048575;
                    } else {
                        i10 += 3;
                        i8 = 1048575;
                    }
                case 56:
                    if (p62Var.y(i14, i10, j52Var2)) {
                        iC = androidx.camera.view.g.c(i14 << 3, 8, iC);
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 57:
                    if (p62Var.y(i14, i10, j52Var2)) {
                        iC = androidx.camera.view.g.c(i14 << 3, 4, iC);
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 58:
                    if (p62Var.y(i14, i10, j52Var2)) {
                        iC = androidx.camera.view.g.c(i14 << 3, 1, iC);
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 59:
                    if (p62Var.y(i14, i10, j52Var2)) {
                        int i25 = i14 << 3;
                        Object object2 = unsafe.getObject(j52Var2, j6);
                        if (object2 instanceof g42) {
                            size2 = p42.r(i25);
                            iR9 = ((g42) object2).g();
                            iR10 = p42.r(iR9);
                            iC += iR10 + iR9 + size2;
                            i10 += 3;
                            i8 = 1048575;
                        } else {
                            iR11 = p42.r(i25);
                            iS2 = p42.q((String) object2);
                            iC += iS2 + iR11;
                            i10 += 3;
                            i8 = 1048575;
                        }
                    } else {
                        i10 += 3;
                        i8 = 1048575;
                    }
                case 60:
                    if (p62Var.y(i14, i10, j52Var2)) {
                        iN = c72.n(i14, unsafe.getObject(j52Var2, j6), p62Var.I(i10));
                        iC += iN;
                        i10 += 3;
                        i8 = 1048575;
                    } else {
                        i10 += 3;
                        i8 = 1048575;
                    }
                case 61:
                    if (p62Var.y(i14, i10, j52Var2)) {
                        g42 g42Var2 = (g42) unsafe.getObject(j52Var2, j6);
                        size2 = p42.r(i14 << 3);
                        iR9 = g42Var2.g();
                        iR10 = p42.r(iR9);
                        iC += iR10 + iR9 + size2;
                        i10 += 3;
                        i8 = 1048575;
                    } else {
                        i10 += 3;
                        i8 = 1048575;
                    }
                case 62:
                    if (p62Var.y(i14, i10, j52Var2)) {
                        iC = androidx.camera.view.g.c(C(j6, j52Var2), p42.r(i14 << 3), iC);
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 63:
                    if (p62Var.y(i14, i10, j52Var2)) {
                        long jC2 = C(j6, j52Var2);
                        iR11 = p42.r(i14 << 3);
                        iS2 = p42.s(jC2);
                        iC += iS2 + iR11;
                        i10 += 3;
                        i8 = 1048575;
                    } else {
                        i10 += 3;
                        i8 = 1048575;
                    }
                case 64:
                    if (p62Var.y(i14, i10, j52Var2)) {
                        iC = androidx.camera.view.g.c(i14 << 3, 4, iC);
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 65:
                    if (p62Var.y(i14, i10, j52Var2)) {
                        iC = androidx.camera.view.g.c(i14 << 3, 8, iC);
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 66:
                    if (p62Var.y(i14, i10, j52Var2)) {
                        int iC2 = C(j6, j52Var2);
                        iC = androidx.camera.view.g.c((iC2 >> 31) ^ (iC2 + iC2), p42.r(i14 << 3), iC);
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 67:
                    if (p62Var.y(i14, i10, j52Var2)) {
                        long jG3 = G(j6, j52Var2);
                        iR11 = p42.r(i14 << 3);
                        iS2 = p42.s((jG3 >> 63) ^ (jG3 + jG3));
                        iC += iS2 + iR11;
                        i10 += 3;
                        i8 = 1048575;
                    } else {
                        i10 += 3;
                        i8 = 1048575;
                    }
                case 68:
                    if (p62Var.y(i14, i10, j52Var2)) {
                        m62 m62Var3 = (m62) unsafe.getObject(j52Var2, j6);
                        b72 b72VarI4 = p62Var.I(i10);
                        int iR14 = p42.r(i14 << 3);
                        i7 = iR14 + iR14;
                        iF = ((t32) m62Var3).f(b72VarI4);
                        iN = iF + i7;
                        iC += iN;
                        i10 += 3;
                        i8 = 1048575;
                    } else {
                        i10 += 3;
                        i8 = 1048575;
                    }
                default:
                    i10 += 3;
                    i8 = 1048575;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    @Override // com.google.android.gms.internal.ads.b72
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(Object obj, Object obj2) {
        Object obj3;
        m(obj);
        obj2.getClass();
        int i6 = 0;
        while (true) {
            int[] iArr = this.f7964a;
            if (i6 >= iArr.length) {
                Object obj4 = obj;
                c72.t(obj4, obj2);
                if (!this.f7969f || ((g52) obj2).zza.f11175a.isEmpty()) {
                    return;
                }
                throw null;
            }
            int iF = F(i6);
            int i7 = 1048575 & iF;
            int iE = E(iF);
            int i8 = iArr[i6];
            long j6 = i7;
            switch (iE) {
                case 0:
                    if (!v(i6, obj2)) {
                        obj3 = obj;
                        break;
                    } else {
                        q72 q72Var = r72.f8574c;
                        obj3 = obj;
                        q72Var.o(obj3, j6, q72Var.d(j6, obj2));
                        q(i6, obj3);
                        break;
                    }
                case 1:
                    if (v(i6, obj2)) {
                        q72 q72Var2 = r72.f8574c;
                        q72Var2.q(obj, j6, q72Var2.f(j6, obj2));
                        q(i6, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (v(i6, obj2)) {
                        r72.n(obj, j6, r72.h(j6, obj2));
                        q(i6, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (v(i6, obj2)) {
                        r72.n(obj, j6, r72.h(j6, obj2));
                        q(i6, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (v(i6, obj2)) {
                        r72.m(obj, j6, r72.f(j6, obj2));
                        q(i6, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (v(i6, obj2)) {
                        r72.n(obj, j6, r72.h(j6, obj2));
                        q(i6, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (v(i6, obj2)) {
                        r72.m(obj, j6, r72.f(j6, obj2));
                        q(i6, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (v(i6, obj2)) {
                        q72 q72Var3 = r72.f8574c;
                        q72Var3.k(obj, j6, q72Var3.r(j6, obj2));
                        q(i6, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (v(i6, obj2)) {
                        r72.o(obj, j6, r72.j(j6, obj2));
                        q(i6, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    n(i6, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (v(i6, obj2)) {
                        r72.o(obj, j6, r72.j(j6, obj2));
                        q(i6, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (v(i6, obj2)) {
                        r72.m(obj, j6, r72.f(j6, obj2));
                        q(i6, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (v(i6, obj2)) {
                        r72.m(obj, j6, r72.f(j6, obj2));
                        q(i6, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (v(i6, obj2)) {
                        r72.m(obj, j6, r72.f(j6, obj2));
                        q(i6, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (v(i6, obj2)) {
                        r72.n(obj, j6, r72.h(j6, obj2));
                        q(i6, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (v(i6, obj2)) {
                        r72.m(obj, j6, r72.f(j6, obj2));
                        q(i6, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (v(i6, obj2)) {
                        r72.n(obj, j6, r72.h(j6, obj2));
                        q(i6, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    n(i6, obj, obj2);
                    obj3 = obj;
                    break;
                case 18:
                case 19:
                case 20:
                case dn.zzm /* 21 */:
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
                case ImageFormatConstants.INTERNAL_DEFINED_IMAGE_FORMAT_JPEG /* 33 */:
                case ImageFormatConstants.INTERNAL_DEFINED_IMAGE_FORMAT_PRIVATE /* 34 */:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    r52 r52VarB = (r52) r72.j(j6, obj);
                    r52 r52Var = (r52) r72.j(j6, obj2);
                    int size = r52VarB.size();
                    int size2 = r52Var.size();
                    if (size > 0 && size2 > 0) {
                        if (!r52VarB.zzc()) {
                            r52VarB = r52VarB.b(size2 + size);
                        }
                        r52VarB.addAll(r52Var);
                    }
                    if (size > 0) {
                        r52Var = r52VarB;
                    }
                    r72.o(obj, j6, r52Var);
                    obj3 = obj;
                    break;
                case 50:
                    ed0 ed0Var = c72.f3456a;
                    r72.o(obj, j6, g62.a(r72.j(j6, obj), r72.j(j6, obj2)));
                    obj3 = obj;
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (y(i8, i6, obj2)) {
                        r72.o(obj, j6, r72.j(j6, obj2));
                        r(i8, i6, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    o(i6, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (y(i8, i6, obj2)) {
                        r72.o(obj, j6, r72.j(j6, obj2));
                        r(i8, i6, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    o(i6, obj, obj2);
                    obj3 = obj;
                    break;
            }
            i6 += 3;
            obj = obj3;
        }
    }

    public final Object j(int i6, Object obj) {
        b72 b72VarI = I(i6);
        int iF = F(i6) & 1048575;
        if (!v(i6, obj)) {
            return b72VarI.zze();
        }
        Object object = f7963n.getObject(obj, iF);
        if (x(object)) {
            return object;
        }
        j52 j52VarZze = b72VarI.zze();
        if (object != null) {
            b72VarI.i(j52VarZze, object);
        }
        return j52VarZze;
    }

    public final Object k(int i6, int i7, Object obj) {
        b72 b72VarI = I(i7);
        if (!y(i6, i7, obj)) {
            return b72VarI.zze();
        }
        Object object = f7963n.getObject(obj, F(i7) & 1048575);
        if (x(object)) {
            return object;
        }
        j52 j52VarZze = b72VarI.zze();
        if (object != null) {
            b72VarI.i(j52VarZze, object);
        }
        return j52VarZze;
    }

    public final void n(int i6, Object obj, Object obj2) {
        if (v(i6, obj2)) {
            int iF = F(i6) & 1048575;
            Unsafe unsafe = f7963n;
            long j6 = iF;
            Object object = unsafe.getObject(obj2, j6);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f7964a[i6] + " is present but null: " + obj2.toString());
            }
            b72 b72VarI = I(i6);
            if (!v(i6, obj)) {
                if (x(object)) {
                    j52 j52VarZze = b72VarI.zze();
                    b72VarI.i(j52VarZze, object);
                    unsafe.putObject(obj, j6, j52VarZze);
                } else {
                    unsafe.putObject(obj, j6, object);
                }
                q(i6, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j6);
            if (!x(object2)) {
                j52 j52VarZze2 = b72VarI.zze();
                b72VarI.i(j52VarZze2, object2);
                unsafe.putObject(obj, j6, j52VarZze2);
                object2 = j52VarZze2;
            }
            b72VarI.i(object2, object);
        }
    }

    public final void o(int i6, Object obj, Object obj2) {
        int[] iArr = this.f7964a;
        int i7 = iArr[i6];
        if (y(i7, i6, obj2)) {
            int iF = F(i6) & 1048575;
            Unsafe unsafe = f7963n;
            long j6 = iF;
            Object object = unsafe.getObject(obj2, j6);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i6] + " is present but null: " + obj2.toString());
            }
            b72 b72VarI = I(i6);
            if (!y(i7, i6, obj)) {
                if (x(object)) {
                    j52 j52VarZze = b72VarI.zze();
                    b72VarI.i(j52VarZze, object);
                    unsafe.putObject(obj, j6, j52VarZze);
                } else {
                    unsafe.putObject(obj, j6, object);
                }
                r(i7, i6, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j6);
            if (!x(object2)) {
                j52 j52VarZze2 = b72VarI.zze();
                b72VarI.i(j52VarZze2, object2);
                unsafe.putObject(obj, j6, j52VarZze2);
                object2 = j52VarZze2;
            }
            b72VarI.i(object2, object);
        }
    }

    public final void p(int i6, l42 l42Var, Object obj) {
        k42 k42Var = (k42) l42Var.f6576d;
        long j6 = i6 & 1048575;
        if ((536870912 & i6) != 0) {
            l42Var.q(2);
            r72.o(obj, j6, k42Var.x());
        } else if (!this.f7970g) {
            r72.o(obj, j6, l42Var.F());
        } else {
            l42Var.q(2);
            r72.o(obj, j6, k42Var.w());
        }
    }

    public final void q(int i6, Object obj) {
        int i7 = this.f7964a[i6 + 2];
        long j6 = 1048575 & i7;
        if (j6 == 1048575) {
            return;
        }
        r72.m(obj, j6, (1 << (i7 >>> 20)) | r72.f(j6, obj));
    }

    public final void r(int i6, int i7, Object obj) {
        r72.m(obj, this.f7964a[i7 + 2] & 1048575, i6);
    }

    public final void s(int i6, Object obj, Object obj2) {
        f7963n.putObject(obj, F(i6) & 1048575, obj2);
        q(i6, obj);
    }

    public final void t(int i6, int i7, Object obj, Object obj2) {
        f7963n.putObject(obj, F(i7) & 1048575, obj2);
        r(i6, i7, obj);
    }

    public final boolean u(j52 j52Var, j52 j52Var2, int i6) {
        return v(i6, j52Var) == v(i6, j52Var2);
    }

    public final boolean v(int i6, Object obj) {
        int i7 = this.f7964a[i6 + 2];
        long j6 = i7 & 1048575;
        if (j6 == 1048575) {
            int iF = F(i6);
            long j7 = iF & 1048575;
            switch (E(iF)) {
                case 0:
                    if (Double.doubleToRawLongBits(r72.f8574c.d(j7, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(r72.f8574c.f(j7, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (r72.h(j7, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (r72.h(j7, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (r72.f(j7, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (r72.h(j7, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (r72.f(j7, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return r72.f8574c.r(j7, obj);
                case 8:
                    Object objJ = r72.j(j7, obj);
                    if (objJ instanceof String) {
                        if (((String) objJ).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(objJ instanceof g42)) {
                            throw new IllegalArgumentException();
                        }
                        if (g42.f4896t.equals(objJ)) {
                            return false;
                        }
                    }
                    break;
                case 9:
                    if (r72.j(j7, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (g42.f4896t.equals(r72.j(j7, obj))) {
                        return false;
                    }
                    break;
                case 11:
                    if (r72.f(j7, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (r72.f(j7, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (r72.f(j7, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (r72.h(j7, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (r72.f(j7, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (r72.h(j7, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (r72.j(j7, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i7 >>> 20)) & r72.f(j6, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean w(Object obj, int i6, int i7, int i8, int i9) {
        return i7 == 1048575 ? v(i6, obj) : (i8 & i9) != 0;
    }

    public final boolean y(int i6, int i7, Object obj) {
        return r72.f((long) (this.f7964a[i7 + 2] & 1048575), obj) == i6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:564:0x0d3f, code lost:
    
        if (r9 == 1048575) goto L566;
     */
    /* JADX WARN: Code restructure failed: missing block: B:565:0x0d41, code lost:
    
        r30.putInt(r14, r9, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:566:0x0d47, code lost:
    
        r1 = r35.f7971i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:568:0x0d4b, code lost:
    
        if (r1 >= r35.f7972j) goto L648;
     */
    /* JADX WARN: Code restructure failed: missing block: B:569:0x0d4d, code lost:
    
        J(r35.h[r1], r14, r38);
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:571:0x0d5b, code lost:
    
        if (r10 != 0) goto L576;
     */
    /* JADX WARN: Code restructure failed: missing block: B:572:0x0d5d, code lost:
    
        if (r4 != r5) goto L574;
     */
    /* JADX WARN: Code restructure failed: missing block: B:575:0x0d65, code lost:
    
        throw new com.google.android.gms.internal.ads.u52("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:576:0x0d66, code lost:
    
        if (r4 > r5) goto L579;
     */
    /* JADX WARN: Code restructure failed: missing block: B:577:0x0d68, code lost:
    
        if (r8 != r10) goto L579;
     */
    /* JADX WARN: Code restructure failed: missing block: B:578:0x0d6a, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:580:0x0d70, code lost:
    
        throw new com.google.android.gms.internal.ads.u52("Failed to parse the message.");
     */
    /* JADX WARN: Removed duplicated region for block: B:452:0x0a60 A[PHI: r5 r8 r9 r10 r15 r21
      0x0a60: PHI (r5v90 int) = (r5v20 int), (r5v21 int), (r5v23 int), (r5v67 int), (r5v75 int), (r5v78 int), (r5v85 int), (r5v93 int) binds: [B:446:0x0a36, B:418:0x0999, B:389:0x0901, B:290:0x0710, B:231:0x0604, B:200:0x058c, B:177:0x04f5, B:159:0x048e] A[DONT_GENERATE, DONT_INLINE]
      0x0a60: PHI (r8v43 int) = (r8v13 int), (r8v13 int), (r8v13 int), (r8v26 int), (r8v36 int), (r8v13 int), (r8v13 int), (r8v13 int) binds: [B:446:0x0a36, B:418:0x0999, B:389:0x0901, B:290:0x0710, B:231:0x0604, B:200:0x058c, B:177:0x04f5, B:159:0x048e] A[DONT_GENERATE, DONT_INLINE]
      0x0a60: PHI (r9v47 byte[]) = 
      (r9v17 byte[])
      (r9v18 byte[])
      (r9v20 byte[])
      (r9v29 byte[])
      (r9v35 byte[])
      (r9v37 byte[])
      (r9v43 byte[])
      (r9v50 byte[])
     binds: [B:446:0x0a36, B:418:0x0999, B:389:0x0901, B:290:0x0710, B:231:0x0604, B:200:0x058c, B:177:0x04f5, B:159:0x048e] A[DONT_GENERATE, DONT_INLINE]
      0x0a60: PHI (r10v67 com.google.android.gms.internal.ads.x32) = 
      (r10v24 com.google.android.gms.internal.ads.x32)
      (r10v25 com.google.android.gms.internal.ads.x32)
      (r10v27 com.google.android.gms.internal.ads.x32)
      (r10v46 com.google.android.gms.internal.ads.x32)
      (r10v61 com.google.android.gms.internal.ads.x32)
      (r10v63 com.google.android.gms.internal.ads.x32)
      (r10v65 com.google.android.gms.internal.ads.x32)
      (r10v70 com.google.android.gms.internal.ads.x32)
     binds: [B:446:0x0a36, B:418:0x0999, B:389:0x0901, B:290:0x0710, B:231:0x0604, B:200:0x058c, B:177:0x04f5, B:159:0x048e] A[DONT_GENERATE, DONT_INLINE]
      0x0a60: PHI (r15v48 int) = (r15v23 int), (r15v24 int), (r15v26 int), (r15v33 int), (r15v40 int), (r15v42 int), (r15v46 int), (r15v52 int) binds: [B:446:0x0a36, B:418:0x0999, B:389:0x0901, B:290:0x0710, B:231:0x0604, B:200:0x058c, B:177:0x04f5, B:159:0x048e] A[DONT_GENERATE, DONT_INLINE]
      0x0a60: PHI (r21v15 int) = (r21v1 int), (r21v1 int), (r21v1 int), (r21v2 int), (r21v13 int), (r21v1 int), (r21v1 int), (r21v1 int) binds: [B:446:0x0a36, B:418:0x0999, B:389:0x0901, B:290:0x0710, B:231:0x0604, B:200:0x058c, B:177:0x04f5, B:159:0x048e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0a63  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x0a78  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x0cb3  */
    /* JADX WARN: Removed duplicated region for block: B:546:0x0cbf  */
    /* JADX WARN: Removed duplicated region for block: B:561:0x0d0d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int z(Object obj, byte[] bArr, int i6, int i7, int i8, x32 x32Var) throws u52 {
        int i9;
        Unsafe unsafe;
        Object obj2;
        Object obj3;
        int i10;
        int i11;
        int i12;
        int iD;
        int i13;
        int i14;
        int i15;
        int i16;
        byte[] bArr2;
        int i17;
        x32 x32Var2;
        int i18;
        int i19;
        int iE;
        int i20;
        x32 x32Var3;
        int i21;
        int i22;
        int i23;
        int i24;
        x32 x32Var4;
        int iA;
        long j6;
        x32 x32Var5;
        int i25;
        int i26;
        int iF;
        int i27;
        byte[] bArr3;
        int i28;
        int i29;
        int i30;
        x32 x32Var6;
        int iC;
        int iD2;
        int i31;
        int iF2;
        int i32;
        int i33;
        x32 x32Var7;
        int i34;
        int i35;
        r52 r52Var;
        int iH;
        int i36;
        int i37;
        byte[] bArr4;
        x32 x32Var8;
        int i38;
        int iF3;
        int iF4;
        int i39;
        int i40;
        x32 x32Var9;
        int i41;
        int i42;
        Unsafe unsafe2;
        int i43;
        Object obj4;
        Unsafe unsafe3;
        x32 x32Var10;
        Object obj5;
        x32 x32Var11;
        byte[] bArr5;
        x32 x32Var12;
        byte[] bArr6;
        Object obj6 = obj;
        byte[] bArr7 = bArr;
        int i44 = i7;
        x32 x32Var13 = x32Var;
        int i45 = this.f7967d;
        int i46 = this.f7966c;
        m(obj6);
        Unsafe unsafe4 = f7963n;
        int iC2 = i6;
        int i47 = -1;
        int i48 = 0;
        int i49 = 1048575;
        int i50 = 0;
        int i51 = 0;
        while (true) {
            if (iC2 < i44) {
                obj3 = null;
                int iG = iC2 + 1;
                int i52 = bArr7[iC2];
                if (i52 < 0) {
                    iG = y32.g(i52, bArr7, iG, x32Var13);
                    i52 = x32Var13.f10344a;
                }
                int i53 = iG;
                int i54 = i52;
                int i55 = i54 >>> 3;
                if (i55 > i47) {
                    iD = (i55 < i46 || i55 > i45) ? -1 : D(i55, i48 / 3);
                    i12 = 0;
                } else if (i55 < i46 || i55 > i45) {
                    i12 = 0;
                    iD = -1;
                } else {
                    i12 = 0;
                    iD = D(i55, 0);
                }
                if (iD == -1) {
                    i9 = i8;
                    unsafe = unsafe4;
                    i13 = i49;
                    i14 = i45;
                    i15 = i46;
                    i16 = i55;
                    i10 = i54;
                    obj2 = obj6;
                    bArr2 = bArr7;
                    i17 = i53;
                    x32Var2 = x32Var13;
                    i18 = i12;
                } else {
                    int i56 = i54 & 7;
                    int[] iArr = this.f7964a;
                    int i57 = iArr[iD + 1];
                    int iE2 = E(i57);
                    long j7 = i57 & 1048575;
                    i14 = i45;
                    if (iE2 <= 17) {
                        int i58 = iArr[iD + 2];
                        int i59 = 1 << (i58 >>> 20);
                        int i60 = i58 & 1048575;
                        i15 = i46;
                        if (i60 != i49) {
                            int i61 = 1048575;
                            i39 = i59;
                            if (i49 != 1048575) {
                                unsafe4.putInt(obj6, i49, i50);
                                i61 = 1048575;
                            }
                            i50 = i60 == i61 ? 0 : unsafe4.getInt(obj6, i60);
                        } else {
                            i39 = i59;
                            i60 = i49;
                        }
                        switch (iE2) {
                            case 0:
                                bArr2 = bArr;
                                i18 = iD;
                                i40 = i53;
                                x32Var9 = x32Var;
                                i41 = i55;
                                i42 = i54;
                                unsafe2 = unsafe4;
                                if (i56 != 1) {
                                    obj5 = obj6;
                                    i9 = i8;
                                    i17 = i40;
                                    i13 = i60;
                                    unsafe = unsafe2;
                                    obj2 = obj5;
                                    i16 = i41;
                                    x32Var2 = x32Var9;
                                    i10 = i42;
                                    break;
                                } else {
                                    i50 |= i39;
                                    r72.f8574c.o(obj6, j7, Double.longBitsToDouble(y32.l(i40, bArr2)));
                                    i44 = i7;
                                    iC2 = i40 + 8;
                                    x32Var13 = x32Var9;
                                    bArr7 = bArr2;
                                    i49 = i60;
                                    i48 = i18;
                                    unsafe4 = unsafe2;
                                    i51 = i42;
                                    i47 = i41;
                                    i46 = i15;
                                    i45 = i14;
                                    break;
                                }
                            case 1:
                                bArr2 = bArr;
                                i18 = iD;
                                i40 = i53;
                                x32Var9 = x32Var;
                                i41 = i55;
                                i42 = i54;
                                unsafe2 = unsafe4;
                                if (i56 != 5) {
                                    obj5 = obj6;
                                    i9 = i8;
                                    i17 = i40;
                                    i13 = i60;
                                    unsafe = unsafe2;
                                    obj2 = obj5;
                                    i16 = i41;
                                    x32Var2 = x32Var9;
                                    i10 = i42;
                                    break;
                                } else {
                                    i50 |= i39;
                                    r72.f8574c.q(obj6, j7, Float.intBitsToFloat(y32.b(i40, bArr2)));
                                    i44 = i7;
                                    iC2 = i40 + 4;
                                    x32Var13 = x32Var9;
                                    bArr7 = bArr2;
                                    i49 = i60;
                                    i48 = i18;
                                    unsafe4 = unsafe2;
                                    i51 = i42;
                                    i47 = i41;
                                    i46 = i15;
                                    i45 = i14;
                                    break;
                                }
                            case 2:
                            case 3:
                                bArr2 = bArr;
                                i18 = iD;
                                i40 = i53;
                                x32Var9 = x32Var;
                                i42 = i54;
                                i41 = i55;
                                if (i56 != 0) {
                                    unsafe2 = unsafe4;
                                    obj5 = obj6;
                                    i9 = i8;
                                    i17 = i40;
                                    i13 = i60;
                                    unsafe = unsafe2;
                                    obj2 = obj5;
                                    i16 = i41;
                                    x32Var2 = x32Var9;
                                    i10 = i42;
                                    break;
                                } else {
                                    i50 |= i39;
                                    i43 = y32.i(bArr2, i40, x32Var9);
                                    unsafe4.putLong(obj6, j7, x32Var9.f10345b);
                                    i44 = i7;
                                    iC2 = i43;
                                    x32Var13 = x32Var9;
                                    bArr7 = bArr2;
                                    i49 = i60;
                                    i48 = i18;
                                    i51 = i42;
                                    i47 = i41;
                                    i46 = i15;
                                    i45 = i14;
                                    break;
                                }
                            case 4:
                            case 11:
                                bArr2 = bArr;
                                i18 = iD;
                                i40 = i53;
                                x32Var9 = x32Var;
                                i42 = i54;
                                i41 = i55;
                                if (i56 != 0) {
                                    unsafe2 = unsafe4;
                                    obj5 = obj6;
                                    i9 = i8;
                                    i17 = i40;
                                    i13 = i60;
                                    unsafe = unsafe2;
                                    obj2 = obj5;
                                    i16 = i41;
                                    x32Var2 = x32Var9;
                                    i10 = i42;
                                    break;
                                } else {
                                    i50 |= i39;
                                    iC2 = y32.f(bArr2, i40, x32Var9);
                                    unsafe4.putInt(obj6, j7, x32Var9.f10344a);
                                    i44 = i7;
                                    x32Var13 = x32Var9;
                                    bArr7 = bArr2;
                                    i49 = i60;
                                    i48 = i18;
                                    i51 = i42;
                                    i47 = i41;
                                    i46 = i15;
                                    i45 = i14;
                                    break;
                                }
                            case 5:
                            case 14:
                                bArr2 = bArr;
                                obj4 = obj6;
                                i18 = iD;
                                i40 = i53;
                                Unsafe unsafe5 = unsafe4;
                                i42 = i54;
                                i41 = i55;
                                if (i56 != 1) {
                                    x32Var9 = x32Var;
                                    unsafe4 = unsafe5;
                                    unsafe2 = unsafe4;
                                    obj5 = obj4;
                                    i9 = i8;
                                    i17 = i40;
                                    i13 = i60;
                                    unsafe = unsafe2;
                                    obj2 = obj5;
                                    i16 = i41;
                                    x32Var2 = x32Var9;
                                    i10 = i42;
                                    break;
                                } else {
                                    i43 = i40 + 8;
                                    i50 |= i39;
                                    x32Var9 = x32Var;
                                    unsafe4 = unsafe5;
                                    obj6 = obj4;
                                    unsafe4.putLong(obj6, j7, y32.l(i40, bArr2));
                                    i44 = i7;
                                    iC2 = i43;
                                    x32Var13 = x32Var9;
                                    bArr7 = bArr2;
                                    i49 = i60;
                                    i48 = i18;
                                    i51 = i42;
                                    i47 = i41;
                                    i46 = i15;
                                    i45 = i14;
                                    break;
                                }
                            case 6:
                            case 13:
                                bArr2 = bArr;
                                obj4 = obj6;
                                i18 = iD;
                                i40 = i53;
                                unsafe3 = unsafe4;
                                i42 = i54;
                                x32Var10 = x32Var;
                                i41 = i55;
                                if (i56 != 5) {
                                    unsafe2 = unsafe3;
                                    obj5 = obj4;
                                    x32Var9 = x32Var10;
                                    i9 = i8;
                                    i17 = i40;
                                    i13 = i60;
                                    unsafe = unsafe2;
                                    obj2 = obj5;
                                    i16 = i41;
                                    x32Var2 = x32Var9;
                                    i10 = i42;
                                    break;
                                } else {
                                    i50 |= i39;
                                    unsafe3.putInt(obj4, j7, y32.b(i40, bArr2));
                                    i44 = i7;
                                    x32Var13 = x32Var10;
                                    iC2 = i40 + 4;
                                    unsafe4 = unsafe3;
                                    bArr7 = bArr2;
                                    i49 = i60;
                                    i48 = i18;
                                    obj6 = obj4;
                                    i51 = i42;
                                    i47 = i41;
                                    i46 = i15;
                                    i45 = i14;
                                    break;
                                }
                            case 7:
                                bArr2 = bArr;
                                obj4 = obj6;
                                i18 = iD;
                                i40 = i53;
                                unsafe3 = unsafe4;
                                i42 = i54;
                                x32Var10 = x32Var;
                                i41 = i55;
                                if (i56 != 0) {
                                    unsafe2 = unsafe3;
                                    obj5 = obj4;
                                    x32Var9 = x32Var10;
                                    i9 = i8;
                                    i17 = i40;
                                    i13 = i60;
                                    unsafe = unsafe2;
                                    obj2 = obj5;
                                    i16 = i41;
                                    x32Var2 = x32Var9;
                                    i10 = i42;
                                    break;
                                } else {
                                    i50 |= i39;
                                    iC2 = y32.i(bArr2, i40, x32Var10);
                                    r72.f8574c.k(obj4, j7, x32Var10.f10345b != 0);
                                    i44 = i7;
                                    x32Var13 = x32Var10;
                                    unsafe4 = unsafe3;
                                    bArr7 = bArr2;
                                    i49 = i60;
                                    i48 = i18;
                                    obj6 = obj4;
                                    i51 = i42;
                                    i47 = i41;
                                    i46 = i15;
                                    i45 = i14;
                                    break;
                                }
                            case 8:
                                bArr2 = bArr;
                                obj4 = obj6;
                                i18 = iD;
                                i40 = i53;
                                unsafe3 = unsafe4;
                                i42 = i54;
                                x32Var10 = x32Var;
                                i41 = i55;
                                if (i56 != 2) {
                                    unsafe2 = unsafe3;
                                    obj5 = obj4;
                                    x32Var9 = x32Var10;
                                    i9 = i8;
                                    i17 = i40;
                                    i13 = i60;
                                    unsafe = unsafe2;
                                    obj2 = obj5;
                                    i16 = i41;
                                    x32Var2 = x32Var9;
                                    i10 = i42;
                                    break;
                                } else {
                                    if ((i57 & 536870912) != 0) {
                                        int iF5 = y32.f(bArr2, i40, x32Var10);
                                        int i62 = x32Var10.f10344a;
                                        if (i62 < 0) {
                                            throw new u52("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                        }
                                        int i63 = i50 | i39;
                                        if (i62 == 0) {
                                            x32Var10.f10346c = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                                        } else {
                                            x32Var10.f10346c = v72.f9748a.b(iF5, i62, bArr2);
                                            iF5 += i62;
                                        }
                                        i50 = i63;
                                        iC2 = iF5;
                                    } else {
                                        int i64 = i50 | i39;
                                        int iF6 = y32.f(bArr2, i40, x32Var10);
                                        int i65 = x32Var10.f10344a;
                                        if (i65 < 0) {
                                            throw new u52("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                        }
                                        if (i65 == 0) {
                                            x32Var10.f10346c = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                                        } else {
                                            x32Var10.f10346c = new String(bArr2, iF6, i65, s52.f8801a);
                                            iF6 += i65;
                                        }
                                        i50 = i64;
                                        iC2 = iF6;
                                    }
                                    unsafe3.putObject(obj4, j7, x32Var10.f10346c);
                                    i44 = i7;
                                    x32Var13 = x32Var10;
                                    unsafe4 = unsafe3;
                                    bArr7 = bArr2;
                                    i49 = i60;
                                    i48 = i18;
                                    obj6 = obj4;
                                    i51 = i42;
                                    i47 = i41;
                                    i46 = i15;
                                    i45 = i14;
                                    break;
                                }
                            case 9:
                                obj4 = obj6;
                                i18 = iD;
                                i40 = i53;
                                if (i56 != 2) {
                                    unsafe3 = unsafe4;
                                    x32Var10 = x32Var;
                                    bArr2 = bArr;
                                    i41 = i55;
                                    i42 = i54;
                                    unsafe2 = unsafe3;
                                    obj5 = obj4;
                                    x32Var9 = x32Var10;
                                    i9 = i8;
                                    i17 = i40;
                                    i13 = i60;
                                    unsafe = unsafe2;
                                    obj2 = obj5;
                                    i16 = i41;
                                    x32Var2 = x32Var9;
                                    i10 = i42;
                                    break;
                                } else {
                                    i50 |= i39;
                                    Unsafe unsafe6 = unsafe4;
                                    Object objJ = j(i18, obj4);
                                    bArr7 = bArr;
                                    i44 = i7;
                                    x32Var13 = x32Var;
                                    iC2 = y32.k(objJ, I(i18), bArr7, i40, i44, x32Var13);
                                    s(i18, obj4, objJ);
                                    unsafe4 = unsafe6;
                                    i49 = i60;
                                    i48 = i18;
                                    obj6 = obj4;
                                    i47 = i55;
                                    i51 = i54;
                                    i46 = i15;
                                    i45 = i14;
                                    break;
                                }
                            case 10:
                                x32Var11 = x32Var;
                                obj4 = obj6;
                                i18 = iD;
                                i40 = i53;
                                bArr5 = bArr;
                                if (i56 != 2) {
                                    x32 x32Var14 = x32Var11;
                                    bArr2 = bArr5;
                                    x32Var9 = x32Var14;
                                    i41 = i55;
                                    i42 = i54;
                                    unsafe2 = unsafe4;
                                    obj5 = obj4;
                                    i9 = i8;
                                    i17 = i40;
                                    i13 = i60;
                                    unsafe = unsafe2;
                                    obj2 = obj5;
                                    i16 = i41;
                                    x32Var2 = x32Var9;
                                    i10 = i42;
                                    break;
                                } else {
                                    i50 |= i39;
                                    iC2 = y32.a(bArr5, i40, x32Var11);
                                    unsafe4.putObject(obj4, j7, x32Var11.f10346c);
                                    i44 = i7;
                                    bArr7 = bArr5;
                                    x32Var13 = x32Var11;
                                    i49 = i60;
                                    i48 = i18;
                                    obj6 = obj4;
                                    i47 = i55;
                                    i51 = i54;
                                    i46 = i15;
                                    i45 = i14;
                                    break;
                                }
                            case 12:
                                x32Var11 = x32Var;
                                obj4 = obj6;
                                i18 = iD;
                                i40 = i53;
                                bArr5 = bArr;
                                if (i56 != 0) {
                                    x32 x32Var142 = x32Var11;
                                    bArr2 = bArr5;
                                    x32Var9 = x32Var142;
                                    i41 = i55;
                                    i42 = i54;
                                    unsafe2 = unsafe4;
                                    obj5 = obj4;
                                    i9 = i8;
                                    i17 = i40;
                                    i13 = i60;
                                    unsafe = unsafe2;
                                    obj2 = obj5;
                                    i16 = i41;
                                    x32Var2 = x32Var9;
                                    i10 = i42;
                                    break;
                                } else {
                                    iC2 = y32.f(bArr5, i40, x32Var11);
                                    int i66 = x32Var11.f10344a;
                                    m52 m52VarH = H(i18);
                                    if ((i57 & Integer.MIN_VALUE) == 0 || m52VarH == null || m52VarH.a(i66)) {
                                        i50 |= i39;
                                        unsafe4.putInt(obj4, j7, i66);
                                    } else {
                                        A(obj4).b(i54, Long.valueOf(i66));
                                    }
                                    i44 = i7;
                                    bArr7 = bArr5;
                                    x32Var13 = x32Var11;
                                    i49 = i60;
                                    i48 = i18;
                                    obj6 = obj4;
                                    i47 = i55;
                                    i51 = i54;
                                    i46 = i15;
                                    i45 = i14;
                                    break;
                                }
                            case 15:
                                x32Var11 = x32Var;
                                obj4 = obj6;
                                i18 = iD;
                                i40 = i53;
                                bArr5 = bArr;
                                if (i56 != 0) {
                                    x32 x32Var1422 = x32Var11;
                                    bArr2 = bArr5;
                                    x32Var9 = x32Var1422;
                                    i41 = i55;
                                    i42 = i54;
                                    unsafe2 = unsafe4;
                                    obj5 = obj4;
                                    i9 = i8;
                                    i17 = i40;
                                    i13 = i60;
                                    unsafe = unsafe2;
                                    obj2 = obj5;
                                    i16 = i41;
                                    x32Var2 = x32Var9;
                                    i10 = i42;
                                    break;
                                } else {
                                    i50 |= i39;
                                    iC2 = y32.f(bArr5, i40, x32Var11);
                                    unsafe4.putInt(obj4, j7, k42.c(x32Var11.f10344a));
                                    i44 = i7;
                                    bArr7 = bArr5;
                                    x32Var13 = x32Var11;
                                    i49 = i60;
                                    i48 = i18;
                                    obj6 = obj4;
                                    i47 = i55;
                                    i51 = i54;
                                    i46 = i15;
                                    i45 = i14;
                                    break;
                                }
                            case 16:
                                x32Var12 = x32Var;
                                i18 = iD;
                                i40 = i53;
                                bArr6 = bArr;
                                if (i56 != 0) {
                                    bArr2 = bArr6;
                                    x32Var9 = x32Var12;
                                    i41 = i55;
                                    i42 = i54;
                                    unsafe2 = unsafe4;
                                    obj5 = obj6;
                                    i9 = i8;
                                    i17 = i40;
                                    i13 = i60;
                                    unsafe = unsafe2;
                                    obj2 = obj5;
                                    i16 = i41;
                                    x32Var2 = x32Var9;
                                    i10 = i42;
                                    break;
                                } else {
                                    i50 |= i39;
                                    int i67 = y32.i(bArr6, i40, x32Var12);
                                    unsafe4.putLong(obj6, j7, k42.d(x32Var12.f10345b));
                                    i44 = i7;
                                    iC2 = i67;
                                    bArr7 = bArr6;
                                    x32Var13 = x32Var12;
                                    i49 = i60;
                                    i48 = i18;
                                    i47 = i55;
                                    i51 = i54;
                                    i46 = i15;
                                    i45 = i14;
                                    break;
                                }
                            default:
                                if (i56 != 3) {
                                    i18 = iD;
                                    bArr2 = bArr;
                                    x32Var9 = x32Var;
                                    i41 = i55;
                                    i40 = i53;
                                    unsafe2 = unsafe4;
                                    i42 = i54;
                                    obj5 = obj6;
                                    i9 = i8;
                                    i17 = i40;
                                    i13 = i60;
                                    unsafe = unsafe2;
                                    obj2 = obj5;
                                    i16 = i41;
                                    x32Var2 = x32Var9;
                                    i10 = i42;
                                    break;
                                } else {
                                    i50 |= i39;
                                    Object objJ2 = j(iD, obj6);
                                    x32Var12 = x32Var;
                                    i18 = iD;
                                    iC2 = y32.j(objJ2, I(iD), bArr, i53, i7, (i55 << 3) | 4, x32Var12);
                                    bArr6 = bArr;
                                    s(i18, obj6, objJ2);
                                    i44 = i7;
                                    bArr7 = bArr6;
                                    x32Var13 = x32Var12;
                                    i49 = i60;
                                    i48 = i18;
                                    i47 = i55;
                                    i51 = i54;
                                    i46 = i15;
                                    i45 = i14;
                                    break;
                                }
                        }
                    } else {
                        i15 = i46;
                        int i68 = i50;
                        i18 = iD;
                        Object obj7 = obj6;
                        Unsafe unsafe7 = unsafe4;
                        int i69 = i55;
                        i13 = i49;
                        if (iE2 != 27) {
                            i10 = i54;
                            i20 = i68;
                            if (iE2 > 49) {
                                bArr2 = bArr;
                                x32Var3 = x32Var;
                                unsafe = unsafe7;
                                i21 = i53;
                                if (iE2 != 50) {
                                    obj2 = obj;
                                    Unsafe unsafe8 = f7963n;
                                    long j8 = iArr[i18 + 2] & 1048575;
                                    switch (iE2) {
                                        case 51:
                                            i22 = i18;
                                            i23 = i21;
                                            i16 = i69;
                                            x32Var2 = x32Var3;
                                            if (i56 == 1) {
                                                i24 = i23 + 8;
                                                unsafe8.putObject(obj2, j7, Double.valueOf(Double.longBitsToDouble(y32.l(i23, bArr2))));
                                                unsafe8.putInt(obj2, j8, i16);
                                                iC2 = i24;
                                                if (iC2 != i23) {
                                                    i9 = i8;
                                                    i17 = iC2;
                                                    i18 = i22;
                                                    i50 = i20;
                                                    break;
                                                } else {
                                                    i44 = i7;
                                                    i51 = i10;
                                                    bArr7 = bArr2;
                                                    i47 = i16;
                                                    obj6 = obj2;
                                                    x32Var13 = x32Var2;
                                                    i48 = i22;
                                                    break;
                                                }
                                            }
                                            iC2 = i23;
                                            if (iC2 != i23) {
                                            }
                                        case 52:
                                            i22 = i18;
                                            i23 = i21;
                                            i16 = i69;
                                            x32Var2 = x32Var3;
                                            if (i56 == 5) {
                                                i24 = i23 + 4;
                                                unsafe8.putObject(obj2, j7, Float.valueOf(Float.intBitsToFloat(y32.b(i23, bArr2))));
                                                unsafe8.putInt(obj2, j8, i16);
                                                iC2 = i24;
                                                if (iC2 != i23) {
                                                }
                                            }
                                            iC2 = i23;
                                            if (iC2 != i23) {
                                            }
                                            break;
                                        case 53:
                                        case 54:
                                            i22 = i18;
                                            i23 = i21;
                                            i16 = i69;
                                            x32Var2 = x32Var3;
                                            if (i56 == 0) {
                                                i24 = y32.i(bArr2, i23, x32Var2);
                                                unsafe8.putObject(obj2, j7, Long.valueOf(x32Var2.f10345b));
                                                unsafe8.putInt(obj2, j8, i16);
                                                iC2 = i24;
                                                if (iC2 != i23) {
                                                }
                                            }
                                            iC2 = i23;
                                            if (iC2 != i23) {
                                            }
                                            break;
                                        case 55:
                                        case 62:
                                            i22 = i18;
                                            i23 = i21;
                                            i16 = i69;
                                            x32Var2 = x32Var3;
                                            if (i56 == 0) {
                                                i24 = y32.f(bArr2, i23, x32Var2);
                                                unsafe8.putObject(obj2, j7, Integer.valueOf(x32Var2.f10344a));
                                                unsafe8.putInt(obj2, j8, i16);
                                                iC2 = i24;
                                                if (iC2 != i23) {
                                                }
                                            }
                                            iC2 = i23;
                                            if (iC2 != i23) {
                                            }
                                            break;
                                        case 56:
                                        case 65:
                                            i22 = i18;
                                            i23 = i21;
                                            i16 = i69;
                                            x32Var2 = x32Var3;
                                            if (i56 == 1) {
                                                i24 = i23 + 8;
                                                unsafe8.putObject(obj2, j7, Long.valueOf(y32.l(i23, bArr2)));
                                                unsafe8.putInt(obj2, j8, i16);
                                                iC2 = i24;
                                                if (iC2 != i23) {
                                                }
                                            }
                                            iC2 = i23;
                                            if (iC2 != i23) {
                                            }
                                            break;
                                        case 57:
                                        case 64:
                                            i22 = i18;
                                            i23 = i21;
                                            i16 = i69;
                                            x32Var2 = x32Var3;
                                            if (i56 == 5) {
                                                i24 = i23 + 4;
                                                unsafe8.putObject(obj2, j7, Integer.valueOf(y32.b(i23, bArr2)));
                                                unsafe8.putInt(obj2, j8, i16);
                                                iC2 = i24;
                                                if (iC2 != i23) {
                                                }
                                            }
                                            iC2 = i23;
                                            if (iC2 != i23) {
                                            }
                                            break;
                                        case 58:
                                            i22 = i18;
                                            i23 = i21;
                                            i16 = i69;
                                            x32Var2 = x32Var3;
                                            if (i56 == 0) {
                                                i24 = y32.i(bArr2, i23, x32Var2);
                                                unsafe8.putObject(obj2, j7, Boolean.valueOf(x32Var2.f10345b != 0));
                                                unsafe8.putInt(obj2, j8, i16);
                                                iC2 = i24;
                                                if (iC2 != i23) {
                                                }
                                            }
                                            iC2 = i23;
                                            if (iC2 != i23) {
                                            }
                                            break;
                                        case 59:
                                            i22 = i18;
                                            i23 = i21;
                                            i16 = i69;
                                            x32Var2 = x32Var3;
                                            if (i56 == 2) {
                                                int iF7 = y32.f(bArr2, i23, x32Var2);
                                                int i70 = x32Var2.f10344a;
                                                if (i70 == 0) {
                                                    unsafe8.putObject(obj2, j7, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                                                } else {
                                                    int i71 = iF7 + i70;
                                                    if ((i57 & 536870912) != 0 && !v72.d(iF7, i71, bArr2)) {
                                                        throw new u52("Protocol message had invalid UTF-8.");
                                                    }
                                                    unsafe8.putObject(obj2, j7, new String(bArr2, iF7, i70, s52.f8801a));
                                                    iF7 = i71;
                                                }
                                                unsafe8.putInt(obj2, j8, i16);
                                                iC2 = iF7;
                                            } else {
                                                iC2 = i23;
                                            }
                                            if (iC2 != i23) {
                                            }
                                            break;
                                        case 60:
                                            i16 = i69;
                                            if (i56 == 2) {
                                                Object objK = k(i16, i18, obj2);
                                                int iK = y32.k(objK, I(i18), bArr2, i21, i7, x32Var3);
                                                x32Var2 = x32Var3;
                                                t(i16, i18, obj2, objK);
                                                i22 = i18;
                                                i23 = i21;
                                                iC2 = iK;
                                                if (iC2 != i23) {
                                                }
                                            } else {
                                                x32Var2 = x32Var3;
                                                i22 = i18;
                                                i23 = i21;
                                                iC2 = i23;
                                                if (iC2 != i23) {
                                                }
                                            }
                                            break;
                                        case 61:
                                            x32Var4 = x32Var3;
                                            i16 = i69;
                                            if (i56 == 2) {
                                                iA = y32.a(bArr2, i21, x32Var4);
                                                unsafe8.putObject(obj2, j7, x32Var4.f10346c);
                                                unsafe8.putInt(obj2, j8, i16);
                                                iC2 = iA;
                                                i22 = i18;
                                                i23 = i21;
                                                x32Var2 = x32Var4;
                                                if (iC2 != i23) {
                                                }
                                            }
                                            i22 = i18;
                                            i23 = i21;
                                            x32Var2 = x32Var4;
                                            iC2 = i23;
                                            if (iC2 != i23) {
                                            }
                                            break;
                                        case 63:
                                            x32Var4 = x32Var3;
                                            i16 = i69;
                                            if (i56 == 0) {
                                                iA = y32.f(bArr2, i21, x32Var4);
                                                int i72 = x32Var4.f10344a;
                                                m52 m52VarH2 = H(i18);
                                                if (m52VarH2 == null || m52VarH2.a(i72)) {
                                                    unsafe8.putObject(obj2, j7, Integer.valueOf(i72));
                                                    unsafe8.putInt(obj2, j8, i16);
                                                } else {
                                                    A(obj2).b(i10, Long.valueOf(i72));
                                                }
                                                iC2 = iA;
                                                i22 = i18;
                                                i23 = i21;
                                                x32Var2 = x32Var4;
                                                if (iC2 != i23) {
                                                }
                                            }
                                            i22 = i18;
                                            i23 = i21;
                                            x32Var2 = x32Var4;
                                            iC2 = i23;
                                            if (iC2 != i23) {
                                            }
                                            break;
                                        case 66:
                                            x32Var4 = x32Var3;
                                            i16 = i69;
                                            if (i56 == 0) {
                                                iA = y32.f(bArr2, i21, x32Var4);
                                                unsafe8.putObject(obj2, j7, Integer.valueOf(k42.c(x32Var4.f10344a)));
                                                unsafe8.putInt(obj2, j8, i16);
                                                iC2 = iA;
                                                i22 = i18;
                                                i23 = i21;
                                                x32Var2 = x32Var4;
                                                if (iC2 != i23) {
                                                }
                                            }
                                            i22 = i18;
                                            i23 = i21;
                                            x32Var2 = x32Var4;
                                            iC2 = i23;
                                            if (iC2 != i23) {
                                            }
                                            break;
                                        case 67:
                                            x32Var4 = x32Var3;
                                            i16 = i69;
                                            if (i56 == 0) {
                                                iA = y32.i(bArr2, i21, x32Var4);
                                                unsafe8.putObject(obj2, j7, Long.valueOf(k42.d(x32Var4.f10345b)));
                                                unsafe8.putInt(obj2, j8, i16);
                                                iC2 = iA;
                                                i22 = i18;
                                                i23 = i21;
                                                x32Var2 = x32Var4;
                                                if (iC2 != i23) {
                                                }
                                            }
                                            i22 = i18;
                                            i23 = i21;
                                            x32Var2 = x32Var4;
                                            iC2 = i23;
                                            if (iC2 != i23) {
                                            }
                                            break;
                                        case 68:
                                            if (i56 == 3) {
                                                i16 = i69;
                                                Object objK2 = k(i16, i18, obj2);
                                                int iJ = y32.j(objK2, I(i18), bArr2, i21, i7, (i10 & (-8)) | 4, x32Var3);
                                                x32Var4 = x32Var3;
                                                t(i16, i18, obj2, objK2);
                                                iC2 = iJ;
                                                i22 = i18;
                                                i23 = i21;
                                                x32Var2 = x32Var4;
                                                if (iC2 != i23) {
                                                }
                                            } else {
                                                i16 = i69;
                                                i22 = i18;
                                                i23 = i21;
                                                x32Var2 = x32Var3;
                                                iC2 = i23;
                                                if (iC2 != i23) {
                                                }
                                            }
                                            break;
                                        default:
                                            i22 = i18;
                                            i23 = i21;
                                            i16 = i69;
                                            x32Var2 = x32Var3;
                                            iC2 = i23;
                                            if (iC2 != i23) {
                                            }
                                            break;
                                    }
                                } else {
                                    if (i56 == 2) {
                                        Unsafe unsafe9 = f7963n;
                                        Object objK3 = K(i18);
                                        Object object = unsafe9.getObject(obj, j7);
                                        if (!((f62) object).s) {
                                            f62 f62VarA = f62.f4508t.a();
                                            g62.a(f62VarA, object);
                                            unsafe9.putObject(obj, j7, f62VarA);
                                        }
                                        throw null;
                                    }
                                    obj2 = obj;
                                }
                            } else {
                                long j9 = i57;
                                Unsafe unsafe10 = f7963n;
                                unsafe = unsafe7;
                                r52 r52VarB = (r52) unsafe10.getObject(obj7, j7);
                                if (r52VarB.zzc()) {
                                    j6 = j9;
                                } else {
                                    int size = r52VarB.size();
                                    j6 = j9;
                                    r52VarB = r52VarB.b(size + size);
                                    unsafe10.putObject(obj7, j7, r52VarB);
                                }
                                switch (iE2) {
                                    case 18:
                                    case 35:
                                        i44 = i7;
                                        x32Var5 = x32Var;
                                        r52 r52Var2 = r52VarB;
                                        i25 = i53;
                                        bArr2 = bArr;
                                        if (i56 == 2) {
                                            r42 r42Var = (r42) r52Var2;
                                            int iF8 = y32.f(bArr2, i25, x32Var5);
                                            int i73 = x32Var5.f10344a;
                                            int i74 = iF8 + i73;
                                            if (i74 > bArr2.length) {
                                                throw new u52("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            int i75 = (i73 / 8) + r42Var.f8543u;
                                            int length = r42Var.f8542t.length;
                                            if (i75 <= length) {
                                                i26 = iF8;
                                            } else if (length != 0) {
                                                while (length < i75) {
                                                    length = androidx.activity.m.b(length, 3, 2, 1, 10);
                                                    iF8 = iF8;
                                                }
                                                i26 = iF8;
                                                r42Var.f8542t = Arrays.copyOf(r42Var.f8542t, length);
                                            } else {
                                                i26 = iF8;
                                                r42Var.f8542t = new double[Math.max(i75, 10)];
                                            }
                                            iF = i26;
                                            while (iF < i74) {
                                                r42Var.d(Double.longBitsToDouble(y32.l(iF, bArr2)));
                                                iF += 8;
                                            }
                                            if (iF != i74) {
                                                throw new u52("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            iC2 = iF;
                                            if (iC2 != i25) {
                                                obj2 = obj;
                                                i17 = iC2;
                                                x32Var2 = x32Var5;
                                                i16 = i69;
                                                i50 = i20;
                                                i9 = i8;
                                                break;
                                            } else {
                                                obj6 = obj;
                                                i51 = i10;
                                                bArr7 = bArr2;
                                                x32Var13 = x32Var5;
                                                i48 = i18;
                                                i47 = i69;
                                                break;
                                            }
                                        } else {
                                            if (i56 == 1) {
                                                iC2 = i25 + 8;
                                                r42 r42Var2 = (r42) r52Var2;
                                                r42Var2.d(Double.longBitsToDouble(y32.l(i25, bArr2)));
                                                while (iC2 < i44) {
                                                    int iF9 = y32.f(bArr2, iC2, x32Var5);
                                                    if (i10 == x32Var5.f10344a) {
                                                        r42Var2.d(Double.longBitsToDouble(y32.l(iF9, bArr2)));
                                                        iC2 = iF9 + 8;
                                                    }
                                                }
                                            } else {
                                                iC2 = i25;
                                            }
                                            if (iC2 != i25) {
                                            }
                                        }
                                    case 19:
                                    case 36:
                                        i44 = i7;
                                        x32Var5 = x32Var;
                                        r52 r52Var3 = r52VarB;
                                        i25 = i53;
                                        bArr2 = bArr;
                                        if (i56 == 2) {
                                            b52 b52Var = (b52) r52Var3;
                                            int iF10 = y32.f(bArr2, i25, x32Var5);
                                            int i76 = x32Var5.f10344a;
                                            int i77 = iF10 + i76;
                                            if (i77 > bArr2.length) {
                                                throw new u52("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            int i78 = (i76 / 4) + b52Var.f2929u;
                                            int length2 = b52Var.f2928t.length;
                                            if (i78 <= length2) {
                                                i27 = iF10;
                                            } else if (length2 != 0) {
                                                while (length2 < i78) {
                                                    length2 = androidx.activity.m.b(length2, 3, 2, 1, 10);
                                                    iF10 = iF10;
                                                }
                                                i27 = iF10;
                                                b52Var.f2928t = Arrays.copyOf(b52Var.f2928t, length2);
                                            } else {
                                                i27 = iF10;
                                                b52Var.f2928t = new float[Math.max(i78, 10)];
                                            }
                                            iF = i27;
                                            while (iF < i77) {
                                                b52Var.d(Float.intBitsToFloat(y32.b(iF, bArr2)));
                                                iF += 4;
                                            }
                                            if (iF != i77) {
                                                throw new u52("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            iC2 = iF;
                                            if (iC2 != i25) {
                                            }
                                        } else {
                                            if (i56 == 5) {
                                                iC2 = i25 + 4;
                                                b52 b52Var2 = (b52) r52Var3;
                                                b52Var2.d(Float.intBitsToFloat(y32.b(i25, bArr2)));
                                                while (iC2 < i44) {
                                                    int iF11 = y32.f(bArr2, iC2, x32Var5);
                                                    if (i10 == x32Var5.f10344a) {
                                                        b52Var2.d(Float.intBitsToFloat(y32.b(iF11, bArr2)));
                                                        iC2 = iF11 + 4;
                                                    }
                                                }
                                            }
                                            if (iC2 != i25) {
                                            }
                                        }
                                        break;
                                    case 20:
                                    case dn.zzm /* 21 */:
                                    case 37:
                                    case 38:
                                        i44 = i7;
                                        x32Var5 = x32Var;
                                        r52 r52Var4 = r52VarB;
                                        i25 = i53;
                                        bArr2 = bArr;
                                        if (i56 == 2) {
                                            c62 c62Var = (c62) r52Var4;
                                            iF = y32.f(bArr2, i25, x32Var5);
                                            int i79 = x32Var5.f10344a + iF;
                                            while (iF < i79) {
                                                iF = y32.i(bArr2, iF, x32Var5);
                                                c62Var.f(x32Var5.f10345b);
                                            }
                                            if (iF != i79) {
                                                throw new u52("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            iC2 = iF;
                                            if (iC2 != i25) {
                                            }
                                        } else {
                                            if (i56 == 0) {
                                                c62 c62Var2 = (c62) r52Var4;
                                                int i80 = y32.i(bArr2, i25, x32Var5);
                                                c62Var2.f(x32Var5.f10345b);
                                                while (i80 < i44) {
                                                    int iF12 = y32.f(bArr2, i80, x32Var5);
                                                    if (i10 == x32Var5.f10344a) {
                                                        i80 = y32.i(bArr2, iF12, x32Var5);
                                                        c62Var2.f(x32Var5.f10345b);
                                                    } else {
                                                        iC2 = i80;
                                                    }
                                                }
                                                iC2 = i80;
                                            }
                                            if (iC2 != i25) {
                                            }
                                        }
                                        break;
                                    case 22:
                                    case 29:
                                    case 39:
                                    case 43:
                                        bArr3 = bArr;
                                        i28 = i7;
                                        i29 = i10;
                                        r52 r52Var5 = r52VarB;
                                        i30 = i53;
                                        x32Var6 = x32Var;
                                        if (i56 == 2) {
                                            iD2 = y32.d(bArr3, i30, r52Var5, x32Var6);
                                            i44 = i28;
                                            i25 = i30;
                                            x32Var5 = x32Var6;
                                            i10 = i29;
                                            iC2 = iD2;
                                            bArr2 = bArr3;
                                            if (iC2 != i25) {
                                            }
                                        } else {
                                            if (i56 == 0) {
                                                int iH2 = y32.h(i29, bArr3, i30, i28, r52Var5, x32Var6);
                                                i10 = i29;
                                                bArr2 = bArr3;
                                                i25 = i30;
                                                iC = iH2;
                                                x32Var5 = x32Var6;
                                                i44 = i28;
                                                iC2 = iC;
                                                if (iC2 != i25) {
                                                }
                                            }
                                            i44 = i28;
                                            i25 = i30;
                                            x32Var5 = x32Var6;
                                            i10 = i29;
                                            bArr2 = bArr3;
                                            iC2 = i25;
                                            if (iC2 != i25) {
                                            }
                                        }
                                        break;
                                    case 23:
                                    case 32:
                                    case 40:
                                    case 46:
                                        bArr3 = bArr;
                                        i28 = i7;
                                        i29 = i10;
                                        r52 r52Var6 = r52VarB;
                                        i30 = i53;
                                        x32Var6 = x32Var;
                                        if (i56 == 2) {
                                            c62 c62Var3 = (c62) r52Var6;
                                            int iF13 = y32.f(bArr3, i30, x32Var6);
                                            int i81 = x32Var6.f10344a;
                                            int i82 = iF13 + i81;
                                            if (i82 > bArr3.length) {
                                                throw new u52("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            int i83 = (i81 / 8) + c62Var3.f3442u;
                                            int length3 = c62Var3.f3441t.length;
                                            if (i83 <= length3) {
                                                i31 = iF13;
                                            } else if (length3 != 0) {
                                                while (length3 < i83) {
                                                    length3 = androidx.activity.m.b(length3, 3, 2, 1, 10);
                                                    iF13 = iF13;
                                                }
                                                i31 = iF13;
                                                c62Var3.f3441t = Arrays.copyOf(c62Var3.f3441t, length3);
                                            } else {
                                                i31 = iF13;
                                                c62Var3.f3441t = new long[Math.max(i83, 10)];
                                            }
                                            iF2 = i31;
                                            while (iF2 < i82) {
                                                c62Var3.f(y32.l(iF2, bArr3));
                                                iF2 += 8;
                                            }
                                            if (iF2 != i82) {
                                                throw new u52("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            int i84 = iF2;
                                            i44 = i28;
                                            iC2 = i84;
                                            i25 = i30;
                                            x32Var5 = x32Var6;
                                            i10 = i29;
                                            bArr2 = bArr3;
                                            if (iC2 != i25) {
                                            }
                                        } else {
                                            if (i56 == 1) {
                                                iD2 = i30 + 8;
                                                c62 c62Var4 = (c62) r52Var6;
                                                c62Var4.f(y32.l(i30, bArr3));
                                                while (iD2 < i28) {
                                                    int iF14 = y32.f(bArr3, iD2, x32Var6);
                                                    if (i29 == x32Var6.f10344a) {
                                                        c62Var4.f(y32.l(iF14, bArr3));
                                                        iD2 = iF14 + 8;
                                                    } else {
                                                        i44 = i28;
                                                        i25 = i30;
                                                        x32Var5 = x32Var6;
                                                        i10 = i29;
                                                        iC2 = iD2;
                                                        bArr2 = bArr3;
                                                        if (iC2 != i25) {
                                                        }
                                                    }
                                                }
                                                i44 = i28;
                                                i25 = i30;
                                                x32Var5 = x32Var6;
                                                i10 = i29;
                                                iC2 = iD2;
                                                bArr2 = bArr3;
                                                if (iC2 != i25) {
                                                }
                                            }
                                            i44 = i28;
                                            i25 = i30;
                                            x32Var5 = x32Var6;
                                            i10 = i29;
                                            bArr2 = bArr3;
                                            iC2 = i25;
                                            if (iC2 != i25) {
                                            }
                                        }
                                        break;
                                    case 24:
                                    case 31:
                                    case 41:
                                    case 45:
                                        bArr3 = bArr;
                                        i28 = i7;
                                        i29 = i10;
                                        r52 r52Var7 = r52VarB;
                                        i30 = i53;
                                        x32Var6 = x32Var;
                                        if (i56 == 2) {
                                            k52 k52Var = (k52) r52Var7;
                                            int iF15 = y32.f(bArr3, i30, x32Var6);
                                            int i85 = x32Var6.f10344a;
                                            int i86 = iF15 + i85;
                                            if (i86 > bArr3.length) {
                                                throw new u52("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            int i87 = (i85 / 4) + k52Var.f6258u;
                                            int length4 = k52Var.f6257t.length;
                                            if (i87 <= length4) {
                                                i32 = iF15;
                                            } else if (length4 != 0) {
                                                while (length4 < i87) {
                                                    length4 = androidx.activity.m.b(length4, 3, 2, 1, 10);
                                                    iF15 = iF15;
                                                }
                                                i32 = iF15;
                                                k52Var.f6257t = Arrays.copyOf(k52Var.f6257t, length4);
                                            } else {
                                                i32 = iF15;
                                                k52Var.f6257t = new int[Math.max(i87, 10)];
                                            }
                                            iF2 = i32;
                                            while (iF2 < i86) {
                                                k52Var.f(y32.b(iF2, bArr3));
                                                iF2 += 4;
                                            }
                                            if (iF2 != i86) {
                                                throw new u52("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            int i842 = iF2;
                                            i44 = i28;
                                            iC2 = i842;
                                            i25 = i30;
                                            x32Var5 = x32Var6;
                                            i10 = i29;
                                            bArr2 = bArr3;
                                            if (iC2 != i25) {
                                            }
                                        } else {
                                            if (i56 == 5) {
                                                iD2 = i30 + 4;
                                                k52 k52Var2 = (k52) r52Var7;
                                                k52Var2.f(y32.b(i30, bArr3));
                                                while (iD2 < i28) {
                                                    int iF16 = y32.f(bArr3, iD2, x32Var6);
                                                    if (i29 == x32Var6.f10344a) {
                                                        k52Var2.f(y32.b(iF16, bArr3));
                                                        iD2 = iF16 + 4;
                                                    } else {
                                                        i44 = i28;
                                                        i25 = i30;
                                                        x32Var5 = x32Var6;
                                                        i10 = i29;
                                                        iC2 = iD2;
                                                        bArr2 = bArr3;
                                                        if (iC2 != i25) {
                                                        }
                                                    }
                                                }
                                                i44 = i28;
                                                i25 = i30;
                                                x32Var5 = x32Var6;
                                                i10 = i29;
                                                iC2 = iD2;
                                                bArr2 = bArr3;
                                                if (iC2 != i25) {
                                                }
                                            }
                                            i44 = i28;
                                            i25 = i30;
                                            x32Var5 = x32Var6;
                                            i10 = i29;
                                            bArr2 = bArr3;
                                            iC2 = i25;
                                            if (iC2 != i25) {
                                            }
                                        }
                                        break;
                                    case 25:
                                    case 42:
                                        bArr3 = bArr;
                                        i28 = i7;
                                        i29 = i10;
                                        r52 r52Var8 = r52VarB;
                                        i30 = i53;
                                        x32Var6 = x32Var;
                                        if (i56 == 2) {
                                            z32 z32Var = (z32) r52Var8;
                                            iF2 = y32.f(bArr3, i30, x32Var6);
                                            int i88 = x32Var6.f10344a + iF2;
                                            while (iF2 < i88) {
                                                iF2 = y32.i(bArr3, iF2, x32Var6);
                                                z32Var.d(x32Var6.f10345b != 0);
                                            }
                                            if (iF2 != i88) {
                                                throw new u52("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            int i8422 = iF2;
                                            i44 = i28;
                                            iC2 = i8422;
                                            i25 = i30;
                                            x32Var5 = x32Var6;
                                            i10 = i29;
                                            bArr2 = bArr3;
                                            if (iC2 != i25) {
                                            }
                                        } else {
                                            if (i56 == 0) {
                                                z32 z32Var2 = (z32) r52Var8;
                                                i33 = y32.i(bArr3, i30, x32Var6);
                                                z32Var2.d(x32Var6.f10345b != 0);
                                                while (i33 < i28) {
                                                    int iF17 = y32.f(bArr3, i33, x32Var6);
                                                    if (i29 == x32Var6.f10344a) {
                                                        i33 = y32.i(bArr3, iF17, x32Var6);
                                                        z32Var2.d(x32Var6.f10345b != 0);
                                                    } else {
                                                        i44 = i28;
                                                        i25 = i30;
                                                        x32Var5 = x32Var6;
                                                        i10 = i29;
                                                        iC2 = i33;
                                                        bArr2 = bArr3;
                                                        if (iC2 != i25) {
                                                        }
                                                    }
                                                }
                                                i44 = i28;
                                                i25 = i30;
                                                x32Var5 = x32Var6;
                                                i10 = i29;
                                                iC2 = i33;
                                                bArr2 = bArr3;
                                                if (iC2 != i25) {
                                                }
                                            }
                                            i44 = i28;
                                            i25 = i30;
                                            x32Var5 = x32Var6;
                                            i10 = i29;
                                            bArr2 = bArr3;
                                            iC2 = i25;
                                            if (iC2 != i25) {
                                            }
                                        }
                                        break;
                                    case 26:
                                        bArr3 = bArr;
                                        i28 = i7;
                                        i29 = i10;
                                        r52 r52Var9 = r52VarB;
                                        i30 = i53;
                                        x32Var6 = x32Var;
                                        if (i56 != 2) {
                                            i69 = i69;
                                            i44 = i28;
                                            i25 = i30;
                                            x32Var5 = x32Var6;
                                            i10 = i29;
                                            bArr2 = bArr3;
                                            iC2 = i25;
                                            if (iC2 != i25) {
                                            }
                                        } else if ((j6 & 536870912) == 0) {
                                            i33 = y32.f(bArr3, i30, x32Var6);
                                            int i89 = x32Var6.f10344a;
                                            if (i89 < 0) {
                                                throw new u52("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i89 == 0) {
                                                r52Var9.add(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                                            } else {
                                                r52Var9.add(new String(bArr3, i33, i89, s52.f8801a));
                                                i33 += i89;
                                            }
                                            while (i33 < i28) {
                                                int iF18 = y32.f(bArr3, i33, x32Var6);
                                                if (i29 == x32Var6.f10344a) {
                                                    i33 = y32.f(bArr3, iF18, x32Var6);
                                                    int i90 = x32Var6.f10344a;
                                                    if (i90 < 0) {
                                                        throw new u52("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i90 == 0) {
                                                        r52Var9.add(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                                                    } else {
                                                        r52Var9.add(new String(bArr3, i33, i90, s52.f8801a));
                                                        i33 += i90;
                                                    }
                                                } else {
                                                    i44 = i28;
                                                    i25 = i30;
                                                    x32Var5 = x32Var6;
                                                    i10 = i29;
                                                    i69 = i69;
                                                    iC2 = i33;
                                                    bArr2 = bArr3;
                                                    if (iC2 != i25) {
                                                    }
                                                }
                                            }
                                            i44 = i28;
                                            i25 = i30;
                                            x32Var5 = x32Var6;
                                            i10 = i29;
                                            i69 = i69;
                                            iC2 = i33;
                                            bArr2 = bArr3;
                                            if (iC2 != i25) {
                                            }
                                        } else {
                                            i33 = y32.f(bArr3, i30, x32Var6);
                                            int i91 = x32Var6.f10344a;
                                            if (i91 < 0) {
                                                throw new u52("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i91 == 0) {
                                                r52Var9.add(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                                                i69 = i69;
                                            } else {
                                                int i92 = i33 + i91;
                                                if (!v72.d(i33, i92, bArr3)) {
                                                    throw new u52("Protocol message had invalid UTF-8.");
                                                }
                                                i69 = i69;
                                                r52Var9.add(new String(bArr3, i33, i91, s52.f8801a));
                                                i33 = i92;
                                            }
                                            while (i33 < i28) {
                                                int iF19 = y32.f(bArr3, i33, x32Var6);
                                                if (i29 == x32Var6.f10344a) {
                                                    i33 = y32.f(bArr3, iF19, x32Var6);
                                                    int i93 = x32Var6.f10344a;
                                                    if (i93 < 0) {
                                                        throw new u52("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i93 == 0) {
                                                        r52Var9.add(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                                                    } else {
                                                        int i94 = i33 + i93;
                                                        if (!v72.d(i33, i94, bArr3)) {
                                                            throw new u52("Protocol message had invalid UTF-8.");
                                                        }
                                                        r52Var9.add(new String(bArr3, i33, i93, s52.f8801a));
                                                        i33 = i94;
                                                    }
                                                } else {
                                                    i44 = i28;
                                                    i25 = i30;
                                                    x32Var5 = x32Var6;
                                                    i10 = i29;
                                                    iC2 = i33;
                                                    bArr2 = bArr3;
                                                    if (iC2 != i25) {
                                                    }
                                                }
                                            }
                                            i44 = i28;
                                            i25 = i30;
                                            x32Var5 = x32Var6;
                                            i10 = i29;
                                            iC2 = i33;
                                            bArr2 = bArr3;
                                            if (iC2 != i25) {
                                            }
                                        }
                                        break;
                                    case 27:
                                        x32Var7 = x32Var;
                                        i34 = i10;
                                        r52 r52Var10 = r52VarB;
                                        i25 = i53;
                                        i35 = i69;
                                        bArr2 = bArr;
                                        if (i56 == 2) {
                                            i44 = i7;
                                            iC = y32.c(I(i18), i34, bArr2, i25, i44, r52Var10, x32Var7);
                                            i10 = i34;
                                            x32Var5 = x32Var7;
                                            i69 = i35;
                                            iC2 = iC;
                                            if (iC2 != i25) {
                                            }
                                        } else {
                                            i44 = i7;
                                            x32Var5 = x32Var7;
                                            i10 = i34;
                                            i69 = i35;
                                            iC2 = i25;
                                            if (iC2 != i25) {
                                            }
                                        }
                                        break;
                                    case 28:
                                        x32Var7 = x32Var;
                                        i34 = i10;
                                        r52 r52Var11 = r52VarB;
                                        i25 = i53;
                                        i35 = i69;
                                        bArr2 = bArr;
                                        if (i56 == 2) {
                                            int iF20 = y32.f(bArr2, i25, x32Var7);
                                            int i95 = x32Var7.f10344a;
                                            if (i95 < 0) {
                                                throw new u52("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i95 > bArr2.length - iF20) {
                                                throw new u52("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            if (i95 == 0) {
                                                r52Var11.add(g42.f4896t);
                                            } else {
                                                r52Var11.add(g42.s(iF20, i95, bArr2));
                                                iF20 += i95;
                                            }
                                            while (iF20 < i7) {
                                                int iF21 = y32.f(bArr2, iF20, x32Var7);
                                                if (i34 == x32Var7.f10344a) {
                                                    iF20 = y32.f(bArr2, iF21, x32Var7);
                                                    int i96 = x32Var7.f10344a;
                                                    if (i96 < 0) {
                                                        throw new u52("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i96 > bArr2.length - iF20) {
                                                        throw new u52("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    if (i96 == 0) {
                                                        r52Var11.add(g42.f4896t);
                                                    } else {
                                                        r52Var11.add(g42.s(iF20, i96, bArr2));
                                                        iF20 += i96;
                                                    }
                                                } else {
                                                    iC2 = iF20;
                                                    i44 = i7;
                                                    x32Var5 = x32Var7;
                                                    i10 = i34;
                                                    i69 = i35;
                                                    if (iC2 != i25) {
                                                    }
                                                }
                                            }
                                            iC2 = iF20;
                                            i44 = i7;
                                            x32Var5 = x32Var7;
                                            i10 = i34;
                                            i69 = i35;
                                            if (iC2 != i25) {
                                            }
                                        } else {
                                            i44 = i7;
                                            x32Var5 = x32Var7;
                                            i10 = i34;
                                            i69 = i35;
                                            iC2 = i25;
                                            if (iC2 != i25) {
                                            }
                                        }
                                        break;
                                    case 30:
                                    case 44:
                                        i44 = i7;
                                        if (i56 == 2) {
                                            iH = y32.d(bArr, i53, r52VarB, x32Var);
                                            i25 = i53;
                                            i36 = i10;
                                            i37 = i44;
                                            r52Var = r52VarB;
                                            bArr2 = bArr;
                                        } else if (i56 == 0) {
                                            r52Var = r52VarB;
                                            iH = y32.h(i10, bArr, i53, i44, r52Var, x32Var);
                                            i36 = i10;
                                            bArr2 = bArr;
                                            i25 = i53;
                                            i37 = i44;
                                        } else {
                                            i25 = i53;
                                            bArr2 = bArr;
                                            x32Var5 = x32Var;
                                            iC2 = i25;
                                            if (iC2 != i25) {
                                            }
                                        }
                                        c72.s(obj, i69, r52Var, H(i18), null, this.f7973k);
                                        iC2 = iH;
                                        i44 = i37;
                                        x32Var5 = x32Var;
                                        i10 = i36;
                                        if (iC2 != i25) {
                                        }
                                        break;
                                    case ImageFormatConstants.INTERNAL_DEFINED_IMAGE_FORMAT_JPEG /* 33 */:
                                    case 47:
                                        bArr4 = bArr;
                                        i44 = i7;
                                        x32Var8 = x32Var;
                                        i38 = i53;
                                        if (i56 == 2) {
                                            k52 k52Var3 = (k52) r52VarB;
                                            iF4 = y32.f(bArr4, i38, x32Var8);
                                            int i97 = x32Var8.f10344a + iF4;
                                            while (iF4 < i97) {
                                                iF4 = y32.f(bArr4, iF4, x32Var8);
                                                k52Var3.f(k42.c(x32Var8.f10344a));
                                            }
                                            if (iF4 != i97) {
                                                throw new u52("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            iC2 = iF4;
                                            bArr2 = bArr4;
                                            x32Var5 = x32Var8;
                                            i25 = i38;
                                            if (iC2 != i25) {
                                            }
                                        } else {
                                            if (i56 == 0) {
                                                k52 k52Var4 = (k52) r52VarB;
                                                iF3 = y32.f(bArr4, i38, x32Var8);
                                                k52Var4.f(k42.c(x32Var8.f10344a));
                                                while (iF3 < i44) {
                                                    int iF22 = y32.f(bArr4, iF3, x32Var8);
                                                    if (i10 == x32Var8.f10344a) {
                                                        iF3 = y32.f(bArr4, iF22, x32Var8);
                                                        k52Var4.f(k42.c(x32Var8.f10344a));
                                                    } else {
                                                        iC2 = iF3;
                                                        bArr2 = bArr4;
                                                        x32Var5 = x32Var8;
                                                        i25 = i38;
                                                        if (iC2 != i25) {
                                                        }
                                                    }
                                                }
                                                iC2 = iF3;
                                                bArr2 = bArr4;
                                                x32Var5 = x32Var8;
                                                i25 = i38;
                                                if (iC2 != i25) {
                                                }
                                            }
                                            bArr2 = bArr4;
                                            x32Var5 = x32Var8;
                                            i25 = i38;
                                            iC2 = i25;
                                            if (iC2 != i25) {
                                            }
                                        }
                                        break;
                                    case ImageFormatConstants.INTERNAL_DEFINED_IMAGE_FORMAT_PRIVATE /* 34 */:
                                    case 48:
                                        bArr4 = bArr;
                                        i44 = i7;
                                        x32Var8 = x32Var;
                                        i38 = i53;
                                        if (i56 == 2) {
                                            c62 c62Var5 = (c62) r52VarB;
                                            iF4 = y32.f(bArr4, i38, x32Var8);
                                            int i98 = x32Var8.f10344a + iF4;
                                            while (iF4 < i98) {
                                                iF4 = y32.i(bArr4, iF4, x32Var8);
                                                c62Var5.f(k42.d(x32Var8.f10345b));
                                            }
                                            if (iF4 != i98) {
                                                throw new u52("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            iC2 = iF4;
                                            bArr2 = bArr4;
                                            x32Var5 = x32Var8;
                                            i25 = i38;
                                            if (iC2 != i25) {
                                            }
                                        } else {
                                            if (i56 == 0) {
                                                c62 c62Var6 = (c62) r52VarB;
                                                iF3 = y32.i(bArr4, i38, x32Var8);
                                                c62Var6.f(k42.d(x32Var8.f10345b));
                                                while (iF3 < i44) {
                                                    int iF23 = y32.f(bArr4, iF3, x32Var8);
                                                    if (i10 == x32Var8.f10344a) {
                                                        iF3 = y32.i(bArr4, iF23, x32Var8);
                                                        c62Var6.f(k42.d(x32Var8.f10345b));
                                                    } else {
                                                        iC2 = iF3;
                                                        bArr2 = bArr4;
                                                        x32Var5 = x32Var8;
                                                        i25 = i38;
                                                        if (iC2 != i25) {
                                                        }
                                                    }
                                                }
                                                iC2 = iF3;
                                                bArr2 = bArr4;
                                                x32Var5 = x32Var8;
                                                i25 = i38;
                                                if (iC2 != i25) {
                                                }
                                            }
                                            bArr2 = bArr4;
                                            x32Var5 = x32Var8;
                                            i25 = i38;
                                            iC2 = i25;
                                            if (iC2 != i25) {
                                            }
                                        }
                                        break;
                                    default:
                                        if (i56 == 3) {
                                            int i99 = (i10 & (-8)) | 4;
                                            b72 b72VarI = I(i18);
                                            j52 j52VarZze = b72VarI.zze();
                                            i44 = i7;
                                            int iJ2 = y32.j(j52VarZze, b72VarI, bArr, i53, i44, i99, x32Var);
                                            i38 = i53;
                                            int i100 = i99;
                                            x32 x32Var15 = x32Var;
                                            b72VarI.a(j52VarZze);
                                            x32Var15.f10346c = j52VarZze;
                                            r52VarB.add(j52VarZze);
                                            while (iJ2 < i44) {
                                                int iF24 = y32.f(bArr, iJ2, x32Var15);
                                                if (i10 == x32Var15.f10344a) {
                                                    int i101 = i100;
                                                    j52 j52VarZze2 = b72VarI.zze();
                                                    iJ2 = y32.j(j52VarZze2, b72VarI, bArr, iF24, i44, i101, x32Var);
                                                    i100 = i101;
                                                    x32Var15 = x32Var;
                                                    b72VarI.a(j52VarZze2);
                                                    x32Var15.f10346c = j52VarZze2;
                                                    r52VarB.add(j52VarZze2);
                                                } else {
                                                    bArr2 = bArr;
                                                    x32Var5 = x32Var15;
                                                    iC2 = iJ2;
                                                    i25 = i38;
                                                    if (iC2 != i25) {
                                                    }
                                                }
                                            }
                                            bArr2 = bArr;
                                            x32Var5 = x32Var15;
                                            iC2 = iJ2;
                                            i25 = i38;
                                            if (iC2 != i25) {
                                            }
                                        } else {
                                            bArr2 = bArr;
                                            i44 = i7;
                                            x32Var5 = x32Var;
                                            i25 = i53;
                                            iC2 = i25;
                                            if (iC2 != i25) {
                                            }
                                        }
                                        break;
                                }
                            }
                            i49 = i13;
                            i46 = i15;
                            i45 = i14;
                            i50 = i20;
                            unsafe4 = unsafe;
                        } else if (i56 == 2) {
                            r52 r52VarB2 = (r52) unsafe7.getObject(obj7, j7);
                            if (!r52VarB2.zzc()) {
                                int size2 = r52VarB2.size();
                                r52VarB2 = r52VarB2.b(size2 == 0 ? 10 : size2 + size2);
                                unsafe7.putObject(obj7, j7, r52VarB2);
                            }
                            r52 r52Var12 = r52VarB2;
                            bArr7 = bArr;
                            i44 = i7;
                            iC2 = y32.c(I(i18), i54, bArr7, i53, i44, r52Var12, x32Var);
                            x32Var13 = x32Var;
                            i51 = i54;
                            i50 = i68;
                            i48 = i18;
                            unsafe4 = unsafe7;
                            obj6 = obj7;
                            i47 = i69;
                            i49 = i13;
                            i46 = i15;
                            i45 = i14;
                        } else {
                            bArr2 = bArr;
                            x32Var3 = x32Var;
                            i20 = i68;
                            unsafe = unsafe7;
                            obj2 = obj7;
                            i21 = i53;
                            i10 = i54;
                        }
                        i17 = i21;
                        i16 = i69;
                        i50 = i20;
                        x32Var2 = x32Var3;
                        i9 = i8;
                    }
                }
                if (i10 == i9 && i9 != 0) {
                    i44 = i7;
                    iC2 = i17;
                    i11 = i50;
                    i49 = i13;
                } else if (this.f7969f) {
                    u42 u42Var = x32Var2.f10347d;
                    u42 u42Var2 = u42.f9458b;
                    u62 u62Var = u62.f9474c;
                    if (u42Var != u42.f9459c) {
                        m62 m62Var = this.f7968e;
                        u42Var.getClass();
                        if (((i52) u42Var.f9460a.get(new t42(i16, m62Var))) != null) {
                            throw null;
                        }
                        i19 = i10;
                        iE = y32.e(i19, bArr2, i17, i7, A(obj2), x32Var2);
                        i44 = i7;
                    } else {
                        i19 = i10;
                        iE = y32.e(i19, bArr, i17, i7, A(obj2), x32Var);
                        i44 = i7;
                    }
                    iC2 = iE;
                    bArr7 = bArr;
                    x32Var13 = x32Var;
                    i51 = i19;
                    i48 = i18;
                    i47 = i16;
                    obj6 = obj2;
                    i49 = i13;
                    i46 = i15;
                    i45 = i14;
                    unsafe4 = unsafe;
                }
            } else {
                i9 = i8;
                unsafe = unsafe4;
                obj2 = obj6;
                obj3 = null;
                i10 = i51;
                i11 = i50;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.b72
    public final j52 zze() {
        return ((j52) this.f7968e).t();
    }
}
