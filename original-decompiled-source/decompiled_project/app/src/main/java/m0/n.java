package m0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final n f17423a;

    /* renamed from: b, reason: collision with root package name */
    public static final n f17424b;

    /* renamed from: c, reason: collision with root package name */
    public static final n f17425c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ n[] f17426d;

    static {
        n nVar = new n("CROSSED", 0);
        f17423a = nVar;
        n nVar2 = new n("NOT_CROSSED", 1);
        f17424b = nVar2;
        n nVar3 = new n("COLLAPSED", 2);
        f17425c = nVar3;
        n[] nVarArr = {nVar, nVar2, nVar3};
        f17426d = nVarArr;
        i0.u2.e(nVarArr);
    }

    public n() {
        throw null;
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f17426d.clone();
    }
}
