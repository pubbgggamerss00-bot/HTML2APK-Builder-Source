package h5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a {
    public static final a s;

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ a[] f13287t;

    static {
        a aVar = new a("COROUTINE_SUSPENDED", 0);
        s = aVar;
        f13287t = new a[]{aVar, new a("UNDECIDED", 1), new a("RESUMED", 2)};
    }

    public a() {
        throw null;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f13287t.clone();
    }
}
