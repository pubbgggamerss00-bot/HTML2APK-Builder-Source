package dc;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class x {

    /* renamed from: n, reason: collision with root package name */
    public static final HashMap f7853n = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Context f7854a;

    /* renamed from: b, reason: collision with root package name */
    public final n f7855b;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7860g;

    /* renamed from: h, reason: collision with root package name */
    public final Intent f7861h;

    /* renamed from: l, reason: collision with root package name */
    public w f7865l;

    /* renamed from: m, reason: collision with root package name */
    public h f7866m;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f7857d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f7858e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final Object f7859f = new Object();

    /* renamed from: j, reason: collision with root package name */
    public final q f7863j = new IBinder.DeathRecipient() { // from class: dc.q
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            x xVar = this.f7844a;
            int i10 = 0;
            xVar.f7855b.c("reportBinderDeath", new Object[0]);
            t tVar = (t) xVar.f7862i.get();
            if (tVar != null) {
                xVar.f7855b.c("calling onBinderDied", new Object[0]);
                tVar.zza();
            } else {
                xVar.f7855b.c("%s : Binder has died.", xVar.f7856c);
                ArrayList arrayList = xVar.f7857d;
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    RemoteException remoteException = new RemoteException(String.valueOf(xVar.f7856c).concat(" : Binder has died."));
                    TaskCompletionSource taskCompletionSource = ((o) obj).f7841a;
                    if (taskCompletionSource != null) {
                        taskCompletionSource.trySetException(remoteException);
                    }
                }
                xVar.f7857d.clear();
            }
            synchronized (xVar.f7859f) {
                xVar.d();
            }
        }
    };

    /* renamed from: k, reason: collision with root package name */
    public final AtomicInteger f7864k = new AtomicInteger(0);

    /* renamed from: c, reason: collision with root package name */
    public final String f7856c = "AppUpdateService";

    /* renamed from: i, reason: collision with root package name */
    public final WeakReference f7862i = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r0v3, types: [dc.q] */
    public x(Context context, n nVar, Intent intent) {
        this.f7854a = context;
        this.f7855b = nVar;
        this.f7861h = intent;
    }

    public static void b(x xVar, o oVar) {
        h hVar = xVar.f7866m;
        n nVar = xVar.f7855b;
        ArrayList arrayList = xVar.f7857d;
        int i10 = 0;
        if (hVar != null || xVar.f7860g) {
            if (!xVar.f7860g) {
                oVar.run();
                return;
            } else {
                nVar.c("Waiting to bind to the service.", new Object[0]);
                arrayList.add(oVar);
                return;
            }
        }
        nVar.c("Initiate binding to the service.", new Object[0]);
        arrayList.add(oVar);
        w wVar = new w(xVar);
        xVar.f7865l = wVar;
        xVar.f7860g = true;
        if (xVar.f7854a.bindService(xVar.f7861h, wVar, 1)) {
            return;
        }
        nVar.c("Failed to bind to the service.", new Object[0]);
        xVar.f7860g = false;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            y yVar = new y("Failed to bind to the service.");
            TaskCompletionSource taskCompletionSource = ((o) obj).f7841a;
            if (taskCompletionSource != null) {
                taskCompletionSource.trySetException(yVar);
            }
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap map = f7853n;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f7856c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f7856c, 10);
                    handlerThread.start();
                    map.put(this.f7856c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f7856c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final void c(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f7859f) {
            this.f7858e.remove(taskCompletionSource);
        }
        a().post(new s(this));
    }

    public final void d() {
        HashSet hashSet = this.f7858e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.f7856c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
