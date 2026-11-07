package androidx.lifecycle;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class h {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES;
        public static final C0015a Companion;
        public static final a ON_ANY;
        public static final a ON_CREATE;
        public static final a ON_DESTROY;
        public static final a ON_PAUSE;
        public static final a ON_RESUME;
        public static final a ON_START;
        public static final a ON_STOP;

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        /* renamed from: androidx.lifecycle.h$a$a, reason: collision with other inner class name */
        public static final class C0015a {
        }

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        public /* synthetic */ class b {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f1300a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.ON_START.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[a.ON_PAUSE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[a.ON_RESUME.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[a.ON_DESTROY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[a.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f1300a = iArr;
            }
        }

        static {
            a aVar = new a("ON_CREATE", 0);
            ON_CREATE = aVar;
            a aVar2 = new a("ON_START", 1);
            ON_START = aVar2;
            a aVar3 = new a("ON_RESUME", 2);
            ON_RESUME = aVar3;
            a aVar4 = new a("ON_PAUSE", 3);
            ON_PAUSE = aVar4;
            a aVar5 = new a("ON_STOP", 4);
            ON_STOP = aVar5;
            a aVar6 = new a("ON_DESTROY", 5);
            ON_DESTROY = aVar6;
            a aVar7 = new a("ON_ANY", 6);
            ON_ANY = aVar7;
            $VALUES = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7};
            Companion = new C0015a();
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        public final b a() {
            switch (b.f1300a[ordinal()]) {
                case 1:
                case 2:
                    return b.f1302u;
                case 3:
                case 4:
                    return b.f1303v;
                case 5:
                    return b.f1304w;
                case 6:
                    return b.s;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class b {
        public static final b s;

        /* renamed from: t, reason: collision with root package name */
        public static final b f1301t;

        /* renamed from: u, reason: collision with root package name */
        public static final b f1302u;

        /* renamed from: v, reason: collision with root package name */
        public static final b f1303v;

        /* renamed from: w, reason: collision with root package name */
        public static final b f1304w;

        /* renamed from: x, reason: collision with root package name */
        public static final /* synthetic */ b[] f1305x;

        static {
            b bVar = new b("DESTROYED", 0);
            s = bVar;
            b bVar2 = new b("INITIALIZED", 1);
            f1301t = bVar2;
            b bVar3 = new b("CREATED", 2);
            f1302u = bVar3;
            b bVar4 = new b("STARTED", 3);
            f1303v = bVar4;
            b bVar5 = new b("RESUMED", 4);
            f1304w = bVar5;
            f1305x = new b[]{bVar, bVar2, bVar3, bVar4, bVar5};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f1305x.clone();
        }
    }

    public abstract void a(l lVar);

    public abstract b b();

    public abstract void c(l lVar);
}
