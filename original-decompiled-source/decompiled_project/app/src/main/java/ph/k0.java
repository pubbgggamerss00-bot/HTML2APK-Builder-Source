package ph;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final k0 f21553a;

    /* renamed from: b, reason: collision with root package name */
    public static final k0 f21554b;

    /* renamed from: c, reason: collision with root package name */
    public static final k0 f21555c;

    /* renamed from: d, reason: collision with root package name */
    public static final k0 f21556d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ k0[] f21557e;

    static {
        k0 k0Var = new k0("DEFAULT", 0);
        f21553a = k0Var;
        k0 k0Var2 = new k0("LAZY", 1);
        f21554b = k0Var2;
        k0 k0Var3 = new k0("ATOMIC", 2);
        f21555c = k0Var3;
        k0 k0Var4 = new k0("UNDISPATCHED", 3);
        f21556d = k0Var4;
        k0[] k0VarArr = {k0Var, k0Var2, k0Var3, k0Var4};
        f21557e = k0VarArr;
        i0.u2.e(k0VarArr);
    }

    public k0() {
        throw null;
    }

    public static k0 valueOf(String str) {
        return (k0) Enum.valueOf(k0.class, str);
    }

    public static k0[] values() {
        return (k0[]) f21557e.clone();
    }
}
