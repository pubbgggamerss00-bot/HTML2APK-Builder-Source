package k8;

import i0.u2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final l f16149a;

    /* renamed from: b, reason: collision with root package name */
    public static final l f16150b;

    /* renamed from: c, reason: collision with root package name */
    public static final l f16151c;

    /* renamed from: d, reason: collision with root package name */
    public static final l f16152d;

    /* renamed from: e, reason: collision with root package name */
    public static final l f16153e;

    /* renamed from: f, reason: collision with root package name */
    public static final l f16154f;

    /* renamed from: g, reason: collision with root package name */
    public static final l f16155g;

    /* renamed from: h, reason: collision with root package name */
    public static final l f16156h;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ l[] f16157j;

    static {
        l lVar = new l("CLICKS", 0);
        f16149a = lVar;
        l lVar2 = new l("PAWS", 1);
        f16150b = lVar2;
        l lVar3 = new l("HEARTS", 2);
        f16151c = lVar3;
        l lVar4 = new l("CATS", 3);
        f16152d = lVar4;
        l lVar5 = new l("WORKERS", 4);
        f16153e = lVar5;
        l lVar6 = new l("BUILDINGS", 5);
        f16154f = lVar6;
        l lVar7 = new l("FARM_LEVEL", 6);
        f16155g = lVar7;
        l lVar8 = new l("EVENTS", 7);
        f16156h = lVar8;
        l[] lVarArr = {lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7, lVar8};
        f16157j = lVarArr;
        u2.e(lVarArr);
    }

    public l() {
        throw null;
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f16157j.clone();
    }
}
