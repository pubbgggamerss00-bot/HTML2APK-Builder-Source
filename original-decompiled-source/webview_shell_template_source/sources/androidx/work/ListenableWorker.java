package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.annotation.Keep;
import com.google.android.gms.internal.ads.sf0;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class ListenableWorker {
    private Context mAppContext;
    private boolean mRunInForeground;
    private volatile boolean mStopped;
    private boolean mUsed;
    private WorkerParameters mWorkerParams;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static abstract class a {

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        /* renamed from: androidx.work.ListenableWorker$a$a, reason: collision with other inner class name */
        public static final class C0020a extends a {

            /* renamed from: a, reason: collision with root package name */
            public final f f1737a = f.f1775c;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0020a.class != obj.getClass()) {
                    return false;
                }
                return this.f1737a.equals(((C0020a) obj).f1737a);
            }

            public final int hashCode() {
                return this.f1737a.hashCode() + (C0020a.class.getName().hashCode() * 31);
            }

            public final String toString() {
                return "Failure {mOutputData=" + this.f1737a + '}';
            }
        }

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        public static final class b extends a {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && b.class == obj.getClass();
            }

            public final int hashCode() {
                return b.class.getName().hashCode();
            }

            public final String toString() {
                return "Retry";
            }
        }

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        public static final class c extends a {

            /* renamed from: a, reason: collision with root package name */
            public final f f1738a;

            public c() {
                this(f.f1775c);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || c.class != obj.getClass()) {
                    return false;
                }
                return this.f1738a.equals(((c) obj).f1738a);
            }

            public final int hashCode() {
                return this.f1738a.hashCode() + (c.class.getName().hashCode() * 31);
            }

            public final String toString() {
                return "Success {mOutputData=" + this.f1738a + '}';
            }

            public c(f fVar) {
                this.f1738a = fVar;
            }
        }
    }

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.mAppContext = context;
        this.mWorkerParams = workerParameters;
    }

    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.f1745f;
    }

    public c5.a<h> getForegroundInfoAsync() {
        t2.c cVar = new t2.c();
        cVar.i(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return cVar;
    }

    public final UUID getId() {
        return this.mWorkerParams.f1740a;
    }

    public final f getInputData() {
        return this.mWorkerParams.f1741b;
    }

    public final Network getNetwork() {
        return this.mWorkerParams.f1743d.f1751c;
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.f1744e;
    }

    public final Set<String> getTags() {
        return this.mWorkerParams.f1742c;
    }

    public u2.a getTaskExecutor() {
        return this.mWorkerParams.f1746g;
    }

    public final List<String> getTriggeredContentAuthorities() {
        return this.mWorkerParams.f1743d.f1749a;
    }

    public final List<Uri> getTriggeredContentUris() {
        return this.mWorkerParams.f1743d.f1750b;
    }

    public t getWorkerFactory() {
        return this.mWorkerParams.h;
    }

    public boolean isRunInForeground() {
        return this.mRunInForeground;
    }

    public final boolean isStopped() {
        return this.mStopped;
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    public final c5.a<Void> setForegroundAsync(h hVar) {
        this.mRunInForeground = true;
        s2.p pVar = this.mWorkerParams.f1748j;
        Context applicationContext = getApplicationContext();
        UUID id = getId();
        pVar.getClass();
        t2.c cVar = new t2.c();
        ((u2.b) pVar.f14382a).a(new sf0(pVar, cVar, id, hVar, applicationContext));
        return cVar;
    }

    public c5.a<Void> setProgressAsync(f fVar) {
        s2.r rVar = this.mWorkerParams.f1747i;
        getApplicationContext();
        UUID id = getId();
        rVar.getClass();
        t2.c cVar = new t2.c();
        ((u2.b) rVar.f14390b).a(new s2.q(rVar, id, fVar, cVar));
        return cVar;
    }

    public void setRunInForeground(boolean z6) {
        this.mRunInForeground = z6;
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract c5.a<a> startWork();

    public final void stop() {
        this.mStopped = true;
        onStopped();
    }

    public void onStopped() {
    }
}
