package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.a;
import androidx.compose.foundation.gestures.f;
import com.yalantis.ucrop.view.CropImageView;
import eh.l;
import eh.p;
import kotlin.jvm.internal.s;
import pg.f0;
import pg.q;
import v.s0;
import v.s1;
import v.t0;

@vg.e(c = "androidx.compose.foundation.gestures.ScrollableNode$drag$2$1", f = "Scrollable.kt", l = {330}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class k extends vg.i implements p<s0, tg.e<? super f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f916a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f917b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f.a f918c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s1 f919d;

    public static final class a extends s implements l<a.b, f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ s0 f920a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ s1 f921b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(s0 s0Var, s1 s1Var) {
            super(1);
            this.f920a = s0Var;
            this.f921b = s1Var;
        }

        @Override // eh.l
        public final f0 invoke(a.b bVar) {
            long j10 = bVar.f836a;
            this.f920a.b(1, this.f921b.f30070d == t0.f30084b ? p1.c.a(j10, CropImageView.DEFAULT_ASPECT_RATIO, 1) : p1.c.a(j10, CropImageView.DEFAULT_ASPECT_RATIO, 2));
            return f0.f21461a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(f.a aVar, s1 s1Var, tg.e eVar) {
        super(2, eVar);
        this.f918c = aVar;
        this.f919d = s1Var;
    }

    @Override // vg.a
    public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
        k kVar = new k(this.f918c, this.f919d, eVar);
        kVar.f917b = obj;
        return kVar;
    }

    @Override // eh.p
    public final Object invoke(s0 s0Var, tg.e<? super f0> eVar) {
        return ((k) create(s0Var, eVar)).invokeSuspend(f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f916a;
        if (i10 == 0) {
            q.b(obj);
            a aVar2 = new a((s0) this.f917b, this.f919d);
            this.f916a = 1;
            if (this.f918c.invoke(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.b(obj);
        }
        return f0.f21461a;
    }
}
