package a1;

import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public interface a<E> extends List<E>, Collection, fh.a {

    /* renamed from: a1.a$a, reason: collision with other inner class name */
    public static final class C0000a<E> extends qg.c<E> implements a<E> {

        /* renamed from: a, reason: collision with root package name */
        public final a<E> f0a;

        /* renamed from: b, reason: collision with root package name */
        public final int f1b;

        /* renamed from: c, reason: collision with root package name */
        public final int f2c;

        /* JADX WARN: Multi-variable type inference failed */
        public C0000a(a<? extends E> aVar, int i10, int i11) {
            this.f0a = aVar;
            this.f1b = i10;
            e1.d.c(i10, i11, aVar.size());
            this.f2c = i11 - i10;
        }

        @Override // qg.a
        public final int c() {
            return this.f2c;
        }

        @Override // java.util.List
        public final E get(int i10) {
            e1.d.a(i10, this.f2c);
            return this.f0a.get(this.f1b + i10);
        }

        @Override // qg.c, java.util.List
        public final List subList(int i10, int i11) {
            e1.d.c(i10, i11, this.f2c);
            int i12 = this.f1b;
            return new C0000a(this.f0a, i10 + i12, i12 + i11);
        }
    }
}
