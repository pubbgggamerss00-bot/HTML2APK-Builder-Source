package yd;

/* JADX WARN: Method from annotation default annotation not found: intEncoding */
/* loaded from: classes2.dex */
public @interface d {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f34385a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ a[] f34386b;

        static {
            a aVar = new a("DEFAULT", 0);
            f34385a = aVar;
            f34386b = new a[]{aVar, new a("SIGNED", 1), new a("FIXED", 2)};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f34386b.clone();
        }
    }
}
