package androidx.work;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class p {
    public static final p s;

    /* renamed from: t, reason: collision with root package name */
    public static final p f1843t;

    /* renamed from: u, reason: collision with root package name */
    public static final p f1844u;

    /* renamed from: v, reason: collision with root package name */
    public static final p f1845v;

    /* renamed from: w, reason: collision with root package name */
    public static final p f1846w;

    /* renamed from: x, reason: collision with root package name */
    public static final p f1847x;

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ p[] f1848y;

    static {
        p pVar = new p("ENQUEUED", 0);
        s = pVar;
        p pVar2 = new p("RUNNING", 1);
        f1843t = pVar2;
        p pVar3 = new p("SUCCEEDED", 2);
        f1844u = pVar3;
        p pVar4 = new p("FAILED", 3);
        f1845v = pVar4;
        p pVar5 = new p("BLOCKED", 4);
        f1846w = pVar5;
        p pVar6 = new p("CANCELLED", 5);
        f1847x = pVar6;
        f1848y = new p[]{pVar, pVar2, pVar3, pVar4, pVar5, pVar6};
    }

    public p() {
        throw null;
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) f1848y.clone();
    }

    public final boolean a() {
        return this == f1844u || this == f1845v || this == f1847x;
    }
}
