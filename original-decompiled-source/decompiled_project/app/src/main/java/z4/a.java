package z4;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final C0354a f34744a;

    /* renamed from: z4.a$a, reason: collision with other inner class name */
    public static class C0354a extends b {

        /* renamed from: a, reason: collision with root package name */
        public final m.c f34745a;

        /* renamed from: b, reason: collision with root package name */
        public final g f34746b;

        public C0354a(m.c cVar) {
            this.f34745a = cVar;
            g gVar = new g(cVar);
            this.f34746b = gVar;
            cVar.addTextChangedListener(gVar);
            if (z4.b.f34748b == null) {
                synchronized (z4.b.f34747a) {
                    try {
                        if (z4.b.f34748b == null) {
                            z4.b bVar = new z4.b();
                            try {
                                z4.b.f34749c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, z4.b.class.getClassLoader());
                            } catch (Throwable unused) {
                            }
                            z4.b.f34748b = bVar;
                        }
                    } finally {
                    }
                }
            }
            cVar.setEditableFactory(z4.b.f34748b);
        }
    }

    public static class b {
    }

    public a(m.c cVar) {
        this.f34744a = new C0354a(cVar);
    }
}
