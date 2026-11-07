package com.google.android.gms.internal.consent_sdk;

import androidx.camera.core.impl.ImageFormatConstants;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.internal.ads.dn;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class y7<T> implements e8<T> {

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f11944i = new int[0];

    /* renamed from: j, reason: collision with root package name */
    public static final Unsafe f11945j = s8.i();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f11946a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f11947b;

    /* renamed from: c, reason: collision with root package name */
    public final v7 f11948c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f11949d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f11950e;

    /* renamed from: f, reason: collision with root package name */
    public final int f11951f;

    /* renamed from: g, reason: collision with root package name */
    public final p1 f11952g;
    public final o6 h;

    public y7(int[] iArr, Object[] objArr, v7 v7Var, int[] iArr2, int i6, p1 p1Var, o6 o6Var) {
        this.f11946a = iArr;
        this.f11947b = objArr;
        boolean z6 = false;
        if (o6Var != null && (v7Var instanceof x6)) {
            z6 = true;
        }
        this.f11949d = z6;
        this.f11950e = iArr2;
        this.f11951f = i6;
        this.f11952g = p1Var;
        this.h = o6Var;
        this.f11948c = v7Var;
    }

    public static boolean h(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof z6) {
            return ((z6) obj).e();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x037b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static y7 j(t7 t7Var, p1 p1Var, p6 p6Var) {
        int i6;
        int iCharAt;
        int iCharAt2;
        int i7;
        int i8;
        int[] iArr;
        int i9;
        int i10;
        char cCharAt;
        int i11;
        char cCharAt2;
        int i12;
        char cCharAt3;
        int i13;
        char cCharAt4;
        int i14;
        int i15;
        int i16;
        char cCharAt5;
        int i17;
        char cCharAt6;
        int i18;
        int i19;
        int i20;
        Object[] objArr;
        int i21;
        int i22;
        int i23;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        String str;
        char c7;
        int i24;
        int i25;
        int i26;
        int i27;
        Field fieldP;
        char cCharAt7;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        Object obj;
        Field fieldP2;
        Object obj2;
        Field fieldP3;
        int i34;
        char cCharAt8;
        int i35;
        int i36;
        char cCharAt9;
        int i37;
        char cCharAt10;
        int i38;
        char cCharAt11;
        if (!(t7Var instanceof d8)) {
            throw null;
        }
        d8 d8Var = (d8) t7Var;
        String str2 = d8Var.f11684b;
        int length = str2.length();
        char c8 = 55296;
        if (str2.charAt(0) >= 55296) {
            int i39 = 1;
            while (true) {
                i6 = i39 + 1;
                if (str2.charAt(i39) < 55296) {
                    break;
                }
                i39 = i6;
            }
        } else {
            i6 = 1;
        }
        int i40 = i6 + 1;
        int iCharAt3 = str2.charAt(i6);
        if (iCharAt3 >= 55296) {
            int i41 = iCharAt3 & 8191;
            int i42 = 13;
            while (true) {
                i38 = i40 + 1;
                cCharAt11 = str2.charAt(i40);
                if (cCharAt11 < 55296) {
                    break;
                }
                i41 |= (cCharAt11 & 8191) << i42;
                i42 += 13;
                i40 = i38;
            }
            iCharAt3 = i41 | (cCharAt11 << i42);
            i40 = i38;
        }
        if (iCharAt3 == 0) {
            iCharAt = 0;
            iCharAt2 = 0;
            i7 = 0;
            i9 = 0;
            iArr = f11944i;
            i8 = 0;
        } else {
            int i43 = i40 + 1;
            int iCharAt4 = str2.charAt(i40);
            if (iCharAt4 >= 55296) {
                int i44 = iCharAt4 & 8191;
                int i45 = 13;
                while (true) {
                    i17 = i43 + 1;
                    cCharAt6 = str2.charAt(i43);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i44 |= (cCharAt6 & 8191) << i45;
                    i45 += 13;
                    i43 = i17;
                }
                iCharAt4 = i44 | (cCharAt6 << i45);
                i43 = i17;
            }
            int i46 = i43 + 1;
            int iCharAt5 = str2.charAt(i43);
            if (iCharAt5 >= 55296) {
                int i47 = iCharAt5 & 8191;
                int i48 = 13;
                while (true) {
                    i16 = i46 + 1;
                    cCharAt5 = str2.charAt(i46);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i47 |= (cCharAt5 & 8191) << i48;
                    i48 += 13;
                    i46 = i16;
                }
                iCharAt5 = i47 | (cCharAt5 << i48);
                i46 = i16;
            }
            int i49 = i46 + 1;
            if (str2.charAt(i46) >= 55296) {
                while (true) {
                    i15 = i49 + 1;
                    if (str2.charAt(i49) < 55296) {
                        break;
                    }
                    i49 = i15;
                }
                i49 = i15;
            }
            int i50 = i49 + 1;
            if (str2.charAt(i49) >= 55296) {
                while (true) {
                    i14 = i50 + 1;
                    if (str2.charAt(i50) < 55296) {
                        break;
                    }
                    i50 = i14;
                }
                i50 = i14;
            }
            int i51 = i50 + 1;
            iCharAt = str2.charAt(i50);
            if (iCharAt >= 55296) {
                int i52 = iCharAt & 8191;
                int i53 = 13;
                while (true) {
                    i13 = i51 + 1;
                    cCharAt4 = str2.charAt(i51);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i52 |= (cCharAt4 & 8191) << i53;
                    i53 += 13;
                    i51 = i13;
                }
                iCharAt = i52 | (cCharAt4 << i53);
                i51 = i13;
            }
            int i54 = i51 + 1;
            iCharAt2 = str2.charAt(i51);
            if (iCharAt2 >= 55296) {
                int i55 = iCharAt2 & 8191;
                int i56 = 13;
                while (true) {
                    i12 = i54 + 1;
                    cCharAt3 = str2.charAt(i54);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i55 |= (cCharAt3 & 8191) << i56;
                    i56 += 13;
                    i54 = i12;
                }
                iCharAt2 = i55 | (cCharAt3 << i56);
                i54 = i12;
            }
            int i57 = i54 + 1;
            int iCharAt6 = str2.charAt(i54);
            if (iCharAt6 >= 55296) {
                int i58 = iCharAt6 & 8191;
                int i59 = 13;
                while (true) {
                    i11 = i57 + 1;
                    cCharAt2 = str2.charAt(i57);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i58 |= (cCharAt2 & 8191) << i59;
                    i59 += 13;
                    i57 = i11;
                }
                iCharAt6 = i58 | (cCharAt2 << i59);
                i57 = i11;
            }
            int i60 = i57 + 1;
            int iCharAt7 = str2.charAt(i57);
            if (iCharAt7 >= 55296) {
                int i61 = iCharAt7 & 8191;
                int i62 = 13;
                while (true) {
                    i10 = i60 + 1;
                    cCharAt = str2.charAt(i60);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i61 |= (cCharAt & 8191) << i62;
                    i62 += 13;
                    i60 = i10;
                }
                iCharAt7 = i61 | (cCharAt << i62);
                i60 = i10;
            }
            int i63 = iCharAt7 + iCharAt2 + iCharAt6;
            i7 = iCharAt4 + iCharAt4 + iCharAt5;
            i8 = iCharAt4;
            i40 = i60;
            iArr = new int[i63];
            i9 = iCharAt7;
        }
        Unsafe unsafe = f11945j;
        Object[] objArr2 = d8Var.f11685c;
        Class<?> cls = d8Var.f11683a.getClass();
        int i64 = iCharAt2 + i9;
        int i65 = iCharAt + iCharAt;
        int[] iArr2 = new int[iCharAt * 3];
        Object[] objArr3 = new Object[i65];
        int i66 = i9;
        int i67 = 0;
        int i68 = 0;
        while (i40 < length) {
            int i69 = i40 + 1;
            int iCharAt8 = str2.charAt(i40);
            if (iCharAt8 >= c8) {
                int i70 = iCharAt8 & 8191;
                int i71 = i69;
                int i72 = 13;
                while (true) {
                    i37 = i71 + 1;
                    cCharAt10 = str2.charAt(i71);
                    if (cCharAt10 < c8) {
                        break;
                    }
                    i70 |= (cCharAt10 & 8191) << i72;
                    i72 += 13;
                    i71 = i37;
                }
                iCharAt8 = i70 | (cCharAt10 << i72);
                i18 = i37;
            } else {
                i18 = i69;
            }
            int i73 = i18 + 1;
            int iCharAt9 = str2.charAt(i18);
            if (iCharAt9 >= c8) {
                int i74 = iCharAt9 & 8191;
                int i75 = i73;
                int i76 = 13;
                while (true) {
                    i36 = i75 + 1;
                    cCharAt9 = str2.charAt(i75);
                    i19 = length;
                    if (cCharAt9 < 55296) {
                        break;
                    }
                    i74 |= (cCharAt9 & 8191) << i76;
                    i76 += 13;
                    i75 = i36;
                    length = i19;
                }
                iCharAt9 = i74 | (cCharAt9 << i76);
                i20 = i36;
            } else {
                i19 = length;
                i20 = i73;
            }
            if ((iCharAt9 & 1024) != 0) {
                iArr[i67] = i68;
                i67++;
            }
            int i77 = iCharAt9 & 255;
            int i78 = iCharAt8;
            int i79 = iCharAt9 & 2048;
            if (i77 >= 51) {
                int i80 = i20 + 1;
                int iCharAt10 = str2.charAt(i20);
                if (iCharAt10 >= 55296) {
                    int i81 = iCharAt10 & 8191;
                    int i82 = i80;
                    int i83 = 13;
                    while (true) {
                        i34 = i82 + 1;
                        cCharAt8 = str2.charAt(i82);
                        i35 = i81;
                        if (cCharAt8 < 55296) {
                            break;
                        }
                        i81 = i35 | ((cCharAt8 & 8191) << i83);
                        i83 += 13;
                        i82 = i34;
                    }
                    iCharAt10 = i35 | (cCharAt8 << i83);
                    i31 = i34;
                } else {
                    i31 = i80;
                }
                int i84 = iCharAt10;
                int i85 = i77 - 51;
                int i86 = i31;
                if (i85 == 9 || i85 == 17) {
                    i32 = i7 + 1;
                    int i87 = i68 / 3;
                    objArr3[i87 + i87 + 1] = objArr2[i7];
                } else {
                    if (i85 != 12) {
                        i33 = i79;
                    } else if (d8Var.zzc() == 1 || i79 != 0) {
                        i32 = i7 + 1;
                        int i88 = i68 / 3;
                        objArr3[i88 + i88 + 1] = objArr2[i7];
                    } else {
                        i33 = 0;
                    }
                    int i89 = i84 + i84;
                    obj = objArr2[i89];
                    int i90 = i33;
                    if (obj instanceof Field) {
                        fieldP2 = p(cls, (String) obj);
                        objArr2[i89] = fieldP2;
                    } else {
                        fieldP2 = (Field) obj;
                    }
                    int i91 = i8;
                    objArr = objArr3;
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldP2);
                    int i92 = i89 + 1;
                    obj2 = objArr2[i92];
                    if (obj2 instanceof Field) {
                        fieldP3 = p(cls, (String) obj2);
                        objArr2[i92] = fieldP3;
                    } else {
                        fieldP3 = (Field) obj2;
                    }
                    i21 = i91;
                    i23 = i90;
                    str = str2;
                    i22 = i7;
                    i26 = 0;
                    c7 = 55296;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldP3);
                    i27 = iObjectFieldOffset3;
                    i24 = i86;
                }
                i7 = i32;
                i33 = i79;
                int i892 = i84 + i84;
                obj = objArr2[i892];
                int i902 = i33;
                if (obj instanceof Field) {
                }
                int i912 = i8;
                objArr = objArr3;
                int iObjectFieldOffset32 = (int) unsafe.objectFieldOffset(fieldP2);
                int i922 = i892 + 1;
                obj2 = objArr2[i922];
                if (obj2 instanceof Field) {
                }
                i21 = i912;
                i23 = i902;
                str = str2;
                i22 = i7;
                i26 = 0;
                c7 = 55296;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldP3);
                i27 = iObjectFieldOffset32;
                i24 = i86;
            } else {
                int i93 = i8;
                objArr = objArr3;
                int i94 = i7 + 1;
                Field fieldP4 = p(cls, (String) objArr2[i7]);
                i21 = i93;
                if (i77 == 9 || i77 == 17) {
                    i22 = i94;
                    int i95 = i68 / 3;
                    objArr[i95 + i95 + 1] = fieldP4.getType();
                } else {
                    if (i77 == 27) {
                        i28 = i94;
                        i29 = 1;
                        i30 = i7 + 2;
                    } else if (i77 == 49) {
                        i30 = i7 + 2;
                        i28 = i94;
                        i29 = 1;
                    } else {
                        if (i77 == 12 || i77 == 30 || i77 == 44) {
                            i22 = i94;
                            if (d8Var.zzc() == 1 || i79 != 0) {
                                i30 = i7 + 2;
                                int i96 = i68 / 3;
                                objArr[i96 + i96 + 1] = objArr2[i22];
                                i22 = i30;
                            }
                        } else if (i77 == 50) {
                            int i97 = i7 + 2;
                            int i98 = i66 + 1;
                            iArr[i66] = i68;
                            int i99 = i68 / 3;
                            int i100 = i99 + i99;
                            objArr[i100] = objArr2[i94];
                            if (i79 != 0) {
                                objArr[i100 + 1] = objArr2[i97];
                                i23 = i79;
                                i66 = i98;
                                i22 = i7 + 3;
                                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldP4);
                                iObjectFieldOffset2 = 1048575;
                                if ((iCharAt9 & 4096) == 0 || i77 > 17) {
                                    str = str2;
                                    c7 = 55296;
                                    i24 = i20;
                                    i25 = 0;
                                } else {
                                    int i101 = i20 + 1;
                                    int iCharAt11 = str2.charAt(i20);
                                    if (iCharAt11 >= 55296) {
                                        int i102 = iCharAt11 & 8191;
                                        int i103 = 13;
                                        while (true) {
                                            i24 = i101 + 1;
                                            cCharAt7 = str2.charAt(i101);
                                            if (cCharAt7 < 55296) {
                                                break;
                                            }
                                            i102 |= (cCharAt7 & 8191) << i103;
                                            i103 += 13;
                                            i101 = i24;
                                        }
                                        iCharAt11 = i102 | (cCharAt7 << i103);
                                    } else {
                                        i24 = i101;
                                    }
                                    int i104 = (iCharAt11 / 32) + i21 + i21;
                                    Object obj3 = objArr2[i104];
                                    if (obj3 instanceof Field) {
                                        fieldP = (Field) obj3;
                                    } else {
                                        fieldP = p(cls, (String) obj3);
                                        objArr2[i104] = fieldP;
                                    }
                                    str = str2;
                                    i25 = iCharAt11 % 32;
                                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldP);
                                    c7 = 55296;
                                }
                                if (i77 >= 18 && i77 <= 49) {
                                    iArr[i64] = iObjectFieldOffset;
                                    i64++;
                                }
                                i26 = i25;
                                i27 = iObjectFieldOffset;
                            } else {
                                i66 = i98;
                                i22 = i97;
                            }
                        } else {
                            i22 = i94;
                        }
                        i23 = 0;
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldP4);
                        iObjectFieldOffset2 = 1048575;
                        if ((iCharAt9 & 4096) == 0) {
                            str = str2;
                            c7 = 55296;
                            i24 = i20;
                            i25 = 0;
                            if (i77 >= 18) {
                                iArr[i64] = iObjectFieldOffset;
                                i64++;
                            }
                            i26 = i25;
                            i27 = iObjectFieldOffset;
                        }
                    }
                    int i105 = i68 / 3;
                    objArr[i105 + i105 + i29] = objArr2[i28];
                    i22 = i30;
                }
                i23 = i79;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldP4);
                iObjectFieldOffset2 = 1048575;
                if ((iCharAt9 & 4096) == 0) {
                }
            }
            int i106 = i68 + 1;
            iArr2[i68] = i78;
            int i107 = i68 + 2;
            int i108 = i26;
            iArr2[i106] = ((iCharAt9 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? 536870912 : 0) | ((iCharAt9 & 256) != 0 ? 268435456 : 0) | (i23 != 0 ? Integer.MIN_VALUE : 0) | (i77 << 20) | i27;
            i68 += 3;
            iArr2[i107] = (i108 << 20) | iObjectFieldOffset2;
            str2 = str;
            i40 = i24;
            length = i19;
            i8 = i21;
            i7 = i22;
            c8 = c7;
            objArr3 = objArr;
        }
        return new y7(iArr2, objArr3, d8Var.f11683a, iArr, i9, p1Var, p6Var);
    }

    public static int k(long j6, Object obj) {
        return ((Integer) s8.h(j6, obj)).intValue();
    }

    public static int l(int i6) {
        return (i6 >>> 20) & 255;
    }

    public static long n(long j6, Object obj) {
        return ((Long) s8.h(j6, obj)).longValue();
    }

    public static Field p(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e6) {
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
            throw new RuntimeException(sbA.toString(), e6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    @Override // com.google.android.gms.internal.consent_sdk.e8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        if (!h(obj)) {
            return;
        }
        if (obj instanceof z6) {
            z6 z6Var = (z6) obj;
            z6Var.d();
            z6Var.zza = 0;
            z6Var.k();
        }
        int i6 = 0;
        while (true) {
            int[] iArr = this.f11946a;
            if (i6 >= iArr.length) {
                this.f11952g.getClass();
                n8 n8Var = ((z6) obj).zzc;
                if (n8Var.f11851d) {
                    n8Var.f11851d = false;
                }
                if (this.f11949d) {
                    ((p6) this.h).getClass();
                    ((x6) obj).zzb.c();
                    return;
                }
                return;
            }
            int iM = m(i6);
            int i7 = 1048575 & iM;
            int iL = l(iM);
            long j6 = i7;
            if (iL != 9) {
                if (iL != 60 && iL != 68) {
                    switch (iL) {
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
                            ((d7) s8.h(j6, obj)).zzb();
                            break;
                        case 50:
                            Unsafe unsafe = f11945j;
                            Object object = unsafe.getObject(obj, j6);
                            if (object == null) {
                                break;
                            } else {
                                ((q7) object).s = false;
                                unsafe.putObject(obj, j6, object);
                                break;
                            }
                    }
                } else if (i(iArr[i6], i6, obj)) {
                    o(i6).a(f11945j.getObject(obj, j6));
                }
            } else if (u(i6, obj)) {
                o(i6).a(f11945j.getObject(obj, j6));
            }
            i6 += 3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00db A[PHI: r1
      0x00db: PHI (r1v36 int) = (r1v12 int), (r1v37 int) binds: [B:85:0x01ea, B:43:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.consent_sdk.e8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(z6 z6Var) {
        int i6;
        long jDoubleToLongBits;
        int i7;
        int iFloatToIntBits;
        int i8;
        int i9;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int[] iArr = this.f11946a;
            if (i10 >= iArr.length) {
                z6Var.zzc.getClass();
                int i12 = (i11 * 53) + 506991;
                if (!this.f11949d) {
                    return i12;
                }
                return ((x6) z6Var).zzb.f11884a.hashCode() + (i12 * 53);
            }
            int iM = m(i10);
            int i13 = 1048575 & iM;
            int iL = l(iM);
            int i14 = iArr[i10];
            long j6 = i13;
            int i15 = 1237;
            int iHashCode = 37;
            switch (iL) {
                case 0:
                    i6 = i11 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(s8.f11890c.a(j6, z6Var));
                    Charset charset = e7.f11716a;
                    i11 = i6 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 1:
                    i7 = i11 * 53;
                    iFloatToIntBits = Float.floatToIntBits(s8.f11890c.b(j6, z6Var));
                    i11 = iFloatToIntBits + i7;
                    break;
                case 2:
                    i6 = i11 * 53;
                    jDoubleToLongBits = s8.f(j6, z6Var);
                    Charset charset2 = e7.f11716a;
                    i11 = i6 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 3:
                    i6 = i11 * 53;
                    jDoubleToLongBits = s8.f(j6, z6Var);
                    Charset charset3 = e7.f11716a;
                    i11 = i6 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 4:
                    i7 = i11 * 53;
                    iFloatToIntBits = s8.e(j6, z6Var);
                    i11 = iFloatToIntBits + i7;
                    break;
                case 5:
                    i6 = i11 * 53;
                    jDoubleToLongBits = s8.f(j6, z6Var);
                    Charset charset4 = e7.f11716a;
                    i11 = i6 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 6:
                    i7 = i11 * 53;
                    iFloatToIntBits = s8.e(j6, z6Var);
                    i11 = iFloatToIntBits + i7;
                    break;
                case 7:
                    i8 = i11 * 53;
                    boolean zG = s8.f11890c.g(j6, z6Var);
                    Charset charset5 = e7.f11716a;
                    if (zG) {
                        i15 = 1231;
                    }
                    i11 = i15 + i8;
                    break;
                case 8:
                    i7 = i11 * 53;
                    iFloatToIntBits = ((String) s8.h(j6, z6Var)).hashCode();
                    i11 = iFloatToIntBits + i7;
                    break;
                case 9:
                    i9 = i11 * 53;
                    Object objH = s8.h(j6, z6Var);
                    if (objH != null) {
                        iHashCode = objH.hashCode();
                    }
                    i11 = i9 + iHashCode;
                    break;
                case 10:
                    i7 = i11 * 53;
                    iFloatToIntBits = s8.h(j6, z6Var).hashCode();
                    i11 = iFloatToIntBits + i7;
                    break;
                case 11:
                    i7 = i11 * 53;
                    iFloatToIntBits = s8.e(j6, z6Var);
                    i11 = iFloatToIntBits + i7;
                    break;
                case 12:
                    i7 = i11 * 53;
                    iFloatToIntBits = s8.e(j6, z6Var);
                    i11 = iFloatToIntBits + i7;
                    break;
                case 13:
                    i7 = i11 * 53;
                    iFloatToIntBits = s8.e(j6, z6Var);
                    i11 = iFloatToIntBits + i7;
                    break;
                case 14:
                    i6 = i11 * 53;
                    jDoubleToLongBits = s8.f(j6, z6Var);
                    Charset charset6 = e7.f11716a;
                    i11 = i6 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 15:
                    i7 = i11 * 53;
                    iFloatToIntBits = s8.e(j6, z6Var);
                    i11 = iFloatToIntBits + i7;
                    break;
                case 16:
                    i6 = i11 * 53;
                    jDoubleToLongBits = s8.f(j6, z6Var);
                    Charset charset7 = e7.f11716a;
                    i11 = i6 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 17:
                    i9 = i11 * 53;
                    Object objH2 = s8.h(j6, z6Var);
                    if (objH2 != null) {
                        iHashCode = objH2.hashCode();
                    }
                    i11 = i9 + iHashCode;
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
                    iFloatToIntBits = s8.h(j6, z6Var).hashCode();
                    i11 = iFloatToIntBits + i7;
                    break;
                case 50:
                    i7 = i11 * 53;
                    iFloatToIntBits = s8.h(j6, z6Var).hashCode();
                    i11 = iFloatToIntBits + i7;
                    break;
                case 51:
                    if (!i(i14, i10, z6Var)) {
                        break;
                    } else {
                        i6 = i11 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(((Double) s8.h(j6, z6Var)).doubleValue());
                        Charset charset8 = e7.f11716a;
                        i11 = i6 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                        break;
                    }
                case 52:
                    if (!i(i14, i10, z6Var)) {
                        break;
                    } else {
                        i7 = i11 * 53;
                        iFloatToIntBits = Float.floatToIntBits(((Float) s8.h(j6, z6Var)).floatValue());
                        i11 = iFloatToIntBits + i7;
                        break;
                    }
                case 53:
                    if (!i(i14, i10, z6Var)) {
                        break;
                    } else {
                        i6 = i11 * 53;
                        jDoubleToLongBits = n(j6, z6Var);
                        Charset charset9 = e7.f11716a;
                        i11 = i6 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                        break;
                    }
                case 54:
                    if (!i(i14, i10, z6Var)) {
                        break;
                    } else {
                        i6 = i11 * 53;
                        jDoubleToLongBits = n(j6, z6Var);
                        Charset charset10 = e7.f11716a;
                        i11 = i6 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                        break;
                    }
                case 55:
                    if (!i(i14, i10, z6Var)) {
                        break;
                    } else {
                        i7 = i11 * 53;
                        iFloatToIntBits = k(j6, z6Var);
                        i11 = iFloatToIntBits + i7;
                        break;
                    }
                case 56:
                    if (!i(i14, i10, z6Var)) {
                        break;
                    } else {
                        i6 = i11 * 53;
                        jDoubleToLongBits = n(j6, z6Var);
                        Charset charset11 = e7.f11716a;
                        i11 = i6 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                        break;
                    }
                case 57:
                    if (!i(i14, i10, z6Var)) {
                        break;
                    } else {
                        i7 = i11 * 53;
                        iFloatToIntBits = k(j6, z6Var);
                        i11 = iFloatToIntBits + i7;
                        break;
                    }
                case 58:
                    if (!i(i14, i10, z6Var)) {
                        break;
                    } else {
                        i8 = i11 * 53;
                        boolean zBooleanValue = ((Boolean) s8.h(j6, z6Var)).booleanValue();
                        Charset charset12 = e7.f11716a;
                        if (zBooleanValue) {
                        }
                        i11 = i15 + i8;
                        break;
                    }
                case 59:
                    if (!i(i14, i10, z6Var)) {
                        break;
                    } else {
                        i7 = i11 * 53;
                        iFloatToIntBits = ((String) s8.h(j6, z6Var)).hashCode();
                        i11 = iFloatToIntBits + i7;
                        break;
                    }
                case 60:
                    if (!i(i14, i10, z6Var)) {
                        break;
                    } else {
                        i7 = i11 * 53;
                        iFloatToIntBits = s8.h(j6, z6Var).hashCode();
                        i11 = iFloatToIntBits + i7;
                        break;
                    }
                case 61:
                    if (!i(i14, i10, z6Var)) {
                        break;
                    } else {
                        i7 = i11 * 53;
                        iFloatToIntBits = s8.h(j6, z6Var).hashCode();
                        i11 = iFloatToIntBits + i7;
                        break;
                    }
                case 62:
                    if (!i(i14, i10, z6Var)) {
                        break;
                    } else {
                        i7 = i11 * 53;
                        iFloatToIntBits = k(j6, z6Var);
                        i11 = iFloatToIntBits + i7;
                        break;
                    }
                case 63:
                    if (!i(i14, i10, z6Var)) {
                        break;
                    } else {
                        i7 = i11 * 53;
                        iFloatToIntBits = k(j6, z6Var);
                        i11 = iFloatToIntBits + i7;
                        break;
                    }
                case 64:
                    if (!i(i14, i10, z6Var)) {
                        break;
                    } else {
                        i7 = i11 * 53;
                        iFloatToIntBits = k(j6, z6Var);
                        i11 = iFloatToIntBits + i7;
                        break;
                    }
                case 65:
                    if (!i(i14, i10, z6Var)) {
                        break;
                    } else {
                        i6 = i11 * 53;
                        jDoubleToLongBits = n(j6, z6Var);
                        Charset charset13 = e7.f11716a;
                        i11 = i6 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                        break;
                    }
                case 66:
                    if (!i(i14, i10, z6Var)) {
                        break;
                    } else {
                        i7 = i11 * 53;
                        iFloatToIntBits = k(j6, z6Var);
                        i11 = iFloatToIntBits + i7;
                        break;
                    }
                case 67:
                    if (!i(i14, i10, z6Var)) {
                        break;
                    } else {
                        i6 = i11 * 53;
                        jDoubleToLongBits = n(j6, z6Var);
                        Charset charset14 = e7.f11716a;
                        i11 = i6 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                        break;
                    }
                case 68:
                    if (!i(i14, i10, z6Var)) {
                        break;
                    } else {
                        i7 = i11 * 53;
                        iFloatToIntBits = s8.h(j6, z6Var).hashCode();
                        i11 = iFloatToIntBits + i7;
                        break;
                    }
            }
            i10 += 3;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.e8
    public final boolean c(z6 z6Var, z6 z6Var2) {
        boolean zE;
        int i6 = 0;
        while (true) {
            int[] iArr = this.f11946a;
            if (i6 < iArr.length) {
                int iM = m(i6);
                long j6 = iM & 1048575;
                switch (l(iM)) {
                    case 0:
                        if (!t(z6Var, z6Var2, i6)) {
                            break;
                        } else {
                            r8 r8Var = s8.f11890c;
                            if (Double.doubleToLongBits(r8Var.a(j6, z6Var)) != Double.doubleToLongBits(r8Var.a(j6, z6Var2))) {
                                break;
                            } else {
                                continue;
                                i6 += 3;
                            }
                        }
                    case 1:
                        if (!t(z6Var, z6Var2, i6)) {
                            break;
                        } else {
                            r8 r8Var2 = s8.f11890c;
                            if (Float.floatToIntBits(r8Var2.b(j6, z6Var)) != Float.floatToIntBits(r8Var2.b(j6, z6Var2))) {
                                break;
                            } else {
                                continue;
                                i6 += 3;
                            }
                        }
                    case 2:
                        if (!t(z6Var, z6Var2, i6) || s8.f(j6, z6Var) != s8.f(j6, z6Var2)) {
                            break;
                        } else {
                            continue;
                            i6 += 3;
                        }
                        break;
                    case 3:
                        if (!t(z6Var, z6Var2, i6) || s8.f(j6, z6Var) != s8.f(j6, z6Var2)) {
                            break;
                        } else {
                            continue;
                            i6 += 3;
                        }
                        break;
                    case 4:
                        if (!t(z6Var, z6Var2, i6) || s8.e(j6, z6Var) != s8.e(j6, z6Var2)) {
                            break;
                        } else {
                            continue;
                            i6 += 3;
                        }
                        break;
                    case 5:
                        if (!t(z6Var, z6Var2, i6) || s8.f(j6, z6Var) != s8.f(j6, z6Var2)) {
                            break;
                        } else {
                            continue;
                            i6 += 3;
                        }
                        break;
                    case 6:
                        if (!t(z6Var, z6Var2, i6) || s8.e(j6, z6Var) != s8.e(j6, z6Var2)) {
                            break;
                        } else {
                            continue;
                            i6 += 3;
                        }
                        break;
                    case 7:
                        if (!t(z6Var, z6Var2, i6)) {
                            break;
                        } else {
                            r8 r8Var3 = s8.f11890c;
                            if (r8Var3.g(j6, z6Var) != r8Var3.g(j6, z6Var2)) {
                                break;
                            } else {
                                continue;
                                i6 += 3;
                            }
                        }
                    case 8:
                        if (!t(z6Var, z6Var2, i6) || !f8.e(s8.h(j6, z6Var), s8.h(j6, z6Var2))) {
                            break;
                        } else {
                            continue;
                            i6 += 3;
                        }
                        break;
                    case 9:
                        if (!t(z6Var, z6Var2, i6) || !f8.e(s8.h(j6, z6Var), s8.h(j6, z6Var2))) {
                            break;
                        } else {
                            continue;
                            i6 += 3;
                        }
                        break;
                    case 10:
                        if (!t(z6Var, z6Var2, i6) || !f8.e(s8.h(j6, z6Var), s8.h(j6, z6Var2))) {
                            break;
                        } else {
                            continue;
                            i6 += 3;
                        }
                        break;
                    case 11:
                        if (!t(z6Var, z6Var2, i6) || s8.e(j6, z6Var) != s8.e(j6, z6Var2)) {
                            break;
                        } else {
                            continue;
                            i6 += 3;
                        }
                        break;
                    case 12:
                        if (!t(z6Var, z6Var2, i6) || s8.e(j6, z6Var) != s8.e(j6, z6Var2)) {
                            break;
                        } else {
                            continue;
                            i6 += 3;
                        }
                        break;
                    case 13:
                        if (!t(z6Var, z6Var2, i6) || s8.e(j6, z6Var) != s8.e(j6, z6Var2)) {
                            break;
                        } else {
                            continue;
                            i6 += 3;
                        }
                        break;
                    case 14:
                        if (!t(z6Var, z6Var2, i6) || s8.f(j6, z6Var) != s8.f(j6, z6Var2)) {
                            break;
                        } else {
                            continue;
                            i6 += 3;
                        }
                        break;
                    case 15:
                        if (!t(z6Var, z6Var2, i6) || s8.e(j6, z6Var) != s8.e(j6, z6Var2)) {
                            break;
                        } else {
                            continue;
                            i6 += 3;
                        }
                        break;
                    case 16:
                        if (!t(z6Var, z6Var2, i6) || s8.f(j6, z6Var) != s8.f(j6, z6Var2)) {
                            break;
                        } else {
                            continue;
                            i6 += 3;
                        }
                        break;
                    case 17:
                        if (!t(z6Var, z6Var2, i6) || !f8.e(s8.h(j6, z6Var), s8.h(j6, z6Var2))) {
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
                        zE = f8.e(s8.h(j6, z6Var), s8.h(j6, z6Var2));
                        break;
                    case 50:
                        zE = f8.e(s8.h(j6, z6Var), s8.h(j6, z6Var2));
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
                        if (s8.e(j7, z6Var) != s8.e(j7, z6Var2) || !f8.e(s8.h(j6, z6Var), s8.h(j6, z6Var2))) {
                            break;
                        } else {
                            continue;
                            i6 += 3;
                        }
                        break;
                    default:
                        i6 += 3;
                }
                if (zE) {
                    i6 += 3;
                }
            } else if (z6Var.zzc.equals(z6Var2.zzc)) {
                if (this.f11949d) {
                    return ((x6) z6Var).zzb.equals(((x6) z6Var2).zzb);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // com.google.android.gms.internal.consent_sdk.e8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(Object obj, Object obj2) {
        Object obj3;
        if (!h(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
        obj2.getClass();
        int i6 = 0;
        while (true) {
            int[] iArr = this.f11946a;
            if (i6 >= iArr.length) {
                Object obj4 = obj;
                f8.p(obj4, obj2);
                if (!this.f11949d || ((x6) obj2).zzb.f11884a.isEmpty()) {
                    return;
                }
                throw null;
            }
            int iM = m(i6);
            int i7 = iM & 1048575;
            int iL = l(iM);
            int i8 = iArr[i6];
            long j6 = i7;
            switch (iL) {
                case 0:
                    if (!u(i6, obj2)) {
                        obj3 = obj;
                        break;
                    } else {
                        r8 r8Var = s8.f11890c;
                        obj3 = obj;
                        r8Var.e(obj3, j6, r8Var.a(j6, obj2));
                        s(i6, obj3);
                        break;
                    }
                case 1:
                    if (u(i6, obj2)) {
                        r8 r8Var2 = s8.f11890c;
                        r8Var2.f(obj, j6, r8Var2.b(j6, obj2));
                        s(i6, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (u(i6, obj2)) {
                        s8.l(obj, j6, s8.f(j6, obj2));
                        s(i6, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (u(i6, obj2)) {
                        s8.l(obj, j6, s8.f(j6, obj2));
                        s(i6, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (u(i6, obj2)) {
                        s8.k(obj, j6, s8.e(j6, obj2));
                        s(i6, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (u(i6, obj2)) {
                        s8.l(obj, j6, s8.f(j6, obj2));
                        s(i6, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (u(i6, obj2)) {
                        s8.k(obj, j6, s8.e(j6, obj2));
                        s(i6, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (u(i6, obj2)) {
                        r8 r8Var3 = s8.f11890c;
                        r8Var3.c(obj, j6, r8Var3.g(j6, obj2));
                        s(i6, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (u(i6, obj2)) {
                        s8.m(obj, j6, s8.h(j6, obj2));
                        s(i6, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    q(i6, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (u(i6, obj2)) {
                        s8.m(obj, j6, s8.h(j6, obj2));
                        s(i6, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (u(i6, obj2)) {
                        s8.k(obj, j6, s8.e(j6, obj2));
                        s(i6, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (u(i6, obj2)) {
                        s8.k(obj, j6, s8.e(j6, obj2));
                        s(i6, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (u(i6, obj2)) {
                        s8.k(obj, j6, s8.e(j6, obj2));
                        s(i6, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (u(i6, obj2)) {
                        s8.l(obj, j6, s8.f(j6, obj2));
                        s(i6, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (u(i6, obj2)) {
                        s8.k(obj, j6, s8.e(j6, obj2));
                        s(i6, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (u(i6, obj2)) {
                        s8.l(obj, j6, s8.f(j6, obj2));
                        s(i6, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    q(i6, obj, obj2);
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
                    d7 d7VarA = (d7) s8.h(j6, obj);
                    d7 d7Var = (d7) s8.h(j6, obj2);
                    int size = d7VarA.size();
                    int size2 = d7Var.size();
                    if (size > 0 && size2 > 0) {
                        if (!d7VarA.zzc()) {
                            d7VarA = d7VarA.a(size2 + size);
                        }
                        d7VarA.addAll(d7Var);
                    }
                    if (size > 0) {
                        d7Var = d7VarA;
                    }
                    s8.m(obj, j6, d7Var);
                    obj3 = obj;
                    break;
                case 50:
                    p1 p1Var = f8.f11738a;
                    q7 q7Var = (q7) s8.h(j6, obj);
                    q7 q7Var2 = (q7) s8.h(j6, obj2);
                    if (!q7Var2.isEmpty()) {
                        if (!q7Var.s) {
                            if (q7Var.isEmpty()) {
                                q7Var = new q7();
                            } else {
                                q7 q7Var3 = new q7(q7Var);
                                q7Var3.s = true;
                                q7Var = q7Var3;
                            }
                        }
                        q7Var.b();
                        if (!q7Var2.isEmpty()) {
                            q7Var.putAll(q7Var2);
                        }
                    }
                    s8.m(obj, j6, q7Var);
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
                    if (i(i8, i6, obj2)) {
                        s8.m(obj, j6, s8.h(j6, obj2));
                        s8.k(obj, iArr[i6 + 2] & 1048575, i8);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    r(i6, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (i(i8, i6, obj2)) {
                        s8.m(obj, j6, s8.h(j6, obj2));
                        s8.k(obj, iArr[i6 + 2] & 1048575, i8);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    r(i6, obj, obj2);
                    obj3 = obj;
                    break;
            }
            i6 += 3;
            obj = obj3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0247  */
    @Override // com.google.android.gms.internal.consent_sdk.e8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(z6 z6Var) {
        int i6;
        int iC;
        int iD;
        int iC2;
        int iE;
        int iC3;
        int iK;
        int size;
        int iO;
        int iC4;
        int iC5;
        int iB;
        int iC6;
        int iC7;
        int size2;
        int iC8;
        int iC9;
        int iD2;
        int iC10;
        int iE2;
        int iC11;
        y7<T> y7Var = this;
        z6 z6Var2 = z6Var;
        Unsafe unsafe = f11945j;
        int i7 = 1048575;
        int i8 = 1048575;
        int i9 = 0;
        int i10 = 0;
        int iC12 = 0;
        while (true) {
            int[] iArr = y7Var.f11946a;
            if (i9 >= iArr.length) {
                n8 n8Var = z6Var2.zzc;
                int i11 = n8Var.f11850c;
                if (i11 == -1) {
                    n8Var.f11850c = 0;
                    i11 = 0;
                }
                int i12 = i11 + iC12;
                if (y7Var.f11949d) {
                    g8 g8Var = ((x6) z6Var2).zzb.f11884a;
                    if (g8Var.f11802t > 0) {
                        ((r6) g8Var.d(0).s).zzb();
                        throw null;
                    }
                    Iterator<T> it = g8Var.b().iterator();
                    if (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        r6 r6Var = (r6) entry.getKey();
                        entry.getValue();
                        r6Var.zzb();
                        throw null;
                    }
                }
                return i12;
            }
            int iM = y7Var.m(i9);
            int iL = l(iM);
            int i13 = iArr[i9];
            int i14 = iArr[i9 + 2];
            int i15 = i14 & i7;
            if (iL <= 17) {
                if (i15 != i8) {
                    i10 = i15 == i7 ? 0 : unsafe.getInt(z6Var2, i15);
                    i8 = i15;
                }
                i6 = 1 << (i14 >>> 20);
            } else {
                i6 = 0;
            }
            int i16 = iM & i7;
            if (iL >= t6.f11904t.s) {
                t6.f11905u.getClass();
            }
            long j6 = i16;
            switch (iL) {
                case 0:
                    if (y7Var.v(z6Var2, i9, i8, i10, i6)) {
                        iC12 = androidx.camera.core.t.c(i13 << 3, 8, iC12);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (y7Var.v(z6Var2, i9, i8, i10, i6)) {
                        iC12 = androidx.camera.core.t.c(i13 << 3, 4, iC12);
                    }
                    y7Var = this;
                    z6Var2 = z6Var;
                    break;
                case 2:
                    if (y7Var.v(z6Var2, i9, i8, i10, i6)) {
                        long j7 = unsafe.getLong(z6Var2, j6);
                        iC = k6.c(i13 << 3);
                        iD = k6.d(j7);
                        iC12 += iD + iC;
                    }
                    y7Var = this;
                    break;
                case 3:
                    if (y7Var.v(z6Var2, i9, i8, i10, i6)) {
                        long j8 = unsafe.getLong(z6Var2, j6);
                        iC = k6.c(i13 << 3);
                        iD = k6.d(j8);
                        iC12 += iD + iC;
                    }
                    y7Var = this;
                    break;
                case 4:
                    if (y7Var.v(z6Var2, i9, i8, i10, i6)) {
                        long j9 = unsafe.getInt(z6Var2, j6);
                        iC = k6.c(i13 << 3);
                        iD = k6.d(j9);
                        iC12 += iD + iC;
                    }
                    y7Var = this;
                    break;
                case 5:
                    if (y7Var.v(z6Var2, i9, i8, i10, i6)) {
                        iC12 = androidx.camera.core.t.c(i13 << 3, 8, iC12);
                    }
                    y7Var = this;
                    z6Var2 = z6Var;
                    break;
                case 6:
                    if (y7Var.v(z6Var2, i9, i8, i10, i6)) {
                        iC12 = androidx.camera.core.t.c(i13 << 3, 4, iC12);
                    }
                    y7Var = this;
                    z6Var2 = z6Var;
                    break;
                case 7:
                    if (y7Var.v(z6Var2, i9, i8, i10, i6)) {
                        iC12 = androidx.camera.core.t.c(i13 << 3, 1, iC12);
                    }
                    y7Var = this;
                    z6Var2 = z6Var;
                    break;
                case 8:
                    if (y7Var.v(z6Var2, i9, i8, i10, i6)) {
                        int i17 = i13 << 3;
                        Object object = unsafe.getObject(z6Var2, j6);
                        if (object instanceof h6) {
                            iC2 = k6.c(i17);
                            iE = ((h6) object).e();
                            iC3 = k6.c(iE);
                            iC12 += iC3 + iE + iC2;
                        } else {
                            iC = k6.c(i17);
                            iD = k6.b((String) object);
                            iC12 += iD + iC;
                        }
                    }
                    y7Var = this;
                    break;
                case 9:
                    if (y7Var.v(z6Var2, i9, i8, i10, i6)) {
                        iK = f8.k(i13, unsafe.getObject(z6Var2, j6), y7Var.o(i9));
                        iC12 += iK;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (y7Var.v(z6Var2, i9, i8, i10, i6)) {
                        h6 h6Var = (h6) unsafe.getObject(z6Var2, j6);
                        iC2 = k6.c(i13 << 3);
                        iE = h6Var.e();
                        iC3 = k6.c(iE);
                        iC12 += iC3 + iE + iC2;
                    }
                    y7Var = this;
                    break;
                case 11:
                    if (y7Var.v(z6Var2, i9, i8, i10, i6)) {
                        iC12 = androidx.camera.core.t.c(unsafe.getInt(z6Var2, j6), k6.c(i13 << 3), iC12);
                    }
                    y7Var = this;
                    break;
                case 12:
                    if (y7Var.v(z6Var2, i9, i8, i10, i6)) {
                        long j10 = unsafe.getInt(z6Var2, j6);
                        iC = k6.c(i13 << 3);
                        iD = k6.d(j10);
                        iC12 += iD + iC;
                    }
                    y7Var = this;
                    break;
                case 13:
                    if (y7Var.v(z6Var2, i9, i8, i10, i6)) {
                        iC12 = androidx.camera.core.t.c(i13 << 3, 4, iC12);
                    }
                    y7Var = this;
                    z6Var2 = z6Var;
                    break;
                case 14:
                    if (y7Var.v(z6Var2, i9, i8, i10, i6)) {
                        iC12 = androidx.camera.core.t.c(i13 << 3, 8, iC12);
                    }
                    y7Var = this;
                    z6Var2 = z6Var;
                    break;
                case 15:
                    if (y7Var.v(z6Var2, i9, i8, i10, i6)) {
                        int i18 = unsafe.getInt(z6Var2, j6);
                        iC12 = androidx.camera.core.t.c((i18 >> 31) ^ (i18 + i18), k6.c(i13 << 3), iC12);
                    }
                    y7Var = this;
                    break;
                case 16:
                    if (y7Var.v(z6Var2, i9, i8, i10, i6)) {
                        long j11 = unsafe.getLong(z6Var2, j6);
                        iC = k6.c(i13 << 3);
                        iD = k6.d((j11 >> 63) ^ (j11 + j11));
                        iC12 += iD + iC;
                    }
                    y7Var = this;
                    break;
                case 17:
                    if (y7Var.v(z6Var2, i9, i8, i10, i6)) {
                        v7 v7Var = (v7) unsafe.getObject(z6Var2, j6);
                        e8 e8VarO = y7Var.o(i9);
                        p1 p1Var = f8.f11738a;
                        int iC13 = k6.c(i13 << 3);
                        iK = ((y5) v7Var).c(e8VarO) + iC13 + iC13;
                        iC12 += iK;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    iK = f8.h(i13, (List) unsafe.getObject(z6Var2, j6));
                    iC12 += iK;
                    break;
                case 19:
                    iK = f8.g(i13, (List) unsafe.getObject(z6Var2, j6));
                    iC12 += iK;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(z6Var2, j6);
                    p1 p1Var2 = f8.f11738a;
                    iC5 = list.size() == 0 ? 0 : (k6.c(i13 << 3) * list.size()) + f8.j(list);
                    iC12 += iC5;
                    break;
                case dn.zzm /* 21 */:
                    List list2 = (List) unsafe.getObject(z6Var2, j6);
                    p1 p1Var3 = f8.f11738a;
                    size = list2.size();
                    if (size != 0) {
                        iO = f8.o(list2);
                        iC4 = k6.c(i13 << 3);
                        iC5 = iO + (iC4 * size);
                        iC12 += iC5;
                        break;
                    }
                    iC12 += iC5;
                case 22:
                    List list3 = (List) unsafe.getObject(z6Var2, j6);
                    p1 p1Var4 = f8.f11738a;
                    size = list3.size();
                    if (size != 0) {
                        iO = f8.i(list3);
                        iC4 = k6.c(i13 << 3);
                        iC5 = iO + (iC4 * size);
                        iC12 += iC5;
                        break;
                    }
                    iC12 += iC5;
                case 23:
                    iK = f8.h(i13, (List) unsafe.getObject(z6Var2, j6));
                    iC12 += iK;
                    break;
                case 24:
                    iK = f8.g(i13, (List) unsafe.getObject(z6Var2, j6));
                    iC12 += iK;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(z6Var2, j6);
                    p1 p1Var5 = f8.f11738a;
                    int size3 = list4.size();
                    if (size3 != 0) {
                        iC5 = size3 * (k6.c(i13 << 3) + 1);
                    }
                    iC12 += iC5;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(z6Var2, j6);
                    p1 p1Var6 = f8.f11738a;
                    int size4 = list5.size();
                    if (size4 == 0) {
                        iB = 0;
                    } else {
                        int iC14 = k6.c(i13 << 3) * size4;
                        if (list5 instanceof k7) {
                            k7 k7Var = (k7) list5;
                            iB = iC14;
                            for (int i19 = 0; i19 < size4; i19++) {
                                Object objZza = k7Var.zza();
                                if (objZza instanceof h6) {
                                    int iE3 = ((h6) objZza).e();
                                    iB = androidx.camera.core.t.c(iE3, iE3, iB);
                                } else {
                                    iB = k6.b((String) objZza) + iB;
                                }
                            }
                        } else {
                            iB = iC14;
                            for (int i20 = 0; i20 < size4; i20++) {
                                Object obj = list5.get(i20);
                                if (obj instanceof h6) {
                                    int iE4 = ((h6) obj).e();
                                    iB = androidx.camera.core.t.c(iE4, iE4, iB);
                                } else {
                                    iB = k6.b((String) obj) + iB;
                                }
                            }
                        }
                    }
                    iC12 += iB;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(z6Var2, j6);
                    e8 e8VarO2 = y7Var.o(i9);
                    p1 p1Var7 = f8.f11738a;
                    int size5 = list6.size();
                    if (size5 == 0) {
                        iC6 = 0;
                    } else {
                        iC6 = k6.c(i13 << 3) * size5;
                        for (int i21 = 0; i21 < size5; i21++) {
                            Object obj2 = list6.get(i21);
                            if (obj2 instanceof i7) {
                                int iA = ((i7) obj2).a();
                                iC6 = androidx.camera.core.t.c(iA, iA, iC6);
                            } else {
                                int iC15 = ((y5) obj2).c(e8VarO2);
                                iC6 = androidx.camera.core.t.c(iC15, iC15, iC6);
                            }
                        }
                    }
                    iC12 += iC6;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(z6Var2, j6);
                    p1 p1Var8 = f8.f11738a;
                    int size6 = list7.size();
                    if (size6 == 0) {
                        iC7 = 0;
                    } else {
                        iC7 = k6.c(i13 << 3) * size6;
                        for (int i22 = 0; i22 < list7.size(); i22++) {
                            int iE5 = ((h6) list7.get(i22)).e();
                            iC7 = androidx.camera.core.t.c(iE5, iE5, iC7);
                        }
                    }
                    iC12 += iC7;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(z6Var2, j6);
                    p1 p1Var9 = f8.f11738a;
                    size = list8.size();
                    if (size != 0) {
                        iO = f8.n(list8);
                        iC4 = k6.c(i13 << 3);
                        iC5 = iO + (iC4 * size);
                        iC12 += iC5;
                        break;
                    }
                    iC12 += iC5;
                case 30:
                    List list9 = (List) unsafe.getObject(z6Var2, j6);
                    p1 p1Var10 = f8.f11738a;
                    size = list9.size();
                    if (size != 0) {
                        iO = f8.f(list9);
                        iC4 = k6.c(i13 << 3);
                        iC5 = iO + (iC4 * size);
                        iC12 += iC5;
                        break;
                    }
                    iC12 += iC5;
                case 31:
                    iK = f8.g(i13, (List) unsafe.getObject(z6Var2, j6));
                    iC12 += iK;
                    break;
                case 32:
                    iK = f8.h(i13, (List) unsafe.getObject(z6Var2, j6));
                    iC12 += iK;
                    break;
                case ImageFormatConstants.INTERNAL_DEFINED_IMAGE_FORMAT_JPEG /* 33 */:
                    List list10 = (List) unsafe.getObject(z6Var2, j6);
                    p1 p1Var11 = f8.f11738a;
                    size = list10.size();
                    if (size != 0) {
                        iO = f8.l(list10);
                        iC4 = k6.c(i13 << 3);
                        iC5 = iO + (iC4 * size);
                        iC12 += iC5;
                        break;
                    }
                    iC12 += iC5;
                case ImageFormatConstants.INTERNAL_DEFINED_IMAGE_FORMAT_PRIVATE /* 34 */:
                    List list11 = (List) unsafe.getObject(z6Var2, j6);
                    p1 p1Var12 = f8.f11738a;
                    size = list11.size();
                    if (size != 0) {
                        iO = f8.m(list11);
                        iC4 = k6.c(i13 << 3);
                        iC5 = iO + (iC4 * size);
                        iC12 += iC5;
                        break;
                    }
                    iC12 += iC5;
                case 35:
                    List list12 = (List) unsafe.getObject(z6Var2, j6);
                    p1 p1Var13 = f8.f11738a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        iC8 = k6.c(i13 << 3);
                        iC9 = k6.c(size2);
                        iD2 = iC9 + iC8;
                        iC12 += iD2 + size2;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    List list13 = (List) unsafe.getObject(z6Var2, j6);
                    p1 p1Var14 = f8.f11738a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        iC8 = k6.c(i13 << 3);
                        iC9 = k6.c(size2);
                        iD2 = iC9 + iC8;
                        iC12 += iD2 + size2;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    size2 = f8.j((List) unsafe.getObject(z6Var2, j6));
                    if (size2 > 0) {
                        iC8 = k6.c(i13 << 3);
                        iC9 = k6.c(size2);
                        iD2 = iC9 + iC8;
                        iC12 += iD2 + size2;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    size2 = f8.o((List) unsafe.getObject(z6Var2, j6));
                    if (size2 > 0) {
                        iC8 = k6.c(i13 << 3);
                        iC9 = k6.c(size2);
                        iD2 = iC9 + iC8;
                        iC12 += iD2 + size2;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    size2 = f8.i((List) unsafe.getObject(z6Var2, j6));
                    if (size2 > 0) {
                        iC8 = k6.c(i13 << 3);
                        iC9 = k6.c(size2);
                        iD2 = iC9 + iC8;
                        iC12 += iD2 + size2;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    List list14 = (List) unsafe.getObject(z6Var2, j6);
                    p1 p1Var15 = f8.f11738a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        iC8 = k6.c(i13 << 3);
                        iC9 = k6.c(size2);
                        iD2 = iC9 + iC8;
                        iC12 += iD2 + size2;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    List list15 = (List) unsafe.getObject(z6Var2, j6);
                    p1 p1Var16 = f8.f11738a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        iC8 = k6.c(i13 << 3);
                        iC9 = k6.c(size2);
                        iD2 = iC9 + iC8;
                        iC12 += iD2 + size2;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list16 = (List) unsafe.getObject(z6Var2, j6);
                    p1 p1Var17 = f8.f11738a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        iC8 = k6.c(i13 << 3);
                        iC9 = k6.c(size2);
                        iD2 = iC9 + iC8;
                        iC12 += iD2 + size2;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    size2 = f8.n((List) unsafe.getObject(z6Var2, j6));
                    if (size2 > 0) {
                        iC8 = k6.c(i13 << 3);
                        iC9 = k6.c(size2);
                        iD2 = iC9 + iC8;
                        iC12 += iD2 + size2;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    size2 = f8.f((List) unsafe.getObject(z6Var2, j6));
                    if (size2 > 0) {
                        iC8 = k6.c(i13 << 3);
                        iC9 = k6.c(size2);
                        iD2 = iC9 + iC8;
                        iC12 += iD2 + size2;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    List list17 = (List) unsafe.getObject(z6Var2, j6);
                    p1 p1Var18 = f8.f11738a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        iC8 = k6.c(i13 << 3);
                        iC9 = k6.c(size2);
                        iD2 = iC9 + iC8;
                        iC12 += iD2 + size2;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    List list18 = (List) unsafe.getObject(z6Var2, j6);
                    p1 p1Var19 = f8.f11738a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        iC8 = k6.c(i13 << 3);
                        iC9 = k6.c(size2);
                        iD2 = iC9 + iC8;
                        iC12 += iD2 + size2;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    size2 = f8.l((List) unsafe.getObject(z6Var2, j6));
                    if (size2 > 0) {
                        iC8 = k6.c(i13 << 3);
                        iC9 = k6.c(size2);
                        iD2 = iC9 + iC8;
                        iC12 += iD2 + size2;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    size2 = f8.m((List) unsafe.getObject(z6Var2, j6));
                    if (size2 > 0) {
                        iC8 = k6.c(i13 << 3);
                        iC9 = k6.c(size2);
                        iD2 = iC9 + iC8;
                        iC12 += iD2 + size2;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    List list19 = (List) unsafe.getObject(z6Var2, j6);
                    e8 e8VarO3 = y7Var.o(i9);
                    p1 p1Var20 = f8.f11738a;
                    int size7 = list19.size();
                    if (size7 != 0) {
                        iC6 = 0;
                        for (int i23 = 0; i23 < size7; i23++) {
                            v7 v7Var2 = (v7) list19.get(i23);
                            int iC16 = k6.c(i13 << 3);
                            iC6 += ((y5) v7Var2).c(e8VarO3) + iC16 + iC16;
                        }
                    }
                    iC12 += iC6;
                    break;
                case 50:
                    int i24 = i9 / 3;
                    q7 q7Var = (q7) unsafe.getObject(z6Var2, j6);
                    p7 p7Var = (p7) y7Var.f11947b[i24 + i24];
                    if (!q7Var.isEmpty()) {
                        iB = 0;
                        for (Map.Entry entry2 : q7Var.entrySet()) {
                            Object key = entry2.getKey();
                            Object value = entry2.getValue();
                            com.google.android.gms.ads.mediation.customevent.a aVar = p7Var.f11869a;
                            int iC17 = k6.c(i13 << 3);
                            int iA2 = s6.a((v8) aVar.f2373u, 2, value) + s6.a((v8) aVar.f2372t, 1, key);
                            iB += k6.c(iA2) + iA2 + iC17;
                        }
                    }
                    iC12 += iB;
                    break;
                case 51:
                    if (y7Var.i(i13, i9, z6Var2)) {
                        iC12 = androidx.camera.core.t.c(i13 << 3, 8, iC12);
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (y7Var.i(i13, i9, z6Var2)) {
                        iC12 = androidx.camera.core.t.c(i13 << 3, 4, iC12);
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (y7Var.i(i13, i9, z6Var2)) {
                        long jN = n(j6, z6Var2);
                        size2 = k6.c(i13 << 3);
                        iD2 = k6.d(jN);
                        iC12 += iD2 + size2;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (y7Var.i(i13, i9, z6Var2)) {
                        long jN2 = n(j6, z6Var2);
                        size2 = k6.c(i13 << 3);
                        iD2 = k6.d(jN2);
                        iC12 += iD2 + size2;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (y7Var.i(i13, i9, z6Var2)) {
                        long jK = k(j6, z6Var2);
                        size2 = k6.c(i13 << 3);
                        iD2 = k6.d(jK);
                        iC12 += iD2 + size2;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (y7Var.i(i13, i9, z6Var2)) {
                        iC12 = androidx.camera.core.t.c(i13 << 3, 8, iC12);
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (y7Var.i(i13, i9, z6Var2)) {
                        iC12 = androidx.camera.core.t.c(i13 << 3, 4, iC12);
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (y7Var.i(i13, i9, z6Var2)) {
                        iC12 = androidx.camera.core.t.c(i13 << 3, 1, iC12);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (y7Var.i(i13, i9, z6Var2)) {
                        int i25 = i13 << 3;
                        Object object2 = unsafe.getObject(z6Var2, j6);
                        if (object2 instanceof h6) {
                            iC10 = k6.c(i25);
                            iE2 = ((h6) object2).e();
                            iC11 = k6.c(iE2);
                            iC12 += iC11 + iE2 + iC10;
                            break;
                        } else {
                            size2 = k6.c(i25);
                            iD2 = k6.b((String) object2);
                            iC12 += iD2 + size2;
                            break;
                        }
                    } else {
                        break;
                    }
                case 60:
                    if (y7Var.i(i13, i9, z6Var2)) {
                        iK = f8.k(i13, unsafe.getObject(z6Var2, j6), y7Var.o(i9));
                        iC12 += iK;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (y7Var.i(i13, i9, z6Var2)) {
                        h6 h6Var2 = (h6) unsafe.getObject(z6Var2, j6);
                        iC10 = k6.c(i13 << 3);
                        iE2 = h6Var2.e();
                        iC11 = k6.c(iE2);
                        iC12 += iC11 + iE2 + iC10;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (y7Var.i(i13, i9, z6Var2)) {
                        iC12 = androidx.camera.core.t.c(k(j6, z6Var2), k6.c(i13 << 3), iC12);
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (y7Var.i(i13, i9, z6Var2)) {
                        long jK2 = k(j6, z6Var2);
                        size2 = k6.c(i13 << 3);
                        iD2 = k6.d(jK2);
                        iC12 += iD2 + size2;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (y7Var.i(i13, i9, z6Var2)) {
                        iC12 = androidx.camera.core.t.c(i13 << 3, 4, iC12);
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (y7Var.i(i13, i9, z6Var2)) {
                        iC12 = androidx.camera.core.t.c(i13 << 3, 8, iC12);
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (y7Var.i(i13, i9, z6Var2)) {
                        int iK2 = k(j6, z6Var2);
                        iC12 = androidx.camera.core.t.c((iK2 >> 31) ^ (iK2 + iK2), k6.c(i13 << 3), iC12);
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (y7Var.i(i13, i9, z6Var2)) {
                        long jN3 = n(j6, z6Var2);
                        size2 = k6.c(i13 << 3);
                        iD2 = k6.d((jN3 >> 63) ^ (jN3 + jN3));
                        iC12 += iD2 + size2;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (y7Var.i(i13, i9, z6Var2)) {
                        v7 v7Var3 = (v7) unsafe.getObject(z6Var2, j6);
                        e8 e8VarO4 = y7Var.o(i9);
                        p1 p1Var21 = f8.f11738a;
                        int iC18 = k6.c(i13 << 3);
                        iK = ((y5) v7Var3).c(e8VarO4) + iC18 + iC18;
                        iC12 += iK;
                        break;
                    } else {
                        break;
                    }
            }
            i9 += 3;
            i7 = 1048575;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.e8
    public final boolean f(Object obj) {
        int i6;
        int i7;
        int i8;
        int i9 = 0;
        int i10 = 0;
        int i11 = 1048575;
        while (i10 < this.f11951f) {
            int i12 = this.f11950e[i10];
            int[] iArr = this.f11946a;
            int i13 = iArr[i12];
            int iM = m(i12);
            int i14 = iArr[i12 + 2];
            int i15 = i14 & 1048575;
            int i16 = 1 << (i14 >>> 20);
            if (i15 != i11) {
                if (i15 != 1048575) {
                    i9 = f11945j.getInt(obj, i15);
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
            if ((268435456 & iM) == 0 || v(obj, i7, i6, i8, i16)) {
                int iL = l(iM);
                if (iL != 9 && iL != 17) {
                    if (iL != 27) {
                        if (iL == 60 || iL == 68) {
                            if (!i(i13, i7, obj) || o(i7).f(s8.h(iM & 1048575, obj))) {
                                i10++;
                                i11 = i6;
                                i9 = i8;
                            }
                        } else if (iL != 49) {
                            if (iL != 50) {
                                continue;
                            } else {
                                q7 q7Var = (q7) s8.h(iM & 1048575, obj);
                                if (q7Var.isEmpty()) {
                                    continue;
                                } else {
                                    int i18 = i7 / 3;
                                    if (((v8) ((p7) this.f11947b[i18 + i18]).f11869a.f2373u).s == w8.A) {
                                        e8 e8VarA = null;
                                        for (Object obj2 : q7Var.values()) {
                                            if (e8VarA == null) {
                                                e8VarA = b8.f11644c.a(obj2.getClass());
                                            }
                                            if (!e8VarA.f(obj2)) {
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                            i10++;
                            i11 = i6;
                            i9 = i8;
                        }
                    }
                    List list = (List) s8.h(iM & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        e8 e8VarO = o(i7);
                        for (int i19 = 0; i19 < list.size(); i19++) {
                            if (e8VarO.f(list.get(i19))) {
                            }
                        }
                    }
                    i10++;
                    i11 = i6;
                    i9 = i8;
                } else if (!v(obj, i7, i6, i8, i16) || o(i7).f(s8.h(iM & 1048575, obj))) {
                    i10++;
                    i11 = i6;
                    i9 = i8;
                }
            }
            return false;
        }
        if (this.f11949d) {
            ((x6) obj).zzb.e();
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    @Override // com.google.android.gms.internal.consent_sdk.e8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(Object obj, l6 l6Var) {
        Map.Entry entry;
        boolean z6;
        int[] iArr;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z7;
        y7<T> y7Var = this;
        k6 k6Var = l6Var.f11816a;
        if (y7Var.f11949d) {
            s6 s6Var = ((x6) obj).zzb;
            entry = !s6Var.f11884a.isEmpty() ? (Map.Entry) s6Var.b().next() : null;
        }
        Unsafe unsafe = f11945j;
        int i11 = 1048575;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int[] iArr2 = y7Var.f11946a;
            if (i13 >= iArr2.length) {
                if (entry == null) {
                    n8 n8Var = ((z6) obj).zzc;
                    return;
                } else {
                    throw null;
                }
            }
            int iM = y7Var.m(i13);
            int iL = l(iM);
            int i15 = iArr2[i13];
            if (iL <= 17) {
                int i16 = iArr2[i13 + 2];
                z6 = true;
                int i17 = i16 & i11;
                if (i17 != i12) {
                    i14 = i17 == i11 ? 0 : unsafe.getInt(obj, i17);
                    i12 = i17;
                }
                int i18 = 1 << (i16 >>> 20);
                iArr = iArr2;
                i6 = i18;
            } else {
                z6 = true;
                iArr = iArr2;
                i6 = 0;
            }
            if (entry != null) {
                throw null;
            }
            long j6 = iM & i11;
            switch (iL) {
                case 0:
                    if (y7Var.v(obj, i13, i12, i14, i6)) {
                        k6Var.l(i15, Double.doubleToRawLongBits(s8.f11890c.a(j6, obj)));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (y7Var.v(obj, i13, i12, i14, i6)) {
                        k6Var.j(i15, Float.floatToRawIntBits(s8.f11890c.b(j6, obj)));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (y7Var.v(obj, i13, i12, i14, i6)) {
                        k6Var.v(i15, unsafe.getLong(obj, j6));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (y7Var.v(obj, i13, i12, i14, i6)) {
                        k6Var.v(i15, unsafe.getLong(obj, j6));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (y7Var.v(obj, i13, i12, i14, i6)) {
                        k6Var.n(i15, unsafe.getInt(obj, j6));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (y7Var.v(obj, i13, i12, i14, i6)) {
                        k6Var.l(i15, unsafe.getLong(obj, j6));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (y7Var.v(obj, i13, i12, i14, i6)) {
                        k6Var.j(i15, unsafe.getInt(obj, j6));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (y7Var.v(obj, i13, i12, i14, i6)) {
                        k6Var.f(i15, s8.f11890c.g(j6, obj));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (y7Var.v(obj, i13, i12, i14, i6)) {
                        Object object = unsafe.getObject(obj, j6);
                        if (object instanceof String) {
                            k6Var.q(i15, (String) object);
                            break;
                        } else {
                            k6Var.h(i15, (h6) object);
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (y7Var.v(obj, i13, i12, i14, i6)) {
                        l6Var.a(i15, unsafe.getObject(obj, j6), y7Var.o(i13));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (y7Var.v(obj, i13, i12, i14, i6)) {
                        k6Var.h(i15, (h6) unsafe.getObject(obj, j6));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (y7Var.v(obj, i13, i12, i14, i6)) {
                        k6Var.t(i15, unsafe.getInt(obj, j6));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (y7Var.v(obj, i13, i12, i14, i6)) {
                        k6Var.n(i15, unsafe.getInt(obj, j6));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (y7Var.v(obj, i13, i12, i14, i6)) {
                        k6Var.j(i15, unsafe.getInt(obj, j6));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (y7Var.v(obj, i13, i12, i14, i6)) {
                        k6Var.l(i15, unsafe.getLong(obj, j6));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (y7Var.v(obj, i13, i12, i14, i6)) {
                        int i19 = unsafe.getInt(obj, j6);
                        k6Var.t(i15, (i19 >> 31) ^ (i19 + i19));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (y7Var.v(obj, i13, i12, i14, i6)) {
                        long j7 = unsafe.getLong(obj, j6);
                        k6Var.v(i15, (j7 + j7) ^ (j7 >> 63));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (y7Var.v(obj, i13, i12, i14, i6)) {
                        Object object2 = unsafe.getObject(obj, j6);
                        k6Var.s(i15, 3);
                        y7Var.o(i13).g((y5) object2, l6Var);
                        k6Var.s(i15, 4);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    i7 = i12;
                    i8 = i14;
                    f8.r(iArr[i13], (List) unsafe.getObject(obj, j6), l6Var, false);
                    i12 = i7;
                    i14 = i8;
                    break;
                case 19:
                    i7 = i12;
                    i8 = i14;
                    f8.v(iArr[i13], (List) unsafe.getObject(obj, j6), l6Var, false);
                    i12 = i7;
                    i14 = i8;
                    break;
                case 20:
                    i7 = i12;
                    i8 = i14;
                    f8.x(iArr[i13], (List) unsafe.getObject(obj, j6), l6Var, false);
                    i12 = i7;
                    i14 = i8;
                    break;
                case dn.zzm /* 21 */:
                    i7 = i12;
                    i8 = i14;
                    f8.d(iArr[i13], (List) unsafe.getObject(obj, j6), l6Var, false);
                    i12 = i7;
                    i14 = i8;
                    break;
                case 22:
                    i7 = i12;
                    i8 = i14;
                    f8.w(iArr[i13], (List) unsafe.getObject(obj, j6), l6Var, false);
                    i12 = i7;
                    i14 = i8;
                    break;
                case 23:
                    i7 = i12;
                    i8 = i14;
                    f8.u(iArr[i13], (List) unsafe.getObject(obj, j6), l6Var, false);
                    i12 = i7;
                    i14 = i8;
                    break;
                case 24:
                    i7 = i12;
                    i8 = i14;
                    f8.t(iArr[i13], (List) unsafe.getObject(obj, j6), l6Var, false);
                    i12 = i7;
                    i14 = i8;
                    break;
                case 25:
                    i7 = i12;
                    i8 = i14;
                    f8.q(iArr[i13], (List) unsafe.getObject(obj, j6), l6Var, false);
                    i12 = i7;
                    i14 = i8;
                    break;
                case 26:
                    i9 = i12;
                    i10 = i14;
                    int i20 = iArr[i13];
                    List list = (List) unsafe.getObject(obj, j6);
                    p1 p1Var = f8.f11738a;
                    if (list != null && !list.isEmpty()) {
                        if (list instanceof k7) {
                            k7 k7Var = (k7) list;
                            for (int i21 = 0; i21 < list.size(); i21++) {
                                Object objZza = k7Var.zza();
                                if (objZza instanceof String) {
                                    k6Var.q(i20, (String) objZza);
                                } else {
                                    k6Var.h(i20, (h6) objZza);
                                }
                            }
                        } else {
                            for (int i22 = 0; i22 < list.size(); i22++) {
                                k6Var.q(i20, (String) list.get(i22));
                            }
                        }
                    }
                    i12 = i9;
                    i14 = i10;
                    break;
                case 27:
                    i9 = i12;
                    i10 = i14;
                    int i23 = iArr[i13];
                    List list2 = (List) unsafe.getObject(obj, j6);
                    e8 e8VarO = y7Var.o(i13);
                    p1 p1Var2 = f8.f11738a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i24 = 0; i24 < list2.size(); i24++) {
                            l6Var.a(i23, list2.get(i24), e8VarO);
                        }
                    }
                    i12 = i9;
                    i14 = i10;
                    break;
                case 28:
                    i9 = i12;
                    i10 = i14;
                    int i25 = iArr[i13];
                    List list3 = (List) unsafe.getObject(obj, j6);
                    p1 p1Var3 = f8.f11738a;
                    if (list3 != null && !list3.isEmpty()) {
                        for (int i26 = 0; i26 < list3.size(); i26++) {
                            k6Var.h(i25, (h6) list3.get(i26));
                        }
                    }
                    i12 = i9;
                    i14 = i10;
                    break;
                case 29:
                    i7 = i12;
                    i8 = i14;
                    z7 = false;
                    f8.c(iArr[i13], (List) unsafe.getObject(obj, j6), l6Var, false);
                    i12 = i7;
                    i14 = i8;
                    break;
                case 30:
                    i7 = i12;
                    i8 = i14;
                    z7 = false;
                    f8.s(iArr[i13], (List) unsafe.getObject(obj, j6), l6Var, false);
                    i12 = i7;
                    i14 = i8;
                    break;
                case 31:
                    i7 = i12;
                    i8 = i14;
                    z7 = false;
                    f8.y(iArr[i13], (List) unsafe.getObject(obj, j6), l6Var, false);
                    i12 = i7;
                    i14 = i8;
                    break;
                case 32:
                    i7 = i12;
                    i8 = i14;
                    z7 = false;
                    f8.z(iArr[i13], (List) unsafe.getObject(obj, j6), l6Var, false);
                    i12 = i7;
                    i14 = i8;
                    break;
                case ImageFormatConstants.INTERNAL_DEFINED_IMAGE_FORMAT_JPEG /* 33 */:
                    i7 = i12;
                    i8 = i14;
                    z7 = false;
                    f8.a(iArr[i13], (List) unsafe.getObject(obj, j6), l6Var, false);
                    i12 = i7;
                    i14 = i8;
                    break;
                case ImageFormatConstants.INTERNAL_DEFINED_IMAGE_FORMAT_PRIVATE /* 34 */:
                    i7 = i12;
                    i8 = i14;
                    z7 = false;
                    f8.b(iArr[i13], (List) unsafe.getObject(obj, j6), l6Var, false);
                    i12 = i7;
                    i14 = i8;
                    break;
                case 35:
                    i9 = i12;
                    i10 = i14;
                    f8.r(iArr[i13], (List) unsafe.getObject(obj, j6), l6Var, z6);
                    i12 = i9;
                    i14 = i10;
                    break;
                case 36:
                    i9 = i12;
                    i10 = i14;
                    f8.v(iArr[i13], (List) unsafe.getObject(obj, j6), l6Var, z6);
                    i12 = i9;
                    i14 = i10;
                    break;
                case 37:
                    i9 = i12;
                    i10 = i14;
                    f8.x(iArr[i13], (List) unsafe.getObject(obj, j6), l6Var, z6);
                    i12 = i9;
                    i14 = i10;
                    break;
                case 38:
                    i9 = i12;
                    i10 = i14;
                    f8.d(iArr[i13], (List) unsafe.getObject(obj, j6), l6Var, z6);
                    i12 = i9;
                    i14 = i10;
                    break;
                case 39:
                    i9 = i12;
                    i10 = i14;
                    f8.w(iArr[i13], (List) unsafe.getObject(obj, j6), l6Var, z6);
                    i12 = i9;
                    i14 = i10;
                    break;
                case 40:
                    i9 = i12;
                    i10 = i14;
                    f8.u(iArr[i13], (List) unsafe.getObject(obj, j6), l6Var, z6);
                    i12 = i9;
                    i14 = i10;
                    break;
                case 41:
                    i9 = i12;
                    i10 = i14;
                    f8.t(iArr[i13], (List) unsafe.getObject(obj, j6), l6Var, z6);
                    i12 = i9;
                    i14 = i10;
                    break;
                case 42:
                    i9 = i12;
                    i10 = i14;
                    f8.q(iArr[i13], (List) unsafe.getObject(obj, j6), l6Var, z6);
                    i12 = i9;
                    i14 = i10;
                    break;
                case 43:
                    i9 = i12;
                    i10 = i14;
                    f8.c(iArr[i13], (List) unsafe.getObject(obj, j6), l6Var, z6);
                    i12 = i9;
                    i14 = i10;
                    break;
                case 44:
                    i9 = i12;
                    i10 = i14;
                    f8.s(iArr[i13], (List) unsafe.getObject(obj, j6), l6Var, z6);
                    i12 = i9;
                    i14 = i10;
                    break;
                case 45:
                    i9 = i12;
                    i10 = i14;
                    f8.y(iArr[i13], (List) unsafe.getObject(obj, j6), l6Var, z6);
                    i12 = i9;
                    i14 = i10;
                    break;
                case 46:
                    i9 = i12;
                    i10 = i14;
                    f8.z(iArr[i13], (List) unsafe.getObject(obj, j6), l6Var, z6);
                    i12 = i9;
                    i14 = i10;
                    break;
                case 47:
                    i9 = i12;
                    i10 = i14;
                    f8.a(iArr[i13], (List) unsafe.getObject(obj, j6), l6Var, z6);
                    i12 = i9;
                    i14 = i10;
                    break;
                case 48:
                    i9 = i12;
                    i10 = i14;
                    f8.b(iArr[i13], (List) unsafe.getObject(obj, j6), l6Var, true);
                    i12 = i9;
                    i14 = i10;
                    break;
                case 49:
                    i9 = i12;
                    i10 = i14;
                    int i27 = iArr[i13];
                    List list4 = (List) unsafe.getObject(obj, j6);
                    e8 e8VarO2 = y7Var.o(i13);
                    p1 p1Var4 = f8.f11738a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i28 = 0; i28 < list4.size(); i28++) {
                            y5 y5Var = (y5) list4.get(i28);
                            k6Var.s(i27, 3);
                            e8VarO2.g(y5Var, l6Var);
                            k6Var.s(i27, 4);
                        }
                    }
                    i12 = i9;
                    i14 = i10;
                    break;
                case 50:
                    Object object3 = unsafe.getObject(obj, j6);
                    if (object3 != null) {
                        int i29 = i13 / 3;
                        com.google.android.gms.ads.mediation.customevent.a aVar = ((p7) y7Var.f11947b[i29 + i29]).f11869a;
                        v8 v8Var = (v8) aVar.f2373u;
                        v8 v8Var2 = (v8) aVar.f2372t;
                        for (Map.Entry entry2 : ((q7) object3).entrySet()) {
                            k6Var.s(i15, 2);
                            int i30 = i12;
                            int i31 = i14;
                            boolean z8 = z6;
                            k6Var.u(s6.a(v8Var, 2, entry2.getValue()) + s6.a(v8Var2, z8 ? 1 : 0, entry2.getKey()));
                            Object key = entry2.getKey();
                            Object value = entry2.getValue();
                            s6.d(k6Var, v8Var2, z8 ? 1 : 0, key);
                            s6.d(k6Var, v8Var, 2, value);
                            i12 = i30;
                            i14 = i31;
                            z6 = true;
                        }
                    }
                    break;
                case 51:
                    if (y7Var.i(i15, i13, obj)) {
                        k6Var.l(i15, Double.doubleToRawLongBits(((Double) s8.h(j6, obj)).doubleValue()));
                    }
                    break;
                case 52:
                    if (y7Var.i(i15, i13, obj)) {
                        k6Var.j(i15, Float.floatToRawIntBits(((Float) s8.h(j6, obj)).floatValue()));
                    }
                    break;
                case 53:
                    if (y7Var.i(i15, i13, obj)) {
                        k6Var.v(i15, n(j6, obj));
                    }
                    break;
                case 54:
                    if (y7Var.i(i15, i13, obj)) {
                        k6Var.v(i15, n(j6, obj));
                    }
                    break;
                case 55:
                    if (y7Var.i(i15, i13, obj)) {
                        k6Var.n(i15, k(j6, obj));
                    }
                    break;
                case 56:
                    if (y7Var.i(i15, i13, obj)) {
                        k6Var.l(i15, n(j6, obj));
                    }
                    break;
                case 57:
                    if (y7Var.i(i15, i13, obj)) {
                        k6Var.j(i15, k(j6, obj));
                    }
                    break;
                case 58:
                    if (y7Var.i(i15, i13, obj)) {
                        k6Var.f(i15, ((Boolean) s8.h(j6, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (y7Var.i(i15, i13, obj)) {
                        Object object4 = unsafe.getObject(obj, j6);
                        if (object4 instanceof String) {
                            k6Var.q(i15, (String) object4);
                        } else {
                            k6Var.h(i15, (h6) object4);
                        }
                    }
                    break;
                case 60:
                    if (y7Var.i(i15, i13, obj)) {
                        l6Var.a(i15, unsafe.getObject(obj, j6), y7Var.o(i13));
                    }
                    break;
                case 61:
                    if (y7Var.i(i15, i13, obj)) {
                        k6Var.h(i15, (h6) unsafe.getObject(obj, j6));
                    }
                    break;
                case 62:
                    if (y7Var.i(i15, i13, obj)) {
                        k6Var.t(i15, k(j6, obj));
                    }
                    break;
                case 63:
                    if (y7Var.i(i15, i13, obj)) {
                        k6Var.n(i15, k(j6, obj));
                    }
                    break;
                case 64:
                    if (y7Var.i(i15, i13, obj)) {
                        k6Var.j(i15, k(j6, obj));
                    }
                    break;
                case 65:
                    if (y7Var.i(i15, i13, obj)) {
                        k6Var.l(i15, n(j6, obj));
                    }
                    break;
                case 66:
                    if (y7Var.i(i15, i13, obj)) {
                        int iK = k(j6, obj);
                        k6Var.t(i15, (iK >> 31) ^ (iK + iK));
                    }
                    break;
                case 67:
                    if (y7Var.i(i15, i13, obj)) {
                        long jN = n(j6, obj);
                        k6Var.v(i15, (jN >> 63) ^ (jN + jN));
                    }
                    break;
                case 68:
                    if (y7Var.i(i15, i13, obj)) {
                        Object object5 = unsafe.getObject(obj, j6);
                        k6Var.s(i15, 3);
                        y7Var.o(i13).g((y5) object5, l6Var);
                        k6Var.s(i15, 4);
                    }
                    break;
            }
            i13 += 3;
            i11 = 1048575;
            y7Var = this;
        }
    }

    public final boolean i(int i6, int i7, Object obj) {
        return s8.e((long) (this.f11946a[i7 + 2] & 1048575), obj) == i6;
    }

    public final int m(int i6) {
        return this.f11946a[i6 + 1];
    }

    public final e8 o(int i6) {
        int i7 = i6 / 3;
        int i8 = i7 + i7;
        Object[] objArr = this.f11947b;
        e8 e8Var = (e8) objArr[i8];
        if (e8Var != null) {
            return e8Var;
        }
        e8 e8VarA = b8.f11644c.a((Class) objArr[i8 + 1]);
        objArr[i8] = e8VarA;
        return e8VarA;
    }

    public final void q(int i6, Object obj, Object obj2) {
        if (u(i6, obj2)) {
            int iM = m(i6) & 1048575;
            Unsafe unsafe = f11945j;
            long j6 = iM;
            Object object = unsafe.getObject(obj2, j6);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f11946a[i6] + " is present but null: " + obj2.toString());
            }
            e8 e8VarO = o(i6);
            if (!u(i6, obj)) {
                if (h(object)) {
                    z6 z6VarZzc = e8VarO.zzc();
                    e8VarO.d(z6VarZzc, object);
                    unsafe.putObject(obj, j6, z6VarZzc);
                } else {
                    unsafe.putObject(obj, j6, object);
                }
                s(i6, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j6);
            if (!h(object2)) {
                z6 z6VarZzc2 = e8VarO.zzc();
                e8VarO.d(z6VarZzc2, object2);
                unsafe.putObject(obj, j6, z6VarZzc2);
                object2 = z6VarZzc2;
            }
            e8VarO.d(object2, object);
        }
    }

    public final void r(int i6, Object obj, Object obj2) {
        int[] iArr = this.f11946a;
        int i7 = iArr[i6];
        if (i(i7, i6, obj2)) {
            int iM = m(i6) & 1048575;
            Unsafe unsafe = f11945j;
            long j6 = iM;
            Object object = unsafe.getObject(obj2, j6);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i6] + " is present but null: " + obj2.toString());
            }
            e8 e8VarO = o(i6);
            if (!i(i7, i6, obj)) {
                if (h(object)) {
                    z6 z6VarZzc = e8VarO.zzc();
                    e8VarO.d(z6VarZzc, object);
                    unsafe.putObject(obj, j6, z6VarZzc);
                } else {
                    unsafe.putObject(obj, j6, object);
                }
                s8.k(obj, iArr[i6 + 2] & 1048575, i7);
                return;
            }
            Object object2 = unsafe.getObject(obj, j6);
            if (!h(object2)) {
                z6 z6VarZzc2 = e8VarO.zzc();
                e8VarO.d(z6VarZzc2, object2);
                unsafe.putObject(obj, j6, z6VarZzc2);
                object2 = z6VarZzc2;
            }
            e8VarO.d(object2, object);
        }
    }

    public final void s(int i6, Object obj) {
        int i7 = this.f11946a[i6 + 2];
        long j6 = 1048575 & i7;
        if (j6 == 1048575) {
            return;
        }
        s8.k(obj, j6, (1 << (i7 >>> 20)) | s8.e(j6, obj));
    }

    public final boolean t(z6 z6Var, z6 z6Var2, int i6) {
        return u(i6, z6Var) == u(i6, z6Var2);
    }

    public final boolean u(int i6, Object obj) {
        int i7 = this.f11946a[i6 + 2];
        long j6 = i7 & 1048575;
        if (j6 == 1048575) {
            int iM = m(i6);
            long j7 = iM & 1048575;
            switch (l(iM)) {
                case 0:
                    if (Double.doubleToRawLongBits(s8.f11890c.a(j7, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(s8.f11890c.b(j7, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (s8.f(j7, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (s8.f(j7, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (s8.e(j7, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (s8.f(j7, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (s8.e(j7, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return s8.f11890c.g(j7, obj);
                case 8:
                    Object objH = s8.h(j7, obj);
                    if (objH instanceof String) {
                        if (((String) objH).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(objH instanceof h6)) {
                            throw new IllegalArgumentException();
                        }
                        if (h6.f11768t.equals(objH)) {
                            return false;
                        }
                    }
                    break;
                case 9:
                    if (s8.h(j7, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (h6.f11768t.equals(s8.h(j7, obj))) {
                        return false;
                    }
                    break;
                case 11:
                    if (s8.e(j7, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (s8.e(j7, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (s8.e(j7, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (s8.f(j7, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (s8.e(j7, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (s8.f(j7, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (s8.h(j7, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i7 >>> 20)) & s8.e(j6, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean v(Object obj, int i6, int i7, int i8, int i9) {
        return i7 == 1048575 ? u(i6, obj) : (i8 & i9) != 0;
    }

    @Override // com.google.android.gms.internal.consent_sdk.e8
    public final z6 zzc() {
        return (z6) ((z6) this.f11948c).f(4);
    }
}
