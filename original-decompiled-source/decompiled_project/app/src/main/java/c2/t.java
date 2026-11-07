package c2;

import i0.u2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final t f4694a;

    /* renamed from: b, reason: collision with root package name */
    public static final t f4695b;

    /* renamed from: c, reason: collision with root package name */
    public static final t f4696c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ t[] f4697d;

    static {
        t tVar = new t("Initial", 0);
        f4694a = tVar;
        t tVar2 = new t("Main", 1);
        f4695b = tVar2;
        t tVar3 = new t("Final", 2);
        f4696c = tVar3;
        t[] tVarArr = {tVar, tVar2, tVar3};
        f4697d = tVarArr;
        u2.e(tVarArr);
    }

    public t() {
        throw null;
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) f4697d.clone();
    }
}
