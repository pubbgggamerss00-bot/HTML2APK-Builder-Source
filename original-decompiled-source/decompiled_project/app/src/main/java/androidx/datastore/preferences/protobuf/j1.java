package androidx.datastore.preferences.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    public static final j1 f2044a;

    /* renamed from: b, reason: collision with root package name */
    public static final j1 f2045b;

    /* renamed from: c, reason: collision with root package name */
    public static final j1 f2046c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ j1[] f2047d;

    static {
        j1 j1Var = new j1("PROTO2", 0);
        f2044a = j1Var;
        j1 j1Var2 = new j1("PROTO3", 1);
        f2045b = j1Var2;
        j1 j1Var3 = new j1("EDITIONS", 2);
        f2046c = j1Var3;
        f2047d = new j1[]{j1Var, j1Var2, j1Var3};
    }

    public j1() {
        throw null;
    }

    public static j1 valueOf(String str) {
        return (j1) java.lang.Enum.valueOf(j1.class, str);
    }

    public static j1[] values() {
        return (j1[]) f2047d.clone();
    }
}
