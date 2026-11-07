package y5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class z {
    public static final z s;

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ z[] f15377t;

    static {
        z zVar = new z("DEFAULT", 0);
        s = zVar;
        f15377t = new z[]{zVar, new z("LAZY", 1), new z("ATOMIC", 2), new z("UNDISPATCHED", 3)};
    }

    public z() {
        throw null;
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) f15377t.clone();
    }
}
