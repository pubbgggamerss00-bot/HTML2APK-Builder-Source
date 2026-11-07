package qc;

import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import mc.b;
import qc.h;

/* loaded from: classes2.dex */
public final class n<V> extends FutureTask<V> implements m<V> {

    /* renamed from: a, reason: collision with root package name */
    public final h f22644a;

    public n(b.a.CallableC0178a callableC0178a) {
        super(callableC0178a);
        this.f22644a = new h();
    }

    @Override // qc.m
    public final void a(Runnable runnable, Executor executor) {
        h hVar = this.f22644a;
        hVar.getClass();
        synchronized (hVar) {
            try {
                if (hVar.f22637b) {
                    h.a(runnable, executor);
                } else {
                    hVar.f22636a = new h.a(runnable, executor, hVar.f22636a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        h hVar = this.f22644a;
        synchronized (hVar) {
            try {
                if (hVar.f22637b) {
                    return;
                }
                hVar.f22637b = true;
                h.a aVar = hVar.f22636a;
                h.a aVar2 = null;
                hVar.f22636a = null;
                while (aVar != null) {
                    h.a aVar3 = aVar.f22640c;
                    aVar.f22640c = aVar2;
                    aVar2 = aVar;
                    aVar = aVar3;
                }
                while (aVar2 != null) {
                    h.a(aVar2.f22638a, aVar2.f22639b);
                    aVar2 = aVar2.f22640c;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
