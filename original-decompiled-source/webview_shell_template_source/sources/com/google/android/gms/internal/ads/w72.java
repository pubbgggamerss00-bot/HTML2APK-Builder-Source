package com.google.android.gms.internal.ads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF3' uses external variables
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
public final class w72 {
    public static final w72 s;

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ w72[] f10098t;

    /* JADX INFO: Fake field, exist only in values array */
    w72 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    w72 EF2;

    /* JADX INFO: Fake field, exist only in values array */
    w72 EF3;

    static {
        w72 w72Var = new w72("DOUBLE", 0, x72.f10407v);
        w72 w72Var2 = new w72("FLOAT", 1, x72.f10406u);
        x72 x72Var = x72.f10405t;
        w72 w72Var3 = new w72("INT64", 2, x72Var);
        w72 w72Var4 = new w72("UINT64", 3, x72Var);
        x72 x72Var2 = x72.s;
        w72 w72Var5 = new w72("INT32", 4, x72Var2);
        w72 w72Var6 = new w72("FIXED64", 5, x72Var);
        w72 w72Var7 = new w72("FIXED32", 6, x72Var2);
        w72 w72Var8 = new w72("BOOL", 7, x72.f10408w);
        w72 w72Var9 = new w72("STRING", 8, x72.f10409x);
        x72 x72Var3 = x72.A;
        w72 w72Var10 = new w72("GROUP", 9, x72Var3);
        s = w72Var10;
        f10098t = new w72[]{w72Var, w72Var2, w72Var3, w72Var4, w72Var5, w72Var6, w72Var7, w72Var8, w72Var9, w72Var10, new w72("MESSAGE", 10, x72Var3), new w72("BYTES", 11, x72.f10410y), new w72("UINT32", 12, x72Var2), new w72("ENUM", 13, x72.f10411z), new w72("SFIXED32", 14, x72Var2), new w72("SFIXED64", 15, x72Var), new w72("SINT32", 16, x72Var2), new w72("SINT64", 17, x72Var)};
    }

    public w72(String str, int i6, x72 x72Var) {
    }

    public static w72[] values() {
        return (w72[]) f10098t.clone();
    }
}
