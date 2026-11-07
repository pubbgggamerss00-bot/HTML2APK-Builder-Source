package ae;

import android.util.SparseArray;

/* loaded from: classes2.dex */
public final class n extends id.j {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f485c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final a f486a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f487b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f488a;

        /* renamed from: b, reason: collision with root package name */
        public static final a f489b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f490c;

        /* renamed from: d, reason: collision with root package name */
        public static final a f491d;

        /* renamed from: e, reason: collision with root package name */
        public static final a f492e;

        /* renamed from: f, reason: collision with root package name */
        public static final a f493f;

        /* renamed from: g, reason: collision with root package name */
        public static final a f494g;

        /* renamed from: h, reason: collision with root package name */
        public static final a f495h;

        /* renamed from: j, reason: collision with root package name */
        public static final a f496j;

        /* renamed from: k, reason: collision with root package name */
        public static final a f497k;

        /* renamed from: l, reason: collision with root package name */
        public static final a f498l;

        /* renamed from: m, reason: collision with root package name */
        public static final a f499m;

        /* renamed from: n, reason: collision with root package name */
        public static final a f500n;

        /* renamed from: p, reason: collision with root package name */
        public static final /* synthetic */ a[] f501p;

        static {
            a aVar = new a("OK", 0);
            f488a = aVar;
            a aVar2 = new a("CANCELLED", 1);
            f489b = aVar2;
            a aVar3 = new a("UNKNOWN", 2);
            f490c = aVar3;
            a aVar4 = new a("INVALID_ARGUMENT", 3);
            f491d = aVar4;
            a aVar5 = new a("DEADLINE_EXCEEDED", 4);
            f492e = aVar5;
            a aVar6 = new a("NOT_FOUND", 5);
            f493f = aVar6;
            a aVar7 = new a("ALREADY_EXISTS", 6);
            a aVar8 = new a("PERMISSION_DENIED", 7);
            f494g = aVar8;
            a aVar9 = new a("RESOURCE_EXHAUSTED", 8);
            f495h = aVar9;
            a aVar10 = new a("FAILED_PRECONDITION", 9);
            a aVar11 = new a("ABORTED", 10);
            f496j = aVar11;
            a aVar12 = new a("OUT_OF_RANGE", 11);
            a aVar13 = new a("UNIMPLEMENTED", 12);
            f497k = aVar13;
            a aVar14 = new a("INTERNAL", 13);
            f498l = aVar14;
            a aVar15 = new a("UNAVAILABLE", 14);
            f499m = aVar15;
            a aVar16 = new a("DATA_LOSS", 15);
            a aVar17 = new a("UNAUTHENTICATED", 16);
            f500n = aVar17;
            f501p = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17};
            SparseArray sparseArray = new SparseArray();
            for (a aVar18 : values()) {
                a aVar19 = (a) sparseArray.get(aVar18.ordinal());
                if (aVar19 != null) {
                    throw new IllegalStateException(("Code value duplication between " + aVar19 + '&' + aVar18.name()).toString());
                }
                sparseArray.put(aVar18.ordinal(), aVar18);
            }
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f501p.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String message, a code, Object obj) {
        super(message);
        kotlin.jvm.internal.r.e(message, "message");
        kotlin.jvm.internal.r.e(code, "code");
        this.f486a = code;
        this.f487b = obj;
    }

    public n(String str, a aVar, Exception exc) {
        super(str, exc);
        this.f486a = aVar;
        this.f487b = null;
    }
}
