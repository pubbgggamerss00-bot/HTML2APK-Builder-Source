package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.r1;
import com.google.crypto.tink.shaded.protobuf.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f6657a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final b f6658b = new b();

    public static final class a extends f0 {

        /* renamed from: c, reason: collision with root package name */
        public static final Class<?> f6659c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

        public static <L> List<L> d(Object obj, long j10, int i10) {
            List<L> list = (List) r1.f6751c.i(obj, j10);
            if (list.isEmpty()) {
                List<L> d0Var = list instanceof e0 ? new d0(i10) : ((list instanceof a1) && (list instanceof y.c)) ? ((y.c) list).mutableCopyWithCapacity(i10) : new ArrayList<>(i10);
                r1.p(obj, j10, d0Var);
                return d0Var;
            }
            if (f6659c.isAssignableFrom(list.getClass())) {
                ArrayList arrayList = new ArrayList(list.size() + i10);
                arrayList.addAll(list);
                r1.p(obj, j10, arrayList);
                return arrayList;
            }
            if (list instanceof q1) {
                d0 d0Var2 = new d0(list.size() + i10);
                d0Var2.addAll((q1) list);
                r1.p(obj, j10, d0Var2);
                return d0Var2;
            }
            if ((list instanceof a1) && (list instanceof y.c)) {
                y.c cVar = (y.c) list;
                if (!cVar.isModifiable()) {
                    y.c cVarMutableCopyWithCapacity = cVar.mutableCopyWithCapacity(list.size() + i10);
                    r1.p(obj, j10, cVarMutableCopyWithCapacity);
                    return cVarMutableCopyWithCapacity;
                }
            }
            return list;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.f0
        public final void a(Object obj, long j10) {
            Object objUnmodifiableList;
            List list = (List) r1.f6751c.i(obj, j10);
            if (list instanceof e0) {
                objUnmodifiableList = ((e0) list).getUnmodifiableView();
            } else {
                if (f6659c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof a1) && (list instanceof y.c)) {
                    y.c cVar = (y.c) list;
                    if (cVar.isModifiable()) {
                        cVar.makeImmutable();
                        return;
                    }
                    return;
                }
                objUnmodifiableList = Collections.unmodifiableList(list);
            }
            r1.p(obj, j10, objUnmodifiableList);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.f0
        public final <E> void b(Object obj, Object obj2, long j10) {
            List list = (List) r1.f6751c.i(obj2, j10);
            List listD = d(obj, j10, list.size());
            int size = listD.size();
            int size2 = list.size();
            if (size > 0 && size2 > 0) {
                listD.addAll(list);
            }
            if (size > 0) {
                list = listD;
            }
            r1.p(obj, j10, list);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.f0
        public final <L> List<L> c(Object obj, long j10) {
            return d(obj, j10, 10);
        }
    }

    public static final class b extends f0 {
        @Override // com.google.crypto.tink.shaded.protobuf.f0
        public final void a(Object obj, long j10) {
            ((y.c) r1.f6751c.i(obj, j10)).makeImmutable();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.f0
        public final <E> void b(Object obj, Object obj2, long j10) {
            r1.e eVar = r1.f6751c;
            y.c cVarMutableCopyWithCapacity = (y.c) eVar.i(obj, j10);
            y.c cVar = (y.c) eVar.i(obj2, j10);
            int size = cVarMutableCopyWithCapacity.size();
            int size2 = cVar.size();
            if (size > 0 && size2 > 0) {
                if (!cVarMutableCopyWithCapacity.isModifiable()) {
                    cVarMutableCopyWithCapacity = cVarMutableCopyWithCapacity.mutableCopyWithCapacity(size2 + size);
                }
                cVarMutableCopyWithCapacity.addAll(cVar);
            }
            if (size > 0) {
                cVar = cVarMutableCopyWithCapacity;
            }
            r1.p(obj, j10, cVar);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.f0
        public final <L> List<L> c(Object obj, long j10) {
            y.c cVar = (y.c) r1.f6751c.i(obj, j10);
            if (cVar.isModifiable()) {
                return cVar;
            }
            int size = cVar.size();
            y.c cVarMutableCopyWithCapacity = cVar.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
            r1.p(obj, j10, cVarMutableCopyWithCapacity);
            return cVarMutableCopyWithCapacity;
        }
    }

    public abstract void a(Object obj, long j10);

    public abstract <L> void b(Object obj, Object obj2, long j10);

    public abstract <L> List<L> c(Object obj, long j10);
}
