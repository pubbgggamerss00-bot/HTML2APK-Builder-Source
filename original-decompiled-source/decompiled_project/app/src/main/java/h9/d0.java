package h9;

import android.content.Context;
import android.widget.Toast;
import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.data.local.entity.KeystoreEntity;
import f9.lg;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.settings.KeystoreViewModel$persistKeystore$2", f = "KeystoreViewModel.kt", l = {139, 140}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class d0 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f12579a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f12580b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ KeystoreEntity f12581c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lg f12582d;

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.settings.KeystoreViewModel$persistKeystore$2$1", f = "KeystoreViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ lg f12583a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f12584b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(lg lgVar, Object obj, tg.e eVar) {
            super(2, eVar);
            this.f12583a = lgVar;
            this.f12584b = obj;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new a(this.f12583a, this.f12584b, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            String message;
            ug.a aVar = ug.a.f29706a;
            pg.q.b(obj);
            Context context = (Context) this.f12583a.f10007b;
            Object obj2 = this.f12584b;
            Throwable thA = pg.p.a(obj2);
            if (thA == null) {
                message = context.getString(R.string.keystore_persisted);
                kotlin.jvm.internal.r.d(message, "getString(...)");
            } else {
                message = thA.getMessage();
                if (message == null) {
                    message = context.getString(R.string.keystore_operation_failed);
                    kotlin.jvm.internal.r.d(message, "getString(...)");
                }
            }
            Toast.makeText(context, message, 0).show();
            pg.f0 f0Var = pg.f0.f21461a;
            return pg.f0.f21461a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(x xVar, KeystoreEntity keystoreEntity, lg lgVar, tg.e eVar) {
        super(2, eVar);
        this.f12580b = xVar;
        this.f12581c = keystoreEntity;
        this.f12582d = lgVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new d0(this.f12580b, this.f12581c, this.f12582d, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((d0) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        if (ph.h.e(r1, r3, r6) == r0) goto L15;
     */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objG;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f12579a;
        if (i10 == 0) {
            pg.q.b(obj);
            n8.l lVar = this.f12580b.f12857b;
            this.f12579a = 1;
            objG = lVar.g(this.f12581c, this);
            if (objG != aVar) {
            }
            return aVar;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
            return pg.f0.f21461a;
        }
        pg.q.b(obj);
        objG = ((pg.p) obj).f21471a;
        wh.c cVar = ph.z0.f21632a;
        qh.g gVar = uh.o.f29764a;
        a aVar2 = new a(this.f12582d, objG, null);
        this.f12579a = 2;
    }
}
