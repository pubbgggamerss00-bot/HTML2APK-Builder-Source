package id;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.internal.c;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.p;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p.a;
import sd.q;
import td.v;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f14478j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static final p.a f14479k = new p.a();

    /* renamed from: a, reason: collision with root package name */
    public final Context f14480a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14481b;

    /* renamed from: c, reason: collision with root package name */
    public final l f14482c;

    /* renamed from: d, reason: collision with root package name */
    public final sd.j f14483d;

    /* renamed from: g, reason: collision with root package name */
    public final q<le.a> f14486g;

    /* renamed from: h, reason: collision with root package name */
    public final fe.b<ce.f> f14487h;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f14484e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f14485f = new AtomicBoolean();

    /* renamed from: i, reason: collision with root package name */
    public final CopyOnWriteArrayList f14488i = new CopyOnWriteArrayList();

    public interface a {
        void a(boolean z10);
    }

    public static class b implements c.a {

        /* renamed from: a, reason: collision with root package name */
        public static final AtomicReference<b> f14489a = new AtomicReference<>();

        @Override // com.google.android.gms.common.api.internal.c.a
        public final void a(boolean z10) {
            synchronized (e.f14478j) {
                try {
                    ArrayList arrayList = new ArrayList(e.f14479k.values());
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        e eVar = (e) obj;
                        if (eVar.f14484e.get()) {
                            Log.d("FirebaseApp", "Notifying background state change listeners.");
                            Iterator it = eVar.f14488i.iterator();
                            while (it.hasNext()) {
                                ((a) it.next()).a(z10);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public static class c extends BroadcastReceiver {

        /* renamed from: b, reason: collision with root package name */
        public static final AtomicReference<c> f14490b = new AtomicReference<>();

        /* renamed from: a, reason: collision with root package name */
        public final Context f14491a;

        public c(Context context) {
            this.f14491a = context;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            synchronized (e.f14478j) {
                try {
                    Iterator it = ((a.e) e.f14479k.values()).iterator();
                    while (it.hasNext()) {
                        ((e) it.next()).g();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f14491a.unregisterReceiver(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List] */
    public e(final Context context, String str, l lVar) throws PackageManager.NameNotFoundException {
        ?? arrayList;
        new CopyOnWriteArrayList();
        this.f14480a = context;
        p.d(str);
        this.f14481b = str;
        this.f14482c = lVar;
        id.a aVar = FirebaseInitProvider.f6904a;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayList2 = new ArrayList();
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) ComponentDiscoveryService.class), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", ComponentDiscoveryService.class + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str2 : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2)) && str2.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str2.substring(31));
                }
            }
        }
        for (final String str3 : arrayList) {
            arrayList2.add(new fe.b() { // from class: sd.c
                @Override // fe.b
                public final Object get() throws ClassNotFoundException {
                    String str4 = str3;
                    try {
                        Class<?> cls = Class.forName(str4);
                        if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                            return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                        }
                        throw new p("Class " + str4 + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                    } catch (ClassNotFoundException unused2) {
                        Log.w("ComponentDiscovery", "Class " + str4 + " is not an found.");
                        return null;
                    } catch (IllegalAccessException e10) {
                        throw new p(i8.n.d("Could not instantiate ", str4, "."), e10);
                    } catch (InstantiationException e11) {
                        throw new p(i8.n.d("Could not instantiate ", str4, "."), e11);
                    } catch (NoSuchMethodException e12) {
                        throw new p(m3.a.a("Could not instantiate ", str4), e12);
                    } catch (InvocationTargetException e13) {
                        throw new p(m3.a.a("Could not instantiate ", str4), e13);
                    }
                }
            });
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        v vVar = v.f28756a;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList2);
        final FirebaseCommonRegistrar firebaseCommonRegistrar = new FirebaseCommonRegistrar();
        arrayList3.add(new fe.b() { // from class: sd.i
            @Override // fe.b
            public final Object get() {
                return firebaseCommonRegistrar;
            }
        });
        final ExecutorsRegistrar executorsRegistrar = new ExecutorsRegistrar();
        arrayList3.add(new fe.b() { // from class: sd.i
            @Override // fe.b
            public final Object get() {
                return executorsRegistrar;
            }
        });
        arrayList4.add(sd.a.c(context, Context.class, new Class[0]));
        arrayList4.add(sd.a.c(this, e.class, new Class[0]));
        arrayList4.add(sd.a.c(lVar, l.class, new Class[0]));
        oe.b bVar = new oe.b();
        if (u3.j.a(context) && FirebaseInitProvider.f6905b.get()) {
            arrayList4.add(sd.a.c(aVar, n.class, new Class[0]));
        }
        sd.j jVar = new sd.j(arrayList3, arrayList4, bVar);
        this.f14483d = jVar;
        Trace.endSection();
        this.f14486g = new q<>(new fe.b() { // from class: id.c
            @Override // fe.b
            public final Object get() {
                e eVar = this.f14475a;
                return new le.a(context, eVar.f(), (zd.c) eVar.f14483d.a(zd.c.class));
            }
        });
        this.f14487h = jVar.d(ce.f.class);
        a aVar2 = new a() { // from class: id.d
            @Override // id.e.a
            public final void a(boolean z10) {
                if (z10) {
                    return;
                }
                this.f14477a.f14487h.get().c();
            }
        };
        a();
        if (this.f14484e.get()) {
            com.google.android.gms.common.api.internal.c.f5945e.f5946a.get();
        }
        this.f14488i.add(aVar2);
        Trace.endSection();
    }

    public static ArrayList c() {
        ArrayList arrayList = new ArrayList();
        synchronized (f14478j) {
            try {
                Iterator it = ((a.e) f14479k.values()).iterator();
                while (it.hasNext()) {
                    e eVar = (e) it.next();
                    eVar.a();
                    arrayList.add(eVar.f14481b);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static e d() {
        e eVar;
        synchronized (f14478j) {
            try {
                eVar = (e) f14479k.get("[DEFAULT]");
                if (eVar == null) {
                    StringBuilder sb = new StringBuilder("Default FirebaseApp is not initialized in this process ");
                    if (wa.e.f31485a == null) {
                        wa.e.f31485a = Application.getProcessName();
                    }
                    sb.append(wa.e.f31485a);
                    sb.append(". Make sure to call FirebaseApp.initializeApp(Context) first.");
                    throw new IllegalStateException(sb.toString());
                }
                eVar.f14487h.get().c();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static e e(String str) {
        e eVar;
        String str2;
        synchronized (f14478j) {
            try {
                eVar = (e) f14479k.get(str.trim());
                if (eVar == null) {
                    ArrayList arrayListC = c();
                    if (arrayListC.isEmpty()) {
                        str2 = "";
                    } else {
                        str2 = "Available app names: " + TextUtils.join(", ", arrayListC);
                    }
                    throw new IllegalStateException("FirebaseApp with name " + str + " doesn't exist. " + str2);
                }
                eVar.f14487h.get().c();
            } finally {
            }
        }
        return eVar;
    }

    public static e h(Context context) {
        synchronized (f14478j) {
            try {
                if (f14479k.containsKey("[DEFAULT]")) {
                    return d();
                }
                l lVarA = l.a(context);
                if (lVarA == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return i(context, lVarA);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static e i(Context context, l lVar) {
        e eVar;
        AtomicReference<b> atomicReference = b.f14489a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference<b> atomicReference2 = b.f14489a;
            if (atomicReference2.get() == null) {
                b bVar = new b();
                while (true) {
                    if (atomicReference2.compareAndSet(null, bVar)) {
                        com.google.android.gms.common.api.internal.c.b(application);
                        com.google.android.gms.common.api.internal.c.f5945e.a(bVar);
                        break;
                    }
                    if (atomicReference2.get() != null) {
                        break;
                    }
                }
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f14478j) {
            p.a aVar = f14479k;
            p.h("FirebaseApp name [DEFAULT] already exists!", !aVar.containsKey("[DEFAULT]"));
            p.g(context, "Application context cannot be null.");
            eVar = new e(context, "[DEFAULT]", lVar);
            aVar.put("[DEFAULT]", eVar);
        }
        eVar.g();
        return eVar;
    }

    public final void a() {
        p.h("FirebaseApp was deleted", !this.f14485f.get());
    }

    public final <T> T b(Class<T> cls) {
        a();
        return (T) this.f14483d.a(cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        eVar.a();
        return this.f14481b.equals(eVar.f14481b);
    }

    public final String f() {
        StringBuilder sb = new StringBuilder();
        a();
        sb.append(p9.d.c(this.f14481b.getBytes(Charset.defaultCharset())));
        sb.append("+");
        a();
        sb.append(p9.d.c(this.f14482c.f14493b.getBytes(Charset.defaultCharset())));
        return sb.toString();
    }

    public final void g() {
        HashMap map;
        if (!u3.j.a(this.f14480a)) {
            StringBuilder sb = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb.append(this.f14481b);
            Log.i("FirebaseApp", sb.toString());
            Context context = this.f14480a;
            AtomicReference<c> atomicReference = c.f14490b;
            if (atomicReference.get() == null) {
                c cVar = new c(context);
                while (!atomicReference.compareAndSet(null, cVar)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        a();
        sb2.append(this.f14481b);
        Log.i("FirebaseApp", sb2.toString());
        sd.j jVar = this.f14483d;
        a();
        boolean zEquals = "[DEFAULT]".equals(this.f14481b);
        AtomicReference<Boolean> atomicReference2 = jVar.f24864f;
        Boolean boolValueOf = Boolean.valueOf(zEquals);
        while (true) {
            if (atomicReference2.compareAndSet(null, boolValueOf)) {
                synchronized (jVar) {
                    map = new HashMap(jVar.f24859a);
                }
                jVar.i(map, zEquals);
                break;
            } else if (atomicReference2.get() != null) {
                break;
            }
        }
        this.f14487h.get().c();
    }

    public final int hashCode() {
        return this.f14481b.hashCode();
    }

    public final String toString() {
        o.a aVar = new o.a(this);
        aVar.a(this.f14481b, "name");
        aVar.a(this.f14482c, "options");
        return aVar.toString();
    }
}
