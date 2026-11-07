package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.h;
import androidx.room.i;
import androidx.room.m;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final String f3055a;

    /* renamed from: b, reason: collision with root package name */
    public final m f3056b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f3057c;

    /* renamed from: d, reason: collision with root package name */
    public final ph.i0 f3058d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f3059e;

    /* renamed from: f, reason: collision with root package name */
    public int f3060f;

    /* renamed from: g, reason: collision with root package name */
    public i f3061g;

    /* renamed from: h, reason: collision with root package name */
    public final sh.o0 f3062h;

    /* renamed from: i, reason: collision with root package name */
    public final b f3063i;

    /* renamed from: j, reason: collision with root package name */
    public final a f3064j;

    /* renamed from: k, reason: collision with root package name */
    public final c f3065k;

    public static final class a extends h.a {

        @vg.e(c = "androidx.room.MultiInstanceInvalidationClient$invalidationCallback$1$onInvalidation$1", f = "MultiInstanceInvalidationClient.android.kt", l = {87}, m = "invokeSuspend")
        /* renamed from: androidx.room.r$a$a, reason: collision with other inner class name */
        public static final class C0044a extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public Set f3067a;

            /* renamed from: b, reason: collision with root package name */
            public int f3068b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String[] f3069c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ r f3070d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0044a(String[] strArr, r rVar, tg.e<? super C0044a> eVar) {
                super(2, eVar);
                this.f3069c = strArr;
                this.f3070d = rVar;
            }

            @Override // vg.a
            public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
                return new C0044a(this.f3069c, this.f3070d, eVar);
            }

            @Override // eh.p
            public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
                return ((C0044a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
            }

            @Override // vg.a
            public final Object invokeSuspend(Object obj) {
                Set<String> tables;
                ug.a aVar = ug.a.f29706a;
                int i10 = this.f3068b;
                r rVar = this.f3070d;
                if (i10 == 0) {
                    pg.q.b(obj);
                    String[] strArr = this.f3069c;
                    Object[] elements = Arrays.copyOf(strArr, strArr.length);
                    kotlin.jvm.internal.r.e(elements, "elements");
                    Set setC = qg.o.C(elements);
                    sh.o0 o0Var = rVar.f3062h;
                    this.f3067a = setC;
                    this.f3068b = 1;
                    if (o0Var.c(setC, this) == aVar) {
                        return aVar;
                    }
                    tables = setC;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    tables = this.f3067a;
                    pg.q.b(obj);
                }
                m mVar = rVar.f3056b;
                kotlin.jvm.internal.r.e(tables, "tables");
                ReentrantLock reentrantLock = mVar.f3018e;
                reentrantLock.lock();
                try {
                    List<v> listC0 = qg.x.c0(mVar.f3017d.values());
                    reentrantLock.unlock();
                    for (v vVar : listC0) {
                        m.a aVar2 = vVar.f3092a;
                        aVar2.getClass();
                        if (!(aVar2 instanceof b)) {
                            String[] strArr2 = vVar.f3094c;
                            int length = strArr2.length;
                            Set<String> setA = qg.b0.f22711a;
                            if (length != 0) {
                                if (length != 1) {
                                    rg.g gVar = new rg.g();
                                    for (String str : tables) {
                                        int length2 = strArr2.length;
                                        int i11 = 0;
                                        while (true) {
                                            if (i11 < length2) {
                                                String str2 = strArr2[i11];
                                                if (mh.t.j(str2, str, true)) {
                                                    gVar.add(str2);
                                                    break;
                                                }
                                                i11++;
                                            }
                                        }
                                    }
                                    setA = qg.n0.a(gVar);
                                } else {
                                    Set set = tables;
                                    if (!(set instanceof Collection) || !set.isEmpty()) {
                                        Iterator it = set.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                break;
                                            }
                                            if (mh.t.j((String) it.next(), strArr2[0], true)) {
                                                setA = vVar.f3095d;
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                            if (!setA.isEmpty()) {
                                vVar.f3092a.a(setA);
                            }
                        }
                    }
                    return pg.f0.f21461a;
                } catch (Throwable th2) {
                    reentrantLock.unlock();
                    throw th2;
                }
            }
        }

        public a() {
            attachInterface(this, h.f2968g);
        }

        @Override // androidx.room.h
        public final void f(String[] tables) {
            kotlin.jvm.internal.r.e(tables, "tables");
            r rVar = r.this;
            ph.h.c(rVar.f3058d, null, null, new C0044a(tables, rVar, null), 3);
        }
    }

    public static final class b extends m.a {
        public b(String[] strArr) {
            super(strArr);
        }

        @Override // androidx.room.m.a
        public final void a(Set<String> tables) {
            kotlin.jvm.internal.r.e(tables, "tables");
            r rVar = r.this;
            if (rVar.f3059e.get()) {
                return;
            }
            try {
                i iVar = rVar.f3061g;
                if (iVar != null) {
                    iVar.D(rVar.f3060f, (String[]) tables.toArray(new String[0]));
                }
            } catch (RemoteException e10) {
                Log.w("ROOM", "Cannot broadcast invalidation", e10);
            }
        }
    }

    public static final class c implements ServiceConnection {
        public c() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v9, types: [androidx.room.i] */
        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName name, IBinder service) {
            i.a.C0042a c0042a;
            kotlin.jvm.internal.r.e(name, "name");
            kotlin.jvm.internal.r.e(service, "service");
            int i10 = i.a.f2984a;
            IInterface iInterfaceQueryLocalInterface = service.queryLocalInterface(i.f2983h);
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof i)) {
                i.a.C0042a c0042a2 = new i.a.C0042a();
                c0042a2.f2985a = service;
                c0042a = c0042a2;
            } else {
                c0042a = (i) iInterfaceQueryLocalInterface;
            }
            r rVar = r.this;
            rVar.f3061g = c0042a;
            try {
                rVar.f3060f = c0042a.k(rVar.f3064j, rVar.f3055a);
            } catch (RemoteException e10) {
                Log.w("ROOM", "Cannot register multi-instance invalidation callback", e10);
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName name) {
            kotlin.jvm.internal.r.e(name, "name");
            r.this.f3061g = null;
        }
    }

    public r(Context context, String name, m mVar) {
        kotlin.jvm.internal.r.e(context, "context");
        kotlin.jvm.internal.r.e(name, "name");
        this.f3055a = name;
        this.f3056b = mVar;
        this.f3057c = context.getApplicationContext();
        this.f3058d = mVar.f3014a.getCoroutineScope();
        this.f3059e = new AtomicBoolean(true);
        this.f3062h = sh.q0.a(0, 0, rh.a.f23576a);
        this.f3063i = new b(mVar.f3015b);
        this.f3064j = new a();
        this.f3065k = new c();
    }

    public final void a(Intent serviceIntent) {
        kotlin.jvm.internal.r.e(serviceIntent, "serviceIntent");
        if (this.f3059e.compareAndSet(true, false)) {
            this.f3057c.bindService(serviceIntent, this.f3065k, 1);
            b observer = this.f3063i;
            kotlin.jvm.internal.r.e(observer, "observer");
            m mVar = this.f3056b;
            LinkedHashMap linkedHashMap = mVar.f3017d;
            a1 a1Var = mVar.f3016c;
            pg.n<String[], int[]> nVarG = a1Var.g(observer.f3024a);
            String[] strArr = nVarG.f21469a;
            int[] iArr = nVarG.f21470b;
            v vVar = new v(observer, iArr, strArr);
            ReentrantLock reentrantLock = mVar.f3018e;
            reentrantLock.lock();
            try {
                v vVar2 = linkedHashMap.containsKey(observer) ? (v) qg.k0.c(observer, linkedHashMap) : (v) linkedHashMap.put(observer, vVar);
                reentrantLock.unlock();
                if (vVar2 == null) {
                    a1Var.f2843h.a(iArr);
                }
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
    }
}
