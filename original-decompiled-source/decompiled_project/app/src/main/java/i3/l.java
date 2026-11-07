package i3;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.ui.viewinterop.a;
import c0.t;
import g1.i;
import i2.v1;
import kotlin.jvm.internal.s;
import pg.f0;

/* loaded from: classes.dex */
public final class l<T extends View> extends i3.b {
    public final T D;
    public final b2.b E;
    public final g1.i F;
    public i.a G;
    public eh.l<? super T, f0> H;
    public eh.l<? super T, f0> I;
    public eh.l<? super T, f0> K;

    public static final class a extends s implements eh.a<f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l<T> f14157a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l<T> lVar) {
            super(0);
            this.f14157a = lVar;
        }

        @Override // eh.a
        public final f0 invoke() {
            l<T> lVar = this.f14157a;
            lVar.getReleaseBlock().invoke(lVar.D);
            l.o(lVar);
            return f0.f21461a;
        }
    }

    public static final class b extends s implements eh.a<f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l<T> f14158a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(l<T> lVar) {
            super(0);
            this.f14158a = lVar;
        }

        @Override // eh.a
        public final f0 invoke() {
            l<T> lVar = this.f14158a;
            lVar.getResetBlock().invoke(lVar.D);
            return f0.f21461a;
        }
    }

    public static final class c extends s implements eh.a<f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l<T> f14159a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(l<T> lVar) {
            super(0);
            this.f14159a = lVar;
        }

        @Override // eh.a
        public final f0 invoke() {
            l<T> lVar = this.f14159a;
            lVar.getUpdateBlock().invoke(lVar.D);
            return f0.f21461a;
        }
    }

    public l(Context context, eh.l<? super Context, ? extends T> lVar, x0.s sVar, g1.i iVar, int i10, v1 v1Var) {
        T tInvoke = lVar.invoke(context);
        b2.b bVar = new b2.b();
        super(context, sVar, i10, bVar, tInvoke, v1Var);
        this.D = tInvoke;
        this.E = bVar;
        this.F = iVar;
        setClipChildren(false);
        String strValueOf = String.valueOf(i10);
        Object objC = iVar != null ? iVar.c(strValueOf) : null;
        SparseArray<Parcelable> sparseArray = objC instanceof SparseArray ? (SparseArray) objC : null;
        if (sparseArray != null) {
            tInvoke.restoreHierarchyState(sparseArray);
        }
        if (iVar != null) {
            setSavableRegistryEntry(iVar.d(strValueOf, new t(this, 1)));
        }
        a.C0019a c0019a = androidx.compose.ui.viewinterop.a.f1379a;
        this.H = c0019a;
        this.I = c0019a;
        this.K = c0019a;
    }

    public static final void o(l lVar) {
        lVar.setSavableRegistryEntry(null);
    }

    private final void setSavableRegistryEntry(i.a aVar) {
        i.a aVar2 = this.G;
        if (aVar2 != null) {
            aVar2.a();
        }
        this.G = aVar;
    }

    public final b2.b getDispatcher() {
        return this.E;
    }

    public final eh.l<T, f0> getReleaseBlock() {
        return this.K;
    }

    public final eh.l<T, f0> getResetBlock() {
        return this.I;
    }

    public /* bridge */ /* synthetic */ j2.a getSubCompositionView() {
        return null;
    }

    public final eh.l<T, f0> getUpdateBlock() {
        return this.H;
    }

    public View getViewRoot() {
        return this;
    }

    public final void setReleaseBlock(eh.l<? super T, f0> lVar) {
        this.K = lVar;
        setRelease(new a(this));
    }

    public final void setResetBlock(eh.l<? super T, f0> lVar) {
        this.I = lVar;
        setReset(new b(this));
    }

    public final void setUpdateBlock(eh.l<? super T, f0> lVar) {
        this.H = lVar;
        setUpdate(new c(this));
    }
}
