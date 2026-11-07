package x5;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b implements w5.d<u5.c> {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f15159a;

    /* renamed from: b, reason: collision with root package name */
    public final kotlin.jvm.internal.k f15160b;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class a implements Iterator<u5.c>, q5.a {
        public int s = -1;

        /* renamed from: t, reason: collision with root package name */
        public int f15161t;

        /* renamed from: u, reason: collision with root package name */
        public int f15162u;

        /* renamed from: v, reason: collision with root package name */
        public u5.c f15163v;

        public a() {
            int iP = u5.d.p(0, 0, b.this.f15159a.length());
            this.f15161t = iP;
            this.f15162u = iP;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.internal.k, p5.p] */
        public final void a() {
            d5.c cVar;
            b bVar = b.this;
            CharSequence charSequence = bVar.f15159a;
            int i6 = this.f15162u;
            if (i6 < 0) {
                this.s = 0;
                this.f15163v = null;
                return;
            }
            if (i6 <= charSequence.length() && (cVar = (d5.c) bVar.f15160b.b(charSequence, Integer.valueOf(this.f15162u))) != null) {
                int iIntValue = ((Number) cVar.s).intValue();
                int iIntValue2 = ((Number) cVar.f12739t).intValue();
                this.f15163v = u5.d.q(this.f15161t, iIntValue);
                int i7 = iIntValue + iIntValue2;
                this.f15161t = i7;
                this.f15162u = i7 + (iIntValue2 == 0 ? 1 : 0);
            } else {
                this.f15163v = new u5.c(this.f15161t, o.q(charSequence), 1);
                this.f15162u = -1;
            }
            this.s = 1;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.s == -1) {
                a();
            }
            return this.s == 1;
        }

        @Override // java.util.Iterator
        public final u5.c next() {
            if (this.s == -1) {
                a();
            }
            if (this.s == 0) {
                throw new NoSuchElementException();
            }
            u5.c cVar = this.f15163v;
            kotlin.jvm.internal.j.c("null cannot be cast to non-null type kotlin.ranges.IntRange", cVar);
            this.f15163v = null;
            this.s = -1;
            return cVar;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(CharSequence charSequence, p5.p pVar) {
        kotlin.jvm.internal.j.e("input", charSequence);
        this.f15159a = charSequence;
        this.f15160b = (kotlin.jvm.internal.k) pVar;
    }

    @Override // w5.d
    public final Iterator<u5.c> iterator() {
        return new a();
    }
}
