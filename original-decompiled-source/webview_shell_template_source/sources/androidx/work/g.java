package androidx.work;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class g {
    public static final g s;

    /* renamed from: t, reason: collision with root package name */
    public static final g f1778t;

    /* renamed from: u, reason: collision with root package name */
    public static final g f1779u;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ g[] f1780v;

    /* JADX INFO: Fake field, exist only in values array */
    g EF0;

    static {
        g gVar = new g("REPLACE", 0);
        g gVar2 = new g("KEEP", 1);
        s = gVar2;
        g gVar3 = new g("APPEND", 2);
        f1778t = gVar3;
        g gVar4 = new g("APPEND_OR_REPLACE", 3);
        f1779u = gVar4;
        f1780v = new g[]{gVar, gVar2, gVar3, gVar4};
    }

    public g() {
        throw null;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f1780v.clone();
    }
}
