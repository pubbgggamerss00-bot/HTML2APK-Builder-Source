package oa;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.cloudmessaging.zza;
import com.google.android.gms.internal.cloudmessaging.zzf;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p.b1;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: h, reason: collision with root package name */
    public static int f19067h;

    /* renamed from: i, reason: collision with root package name */
    public static PendingIntent f19068i;

    /* renamed from: b, reason: collision with root package name */
    public final Context f19070b;

    /* renamed from: c, reason: collision with root package name */
    public final o f19071c;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f19072d;

    /* renamed from: f, reason: collision with root package name */
    public Messenger f19074f;

    /* renamed from: g, reason: collision with root package name */
    public b f19075g;

    /* renamed from: a, reason: collision with root package name */
    public final b1<String, TaskCompletionSource<Bundle>> f19069a = new b1<>();

    /* renamed from: e, reason: collision with root package name */
    public final Messenger f19073e = new Messenger(new v(this, Looper.getMainLooper()));

    public a(Context context) {
        this.f19070b = context;
        this.f19071c = new o(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f19072d = scheduledThreadPoolExecutor;
    }

    public final Task<Bundle> a(final Bundle bundle) {
        int i10;
        d dVar;
        int i11;
        Task task;
        PackageInfo packageInfo;
        o oVar = this.f19071c;
        synchronized (oVar) {
            try {
                if (oVar.f19103b == 0) {
                    try {
                        packageInfo = ya.d.a(oVar.f19102a).f34356a.getPackageManager().getPackageInfo("com.google.android.gms", 0);
                    } catch (PackageManager.NameNotFoundException e10) {
                        String strValueOf = String.valueOf(e10);
                        StringBuilder sb = new StringBuilder(strValueOf.length() + 23);
                        sb.append("Failed to find package ");
                        sb.append(strValueOf);
                        Log.w("Metadata", sb.toString());
                        packageInfo = null;
                    }
                    if (packageInfo != null) {
                        oVar.f19103b = packageInfo.versionCode;
                    }
                }
                i10 = oVar.f19103b;
            } finally {
            }
        }
        if (i10 < 12000000) {
            return this.f19071c.a() != 0 ? c(bundle).continueWithTask(w.f19114a, new Continuation(this, bundle) { // from class: oa.s

                /* renamed from: a, reason: collision with root package name */
                public final a f19107a;

                /* renamed from: b, reason: collision with root package name */
                public final Bundle f19108b;

                {
                    this.f19107a = this;
                    this.f19108b = bundle;
                }

                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task2) {
                    Bundle bundle2;
                    a aVar = this.f19107a;
                    aVar.getClass();
                    return (task2.isSuccessful() && (bundle2 = (Bundle) task2.getResult()) != null && bundle2.containsKey("google.messenger")) ? aVar.c(this.f19108b).onSuccessTask(w.f19114a, t.f19109a) : task2;
                }
            }) : Tasks.forException(new IOException("MISSING_INSTANCEID_SERVICE"));
        }
        Context context = this.f19070b;
        synchronized (d.class) {
            try {
                if (d.f19077e == null) {
                    d.f19077e = new d(context, zza.zza().zza(1, new xa.b("MessengerIpcClient"), zzf.zzb));
                }
                dVar = d.f19077e;
            } finally {
            }
        }
        synchronized (dVar) {
            i11 = dVar.f19081d;
            dVar.f19081d = i11 + 1;
        }
        p pVar = new p(i11, bundle);
        synchronized (dVar) {
            try {
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    String strValueOf2 = String.valueOf(pVar);
                    StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 9);
                    sb2.append("Queueing ");
                    sb2.append(strValueOf2);
                    Log.d("MessengerIpcClient", sb2.toString());
                }
                if (!dVar.f19080c.b(pVar)) {
                    e eVar = new e(dVar);
                    dVar.f19080c = eVar;
                    eVar.b(pVar);
                }
                task = pVar.f19099b.getTask();
            } finally {
            }
        }
        return task.continueWith(w.f19114a, q.f19105a);
    }

    public final void b(Bundle bundle, String str) {
        synchronized (this.f19069a) {
            try {
                TaskCompletionSource<Bundle> taskCompletionSourceRemove = this.f19069a.remove(str);
                if (taskCompletionSourceRemove != null) {
                    taskCompletionSourceRemove.setResult(bundle);
                } else {
                    String strValueOf = String.valueOf(str);
                    Log.w("Rpc", strValueOf.length() != 0 ? "Missing callback for ".concat(strValueOf) : new String("Missing callback for "));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Task<Bundle> c(Bundle bundle) throws RemoteException {
        final String string;
        synchronized (a.class) {
            int i10 = f19067h;
            f19067h = i10 + 1;
            string = Integer.toString(i10);
        }
        final TaskCompletionSource<Bundle> taskCompletionSource = new TaskCompletionSource<>();
        synchronized (this.f19069a) {
            this.f19069a.put(string, taskCompletionSource);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f19071c.a() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        Context context = this.f19070b;
        synchronized (a.class) {
            try {
                if (f19068i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    f19068i = PendingIntent.getBroadcast(context, 0, intent2, 0);
                }
                intent.putExtra("app", f19068i);
            } finally {
            }
        }
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 5);
        sb.append("|ID|");
        sb.append(string);
        sb.append("|");
        intent.putExtra("kid", sb.toString());
        if (Log.isLoggable("Rpc", 3)) {
            String strValueOf = String.valueOf(intent.getExtras());
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 8);
            sb2.append("Sending ");
            sb2.append(strValueOf);
            Log.d("Rpc", sb2.toString());
        }
        intent.putExtra("google.messenger", this.f19073e);
        if (this.f19074f != null || this.f19075g != null) {
            Message messageObtain = Message.obtain();
            messageObtain.obj = intent;
            try {
                Messenger messenger = this.f19074f;
                if (messenger != null) {
                    messenger.send(messageObtain);
                } else {
                    Messenger messenger2 = this.f19075g.f19076a;
                    messenger2.getClass();
                    messenger2.send(messageObtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
        } else if (this.f19071c.a() == 2) {
            this.f19070b.sendBroadcast(intent);
        } else {
            this.f19070b.startService(intent);
        }
        final ScheduledFuture<?> scheduledFutureSchedule = this.f19072d.schedule(new Runnable(taskCompletionSource) { // from class: oa.r

            /* renamed from: a, reason: collision with root package name */
            public final TaskCompletionSource f19106a;

            {
                this.f19106a = taskCompletionSource;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (this.f19106a.trySetException(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                }
            }
        }, 30L, TimeUnit.SECONDS);
        taskCompletionSource.getTask().addOnCompleteListener(w.f19114a, new OnCompleteListener(this, string, scheduledFutureSchedule) { // from class: oa.u

            /* renamed from: a, reason: collision with root package name */
            public final a f19110a;

            /* renamed from: b, reason: collision with root package name */
            public final String f19111b;

            /* renamed from: c, reason: collision with root package name */
            public final ScheduledFuture f19112c;

            {
                this.f19110a = this;
                this.f19111b = string;
                this.f19112c = scheduledFutureSchedule;
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                a aVar = this.f19110a;
                String str = this.f19111b;
                ScheduledFuture scheduledFuture = this.f19112c;
                synchronized (aVar.f19069a) {
                    aVar.f19069a.remove(str);
                }
                scheduledFuture.cancel(false);
            }
        });
        return taskCompletionSource.getTask();
    }
}
