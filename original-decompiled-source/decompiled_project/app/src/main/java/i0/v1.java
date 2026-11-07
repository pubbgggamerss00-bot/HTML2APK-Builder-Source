package i0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class v1 {

    /* renamed from: a, reason: collision with root package name */
    public static final v1 f13646a;

    /* renamed from: b, reason: collision with root package name */
    public static final v1 f13647b;

    /* renamed from: c, reason: collision with root package name */
    public static final v1 f13648c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ v1[] f13649d;

    static {
        v1 v1Var = new v1("None", 0);
        f13646a = v1Var;
        v1 v1Var2 = new v1("Selection", 1);
        f13647b = v1Var2;
        v1 v1Var3 = new v1("Cursor", 2);
        f13648c = v1Var3;
        v1[] v1VarArr = {v1Var, v1Var2, v1Var3};
        f13649d = v1VarArr;
        u2.e(v1VarArr);
    }

    public v1() {
        throw null;
    }

    public static v1 valueOf(String str) {
        return (v1) Enum.valueOf(v1.class, str);
    }

    public static v1[] values() {
        return (v1[]) f13649d.clone();
    }
}
