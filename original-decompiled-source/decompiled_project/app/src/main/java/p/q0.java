package p;

/* loaded from: classes.dex */
public abstract class q0<E> {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f20706a;

    /* renamed from: b, reason: collision with root package name */
    public int f20707b;

    public static final class a extends kotlin.jvm.internal.s implements eh.l<E, CharSequence> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q0<E> f20708a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q0<E> q0Var) {
            super(1);
            this.f20708a = q0Var;
        }

        @Override // eh.l
        public final CharSequence invoke(Object obj) {
            return obj == this.f20708a ? "(this)" : String.valueOf(obj);
        }
    }

    public final E a() {
        if (!d()) {
            return (E) this.f20706a[0];
        }
        q.d.c("ObjectList is empty.");
        throw null;
    }

    public final E b(int i10) {
        if (i10 >= 0 && i10 < this.f20707b) {
            return (E) this.f20706a[i10];
        }
        f(i10);
        throw null;
    }

    public final int c(E e10) {
        int i10 = 0;
        if (e10 == null) {
            Object[] objArr = this.f20706a;
            int i11 = this.f20707b;
            while (i10 < i11) {
                if (objArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        Object[] objArr2 = this.f20706a;
        int i12 = this.f20707b;
        while (i10 < i12) {
            if (e10.equals(objArr2[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public final boolean d() {
        return this.f20707b == 0;
    }

    public final boolean e() {
        return this.f20707b != 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q0) {
            q0 q0Var = (q0) obj;
            int i10 = q0Var.f20707b;
            int i11 = this.f20707b;
            if (i10 == i11) {
                Object[] objArr = this.f20706a;
                Object[] objArr2 = q0Var.f20706a;
                jh.g gVarQ = jh.j.q(0, i11);
                int i12 = gVarQ.f15744a;
                int i13 = gVarQ.f15745b;
                if (i12 > i13) {
                    return true;
                }
                while (kotlin.jvm.internal.r.a(objArr[i12], objArr2[i12])) {
                    if (i12 == i13) {
                        return true;
                    }
                    i12++;
                }
                return false;
            }
        }
        return false;
    }

    public final void f(int i10) {
        StringBuilder sbB = i0.b(i10, "Index ", " must be in 0..");
        sbB.append(this.f20707b - 1);
        q.d.b(sbB.toString());
        throw null;
    }

    public final int hashCode() {
        Object[] objArr = this.f20706a;
        int i10 = this.f20707b;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = objArr[i11];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        a aVar = new a(this);
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.f20706a;
        int i10 = this.f20707b;
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                sb.append((CharSequence) "]");
                break;
            }
            Object obj = objArr[i11];
            if (i11 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i11 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) aVar.invoke(obj));
            i11++;
        }
        String string = sb.toString();
        kotlin.jvm.internal.r.d(string, "toString(...)");
        return string;
    }
}
