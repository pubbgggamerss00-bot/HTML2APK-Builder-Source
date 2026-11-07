package mc;

import d0.h0;
import i0.u2;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractQueue;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Logger;
import lc.d;
import mc.a;
import mc.b;
import mc.g;
import nc.j0;
import nc.w0;
import qc.e;
import qc.l;

/* loaded from: classes2.dex */
public final class d<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V> {

    /* renamed from: x, reason: collision with root package name */
    public static final Logger f18050x = Logger.getLogger(d.class.getName());

    /* renamed from: y, reason: collision with root package name */
    public static final a f18051y = new a();

    /* renamed from: z, reason: collision with root package name */
    public static final b f18052z = new b();

    /* renamed from: a, reason: collision with root package name */
    public final int f18053a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18054b;

    /* renamed from: c, reason: collision with root package name */
    public final p<K, V>[] f18055c;

    /* renamed from: d, reason: collision with root package name */
    public final int f18056d;

    /* renamed from: e, reason: collision with root package name */
    public final lc.d<Object> f18057e;

    /* renamed from: f, reason: collision with root package name */
    public final lc.d<Object> f18058f;

    /* renamed from: g, reason: collision with root package name */
    public final q.a f18059g;

    /* renamed from: h, reason: collision with root package name */
    public final q.a f18060h;

    /* renamed from: j, reason: collision with root package name */
    public final long f18061j;

    /* renamed from: k, reason: collision with root package name */
    public final a.d f18062k;

    /* renamed from: l, reason: collision with root package name */
    public final long f18063l;

    /* renamed from: m, reason: collision with root package name */
    public final long f18064m;

    /* renamed from: n, reason: collision with root package name */
    public final long f18065n;

    /* renamed from: p, reason: collision with root package name */
    public final b f18066p;

    /* renamed from: q, reason: collision with root package name */
    public final lc.w f18067q;

    /* renamed from: r, reason: collision with root package name */
    public final f f18068r;

    /* renamed from: s, reason: collision with root package name */
    public final mc.b<? super K, V> f18069s;

    /* renamed from: t, reason: collision with root package name */
    public k f18070t;

    /* renamed from: v, reason: collision with root package name */
    public y f18071v;

    /* renamed from: w, reason: collision with root package name */
    public h f18072w;

    public static class a implements x<Object, Object> {
        @Override // mc.d.x
        public final x<Object, Object> a(ReferenceQueue<Object> referenceQueue, Object obj, mc.f<Object, Object> fVar) {
            return this;
        }

        @Override // mc.d.x
        public final void b(Object obj) {
        }

        @Override // mc.d.x
        public final int c() {
            return 0;
        }

        @Override // mc.d.x
        public final boolean d() {
            return false;
        }

        @Override // mc.d.x
        public final Object e() {
            return null;
        }

        @Override // mc.d.x
        public final mc.f<Object, Object> f() {
            return null;
        }

        @Override // mc.d.x
        public final Object get() {
            return null;
        }

        @Override // mc.d.x
        public final boolean isActive() {
            return false;
        }
    }

    public static final class a0<K, V> extends b0<K, V> {

        /* renamed from: d, reason: collision with root package name */
        public volatile long f18073d;

        /* renamed from: e, reason: collision with root package name */
        public mc.f<K, V> f18074e;

        /* renamed from: f, reason: collision with root package name */
        public mc.f<K, V> f18075f;

        /* renamed from: g, reason: collision with root package name */
        public volatile long f18076g;

        /* renamed from: h, reason: collision with root package name */
        public mc.f<K, V> f18077h;

        /* renamed from: j, reason: collision with root package name */
        public mc.f<K, V> f18078j;

        @Override // mc.d.b0, mc.f
        public final mc.f<K, V> a() {
            return this.f18075f;
        }

        @Override // mc.d.b0, mc.f
        public final long b() {
            return this.f18076g;
        }

        @Override // mc.d.b0, mc.f
        public final void c(mc.f<K, V> fVar) {
            this.f18077h = fVar;
        }

        @Override // mc.d.b0, mc.f
        public final void d(long j10) {
            this.f18073d = j10;
        }

        @Override // mc.d.b0, mc.f
        public final mc.f<K, V> f() {
            return this.f18077h;
        }

        @Override // mc.d.b0, mc.f
        public final long h() {
            return this.f18073d;
        }

        @Override // mc.d.b0, mc.f
        public final void i(mc.f<K, V> fVar) {
            this.f18075f = fVar;
        }

        @Override // mc.d.b0, mc.f
        public final void j(long j10) {
            this.f18076g = j10;
        }

        @Override // mc.d.b0, mc.f
        public final void l(mc.f<K, V> fVar) {
            this.f18078j = fVar;
        }

        @Override // mc.d.b0, mc.f
        public final mc.f<K, V> m() {
            return this.f18074e;
        }

        @Override // mc.d.b0, mc.f
        public final void n(mc.f<K, V> fVar) {
            this.f18074e = fVar;
        }

        @Override // mc.d.b0, mc.f
        public final mc.f<K, V> o() {
            return this.f18078j;
        }
    }

    public static class b extends AbstractQueue<Object> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<Object> iterator() {
            return w0.f18781j.iterator();
        }

        @Override // java.util.Queue
        public final boolean offer(Object obj) {
            return true;
        }

        @Override // java.util.Queue
        public final Object peek() {
            return null;
        }

