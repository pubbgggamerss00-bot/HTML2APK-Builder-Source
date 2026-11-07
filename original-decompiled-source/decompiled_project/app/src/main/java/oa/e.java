package oa;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.internal.cloudmessaging.zze;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class e implements ServiceConnection {

    /* renamed from: c, reason: collision with root package name */
    public l f19084c;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d f19087f;

    /* renamed from: a, reason: collision with root package name */
    public int f19082a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Messenger f19083b = new Messenger(new zze(Looper.getMainLooper(), new Handler.Callback(this) { // from class: oa.g

        /* renamed from: a, reason: collision with root package name */
        public final e f19089a;

        {
            this.f19089a = this;
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            e eVar = this.f19089a;
            int i10 = message.arg1;
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                StringBuilder sb = new StringBuilder(41);
                sb.append("Received response to request: ");
                sb.append(i10);
                Log.d("MessengerIpcClient", sb.toString());
            }
            synchronized (eVar) {
                try {
                    n<?> nVar = eVar.f19086e.get(i10);
                    if (nVar == null) {
                        StringBuilder sb2 = new StringBuilder(50);
                        sb2.append("Received response for unknown request: ");
                        sb2.append(i10);
                        Log.w("MessengerIpcClient", sb2.toString());
                        return true;
                    }
                    eVar.f19086e.remove(i10);
                    eVar.c();
                    Bundle data = message.getData();
                    if (data.getBoolean("unsupported", false)) {
                        nVar.b(new m("Not supported by GmsCore"));
                        return true;
                    }
                    nVar.a(data);
                    return true;
                } finally {
                }
            }
        }
    }));

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f19085d = new ArrayDeque();

    /* renamed from: e, reason: collision with root package name */
    public final SparseArray<n<?>> f19086e = new SparseArray<>();

    public e(d dVar) {
        this.f19087f = dVar;
    }

    public final synchronized void a(String str) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                String strValueOf = String.valueOf(str);
                Log.d("MessengerIpcClient", strValueOf.length() != 0 ? "Disconnected: ".concat(strValueOf) : new String("Disconnected: "));
            }
            int i10 = this.f19082a;
            if (i10 == 0) {
                throw new IllegalStateException();
            }
            if (i10 != 1 && i10 != 2) {
                if (i10 == 3) {
                    this.f19082a = 4;
                    return;
                } else {
                    if (i10 == 4) {
                        return;
                    }
                    int i11 = this.f19082a;
                    StringBuilder sb = new StringBuilder(26);
                    sb.append("Unknown state: ");
                    sb.append(i11);
                    throw new IllegalStateException(sb.toString());
                }
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f19082a = 4;
            va.b.a().b(this.f19087f.f19078a, this);
            m mVar = new m(str);
            Iterator it = this.f19085d.iterator();
            while (it.hasNext()) {
                ((n) it.next()).b(mVar);
            }
            this.f19085d.clear();
            for (int i12 = 0; i12 < this.f19086e.size(); i12++) {
                this.f19086e.valueAt(i12).b(mVar);
            }
            this.f19086e.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized boolean b(p pVar) throws Throwable {
        Throwable th2;
        int i10;
        try {
            try {
                i10 = this.f19082a;
            } catch (Throwable th3) {
                th = th3;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th4) {
            th = th4;
            th2 = th;
            throw th2;
        }
        try {
            if (i10 == 0) {
                this.f19085d.add(pVar);
                if (this.f19082a != 0) {
                    throw new IllegalStateException();
                }
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Starting bind to GmsCore");
                }
                this.f19082a = 1;
                Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                intent.setPackage("com.google.android.gms");
                va.b bVarA = va.b.a();
                Context context = this.f19087f.f19078a;
                if (bVarA.c(context, context.getClass().getName(), intent, this, 1, null)) {
                    this.f19087f.f19079b.schedule(new Runnable(this) { // from class: oa.f

                        /* renamed from: a, reason: collision with root package name */
                        public final e f19088a;

                        {
                            this.f19088a = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            e eVar = this.f19088a;
                            synchronized (eVar) {
                                if (eVar.f19082a == 1) {
                                    eVar.a("Timed out while binding");
                                }
                            }
                        }
                    }, 30L, TimeUnit.SECONDS);
                } else {
                    a("Unable to bind to service");
                }
                return true;
            }
            if (i10 == 1) {
                this.f19085d.add(pVar);
                return true;
            }
            if (i10 == 2) {
                this.f19085d.add(pVar);
                this.f19087f.f19079b.execute(new h(this));
                return true;
            }
            if (i10 == 3 || i10 == 4) {
                return false;
            }
            int i11 = this.f19082a;
            StringBuilder sb = new StringBuilder(26);
            sb.append("Unknown state: ");
            sb.append(i11);
            throw new IllegalStateException(sb.toString());
        } catch (Throwable th5) {
            th2 = th5;
            throw th2;
        }
    }

    public final synchronized void c() {
        try {
            if (this.f19082a == 2 && this.f19085d.isEmpty() && this.f19086e.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.f19082a = 3;
                va.b.a().b(this.f19087f.f19078a, this);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        this.f19087f.f19079b.execute(new Runnable(this, iBinder) { // from class: oa.i

            /* renamed from: a, reason: collision with root package name */
            public final e f19091a;

            /* renamed from: b, reason: collision with root package name */
            public final IBinder f19092b;

            {
                this.f19091a = this;
                this.f19092b = iBinder;
            }

            @Override // java.lang.Runnable
            public final void run() {
                e eVar = this.f19091a;
                IBinder iBinder2 = this.f19092b;
                synchronized (eVar) {
                    if (iBinder2 == null) {
                        eVar.a("Null service connection");
                        return;
                    }
                    try {
                        eVar.f19084c = new l(iBinder2);
                        eVar.f19082a = 2;
                        eVar.f19087f.f19079b.execute(new h(eVar));
                    } catch (RemoteException e10) {
                        eVar.a(e10.getMessage());
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        this.f19087f.f19079b.execute(new Runnable(this) { // from class: oa.k

            /* renamed from: a, reason: collision with root package name */
            public final e f19095a;

            {
                this.f19095a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f19095a.a("Service disconnected");
            }
        });
    }
}
