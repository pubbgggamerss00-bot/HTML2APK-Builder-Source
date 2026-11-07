package u0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final h0 f29014a;

    /* renamed from: b, reason: collision with root package name */
    public static final h0 f29015b;

    /* renamed from: c, reason: collision with root package name */
    public static final h0 f29016c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ h0[] f29017d;

    static {
        h0 h0Var = new h0("Focused", 0);
        f29014a = h0Var;
        h0 h0Var2 = new h0("UnfocusedEmpty", 1);
        f29015b = h0Var2;
        h0 h0Var3 = new h0("UnfocusedNotEmpty", 2);
        f29016c = h0Var3;
        f29017d = new h0[]{h0Var, h0Var2, h0Var3};
    }

    public h0() {
        throw null;
    }

    public static h0 valueOf(String str) {
        return (h0) Enum.valueOf(h0.class, str);
    }

    public static h0[] values() {
        return (h0[]) f29017d.clone();
    }
}
