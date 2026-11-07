package y5;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name */
    public static final b6.v f15333a;

    /* renamed from: b, reason: collision with root package name */
    public static final b6.v f15334b;

    /* renamed from: c, reason: collision with root package name */
    public static final b6.v f15335c;

    /* renamed from: d, reason: collision with root package name */
    public static final b6.v f15336d;

    /* renamed from: e, reason: collision with root package name */
    public static final b6.v f15337e;

    /* renamed from: f, reason: collision with root package name */
    public static final k0 f15338f = new k0(false);

    /* renamed from: g, reason: collision with root package name */
    public static final k0 f15339g = new k0(true);

    static {
        int i6 = 0;
        f15333a = new b6.v(i6, "COMPLETING_ALREADY");
        f15334b = new b6.v(i6, "COMPLETING_WAITING_CHILDREN");
        f15335c = new b6.v(i6, "COMPLETING_RETRY");
        f15336d = new b6.v(i6, "TOO_LATE_TO_CANCEL");
        f15337e = new b6.v(i6, "SEALED");
    }

    public static final Object a(Object obj) {
        return obj instanceof l ? d5.e.a(((l) obj).f15358a) : obj;
    }
}
