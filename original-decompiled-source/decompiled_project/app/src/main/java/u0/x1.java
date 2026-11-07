package u0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class x1 {

    /* renamed from: a, reason: collision with root package name */
    public static final x1 f29178a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ x1[] f29179b;

    /* JADX INFO: Fake field, exist only in values array */
    x1 EF0;

    static {
        x1 x1Var = new x1("Filled", 0);
        x1 x1Var2 = new x1("Outlined", 1);
        f29178a = x1Var2;
        f29179b = new x1[]{x1Var, x1Var2};
    }

    public x1() {
        throw null;
    }

    public static x1 valueOf(String str) {
        return (x1) Enum.valueOf(x1.class, str);
    }

    public static x1[] values() {
        return (x1[]) f29179b.clone();
    }
}
