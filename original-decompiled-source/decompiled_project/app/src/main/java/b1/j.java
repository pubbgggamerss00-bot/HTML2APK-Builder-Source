package b1;

import b1.b;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.r;
import qg.m;
import qg.o;

/* loaded from: classes.dex */
public final class j<E> extends b<E> implements a1.a<E> {

    /* renamed from: b, reason: collision with root package name */
    public static final j f3502b = new j(new Object[0]);

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f3503a;

    public j(Object[] objArr) {
        this.f3503a = objArr;
    }

    @Override // a1.c
    public final a1.c<E> E(int i10) {
        Object[] objArr = this.f3503a;
        e1.d.a(i10, objArr.length);
        if (objArr.length == 1) {
            return f3502b;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length - 1);
        r.d(objArrCopyOf, "copyOf(...)");
        m.g(objArr, i10, objArrCopyOf, i10 + 1, objArr.length);
        return new j(objArrCopyOf);
    }

    @Override // java.util.List, a1.c
    public final a1.c<E> add(int i10, E e10) {
        Object[] objArr = this.f3503a;
        e1.d.b(i10, objArr.length);
        if (i10 == objArr.length) {
            return add((j<E>) e10);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            m.i(objArr, 0, objArr2, i10, 6);
            m.g(objArr, i10 + 1, objArr2, i10, objArr.length);
            objArr2[i10] = e10;
            return new j(objArr2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        r.d(objArrCopyOf, "copyOf(...)");
        m.g(objArr, i10 + 1, objArrCopyOf, i10, objArr.length - 1);
        objArrCopyOf[i10] = e10;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new e(objArrCopyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // b1.b, java.util.Collection, java.util.List, a1.c
    public final a1.c<E> addAll(Collection<? extends E> collection) {
        Object[] objArr = this.f3503a;
        if (collection.size() + objArr.length > 32) {
            f fVarBuilder = builder();
            fVarBuilder.addAll(collection);
            return fVarBuilder.f();
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        r.d(objArrCopyOf, "copyOf(...)");
        int length = objArr.length;
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[length] = it.next();
            length++;
        }
        return new j(objArrCopyOf);
    }

    @Override // a1.c
    public final f builder() {
        return new f(this, null, this.f3503a, 0);
    }

    @Override // qg.a
    public final int c() {
        return this.f3503a.length;
    }

    @Override // java.util.List
    public final E get(int i10) {
        e1.d.a(i10, c());
        return (E) this.f3503a[i10];
    }

    @Override // qg.c, java.util.List
    public final int indexOf(Object obj) {
        return o.w(this.f3503a, obj);
    }

    @Override // a1.c
    public final a1.c l(b.a aVar) {
        Object[] objArr = this.f3503a;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArrCopyOf = objArr;
        boolean z10 = false;
        for (int i10 = 0; i10 < length2; i10++) {
            Object obj = objArr[i10];
            if (((Boolean) aVar.invoke(obj)).booleanValue()) {
                if (!z10) {
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    r.d(objArrCopyOf, "copyOf(...)");
                    z10 = true;
                    length = i10;
                }
            } else if (z10) {
                objArrCopyOf[length] = obj;
                length++;
            }
        }
        return length == objArr.length ? this : length == 0 ? f3502b : new j(m.k(objArrCopyOf, 0, length));
    }

    @Override // qg.c, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.f3503a;
        r.e(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i10 = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i10 < 0) {
                        break;
                    }
                    length = i10;
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i11 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i11 < 0) {
                        break;
                    }
                    length2 = i11;
                }
            }
        }
        return -1;
    }

    @Override // qg.c, java.util.List
    public final ListIterator<E> listIterator(int i10) {
        Object[] objArr = this.f3503a;
        e1.d.b(i10, objArr.length);
        return new c(objArr, i10, objArr.length);
    }

    @Override // qg.c, java.util.List, a1.c
    public final a1.c<E> set(int i10, E e10) {
        Object[] objArr = this.f3503a;
        e1.d.a(i10, objArr.length);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        r.d(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i10] = e10;
        return new j(objArrCopyOf);
    }

    @Override // java.util.Collection, java.util.List, a1.c
    public final a1.c<E> add(E e10) {
        Object[] objArr = this.f3503a;
        if (objArr.length < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
            r.d(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[objArr.length] = e10;
            return new j(objArrCopyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = e10;
        return new e(objArr, objArr2, objArr.length + 1, 0);
    }
}
