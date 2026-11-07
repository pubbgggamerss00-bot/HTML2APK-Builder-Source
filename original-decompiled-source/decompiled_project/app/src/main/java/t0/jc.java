package t0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class jc {

    /* renamed from: a, reason: collision with root package name */
    public static final jc f26170a;

    /* renamed from: b, reason: collision with root package name */
    public static final jc f26171b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ jc[] f26172c;

    static {
        jc jcVar = new jc("Short", 0);
        f26170a = jcVar;
        jc jcVar2 = new jc("Long", 1);
        jc jcVar3 = new jc("Indefinite", 2);
        f26171b = jcVar3;
        f26172c = new jc[]{jcVar, jcVar2, jcVar3};
    }

    public jc() {
        throw null;
    }

    public static jc valueOf(String str) {
        return (jc) Enum.valueOf(jc.class, str);
    }

    public static jc[] values() {
        return (jc[]) f26172c.clone();
    }
}
