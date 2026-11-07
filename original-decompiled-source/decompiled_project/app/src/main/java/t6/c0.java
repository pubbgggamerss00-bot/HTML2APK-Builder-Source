package t6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final c0 f27994a;

    /* renamed from: b, reason: collision with root package name */
    public static final c0 f27995b;

    /* renamed from: c, reason: collision with root package name */
    public static final c0 f27996c;

    /* renamed from: d, reason: collision with root package name */
    public static final c0 f27997d;

    /* renamed from: e, reason: collision with root package name */
    public static final c0 f27998e;

    /* renamed from: f, reason: collision with root package name */
    public static final c0 f27999f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ c0[] f28000g;

    static {
        c0 c0Var = new c0("ENQUEUED", 0);
        f27994a = c0Var;
        c0 c0Var2 = new c0("RUNNING", 1);
        f27995b = c0Var2;
        c0 c0Var3 = new c0("SUCCEEDED", 2);
        f27996c = c0Var3;
        c0 c0Var4 = new c0("FAILED", 3);
        f27997d = c0Var4;
        c0 c0Var5 = new c0("BLOCKED", 4);
        f27998e = c0Var5;
        c0 c0Var6 = new c0("CANCELLED", 5);
        f27999f = c0Var6;
        f28000g = new c0[]{c0Var, c0Var2, c0Var3, c0Var4, c0Var5, c0Var6};
    }

    public c0() {
        throw null;
    }

    public static c0 valueOf(String str) {
        return (c0) Enum.valueOf(c0.class, str);
    }

    public static c0[] values() {
        return (c0[]) f28000g.clone();
    }

    public final boolean a() {
        return this == f27996c || this == f27997d || this == f27999f;
    }
}
