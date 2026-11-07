package i0;

/* loaded from: classes.dex */
public final class y4 {

    /* renamed from: a, reason: collision with root package name */
    public final int f13707a;

    /* renamed from: b, reason: collision with root package name */
    public a f13708b;

    /* renamed from: c, reason: collision with root package name */
    public a f13709c;

    /* renamed from: d, reason: collision with root package name */
    public int f13710d;

    /* renamed from: e, reason: collision with root package name */
    public Long f13711e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f13712f;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public a f13713a;

        /* renamed from: b, reason: collision with root package name */
        public y2.c0 f13714b;

        public a(a aVar, y2.c0 c0Var) {
            this.f13713a = aVar;
            this.f13714b = c0Var;
        }
    }

    public y4() {
        this(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(y2.c0 c0Var) {
        a aVar;
        y2.c0 c0Var2;
        this.f13712f = false;
        a aVar2 = this.f13708b;
        if (kotlin.jvm.internal.r.a(c0Var, aVar2 != null ? aVar2.f13714b : null)) {
            return;
        }
        String str = c0Var.f33682a.f27761b;
        a aVar3 = this.f13708b;
        if (kotlin.jvm.internal.r.a(str, (aVar3 == null || (c0Var2 = aVar3.f13714b) == null) ? null : c0Var2.f33682a.f27761b)) {
            a aVar4 = this.f13708b;
            if (aVar4 == null) {
                return;
            }
            aVar4.f13714b = c0Var;
            return;
        }
        this.f13708b = new a(this.f13708b, c0Var);
        this.f13709c = null;
        int length = c0Var.f33682a.f27761b.length() + this.f13710d;
        this.f13710d = length;
        if (length > this.f13707a) {
            a aVar5 = this.f13708b;
            if ((aVar5 != null ? aVar5.f13713a : null) == null) {
                return;
            }
            while (true) {
                if (aVar5 == null) {
                    aVar = null;
                } else {
                    a aVar6 = aVar5.f13713a;
                    if (aVar6 != null) {
                        aVar = aVar6.f13713a;
                    }
                }
                if (aVar == null) {
                    break;
                } else {
                    aVar5 = aVar5.f13713a;
                }
            }
            if (aVar5 == null) {
                return;
            }
            aVar5.f13713a = null;
        }
    }

    public y4(int i10) {
        this.f13707a = 100000;
    }
}
