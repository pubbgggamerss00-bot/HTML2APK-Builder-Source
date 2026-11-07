package ph;

/* loaded from: classes2.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public static final r0 f21572a;

    static {
        String property;
        qh.g gVar;
        int i10 = uh.x.f29772a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            wh.c cVar = z0.f21632a;
            qh.g gVar2 = uh.o.f29764a;
            gVar2.getClass();
            gVar = !(gVar2 instanceof r0) ? n0.f21570k : gVar2;
        } else {
            gVar = n0.f21570k;
        }
        f21572a = gVar;
    }
}
