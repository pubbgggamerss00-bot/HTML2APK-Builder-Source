package g2;

import i0.u2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final r f11427a;

    /* renamed from: b, reason: collision with root package name */
    public static final r f11428b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ r[] f11429c;

    static {
        r rVar = new r("Min", 0);
        f11427a = rVar;
        r rVar2 = new r("Max", 1);
        f11428b = rVar2;
        r[] rVarArr = {rVar, rVar2};
        f11429c = rVarArr;
        u2.e(rVarArr);
    }

    public r() {
        throw null;
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f11429c.clone();
    }
}
