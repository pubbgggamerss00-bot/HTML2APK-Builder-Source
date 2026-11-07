package mc;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final a f18159a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f18160b;

    /* renamed from: c, reason: collision with root package name */
    public static final c f18161c;

    /* renamed from: d, reason: collision with root package name */
    public static final d f18162d;

    /* renamed from: e, reason: collision with root package name */
    public static final e f18163e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ g[] f18164f;

    public enum a extends g {
        public a() {
            super("EXPLICIT", 0);
        }

        @Override // mc.g
        public final boolean a() {
            return false;
        }
    }

    public enum b extends g {
        public b() {
            super("REPLACED", 1);
        }

        @Override // mc.g
        public final boolean a() {
            return false;
        }
    }

    public enum c extends g {
        public c() {
            super("COLLECTED", 2);
        }

        @Override // mc.g
        public final boolean a() {
            return true;
        }
    }

    public enum d extends g {
        public d() {
            super("EXPIRED", 3);
        }

        @Override // mc.g
        public final boolean a() {
            return true;
        }
    }

    public enum e extends g {
        public e() {
            super("SIZE", 4);
        }

        @Override // mc.g
        public final boolean a() {
            return true;
        }
    }

    static {
        a aVar = new a();
        f18159a = aVar;
        b bVar = new b();
        f18160b = bVar;
        c cVar = new c();
        f18161c = cVar;
        d dVar = new d();
        f18162d = dVar;
        e eVar = new e();
        f18163e = eVar;
        f18164f = new g[]{aVar, bVar, cVar, dVar, eVar};
    }

    public g() {
        throw null;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f18164f.clone();
    }

    public abstract boolean a();
}
