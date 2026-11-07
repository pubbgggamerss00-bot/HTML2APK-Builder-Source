package androidx.work;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: i, reason: collision with root package name */
    public static final d f1763i;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1765b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1766c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1767d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1768e;

    /* renamed from: a, reason: collision with root package name */
    public l f1764a = l.s;

    /* renamed from: f, reason: collision with root package name */
    public long f1769f = -1;

    /* renamed from: g, reason: collision with root package name */
    public long f1770g = -1;
    public e h = new e();

    static {
        e eVar = new e();
        d dVar = new d();
        l lVar = l.s;
        dVar.f1764a = lVar;
        dVar.f1769f = -1L;
        dVar.f1770g = -1L;
        new e();
        dVar.f1765b = false;
        dVar.f1766c = false;
        dVar.f1764a = lVar;
        dVar.f1767d = false;
        dVar.f1768e = false;
        dVar.h = eVar;
        dVar.f1769f = -1L;
        dVar.f1770g = -1L;
        f1763i = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f1765b == dVar.f1765b && this.f1766c == dVar.f1766c && this.f1767d == dVar.f1767d && this.f1768e == dVar.f1768e && this.f1769f == dVar.f1769f && this.f1770g == dVar.f1770g && this.f1764a == dVar.f1764a) {
            return this.h.equals(dVar.h);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.f1764a.hashCode() * 31) + (this.f1765b ? 1 : 0)) * 31) + (this.f1766c ? 1 : 0)) * 31) + (this.f1767d ? 1 : 0)) * 31) + (this.f1768e ? 1 : 0)) * 31;
        long j6 = this.f1769f;
        int i6 = (iHashCode + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j7 = this.f1770g;
        return this.h.f1771a.hashCode() + ((i6 + ((int) (j7 ^ (j7 >>> 32)))) * 31);
    }
}
