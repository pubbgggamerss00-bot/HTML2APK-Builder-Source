package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.l;
import com.google.android.gms.internal.base.zau;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public abstract class BasePendingResult<R extends com.google.android.gms.common.api.l> extends com.google.android.gms.common.api.i<R> {
    static final ThreadLocal zaa = new q1();
    public static final /* synthetic */ int zad = 0;
    private r1 resultGuardian;
    protected final a zab;
    protected final WeakReference zac;
    private final Object zae;
    private final CountDownLatch zaf;
    private final ArrayList zag;
    private com.google.android.gms.common.api.m zah;
    private final AtomicReference zai;
    private com.google.android.gms.common.api.l zaj;
    private Status zak;
    private volatile boolean zal;
    private boolean zam;
    private boolean zan;
    private com.google.android.gms.common.internal.k zao;
    private volatile f1 zap;
    private boolean zaq;

    public static class a<R extends com.google.android.gms.common.api.l> extends zau {
        public final void a(com.google.android.gms.common.api.m mVar, com.google.android.gms.common.api.l lVar) {
            int i10 = BasePendingResult.zad;
            com.google.android.gms.common.internal.p.f(mVar);
            sendMessage(obtainMessage(1, new Pair(mVar, lVar)));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 != 1) {
                if (i10 != 2) {
                    Log.wtf("BasePendingResult", j2.y.a(i10, "Don't know how to handle message: "), new Exception());
                    return;
                } else {
                    ((BasePendingResult) message.obj).forceFailureUnlessReady(Status.f5908h);
                    return;
                }
            }
            Pair pair = (Pair) message.obj;
            com.google.android.gms.common.api.m mVar = (com.google.android.gms.common.api.m) pair.first;
            com.google.android.gms.common.api.l lVar = (com.google.android.gms.common.api.l) pair.second;
            try {
                mVar.a(lVar);
            } catch (RuntimeException e10) {
                BasePendingResult.zal(lVar);
                throw e10;
            }
        }
    }

    @Deprecated
    public BasePendingResult() {
        this.zae = new Object();
        this.zaf = new CountDownLatch(1);
        this.zag = new ArrayList();
        this.zai = new AtomicReference();
        this.zaq = false;
        this.zab = new a(Looper.getMainLooper());
        this.zac = new WeakReference(null);
    }

    private final com.google.android.gms.common.api.l zaa() {
        com.google.android.gms.common.api.l lVar;
        synchronized (this.zae) {
            com.google.android.gms.common.internal.p.h("Result has already been consumed.", !this.zal);
            com.google.android.gms.common.internal.p.h("Result is not ready.", isReady());
            lVar = this.zaj;
            this.zaj = null;
            this.zah = null;
            this.zal = true;
        }
        if (((g1) this.zai.getAndSet(null)) != null) {
            throw null;
        }
        com.google.android.gms.common.internal.p.f(lVar);
        return lVar;
    }

    private final void zab(com.google.android.gms.common.api.l lVar) {
        this.zaj = lVar;
        this.zak = lVar.getStatus();
        this.zaf.countDown();
        if (this.zam) {
            this.zah = null;
        } else {
            com.google.android.gms.common.api.m mVar = this.zah;
            if (mVar != null) {
                this.zab.removeMessages(2);
                this.zab.a(mVar, zaa());
            } else if (this.zaj instanceof com.google.android.gms.common.api.j) {
                this.resultGuardian = new r1(this);
            }
        }
        ArrayList arrayList = this.zag;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((i.a) arrayList.get(i10)).a(this.zak);
        }
        this.zag.clear();
    }

    public static void zal(com.google.android.gms.common.api.l lVar) {
        if (lVar instanceof com.google.android.gms.common.api.j) {
            try {
                ((com.google.android.gms.common.api.j) lVar).a();
            } catch (RuntimeException e10) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(lVar)), e10);
            }
        }
    }

    @Override // com.google.android.gms.common.api.i
    public final void addStatusListener(i.a aVar) {
        com.google.android.gms.common.internal.p.a("Callback cannot be null.", aVar != null);
        synchronized (this.zae) {
            try {
                if (isReady()) {
                    aVar.a(this.zak);
                } else {
                    this.zag.add(aVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.common.api.i
    @ResultIgnorabilityUnspecified
    public final R await() throws InterruptedException {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IllegalStateException("await must not be called on the UI thread");
        }
        com.google.android.gms.common.internal.p.h("Result has already been consumed", !this.zal);
        com.google.android.gms.common.internal.p.h("Cannot await if then() has been called.", this.zap == null);
        try {
            this.zaf.await();
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.f5906f);
        }
        com.google.android.gms.common.internal.p.h("Result is not ready.", isReady());
        return (R) zaa();
    }

    @Override // com.google.android.gms.common.api.i
    public void cancel() {
        synchronized (this.zae) {
            try {
                if (!this.zam && !this.zal) {
                    zal(this.zaj);
                    this.zam = true;
                    zab(createFailedResult(Status.f5909j));
                }
            } finally {
            }
        }
    }

    public abstract R createFailedResult(Status status);

    @Deprecated
    public final void forceFailureUnlessReady(Status status) {
        synchronized (this.zae) {
            try {
                if (!isReady()) {
                    setResult(createFailedResult(status));
                    this.zan = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.common.api.i
    public final boolean isCanceled() {
        boolean z10;
        synchronized (this.zae) {
            z10 = this.zam;
        }
        return z10;
    }

    public final boolean isReady() {
        return this.zaf.getCount() == 0;
    }

    public final void setCancelToken(com.google.android.gms.common.internal.k kVar) {
        synchronized (this.zae) {
        }
    }

    public final void setResult(R r10) {
        synchronized (this.zae) {
            try {
                if (this.zan || this.zam) {
                    zal(r10);
                    return;
                }
                isReady();
                com.google.android.gms.common.internal.p.h("Results have already been set", !isReady());
                com.google.android.gms.common.internal.p.h("Result has already been consumed", !this.zal);
                zab(r10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.common.api.i
    public final void setResultCallback(com.google.android.gms.common.api.m<? super R> mVar) {
        synchronized (this.zae) {
            try {
                if (mVar == null) {
                    this.zah = null;
                    return;
                }
                boolean z10 = true;
                com.google.android.gms.common.internal.p.h("Result has already been consumed.", !this.zal);
                if (this.zap != null) {
                    z10 = false;
                }
                com.google.android.gms.common.internal.p.h("Cannot set callbacks if then() has been called.", z10);
                if (isCanceled()) {
                    return;
                }
                if (isReady()) {
                    this.zab.a(mVar, zaa());
                } else {
                    this.zah = mVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.common.api.i
    public final <S extends com.google.android.gms.common.api.l> com.google.android.gms.common.api.o<S> then(com.google.android.gms.common.api.n<? super R, ? extends S> nVar) {
        f1 f1Var;
        com.google.android.gms.common.internal.p.h("Result has already been consumed.", !this.zal);
        synchronized (this.zae) {
            try {
                com.google.android.gms.common.internal.p.h("Cannot call then() twice.", this.zap == null);
                com.google.android.gms.common.internal.p.h("Cannot call then() if callbacks are set.", this.zah == null);
                com.google.android.gms.common.internal.p.h("Cannot call then() if result was canceled.", !this.zam);
                this.zaq = true;
                this.zap = new f1(this.zac);
                f1 f1Var2 = this.zap;
                synchronized (f1Var2.f5959c) {
                    com.google.android.gms.common.internal.p.h("Cannot call then() twice.", true);
                    f1Var = new f1(f1Var2.f5961e);
                    f1Var2.f5957a = f1Var;
                    f1Var2.c();
                }
                if (isReady()) {
                    this.zab.a(this.zap, zaa());
                } else {
                    this.zah = this.zap;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f1Var;
    }

    public final void zak() {
        boolean z10 = true;
        if (!this.zaq && !((Boolean) zaa.get()).booleanValue()) {
            z10 = false;
        }
        this.zaq = z10;
    }

    public final boolean zam() {
        boolean zIsCanceled;
        synchronized (this.zae) {
            try {
                if (((com.google.android.gms.common.api.h) this.zac.get()) == null || !this.zaq) {
                    cancel();
                }
                zIsCanceled = isCanceled();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zIsCanceled;
    }

    public final void zan(g1 g1Var) {
        this.zai.set(g1Var);
    }

    @Deprecated
    public BasePendingResult(Looper looper) {
        this.zae = new Object();
        this.zaf = new CountDownLatch(1);
        this.zag = new ArrayList();
        this.zai = new AtomicReference();
        this.zaq = false;
        this.zab = new a(looper);
        this.zac = new WeakReference(null);
    }

    @Override // com.google.android.gms.common.api.i
    public final void setResultCallback(com.google.android.gms.common.api.m<? super R> mVar, long j10, TimeUnit timeUnit) {
        synchronized (this.zae) {
            try {
                if (mVar == null) {
                    this.zah = null;
                    return;
                }
                boolean z10 = true;
                com.google.android.gms.common.internal.p.h("Result has already been consumed.", !this.zal);
                if (this.zap != null) {
                    z10 = false;
                }
                com.google.android.gms.common.internal.p.h("Cannot set callbacks if then() has been called.", z10);
                if (isCanceled()) {
                    return;
                }
                if (isReady()) {
                    this.zab.a(mVar, zaa());
                } else {
                    this.zah = mVar;
                    a aVar = this.zab;
                    aVar.sendMessageDelayed(aVar.obtainMessage(2, this), timeUnit.toMillis(j10));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.common.api.i
    @ResultIgnorabilityUnspecified
    public final R await(long j10, TimeUnit timeUnit) {
        if (j10 > 0 && Looper.getMainLooper() == Looper.myLooper()) {
            throw new IllegalStateException("await must not be called on the UI thread when time is greater than zero.");
        }
        com.google.android.gms.common.internal.p.h("Result has already been consumed.", !this.zal);
        com.google.android.gms.common.internal.p.h("Cannot await if then() has been called.", this.zap == null);
        try {
            if (!this.zaf.await(j10, timeUnit)) {
                forceFailureUnlessReady(Status.f5908h);
            }
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.f5906f);
        }
        com.google.android.gms.common.internal.p.h("Result is not ready.", isReady());
        return (R) zaa();
    }

    public BasePendingResult(com.google.android.gms.common.api.h hVar) {
        this.zae = new Object();
        this.zaf = new CountDownLatch(1);
        this.zag = new ArrayList();
        this.zai = new AtomicReference();
        this.zaq = false;
        this.zab = new a(hVar != null ? hVar.c() : Looper.getMainLooper());
        this.zac = new WeakReference(hVar);
    }

    public BasePendingResult(a<R> aVar) {
        this.zae = new Object();
        this.zaf = new CountDownLatch(1);
        this.zag = new ArrayList();
        this.zai = new AtomicReference();
        this.zaq = false;
        com.google.android.gms.common.internal.p.g(aVar, "CallbackHandler must not be null");
        this.zab = aVar;
        this.zac = new WeakReference(null);
    }
}
