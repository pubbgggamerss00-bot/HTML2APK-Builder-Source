package t0;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final class d6 extends j2.a {

    /* renamed from: j, reason: collision with root package name */
    public final boolean f25650j;

    /* renamed from: k, reason: collision with root package name */
    public final eh.a<pg.f0> f25651k;

    /* renamed from: l, reason: collision with root package name */
    public final s.b<Float, s.o> f25652l;

    /* renamed from: m, reason: collision with root package name */
    public final ph.i0 f25653m;

    /* renamed from: n, reason: collision with root package name */
    public final x0.x1 f25654n;

    /* renamed from: p, reason: collision with root package name */
    public Object f25655p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f25656q;

    public static final class a {
        public static final OnBackInvokedCallback a(final eh.a<pg.f0> aVar) {
            return new OnBackInvokedCallback() { // from class: t0.c6
                public final void onBackInvoked() {
                    aVar.invoke();
                }
            };
        }

        public static final void b(View view, Object obj) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
            if (!(obj instanceof OnBackInvokedCallback) || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
                return;
            }
            onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, (OnBackInvokedCallback) obj);
        }

        public static final void c(View view, Object obj) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
            if (!(obj instanceof OnBackInvokedCallback) || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
                return;
            }
            onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj);
        }
    }

    public static final class b {

        public static final class a implements OnBackAnimationCallback {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ph.i0 f25657a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s.b<Float, s.o> f25658b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ eh.a<pg.f0> f25659c;

            @vg.e(c = "androidx.compose.material3.ModalBottomSheetDialogLayout$Api34Impl$createBackCallback$1$onBackCancelled$1", f = "ModalBottomSheet.android.kt", l = {419}, m = "invokeSuspend")
            /* renamed from: t0.d6$b$a$a, reason: collision with other inner class name */
            public static final class C0284a extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

                /* renamed from: a, reason: collision with root package name */
                public int f25660a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ s.b<Float, s.o> f25661b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0284a(s.b<Float, s.o> bVar, tg.e<? super C0284a> eVar) {
                    super(2, eVar);
                    this.f25661b = bVar;
                }

                @Override // vg.a
                public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
                    return new C0284a(this.f25661b, eVar);
                }

                @Override // eh.p
                public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
                    return ((C0284a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
                }

                @Override // vg.a
                public final Object invokeSuspend(Object obj) {
                    ug.a aVar = ug.a.f29706a;
                    int i10 = this.f25660a;
                    if (i10 == 0) {
                        pg.q.b(obj);
                        Float f10 = new Float(CropImageView.DEFAULT_ASPECT_RATIO);
                        this.f25660a = 1;
                        if (s.b.c(this.f25661b, f10, null, null, this, 14) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        pg.q.b(obj);
                    }
                    return pg.f0.f21461a;
                }
            }

            @vg.e(c = "androidx.compose.material3.ModalBottomSheetDialogLayout$Api34Impl$createBackCallback$1$onBackProgressed$1", f = "ModalBottomSheet.android.kt", l = {410}, m = "invokeSuspend")
            /* renamed from: t0.d6$b$a$b, reason: collision with other inner class name */
            public static final class C0285b extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

                /* renamed from: a, reason: collision with root package name */
                public int f25662a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ s.b<Float, s.o> f25663b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ BackEvent f25664c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0285b(s.b<Float, s.o> bVar, BackEvent backEvent, tg.e<? super C0285b> eVar) {
                    super(2, eVar);
                    this.f25663b = bVar;
                    this.f25664c = backEvent;
                }

                @Override // vg.a
                public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
                    return new C0285b(this.f25663b, this.f25664c, eVar);
                }

                @Override // eh.p
                public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
                    return ((C0285b) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
                }

                @Override // vg.a
                public final Object invokeSuspend(Object obj) {
                    ug.a aVar = ug.a.f29706a;
                    int i10 = this.f25662a;
                    if (i10 == 0) {
                        pg.q.b(obj);
                        Float f10 = new Float(u0.u0.f29158a.a(this.f25664c.getProgress()));
                        this.f25662a = 1;
                        if (this.f25663b.f(f10, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        pg.q.b(obj);
                    }
                    return pg.f0.f21461a;
                }
            }

            @vg.e(c = "androidx.compose.material3.ModalBottomSheetDialogLayout$Api34Impl$createBackCallback$1$onBackStarted$1", f = "ModalBottomSheet.android.kt", l = {404}, m = "invokeSuspend")
            public static final class c extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

                /* renamed from: a, reason: collision with root package name */
                public int f25665a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ s.b<Float, s.o> f25666b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ BackEvent f25667c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(s.b<Float, s.o> bVar, BackEvent backEvent, tg.e<? super c> eVar) {
                    super(2, eVar);
                    this.f25666b = bVar;
                    this.f25667c = backEvent;
                }

                @Override // vg.a
                public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
                    return new c(this.f25666b, this.f25667c, eVar);
                }

                @Override // eh.p
                public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
                    return ((c) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
                }

                @Override // vg.a
                public final Object invokeSuspend(Object obj) {
                    ug.a aVar = ug.a.f29706a;
                    int i10 = this.f25665a;
                    if (i10 == 0) {
                        pg.q.b(obj);
                        Float f10 = new Float(u0.u0.f29158a.a(this.f25667c.getProgress()));
                        this.f25665a = 1;
                        if (this.f25666b.f(f10, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        pg.q.b(obj);
                    }
                    return pg.f0.f21461a;
                }
            }

            public a(eh.a aVar, s.b bVar, ph.i0 i0Var) {
                this.f25657a = i0Var;
                this.f25658b = bVar;
                this.f25659c = aVar;
            }

            public final void onBackCancelled() {
                ph.h.c(this.f25657a, null, null, new C0284a(this.f25658b, null), 3);
            }

            public final void onBackInvoked() {
                this.f25659c.invoke();
            }

            public final void onBackProgressed(BackEvent backEvent) {
                ph.h.c(this.f25657a, null, null, new C0285b(this.f25658b, backEvent, null), 3);
            }

            public final void onBackStarted(BackEvent backEvent) {
                ph.h.c(this.f25657a, null, null, new c(this.f25658b, backEvent, null), 3);
            }
        }

        public static final OnBackAnimationCallback a(eh.a<pg.f0> aVar, s.b<Float, s.o> bVar, ph.i0 i0Var) {
            return new a(aVar, bVar, i0Var);
        }
    }

    public static final class c extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {
        public c(int i10) {
            super(2);
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            num.intValue();
            int iN = f3.i.n(1);
            d6.this.a(iN, jVar);
            return pg.f0.f21461a;
        }
    }

    public d6(Context context, boolean z10, eh.a aVar, s.b bVar, ph.i0 i0Var) {
        super(context);
        this.f25650j = z10;
        this.f25651k = aVar;
        this.f25652l = bVar;
        this.f25653m = i0Var;
        this.f25654n = bg.b.h(k2.f26214a);
    }

    @Override // j2.a
    public final void a(int i10, x0.j jVar) {
        x0.k kVarP = jVar.p(576708319);
        if ((((kVarP.l(this) ? 4 : 2) | i10) & 3) == 2 && kVarP.s()) {
            kVarP.v();
        } else {
            ((eh.p) this.f25654n.getValue()).invoke(kVarP, 0);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new c(i10);
        }
    }

    @Override // j2.a
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f25656q;
    }

    @Override // j2.a, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int i10;
        super.onAttachedToWindow();
        if (!this.f25650j || (i10 = Build.VERSION.SDK_INT) < 33) {
            return;
        }
        if (this.f25655p == null) {
            eh.a<pg.f0> aVar = this.f25651k;
            this.f25655p = i10 >= 34 ? com.google.android.recaptcha.internal.d.b(b.a(aVar, this.f25652l, this.f25653m)) : a.a(aVar);
        }
        a.b(this, this.f25655p);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (Build.VERSION.SDK_INT >= 33) {
            a.c(this, this.f25655p);
        }
        this.f25655p = null;
    }
}
