package i3;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.lifecycle.c1;
import androidx.lifecycle.t;
import com.basitce.htmltoapk.R;
import com.yalantis.ucrop.view.CropImageView;
import g2.g1;
import g2.k0;
import g2.l0;
import g2.o0;
import g2.v;
import i2.e0;
import i2.f2;
import i2.p2;
import i2.v1;
import i2.w;
import i2.w1;
import j2.a6;
import j2.n3;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.r;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import pg.f0;
import ph.i0;
import ph.m0;
import q1.c0;
import q1.w0;
import q2.d0;
import qg.a0;
import y3.i1;
import y3.q0;
import y3.s;
import y3.u;
import y3.x0;

/* loaded from: classes.dex */
public class b extends ViewGroup implements s, x0.h, w1, u {
    public static final C0129b C = C0129b.f14108a;
    public boolean A;
    public final e0 B;

    /* renamed from: a, reason: collision with root package name */
    public final b2.b f14084a;

    /* renamed from: b, reason: collision with root package name */
    public final View f14085b;

    /* renamed from: c, reason: collision with root package name */
    public final v1 f14086c;

    /* renamed from: d, reason: collision with root package name */
    public eh.a<f0> f14087d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f14088e;

    /* renamed from: f, reason: collision with root package name */
    public eh.a<f0> f14089f;

    /* renamed from: g, reason: collision with root package name */
    public eh.a<f0> f14090g;

    /* renamed from: h, reason: collision with root package name */
    public androidx.compose.ui.d f14091h;

    /* renamed from: j, reason: collision with root package name */
    public eh.l<? super androidx.compose.ui.d, f0> f14092j;

    /* renamed from: k, reason: collision with root package name */
    public f3.d f14093k;

    /* renamed from: l, reason: collision with root package name */
    public eh.l<? super f3.d, f0> f14094l;

    /* renamed from: m, reason: collision with root package name */
    public t f14095m;

    /* renamed from: n, reason: collision with root package name */
    public c6.e f14096n;

    /* renamed from: p, reason: collision with root package name */
    public final int[] f14097p;

    /* renamed from: q, reason: collision with root package name */
    public long f14098q;

    /* renamed from: r, reason: collision with root package name */
    public i1 f14099r;

    /* renamed from: s, reason: collision with root package name */
    public final p f14100s;

    /* renamed from: t, reason: collision with root package name */
    public final o f14101t;

    /* renamed from: v, reason: collision with root package name */
    public eh.l<? super Boolean, f0> f14102v;

    /* renamed from: w, reason: collision with root package name */
    public final int[] f14103w;

    /* renamed from: x, reason: collision with root package name */
    public int f14104x;

    /* renamed from: y, reason: collision with root package name */
    public int f14105y;

    /* renamed from: z, reason: collision with root package name */
    public final y3.t f14106z;

    public static final class a extends x0.b {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i3.l f14107c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i3.l lVar) {
            super(1);
            this.f14107c = lVar;
        }

        @Override // y3.x0.b
        public final i1 d(i1 i1Var, List<x0> list) {
            return this.f14107c.n(i1Var);
        }

