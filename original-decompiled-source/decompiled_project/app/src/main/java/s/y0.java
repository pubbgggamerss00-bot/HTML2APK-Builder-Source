package s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public static final y0 f23998a;

    /* renamed from: b, reason: collision with root package name */
    public static final y0 f23999b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ y0[] f24000c;

    static {
        y0 y0Var = new y0("Restart", 0);
        f23998a = y0Var;
        y0 y0Var2 = new y0("Reverse", 1);
        f23999b = y0Var2;
        y0[] y0VarArr = {y0Var, y0Var2};
        f24000c = y0VarArr;
        i0.u2.e(y0VarArr);
    }

    public y0() {
        throw null;
    }

    public static y0 valueOf(String str) {
        return (y0) Enum.valueOf(y0.class, str);
    }

    public static y0[] values() {
        return (y0[]) f24000c.clone();
    }
}
