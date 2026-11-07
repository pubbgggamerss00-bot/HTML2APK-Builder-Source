package ae;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class h implements be.b<g> {

    /* renamed from: a, reason: collision with root package name */
    public final be.c f463a;

    /* renamed from: b, reason: collision with root package name */
    public final be.c f464b;

    /* renamed from: c, reason: collision with root package name */
    public final be.c f465c;

    /* renamed from: d, reason: collision with root package name */
    public final be.c f466d;

    public h(be.c cVar, be.c cVar2, be.c cVar3, be.c cVar4) {
        this.f463a = cVar;
        this.f464b = cVar2;
        this.f465c = cVar3;
        this.f466d = cVar4;
    }

    @Override // og.a
    public final Object get() {
        return new g((fe.b) this.f463a.f4213a, (fe.b) this.f464b.f4213a, (fe.a) this.f465c.f4213a, (Executor) this.f466d.f4213a);
    }
}
