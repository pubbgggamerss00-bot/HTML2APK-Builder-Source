package v1;

import android.content.Context;
import android.database.Cursor;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import z1.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public volatile a2.a f14765a;

    /* renamed from: b, reason: collision with root package name */
    public Executor f14766b;

    /* renamed from: c, reason: collision with root package name */
    public z1.b f14767c;

    /* renamed from: d, reason: collision with root package name */
    public final f f14768d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f14769e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f14770f;

    /* renamed from: g, reason: collision with root package name */
    @Deprecated
    public List<b> f14771g;
    public final ReentrantReadWriteLock h = new ReentrantReadWriteLock();

    /* renamed from: i, reason: collision with root package name */
    public final ThreadLocal<Integer> f14772i = new ThreadLocal<>();

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a<T extends g> {

        /* renamed from: a, reason: collision with root package name */
        public final String f14773a;

        /* renamed from: b, reason: collision with root package name */
        public final Context f14774b;

        /* renamed from: c, reason: collision with root package name */
        public ArrayList<b> f14775c;

        /* renamed from: d, reason: collision with root package name */
        public Executor f14776d;

        /* renamed from: e, reason: collision with root package name */
        public Executor f14777e;

        /* renamed from: f, reason: collision with root package name */
        public b.c f14778f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f14779g;
        public boolean h = true;

        /* renamed from: i, reason: collision with root package name */
        public boolean f14780i;

        /* renamed from: j, reason: collision with root package name */
        public final d f14781j;

        /* renamed from: k, reason: collision with root package name */
        public HashSet f14782k;

        public a(Context context, String str) {
            this.f14774b = context;
            this.f14773a = str;
            d dVar = new d();
            dVar.f14785a = new HashMap<>();
            this.f14781j = dVar;
        }

        public final void a(w1.a... aVarArr) {
            if (this.f14782k == null) {
                this.f14782k = new HashSet();
            }
            for (w1.a aVar : aVarArr) {
                this.f14782k.add(Integer.valueOf(aVar.f14862a));
                this.f14782k.add(Integer.valueOf(aVar.f14863b));
            }
            d dVar = this.f14781j;
            dVar.getClass();
            for (w1.a aVar2 : aVarArr) {
                int i6 = aVar2.f14862a;
                int i7 = aVar2.f14863b;
                HashMap<Integer, TreeMap<Integer, w1.a>> map = dVar.f14785a;
                TreeMap<Integer, w1.a> treeMap = map.get(Integer.valueOf(i6));
                if (treeMap == null) {
                    treeMap = new TreeMap<>();
                    map.put(Integer.valueOf(i6), treeMap);
                }
                w1.a aVar3 = treeMap.get(Integer.valueOf(i7));
                if (aVar3 != null) {
                    Log.w("ROOM", "Overriding migration " + aVar3 + " with " + aVar2);
                }
                treeMap.put(Integer.valueOf(i7), aVar2);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class c {
        public static final c s;

        /* renamed from: t, reason: collision with root package name */
        public static final c f14783t;

        /* renamed from: u, reason: collision with root package name */
        public static final /* synthetic */ c[] f14784u;

        /* JADX INFO: Fake field, exist only in values array */
        c EF0;

        static {
            c cVar = new c("AUTOMATIC", 0);
            c cVar2 = new c("TRUNCATE", 1);
            s = cVar2;
            c cVar3 = new c("WRITE_AHEAD_LOGGING", 2);
            f14783t = cVar3;
            f14784u = new c[]{cVar, cVar2, cVar3};
        }

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f14784u.clone();
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public HashMap<Integer, TreeMap<Integer, w1.a>> f14785a;
    }

    public g() {
        new ConcurrentHashMap();
        this.f14768d = d();
    }

    public final void a() {
        if (!this.f14769e && Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        if (!((a2.a) this.f14767c.g()).s.inTransaction() && this.f14772i.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @Deprecated
    public final void c() {
        a();
        z1.a aVarG = this.f14767c.g();
        this.f14768d.c(aVarG);
        ((a2.a) aVarG).a();
    }

    public abstract f d();

    public abstract z1.b e(v1.a aVar);

    @Deprecated
    public final void f() {
        ((a2.a) this.f14767c.g()).b();
        if (((a2.a) this.f14767c.g()).s.inTransaction()) {
            return;
        }
        f fVar = this.f14768d;
        if (fVar.f14755d.compareAndSet(false, true)) {
            fVar.f14754c.f14766b.execute(fVar.f14759i);
        }
    }

    public final Cursor g(z1.c cVar) {
        a();
        b();
        return ((a2.a) this.f14767c.g()).e(cVar);
    }

    @Deprecated
    public final void h() {
        ((a2.a) this.f14767c.g()).f();
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static abstract class b {
        public void a(a2.a aVar) {
        }
    }
}
