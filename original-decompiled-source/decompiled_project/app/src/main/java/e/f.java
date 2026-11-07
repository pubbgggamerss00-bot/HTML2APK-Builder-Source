package e;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.l;
import f9.dc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f8092a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f8093b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f8094c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f8095d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final transient LinkedHashMap f8096e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f8097f = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f8098g = new Bundle();

    public static final class a<O> {

        /* renamed from: a, reason: collision with root package name */
        public final e.b<O> f8099a;

        /* renamed from: b, reason: collision with root package name */
        public final f.a<?, O> f8100b;

        public a(f.a aVar, e.b bVar) {
            this.f8099a = bVar;
            this.f8100b = aVar;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final l f8101a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f8102b = new ArrayList();

        public b(l lVar) {
            this.f8101a = lVar;
        }
    }

    public final boolean a(int i10, int i11, Intent intent) {
        String str = (String) this.f8092a.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        a aVar = (a) this.f8096e.get(str);
        if ((aVar != null ? aVar.f8099a : null) != null) {
            ArrayList arrayList = this.f8095d;
            if (arrayList.contains(str)) {
                aVar.f8099a.a(aVar.f8100b.c(intent, i11));
                arrayList.remove(str);
                return true;
            }
        }
        this.f8097f.remove(str);
        this.f8098g.putParcelable(str, new e.a(intent, i11));
        return true;
    }

    public abstract void b(int i10, f.a aVar, Object obj);

    public final i c(String key, f.a aVar, e.b bVar) {
        r.e(key, "key");
        d(key);
        this.f8096e.put(key, new a(aVar, bVar));
        LinkedHashMap linkedHashMap = this.f8097f;
        if (linkedHashMap.containsKey(key)) {
            Object obj = linkedHashMap.get(key);
            linkedHashMap.remove(key);
            bVar.a(obj);
        }
        Bundle bundle = this.f8098g;
        e.a aVar2 = (e.a) u3.c.a(bundle, key, e.a.class);
        if (aVar2 != null) {
            bundle.remove(key);
            bVar.a(aVar.c(aVar2.f8087b, aVar2.f8086a));
        }
        return new i(this, key, aVar);
    }

    public final void d(String str) {
        LinkedHashMap linkedHashMap = this.f8093b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        g nextFunction = g.f8103a;
        r.e(nextFunction, "nextFunction");
        Iterator it = new lh.a(new lh.f(nextFunction, new dc(nextFunction, 2))).iterator();
        while (it.hasNext()) {
            Number number = (Number) it.next();
            Integer numValueOf = Integer.valueOf(number.intValue());
            LinkedHashMap linkedHashMap2 = this.f8092a;
            if (!linkedHashMap2.containsKey(numValueOf)) {
                int iIntValue = number.intValue();
                linkedHashMap2.put(Integer.valueOf(iIntValue), str);
                linkedHashMap.put(str, Integer.valueOf(iIntValue));
                return;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public final void e(String key) {
        Integer num;
        r.e(key, "key");
        if (!this.f8095d.contains(key) && (num = (Integer) this.f8093b.remove(key)) != null) {
            this.f8092a.remove(num);
        }
        this.f8096e.remove(key);
        LinkedHashMap linkedHashMap = this.f8097f;
        if (linkedHashMap.containsKey(key)) {
            StringBuilder sbA = e.a("Dropping pending result for request ", key, ": ");
            sbA.append(linkedHashMap.get(key));
            Log.w("ActivityResultRegistry", sbA.toString());
            linkedHashMap.remove(key);
        }
        Bundle bundle = this.f8098g;
        if (bundle.containsKey(key)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + key + ": " + ((e.a) u3.c.a(bundle, key, e.a.class)));
            bundle.remove(key);
        }
        LinkedHashMap linkedHashMap2 = this.f8094c;
        b bVar = (b) linkedHashMap2.get(key);
        if (bVar != null) {
            ArrayList arrayList = bVar.f8102b;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                bVar.f8101a.c((androidx.lifecycle.r) obj);
            }
            arrayList.clear();
            linkedHashMap2.remove(key);
        }
    }
}
