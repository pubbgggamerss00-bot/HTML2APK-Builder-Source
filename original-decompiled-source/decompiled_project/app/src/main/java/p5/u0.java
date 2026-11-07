package p5;

/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f21277a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f21278b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21279c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f21280d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f21281e;

    /* renamed from: f, reason: collision with root package name */
    public final int f21282f;

    /* renamed from: g, reason: collision with root package name */
    public final int f21283g;

    /* renamed from: h, reason: collision with root package name */
    public final int f21284h;

    /* renamed from: i, reason: collision with root package name */
    public final int f21285i;

    /* renamed from: j, reason: collision with root package name */
    public String f21286j;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f21287a;

        /* renamed from: b, reason: collision with root package name */
        public String f21288b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f21289c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f21290d;

        /* renamed from: e, reason: collision with root package name */
        public int f21291e;

        /* renamed from: f, reason: collision with root package name */
        public int f21292f;
    }

    public u0() {
        throw null;
    }

    public u0(boolean z10, boolean z11, int i10, boolean z12, boolean z13, int i11, int i12) {
        this.f21277a = z10;
        this.f21278b = z11;
        this.f21279c = i10;
        this.f21280d = z12;
        this.f21281e = z13;
        this.f21282f = i11;
        this.f21283g = i12;
        this.f21284h = -1;
        this.f21285i = -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return this.f21277a == u0Var.f21277a && this.f21278b == u0Var.f21278b && this.f21279c == u0Var.f21279c && kotlin.jvm.internal.r.a(this.f21286j, u0Var.f21286j) && this.f21280d == u0Var.f21280d && this.f21281e == u0Var.f21281e && this.f21282f == u0Var.f21282f && this.f21283g == u0Var.f21283g && this.f21284h == u0Var.f21284h && this.f21285i == u0Var.f21285i;
    }

    public final int hashCode() {
        int i10 = (((((this.f21277a ? 1 : 0) * 31) + (this.f21278b ? 1 : 0)) * 31) + this.f21279c) * 31;
        String str = this.f21286j;
        return ((((((((((((i10 + (str != null ? str.hashCode() : 0)) * 29791) + (this.f21280d ? 1 : 0)) * 31) + (this.f21281e ? 1 : 0)) * 31) + this.f21282f) * 31) + this.f21283g) * 31) + this.f21284h) * 31) + this.f21285i;
    }

    public final String toString() {
        String str = this.f21286j;
        StringBuilder sb = new StringBuilder();
        sb.append(u0.class.getSimpleName());
        sb.append("(");
        if (this.f21277a) {
            sb.append("launchSingleTop ");
        }
        if (this.f21278b) {
            sb.append("restoreState ");
        }
        if ((str != null || this.f21279c != -1) && str != null) {
            sb.append("popUpTo(");
            sb.append(str);
            if (this.f21280d) {
                sb.append(" inclusive");
            }
            if (this.f21281e) {
                sb.append(" saveState");
            }
            sb.append(")");
        }
        int i10 = this.f21285i;
        int i11 = this.f21284h;
        int i12 = this.f21283g;
        int i13 = this.f21282f;
        if (i13 != -1 || i12 != -1 || i11 != -1 || i10 != -1) {
            sb.append("anim(enterAnim=0x");
            sb.append(Integer.toHexString(i13));
            sb.append(" exitAnim=0x");
            sb.append(Integer.toHexString(i12));
            sb.append(" popEnterAnim=0x");
            sb.append(Integer.toHexString(i11));
            sb.append(" popExitAnim=0x");
            sb.append(Integer.toHexString(i10));
            sb.append(")");
        }
        String string = sb.toString();
        kotlin.jvm.internal.r.d(string, "toString(...)");
        return string;
    }
}
