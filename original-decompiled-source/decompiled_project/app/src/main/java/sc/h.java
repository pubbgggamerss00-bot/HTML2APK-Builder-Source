package sc;

import ed.g0;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final g0 f24805a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f24806a;

        /* renamed from: b, reason: collision with root package name */
        public static final a f24807b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a[] f24808c;

        static {
            a aVar = new a("TINK", 0);
            f24806a = aVar;
            a aVar2 = new a("LEGACY", 1);
            a aVar3 = new a("RAW", 2);
            f24807b = aVar3;
            f24808c = new a[]{aVar, aVar2, aVar3, new a("CRUNCHY", 3)};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f24808c.clone();
        }
    }

    public h(g0 g0Var) {
        this.f24805a = g0Var;
    }
}
