package b9;

import android.webkit.WebView;
import androidx.lifecycle.l;
import b9.p3;
import java.util.List;
import u8.y;

/* loaded from: classes.dex */
public final /* synthetic */ class j3 implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3911a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3912b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3913c;

    public /* synthetic */ j3(int i10, Object obj, Object obj2) {
        this.f3911a = i10;
        this.f3912b = obj;
        this.f3913c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [androidx.lifecycle.s, b9.m3] */
    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f3911a) {
            case 0:
                androidx.lifecycle.t tVar = (androidx.lifecycle.t) this.f3912b;
                final x0.n1 n1Var = (x0.n1) this.f3913c;
                x0.l0 DisposableEffect = (x0.l0) obj;
                kotlin.jvm.internal.r.e(DisposableEffect, "$this$DisposableEffect");
                ?? r82 = new androidx.lifecycle.r() { // from class: b9.m3
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // androidx.lifecycle.r
                    public final void l(androidx.lifecycle.t tVar2, l.a aVar) {
                        WebView webView;
                        int i10 = p3.h.f4061a[aVar.ordinal()];
                        x0.n1 n1Var2 = n1Var;
                        if (i10 != 1) {
                            if (i10 == 2 && (webView = (WebView) n1Var2.getValue()) != null) {
                                webView.resumeTimers();
                                webView.onResume();
                                return;
                            }
                            return;
                        }
                        WebView webView2 = (WebView) n1Var2.getValue();
                        if (webView2 != null) {
                            webView2.onPause();
                            webView2.pauseTimers();
                        }
                    }
                };
                tVar.getLifecycle().a(r82);
                return new p3.g(tVar, r82, n1Var);
            default:
                k8.i iVar = (k8.i) this.f3912b;
                u8.d1 d1Var = (u8.d1) this.f3913c;
                b0.j0 LazyColumn = (b0.j0) obj;
                kotlin.jvm.internal.r.e(LazyColumn, "$this$LazyColumn");
                List<k8.a> list = k8.e.f16084c;
                LazyColumn.d(list.size(), new y.c(new u8.q(), list), new y.d(y.b.f29547a, list), new f1.b(-632812321, true, new y.e(list, iVar, d1Var)));
                return pg.f0.f21461a;
        }
    }
}
