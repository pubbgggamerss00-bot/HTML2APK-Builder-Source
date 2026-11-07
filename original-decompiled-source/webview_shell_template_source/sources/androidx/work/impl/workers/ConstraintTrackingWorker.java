package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.camera.camera2.internal.k0;
import androidx.camera.camera2.internal.v0;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.k;
import com.google.android.gms.internal.ads.ow;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import n2.c;
import n2.d;
import r2.l;
import r2.s;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class ConstraintTrackingWorker extends ListenableWorker implements c {

    /* renamed from: x, reason: collision with root package name */
    public static final String f1825x = k.e("ConstraintTrkngWrkr");
    public final WorkerParameters s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f1826t;

    /* renamed from: u, reason: collision with root package name */
    public volatile boolean f1827u;

    /* renamed from: v, reason: collision with root package name */
    public final t2.c<ListenableWorker.a> f1828v;

    /* renamed from: w, reason: collision with root package name */
    public ListenableWorker f1829w;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ConstraintTrackingWorker constraintTrackingWorker = ConstraintTrackingWorker.this;
            String strB = constraintTrackingWorker.getInputData().b("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
            if (TextUtils.isEmpty(strB)) {
                k.c().b(ConstraintTrackingWorker.f1825x, "No worker to delegate to.", new Throwable[0]);
                constraintTrackingWorker.f1828v.h(new ListenableWorker.a.C0020a());
                return;
            }
            ListenableWorker listenableWorkerA = constraintTrackingWorker.getWorkerFactory().a(constraintTrackingWorker.getApplicationContext(), strB, constraintTrackingWorker.s);
            constraintTrackingWorker.f1829w = listenableWorkerA;
            if (listenableWorkerA == null) {
                k.c().a(ConstraintTrackingWorker.f1825x, "No worker to delegate to.", new Throwable[0]);
                constraintTrackingWorker.f1828v.h(new ListenableWorker.a.C0020a());
                return;
            }
            l lVarI = ((s) j2.k.b(constraintTrackingWorker.getApplicationContext()).f13476c.n()).i(constraintTrackingWorker.getId().toString());
            if (lVarI == null) {
                constraintTrackingWorker.f1828v.h(new ListenableWorker.a.C0020a());
                return;
            }
            d dVar = new d(constraintTrackingWorker.getApplicationContext(), constraintTrackingWorker.getTaskExecutor(), constraintTrackingWorker);
            dVar.b(Collections.singletonList(lVarI));
            if (!dVar.a(constraintTrackingWorker.getId().toString())) {
                k.c().a(ConstraintTrackingWorker.f1825x, v0.b("Constraints not met for delegate ", strB, ". Requesting retry."), new Throwable[0]);
                constraintTrackingWorker.f1828v.h(new ListenableWorker.a.b());
                return;
            }
            k.c().a(ConstraintTrackingWorker.f1825x, k0.a("Constraints met for delegate ", strB), new Throwable[0]);
            try {
                c5.a<ListenableWorker.a> aVarStartWork = constraintTrackingWorker.f1829w.startWork();
                aVarStartWork.addListener(new ow(constraintTrackingWorker, aVarStartWork, 7, false), constraintTrackingWorker.getBackgroundExecutor());
            } catch (Throwable th) {
                k kVarC = k.c();
                String str = ConstraintTrackingWorker.f1825x;
                kVarC.a(str, v0.b("Delegated worker ", strB, " threw exception in startWork."), th);
                synchronized (constraintTrackingWorker.f1826t) {
                    try {
                        if (constraintTrackingWorker.f1827u) {
                            k.c().a(str, "Constraints were unmet, Retrying.", new Throwable[0]);
                            constraintTrackingWorker.f1828v.h(new ListenableWorker.a.b());
                        } else {
                            constraintTrackingWorker.f1828v.h(new ListenableWorker.a.C0020a());
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.s = workerParameters;
        this.f1826t = new Object();
        this.f1827u = false;
        this.f1828v = new t2.c<>();
    }

    @Override // n2.c
    public final void e(ArrayList arrayList) {
        k.c().a(f1825x, String.format("Constraints changed for %s", arrayList), new Throwable[0]);
        synchronized (this.f1826t) {
            this.f1827u = true;
        }
    }

    @Override // androidx.work.ListenableWorker
    public final u2.a getTaskExecutor() {
        return j2.k.b(getApplicationContext()).f13477d;
    }

    @Override // androidx.work.ListenableWorker
    public final boolean isRunInForeground() {
        ListenableWorker listenableWorker = this.f1829w;
        return listenableWorker != null && listenableWorker.isRunInForeground();
    }

    @Override // androidx.work.ListenableWorker
    public final void onStopped() {
        super.onStopped();
        ListenableWorker listenableWorker = this.f1829w;
        if (listenableWorker == null || listenableWorker.isStopped()) {
            return;
        }
        this.f1829w.stop();
    }

    @Override // androidx.work.ListenableWorker
    public final c5.a<ListenableWorker.a> startWork() {
        getBackgroundExecutor().execute(new a());
        return this.f1828v;
    }

    @Override // n2.c
    public final void f(List<String> list) {
    }
}
