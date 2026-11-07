package androidx.work;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a {
    public static final a s;

    /* renamed from: t, reason: collision with root package name */
    public static final a f1752t;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ a[] f1753u;

    static {
        a aVar = new a("EXPONENTIAL", 0);
        s = aVar;
        a aVar2 = new a("LINEAR", 1);
        f1752t = aVar2;
        f1753u = new a[]{aVar, aVar2};
    }

    public a() {
        throw null;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f1753u.clone();
    }
}
