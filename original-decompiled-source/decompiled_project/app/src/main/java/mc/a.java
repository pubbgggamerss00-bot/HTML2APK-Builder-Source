package mc;

import java.util.logging.Logger;
import lc.u;
import lc.w;

/* loaded from: classes2.dex */
public final class a<K, V> {

    /* renamed from: a, reason: collision with root package name */
    public static final u.c f18037a = new u.c(new C0177a());

    /* renamed from: b, reason: collision with root package name */
    public static final b f18038b = new b();

    /* renamed from: mc.a$a, reason: collision with other inner class name */
    public static class C0177a {
    }

    public static class b extends w {
        @Override // lc.w
        public final long a() {
            return 0L;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public static final c f18039a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ c[] f18040b;

        static {
            c cVar = new c("INSTANCE", 0);
            f18039a = cVar;
            f18040b = new c[]{cVar};
        }

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f18040b.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public static final d f18041a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ d[] f18042b;

        static {
            d dVar = new d("INSTANCE", 0);
            f18041a = dVar;
            f18042b = new d[]{dVar};
        }

        public d() {
            throw null;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f18042b.clone();
        }
    }

    static {
        Logger.getLogger(a.class.getName());
    }

    public final String toString() {
        return new lc.h(a.class.getSimpleName()).toString();
    }
}
