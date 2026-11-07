package g2;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final o f11314a = new o(a.f11316a);

    /* renamed from: b, reason: collision with root package name */
    public static final o f11315b = new o(C0099b.f11317a);

    public /* synthetic */ class a extends kotlin.jvm.internal.p implements eh.p<Integer, Integer, Integer> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f11316a = new a(2, gh.a.class, "min", "min(II)I", 1);

        @Override // eh.p
        public final Integer invoke(Integer num, Integer num2) {
            return Integer.valueOf(Math.min(num.intValue(), num2.intValue()));
        }
    }

    /* renamed from: g2.b$b, reason: collision with other inner class name */
    public /* synthetic */ class C0099b extends kotlin.jvm.internal.p implements eh.p<Integer, Integer, Integer> {

        /* renamed from: a, reason: collision with root package name */
        public static final C0099b f11317a = new C0099b(2, gh.a.class, "max", "max(II)I", 1);

        @Override // eh.p
        public final Integer invoke(Integer num, Integer num2) {
            return Integer.valueOf(Math.max(num.intValue(), num2.intValue()));
        }
    }
}
