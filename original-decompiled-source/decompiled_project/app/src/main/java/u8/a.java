package u8;

import i0.u2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f29388a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f29389b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f29390c;

    /* renamed from: d, reason: collision with root package name */
    public static final a f29391d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a[] f29392e;

    static {
        a aVar = new a("WALK", 0);
        f29388a = aVar;
        a aVar2 = new a("IDLE", 1);
        f29389b = aVar2;
        a aVar3 = new a("PURR", 2);
        f29390c = aVar3;
        a aVar4 = new a("FLIP", 3);
        f29391d = aVar4;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
        f29392e = aVarArr;
        u2.e(aVarArr);
    }

    public a() {
        throw null;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f29392e.clone();
    }
}
