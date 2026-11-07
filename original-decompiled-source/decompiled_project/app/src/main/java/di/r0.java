package di;

import i0.u2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class r0 {

    /* renamed from: c, reason: collision with root package name */
    public static final r0 f8068c;

    /* renamed from: d, reason: collision with root package name */
    public static final r0 f8069d;

    /* renamed from: e, reason: collision with root package name */
    public static final r0 f8070e;

    /* renamed from: f, reason: collision with root package name */
    public static final r0 f8071f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ r0[] f8072g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ wg.b f8073h;

    /* renamed from: a, reason: collision with root package name */
    public final char f8074a;

    /* renamed from: b, reason: collision with root package name */
    public final char f8075b;

    static {
        r0 r0Var = new r0("OBJ", 0, '{', '}');
        f8068c = r0Var;
        r0 r0Var2 = new r0("LIST", 1, '[', ']');
        f8069d = r0Var2;
        r0 r0Var3 = new r0("MAP", 2, '{', '}');
        f8070e = r0Var3;
        r0 r0Var4 = new r0("POLY_OBJ", 3, '[', ']');
        f8071f = r0Var4;
        r0[] r0VarArr = {r0Var, r0Var2, r0Var3, r0Var4};
        f8072g = r0VarArr;
        f8073h = u2.e(r0VarArr);
    }

    public r0(String str, int i10, char c10, char c11) {
        this.f8074a = c10;
        this.f8075b = c11;
    }

    public static r0 valueOf(String str) {
        return (r0) Enum.valueOf(r0.class, str);
    }

    public static r0[] values() {
        return (r0[]) f8072g.clone();
    }
}
