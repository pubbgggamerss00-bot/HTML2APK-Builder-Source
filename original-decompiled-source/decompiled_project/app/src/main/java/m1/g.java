package m1;

import androidx.compose.ui.d;
import eh.l;
import f3.o;
import i2.a0;
import i2.k;
import i2.n2;
import i2.o2;
import i2.p2;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class g extends d.c implements o2, i, a0 {

    /* renamed from: q, reason: collision with root package name */
    public final e f17622q;

    /* renamed from: r, reason: collision with root package name */
    public g f17623r;

    /* renamed from: s, reason: collision with root package name */
    public i f17624s;

    /* renamed from: t, reason: collision with root package name */
    public long f17625t;

    public static final class a extends s implements l<g, n2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f17626a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c cVar) {
            super(1);
            this.f17626a = cVar;
        }

        @Override // eh.l
        public final n2 invoke(g gVar) {
            g gVar2 = gVar;
            if (!gVar2.f1144a.f1157p) {
                return n2.f13964b;
            }
            i iVar = gVar2.f17624s;
            if (iVar != null) {
                iVar.l0(this.f17626a);
            }
            gVar2.f17624s = null;
            gVar2.f17623r = null;
            return n2.f13963a;
        }
    }

    public static final class b extends s implements l<g, n2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g0 f17627a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f17628b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c f17629c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(g0 g0Var, g gVar, c cVar) {
            super(1);
            this.f17627a = g0Var;
            this.f17628b = gVar;
            this.f17629c = cVar;
        }

        /* JADX WARN: Type inference failed for: r4v1, types: [T, i2.o2] */
        @Override // eh.l
        public final n2 invoke(g gVar) {
            g gVar2 = gVar;
            g gVar3 = gVar2;
            if (!k.g(this.f17628b).getDragAndDropManager().a(gVar3) || !h.a(gVar3, o.b(this.f17629c))) {
                return n2.f13963a;
            }
            this.f17627a.f16327a = gVar2;
            return n2.f13965c;
        }
    }

    public g() {
        this(null);
    }

    @Override // i2.o2
    public final Object L() {
        return this.f17622q;
    }

    @Override // m1.i
    public final void L0(c cVar) {
        i iVar = this.f17624s;
        if (iVar != null) {
            iVar.L0(cVar);
            return;
        }
        g gVar = this.f17623r;
        if (gVar != null) {
            gVar.L0(cVar);
        }
    }

    @Override // androidx.compose.ui.d.c
    public final void M1() {
        this.f17624s = null;
        this.f17623r = null;
    }

    @Override // i2.a0
    public final void O(long j10) {
        this.f17625t = j10;
    }

    @Override // m1.i
    public final void V(c cVar) {
        i iVar = this.f17624s;
        if (iVar != null) {
            iVar.V(cVar);
            return;
        }
        g gVar = this.f17623r;
        if (gVar != null) {
            gVar.V(cVar);
        }
    }

    @Override // m1.i
    public final void a0(c cVar) {
        i iVar = this.f17624s;
        if (iVar != null) {
            iVar.a0(cVar);
        }
        g gVar = this.f17623r;
        if (gVar != null) {
            gVar.a0(cVar);
        }
        this.f17623r = null;
    }

    @Override // m1.i
    public final void b0(c cVar) {
        o2 o2Var;
        g gVar;
        g gVar2 = this.f17623r;
        if (gVar2 == null || !h.a(gVar2, o.b(cVar))) {
            if (this.f1144a.f1157p) {
                g0 g0Var = new g0();
                p2.c(this, new b(g0Var, this, cVar));
                o2Var = (o2) g0Var.f16327a;
            } else {
                o2Var = null;
            }
            gVar = (g) o2Var;
        } else {
            gVar = gVar2;
        }
        if (gVar != null && gVar2 == null) {
            gVar.L0(cVar);
            gVar.b0(cVar);
            i iVar = this.f17624s;
            if (iVar != null) {
                iVar.a0(cVar);
            }
        } else if (gVar == null && gVar2 != null) {
            i iVar2 = this.f17624s;
            if (iVar2 != null) {
                iVar2.L0(cVar);
                iVar2.b0(cVar);
            }
            gVar2.a0(cVar);
        } else if (!r.a(gVar, gVar2)) {
            if (gVar != null) {
                gVar.L0(cVar);
                gVar.b0(cVar);
            }
            if (gVar2 != null) {
                gVar2.a0(cVar);
            }
        } else if (gVar != null) {
            gVar.b0(cVar);
        } else {
            i iVar3 = this.f17624s;
            if (iVar3 != null) {
                iVar3.b0(cVar);
            }
        }
        this.f17623r = gVar;
    }

    @Override // m1.i
    public final void l0(c cVar) {
        a aVar = new a(cVar);
        if (aVar.invoke(this) != n2.f13963a) {
            return;
        }
        p2.c(this, aVar);
    }

    @Override // m1.i
    public final boolean s1(c cVar) {
        g gVar = this.f17623r;
        if (gVar != null) {
            return gVar.s1(cVar);
        }
        i iVar = this.f17624s;
        if (iVar != null) {
            return iVar.s1(cVar);
        }
        return false;
    }

    public g(Object obj) {
        this.f17622q = e.f17620a;
        this.f17625t = 0L;
    }
}
