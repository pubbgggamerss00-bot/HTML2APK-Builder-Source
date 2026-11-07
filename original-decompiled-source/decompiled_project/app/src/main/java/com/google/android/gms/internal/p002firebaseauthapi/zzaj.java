package com.google.android.gms.internal.p002firebaseauthapi;

import j2.y;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public abstract class zzaj<E> extends zzai<E> implements List<E>, RandomAccess {
    private static final zzaz<Object> zza = new zzal(zzar.zza, 0);

    public static <E> zzaj<E> zzb(Object[] objArr, int i10) {
        return i10 == 0 ? (zzaj<E>) zzar.zza : new zzar(objArr, i10);
    }

    public static <E> zzam<E> zzg() {
        return new zzam<>();
    }

    public static <E> zzaj<E> zzh() {
        return (zzaj<E>) zzar.zza;
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzai, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == zzw.zza(this)) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i10 = 0; i10 < size; i10++) {
                        if (zzp.zza(get(i10), list.get(i10))) {
                        }
                    }
                    return true;
                }
                int size2 = size();
                Iterator<E> it = list.iterator();
                int i11 = 0;
                while (true) {
                    if (i11 < size2) {
                        if (!it.hasNext()) {
                            break;
                        }
                        E e10 = get(i11);
                        i11++;
                        if (!zzp.zza(e10, it.next())) {
                            break;
                        }
                    } else if (!it.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = ~(~(get(i11).hashCode() + (i10 * 31)));
        }
        return i10;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (obj.equals(get(i10))) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public /* synthetic */ ListIterator listIterator() {
        return (zzaz) listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzai
    public int zza(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzai
    @Deprecated
    public final zzaj<E> zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzai, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzba<E> iterator() {
        return (zzaz) listIterator();
    }

    @Override // java.util.List
    public /* synthetic */ ListIterator listIterator(int i10) {
        zzw.zzb(i10, size());
        return isEmpty() ? zza : new zzal(this, i10);
    }

    public static <E> zzaj<E> zza(Object[] objArr) {
        return zzb(objArr, objArr.length);
    }

    private static <E> zzaj<E> zzb(Object... objArr) {
        int length = objArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (objArr[i10] == null) {
                throw new NullPointerException(y.a(i10, "at index "));
            }
        }
        return zzb(objArr, objArr.length);
    }

    public static <E> zzaj<E> zza(Collection<? extends E> collection) {
        if (collection instanceof zzai) {
            zzaj<E> zzajVarZzc = ((zzai) collection).zzc();
            if (!zzajVarZzc.zze()) {
                return zzajVarZzc;
            }
            Object[] array = zzajVarZzc.toArray();
            return zzb(array, array.length);
        }
        return zzb(collection.toArray());
    }

    public static <E> zzaj<E> zza(E e10, E e11, E e12, E e13, E e14, E e15, E e16, E e17) {
        return zzb(e10, e11, e12, e13, e14, e15, e16, e17);
    }

    @Override // java.util.List
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public zzaj<E> subList(int i10, int i11) {
        zzw.zza(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        if (i12 == 0) {
            return (zzaj<E>) zzar.zza;
        }
        return new zzao(this, i10, i12);
    }
}
