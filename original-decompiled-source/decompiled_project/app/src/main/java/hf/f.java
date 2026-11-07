package hf;

import android.util.Log;
import cf.l;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class f implements jf.c, Iterable<d> {

    /* renamed from: a, reason: collision with root package name */
    public final cf.d f13020a;

    /* renamed from: b, reason: collision with root package name */
    public final b f13021b;

    public final class a implements Iterator<d> {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayDeque f13022a = new ArrayDeque();

        /* renamed from: b, reason: collision with root package name */
        public final HashSet f13023b;

        public a(cf.d dVar) {
            this.f13023b = new HashSet();
            a(dVar);
            this.f13023b = null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        
            if (r8.f5423b.containsKey(cf.l.f5477i1) != false) goto L8;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void a(cf.d dVar) {
            if (dVar != null) {
                if (dVar.q0(l.f5532w2) != l.I1) {
                }
                ArrayList arrayList = new ArrayList();
                cf.a aVarK0 = dVar.k0(l.f5477i1);
                int i10 = 0;
                if (aVarK0 != null) {
                    int size = aVarK0.f5416b.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        cf.b bVarL0 = aVarK0.l0(i11);
                        if (bVarL0 instanceof cf.d) {
                            arrayList.add((cf.d) bVarL0);
                        } else {
                            Log.w("PdfBox-Android", "COSDictionary expected, but got ".concat(bVarL0 == null ? "null" : bVarL0.getClass().getSimpleName()));
                        }
                    }
                }
                int size2 = arrayList.size();
                while (i10 < size2) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    cf.d dVar2 = (cf.d) obj;
                    HashSet hashSet = this.f13023b;
                    if (hashSet.contains(dVar2)) {
                        Log.e("PdfBox-Android", "This page tree node has already been visited");
                    } else {
                        if (dVar2.f5423b.containsKey(l.f5477i1)) {
                            hashSet.add(dVar2);
                        }
                        a(dVar2);
                    }
                }
                return;
            }
            l lVar = l.H1;
            l lVar2 = l.f5532w2;
            if (lVar.equals(dVar.q0(lVar2))) {
                this.f13022a.add(dVar);
                return;
            }
            Log.e("PdfBox-Android", "Page skipped due to an invalid or missing type " + dVar.q0(lVar2));
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return !this.f13022a.isEmpty();
        }

        @Override // java.util.Iterator
        public final d next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            cf.d dVar = (cf.d) this.f13022a.poll();
            l lVar = l.f5532w2;
            l lVarQ0 = dVar.q0(lVar);
            if (lVarQ0 == null) {
                dVar.O0(lVar, l.H1);
            } else if (!l.H1.equals(lVarQ0)) {
                throw new IllegalStateException("Expected 'Page' but found " + lVarQ0);
            }
            b bVar = f.this.f13021b;
            return new d(dVar, bVar != null ? bVar.f13004h : null);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public f(cf.d dVar, b bVar) {
        new HashSet();
        if (dVar == null) {
            throw new IllegalArgumentException("page tree root cannot be null");
        }
        if (l.H1.equals(dVar.q0(l.f5532w2))) {
            cf.a aVar = new cf.a();
            aVar.g0(dVar);
            cf.d dVar2 = new cf.d();
            this.f13020a = dVar2;
            dVar2.O0(l.f5477i1, aVar);
            dVar2.N0(l.X, 1);
        } else {
            this.f13020a = dVar;
        }
        this.f13021b = bVar;
    }

    public static cf.b a(l lVar, cf.d dVar) {
        cf.b bVarV0 = dVar.v0(lVar);
        if (bVarV0 != null) {
            return bVarV0;
        }
        cf.b bVarY0 = dVar.y0(l.K1, l.G1);
        if (!(bVarY0 instanceof cf.d)) {
            return null;
        }
        cf.d dVar2 = (cf.d) bVarY0;
        if (l.I1.equals(dVar2.v0(l.f5532w2))) {
            return a(lVar, dVar2);
        }
        return null;
    }

    @Override // jf.c
    public final cf.b Z() {
        return this.f13020a;
    }

    @Override // java.lang.Iterable
    public final Iterator<d> iterator() {
        return new a(this.f13020a);
    }
}
