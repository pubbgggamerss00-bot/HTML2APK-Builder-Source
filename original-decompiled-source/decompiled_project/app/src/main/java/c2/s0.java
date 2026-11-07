package c2;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;

/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public static final r f4692a = new r(qg.z.f22752a, null);

    public static final class a implements PointerInputEventHandler, kotlin.jvm.internal.m {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ eh.p f4693a;

        public a(eh.p pVar) {
            this.f4693a = pVar;
        }

        @Override // kotlin.jvm.internal.m
        public final pg.f<?> b() {
            return this.f4693a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof PointerInputEventHandler) || !(obj instanceof kotlin.jvm.internal.m)) {
                return false;
            }
            return kotlin.jvm.internal.r.a(this.f4693a, ((kotlin.jvm.internal.m) obj).b());
        }

        public final int hashCode() {
            return this.f4693a.hashCode();
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final /* synthetic */ Object invoke(j0 j0Var, tg.e eVar) {
            return this.f4693a.invoke(j0Var, eVar);
        }
    }

    public static final androidx.compose.ui.d a(androidx.compose.ui.d dVar, Object obj, PointerInputEventHandler pointerInputEventHandler) {
        return dVar.h(new SuspendPointerInputElement(obj, null, pointerInputEventHandler, 6));
    }
}
