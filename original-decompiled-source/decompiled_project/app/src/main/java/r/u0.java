package r;

import i0.u2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public static final u0 f22955a;

    /* renamed from: b, reason: collision with root package name */
    public static final u0 f22956b;

    /* renamed from: c, reason: collision with root package name */
    public static final u0 f22957c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ u0[] f22958d;

    static {
        u0 u0Var = new u0("PreEnter", 0);
        f22955a = u0Var;
        u0 u0Var2 = new u0("Visible", 1);
        f22956b = u0Var2;
        u0 u0Var3 = new u0("PostExit", 2);
        f22957c = u0Var3;
        u0[] u0VarArr = {u0Var, u0Var2, u0Var3};
        f22958d = u0VarArr;
        u2.e(u0VarArr);
    }

    public u0() {
        throw null;
    }

    public static u0 valueOf(String str) {
        return (u0) Enum.valueOf(u0.class, str);
    }

    public static u0[] values() {
        return (u0[]) f22958d.clone();
    }
}
