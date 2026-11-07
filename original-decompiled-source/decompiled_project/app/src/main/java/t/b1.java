package t;

import i0.u2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public static final b1 f25167a;

    /* renamed from: b, reason: collision with root package name */
    public static final b1 f25168b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ b1[] f25169c;

    static {
        b1 b1Var = new b1("Default", 0);
        f25167a = b1Var;
        b1 b1Var2 = new b1("UserInput", 1);
        f25168b = b1Var2;
        b1[] b1VarArr = {b1Var, b1Var2, new b1("PreventUserInput", 2)};
        f25169c = b1VarArr;
        u2.e(b1VarArr);
    }

    public b1() {
        throw null;
    }

    public static b1 valueOf(String str) {
        return (b1) Enum.valueOf(b1.class, str);
    }

    public static b1[] values() {
        return (b1[]) f25169c.clone();
    }
}
