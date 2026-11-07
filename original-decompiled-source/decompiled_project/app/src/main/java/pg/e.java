package pg;

import i0.u2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f21459a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ e[] f21460b;

    static {
        e eVar = new e("WARNING", 0);
        f21459a = eVar;
        e[] eVarArr = {eVar, new e("ERROR", 1), new e("HIDDEN", 2)};
        f21460b = eVarArr;
        u2.e(eVarArr);
    }

    public e() {
        throw null;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f21460b.clone();
    }
}
