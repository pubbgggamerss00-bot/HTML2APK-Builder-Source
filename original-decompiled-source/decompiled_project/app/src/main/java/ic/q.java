package ic;

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
public final class q {

    /* renamed from: n, reason: collision with root package name */
    public static final HashMap f14457n = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Context f14458a;

    /* renamed from: b, reason: collision with root package name */
    public final g f14459b;

    /* renamed from: g, reason: collision with root package name */
    public boolean f14464g;

    /* renamed from: h, reason: collision with root package name */
    public final Intent f14465h;

    /* renamed from: l, reason: collision with root package name */
    public p f14469l;

    /* renamed from: m, reason: collision with root package name */
    public e f14470m;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f14461d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f14462e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final Object f14463f = new Object();

    /* renamed from: j, reason: collision with root package name */
    public final i f14467j = new IBinder.DeathRecipient() { // from class: ic.i
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            q qVar = this.f14446a;
            int i10 = 0;
            qVar.f14459b.a("reportBinderDeath", new Object[0]);
            m mVar = (m) qVar.f14466i.get();
            if (mVar != null) {
                qVar.f14459b.a("calling onBinderDied", new Object[0]);
                mVar.zza();
            } else {
                qVar.f14459b.a("%s : Binder has died.", qVar.f14460c);
                ArrayList arrayList = qVar.f14461d;
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    RemoteException remoteException = new RemoteException(String.valueOf(qVar.f14460c).concat(" : Binder has died."));
                    TaskCompletionSource taskCompletionSource = ((h) obj).f14445a;
                    if (taskCompletionSource != null) {
                        taskCompletionSource.trySetException(remoteException);
                    }
                }
                qVar.f14461d.clear();
            }
            synchronized (qVar.f14463f) {
                qVar.c();
            }
        }
    };

    /* renamed from: k, reason: collision with root package name */
    public final AtomicInteger f14468k = new AtomicInteger(0);

    /* renamed from: c, reason: collision with root package name */
    public final String f14460c = "com.google.android.finsky.inappreviewservice.InAppReviewService";

    /* renamed from: i, reason: collision with root package name */
    public final WeakReference f14466i = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r0v3, types: [ic.i] */
    public q(Context context, g gVar, Intent intent) {
        this.f14458a = context;
        this.f14459b = gVar;
        this.f14465h = intent;
    }

    public static void b(q qVar, hc.g gVar) {
        e eVar = qVar.f14470m;
        g gVar2 = qVar.f14459b;
        ArrayList arrayList = qVar.f14461d;
        int i10 = 0;
        if (eVar != null || qVar.f14464g) {
            if (!qVar.f14464g) {
                gVar.run();
                return;
            } else {
                gVar2.a("Waiting to bind to the service.", new Object[0]);
                arrayList.add(gVar);
                return;
            }
        }
        gVar2.a("Initiate binding to the service.", new Object[0]);
        arrayList.add(gVar);
        p pVar = new p(qVar);
        qVar.f14469l = pVar;
        qVar.f14464g = true;
        if (qVar.f14458a.bindService(qVar.f14465h, pVar, 1)) {
            return;
        }
        gVar2.a("Failed to bind to the service.", new Object[0]);
        qVar.f14464g = false;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            r rVar = new r("Failed to bind to the service.");
            TaskCompletionSource taskCompletionSource = ((h) obj).f14445a;
            if (taskCompletionSource != null) {
                taskCompletionSource.trySetException(rVar);
            }
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap map = f14457n;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f14460c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f14460c, 10);
                    handlerThread.start();
                    map.put(this.f14460c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f14460c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final void c() {
        HashSet hashSet = this.f14462e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.f14460c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
