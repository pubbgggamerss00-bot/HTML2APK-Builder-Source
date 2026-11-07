package l2;

import i0.u2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final b f16684c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f16685d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f16686e;

    /* renamed from: f, reason: collision with root package name */
    public static final b f16687f;

    /* renamed from: g, reason: collision with root package name */
    public static final b f16688g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ b[] f16689h;

    /* renamed from: a, reason: collision with root package name */
    public final int f16690a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16691b;

    static {
        b bVar = new b("Copy", 0, 0);
        f16684c = bVar;
        b bVar2 = new b("Paste", 1, 1);
        f16685d = bVar2;
        b bVar3 = new b("Cut", 2, 2);
        f16686e = bVar3;
        b bVar4 = new b("SelectAll", 3, 3);
        f16687f = bVar4;
        b bVar5 = new b("Autofill", 4, 4);
        f16688g = bVar5;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5};
        f16689h = bVarArr;
        u2.e(bVarArr);
    }

    public b(String str, int i10, int i11) {
        this.f16690a = i11;
        this.f16691b = i11;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f16689h.clone();
    }
}
