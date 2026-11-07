package r2;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public String f14280a;

    /* renamed from: b, reason: collision with root package name */
    public androidx.work.p f14281b = androidx.work.p.s;

    /* renamed from: c, reason: collision with root package name */
    public String f14282c;

    /* renamed from: d, reason: collision with root package name */
    public String f14283d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.work.f f14284e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.work.f f14285f;

    /* renamed from: g, reason: collision with root package name */
    public long f14286g;
    public long h;

    /* renamed from: i, reason: collision with root package name */
    public long f14287i;

    /* renamed from: j, reason: collision with root package name */
    public androidx.work.d f14288j;

    /* renamed from: k, reason: collision with root package name */
    public int f14289k;

    /* renamed from: l, reason: collision with root package name */
    public androidx.work.a f14290l;

    /* renamed from: m, reason: collision with root package name */
    public long f14291m;

    /* renamed from: n, reason: collision with root package name */
    public long f14292n;

    /* renamed from: o, reason: collision with root package name */
    public long f14293o;

    /* renamed from: p, reason: collision with root package name */
    public long f14294p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f14295q;

    /* renamed from: r, reason: collision with root package name */
    public androidx.work.o f14296r;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public String f14297a;

        /* renamed from: b, reason: collision with root package name */
        public androidx.work.p f14298b;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f14298b != aVar.f14298b) {
                return false;
            }
            return this.f14297a.equals(aVar.f14297a);
        }

        public final int hashCode() {
            return this.f14298b.hashCode() + (this.f14297a.hashCode() * 31);
        }
    }

    static {
        androidx.work.k.e("WorkSpec");
    }

    public l(String str, String str2) {
        androidx.work.f fVar = androidx.work.f.f1775c;
        this.f14284e = fVar;
        this.f14285f = fVar;
        this.f14288j = androidx.work.d.f1763i;
        this.f14290l = androidx.work.a.s;
        this.f14291m = 30000L;
        this.f14294p = -1L;
        this.f14296r = androidx.work.o.s;
        this.f14280a = str;
        this.f14282c = str2;
    }

    public final long a() {
        int i6;
        if (this.f14281b == androidx.work.p.s && (i6 = this.f14289k) > 0) {
            return Math.min(18000000L, this.f14290l == androidx.work.a.f1752t ? this.f14291m * i6 : (long) Math.scalb(this.f14291m, i6 - 1)) + this.f14292n;
        }
        if (!c()) {
            long jCurrentTimeMillis = this.f14292n;
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            return jCurrentTimeMillis + this.f14286g;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        long j6 = this.f14292n;
        if (j6 == 0) {
            j6 = this.f14286g + jCurrentTimeMillis2;
        }
        long j7 = this.f14287i;
        long j8 = this.h;
        if (j7 != j8) {
            return j6 + j8 + (j6 == 0 ? j7 * (-1) : 0L);
        }
        return j6 + (j6 != 0 ? j8 : 0L);
    }

    public final boolean b() {
        return !androidx.work.d.f1763i.equals(this.f14288j);
    }

    public final boolean c() {
        return this.h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.f14286g != lVar.f14286g || this.h != lVar.h || this.f14287i != lVar.f14287i || this.f14289k != lVar.f14289k || this.f14291m != lVar.f14291m || this.f14292n != lVar.f14292n || this.f14293o != lVar.f14293o || this.f14294p != lVar.f14294p || this.f14295q != lVar.f14295q || !this.f14280a.equals(lVar.f14280a) || this.f14281b != lVar.f14281b || !this.f14282c.equals(lVar.f14282c)) {
                return false;
            }
            String str = this.f14283d;
            if (str == null ? lVar.f14283d != null : !str.equals(lVar.f14283d)) {
                return false;
            }
            if (this.f14284e.equals(lVar.f14284e) && this.f14285f.equals(lVar.f14285f) && this.f14288j.equals(lVar.f14288j) && this.f14290l == lVar.f14290l && this.f14296r == lVar.f14296r) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iD = androidx.camera.view.g.d((this.f14281b.hashCode() + (this.f14280a.hashCode() * 31)) * 31, 31, this.f14282c);
        String str = this.f14283d;
        int iHashCode = (this.f14285f.hashCode() + ((this.f14284e.hashCode() + ((iD + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        long j6 = this.f14286g;
        int i6 = (iHashCode + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j7 = this.h;
        int i7 = (i6 + ((int) (j7 ^ (j7 >>> 32)))) * 31;
        long j8 = this.f14287i;
        int iHashCode2 = (this.f14290l.hashCode() + ((((this.f14288j.hashCode() + ((i7 + ((int) (j8 ^ (j8 >>> 32)))) * 31)) * 31) + this.f14289k) * 31)) * 31;
        long j9 = this.f14291m;
        int i8 = (iHashCode2 + ((int) (j9 ^ (j9 >>> 32)))) * 31;
        long j10 = this.f14292n;
        int i9 = (i8 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f14293o;
        int i10 = (i9 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f14294p;
        return this.f14296r.hashCode() + ((((i10 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.f14295q ? 1 : 0)) * 31);
    }

    public final String toString() {
        return androidx.activity.m.e(new StringBuilder("{WorkSpec: "), this.f14280a, "}");
    }
}
