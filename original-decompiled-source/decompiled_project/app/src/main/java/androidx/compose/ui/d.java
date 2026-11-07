package androidx.compose.ui;

import c2.f;
import eh.l;
import eh.p;
import i2.g1;
import i2.j;
import i2.k;
import i2.q1;
import j1.g;
import ph.i0;
import ph.j0;
import ph.s1;
import ph.u1;

/* loaded from: classes.dex */
public interface d {

    public static final class a implements d {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ a f1143b = new a();

        @Override // androidx.compose.ui.d
        public final <R> R c(R r10, p<? super R, ? super b, ? extends R> pVar) {
            return r10;
        }

        @Override // androidx.compose.ui.d
        public final boolean d(l<? super b, Boolean> lVar) {
            return true;
        }

        @Override // androidx.compose.ui.d
        public final d h(d dVar) {
            return dVar;
        }

        public final String toString() {
            return "Modifier";
        }
    }

    public interface b extends d {
        @Override // androidx.compose.ui.d
        default <R> R c(R r10, p<? super R, ? super b, ? extends R> pVar) {
            return pVar.invoke(r10, this);
        }

        @Override // androidx.compose.ui.d
        default boolean d(l<? super b, Boolean> lVar) {
            return lVar.invoke(this).booleanValue();
        }
    }

    public static abstract class c implements j {

        /* renamed from: b, reason: collision with root package name */
        public uh.c f1145b;

        /* renamed from: c, reason: collision with root package name */
        public int f1146c;

        /* renamed from: e, reason: collision with root package name */
        public c f1148e;

        /* renamed from: f, reason: collision with root package name */
        public c f1149f;

        /* renamed from: g, reason: collision with root package name */
        public q1 f1150g;

        /* renamed from: h, reason: collision with root package name */
        public g1 f1151h;

        /* renamed from: j, reason: collision with root package name */
        public boolean f1152j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f1153k;

        /* renamed from: l, reason: collision with root package name */
        public boolean f1154l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f1155m;

        /* renamed from: n, reason: collision with root package name */
        public f.a f1156n;

        /* renamed from: p, reason: collision with root package name */
        public boolean f1157p;

        /* renamed from: a, reason: collision with root package name */
        public c f1144a = this;

        /* renamed from: d, reason: collision with root package name */
        public int f1147d = -1;

        @Override // i2.j
        public final c B() {
            return this.f1144a;
        }

        public final i0 H1() {
            uh.c cVar = this.f1145b;
            if (cVar != null) {
                return cVar;
            }
            uh.c cVarA = j0.a(k.g(this).getCoroutineContext().plus(new u1((s1) k.g(this).getCoroutineContext().get(s1.a.f21589a))));
            this.f1145b = cVarA;
            return cVarA;
        }

        public boolean I1() {
            return !(this instanceof t.j0);
        }

        public void J1() {
            if (this.f1157p) {
                f2.a.b("node attached multiple times");
            }
            if (this.f1151h == null) {
                f2.a.b("attach invoked on a node without a coordinator");
            }
            this.f1157p = true;
            this.f1154l = true;
        }

        public void K1() {
            if (!this.f1157p) {
                f2.a.b("Cannot detach a node that is not attached");
            }
            if (this.f1154l) {
                f2.a.b("Must run runAttachLifecycle() before markAsDetached()");
            }
            if (this.f1155m) {
                f2.a.b("Must run runDetachLifecycle() before markAsDetached()");
            }
            this.f1157p = false;
            uh.c cVar = this.f1145b;
            if (cVar != null) {
                j0.b(cVar, new g("The Modifier.Node was detached"));
                this.f1145b = null;
            }
        }

        public void L1() {
        }

        public void M1() {
        }

        public void N1() {
        }

        public void O1() {
            if (!this.f1157p) {
                f2.a.b("reset() called on an unattached node");
            }
            N1();
        }

        public void P1() {
            if (!this.f1157p) {
                f2.a.b("Must run markAsAttached() prior to runAttachLifecycle");
            }
            if (!this.f1154l) {
                f2.a.b("Must run runAttachLifecycle() only once after markAsAttached()");
            }
            this.f1154l = false;
            L1();
            this.f1155m = true;
        }

        public void Q1() {
            if (!this.f1157p) {
                f2.a.b("node detached multiple times");
            }
            if (this.f1151h == null) {
                f2.a.b("detach invoked on a node without a coordinator");
            }
            if (!this.f1155m) {
                f2.a.b("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
            }
            this.f1155m = false;
            f.a aVar = this.f1156n;
            if (aVar != null) {
                aVar.invoke();
            }
            M1();
        }

        public void R1(c cVar) {
            this.f1144a = cVar;
        }

        public void S1(g1 g1Var) {
            this.f1151h = g1Var;
        }
    }

    <R> R c(R r10, p<? super R, ? super b, ? extends R> pVar);

    boolean d(l<? super b, Boolean> lVar);

    default d h(d dVar) {
        return dVar == a.f1143b ? this : new androidx.compose.ui.a(this, dVar);
    }
}
