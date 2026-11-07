package kotlinx.serialization.json;

import i0.u2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f16432a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f16433b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a[] f16434c;

    static {
        a aVar = new a("NONE", 0);
        f16432a = aVar;
        a aVar2 = new a("ALL_JSON_OBJECTS", 1);
        a aVar3 = new a("POLYMORPHIC", 2);
        f16433b = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        f16434c = aVarArr;
        u2.e(aVarArr);
    }

    public a() {
        throw null;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f16434c.clone();
    }
}
