package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.d0;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class q0<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: b, reason: collision with root package name */
    public static final q0<?, ?> f2133b;

    /* renamed from: a, reason: collision with root package name */
    public boolean f2134a = true;

    static {
        q0<?, ?> q0Var = new q0<>();
        f2133b = q0Var;
        q0Var.f2134a = false;
    }

    public static int c(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof d0.c) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        Charset charset = d0.f2005a;
        int i10 = length;
        for (byte b10 : bArr) {
            i10 = (i10 * 31) + b10;
        }
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        e();
        super.clear();
    }

    public final void e() {
        if (!this.f2134a) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005d A[RETURN] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z10;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this != map) {
                if (size() == map.size()) {
                    for (Map.Entry<K, V> entry : entrySet()) {
                        if (map.containsKey(entry.getKey())) {
                            V value = entry.getValue();
                            Object obj2 = map.get(entry.getKey());
                            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                            }
                        }
                    }
                    z10 = true;
                    if (z10) {
                        return true;
                    }
                }
                z10 = false;
                if (z10) {
                }
            } else {
                z10 = true;
                if (z10) {
                }
            }
        }
        return false;
    }

    public final q0<K, V> f() {
        if (isEmpty()) {
            return new q0<>();
        }
        q0<K, V> q0Var = new q0<>(this);
        q0Var.f2134a = true;
        return q0Var;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iC = 0;
        for (Map.Entry<K, V> entry : entrySet()) {
            iC += c(entry.getValue()) ^ c(entry.getKey());
        }
        return iC;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k10, V v10) {
        e();
        Charset charset = d0.f2005a;
        k10.getClass();
        v10.getClass();
        return (V) super.put(k10, v10);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        e();
        for (K k10 : map.keySet()) {
            Charset charset = d0.f2005a;
            k10.getClass();
            map.get(k10).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        e();
        return (V) super.remove(obj);
    }
}
