package androidx.compose.ui.platform;

import androidx.compose.ui.platform.AndroidComposeView;
import androidx.lifecycle.l;
import androidx.lifecycle.t;
import com.basitce.htmltoapk.R;
import eh.p;
import j2.h2;
import kotlin.jvm.internal.s;
import pg.f0;
import x0.j;
import x0.r;
import x0.v;

/* loaded from: classes.dex */
public final class i implements r, androidx.lifecycle.r {

    /* renamed from: a, reason: collision with root package name */
    public final AndroidComposeView f1366a;

    /* renamed from: b, reason: collision with root package name */
    public final v f1367b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1368c;

    /* renamed from: d, reason: collision with root package name */
    public l f1369d;

    /* renamed from: e, reason: collision with root package name */
    public p<? super j, ? super Integer, f0> f1370e = h2.f14743a;

    public static final class a extends s implements eh.l<AndroidComposeView.b, f0> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p<j, Integer, f0> f1372b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(p<? super j, ? super Integer, f0> pVar) {
            super(1);
            this.f1372b = pVar;
        }

        @Override // eh.l
        public final f0 invoke(AndroidComposeView.b bVar) {
            AndroidComposeView.b bVar2 = bVar;
            i iVar = i.this;
            if (!iVar.f1368c) {
                l lifecycle = bVar2.f1262a.getLifecycle();
                p<j, Integer, f0> pVar = this.f1372b;
                iVar.f1370e = pVar;
                if (iVar.f1369d == null) {
                    iVar.f1369d = lifecycle;
                    lifecycle.a(iVar);
                } else if (lifecycle.b().compareTo(l.b.f2321c) >= 0) {
                    iVar.f1367b.d(new f1.b(-2000640158, true, new h(iVar, pVar)));
                }
            }
            return f0.f21461a;
        }
    }

    public i(AndroidComposeView androidComposeView, v vVar) {
        this.f1366a = androidComposeView;
        this.f1367b = vVar;
    }

    @Override // x0.r
    public final void a() {
        if (!this.f1368c) {
            this.f1368c = true;
            this.f1366a.getView().setTag(R.id.wrapped_composition_tag, null);
            l lVar = this.f1369d;
            if (lVar != null) {
                lVar.c(this);
            }
        }
        this.f1367b.a();
    }

    @Override // x0.r
    public final void d(p<? super j, ? super Integer, f0> pVar) {
        this.f1366a.setOnViewTreeOwnersAvailable(new a(pVar));
    }

    @Override // androidx.lifecycle.r
    public final void l(t tVar, l.a aVar) {
        if (aVar == l.a.ON_DESTROY) {
            a();
        } else {
            if (aVar != l.a.ON_CREATE || this.f1368c) {
                return;
            }
            d(this.f1370e);
        }
    }
}
