package f3;

import i0.u2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final r f8828a;

    /* renamed from: b, reason: collision with root package name */
    public static final r f8829b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ r[] f8830c;

    static {
        r rVar = new r("Ltr", 0);
        f8828a = rVar;
        r rVar2 = new r("Rtl", 1);
        f8829b = rVar2;
        r[] rVarArr = {rVar, rVar2};
        f8830c = rVarArr;
        u2.e(rVarArr);
    }

    public r() {
        throw null;
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f8830c.clone();
    }
}
