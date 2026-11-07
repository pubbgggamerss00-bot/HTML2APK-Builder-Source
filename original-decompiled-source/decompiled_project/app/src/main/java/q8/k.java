package q8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final k f22267a;

    /* renamed from: b, reason: collision with root package name */
    public static final k f22268b;

    /* renamed from: c, reason: collision with root package name */
    public static final k f22269c;

    /* renamed from: d, reason: collision with root package name */
    public static final k f22270d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ k[] f22271e;

    static {
        k kVar = new k("WALK", 0);
        f22267a = kVar;
        k kVar2 = new k("IDLE", 1);
        f22268b = kVar2;
        k kVar3 = new k("FLIP", 2);
        f22269c = kVar3;
        k kVar4 = new k("PURR", 3);
        f22270d = kVar4;
        k[] kVarArr = {kVar, kVar2, kVar3, kVar4};
        f22271e = kVarArr;
        i0.u2.e(kVarArr);
    }

    public k() {
        throw null;
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f22271e.clone();
    }
}
