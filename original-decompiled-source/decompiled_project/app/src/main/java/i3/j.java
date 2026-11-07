package i3;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.compose.ui.d;
import androidx.compose.ui.focus.FocusTargetNode;
import i2.m;
import i2.v1;
import kotlin.jvm.internal.s;
import o1.a0;
import o1.q;
import o1.w;
import pg.f0;

/* loaded from: classes.dex */
public final class j extends d.c implements a0, ViewTreeObserver.OnGlobalFocusChangeListener {

    /* renamed from: q, reason: collision with root package name */
    public View f14151q;

    /* renamed from: r, reason: collision with root package name */
    public ViewTreeObserver f14152r;

    /* renamed from: s, reason: collision with root package name */
    public final a f14153s = new a();

    /* renamed from: t, reason: collision with root package name */
    public final b f14154t = new b();

    public static final class a extends s implements eh.l<o1.f, f0> {
        public a() {
            super(1);
        }

        @Override // eh.l
        public final f0 invoke(o1.f fVar) {
            o1.f fVar2 = fVar;
            j jVar = j.this;
            View viewC = i.c(jVar);
            if (!viewC.isFocused() && !viewC.hasFocus()) {
                if (!o1.j.d(viewC, o1.j.e(fVar2.a()), i.b(i2.k.g(jVar).getFocusOwner(), i2.l.a(jVar), viewC))) {
                    fVar2.b();
                }
            }
            return f0.f21461a;
        }
    }

    public static final class b extends s implements eh.l<o1.f, f0> {
        public b() {
            super(1);
        }

        @Override // eh.l
        public final f0 invoke(o1.f fVar) {
            o1.f fVar2 = fVar;
            j jVar = j.this;
            View viewC = i.c(jVar);
            if (viewC.hasFocus()) {
                q focusOwner = i2.k.g(jVar).getFocusOwner();
                View viewA = i2.l.a(jVar);
                if (viewC instanceof ViewGroup) {
                    Rect rectB = i.b(focusOwner, viewA, viewC);
                    Integer numE = o1.j.e(fVar2.a());
                    int iIntValue = numE != null ? numE.intValue() : 130;
                    FocusFinder focusFinder = FocusFinder.getInstance();
                    View view = jVar.f14151q;
                    View viewFindNextFocus = view != null ? focusFinder.findNextFocus((ViewGroup) viewA, view, iIntValue) : focusFinder.findNextFocusFromRect((ViewGroup) viewA, rectB, iIntValue);
                    if (viewFindNextFocus != null && i.a(viewC, viewFindNextFocus)) {
                        viewFindNextFocus.requestFocus(iIntValue, rectB);
                        fVar2.b();
                    } else if (!viewA.requestFocus()) {
                        throw new IllegalStateException("host view did not take focus");
                    }
                } else if (!viewA.requestFocus()) {
                    throw new IllegalStateException("host view did not take focus");
                }
            }
            return f0.f21461a;
        }
    }

    @Override // androidx.compose.ui.d.c
    public final void L1() {
        ViewTreeObserver viewTreeObserver = i2.l.a(this).getViewTreeObserver();
        this.f14152r = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    @Override // androidx.compose.ui.d.c
    public final void M1() {
        ViewTreeObserver viewTreeObserver = this.f14152r;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.f14152r = null;
        i2.l.a(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
        this.f14151q = null;
    }

    public final FocusTargetNode T1() {
        if (!this.f1144a.f1157p) {
            f2.a.b("visitLocalDescendants called on an unattached node");
        }
        d.c cVar = this.f1144a;
        if ((cVar.f1147d & 1024) != 0) {
            boolean z10 = false;
            for (d.c cVar2 = cVar.f1149f; cVar2 != null; cVar2 = cVar2.f1149f) {
                if ((cVar2.f1146c & 1024) != 0) {
                    d.c cVarB = cVar2;
                    z0.b bVar = null;
                    while (cVarB != null) {
                        if (cVarB instanceof FocusTargetNode) {
                            FocusTargetNode focusTargetNode = (FocusTargetNode) cVarB;
                            if (z10) {
                                return focusTargetNode;
                            }
                            z10 = true;
                        } else if ((cVarB.f1146c & 1024) != 0 && (cVarB instanceof m)) {
                            int i10 = 0;
                            for (d.c cVar3 = ((m) cVarB).f13947r; cVar3 != null; cVar3 = cVar3.f1149f) {
                                if ((cVar3.f1146c & 1024) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        cVarB = cVar3;
                                    } else {
                                        if (bVar == null) {
                                            bVar = new z0.b(new d.c[16]);
                                        }
                                        if (cVarB != null) {
                                            bVar.b(cVarB);
                                            cVarB = null;
                                        }
                                        bVar.b(cVar3);
                                    }
                                }
                            }
                            if (i10 == 1) {
                            }
                        }
                        cVarB = i2.k.b(bVar);
                    }
                }
            }
        }
        throw new IllegalStateException("Could not find focus target of embedded view wrapper");
    }

    @Override // o1.a0
    public final void Y0(w wVar) {
        wVar.d(false);
        wVar.c(this.f14153s);
        wVar.b(this.f14154t);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        if (i2.k.f(this).f13822p == null) {
            return;
        }
        View viewC = i.c(this);
        q focusOwner = i2.k.g(this).getFocusOwner();
        v1 v1VarG = i2.k.g(this);
        boolean z10 = (view == null || view.equals(v1VarG) || !i.a(viewC, view)) ? false : true;
        boolean z11 = (view2 == null || view2.equals(v1VarG) || !i.a(viewC, view2)) ? false : true;
        if (z10 && z11) {
            this.f14151q = view2;
            return;
        }
        if (z11) {
            this.f14151q = view2;
            FocusTargetNode focusTargetNodeT1 = T1();
            if (focusTargetNodeT1.Y().a()) {
                return;
            }
            f3.a.g(focusTargetNodeT1);
            return;
        }
        if (!z10) {
            this.f14151q = null;
            return;
        }
        this.f14151q = null;
        if (T1().Y().b()) {
            focusOwner.l(8, false, false);
        }
    }
}
