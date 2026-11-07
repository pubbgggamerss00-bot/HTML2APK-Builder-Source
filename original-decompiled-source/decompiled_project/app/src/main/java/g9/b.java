package g9;

import i0.u2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f11687a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f11688b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f11689c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f11690d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ b[] f11691e;

    static {
        b bVar = new b("LOCAL", 0);
        f11687a = bVar;
        b bVar2 = new b("URL", 1);
        f11688b = bVar2;
        b bVar3 = new b("PASTE", 2);
        f11689c = bVar3;
        b bVar4 = new b("PDF", 3);
        f11690d = bVar4;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
        f11691e = bVarArr;
        u2.e(bVarArr);
    }

    public b() {
        throw null;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f11691e.clone();
    }
}
