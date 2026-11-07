package xd;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import vd.g;

/* loaded from: classes2.dex */
public final class f implements vd.e, g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f33555a = true;

    /* renamed from: b, reason: collision with root package name */
    public final JsonWriter f33556b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<Class<?>, vd.d<?>> f33557c;

    /* renamed from: d, reason: collision with root package name */
    public final Map<Class<?>, vd.f<?>> f33558d;

    /* renamed from: e, reason: collision with root package name */
    public final vd.d<Object> f33559e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f33560f;

    public f(BufferedWriter bufferedWriter, HashMap map, HashMap map2, a aVar, boolean z10) {
        this.f33556b = new JsonWriter(bufferedWriter);
        this.f33557c = map;
        this.f33558d = map2;
        this.f33559e = aVar;
        this.f33560f = z10;
    }

    @Override // vd.e
    public final vd.e a(vd.c cVar, Object obj) throws IOException {
        e(obj, cVar.f30749a);
        return this;
    }

    @Override // vd.g
    public final g add(String str) throws IOException {
        f();
        this.f33556b.value(str);
        return this;
    }

    @Override // vd.e
    public final vd.e b(vd.c cVar, long j10) throws IOException {
        String str = cVar.f30749a;
        f();
        JsonWriter jsonWriter = this.f33556b;
        jsonWriter.name(str);
        f();
        jsonWriter.value(j10);
        return this;
    }

    @Override // vd.g
    public final g c(boolean z10) throws IOException {
        f();
        this.f33556b.value(z10);
        return this;
    }

    public final f d(Object obj) throws IOException {
        JsonWriter jsonWriter = this.f33556b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                jsonWriter.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    d(it.next());
                }
                jsonWriter.endArray();
                return this;
            }
            if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        e(entry.getValue(), (String) key);
                    } catch (ClassCastException e10) {
                        throw new vd.b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e10);
                    }
                }
                jsonWriter.endObject();
                return this;
            }
            vd.d<?> dVar = this.f33557c.get(obj.getClass());
            if (dVar != null) {
                jsonWriter.beginObject();
                dVar.a(obj, this);
                jsonWriter.endObject();
                return this;
            }
            vd.f<?> fVar = this.f33558d.get(obj.getClass());
            if (fVar != null) {
                fVar.a(obj, this);
                return this;
            }
            if (obj instanceof Enum) {
                String strName = ((Enum) obj).name();
                f();
                jsonWriter.value(strName);
                return this;
            }
            jsonWriter.beginObject();
            this.f33559e.a(obj, this);
            jsonWriter.endObject();
            return this;
        }
        if (obj instanceof byte[]) {
            f();
            jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
            return this;
        }
        jsonWriter.beginArray();
        int i10 = 0;
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i10 < length) {
                jsonWriter.value(r6[i10]);
                i10++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i10 < length2) {
                long j10 = jArr[i10];
                f();
                jsonWriter.value(j10);
                i10++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i10 < length3) {
                jsonWriter.value(dArr[i10]);
                i10++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i10 < length4) {
                jsonWriter.value(zArr[i10]);
                i10++;
            }
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i10 < length5) {
                d(numberArr[i10]);
                i10++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i10 < length6) {
                d(objArr[i10]);
                i10++;
            }
        }
        jsonWriter.endArray();
        return this;
    }

    public final f e(Object obj, String str) throws IOException {
        boolean z10 = this.f33560f;
        JsonWriter jsonWriter = this.f33556b;
        if (z10) {
            if (obj == null) {
                return this;
            }
            f();
            jsonWriter.name(str);
            d(obj);
            return this;
        }
        f();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        d(obj);
        return this;
    }

    public final void f() throws IOException {
        if (!this.f33555a) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }
}
