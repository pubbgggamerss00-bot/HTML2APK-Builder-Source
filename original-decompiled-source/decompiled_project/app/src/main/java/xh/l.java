package xh;

import i0.u2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final l f33606a;

    /* renamed from: b, reason: collision with root package name */
    public static final l f33607b;

    /* renamed from: c, reason: collision with root package name */
    public static final l f33608c;

    /* renamed from: d, reason: collision with root package name */
    public static final l f33609d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ l[] f33610e;

    static {
        l lVar = new l("SUCCESSFUL", 0);
        f33606a = lVar;
        l lVar2 = new l("REREGISTER", 1);
        f33607b = lVar2;
        l lVar3 = new l("CANCELLED", 2);
        f33608c = lVar3;
        l lVar4 = new l("ALREADY_SELECTED", 3);
        f33609d = lVar4;
        l[] lVarArr = {lVar, lVar2, lVar3, lVar4};
        f33610e = lVarArr;
        u2.e(lVarArr);
    }

    public l() {
        throw null;
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f33610e.clone();
    }
}
