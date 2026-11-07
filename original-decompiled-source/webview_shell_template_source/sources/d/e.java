package d;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f12636a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f12637b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f12638c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f12639d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final transient LinkedHashMap f12640e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f12641f = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f12642g = new Bundle();

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class a<O> {

        /* renamed from: a, reason: collision with root package name */
        public final d.b<O> f12643a;

        /* renamed from: b, reason: collision with root package name */
        public final e.a<?, O> f12644b;

        public a(e.a aVar, d.b bVar) {
            this.f12643a = bVar;
            this.f12644b = aVar;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final androidx.lifecycle.h f12645a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f12646b = new ArrayList();

        public b(androidx.lifecycle.h hVar) {
            this.f12645a = hVar;
        }
    }

    public final boolean a(int i6, int i7, Intent intent) {
        String str = (String) this.f12636a.get(Integer.valueOf(i6));
        if (str == null) {
            return false;
        }
        a aVar = (a) this.f12640e.get(str);
        if ((aVar != null ? aVar.f12643a : null) != null) {
            ArrayList arrayList = this.f12639d;
            if (arrayList.contains(str)) {
                aVar.f12643a.b(aVar.f12644b.c(intent, i7));
                arrayList.remove(str);
                return true;
            }
        }
        this.f12641f.remove(str);
        this.f12642g.putParcelable(str, new d.a(intent, i7));
        return true;
    }

    public abstract void b(int i6, e.a aVar, Object obj);

    public final h c(String str, e.a aVar, d.b bVar) {
        kotlin.jvm.internal.j.e("key", str);
        d(str);
        this.f12640e.put(str, new a(aVar, bVar));
        LinkedHashMap linkedHashMap = this.f12641f;
        if (linkedHashMap.containsKey(str)) {
            Object obj = linkedHashMap.get(str);
            linkedHashMap.remove(str);
            bVar.b(obj);
        }
        Bundle bundle = this.f12642g;
        d.a aVar2 = (d.a) q0.b.a(str, bundle);
        if (aVar2 != null) {
            bundle.remove(str);
            bVar.b(aVar.c(aVar2.f12632t, aVar2.s));
        }
        return new h(this, str, aVar);
    }

    public final void d(String str) {
        LinkedHashMap linkedHashMap = this.f12637b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        f fVar = f.s;
        kotlin.jvm.internal.j.e("nextFunction", fVar);
        Iterator it = new w5.a(new w5.c(fVar, new w5.i(0, fVar))).iterator();
        while (it.hasNext()) {
            Number number = (Number) it.next();
            Integer numValueOf = Integer.valueOf(number.intValue());
            LinkedHashMap linkedHashMap2 = this.f12636a;
            if (!linkedHashMap2.containsKey(numValueOf)) {
                int iIntValue = number.intValue();
                linkedHashMap2.put(Integer.valueOf(iIntValue), str);
                linkedHashMap.put(str, Integer.valueOf(iIntValue));
                return;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public final void e(String str) {
        Integer num;
        kotlin.jvm.internal.j.e("key", str);
        if (!this.f12639d.contains(str) && (num = (Integer) this.f12637b.remove(str)) != null) {
            this.f12636a.remove(num);
        }
        this.f12640e.remove(str);
        LinkedHashMap linkedHashMap = this.f12641f;
        if (linkedHashMap.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + linkedHashMap.get(str));
            linkedHashMap.remove(str);
        }
        Bundle bundle = this.f12642g;
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((d.a) q0.b.a(str, bundle)));
            bundle.remove(str);
        }
        LinkedHashMap linkedHashMap2 = this.f12638c;
        b bVar = (b) linkedHashMap2.get(str);
        if (bVar != null) {
            ArrayList arrayList = bVar.f12646b;
            int size = arrayList.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj = arrayList.get(i6);
                i6++;
                bVar.f12645a.c((k) obj);
            }
            arrayList.clear();
            linkedHashMap2.remove(str);
        }
    }
}
