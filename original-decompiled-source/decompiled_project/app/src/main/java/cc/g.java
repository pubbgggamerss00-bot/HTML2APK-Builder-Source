package cc;

import android.app.PendingIntent;
import android.content.Context;
import android.content.IntentSender;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.basitce.htmltoapk.MainActivity;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import dc.x;

/* loaded from: classes2.dex */
public final class g implements b {

    /* renamed from: a, reason: collision with root package name */
    public final q f5364a;

    /* renamed from: b, reason: collision with root package name */
    public final e f5365b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f5366c;

    public g(q qVar, e eVar, Context context) {
        new Handler(Looper.getMainLooper());
        this.f5364a = qVar;
        this.f5365b = eVar;
        this.f5366c = context;
    }

    @Override // cc.b
    public final Task<Void> a() {
        String packageName = this.f5366c.getPackageName();
        q qVar = this.f5364a;
        x xVar = qVar.f5385a;
        if (xVar != null) {
            q.f5383e.c("completeUpdate(%s)", packageName);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            xVar.a().post(new dc.r(xVar, taskCompletionSource, taskCompletionSource, new m(qVar, taskCompletionSource, taskCompletionSource, packageName)));
            return taskCompletionSource.getTask();
        }
        dc.n nVar = q.f5383e;
        Object[] objArr = {-9};
        nVar.getClass();
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", dc.n.d(nVar.f7840a, "onError(%d)", objArr));
        }
        return Tasks.forException(new ec.a(-9));
    }

    @Override // cc.b
    public final Task<a> b() {
        String packageName = this.f5366c.getPackageName();
        q qVar = this.f5364a;
        x xVar = qVar.f5385a;
        if (xVar != null) {
            q.f5383e.c("requestUpdateInfo(%s)", packageName);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            xVar.a().post(new dc.r(xVar, taskCompletionSource, taskCompletionSource, new l(qVar, taskCompletionSource, taskCompletionSource, packageName)));
            return taskCompletionSource.getTask();
        }
        dc.n nVar = q.f5383e;
        Object[] objArr = {-9};
        nVar.getClass();
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", dc.n.d(nVar.f7840a, "onError(%d)", objArr));
        }
        return Tasks.forException(new ec.a(-9));
    }

    @Override // cc.b
    public final synchronized void c(l9.c cVar) {
        e eVar = this.f5365b;
        synchronized (eVar) {
            eVar.f7835a.c("registerListener", new Object[0]);
            eVar.f7838d.add(cVar);
            eVar.a();
        }
    }

    @Override // cc.b
    public final synchronized void d(l9.c cVar) {
        e eVar = this.f5365b;
        synchronized (eVar) {
            eVar.f7835a.c("unregisterListener", new Object[0]);
            eVar.f7838d.remove(cVar);
            eVar.a();
        }
    }

    @Override // cc.b
    public final boolean e(a aVar, MainActivity mainActivity) throws IntentSender.SendIntentException {
        c.c();
        if (aVar == null) {
            return false;
        }
        PendingIntent pendingIntent = aVar.f5359c;
        if ((pendingIntent != null ? pendingIntent : null) == null || aVar.f5360d) {
            return false;
        }
        aVar.f5360d = true;
        if (pendingIntent == null) {
            pendingIntent = null;
        }
        mainActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1204, null, 0, 0, 0, null);
        return true;
    }
}
