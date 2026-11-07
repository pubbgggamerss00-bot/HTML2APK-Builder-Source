package x0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public static final v0 f31944a;

    /* renamed from: b, reason: collision with root package name */
    public static final v0 f31945b;

    /* renamed from: c, reason: collision with root package name */
    public static final v0 f31946c;

    /* renamed from: d, reason: collision with root package name */
    public static final v0 f31947d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ v0[] f31948e;

    static {
        v0 v0Var = new v0("IGNORED", 0);
        f31944a = v0Var;
        v0 v0Var2 = new v0("SCHEDULED", 1);
        f31945b = v0Var2;
        v0 v0Var3 = new v0("DEFERRED", 2);
        f31946c = v0Var3;
        v0 v0Var4 = new v0("IMMINENT", 3);
        f31947d = v0Var4;
        v0[] v0VarArr = {v0Var, v0Var2, v0Var3, v0Var4};
        f31948e = v0VarArr;
        i0.u2.e(v0VarArr);
    }

    public v0() {
        throw null;
    }

    public static v0 valueOf(String str) {
        return (v0) Enum.valueOf(v0.class, str);
    }

    public static v0[] values() {
        return (v0[]) f31948e.clone();
    }
}
