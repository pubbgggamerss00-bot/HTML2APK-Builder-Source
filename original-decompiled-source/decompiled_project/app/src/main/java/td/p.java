package td;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import k3.c;

/* loaded from: classes2.dex */
public final class p<V> extends k3.c<V> implements ScheduledFuture<V> {

    /* renamed from: h, reason: collision with root package name */
    public final ScheduledFuture<?> f28740h;

    public class a {
        public a() {
        }
    }

    public interface b<T> {
        ScheduledFuture a(a aVar);
    }

    public p(b<V> bVar) {
        this.f28740h = bVar.a(new a());
    }

    @Override // k3.c
    public final void c() {
        ScheduledFuture<?> scheduledFuture = this.f28740h;
        Object obj = this.f15946a;
        scheduledFuture.cancel((obj instanceof c.b) && ((c.b) obj).f15951a);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f28740h.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f28740h.getDelay(timeUnit);
    }
}