        @Override // java.util.Queue
        public final Object poll() {
            return null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return 0;
        }
    }

    public static class b0<K, V> extends WeakReference<K> implements mc.f<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final int f18079a;

        /* renamed from: b, reason: collision with root package name */
        public final mc.f<K, V> f18080b;

        /* renamed from: c, reason: collision with root package name */
        public volatile x<K, V> f18081c;

        public b0(ReferenceQueue<K> referenceQueue, K k10, int i10, mc.f<K, V> fVar) {
            super(k10, referenceQueue);
            this.f18081c = d.f18051y;
            this.f18079a = i10;
            this.f18080b = fVar;
        }

        public mc.f<K, V> a() {
            throw new UnsupportedOperationException();
        }

        public long b() {
            throw new UnsupportedOperationException();
        }

        public void c(mc.f<K, V> fVar) {
            throw new UnsupportedOperationException();
        }

        public void d(long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // mc.f
        public final void e(x<K, V> xVar) {
            this.f18081c = xVar;
        }

        public mc.f<K, V> f() {
            throw new UnsupportedOperationException();
        }

        @Override // mc.f
        public final mc.f<K, V> g() {
            return this.f18080b;
        }

        @Override // mc.f
        public final K getKey() {
            return get();
        }

        public long h() {
            throw new UnsupportedOperationException();
        }

        public void i(mc.f<K, V> fVar) {
            throw new UnsupportedOperationException();
        }

        public void j(long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // mc.f
        public final x<K, V> k() {
            return this.f18081c;
        }

        public void l(mc.f<K, V> fVar) {
            throw new UnsupportedOperationException();
        }

        public mc.f<K, V> m() {
            throw new UnsupportedOperationException();
        }

        public void n(mc.f<K, V> fVar) {
            throw new UnsupportedOperationException();
        }

        public mc.f<K, V> o() {
            throw new UnsupportedOperationException();
        }

        @Override // mc.f
        public final int p() {
            return this.f18079a;
        }
    }

    public abstract class c<T> extends AbstractSet<T> {

        /* renamed from: a, reason: collision with root package name */
        public final d f18082a;

        public c(d dVar) {
            this.f18082a = dVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            this.f18082a.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return this.f18082a.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.f18082a.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final Object[] toArray() {
            return d.c(this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final <E> E[] toArray(E[] eArr) {
            return (E[]) d.c(this).toArray(eArr);
        }
    }

    public static final class c0<K, V> extends b0<K, V> {

        /* renamed from: d, reason: collision with root package name */
        public volatile long f18083d;

        /* renamed from: e, reason: collision with root package name */
        public mc.f<K, V> f18084e;

        /* renamed from: f, reason: collision with root package name */
        public mc.f<K, V> f18085f;

        @Override // mc.d.b0, mc.f
        public final long b() {
            return this.f18083d;
        }

        @Override // mc.d.b0, mc.f
        public final void c(mc.f<K, V> fVar) {
            this.f18084e = fVar;
        }

        @Override // mc.d.b0, mc.f
        public final mc.f<K, V> f() {
            return this.f18084e;
        }

        @Override // mc.d.b0, mc.f
        public final void j(long j10) {
            this.f18083d = j10;
        }

        @Override // mc.d.b0, mc.f
        public final void l(mc.f<K, V> fVar) {
            this.f18085f = fVar;
        }

        @Override // mc.d.b0, mc.f
        public final mc.f<K, V> o() {
            return this.f18085f;
        }
    }

    /* renamed from: mc.d$d, reason: collision with other inner class name */
    public static abstract class AbstractC0180d<K, V> implements mc.f<K, V> {
        @Override // mc.f
        public mc.f<K, V> a() {
            throw new UnsupportedOperationException();
        }

        @Override // mc.f
        public long b() {
            throw new UnsupportedOperationException();
        }

        @Override // mc.f
        public void c(mc.f<K, V> fVar) {
            throw new UnsupportedOperationException();
        }

        @Override // mc.f
        public void d(long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // mc.f
        public void e(x<K, V> xVar) {
            throw new UnsupportedOperationException();
        }

        @Override // mc.f
        public mc.f<K, V> f() {
            throw new UnsupportedOperationException();
        }

        @Override // mc.f
        public mc.f<K, V> g() {
            throw new UnsupportedOperationException();
        }

        @Override // mc.f
        public K getKey() {
            throw new UnsupportedOperationException();
        }

        @Override // mc.f
        public long h() {
            throw new UnsupportedOperationException();
        }

        @Override // mc.f
        public void i(mc.f<K, V> fVar) {
            throw new UnsupportedOperationException();
        }

        @Override // mc.f
        public void j(long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // mc.f
        public x<K, V> k() {
            throw new UnsupportedOperationException();
        }

        @Override // mc.f
        public void l(mc.f<K, V> fVar) {
            throw new UnsupportedOperationException();
        }

        @Override // mc.f
        public mc.f<K, V> m() {
            throw new UnsupportedOperationException();
        }

        @Override // mc.f
        public void n(mc.f<K, V> fVar) {
            throw new UnsupportedOperationException();
        }

        @Override // mc.f
        public mc.f<K, V> o() {
            throw new UnsupportedOperationException();
        }

        @Override // mc.f
        public int p() {
            throw new UnsupportedOperationException();
        }
    }

    public static final class d0<K, V> extends AbstractQueue<mc.f<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        public final a f18086a;

        public class a extends AbstractC0180d<K, V> {

            /* renamed from: a, reason: collision with root package name */
            public mc.f<K, V> f18087a;

            /* renamed from: b, reason: collision with root package name */
            public mc.f<K, V> f18088b;

            @Override // mc.d.AbstractC0180d, mc.f
            public final long b() {
                return Long.MAX_VALUE;
            }

            @Override // mc.d.AbstractC0180d, mc.f
            public final void c(mc.f<K, V> fVar) {
                this.f18087a = fVar;
            }

            @Override // mc.d.AbstractC0180d, mc.f
            public final mc.f<K, V> f() {
                return this.f18087a;
            }

            @Override // mc.d.AbstractC0180d, mc.f
            public final void j(long j10) {
            }

            @Override // mc.d.AbstractC0180d, mc.f
            public final void l(mc.f<K, V> fVar) {
                this.f18088b = fVar;
            }

            @Override // mc.d.AbstractC0180d, mc.f
            public final mc.f<K, V> o() {
                return this.f18088b;
            }
        }

        public class b extends nc.d<mc.f<K, V>> {
            public b(mc.f fVar) {
                super(fVar);
            }

            @Override // nc.d
            public final mc.f a(Object obj) {
                mc.f<K, V> fVarF = ((mc.f) obj).f();
                if (fVarF == d0.this.f18086a) {
                    return null;
                }
                return fVarF;
            }
        }

        public d0() {
            a aVar = new a();
            aVar.f18087a = aVar;
            aVar.f18088b = aVar;
            this.f18086a = aVar;
        }

        @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            a aVar = this.f18086a;
            mc.f<K, V> fVar = aVar.f18087a;
            while (fVar != aVar) {
                mc.f<K, V> fVarF = fVar.f();
                Logger logger = d.f18050x;
                o oVar = o.f18114a;
                fVar.c(oVar);
                fVar.l(oVar);
                fVar = fVarF;
            }
            aVar.f18087a = aVar;
            aVar.f18088b = aVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            return ((mc.f) obj).f() != o.f18114a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            a aVar = this.f18086a;
            return aVar.f18087a == aVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<mc.f<K, V>> iterator() {
            a aVar = this.f18086a;
            mc.f<K, V> fVar = aVar.f18087a;
            if (fVar == aVar) {
                fVar = null;
            }
            return new b(fVar);
        }

        @Override // java.util.Queue
        public final boolean offer(Object obj) {
            mc.f<K, V> fVar = (mc.f) obj;
            mc.f<K, V> fVarO = fVar.o();
            mc.f<K, V> fVarF = fVar.f();
            Logger logger = d.f18050x;
            fVarO.c(fVarF);
            fVarF.l(fVarO);
            a aVar = this.f18086a;
            mc.f<K, V> fVar2 = aVar.f18088b;
            fVar2.c(fVar);
            fVar.l(fVar2);
            fVar.c(aVar);
            aVar.f18088b = fVar;
            return true;
        }

        @Override // java.util.Queue
        public final Object peek() {
            a aVar = this.f18086a;
            mc.f<K, V> fVar = aVar.f18087a;
            if (fVar == aVar) {
                return null;
            }
            return fVar;
        }

        @Override // java.util.Queue
        public final Object poll() {
            a aVar = this.f18086a;
            mc.f<K, V> fVar = aVar.f18087a;
            if (fVar == aVar) {
                return null;
            }
            remove(fVar);
            return fVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean remove(Object obj) {
            mc.f fVar = (mc.f) obj;
            mc.f<K, V> fVarO = fVar.o();
            mc.f<K, V> fVarF = fVar.f();
            Logger logger = d.f18050x;
            fVarO.c(fVarF);
            fVarF.l(fVarO);
            o oVar = o.f18114a;
            fVar.c(oVar);
            fVar.l(oVar);
            return fVarF != oVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            a aVar = this.f18086a;
            int i10 = 0;
            for (mc.f<K, V> fVarF = aVar.f18087a; fVarF != aVar; fVarF = fVarF.f()) {
                i10++;
            }
            return i10;
        }
    }

    public static final class e<K, V> extends AbstractQueue<mc.f<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        public final a f18090a;

        public class a extends AbstractC0180d<K, V> {

            /* renamed from: a, reason: collision with root package name */
            public mc.f<K, V> f18091a;

            /* renamed from: b, reason: collision with root package name */
            public mc.f<K, V> f18092b;

            @Override // mc.d.AbstractC0180d, mc.f
            public final mc.f<K, V> a() {
                return this.f18092b;
            }

            @Override // mc.d.AbstractC0180d, mc.f
            public final void d(long j10) {
            }

            @Override // mc.d.AbstractC0180d, mc.f
            public final long h() {
                return Long.MAX_VALUE;
            }

            @Override // mc.d.AbstractC0180d, mc.f
            public final void i(mc.f<K, V> fVar) {
                this.f18092b = fVar;
            }

            @Override // mc.d.AbstractC0180d, mc.f
            public final mc.f<K, V> m() {
                return this.f18091a;
            }

            @Override // mc.d.AbstractC0180d, mc.f
            public final void n(mc.f<K, V> fVar) {
                this.f18091a = fVar;
            }
        }

        public class b extends nc.d<mc.f<K, V>> {
            public b(mc.f fVar) {
                super(fVar);
            }

            @Override // nc.d
            public final mc.f a(Object obj) {
                mc.f<K, V> fVarM = ((mc.f) obj).m();
                if (fVarM == e.this.f18090a) {
                    return null;
                }
                return fVarM;
            }
        }

        public e() {
            a aVar = new a();
            aVar.f18091a = aVar;
            aVar.f18092b = aVar;
            this.f18090a = aVar;
        }

        @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            a aVar = this.f18090a;
            mc.f<K, V> fVar = aVar.f18091a;
            while (fVar != aVar) {
                mc.f<K, V> fVarM = fVar.m();
                Logger logger = d.f18050x;
                o oVar = o.f18114a;
                fVar.n(oVar);
                fVar.i(oVar);
                fVar = fVarM;
            }
            aVar.f18091a = aVar;
            aVar.f18092b = aVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            return ((mc.f) obj).m() != o.f18114a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            a aVar = this.f18090a;
            return aVar.f18091a == aVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<mc.f<K, V>> iterator() {
            a aVar = this.f18090a;
            mc.f<K, V> fVar = aVar.f18091a;
            if (fVar == aVar) {
                fVar = null;
            }
            return new b(fVar);
        }

        @Override // java.util.Queue
        public final boolean offer(Object obj) {
            mc.f<K, V> fVar = (mc.f) obj;
            mc.f<K, V> fVarA = fVar.a();
            mc.f<K, V> fVarM = fVar.m();
            Logger logger = d.f18050x;
            fVarA.n(fVarM);
            fVarM.i(fVarA);
            a aVar = this.f18090a;
            mc.f<K, V> fVar2 = aVar.f18092b;
            fVar2.n(fVar);
            fVar.i(fVar2);
            fVar.n(aVar);
            aVar.f18092b = fVar;
            return true;
        }

        @Override // java.util.Queue
        public final Object peek() {
            a aVar = this.f18090a;
            mc.f<K, V> fVar = aVar.f18091a;
            if (fVar == aVar) {
                return null;
            }
            return fVar;
        }

        @Override // java.util.Queue
        public final Object poll() {
            a aVar = this.f18090a;
            mc.f<K, V> fVar = aVar.f18091a;
            if (fVar == aVar) {
                return null;
            }
            remove(fVar);
            return fVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean remove(Object obj) {
            mc.f fVar = (mc.f) obj;
            mc.f<K, V> fVarA = fVar.a();
            mc.f<K, V> fVarM = fVar.m();
            Logger logger = d.f18050x;
            fVarA.n(fVarM);
            fVarM.i(fVarA);
            o oVar = o.f18114a;
            fVar.n(oVar);
            fVar.i(oVar);
            return fVarM != oVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            a aVar = this.f18090a;
            int i10 = 0;
            for (mc.f<K, V> fVarM = aVar.f18091a; fVarM != aVar; fVarM = fVarM.m()) {
                i10++;
            }
            return i10;
        }
    }

    public final class e0 implements Map.Entry<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final K f18094a;

        /* renamed from: b, reason: collision with root package name */
        public V f18095b;

        public e0(K k10, V v10) {
            this.f18094a = k10;
            this.f18095b = v10;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (this.f18094a.equals(entry.getKey()) && this.f18095b.equals(entry.getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f18094a;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f18095b;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            return this.f18094a.hashCode() ^ this.f18095b.hashCode();
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v10) {
            V v11 = (V) d.this.put(this.f18094a, v10);
            this.f18095b = v10;
            return v11;
        }

        public final String toString() {
            return this.f18094a + "=" + this.f18095b;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class f {

        /* renamed from: a, reason: collision with root package name */
        public static final f[] f18097a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ f[] f18098b;

        /* JADX INFO: Fake field, exist only in values array */
        f EF0;

        public enum a extends f {
            public a() {
                super("STRONG", 0);
            }

            @Override // mc.d.f
            public final <K, V> mc.f<K, V> d(p<K, V> pVar, K k10, int i10, mc.f<K, V> fVar) {
                return new t(k10, i10, fVar);
            }
        }

        public enum b extends f {
            public b() {
                super("STRONG_ACCESS", 1);
            }

            @Override // mc.d.f
            public final <K, V> mc.f<K, V> b(p<K, V> pVar, mc.f<K, V> fVar, mc.f<K, V> fVar2) {
                mc.f<K, V> fVarB = super.b(pVar, fVar, fVar2);
                f.a(fVar, fVarB);
                return fVarB;
            }

            @Override // mc.d.f
            public final <K, V> mc.f<K, V> d(p<K, V> pVar, K k10, int i10, mc.f<K, V> fVar) {
                r rVar = new r(k10, i10, fVar);
                rVar.f18132e = Long.MAX_VALUE;
                Logger logger = d.f18050x;
                o oVar = o.f18114a;
                rVar.f18133f = oVar;
                rVar.f18134g = oVar;
                return rVar;
            }
        }

        public enum c extends f {
            public c() {
                super("STRONG_WRITE", 2);
            }

            @Override // mc.d.f
            public final <K, V> mc.f<K, V> b(p<K, V> pVar, mc.f<K, V> fVar, mc.f<K, V> fVar2) {
                mc.f<K, V> fVarB = super.b(pVar, fVar, fVar2);
                f.c(fVar, fVarB);
                return fVarB;
            }

            @Override // mc.d.f
            public final <K, V> mc.f<K, V> d(p<K, V> pVar, K k10, int i10, mc.f<K, V> fVar) {
                v vVar = new v(k10, i10, fVar);
                vVar.f18146e = Long.MAX_VALUE;
                Logger logger = d.f18050x;
                o oVar = o.f18114a;
                vVar.f18147f = oVar;
                vVar.f18148g = oVar;
                return vVar;
            }
        }

        /* renamed from: mc.d$f$d, reason: collision with other inner class name */
        public enum C0181d extends f {
            public C0181d() {
                super("STRONG_ACCESS_WRITE", 3);
            }

            @Override // mc.d.f
            public final <K, V> mc.f<K, V> b(p<K, V> pVar, mc.f<K, V> fVar, mc.f<K, V> fVar2) {
                mc.f<K, V> fVarB = super.b(pVar, fVar, fVar2);
                f.a(fVar, fVarB);
                f.c(fVar, fVarB);
                return fVarB;
            }

            @Override // mc.d.f
            public final <K, V> mc.f<K, V> d(p<K, V> pVar, K k10, int i10, mc.f<K, V> fVar) {
                s sVar = new s(k10, i10, fVar);
                sVar.f18135e = Long.MAX_VALUE;
                Logger logger = d.f18050x;
                o oVar = o.f18114a;
                sVar.f18136f = oVar;
                sVar.f18137g = oVar;
                sVar.f18138h = Long.MAX_VALUE;
                sVar.f18139j = oVar;
                sVar.f18140k = oVar;
                return sVar;
            }
        }

        public enum e extends f {
            public e() {
                super("WEAK", 4);
            }

            @Override // mc.d.f
            public final <K, V> mc.f<K, V> d(p<K, V> pVar, K k10, int i10, mc.f<K, V> fVar) {
                return new b0(pVar.f18123h, k10, i10, fVar);
            }
        }

        /* renamed from: mc.d$f$f, reason: collision with other inner class name */
        public enum C0182f extends f {
            public C0182f() {
                super("WEAK_ACCESS", 5);
            }

            @Override // mc.d.f
            public final <K, V> mc.f<K, V> b(p<K, V> pVar, mc.f<K, V> fVar, mc.f<K, V> fVar2) {
                mc.f<K, V> fVarB = super.b(pVar, fVar, fVar2);
                f.a(fVar, fVarB);
                return fVarB;
            }

            @Override // mc.d.f
            public final <K, V> mc.f<K, V> d(p<K, V> pVar, K k10, int i10, mc.f<K, V> fVar) {
                z zVar = new z(pVar.f18123h, k10, i10, fVar);
                zVar.f18151d = Long.MAX_VALUE;
                Logger logger = d.f18050x;
                o oVar = o.f18114a;
                zVar.f18152e = oVar;
                zVar.f18153f = oVar;
                return zVar;
            }
        }

        public enum g extends f {
            public g() {
                super("WEAK_WRITE", 6);
            }

            @Override // mc.d.f
            public final <K, V> mc.f<K, V> b(p<K, V> pVar, mc.f<K, V> fVar, mc.f<K, V> fVar2) {
                mc.f<K, V> fVarB = super.b(pVar, fVar, fVar2);
                f.c(fVar, fVarB);
                return fVarB;
            }

            @Override // mc.d.f
            public final <K, V> mc.f<K, V> d(p<K, V> pVar, K k10, int i10, mc.f<K, V> fVar) {
                c0 c0Var = new c0(pVar.f18123h, k10, i10, fVar);
                c0Var.f18083d = Long.MAX_VALUE;
                Logger logger = d.f18050x;
                o oVar = o.f18114a;
                c0Var.f18084e = oVar;
                c0Var.f18085f = oVar;
                return c0Var;
            }
        }

        public enum h extends f {
            public h() {
                super("WEAK_ACCESS_WRITE", 7);
            }

            @Override // mc.d.f
            public final <K, V> mc.f<K, V> b(p<K, V> pVar, mc.f<K, V> fVar, mc.f<K, V> fVar2) {
                mc.f<K, V> fVarB = super.b(pVar, fVar, fVar2);
                f.a(fVar, fVarB);
                f.c(fVar, fVarB);
                return fVarB;
            }

            @Override // mc.d.f
            public final <K, V> mc.f<K, V> d(p<K, V> pVar, K k10, int i10, mc.f<K, V> fVar) {
                a0 a0Var = new a0(pVar.f18123h, k10, i10, fVar);
                a0Var.f18073d = Long.MAX_VALUE;
                Logger logger = d.f18050x;
                o oVar = o.f18114a;
                a0Var.f18074e = oVar;
                a0Var.f18075f = oVar;
                a0Var.f18076g = Long.MAX_VALUE;
                a0Var.f18077h = oVar;
                a0Var.f18078j = oVar;
                return a0Var;
            }
        }

        static {
            a aVar = new a();
            b bVar = new b();
            c cVar = new c();
            C0181d c0181d = new C0181d();
            e eVar = new e();
            C0182f c0182f = new C0182f();
            g gVar = new g();
            h hVar = new h();
            f18098b = new f[]{aVar, bVar, cVar, c0181d, eVar, c0182f, gVar, hVar};
            f18097a = new f[]{aVar, bVar, cVar, c0181d, eVar, c0182f, gVar, hVar};
        }

        public f() {
            throw null;
        }

        public static void a(mc.f fVar, mc.f fVar2) {
            fVar2.d(fVar.h());
            mc.f<K, V> fVarA = fVar.a();
            Logger logger = d.f18050x;
            fVarA.n(fVar2);
            fVar2.i(fVarA);
            mc.f<K, V> fVarM = fVar.m();
            fVar2.n(fVarM);
            fVarM.i(fVar2);
            o oVar = o.f18114a;
            fVar.n(oVar);
            fVar.i(oVar);
        }

        public static void c(mc.f fVar, mc.f fVar2) {
            fVar2.j(fVar.b());
            mc.f<K, V> fVarO = fVar.o();
            Logger logger = d.f18050x;
            fVarO.c(fVar2);
            fVar2.l(fVarO);
            mc.f<K, V> fVarF = fVar.f();
            fVar2.c(fVarF);
            fVarF.l(fVar2);
            o oVar = o.f18114a;
            fVar.c(oVar);
            fVar.l(oVar);
        }

        public static f valueOf(String str) {
            return (f) Enum.valueOf(f.class, str);
        }

        public static f[] values() {
            return (f[]) f18098b.clone();
        }

        public <K, V> mc.f<K, V> b(p<K, V> pVar, mc.f<K, V> fVar, mc.f<K, V> fVar2) {
            return d(pVar, fVar.getKey(), fVar.p(), fVar2);
        }

        public abstract <K, V> mc.f<K, V> d(p<K, V> pVar, K k10, int i10, mc.f<K, V> fVar);
    }

    public final class g extends d<K, V>.i<Map.Entry<K, V>> {
    }

    public final class h extends d<K, V>.c<Map.Entry<K, V>> {
        public h(d dVar) {
            super(dVar);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            Map.Entry entry;
            Object key;
            d dVar;
            Object obj2;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (obj2 = (dVar = d.this).get(key)) != null && dVar.f18058f.c(entry.getValue(), obj2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new g();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Map.Entry entry;
            Object key;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && d.this.remove(key, entry.getValue());
        }
    }

    public abstract class i<T> implements Iterator<T> {

        /* renamed from: a, reason: collision with root package name */
        public int f18100a;

        /* renamed from: b, reason: collision with root package name */
        public int f18101b = -1;

        /* renamed from: c, reason: collision with root package name */
        public p<K, V> f18102c;

        /* renamed from: d, reason: collision with root package name */
        public AtomicReferenceArray<mc.f<K, V>> f18103d;

        /* renamed from: e, reason: collision with root package name */
        public mc.f<K, V> f18104e;

        /* renamed from: f, reason: collision with root package name */
        public d<K, V>.e0 f18105f;

        /* renamed from: g, reason: collision with root package name */
        public d<K, V>.e0 f18106g;

        public i() {
            this.f18100a = d.this.f18055c.length - 1;
            a();
        }

        public final void a() {
            this.f18105f = null;
            if (d() || e()) {
                return;
            }
            while (true) {
                int i10 = this.f18100a;
                if (i10 < 0) {
                    return;
                }
                p<K, V>[] pVarArr = d.this.f18055c;
                this.f18100a = i10 - 1;
                p<K, V> pVar = pVarArr[i10];
                this.f18102c = pVar;
                if (pVar.f18117b != 0) {
                    this.f18103d = this.f18102c.f18121f;
                    this.f18101b = r0.length() - 1;
                    if (e()) {
                        return;
                    }
                }
            }
        }

        public final boolean b(mc.f<K, V> fVar) {
            V v10;
            d dVar = d.this;
            try {
                long jA = dVar.f18067q.a();
                K key = fVar.getKey();
                V v11 = null;
                if (fVar.getKey() != null && (v10 = fVar.k().get()) != null && !dVar.i(fVar, jA)) {
                    v11 = v10;
                }
                if (v11 == null) {
                    this.f18102c.l();
                    return false;
                }
                this.f18105f = new e0(key, v11);
                this.f18102c.l();
                return true;
            } catch (Throwable th2) {
                this.f18102c.l();
                throw th2;
            }
        }

        public final d<K, V>.e0 c() {
            d<K, V>.e0 e0Var = this.f18105f;
            if (e0Var == null) {
                throw new NoSuchElementException();
            }
            this.f18106g = e0Var;
            a();
            return this.f18106g;
        }

        public final boolean d() {
            mc.f<K, V> fVar = this.f18104e;
            if (fVar == null) {
                return false;
            }
            while (true) {
                this.f18104e = fVar.g();
                mc.f<K, V> fVar2 = this.f18104e;
                if (fVar2 == null) {
                    return false;
                }
                if (b(fVar2)) {
                    return true;
                }
                fVar = this.f18104e;
            }
        }

        public final boolean e() {
            while (true) {
                int i10 = this.f18101b;
                if (i10 < 0) {
                    return false;
                }
                AtomicReferenceArray<mc.f<K, V>> atomicReferenceArray = this.f18103d;
                this.f18101b = i10 - 1;
                mc.f<K, V> fVar = atomicReferenceArray.get(i10);
                this.f18104e = fVar;
                if (fVar != null && (b(fVar) || d())) {
                    return true;
                }
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f18105f != null;
        }

        @Override // java.util.Iterator
        public Object next() {
            return c();
        }

        @Override // java.util.Iterator
        public final void remove() {
            d<K, V>.e0 e0Var = this.f18106g;
            if (e0Var == null) {
                throw new IllegalStateException();
            }
            d.this.remove(e0Var.f18094a);
            this.f18106g = null;
        }
    }

    public final class j extends d<K, V>.i<K> {
        @Override // mc.d.i, java.util.Iterator
        public final K next() {
            return c().f18094a;
        }
    }

    public final class k extends d<K, V>.c<K> {
        public k(d dVar) {
            super(dVar);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return this.f18082a.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new j();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            return this.f18082a.remove(obj) != null;
        }
    }

    public static class m<K, V> extends n<K, V> implements mc.c<K, V> {
        public final V a(K k10) throws ExecutionException {
            K k11;
            mc.f<K, V> fVarI;
            d<K, V> dVar = this.f18113a;
            mc.b<? super K, V> bVar = dVar.f18069s;
            k10.getClass();
            int iH = dVar.h(k10);
            p<K, V> pVarJ = dVar.j(iH);
            pVarJ.getClass();
            bVar.getClass();
            try {
                try {
                    if (pVarJ.f18117b == 0 || (fVarI = pVarJ.i(iH, k10)) == null) {
                        k11 = k10;
                    } else {
                        long jA = pVarJ.f18116a.f18067q.a();
                        V vJ = pVarJ.j(fVarI, jA);
                        if (vJ != null) {
                            pVarJ.o(fVarI, jA);
                            pVarJ.f18129p.getClass();
                            V v10 = pVarJ.v(fVarI, k10, iH, vJ, jA, bVar);
                            pVarJ.l();
                            return v10;
                        }
                        k11 = k10;
                        x<K, V> xVarK = fVarI.k();
                        if (xVarK.d()) {
                            V vZ = pVarJ.z(fVarI, k11, xVarK);
                            pVarJ.l();
                            return vZ;
                        }
                    }
                    V vK = pVarJ.k(k11, iH, bVar);
                    pVarJ.l();
                    return vK;
                } catch (ExecutionException e10) {
                    Throwable cause = e10.getCause();
                    if (cause instanceof Error) {
                        throw new qc.g((Error) cause);
                    }
                    if (cause instanceof RuntimeException) {
                        throw new qc.p(cause);
                    }
                    throw e10;
                }
            } catch (Throwable th2) {
                pVarJ.l();
                throw th2;
            }
        }

        @Override // lc.e
        public final V apply(K k10) {
            try {
                return a(k10);
            } catch (ExecutionException e10) {
                throw new qc.p(e10.getCause());
            }
        }
    }

    public static class n<K, V> implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        public final d<K, V> f18113a;

        public n(d dVar) {
            this.f18113a = dVar;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class o implements mc.f<Object, Object> {

        /* renamed from: a, reason: collision with root package name */
        public static final o f18114a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ o[] f18115b;

        static {
            o oVar = new o("INSTANCE", 0);
            f18114a = oVar;
            f18115b = new o[]{oVar};
        }

        public o() {
            throw null;
        }

        public static o valueOf(String str) {
            return (o) Enum.valueOf(o.class, str);
        }

        public static o[] values() {
            return (o[]) f18115b.clone();
        }

        @Override // mc.f
        public final mc.f<Object, Object> a() {
            return this;
        }

        @Override // mc.f
        public final long b() {
            return 0L;
        }

        @Override // mc.f
        public final void c(mc.f<Object, Object> fVar) {
        }

        @Override // mc.f
        public final void d(long j10) {
        }

        @Override // mc.f
        public final void e(x<Object, Object> xVar) {
        }

        @Override // mc.f
        public final mc.f<Object, Object> f() {
            return this;
        }

        @Override // mc.f
        public final mc.f<Object, Object> g() {
            return null;
        }

        @Override // mc.f
        public final Object getKey() {
            return null;
        }

        @Override // mc.f
        public final long h() {
            return 0L;
        }

        @Override // mc.f
        public final void i(mc.f<Object, Object> fVar) {
        }

        @Override // mc.f
        public final void j(long j10) {
        }

        @Override // mc.f
        public final x<Object, Object> k() {
            return null;
        }

        @Override // mc.f
        public final void l(mc.f<Object, Object> fVar) {
        }

        @Override // mc.f
        public final mc.f<Object, Object> m() {
            return this;
        }

        @Override // mc.f
        public final void n(mc.f<Object, Object> fVar) {
        }

        @Override // mc.f
        public final mc.f<Object, Object> o() {
            return this;
        }

        @Override // mc.f
        public final int p() {
            return 0;
        }
    }

    public static class p<K, V> extends ReentrantLock {

        /* renamed from: a, reason: collision with root package name */
        public final d<K, V> f18116a;

        /* renamed from: b, reason: collision with root package name */
        public volatile int f18117b;

        /* renamed from: c, reason: collision with root package name */
        public long f18118c;

        /* renamed from: d, reason: collision with root package name */
        public int f18119d;

        /* renamed from: e, reason: collision with root package name */
        public int f18120e;

        /* renamed from: f, reason: collision with root package name */
        public volatile AtomicReferenceArray<mc.f<K, V>> f18121f;

        /* renamed from: g, reason: collision with root package name */
        public final long f18122g;

        /* renamed from: h, reason: collision with root package name */
        public final ReferenceQueue<K> f18123h;

        /* renamed from: j, reason: collision with root package name */
        public final ReferenceQueue<V> f18124j;

        /* renamed from: k, reason: collision with root package name */
        public final AbstractQueue f18125k;

        /* renamed from: l, reason: collision with root package name */
        public final AtomicInteger f18126l = new AtomicInteger();

        /* renamed from: m, reason: collision with root package name */
        public final AbstractQueue f18127m;

        /* renamed from: n, reason: collision with root package name */
        public final AbstractQueue f18128n;

        /* renamed from: p, reason: collision with root package name */
        public final a.C0177a f18129p;

        public p(d dVar, int i10, long j10, a.C0177a c0177a) {
            this.f18116a = dVar;
            this.f18122g = j10;
            this.f18129p = c0177a;
            AtomicReferenceArray<mc.f<K, V>> atomicReferenceArray = new AtomicReferenceArray<>(i10);
            int length = (atomicReferenceArray.length() * 3) / 4;
            this.f18120e = length;
            if (dVar.f18062k == a.d.f18041a && length == j10) {
                this.f18120e = length + 1;
            }
            this.f18121f = atomicReferenceArray;
            q.a aVar = dVar.f18059g;
            q.a aVar2 = q.f18130a;
            this.f18123h = aVar != aVar2 ? new ReferenceQueue<>() : null;
            this.f18124j = dVar.f18060h != aVar2 ? new ReferenceQueue<>() : null;
            this.f18125k = (dVar.f() || dVar.e()) ? new ConcurrentLinkedQueue() : d.f18052z;
            this.f18127m = dVar.g() ? new d0() : d.f18052z;
            this.f18128n = (dVar.f() || dVar.e()) ? new e() : d.f18052z;
        }

        public final mc.f<K, V> a(mc.f<K, V> fVar, mc.f<K, V> fVar2) {
            if (fVar.getKey() == null) {
                return null;
            }
            x<K, V> xVarK = fVar.k();
            V v10 = xVarK.get();
            if (v10 == null && xVarK.isActive()) {
                return null;
            }
            mc.f<K, V> fVarB = this.f18116a.f18068r.b(this, fVar, fVar2);
            fVarB.e(xVarK.a(this.f18124j, v10, fVarB));
            return fVarB;
        }

        public final void b() {
            while (true) {
                mc.f fVar = (mc.f) this.f18125k.poll();
                if (fVar == null) {
                    return;
                }
                AbstractQueue abstractQueue = this.f18128n;
                if (abstractQueue.contains(fVar)) {
                    abstractQueue.add(fVar);
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
        
            r1.f18119d++;
            r2 = r1.s(r3, r3, r3.getKey(), r3.k().get(), r3.k(), r7);
            r3 = r1.f18117b - 1;
            r11.set(r12, r2);
            r1.f18117b = r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00fa, code lost:
        
            r1.u();
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void c() throws Throwable {
            p<K, V> pVar;
            p<K, V> pVar2;
            g.c cVar = mc.g.f18161c;
            q.a aVar = this.f18116a.f18059g;
            q.a aVar2 = q.f18130a;
            int i10 = 0;
            if (aVar != aVar2) {
                int i11 = 0;
                do {
                    Reference<? extends K> referencePoll = this.f18123h.poll();
                    if (referencePoll == null) {
                        break;
                    }
                    mc.f<K, V> fVar = (mc.f) referencePoll;
                    d<K, V> dVar = this.f18116a;
                    dVar.getClass();
                    int iP = fVar.p();
                    p<K, V> pVarJ = dVar.j(iP);
                    pVarJ.lock();
                    try {
                        AtomicReferenceArray<mc.f<K, V>> atomicReferenceArray = pVarJ.f18121f;
                        int length = iP & (atomicReferenceArray.length() - 1);
                        mc.f<K, V> fVarG = atomicReferenceArray.get(length);
                        pVar2 = pVarJ;
                        while (true) {
                            if (fVarG == null) {
                                break;
                            }
                            if (fVarG == fVar) {
                                try {
                                    break;
                                } catch (Throwable th2) {
                                    th = th2;
                                    pVar2.unlock();
                                    pVar2.u();
                                    throw th;
                                }
                            }
                            fVarG = fVarG.g();
                        }
                        pVar2.unlock();
                        pVar2.u();
                        i11++;
                    } catch (Throwable th3) {
                        th = th3;
                        pVar2 = pVarJ;
                    }
                } while (i11 != 16);
            }
            if (this.f18116a.f18060h != aVar2) {
                do {
                    Reference<? extends V> referencePoll2 = this.f18124j.poll();
                    if (referencePoll2 == null) {
                        return;
                    }
                    x<K, V> xVar = (x) referencePoll2;
                    d<K, V> dVar2 = this.f18116a;
                    dVar2.getClass();
                    mc.f<K, V> fVarF = xVar.f();
                    int iP2 = fVarF.p();
                    p<K, V> pVarJ2 = dVar2.j(iP2);
                    K key = fVarF.getKey();
                    pVarJ2.lock();
                    try {
                        AtomicReferenceArray<mc.f<K, V>> atomicReferenceArray2 = pVarJ2.f18121f;
                        int length2 = iP2 & (atomicReferenceArray2.length() - 1);
                        mc.f<K, V> fVar2 = atomicReferenceArray2.get(length2);
                        int i12 = iP2;
                        pVar = pVarJ2;
                        mc.f<K, V> fVarG2 = fVar2;
                        while (true) {
                            if (fVarG2 != null) {
                                int i13 = i12;
                                try {
                                    K key2 = fVarG2.getKey();
                                    if (fVarG2.p() != i13 || key2 == null || !pVar.f18116a.f18057e.c(key, key2)) {
                                        fVarG2 = fVarG2.g();
                                        i12 = i13;
                                    } else if (fVarG2.k() == xVar) {
                                        pVar.f18119d++;
                                        mc.f<K, V> fVarS = pVar.s(fVar2, fVarG2, key2, xVar.get(), xVar, cVar);
                                        int i14 = pVar.f18117b - 1;
                                        atomicReferenceArray2.set(length2, fVarS);
                                        pVar.f18117b = i14;
                                        pVar.unlock();
                                        if (!pVar.isHeldByCurrentThread()) {
                                        }
                                    } else {
                                        pVar.unlock();
                                        if (!pVar.isHeldByCurrentThread()) {
                                        }
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    pVar.unlock();
                                    if (!pVar.isHeldByCurrentThread()) {
                                        pVar.u();
                                    }
                                    throw th;
                                }
                            } else {
                                pVar.unlock();
                                if (!pVar.isHeldByCurrentThread()) {
                                }
                            }
                        }
                        i10++;
                    } catch (Throwable th5) {
                        th = th5;
                        pVar = pVarJ2;
                    }
                } while (i10 != 16);
            }
        }

        public final void d(Object obj, Object obj2, int i10, mc.g gVar) {
            this.f18118c -= i10;
            if (gVar.a()) {
                this.f18129p.getClass();
            }
            d<K, V> dVar = this.f18116a;
            if (dVar.f18066p != d.f18052z) {
                new mc.h(obj, obj2);
                dVar.f18066p.getClass();
            }
        }

        public final void e(mc.f<K, V> fVar) {
            if (this.f18116a.e()) {
                b();
                long jC = fVar.k().c();
                long j10 = this.f18122g;
                g.e eVar = mc.g.f18163e;
                if (jC > j10 && !q(fVar, fVar.p(), eVar)) {
                    throw new AssertionError();
                }
                while (this.f18118c > j10) {
                    for (mc.f<K, V> fVar2 : this.f18128n) {
                        if (fVar2.k().c() > 0) {
                            if (!q(fVar2, fVar2.p(), eVar)) {
                                throw new AssertionError();
                            }
                        }
                    }
                    throw new AssertionError();
                }
            }
        }

        public final void f() {
            AtomicReferenceArray<mc.f<K, V>> atomicReferenceArray = this.f18121f;
            int length = atomicReferenceArray.length();
            if (length >= 1073741824) {
                return;
            }
            int i10 = this.f18117b;
            AtomicReferenceArray<mc.f<K, V>> atomicReferenceArray2 = new AtomicReferenceArray<>(length << 1);
            this.f18120e = (atomicReferenceArray2.length() * 3) / 4;
            int length2 = atomicReferenceArray2.length() - 1;
            for (int i11 = 0; i11 < length; i11++) {
                mc.f<K, V> fVarG = atomicReferenceArray.get(i11);
                if (fVarG != null) {
                    mc.f<K, V> fVarG2 = fVarG.g();
                    int iP = fVarG.p() & length2;
                    if (fVarG2 == null) {
                        atomicReferenceArray2.set(iP, fVarG);
                    } else {
                        mc.f<K, V> fVar = fVarG;
                        while (fVarG2 != null) {
                            int iP2 = fVarG2.p() & length2;
                            if (iP2 != iP) {
                                fVar = fVarG2;
                                iP = iP2;
                            }
                            fVarG2 = fVarG2.g();
                        }
                        atomicReferenceArray2.set(iP, fVar);
                        while (fVarG != fVar) {
                            int iP3 = fVarG.p() & length2;
                            mc.f<K, V> fVarA = a(fVarG, atomicReferenceArray2.get(iP3));
                            if (fVarA != null) {
                                atomicReferenceArray2.set(iP3, fVarA);
                            } else {
                                p(fVarG);
                                i10--;
                            }
                            fVarG = fVarG.g();
                        }
                    }
                }
            }
            this.f18121f = atomicReferenceArray2;
            this.f18117b = i10;
        }

        public final void g(long j10) {
            mc.f<K, V> fVar;
            g.d dVar;
            mc.f<K, V> fVar2;
            b();
            do {
                fVar = (mc.f) this.f18127m.peek();
                dVar = mc.g.f18162d;
                d<K, V> dVar2 = this.f18116a;
                if (fVar == null || !dVar2.i(fVar, j10)) {
                    do {
                        fVar2 = (mc.f) this.f18128n.peek();
                        if (fVar2 == null || !dVar2.i(fVar2, j10)) {
                            return;
                        }
                    } while (q(fVar2, fVar2.p(), dVar));
                    throw new AssertionError();
                }
            } while (q(fVar, fVar.p(), dVar));
            throw new AssertionError();
        }

        public final V h(K k10, int i10, l<K, V> lVar, qc.m<V> mVar) throws Throwable {
            V v10;
            long jNanoTime;
            a.C0177a c0177a = this.f18129p;
            long jNanoTime2 = 0;
            try {
                v10 = (V) qc.q.a(mVar);
            } catch (Throwable th2) {
                th = th2;
                v10 = null;
            }
            try {
                if (v10 == null) {
                    throw new b.c("CacheLoader returned null for key " + k10 + ".");
                }
                lc.s sVar = lVar.f18111c;
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                if (sVar.f16963a) {
                    int i11 = lc.k.f16948a;
                    jNanoTime = System.nanoTime() - sVar.f16964b;
                } else {
                    jNanoTime = 0;
                }
                timeUnit.convert(jNanoTime, timeUnit);
                c0177a.getClass();
                x(k10, i10, lVar, v10);
                return v10;
            } catch (Throwable th3) {
                th = th3;
                if (v10 == null) {
                    lc.s sVar2 = lVar.f18111c;
                    TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                    if (sVar2.f16963a) {
                        int i12 = lc.k.f16948a;
                        jNanoTime2 = System.nanoTime() - sVar2.f16964b;
                    }
                    timeUnit2.convert(jNanoTime2, timeUnit2);
                    c0177a.getClass();
                    lock();
                    try {
                        AtomicReferenceArray<mc.f<K, V>> atomicReferenceArray = this.f18121f;
                        int length = (atomicReferenceArray.length() - 1) & i10;
                        mc.f<K, V> fVar = atomicReferenceArray.get(length);
                        mc.f<K, V> fVarG = fVar;
                        while (true) {
                            if (fVarG == null) {
                                break;
                            }
                            K key = fVarG.getKey();
                            if (fVarG.p() != i10 || key == null || !this.f18116a.f18057e.c(k10, key)) {
                                fVarG = fVarG.g();
                            } else if (fVarG.k() == lVar) {
                                if (lVar.f18109a.isActive()) {
                                    fVarG.e(lVar.f18109a);
                                } else {
                                    atomicReferenceArray.set(length, r(fVar, fVarG));
                                }
                            }
                        }
                        unlock();
                        u();
                    } catch (Throwable th4) {
                        unlock();
                        u();
                        throw th4;
                    }
                }
                throw th;
            }
        }

        public final mc.f i(int i10, Object obj) {
            for (mc.f<K, V> fVarG = this.f18121f.get((r0.length() - 1) & i10); fVarG != null; fVarG = fVarG.g()) {
                if (fVarG.p() == i10) {
                    K key = fVarG.getKey();
                    if (key == null) {
                        y();
                    } else if (this.f18116a.f18057e.c(obj, key)) {
                        return fVarG;
                    }
                }
            }
            return null;
        }

        public final V j(mc.f<K, V> fVar, long j10) {
            if (fVar.getKey() == null) {
                y();
                return null;
            }
            V v10 = fVar.k().get();
            if (v10 == null) {
                y();
                return null;
            }
            if (!this.f18116a.i(fVar, j10)) {
                return v10;
            }
            if (!tryLock()) {
                return null;
            }
            try {
                g(j10);
                return null;
            } finally {
                unlock();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x0092, code lost:
        
            if (r6 == false) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0094, code lost:
        
            r11 = new mc.d.l<>();
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0099, code lost:
        
            if (r10 != null) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x009b, code lost:
        
            r3 = r16.f18116a.f18068r;
            r17.getClass();
            r10 = r3.d(r16, r17, r18, r9);
            r10.e(r11);
            r7.set(r8, r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00ad, code lost:
        
            r10.e(r11);
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00b0, code lost:
        
            unlock();
            u();
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00b6, code lost:
        
            if (r6 == false) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00b8, code lost:
        
            monitor-enter(r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00bb, code lost:
        
            r0 = h(r17, r18, r11, r11.g(r17, r19));
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00c3, code lost:
        
            monitor-exit(r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00c9, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00cd, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00ce, code lost:
        
            r16.f18129p.getClass();
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00d3, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00d8, code lost:
        
            return z(r10, r17, r13);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final V k(K k10, int i10, mc.b<? super K, V> bVar) throws ExecutionException {
            x<K, V> xVarK;
            lock();
            try {
                long jA = this.f18116a.f18067q.a();
                t(jA);
                boolean z10 = true;
                int i11 = this.f18117b - 1;
                AtomicReferenceArray<mc.f<K, V>> atomicReferenceArray = this.f18121f;
                int length = (atomicReferenceArray.length() - 1) & i10;
                mc.f<K, V> fVar = atomicReferenceArray.get(length);
                mc.f<K, V> fVarD = fVar;
                while (true) {
                    l<K, V> lVar = null;
                    if (fVarD == null) {
                        xVarK = null;
                        break;
                    }
                    K key = fVarD.getKey();
                    if (fVarD.p() == i10 && key != null && this.f18116a.f18057e.c(k10, key)) {
                        xVarK = fVarD.k();
                        if (xVarK.d()) {
                            z10 = false;
                        } else {
                            V v10 = xVarK.get();
                            if (v10 == null) {
                                d(key, v10, xVarK.c(), mc.g.f18161c);
                            } else {
                                if (!this.f18116a.i(fVarD, jA)) {
                                    n(fVarD, jA);
                                    unlock();
                                    u();
                                    return v10;
                                }
                                d(key, v10, xVarK.c(), mc.g.f18162d);
                            }
                            this.f18127m.remove(fVarD);
                            this.f18128n.remove(fVarD);
                            this.f18117b = i11;
                        }
                    } else {
                        fVarD = fVarD.g();
                    }
                }
            } catch (Throwable th2) {
                unlock();
                u();
                throw th2;
            }
        }

        public final void l() {
            if ((this.f18126l.incrementAndGet() & 63) == 0) {
                t(this.f18116a.f18067q.a());
                u();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0077, code lost:
        
            unlock();
            u();
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x007d, code lost:
        
            return null;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object m(int i10, Object obj, Object obj2, boolean z10) {
            int i11;
            lock();
            try {
                long jA = this.f18116a.f18067q.a();
                t(jA);
                if (this.f18117b + 1 > this.f18120e) {
                    f();
                }
                AtomicReferenceArray<mc.f<K, V>> atomicReferenceArray = this.f18121f;
                int length = (atomicReferenceArray.length() - 1) & i10;
                mc.f<K, V> fVar = atomicReferenceArray.get(length);
                mc.f<K, V> fVarG = fVar;
                while (true) {
                    if (fVarG == null) {
                        this.f18119d++;
                        mc.f<K, V> fVarD = this.f18116a.f18068r.d(this, obj, i10, fVar);
                        w(fVarD, obj2, jA);
                        atomicReferenceArray.set(length, fVarD);
                        this.f18117b++;
                        e(fVarD);
                        break;
                    }
                    K key = fVarG.getKey();
                    if (fVarG.p() == i10 && key != null && this.f18116a.f18057e.c(obj, key)) {
                        x<K, V> xVarK = fVarG.k();
                        V v10 = xVarK.get();
                        if (v10 != null) {
                            if (z10) {
                                n(fVarG, jA);
                            } else {
                                this.f18119d++;
                                d(obj, v10, xVarK.c(), mc.g.f18160b);
                                w(fVarG, obj2, jA);
                                e(fVarG);
                            }
                            unlock();
                            u();
                            return v10;
                        }
                        this.f18119d++;
                        if (xVarK.isActive()) {
                            d(obj, v10, xVarK.c(), mc.g.f18161c);
                            w(fVarG, obj2, jA);
                            i11 = this.f18117b;
                        } else {
                            w(fVarG, obj2, jA);
                            i11 = this.f18117b + 1;
                        }
                        this.f18117b = i11;
                        e(fVarG);
                    } else {
                        fVarG = fVarG.g();
                    }
                }
            } catch (Throwable th2) {
                unlock();
                u();
                throw th2;
            }
        }

        public final void n(mc.f<K, V> fVar, long j10) {
            if (this.f18116a.f()) {
                fVar.d(j10);
            }
            this.f18128n.add(fVar);
        }

        public final void o(mc.f<K, V> fVar, long j10) {
            if (this.f18116a.f()) {
                fVar.d(j10);
            }
            this.f18125k.add(fVar);
        }

        public final void p(mc.f<K, V> fVar) {
            K key = fVar.getKey();
            fVar.p();
            d(key, fVar.k().get(), fVar.k().c(), mc.g.f18161c);
            this.f18127m.remove(fVar);
            this.f18128n.remove(fVar);
        }

        public final boolean q(mc.f<K, V> fVar, int i10, mc.g gVar) {
            AtomicReferenceArray<mc.f<K, V>> atomicReferenceArray = this.f18121f;
            int length = i10 & (atomicReferenceArray.length() - 1);
            mc.f<K, V> fVar2 = atomicReferenceArray.get(length);
            for (mc.f<K, V> fVarG = fVar2; fVarG != null; fVarG = fVarG.g()) {
                if (fVarG == fVar) {
                    this.f18119d++;
                    mc.f<K, V> fVarS = s(fVar2, fVarG, fVarG.getKey(), fVarG.k().get(), fVarG.k(), gVar);
                    int i11 = this.f18117b - 1;
                    atomicReferenceArray.set(length, fVarS);
                    this.f18117b = i11;
                    return true;
                }
            }
            return false;
        }

        public final mc.f<K, V> r(mc.f<K, V> fVar, mc.f<K, V> fVar2) {
            int i10 = this.f18117b;
            mc.f<K, V> fVarG = fVar2.g();
            while (fVar != fVar2) {
                mc.f<K, V> fVarA = a(fVar, fVarG);
                if (fVarA != null) {
                    fVarG = fVarA;
                } else {
                    p(fVar);
                    i10--;
                }
                fVar = fVar.g();
            }
            this.f18117b = i10;
            return fVarG;
        }

        public final mc.f s(mc.f fVar, mc.f fVar2, Object obj, Object obj2, x xVar, mc.g gVar) {
            d(obj, obj2, xVar.c(), gVar);
            this.f18127m.remove(fVar2);
            this.f18128n.remove(fVar2);
            if (!xVar.d()) {
                return r(fVar, fVar2);
            }
            xVar.b(null);
            return fVar;
        }

        public final void t(long j10) {
            if (tryLock()) {
                try {
                    c();
                    g(j10);
                    this.f18126l.set(0);
                } finally {
                    unlock();
                }
            }
        }

        public final void u() {
            if (isHeldByCurrentThread()) {
                return;
            }
            this.f18116a.f18066p.getClass();
        }

        /* JADX WARN: Finally extract failed */
        public final V v(mc.f<K, V> fVar, K k10, int i10, V v10, long j10, mc.b<? super K, V> bVar) {
            V v11;
            l lVar;
            l lVar2;
            if (this.f18116a.f18065n > 0 && j10 - fVar.b() > this.f18116a.f18065n && !fVar.k().d()) {
                lock();
                try {
                    long jA = this.f18116a.f18067q.a();
                    t(jA);
                    AtomicReferenceArray<mc.f<K, V>> atomicReferenceArray = this.f18121f;
                    int length = (atomicReferenceArray.length() - 1) & i10;
                    mc.f<K, V> fVar2 = atomicReferenceArray.get(length);
                    mc.f<K, V> fVarG = fVar2;
                    while (true) {
                        v11 = null;
                        if (fVarG == null) {
                            this.f18119d++;
                            lVar = new l();
                            f fVar3 = this.f18116a.f18068r;
                            k10.getClass();
                            mc.f<K, V> fVarD = fVar3.d(this, k10, i10, fVar2);
                            fVarD.e(lVar);
                            atomicReferenceArray.set(length, fVarD);
                            break;
                        }
                        K key = fVarG.getKey();
                        if (fVarG.p() == i10 && key != null && this.f18116a.f18057e.c(k10, key)) {
                            x<K, V> xVarK = fVarG.k();
                            if (!xVarK.d() && jA - fVarG.b() >= this.f18116a.f18065n) {
                                this.f18119d++;
                                lVar = new l(xVarK);
                                fVarG.e(lVar);
                            }
                            unlock();
                            u();
                            lVar2 = null;
                        } else {
                            fVarG = fVarG.g();
                        }
                    }
                    unlock();
                    u();
                    lVar2 = lVar;
                    if (lVar2 != null) {
                        qc.m<V> mVarG = lVar2.g(k10, bVar);
                        mVarG.a(new mc.e(this, k10, i10, lVar2, mVarG), qc.f.f22633a);
                        if (mVarG.isDone()) {
                            try {
                                v11 = (V) qc.q.a(mVarG);
                            } catch (Throwable unused) {
                            }
                        }
                    }
                    if (v11 != null) {
                        return v11;
                    }
                } catch (Throwable th2) {
                    unlock();
                    u();
                    throw th2;
                }
            }
            return v10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void w(mc.f fVar, Object obj, long j10) {
            x<K, V> xVarK = fVar.k();
            d<K, V> dVar = this.f18116a;
            dVar.f18062k.getClass();
            dVar.f18060h.getClass();
            fVar.e(new u(obj));
            b();
            this.f18118c++;
            if (dVar.f()) {
                fVar.d(j10);
            }
            if (dVar.g() || dVar.f18065n > 0) {
                fVar.j(j10);
            }
            this.f18128n.add(fVar);
            this.f18127m.add(fVar);
            xVarK.b(obj);
        }

        public final void x(Object obj, int i10, l lVar, Object obj2) {
            mc.g gVar = mc.g.f18160b;
            lock();
            try {
                long jA = this.f18116a.f18067q.a();
                t(jA);
                int i11 = this.f18117b + 1;
                if (i11 > this.f18120e) {
                    f();
                    i11 = this.f18117b + 1;
                }
                AtomicReferenceArray<mc.f<K, V>> atomicReferenceArray = this.f18121f;
                int length = (atomicReferenceArray.length() - 1) & i10;
                mc.f<K, V> fVar = atomicReferenceArray.get(length);
                mc.f<K, V> fVarG = fVar;
                while (true) {
                    if (fVarG == null) {
                        this.f18119d++;
                        f fVar2 = this.f18116a.f18068r;
                        obj.getClass();
                        mc.f<K, V> fVarD = fVar2.d(this, obj, i10, fVar);
                        w(fVarD, obj2, jA);
                        atomicReferenceArray.set(length, fVarD);
                        this.f18117b = i11;
                        e(fVarD);
                        break;
                    }
                    K key = fVarG.getKey();
                    if (fVarG.p() == i10 && key != null && this.f18116a.f18057e.c(obj, key)) {
                        x<K, V> xVarK = fVarG.k();
                        V v10 = xVarK.get();
                        if (lVar == xVarK || (v10 == null && xVarK != d.f18051y)) {
                            this.f18119d++;
                            if (lVar.f18109a.isActive()) {
                                if (v10 == null) {
                                    gVar = mc.g.f18161c;
                                }
                                d(obj, v10, lVar.f18109a.c(), gVar);
                                i11--;
                            }
                            w(fVarG, obj2, jA);
                            this.f18117b = i11;
                            e(fVarG);
                        } else {
                            d(obj, obj2, 0, gVar);
                        }
                    } else {
                        fVarG = fVarG.g();
                    }
                }
                unlock();
                u();
            } catch (Throwable th2) {
                unlock();
                u();
                throw th2;
            }
        }

        public final void y() {
            if (tryLock()) {
                try {
                    c();
                } finally {
                    unlock();
                }
            }
        }

        public final V z(mc.f<K, V> fVar, K k10, x<K, V> xVar) throws ExecutionException {
            a.C0177a c0177a = this.f18129p;
            if (!xVar.d()) {
                throw new AssertionError();
            }
            if (Thread.holdsLock(fVar)) {
                throw new IllegalStateException(h0.b("Recursive load of: %s", k10));
            }
            try {
                V vE = xVar.e();
                if (vE != null) {
                    o(fVar, this.f18116a.f18067q.a());
                    return vE;
                }
                throw new b.c("CacheLoader returned null for key " + k10 + ".");
            } finally {
                c0177a.getClass();
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class q {

        /* renamed from: a, reason: collision with root package name */
        public static final a f18130a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ q[] f18131b;

        public enum a extends q {
            public a() {
                super("STRONG", 0);
            }
        }

        public enum b extends q {
            public b() {
                super("SOFT", 1);
            }
        }

        public enum c extends q {
            public c() {
                super("WEAK", 2);
            }
        }

        static {
            a aVar = new a();
            f18130a = aVar;
            f18131b = new q[]{aVar, new b(), new c()};
        }

        public q() {
            throw null;
        }

        public static q valueOf(String str) {
            return (q) Enum.valueOf(q.class, str);
        }

        public static q[] values() {
            return (q[]) f18131b.clone();
        }
    }

    public static final class r<K, V> extends t<K, V> {

        /* renamed from: e, reason: collision with root package name */
        public volatile long f18132e;

        /* renamed from: f, reason: collision with root package name */
        public mc.f<K, V> f18133f;

        /* renamed from: g, reason: collision with root package name */
        public mc.f<K, V> f18134g;

        @Override // mc.d.AbstractC0180d, mc.f
        public final mc.f<K, V> a() {
            return this.f18134g;
        }

        @Override // mc.d.AbstractC0180d, mc.f
        public final void d(long j10) {
            this.f18132e = j10;
        }

        @Override // mc.d.AbstractC0180d, mc.f
        public final long h() {
            return this.f18132e;
        }

        @Override // mc.d.AbstractC0180d, mc.f
        public final void i(mc.f<K, V> fVar) {
            this.f18134g = fVar;
        }

        @Override // mc.d.AbstractC0180d, mc.f
        public final mc.f<K, V> m() {
            return this.f18133f;
        }

        @Override // mc.d.AbstractC0180d, mc.f
        public final void n(mc.f<K, V> fVar) {
            this.f18133f = fVar;
        }
    }

    public static final class s<K, V> extends t<K, V> {

        /* renamed from: e, reason: collision with root package name */
        public volatile long f18135e;

        /* renamed from: f, reason: collision with root package name */
        public mc.f<K, V> f18136f;

        /* renamed from: g, reason: collision with root package name */
        public mc.f<K, V> f18137g;

        /* renamed from: h, reason: collision with root package name */
        public volatile long f18138h;

        /* renamed from: j, reason: collision with root package name */
        public mc.f<K, V> f18139j;

        /* renamed from: k, reason: collision with root package name */
        public mc.f<K, V> f18140k;

        @Override // mc.d.AbstractC0180d, mc.f
        public final mc.f<K, V> a() {
            return this.f18137g;
        }

        @Override // mc.d.AbstractC0180d, mc.f
        public final long b() {
            return this.f18138h;
        }

        @Override // mc.d.AbstractC0180d, mc.f
        public final void c(mc.f<K, V> fVar) {
            this.f18139j = fVar;
        }

        @Override // mc.d.AbstractC0180d, mc.f
        public final void d(long j10) {
            this.f18135e = j10;
        }

        @Override // mc.d.AbstractC0180d, mc.f
        public final mc.f<K, V> f() {
            return this.f18139j;
        }

        @Override // mc.d.AbstractC0180d, mc.f
        public final long h() {
            return this.f18135e;
        }

        @Override // mc.d.AbstractC0180d, mc.f
        public final void i(mc.f<K, V> fVar) {
            this.f18137g = fVar;
        }

        @Override // mc.d.AbstractC0180d, mc.f
        public final void j(long j10) {
            this.f18138h = j10;
        }

        @Override // mc.d.AbstractC0180d, mc.f
        public final void l(mc.f<K, V> fVar) {
            this.f18140k = fVar;
        }

        @Override // mc.d.AbstractC0180d, mc.f
        public final mc.f<K, V> m() {
            return this.f18136f;
        }

        @Override // mc.d.AbstractC0180d, mc.f
        public final void n(mc.f<K, V> fVar) {
            this.f18136f = fVar;
        }

        @Override // mc.d.AbstractC0180d, mc.f
        public final mc.f<K, V> o() {
            return this.f18140k;
        }
    }

    public static class t<K, V> extends AbstractC0180d<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final K f18141a;

        /* renamed from: b, reason: collision with root package name */
        public final int f18142b;

        /* renamed from: c, reason: collision with root package name */
        public final mc.f<K, V> f18143c;

        /* renamed from: d, reason: collision with root package name */
        public volatile x<K, V> f18144d = d.f18051y;

        public t(K k10, int i10, mc.f<K, V> fVar) {
            this.f18141a = k10;
            this.f18142b = i10;
            this.f18143c = fVar;
        }

        @Override // mc.d.AbstractC0180d, mc.f
        public final void e(x<K, V> xVar) {
            this.f18144d = xVar;
        }

        @Override // mc.d.AbstractC0180d, mc.f
        public final mc.f<K, V> g() {
            return this.f18143c;
        }

        @Override // mc.d.AbstractC0180d, mc.f
        public final K getKey() {
            return this.f18141a;
        }

        @Override // mc.d.AbstractC0180d, mc.f
        public final x<K, V> k() {
            return this.f18144d;
        }

        @Override // mc.d.AbstractC0180d, mc.f
        public final int p() {
            return this.f18142b;
        }
    }

    public static class u<K, V> implements x<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final V f18145a;

        public u(V v10) {
            this.f18145a = v10;
        }

        @Override // mc.d.x
        public final x<K, V> a(ReferenceQueue<V> referenceQueue, V v10, mc.f<K, V> fVar) {
            return this;
        }

        @Override // mc.d.x
        public final void b(V v10) {
        }

        @Override // mc.d.x
        public int c() {
            return 1;
        }

        @Override // mc.d.x
        public final boolean d() {
            return false;
        }

        @Override // mc.d.x
        public final V e() {
            return this.f18145a;
        }

        @Override // mc.d.x
        public final mc.f<K, V> f() {
            return null;
        }

        @Override // mc.d.x
        public final V get() {
            return this.f18145a;
        }

        @Override // mc.d.x
        public final boolean isActive() {
            return true;
        }
    }

    public static final class v<K, V> extends t<K, V> {

        /* renamed from: e, reason: collision with root package name */
        public volatile long f18146e;

        /* renamed from: f, reason: collision with root package name */
        public mc.f<K, V> f18147f;

        /* renamed from: g, reason: collision with root package name */
        public mc.f<K, V> f18148g;

        @Override // mc.d.AbstractC0180d, mc.f
        public final long b() {
            return this.f18146e;
        }

        @Override // mc.d.AbstractC0180d, mc.f
        public final void c(mc.f<K, V> fVar) {
            this.f18147f = fVar;
        }

        @Override // mc.d.AbstractC0180d, mc.f
        public final mc.f<K, V> f() {
            return this.f18147f;
        }

        @Override // mc.d.AbstractC0180d, mc.f
        public final void j(long j10) {
            this.f18146e = j10;
        }

        @Override // mc.d.AbstractC0180d, mc.f
        public final void l(mc.f<K, V> fVar) {
            this.f18148g = fVar;
        }

        @Override // mc.d.AbstractC0180d, mc.f
        public final mc.f<K, V> o() {
            return this.f18148g;
        }
    }

    public final class w extends d<K, V>.i<V> {
        @Override // mc.d.i, java.util.Iterator
        public final V next() {
            return c().f18095b;
        }
    }

    public interface x<K, V> {
        x<K, V> a(ReferenceQueue<V> referenceQueue, V v10, mc.f<K, V> fVar);

        void b(V v10);

        int c();

        boolean d();

        V e() throws ExecutionException;

        mc.f<K, V> f();

        V get();

        boolean isActive();
    }

    public final class y extends AbstractCollection<V> {

        /* renamed from: a, reason: collision with root package name */
        public final d f18149a;

        public y(d dVar) {
            this.f18149a = dVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            this.f18149a.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            return this.f18149a.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            return this.f18149a.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return new w();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return this.f18149a.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final Object[] toArray() {
            return d.c(this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final <E> E[] toArray(E[] eArr) {
            return (E[]) d.c(this).toArray(eArr);
        }
    }

    public static final class z<K, V> extends b0<K, V> {

        /* renamed from: d, reason: collision with root package name */
        public volatile long f18151d;

        /* renamed from: e, reason: collision with root package name */
        public mc.f<K, V> f18152e;

        /* renamed from: f, reason: collision with root package name */
        public mc.f<K, V> f18153f;

        @Override // mc.d.b0, mc.f
        public final mc.f<K, V> a() {
            return this.f18153f;
        }

        @Override // mc.d.b0, mc.f
        public final void d(long j10) {
            this.f18151d = j10;
        }

        @Override // mc.d.b0, mc.f
        public final long h() {
            return this.f18151d;
        }

        @Override // mc.d.b0, mc.f
        public final void i(mc.f<K, V> fVar) {
            this.f18153f = fVar;
        }

        @Override // mc.d.b0, mc.f
        public final mc.f<K, V> m() {
            return this.f18152e;
        }

        @Override // mc.d.b0, mc.f
        public final void n(mc.f<K, V> fVar) {
            this.f18152e = fVar;
        }
    }

    public d(mc.a<? super K, ? super V> aVar, mc.b<? super K, V> bVar) {
        a.C0177a c0177a = mc.a.f18037a.f16972a;
        this.f18056d = Math.min(4, 65536);
        q.a aVar2 = q.f18130a;
        this.f18059g = aVar2;
        this.f18060h = aVar2;
        d.a aVar3 = d.a.f16941a;
        if (aVar3 == null) {
            throw new NullPointerException("Both parameters are null");
        }
        this.f18057e = aVar3;
        this.f18058f = aVar3;
        this.f18061j = -1L;
        this.f18062k = a.d.f18041a;
        this.f18063l = 0L;
        this.f18064m = 0L;
        this.f18065n = 0L;
        this.f18066p = f18052z;
        this.f18067q = (g() || 0 > 0 || f()) ? lc.w.f16974a : mc.a.f18038b;
        this.f18068r = f.f18097a[((f() || e() || f()) ? (char) 1 : (char) 0) | (g() || g() || (0L > 0L ? 1 : (0L == 0L ? 0 : -1)) > 0 ? (char) 2 : (char) 0)];
        this.f18069s = bVar;
        int iMin = Math.min(16, 1073741824);
        iMin = e() ? (int) Math.min(iMin, -1L) : iMin;
        int i10 = 0;
        int i11 = 1;
        while (i11 < this.f18056d && (!e() || i11 * 20 <= this.f18061j)) {
            i10++;
            i11 <<= 1;
        }
        this.f18054b = 32 - i10;
        this.f18053a = i11 - 1;
        this.f18055c = new p[i11];
        int i12 = iMin / i11;
        int i13 = 1;
        while (i13 < (i12 * i11 < iMin ? i12 + 1 : i12)) {
            i13 <<= 1;
        }
        if (e()) {
            long j10 = this.f18061j;
            long j11 = i11;
            long j12 = (j10 / j11) + 1;
            long j13 = j10 % j11;
            long j14 = j12;
            int i14 = 0;
            while (true) {
                p<K, V>[] pVarArr = this.f18055c;
                if (i14 >= pVarArr.length) {
                    return;
                }
                if (i14 == j13) {
                    j14--;
                }
                long j15 = j14;
                pVarArr[i14] = new p<>(this, i13, j15, c0177a);
                i14++;
                j14 = j15;
            }
        } else {
            int i15 = 0;
            while (true) {
                p<K, V>[] pVarArr2 = this.f18055c;
                if (i15 >= pVarArr2.length) {
                    return;
                }
                pVarArr2[i15] = new p<>(this, i13, -1L, c0177a);
                i15++;
            }
        }
    }

    public static ArrayList c(AbstractCollection abstractCollection) {
        ArrayList arrayList = new ArrayList(abstractCollection.size());
        j0.a(arrayList, abstractCollection.iterator());
        return arrayList;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        q.a aVar = q.f18130a;
        for (p<K, V> pVar : this.f18055c) {
            if (pVar.f18117b != 0) {
                pVar.lock();
                try {
                    pVar.t(pVar.f18116a.f18067q.a());
                    AtomicReferenceArray<mc.f<K, V>> atomicReferenceArray = pVar.f18121f;
                    for (int i10 = 0; i10 < atomicReferenceArray.length(); i10++) {
                        for (mc.f<K, V> fVarG = atomicReferenceArray.get(i10); fVarG != null; fVarG = fVarG.g()) {
                            if (fVarG.k().isActive()) {
                                K key = fVarG.getKey();
                                V v10 = fVarG.k().get();
                                mc.g gVar = (key == null || v10 == null) ? mc.g.f18161c : mc.g.f18159a;
                                fVarG.p();
                                pVar.d(key, v10, fVarG.k().c(), gVar);
                            }
                        }
                    }
                    for (int i11 = 0; i11 < atomicReferenceArray.length(); i11++) {
                        atomicReferenceArray.set(i11, null);
                    }
                    d<K, V> dVar = pVar.f18116a;
                    if (dVar.f18059g != aVar) {
                        while (pVar.f18123h.poll() != null) {
                        }
                    }
                    if (dVar.f18060h != aVar) {
                        while (pVar.f18124j.poll() != null) {
                        }
                    }
                    pVar.f18127m.clear();
                    pVar.f18128n.clear();
                    pVar.f18126l.set(0);
                    pVar.f18119d++;
                    pVar.f18117b = 0;
                    pVar.unlock();
                    pVar.u();
                } catch (Throwable th2) {
                    pVar.unlock();
                    pVar.u();
                    throw th2;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0040 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044 A[Catch: all -> 0x0053, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0053, blocks: (B:6:0x000f, B:8:0x0013, B:24:0x0044, B:11:0x0023, B:13:0x002b, B:16:0x0034, B:19:0x003a, B:20:0x003d, B:15:0x0031), top: B:35:0x000f, inners: #1 }] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        int iH = h(obj);
        p<K, V> pVarJ = j(iH);
        pVarJ.getClass();
        try {
            if (pVarJ.f18117b == 0) {
                return false;
            }
            long jA = pVarJ.f18116a.f18067q.a();
            mc.f<K, V> fVarI = pVarJ.i(iH, obj);
            if (fVarI != null) {
                if (pVarJ.f18116a.i(fVarI, jA)) {
                    if (pVarJ.tryLock()) {
                        try {
                            pVarJ.g(jA);
                        } finally {
                            pVarJ.unlock();
                        }
                    }
                }
                if (fVarI != null) {
                    return false;
                }
                return fVarI.k().get() != null;
            }
            fVarI = null;
            if (fVarI != null) {
            }
        } finally {
            pVarJ.l();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        boolean z10 = false;
        if (obj == null) {
            return false;
        }
        long jA = this.f18067q.a();
        p<K, V>[] pVarArr = this.f18055c;
        long j10 = -1;
        int i10 = 0;
        while (i10 < 3) {
            int length = pVarArr.length;
            long j11 = 0;
            for (?? r12 = z10; r12 < length; r12++) {
                p<K, V> pVar = pVarArr[r12];
                int i11 = pVar.f18117b;
                AtomicReferenceArray<mc.f<K, V>> atomicReferenceArray = pVar.f18121f;
                boolean z11 = z10;
                for (?? r15 = z11; r15 < atomicReferenceArray.length(); r15++) {
                    mc.f<K, V> fVarG = atomicReferenceArray.get(r15);
                    while (fVarG != null) {
                        p<K, V>[] pVarArr2 = pVarArr;
                        V vJ = pVar.j(fVarG, jA);
                        mc.f<K, V> fVar = fVarG;
                        if (vJ != null && this.f18058f.c(obj, vJ)) {
                            return true;
                        }
                        fVarG = fVar.g();
                        pVarArr = pVarArr2;
                    }
                }
                j11 += pVar.f18119d;
                z10 = z11;
            }
            boolean z12 = z10;
            p<K, V>[] pVarArr3 = pVarArr;
            if (j11 == j10) {
                return z12;
            }
            i10++;
            j10 = j11;
            z10 = z12;
            pVarArr = pVarArr3;
        }
        return z10;
    }

    public final boolean e() {
        return this.f18061j >= 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        h hVar = this.f18072w;
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(this);
        this.f18072w = hVar2;
        return hVar2;
    }

    public final boolean f() {
        return this.f18063l > 0;
    }

    public final boolean g() {
        return this.f18064m > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0045 A[Catch: all -> 0x0062, TRY_ENTER, TryCatch #0 {all -> 0x0062, blocks: (B:6:0x000f, B:8:0x0013, B:25:0x0045, B:27:0x004f, B:32:0x0065, B:11:0x0022, B:13:0x002a, B:16:0x0033, B:19:0x0039, B:20:0x003d, B:15:0x0030), top: B:37:0x000f, inners: #1 }] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final V get(Object obj) {
        mc.f<K, V> fVar;
        if (obj == null) {
            return null;
        }
        int iH = h(obj);
        p<K, V> pVarJ = j(iH);
        pVarJ.getClass();
        try {
            if (pVarJ.f18117b != 0) {
                long jA = pVarJ.f18116a.f18067q.a();
                mc.f<K, V> fVarI = pVarJ.i(iH, obj);
                if (fVarI != null) {
                    if (!pVarJ.f18116a.i(fVarI, jA)) {
                        fVar = fVarI;
                        if (fVar != null) {
                            pVarJ.l();
                            return null;
                        }
                        V v10 = fVar.k().get();
                        if (v10 != null) {
                            pVarJ.o(fVar, jA);
                            V v11 = pVarJ.v(fVar, fVar.getKey(), iH, v10, jA, pVarJ.f18116a.f18069s);
                            pVarJ.l();
                            return v11;
                        }
                        pVarJ.y();
                    } else if (pVarJ.tryLock()) {
                        try {
                            pVarJ.g(jA);
                        } finally {
                            pVarJ.unlock();
                        }
                    }
                }
                fVar = null;
                if (fVar != null) {
                }
            }
            pVarJ.l();
            return null;
        } catch (Throwable th2) {
            pVarJ.l();
            throw th2;
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final V getOrDefault(Object obj, V v10) {
        V v11 = get(obj);
        return v11 != null ? v11 : v10;
    }

    public final int h(Object obj) {
        int iB;
        lc.d<Object> dVar = this.f18057e;
        if (obj == null) {
            dVar.getClass();
            iB = 0;
        } else {
            iB = dVar.b(obj);
        }
        int i10 = iB + ((iB << 15) ^ (-12931));
        int i11 = i10 ^ (i10 >>> 10);
        int i12 = i11 + (i11 << 3);
        int i13 = i12 ^ (i12 >>> 6);
        int i14 = (i13 << 2) + (i13 << 14) + i13;
        return (i14 >>> 16) ^ i14;
    }

    public final boolean i(mc.f<K, V> fVar, long j10) {
        fVar.getClass();
        if (!f() || j10 - fVar.h() < this.f18063l) {
            return g() && j10 - fVar.b() >= this.f18064m;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        p<K, V>[] pVarArr = this.f18055c;
        long j10 = 0;
        for (int i10 = 0; i10 < pVarArr.length; i10++) {
            if (pVarArr[i10].f18117b != 0) {
                return false;
            }
            j10 += pVarArr[i10].f18119d;
        }
        if (j10 == 0) {
            return true;
        }
        for (int i11 = 0; i11 < pVarArr.length; i11++) {
            if (pVarArr[i11].f18117b != 0) {
                return false;
            }
            j10 -= pVarArr[i11].f18119d;
        }
        return j10 == 0;
    }

    public final p<K, V> j(int i10) {
        return this.f18055c[(i10 >>> this.f18054b) & this.f18053a];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        k kVar = this.f18070t;
        if (kVar != null) {
            return kVar;
        }
        k kVar2 = new k(this);
        this.f18070t = kVar2;
        return kVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k10, V v10) {
        k10.getClass();
        v10.getClass();
        int iH = h(k10);
        return (V) j(iH).m(iH, k10, v10, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final V putIfAbsent(K k10, V v10) {
        k10.getClass();
        v10.getClass();
        int iH = h(k10);
        return (V) j(iH).m(iH, k10, v10, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        r7 = r4.k();
        r6 = r7.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        if (r6 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
    
        r12 = mc.g.f18159a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
    
        r8 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
    
        if (r7.isActive() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        r12 = mc.g.f18161c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        r2.f18119d++;
        r12 = r2.s(r3, r4, r5, r6, r7, r8);
        r0 = r2.f18117b - 1;
        r9.set(r10, r12);
        r2.f18117b = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        r2.unlock();
        r2.u();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
    
        return r6;
     */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final V remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int iH = h(obj);
        p<K, V> pVarJ = j(iH);
        pVarJ.lock();
        try {
            pVarJ.t(pVarJ.f18116a.f18067q.a());
            AtomicReferenceArray<mc.f<K, V>> atomicReferenceArray = pVarJ.f18121f;
            int length = iH & (atomicReferenceArray.length() - 1);
            mc.f<K, V> fVar = atomicReferenceArray.get(length);
            mc.f<K, V> fVarG = fVar;
            while (true) {
                if (fVarG == null) {
                    break;
                }
                K key = fVarG.getKey();
                if (fVarG.p() == iH && key != null && pVarJ.f18116a.f18057e.c(obj, key)) {
                    break;
                }
                fVarG = fVarG.g();
            }
            pVarJ.unlock();
            pVarJ.u();
            return null;
        } catch (Throwable th2) {
            pVarJ.unlock();
            pVarJ.u();
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0078, code lost:
    
        return null;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final V replace(K k10, V v10) {
        k10.getClass();
        v10.getClass();
        int iH = h(k10);
        p<K, V> pVarJ = j(iH);
        pVarJ.lock();
        try {
            long jA = pVarJ.f18116a.f18067q.a();
            pVarJ.t(jA);
            AtomicReferenceArray<mc.f<K, V>> atomicReferenceArray = pVarJ.f18121f;
            int length = iH & (atomicReferenceArray.length() - 1);
            mc.f<K, V> fVar = atomicReferenceArray.get(length);
            long j10 = jA;
            mc.f<K, V> fVarG = fVar;
            while (true) {
                if (fVarG == null) {
                    break;
                }
                mc.f<K, V> fVar2 = fVar;
                K key = fVarG.getKey();
                if (fVarG.p() == iH && key != null && pVarJ.f18116a.f18057e.c(k10, key)) {
                    long j11 = j10;
                    x<K, V> xVarK = fVarG.k();
                    V v11 = xVarK.get();
                    if (v11 != null) {
                        pVarJ.f18119d++;
                        pVarJ.d(k10, v11, xVarK.c(), mc.g.f18160b);
                        pVarJ.w(fVarG, v10, j11);
                        pVarJ.e(fVarG);
                        pVarJ.unlock();
                        pVarJ.u();
                        return v11;
                    }
                    if (xVarK.isActive()) {
                        pVarJ.f18119d++;
                        mc.f<K, V> fVarS = pVarJ.s(fVar2, fVarG, key, v11, xVarK, mc.g.f18161c);
                        int i10 = pVarJ.f18117b - 1;
                        atomicReferenceArray.set(length, fVarS);
                        pVarJ.f18117b = i10;
                    }
                } else {
                    long j12 = j10;
                    fVarG = fVarG.g();
                    fVar = fVar2;
                    j10 = j12;
                }
            }
        } finally {
            pVarJ.unlock();
            pVarJ.u();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        long jMax = 0;
        for (int i10 = 0; i10 < this.f18055c.length; i10++) {
            jMax += Math.max(0, r0[i10].f18117b);
        }
        return u2.i(jMax);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        y yVar = this.f18071v;
        if (yVar != null) {
            return yVar;
        }
        y yVar2 = new y(this);
        this.f18071v = yVar2;
        return yVar2;
    }

    public static class l<K, V> implements x<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public volatile x<K, V> f18109a;

        /* renamed from: b, reason: collision with root package name */
        public final qc.o<V> f18110b;

        /* renamed from: c, reason: collision with root package name */
        public final lc.s f18111c;

        public class a implements lc.e<V, V> {
            public a() {
            }

            @Override // lc.e
            public final V apply(V v10) {
                l.this.f18110b.l(v10);
                return v10;
            }
        }

        public l() {
            this(d.f18051y);
        }

        @Override // mc.d.x
        public final x<K, V> a(ReferenceQueue<V> referenceQueue, V v10, mc.f<K, V> fVar) {
            return this;
        }

        @Override // mc.d.x
        public final void b(V v10) {
            if (v10 != null) {
                this.f18110b.l(v10);
            } else {
                this.f18109a = d.f18051y;
            }
        }

        @Override // mc.d.x
        public final int c() {
            return this.f18109a.c();
        }

        @Override // mc.d.x
        public final boolean d() {
            return true;
        }

        @Override // mc.d.x
        public final V e() throws ExecutionException {
            return (V) qc.q.a(this.f18110b);
        }

        @Override // mc.d.x
        public final mc.f<K, V> f() {
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final qc.m<V> g(K k10, mc.b<? super K, V> bVar) {
            l.a aVar;
            try {
                lc.s sVar = this.f18111c;
                if (sVar.f16963a) {
                    throw new IllegalStateException("This stopwatch is already running.");
                }
                sVar.f16963a = true;
                int i10 = lc.k.f16948a;
                sVar.f16964b = System.nanoTime();
                V v10 = this.f18109a.get();
                if (v10 == null) {
                    V vLoad = bVar.load(k10);
                    return ((qc.o<V>) this.f18110b).l(vLoad) ? this.f18110b : vLoad == null ? l.b.f22642c : new l.b(vLoad);
                }
                qc.m<? extends I> mVarReload = bVar.reload(k10, v10);
                if (mVarReload == 0) {
                    return l.b.f22642c;
                }
                a aVar2 = new a();
                qc.f fVar = qc.f.f22633a;
                int i11 = qc.e.f22630k;
                e.a aVar3 = new e.a();
                aVar3.f22631h = mVarReload;
                aVar3.f22632j = aVar2;
                mVarReload.a(aVar3, fVar);
                return aVar3;
            } catch (Throwable th2) {
                if (this.f18110b.k(th2)) {
                    aVar = this.f18110b;
                } else {
                    aVar = new l.a();
                    aVar.k(th2);
                }
                if (th2 instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                return aVar;
            }
        }

        @Override // mc.d.x
        public final V get() {
            return this.f18109a.get();
        }

        @Override // mc.d.x
        public final boolean isActive() {
            return this.f18109a.isActive();
        }

        public l(x<K, V> xVar) {
            this.f18110b = new qc.o<>();
            this.f18111c = new lc.s();
            this.f18109a = xVar;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        r7 = r4.k();
        r6 = r7.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0058, code lost:
    
        if (r2.f18116a.f18058f.c(r15, r6) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
    
        r8 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:
    
        if (r6 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        if (r7.isActive() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
    
        r8 = mc.g.f18161c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        r2.f18119d++;
        r14 = r2.s(r3, r4, r5, r6, r7, r8);
        r15 = r2.f18117b - 1;
        r10.set(r12, r14);
        r2.f18117b = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0078, code lost:
    
        if (r8 != r9) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007a, code lost:
    
        r0 = true;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean remove(Object obj, Object obj2) {
        boolean z10 = false;
        if (obj == null || obj2 == null) {
            return false;
        }
        int iH = h(obj);
        p<K, V> pVarJ = j(iH);
        mc.g gVar = mc.g.f18159a;
        pVarJ.lock();
        try {
            pVarJ.t(pVarJ.f18116a.f18067q.a());
            AtomicReferenceArray<mc.f<K, V>> atomicReferenceArray = pVarJ.f18121f;
            int length = iH & (atomicReferenceArray.length() - 1);
            mc.f<K, V> fVar = atomicReferenceArray.get(length);
            mc.f<K, V> fVarG = fVar;
            while (true) {
                if (fVarG == null) {
                    break;
                }
                K key = fVarG.getKey();
                if (fVarG.p() == iH && key != null && pVarJ.f18116a.f18057e.c(obj, key)) {
                    break;
                }
                fVarG = fVarG.g();
            }
            return z10;
        } finally {
            pVarJ.unlock();
            pVarJ.u();
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean replace(K k10, V v10, V v11) {
        boolean z10;
        k10.getClass();
        v11.getClass();
        boolean z11 = false;
        if (v10 == null) {
            return false;
        }
        int iH = h(k10);
        p<K, V> pVarJ = j(iH);
        pVarJ.lock();
        try {
            long jA = pVarJ.f18116a.f18067q.a();
            pVarJ.t(jA);
            AtomicReferenceArray<mc.f<K, V>> atomicReferenceArray = pVarJ.f18121f;
            int length = iH & (atomicReferenceArray.length() - 1);
            mc.f<K, V> fVar = atomicReferenceArray.get(length);
            long j10 = jA;
            mc.f<K, V> fVarG = fVar;
            while (true) {
                if (fVarG == null) {
                    z10 = z11;
                    break;
                }
                mc.f<K, V> fVar2 = fVar;
                K key = fVarG.getKey();
                if (fVarG.p() == iH && key != null && pVarJ.f18116a.f18057e.c(k10, key)) {
                    z10 = z11;
                    long j11 = j10;
                    x<K, V> xVarK = fVarG.k();
                    V v12 = xVarK.get();
                    if (v12 == null) {
                        if (xVarK.isActive()) {
                            pVarJ.f18119d++;
                            mc.f<K, V> fVarS = pVarJ.s(fVar2, fVarG, key, v12, xVarK, mc.g.f18161c);
                            int i10 = pVarJ.f18117b - 1;
                            atomicReferenceArray.set(length, fVarS);
                            pVarJ.f18117b = i10;
                        }
                    } else {
                        if (pVarJ.f18116a.f18058f.c(v10, v12)) {
                            pVarJ.f18119d++;
                            pVarJ.d(k10, v12, xVarK.c(), mc.g.f18160b);
                            pVarJ.w(fVarG, v11, j11);
                            pVarJ.e(fVarG);
                            return true;
                        }
                        pVarJ.n(fVarG, j11);
                    }
                } else {
                    boolean z12 = z11;
                    fVar = fVar2;
                    long j12 = j10;
                    int i11 = iH;
                    fVarG = fVarG.g();
                    iH = i11;
                    j10 = j12;
                    z11 = z12;
                }
            }
            return z10;
        } finally {
            pVarJ.unlock();
            pVarJ.u();
        }
    }
}
