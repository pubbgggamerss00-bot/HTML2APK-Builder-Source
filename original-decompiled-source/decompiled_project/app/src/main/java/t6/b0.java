package t6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final b0 f27989a;

    /* renamed from: b, reason: collision with root package name */
    public static final b0 f27990b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ b0[] f27991c;

    static {
        b0 b0Var = new b0("RUN_AS_NON_EXPEDITED_WORK_REQUEST", 0);
        f27989a = b0Var;
        b0 b0Var2 = new b0("DROP_WORK_REQUEST", 1);
        f27990b = b0Var2;
        f27991c = new b0[]{b0Var, b0Var2};
    }

    public b0() {
        throw null;
    }

    public static b0 valueOf(String str) {
        return (b0) Enum.valueOf(b0.class, str);
    }

    public static b0[] values() {
        return (b0[]) f27991c.clone();
    }
}
