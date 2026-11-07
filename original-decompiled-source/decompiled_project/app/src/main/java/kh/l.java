package kh;

import i0.u2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ l[] f16307a;

    static {
        l[] lVarArr = {new l("PUBLIC", 0), new l("PROTECTED", 1), new l("INTERNAL", 2), new l("PRIVATE", 3)};
        f16307a = lVarArr;
        u2.e(lVarArr);
    }

    public l() {
        throw null;
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f16307a.clone();
    }
}
