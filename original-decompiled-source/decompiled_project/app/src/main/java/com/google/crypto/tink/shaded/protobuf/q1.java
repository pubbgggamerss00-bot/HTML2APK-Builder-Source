package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class q1 extends AbstractList<String> implements e0, RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f6743a;

    public class a implements ListIterator<String> {

        /* renamed from: a, reason: collision with root package name */
        public ListIterator<String> f6744a;

        @Override // java.util.ListIterator
        public final void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f6744a.hasNext();
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f6744a.hasPrevious();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final Object next() {
            return this.f6744a.next();
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f6744a.nextIndex();
        }

        @Override // java.util.ListIterator
        public final String previous() {
            return this.f6744a.previous();
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f6744a.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator
        public final void set(String str) {
            throw new UnsupportedOperationException();
        }
    }

    public class b implements Iterator<String> {

        /* renamed from: a, reason: collision with root package name */
        public Iterator<String> f6745a;

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f6745a.hasNext();
        }

        @Override // java.util.Iterator
        public final String next() {
            return this.f6745a.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public q1(d0 d0Var) {
        this.f6743a = d0Var;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public final void d0(h hVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return (String) this.f6743a.get(i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public final Object getRaw(int i10) {
        return this.f6743a.f6643b.get(i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public final List<?> getUnderlyingElements() {
        return Collections.unmodifiableList(this.f6743a.f6643b);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public final e0 getUnmodifiableView() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        b bVar = new b();
        bVar.f6745a = this.f6743a.iterator();
        return bVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i10) {
        a aVar = new a();
        aVar.f6744a = this.f6743a.listIterator(i10);
        return aVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6743a.size();
    }
}
