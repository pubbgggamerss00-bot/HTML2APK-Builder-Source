package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.MessageLite;
import androidx.datastore.preferences.protobuf.b2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class v extends u<GeneratedMessageLite.b> {
    @Override // androidx.datastore.preferences.protobuf.u
    public final int a(Map.Entry<?, ?> entry) {
        return ((GeneratedMessageLite.b) entry.getKey()).f1917a;
    }

    @Override // androidx.datastore.preferences.protobuf.u
    public final GeneratedMessageLite.c b(t tVar, MessageLite messageLite, int i10) {
        return tVar.a(i10, messageLite);
    }

    @Override // androidx.datastore.preferences.protobuf.u
    public final x<GeneratedMessageLite.b> c(Object obj) {
        return ((GeneratedMessageLite.ExtendableMessage) obj).extensions;
    }

    @Override // androidx.datastore.preferences.protobuf.u
    public final x<GeneratedMessageLite.b> d(Object obj) {
        return ((GeneratedMessageLite.ExtendableMessage) obj).ensureExtensionsAreMutable();
    }

    @Override // androidx.datastore.preferences.protobuf.u
    public final boolean e(MessageLite messageLite) {
        return messageLite instanceof GeneratedMessageLite.ExtendableMessage;
    }

    @Override // androidx.datastore.preferences.protobuf.u
    public final void f(Object obj) {
        ((GeneratedMessageLite.ExtendableMessage) obj).extensions.m();
    }

    @Override // androidx.datastore.preferences.protobuf.u
    public final Object g(Object obj, l lVar, Object obj2, t tVar, x xVar, Object obj3, w1 w1Var) throws IOException {
        Object objValueOf;
        Object objF;
        List<Double> arrayList;
        GeneratedMessageLite.c cVar = (GeneratedMessageLite.c) obj2;
        GeneratedMessageLite.b bVar = cVar.f1924d;
        MessageLite messageLite = cVar.f1923c;
        int i10 = bVar.f1917a;
        b2.a aVar = bVar.f1918b;
        if (bVar.f1919c && bVar.f1920d) {
            switch (aVar.ordinal()) {
                case 0:
                    arrayList = new ArrayList<>();
                    lVar.g(arrayList);
                    break;
                case 1:
                    arrayList = new ArrayList<>();
                    lVar.l(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList<>();
                    lVar.n(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList<>();
                    lVar.v(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList<>();
                    lVar.m(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList<>();
                    lVar.k(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList<>();
                    lVar.j(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList<>();
                    lVar.d(arrayList);
                    break;
                case 8:
                case 9:
                case 10:
                case 11:
                default:
                    throw new IllegalStateException("Type cannot be packed: " + bVar.f1918b);
                case 12:
                    arrayList = new ArrayList<>();
                    lVar.u(arrayList);
                    break;
                case 13:
                    ArrayList arrayList2 = new ArrayList();
                    lVar.h(arrayList2);
                    obj3 = p1.j(obj, i10, arrayList2, null, obj3, w1Var);
                    arrayList = arrayList2;
                    break;
                case 14:
                    arrayList = new ArrayList<>();
                    lVar.p(arrayList);
                    break;
                case 15:
                    arrayList = new ArrayList<>();
                    lVar.q(arrayList);
                    break;
                case 16:
                    arrayList = new ArrayList<>();
                    lVar.r(arrayList);
                    break;
                case 17:
                    arrayList = new ArrayList<>();
                    lVar.s(arrayList);
                    break;
            }
            xVar.p(bVar, arrayList);
            return obj3;
        }
        if (aVar == b2.a.f1974f) {
            lVar.x(0);
            lVar.f2078a.t();
            throw null;
        }
        switch (aVar.ordinal()) {
            case 0:
                lVar.x(1);
                objValueOf = Double.valueOf(lVar.f2078a.n());
                break;
            case 1:
                lVar.x(5);
                objValueOf = Float.valueOf(lVar.f2078a.r());
                break;
            case 2:
                lVar.x(0);
                objValueOf = Long.valueOf(lVar.f2078a.u());
                break;
            case 3:
                lVar.x(0);
                objValueOf = Long.valueOf(lVar.f2078a.G());
                break;
            case 4:
                lVar.x(0);
                objValueOf = Integer.valueOf(lVar.f2078a.t());
                break;
            case 5:
                lVar.x(1);
                objValueOf = Long.valueOf(lVar.f2078a.q());
                break;
            case 6:
                lVar.x(5);
                objValueOf = Integer.valueOf(lVar.f2078a.p());
                break;
            case 7:
                lVar.x(0);
                objValueOf = Boolean.valueOf(lVar.f2078a.l());
                break;
            case 8:
                lVar.x(2);
                objValueOf = lVar.f2078a.C();
                break;
            case 9:
                if (!bVar.f1919c) {
                    Object objF2 = xVar.f(bVar);
                    if (objF2 instanceof GeneratedMessageLite) {
                        k1 k1Var = k1.f2075c;
                        k1Var.getClass();
                        o1 o1VarA = k1Var.a(objF2.getClass());
                        if (!((GeneratedMessageLite) objF2).isMutable()) {
                            Object objNewInstance = o1VarA.newInstance();
                            o1VarA.mergeFrom(objNewInstance, objF2);
                            xVar.p(bVar, objNewInstance);
                            objF2 = objNewInstance;
                        }
                        lVar.x(3);
                        lVar.b(objF2, o1VarA, tVar);
                        return obj3;
                    }
                }
                Class<?> cls = messageLite.getClass();
                lVar.x(3);
                o1 o1VarA2 = k1.f2075c.a(cls);
                Object objNewInstance2 = o1VarA2.newInstance();
                lVar.b(objNewInstance2, o1VarA2, tVar);
                o1VarA2.makeImmutable(objNewInstance2);
                objValueOf = objNewInstance2;
                break;
            case 10:
                if (!bVar.f1919c) {
                    Object objF3 = xVar.f(bVar);
                    if (objF3 instanceof GeneratedMessageLite) {
                        k1 k1Var2 = k1.f2075c;
                        k1Var2.getClass();
                        o1 o1VarA3 = k1Var2.a(objF3.getClass());
                        if (!((GeneratedMessageLite) objF3).isMutable()) {
                            Object objNewInstance3 = o1VarA3.newInstance();
                            o1VarA3.mergeFrom(objNewInstance3, objF3);
                            xVar.p(bVar, objNewInstance3);
                            objF3 = objNewInstance3;
                        }
                        lVar.x(2);
                        lVar.c(objF3, o1VarA3, tVar);
                        return obj3;
                    }
                }
                objValueOf = lVar.o(messageLite.getClass(), tVar);
                break;
            case 11:
                objValueOf = lVar.e();
                break;
            case 12:
                lVar.x(0);
                objValueOf = Integer.valueOf(lVar.f2078a.F());
                break;
            case 13:
                throw new IllegalStateException("Shouldn't reach here.");
            case 14:
                lVar.x(5);
                objValueOf = Integer.valueOf(lVar.f2078a.y());
                break;
            case 15:
                lVar.x(1);
                objValueOf = Long.valueOf(lVar.f2078a.z());
                break;
            case 16:
                lVar.x(0);
                objValueOf = Integer.valueOf(lVar.f2078a.A());
                break;
            case 17:
                lVar.x(0);
                objValueOf = Long.valueOf(lVar.f2078a.B());
                break;
            default:
                objValueOf = null;
                break;
        }
        if (bVar.f1919c) {
            xVar.a(bVar, objValueOf);
            return obj3;
        }
        int iOrdinal = bVar.f1918b.ordinal();
        if ((iOrdinal == 9 || iOrdinal == 10) && (objF = xVar.f(bVar)) != null) {
            objValueOf = ((MessageLite) objF).toBuilder().mergeFrom((MessageLite) objValueOf).buildPartial();
        }
        xVar.p(bVar, objValueOf);
        return obj3;
    }

    @Override // androidx.datastore.preferences.protobuf.u
    public final void h(n1 n1Var, Object obj, t tVar, x<GeneratedMessageLite.b> xVar) throws IOException {
        GeneratedMessageLite.c cVar = (GeneratedMessageLite.c) obj;
        xVar.p(cVar.f1924d, ((l) n1Var).o(cVar.f1923c.getClass(), tVar));
    }

    @Override // androidx.datastore.preferences.protobuf.u
    public final void i(j jVar, Object obj, t tVar, x<GeneratedMessageLite.b> xVar) throws IOException {
        GeneratedMessageLite.c cVar = (GeneratedMessageLite.c) obj;
        MessageLite.Builder builderNewBuilderForType = cVar.f1923c.newBuilderForType();
        k kVarI = jVar.i();
        builderNewBuilderForType.mergeFrom(kVarI, tVar);
        xVar.p(cVar.f1924d, builderNewBuilderForType.buildPartial());
        kVarI.a(0);
    }

    @Override // androidx.datastore.preferences.protobuf.u
    public final void j(c2 c2Var, Map.Entry<?, ?> entry) throws IOException {
        GeneratedMessageLite.b bVar = (GeneratedMessageLite.b) entry.getKey();
        boolean z10 = bVar.f1919c;
        b2.a aVar = bVar.f1918b;
        boolean z11 = bVar.f1920d;
        int i10 = bVar.f1917a;
        if (z10) {
            switch (aVar.ordinal()) {
                case 0:
                    p1.p(i10, (List) entry.getValue(), c2Var, z11);
                    break;
                case 1:
                    p1.t(i10, (List) entry.getValue(), c2Var, z11);
                    break;
                case 2:
                    p1.w(i10, (List) entry.getValue(), c2Var, z11);
                    break;
                case 3:
                    p1.E(i10, (List) entry.getValue(), c2Var, z11);
                    break;
                case 4:
                    p1.v(i10, (List) entry.getValue(), c2Var, z11);
                    break;
                case 5:
                    p1.s(i10, (List) entry.getValue(), c2Var, z11);
                    break;
                case 6:
                    p1.r(i10, (List) entry.getValue(), c2Var, z11);
                    break;
                case 7:
                    p1.n(i10, (List) entry.getValue(), c2Var, z11);
                    break;
                case 8:
                    p1.C(i10, (List) entry.getValue(), c2Var);
                    break;
                case 9:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        p1.u(i10, (List) entry.getValue(), c2Var, k1.f2075c.a(list.get(0).getClass()));
                        break;
                    }
                    break;
                case 10:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        p1.x(i10, (List) entry.getValue(), c2Var, k1.f2075c.a(list2.get(0).getClass()));
                        break;
                    }
                    break;
                case 11:
                    p1.o(i10, (List) entry.getValue(), c2Var);
                    break;
                case 12:
                    p1.D(i10, (List) entry.getValue(), c2Var, z11);
                    break;
                case 13:
                    p1.v(i10, (List) entry.getValue(), c2Var, z11);
                    break;
                case 14:
                    p1.y(i10, (List) entry.getValue(), c2Var, z11);
                    break;
                case 15:
                    p1.z(i10, (List) entry.getValue(), c2Var, z11);
                    break;
                case 16:
                    p1.A(i10, (List) entry.getValue(), c2Var, z11);
                    break;
                case 17:
                    p1.B(i10, (List) entry.getValue(), c2Var, z11);
                    break;
            }
        }
        switch (aVar.ordinal()) {
            case 0:
                double dDoubleValue = ((Double) entry.getValue()).doubleValue();
                m mVar = ((n) c2Var).f2101a;
                mVar.getClass();
                mVar.r(i10, Double.doubleToRawLongBits(dDoubleValue));
                break;
            case 1:
                float fFloatValue = ((Float) entry.getValue()).floatValue();
                m mVar2 = ((n) c2Var).f2101a;
                mVar2.getClass();
                mVar2.p(i10, Float.floatToRawIntBits(fFloatValue));
                break;
            case 2:
                ((n) c2Var).f2101a.E(i10, ((Long) entry.getValue()).longValue());
                break;
            case 3:
                ((n) c2Var).f2101a.E(i10, ((Long) entry.getValue()).longValue());
                break;
            case 4:
                ((n) c2Var).f2101a.t(i10, ((Integer) entry.getValue()).intValue());
                break;
            case 5:
                ((n) c2Var).f2101a.r(i10, ((Long) entry.getValue()).longValue());
                break;
            case 6:
                ((n) c2Var).f2101a.p(i10, ((Integer) entry.getValue()).intValue());
                break;
            case 7:
                ((n) c2Var).f2101a.l(i10, ((Boolean) entry.getValue()).booleanValue());
                break;
            case 8:
                ((n) c2Var).f2101a.z(i10, (String) entry.getValue());
                break;
            case 9:
                ((n) c2Var).a(i10, entry.getValue(), k1.f2075c.a(entry.getValue().getClass()));
                break;
            case 10:
                Object value = entry.getValue();
                ((n) c2Var).f2101a.v(i10, (MessageLite) value, k1.f2075c.a(entry.getValue().getClass()));
                break;
            case 11:
                ((n) c2Var).f2101a.n(i10, (j) entry.getValue());
                break;
            case 12:
                ((n) c2Var).f2101a.C(i10, ((Integer) entry.getValue()).intValue());
                break;
            case 13:
                ((n) c2Var).f2101a.t(i10, ((Integer) entry.getValue()).intValue());
                break;
            case 14:
                ((n) c2Var).f2101a.p(i10, ((Integer) entry.getValue()).intValue());
                break;
            case 15:
                ((n) c2Var).f2101a.r(i10, ((Long) entry.getValue()).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) entry.getValue()).intValue();
                ((n) c2Var).f2101a.C(i10, (iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) entry.getValue()).longValue();
                ((n) c2Var).f2101a.E(i10, (jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }
}
