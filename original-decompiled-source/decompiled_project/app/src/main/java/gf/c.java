package gf;

import cf.p;

/* loaded from: classes2.dex */
public final class c implements Comparable<c> {

    /* renamed from: e, reason: collision with root package name */
    public static final c f12070e;

    /* renamed from: a, reason: collision with root package name */
    public final long f12071a;

    /* renamed from: b, reason: collision with root package name */
    public final cf.b f12072b;

    /* renamed from: c, reason: collision with root package name */
    public final p f12073c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f12074d = false;

    static {
        c cVar = new c(0L, null, new p(65535, 0L));
        f12070e = cVar;
        cVar.f12074d = true;
    }

    public c(long j10, cf.b bVar, p pVar) {
        this.f12071a = j10;
        this.f12072b = bVar;
        this.f12073c = pVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(c cVar) {
        c cVar2 = cVar;
        if (cVar2 == null) {
            return -1;
        }
        long j10 = this.f12073c.f5553a;
        long j11 = cVar2.f12073c.f5553a;
        if (j10 < j11) {
            return -1;
        }
        return j10 > j11 ? 1 : 0;
    }
}