        @Override // y3.x0.b
        public final x0.a e(x0.a aVar) {
            w wVar = this.f14107c.B.I.f13790b;
            if (wVar.V.f1157p) {
                long jD = m0.d(wVar.Y(0L));
                int i10 = (int) (jD >> 32);
                if (i10 < 0) {
                    i10 = 0;
                }
                int i11 = (int) (jD & BodyPartID.bodyIdMax);
                if (i11 < 0) {
                    i11 = 0;
                }
                long jA = g2.w.c(wVar).a();
                int i12 = (int) (jA >> 32);
                int i13 = (int) (jA & BodyPartID.bodyIdMax);
                long j10 = wVar.f11384c;
                long jD2 = m0.d(wVar.Y((Float.floatToRawIntBits((int) (j10 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j10 & BodyPartID.bodyIdMax)) & BodyPartID.bodyIdMax)));
                int i14 = i12 - ((int) (jD2 >> 32));
                if (i14 < 0) {
                    i14 = 0;
                }
                int i15 = i13 - ((int) (BodyPartID.bodyIdMax & jD2));
                int i16 = i15 >= 0 ? i15 : 0;
                if (i10 != 0 || i11 != 0 || i14 != 0 || i16 != 0) {
                    return new x0.a(b.m(aVar.f33905a, i10, i11, i14, i16), b.m(aVar.f33906b, i10, i11, i14, i16));
                }
            }
            return aVar;
        }
    }

    /* renamed from: i3.b$b, reason: collision with other inner class name */
    public static final class C0129b extends kotlin.jvm.internal.s implements eh.l<b, f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final C0129b f14108a = new C0129b(1);

        @Override // eh.l
        public final f0 invoke(b bVar) {
            b bVar2 = bVar;
            Handler handler = bVar2.getHandler();
            final p pVar = bVar2.f14100s;
            handler.post(new Runnable() { // from class: i3.c
                @Override // java.lang.Runnable
                public final void run() {
                    pVar.invoke();
                }
            });
            return f0.f21461a;
        }
    }

    public static final class c extends kotlin.jvm.internal.s implements eh.l<androidx.compose.ui.d, f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e0 f14109a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.d f14110b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e0 e0Var, androidx.compose.ui.d dVar) {
            super(1);
            this.f14109a = e0Var;
            this.f14110b = dVar;
        }

        @Override // eh.l
        public final f0 invoke(androidx.compose.ui.d dVar) {
            this.f14109a.c(dVar.h(this.f14110b));
            return f0.f21461a;
        }
    }

    public static final class d extends kotlin.jvm.internal.s implements eh.l<f3.d, f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e0 f14111a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(e0 e0Var) {
            super(1);
            this.f14111a = e0Var;
        }

        @Override // eh.l
        public final f0 invoke(f3.d dVar) {
            this.f14111a.i0(dVar);
            return f0.f21461a;
        }
    }

    public static final class e extends kotlin.jvm.internal.s implements eh.l<v1, f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i3.l f14112a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e0 f14113b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(i3.l lVar, e0 e0Var) {
            super(1);
            this.f14112a = lVar;
            this.f14113b = e0Var;
        }

        @Override // eh.l
        public final f0 invoke(v1 v1Var) {
            v1 v1Var2 = v1Var;
            AndroidComposeView androidComposeView = v1Var2 instanceof AndroidComposeView ? (AndroidComposeView) v1Var2 : null;
            i3.l lVar = this.f14112a;
            if (androidComposeView != null) {
                HashMap<b, e0> holderToLayoutNode = androidComposeView.getAndroidViewsHandler$ui_release().getHolderToLayoutNode();
                e0 e0Var = this.f14113b;
                holderToLayoutNode.put(lVar, e0Var);
                androidComposeView.getAndroidViewsHandler$ui_release().addView(lVar);
                androidComposeView.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().put(e0Var, lVar);
                lVar.setImportantForAccessibility(1);
                q0.h(lVar, new j2.q(androidComposeView, e0Var, androidComposeView));
            }
            if (lVar.getView().getParent() != lVar) {
                lVar.addView(lVar.getView());
            }
            return f0.f21461a;
        }
    }

    public static final class f extends kotlin.jvm.internal.s implements eh.l<v1, f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i3.l f14114a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(i3.l lVar) {
            super(1);
            this.f14114a = lVar;
        }

        @Override // eh.l
        public final f0 invoke(v1 v1Var) {
            v1 v1Var2 = v1Var;
            AndroidComposeView androidComposeView = v1Var2 instanceof AndroidComposeView ? (AndroidComposeView) v1Var2 : null;
            i3.l lVar = this.f14114a;
            if (androidComposeView != null) {
                androidComposeView.d(new e0.j(1, androidComposeView, lVar));
            }
            lVar.removeAllViewsInLayout();
            return f0.f21461a;
        }
    }

    public static final class g implements l0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i3.l f14115a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e0 f14116b;

        public static final class a extends kotlin.jvm.internal.s implements eh.l<g1.a, f0> {

            /* renamed from: a, reason: collision with root package name */
            public static final a f14117a = new a(1);

            @Override // eh.l
            public final /* bridge */ /* synthetic */ f0 invoke(g1.a aVar) {
                return f0.f21461a;
            }
        }

        /* renamed from: i3.b$g$b, reason: collision with other inner class name */
        public static final class C0130b extends kotlin.jvm.internal.s implements eh.l<g1.a, f0> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ i3.l f14118a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e0 f14119b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0130b(i3.l lVar, e0 e0Var) {
                super(1);
                this.f14118a = lVar;
                this.f14119b = e0Var;
            }

            @Override // eh.l
            public final f0 invoke(g1.a aVar) {
                i3.d.a(this.f14118a, this.f14119b);
                return f0.f21461a;
            }
        }

        public g(i3.l lVar, e0 e0Var) {
            this.f14115a = lVar;
            this.f14116b = e0Var;
        }

        @Override // g2.l0
        public final int c(g2.q qVar, List<? extends g2.p> list, int i10) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            i3.l lVar = this.f14115a;
            ViewGroup.LayoutParams layoutParams = lVar.getLayoutParams();
            r.b(layoutParams);
            lVar.measure(iMakeMeasureSpec, b.l(lVar, 0, i10, layoutParams.height));
            return lVar.getMeasuredWidth();
        }

        @Override // g2.l0
        public final int f(g2.q qVar, List<? extends g2.p> list, int i10) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            i3.l lVar = this.f14115a;
            ViewGroup.LayoutParams layoutParams = lVar.getLayoutParams();
            r.b(layoutParams);
            lVar.measure(iMakeMeasureSpec, b.l(lVar, 0, i10, layoutParams.height));
            return lVar.getMeasuredWidth();
        }

        @Override // g2.l0
        public final int g(g2.q qVar, List<? extends g2.p> list, int i10) {
            i3.l lVar = this.f14115a;
            ViewGroup.LayoutParams layoutParams = lVar.getLayoutParams();
            r.b(layoutParams);
            lVar.measure(b.l(lVar, 0, i10, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
            return lVar.getMeasuredHeight();
        }

        @Override // g2.l0
        public final g2.m0 h(o0 o0Var, List<? extends k0> list, long j10) {
            i3.l lVar = this.f14115a;
            int childCount = lVar.getChildCount();
            a0 a0Var = a0.f22708a;
            if (childCount == 0) {
                return o0Var.i0(f3.b.k(j10), f3.b.j(j10), a0Var, a.f14117a);
            }
            if (f3.b.k(j10) != 0) {
                lVar.getChildAt(0).setMinimumWidth(f3.b.k(j10));
            }
            if (f3.b.j(j10) != 0) {
                lVar.getChildAt(0).setMinimumHeight(f3.b.j(j10));
            }
            int iK = f3.b.k(j10);
            int i10 = f3.b.i(j10);
            ViewGroup.LayoutParams layoutParams = lVar.getLayoutParams();
            r.b(layoutParams);
            int iL = b.l(lVar, iK, i10, layoutParams.width);
            int iJ = f3.b.j(j10);
            int iH = f3.b.h(j10);
            ViewGroup.LayoutParams layoutParams2 = lVar.getLayoutParams();
            r.b(layoutParams2);
            lVar.measure(iL, b.l(lVar, iJ, iH, layoutParams2.height));
            return o0Var.i0(lVar.getMeasuredWidth(), lVar.getMeasuredHeight(), a0Var, new C0130b(lVar, this.f14116b));
        }

        @Override // g2.l0
        public final int i(g2.q qVar, List<? extends g2.p> list, int i10) {
            i3.l lVar = this.f14115a;
            ViewGroup.LayoutParams layoutParams = lVar.getLayoutParams();
            r.b(layoutParams);
            lVar.measure(b.l(lVar, 0, i10, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
            return lVar.getMeasuredHeight();
        }
    }

    public static final class h extends kotlin.jvm.internal.s implements eh.l<d0, f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final h f14120a = new h(1);

        @Override // eh.l
        public final /* bridge */ /* synthetic */ f0 invoke(d0 d0Var) {
            return f0.f21461a;
        }
    }

    public static final class i extends kotlin.jvm.internal.s implements eh.l<s1.e, f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i3.l f14121a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e0 f14122b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i3.l f14123c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(i3.l lVar, e0 e0Var, i3.l lVar2) {
            super(1);
            this.f14121a = lVar;
            this.f14122b = e0Var;
            this.f14123c = lVar2;
        }

        @Override // eh.l
        public final f0 invoke(s1.e eVar) {
            w0 w0VarA = eVar.Q0().a();
            i3.l lVar = this.f14121a;
            if (lVar.getView().getVisibility() != 8) {
                lVar.A = true;
                v1 v1Var = this.f14122b.f13822p;
                AndroidComposeView androidComposeView = v1Var instanceof AndroidComposeView ? (AndroidComposeView) v1Var : null;
                if (androidComposeView != null) {
                    Canvas canvasA = c0.a(w0VarA);
                    androidComposeView.getAndroidViewsHandler$ui_release().getClass();
                    this.f14123c.draw(canvasA);
                }
                lVar.A = false;
            }
            return f0.f21461a;
        }
    }

    public static final class j extends kotlin.jvm.internal.s implements eh.l<v, f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i3.l f14124a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e0 f14125b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(i3.l lVar, e0 e0Var) {
            super(1);
            this.f14124a = lVar;
            this.f14125b = e0Var;
        }

        @Override // eh.l
        public final f0 invoke(v vVar) {
            WindowInsets windowInsetsB;
            e0 e0Var = this.f14125b;
            i3.l lVar = this.f14124a;
            i3.d.a(lVar, e0Var);
            lVar.f14086c.D();
            int[] iArr = lVar.f14097p;
            int i10 = iArr[0];
            int i11 = iArr[1];
            lVar.getView().getLocationOnScreen(iArr);
            long j10 = lVar.f14098q;
            long jA = vVar.a();
            lVar.f14098q = jA;
            i1 i1Var = lVar.f14099r;
            if (i1Var != null && ((i10 != iArr[0] || i11 != iArr[1] || !f3.p.b(j10, jA)) && (windowInsetsB = lVar.n(i1Var).b()) != null)) {
                lVar.getView().dispatchApplyWindowInsets(windowInsetsB);
            }
            return f0.f21461a;
        }
    }

    @vg.e(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1", f = "AndroidViewHolder.android.kt", l = {639, 641}, m = "invokeSuspend")
    public static final class k extends vg.i implements eh.p<i0, tg.e<? super f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14126a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f14127b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f14128c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f14129d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(boolean z10, b bVar, long j10, tg.e<? super k> eVar) {
            super(2, eVar);
            this.f14127b = z10;
            this.f14128c = bVar;
            this.f14129d = j10;
        }

        @Override // vg.a
        public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
            return new k(this.f14127b, this.f14128c, this.f14129d, eVar);
        }

        @Override // eh.p
        public final Object invoke(i0 i0Var, tg.e<? super f0> eVar) {
            return ((k) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
        
            if (r4.a(0, r10.f14129d, r10) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
        
            if (r1.a(r10.f14129d, 0, r10) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
        
            return r0;
         */
        @Override // vg.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f14126a;
            if (i10 == 0) {
                pg.q.b(obj);
                boolean z10 = this.f14127b;
                b bVar = this.f14128c;
                if (z10) {
                    b2.b bVar2 = bVar.f14084a;
                    this.f14126a = 2;
                } else {
                    b2.b bVar3 = bVar.f14084a;
                    this.f14126a = 1;
                }
            } else {
                if (i10 != 1 && i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
            }
            return f0.f21461a;
        }
    }

    @vg.e(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedPreFling$1", f = "AndroidViewHolder.android.kt", l = {650}, m = "invokeSuspend")
    public static final class l extends vg.i implements eh.p<i0, tg.e<? super f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14130a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f14132c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(long j10, tg.e<? super l> eVar) {
            super(2, eVar);
            this.f14132c = j10;
        }

        @Override // vg.a
        public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
            return b.this.new l(this.f14132c, eVar);
        }

        @Override // eh.p
        public final Object invoke(i0 i0Var, tg.e<? super f0> eVar) {
            return ((l) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f14130a;
            if (i10 == 0) {
                pg.q.b(obj);
                b2.b bVar = b.this.f14084a;
                this.f14130a = 1;
                if (bVar.b(this.f14132c, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
            }
            return f0.f21461a;
        }
    }

    public static final class m extends kotlin.jvm.internal.s implements eh.a<f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final m f14133a = new m(0);

        @Override // eh.a
        public final /* bridge */ /* synthetic */ f0 invoke() {
            return f0.f21461a;
        }
    }

    public static final class n extends kotlin.jvm.internal.s implements eh.a<f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final n f14134a = new n(0);

        @Override // eh.a
        public final /* bridge */ /* synthetic */ f0 invoke() {
            return f0.f21461a;
        }
    }

    public static final class o extends kotlin.jvm.internal.s implements eh.a<f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i3.l f14135a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(i3.l lVar) {
            super(0);
            this.f14135a = lVar;
        }

        @Override // eh.a
        public final f0 invoke() {
            this.f14135a.getLayoutNode().M();
            return f0.f21461a;
        }
    }

    public static final class p extends kotlin.jvm.internal.s implements eh.a<f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i3.l f14136a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(i3.l lVar) {
            super(0);
            this.f14136a = lVar;
        }

        @Override // eh.a
        public final f0 invoke() {
            i3.l lVar = this.f14136a;
            if (lVar.f14088e && lVar.isAttachedToWindow() && lVar.getView().getParent() == lVar) {
                lVar.getSnapshotObserver().a(lVar, b.C, lVar.getUpdate());
            }
            return f0.f21461a;
        }
    }

    public static final class q extends kotlin.jvm.internal.s implements eh.a<f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final q f14137a = new q(0);

        @Override // eh.a
        public final /* bridge */ /* synthetic */ f0 invoke() {
            return f0.f21461a;
        }
    }

    public b(Context context, x0.s sVar, int i10, b2.b bVar, View view, v1 v1Var) {
        super(context);
        this.f14084a = bVar;
        this.f14085b = view;
        this.f14086c = v1Var;
        if (sVar != null) {
            LinkedHashMap linkedHashMap = a6.f14646a;
            setTag(R.id.androidx_compose_ui_view_composition_context, sVar);
        }
        setSaveFromParentEnabled(false);
        addView(view);
        i3.l lVar = (i3.l) this;
        q0.i(this, new a(lVar));
        q0.c.b(this, this);
        this.f14087d = q.f14137a;
        this.f14089f = n.f14134a;
        this.f14090g = m.f14133a;
        d.a aVar = d.a.f1143b;
        this.f14091h = aVar;
        this.f14093k = f3.f.a();
        this.f14097p = new int[2];
        this.f14098q = 0L;
        this.f14100s = new p(lVar);
        this.f14101t = new o(lVar);
        this.f14103w = new int[2];
        this.f14104x = PKIFailureInfo.systemUnavail;
        this.f14105y = PKIFailureInfo.systemUnavail;
        this.f14106z = new y3.t();
        e0 e0Var = new e0(3);
        e0Var.f13815g = true;
        e0Var.f13823q = lVar;
        androidx.compose.ui.d dVarA = q2.q.a(androidx.compose.ui.input.nestedscroll.a.a(aVar, i3.d.f14139a, bVar), true, h.f14120a);
        c2.k0 k0Var = new c2.k0();
        k0Var.f4654b = new c2.m0(lVar);
        c2.q0 q0Var = new c2.q0();
        c2.q0 q0Var2 = k0Var.f4655c;
        if (q0Var2 != null) {
            q0Var2.f4686a = null;
        }
        k0Var.f4655c = q0Var;
        q0Var.f4686a = k0Var;
        setOnRequestDisallowInterceptTouchEvent$ui_release(q0Var);
        androidx.compose.ui.d dVarA2 = androidx.compose.ui.layout.c.a(androidx.compose.ui.draw.a.a(androidx.compose.ui.graphics.a.b(dVarA.h(k0Var), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, false, 131071), new i(lVar, e0Var, lVar)), new j(lVar, e0Var));
        e0Var.c(this.f14091h.h(dVarA2));
        this.f14092j = new c(e0Var, dVarA2);
        e0Var.i0(this.f14093k);
        this.f14094l = new d(e0Var);
        e0Var.Q = new e(lVar, e0Var);
        e0Var.R = new f(lVar);
        e0Var.l(new g(lVar, e0Var));
        this.B = e0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f2 getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            f2.a.b("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return this.f14086c.getSnapshotObserver();
    }

    public static final int l(i3.l lVar, int i10, int i11, int i12) {
        return (i12 >= 0 || i10 == i11) ? View.MeasureSpec.makeMeasureSpec(jh.j.m(i12, i10, i11), 1073741824) : (i12 != -2 || i11 == Integer.MAX_VALUE) ? (i12 != -1 || i11 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i11, 1073741824) : View.MeasureSpec.makeMeasureSpec(i11, PKIFailureInfo.systemUnavail);
    }

    public static r3.f m(r3.f fVar, int i10, int i11, int i12, int i13) {
        int i14 = fVar.f23163a - i10;
        if (i14 < 0) {
            i14 = 0;
        }
        int i15 = fVar.f23164b - i11;
        if (i15 < 0) {
            i15 = 0;
        }
        int i16 = fVar.f23165c - i12;
        if (i16 < 0) {
            i16 = 0;
        }
        int i17 = fVar.f23166d - i13;
        return r3.f.b(i14, i15, i16, i17 >= 0 ? i17 : 0);
    }

    @Override // i2.w1
    public final boolean U() {
        return isAttachedToWindow();
    }

    @Override // x0.h
    public final void a() {
        this.f14090g.invoke();
    }

    @Override // y3.s
    public final void b(int[] iArr, int i10, int i11, int i12, int i13, int i14) {
        if (this.f14085b.isNestedScrollingEnabled()) {
            float f10 = -1;
            long jFloatToRawIntBits = (Float.floatToRawIntBits(i10 * f10) << 32) | (Float.floatToRawIntBits(i11 * f10) & BodyPartID.bodyIdMax);
            long jFloatToRawIntBits2 = (Float.floatToRawIntBits(i12 * f10) << 32) | (Float.floatToRawIntBits(i13 * f10) & BodyPartID.bodyIdMax);
            int i15 = i14 == 0 ? 1 : 2;
            b2.e eVar = this.f14084a.f3507a;
            b2.e eVar2 = null;
            if (eVar != null && eVar.f1157p) {
                eVar2 = (b2.e) p2.a(eVar);
            }
            b2.e eVar3 = eVar2;
            long jN1 = eVar3 != null ? eVar3.n1(jFloatToRawIntBits, jFloatToRawIntBits2, i15) : 0L;
            iArr[0] = n3.a(Float.intBitsToFloat((int) (jN1 >> 32)));
            iArr[1] = n3.a(Float.intBitsToFloat((int) (jN1 & BodyPartID.bodyIdMax)));
        }
    }

    @Override // y3.u
    public final i1 c(View view, i1 i1Var) {
        this.f14099r = new i1(i1Var);
        return n(i1Var);
    }

    @Override // x0.h
    public final void d() {
        this.f14089f.invoke();
        removeAllViewsInLayout();
    }

    @Override // y3.r
    public final void e(View view, int i10, int i11, int i12, int i13, int i14) {
        if (this.f14085b.isNestedScrollingEnabled()) {
            float f10 = -1;
            long jFloatToRawIntBits = (Float.floatToRawIntBits(i10 * f10) << 32) | (Float.floatToRawIntBits(i11 * f10) & BodyPartID.bodyIdMax);
            long jFloatToRawIntBits2 = (Float.floatToRawIntBits(i12 * f10) << 32) | (Float.floatToRawIntBits(i13 * f10) & BodyPartID.bodyIdMax);
            int i15 = i14 == 0 ? 1 : 2;
            b2.e eVar = this.f14084a.f3507a;
            b2.e eVar2 = null;
            if (eVar != null && eVar.f1157p) {
                eVar2 = (b2.e) p2.a(eVar);
            }
            if (eVar2 != null) {
                eVar2.n1(jFloatToRawIntBits, jFloatToRawIntBits2, i15);
            }
        }
    }

    @Override // y3.r
    public final boolean f(View view, View view2, int i10, int i11) {
        return ((i10 & 2) == 0 && (i10 & 1) == 0) ? false : true;
    }

    @Override // y3.r
    public final void g(View view, View view2, int i10, int i11) {
        y3.t tVar = this.f14106z;
        if (i11 == 1) {
            tVar.f33894b = i10;
        } else {
            tVar.f33893a = i10;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.f14103w;
        getLocationInWindow(iArr);
        int i10 = iArr[0];
        region.op(i10, iArr[1], getWidth() + i10, getHeight() + iArr[1], Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final f3.d getDensity() {
        return this.f14093k;
    }

    public final View getInteropView() {
        return this.f14085b;
    }

    public final e0 getLayoutNode() {
        return this.B;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.f14085b.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final t getLifecycleOwner() {
        return this.f14095m;
    }

    public final androidx.compose.ui.d getModifier() {
        return this.f14091h;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        y3.t tVar = this.f14106z;
        return tVar.f33894b | tVar.f33893a;
    }

    public final eh.l<f3.d, f0> getOnDensityChanged$ui_release() {
        return this.f14094l;
    }

    public final eh.l<androidx.compose.ui.d, f0> getOnModifierChanged$ui_release() {
        return this.f14092j;
    }

    public final eh.l<Boolean, f0> getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.f14102v;
    }

    public final eh.a<f0> getRelease() {
        return this.f14090g;
    }

    public final eh.a<f0> getReset() {
        return this.f14089f;
    }

    public final c6.e getSavedStateRegistryOwner() {
        return this.f14096n;
    }

    public final eh.a<f0> getUpdate() {
        return this.f14087d;
    }

    public final View getView() {
        return this.f14085b;
    }

    @Override // y3.r
    public final void h(View view, int i10) {
        y3.t tVar = this.f14106z;
        if (i10 == 1) {
            tVar.f33894b = 0;
        } else {
            tVar.f33893a = 0;
        }
    }

    @Override // y3.r
    public final void i(int i10, int i11, int[] iArr, int i12) {
        if (this.f14085b.isNestedScrollingEnabled()) {
            float f10 = -1;
            long jFloatToRawIntBits = (Float.floatToRawIntBits(i11 * f10) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(i10 * f10) << 32);
            int i13 = i12 == 0 ? 1 : 2;
            b2.e eVar = this.f14084a.f3507a;
            b2.e eVar2 = null;
            if (eVar != null && eVar.f1157p) {
                eVar2 = (b2.e) p2.a(eVar);
            }
            long jV0 = eVar2 != null ? eVar2.v0(i13, jFloatToRawIntBits) : 0L;
            iArr[0] = n3.a(Float.intBitsToFloat((int) (jV0 >> 32)));
            iArr[1] = n3.a(Float.intBitsToFloat((int) (jV0 & BodyPartID.bodyIdMax)));
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        if (!this.A) {
            this.B.M();
            return null;
        }
        this.f14085b.postOnAnimation(new i3.a(this.f14101t));
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f14085b.isNestedScrollingEnabled();
    }

    @Override // x0.h
    public final void j() {
        View view = this.f14085b;
        if (view.getParent() != this) {
            addView(view);
        } else {
            this.f14089f.invoke();
        }
    }

    public final i1 n(i1 i1Var) {
        i1.q qVar = i1Var.f33825a;
        r3.f fVarI = qVar.i(-1);
        r3.f fVar = r3.f.f23162e;
        if (!fVarI.equals(fVar) || !qVar.j(-9).equals(fVar) || qVar.h() != null) {
            w wVar = this.B.I.f13790b;
            if (wVar.V.f1157p) {
                long jD = m0.d(wVar.Y(0L));
                int i10 = (int) (jD >> 32);
                if (i10 < 0) {
                    i10 = 0;
                }
                int i11 = (int) (jD & BodyPartID.bodyIdMax);
                if (i11 < 0) {
                    i11 = 0;
                }
                long jA = g2.w.c(wVar).a();
                int i12 = (int) (jA >> 32);
                int i13 = (int) (jA & BodyPartID.bodyIdMax);
                long j10 = wVar.f11384c;
                long jD2 = m0.d(wVar.Y((Float.floatToRawIntBits((int) (j10 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j10 & BodyPartID.bodyIdMax)) & BodyPartID.bodyIdMax)));
                int i14 = i12 - ((int) (jD2 >> 32));
                if (i14 < 0) {
                    i14 = 0;
                }
                int i15 = i13 - ((int) (BodyPartID.bodyIdMax & jD2));
                int i16 = i15 >= 0 ? i15 : 0;
                if (i10 != 0 || i11 != 0 || i14 != 0 || i16 != 0) {
                    return i1Var.f33825a.r(i10, i11, i14, i16);
                }
            }
        }
        return i1Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f14100s.invoke();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        if (!this.A) {
            this.B.M();
        } else {
            this.f14085b.postOnAnimation(new i3.a(this.f14101t));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().f13853a.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f14085b.layout(0, 0, i12 - i10, i13 - i11);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        View view = this.f14085b;
        if (view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
            return;
        }
        if (view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        view.measure(i10, i11);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        this.f14104x = i10;
        this.f14105y = i11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (!this.f14085b.isNestedScrollingEnabled()) {
            return false;
        }
        ph.h.c(this.f14084a.c(), null, null, new k(z10, this, c1.a(f10 * (-1.0f), f11 * (-1.0f)), null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        if (!this.f14085b.isNestedScrollingEnabled()) {
            return false;
        }
        ph.h.c(this.f14084a.c(), null, null, new l(c1.a(f10 * (-1.0f), f11 * (-1.0f)), null), 3);
        return false;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        eh.l<? super Boolean, f0> lVar = this.f14102v;
        if (lVar != null) {
            lVar.invoke(Boolean.valueOf(z10));
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public final void setDensity(f3.d dVar) {
        if (dVar != this.f14093k) {
            this.f14093k = dVar;
            eh.l<? super f3.d, f0> lVar = this.f14094l;
            if (lVar != null) {
                lVar.invoke(dVar);
            }
        }
    }

    public final void setLifecycleOwner(t tVar) {
        if (tVar != this.f14095m) {
            this.f14095m = tVar;
            c1.d(this, tVar);
        }
    }

    public final void setModifier(androidx.compose.ui.d dVar) {
        if (dVar != this.f14091h) {
            this.f14091h = dVar;
            eh.l<? super androidx.compose.ui.d, f0> lVar = this.f14092j;
            if (lVar != null) {
                lVar.invoke(dVar);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(eh.l<? super f3.d, f0> lVar) {
        this.f14094l = lVar;
    }

    public final void setOnModifierChanged$ui_release(eh.l<? super androidx.compose.ui.d, f0> lVar) {
        this.f14092j = lVar;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(eh.l<? super Boolean, f0> lVar) {
        this.f14102v = lVar;
    }

    public final void setRelease(eh.a<f0> aVar) {
        this.f14090g = aVar;
    }

    public final void setReset(eh.a<f0> aVar) {
        this.f14089f = aVar;
    }

    public final void setSavedStateRegistryOwner(c6.e eVar) {
        if (eVar != this.f14096n) {
            this.f14096n = eVar;
            setTag(R.id.view_tree_saved_state_registry_owner, eVar);
        }
    }

    public final void setUpdate(eh.a<f0> aVar) {
        this.f14087d = aVar;
        this.f14088e = true;
        this.f14100s.invoke();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }
}
