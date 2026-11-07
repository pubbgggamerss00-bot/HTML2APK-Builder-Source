package e3;

import i0.u2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f8360a;

    /* renamed from: b, reason: collision with root package name */
    public static final g f8361b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ g[] f8362c;

    static {
        g gVar = new g("Ltr", 0);
        f8360a = gVar;
        g gVar2 = new g("Rtl", 1);
        f8361b = gVar2;
        g[] gVarArr = {gVar, gVar2};
        f8362c = gVarArr;
        u2.e(gVarArr);
    }

    public g() {
        throw null;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f8362c.clone();
    }
}
