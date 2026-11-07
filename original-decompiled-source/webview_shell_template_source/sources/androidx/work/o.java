package androidx.work;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class o {
    public static final o s;

    /* renamed from: t, reason: collision with root package name */
    public static final o f1841t;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ o[] f1842u;

    static {
        o oVar = new o("RUN_AS_NON_EXPEDITED_WORK_REQUEST", 0);
        s = oVar;
        o oVar2 = new o("DROP_WORK_REQUEST", 1);
        f1841t = oVar2;
        f1842u = new o[]{oVar, oVar2};
    }

    public o() {
        throw null;
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f1842u.clone();
    }
}
