package kotlin.jvm.internal;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final Object[] f13552a = new Object[0];

    public static final Object[] a(Collection<?> collection) {
        int size = collection.size();
        if (size != 0) {
            Iterator<?> it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArrCopyOf = new Object[size];
                int i6 = 0;
                while (true) {
                    int i7 = i6 + 1;
                    objArrCopyOf[i6] = it.next();
                    if (i7 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i8 = ((i7 * 3) + 1) >>> 1;
                        if (i8 <= i7) {
                            i8 = 2147483645;
                            if (i7 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i8);
                        j.d("copyOf(...)", objArrCopyOf);
                    } else if (!it.hasNext()) {
                        Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i7);
                        j.d("copyOf(...)", objArrCopyOf2);
                        return objArrCopyOf2;
                    }
                    i6 = i7;
                }
            }
        }
        return f13552a;
    }

    public static final Object[] b(Collection<?> collection, Object[] objArr) throws NegativeArraySizeException {
        Object[] objArrCopyOf;
        int size = collection.size();
        int i6 = 0;
        if (size != 0) {
            Iterator<?> it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArrCopyOf = objArr;
                } else {
                    Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    j.c("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", objNewInstance);
                    objArrCopyOf = (Object[]) objNewInstance;
                }
                while (true) {
                    int i7 = i6 + 1;
                    objArrCopyOf[i6] = it.next();
                    if (i7 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i8 = ((i7 * 3) + 1) >>> 1;
                        if (i8 <= i7) {
                            i8 = 2147483645;
                            if (i7 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i8);
                        j.d("copyOf(...)", objArrCopyOf);
                    } else if (!it.hasNext()) {
                        if (objArrCopyOf == objArr) {
                            objArr[i7] = null;
                            return objArr;
                        }
                        Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i7);
                        j.d("copyOf(...)", objArrCopyOf2);
                        return objArrCopyOf2;
                    }
                    i6 = i7;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }
}
