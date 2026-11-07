package m5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e {
    public static final e s;

    /* renamed from: t, reason: collision with root package name */
    public static final e f13900t;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ e[] f13901u;

    static {
        e eVar = new e("TOP_DOWN", 0);
        s = eVar;
        e eVar2 = new e("BOTTOM_UP", 1);
        f13900t = eVar2;
        f13901u = new e[]{eVar, eVar2};
    }

    public e() {
        throw null;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f13901u.clone();
    }
}
