package b8;

import i0.u2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ l[] f3673a;

    static {
        l[] lVarArr = {new l("Verbose", 0), new l("Debug", 1), new l("Info", 2), new l("Warn", 3), new l("Error", 4)};
        f3673a = lVarArr;
        u2.e(lVarArr);
    }

    public l() {
        throw null;
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f3673a.clone();
    }
}
