package s9;

/* loaded from: classes.dex */
public abstract class f {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f24776a;

        /* renamed from: b, reason: collision with root package name */
        public static final a f24777b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f24778c;

        /* renamed from: d, reason: collision with root package name */
        public static final a f24779d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ a[] f24780e;

        static {
            a aVar = new a("OK", 0);
            f24776a = aVar;
            a aVar2 = new a("TRANSIENT_ERROR", 1);
            f24777b = aVar2;
            a aVar3 = new a("FATAL_ERROR", 2);
            f24778c = aVar3;
            a aVar4 = new a("INVALID_PAYLOAD", 3);
            f24779d = aVar4;
            f24780e = new a[]{aVar, aVar2, aVar3, aVar4};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f24780e.clone();
        }
    }

    public abstract long a();

    public abstract a b();
}
