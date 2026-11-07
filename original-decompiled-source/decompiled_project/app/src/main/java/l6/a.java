package l6;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import com.basitce.htmltoapk.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile a f16731d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f16732e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Context f16735c;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f16734b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f16733a = new HashMap();

    public a(Context context) {
        this.f16735c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f16731d == null) {
            synchronized (f16732e) {
                try {
                    if (f16731d == null) {
                        f16731d = new a(context);
                    }
                } finally {
                }
            }
        }
        return f16731d;
    }

    public final void a(Bundle bundle) throws ClassNotFoundException {
        HashSet hashSet;
        String string = this.f16735c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    hashSet = this.f16734b;
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
            } catch (ClassNotFoundException e10) {
                throw new c(e10);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object objB;
        HashMap map = this.f16733a;
        if (m6.a.b()) {
            try {
                Trace.beginSection(m6.a.c(cls.getSimpleName()));
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
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
                objB = bVar.b(this.f16735c);
                hashSet.remove(cls);
                map.put(cls, objB);
            } catch (Throwable th3) {
                throw new c(th3);
            }
        }
        Trace.endSection();
        return objB;
    }
}
