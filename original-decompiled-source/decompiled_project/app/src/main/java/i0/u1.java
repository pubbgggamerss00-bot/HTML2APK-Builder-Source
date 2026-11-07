package i0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class u1 {

    /* renamed from: a, reason: collision with root package name */
    public static final u1 f13615a;

    /* renamed from: b, reason: collision with root package name */
    public static final u1 f13616b;

    /* renamed from: c, reason: collision with root package name */
    public static final u1 f13617c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ u1[] f13618d;

    static {
        u1 u1Var = new u1("Cursor", 0);
        f13615a = u1Var;
        u1 u1Var2 = new u1("SelectionStart", 1);
        f13616b = u1Var2;
        u1 u1Var3 = new u1("SelectionEnd", 2);
        f13617c = u1Var3;
        u1[] u1VarArr = {u1Var, u1Var2, u1Var3};
        f13618d = u1VarArr;
        u2.e(u1VarArr);
    }

    public u1() {
        throw null;
    }

    public static u1 valueOf(String str) {
        return (u1) Enum.valueOf(u1.class, str);
    }

    public static u1[] values() {
        return (u1[]) f13618d.clone();
    }
}
