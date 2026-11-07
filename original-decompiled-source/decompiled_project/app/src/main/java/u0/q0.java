package u0;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class q0 implements x.l {

    /* renamed from: a, reason: collision with root package name */
    public final long f29119a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f29120b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final p0 f29121c;

    public q0(x.m mVar, long j10) {
        this.f29119a = j10;
        this.f29121c = new p0(mVar.b(), this);
    }

    @Override // x.l
    public final sh.f<x.k> b() {
        return this.f29121c;
    }
}
