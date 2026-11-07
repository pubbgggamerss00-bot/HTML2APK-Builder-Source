package q9;

/* loaded from: classes.dex */
public abstract class p {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f22586a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ a[] f22587b;

        /* JADX INFO: Fake field, exist only in values array */
        a EF0;

        static {
            a aVar = new a("UNKNOWN", 0);
            a aVar2 = new a("ANDROID_FIREBASE", 1);
            f22586a = aVar2;
            f22587b = new a[]{aVar, aVar2};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f22587b.clone();
        }
    }

    public abstract q9.a a();

    public abstract a b();
}
