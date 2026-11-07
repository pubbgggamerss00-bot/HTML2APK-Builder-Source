package j3;

import i0.u2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public static final q0 f15111a;

    /* renamed from: b, reason: collision with root package name */
    public static final q0 f15112b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ q0[] f15113c;

    static {
        q0 q0Var = new q0("Inherit", 0);
        f15111a = q0Var;
        q0 q0Var2 = new q0("SecureOn", 1);
        f15112b = q0Var2;
        q0[] q0VarArr = {q0Var, q0Var2, new q0("SecureOff", 2)};
        f15113c = q0VarArr;
        u2.e(q0VarArr);
    }

    public q0() {
        throw null;
    }

    public static q0 valueOf(String str) {
        return (q0) Enum.valueOf(q0.class, str);
    }

    public static q0[] values() {
        return (q0[]) f15113c.clone();
    }
}
