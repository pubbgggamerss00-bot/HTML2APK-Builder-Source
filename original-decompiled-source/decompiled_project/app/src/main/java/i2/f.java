package i2;

/* loaded from: classes.dex */
public final class f implements o1.w {

    /* renamed from: a, reason: collision with root package name */
    public static final f f13848a = new f();

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f13849b;

    @Override // o1.w
    public final boolean a() {
        Boolean bool = f13849b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw k1.a.a("canFocus is read before it is written");
    }

    @Override // o1.w
    public final void d(boolean z10) {
        f13849b = Boolean.valueOf(z10);
    }
}
