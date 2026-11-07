package f9;

import android.content.Context;
import android.view.View;
import com.basitce.htmltoapk.R;
import java.util.List;
import x0.j;

/* loaded from: classes.dex */
public final class y2 implements eh.p<x0.j, Integer, pg.f0> {
    public final /* synthetic */ x0.k1 A;
    public final /* synthetic */ x0.n1<Boolean> B;
    public final /* synthetic */ eh.a<pg.f0> C;
    public final /* synthetic */ x0.n1<y2.c0> D;
    public final /* synthetic */ x0.n1<String> E;
    public final /* synthetic */ x0.n1<j> F;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f10970a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f10971b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f10972c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f10973d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f10974e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fg f10975f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Context f10976g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ View f10977h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f10978j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f10979k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ x0.n1<String> f10980l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f10981m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f10982n;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f10983p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f10984q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f10985r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f10986s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f10987t;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f10988v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ph.i0 f10989w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f10990x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f10991y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f10992z;

    public y2(String str, boolean z10, boolean z11, long j10, x0.n1 n1Var, fg fgVar, Context context, View view, eh.a aVar, x0.n1 n1Var2, x0.n1 n1Var3, x0.n1 n1Var4, x0.n1 n1Var5, x0.n1 n1Var6, x0.n1 n1Var7, x0.n1 n1Var8, eh.a aVar2, boolean z12, x0.n1 n1Var9, ph.i0 i0Var, x0.n1 n1Var10, x0.n1 n1Var11, x0.n1 n1Var12, x0.k1 k1Var, x0.n1 n1Var13, eh.a aVar3, x0.n1 n1Var14, x0.n1 n1Var15, x0.n1 n1Var16) {
        this.f10970a = str;
        this.f10971b = z10;
        this.f10972c = z11;
        this.f10973d = j10;
        this.f10974e = n1Var;
        this.f10975f = fgVar;
        this.f10976g = context;
        this.f10977h = view;
        this.f10978j = aVar;
        this.f10979k = n1Var2;
        this.f10980l = n1Var3;
        this.f10981m = n1Var4;
        this.f10982n = n1Var5;
        this.f10983p = n1Var6;
        this.f10984q = n1Var7;
        this.f10985r = n1Var8;
        this.f10986s = aVar2;
        this.f10987t = z12;
        this.f10988v = n1Var9;
        this.f10989w = i0Var;
        this.f10990x = n1Var10;
        this.f10991y = n1Var11;
        this.f10992z = n1Var12;
        this.A = k1Var;
        this.B = n1Var13;
        this.C = aVar3;
        this.D = n1Var14;
        this.E = n1Var15;
        this.F = n1Var16;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.n1<Boolean> n1Var;
        String str;
        boolean z10;
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            jVar2.L(294112220);
            String strC = this.f10970a;
            if (mh.x.A(strC)) {
                strC = f3.q.c(R.string.editor_button_edit_html, jVar2);
            }
            jVar2.B();
            x0.n1<Boolean> n1Var2 = this.f10979k;
            boolean zBooleanValue = n1Var2.getValue().booleanValue();
            boolean z11 = this.f10971b;
            String strB = zBooleanValue ? com.google.crypto.tink.shaded.protobuf.t0.b(jVar2, 294116332, R.string.editor_html_loading, jVar2) : this.f10980l.getValue() != null ? com.google.crypto.tink.shaded.protobuf.t0.b(jVar2, 294119088, R.string.editor_button_edit_html, jVar2) : z11 ? com.google.crypto.tink.shaded.protobuf.t0.b(jVar2, 294121972, R.string.editor_html_unsaved_changes, jVar2) : com.google.crypto.tink.shaded.protobuf.t0.b(jVar2, 294124558, R.string.editor_html_all_saved, jVar2);
            boolean z12 = this.f10972c;
            boolean z13 = true;
            if (z12 && z11) {
                n1Var = n1Var2;
                str = strB;
                z10 = true;
            } else {
                n1Var = n1Var2;
                str = strB;
                z10 = false;
            }
            if (!n1Var.getValue().booleanValue() && !d1.n(this.f10981m) && !this.f10982n.getValue().booleanValue()) {
                z13 = false;
            }
            jVar2.L(294132336);
            boolean zC = jVar2.c(z12) | jVar2.c(z11) | jVar2.K(this.f10974e) | jVar2.l(this.f10975f) | jVar2.l(this.f10976g) | jVar2.l(this.f10977h) | jVar2.K(this.f10978j);
            Object objG = jVar2.g();
            if (zC || objG == j.a.f31715a) {
                final boolean z14 = this.f10972c;
                final boolean z15 = this.f10971b;
                final x0.n1<Boolean> n1Var3 = this.f10974e;
                final fg fgVar = this.f10975f;
                final eh.a<pg.f0> aVar = this.f10978j;
                final x0.n1<Boolean> n1Var4 = this.f10983p;
                final Context context = this.f10976g;
                final View view = this.f10977h;
                eh.a aVar2 = new eh.a() { // from class: f9.k2
                    @Override // eh.a
                    public final Object invoke() {
                        List<String> list = d1.f9265a;
                        if (z14 && z15) {
                            d1.o(n1Var3, true);
                        } else {
                            d1.j(fgVar, aVar, n1Var4, context, view);
                        }
                        return pg.f0.f21461a;
                    }
                };
                jVar2.C(aVar2);
                objG = aVar2;
            }
            jVar2.B();
            d1.g(strC, str, z10, this.f10973d, z13, (eh.a) objG, f1.c.b(-1216895943, new x2(this.f10984q, this.f10985r, this.f10972c, this.f10986s, this.f10970a, this.f10976g, this.f10975f, this.f10987t, this.f10977h, this.f10988v, this.f10989w, this.f10971b, this.f10973d, this.f10990x, this.f10991y, this.f10992z, this.A, this.B, this.C, this.D, this.f10981m, this.E, this.F), jVar2), jVar2, 1572864);
        }
        return pg.f0.f21461a;
    }
}
