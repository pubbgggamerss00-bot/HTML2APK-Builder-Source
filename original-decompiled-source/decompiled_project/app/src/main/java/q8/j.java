package q8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f22245a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ j[] f22246b;

    static {
        j jVar = new j("MAIN", 0);
        f22245a = jVar;
        j[] jVarArr = {jVar, new j("PURPLE", 1), new j("PINK", 2), new j("BLUE", 3)};
        f22246b = jVarArr;
        i0.u2.e(jVarArr);
    }

    public j() {
        throw null;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f22246b.clone();
    }
}
