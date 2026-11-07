package androidx.work;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class l {
    public static final l s;

    /* renamed from: t, reason: collision with root package name */
    public static final l f1832t;

    /* renamed from: u, reason: collision with root package name */
    public static final l f1833u;

    /* renamed from: v, reason: collision with root package name */
    public static final l f1834v;

    /* renamed from: w, reason: collision with root package name */
    public static final l f1835w;

    /* renamed from: x, reason: collision with root package name */
    public static final l f1836x;

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ l[] f1837y;

    static {
        l lVar = new l("NOT_REQUIRED", 0);
        s = lVar;
        l lVar2 = new l("CONNECTED", 1);
        f1832t = lVar2;
        l lVar3 = new l("UNMETERED", 2);
        f1833u = lVar3;
        l lVar4 = new l("NOT_ROAMING", 3);
        f1834v = lVar4;
        l lVar5 = new l("METERED", 4);
        f1835w = lVar5;
        l lVar6 = new l("TEMPORARILY_UNMETERED", 5);
        f1836x = lVar6;
        f1837y = new l[]{lVar, lVar2, lVar3, lVar4, lVar5, lVar6};
    }

    public l() {
        throw null;
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f1837y.clone();
    }
}
