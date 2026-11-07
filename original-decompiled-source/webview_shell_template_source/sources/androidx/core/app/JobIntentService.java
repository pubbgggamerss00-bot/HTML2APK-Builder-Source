package androidx.core.app;

import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
@Deprecated
/* loaded from: classes.dex */
public abstract class JobIntentService extends Service {

    /* renamed from: x, reason: collision with root package name */
    public static final HashMap<ComponentName, f> f940x = new HashMap<>();
    public e s;

    /* renamed from: t, reason: collision with root package name */
    public f f941t;

    /* renamed from: u, reason: collision with root package name */
    public a f942u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f943v = false;

    /* renamed from: w, reason: collision with root package name */
    public final ArrayList<c> f944w;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public final class a extends AsyncTask<Void, Void, Void> {
        public a() {
        }

        @Override // android.os.AsyncTask
        public final Void doInBackground(Void[] voidArr) {
            c cVarRemove;
            while (true) {
                JobIntentService jobIntentService = JobIntentService.this;
                e eVar = jobIntentService.s;
                if (eVar != null) {
                    synchronized (eVar.f953b) {
                        try {
                            JobParameters jobParameters = eVar.f954c;
                            if (jobParameters != null) {
                                JobWorkItem jobWorkItemDequeueWork = jobParameters.dequeueWork();
                                if (jobWorkItemDequeueWork != null) {
                                    jobWorkItemDequeueWork.getIntent().setExtrasClassLoader(eVar.f952a.getClassLoader());
                                    cVarRemove = eVar.new a(jobWorkItemDequeueWork);
                                }
                            }
                        } finally {
                        }
                    }
                } else {
                    synchronized (jobIntentService.f944w) {
                        try {
                            cVarRemove = jobIntentService.f944w.size() > 0 ? jobIntentService.f944w.remove(0) : null;
                        } finally {
                        }
                    }
                }
                if (cVarRemove == null) {
                    return null;
                }
                JobIntentService jobIntentService2 = JobIntentService.this;
                cVarRemove.getIntent();
                jobIntentService2.b();
                cVarRemove.a();
            }
        }

        @Override // android.os.AsyncTask
        public final void onCancelled(Void r12) {
            JobIntentService.this.c();
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(Void r12) {
            JobIntentService.this.c();
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class b extends f {

        /* renamed from: a, reason: collision with root package name */
        public final PowerManager.WakeLock f946a;

        /* renamed from: b, reason: collision with root package name */
        public final PowerManager.WakeLock f947b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f948c;

        public b(JobIntentService jobIntentService, ComponentName componentName) {
            jobIntentService.getApplicationContext();
            PowerManager powerManager = (PowerManager) jobIntentService.getSystemService("power");
            PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.f946a = wakeLockNewWakeLock;
            wakeLockNewWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock wakeLockNewWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.f947b = wakeLockNewWakeLock2;
            wakeLockNewWakeLock2.setReferenceCounted(false);
        }

        @Override // androidx.core.app.JobIntentService.f
        public final void a() {
            synchronized (this) {
                try {
                    if (this.f948c) {
                        this.f948c = false;
                        this.f947b.release();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.core.app.JobIntentService.f
        public final void b() {
            synchronized (this) {
                try {
                    if (!this.f948c) {
                        this.f948c = true;
                        this.f947b.acquire(600000L);
                        this.f946a.release();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.core.app.JobIntentService.f
        public final void c() {
            synchronized (this) {
            }
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public final class c implements d {

        /* renamed from: a, reason: collision with root package name */
        public final Intent f949a;

        /* renamed from: b, reason: collision with root package name */
        public final int f950b;

        public c(Intent intent, int i6) {
            this.f949a = intent;
            this.f950b = i6;
        }

        @Override // androidx.core.app.JobIntentService.d
        public final void a() {
            JobIntentService.this.stopSelf(this.f950b);
        }

        @Override // androidx.core.app.JobIntentService.d
        public final Intent getIntent() {
            return this.f949a;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface d {
        void a();

        Intent getIntent();
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class e extends JobServiceEngine {

        /* renamed from: a, reason: collision with root package name */
        public final JobIntentService f952a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f953b;

        /* renamed from: c, reason: collision with root package name */
        public JobParameters f954c;

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        public final class a implements d {

            /* renamed from: a, reason: collision with root package name */
            public final JobWorkItem f955a;

            public a(JobWorkItem jobWorkItem) {
                this.f955a = jobWorkItem;
            }

            @Override // androidx.core.app.JobIntentService.d
            public final void a() {
                synchronized (e.this.f953b) {
                    try {
                        JobParameters jobParameters = e.this.f954c;
                        if (jobParameters != null) {
                            jobParameters.completeWork(this.f955a);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }

            @Override // androidx.core.app.JobIntentService.d
            public final Intent getIntent() {
                return this.f955a.getIntent();
            }
        }

        public e(JobIntentService jobIntentService) {
            super(jobIntentService);
            this.f953b = new Object();
            this.f952a = jobIntentService;
        }

        public final boolean onStartJob(JobParameters jobParameters) {
            this.f954c = jobParameters;
            this.f952a.a(false);
            return true;
        }

        public final boolean onStopJob(JobParameters jobParameters) {
            a aVar = this.f952a.f942u;
            if (aVar != null) {
                aVar.cancel(false);
            }
            synchronized (this.f953b) {
                this.f954c = null;
            }
            return true;
        }
    }

    public JobIntentService() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f944w = null;
        } else {
            this.f944w = new ArrayList<>();
        }
    }

    public final void a(boolean z6) {
        if (this.f942u == null) {
            this.f942u = new a();
            f fVar = this.f941t;
            if (fVar != null && z6) {
                fVar.b();
            }
            this.f942u.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public abstract void b();

    public final void c() {
        ArrayList<c> arrayList = this.f944w;
        if (arrayList != null) {
            synchronized (arrayList) {
                try {
                    this.f942u = null;
                    ArrayList<c> arrayList2 = this.f944w;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        a(false);
                    } else if (!this.f943v) {
                        this.f941t.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        e eVar = this.s;
        if (eVar != null) {
            return eVar.getBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 26) {
            this.s = new e(this);
            this.f941t = null;
            return;
        }
        this.s = null;
        ComponentName componentName = new ComponentName(this, getClass());
        HashMap<ComponentName, f> map = f940x;
        f bVar = map.get(componentName);
        if (bVar == null) {
            if (i6 >= 26) {
                throw new IllegalArgumentException("Can't be here without a job id");
            }
            bVar = new b(this, componentName);
            map.put(componentName, bVar);
        }
        this.f941t = bVar;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        ArrayList<c> arrayList = this.f944w;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f943v = true;
                this.f941t.a();
            }
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i6, int i7) {
        if (this.f944w == null) {
            return 2;
        }
        this.f941t.c();
        synchronized (this.f944w) {
            ArrayList<c> arrayList = this.f944w;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new c(intent, i7));
            a(true);
        }
        return 3;
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static abstract class f {
        public void a() {
        }

        public void b() {
        }

        public void c() {
        }
    }
}
