package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.y;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class d0 extends c<String> implements e0, RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f6643b;

    static {
        new d0(10).f6635a = false;
    }

    public d0(int i10) {
        this((ArrayList<Object>) new ArrayList(i10));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        a();
        this.f6643b.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(this.f6643b.size(), collection);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        a();
        this.f6643b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public final void d0(h hVar) {
        a();
        this.f6643b.add(hVar);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        ArrayList arrayList = this.f6643b;
        Object obj = arrayList.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            String strM = hVar.size() == 0 ? "" : hVar.m(y.f6818a);
            if (hVar.f()) {
                arrayList.set(i10, strM);
            }
            return strM;
        }
        byte[] bArr = (byte[]) obj;
        String str = new String(bArr, y.f6818a);
        if (s1.f6761a.c(bArr, 0, bArr.length)) {
            arrayList.set(i10, str);
        }
        return str;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public final Object getRaw(int i10) {
        return this.f6643b.get(i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public final List<?> getUnderlyingElements() {
        return Collections.unmodifiableList(this.f6643b);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public final e0 getUnmodifiableView() {
        return this.f6635a ? new q1(this) : this;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y.c
    public final y.c mutableCopyWithCapacity(int i10) {
        ArrayList arrayList = this.f6643b;
        if (i10 < arrayList.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList2 = new ArrayList(i10);
        arrayList2.addAll(arrayList);
        return new d0((ArrayList<Object>) arrayList2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        a();
        Object objRemove = this.f6643b.remove(i10);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof h)) {
            return new String((byte[]) objRemove, y.f6818a);
        }
        h hVar = (h) objRemove;
        return hVar.size() == 0 ? "" : hVar.m(y.f6818a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        a();
        Object obj2 = this.f6643b.set(i10, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof h)) {
            return new String((byte[]) obj2, y.f6818a);
        }
        h hVar = (h) obj2;
        return hVar.size() == 0 ? "" : hVar.m(y.f6818a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6643b.size();
    }

    public d0(ArrayList<Object> arrayList) {
        this.f6643b = arrayList;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection<? extends String> collection) {
        a();
        if (collection instanceof e0) {
            collection = ((e0) collection).getUnderlyingElements();
        }
        boolean zAddAll = this.f6643b.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }
}
