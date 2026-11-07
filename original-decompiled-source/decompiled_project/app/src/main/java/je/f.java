package je;

import je.b;

/* loaded from: classes2.dex */
public abstract class f {

    public static abstract class a {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f15704a;

        /* renamed from: b, reason: collision with root package name */
        public static final b f15705b;

        /* renamed from: c, reason: collision with root package name */
        public static final b f15706c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ b[] f15707d;

        static {
            b bVar = new b("OK", 0);
            f15704a = bVar;
            b bVar2 = new b("BAD_CONFIG", 1);
            f15705b = bVar2;
            b bVar3 = new b("AUTH_ERROR", 2);
            f15706c = bVar3;
            f15707d = new b[]{bVar, bVar2, bVar3};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f15707d.clone();
        }
    }

    public static b.a a() {
        b.a aVar = new b.a();
        aVar.f15689b = 0L;
        return aVar;
    }

    public abstract b b();

    public abstract String c();

    public abstract long d();
}
