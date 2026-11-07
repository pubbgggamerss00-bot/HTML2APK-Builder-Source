package s2;

import i0.u2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f24191a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f24192b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a[] f24193c;

    static {
        a aVar = new a("On", 0);
        f24191a = aVar;
        a aVar2 = new a("Off", 1);
        f24192b = aVar2;
        a[] aVarArr = {aVar, aVar2, new a("Indeterminate", 2)};
        f24193c = aVarArr;
        u2.e(aVarArr);
    }

    public a() {
        throw null;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f24193c.clone();
    }
}
