package t6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final t f28052a;

    /* renamed from: b, reason: collision with root package name */
    public static final t f28053b;

    /* renamed from: c, reason: collision with root package name */
    public static final t f28054c;

    /* renamed from: d, reason: collision with root package name */
    public static final t f28055d;

    /* renamed from: e, reason: collision with root package name */
    public static final t f28056e;

    /* renamed from: f, reason: collision with root package name */
    public static final t f28057f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ t[] f28058g;

    static {
        t tVar = new t("NOT_REQUIRED", 0);
        f28052a = tVar;
        t tVar2 = new t("CONNECTED", 1);
        f28053b = tVar2;
        t tVar3 = new t("UNMETERED", 2);
        f28054c = tVar3;
        t tVar4 = new t("NOT_ROAMING", 3);
        f28055d = tVar4;
        t tVar5 = new t("METERED", 4);
        f28056e = tVar5;
        t tVar6 = new t("TEMPORARILY_UNMETERED", 5);
        f28057f = tVar6;
        f28058g = new t[]{tVar, tVar2, tVar3, tVar4, tVar5, tVar6};
    }

    public t() {
        throw null;
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) f28058g.clone();
    }
}
