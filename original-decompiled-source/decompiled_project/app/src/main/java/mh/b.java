package mh;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class b implements lh.g<jh.g> {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f18243a;

    /* renamed from: b, reason: collision with root package name */
    public final eh.p<CharSequence, Integer, pg.n<Integer, Integer>> f18244b;

    public static final class a implements Iterator<jh.g>, fh.a {

        /* renamed from: a, reason: collision with root package name */
        public int f18245a = -1;

        /* renamed from: b, reason: collision with root package name */
        public int f18246b;

        /* renamed from: c, reason: collision with root package name */
        public int f18247c;

        /* renamed from: d, reason: collision with root package name */
        public jh.g f18248d;

        public a() {
            int iM = jh.j.m(0, 0, b.this.f18243a.length());
            this.f18246b = iM;
            this.f18247c = iM;
        }

        public final void c() {
            pg.n<Integer, Integer> nVarInvoke;
            b bVar = b.this;
            CharSequence charSequence = bVar.f18243a;
            int i10 = this.f18247c;
            if (i10 < 0) {
                this.f18245a = 0;
                this.f18248d = null;
                return;
            }
            if (i10 <= charSequence.length() && (nVarInvoke = bVar.f18244b.invoke(charSequence, Integer.valueOf(this.f18247c))) != null) {
                int iIntValue = nVarInvoke.f21469a.intValue();
                int iIntValue2 = nVarInvoke.f21470b.intValue();
                this.f18248d = jh.j.q(this.f18246b, iIntValue);
                int i11 = iIntValue + iIntValue2;
                this.f18246b = i11;
                this.f18247c = i11 + (iIntValue2 == 0 ? 1 : 0);
            } else {
                this.f18248d = new jh.g(this.f18246b, x.u(charSequence), 1);
                this.f18247c = -1;
            }
            this.f18245a = 1;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f18245a == -1) {
                c();
            }
            return this.f18245a == 1;
        }

        @Override // java.util.Iterator
        public final jh.g next() {
            if (this.f18245a == -1) {
                c();
            }
            if (this.f18245a == 0) {
                throw new NoSuchElementException();
            }
            jh.g gVar = this.f18248d;
            kotlin.jvm.internal.r.c(gVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.f18248d = null;
            this.f18245a = -1;
            return gVar;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(CharSequence input, eh.p pVar) {
        kotlin.jvm.internal.r.e(input, "input");
        this.f18243a = input;
        this.f18244b = pVar;
    }

    @Override // lh.g
    public final Iterator<jh.g> iterator() {
        return new a();
    }
}
