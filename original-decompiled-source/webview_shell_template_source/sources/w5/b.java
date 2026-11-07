package w5;

import androidx.camera.core.u;
import java.util.Iterator;
import java.util.NoSuchElementException;
import m5.d.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b<T> implements d<T> {

    /* renamed from: a, reason: collision with root package name */
    public final m5.d f15088a;

    /* renamed from: b, reason: collision with root package name */
    public final u f15089b;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class a implements Iterator<T>, q5.a {
        public final Iterator<T> s;

        /* renamed from: t, reason: collision with root package name */
        public int f15090t = -1;

        /* renamed from: u, reason: collision with root package name */
        public T f15091u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ b<T> f15092v;

        public a(b<T> bVar) {
            this.f15092v = bVar;
            this.s = bVar.f15088a.new b();
        }

        public final void a() {
            T next;
            do {
                Iterator<T> it = this.s;
                if (!it.hasNext()) {
                    this.f15090t = 0;
                    return;
                }
                next = it.next();
            } while (!((Boolean) this.f15092v.f15089b.invoke(next)).booleanValue());
            this.f15091u = next;
            this.f15090t = 1;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f15090t == -1) {
                a();
            }
            return this.f15090t == 1;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.f15090t == -1) {
                a();
            }
            if (this.f15090t == 0) {
                throw new NoSuchElementException();
            }
            T t6 = this.f15091u;
            this.f15091u = null;
            this.f15090t = -1;
            return t6;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(m5.d dVar, u uVar) {
        this.f15088a = dVar;
        this.f15089b = uVar;
    }

    @Override // w5.d
    public final Iterator<T> iterator() {
        return new a(this);
    }
}
