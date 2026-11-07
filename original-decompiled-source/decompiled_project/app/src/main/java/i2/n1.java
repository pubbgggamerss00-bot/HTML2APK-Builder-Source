package i2;

import i0.u2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class n1 {

    /* renamed from: a, reason: collision with root package name */
    public static final n1 f13960a;

    /* renamed from: b, reason: collision with root package name */
    public static final n1 f13961b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ n1[] f13962c;

    static {
        n1 n1Var = new n1("Width", 0);
        f13960a = n1Var;
        n1 n1Var2 = new n1("Height", 1);
        f13961b = n1Var2;
        n1[] n1VarArr = {n1Var, n1Var2};
        f13962c = n1VarArr;
        u2.e(n1VarArr);
    }

    public n1() {
        throw null;
    }

    public static n1 valueOf(String str) {
        return (n1) Enum.valueOf(n1.class, str);
    }

    public static n1[] values() {
        return (n1[]) f13962c.clone();
    }
}
