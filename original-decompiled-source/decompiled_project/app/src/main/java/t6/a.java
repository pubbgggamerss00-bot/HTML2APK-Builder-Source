package t6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f27986a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f27987b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a[] f27988c;

    static {
        a aVar = new a("EXPONENTIAL", 0);
        f27986a = aVar;
        a aVar2 = new a("LINEAR", 1);
        f27987b = aVar2;
        f27988c = new a[]{aVar, aVar2};
    }

    public a() {
        throw null;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f27988c.clone();
    }
}
