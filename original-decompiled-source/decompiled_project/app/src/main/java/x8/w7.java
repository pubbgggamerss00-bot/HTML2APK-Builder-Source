package x8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class w7 {

    public static final class a<T> implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LinkedHashMap f33327a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ eh.l f33328b;

        public a(LinkedHashMap linkedHashMap, eh.l lVar) {
            this.f33327a = linkedHashMap;
            this.f33328b = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t3, T t10) {
            eh.l lVar = this.f33328b;
            Object objInvoke = lVar.invoke(t3);
            LinkedHashMap linkedHashMap = this.f33327a;
            Integer num = (Integer) linkedHashMap.get(objInvoke);
            if (num == null) {
                num = num;
            }
            Integer num2 = (Integer) linkedHashMap.get(lVar.invoke(t10));
            return i0.x1.b(num, num2 != null ? num2 : -1);
        }
    }

    public static final List<Long> a(List<Long> order, long j10, long j11) {
        kotlin.jvm.internal.r.e(order, "order");
        int iIndexOf = order.indexOf(Long.valueOf(j10));
        int iIndexOf2 = order.indexOf(Long.valueOf(j11));
        if (iIndexOf < 0 || iIndexOf2 < 0 || iIndexOf == iIndexOf2) {
            return order;
        }
        ArrayList arrayListE0 = qg.x.e0(order);
        arrayListE0.add(iIndexOf2, arrayListE0.remove(iIndexOf));
        return arrayListE0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> b(List<? extends T> items, List<Long> order, eh.l<? super T, Long> lVar) {
        kotlin.jvm.internal.r.e(items, "items");
        kotlin.jvm.internal.r.e(order, "order");
        if (order.isEmpty()) {
            return items;
        }
        qg.f0 f0Var = new qg.f0(new qg.v(order));
        int iA = qg.j0.a(qg.p.h(f0Var, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        Iterator<qg.e0<T>> it = f0Var.iterator();
        while (true) {
            qg.g0 g0Var = (qg.g0) it;
            if (!g0Var.f22722a.hasNext()) {
                return qg.x.U(new a(linkedHashMap, lVar), items);
            }
            qg.e0 e0Var = (qg.e0) g0Var.next();
            linkedHashMap.put(e0Var.f22720b, Integer.valueOf(e0Var.f22719a));
        }
    }
}
