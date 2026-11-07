package ah;

import i0.u2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final n f588a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ n[] f589b;

    static {
        n nVar = new n("SKIP", 0);
        n nVar2 = new n("TERMINATE", 1);
        f588a = nVar2;
        n[] nVarArr = {nVar, nVar2};
        f589b = nVarArr;
        u2.e(nVarArr);
    }

    public n() {
        throw null;
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f589b.clone();
    }
}
