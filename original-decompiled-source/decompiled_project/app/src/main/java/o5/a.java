package o5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import c5.n;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final Object f18959e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public static a f18960f;

    /* renamed from: a, reason: collision with root package name */
    public final Context f18961a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap<BroadcastReceiver, ArrayList<c>> f18962b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap<String, ArrayList<c>> f18963c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList<b> f18964d = new ArrayList<>();

    /* renamed from: o5.a$a, reason: collision with other inner class name */
    public class HandlerC0214a extends Handler {
        public HandlerC0214a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int size;
            b[] bVarArr;
            if (message.what != 1) {
                super.handleMessage(message);
                return;
            }
            a aVar = a.this;
            do {
                synchronized (aVar.f18962b) {
                    try {
                        size = aVar.f18964d.size();
                        if (size <= 0) {
                            return;
                        }
                        bVarArr = new b[size];
                        aVar.f18964d.toArray(bVarArr);
                        aVar.f18964d.clear();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } while (size <= 0);
            b bVar = bVarArr[0];
            throw null;
        }
    }

    public static final class b {
    }

    public static final class c {
        public final String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{null filter=null}");
            return sb.toString();
        }
    }

    public a(Context context) {
        this.f18961a = context;
        new HandlerC0214a(context.getMainLooper());
    }

    public static a a(n nVar) {
        a aVar;
        synchronized (f18959e) {
            try {
                if (f18960f == null) {
                    f18960f = new a(nVar.getApplicationContext());
                }
                aVar = f18960f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    public final void b(Intent intent) {
        synchronized (this.f18962b) {
            try {
                intent.getAction();
                String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f18961a.getContentResolver());
                intent.getData();
                String scheme = intent.getScheme();
                intent.getCategories();
                boolean z10 = (intent.getFlags() & 8) != 0;
                if (z10) {
                    Log.v("LocalBroadcastManager", "Resolving type " + strResolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
                }
                ArrayList<c> arrayList = this.f18963c.get(intent.getAction());
                if (arrayList != null) {
                    if (z10) {
                        Log.v("LocalBroadcastManager", "Action list: " + arrayList);
                    }
                    if (arrayList.size() > 0) {
                        c cVar = arrayList.get(0);
                        if (z10) {
                            cVar.getClass();
                            Log.v("LocalBroadcastManager", "Matching against filter null");
                        }
                        throw null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
