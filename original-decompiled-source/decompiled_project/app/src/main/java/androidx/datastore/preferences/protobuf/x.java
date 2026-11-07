package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.MessageLite;
import androidx.datastore.preferences.protobuf.b2;
import androidx.datastore.preferences.protobuf.d0;
import androidx.datastore.preferences.protobuf.h0;
import androidx.datastore.preferences.protobuf.r1;
import androidx.datastore.preferences.protobuf.x.a;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class x<T extends a<T>> {

    /* renamed from: d, reason: collision with root package name */
    public static final x<?> f2165d = new x<>(0);

    /* renamed from: a, reason: collision with root package name */
    public final q1 f2166a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2167b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2168c;

    public interface a<T extends a<T>> extends Comparable<T> {
        GeneratedMessageLite.Builder e0(MessageLite.Builder builder, MessageLite messageLite);

        b2.b getLiteJavaType();

        b2.a getLiteType();

        int getNumber();

        boolean isPacked();

        boolean isRepeated();
    }

    public x() {
        int i10 = r1.f2135f;
        this.f2166a = new q1();
    }

    public static int c(b2.a aVar, int i10, Object obj) {
        int iG = m.g(i10);
        if (aVar == b2.a.f1972d) {
            iG *= 2;
        }
        return d(aVar, obj) + iG;
    }

    public static int d(b2.a aVar, Object obj) {
        int size;
        int iH;
        switch (aVar.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                Logger logger = m.f2085b;
                return 8;
            case 1:
                ((Float) obj).getClass();
                Logger logger2 = m.f2085b;
                return 4;
            case 2:
                return m.i(((Long) obj).longValue());
            case 3:
                return m.i(((Long) obj).longValue());
            case 4:
                return m.i(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                Logger logger3 = m.f2085b;
                return 8;
            case 6:
                ((Integer) obj).getClass();
                Logger logger4 = m.f2085b;
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                Logger logger5 = m.f2085b;
                return 1;
            case 8:
                if (!(obj instanceof j)) {
                    return m.f((String) obj);
                }
                Logger logger6 = m.f2085b;
                size = ((j) obj).size();
                iH = m.h(size);
                break;
            case 9:
                Logger logger7 = m.f2085b;
                return ((MessageLite) obj).getSerializedSize();
            case 10:
                if (!(obj instanceof h0)) {
                    Logger logger8 = m.f2085b;
                    size = ((MessageLite) obj).getSerializedSize();
                    iH = m.h(size);
                    break;
                } else {
                    return m.c((h0) obj);
                }
            case 11:
                if (!(obj instanceof j)) {
                    Logger logger9 = m.f2085b;
                    size = ((byte[]) obj).length;
                    iH = m.h(size);
                    break;
                } else {
                    Logger logger10 = m.f2085b;
                    size = ((j) obj).size();
                    iH = m.h(size);
                    break;
                }
            case 12:
                return m.h(((Integer) obj).intValue());
            case 13:
                return obj instanceof d0.c ? m.i(((d0.c) obj).getNumber()) : m.i(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                Logger logger11 = m.f2085b;
                return 4;
            case 15:
                ((Long) obj).getClass();
                Logger logger12 = m.f2085b;
                return 8;
            case 16:
                return m.d(((Integer) obj).intValue());
            case 17:
                return m.e(((Long) obj).longValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return iH + size;
    }

    public static int e(a<?> aVar, Object obj) {
        b2.a liteType = aVar.getLiteType();
        int number = aVar.getNumber();
        if (!aVar.isRepeated()) {
            return c(liteType, number, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i10 = 0;
        if (!aVar.isPacked()) {
            int iC = 0;
            while (i10 < size) {
                iC += c(liteType, number, list.get(i10));
                i10++;
            }
            return iC;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iD = 0;
        while (i10 < size) {
            iD += d(liteType, list.get(i10));
            i10++;
        }
        return m.h(iD) + m.g(number) + iD;
    }

    public static int h(Map.Entry entry) {
        a aVar = (a) entry.getKey();
        Object value = entry.getValue();
        if (aVar.getLiteJavaType() != b2.b.MESSAGE || aVar.isRepeated() || aVar.isPacked()) {
            return e(aVar, value);
        }
        if (value instanceof h0) {
            int number = ((a) entry.getKey()).getNumber();
            return m.c((h0) value) + m.g(3) + m.h(number) + m.g(2) + (m.g(1) * 2);
        }
        int number2 = ((a) entry.getKey()).getNumber();
        int iH = m.h(number2) + m.g(2) + (m.g(1) * 2);
        int iG = m.g(3);
        int serializedSize = ((MessageLite) value).getSerializedSize();
        return m.h(serializedSize) + serializedSize + iG + iH;
    }

    public static <T extends a<T>> boolean k(Map.Entry<T, Object> entry) {
        boolean zIsInitialized;
        T key = entry.getKey();
        if (key.getLiteJavaType() == b2.b.MESSAGE) {
            if (!key.isRepeated()) {
                Object value = entry.getValue();
                if (value instanceof w0) {
                    return ((w0) value).isInitialized();
                }
                if (value instanceof h0) {
                    return true;
                }
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) entry.getValue();
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = list.get(i10);
                if (obj instanceof w0) {
                    zIsInitialized = ((w0) obj).isInitialized();
                } else {
                    if (!(obj instanceof h0)) {
                        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                    }
                    zIsInitialized = true;
                }
                if (!zIsInitialized) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void q(a aVar, Object obj) {
        aVar.getLiteType();
        Charset charset = d0.f2005a;
        obj.getClass();
        boolean z10 = true;
        switch (r0.f1976a) {
            case INT:
                z10 = obj instanceof Integer;
                break;
            case LONG:
                z10 = obj instanceof Long;
                break;
            case FLOAT:
                z10 = obj instanceof Float;
                break;
            case DOUBLE:
                z10 = obj instanceof Double;
                break;
            case BOOLEAN:
                z10 = obj instanceof Boolean;
                break;
            case STRING:
                z10 = obj instanceof String;
                break;
            case BYTE_STRING:
                if (!(obj instanceof j) && !(obj instanceof byte[])) {
                    z10 = false;
                    break;
                }
                break;
            case ENUM:
                if (!(obj instanceof Integer) && !(obj instanceof d0.c)) {
                }
                break;
            case MESSAGE:
                if (!(obj instanceof MessageLite) && !(obj instanceof h0)) {
                }
                break;
        }
        if (!z10) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(aVar.getNumber()), aVar.getLiteType().f1976a, obj.getClass().getName()));
        }
    }

    public static void r(m mVar, b2.a aVar, int i10, Object obj) throws IOException {
        if (aVar == b2.a.f1972d) {
            mVar.B(i10, 3);
            ((MessageLite) obj).writeTo(mVar);
            mVar.B(i10, 4);
        }
        mVar.B(i10, aVar.f1977b);
        switch (aVar.ordinal()) {
            case 0:
                mVar.s(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                mVar.q(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                mVar.F(((Long) obj).longValue());
                break;
            case 3:
                mVar.F(((Long) obj).longValue());
                break;
            case 4:
                mVar.u(((Integer) obj).intValue());
                break;
            case 5:
                mVar.s(((Long) obj).longValue());
                break;
            case 6:
                mVar.q(((Integer) obj).intValue());
                break;
            case 7:
                mVar.k(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof j)) {
                    mVar.A((String) obj);
                    break;
                } else {
                    mVar.o((j) obj);
                    break;
                }
            case 9:
                ((MessageLite) obj).writeTo(mVar);
                break;
            case 10:
                mVar.w((MessageLite) obj);
                break;
            case 11:
                if (!(obj instanceof j)) {
                    byte[] bArr = (byte[]) obj;
                    mVar.m(bArr.length, bArr);
                    break;
                } else {
                    mVar.o((j) obj);
                    break;
                }
            case 12:
                mVar.D(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof d0.c)) {
                    mVar.u(((Integer) obj).intValue());
                    break;
                } else {
                    mVar.u(((d0.c) obj).getNumber());
                    break;
                }
            case 14:
                mVar.q(((Integer) obj).intValue());
                break;
            case 15:
                mVar.s(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                mVar.D((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                mVar.F((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    public final void a(T t3, Object obj) {
        List arrayList;
        if (!t3.isRepeated()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        q(t3, obj);
        Object objF = f(t3);
        if (objF == null) {
            arrayList = new ArrayList();
            this.f2166a.j(t3, arrayList);
        } else {
            arrayList = (List) objF;
        }
        arrayList.add(obj);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final x<T> clone() {
        x<T> xVar = new x<>();
        q1 q1Var = this.f2166a;
        int size = q1Var.f2136a.size();
        for (int i10 = 0; i10 < size; i10++) {
            Map.Entry<a<Object>, Object> entryF = q1Var.f(i10);
            xVar.p(entryF.getKey(), entryF.getValue());
        }
        for (Map.Entry entry : q1Var.g()) {
            xVar.p((a) entry.getKey(), entry.getValue());
        }
        xVar.f2168c = this.f2168c;
        return xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x) {
            return this.f2166a.equals(((x) obj).f2166a);
        }
        return false;
    }

    public final Object f(T t3) {
        Object obj = this.f2166a.get(t3);
        return obj instanceof h0 ? ((h0) obj).a(null) : obj;
    }

    public final int g() {
        q1 q1Var = this.f2166a;
        int size = q1Var.f2136a.size();
        int iH = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iH += h(q1Var.f(i10));
        }
        Iterator it = q1Var.g().iterator();
        while (it.hasNext()) {
            iH += h((Map.Entry) it.next());
        }
        return iH;
    }

    public final int hashCode() {
        return this.f2166a.hashCode();
    }

    public final int i() {
        q1 q1Var = this.f2166a;
        int size = q1Var.f2136a.size();
        int iE = 0;
        for (int i10 = 0; i10 < size; i10++) {
            Map.Entry<a<Object>, Object> entryF = q1Var.f(i10);
            iE += e(entryF.getKey(), entryF.getValue());
        }
        for (Map.Entry entry : q1Var.g()) {
            iE += e((a) entry.getKey(), entry.getValue());
        }
        return iE;
    }

    public final boolean j() {
        q1 q1Var = this.f2166a;
        int size = q1Var.f2136a.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                Iterator it = q1Var.g().iterator();
                while (it.hasNext()) {
                    if (!k((Map.Entry) it.next())) {
                    }
                }
                return true;
            }
            if (!k(q1Var.f(i10))) {
                break;
            }
            i10++;
        }
        return false;
    }

    public final Iterator<Map.Entry<T, Object>> l() {
        q1 q1Var = this.f2166a;
        if (q1Var.isEmpty()) {
            return Collections.emptyIterator();
        }
        if (!this.f2168c) {
            return ((r1.c) q1Var.entrySet()).iterator();
        }
        Iterator<Map.Entry<K, Object>> it = ((r1.c) q1Var.entrySet()).iterator();
        h0.b bVar = new h0.b();
        bVar.f2032a = it;
        return bVar;
    }

    public final void m() {
        if (this.f2167b) {
            return;
        }
        q1 q1Var = this.f2166a;
        int size = q1Var.f2136a.size();
        for (int i10 = 0; i10 < size; i10++) {
            Map.Entry<a<Object>, Object> entryF = q1Var.f(i10);
            if (entryF.getValue() instanceof GeneratedMessageLite) {
                ((GeneratedMessageLite) entryF.getValue()).makeImmutable();
            }
        }
        q1Var.i();
        this.f2167b = true;
    }

    public final void n(x<T> xVar) {
        q1 q1Var = xVar.f2166a;
        int size = q1Var.f2136a.size();
        for (int i10 = 0; i10 < size; i10++) {
            o(q1Var.f(i10));
        }
        Iterator it = q1Var.g().iterator();
        while (it.hasNext()) {
            o((Map.Entry) it.next());
        }
    }

    public final void o(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        boolean z10 = value instanceof h0;
        boolean zIsRepeated = key.isRepeated();
        q1 q1Var = this.f2166a;
        if (zIsRepeated) {
            if (z10) {
                throw new IllegalStateException("Lazy fields can not be repeated");
            }
            Object objF = f(key);
            if (objF == null) {
                objF = new ArrayList();
            }
            for (Object obj : (List) value) {
                List list = (List) objF;
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    obj = bArr2;
                }
                list.add(obj);
            }
            q1Var.j(key, objF);
            return;
        }
        if (key.getLiteJavaType() != b2.b.MESSAGE) {
            if (z10) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            if (value instanceof byte[]) {
                byte[] bArr3 = (byte[]) value;
                byte[] bArr4 = new byte[bArr3.length];
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                value = bArr4;
            }
            q1Var.j(key, value);
            return;
        }
        Object objF2 = f(key);
        if (objF2 != null) {
            if (z10) {
                value = ((h0) value).a(null);
            }
            q1Var.j(key, key.e0(((MessageLite) objF2).toBuilder(), (MessageLite) value).build());
            return;
        }
        if (value instanceof byte[]) {
            byte[] bArr5 = (byte[]) value;
            byte[] bArr6 = new byte[bArr5.length];
            System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
            value = bArr6;
        }
        q1Var.j(key, value);
        if (z10) {
            this.f2168c = true;
        }
    }

    public final void p(T t3, Object obj) {
        if (!t3.isRepeated()) {
            q(t3, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj2 = arrayList.get(i10);
                i10++;
                q(t3, obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof h0) {
            this.f2168c = true;
        }
        this.f2166a.j(t3, obj);
    }

    public x(int i10) {
        int i11 = r1.f2135f;
        this.f2166a = new q1();
        m();
        m();
    }
}
