package h1;

import fh.c;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* loaded from: classes.dex */
public final class d0 implements Map.Entry<Object, Object>, c.a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f12108a;

    /* renamed from: b, reason: collision with root package name */
    public Object f12109b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e0<Object, Object> f12110c;

    public d0(e0<Object, Object> e0Var) {
        this.f12110c = e0Var;
        Map.Entry<? extends Object, ? extends Object> entry = e0Var.f12118d;
        kotlin.jvm.internal.r.b(entry);
        this.f12108a = entry.getKey();
        Map.Entry<? extends Object, ? extends Object> entry2 = e0Var.f12118d;
        kotlin.jvm.internal.r.b(entry2);
        this.f12109b = entry2.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f12108a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f12109b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        e0<Object, Object> e0Var = this.f12110c;
        if (e0Var.f12115a.f().f12192d != e0Var.f12117c) {
            throw new ConcurrentModificationException();
        }
        Object obj2 = this.f12109b;
        e0Var.f12115a.put(this.f12108a, obj);
        this.f12109b = obj;
        return obj2;
    }
}
