package t0;

/* loaded from: classes.dex */
public final class ia implements t.y0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f26104a;

    /* renamed from: b, reason: collision with root package name */
    public final float f26105b;

    /* renamed from: c, reason: collision with root package name */
    public final long f26106c;

    public static final class a implements q1.e1 {
        public a() {
        }

        @Override // q1.e1
        public final long a() {
            return ia.this.f26106c;
        }
    }

    public ia(boolean z10, float f10, long j10) {
        this.f26104a = z10;
        this.f26105b = f10;
        this.f26106c = j10;
    }

    @Override // t.y0
    public final i2.j a(x.l lVar) {
        return new t2(lVar, this.f26104a, this.f26105b, new a());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ia)) {
            return false;
        }
        ia iaVar = (ia) obj;
        if (this.f26104a == iaVar.f26104a && f3.h.a(this.f26105b, iaVar.f26105b)) {
            return q1.b1.d(this.f26106c, iaVar.f26106c);
        }
        return false;
    }

    @Override // t.y0
    public final int hashCode() {
        int iA = r.z1.a(this.f26105b, Boolean.hashCode(this.f26104a) * 31, 961);
        int i10 = q1.b1.f21655i;
        return Long.hashCode(this.f26106c) + iA;
    }
}
