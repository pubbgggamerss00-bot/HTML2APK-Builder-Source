package com.google.android.gms.internal.ads;

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
public final class a52 {

    /* renamed from: t, reason: collision with root package name */
    public static final a52 f2584t;

    /* renamed from: u, reason: collision with root package name */
    public static final a52 f2585u;

    /* renamed from: v, reason: collision with root package name */
    public static final a52[] f2586v;

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ a52[] f2587w;
    public final int s;

    /* JADX INFO: Fake field, exist only in values array */
    a52 EF0;

    static {
        w52 w52Var = w52.f10058w;
        a52 a52Var = new a52("DOUBLE", 0, 0, 1, w52Var);
        w52 w52Var2 = w52.f10057v;
        a52 a52Var2 = new a52("FLOAT", 1, 1, 1, w52Var2);
        w52 w52Var3 = w52.f10056u;
        a52 a52Var3 = new a52("INT64", 2, 2, 1, w52Var3);
        a52 a52Var4 = new a52("UINT64", 3, 3, 1, w52Var3);
        w52 w52Var4 = w52.f10055t;
        a52 a52Var5 = new a52("INT32", 4, 4, 1, w52Var4);
        a52 a52Var6 = new a52("FIXED64", 5, 5, 1, w52Var3);
        a52 a52Var7 = new a52("FIXED32", 6, 6, 1, w52Var4);
        w52 w52Var5 = w52.f10059x;
        a52 a52Var8 = new a52("BOOL", 7, 7, 1, w52Var5);
        w52 w52Var6 = w52.f10060y;
        a52 a52Var9 = new a52("STRING", 8, 8, 1, w52Var6);
        w52 w52Var7 = w52.B;
        a52 a52Var10 = new a52("MESSAGE", 9, 9, 1, w52Var7);
        w52 w52Var8 = w52.f10061z;
        a52 a52Var11 = new a52("BYTES", 10, 10, 1, w52Var8);
        a52 a52Var12 = new a52("UINT32", 11, 11, 1, w52Var4);
        w52 w52Var9 = w52.A;
        a52 a52Var13 = new a52("ENUM", 12, 12, 1, w52Var9);
        a52 a52Var14 = new a52("SFIXED32", 13, 13, 1, w52Var4);
        a52 a52Var15 = new a52("SFIXED64", 14, 14, 1, w52Var3);
        a52 a52Var16 = new a52("SINT32", 15, 15, 1, w52Var4);
        a52 a52Var17 = new a52("SINT64", 16, 16, 1, w52Var3);
        a52 a52Var18 = new a52("GROUP", 17, 17, 1, w52Var7);
        a52 a52Var19 = new a52("DOUBLE_LIST", 18, 18, 2, w52Var);
        a52 a52Var20 = new a52("FLOAT_LIST", 19, 19, 2, w52Var2);
        a52 a52Var21 = new a52("INT64_LIST", 20, 20, 2, w52Var3);
        a52 a52Var22 = new a52("UINT64_LIST", 21, 21, 2, w52Var3);
        a52 a52Var23 = new a52("INT32_LIST", 22, 22, 2, w52Var4);
        a52 a52Var24 = new a52("FIXED64_LIST", 23, 23, 2, w52Var3);
        a52 a52Var25 = new a52("FIXED32_LIST", 24, 24, 2, w52Var4);
        a52 a52Var26 = new a52("BOOL_LIST", 25, 25, 2, w52Var5);
        a52 a52Var27 = new a52("STRING_LIST", 26, 26, 2, w52Var6);
        a52 a52Var28 = new a52("MESSAGE_LIST", 27, 27, 2, w52Var7);
        a52 a52Var29 = new a52("BYTES_LIST", 28, 28, 2, w52Var8);
        a52 a52Var30 = new a52("UINT32_LIST", 29, 29, 2, w52Var4);
        a52 a52Var31 = new a52("ENUM_LIST", 30, 30, 2, w52Var9);
        a52 a52Var32 = new a52("SFIXED32_LIST", 31, 31, 2, w52Var4);
        a52 a52Var33 = new a52("SFIXED64_LIST", 32, 32, 2, w52Var3);
        a52 a52Var34 = new a52("SINT32_LIST", 33, 33, 2, w52Var4);
        a52 a52Var35 = new a52("SINT64_LIST", 34, 34, 2, w52Var3);
        a52 a52Var36 = new a52("DOUBLE_LIST_PACKED", 35, 35, 3, w52Var);
        f2584t = a52Var36;
        a52 a52Var37 = new a52("FLOAT_LIST_PACKED", 36, 36, 3, w52Var2);
        a52 a52Var38 = new a52("INT64_LIST_PACKED", 37, 37, 3, w52Var3);
        a52 a52Var39 = new a52("UINT64_LIST_PACKED", 38, 38, 3, w52Var3);
        a52 a52Var40 = new a52("INT32_LIST_PACKED", 39, 39, 3, w52Var4);
        a52 a52Var41 = new a52("FIXED64_LIST_PACKED", 40, 40, 3, w52Var3);
        a52 a52Var42 = new a52("FIXED32_LIST_PACKED", 41, 41, 3, w52Var4);
        a52 a52Var43 = new a52("BOOL_LIST_PACKED", 42, 42, 3, w52Var5);
        a52 a52Var44 = new a52("UINT32_LIST_PACKED", 43, 43, 3, w52Var4);
        a52 a52Var45 = new a52("ENUM_LIST_PACKED", 44, 44, 3, w52Var9);
        a52 a52Var46 = new a52("SFIXED32_LIST_PACKED", 45, 45, 3, w52Var4);
        a52 a52Var47 = new a52("SFIXED64_LIST_PACKED", 46, 46, 3, w52Var3);
        a52 a52Var48 = new a52("SINT32_LIST_PACKED", 47, 47, 3, w52Var4);
        a52 a52Var49 = new a52("SINT64_LIST_PACKED", 48, 48, 3, w52Var3);
        f2585u = a52Var49;
        f2587w = new a52[]{a52Var, a52Var2, a52Var3, a52Var4, a52Var5, a52Var6, a52Var7, a52Var8, a52Var9, a52Var10, a52Var11, a52Var12, a52Var13, a52Var14, a52Var15, a52Var16, a52Var17, a52Var18, a52Var19, a52Var20, a52Var21, a52Var22, a52Var23, a52Var24, a52Var25, a52Var26, a52Var27, a52Var28, a52Var29, a52Var30, a52Var31, a52Var32, a52Var33, a52Var34, a52Var35, a52Var36, a52Var37, a52Var38, a52Var39, a52Var40, a52Var41, a52Var42, a52Var43, a52Var44, a52Var45, a52Var46, a52Var47, a52Var48, a52Var49, new a52("GROUP_LIST", 49, 49, 2, w52Var7), new a52("MAP", 50, 50, 4, w52.s)};
        a52[] a52VarArrValues = values();
        f2586v = new a52[a52VarArrValues.length];
        for (a52 a52Var50 : a52VarArrValues) {
            f2586v[a52Var50.s] = a52Var50;
        }
    }

    public a52(String str, int i6, int i7, int i8, w52 w52Var) {
        this.s = i7;
        int i9 = i8 - 1;
        if (i9 == 1 || i9 == 3) {
            w52Var.getClass();
        }
        if (i8 == 1) {
            w52 w52Var2 = w52.s;
            w52Var.ordinal();
        }
    }

    public static a52[] values() {
        return (a52[]) f2587w.clone();
    }
}
