package androidx.lifecycle;

import i0.u2;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.b<Object> f2317a = new androidx.lifecycle.b<>();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ wg.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final C0033a Companion;
        public static final a ON_ANY;
        public static final a ON_CREATE;
        public static final a ON_DESTROY;
        public static final a ON_PAUSE;
        public static final a ON_RESUME;
        public static final a ON_START;
        public static final a ON_STOP;

        /* renamed from: androidx.lifecycle.l$a$a, reason: collision with other inner class name */
        public static final class C0033a {
            public static a a(b state) {
                kotlin.jvm.internal.r.e(state, "state");
                int iOrdinal = state.ordinal();
                if (iOrdinal == 2) {
                    return a.ON_DESTROY;
                }
                if (iOrdinal == 3) {
                    return a.ON_STOP;
                }
                if (iOrdinal != 4) {
                    return null;
                }
                return a.ON_PAUSE;
            }

            public static a b(b state) {
                kotlin.jvm.internal.r.e(state, "state");
                int iOrdinal = state.ordinal();
                if (iOrdinal == 2) {
                    return a.ON_CREATE;
                }
                if (iOrdinal == 3) {
                    return a.ON_START;
                }
                if (iOrdinal != 4) {
                    return null;
                }
                return a.ON_RESUME;
            }
        }

        public /* synthetic */ class b {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f2318a;

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
                f2318a = iArr;
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
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7};
            $VALUES = aVarArr;
            $ENTRIES = u2.e(aVarArr);
            Companion = new C0033a();
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
            switch (b.f2318a[ordinal()]) {
                case 1:
                case 2:
                    return b.f2321c;
                case 3:
                case 4:
                    return b.f2322d;
                case 5:
                    return b.f2323e;
                case 6:
                    return b.f2319a;
                case 7:
                    throw new IllegalArgumentException(this + " has no target state");
                default:
                    throw new pg.l();
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f2319a;

        /* renamed from: b, reason: collision with root package name */
        public static final b f2320b;

        /* renamed from: c, reason: collision with root package name */
        public static final b f2321c;

        /* renamed from: d, reason: collision with root package name */
        public static final b f2322d;

        /* renamed from: e, reason: collision with root package name */
        public static final b f2323e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ b[] f2324f;

        static {
            b bVar = new b("DESTROYED", 0);
            f2319a = bVar;
            b bVar2 = new b("INITIALIZED", 1);
            f2320b = bVar2;
            b bVar3 = new b("CREATED", 2);
            f2321c = bVar3;
            b bVar4 = new b("STARTED", 3);
            f2322d = bVar4;
            b bVar5 = new b("RESUMED", 4);
            f2323e = bVar5;
            b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5};
            f2324f = bVarArr;
            u2.e(bVarArr);
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f2324f.clone();
        }
    }

    public abstract void a(s sVar);

    public abstract b b();

    public abstract void c(s sVar);
}
