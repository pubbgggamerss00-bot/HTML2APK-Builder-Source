package l1;

import i0.u2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final n f16680a;

    /* renamed from: b, reason: collision with root package name */
    public static final n f16681b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ n[] f16682c;

    static {
        n nVar = new n("VIEW_APPEAR", 0);
        f16680a = nVar;
        n nVar2 = new n("VIEW_DISAPPEAR", 1);
        f16681b = nVar2;
        n[] nVarArr = {nVar, nVar2};
        f16682c = nVarArr;
        u2.e(nVarArr);
    }

    public n() {
        throw null;
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f16682c.clone();
    }
}
