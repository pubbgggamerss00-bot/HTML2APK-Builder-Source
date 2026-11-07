package z;

import i0.u2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public static final z0 f34696a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ z0[] f34697b;

    static {
        z0 z0Var = new z0("Horizontal", 0);
        f34696a = z0Var;
        z0[] z0VarArr = {z0Var, new z0("Vertical", 1)};
        f34697b = z0VarArr;
        u2.e(z0VarArr);
    }

    public z0() {
        throw null;
    }

    public static z0 valueOf(String str) {
        return (z0) Enum.valueOf(z0.class, str);
    }

    public static z0[] values() {
        return (z0[]) f34697b.clone();
    }
}
