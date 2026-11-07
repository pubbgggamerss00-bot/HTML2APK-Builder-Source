package o1;

import i0.u2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class i0 implements h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final i0 f18864a;

    /* renamed from: b, reason: collision with root package name */
    public static final i0 f18865b;

    /* renamed from: c, reason: collision with root package name */
    public static final i0 f18866c;

    /* renamed from: d, reason: collision with root package name */
    public static final i0 f18867d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ i0[] f18868e;

    static {
        i0 i0Var = new i0("Active", 0);
        f18864a = i0Var;
        i0 i0Var2 = new i0("ActiveParent", 1);
        f18865b = i0Var2;
        i0 i0Var3 = new i0("Captured", 2);
        f18866c = i0Var3;
        i0 i0Var4 = new i0("Inactive", 3);
        f18867d = i0Var4;
        i0[] i0VarArr = {i0Var, i0Var2, i0Var3, i0Var4};
        f18868e = i0VarArr;
        u2.e(i0VarArr);
    }

    public i0() {
        throw null;
    }

    public static i0 valueOf(String str) {
        return (i0) Enum.valueOf(i0.class, str);
    }

    public static i0[] values() {
        return (i0[]) f18868e.clone();
    }

    @Override // o1.h0
    public final boolean a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return true;
        }
        if (iOrdinal == 3) {
            return false;
        }
        throw new pg.l();
    }

    @Override // o1.h0
    public final boolean b() {
        int iOrdinal = ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return false;
                }
                throw new pg.l();
            }
        }
        return true;
    }
}
