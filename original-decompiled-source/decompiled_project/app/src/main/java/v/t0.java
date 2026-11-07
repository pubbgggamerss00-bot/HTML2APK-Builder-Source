package v;

import i0.u2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public static final t0 f30083a;

    /* renamed from: b, reason: collision with root package name */
    public static final t0 f30084b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ t0[] f30085c;

    static {
        t0 t0Var = new t0("Vertical", 0);
        f30083a = t0Var;
        t0 t0Var2 = new t0("Horizontal", 1);
        f30084b = t0Var2;
        t0[] t0VarArr = {t0Var, t0Var2};
        f30085c = t0VarArr;
        u2.e(t0VarArr);
    }

    public t0() {
        throw null;
    }

    public static t0 valueOf(String str) {
        return (t0) Enum.valueOf(t0.class, str);
    }

    public static t0[] values() {
        return (t0[]) f30085c.clone();
    }
}
