package m0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final o f17433a;

    /* renamed from: b, reason: collision with root package name */
    public static final o f17434b;

    /* renamed from: c, reason: collision with root package name */
    public static final o f17435c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ o[] f17436d;

    static {
        o oVar = new o("BEFORE", 0);
        f17433a = oVar;
        o oVar2 = new o("ON", 1);
        f17434b = oVar2;
        o oVar3 = new o("AFTER", 2);
        f17435c = oVar3;
        o[] oVarArr = {oVar, oVar2, oVar3};
        f17436d = oVarArr;
        i0.u2.e(oVarArr);
    }

    public o() {
        throw null;
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f17436d.clone();
    }
}
