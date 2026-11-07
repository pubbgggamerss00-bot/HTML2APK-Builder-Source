package mh;

import i0.u2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class n implements c {

    /* renamed from: b, reason: collision with root package name */
    public static final n f18276b;

    /* renamed from: c, reason: collision with root package name */
    public static final n f18277c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ n[] f18278d;

    /* renamed from: a, reason: collision with root package name */
    public final int f18279a;

    static {
        n nVar = new n("IGNORE_CASE", 0, 2);
        f18276b = nVar;
        n nVar2 = new n("MULTILINE", 1, 8);
        n nVar3 = new n("LITERAL", 2, 16);
        n nVar4 = new n("UNIX_LINES", 3, 1);
        n nVar5 = new n("COMMENTS", 4, 4);
        n nVar6 = new n("DOT_MATCHES_ALL", 5, 32);
        f18277c = nVar6;
        n[] nVarArr = {nVar, nVar2, nVar3, nVar4, nVar5, nVar6, new n("CANON_EQ", 6, 128)};
        f18278d = nVarArr;
        u2.e(nVarArr);
    }

    public n() {
        throw null;
    }

    public n(String str, int i10, int i11) {
        this.f18279a = i11;
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f18278d.clone();
    }

    @Override // mh.c
    public final int getValue() {
        return this.f18279a;
    }
}
