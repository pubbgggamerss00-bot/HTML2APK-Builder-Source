package rh;

import i0.u2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f23576a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f23577b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f23578c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a[] f23579d;

    static {
        a aVar = new a("SUSPEND", 0);
        f23576a = aVar;
        a aVar2 = new a("DROP_OLDEST", 1);
        f23577b = aVar2;
        a aVar3 = new a("DROP_LATEST", 2);
        f23578c = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        f23579d = aVarArr;
        u2.e(aVarArr);
    }

    public a() {
        throw null;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f23579d.clone();
    }
}
