package com.google.android.gms.internal.fido;

import j2.y;
import java.io.Serializable;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class zzcd implements Map, Serializable {
    static final Map.Entry[] zza = new Map.Entry[0];
    private transient zzcf zzb;

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return zzcy.zza(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        if (size < 0) {
            throw new IllegalArgumentException(y.a(size, "size cannot be negative but was: "));
        }
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb.append('{');
        boolean z10 = true;
        for (Map.Entry entry : entrySet()) {
            if (!z10) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z10 = false;
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Map
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public zzby values() {
        throw null;
    }

    public abstract zzcf zzb();

    @Override // java.util.Map
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzcf entrySet() {
        zzcf zzcfVar = this.zzb;
        if (zzcfVar != null) {
            return zzcfVar;
        }
        zzcf zzcfVarZzb = zzb();
        this.zzb = zzcfVarZzb;
        return zzcfVarZzb;
    }

    @Override // java.util.Map
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public zzcf keySet() {
        throw null;
    }
}
