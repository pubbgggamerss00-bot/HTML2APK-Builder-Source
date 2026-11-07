package com.google.android.gms.internal.consent_sdk;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'u' uses external variables
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
public final class v8 {

    /* renamed from: u, reason: collision with root package name */
    public static final v8 f11918u;

    /* renamed from: v, reason: collision with root package name */
    public static final v8 f11919v;

    /* renamed from: w, reason: collision with root package name */
    public static final v8 f11920w;

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ v8[] f11921x;
    public final w8 s;

    /* renamed from: t, reason: collision with root package name */
    public final int f11922t;

    /* JADX INFO: Fake field, exist only in values array */
    v8 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    v8 EF2;

    static {
        v8 v8Var = new v8("DOUBLE", 0, w8.f11928v, 1);
        v8 v8Var2 = new v8("FLOAT", 1, w8.f11927u, 5);
        w8 w8Var = w8.f11926t;
        v8 v8Var3 = new v8("INT64", 2, w8Var, 0);
        f11918u = v8Var3;
        v8 v8Var4 = new v8("UINT64", 3, w8Var, 0);
        w8 w8Var2 = w8.s;
        v8 v8Var5 = new v8("INT32", 4, w8Var2, 0);
        v8 v8Var6 = new v8("FIXED64", 5, w8Var, 1);
        v8 v8Var7 = new v8("FIXED32", 6, w8Var2, 5);
        v8 v8Var8 = new v8("BOOL", 7, w8.f11929w, 0);
        v8 v8Var9 = new v8("STRING", 8, w8.f11930x, 2);
        f11919v = v8Var9;
        w8 w8Var3 = w8.A;
        v8 v8Var10 = new v8("GROUP", 9, w8Var3, 3);
        f11920w = v8Var10;
        f11921x = new v8[]{v8Var, v8Var2, v8Var3, v8Var4, v8Var5, v8Var6, v8Var7, v8Var8, v8Var9, v8Var10, new v8("MESSAGE", 10, w8Var3, 2), new v8("BYTES", 11, w8.f11931y, 2), new v8("UINT32", 12, w8Var2, 0), new v8("ENUM", 13, w8.f11932z, 0), new v8("SFIXED32", 14, w8Var2, 5), new v8("SFIXED64", 15, w8Var, 1), new v8("SINT32", 16, w8Var2, 0), new v8("SINT64", 17, w8Var, 0)};
    }

    public v8(String str, int i6, w8 w8Var, int i7) {
        this.s = w8Var;
        this.f11922t = i7;
    }

    public static v8[] values() {
        return (v8[]) f11921x.clone();
    }
}
