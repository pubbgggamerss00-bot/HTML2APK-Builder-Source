package ug;

import i0.u2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f29706a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f29707b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f29708c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a[] f29709d;

    static {
        a aVar = new a("COROUTINE_SUSPENDED", 0);
        f29706a = aVar;
        a aVar2 = new a("UNDECIDED", 1);
        f29707b = aVar2;
        a aVar3 = new a("RESUMED", 2);
        f29708c = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        f29709d = aVarArr;
        u2.e(aVarArr);
    }

    public a() {
        throw null;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f29709d.clone();
    }
}
