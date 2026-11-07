package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.s32;
import com.google.android.gms.internal.ads.t32;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class t32<MessageType extends t32<MessageType, BuilderType>, BuilderType extends s32<MessageType, BuilderType>> implements m62 {
    protected int zzq = 0;

    public static <T> void h(Iterable<T> iterable, List<? super T> list) {
        Charset charset = s52.f8801a;
        iterable.getClass();
        if (iterable instanceof a62) {
            List listZza = ((a62) iterable).zza();
            a62 a62Var = (a62) list;
            int size = list.size();
            for (Object obj : listZza) {
                if (obj == null) {
                    String strA = androidx.camera.camera2.internal.s0.a(a62Var.size() - size, "Element at index ", " is null.");
                    int size2 = a62Var.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            throw new NullPointerException(strA);
                        }
                        a62Var.remove(size2);
                    }
                } else if (obj instanceof g42) {
                    a62Var.zzb();
                } else if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    g42.s(0, bArr.length, bArr);
                    a62Var.zzb();
                } else {
                    a62Var.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof t62) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size3 = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size3);
            } else if (list instanceof v62) {
                v62 v62Var = (v62) list;
                int i6 = v62Var.f9736u + size3;
                int length = v62Var.f9735t.length;
                if (i6 > length) {
                    if (length != 0) {
                        while (length < i6) {
                            length = androidx.activity.m.b(length, 3, 2, 1, 10);
                        }
                        v62Var.f9735t = Arrays.copyOf(v62Var.f9735t, length);
                    } else {
                        v62Var.f9735t = new Object[Math.max(i6, 10)];
                    }
                }
            }
        }
        int size4 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    s32.f(size4, list);
                    throw null;
                }
                list.add(obj2);
            }
            return;
        }
        List list2 = (List) iterable;
        int size5 = list2.size();
        for (int i7 = 0; i7 < size5; i7++) {
            a.c cVar = (Object) list2.get(i7);
            if (cVar == null) {
                s32.f(size4, list);
                throw null;
            }
            list.add(cVar);
        }
    }

    public int e() {
        throw new UnsupportedOperationException();
    }

    public int f(b72 b72Var) {
        return e();
    }

    public final g42 g() {
        try {
            int iF = ((j52) this).f(null);
            e42 e42Var = g42.f4896t;
            byte[] bArr = new byte[iF];
            m42 m42Var = new m42(iF, bArr);
            ((j52) this).d(m42Var);
            if (iF - m42Var.f6936y == 0) {
                return new e42(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e6) {
            throw new RuntimeException(j("ByteString"), e6);
        }
    }

    public final byte[] i() {
        try {
            int iF = ((j52) this).f(null);
            byte[] bArr = new byte[iF];
            m42 m42Var = new m42(iF, bArr);
            ((j52) this).d(m42Var);
            if (iF - m42Var.f6936y == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e6) {
            throw new RuntimeException(j("byte array"), e6);
        }
    }

    public final String j(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }
}
