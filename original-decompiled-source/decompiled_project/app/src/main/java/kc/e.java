package kc;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: o, reason: collision with root package name */
    public static final HashMap f16268o = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Context f16269a;

    /* renamed from: b, reason: collision with root package name */
    public final b0 f16270b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16271c;

    /* renamed from: g, reason: collision with root package name */
    public boolean f16275g;

    /* renamed from: h, reason: collision with root package name */
    public final Intent f16276h;

    /* renamed from: i, reason: collision with root package name */
    public final i0 f16277i;

    /* renamed from: m, reason: collision with root package name */
    public d f16281m;

    /* renamed from: n, reason: collision with root package name */
    public IInterface f16282n;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f16272d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f16273e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final Object f16274f = new Object();

    /* renamed from: k, reason: collision with root package name */
    public final d0 f16279k = new IBinder.DeathRecipient() { // from class: kc.d0
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            e eVar = this.f16267a;
            int i10 = 0;
            eVar.f16270b.b("reportBinderDeath", new Object[0]);
            h0 h0Var = (h0) eVar.f16278j.get();
            if (h0Var != null) {
                eVar.f16270b.b("calling onBinderDied", new Object[0]);
                h0Var.a();
            } else {
                eVar.f16270b.b("%s : Binder has died.", eVar.f16271c);
                ArrayList arrayList = eVar.f16272d;
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((c0) obj).a(new RemoteException(String.valueOf(eVar.f16271c).concat(" : Binder has died.")));
                }
                eVar.f16272d.clear();
            }
            synchronized (eVar.f16274f) {
                eVar.e();
            }
        }
    };

    /* renamed from: l, reason: collision with root package name */
    public final AtomicInteger f16280l = new AtomicInteger(0);

    /* renamed from: j, reason: collision with root package name */
    public final WeakReference f16278j = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r0v3, types: [kc.d0] */
    public e(Context context, b0 b0Var, String str, Intent intent, i0 i0Var) {
        this.f16269a = context;
        this.f16270b = b0Var;
        this.f16271c = str;
        this.f16276h = intent;
        this.f16277i = i0Var;
    }

    public static void b(e eVar, c0 c0Var) {
        IInterface iInterface = eVar.f16282n;
        b0 b0Var = eVar.f16270b;
        ArrayList arrayList = eVar.f16272d;
        int i10 = 0;
        if (iInterface != null || eVar.f16275g) {
            if (!eVar.f16275g) {
                c0Var.run();
                return;
            } else {
                b0Var.b("Waiting to bind to the service.", new Object[0]);
                arrayList.add(c0Var);
                return;
            }
        }
        b0Var.b("Initiate binding to the service.", new Object[0]);
        arrayList.add(c0Var);
        d dVar = new d(eVar);
        eVar.f16281m = dVar;
        eVar.f16275g = true;
        if (eVar.f16269a.bindService(eVar.f16276h, dVar, 1)) {
            return;
        }
        b0Var.b("Failed to bind to the service.", new Object[0]);
        eVar.f16275g = false;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((c0) obj).a(new f("Failed to bind to the service."));
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap map = f16268o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f16271c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f16271c, 10);
                    handlerThread.start();
                    map.put(this.f16271c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f16271c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final void c(c0 c0Var, TaskCompletionSource taskCompletionSource) {
        a().post(new f0(this, c0Var.c(), taskCompletionSource, c0Var));
    }

    public final void d(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f16274f) {
            this.f16273e.remove(taskCompletionSource);
        }
        a().post(new g0(this));
    }

    public final void e() {
        HashSet hashSet = this.f16273e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.f16271c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
