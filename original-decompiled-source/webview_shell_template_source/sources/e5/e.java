package e5;

import java.util.AbstractList;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class e<E> extends AbstractList<E> implements List<E>, q5.a {
    @Override // java.util.AbstractList, java.util.List
    public final E remove(int i6) {
        h hVar = (h) this;
        int i7 = hVar.f12933u;
        if (i6 < 0 || i6 >= i7) {
            throw new IndexOutOfBoundsException(androidx.camera.view.g.e("index: ", i6, i7, ", size: "));
        }
        if (i6 == l.b(hVar)) {
            return (E) hVar.removeLast();
        }
        if (i6 == 0) {
            return (E) hVar.removeFirst();
        }
        hVar.i();
        int iH = hVar.h(hVar.s + i6);
        Object[] objArr = hVar.f12932t;
        E e6 = (E) objArr[iH];
        if (i6 < (hVar.f12933u >> 1)) {
            int i8 = hVar.s;
            if (iH >= i8) {
                i.c(i8 + 1, i8, iH, objArr, objArr);
            } else {
                i.c(1, 0, iH, objArr, objArr);
                Object[] objArr2 = hVar.f12932t;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i9 = hVar.s;
                i.c(i9 + 1, i9, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = hVar.f12932t;
            int i10 = hVar.s;
            objArr3[i10] = null;
            hVar.s = hVar.e(i10);
        } else {
            int iH2 = hVar.h(l.b(hVar) + hVar.s);
            if (iH <= iH2) {
                Object[] objArr4 = hVar.f12932t;
                i.c(iH, iH + 1, iH2 + 1, objArr4, objArr4);
            } else {
                Object[] objArr5 = hVar.f12932t;
                i.c(iH, iH + 1, objArr5.length, objArr5, objArr5);
                Object[] objArr6 = hVar.f12932t;
                objArr6[objArr6.length - 1] = objArr6[0];
                i.c(0, 1, iH2 + 1, objArr6, objArr6);
            }
            hVar.f12932t[iH2] = null;
        }
        hVar.f12933u--;
        return e6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return ((h) this).f12933u;
    }
}
