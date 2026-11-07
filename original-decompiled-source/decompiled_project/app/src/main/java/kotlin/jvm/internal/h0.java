package kotlin.jvm.internal;

/* loaded from: classes2.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final i0 f16332a;

    /* renamed from: b, reason: collision with root package name */
    public static final kh.c[] f16333b;

    static {
        i0 i0Var = null;
        try {
            i0Var = (i0) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (i0Var == null) {
            i0Var = new i0();
        }
        f16332a = i0Var;
        f16333b = new kh.c[0];
    }

    public static h a(Class cls) {
        f16332a.getClass();
        return new h(cls);
    }
}
