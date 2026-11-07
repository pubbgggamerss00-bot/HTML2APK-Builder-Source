package g2;

import i0.u2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public static final s0 f11437a;

    /* renamed from: b, reason: collision with root package name */
    public static final s0 f11438b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ s0[] f11439c;

    static {
        s0 s0Var = new s0("Min", 0);
        f11437a = s0Var;
        s0 s0Var2 = new s0("Max", 1);
        f11438b = s0Var2;
        s0[] s0VarArr = {s0Var, s0Var2};
        f11439c = s0VarArr;
        u2.e(s0VarArr);
    }

    public s0() {
        throw null;
    }

    public static s0 valueOf(String str) {
        return (s0) Enum.valueOf(s0.class, str);
    }

    public static s0[] values() {
        return (s0[]) f11439c.clone();
    }
}
