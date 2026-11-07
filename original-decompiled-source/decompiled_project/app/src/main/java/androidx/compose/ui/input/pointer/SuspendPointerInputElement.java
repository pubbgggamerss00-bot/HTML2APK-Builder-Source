package androidx.compose.ui.input.pointer;

import androidx.compose.ui.d;
import c2.y0;
import i2.a1;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class SuspendPointerInputElement extends a1<y0> {

    /* renamed from: b, reason: collision with root package name */
    public final Object f1205b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1206c;

    /* renamed from: d, reason: collision with root package name */
    public final PointerInputEventHandler f1207d;

    public SuspendPointerInputElement(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler, int i10) {
        obj2 = (i10 & 2) != 0 ? null : obj2;
        this.f1205b = obj;
        this.f1206c = obj2;
        this.f1207d = pointerInputEventHandler;
    }

    @Override // i2.a1
    public final d.c a() {
        return new y0(this.f1205b, this.f1206c, this.f1207d);
    }

    @Override // i2.a1
    public final void b(d.c cVar) {
        y0 y0Var = (y0) cVar;
        Object obj = y0Var.f4712q;
        Object obj2 = this.f1205b;
        boolean z10 = !r.a(obj, obj2);
        y0Var.f4712q = obj2;
        Object obj3 = y0Var.f4713r;
        Object obj4 = this.f1206c;
        if (!r.a(obj3, obj4)) {
            z10 = true;
        }
        y0Var.f4713r = obj4;
        Class<?> cls = y0Var.f4714s.getClass();
        PointerInputEventHandler pointerInputEventHandler = this.f1207d;
        if (cls == pointerInputEventHandler.getClass() ? z10 : true) {
            y0Var.F1();
        }
        y0Var.f4714s = pointerInputEventHandler;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuspendPointerInputElement)) {
            return false;
        }
        SuspendPointerInputElement suspendPointerInputElement = (SuspendPointerInputElement) obj;
        return r.a(this.f1205b, suspendPointerInputElement.f1205b) && r.a(this.f1206c, suspendPointerInputElement.f1206c) && this.f1207d == suspendPointerInputElement.f1207d;
    }

    public final int hashCode() {
        Object obj = this.f1205b;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f1206c;
        return this.f1207d.hashCode() + ((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 961);
    }
}
