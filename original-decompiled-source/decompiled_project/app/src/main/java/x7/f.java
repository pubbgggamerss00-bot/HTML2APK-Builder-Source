package x7;

import i0.u2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f32190a;

    /* renamed from: b, reason: collision with root package name */
    public static final f f32191b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ f[] f32192c;

    static {
        f fVar = new f("FILL", 0);
        f32190a = fVar;
        f fVar2 = new f("FIT", 1);
        f32191b = fVar2;
        f[] fVarArr = {fVar, fVar2};
        f32192c = fVarArr;
        u2.e(fVarArr);
    }

    public f() {
        throw null;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f32192c.clone();
    }
}
