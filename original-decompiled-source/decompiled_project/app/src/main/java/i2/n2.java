package i2;

import i0.u2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class n2 {

    /* renamed from: a, reason: collision with root package name */
    public static final n2 f13963a;

    /* renamed from: b, reason: collision with root package name */
    public static final n2 f13964b;

    /* renamed from: c, reason: collision with root package name */
    public static final n2 f13965c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ n2[] f13966d;

    static {
        n2 n2Var = new n2("ContinueTraversal", 0);
        f13963a = n2Var;
        n2 n2Var2 = new n2("SkipSubtreeAndContinueTraversal", 1);
        f13964b = n2Var2;
        n2 n2Var3 = new n2("CancelTraversal", 2);
        f13965c = n2Var3;
        n2[] n2VarArr = {n2Var, n2Var2, n2Var3};
        f13966d = n2VarArr;
        u2.e(n2VarArr);
    }

    public n2() {
        throw null;
    }

    public static n2 valueOf(String str) {
        return (n2) Enum.valueOf(n2.class, str);
    }

    public static n2[] values() {
        return (n2[]) f13966d.clone();
    }
}
