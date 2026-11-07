package kotlinx.serialization.json;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

@zh.g(with = JsonObjectSerializer.class)
/* loaded from: classes2.dex */
public final class v extends h implements Map<String, h>, fh.a {
    public static final a Companion = new a();

    /* renamed from: a, reason: collision with root package name */
    public final Map<String, h> f16457a;

    public static final class a {
        public final zh.b<v> serializer() {
            return JsonObjectSerializer.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public v(Map<String, ? extends h> content) {
        kotlin.jvm.internal.r.e(content, "content");
        this.f16457a = content;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ h compute(String str, BiFunction<? super String, ? super h, ? extends h> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ h computeIfAbsent(String str, Function<? super String, ? extends h> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ h computeIfPresent(String str, BiFunction<? super String, ? super h, ? extends h> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return this.f16457a.containsKey((String) obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        return this.f16457a.containsValue((h) obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, h>> entrySet() {
        return this.f16457a.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return kotlin.jvm.internal.r.a(this.f16457a, obj);
    }

    @Override // java.util.Map
    public final h get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return this.f16457a.get((String) obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f16457a.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f16457a.isEmpty();
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        return this.f16457a.keySet();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ h merge(String str, h hVar, BiFunction<? super h, ? super h, ? extends h> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ h put(String str, h hVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends h> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ h putIfAbsent(String str, h hVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final h remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ h replace(String str, h hVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction<? super String, ? super h, ? extends h> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f16457a.size();
    }

    public final String toString() {
        return qg.x.I(this.f16457a.entrySet(), ",", "{", "}", new u(0), 24);
    }

    @Override // java.util.Map
    public final Collection<h> values() {
        return this.f16457a.values();
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ boolean replace(String str, h hVar, h hVar2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
