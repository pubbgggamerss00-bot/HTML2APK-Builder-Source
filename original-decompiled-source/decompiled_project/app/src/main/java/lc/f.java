package lc;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class f implements e<Object, String> {

    /* renamed from: a, reason: collision with root package name */
    public static final f f16942a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ f[] f16943b;

    static {
        f fVar = new f("INSTANCE", 0);
        f16942a = fVar;
        f16943b = new f[]{fVar};
    }

    public f() {
        throw null;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f16943b.clone();
    }

    @Override // lc.e
    public final String apply(Object obj) {
        obj.getClass();
        return obj.toString();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "Functions.toStringFunction()";
    }
}
