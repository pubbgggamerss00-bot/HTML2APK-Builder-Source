package t0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class bf {

    /* renamed from: a, reason: collision with root package name */
    public static final bf f25554a;

    /* renamed from: b, reason: collision with root package name */
    public static final bf f25555b;

    /* renamed from: c, reason: collision with root package name */
    public static final bf f25556c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ bf[] f25557d;

    static {
        bf bfVar = new bf("Tabs", 0);
        f25554a = bfVar;
        bf bfVar2 = new bf("Divider", 1);
        f25555b = bfVar2;
        bf bfVar3 = new bf("Indicator", 2);
        f25556c = bfVar3;
        f25557d = new bf[]{bfVar, bfVar2, bfVar3};
    }

    public bf() {
        throw null;
    }

    public static bf valueOf(String str) {
        return (bf) Enum.valueOf(bf.class, str);
    }

    public static bf[] values() {
        return (bf[]) f25557d.clone();
    }
}
