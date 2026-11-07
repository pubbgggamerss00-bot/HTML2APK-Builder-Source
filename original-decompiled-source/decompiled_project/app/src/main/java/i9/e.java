package i9;

import i0.u2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f14309a;

    /* renamed from: b, reason: collision with root package name */
    public static final e f14310b;

    /* renamed from: c, reason: collision with root package name */
    public static final e f14311c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ e[] f14312d;

    static {
        e eVar = new e("WALK", 0);
        f14309a = eVar;
        e eVar2 = new e("IDLE", 1);
        f14310b = eVar2;
        e eVar3 = new e("PURR", 2);
        f14311c = eVar3;
        e[] eVarArr = {eVar, eVar2, eVar3};
        f14312d = eVarArr;
        u2.e(eVarArr);
    }

    public e() {
        throw null;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f14312d.clone();
    }
}
