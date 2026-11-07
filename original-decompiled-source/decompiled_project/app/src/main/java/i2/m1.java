package i2;

import i0.u2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class m1 {

    /* renamed from: a, reason: collision with root package name */
    public static final m1 f13953a;

    /* renamed from: b, reason: collision with root package name */
    public static final m1 f13954b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ m1[] f13955c;

    static {
        m1 m1Var = new m1("Min", 0);
        f13953a = m1Var;
        m1 m1Var2 = new m1("Max", 1);
        f13954b = m1Var2;
        m1[] m1VarArr = {m1Var, m1Var2};
        f13955c = m1VarArr;
        u2.e(m1VarArr);
    }

    public m1() {
        throw null;
    }

    public static m1 valueOf(String str) {
        return (m1) Enum.valueOf(m1.class, str);
    }

    public static m1[] values() {
        return (m1[]) f13955c.clone();
    }
}
