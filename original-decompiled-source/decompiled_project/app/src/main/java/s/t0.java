package s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public static final t0 f23922a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ t0[] f23923b;

    static {
        t0 t0Var = new t0("Default", 0);
        f23922a = t0Var;
        t0[] t0VarArr = {t0Var, new t0("UserInput", 1), new t0("PreventUserInput", 2)};
        f23923b = t0VarArr;
        i0.u2.e(t0VarArr);
    }

    public t0() {
        throw null;
    }

    public static t0 valueOf(String str) {
        return (t0) Enum.valueOf(t0.class, str);
    }

    public static t0[] values() {
        return (t0[]) f23923b.clone();
    }
}
