package ph;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final class c<T> {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f21505b = AtomicIntegerFieldUpdater.newUpdater(c.class, "notCompletedCount$volatile");

    /* renamed from: a, reason: collision with root package name */
    public final p0<T>[] f21506a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    public final class a extends x1 {

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f21507h = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_disposer$volatile");
        private volatile /* synthetic */ Object _disposer$volatile;

        /* renamed from: e, reason: collision with root package name */
        public final m f21508e;

        /* renamed from: f, reason: collision with root package name */
        public b1 f21509f;

        public a(m mVar) {
            this.f21508e = mVar;
        }

        @Override // ph.x1
        public final boolean j() {
            return false;
        }

        @Override // ph.x1
        public final void k(Throwable th2) {
            m mVar = this.f21508e;
            if (th2 != null) {
                mVar.getClass();
                uh.v vVarD = mVar.D(new y(false, th2), null);
                if (vVarD != null) {
                    mVar.w(vVarD);
                    b bVar = (b) f21507h.get(this);
                    if (bVar != null) {
                        bVar.a();
                        return;
                    }
                    return;
                }
                return;
            }
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = c.f21505b;
            c<T> cVar = c.this;
            if (atomicIntegerFieldUpdater.decrementAndGet(cVar) == 0) {
                p0<T>[] p0VarArr = cVar.f21506a;
                ArrayList arrayList = new ArrayList(p0VarArr.length);
                for (p0<T> p0Var : p0VarArr) {
                    arrayList.add(p0Var.getCompleted());
                }
                mVar.resumeWith(arrayList);
            }
        }
    }

    public final class b implements j {

        /* renamed from: a, reason: collision with root package name */
        public final c<T>.a[] f21511a;

        public b(a[] aVarArr) {
            this.f21511a = aVarArr;
        }

        public final void a() {
            for (c<T>.a aVar : this.f21511a) {
                b1 b1Var = aVar.f21509f;
                if (b1Var == null) {
                    kotlin.jvm.internal.r.h("handle");
                    throw null;
                }
                b1Var.a();
            }
        }

        @Override // ph.j
        public final void d(Throwable th2) {
            a();
        }

        public final String toString() {
            return "DisposeHandlersOnCancel[" + this.f21511a + ']';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(p0<? extends T>[] p0VarArr) {
        this.f21506a = p0VarArr;
        this.notCompletedCount$volatile = p0VarArr.length;
    }
}
