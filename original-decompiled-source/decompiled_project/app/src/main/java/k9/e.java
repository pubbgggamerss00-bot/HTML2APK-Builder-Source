package k9;

import i0.u2;
import pg.l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f16205a;

    /* renamed from: b, reason: collision with root package name */
    public static final e f16206b;

    /* renamed from: c, reason: collision with root package name */
    public static final e f16207c;

    /* renamed from: d, reason: collision with root package name */
    public static final e f16208d;

    /* renamed from: e, reason: collision with root package name */
    public static final e f16209e;

    /* renamed from: f, reason: collision with root package name */
    public static final e f16210f;

    /* renamed from: g, reason: collision with root package name */
    public static final e f16211g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ e[] f16212h;

    static {
        e eVar = new e("WHITE", 0);
        f16205a = eVar;
        e eVar2 = new e("SKY", 1);
        f16206b = eVar2;
        e eVar3 = new e("ROSE", 2);
        f16207c = eVar3;
        e eVar4 = new e("MINT", 3);
        f16208d = eVar4;
        e eVar5 = new e("PURPLE", 4);
        f16209e = eVar5;
        e eVar6 = new e("BLACK", 5);
        f16210f = eVar6;
        e eVar7 = new e("AMOLED", 6);
        f16211g = eVar7;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7};
        f16212h = eVarArr;
        u2.e(eVarArr);
    }

    public e() {
        throw null;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f16212h.clone();
    }

    public final boolean a() {
        switch (ordinal()) {
            case 0:
            case 1:
            case 2:
            case 3:
                return false;
            case 4:
            case 5:
            case 6:
                return true;
            default:
                throw new l();
        }
    }
}
