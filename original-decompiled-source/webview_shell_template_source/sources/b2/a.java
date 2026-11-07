package b2;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import com.htmltoapk.template.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile a f1983d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f1984e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Context f1987c;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f1986b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1985a = new HashMap();

    public a(Context context) {
        this.f1987c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f1983d == null) {
            synchronized (f1984e) {
                try {
                    if (f1983d == null) {
                        f1983d = new a(context);
                    }
                } finally {
                }
            }
        }
        return f1983d;
    }

    public final void a(Bundle bundle) throws ClassNotFoundException {
        HashSet hashSet;
        String string = this.f1987c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    hashSet = this.f1986b;
                    if (!zHasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e6) {
                throw new c(e6);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object objB;
        HashMap map = this.f1985a;
        if (d2.a.b()) {
            try {
                Trace.beginSection(d2.a.d(cls.getSimpleName()));
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (map.containsKey(cls)) {
            objB = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                b bVar = (b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class<? extends b<?>>> listA = bVar.a();
                if (!listA.isEmpty()) {
                    for (Class<? extends b<?>> cls2 : listA) {
                        if (!map.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                objB = bVar.b(this.f1987c);
                hashSet.remove(cls);
                map.put(cls, objB);
            } catch (Throwable th2) {
                throw new c(th2);
            }
        }
        Trace.endSection();
        return objB;
    }
}
