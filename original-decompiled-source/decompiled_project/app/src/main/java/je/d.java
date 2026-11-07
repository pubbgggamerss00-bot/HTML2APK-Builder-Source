package je;

/* loaded from: classes2.dex */
public abstract class d {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f15696a;

        /* renamed from: b, reason: collision with root package name */
        public static final a f15697b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a[] f15698c;

        static {
            a aVar = new a("OK", 0);
            f15696a = aVar;
            a aVar2 = new a("BAD_CONFIG", 1);
            f15697b = aVar2;
            f15698c = new a[]{aVar, aVar2};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f15698c.clone();
        }
    }

    public abstract f a();

    public abstract String b();

    public abstract String c();

    public abstract a d();

    public abstract String e();
}
