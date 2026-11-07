package z;

import i0.u2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public static final w0 f34658a;

    /* renamed from: b, reason: collision with root package name */
    public static final w0 f34659b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ w0[] f34660c;

    static {
        w0 w0Var = new w0("Min", 0);
        f34658a = w0Var;
        w0 w0Var2 = new w0("Max", 1);
        f34659b = w0Var2;
        w0[] w0VarArr = {w0Var, w0Var2};
        f34660c = w0VarArr;
        u2.e(w0VarArr);
    }

    public w0() {
        throw null;
    }

    public static w0 valueOf(String str) {
        return (w0) Enum.valueOf(w0.class, str);
    }

    public static w0[] values() {
        return (w0[]) f34660c.clone();
    }
}
