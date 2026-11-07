package com.google.android.gms.internal.consent_sdk;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class t6 {

    /* renamed from: t, reason: collision with root package name */
    public static final t6 f11904t;

    /* renamed from: u, reason: collision with root package name */
    public static final t6 f11905u;

    /* renamed from: v, reason: collision with root package name */
    public static final t6[] f11906v;

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ t6[] f11907w;
    public final int s;

    /* JADX INFO: Fake field, exist only in values array */
    t6 EF0;

    static {
        f7 f7Var = f7.f11734w;
        t6 t6Var = new t6("DOUBLE", 0, 0, 1, f7Var);
        f7 f7Var2 = f7.f11733v;
        t6 t6Var2 = new t6("FLOAT", 1, 1, 1, f7Var2);
        f7 f7Var3 = f7.f11732u;
        t6 t6Var3 = new t6("INT64", 2, 2, 1, f7Var3);
        t6 t6Var4 = new t6("UINT64", 3, 3, 1, f7Var3);
        f7 f7Var4 = f7.f11731t;
        t6 t6Var5 = new t6("INT32", 4, 4, 1, f7Var4);
        t6 t6Var6 = new t6("FIXED64", 5, 5, 1, f7Var3);
        t6 t6Var7 = new t6("FIXED32", 6, 6, 1, f7Var4);
        f7 f7Var5 = f7.f11735x;
        t6 t6Var8 = new t6("BOOL", 7, 7, 1, f7Var5);
        f7 f7Var6 = f7.f11736y;
        t6 t6Var9 = new t6("STRING", 8, 8, 1, f7Var6);
        f7 f7Var7 = f7.B;
        t6 t6Var10 = new t6("MESSAGE", 9, 9, 1, f7Var7);
        f7 f7Var8 = f7.f11737z;
        t6 t6Var11 = new t6("BYTES", 10, 10, 1, f7Var8);
        t6 t6Var12 = new t6("UINT32", 11, 11, 1, f7Var4);
        f7 f7Var9 = f7.A;
        t6 t6Var13 = new t6("ENUM", 12, 12, 1, f7Var9);
        t6 t6Var14 = new t6("SFIXED32", 13, 13, 1, f7Var4);
        t6 t6Var15 = new t6("SFIXED64", 14, 14, 1, f7Var3);
        t6 t6Var16 = new t6("SINT32", 15, 15, 1, f7Var4);
        t6 t6Var17 = new t6("SINT64", 16, 16, 1, f7Var3);
        t6 t6Var18 = new t6("GROUP", 17, 17, 1, f7Var7);
        t6 t6Var19 = new t6("DOUBLE_LIST", 18, 18, 2, f7Var);
        t6 t6Var20 = new t6("FLOAT_LIST", 19, 19, 2, f7Var2);
        t6 t6Var21 = new t6("INT64_LIST", 20, 20, 2, f7Var3);
        t6 t6Var22 = new t6("UINT64_LIST", 21, 21, 2, f7Var3);
        t6 t6Var23 = new t6("INT32_LIST", 22, 22, 2, f7Var4);
        t6 t6Var24 = new t6("FIXED64_LIST", 23, 23, 2, f7Var3);
        t6 t6Var25 = new t6("FIXED32_LIST", 24, 24, 2, f7Var4);
        t6 t6Var26 = new t6("BOOL_LIST", 25, 25, 2, f7Var5);
        t6 t6Var27 = new t6("STRING_LIST", 26, 26, 2, f7Var6);
        t6 t6Var28 = new t6("MESSAGE_LIST", 27, 27, 2, f7Var7);
        t6 t6Var29 = new t6("BYTES_LIST", 28, 28, 2, f7Var8);
        t6 t6Var30 = new t6("UINT32_LIST", 29, 29, 2, f7Var4);
        t6 t6Var31 = new t6("ENUM_LIST", 30, 30, 2, f7Var9);
        t6 t6Var32 = new t6("SFIXED32_LIST", 31, 31, 2, f7Var4);
        t6 t6Var33 = new t6("SFIXED64_LIST", 32, 32, 2, f7Var3);
        t6 t6Var34 = new t6("SINT32_LIST", 33, 33, 2, f7Var4);
        t6 t6Var35 = new t6("SINT64_LIST", 34, 34, 2, f7Var3);
        t6 t6Var36 = new t6("DOUBLE_LIST_PACKED", 35, 35, 3, f7Var);
        f11904t = t6Var36;
        t6 t6Var37 = new t6("FLOAT_LIST_PACKED", 36, 36, 3, f7Var2);
        t6 t6Var38 = new t6("INT64_LIST_PACKED", 37, 37, 3, f7Var3);
        t6 t6Var39 = new t6("UINT64_LIST_PACKED", 38, 38, 3, f7Var3);
        t6 t6Var40 = new t6("INT32_LIST_PACKED", 39, 39, 3, f7Var4);
        t6 t6Var41 = new t6("FIXED64_LIST_PACKED", 40, 40, 3, f7Var3);
        t6 t6Var42 = new t6("FIXED32_LIST_PACKED", 41, 41, 3, f7Var4);
        t6 t6Var43 = new t6("BOOL_LIST_PACKED", 42, 42, 3, f7Var5);
        t6 t6Var44 = new t6("UINT32_LIST_PACKED", 43, 43, 3, f7Var4);
        t6 t6Var45 = new t6("ENUM_LIST_PACKED", 44, 44, 3, f7Var9);
        t6 t6Var46 = new t6("SFIXED32_LIST_PACKED", 45, 45, 3, f7Var4);
        t6 t6Var47 = new t6("SFIXED64_LIST_PACKED", 46, 46, 3, f7Var3);
        t6 t6Var48 = new t6("SINT32_LIST_PACKED", 47, 47, 3, f7Var4);
        t6 t6Var49 = new t6("SINT64_LIST_PACKED", 48, 48, 3, f7Var3);
        f11905u = t6Var49;
        f11907w = new t6[]{t6Var, t6Var2, t6Var3, t6Var4, t6Var5, t6Var6, t6Var7, t6Var8, t6Var9, t6Var10, t6Var11, t6Var12, t6Var13, t6Var14, t6Var15, t6Var16, t6Var17, t6Var18, t6Var19, t6Var20, t6Var21, t6Var22, t6Var23, t6Var24, t6Var25, t6Var26, t6Var27, t6Var28, t6Var29, t6Var30, t6Var31, t6Var32, t6Var33, t6Var34, t6Var35, t6Var36, t6Var37, t6Var38, t6Var39, t6Var40, t6Var41, t6Var42, t6Var43, t6Var44, t6Var45, t6Var46, t6Var47, t6Var48, t6Var49, new t6("GROUP_LIST", 49, 49, 2, f7Var7), new t6("MAP", 50, 50, 4, f7.s)};
        t6[] t6VarArrValues = values();
        f11906v = new t6[t6VarArrValues.length];
        for (t6 t6Var50 : t6VarArrValues) {
            f11906v[t6Var50.s] = t6Var50;
        }
    }

    public t6(String str, int i6, int i7, int i8, f7 f7Var) {
        this.s = i7;
        int i9 = i8 - 1;
        if (i9 == 1 || i9 == 3) {
            f7Var.getClass();
        }
        if (i8 == 1) {
            f7 f7Var2 = f7.s;
            f7Var.ordinal();
        }
    }

    public static t6[] values() {
        return (t6[]) f11907w.clone();
    }
}
